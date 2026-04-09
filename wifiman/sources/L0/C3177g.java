package L0;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: L0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3177g {

    /* renamed from: a, reason: collision with root package name */
    private final L f11143a;

    public C3177g(L l10) {
        this.f11143a = l10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3177g)) {
            return false;
        }
        L l10 = this.f11143a;
        C3177g c3177g = (C3177g) obj;
        return AbstractC6492s.d(l10.j(), c3177g.f11143a.j()) && l10.i().G(c3177g.f11143a.i()) && AbstractC6492s.d(l10.g(), c3177g.f11143a.g()) && l10.e() == c3177g.f11143a.e() && l10.h() == c3177g.f11143a.h() && W0.t.e(l10.f(), c3177g.f11143a.f()) && AbstractC6492s.d(l10.b(), c3177g.f11143a.b()) && l10.d() == c3177g.f11143a.d() && l10.c() == c3177g.f11143a.c() && Y0.b.l(l10.a()) == Y0.b.l(c3177g.f11143a.a()) && Y0.b.k(l10.a()) == Y0.b.k(c3177g.f11143a.a());
    }

    public int hashCode() {
        L l10 = this.f11143a;
        return (((((((((((((((((((l10.j().hashCode() * 31) + l10.i().H()) * 31) + l10.g().hashCode()) * 31) + l10.e()) * 31) + Boolean.hashCode(l10.h())) * 31) + W0.t.f(l10.f())) * 31) + l10.b().hashCode()) * 31) + l10.d().hashCode()) * 31) + l10.c().hashCode()) * 31) + Integer.hashCode(Y0.b.l(l10.a()))) * 31) + Integer.hashCode(Y0.b.k(l10.a()));
    }
}
