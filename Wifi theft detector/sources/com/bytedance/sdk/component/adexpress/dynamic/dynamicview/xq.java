package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class xq extends ycc {
    ObjectAnimator emc;
    private Runnable sra;
    private int ul;
    private boolean ylm;
    ObjectAnimator ypw;

    public xq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.ul = 0;
        this.ylm = false;
        this.sra = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xq.1
            @Override // java.lang.Runnable
            public void run() {
                xq.this.emc();
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
        postDelayed(this.sra, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mkp
    public void ypw() {
        removeCallbacks(this.sra);
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
        final View childAt;
        final View childAt2 = getChildAt(this.ul);
        if (childAt2 == null) {
            return;
        }
        int i10 = this.ul;
        if (i10 == 0) {
            this.ylm = false;
        }
        if (i10 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.ul + 1)).getChildCount() <= 0) {
            this.ylm = true;
            childAt = getChildAt(this.ul - 1);
            this.emc = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (this.uym + getChildAt(this.ul).getWidth()) / 2);
        } else {
            childAt = getChildAt(this.ul + 1);
            this.emc = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(this.uym + getChildAt(this.ul).getWidth())) / 2);
        }
        if (childAt == null) {
            return;
        }
        this.emc.setInterpolator(new LinearInterpolator());
        this.emc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xq.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        if (this.ylm) {
            this.ypw = ObjectAnimator.ofFloat(childAt, "translationX", (-(this.uym + childAt.getWidth())) / 2, 0.0f);
        } else {
            this.ypw = ObjectAnimator.ofFloat(childAt, "translationX", (this.uym + childAt.getWidth()) / 2, 0.0f);
        }
        this.ypw.setInterpolator(new LinearInterpolator());
        this.ypw.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xq.3
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
                childAt.setVisibility(0);
            }
        });
        this.emc.setDuration(500L);
        this.ypw.setDuration(500L);
        this.emc.start();
        this.ypw.start();
        if (this.ylm) {
            this.ul--;
        } else {
            this.ul++;
        }
        postDelayed(this.sra, 2000L);
    }
}
