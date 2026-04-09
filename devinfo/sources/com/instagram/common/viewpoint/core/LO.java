package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i4, long j) {
        this.A00 = i4;
        this.A01 = j;
    }

    public static LO A00(InterfaceC1787ms interfaceC1787ms, C02434v c02434v) throws IOException {
        interfaceC1787ms.AGt(c02434v.A0l(), 0, 8);
        c02434v.A0f(0);
        int iA0C = c02434v.A0C();
        long size = c02434v.A0O();
        return new LO(iA0C, size);
    }
}
