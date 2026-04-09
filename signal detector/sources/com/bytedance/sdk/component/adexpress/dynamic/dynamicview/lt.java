package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class lt extends ycc {
    ObjectAnimator emc;
    private Runnable sra;
    private int ul;
    private boolean ylm;
    ObjectAnimator ypw;

    public lt(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.ul = 0;
        this.ylm = false;
        this.sra = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt.1
            @Override // java.lang.Runnable
            public void run() {
                lt.this.emc();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.msw - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
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
        int i = this.ul;
        if (i == 0) {
            this.ylm = false;
        }
        boolean z6 = i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.ul + 1)).getChildCount() <= 0;
        if (this.sz.ru().bw().emc() || !z6) {
            View childAt3 = z6 ? getChildAt((this.ul + 2) % getChildCount()) : getChildAt((this.ul + 1) % getChildCount());
            this.emc = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (-(getChildAt(this.ul).getHeight() + this.msw)) / 2);
            if (z6) {
                this.ul++;
            }
            childAt = childAt3;
        } else {
            this.ylm = true;
            childAt = getChildAt(this.ul - 1);
            this.emc = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (getChildAt(this.ul).getHeight() + this.msw) / 2);
        }
        this.emc.setInterpolator(new LinearInterpolator());
        this.emc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt.2
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
            this.ypw = ObjectAnimator.ofFloat(childAt, "translationY", (-(childAt.getHeight() + this.msw)) / 2, 0.0f);
        } else {
            this.ypw = ObjectAnimator.ofFloat(childAt, "translationY", (childAt.getHeight() + this.msw) / 2, 0.0f);
        }
        this.ypw.setInterpolator(new LinearInterpolator());
        this.ypw.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt.3
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
            int i3 = this.ul + 1;
            this.ul = i3;
            this.ul = i3 % getChildCount();
        }
        postDelayed(this.sra, 3000L);
    }
}
