package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c20 extends va.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9924a;

    /* renamed from: b, reason: collision with root package name */
    public final za.a f9925b;

    /* renamed from: c, reason: collision with root package name */
    public final ed0 f9926c;

    /* renamed from: d, reason: collision with root package name */
    public final bi0 f9927d;

    /* renamed from: e, reason: collision with root package name */
    public final kk0 f9928e;

    /* renamed from: f, reason: collision with root package name */
    public final re0 f9929f;
    public final dw g;

    /* renamed from: h, reason: collision with root package name */
    public final gd0 f9930h;

    /* renamed from: i, reason: collision with root package name */
    public final ff0 f9931i;
    public final jm j;

    /* renamed from: k, reason: collision with root package name */
    public final cs0 f9932k;

    /* renamed from: l, reason: collision with root package name */
    public final pq0 f9933l;

    /* renamed from: m, reason: collision with root package name */
    public final f50 f9934m;

    /* renamed from: n, reason: collision with root package name */
    public final qd0 f9935n;

    /* renamed from: o, reason: collision with root package name */
    public final sf0 f9936o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9937p = false;

    /* renamed from: q, reason: collision with root package name */
    public final Long f9938q;

    public c20(Context context, za.a aVar, ed0 ed0Var, bi0 bi0Var, kk0 kk0Var, re0 re0Var, dw dwVar, gd0 gd0Var, ff0 ff0Var, jm jmVar, cs0 cs0Var, pq0 pq0Var, f50 f50Var, qd0 qd0Var, sf0 sf0Var) {
        this.f9924a = context;
        this.f9925b = aVar;
        this.f9926c = ed0Var;
        this.f9927d = bi0Var;
        this.f9928e = kk0Var;
        this.f9929f = re0Var;
        this.g = dwVar;
        this.f9930h = gd0Var;
        this.f9931i = ff0Var;
        this.j = jmVar;
        this.f9932k = cs0Var;
        this.f9933l = pq0Var;
        this.f9934m = f50Var;
        this.f9935n = qd0Var;
        this.f9936o = sf0Var;
        ua.j.C.f35267k.getClass();
        this.f9938q = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // va.h1
    public final synchronized boolean B1() {
        return ua.j.C.f35266i.d();
    }

    @Override // va.h1
    public final void C3(String str, vb.a aVar) {
        if (aVar == null) {
            za.i.e("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) vb.b.U0(aVar);
        if (context == null) {
            za.i.e("Context is null. Failed to open debug menu.");
            return;
        }
        ya.g gVar = new ya.g(context);
        gVar.f37453d = str;
        gVar.f37454e = this.f9925b.f38129a;
        gVar.b();
    }

    @Override // va.h1
    public final synchronized float D1() {
        return ua.j.C.f35266i.b();
    }

    @Override // va.h1
    public final List E1() {
        return this.f9929f.b();
    }

    @Override // va.h1
    public final String F1() {
        return this.f9925b.f38129a;
    }

    @Override // va.h1
    public final void G3(ar arVar) {
        this.f9933l.x(arVar);
    }

    @Override // va.h1
    public final void H(String str) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Ia)).booleanValue()) {
            ua.j.C.f35265h.g = str;
        }
    }

    @Override // va.h1
    public final synchronized void I() {
        pk pkVar = sk.P2;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            ua.j.C.f35274r.s();
            if (((Boolean) sVar.f36166c.a(sk.Q2)).booleanValue()) {
                va.r.g.f36159c = true;
            }
        }
    }

    @Override // va.h1
    public final void J1() {
        this.f9929f.f15631q = false;
    }

    @Override // va.h1
    public final void L(String str) {
        this.f9928e.d(str);
    }

    @Override // va.h1
    public final synchronized void Q1(boolean z3) {
        ua.j.C.f35266i.c(z3);
    }

    @Override // va.h1
    public final void U1(mp mpVar) {
        re0 re0Var = this.f9929f;
        re0Var.getClass();
        re0Var.f15621e.f11625a.a(new q81(27, re0Var, mpVar), re0Var.j);
    }

    @Override // va.h1
    public final synchronized void W0(float f10) {
        ua.j.C.f35266i.a(f10);
    }

    @Override // va.h1
    public final synchronized void c() {
        if (this.f9937p) {
            za.i.h("Mobile ads is initialized already.");
            return;
        }
        pk pkVar = sk.Q2;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            va.r.a();
        }
        Context context = this.f9924a;
        sk.a(context);
        za.a aVar = this.f9925b;
        qd0 qd0Var = this.f9935n;
        ua.j jVar = ua.j.C;
        jVar.f35265h.d(context, aVar, qd0Var);
        this.f9934m.b();
        jVar.j.d(context);
        this.f9937p = true;
        this.f9929f.a();
        kk0 kk0Var = this.f9928e;
        kk0Var.getClass();
        ya.c0 c0VarI = jVar.f35265h.i();
        c0VarI.f37404c.add(new jk0(kk0Var, 2));
        kk0Var.f13182f.execute(new jk0(kk0Var, 0));
        if (((Boolean) sVar.f36166c.a(sk.L4)).booleanValue()) {
            gd0 gd0Var = this.f9930h;
            if (!gd0Var.f11503f.getAndSet(true)) {
                ya.c0 c0VarI2 = jVar.f35265h.i();
                c0VarI2.f37404c.add(new fd0(gd0Var, 0));
            }
            gd0Var.f11500c.execute(new fd0(gd0Var, 2));
        }
        this.f9931i.a();
        if (((Boolean) sVar.f36166c.a(sk.f16387wa)).booleanValue()) {
            final int i4 = 3;
            fx.f11274a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.a20

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c20 f9190b;

                {
                    this.f9190b = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws za.j {
                    String strB;
                    km kmVar;
                    String str;
                    switch (i4) {
                        case 0:
                            jz.g(this.f9190b.f9924a, true);
                            return;
                        case 1:
                            c20 c20Var = this.f9190b;
                            zk zkVar = ua.j.C.f35270n;
                            Context context2 = c20Var.f9924a;
                            qd0 qd0Var2 = c20Var.f9935n;
                            if (zkVar.f19095b.getAndSet(true)) {
                                return;
                            }
                            zkVar.f19096c = context2;
                            zkVar.f19097d = qd0Var2;
                            if (zkVar.f19099f != null || context2 == null || (strB = u.h.b(context2, null, false)) == null || strB.equals(context2.getPackageName())) {
                                return;
                            }
                            u.h.a(context2, strB, zkVar);
                            return;
                        case 2:
                            c20 c20Var2 = this.f9190b;
                            c20Var2.getClass();
                            wt wtVar = new wt("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            jm jmVar = c20Var2.j;
                            jmVar.getClass();
                            try {
                                try {
                                    IBinder iBinderB = za.i.b(jmVar.f12785b).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        kmVar = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        kmVar = iInterfaceQueryLocalInterface instanceof km ? (km) iInterfaceQueryLocalInterface : new km(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                    }
                                    Parcel parcelT = kmVar.T();
                                    ng.e(parcelT, wtVar);
                                    kmVar.g1(parcelT, 1);
                                    return;
                                } catch (Exception e2) {
                                    throw new za.j(e2);
                                }
                            } catch (RemoteException e10) {
                                za.i.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                return;
                            } catch (za.j e11) {
                                za.i.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                return;
                            }
                        default:
                            c20 c20Var3 = this.f9190b;
                            c20Var3.getClass();
                            ua.j jVar2 = ua.j.C;
                            if (jVar2.f35265h.i().g()) {
                                ya.c0 c0VarI3 = jVar2.f35265h.i();
                                c0VarI3.m();
                                synchronized (c0VarI3.f37402a) {
                                    str = c0VarI3.f37425z;
                                }
                                if (jVar2.f35271o.i(c20Var3.f9924a, str, c20Var3.f9925b.f38129a)) {
                                    return;
                                }
                                jVar2.f35265h.i().h(false);
                                jVar2.f35265h.i().i("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) sVar.f36166c.a(sk.f16185jc)).booleanValue()) {
            final int i10 = 2;
            fx.f11274a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.a20

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c20 f9190b;

                {
                    this.f9190b = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws za.j {
                    String strB;
                    km kmVar;
                    String str;
                    switch (i10) {
                        case 0:
                            jz.g(this.f9190b.f9924a, true);
                            return;
                        case 1:
                            c20 c20Var = this.f9190b;
                            zk zkVar = ua.j.C.f35270n;
                            Context context2 = c20Var.f9924a;
                            qd0 qd0Var2 = c20Var.f9935n;
                            if (zkVar.f19095b.getAndSet(true)) {
                                return;
                            }
                            zkVar.f19096c = context2;
                            zkVar.f19097d = qd0Var2;
                            if (zkVar.f19099f != null || context2 == null || (strB = u.h.b(context2, null, false)) == null || strB.equals(context2.getPackageName())) {
                                return;
                            }
                            u.h.a(context2, strB, zkVar);
                            return;
                        case 2:
                            c20 c20Var2 = this.f9190b;
                            c20Var2.getClass();
                            wt wtVar = new wt("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            jm jmVar = c20Var2.j;
                            jmVar.getClass();
                            try {
                                try {
                                    IBinder iBinderB = za.i.b(jmVar.f12785b).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        kmVar = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        kmVar = iInterfaceQueryLocalInterface instanceof km ? (km) iInterfaceQueryLocalInterface : new km(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                    }
                                    Parcel parcelT = kmVar.T();
                                    ng.e(parcelT, wtVar);
                                    kmVar.g1(parcelT, 1);
                                    return;
                                } catch (Exception e2) {
                                    throw new za.j(e2);
                                }
                            } catch (RemoteException e10) {
                                za.i.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                return;
                            } catch (za.j e11) {
                                za.i.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                return;
                            }
                        default:
                            c20 c20Var3 = this.f9190b;
                            c20Var3.getClass();
                            ua.j jVar2 = ua.j.C;
                            if (jVar2.f35265h.i().g()) {
                                ya.c0 c0VarI3 = jVar2.f35265h.i();
                                c0VarI3.m();
                                synchronized (c0VarI3.f37402a) {
                                    str = c0VarI3.f37425z;
                                }
                                if (jVar2.f35271o.i(c20Var3.f9924a, str, c20Var3.f9925b.f38129a)) {
                                    return;
                                }
                                jVar2.f35265h.i().h(false);
                                jVar2.f35265h.i().i("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) sVar.f36166c.a(sk.F3)).booleanValue()) {
            final int i11 = 0;
            fx.f11274a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.a20

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c20 f9190b;

                {
                    this.f9190b = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws za.j {
                    String strB;
                    km kmVar;
                    String str;
                    switch (i11) {
                        case 0:
                            jz.g(this.f9190b.f9924a, true);
                            return;
                        case 1:
                            c20 c20Var = this.f9190b;
                            zk zkVar = ua.j.C.f35270n;
                            Context context2 = c20Var.f9924a;
                            qd0 qd0Var2 = c20Var.f9935n;
                            if (zkVar.f19095b.getAndSet(true)) {
                                return;
                            }
                            zkVar.f19096c = context2;
                            zkVar.f19097d = qd0Var2;
                            if (zkVar.f19099f != null || context2 == null || (strB = u.h.b(context2, null, false)) == null || strB.equals(context2.getPackageName())) {
                                return;
                            }
                            u.h.a(context2, strB, zkVar);
                            return;
                        case 2:
                            c20 c20Var2 = this.f9190b;
                            c20Var2.getClass();
                            wt wtVar = new wt("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            jm jmVar = c20Var2.j;
                            jmVar.getClass();
                            try {
                                try {
                                    IBinder iBinderB = za.i.b(jmVar.f12785b).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        kmVar = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        kmVar = iInterfaceQueryLocalInterface instanceof km ? (km) iInterfaceQueryLocalInterface : new km(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                    }
                                    Parcel parcelT = kmVar.T();
                                    ng.e(parcelT, wtVar);
                                    kmVar.g1(parcelT, 1);
                                    return;
                                } catch (Exception e2) {
                                    throw new za.j(e2);
                                }
                            } catch (RemoteException e10) {
                                za.i.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                return;
                            } catch (za.j e11) {
                                za.i.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                return;
                            }
                        default:
                            c20 c20Var3 = this.f9190b;
                            c20Var3.getClass();
                            ua.j jVar2 = ua.j.C;
                            if (jVar2.f35265h.i().g()) {
                                ya.c0 c0VarI3 = jVar2.f35265h.i();
                                c0VarI3.m();
                                synchronized (c0VarI3.f37402a) {
                                    str = c0VarI3.f37425z;
                                }
                                if (jVar2.f35271o.i(c20Var3.f9924a, str, c20Var3.f9925b.f38129a)) {
                                    return;
                                }
                                jVar2.f35265h.i().h(false);
                                jVar2.f35265h.i().i("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) sVar.f36166c.a(sk.f16287q5)).booleanValue()) {
            if (((Boolean) sVar.f36166c.a(sk.f16304r5)).booleanValue()) {
                final int i12 = 1;
                fx.f11274a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.a20

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ c20 f9190b;

                    {
                        this.f9190b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws za.j {
                        String strB;
                        km kmVar;
                        String str;
                        switch (i12) {
                            case 0:
                                jz.g(this.f9190b.f9924a, true);
                                return;
                            case 1:
                                c20 c20Var = this.f9190b;
                                zk zkVar = ua.j.C.f35270n;
                                Context context2 = c20Var.f9924a;
                                qd0 qd0Var2 = c20Var.f9935n;
                                if (zkVar.f19095b.getAndSet(true)) {
                                    return;
                                }
                                zkVar.f19096c = context2;
                                zkVar.f19097d = qd0Var2;
                                if (zkVar.f19099f != null || context2 == null || (strB = u.h.b(context2, null, false)) == null || strB.equals(context2.getPackageName())) {
                                    return;
                                }
                                u.h.a(context2, strB, zkVar);
                                return;
                            case 2:
                                c20 c20Var2 = this.f9190b;
                                c20Var2.getClass();
                                wt wtVar = new wt("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                jm jmVar = c20Var2.j;
                                jmVar.getClass();
                                try {
                                    try {
                                        IBinder iBinderB = za.i.b(jmVar.f12785b).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (iBinderB == null) {
                                            kmVar = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            kmVar = iInterfaceQueryLocalInterface instanceof km ? (km) iInterfaceQueryLocalInterface : new km(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                        }
                                        Parcel parcelT = kmVar.T();
                                        ng.e(parcelT, wtVar);
                                        kmVar.g1(parcelT, 1);
                                        return;
                                    } catch (Exception e2) {
                                        throw new za.j(e2);
                                    }
                                } catch (RemoteException e10) {
                                    za.i.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                    return;
                                } catch (za.j e11) {
                                    za.i.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                                    return;
                                }
                            default:
                                c20 c20Var3 = this.f9190b;
                                c20Var3.getClass();
                                ua.j jVar2 = ua.j.C;
                                if (jVar2.f35265h.i().g()) {
                                    ya.c0 c0VarI3 = jVar2.f35265h.i();
                                    c0VarI3.m();
                                    synchronized (c0VarI3.f37402a) {
                                        str = c0VarI3.f37425z;
                                    }
                                    if (jVar2.f35271o.i(c20Var3.f9924a, str, c20Var3.f9925b.f38129a)) {
                                        return;
                                    }
                                    jVar2.f35265h.i().h(false);
                                    jVar2.f35265h.i().i("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
        if (((Boolean) sVar.f36166c.a(sk.E5)).booleanValue()) {
            sf0 sf0Var = this.f9936o;
            ex exVar = fx.f11279f;
            Objects.requireNonNull(sf0Var);
            exVar.execute(new s(27, sf0Var));
        }
    }

    @Override // va.h1
    public final void i0(boolean z3) throws IOException, RemoteException {
        try {
            Context context = this.f9924a;
            ix0.d(context).o(z3);
            if (z3) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e2) {
                ua.j.C.f35265h.f("clearStorageOnGpidPubDisable_scar", e2);
            }
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // va.h1
    public final synchronized void i3(String str) {
        Context context = this.f9924a;
        sk.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.J4)).booleanValue()) {
                ua.j.C.f35268l.t(context, this.f9925b, true, null, str, null, null, this.f9932k, null, null, this.f9931i.g());
            }
        }
    }

    @Override // va.h1
    public final void n3(String str, vb.a aVar) throws JSONException {
        String strO;
        b20 b20Var;
        Context context = this.f9924a;
        sk.a(context);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Q4)).booleanValue()) {
            try {
                ya.f0 f0Var = ua.j.C.f35261c;
                strO = ya.f0.O(context);
            } catch (RemoteException | RuntimeException e2) {
                ua.j.C.f35265h.f("NonagonMobileAdsSettingManager_AppId", e2);
            }
        } else {
            strO = "";
        }
        boolean z3 = true;
        String str2 = true == TextUtils.isEmpty(strO) ? str : strO;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        pk pkVar = sk.J4;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        boolean zBooleanValue = ((Boolean) rkVar.a(pkVar)).booleanValue();
        pk pkVar2 = sk.f16267p1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) rkVar2.a(pkVar2)).booleanValue();
        if (((Boolean) rkVar2.a(pkVar2)).booleanValue()) {
            b20Var = new b20(this, (Runnable) vb.b.U0(aVar), 0);
        } else {
            b20Var = null;
            z3 = zBooleanValue2;
        }
        b20 b20Var2 = b20Var;
        if (z3) {
            ua.j.C.f35268l.t(this.f9924a, this.f9925b, true, null, str2, null, b20Var2, this.f9932k, this.f9935n, this.f9938q, this.f9931i.g());
        }
    }

    @Override // va.h1
    public final void r3(va.u2 u2Var) {
        dw dwVar = this.g;
        Context context = this.f9924a;
        dwVar.getClass();
        aw awVarO = aw.o(context);
        xv xvVar = (xv) ((es1) awVarO.f9453d).a();
        ((tb.a) awVarO.f9451b).getClass();
        xvVar.a(-1, System.currentTimeMillis());
        if (((Boolean) va.s.f36163e.f36166c.a(sk.P0)).booleanValue() && dwVar.a(context) && dw.g(context)) {
            synchronized (dwVar.f10566i) {
            }
        }
    }

    @Override // va.h1
    public final void z2(va.o1 o1Var) {
        this.f9931i.f(o1Var, ef0.f10773b);
    }
}
