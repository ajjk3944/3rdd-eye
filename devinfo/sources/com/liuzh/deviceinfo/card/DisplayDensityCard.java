package com.liuzh.deviceinfo.card;

import a4.a;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.utilities.f;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class DisplayDensityCard extends LinearLayout {
    public DisplayDensityCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        int iC = a.c(getResources(), 6.0f);
        setPadding(0, iC, 0, iC);
        setBackgroundResource(R.drawable.bg_common_card);
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
        View.inflate(getContext(), R.layout.card_display_density, this);
        if (isInEditMode()) {
            return;
        }
        f fVar = f.f21256b;
        int iE = f.e();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        TextView textView = (TextView) findViewById(R.id.bucket);
        textView.setTextColor(iE);
        textView.setText(d.h());
        TextView textView2 = (TextView) findViewById(R.id.dpi);
        textView2.setTextColor(iE);
        textView2.setText(displayMetrics.densityDpi + " dpi");
        TextView textView3 = (TextView) findViewById(R.id.xdpi);
        textView3.setTextColor(iE);
        textView3.setText(((int) displayMetrics.xdpi) + " dpi");
        TextView textView4 = (TextView) findViewById(R.id.ydpi);
        textView4.setTextColor(iE);
        textView4.setText(((int) displayMetrics.ydpi) + " dpi");
        TextView textView5 = (TextView) findViewById(R.id.logical_density);
        textView5.setTextColor(iE);
        Locale locale = Locale.US;
        textView5.setText(String.format(locale, "%.2f", Float.valueOf(displayMetrics.density)));
        TextView textView6 = (TextView) findViewById(R.id.scaled_density);
        textView6.setTextColor(iE);
        textView6.setText(String.format(locale, "%.2f", Float.valueOf(displayMetrics.scaledDensity)));
        TextView textView7 = (TextView) findViewById(R.id.font_scale);
        textView7.setTextColor(iE);
        textView7.setText(String.format(locale, "%.2f", Float.valueOf(getResources().getConfiguration().fontScale)));
    }
}
