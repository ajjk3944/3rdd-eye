package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: assets/audience_network/classes2.dex */
public final class DQ implements InterfaceC1728fK {
    public ViewPropertyAnimator A00;
    public EnumC1727fJ A01 = EnumC1727fJ.A04;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public DQ(View view, int i10, boolean z10) {
        this.A02 = i10;
        this.A03 = view;
        this.A04 = z10;
    }

    private void A04(boolean z10) {
        this.A01 = EnumC1727fJ.A03;
        if (this.A04) {
            YB.A0L(this.A03);
        }
        if (!z10) {
            this.A03.setAlpha(1.0f);
            this.A01 = EnumC1727fJ.A02;
        } else {
            this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new C1732fO(this));
        }
    }

    private void A05(boolean z10) {
        this.A01 = EnumC1727fJ.A05;
        if (!z10) {
            this.A03.setAlpha(0.0f);
            this.A01 = EnumC1727fJ.A04;
        } else {
            this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new C1733fP(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1728fK
    public final void A4A(boolean z10, boolean z11) {
        if (z11) {
            A05(z10);
        } else {
            A04(z10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1728fK
    public final EnumC1727fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1728fK
    public final void cancel() {
        this.A03.clearAnimation();
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
