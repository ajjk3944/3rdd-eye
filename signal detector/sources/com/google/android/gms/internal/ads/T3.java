package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class T3 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f11328a;

    /* renamed from: b, reason: collision with root package name */
    public final J0 f11329b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11330c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11331d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11332e;

    /* renamed from: f, reason: collision with root package name */
    public T0 f11333f;

    /* renamed from: g, reason: collision with root package name */
    public String f11334g;

    /* renamed from: h, reason: collision with root package name */
    public int f11335h = 0;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11336j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11337k;

    /* renamed from: l, reason: collision with root package name */
    public long f11338l;

    /* renamed from: m, reason: collision with root package name */
    public int f11339m;

    /* renamed from: n, reason: collision with root package name */
    public long f11340n;

    public T3(String str, int i, String str2) {
        C2036vr c2036vr = new C2036vr(4);
        this.f11328a = c2036vr;
        c2036vr.f17354a[0] = -1;
        this.f11329b = new J0();
        this.f11340n = -9223372036854775807L;
        this.f11330c = str;
        this.f11331d = i;
        this.f11332e = str2;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        this.f11335h = 0;
        this.i = 0;
        this.f11337k = false;
        this.f11340n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        this.f11340n = j6;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void d(C2036vr c2036vr) {
        this.f11333f.getClass();
        while (c2036vr.B() > 0) {
            int i = this.f11335h;
            C2036vr c2036vr2 = this.f11328a;
            if (i == 0) {
                byte[] bArr = c2036vr.f17354a;
                int i3 = c2036vr.f17355b;
                int i6 = c2036vr.f17356c;
                while (true) {
                    if (i3 >= i6) {
                        c2036vr.E(i6);
                        break;
                    }
                    int i7 = i3 + 1;
                    byte b5 = bArr[i3];
                    boolean z6 = (b5 & 255) == 255;
                    boolean z7 = this.f11337k && (b5 & 224) == 224;
                    this.f11337k = z6;
                    if (z7) {
                        c2036vr.E(i7);
                        this.f11337k = false;
                        c2036vr2.f17354a[1] = bArr[i3];
                        this.i = 2;
                        this.f11335h = 1;
                        break;
                    }
                    i3 = i7;
                }
            } else if (i != 1) {
                int iMin = Math.min(c2036vr.B(), this.f11339m - this.i);
                this.f11333f.a(iMin, c2036vr);
                int i8 = this.i + iMin;
                this.i = i8;
                if (i8 >= this.f11339m) {
                    AbstractC0582Jp.h0(this.f11340n != -9223372036854775807L);
                    this.f11333f.c(this.f11340n, 1, this.f11339m, 0, null);
                    this.f11340n += this.f11338l;
                    this.i = 0;
                    this.f11335h = 0;
                }
            } else {
                int iMin2 = Math.min(c2036vr.B(), 4 - this.i);
                c2036vr.H(this.i, iMin2, c2036vr2.f17354a);
                int i9 = this.i + iMin2;
                this.i = i9;
                if (i9 >= 4) {
                    c2036vr2.E(0);
                    int iB = c2036vr2.b();
                    J0 j02 = this.f11329b;
                    if (j02.a(iB)) {
                        this.f11339m = j02.f9209b;
                        if (!this.f11336j) {
                            this.f11338l = (j02.f9213f * 1000000) / j02.f9210c;
                            C1855sP c1855sP = new C1855sP();
                            c1855sP.f16722a = this.f11334g;
                            c1855sP.d(this.f11332e);
                            c1855sP.e((String) j02.f9214g);
                            c1855sP.f16733m = 4096;
                            c1855sP.f16714D = j02.f9211d;
                            c1855sP.f16715E = j02.f9210c;
                            c1855sP.f16725d = this.f11330c;
                            c1855sP.f16727f = this.f11331d;
                            this.f11333f.e(new TP(c1855sP));
                            this.f11336j = true;
                        }
                        c2036vr2.E(0);
                        this.f11333f.a(4, c2036vr2);
                        this.f11335h = 2;
                    } else {
                        this.i = 0;
                        this.f11335h = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        c1189g4.a();
        c1189g4.b();
        this.f11334g = c1189g4.f14198e;
        c1189g4.b();
        this.f11333f = interfaceC2100x0.x(c1189g4.f14197d, 1);
    }
}
