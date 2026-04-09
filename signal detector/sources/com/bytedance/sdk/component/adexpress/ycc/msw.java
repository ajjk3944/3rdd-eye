package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class msw extends sra {
    private int bw;
    private ImageView dg;
    private TextView emc;
    private ImageView xq;
    private AnimatorSet ycc;
    private ImageView ypw;

    public msw(Context context) {
        super(context);
        this.ycc = new AnimatorSet();
        ypw(context);
    }

    private void dg() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    private void ypw(Context context) {
        addView(com.bytedance.sdk.component.adexpress.xq.emc.ypw(context));
        this.ypw = (ImageView) findViewById(2097610751);
        this.xq = (ImageView) findViewById(2097610750);
        this.dg = (ImageView) findViewById(2097610749);
        this.emc = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.ycc.sra
    public void emc(Context context) {
    }

    public float getAlphaColor() {
        return this.bw;
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i3 = i + 195;
        ImageView imageView = this.dg;
        int iRgb = Color.rgb(i3, i3, i3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i6 = ((i + 20) % 60) + 195;
        this.xq.setColorFilter(Color.rgb(i6, i6, i6), mode);
        int i7 = ((i + 40) % 60) + 195;
        this.ypw.setColorFilter(Color.rgb(i7, i7, i7), mode);
    }

    public void setButtonText(String str) {
        if (this.emc == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.emc.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.ycc.sra
    public void emc() {
        dg();
    }

    @Override // com.bytedance.sdk.component.adexpress.ycc.sra
    public void ypw() {
        this.ycc.cancel();
    }
}
