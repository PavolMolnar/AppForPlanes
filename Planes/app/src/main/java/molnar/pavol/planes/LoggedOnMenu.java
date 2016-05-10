package molnar.pavol.planes;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoggedOnMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggedmenu);
    }


    public void showPlanesList (View view) {
        Intent intent = new Intent(this, PlanesList.class);
        startActivity(intent);
}

}
