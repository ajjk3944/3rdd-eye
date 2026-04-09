package ml;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o implements kl.d, b {

    /* renamed from: a, reason: collision with root package name */
    public final kl.d f29433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29434b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f29435c;

    public o(kl.d dVar) {
        Set setB;
        nk.k.e(dVar, "original");
        this.f29433a = dVar;
        this.f29434b = dVar.a() + '?';
        nk.k.e(dVar, "<this>");
        if (dVar instanceof b) {
            setB = ((b) dVar).b();
        } else {
            HashSet hashSet = new HashSet(dVar.f());
            int iF = dVar.f();
            for (int i4 = 0; i4 < iF; i4++) {
                hashSet.add(dVar.g(i4));
            }
            setB = hashSet;
        }
        this.f29435c = setB;
    }

    @Override // kl.d
    public final String a() {
        return this.f29434b;
    }

    @Override // ml.b
    public final Set b() {
        return this.f29435c;
    }

    @Override // kl.d
    public final boolean c() {
        return true;
    }

    @Override // kl.d
    public final int d(String str) {
        nk.k.e(str, "name");
        return this.f29433a.d(str);
    }

    @Override // kl.d
    public final ii.a e() {
        return this.f29433a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return nk.k.a(this.f29433a, ((o) obj).f29433a);
        }
        return false;
    }

    @Override // kl.d
    public final int f() {
        return this.f29433a.f();
    }

    @Override // kl.d
    public final String g(int i4) {
        return this.f29433a.g(i4);
    }

    @Override // kl.d
    public final List getAnnotations() {
        return this.f29433a.getAnnotations();
    }

    @Override // kl.d
    public final boolean h() {
        return this.f29433a.h();
    }

    public final int hashCode() {
        return this.f29433a.hashCode() * 31;
    }

    @Override // kl.d
    public final List i(int i4) {
        return this.f29433a.i(i4);
    }

    @Override // kl.d
    public final kl.d j(int i4) {
        return this.f29433a.j(i4);
    }

    @Override // kl.d
    public final boolean k(int i4) {
        return this.f29433a.k(i4);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29433a);
        sb2.append('?');
        return sb2.toString();
    }
}
