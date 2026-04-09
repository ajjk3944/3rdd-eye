package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Mf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0674Mf {
    public final long A00;
    public final long A01;

    public C0674Mf(long j, long j8) {
        this.A01 = j;
        this.A00 = j8;
    }

    public final boolean A00(long j, long j8) {
        return this.A00 == -1 ? j >= this.A01 : j8 != -1 && this.A01 <= j && j + j8 <= this.A01 + this.A00;
    }

    public final boolean A01(long j, long j8) {
        return this.A01 <= j ? this.A00 == -1 || this.A01 + this.A00 > j : j8 == -1 || j + j8 > this.A01;
    }
}
