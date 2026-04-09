package s2;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f33356a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f33357b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33358c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33359d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33360e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33361f;
    public final d3.c g;

    /* renamed from: h, reason: collision with root package name */
    public final d3.l f33362h;

    /* renamed from: i, reason: collision with root package name */
    public final v2.d f33363i;
    public final long j;

    public d0(e eVar, h0 h0Var, List list, int i4, boolean z3, int i10, d3.c cVar, d3.l lVar, v2.d dVar, long j) {
        this.f33356a = eVar;
        this.f33357b = h0Var;
        this.f33358c = list;
        this.f33359d = i4;
        this.f33360e = z3;
        this.f33361f = i10;
        this.g = cVar;
        this.f33362h = lVar;
        this.f33363i = dVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return nk.k.a(this.f33356a, d0Var.f33356a) && nk.k.a(this.f33357b, d0Var.f33357b) && this.f33358c.equals(d0Var.f33358c) && this.f33359d == d0Var.f33359d && this.f33360e == d0Var.f33360e && this.f33361f == d0Var.f33361f && nk.k.a(this.g, d0Var.g) && this.f33362h == d0Var.f33362h && nk.k.a(this.f33363i, d0Var.f33363i) && d3.a.b(this.j, d0Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f33363i.hashCode() + ((this.f33362h.hashCode() + ((this.g.hashCode() + ((((((((this.f33358c.hashCode() + je.u.n(this.f33357b, this.f33356a.hashCode() * 31, 31)) * 31) + this.f33359d) * 31) + (this.f33360e ? 1231 : 1237)) * 31) + this.f33361f) * 31)) * 31)) * 31)) * 31;
        long j = this.j;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f33356a);
        sb2.append(", style=");
        sb2.append(this.f33357b);
        sb2.append(", placeholders=");
        sb2.append(this.f33358c);
        sb2.append(", maxLines=");
        sb2.append(this.f33359d);
        sb2.append(", softWrap=");
        sb2.append(this.f33360e);
        sb2.append(", overflow=");
        int i4 = this.f33361f;
        sb2.append((Object) (i4 == 1 ? "Clip" : i4 == 2 ? "Ellipsis" : i4 == 5 ? "MiddleEllipsis" : i4 == 3 ? "Visible" : i4 == 4 ? "StartEllipsis" : "Invalid"));
        sb2.append(", density=");
        sb2.append(this.g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f33362h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f33363i);
        sb2.append(", constraints=");
        sb2.append((Object) d3.a.k(this.j));
        sb2.append(')');
        return sb2.toString();
    }
}
