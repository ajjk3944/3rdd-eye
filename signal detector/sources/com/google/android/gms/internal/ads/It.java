package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import q2.C2852x0;
import q2.InterfaceC2842s0;

/* loaded from: classes.dex */
public final class It implements E2.a, InterfaceC0441Bk, InterfaceC1544mk, InterfaceC1382jk, InterfaceC1813rk, InterfaceC0577Jk, InterfaceC2200yt, InterfaceC2084wl {

    /* renamed from: a, reason: collision with root package name */
    public final C1554mu f9180a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f9181b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f9182c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f9183d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f9184e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f9185f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f9186g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f9187h = new AtomicReference();
    public It i = null;

    public It(C1554mu c1554mu) {
        this.f9180a = c1554mu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final void D(C2852x0 c2852x0) {
        It it = this.i;
        if (it != null) {
            it.D(c2852x0);
            return;
        }
        int i = c2852x0.f23273a;
        AtomicReference atomicReference = this.f9182c;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC0724Se) obj).a(c2852x0);
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC0724Se) obj2).t(i);
            } catch (RemoteException e8) {
                u2.k.k("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj3 = this.f9184e.get();
        if (obj3 == null) {
            return;
        }
        try {
            C0435Be c0435Be = (C0435Be) obj3;
            Parcel parcelH0 = c0435Be.h0();
            parcelH0.writeInt(i);
            c0435Be.I0(parcelH0, 7);
        } catch (RemoteException e10) {
            u2.k.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void F(BinderC2185ye binderC2185ye, String str, String str2) {
        int i = binderC2185ye.f17729b;
        String str3 = binderC2185ye.f17728a;
        It it = this.i;
        if (it != null) {
            it.F(binderC2185ye, str, str2);
            return;
        }
        Object obj = this.f9183d.get();
        if (obj != null) {
            try {
                ((InterfaceC0656Oe) obj).H2(new BinderC0826Ye(str3, i));
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f9185f.get();
        if (obj2 != null) {
            try {
                C0741Te c0741Te = (C0741Te) obj2;
                BinderC0826Ye binderC0826Ye = new BinderC0826Ye(str3, i);
                Parcel parcelH0 = c0741Te.h0();
                C7.e(parcelH0, binderC0826Ye);
                parcelH0.writeString(str);
                parcelH0.writeString(str2);
                c0741Te.I0(parcelH0, 2);
            } catch (RemoteException e8) {
                u2.k.k("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj3 = this.f9184e.get();
        if (obj3 != null) {
            try {
                C0435Be c0435Be = (C0435Be) obj3;
                Parcel parcelH02 = c0435Be.h0();
                C7.e(parcelH02, binderC2185ye);
                c0435Be.I0(parcelH02, 5);
            } catch (RemoteException e10) {
                u2.k.k("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj4 = this.f9186g.get();
        if (obj4 == null) {
            return;
        }
        try {
            C0418Ae c0418Ae = (C0418Ae) obj4;
            Parcel parcelH03 = c0418Ae.h0();
            C7.e(parcelH03, binderC2185ye);
            parcelH03.writeString(str);
            parcelH03.writeString(str2);
            c0418Ae.I0(parcelH03, 2);
        } catch (RemoteException e12) {
            u2.k.k("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void I() {
        It it = this.i;
        if (it != null) {
            it.I();
            return;
        }
        C2255zu c2255zu = this.f9180a.f15688a;
        if (c2255zu != null) {
            C1184g c1184g = (C1184g) c2255zu.f17990b;
            synchronized (c1184g) {
                c1184g.f14179a = 1;
                c1184g.h();
            }
        }
        Object obj = this.f9183d.get();
        if (obj != null) {
            try {
                ((InterfaceC0656Oe) obj).d();
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f9184e.get();
        if (obj2 == null) {
            return;
        }
        try {
            C0435Be c0435Be = (C0435Be) obj2;
            c0435Be.I0(c0435Be.h0(), 4);
        } catch (RemoteException e8) {
            u2.k.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void L() {
        It it = this.i;
        if (it != null) {
            it.L();
        } else {
            AbstractC1984ut.m(this.f9183d, C1285ht.f14607e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void M() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void N() {
        It it = this.i;
        if (it != null) {
            it.N();
            return;
        }
        AtomicReference atomicReference = this.f9183d;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC0656Oe) obj).b();
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f9184e.get();
        if (obj2 != null) {
            try {
                C0435Be c0435Be = (C0435Be) obj2;
                c0435Be.I0(c0435Be.h0(), 2);
            } catch (RemoteException e8) {
                u2.k.k("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((InterfaceC0656Oe) obj3).h();
        } catch (RemoteException e10) {
            u2.k.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0577Jk
    public final void a(q2.e1 e1Var) {
        It it = this.i;
        if (it != null) {
            it.a(e1Var);
            return;
        }
        Object obj = this.f9187h.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC2842s0) obj).u1(e1Var);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void b() {
        It it = this.i;
        if (it != null) {
            it.b();
            return;
        }
        Object obj = this.f9184e.get();
        if (obj == null) {
            return;
        }
        try {
            C0435Be c0435Be = (C0435Be) obj;
            c0435Be.I0(c0435Be.h0(), 3);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // E2.a
    public final void c() {
        It it = this.i;
        if (it != null) {
            it.c();
        } else {
            AbstractC1984ut.m(this.f9181b, C1285ht.f14608f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void d() {
        It it = this.i;
        if (it != null) {
            it.d();
            return;
        }
        Object obj = this.f9184e.get();
        if (obj == null) {
            return;
        }
        try {
            C0435Be c0435Be = (C0435Be) obj;
            c0435Be.I0(c0435Be.h0(), 8);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() {
        It it = this.i;
        if (it != null) {
            it.e();
            return;
        }
        Object obj = this.f9182c.get();
        if (obj != null) {
            try {
                ((InterfaceC0724Se) obj).b();
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f9184e.get();
        if (obj2 == null) {
            return;
        }
        try {
            C0435Be c0435Be = (C0435Be) obj2;
            c0435Be.I0(c0435Be.h0(), 1);
        } catch (RemoteException e8) {
            u2.k.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1813rk
    public final void f(C2852x0 c2852x0) {
        It it = this.i;
        if (it != null) {
            it.f(c2852x0);
            return;
        }
        AtomicReference atomicReference = this.f9183d;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC0656Oe) obj).G0(c2852x0);
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((InterfaceC0656Oe) obj2).B(c2852x0.f23273a);
        } catch (RemoteException e8) {
            u2.k.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2200yt
    public final void p(InterfaceC2200yt interfaceC2200yt) {
        this.i = (It) interfaceC2200yt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void v() {
        It it = this.i;
        if (it != null) {
            it.v();
            return;
        }
        Object obj = this.f9184e.get();
        if (obj == null) {
            return;
        }
        try {
            C0435Be c0435Be = (C0435Be) obj;
            c0435Be.I0(c0435Be.h0(), 6);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }
}
