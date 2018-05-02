package ju_mess.dexter.com.ju_mess;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    ListView listView;
    DatabaseReference databaseReference;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> adapter;
     private FirebaseAuth firebaseAuth;

    // Here we declared a ProgressDialog variable
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String MealTime = getIntent().getExtras().getString("Meal Time");

        setTitle(MealTime);

        //Here we initialised the progress Dialog
        progressDialog=new ProgressDialog(this);
        // Here we set the logging message in the progress dialog
        progressDialog.setMessage("Loading Data");
        // Here we show the progress Dialog message
        progressDialog.show();

        listView = (ListView) findViewById(R.id.listview);
        firebaseAuth = FirebaseAuth.getInstance();

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);
        listView.setAdapter(adapter);

        // Access Firebase Database
        databaseReference = FirebaseDatabase.getInstance().getReference(MealTime);

        listDataView();


    }

    public void listDataView()
    {
        // TODO listDataView Started


        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                String value = String.valueOf(dataSnapshot.getValue());
                list.add(value);
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {



            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                list.remove(value);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        // Function ends -----------
    }


}
