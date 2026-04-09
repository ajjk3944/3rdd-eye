package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n52;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class m40 implements n52 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f30199a = new byte[4096];

    @Override // com.yandex.mobile.ads.impl.n52
    public final /* synthetic */ void a(int i, uf1 uf1Var) {
        U2.a(this, i, uf1Var);
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final /* synthetic */ int b(lv lvVar, int i, boolean z10) {
        return U2.b(this, lvVar, i, z10);
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final void a(long j4, int i, int i10, int i11, n52.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final void b(int i, uf1 uf1Var) {
        uf1Var.f(i);
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final void a(dc0 dc0Var) {
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final int a(lv lvVar, int i, boolean z10) throws IOException {
        int i10 = lvVar.read(this.f30199a, 0, Math.min(this.f30199a.length, i));
        if (i10 != -1) {
            return i10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
