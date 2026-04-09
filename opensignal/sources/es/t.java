package es;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final qs.g f8332a;

    /* renamed from: b, reason: collision with root package name */
    public final xr.o f8333b;

    public t(qs.g gVar, xr.o oVar) {
        br.l.e(gVar, "name");
        this.f8332a = gVar;
        this.f8333b = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return br.l.a(this.f8332a, ((t) obj).f8332a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8332a.hashCode();
    }
}
