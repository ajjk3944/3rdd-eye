package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class db extends LinearLayout {
    private LinearLayout bw;
    private emc dg;
    private TextView emc;
    private com.bytedance.sdk.component.adexpress.dynamic.dg.ru uym;
    private TextView xq;
    private com.bytedance.adsdk.ypw.ycc ycc;
    private com.bytedance.sdk.component.utils.ee ypw;

    public interface emc {
    }

    public db(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.dg.ru ruVar) {
        super(context);
        this.uym = ruVar;
        emc(context, view);
    }

    public TextView getTopTextView() {
        return this.emc;
    }

    public LinearLayout getWriggleLayout() {
        return this.bw;
    }

    public View getWriggleProgressIv() {
        return this.ycc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.ypw == null) {
                this.ypw = new com.bytedance.sdk.component.utils.ee(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.ycc.db.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.dg.ru ruVar = this.uym;
            if (ruVar != null) {
                ruVar.xq();
                this.uym.bw();
                this.uym.ycc();
                this.uym.msw();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.ypw.ycc yccVar = this.ycc;
            if (yccVar != null) {
                yccVar.bw();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
    }

    public void setOnShakeViewListener(emc emcVar) {
        this.dg = emcVar;
    }

    public void setShakeText(String str) {
        this.xq.setText(str);
    }

    private void emc(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.bw = (LinearLayout) findViewById(2097610722);
        this.emc = (TextView) findViewById(2097610719);
        this.xq = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.ypw.ycc yccVar = (com.bytedance.adsdk.ypw.ycc) findViewById(2097610706);
        this.ycc = yccVar;
        yccVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.ycc.setImageAssetsFolder("images/");
        this.ycc.emc(true);
    }

    public void emc() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.db.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    db.this.ycc.emc();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}
