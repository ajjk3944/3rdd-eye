package gg;

import a6.e;
import d.h;
import java.util.List;
import je.u;
import nk.k;
import yj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24701a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24702b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24703c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24704d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24705e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24706f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24707h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24708i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f24709k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f24710l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f24711m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f24712n;

    /* renamed from: o, reason: collision with root package name */
    public final List f24713o;

    /* renamed from: p, reason: collision with root package name */
    public final long f24714p;

    /* renamed from: q, reason: collision with root package name */
    public final long f24715q;

    /* renamed from: r, reason: collision with root package name */
    public final n f24716r = a.a.u(new e(12, this));

    public a(String str, String str2, boolean z3, long j, String str3, String str4, String str5, int i4, int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List list, long j8, long j9) {
        this.f24701a = str;
        this.f24702b = str2;
        this.f24703c = z3;
        this.f24704d = j;
        this.f24705e = str3;
        this.f24706f = str4;
        this.g = str5;
        this.f24707h = i4;
        this.f24708i = i10;
        this.j = z10;
        this.f24709k = z11;
        this.f24710l = z12;
        this.f24711m = z13;
        this.f24712n = z14;
        this.f24713o = list;
        this.f24714p = j8;
        this.f24715q = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f24701a, aVar.f24701a) && k.a(this.f24702b, aVar.f24702b) && this.f24703c == aVar.f24703c && this.f24704d == aVar.f24704d && k.a(this.f24705e, aVar.f24705e) && k.a(this.f24706f, aVar.f24706f) && k.a(this.g, aVar.g) && this.f24707h == aVar.f24707h && this.f24708i == aVar.f24708i && this.j == aVar.j && this.f24709k == aVar.f24709k && this.f24710l == aVar.f24710l && this.f24711m == aVar.f24711m && this.f24712n == aVar.f24712n && k.a(this.f24713o, aVar.f24713o) && this.f24714p == aVar.f24714p && this.f24715q == aVar.f24715q;
    }

    public final int hashCode() {
        int iM = u.m(this.f24701a.hashCode() * 31, 31, this.f24702b);
        int i4 = this.f24703c ? 1231 : 1237;
        long j = this.f24704d;
        int iHashCode = (this.f24713o.hashCode() + ((((((((((((((u.m(u.m(u.m((((iM + i4) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f24705e), 31, this.f24706f), 31, this.g) + this.f24707h) * 31) + this.f24708i) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.f24709k ? 1231 : 1237)) * 31) + (this.f24710l ? 1231 : 1237)) * 31) + (this.f24711m ? 1231 : 1237)) * 31) + (this.f24712n ? 1231 : 1237)) * 31)) * 31;
        long j8 = this.f24714p;
        int i10 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f24715q;
        return i10 + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return h.t("name[", this.f24701a, "]");
    }
}
