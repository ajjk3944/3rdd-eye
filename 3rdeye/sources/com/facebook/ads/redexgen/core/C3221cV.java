package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3221cV {
    public String A02;
    public String A03;
    public String A04;
    public final C2733Mw A06;
    public final N9 A07;
    public final C3272dL A08;
    public C2735My A01 = C2735My.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C3221cV(C3272dL c3272dL, C2733Mw c2733Mw, N9 n9) {
        this.A08 = c3272dL;
        this.A06 = c2733Mw;
        this.A07 = n9;
    }

    public final C3221cV A09(int i) {
        this.A00 = i;
        return this;
    }

    public final C3221cV A0A(C2735My c2735My) {
        this.A01 = c2735My;
        return this;
    }

    public final C3221cV A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C3221cV A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C3221cV A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C3221cV A0E(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C3223cX A0F() {
        return new C3223cX(this, null);
    }
}
