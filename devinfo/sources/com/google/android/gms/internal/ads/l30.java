package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l30 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13352b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13353c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13354d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13355e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13356f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13357h;

    /* renamed from: i, reason: collision with root package name */
    public final p20 f13358i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f13359k;

    /* renamed from: l, reason: collision with root package name */
    public int f13360l;

    /* renamed from: m, reason: collision with root package name */
    public int f13361m;

    /* renamed from: n, reason: collision with root package name */
    public int f13362n;

    /* renamed from: o, reason: collision with root package name */
    public int f13363o;

    /* renamed from: p, reason: collision with root package name */
    public int f13364p;

    /* renamed from: q, reason: collision with root package name */
    public double f13365q;

    public l30(int i4, int i10, float f10, float f11, int i11, boolean z3) {
        this.f13351a = i4;
        this.f13352b = i10;
        this.f13353c = f10;
        this.f13354d = f11;
        this.f13355e = i4 / i11;
        this.f13356f = i4 / 400;
        int i12 = i4 / 65;
        this.g = i12;
        this.f13357h = i12 + i12;
        this.f13358i = z3 ? new g20(this) : new y20(this);
    }

    public final void a(int i4, int i10) {
        p20 p20Var = this.f13358i;
        p20Var.J1(i10);
        Object objL1 = p20Var.L1();
        Object objE1 = p20Var.E1();
        int i11 = this.f13359k;
        int i12 = this.f13352b;
        System.arraycopy(objL1, i4 * i12, objE1, i11 * i12, i10 * i12);
        this.f13359k += i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l30.b():void");
    }
}
