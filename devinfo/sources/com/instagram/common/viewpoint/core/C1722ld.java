package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ld, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1722ld implements InterfaceC0600Jj {
    public final long[] A00;
    public final C1946pT[] A01;

    public C1722ld(C1946pT[] c1946pTArr, long[] jArr) {
        this.A01 = c1946pTArr;
        this.A00 = jArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final List<C1946pT> A7X(long j) {
        int iA0L = C5C.A0L(this.A00, j, true, false);
        if (iA0L == -1 || this.A01[iA0L] == C1946pT.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[iA0L]);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final long A83(int i4) {
        boolean z3 = true;
        AbstractC02203y.A07(i4 >= 0);
        if (i4 >= this.A00.length) {
            z3 = false;
        }
        AbstractC02203y.A07(z3);
        return this.A00[i4];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A84() {
        return this.A00.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A8a(long j) {
        int iA0K = C5C.A0K(this.A00, j, false, false);
        int index = this.A00.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
