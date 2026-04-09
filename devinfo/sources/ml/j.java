package ml;

import com.google.android.gms.internal.ads.be1;
import d0.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements il.a {

    /* renamed from: a, reason: collision with root package name */
    public final il.a f29417a;

    /* renamed from: b, reason: collision with root package name */
    public final o f29418b;

    public j(il.a aVar) {
        nk.k.e(aVar, "serializer");
        this.f29417a = aVar;
        this.f29418b = new o(aVar.d());
    }

    @Override // il.a
    public final Object a(be1 be1Var) {
        nk.k.e(be1Var, "decoder");
        if (be1Var.k()) {
            return be1Var.n(this.f29417a);
        }
        return null;
    }

    @Override // il.a
    public final void b(z0 z0Var, Object obj) {
        if (obj != null) {
            z0Var.l(this.f29417a, obj);
        } else {
            z0Var.i();
        }
    }

    @Override // il.a
    public final kl.d d() {
        return this.f29418b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j.class == obj.getClass() && nk.k.a(this.f29417a, ((j) obj).f29417a);
    }

    public final int hashCode() {
        return this.f29417a.hashCode();
    }
}
