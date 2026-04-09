package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1726lh implements InterfaceC0600Jj {
    public final List<C1946pT> A00;

    public C1726lh(List<C1946pT> list) {
        this.A00 = list;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final List<C1946pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final long A83(int i4) {
        AbstractC02203y.A07(i4 == 0);
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
