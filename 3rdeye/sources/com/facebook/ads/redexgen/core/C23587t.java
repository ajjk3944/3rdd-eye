package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C23587t implements InterfaceC3711kk {
    public long A00;
    public final long A01;
    public final AnonymousClass45 A03 = new AnonymousClass45();
    public final AnonymousClass45 A02 = new AnonymousClass45();

    public C23587t(long j4, long j10, long j11) {
        this.A00 = j4;
        this.A01 = j11;
        this.A03.A04(0L);
        this.A02.A04(j10);
    }

    public final void A00(long j4) {
        this.A00 = j4;
    }

    public final void A01(long j4, long j10) {
        if (A02(j4)) {
            return;
        }
        this.A03.A04(j4);
        this.A02.A04(j10);
    }

    public final boolean A02(long j4) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j4 - lastIndexedTimeUs < 100000;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3711kk
    public final long A7b() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        int iA0C = AbstractC22614a.A0C(this.A03, j4, true, true);
        C2580Gx c2580Gx = new C2580Gx(this.A03.A03(iA0C), this.A02.A03(iA0C));
        if (c2580Gx.A01 != j4) {
            int targetIndex = this.A03.A02();
            if (iA0C != targetIndex - 1) {
                int targetIndex2 = iA0C + 1;
                long jA03 = this.A03.A03(targetIndex2);
                int targetIndex3 = iA0C + 1;
                C2580Gx nextSeekPoint = new C2580Gx(jA03, this.A02.A03(targetIndex3));
                return new C2578Gv(c2580Gx, nextSeekPoint);
            }
        }
        return new C2578Gv(c2580Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3711kk
    public final long A99(long j4) {
        return this.A03.A03(AbstractC22614a.A0C(this.A02, j4, true, true));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return true;
    }
}
