package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.m7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3783m7 implements J7 {
    public final long A00;
    public final AbstractC2416Am<C3900o2> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C3783m7(long j4, AbstractC2416Am<C3900o2> abstractC2416Am) {
        this.A00 = j4;
        this.A01 = abstractC2416Am;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C3900o2> A7P(long j4) {
        return j4 >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i) {
        C3M.A07(i == 0);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j4) {
        return this.A00 > j4 ? 0 : -1;
    }
}
