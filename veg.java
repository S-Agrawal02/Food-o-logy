package com.example.acer.foodology;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class veg extends AppCompatActivity {
    //Button sel_item;
    TextView vegselected;
    Spinner itemlist;
    String item;
    TextView description;
    TextView nut_values;
    TextView benefits;
    ImageView iv;
    private boolean zoomOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("VEG FOOD");
        //sel_item = (Button) findViewById(R.id.sel_item);
        vegselected = (TextView) findViewById(R.id.vegselected);
        itemlist = (Spinner) findViewById(R.id.veglist);
        //item = String.valueOf(itemlist.getSelectedItem());
        description = (TextView) findViewById(R.id.description);
        nut_values = (TextView) findViewById(R.id.nut_values);
        benefits = (TextView) findViewById(R.id.benefits);
        iv= (ImageView)findViewById(R.id.imageView);

        // FOR  POTATO  STORING
        SharedPreferences potato = getSharedPreferences("potato", Context.MODE_PRIVATE);
        SharedPreferences.Editor pot_ed = potato.edit();
        pot_ed.putString("description", "Potatoes are the No. 1 vegetable crop in the United States and the fourth most consumed crop in the world, behind rice, wheat and corn.");
        pot_ed.putString("nut_values", "– An excellent source of vitamin C\n" +
                "– A good source of potassium (more than a banana!)\n" +
                "– A good source of vitamin B6\n" +
                "– Fat-, sodium- and cholesterol-free\n" +
                "– Only 110 calories per serving");
        pot_ed.putString("benefits","# The vitamin C in potatoes acts as an antioxidant.\n"+
                "# May prevent or delay some types of cell damage.\n"+
                        "# They may also help with digestion, heart.");
        pot_ed.apply();

        //FOR TOMATO  STORING
        SharedPreferences tomato = getSharedPreferences("tomato", Context.MODE_PRIVATE);
        SharedPreferences.Editor tom_ed = tomato.edit();
        tom_ed.putString("description", "Tomatoes are widely known for their outstanding antioxidant content, including, of course, their oftentimes-rich concentration of lycopene.");
        tom_ed.putString("nut_values", "-- In terms of conventional antioxidants, tomatoes provide an excellent amount of vitamin C and beta-carotene\n"
                +"-- A very good amount of the mineral manganese\n"
                +"-- A good amount of vitamin E.");
        tom_ed.putString("benefits","# Reduces risk of heart disease\n"+
                "# Intake improves bone health due to rich supply of antioxidant in tomatoes\n"+
                "# Anti-cancer benefits");
        tom_ed.apply();

        //FOR  SPINACH  STORING
        SharedPreferences spinach = getSharedPreferences("spinach", Context.MODE_PRIVATE);
        SharedPreferences.Editor spinach_ed = spinach.edit();
        spinach_ed.putString("description", "Spinach is available all year round but is in season during the spring (March - June). It is well known for its nutritional qualities and " +
                "has always been regarded as a plant with remarkable abilities to restore energy, increase vitality and improve the quality of the blood. ");
        spinach_ed.putString("nut_values", "-- Excellent source of vitamin K, vitamin A & C and Folic Acid.\n"+"" +
                "-- Good source of manganese, magnesium, iron and vitamin B2. ");
        spinach_ed.putString("benefits","A 100g serving provides:\n"+
                "   # 3g protein & 2g fibre\n"+
                "   # 23 calories & 4g carbohydrates");
        spinach_ed.apply();

        //FOR  PANEER  STORING
        SharedPreferences paneer = getSharedPreferences("paneer", Context.MODE_PRIVATE);
        SharedPreferences.Editor paneer_ed = paneer.edit();
        paneer_ed.putString("description", "Paneer is a fresh cheese common in South Asia, especially in Indian, Pakistani cuisines. "+
                "It is an unaged, acid-set, non-melting farmer cheese or curd cheese made by curdling heated milk with lemon juice, vinegar, or any other food acids. " +
                "Its crumbly and moist form is called chhena in eastern India and in Bangladesh.");
        paneer_ed.putString("nut_values", "Per 100 gms serving :\n" + "  --Calories: 265 & Fat: 21g\n" + "  --Carbs: 1.2g & Protein: 18g");
        paneer_ed.putString("benefits","# Good source of protein\n"+
                "# Helps burn more fat\n"+
                "# Prevents even Cancer & Heart diseases");
        paneer_ed.apply();


    //public void onselect1(View view) {
        itemlist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        //item = String.valueOf(itemlist.getSelectedItem());
        item = itemlist.getSelectedItem().toString();
        vegselected.setText(item);
         // FOR  POTATO  RETREIVING
        if (item.equalsIgnoreCase("potato")) {
            SharedPreferences potato = getSharedPreferences("potato", Context.MODE_PRIVATE);
            String desc = potato.getString("description", "");
            String values = potato.getString("nut_values", "");
            String ben = potato.getString("benefits", "");
            description.setText(desc);
            nut_values.setText(values);
            benefits.setText(ben);
            iv.setImageResource(R.drawable.potato);
        }

        // FOR  TOMATO  RETREIVING
        else if (item.equalsIgnoreCase("tomato")) {
            SharedPreferences tomato = getSharedPreferences("tomato", Context.MODE_PRIVATE);
            String desc = tomato.getString("description", "");
            String values = tomato.getString("nut_values", "");
            String ben = tomato.getString("benefits", "");
            description.setText(desc);
            nut_values.setText(values);
            benefits.setText(ben);
            iv.setImageResource(R.drawable.tomato);
        }

        // FOR  SPINACH  RETREIVING
        else if (item.equalsIgnoreCase("spinach")) {
            SharedPreferences spinach = getSharedPreferences("spinach", Context.MODE_PRIVATE);
            String desc = spinach.getString("description", "");
            String values = spinach.getString("nut_values", "");
            String ben = spinach.getString("benefits", "");
            description.setText(desc);
            nut_values.setText(values);
            benefits.setText(ben);
            iv.setImageResource(R.drawable.spinach);
        }

        // FOR  PANEER  RETREIVING
        else if (item.equalsIgnoreCase("paneer")) {
            SharedPreferences paneer = getSharedPreferences("paneer", Context.MODE_PRIVATE);
            String desc = paneer.getString("description", "");
            String values = paneer.getString("nut_values", "");
            String ben = paneer.getString("benefits", "");
            description.setText(desc);
            nut_values.setText(values);
            benefits.setText(ben);
            iv.setImageResource(R.drawable.paneer);
        }

    }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                vegselected.setText("Select");
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
