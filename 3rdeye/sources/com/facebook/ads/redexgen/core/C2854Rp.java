package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2854Rp {
    public final long A00;
    public final EnumC2853Ro A01;
    public final String A02;
    public final boolean A03;

    public C2854Rp(String str, boolean z10, EnumC2853Ro enumC2853Ro) {
        this(str, z10, enumC2853Ro, System.currentTimeMillis());
    }

    public C2854Rp(String str, boolean z10, EnumC2853Ro enumC2853Ro, long j4) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC2853Ro;
        this.A00 = j4;
    }

    public static C2854Rp A00() {
        return new C2854Rp("", true, EnumC2853Ro.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC2853Ro A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
