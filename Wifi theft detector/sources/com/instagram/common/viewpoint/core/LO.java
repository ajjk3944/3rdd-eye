package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static LO A00(InterfaceC2165ms interfaceC2165ms, C06214v c06214v) throws IOException {
        interfaceC2165ms.AGt(c06214v.A0l(), 0, 8);
        c06214v.A0f(0);
        int iA0C = c06214v.A0C();
        long size = c06214v.A0O();
        return new LO(iA0C, size);
    }
}
