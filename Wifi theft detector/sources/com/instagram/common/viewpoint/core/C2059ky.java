package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ky, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2059ky implements HY {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final LN A04;

    public C2059ky(LN ln, int i10, long j10, long j11) {
        this.A04 = ln;
        this.A00 = i10;
        this.A03 = j10;
        this.A01 = (j11 - j10) / ln.A02;
        this.A02 = A00(this.A01);
    }

    private long A00(long j10) {
        return C5C.A0U(j10 * this.A00, 1000000L, this.A04.A04);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j10) {
        long jA0T = C5C.A0T((this.A04.A04 * j10) / (this.A00 * 1000000), 0L, this.A01 - 1);
        long j11 = this.A03 + (this.A04.A02 * jA0T);
        long jA00 = A00(jA0T);
        HZ hz = new HZ(jA00, j11);
        if (jA00 >= j10 || jA0T == this.A01 - 1) {
            return new HX(hz);
        }
        long j12 = 1 + jA0T;
        return new HX(hz, new HZ(A00(j12), this.A03 + (this.A04.A02 * j12)));
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
