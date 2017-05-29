package com.stylingandroid.o.fonts;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface nunito = ResourcesCompat.getFont(this, R.font.nunito);

        TextView text = ((AppCompatActivity) this).findViewById(R.id.nunito_programmatic);
        text.setTypeface(nunito, Typeface.BOLD_ITALIC);
    }
}
