package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2104lh implements InterfaceC0978Jj {
    public final List<C2324pT> A00;

    public C2104lh(List<C2324pT> list) {
        this.A00 = list;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final List<C2324pT> A7X(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final long A83(int i10) {
        AbstractC05983y.A07(i10 == 0);
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final int A8a(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
