package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class u50 extends hy1 {
    @Override // com.yandex.mobile.ads.impl.hy1
    public final yz0 a(b01 b01Var, ByteBuffer byteBuffer) {
        uf1 uf1Var = new uf1(byteBuffer.limit(), byteBuffer.array());
        String strQ = uf1Var.q();
        strQ.getClass();
        String strQ2 = uf1Var.q();
        strQ2.getClass();
        return new yz0(new t50(strQ, strQ2, uf1Var.p(), uf1Var.p(), Arrays.copyOfRange(uf1Var.c(), uf1Var.d(), uf1Var.e())));
    }
}
