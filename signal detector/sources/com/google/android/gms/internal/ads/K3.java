package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class K3 implements I3 {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f9423r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f9424a;

    /* renamed from: b, reason: collision with root package name */
    public T0 f9425b;

    /* renamed from: c, reason: collision with root package name */
    public final C1025d4 f9426c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9427d;

    /* renamed from: e, reason: collision with root package name */
    public final C2036vr f9428e;

    /* renamed from: f, reason: collision with root package name */
    public final W3 f9429f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f9430g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final J3 f9431h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9432j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9433k;

    /* renamed from: l, reason: collision with root package name */
    public long f9434l;

    /* renamed from: m, reason: collision with root package name */
    public long f9435m;

    /* renamed from: n, reason: collision with root package name */
    public long f9436n;

    /* renamed from: o, reason: collision with root package name */
    public long f9437o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9438p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9439q;

    public K3(C1025d4 c1025d4, String str) {
        C2036vr c2036vr;
        this.f9426c = c1025d4;
        this.f9427d = str;
        J3 j32 = new J3();
        j32.f9221d = new byte[128];
        this.f9431h = j32;
        if (c1025d4 != null) {
            this.f9429f = new W3(178);
            c2036vr = new C2036vr();
        } else {
            c2036vr = null;
            this.f9429f = null;
        }
        this.f9428e = c2036vr;
        this.f9435m = -9223372036854775807L;
        this.f9437o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        AbstractC2022vd.R(this.f9430g);
        J3 j32 = this.f9431h;
        j32.f9218a = false;
        j32.f9219b = 0;
        j32.f9220c = 0;
        W3 w32 = this.f9429f;
        if (w32 != null) {
            w32.a();
        }
        this.i = 0L;
        this.f9432j = false;
        this.f9435m = -9223372036854775807L;
        this.f9437o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
        T0 t02 = this.f9425b;
        t02.getClass();
        if (z6) {
            boolean z7 = this.f9438p;
            long j6 = this.i - this.f9436n;
            t02.c(this.f9437o, z7 ? 1 : 0, (int) j6, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        this.f9435m = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fc  */
    @Override // com.google.android.gms.internal.ads.I3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.C2036vr r23) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.K3.d(com.google.android.gms.internal.ads.vr):void");
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        c1189g4.a();
        c1189g4.b();
        this.f9424a = c1189g4.f14198e;
        c1189g4.b();
        this.f9425b = interfaceC2100x0.x(c1189g4.f14197d, 2);
        C1025d4 c1025d4 = this.f9426c;
        if (c1025d4 != null) {
            c1025d4.a(interfaceC2100x0, c1189g4);
        }
    }
}
