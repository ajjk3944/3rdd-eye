package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class N3 implements I3 {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f9942l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final C1025d4 f9943a;

    /* renamed from: b, reason: collision with root package name */
    public final C2036vr f9944b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f9945c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final L3 f9946d;

    /* renamed from: e, reason: collision with root package name */
    public final W3 f9947e;

    /* renamed from: f, reason: collision with root package name */
    public M3 f9948f;

    /* renamed from: g, reason: collision with root package name */
    public long f9949g;

    /* renamed from: h, reason: collision with root package name */
    public String f9950h;
    public T0 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9951j;

    /* renamed from: k, reason: collision with root package name */
    public long f9952k;

    public N3(C1025d4 c1025d4) {
        this.f9943a = c1025d4;
        L3 l32 = new L3();
        l32.f9615e = new byte[128];
        this.f9946d = l32;
        this.f9952k = -9223372036854775807L;
        this.f9947e = new W3(178);
        this.f9944b = new C2036vr();
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        AbstractC2022vd.R(this.f9945c);
        L3 l32 = this.f9946d;
        l32.f9611a = false;
        l32.f9613c = 0;
        l32.f9612b = 0;
        M3 m32 = this.f9948f;
        if (m32 != null) {
            m32.f9802b = false;
            m32.f9803c = false;
            m32.f9804d = false;
            m32.f9805e = -1;
        }
        this.f9947e.a();
        this.f9949g = 0L;
        this.f9952k = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
        M3 m32 = this.f9948f;
        m32.getClass();
        if (z6) {
            m32.b(this.f9949g, 0, this.f9951j);
            M3 m33 = this.f9948f;
            m33.f9802b = false;
            m33.f9803c = false;
            m33.f9804d = false;
            m33.f9805e = -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        this.f9952k = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    @Override // com.google.android.gms.internal.ads.I3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.C2036vr r20) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.N3.d(com.google.android.gms.internal.ads.vr):void");
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        c1189g4.a();
        c1189g4.b();
        this.f9950h = c1189g4.f14198e;
        c1189g4.b();
        T0 t0X = interfaceC2100x0.x(c1189g4.f14197d, 2);
        this.i = t0X;
        this.f9948f = new M3(t0X);
        this.f9943a.a(interfaceC2100x0, c1189g4);
    }
}
