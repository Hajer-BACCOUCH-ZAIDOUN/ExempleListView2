package tp.dsi32.isetsl.exemplelistview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView)findViewById(R.id.listView1);

        ArrayAdapter<String> tableau = new ArrayAdapter<String>(list.getContext(), R.layout.layout_listitem,R.id.textView);

        for (int i=0; i<=10; i++) {
            int produit = i * 5;
            String ligne = String.valueOf(i) + " * " + String.valueOf(5) + " = " + String.valueOf(produit);
            tableau.add( ligne);
        }

        list.setAdapter(tableau);

    }
}
