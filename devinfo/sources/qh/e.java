package qh;

import androidx.lifecycle.e1;
import androidx.lifecycle.h1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32390b;

    /* renamed from: c, reason: collision with root package name */
    public final zh.b f32391c;

    public e(boolean z3, int i4, zh.b bVar) {
        this.f32389a = z3;
        this.f32390b = i4;
        this.f32391c = bVar;
    }

    @Override // androidx.lifecycle.h1
    public final e1 a(Class cls) {
        return new f(this.f32389a, this.f32390b, this.f32391c);
    }

    @Override // androidx.lifecycle.h1
    public final e1 b(Class cls, h5.c cVar) {
        return a(cls);
    }

    @Override // androidx.lifecycle.h1
    public final /* bridge */ e1 c(nk.e eVar, h5.c cVar) {
        return a0.g.a(this, eVar, cVar);
    }
}
