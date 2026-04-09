package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C4193s;
import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;

/* loaded from: classes3.dex */
public final class r implements w40 {

    /* renamed from: a, reason: collision with root package name */
    private final tf1 f32380a;

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f32381b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32382c;

    /* renamed from: d, reason: collision with root package name */
    private String f32383d;

    /* renamed from: e, reason: collision with root package name */
    private n52 f32384e;

    /* renamed from: f, reason: collision with root package name */
    private int f32385f;

    /* renamed from: g, reason: collision with root package name */
    private int f32386g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f32387h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private long f32388j;

    /* renamed from: k, reason: collision with root package name */
    private dc0 f32389k;

    /* renamed from: l, reason: collision with root package name */
    private int f32390l;

    /* renamed from: m, reason: collision with root package name */
    private long f32391m;

    public r() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(uf1 uf1Var) {
        if (this.f32384e == null) {
            throw new IllegalStateException();
        }
        while (uf1Var.a() > 0) {
            int i = this.f32385f;
            if (i == 0) {
                while (uf1Var.a() > 0) {
                    if (this.f32387h) {
                        int iT = uf1Var.t();
                        this.f32387h = iT == 172;
                        if (iT == 64 || iT == 65) {
                            this.i = iT == 65;
                            this.f32385f = 1;
                            this.f32381b.c()[0] = -84;
                            this.f32381b.c()[1] = (byte) (this.i ? 65 : 64);
                            this.f32386g = 2;
                        }
                    } else {
                        this.f32387h = uf1Var.t() == 172;
                    }
                }
            } else if (i == 1) {
                byte[] bArrC = this.f32381b.c();
                int iMin = Math.min(uf1Var.a(), 16 - this.f32386g);
                uf1Var.a(bArrC, this.f32386g, iMin);
                int i10 = this.f32386g + iMin;
                this.f32386g = i10;
                if (i10 == 16) {
                    this.f32380a.c(0);
                    C4193s.a aVarA = C4193s.a(this.f32380a);
                    dc0 dc0Var = this.f32389k;
                    if (dc0Var == null || 2 != dc0Var.f26096z || aVarA.f32825a != dc0Var.f26066A || !"audio/ac4".equals(dc0Var.f26083m)) {
                        dc0 dc0VarA = new dc0.a().b(this.f32383d).e("audio/ac4").c(2).l(aVarA.f32825a).d(this.f32382c).a();
                        this.f32389k = dc0VarA;
                        this.f32384e.a(dc0VarA);
                    }
                    this.f32390l = aVarA.f32826b;
                    this.f32388j = (aVarA.f32827c * 1000000) / this.f32389k.f26066A;
                    this.f32381b.e(0);
                    this.f32384e.a(16, this.f32381b);
                    this.f32385f = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(uf1Var.a(), this.f32390l - this.f32386g);
                this.f32384e.a(iMin2, uf1Var);
                int i11 = this.f32386g + iMin2;
                this.f32386g = i11;
                int i12 = this.f32390l;
                if (i11 == i12) {
                    long j4 = this.f32391m;
                    if (j4 != -9223372036854775807L) {
                        this.f32384e.a(j4, 1, i12, 0, null);
                        this.f32391m += this.f32388j;
                    }
                    this.f32385f = 0;
                }
            }
        }
    }

    public r(String str) {
        byte[] bArr = new byte[16];
        this.f32380a = new tf1(bArr);
        this.f32381b = new uf1(bArr);
        this.f32385f = 0;
        this.f32386g = 0;
        this.f32387h = false;
        this.i = false;
        this.f32391m = -9223372036854775807L;
        this.f32382c = str;
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        this.f32383d = dVar.b();
        this.f32384e = w70Var.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f32391m = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        this.f32385f = 0;
        this.f32386g = 0;
        this.f32387h = false;
        this.i = false;
        this.f32391m = -9223372036854775807L;
    }
}
