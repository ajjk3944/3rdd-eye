package h2;

import java.util.List;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f9814a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f9815b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9816c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9817d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9818e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9819f;

    /* renamed from: g, reason: collision with root package name */
    public final t2.c f9820g;

    /* renamed from: h, reason: collision with root package name */
    public final t2.i f9821h;

    /* renamed from: i, reason: collision with root package name */
    public final k2.g f9822i;
    public final long j;

    public f0(f fVar, j0 j0Var, List list, int i10, boolean z10, int i11, t2.c cVar, t2.i iVar, k2.g gVar, long j) {
        this.f9814a = fVar;
        this.f9815b = j0Var;
        this.f9816c = list;
        this.f9817d = i10;
        this.f9818e = z10;
        this.f9819f = i11;
        this.f9820g = cVar;
        this.f9821h = iVar;
        this.f9822i = gVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return br.l.a(this.f9814a, f0Var.f9814a) && br.l.a(this.f9815b, f0Var.f9815b) && this.f9816c.equals(f0Var.f9816c) && this.f9817d == f0Var.f9817d && this.f9818e == f0Var.f9818e && this.f9819f == f0Var.f9819f && br.l.a(this.f9820g, f0Var.f9820g) && this.f9821h == f0Var.f9821h && br.l.a(this.f9822i, f0Var.f9822i) && t2.a.b(this.j, f0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.f9822i.hashCode() + ((this.f9821h.hashCode() + ((this.f9820g.hashCode() + c7.a.C(this.f9819f, w.g.b((h0.b.c(c7.a.e(this.f9815b, this.f9814a.hashCode() * 31, 31), 31, this.f9816c) + this.f9817d) * 31, this.f9818e, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f9814a);
        sb2.append(", style=");
        sb2.append(this.f9815b);
        sb2.append(", placeholders=");
        sb2.append(this.f9816c);
        sb2.append(", maxLines=");
        sb2.append(this.f9817d);
        sb2.append(", softWrap=");
        sb2.append(this.f9818e);
        sb2.append(", overflow=");
        int i10 = this.f9819f;
        sb2.append((Object) (i10 == 1 ? "Clip" : i10 == 2 ? "Ellipsis" : i10 == 5 ? "MiddleEllipsis" : i10 == 3 ? "Visible" : i10 == 4 ? "StartEllipsis" : "Invalid"));
        sb2.append(", density=");
        sb2.append(this.f9820g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f9821h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f9822i);
        sb2.append(", constraints=");
        sb2.append((Object) t2.a.k(this.j));
        sb2.append(')');
        return sb2.toString();
    }
}
