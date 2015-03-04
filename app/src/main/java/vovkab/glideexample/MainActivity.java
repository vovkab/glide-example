package vovkab.glideexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        Random random = new Random();

        int width = 100 + random.nextInt(50);
        int height = 100 + random.nextInt(50);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(width, height);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setLayoutParams(lp);
        
        Glide.with(this)
                .load("http://farm3.staticflickr.com/2941/15199865447_93e6422708_q.jpg")
                .asBitmap()
                .into(imageView);
    }
}
