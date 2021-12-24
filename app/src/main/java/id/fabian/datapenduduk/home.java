package id.fabian.datapenduduk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView ceklist = findViewById(R.id.listpenduduk);
        ImageView addlistpng = findViewById(R.id.addpng);

        ceklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahAct = new Intent(home.this,MainActivity.class);
                startActivity(pindahAct);
            }
        });


    }

}