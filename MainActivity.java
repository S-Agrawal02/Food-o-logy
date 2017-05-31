import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.acer.foodology.R.*;

public class MainActivity extends AppCompatActivity {

    Button home;
    Button veg;
    Button nonveg;
    Button fruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //home = (Button)findViewById(R.id.home);
        //veg = (Button)findViewById(R.id.veg);
        //nonveg = (Button)findViewById(R.id.nonveg);
        //fruits = (Button)findViewById(R.id.fruits);
    }

    public void vegclick(View view){
        Intent i = new Intent(this,veg.class);
        startActivity(i);
    }

    public void nonvegclick(View view){
        Intent i = new Intent(this,nonveg.class);
        startActivity(i);
    }

    public void planclick(View view){
        /*FragmentOne fr = new FragmentOne();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().commit(); */
        Intent i = new Intent(this,to_do.class);
        startActivity(i);
    }

    public void fruitsclick(View view){
        Intent i = new Intent(this,fruits.class);
        startActivity(i);
    }
}
