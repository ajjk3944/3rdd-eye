package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class bw extends FrameLayout {
    private ImageView emc;
    private AnimatorSet ypw;

    public bw(Context context) {
        super(context);
        xq();
        dg();
    }

    private void dg() {
        this.ypw = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.emc, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.emc, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.ypw.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void xq() {
        ImageView imageView = new ImageView(getContext());
        this.emc = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.rie.dg(getContext(), "tt_white_hand"));
        int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iEmc, iEmc);
        layoutParams.gravity = 17;
        addView(this.emc, layoutParams);
    }

    public void emc() {
        AnimatorSet animatorSet = this.ypw;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void ypw() {
        AnimatorSet animatorSet = this.ypw;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
