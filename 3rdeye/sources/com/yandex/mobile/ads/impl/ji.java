package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class ji implements hi {

    /* renamed from: a, reason: collision with root package name */
    public final int f29148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29150c;

    private ji(int i, int i10, int i11) {
        this.f29148a = i;
        this.f29149b = i10;
        this.f29150c = i11;
    }

    public static ji a(uf1 uf1Var) {
        int iK = uf1Var.k();
        uf1Var.f(8);
        int iK2 = uf1Var.k();
        int iK3 = uf1Var.k();
        uf1Var.f(4);
        uf1Var.k();
        uf1Var.f(12);
        return new ji(iK, iK2, iK3);
    }

    @Override // com.yandex.mobile.ads.impl.hi
    public final int getType() {
        return 1751742049;
    }
}
