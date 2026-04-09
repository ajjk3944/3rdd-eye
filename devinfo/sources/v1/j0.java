package v1;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f35711a;

    /* renamed from: b, reason: collision with root package name */
    public final List f35712b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35713c;

    /* renamed from: d, reason: collision with root package name */
    public final p1.z f35714d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35715e;

    /* renamed from: f, reason: collision with root package name */
    public final p1.z f35716f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35717h;

    /* renamed from: i, reason: collision with root package name */
    public final int f35718i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final float f35719k;

    /* renamed from: l, reason: collision with root package name */
    public final float f35720l;

    /* renamed from: m, reason: collision with root package name */
    public final float f35721m;

    /* renamed from: n, reason: collision with root package name */
    public final float f35722n;

    public j0(String str, List list, int i4, p1.z zVar, float f10, p1.z zVar2, float f11, float f12, int i10, int i11, float f13, float f14, float f15, float f16) {
        this.f35711a = str;
        this.f35712b = list;
        this.f35713c = i4;
        this.f35714d = zVar;
        this.f35715e = f10;
        this.f35716f = zVar2;
        this.g = f11;
        this.f35717h = f12;
        this.f35718i = i10;
        this.j = i11;
        this.f35719k = f13;
        this.f35720l = f14;
        this.f35721m = f15;
        this.f35722n = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            return nk.k.a(this.f35711a, j0Var.f35711a) && nk.k.a(this.f35714d, j0Var.f35714d) && this.f35715e == j0Var.f35715e && nk.k.a(this.f35716f, j0Var.f35716f) && this.g == j0Var.g && this.f35717h == j0Var.f35717h && this.f35718i == j0Var.f35718i && this.j == j0Var.j && this.f35719k == j0Var.f35719k && this.f35720l == j0Var.f35720l && this.f35721m == j0Var.f35721m && this.f35722n == j0Var.f35722n && this.f35713c == j0Var.f35713c && nk.k.a(this.f35712b, j0Var.f35712b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f35712b.hashCode() + (this.f35711a.hashCode() * 31)) * 31;
        p1.z zVar = this.f35714d;
        int iD = r5.c.d(this.f35715e, (iHashCode + (zVar != null ? zVar.hashCode() : 0)) * 31, 31);
        p1.z zVar2 = this.f35716f;
        return r5.c.d(this.f35722n, r5.c.d(this.f35721m, r5.c.d(this.f35720l, r5.c.d(this.f35719k, (((r5.c.d(this.f35717h, r5.c.d(this.g, (iD + (zVar2 != null ? zVar2.hashCode() : 0)) * 31, 31), 31) + this.f35718i) * 31) + this.j) * 31, 31), 31), 31), 31) + this.f35713c;
    }
}
