package com.facebook.ads.redexgen.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.7i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC23477i extends AbstractC3870nX implements J7 {
    public long A00;
    public J7 A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC3870nX
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.core.C5I
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j4, J7 j72, long j10) {
        super.A01 = j4;
        this.A01 = j72;
        if (j10 == Long.MAX_VALUE) {
            j10 = super.A01;
        }
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C3900o2> A7P(long j4) {
        return ((J7) C3M.A01(this.A01)).A7P(j4 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i) {
        return ((J7) C3M.A01(this.A01)).A7v(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return ((J7) C3M.A01(this.A01)).A7w();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j4) {
        return ((J7) C3M.A01(this.A01)).A8S(j4 - this.A00);
    }
}
