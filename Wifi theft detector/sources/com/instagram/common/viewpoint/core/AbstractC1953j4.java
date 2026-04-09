package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1953j4 implements InterfaceC1212Sp {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z10);

    public AbstractC1953j4(boolean z10) {
        this.A00 = z10;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1212Sp
    public final void ADL() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1212Sp
    public final void ADT() {
        A01(true);
    }
}
