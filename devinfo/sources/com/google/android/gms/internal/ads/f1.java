package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10953a = 4;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10955c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10956d;

    public /* synthetic */ f1(g1 g1Var, Object obj, long j) {
        this.f10955c = g1Var;
        this.f10956d = obj;
        this.f10954b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f10953a;
        long j = this.f10954b;
        Object obj = this.f10956d;
        Object obj2 = this.f10955c;
        switch (i4) {
            case 0:
                String str = bq0.f9768a;
                it1 it1Var = ((g1) obj2).f11342b.f9804a;
                wu1 wu1Var = it1Var.f12465s;
                qu1 qu1VarP = wu1Var.p();
                wu1Var.l(qu1VarP, 26, new rg0(qu1VarP, obj, j));
                if (it1Var.N == obj) {
                    yf0 yf0Var = it1Var.f12460n;
                    yf0Var.c(26, cl1.f10164i);
                    yf0Var.d();
                    break;
                }
                break;
            case 1:
                ha haVar = (ha) obj;
                haVar.f11780a.a(j, (String) obj2);
                haVar.f11780a.b(haVar.toString());
                break;
            case 2:
                it0 it0Var = (it0) obj;
                kh0 kh0Var = it0Var.f12442r;
                if (kh0Var != null) {
                    va.x1 x1Var = (va.x1) obj2;
                    nt0 nt0Var = it0Var.f12444t;
                    kh0Var.D("paa", "pano_ts", this.f10954b, it0Var.f12431e.f36173d, it0Var.r(), x1Var instanceof c60 ? ((c60) x1Var).f10000d : null, nt0Var, it0Var.f());
                    break;
                }
                break;
            case 3:
                ec.b3 b3Var = (ec.b3) obj;
                b3Var.F((ec.y2) obj2, false, j);
                b3Var.f22589f = null;
                ec.j3 j3VarP = ((ec.o1) b3Var.f218b).p();
                j3VarP.B();
                j3VarP.C();
                j3VarP.P(new vd.a(j3VarP, (ec.y2) null));
                break;
            default:
                if (!ci.b.f2887i) {
                    if (System.currentTimeMillis() - j < 20000) {
                        qi.b.f32428a.postDelayed(this, 100L);
                        break;
                    } else {
                        ((pi.g) obj).B("init-timeout");
                        break;
                    }
                } else {
                    ((mk.a) obj2).invoke();
                    break;
                }
        }
    }

    public f1(ha haVar, String str, long j) {
        this.f10955c = str;
        this.f10954b = j;
        this.f10956d = haVar;
    }

    public f1(it0 it0Var, long j, va.x1 x1Var) {
        this.f10954b = j;
        this.f10955c = x1Var;
        this.f10956d = it0Var;
    }

    public f1(ec.b3 b3Var, ec.y2 y2Var, long j) {
        this.f10955c = y2Var;
        this.f10954b = j;
        Objects.requireNonNull(b3Var);
        this.f10956d = b3Var;
    }

    public f1(long j, mk.a aVar, pi.g gVar) {
        this.f10954b = j;
        this.f10955c = aVar;
        this.f10956d = gVar;
    }
}
