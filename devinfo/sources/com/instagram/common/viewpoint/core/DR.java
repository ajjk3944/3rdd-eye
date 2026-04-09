package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network/classes2.dex */
public final class DR implements InterfaceC1350fK {
    public int A00;
    public ValueAnimator A01;
    public EnumC1349fJ A02 = EnumC1349fJ.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public DR(View view, int i4, int i10, int i11) {
        this.A05 = view;
        this.A03 = i4;
        this.A00 = i10;
        this.A04 = i11;
    }

    private ValueAnimator A00(int i4, int i10, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i4, i10);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C1353fN(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z3) {
        if (z3) {
            this.A02 = EnumC1349fJ.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C1352fM(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        YB.A0H(this.A05);
        this.A02 = EnumC1349fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z3) {
        YB.A0L(this.A05);
        if (z3) {
            this.A02 = EnumC1349fJ.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C1351fL(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC1349fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1350fK
    public final void A4A(boolean z3, boolean z10) {
        if (z10) {
            A07(z3);
        } else {
            A08(z3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1350fK
    public final EnumC1349fJ A9B() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1350fK
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
