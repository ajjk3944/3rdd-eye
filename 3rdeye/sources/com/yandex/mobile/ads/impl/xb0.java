package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class xb0 implements u70 {

    /* renamed from: f, reason: collision with root package name */
    private w70 f35234f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f35236h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private int f35237j;

    /* renamed from: k, reason: collision with root package name */
    private int f35238k;

    /* renamed from: l, reason: collision with root package name */
    private int f35239l;

    /* renamed from: m, reason: collision with root package name */
    private long f35240m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f35241n;

    /* renamed from: o, reason: collision with root package name */
    private qh f35242o;

    /* renamed from: p, reason: collision with root package name */
    private vf2 f35243p;

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f35229a = new uf1(4);

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f35230b = new uf1(9);

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f35231c = new uf1(11);

    /* renamed from: d, reason: collision with root package name */
    private final uf1 f35232d = new uf1();

    /* renamed from: e, reason: collision with root package name */
    private final mt1 f35233e = new mt1();

    /* renamed from: g, reason: collision with root package name */
    private int f35235g = 1;

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f35234f = w70Var;
    }

    private uf1 a(rz rzVar) throws IOException {
        if (this.f35239l > this.f35232d.b()) {
            uf1 uf1Var = this.f35232d;
            uf1Var.a(0, new byte[Math.max(uf1Var.b() * 2, this.f35239l)]);
        } else {
            this.f35232d.e(0);
        }
        this.f35232d.d(this.f35239l);
        rzVar.a(this.f35232d.c(), 0, this.f35239l, false);
        return this.f35232d;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.v70 r17, com.yandex.mobile.ads.impl.jj1 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xb0.a(com.yandex.mobile.ads.impl.v70, com.yandex.mobile.ads.impl.jj1):int");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        if (j4 == 0) {
            this.f35235g = 1;
            this.f35236h = false;
        } else {
            this.f35235g = 3;
        }
        this.f35237j = 0;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        rz rzVar = (rz) v70Var;
        rzVar.b(this.f35229a.c(), 0, 3, false);
        this.f35229a.e(0);
        if (this.f35229a.w() != 4607062) {
            return false;
        }
        rzVar.b(this.f35229a.c(), 0, 2, false);
        this.f35229a.e(0);
        if ((this.f35229a.z() & 250) != 0) {
            return false;
        }
        rzVar.b(this.f35229a.c(), 0, 4, false);
        this.f35229a.e(0);
        int iH = this.f35229a.h();
        rzVar.c();
        rzVar.a(false, iH);
        rzVar.b(this.f35229a.c(), 0, 4, false);
        this.f35229a.e(0);
        return this.f35229a.h() == 0;
    }

    private static /* synthetic */ u70[] a() {
        return new u70[]{new xb0()};
    }
}
