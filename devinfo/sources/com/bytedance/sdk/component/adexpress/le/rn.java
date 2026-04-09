package com.bytedance.sdk.component.adexpress.le;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn extends FrameLayout {
    private boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    private TextView f7345le;

    /* renamed from: lh, reason: collision with root package name */
    public AnimatorSet f7346lh;
    public ImageView ouw;
    public jqy vt;
    private Context yu;

    public rn(Context context) {
        super(context);
        this.fkw = true;
        this.yu = context;
        this.f7346lh = new AnimatorSet();
        this.vt = new jqy(this.yu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 50.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 40.0f);
        int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 20.0f);
        layoutParams.leftMargin = iOuw;
        layoutParams.setMarginStart(iOuw);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.vt, layoutParams);
        this.ouw = new ImageView(this.yu);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 78.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 78.0f));
        this.ouw.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this.yu, "tt_splash_hand"));
        addView(this.ouw, layoutParams2);
        TextView textView = new TextView(this.yu);
        this.f7345le = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.yu, 10.0f);
        addView(this.f7345le, layoutParams3);
        this.f7345le.setVisibility(8);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ouw, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.le.rn.2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                if (rn.this.fkw) {
                    rn.this.vt.ouw();
                }
                rn.this.fkw = !r2.fkw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(rn.this.ouw, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                rn.this.ouw.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ouw, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f7346lh.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.rn.1
            @Override // java.lang.Runnable
            public final void run() {
                int iOuw2 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.yu, 50.0f);
                int iOuw3 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.yu, 50.0f);
                if (rn.this.vt.getMeasuredHeight() > 0) {
                    iOuw2 = rn.this.vt.getMeasuredHeight();
                }
                if (rn.this.vt.getMeasuredWidth() > 0) {
                    iOuw3 = rn.this.vt.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) rn.this.ouw.getLayoutParams();
                layoutParams4.topMargin = ((int) ((iOuw2 / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.yu, 40.0f));
                layoutParams4.leftMargin = ((int) ((iOuw3 / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.yu, 20.0f));
                layoutParams4.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.getContext(), 5.0f) + ((-iOuw2) / 2.0f));
                layoutParams4.rightMargin = (int) (com.bytedance.sdk.component.adexpress.yu.ra.ouw(rn.this.getContext(), 5.0f) + ((-iOuw3) / 2.0f));
                layoutParams4.setMarginStart(layoutParams4.leftMargin);
                layoutParams4.setMarginEnd(layoutParams4.rightMargin);
                rn.this.ouw.setLayoutParams(layoutParams4);
            }
        });
    }

    public final void setGuideText(String str) {
        this.f7345le.setVisibility(0);
        this.f7345le.setText(str);
    }

    public final void setGuideTextColor(int i4) {
        this.f7345le.setTextColor(i4);
    }
}
