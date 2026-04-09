package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class hy1 implements zz0 {
    @Override // com.yandex.mobile.ads.impl.zz0
    public final yz0 a(b01 b01Var) {
        ByteBuffer byteBuffer = b01Var.f30572d;
        byteBuffer.getClass();
        if (byteBuffer.position() != 0 || !byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            throw new IllegalArgumentException();
        }
        if (b01Var.e()) {
            return null;
        }
        return a(b01Var, byteBuffer);
    }

    public abstract yz0 a(b01 b01Var, ByteBuffer byteBuffer);
}
