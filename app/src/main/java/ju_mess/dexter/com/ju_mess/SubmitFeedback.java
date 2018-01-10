package ju_mess.dexter.com.ju_mess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubmitFeedback extends AppCompatActivity {

    String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_feedback);

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



        Intent Q = getIntent();
        int value = Q.getIntExtra("argg",0);
        String v = list[value];
        TextView TV1;
        TV1 = (TextView)findViewById(R.id.textViewDishTitle);
        TV1.setText(v);

    }



}
