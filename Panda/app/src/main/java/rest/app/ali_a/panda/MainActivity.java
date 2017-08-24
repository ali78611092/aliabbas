package rest.app.ali_a.panda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView res_list_view = (RecyclerView) findViewById(R.id.rec);
        RestaurantAdapter rda = new RestaurantAdapter(MainActivity.this);
        res_list_view.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        res_list_view.setAdapter(rda);
    }
}
