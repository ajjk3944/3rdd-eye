package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class dg extends ycc {
    ObjectAnimator emc;
    private int ul;
    private Runnable ylm;
    ObjectAnimator ypw;

    public dg(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.ul = 0;
        this.ylm = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dg.1
            @Override // java.lang.Runnable
            public void run() {
                dg.this.emc();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.msw - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i10 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.ylm, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mkp
    public void ypw() {
        removeCallbacks(this.ylm);
        ObjectAnimator objectAnimator = this.emc;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.emc.cancel();
        }
        ObjectAnimator objectAnimator2 = this.ypw;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.ypw.cancel();
        }
        super.ypw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc() {
        final View childAt = getChildAt(this.ul);
        final View childAt2 = getChildAt((this.ul + 1) % getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(this.msw + getChildAt(this.ul).getHeight())) / 2);
        this.emc = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.emc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dg.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (this.msw + childAt2.getHeight()) / 2, 0.0f);
        this.ypw = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.ypw.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dg.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.emc.setDuration(500L);
        this.ypw.setDuration(500L);
        this.emc.start();
        this.ypw.start();
        int i10 = this.ul + 1;
        this.ul = i10;
        this.ul = i10 % getChildCount();
        postDelayed(this.ylm, 2000L);
    }
}
