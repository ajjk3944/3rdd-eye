package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class qh extends FrameLayout {
    private boolean bw;
    private AnimatorSet dg;
    private Context emc;
    private dg xq;
    private TextView ycc;
    private ImageView ypw;

    public qh(@NonNull Context context) {
        super(context);
        this.bw = true;
        this.emc = context;
        this.dg = new AnimatorSet();
        xq();
        dg();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.qh.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qh.this.ypw.getLayoutParams();
                layoutParams.topMargin = ((int) ((qh.this.xq.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.dg.uym.emc(qh.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(qh.this.emc, 20.0f));
                layoutParams.leftMargin = ((int) ((qh.this.xq.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.dg.uym.emc(qh.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(qh.this.emc, 20.0f));
                layoutParams.bottomMargin = (int) (((-qh.this.xq.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.dg.uym.emc(qh.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-qh.this.xq.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.dg.uym.emc(qh.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                qh.this.ypw.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.ycc.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.ycc.setTextColor(i10);
    }

    private void dg() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ypw, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.qh.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (qh.this.bw) {
                    qh.this.xq.emc();
                    qh.this.xq.setAlpha(1.0f);
                } else {
                    qh.this.xq.ypw();
                    qh.this.xq.setAlpha(0.0f);
                }
                qh.this.bw = !r2.bw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(qh.this.ypw, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                qh.this.ypw.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ypw, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.dg.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void xq() {
        this.xq = new dg(this.emc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 80.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 20.0f);
        int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 20.0f);
        layoutParams.leftMargin = iEmc;
        layoutParams.setMarginStart(iEmc);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.xq, layoutParams);
        this.xq.emc();
        this.ypw = new ImageView(this.emc);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 80.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 80.0f));
        this.ypw.setImageResource(com.bytedance.sdk.component.utils.rie.dg(this.emc, "tt_splash_hand"));
        addView(this.ypw, layoutParams2);
        TextView textView = new TextView(this.emc);
        this.ycc = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 10.0f);
        addView(this.ycc, layoutParams3);
    }

    public void ypw() {
        AnimatorSet animatorSet = this.dg;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.ypw();
        }
    }

    public void emc() {
        this.dg.start();
    }
}
