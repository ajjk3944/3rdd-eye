package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.fQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1356fQ implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ DB A02;

    public C1356fQ(DB db2, int i4, int i10) {
        this.A02 = db2;
        this.A01 = i4;
        this.A00 = i10;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A02.A07(this.A00, this.A01, false);
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnumC1349fJ enumC1349fJ;
        DB db2 = this.A02;
        if (this.A01 == this.A02.A04) {
            enumC1349fJ = EnumC1349fJ.A02;
        } else {
            enumC1349fJ = EnumC1349fJ.A04;
        }
        db2.A01 = enumC1349fJ;
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
