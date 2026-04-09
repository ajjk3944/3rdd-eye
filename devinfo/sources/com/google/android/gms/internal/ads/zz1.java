package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zz1 extends b02 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f19240e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19241f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19242h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19243i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f19244k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19245l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19246m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f19247n;

    public zz1(int i4, ii iiVar, int i10, wz1 wz1Var, int i11, String str, String str2) {
        int iF;
        super(i4, iiVar, i10);
        int i12 = 0;
        this.f19241f = d7.B(i11, false);
        int i13 = this.f9532d.f14046e;
        wz1Var.getClass();
        x41 x41Var = wz1Var.f11234r;
        this.g = 1 == (i13 & 1);
        this.f19242h = (i13 & 2) != 0;
        x41 x41VarL = str2 != null ? x41.l(str2) : x41Var.isEmpty() ? x41.l("") : x41Var;
        int i14 = 0;
        while (true) {
            if (i14 >= x41VarL.size()) {
                iF = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iF = b.f(this.f9532d, (String) x41VarL.get(i14), false);
                if (iF > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f19243i = i14;
        this.j = iF;
        int i15 = str2 != null ? 1088 : 0;
        int i16 = this.f9532d.f14047f;
        int iBitCount = (i16 == 0 || i16 != i15) ? Integer.bitCount(i15 & i16) : Integer.MAX_VALUE;
        this.f19244k = iBitCount;
        mx1 mx1Var = this.f9532d;
        this.f19247n = (1088 & mx1Var.f14047f) != 0;
        int iG = b.g(mx1Var, wz1Var.f11235s);
        this.f19245l = iG;
        int iF2 = b.f(this.f9532d, str, b.e(str) == null);
        this.f19246m = iF2;
        boolean z3 = iF > 0 || (x41Var.isEmpty() && iBitCount > 0) || ((x41Var.isEmpty() && iG != Integer.MAX_VALUE) || this.g || (this.f19242h && iF2 > 0));
        if (d7.B(i11, wz1Var.B) && z3) {
            i12 = 1;
        }
        this.f19240e = i12;
    }

    @Override // com.google.android.gms.internal.ads.b02
    public final int a() {
        return this.f19240e;
    }

    @Override // com.google.android.gms.internal.ads.b02
    public final /* bridge */ /* synthetic */ boolean b(b02 b02Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zz1 zz1Var) {
        q41 q41VarD = q41.f15203a.d(this.f19241f, zz1Var.f19241f);
        Integer numValueOf = Integer.valueOf(this.f19243i);
        Integer numValueOf2 = Integer.valueOf(zz1Var.f19243i);
        r51 r51Var = r51.f15551b;
        r51 r51Var2 = r51.f15552c;
        q41 q41VarA = q41VarD.a(numValueOf, numValueOf2, r51Var2);
        int i4 = zz1Var.j;
        int i10 = this.j;
        q41 q41VarB = q41VarA.b(i10, i4);
        int i11 = zz1Var.f19244k;
        int i12 = this.f19244k;
        q41 q41VarD2 = q41VarB.b(i12, i11).a(Integer.valueOf(this.f19245l), Integer.valueOf(zz1Var.f19245l), r51Var2).d(this.g, zz1Var.g);
        Boolean boolValueOf = Boolean.valueOf(this.f19242h);
        Boolean boolValueOf2 = Boolean.valueOf(zz1Var.f19242h);
        if (i10 != 0) {
            r51Var = r51Var2;
        }
        q41 q41VarB2 = q41VarD2.a(boolValueOf, boolValueOf2, r51Var).b(this.f19246m, zz1Var.f19246m);
        if (i12 == 0) {
            q41VarB2 = q41VarB2.c(this.f19247n, zz1Var.f19247n);
        }
        return q41VarB2.e();
    }
}
