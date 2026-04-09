package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class C3 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7502a;

    /* renamed from: b, reason: collision with root package name */
    public final C1443kr f7503b;

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f7504c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7505d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7506e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7507f;

    /* renamed from: g, reason: collision with root package name */
    public String f7508g;

    /* renamed from: h, reason: collision with root package name */
    public T0 f7509h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f7510j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7511k;

    /* renamed from: l, reason: collision with root package name */
    public long f7512l;

    /* renamed from: m, reason: collision with root package name */
    public TP f7513m;

    /* renamed from: n, reason: collision with root package name */
    public int f7514n;

    /* renamed from: o, reason: collision with root package name */
    public long f7515o;

    public C3(String str, int i, String str2, int i3) {
        this.f7502a = i3;
        switch (i3) {
            case 1:
                C1443kr c1443kr = new C1443kr(new byte[16], 16);
                this.f7503b = c1443kr;
                this.f7504c = new C2036vr(c1443kr.f15294a);
                this.i = 0;
                this.f7510j = 0;
                this.f7511k = false;
                this.f7515o = -9223372036854775807L;
                this.f7505d = str;
                this.f7506e = i;
                this.f7507f = str2;
                break;
            default:
                C1443kr c1443kr2 = new C1443kr(new byte[128], 128);
                this.f7503b = c1443kr2;
                this.f7504c = new C2036vr(c1443kr2.f15294a);
                this.i = 0;
                this.f7515o = -9223372036854775807L;
                this.f7505d = str;
                this.f7506e = i;
                this.f7507f = str2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        switch (this.f7502a) {
            case 0:
                this.i = 0;
                this.f7510j = 0;
                this.f7511k = false;
                this.f7515o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.f7510j = 0;
                this.f7511k = false;
                this.f7515o = -9223372036854775807L;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
        int i = this.f7502a;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        switch (this.f7502a) {
            case 0:
                this.f7515o = j6;
                break;
            default:
                this.f7515o = j6;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d4  */
    @Override // com.google.android.gms.internal.ads.I3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.C2036vr r25) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3.d(com.google.android.gms.internal.ads.vr):void");
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        switch (this.f7502a) {
            case 0:
                c1189g4.a();
                c1189g4.b();
                this.f7508g = c1189g4.f14198e;
                c1189g4.b();
                this.f7509h = interfaceC2100x0.x(c1189g4.f14197d, 1);
                break;
            default:
                c1189g4.a();
                c1189g4.b();
                this.f7508g = c1189g4.f14198e;
                c1189g4.b();
                this.f7509h = interfaceC2100x0.x(c1189g4.f14197d, 1);
                break;
        }
    }

    private final void f(boolean z6) {
    }

    private final void g(boolean z6) {
    }
}
