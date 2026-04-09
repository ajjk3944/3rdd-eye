package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ylm extends FrameLayout {
    private TextView bw;
    private ImageView dg;
    private Context emc;
    private AnimatorSet msw;
    private AnimatorSet uym;
    private ImageView xq;
    private AnimatorSet ycc;
    private ImageView ypw;
    private AnimatorSet zz;

    public ylm(@NonNull Context context) {
        super(context);
        this.ycc = new AnimatorSet();
        this.uym = new AnimatorSet();
        this.msw = new AnimatorSet();
        this.zz = new AnimatorSet();
        this.emc = context;
        xq();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setGuideText(String str) {
        this.bw.setText(str);
    }

    private void dg() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ypw, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.xq, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.xq, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.dg, "alpha", 0.0f, 1.0f);
        this.msw.setDuration(300L);
        this.msw.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.ypw, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.ylm.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ylm.this.dg.getLayoutParams();
                layoutParams.width = num.intValue();
                ylm.this.dg.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.xq, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.zz.setDuration(1500L);
        this.zz.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.ypw, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.dg, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.xq, "alpha", 1.0f, 0.0f);
        this.uym.setDuration(50L);
        this.uym.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.ycc.playSequentially(this.msw, this.zz, this.uym);
    }

    private void xq() {
        ImageView imageView = new ImageView(this.emc);
        this.dg = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.rie.dg(this.emc, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 30.0f);
        addView(this.dg, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.emc);
        this.xq = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.rie.dg(this.emc, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 50.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 30.0f);
        addView(this.xq, layoutParams2);
        ImageView imageView3 = new ImageView(this.emc);
        this.ypw = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.rie.dg(this.emc, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 80.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.emc, 30.0f);
        addView(this.ypw, layoutParams3);
        TextView textView = new TextView(this.emc);
        this.bw = textView;
        textView.setTextColor(-1);
        this.bw.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.bw, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.ylm.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ylm.this.ypw.getLayoutParams();
                layoutParams5.topMargin = (int) ((ylm.this.xq.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.dg.uym.emc(ylm.this.getContext(), 7.0f));
                int iEmc = (-ylm.this.xq.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(ylm.this.emc, 30.0f));
                layoutParams5.leftMargin = iEmc;
                layoutParams5.setMarginStart(iEmc);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                ylm.this.ypw.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) ylm.this.dg.getLayoutParams();
                layoutParams6.topMargin = (int) ((ylm.this.xq.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.dg.uym.emc(ylm.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((ylm.this.xq.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(ylm.this.emc, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                ylm.this.dg.setLayoutParams(layoutParams6);
            }
        });
    }

    public void emc() {
        dg();
        this.ycc.start();
        this.ycc.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.ycc.ylm.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ylm.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.ylm.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ylm.this.ycc.start();
                    }
                }, 200L);
            }
        });
    }

    public void ypw() {
        try {
            AnimatorSet animatorSet = this.ycc;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.msw;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.zz;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.uym;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }
}
