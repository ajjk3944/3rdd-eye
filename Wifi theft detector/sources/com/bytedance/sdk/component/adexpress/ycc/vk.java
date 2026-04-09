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
public class vk extends FrameLayout {
    private boolean bw;
    private AnimatorSet dg;
    private Context emc;
    private rie xq;
    private TextView ycc;
    private ImageView ypw;

    public vk(@NonNull Context context) {
        super(context);
        this.bw = true;
        this.emc = context;
        this.dg = new AnimatorSet();
        xq();
        dg();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.vk.1
            @Override // java.lang.Runnable
            public void run() {
                int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(vk.this.emc, 50.0f);
                int iEmc2 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(vk.this.emc, 50.0f);
                if (vk.this.xq.getMeasuredHeight() > 0) {
                    iEmc = vk.this.xq.getMeasuredHeight();
                }
                if (vk.this.xq.getMeasuredWidth() > 0) {
                    iEmc2 = vk.this.xq.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vk.this.ypw.getLayoutParams();
                layoutParams.topMargin = ((int) ((iEmc / 2.0f) - com.bytedance.sdk.component.adexpress.dg.uym.emc(vk.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(vk.this.emc, 40.0f));
                layoutParams.leftMargin = ((int) ((iEmc2 / 2.0f) - com.bytedance.sdk.component.adexpress.dg.uym.emc(vk.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(vk.this.emc, 20.0f));
                layoutParams.bottomMargin = (int) (((-iEmc) / 2.0f) + com.bytedance.sdk.component.adexpress.dg.uym.emc(vk.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-iEmc2) / 2.0f) + com.bytedance.sdk.component.adexpress.dg.uym.emc(vk.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                vk.this.ypw.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.ycc.setVisibility(0);
        this.ycc.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.ycc.setTextColor(i10);
    }

    private void dg() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ypw, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.vk.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (vk.this.bw) {
                    vk.this.xq.emc();
                }
                vk.this.bw = !r2.bw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(vk.this.ypw, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                vk.this.ypw.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ypw, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.dg.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void xq() {
        this.xq = new rie(this.emc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 50.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 40.0f);
        int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 20.0f);
        layoutParams.leftMargin = iEmc;
        layoutParams.setMarginStart(iEmc);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.xq, layoutParams);
        this.ypw = new ImageView(this.emc);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 78.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 78.0f));
        this.ypw.setImageResource(com.bytedance.sdk.component.utils.rie.dg(this.emc, "tt_splash_hand"));
        addView(this.ypw, layoutParams2);
        TextView textView = new TextView(this.emc);
        this.ycc = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 10.0f);
        addView(this.ycc, layoutParams3);
        this.ycc.setVisibility(8);
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
