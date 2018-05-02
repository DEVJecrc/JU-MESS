package ju_mess.dexter.com.ju_mess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SubmitFeedback extends AppCompatActivity {

    DatabaseReference databaseReference;
    String[] list;
    EditText et1;
    Button rateButton;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_feedback);




    }

    public void rateButtonClicked(View view) {



        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("FeedBack");
        et1 = (EditText)findViewById(R.id.rateEditText);
        rateButton = (Button)findViewById(R.id.rateButton);

        if (et1.getText().toString().isEmpty()==true)
        {
            Toast.makeText(SubmitFeedback.this,"Please Enter some Rating",Toast.LENGTH_SHORT).show();
            return;
        }

        String usr_rate = et1.getText().toString();

        list = new String[]{
                "Naan",
                "Milk",
                "Poha",
                "Upma",
                "Bread",
                "Roasted Bread",
                "Uttpam",
                "Sambhar",
                "Pori Aloo Sabji",
                "Aloo Paratha",
                "Methi Paratha",
                "Pyaaz Paratha",
                "Normal Paratha"
        };

        int i = Integer.parseInt(usr_rate);

        // Todo here is the intent value get method

        if (i>0 && i<11)
        {
            Intent Q = getIntent();
            int value = Q.getIntExtra("argg", 0);
            String v = list[value];
        //    int i = Integer.parseInt(usr_rate);

            databaseReference.child(v).setValue(i);
            Toast.makeText(SubmitFeedback.this,"Submitted\nThanks for your response :)",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(SubmitFeedback.this,"Please Enter value in Between 1 and 10.",Toast.LENGTH_SHORT).show();
        }

        }
}
