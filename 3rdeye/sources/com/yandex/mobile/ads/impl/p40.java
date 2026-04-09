package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class p40 extends jy1 {

    /* renamed from: m, reason: collision with root package name */
    private final q40 f31585m;

    public p40(List<byte[]> list) {
        uf1 uf1Var = new uf1(list.get(0));
        this.f31585m = new q40(uf1Var.z(), uf1Var.z());
    }

    @Override // com.yandex.mobile.ads.impl.jy1
    public final b32 a(byte[] bArr, int i, boolean z10) {
        if (z10) {
            this.f31585m.d();
        }
        return new r40(this.f31585m.a(i, bArr));
    }
}
