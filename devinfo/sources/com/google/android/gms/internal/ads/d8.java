package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d8 implements j8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10350a;

    /* renamed from: b, reason: collision with root package name */
    public final hk0 f10351b;

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f10352c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10353d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10354e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10355f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public u2 f10356h;

    /* renamed from: i, reason: collision with root package name */
    public int f10357i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10358k;

    /* renamed from: l, reason: collision with root package name */
    public long f10359l;

    /* renamed from: m, reason: collision with root package name */
    public mx1 f10360m;

    /* renamed from: n, reason: collision with root package name */
    public int f10361n;

    /* renamed from: o, reason: collision with root package name */
    public long f10362o;

    public d8(String str, int i4, String str2, int i10) {
        this.f10350a = i10;
        switch (i10) {
            case 1:
                hk0 hk0Var = new hk0(new byte[16], 16);
                this.f10351b = hk0Var;
                this.f10352c = new sk0(hk0Var.f11893a);
                this.f10357i = 0;
                this.j = 0;
                this.f10358k = false;
                this.f10362o = -9223372036854775807L;
                this.f10353d = str;
                this.f10354e = i4;
                this.f10355f = str2;
                break;
            default:
                hk0 hk0Var2 = new hk0(new byte[128], 128);
                this.f10351b = hk0Var2;
                this.f10352c = new sk0(hk0Var2.f11893a);
                this.f10357i = 0;
                this.f10362o = -9223372036854775807L;
                this.f10353d = str;
                this.f10354e = i4;
                this.f10355f = str2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
        int i4 = this.f10350a;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        switch (this.f10350a) {
            case 0:
                this.f10357i = 0;
                this.j = 0;
                this.f10358k = false;
                this.f10362o = -9223372036854775807L;
                break;
            default:
                this.f10357i = 0;
                this.j = 0;
                this.f10358k = false;
                this.f10362o = -9223372036854775807L;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        switch (this.f10350a) {
            case 0:
                this.f10362o = j;
                break;
            default:
                this.f10362o = j;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d4  */
    @Override // com.google.android.gms.internal.ads.j8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.sk0 r25) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d8.d(com.google.android.gms.internal.ads.sk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        switch (this.f10350a) {
            case 0:
                h9Var.a();
                h9Var.b();
                this.g = h9Var.f11777e;
                h9Var.b();
                this.f10356h = z1Var.m(h9Var.f11776d, 1);
                break;
            default:
                h9Var.a();
                h9Var.b();
                this.g = h9Var.f11777e;
                h9Var.b();
                this.f10356h = z1Var.m(h9Var.f11776d, 1);
                break;
        }
    }

    private final void f(boolean z3) {
    }

    private final void g(boolean z3) {
    }
}
