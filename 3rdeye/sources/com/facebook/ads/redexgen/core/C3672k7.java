package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.k7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3672k7 implements J7 {
    public final long[] A00;
    public final C3900o2[] A01;

    public C3672k7(C3900o2[] c3900o2Arr, long[] jArr) {
        this.A01 = c3900o2Arr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C3900o2> A7P(long j4) {
        int iA0L = AbstractC22614a.A0L(this.A00, j4, true, false);
        if (iA0L == -1 || this.A01[iA0L] == C3900o2.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[iA0L]);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i) {
        boolean z10 = true;
        C3M.A07(i >= 0);
        if (i >= this.A00.length) {
            z10 = false;
        }
        C3M.A07(z10);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j4) {
        int iA0K = AbstractC22614a.A0K(this.A00, j4, false, false);
        int index = this.A00.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
