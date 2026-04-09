package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class M3 {
    public final long A00;
    public final long A01;

    public M3(long j4, long j10) {
        this.A01 = j4;
        this.A00 = j10;
    }

    public final boolean A00(long j4, long j10) {
        return this.A00 == -1 ? j4 >= this.A01 : j10 != -1 && this.A01 <= j4 && j4 + j10 <= this.A01 + this.A00;
    }

    public final boolean A01(long j4, long j10) {
        return this.A01 <= j4 ? this.A00 == -1 || this.A01 + this.A00 > j4 : j10 == -1 || j4 + j10 > this.A01;
    }
}
