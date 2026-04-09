package Q4;

import Q4.g0;

/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes2.dex */
public final class b0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f11161a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f11162b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f11163c;

    public b0(c0 c0Var, e0 e0Var, d0 d0Var) {
        this.f11161a = c0Var;
        this.f11162b = e0Var;
        this.f11163c = d0Var;
    }

    @Override // Q4.g0
    public final g0.a a() {
        return this.f11161a;
    }

    @Override // Q4.g0
    public final g0.b b() {
        return this.f11163c;
    }

    @Override // Q4.g0
    public final g0.c c() {
        return this.f11162b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f11161a.equals(g0Var.a()) && this.f11162b.equals(g0Var.c()) && this.f11163c.equals(g0Var.b());
    }

    public final int hashCode() {
        return ((((this.f11161a.hashCode() ^ 1000003) * 1000003) ^ this.f11162b.hashCode()) * 1000003) ^ this.f11163c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f11161a + ", osData=" + this.f11162b + ", deviceData=" + this.f11163c + "}";
    }
}
