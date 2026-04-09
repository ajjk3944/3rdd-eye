package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.lc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2099lc implements InterfaceC0978Jj {
    public final KM A00;
    public final Map<String, KT> A01;
    public final Map<String, String> A02;
    public final Map<String, KN> A03;
    public final long[] A04;

    public C2099lc(KM km, Map<String, KT> map, Map<String, KN> map2, Map<String, String> imageMap) {
        this.A00 = km;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = km.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final List<C2324pT> A7X(long j10) {
        return this.A00.A0E(j10, this.A01, this.A03, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final long A83(int i10) {
        return this.A04[i10];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final int A84() {
        return this.A04.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final int A8a(long j10) {
        int iA0K = C5C.A0K(this.A04, j10, false, false);
        int index = this.A04.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
