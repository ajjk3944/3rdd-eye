package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.lc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1721lc implements InterfaceC0600Jj {
    public final KM A00;
    public final Map<String, KT> A01;
    public final Map<String, String> A02;
    public final Map<String, KN> A03;
    public final long[] A04;

    public C1721lc(KM km2, Map<String, KT> map, Map<String, KN> map2, Map<String, String> imageMap) {
        this.A00 = km2;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = km2.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final List<C1946pT> A7X(long j) {
        return this.A00.A0E(j, this.A01, this.A03, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final long A83(int i4) {
        return this.A04[i4];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A84() {
        return this.A04.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A8a(long j) {
        int iA0K = C5C.A0K(this.A04, j, false, false);
        int index = this.A04.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
