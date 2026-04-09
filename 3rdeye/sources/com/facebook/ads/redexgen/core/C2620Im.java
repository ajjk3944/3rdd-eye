package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Im, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2620Im {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C3949or A07;
    public final long[] A08;
    public final long[] A09;
    public final C2621In[] A0A;

    public C2620Im(int i, int i10, long j4, long j10, long j11, C3949or c3949or, int i11, C2621In[] c2621InArr, int i12, long[] jArr, long[] jArr2) {
        this.A00 = i;
        this.A03 = i10;
        this.A06 = j4;
        this.A05 = j10;
        this.A04 = j11;
        this.A07 = c3949or;
        this.A02 = i11;
        this.A0A = c2621InArr;
        this.A01 = i12;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C2621In A00(int i) {
        if (this.A0A == null) {
            return null;
        }
        return this.A0A[i];
    }
}
