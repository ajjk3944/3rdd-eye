package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class g32 extends ny implements b32 {

    /* renamed from: d, reason: collision with root package name */
    private b32 f27534d;

    /* renamed from: e, reason: collision with root package name */
    private long f27535e;

    @Override // com.yandex.mobile.ads.impl.b32
    public final long a(int i) {
        b32 b32Var = this.f27534d;
        b32Var.getClass();
        return b32Var.a(i) + this.f27535e;
    }

    @Override // com.yandex.mobile.ads.impl.am
    public final void b() {
        super.b();
        this.f27534d = null;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final List<av> b(long j4) {
        b32 b32Var = this.f27534d;
        b32Var.getClass();
        return b32Var.b(j4 - this.f27535e);
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a() {
        b32 b32Var = this.f27534d;
        b32Var.getClass();
        return b32Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a(long j4) {
        b32 b32Var = this.f27534d;
        b32Var.getClass();
        return b32Var.a(j4 - this.f27535e);
    }

    public final void a(long j4, b32 b32Var, long j10) {
        this.f31055c = j4;
        this.f27534d = b32Var;
        if (j10 != Long.MAX_VALUE) {
            j4 = j10;
        }
        this.f27535e = j4;
    }
}
