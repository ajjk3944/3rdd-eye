package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class cf extends FrameLayout {
    private boolean bw;
    private AnimatorSet dg;
    private Context emc;
    private rie xq;
    private ImageView ypw;

    public cf(Context context) {
        super(context);
        this.bw = true;
        this.emc = context;
        this.dg = new AnimatorSet();
        xq();
        dg();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.cf.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cf.this.ypw.getLayoutParams();
                layoutParams.topMargin = (int) ((cf.this.xq.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.dg.uym.emc(cf.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((cf.this.xq.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.dg.uym.emc(cf.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.dg.uym.emc(cf.this.getContext(), 5.0f) + ((-cf.this.xq.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.dg.uym.emc(cf.this.getContext(), 5.0f) + ((-cf.this.xq.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                cf.this.ypw.setLayoutParams(layoutParams);
            }
        });
    }

    private void dg() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ypw, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.cf.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (cf.this.bw) {
                    cf.this.xq.emc();
                }
                cf.this.bw = !r2.bw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cf.this.ypw, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                cf.this.ypw.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ypw, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.dg.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void xq() {
        this.xq = new rie(this.emc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 40.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.xq, layoutParams);
        this.ypw = new ImageView(this.emc);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 62.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 62.0f));
        layoutParams2.gravity = 16;
        this.ypw.setImageResource(com.bytedance.sdk.component.utils.rie.dg(this.emc, "tt_splash_hand"));
        addView(this.ypw, layoutParams2);
    }

    public void ypw() {
        AnimatorSet animatorSet = this.dg;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        rie rieVar = this.xq;
        if (rieVar != null) {
            rieVar.ypw();
        }
        ImageView imageView = this.ypw;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void emc() {
        this.dg.start();
    }
}
