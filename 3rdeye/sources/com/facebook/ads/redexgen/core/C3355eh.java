package com.facebook.ads.redexgen.core;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3355eh {
    public C3359el A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C3355eh A00(C3359el c3359el) {
        this.A00 = c3359el;
        return this;
    }

    public final C3355eh A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C3355eh A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C3355eh A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C3355eh A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C3356ei A05() {
        return new C3356ei(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
