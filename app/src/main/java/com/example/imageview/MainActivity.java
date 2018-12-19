package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.imageview.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView imge;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        imge = (ImageView) findViewById(R.id.imge);
    }

    public void click(View view) {
        Random rd= new Random();
        x=rd.nextInt(3)+1;
        if (x==1) {
            imge.setImageResource(R.drawable.onepic);
            btn.setText("1");
        }
        else {
            if (x == 2){
                imge.setImageResource(R.drawable.twopic);
                btn.setText("2");
            }
            else {
                imge.setImageResource(R.drawable.threepic);
                btn.setText("3");
            }
        }
        }
    }

