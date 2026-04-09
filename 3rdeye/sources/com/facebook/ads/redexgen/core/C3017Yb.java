package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3017Yb {
    public int A00;
    public XX A01;
    public InterfaceC3021Yf A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C3272dL A0C;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    public C3017Yb(C3272dL c3272dL, InterfaceC3021Yf interfaceC3021Yf) {
        this.A0C = c3272dL;
        this.A02 = interfaceC3021Yf;
    }

    public final C3017Yb A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final C3017Yb A0E(XX xx) {
        this.A01 = xx;
        return this;
    }

    public final C3017Yb A0F(String str) {
        this.A03 = str;
        return this;
    }

    public final C3017Yb A0G(String str) {
        this.A04 = str;
        return this;
    }

    public final C3017Yb A0H(String str) {
        this.A05 = str;
        return this;
    }

    public final C3017Yb A0I(String str) {
        this.A06 = str;
        return this;
    }

    public final C3017Yb A0J(boolean z10) {
        this.A09 = z10;
        return this;
    }

    public final C3017Yb A0K(boolean z10) {
        this.A0A = z10;
        return this;
    }

    public final C3017Yb A0L(boolean z10) {
        this.A0B = z10;
        return this;
    }

    public final C3018Yc A0M() {
        return new C3018Yc(this, null);
    }
}
