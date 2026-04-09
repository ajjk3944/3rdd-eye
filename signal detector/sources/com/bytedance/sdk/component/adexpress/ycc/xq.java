package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.xmt;

/* loaded from: classes.dex */
public class xq extends FrameLayout {
    private aa bw;
    private TextView dg;
    private Context emc;
    private ImageView xq;
    private AnimatorSet ycc;
    private ImageView ypw;

    public xq(Context context) {
        super(context);
        this.ycc = new AnimatorSet();
        this.emc = context;
        bw();
        ycc();
    }

    private void bw() {
        FrameLayout frameLayout = new FrameLayout(this.emc);
        this.bw = new aa(this.emc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 95.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.bw, layoutParams);
        this.ypw = new ImageView(this.emc);
        int iEmc = xmt.emc(this.emc, 60.0f);
        this.ypw.setImageDrawable(com.bytedance.sdk.component.adexpress.dg.msw.emc(1, null, null, new int[]{iEmc, iEmc}, Integer.valueOf(xmt.emc(this.emc, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 75.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.ypw, layoutParams2);
        this.xq = new ImageView(this.emc);
        int iEmc2 = xmt.emc(this.emc, 50.0f);
        this.xq.setImageDrawable(com.bytedance.sdk.component.adexpress.dg.msw.emc(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iEmc2, iEmc2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 63.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.xq, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.emc);
        this.dg = textView;
        textView.setTextColor(-1);
        this.dg.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.dg, layoutParams4);
    }

    private void ycc() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.xq, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.xq, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ycc.setDuration(800L);
        this.ycc.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void dg() {
        this.bw.ypw();
        this.bw.xq();
    }

    public void emc() {
        this.ycc.start();
    }

    public void setGuideText(String str) {
        this.dg.setText(str);
    }

    public void xq() {
        this.bw.emc();
    }

    public void ypw() {
        this.ycc.cancel();
    }
}
