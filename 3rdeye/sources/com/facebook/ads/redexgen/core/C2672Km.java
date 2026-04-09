package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Km, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2672Km {
    public final int A00;
    public final long A01;

    public C2672Km(int i, long j4) {
        this.A00 = i;
        this.A01 = j4;
    }

    public static C2672Km A00(InterfaceC3738lN interfaceC3738lN, C4J c4j) throws IOException {
        interfaceC3738lN.AG9(c4j.A0l(), 0, 8);
        c4j.A0f(0);
        int iA0C = c4j.A0C();
        long size = c4j.A0O();
        return new C2672Km(iA0C, size);
    }
}
