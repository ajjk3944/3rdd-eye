package ku;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class x0 implements iu.e, j {

    /* renamed from: a, reason: collision with root package name */
    public final iu.e f14636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14637b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f14638c;

    public x0(iu.e eVar) {
        br.l.e(eVar, "original");
        this.f14636a = eVar;
        this.f14637b = eVar.h() + '?';
        this.f14638c = p0.b(eVar);
    }

    @Override // ku.j
    public final Set a() {
        return this.f14638c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            return br.l.a(this.f14636a, ((x0) obj).f14636a);
        }
        return false;
    }

    @Override // iu.e
    public final i3.g f() {
        return this.f14636a.f();
    }

    @Override // iu.e
    public final boolean g() {
        return this.f14636a.g();
    }

    @Override // iu.e
    public final List getAnnotations() {
        return this.f14636a.getAnnotations();
    }

    @Override // iu.e
    public final String h() {
        return this.f14637b;
    }

    public final int hashCode() {
        return this.f14636a.hashCode() * 31;
    }

    @Override // iu.e
    public final boolean i() {
        return true;
    }

    @Override // iu.e
    public final int j(String str) {
        br.l.e(str, "name");
        return this.f14636a.j(str);
    }

    @Override // iu.e
    public final int k() {
        return this.f14636a.k();
    }

    @Override // iu.e
    public final String l(int i10) {
        return this.f14636a.l(i10);
    }

    @Override // iu.e
    public final List m(int i10) {
        return this.f14636a.m(i10);
    }

    @Override // iu.e
    public final iu.e n(int i10) {
        return this.f14636a.n(i10);
    }

    @Override // iu.e
    public final boolean o(int i10) {
        return this.f14636a.o(i10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14636a);
        sb2.append('?');
        return sb2.toString();
    }
}
