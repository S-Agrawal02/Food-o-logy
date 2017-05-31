package com.example.acer.foodology;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class nonveg extends AppCompatActivity {
    TextView nonvegselected;
    Spinner itemlist;
    String item;
    TextView description;
    TextView nut_values;
    TextView benefits;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonveg);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("NON VEG FOOD");
        //sel_item = (Button) findViewById(R.id.sel_item);
        nonvegselected = (TextView) findViewById(R.id.nonvegselected);
        itemlist = (Spinner) findViewById(R.id.fruitlist);
        //item = String.valueOf(itemlist.getSelectedItem());
        description = (TextView) findViewById(R.id.description);
        nut_values = (TextView) findViewById(R.id.nut_values);
        benefits = (TextView) findViewById(R.id.benefits);
        iv= (ImageView)findViewById(R.id.imageView);

        // FOR  EGG  STORING
        SharedPreferences egg = getSharedPreferences("egg", Context.MODE_PRIVATE);
        SharedPreferences.Editor egg_ed = egg.edit();
        egg_ed.putString("description", "Eggs are laid by female animals of many different species, including birds, reptiles, amphibians, mammals, and fish, " +
                "and have been eaten by humans for years.");
        egg_ed.putString("nut_values", "– very good source of inexpensive, high quality protein\n" +
                "– A rich source of selenium, vitamin D, B6, B12)\n" +
                "– Minerals such as zinc, iron and copper\n" +
                "– One large egg contains :\n" +
                "– 78 calories, 6.3g protein, 5.3g fat, 1.6g saturated fat, 212mg cholesterol");
        egg_ed.putString("benefits","# The vitamin D strengthen bones.\n"+
                "# Keeps Our Heart Healthy\n"+
                "# Helps in Weight Loss");
        egg_ed.apply();

        //FOR  CHICKEN  STORING
        SharedPreferences chicken = getSharedPreferences("chicken", Context.MODE_PRIVATE);
        SharedPreferences.Editor chicken_ed = chicken.edit();
        chicken_ed.putString("description", "The chicken is a type of domesticated fowl, a subspecies of the red junglefowl. It is one of the most common and widespread domestic animals,");
        chicken_ed.putString("nut_values", "-- High in protein. Each ounce of meat provides 7g of it\n"
                +"-- Rich source of two B vitamins : vitamin B3 and vitamin B6\n"
                +"-- Aids in the formation of red blood cells.");
        chicken_ed.putString("benefits","# Helps control Blood Pressure\n"+
                "# Helps improve Immune system function\n"+
                "# Aids in regulating the Thyroid hormone");
        chicken_ed.apply();

        //FOR  MUTTON  STORING
        SharedPreferences mutton = getSharedPreferences("mutton", Context.MODE_PRIVATE);
        SharedPreferences.Editor mutton_ed = mutton.edit();
        mutton_ed.putString("description", "The meat of an adult sheep is mutton, a term only used for the meat, not the living animals. The term mutton is almost always used to refer to goat meat in the Indian subcontinent. ");
        mutton_ed.putString("nut_values", "-- Rich in a variety of minerals and vitamins\n"+"" +
                "-- Good source of manganese, magnesium, iron and vitamin B2. ");
        mutton_ed.putString("benefits","A 3-ounce serving provides :\n"+
                "   # 28 grams of protein, or 56 percent of the daily value\n"+
                "   # 3.8 micrograms of vitamin B-12");
        mutton_ed.apply();

        //FOR  FISH  STORING
        SharedPreferences fish = getSharedPreferences("fish", Context.MODE_PRIVATE);
        SharedPreferences.Editor fish_ed = fish.edit();
        fish_ed.putString("description", "Fish are consumed as food by many species, including humans. It has been an important source of protein and other nutrients for humans.");
        fish_ed.putString("nut_values", "Per 3 oz serving :\n" + "  -- 16.4 g protein ,50 mg sodium\n" + "  -- 118 calories, 5.4 g fat (1.6 g saturated)");
        fish_ed.putString("benefits","# Contains Nutrients that Are Crucial During Development\n"+
                "# Help Prevent and Treat Depression, Making You a Happier Person\n"+
                "# The Only Good Dietary Source of Vitamin D");
        fish_ed.apply();


        //public void onselect1(View view) {
        itemlist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                item = String.valueOf(itemlist.getSelectedItem());
                nonvegselected.setText(item);
                // FOR  EGG  RETRIEVING
                if (item.equalsIgnoreCase("egg")) {
                    SharedPreferences egg = getSharedPreferences("egg", Context.MODE_PRIVATE);
                    String desc = egg.getString("description", "");
                    String values = egg.getString("nut_values", "");
                    String ben = egg.getString("benefits", "");
                    description.setText(desc);
                    nut_values.setText(values);
                    benefits.setText(ben);
                    iv.setImageResource(R.drawable.egg);
                }

                // FOR  CHICKEN  RETRIEVING
                else if (item.equalsIgnoreCase("chicken")) {
                    SharedPreferences chicken = getSharedPreferences("chicken", Context.MODE_PRIVATE);
                    String desc = chicken.getString("description", "");
                    String values = chicken.getString("nut_values", "");
                    String ben = chicken.getString("benefits", "");
                    description.setText(desc);
                    nut_values.setText(values);
                    benefits.setText(ben);
                    iv.setImageResource(R.drawable.chicken);
                }

                // FOR  FISH  RETRIEVING
                else if (item.equalsIgnoreCase("fish")) {
                    SharedPreferences fish = getSharedPreferences("fish", Context.MODE_PRIVATE);
                    String desc = fish.getString("description", "");
                    String values = fish.getString("nut_values", "");
                    String ben = fish.getString("benefits", "");
                    description.setText(desc);
                    nut_values.setText(values);
                    benefits.setText(ben);
                    iv.setImageResource(R.drawable.fish);
                }

                // FOR  PANEER  RETREIVING
                else if (item.equalsIgnoreCase("mutton")) {
                    SharedPreferences mutton = getSharedPreferences("mutton", Context.MODE_PRIVATE);
                    String desc = mutton.getString("description", "");
                    String values = mutton.getString("nut_values", "");
                    String ben = mutton.getString("benefits", "");
                    description.setText(desc);
                    nut_values.setText(values);
                    benefits.setText(ben);
                    iv.setImageResource(R.drawable.mutton1);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                nonvegselected.setText("Select");
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
