package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C1084Nm A07;
    public final C1814gi A08;
    public C1072Na A01 = C1072Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C1814gi c1814gi, NY ny, C1084Nm c1084Nm) {
        this.A08 = c1814gi;
        this.A06 = ny;
        this.A07 = c1084Nm;
    }

    public final Cdo A09(int i10) {
        this.A00 = i10;
        return this;
    }

    public final Cdo A0A(C1072Na c1072Na) {
        this.A01 = c1072Na;
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

    public final Cdo A0E(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C1637dq A0F() {
        return new C1637dq(this, null);
    }
}
