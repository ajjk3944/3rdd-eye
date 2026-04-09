package com.facebook.ads.redexgen.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.el, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3359el {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC3349eb A03;
    public Map<String, String> A04;
    public final int A05;
    public final int A06;

    public C3359el(int i, int i10, int i11, int i12, int i13, Map<String, String> requestHeaders, InterfaceC3349eb interfaceC3349eb) {
        this.A06 = i;
        this.A00 = i10;
        this.A02 = i11;
        this.A05 = i12;
        this.A01 = i13;
        this.A04 = requestHeaders;
        this.A03 = interfaceC3349eb;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A05;
    }

    public final int A04() {
        return this.A06;
    }

    public final InterfaceC3349eb A05() {
        return this.A03;
    }

    public final Map<String, String> A06() {
        return this.A04;
    }
}
