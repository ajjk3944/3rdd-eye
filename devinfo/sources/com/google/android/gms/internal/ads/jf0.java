package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jf0 extends pa.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12740a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12741b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12743d;

    public jf0(pf0 pf0Var, String str, pa.k kVar) {
        this.f12740a = 0;
        this.f12741b = str;
        this.f12742c = kVar;
        Objects.requireNonNull(pf0Var);
        this.f12743d = pf0Var;
    }

    @Override // pa.c
    public void a() {
        switch (this.f12740a) {
            case 1:
                return;
            case 2:
                synchronized (this.f12741b) {
                    try {
                        pa.c cVar = (pa.c) this.f12742c;
                        if (cVar != null) {
                            cVar.a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // pa.c
    public final void b(pa.l lVar) {
        switch (this.f12740a) {
            case 0:
                ((pf0) this.f12743d).j4(pf0.m4(lVar));
                return;
            case 1:
                ((pi.g) this.f12741b).B("admob-banner:" + lVar.f31511a);
                return;
            default:
                va.e2 e2Var = (va.e2) this.f12743d;
                pa.s sVar = e2Var.f36072c;
                va.l0 l0Var = e2Var.f36077i;
                va.a2 a2VarY = null;
                if (l0Var != null) {
                    try {
                        a2VarY = l0Var.y();
                    } catch (RemoteException e2) {
                        za.i.k("#007 Could not call remote method.", e2);
                    }
                }
                sVar.a(a2VarY);
                synchronized (this.f12741b) {
                    try {
                        pa.c cVar = (pa.c) this.f12742c;
                        if (cVar != null) {
                            cVar.b(lVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // pa.c
    public void c() {
        switch (this.f12740a) {
            case 1:
                return;
            case 2:
                synchronized (this.f12741b) {
                    try {
                        pa.c cVar = (pa.c) this.f12742c;
                        if (cVar != null) {
                            cVar.c();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // pa.c
    public final void d() {
        switch (this.f12740a) {
            case 0:
                ((pf0) this.f12743d).i4((pa.k) this.f12742c, (String) this.f12741b);
                return;
            case 1:
                pi.a aVar = (pi.a) this.f12743d;
                pa.i iVar = (pa.i) this.f12742c;
                pi.g gVar = (pi.g) this.f12741b;
                gVar.D(new qi.e(iVar, 0));
                iVar.post(new oi.f(iVar, gVar, aVar, 1));
                return;
            default:
                va.e2 e2Var = (va.e2) this.f12743d;
                pa.s sVar = e2Var.f36072c;
                va.l0 l0Var = e2Var.f36077i;
                va.a2 a2VarY = null;
                if (l0Var != null) {
                    try {
                        a2VarY = l0Var.y();
                    } catch (RemoteException e2) {
                        za.i.k("#007 Could not call remote method.", e2);
                    }
                }
                sVar.a(a2VarY);
                synchronized (this.f12741b) {
                    try {
                        pa.c cVar = (pa.c) this.f12742c;
                        if (cVar != null) {
                            cVar.d();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // pa.c
    public void e() {
        switch (this.f12740a) {
            case 1:
                return;
            case 2:
                synchronized (this.f12741b) {
                    try {
                        pa.c cVar = (pa.c) this.f12742c;
                        if (cVar != null) {
                            cVar.e();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // pa.c
    public void f() {
        int i4 = this.f12740a;
    }

    @Override // pa.c, va.a
    public void onAdClicked() {
        switch (this.f12740a) {
            case 1:
                if (ci.b.j != null) {
                    j6.i.o((pi.a) this.f12743d);
                }
                ((pi.g) this.f12741b).w();
                return;
            case 2:
                synchronized (this.f12741b) {
                    try {
                        pa.c cVar = (pa.c) this.f12742c;
                        if (cVar != null) {
                            cVar.onAdClicked();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                return;
        }
    }

    public jf0(pi.g gVar, pa.i iVar, pi.a aVar) {
        this.f12740a = 1;
        this.f12741b = gVar;
        this.f12742c = iVar;
        this.f12743d = aVar;
    }

    public jf0(va.e2 e2Var) {
        this.f12740a = 2;
        this.f12743d = e2Var;
        this.f12741b = new Object();
    }

    private final void h() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }
}
