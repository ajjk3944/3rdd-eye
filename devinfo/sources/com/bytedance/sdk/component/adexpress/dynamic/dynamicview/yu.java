package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends le {
    ObjectAnimator ouw;
    private int qbp;
    ObjectAnimator vt;
    private Runnable zin;

    public yu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.qbp = 0;
        this.zin = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                yu.ouw(yu.this);
            }
        };
    }

    public static /* synthetic */ void ouw(yu yuVar) {
        final View childAt = yuVar.getChildAt(yuVar.qbp);
        final View childAt2 = yuVar.getChildAt((yuVar.qbp + 1) % yuVar.getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(yuVar.getChildAt(yuVar.qbp).getHeight() + yuVar.pno)) / 2);
        yuVar.ouw = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        yuVar.ouw.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yu.2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (childAt2.getHeight() + yuVar.pno) / 2, 0.0f);
        yuVar.vt = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        yuVar.vt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yu.3
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }
        });
        yuVar.ouw.setDuration(500L);
        yuVar.vt.setDuration(500L);
        yuVar.ouw.start();
        yuVar.vt.start();
        int i4 = yuVar.qbp + 1;
        yuVar.qbp = i4;
        yuVar.qbp = i4 % yuVar.getChildCount();
        yuVar.postDelayed(yuVar.zin, 2000L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak
    public final void a_() {
        removeCallbacks(this.zin);
        ObjectAnimator objectAnimator = this.ouw;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.ouw.cancel();
        }
        ObjectAnimator objectAnimator2 = this.vt;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.vt.cancel();
        }
        super.a_();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.pno - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i4 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.zin, 2500L);
    }
}
