package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class np0 implements jb.a, w60, i60, g60, n60, e70, cp0, t80 {

    /* renamed from: a, reason: collision with root package name */
    public final tq0 f14390a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f14391b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f14392c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f14393d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f14394e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f14395f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f14396h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public np0 f14397i = null;

    public np0(tq0 tq0Var) {
        this.f14390a = tq0Var;
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void E() {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.E();
            return;
        }
        AtomicReference atomicReference = this.f14393d;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((fv) obj).c();
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f14394e.get();
        if (obj2 != null) {
            try {
                su suVar = (su) obj2;
                suVar.g1(suVar.T(), 2);
            } catch (RemoteException e11) {
                za.i.k("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((fv) obj3).A1();
        } catch (RemoteException e13) {
            za.i.k("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // com.google.android.gms.internal.ads.e70
    public final void a(va.d3 d3Var) {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.a(d3Var);
            return;
        }
        Object obj = this.f14396h.get();
        if (obj == null) {
            return;
        }
        try {
            ((va.r1) obj).x1(d3Var);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final void b(va.w1 w1Var) {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.b(w1Var);
            return;
        }
        AtomicReference atomicReference = this.f14393d;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((fv) obj).u0(w1Var);
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((fv) obj2).n(w1Var.f36177a);
        } catch (RemoteException e11) {
            za.i.k("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void c() {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.c();
            return;
        }
        Object obj = this.f14394e.get();
        if (obj == null) {
            return;
        }
        try {
            su suVar = (su) obj;
            suVar.g1(suVar.T(), 3);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void d() {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.d();
            return;
        }
        Object obj = this.f14394e.get();
        if (obj == null) {
            return;
        }
        try {
            su suVar = (su) obj;
            suVar.g1(suVar.T(), 8);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.e();
            return;
        }
        Object obj = this.f14392c.get();
        if (obj != null) {
            try {
                ((jv) obj).c();
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f14394e.get();
        if (obj2 == null) {
            return;
        }
        try {
            su suVar = (su) obj2;
            suVar.g1(suVar.T(), 1);
        } catch (RemoteException e11) {
            za.i.k("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // jb.a
    public final void f() {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.f();
        } else {
            yo0.l(this.f14391b, tk0.f16847m);
        }
    }

    @Override // com.google.android.gms.internal.ads.cp0
    public final void g(cp0 cp0Var) {
        this.f14397i = (np0) cp0Var;
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void j() {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.j();
            return;
        }
        Object obj = this.f14394e.get();
        if (obj == null) {
            return;
        }
        try {
            su suVar = (su) obj;
            suVar.g1(suVar.T(), 6);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void o(va.w1 w1Var) {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.o(w1Var);
            return;
        }
        int i4 = w1Var.f36177a;
        AtomicReference atomicReference = this.f14392c;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((jv) obj).b(w1Var);
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((jv) obj2).K1(i4);
            } catch (RemoteException e11) {
                za.i.k("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f14394e.get();
        if (obj3 == null) {
            return;
        }
        try {
            su suVar = (su) obj3;
            Parcel parcelT = suVar.T();
            parcelT.writeInt(i4);
            suVar.g1(parcelT, 7);
        } catch (RemoteException e13) {
            za.i.k("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void q(pu puVar, String str, String str2) {
        int i4 = puVar.f15107b;
        String str3 = puVar.f15106a;
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.q(puVar, str, str2);
            return;
        }
        Object obj = this.f14393d.get();
        if (obj != null) {
            try {
                ((fv) obj).b3(new pv(str3, i4));
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f14395f.get();
        if (obj2 != null) {
            try {
                kv kvVar = (kv) obj2;
                pv pvVar = new pv(str3, i4);
                Parcel parcelT = kvVar.T();
                ng.e(parcelT, pvVar);
                parcelT.writeString(str);
                parcelT.writeString(str2);
                kvVar.g1(parcelT, 2);
            } catch (RemoteException e11) {
                za.i.k("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f14394e.get();
        if (obj3 != null) {
            try {
                su suVar = (su) obj3;
                Parcel parcelT2 = suVar.T();
                ng.e(parcelT2, puVar);
                suVar.g1(parcelT2, 5);
            } catch (RemoteException e13) {
                za.i.k("#007 Could not call remote method.", e13);
            } catch (NullPointerException e14) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e14);
            }
        }
        Object obj4 = this.g.get();
        if (obj4 == null) {
            return;
        }
        try {
            ru ruVar = (ru) obj4;
            Parcel parcelT3 = ruVar.T();
            ng.e(parcelT3, puVar);
            parcelT3.writeString(str);
            parcelT3.writeString(str2);
            ruVar.g1(parcelT3, 2);
        } catch (RemoteException e15) {
            za.i.k("#007 Could not call remote method.", e15);
        } catch (NullPointerException e16) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e16);
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void v() {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.v();
            return;
        }
        ne0 ne0Var = this.f14390a.f16922a;
        if (ne0Var != null) {
            g gVar = (g) ne0Var.f14280b;
            synchronized (gVar) {
                gVar.f11324a = 1;
                gVar.e();
            }
        }
        Object obj = this.f14393d.get();
        if (obj != null) {
            try {
                ((fv) obj).d();
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f14394e.get();
        if (obj2 == null) {
            return;
        }
        try {
            su suVar = (su) obj2;
            suVar.g1(suVar.T(), 4);
        } catch (RemoteException e11) {
            za.i.k("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void x() {
        np0 np0Var = this.f14397i;
        if (np0Var != null) {
            np0Var.x();
        } else {
            yo0.l(this.f14393d, tk0.f16846l);
        }
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void D() {
    }
}
