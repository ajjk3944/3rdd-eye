package ph;

import androidx.lifecycle.e1;
import androidx.lifecycle.h1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f31996a;

    public g(int i4) {
        this.f31996a = i4;
    }

    @Override // androidx.lifecycle.h1
    public final e1 a(Class cls) {
        if (cls.isAssignableFrom(f.class)) {
            return new f(this.f31996a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: ".concat(cls.getName()));
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
