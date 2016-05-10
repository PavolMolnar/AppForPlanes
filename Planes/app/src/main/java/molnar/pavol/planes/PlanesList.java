package molnar.pavol.planes;


import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class PlanesList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planeslist);
    }
    String [] examplePlanes = {"Plane1", "Plane2" , "Plane3","Plane4", "Plane5" , "Plane6","Plane7", "Plane8" , "Plane9"};

    ListAdapter planesAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, examplePlanes);
    ListView planesView= (ListView) findViewById(R.id.planesView);}


