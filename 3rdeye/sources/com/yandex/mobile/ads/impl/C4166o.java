package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C4173p;
import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;

/* renamed from: com.yandex.mobile.ads.impl.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4166o implements w40 {

    /* renamed from: a, reason: collision with root package name */
    private final tf1 f31102a;

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f31103b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31104c;

    /* renamed from: d, reason: collision with root package name */
    private String f31105d;

    /* renamed from: e, reason: collision with root package name */
    private n52 f31106e;

    /* renamed from: f, reason: collision with root package name */
    private int f31107f;

    /* renamed from: g, reason: collision with root package name */
    private int f31108g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f31109h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private dc0 f31110j;

    /* renamed from: k, reason: collision with root package name */
    private int f31111k;

    /* renamed from: l, reason: collision with root package name */
    private long f31112l;

    public C4166o() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(uf1 uf1Var) {
        if (this.f31106e == null) {
            throw new IllegalStateException();
        }
        while (uf1Var.a() > 0) {
            int i = this.f31107f;
            if (i == 0) {
                while (true) {
                    if (uf1Var.a() <= 0) {
                        break;
                    }
                    if (this.f31109h) {
                        int iT = uf1Var.t();
                        if (iT == 119) {
                            this.f31109h = false;
                            this.f31107f = 1;
                            this.f31103b.c()[0] = 11;
                            this.f31103b.c()[1] = 119;
                            this.f31108g = 2;
                            break;
                        }
                        this.f31109h = iT == 11;
                    } else {
                        this.f31109h = uf1Var.t() == 11;
                    }
                }
            } else if (i == 1) {
                byte[] bArrC = this.f31103b.c();
                int iMin = Math.min(uf1Var.a(), 128 - this.f31108g);
                uf1Var.a(bArrC, this.f31108g, iMin);
                int i10 = this.f31108g + iMin;
                this.f31108g = i10;
                if (i10 == 128) {
                    this.f31102a.c(0);
                    C4173p.a aVarA = C4173p.a(this.f31102a);
                    dc0 dc0Var = this.f31110j;
                    if (dc0Var == null || aVarA.f31549c != dc0Var.f26096z || aVarA.f31548b != dc0Var.f26066A || !s82.a(aVarA.f31547a, dc0Var.f26083m)) {
                        dc0 dc0VarA = new dc0.a().b(this.f31105d).e(aVarA.f31547a).c(aVarA.f31549c).l(aVarA.f31548b).d(this.f31104c).a();
                        this.f31110j = dc0VarA;
                        this.f31106e.a(dc0VarA);
                    }
                    this.f31111k = aVarA.f31550d;
                    this.i = (aVarA.f31551e * 1000000) / this.f31110j.f26066A;
                    this.f31103b.e(0);
                    this.f31106e.a(128, this.f31103b);
                    this.f31107f = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(uf1Var.a(), this.f31111k - this.f31108g);
                this.f31106e.a(iMin2, uf1Var);
                int i11 = this.f31108g + iMin2;
                this.f31108g = i11;
                int i12 = this.f31111k;
                if (i11 == i12) {
                    long j4 = this.f31112l;
                    if (j4 != -9223372036854775807L) {
                        this.f31106e.a(j4, 1, i12, 0, null);
                        this.f31112l += this.i;
                    }
                    this.f31107f = 0;
                }
            }
        }
    }

    public C4166o(String str) {
        byte[] bArr = new byte[128];
        this.f31102a = new tf1(bArr);
        this.f31103b = new uf1(bArr);
        this.f31107f = 0;
        this.f31112l = -9223372036854775807L;
        this.f31104c = str;
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        this.f31105d = dVar.b();
        this.f31106e = w70Var.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f31112l = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        this.f31107f = 0;
        this.f31108g = 0;
        this.f31109h = false;
        this.f31112l = -9223372036854775807L;
    }
}
