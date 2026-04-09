package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C0706Nm A07;
    public final C1436gi A08;
    public C0694Na A01 = C0694Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C1436gi c1436gi, NY ny, C0706Nm c0706Nm) {
        this.A08 = c1436gi;
        this.A06 = ny;
        this.A07 = c0706Nm;
    }

    public final Cdo A09(int i4) {
        this.A00 = i4;
        return this;
    }

    public final Cdo A0A(C0694Na c0694Na) {
        this.A01 = c0694Na;
        return this;
    }

    public final Cdo A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final Cdo A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final Cdo A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final Cdo A0E(boolean z3) {
        this.A05 = z3;
        return this;
    }

    public final C1259dq A0F() {
        return new C1259dq(this, null);
    }
}
