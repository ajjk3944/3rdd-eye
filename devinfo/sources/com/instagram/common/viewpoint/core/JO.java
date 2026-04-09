package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class JO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C1996qI A07;
    public final long[] A08;
    public final long[] A09;
    public final JP[] A0A;

    public JO(int i4, int i10, long j, long j8, long j9, C1996qI c1996qI, int i11, JP[] jpArr, int i12, long[] jArr, long[] jArr2) {
        this.A00 = i4;
        this.A03 = i10;
        this.A06 = j;
        this.A05 = j8;
        this.A04 = j9;
        this.A07 = c1996qI;
        this.A02 = i11;
        this.A0A = jpArr;
        this.A01 = i12;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final JP A00(int i4) {
        if (this.A0A == null) {
            return null;
        }
        return this.A0A[i4];
    }
}
