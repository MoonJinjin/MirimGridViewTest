package kr.hs.emirim.s2019s11.mirimgridviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("영화 포스터 목록");
        gridv = findViewById(R.id.gridv);
        GridAdapter adapter = new GridAdapter(this);
        gridv.setAdapter(adapter);
    }
}