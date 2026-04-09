package com.bytedance.sdk.component.adexpress.le;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends FrameLayout {
    private int bly;
    private View fkw;

    /* renamed from: le, reason: collision with root package name */
    private View f7363le;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f7364lh;
    public AnimatorSet ouw;
    private int pno;
    private ImageView ra;
    private Context tlj;
    public ObjectAnimator vt;
    private View yu;

    public vt(Context context, int i4, int i10) {
        super(context);
        this.f7364lh = false;
        this.ouw = new AnimatorSet();
        this.pno = i4;
        this.bly = i10;
        this.tlj = context;
        View view = new View(context);
        this.yu = view;
        view.setBackground(ouw("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.pno * 0.45d), (int) (this.bly * 0.45d));
        layoutParams.gravity = 17;
        this.yu.setLayoutParams(layoutParams);
        addView(this.yu);
        View view2 = new View(this.tlj);
        this.fkw = view2;
        view2.setBackground(ouw("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.pno * 0.25d), (int) (this.bly * 0.25d));
        layoutParams2.gravity = 17;
        this.fkw.setLayoutParams(layoutParams2);
        addView(this.fkw);
        View view3 = new View(this.tlj);
        this.f7363le = view3;
        view3.setBackground(ouw("#807BBEFF", "#FF7BBEFF"));
        int i11 = this.pno;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i11 * 0.25d), (int) (i11 * 0.25d));
        layoutParams3.gravity = 17;
        this.f7363le.setLayoutParams(layoutParams3);
        addView(this.f7363le);
        ImageView imageView = new ImageView(this.tlj);
        this.ra = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_blue_hand"));
        this.ra.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.pno * 0.62d), (int) (this.bly * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.ra.setLayoutParams(layoutParams4);
        addView(this.ra);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.yu, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.yu, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.fkw, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.fkw, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f7363le, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f7363le, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.ra, "rotation", 0.0f, -20.0f, 0.0f);
        this.vt = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.ouw.setDuration(1500L);
        this.ouw.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ouw.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.ouw.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.le.vt.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                vt.yu(vt.this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (vt.this.f7364lh) {
                    return;
                }
                vt.this.vt.start();
                vt.this.ouw.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
    }

    public static /* synthetic */ boolean yu(vt vtVar) {
        vtVar.f7364lh = true;
        return true;
    }

    private static GradientDrawable ouw(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }
}
