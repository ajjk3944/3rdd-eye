package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1416aG implements Animator.AnimatorListener {
    public final /* synthetic */ C1419aJ A00;

    public C1416aG(C1419aJ c1419aJ) {
        this.A00 = c1419aJ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A04 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.A00.A0H == EnumC1425aP.A04) {
            this.A00.A01.setPadding(XV.A0S, XV.A00, XV.A0S, XV.A00);
            this.A00.A01.setVisibility(0);
        } else {
            this.A00.A01.setPadding(XV.A0I, XV.A00, XV.A0I, XV.A00);
        }
    }
}
