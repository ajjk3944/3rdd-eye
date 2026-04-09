package com.instagram.common.viewpoint.core;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1698lF implements L8 {
    public C1996qI A00;
    public AnonymousClass53 A01;
    public InterfaceC0543Hd A02;

    public C1698lF(String str) {
        this.A00 = new C01872p().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC02203y.A02(this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void A5A(C02434v c02434v) {
        A00();
        long jA03 = this.A01.A03();
        long jA04 = this.A01.A04();
        if (jA03 == -9223372036854775807L || jA04 == -9223372036854775807L) {
            return;
        }
        if (jA04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(jA04).A14();
            this.A02.A6e(this.A00);
        }
        int iA07 = c02434v.A07();
        this.A02.AIr(c02434v, iA07);
        this.A02.AIu(jA03, 1, iA07, 0, null);
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha2, LG lg2) {
        this.A01 = anonymousClass53;
        lg2.A05();
        this.A02 = ha2.AKS(lg2.A03(), 5);
        this.A02.A6e(this.A00);
    }
}
