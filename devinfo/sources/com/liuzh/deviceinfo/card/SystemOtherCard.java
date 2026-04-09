package com.liuzh.deviceinfo.card;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SystemOtherCard extends FrameLayout {
    public SystemOtherCard(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iE;
        String string;
        String string2;
        super(context, attributeSet);
        if (isInEditMode()) {
            iE = getContext().getResources().getColor(R.color.colorPrimary);
        } else {
            f fVar = f.f21256b;
            iE = f.e();
        }
        setBackgroundResource(R.drawable.bg_common_card);
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
        View.inflate(getContext(), R.layout.card_system_other, this);
        if (isInEditMode()) {
            return;
        }
        TextView textView = (TextView) findViewById(R.id.jvm);
        textView.setTextColor(iE);
        textView.setText(l.D());
        TextView textView2 = (TextView) findViewById(R.id.java_runtime);
        textView2.setTextColor(iE);
        textView2.setText(l.C());
        TextView textView3 = (TextView) findViewById(R.id.jvm_stack_size);
        textView3.setTextColor(iE);
        textView3.setText(Formatter.formatFileSize(DeviceInfoApp.f21145f, Runtime.getRuntime().maxMemory()));
        TextView textView4 = (TextView) findViewById(R.id.kernel_arch);
        textView4.setTextColor(iE);
        try {
            string = System.getProperty("os.arch");
            if (string == null) {
                string = DeviceInfoApp.f21145f.getString(R.string.unknown);
            }
        } catch (Exception unused) {
            string = DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
        textView4.setText(string);
        TextView textView5 = (TextView) findViewById(R.id.kernel);
        textView5.setTextColor(iE);
        try {
            string2 = System.getProperty("os.version");
            if (TextUtils.isEmpty(string2)) {
                string2 = DeviceInfoApp.f21145f.getString(R.string.unknown);
            }
        } catch (Exception unused2) {
            string2 = DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
        textView5.setText(string2);
        TextView textView6 = (TextView) findViewById(R.id.open_gl);
        textView6.setTextColor(iE);
        textView6.setText(l.J());
        TextView textView7 = (TextView) findViewById(R.id.se_linux);
        textView7.setTextColor(iE);
        textView7.setText(l.S(getContext()));
        TextView textView8 = (TextView) findViewById(R.id.openssl_version);
        textView8.setTextColor(iE);
        textView8.setText(l.K());
    }
}
