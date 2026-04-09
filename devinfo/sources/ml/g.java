package ml;

import java.util.List;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements kl.d {

    /* renamed from: a, reason: collision with root package name */
    public final kl.d f29411a;

    /* renamed from: b, reason: collision with root package name */
    public final kl.d f29412b;

    public g(kl.d dVar, kl.d dVar2) {
        nk.k.e(dVar, "keyDesc");
        nk.k.e(dVar2, "valueDesc");
        this.f29411a = dVar;
        this.f29412b = dVar2;
    }

    @Override // kl.d
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // kl.d
    public final boolean c() {
        return false;
    }

    @Override // kl.d
    public final int d(String str) {
        nk.k.e(str, "name");
        Integer numX0 = vk.p.x0(str);
        if (numX0 != null) {
            return numX0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // kl.d
    public final ii.a e() {
        return kl.f.f28380e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return nk.k.a(this.f29411a, gVar.f29411a) && nk.k.a(this.f29412b, gVar.f29412b);
    }

    @Override // kl.d
    public final int f() {
        return 2;
    }

    @Override // kl.d
    public final String g(int i4) {
        return String.valueOf(i4);
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
        return this.f29412b.hashCode() + ((this.f29411a.hashCode() + 710441009) * 31);
    }

    @Override // kl.d
    public final List i(int i4) {
        if (i4 >= 0) {
            return s.f38317a;
        }
        throw new IllegalArgumentException(r5.c.h(i4, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kl.d
    public final kl.d j(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(r5.c.h(i4, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i10 = i4 % 2;
        if (i10 == 0) {
            return this.f29411a;
        }
        if (i10 == 1) {
            return this.f29412b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kl.d
    public final boolean k(int i4) {
        if (i4 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(r5.c.h(i4, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f29411a + ", " + this.f29412b + ')';
    }
}
