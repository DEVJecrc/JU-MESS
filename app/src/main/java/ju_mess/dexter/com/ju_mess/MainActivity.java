package ju_mess.dexter.com.ju_mess;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_updates:

                    //To set the title of the activity
                    setTitle("Updates");
                    // Creates a UpdateFragment class Object
                    UpdatesFragment updatesFragment = new UpdatesFragment();
                    // Creating FragmentTransactionUpdates object using fragment manager and started transaction by the beigiin Transaction
                    android.support.v4.app.FragmentTransaction fragmentTransactionUpdates = getSupportFragmentManager().beginTransaction();
                    // The desired Fragment is put into the particular frame layout
                    fragmentTransactionUpdates.replace(R.id.content,updatesFragment
                                ,"Updates Fragment");
                    fragmentTransactionUpdates.commit();
                    return true;

                    case R.id.navigation_home:

                    setTitle("Home");
                    HomeFragment homeFragment = new HomeFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransactionHome = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionHome.replace(R.id.content,homeFragment,"Home Fragment");
                    fragmentTransactionHome.commit();

                    return true;

                    case R.id.navigation_feedback:

                    setTitle("FeedBack");
                    FeedbackFragment feedbackFragment = new FeedbackFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransactionFeedback = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionFeedback.replace(R.id.content,feedbackFragment,"Feedback Fragment");
                    fragmentTransactionFeedback.commit();


                    return true;
                case R.id.navigation_user:

                    setTitle("User");
                    UserFragment userFragment = new UserFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransactionUser = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionUser.replace(R.id.content,userFragment,"User Fragment");
                    fragmentTransactionUser.commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        setTitle("Home");
        HomeFragment homeFragment = new HomeFragment();
        android.support.v4.app.FragmentTransaction fragmentTransactionHome = getSupportFragmentManager().beginTransaction();
        fragmentTransactionHome.replace(R.id.content,homeFragment,"Home Fragment");
        fragmentTransactionHome.commit();

    }

}
