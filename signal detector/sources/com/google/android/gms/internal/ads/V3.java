package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class V3 implements I3 {

    /* renamed from: e, reason: collision with root package name */
    public String f11935e;

    /* renamed from: f, reason: collision with root package name */
    public T0 f11936f;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public int f11940k;

    /* renamed from: l, reason: collision with root package name */
    public int f11941l;

    /* renamed from: n, reason: collision with root package name */
    public int f11943n;

    /* renamed from: o, reason: collision with root package name */
    public int f11944o;

    /* renamed from: s, reason: collision with root package name */
    public int f11948s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11950u;

    /* renamed from: d, reason: collision with root package name */
    public int f11934d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f11931a = new C2036vr(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final C1443kr f11932b = new C1443kr();

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f11933c = new C2036vr();

    /* renamed from: p, reason: collision with root package name */
    public final C1077e2 f11945p = new C1077e2();

    /* renamed from: q, reason: collision with root package name */
    public int f11946q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f11947r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f11949t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11939j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11942m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f11937g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f11938h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        this.f11934d = 0;
        this.f11941l = 0;
        this.f11931a.y(2);
        this.f11943n = 0;
        this.f11944o = 0;
        this.f11946q = -2147483647;
        this.f11947r = -1;
        this.f11948s = 0;
        this.f11949t = -1L;
        this.f11950u = false;
        this.i = false;
        this.f11942m = true;
        this.f11939j = true;
        this.f11937g = -9.223372036854776E18d;
        this.f11938h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        this.f11940k = i;
        if (!this.f11939j && (this.f11944o != 0 || !this.f11942m)) {
            this.i = true;
        }
        if (j6 != -9223372036854775807L) {
            double d6 = j6;
            if (this.i) {
                this.f11938h = d6;
            } else {
                this.f11937g = d6;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04be A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.I3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.C2036vr r28) throws com.google.android.gms.internal.ads.P4 {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V3.d(com.google.android.gms.internal.ads.vr):void");
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        c1189g4.a();
        c1189g4.b();
        this.f11935e = c1189g4.f14198e;
        c1189g4.b();
        this.f11936f = interfaceC2100x0.x(c1189g4.f14197d, 1);
    }
}
