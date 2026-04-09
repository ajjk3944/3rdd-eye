package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class GN {
    public static final GN A03 = new GN(-3, -9223372036854775807L, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public GN(int i, long j4, long j10) {
        this.A00 = i;
        this.A02 = j4;
        this.A01 = j10;
    }

    public static GN A03(long j4) {
        return new GN(0, -9223372036854775807L, j4);
    }

    public static GN A04(long j4, long j10) {
        return new GN(-1, j4, j10);
    }

    public static GN A05(long j4, long j10) {
        return new GN(-2, j4, j10);
    }
}
