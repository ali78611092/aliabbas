package rest.app.ali_a.panda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView re_list_view = (RecyclerView) findViewById(R.id.rec2);
        DealsAdapter daa = new DealsAdapter(Main2Activity.this);
        re_list_view.setLayoutManager(new LinearLayoutManager(Main2Activity.this));
        re_list_view.setAdapter(daa);
    }
}
