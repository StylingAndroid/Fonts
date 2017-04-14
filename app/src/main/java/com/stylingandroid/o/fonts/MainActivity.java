package com.stylingandroid.o.fonts;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface nunito = getResources().getFont(R.font.nunito);
        TextView text = (TextView) findViewById(R.id.nunito_programmatic);
        text.setTypeface(nunito, Typeface.BOLD_ITALIC);
    }
}
