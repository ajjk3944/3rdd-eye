package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2201nT implements InterfaceC0978Jj {
    public final long A00;
    public final BP<C2324pT> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C2201nT(long j10, BP<C2324pT> bp) {
        this.A00 = j10;
        this.A01 = bp;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final List<C2324pT> A7X(long j10) {
        return j10 >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final long A83(int i10) {
        AbstractC05983y.A07(i10 == 0);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Jj
    public final int A8a(long j10) {
        return this.A00 > j10 ? 0 : -1;
    }
}
