package ju_mess.dexter.com.ju_mess;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {

    Button SignOut;
    FirebaseAuth firebaseAuth;

    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
   View view = inflater.inflate(R.layout.fragment_user, container, false);

        // TODO This is our OnCreate
        firebaseAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = firebaseAuth.getCurrentUser();

        SignOut = (Button)view.findViewById(R.id.SignOut);

        SignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firebaseAuth.signOut();
                Toast.makeText(getContext(),"LogOut Successfull",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(),LogInActivity.class);
                startActivity(intent);
            }
        });

    return view;
    }

}
