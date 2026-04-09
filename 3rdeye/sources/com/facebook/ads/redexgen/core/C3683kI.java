package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.kI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3683kI implements J7 {
    public final List<C3900o2> A00;

    public C3683kI(List<C3900o2> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C3900o2> A7P(long j4) {
        return j4 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i) {
        C3M.A07(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j4) {
        return j4 < 0 ? 0 : -1;
    }
}
