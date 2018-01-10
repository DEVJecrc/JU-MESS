package ju_mess.dexter.com.ju_mess;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

        Button buttonBreakfast,buttonLunch,buttonSnacks,buttonDinner;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        // TODO This is our OnCreate

        buttonBreakfast = (Button)view.findViewById(R.id.Buttonbreakfast);
        buttonLunch = (Button)view.findViewById(R.id.ButtonLunch);
        buttonSnacks = (Button)view.findViewById(R.id.ButtonSnacks);
        buttonDinner = (Button)view.findViewById(R.id.ButtonDinner);

        buttonBreakfast.setOnClickListener(this);
        buttonLunch.setOnClickListener(this);
        buttonSnacks.setOnClickListener(this);
        buttonDinner.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {
        if (v == buttonBreakfast)
        {
            Intent intent1 = new Intent(HomeFragment.this,MainActivity.class);
            intent1.putExtra("Meal Time","Breakfast");
            startActivity(intent1);

        }
        if (v == buttonLunch)
        {
            Intent intent2 = new Intent(HomeFragment.this,MainActivity.class);
            intent2.putExtra("Meal Time","Lunch");
            startActivity(intent2);
        }
        if (v == buttonSnacks)
        {
            Intent intent3 = new Intent(HomeFragment.this,MainActivity.class);
            intent3.putExtra("Meal Time","Snacks");
            startActivity(intent3);
        }
        if (v == buttonDinner)
        {
            Intent intent4 = new Intent(HomeFragment.this,MainActivity.class);
            intent4.putExtra("Meal Time","Dinner");
            startActivity(intent4);
        }

    }



}
