package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573Jg implements InterfaceC0936bO {

    /* renamed from: a, reason: collision with root package name */
    public final C1506m f9326a = new C1506m(0);

    /* renamed from: b, reason: collision with root package name */
    public long f9327b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    public long f9328c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    public long f9329d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    public long f9330e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    public int f9331f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9332g;

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final void a(MO mo) {
        this.f9331f = 0;
        this.f9332g = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final void b(MO mo) {
        this.f9331f = 0;
        this.f9332g = false;
        C1506m c1506m = this.f9326a;
        synchronized (c1506m) {
            c1506m.D(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final boolean c(C0881aO c0881aO) {
        long j6 = c0881aO.f13119f ? this.f9330e : this.f9329d;
        return j6 <= 0 || c0881aO.f13117d >= j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final long d() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final void e(MO mo) {
        this.f9331f = 0;
        this.f9332g = false;
        C1506m c1506m = this.f9326a;
        synchronized (c1506m) {
            c1506m.D(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final boolean f(C0881aO c0881aO) {
        int i;
        long j6 = c0881aO.f13117d;
        boolean z6 = true;
        char c6 = j6 > this.f9328c ? (char) 0 : j6 < this.f9327b ? (char) 2 : (char) 1;
        C1506m c1506m = this.f9326a;
        synchronized (c1506m) {
            i = c1506m.f15503b * 65536;
        }
        int i3 = this.f9331f;
        if (c6 != 2 && (c6 != 1 || !this.f9332g || i >= i3)) {
            z6 = false;
        }
        this.f9332g = z6;
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final void g(C0881aO c0881aO, InterfaceC1020d[] interfaceC1020dArr) {
        int i;
        this.f9331f = 0;
        for (InterfaceC1020d interfaceC1020d : interfaceC1020dArr) {
            if (interfaceC1020d != null) {
                int i3 = this.f9331f;
                int i6 = interfaceC1020d.a().f17548c;
                if (i6 == 0) {
                    i = 144310272;
                } else if (i6 == 1) {
                    i = 13107200;
                } else if (i6 != 2) {
                    i = 131072;
                    if (i6 != 3 && i6 != 5 && i6 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.f9331f = i3 + i;
            }
        }
        this.f9326a.D(this.f9331f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final boolean h() {
        AbstractC2022vd.v("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final InterfaceC1292i i(MO mo) {
        return this.f9326a;
    }
}
