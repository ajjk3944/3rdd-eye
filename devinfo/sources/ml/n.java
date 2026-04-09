package ml;

import java.util.List;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements kl.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f29431a;

    /* renamed from: b, reason: collision with root package name */
    public final kl.c f29432b;

    public n(String str, kl.c cVar) {
        nk.k.e(cVar, "kind");
        this.f29431a = str;
        this.f29432b = cVar;
    }

    @Override // kl.d
    public final String a() {
        return this.f29431a;
    }

    @Override // kl.d
    public final boolean c() {
        return false;
    }

    @Override // kl.d
    public final int d(String str) {
        nk.k.e(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kl.d
    public final ii.a e() {
        return this.f29432b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nk.k.a(this.f29431a, nVar.f29431a) && nk.k.a(this.f29432b, nVar.f29432b);
    }

    @Override // kl.d
    public final int f() {
        return 0;
    }

    @Override // kl.d
    public final String g(int i4) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kl.d
    public final List getAnnotations() {
        return s.f38317a;
    }

    @Override // kl.d
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return (this.f29432b.hashCode() * 31) + this.f29431a.hashCode();
    }

    @Override // kl.d
    public final List i(int i4) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kl.d
    public final kl.d j(int i4) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kl.d
    public final boolean k(int i4) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("PrimitiveDescriptor("), this.f29431a, ')');
    }
}
