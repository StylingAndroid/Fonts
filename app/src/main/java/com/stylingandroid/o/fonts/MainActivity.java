package com.stylingandroid.o.fonts;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface pacifico = ResourcesCompat.getFont(this, R.font.pacifico);
        Typeface nunito = ResourcesCompat.getFont(this, R.font.nunito);

        TextView pacificoText = findViewById(R.id.pacifico);
        pacificoText.setTypeface(pacifico);

        TextView regular = findViewById(R.id.nunito_regular);
        regular.setTypeface(nunito, Typeface.NORMAL);
        TextView bold = findViewById(R.id.nunito_bold);
        bold.setTypeface(nunito, Typeface.BOLD);
        TextView italic = findViewById(R.id.nunito_italic);
        italic.setTypeface(nunito, Typeface.ITALIC);
        TextView boldItalic = findViewById(R.id.nunito_bold_italic);
        boldItalic.setTypeface(nunito, Typeface.BOLD_ITALIC);

        TextView text = findViewById(R.id.nunito_programmatic);
        text.setTypeface(nunito, Typeface.BOLD_ITALIC);
    }
}
