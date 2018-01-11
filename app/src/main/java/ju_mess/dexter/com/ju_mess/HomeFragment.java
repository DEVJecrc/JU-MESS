package ju_mess.dexter.com.ju_mess;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

        ImageView buttonBreakfast,buttonLunch,buttonSnacks,buttonDinner;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        // TODO This is our OnCreate

        buttonBreakfast = (ImageView)view.findViewById(R.id.Buttonbreakfast);
        buttonLunch = (ImageView)view.findViewById(R.id.ButtonLunch);
        buttonSnacks = (ImageView)view.findViewById(R.id.ButtonSnacks);
        buttonDinner = (ImageView)view.findViewById(R.id.ButtonDinner);

        buttonBreakfast.setOnClickListener(this);
        buttonLunch.setOnClickListener(this);
        buttonSnacks.setOnClickListener(this);
        buttonDinner.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {
        Intent intent1 = new Intent(getContext(),Menu.class);
        if (v == buttonBreakfast)
        {
            intent1.putExtra("Meal Time","Breakfast");
            startActivity(intent1);

        }
        if (v == buttonLunch)
        {
            intent1.putExtra("Meal Time","Lunch");
            startActivity(intent1);
        }
        if (v == buttonSnacks)
        {
            intent1.putExtra(   "Meal Time","Snacks");
            startActivity(intent1);
        }
        if (v == buttonDinner)
        {
            intent1.putExtra("Meal Time","Dinner");
            startActivity(intent1);
        }

    }



}
