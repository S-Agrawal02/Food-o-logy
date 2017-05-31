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

public class fruits extends AppCompatActivity {

    TextView fruitselected;
    Spinner itemlist;
    String item;
    TextView description;
    TextView nut_values;
    TextView benefits;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("FRUITS");
        fruitselected = (TextView) findViewById(R.id.fruitselected);
        itemlist = (Spinner) findViewById(R.id.fruitlist);
        //item = String.valueOf(itemlist.getSelectedItem());
        description = (TextView) findViewById(R.id.description);
        nut_values = (TextView) findViewById(R.id.nut_values);
        benefits = (TextView) findViewById(R.id.benefits);
        iv= (ImageView)findViewById(R.id.imageView);

        // FOR  MANGO  STORING
        SharedPreferences mango = getSharedPreferences("mango", Context.MODE_PRIVATE);
        SharedPreferences.Editor mango_ed = mango.edit();
        mango_ed.putString("description", "Mangoes are juicy stone fruit (drupe) from numerous species of tropical trees belonging to the flowering plant genus Mangifera, cultivated mostly for their edible fruit.");
        mango_ed.putString("nut_values", "– very good source of inexpensive, high quality protein\n" +
                "– A rich source of selenium, vitamin D, B6, B12)\n" +
                "– Minerals such as zinc, iron and copper\n" +
                "– One large egg contains :\n" +
                "– 78 calories, 6.3g protein, 5.3g fat, 1.6g saturated fat, 212mg cholesterol");
        mango_ed.putString("benefits","# The vitamin D strengthen bones.\n"+
                "# Keeps Our Heart Healthy\n"+
                "# Helps in Weight Loss");
        mango_ed.apply();

        //FOR  ORANGE  STORING
        SharedPreferences orange = getSharedPreferences("orange", Context.MODE_PRIVATE);
        SharedPreferences.Editor orange_ed = orange.edit();
        orange_ed.putString("description", "The orange is the fruit of the citrus species Citrus × sinensis in the family Rutaceae. It is also called sweet orange, " +
                "to distinguish it from the related Citrus × aurantium, referred to as bitter orange");
        orange_ed.putString("nut_values", "-- High in protein. Each ounce of meat provides 7g of it"
                +"--  rich source of two B vitamins : vitamin B3 and vitamin B6\n"
                +"-- Aids in the formation of red blood cells.");
        orange_ed.putString("benefits","# Helps control Blood Pressure"+
                "# Helps improve Immune system function\n"+
                "# Aids in regulating the Thyroid hormone");
        orange_ed.apply();

        //FOR  APPLE  STORING
        SharedPreferences apple = getSharedPreferences("apple", Context.MODE_PRIVATE);
        SharedPreferences.Editor apple_ed = apple.edit();
        apple_ed.putString("description", " The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple");
        apple_ed.putString("nut_values", "-- Rich in a variety of minerals and vitamins\n"+"" +
                "-- Good source of manganese, magnesium, iron and vitamin B2. ");
        apple_ed.putString("benefits","A 3-ounce serving provides :\n"+
                "   # 28 grams of protein, or 56 percent of the daily value\n"+
                "   # 3.8 micrograms of vitamin B-12");
        apple_ed.apply();

        //FOR  BANANA  STORING
        SharedPreferences banana = getSharedPreferences("banana", Context.MODE_PRIVATE);
        SharedPreferences.Editor banana_ed = banana.edit();
        banana_ed.putString("description", "The banana is an edible fruit – botanically a berry.The fruit is variable in size, color and firmness, but is usually elongated and curved, " +
                "with soft flesh rich in starch covered with a rind which may be green, yellow, red, purple, or brown when ripe");
        banana_ed.putString("nut_values", "Per 3 oz serving :\n" + "  -- 16.4 g protein ,50 mg sodium\n" + "  -- 118 calories, 5.4 g fat (1.6 g saturated fat)");
        banana_ed.putString("benefits","# Contains Nutrients that Are Crucial During Development\n"+
                "# Help Prevent and Treat Depression, Making You a Happier Person\n"+
                "# The Only Good Dietary Source of Vitamin D");
        banana_ed.apply();


        //public void onselect1(View view) {
        itemlist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                item = String.valueOf(itemlist.getSelectedItem());
                fruitselected.setText(item);
                // FOR  MANGO  RETRIEVING
                if (item.equalsIgnoreCase("mango")) {
                    SharedPreferences mango = getSharedPreferences("mango", Context.MODE_PRIVATE);
                    String desc = mango.getString("description", "");
                    String values = mango.getString("nut_values", "");
                    String ben = mango.getString("benefits", "");
                    description.setText(desc);
                    nut_values.setText(values);
                    benefits.setText(ben);
                    iv.setImageResource(R.drawable.mango);
                }

                // FOR  ORANGE  RETRIEVING
                else if (item.equalsIgnoreCase("orange")) {
                    SharedPreferences orange = getSharedPreferences("orange", Context.MODE_PRIVATE);
                    String desc = orange.getString("description", "");
                    String values = orange.getString("nut_values", "");
                    String ben = orange.getString("benefits", "");
                    description.setText(desc);
                    nut_values.setText(values);
                    benefits.setText(ben);
                    iv.setImageResource(R.drawable.orange);
                }

                // FOR  APPLE  RETRIEVING
                else if (item.equalsIgnoreCase("apple")) {
                    SharedPreferences apple = getSharedPreferences("apple", Context.MODE_PRIVATE);
                    String desc = apple.getString("description", "");
                    String values = apple.getString("nut_values", "");
                    String ben = apple.getString("benefits", "");
                    description.setText(desc);
                    nut_values.setText(values);
                    benefits.setText(ben);
                    iv.setImageResource(R.drawable.apple);
                }

                // FOR  BANANA  RETREIVING
                else if (item.equalsIgnoreCase("banana")) {
                    SharedPreferences banana = getSharedPreferences("banana", Context.MODE_PRIVATE);
                    String desc = banana.getString("description", "");
                    String values = banana.getString("nut_values", "");
                    String ben = banana.getString("benefits", "");
                    description.setText(desc);
                    nut_values.setText(values);
                    benefits.setText(ben);
                    iv.setImageResource(R.drawable.banana);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                fruitselected.setText("Select");
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
