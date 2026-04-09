package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yz0;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class g12 extends hy1 {

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f27520a = new uf1();

    /* renamed from: b, reason: collision with root package name */
    private final tf1 f27521b = new tf1();

    /* renamed from: c, reason: collision with root package name */
    private c52 f27522c;

    @Override // com.yandex.mobile.ads.impl.hy1
    public final yz0 a(b01 b01Var, ByteBuffer byteBuffer) {
        c52 c52Var = this.f27522c;
        if (c52Var == null || b01Var.f25039j != c52Var.c()) {
            c52 c52Var2 = new c52(b01Var.f30574f);
            this.f27522c = c52Var2;
            c52Var2.a(b01Var.f30574f - b01Var.f25039j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f27520a.a(iLimit, bArrArray);
        this.f27521b.a(iLimit, bArrArray);
        this.f27521b.d(39);
        long jB = (this.f27521b.b(1) << 32) | this.f27521b.b(32);
        this.f27521b.d(20);
        int iB = this.f27521b.b(12);
        int iB2 = this.f27521b.b(8);
        this.f27520a.f(14);
        yz0.b bVarA = iB2 != 0 ? iB2 != 255 ? iB2 != 4 ? iB2 != 5 ? iB2 != 6 ? null : t42.a(this.f27520a, jB, this.f27522c) : h12.a(this.f27520a, jB, this.f27522c) : j12.a(this.f27520a) : al1.a(this.f27520a, iB, jB) : new i12();
        return bVarA == null ? new yz0(new yz0.b[0]) : new yz0(bVarA);
    }
}
