package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class jy1 extends ey1<f32, g32, d32> implements c32 {
    public jy1() {
        super(new f32[2], new g32[2]);
        f();
    }

    public abstract b32 a(byte[] bArr, int i, boolean z10) throws d32;

    @Override // com.yandex.mobile.ads.impl.c32
    public final void a(long j4) {
    }

    @Override // com.yandex.mobile.ads.impl.ey1
    public final f32 c() {
        return new f32();
    }

    @Override // com.yandex.mobile.ads.impl.ey1
    public final ny d() {
        return new iy1(this);
    }

    @Override // com.yandex.mobile.ads.impl.ey1
    public final d32 a(my myVar, ny nyVar, boolean z10) {
        f32 f32Var = (f32) myVar;
        g32 g32Var = (g32) nyVar;
        try {
            ByteBuffer byteBuffer = f32Var.f30572d;
            byteBuffer.getClass();
            g32Var.a(f32Var.f30574f, a(byteBuffer.array(), byteBuffer.limit(), z10), f32Var.f27193j);
            g32Var.c();
            return null;
        } catch (d32 e4) {
            return e4;
        }
    }
}
