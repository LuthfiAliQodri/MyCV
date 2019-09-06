package org.luthfi.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class InfoDetail extends AppCompatActivity{

    public String EXTRA_INFO = "BRAND";
    public String EXTRA_GAMBAR = "PRICE";
    public String EXTRA_DESKRIPSI = "DESKRIPSI";

    private int total = 0;

    ImageView img_item_Photo;
    TextView tv_item_Name,  tv_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_detail);

        img_item_Photo = findViewById(R.id.img_item_photo);
        tv_item_Name = findViewById(R.id.tv_item_name);
        tv_desc = findViewById(R.id.tv_desc);

        String info = getIntent().getStringExtra(EXTRA_INFO);
        Glide.with(this).load(getIntent().getStringExtra(EXTRA_GAMBAR)).into(img_item_Photo);
        String desc = getIntent().getStringExtra(EXTRA_DESKRIPSI);

        tv_item_Name.setText(info);
        tv_desc.setText(desc);


    }
}
