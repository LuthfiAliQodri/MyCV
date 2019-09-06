package org.luthfi.mycv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AppInfo extends AppCompatActivity {

    private RecyclerView rvInfo;
    private ArrayList<Info> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info);

        rvInfo = findViewById(R.id.rv_info);
        rvInfo.setHasFixedSize(true);

        list.addAll(DataInfo.getListData());
        showRecylerCardView();

    }

    private void showRecylerCardView() {
        rvInfo.setLayoutManager(new LinearLayoutManager(this));
        CardViewInfo cardViewInfo = new CardViewInfo(list);
        rvInfo.setAdapter(cardViewInfo);
    }
}
