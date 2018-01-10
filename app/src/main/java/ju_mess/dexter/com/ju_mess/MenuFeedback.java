package ju_mess.dexter.com.ju_mess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;
import java.util.Objects;

public class MenuFeedback extends AppCompatActivity {

    private ListView listView;
    private String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_feedback);

        listView = (ListView) findViewById(R.id.listviewfeedback);
        String MealTime = getIntent().getExtras().getString("Meal Time");

        mealTime(MealTime);

    }

    public void mealTime(String MealTime)
    {
        if (Objects.equals(MealTime, "Breakfast"))
        {
            // TODO Breakfast code here
            list = new String[]{
                    "Tea",
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
            ArrayAdapter<String> adapterList = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1,list);
            listView.setAdapter(adapterList);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent Q = new Intent(MenuFeedback.this,SubmitFeedback.class);
                    Q.putExtra("argg",position);
                    startActivity(Q);
                }
            });




        }
        if (Objects.equals(MealTime, "Lunch"))
        {
            // TODO Lunch code here
            list = new String[]{
                    "Aalu Sabzi",
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
            ArrayAdapter<String> adapterList = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1,list);
            listView.setAdapter(adapterList);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent Q = new Intent(MenuFeedback.this,SubmitFeedback.class);
                    Q.putExtra("argg",position);
                    startActivity(Q);
                }
            });


        }
        if (Objects.equals(MealTime, "Snacks"))
        {
            // TODO Snacks code here
            list = new String[]{
                    "coffee",
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
            ArrayAdapter<String> adapterList = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1,list);
            listView.setAdapter(adapterList);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent Q = new Intent(MenuFeedback.this,SubmitFeedback.class);
                    Q.putExtra("argg",position);
                    startActivity(Q);
                }
            });


        }
        if (Objects.equals(MealTime, "Dinner"))
        {
            // TODO Dinner code here
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
            ArrayAdapter<String> adapterList = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1,list);
            listView.setAdapter(adapterList);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent Q = new Intent(MenuFeedback.this,SubmitFeedback.class);
                    Q.putExtra("argg",position);
                    startActivity(Q);
                }
            });



        }



    }


}
