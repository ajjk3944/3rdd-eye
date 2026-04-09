package com.liuzh.deviceinfo.card;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bi.d;
import ci.b;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class DeviceOverviewCard extends CardView {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f21172h = 0;

    public DeviceOverviewCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.card_device_overview, this);
        findViewById(R.id.top_container).setBackgroundColor(isInEditMode() ? getContext().getResources().getColor(R.color.colorPrimary) : i.b(getContext()));
        if (isInEditMode()) {
            return;
        }
        f fVar = f.f21256b;
        int iE = f.e();
        TextView textView = (TextView) findViewById(R.id.device_name);
        TextView textView2 = (TextView) findViewById(R.id.name);
        textView2.setTextColor(iE);
        if (TextUtils.isEmpty(f.f21257c.getString("cached_device_name_json", null))) {
            String str = Build.MODEL;
            textView.setText(str);
            textView2.setText(str);
            d.c(new aj.d(22, textView, textView2));
        } else {
            String strN = b.n();
            textView.setText(strN);
            textView2.setText(strN);
        }
        TextView textView3 = (TextView) findViewById(R.id.brand_title);
        String str2 = Build.BRAND;
        textView3.setText(str2);
        TextView textView4 = (TextView) findViewById(R.id.brand);
        textView4.setTextColor(iE);
        textView4.setText(str2);
        TextView textView5 = (TextView) findViewById(R.id.model);
        textView5.setTextColor(iE);
        textView5.setText(Build.MODEL);
        TextView textView6 = (TextView) findViewById(R.id.manufacturer);
        textView6.setTextColor(iE);
        textView6.setText(Build.MANUFACTURER);
        TextView textView7 = (TextView) findViewById(R.id.device);
        textView7.setTextColor(iE);
        textView7.setText(Build.DEVICE);
        TextView textView8 = (TextView) findViewById(R.id.board);
        textView8.setText(Build.BOARD);
        textView8.setTextColor(iE);
        TextView textView9 = (TextView) findViewById(R.id.hardware);
        textView9.setText(Build.HARDWARE);
        textView9.setTextColor(iE);
    }
}
