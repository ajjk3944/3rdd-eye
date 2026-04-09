package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3671k6 implements J7 {
    public final C2644Jk A00;
    public final Map<String, C2651Jr> A01;
    public final Map<String, String> A02;
    public final Map<String, C2645Jl> A03;
    public final long[] A04;

    public C3671k6(C2644Jk c2644Jk, Map<String, C2651Jr> map, Map<String, C2645Jl> map2, Map<String, String> imageMap) {
        this.A00 = c2644Jk;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = c2644Jk.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C3900o2> A7P(long j4) {
        return this.A00.A0E(j4, this.A01, this.A03, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return this.A04.length;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j4) {
        int iA0K = AbstractC22614a.A0K(this.A04, j4, false, false);
        int index = this.A04.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
