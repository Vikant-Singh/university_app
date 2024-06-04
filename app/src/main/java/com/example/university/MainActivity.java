package com.example.university;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.university.faculty.UpdateFaculty;
import com.example.university.notice.DeleteNoticeActivity;
import com.example.university.notice.UploadNotice;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice, addGalleryImage, addEbook, faculty, deleteNotice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        uploadNotice = (CardView) findViewById(R.id.addNotice);
        addGalleryImage = (CardView) findViewById(R.id.addGalleryImage);

        addEbook = (CardView) findViewById(R.id.addEbook);
        faculty = (CardView) findViewById(R.id.faculty);
        deleteNotice = (CardView) findViewById(R.id.deleteNotice);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        faculty.setOnClickListener(this);
        deleteNotice.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int noticeId = v.getId();
        Intent intent;
        if(noticeId == R.id.addNotice){
            intent = new Intent(MainActivity.this, UploadNotice.class);
            startActivity(intent);
        } else if (noticeId == R.id.addGalleryImage) {
            intent = new Intent(MainActivity.this,UploadImage.class);
            startActivity(intent);
        } else if (noticeId == R.id.addEbook) {
            intent = new Intent(MainActivity.this,UploadPdfActivity.class);
            startActivity(intent);
        } else if (noticeId == R.id.faculty) {
            intent = new Intent(MainActivity.this, UpdateFaculty.class);
            startActivity(intent);
        } else if (noticeId == R.id.deleteNotice) {
            intent = new Intent(MainActivity.this, DeleteNoticeActivity.class);
            startActivity(intent);
        }


    }
}