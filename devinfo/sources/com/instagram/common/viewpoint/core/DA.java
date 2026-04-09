package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class DA implements InterfaceC1350fK {
    public ValueAnimator A00;
    public EnumC1349fJ A01 = EnumC1349fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public DA(View view, int i4, int i10, int i11) {
        this.A05 = view;
        this.A02 = i4;
        this.A04 = i10;
        this.A03 = i11;
    }

    private ValueAnimator A00(View view, int i4, int i10) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i4, i10);
        valueAnimatorOfInt.setDuration(this.A02);
        valueAnimatorOfInt.addUpdateListener(new C1359fT(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z3) {
        if (z3) {
            this.A01 = EnumC1349fJ.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C1358fS(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        YB.A0H(this.A05);
        this.A01 = EnumC1349fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z3) {
        YB.A0L(this.A05);
        if (z3) {
            this.A01 = EnumC1349fJ.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C1357fR(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = EnumC1349fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1350fK
    public final void A4A(boolean z3, boolean z10) {
        if (z10) {
            A08(z3);
        } else {
            A09(z3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1350fK
    public final EnumC1349fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1350fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
