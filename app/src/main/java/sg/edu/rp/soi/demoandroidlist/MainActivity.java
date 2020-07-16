package sg.edu.rp.soi.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView androidList;
    ArrayList<AndroidVersion> androidArrayList;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidList = findViewById(R.id.lvandroidList);
        androidArrayList = new ArrayList<>();
        androidArrayList.add(new AndroidVersion("Pie","9.0"));
        androidArrayList.add(new AndroidVersion("Oreo","8.0-8.1"));
        androidArrayList.add(new AndroidVersion("Nougat","7.0 - 7.1.2"));
        androidArrayList.add(new AndroidVersion("Marshmallow","5.0 - 5.1.1"));
        androidArrayList.add(new AndroidVersion("KitKat","3.3 - 4.4.4"));
        androidArrayList.add(new AndroidVersion("Jelly","4.1 - 4.3.1"));


        adapter = new CustomAdapter(this,R.layout.row,androidArrayList);
        androidList.setAdapter(adapter);
    }
}
