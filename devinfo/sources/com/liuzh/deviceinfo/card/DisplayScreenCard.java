package com.liuzh.deviceinfo.card;

import a4.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.m;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import wi.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class DisplayScreenCard extends LinearLayout {
    public DisplayScreenCard(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        String string;
        super(context, attributeSet);
        setOrientation(1);
        int iC = a.c(getResources(), 6.0f);
        setPadding(0, iC, 0, iC);
        setBackgroundResource(R.drawable.bg_common_card);
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
        View.inflate(getContext(), R.layout.card_display_screen, this);
        if (isInEditMode()) {
            return;
        }
        f fVar = f.f21256b;
        int iE = f.e();
        String string2 = getResources().getString(R.string.unknown);
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            TextView textView = (TextView) findViewById(R.id.name);
            textView.setTextColor(iE);
            textView.setText(windowManager.getDefaultDisplay().getName());
            Point point = new Point();
            Display defaultDisplay = windowManager.getDefaultDisplay();
            defaultDisplay.getRealSize(point);
            TextView textView2 = (TextView) findViewById(R.id.hdr);
            textView2.setTextColor(iE);
            if (h.f36756a) {
                Display.HdrCapabilities hdrCapabilities = defaultDisplay.getHdrCapabilities();
                if (hdrCapabilities != null) {
                    int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                    if (supportedHdrTypes.length > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i4 : supportedHdrTypes) {
                            if (i4 == 1) {
                                sb2.append("Dolby Vision, ");
                            } else if (i4 == 2) {
                                sb2.append("HDR10/PQ, ");
                            } else if (i4 == 3) {
                                sb2.append("Hybrid Log-Gamma, ");
                            } else if (i4 == 4) {
                                sb2.append("HDR10+, ");
                            }
                        }
                        string = sb2.length() > 0 ? sb2.delete(sb2.length() - 2, sb2.length()).toString() : getContext().getString(R.string.supported);
                    } else {
                        string = getContext().getString(R.string.not_supported);
                    }
                } else {
                    string = getContext().getString(R.string.not_supported);
                }
                textView2.setText(string);
            } else {
                textView2.setText(R.string.not_supported);
            }
            TextView textView3 = (TextView) findViewById(R.id.screen_height);
            textView3.setTextColor(iE);
            textView3.setText(point.y + getResources().getString(R.string.px));
            TextView textView4 = (TextView) findViewById(R.id.screen_width);
            textView4.setTextColor(iE);
            textView4.setText(point.x + getResources().getString(R.string.px));
            TextView textView5 = (TextView) findViewById(R.id.refresh_rate);
            String string3 = Math.round(defaultDisplay.getRefreshRate()) + "Hz";
            HashSet hashSet = new HashSet();
            Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
            if (supportedModes != null) {
                for (Display.Mode mode : supportedModes) {
                    hashSet.add(Float.valueOf(mode.getRefreshRate()));
                }
            }
            if (!hashSet.isEmpty()) {
                ArrayList arrayList = new ArrayList(hashSet);
                Collections.sort(arrayList, new m(7));
                StringBuilder sb3 = new StringBuilder();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    sb3.append(Math.round(((Float) obj).floatValue()) + "Hz");
                    sb3.append(", ");
                }
                sb3.delete(sb3.length() - 2, sb3.length());
                string3 = sb3.toString();
            }
            textView5.setTextColor(iE);
            textView5.setText(string3);
        }
        Configuration configuration = getResources().getConfiguration();
        TextView textView6 = (TextView) findViewById(R.id.screen_size);
        textView6.setTextColor(iE);
        textView6.setText(l.Q(configuration));
        TextView textView7 = (TextView) findViewById(R.id.physical_size);
        textView7.setTextColor(iE);
        textView7.setText(String.format(Locale.US, "%.2f", Float.valueOf(d.i())) + " " + getResources().getString(R.string.inches));
        TextView textView8 = (TextView) findViewById(R.id.orientation);
        textView8.setTextColor(iE);
        textView8.setText(l.P(configuration));
        TextView textView9 = (TextView) findViewById(R.id.brightness_mode);
        textView9.setTextColor(iE);
        textView9.setText(l.o());
        TextView textView10 = (TextView) findViewById(R.id.screen_timeout);
        textView10.setTextColor(iE);
        textView10.setText(l.R());
        String strF = l.F();
        if (string2.equals(strF)) {
            findViewById(R.id.panel_id_container).setVisibility(8);
            return;
        }
        TextView textView11 = (TextView) findViewById(R.id.panel_id);
        textView11.setTextColor(iE);
        textView11.setText(strF);
    }
}
