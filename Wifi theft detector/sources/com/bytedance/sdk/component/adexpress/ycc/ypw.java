package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class ypw extends FrameLayout {
    private View bw;
    private View dg;
    private AnimatorSet emc;
    private int msw;
    private Context ru;
    private ImageView uym;
    private boolean xq;
    private View ycc;
    private ObjectAnimator ypw;
    private int zz;

    public ypw(Context context, int i10, int i11) {
        super(context);
        this.xq = false;
        this.emc = new AnimatorSet();
        this.msw = i10;
        this.zz = i11;
        this.ru = context;
        xq();
        dg();
    }

    private void dg() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.dg, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.dg, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.bw, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.bw, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.ycc, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.ycc, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.uym, "rotation", 0.0f, -20.0f, 0.0f);
        this.ypw = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.emc.setDuration(1500L);
        this.emc.setInterpolator(new AccelerateDecelerateInterpolator());
        this.emc.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.emc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.ypw.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ypw.this.xq = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ypw.this.xq) {
                    return;
                }
                ypw.this.ypw.start();
                ypw.this.emc.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void xq() {
        View view = new View(this.ru);
        this.dg = view;
        view.setBackground(emc("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.msw * 0.45d), (int) (this.zz * 0.45d));
        layoutParams.gravity = 17;
        this.dg.setLayoutParams(layoutParams);
        addView(this.dg);
        View view2 = new View(this.ru);
        this.bw = view2;
        view2.setBackground(emc("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.msw * 0.25d), (int) (this.zz * 0.25d));
        layoutParams2.gravity = 17;
        this.bw.setLayoutParams(layoutParams2);
        addView(this.bw);
        View view3 = new View(this.ru);
        this.ycc = view3;
        view3.setBackground(emc("#807BBEFF", "#FF7BBEFF"));
        int i10 = this.msw;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i10 * 0.25d), (int) (i10 * 0.25d));
        layoutParams3.gravity = 17;
        this.ycc.setLayoutParams(layoutParams3);
        addView(this.ycc);
        ImageView imageView = new ImageView(this.ru);
        this.uym = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.rie.dg(getContext(), "tt_blue_hand"));
        this.uym.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.msw * 0.62d), (int) (this.zz * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.uym.setLayoutParams(layoutParams4);
        addView(this.uym);
    }

    public void ypw() {
        this.xq = true;
        ObjectAnimator objectAnimator = this.ypw;
        if (objectAnimator == null || this.emc == null) {
            return;
        }
        objectAnimator.cancel();
        this.emc.cancel();
    }

    private GradientDrawable emc(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void emc() {
        this.xq = false;
        ObjectAnimator objectAnimator = this.ypw;
        if (objectAnimator == null || this.emc == null) {
            return;
        }
        objectAnimator.start();
        this.emc.start();
    }
}
