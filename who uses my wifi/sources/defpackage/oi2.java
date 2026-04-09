package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oi2 extends pn2 {
    public final Context f;
    public final e51 g;
    public final yu2 h;
    public final b03 i;
    public final j23 j;
    public final mw2 k;
    public final oc2 l;
    public final bv2 m;
    public final zw2 n;
    public final nc3 o;
    public final ea3 p;
    public final t83 q;
    public final vl2 r;
    public final mv2 s;
    public boolean t = false;
    public final Long u;

    public oi2(Context context, e51 e51Var, yu2 yu2Var, b03 b03Var, j23 j23Var, mw2 mw2Var, oc2 oc2Var, bv2 bv2Var, zw2 zw2Var, nc3 nc3Var, ea3 ea3Var, t83 t83Var, vl2 vl2Var, mv2 mv2Var) {
        this.f = context;
        this.g = e51Var;
        this.h = yu2Var;
        this.i = b03Var;
        this.j = j23Var;
        this.k = mw2Var;
        this.l = oc2Var;
        this.m = bv2Var;
        this.n = zw2Var;
        this.o = nc3Var;
        this.p = ea3Var;
        this.q = t83Var;
        this.r = vl2Var;
        this.s = mv2Var;
        hg4.C.k.getClass();
        this.u = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.zn2
    public final void C2(String str) {
        this.j.b(str);
    }

    @Override // defpackage.zn2
    public final void D0(boolean z) throws IOException, RemoteException {
        try {
            Context context = this.f;
            kf3.U(context).r0(z);
            if (z) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e) {
                hg4.C.h.d("clearStorageOnGpidPubDisable_scar", e);
            }
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    @Override // defpackage.zn2
    public final synchronized void I1(String str) {
        Context context = this.f;
        mz1.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) tw1.e.c.a(mz1.s4)).booleanValue()) {
                hg4.C.l.F(context, this.g, true, null, str, null, null, this.p, null, null, this.n.f());
            }
        }
    }

    @Override // defpackage.zn2
    public final synchronized void Q(boolean z) {
        jd1 jd1Var = hg4.C.i;
        synchronized (jd1Var) {
            jd1Var.a = z;
        }
    }

    @Override // defpackage.zn2
    public final synchronized void S1(float f) {
        jd1 jd1Var = hg4.C.i;
        synchronized (jd1Var) {
            jd1Var.b = f;
        }
    }

    @Override // defpackage.zn2
    public final void S2(u10 u10Var, String str) throws JSONException {
        String strM;
        ni2 ni2Var;
        Context context = this.f;
        mz1.a(context);
        if (((Boolean) tw1.e.c.a(mz1.z4)).booleanValue()) {
            try {
                lf4 lf4Var = hg4.C.c;
                strM = lf4.M(context);
            } catch (RemoteException | RuntimeException e) {
                hg4.C.h.d("NonagonMobileAdsSettingManager_AppId", e);
            }
        } else {
            strM = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strM) ? str : strM;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        iz1 iz1Var = mz1.s4;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        boolean zBooleanValue = ((Boolean) kz1Var.a(iz1Var)).booleanValue();
        iz1 iz1Var2 = mz1.a1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) kz1Var2.a(iz1Var2)).booleanValue();
        if (((Boolean) kz1Var2.a(iz1Var2)).booleanValue()) {
            ni2Var = new ni2(this, (Runnable) oi0.l1(u10Var), 0);
        } else {
            ni2Var = null;
            z = zBooleanValue2;
        }
        ni2 ni2Var2 = ni2Var;
        if (z) {
            hg4.C.l.F(this.f, this.g, true, null, str2, null, ni2Var2, this.p, this.s, this.u, this.n.f());
        }
    }

    @Override // defpackage.zn2
    public final synchronized void b() {
        if (this.t) {
            gi2.i0("Mobile ads is initialized already.");
            return;
        }
        Context context = this.f;
        mz1.a(context);
        e51 e51Var = this.g;
        mv2 mv2Var = this.s;
        hg4 hg4Var = hg4.C;
        hg4Var.h.b(context, e51Var, mv2Var);
        this.r.b();
        hg4Var.j.n(context);
        this.t = true;
        this.k.a();
        j23 j23Var = this.j;
        j23Var.getClass();
        ra4 ra4VarG = hg4Var.h.g();
        ra4VarG.c.add(new i23(j23Var, 2));
        j23Var.f.execute(new i23(j23Var, 0));
        iz1 iz1Var = mz1.u4;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            bv2 bv2Var = this.m;
            if (!bv2Var.f.getAndSet(true)) {
                ra4 ra4VarG2 = hg4Var.h.g();
                ra4VarG2.c.add(new av2(bv2Var, 0));
            }
            bv2Var.c.execute(new av2(bv2Var, 2));
        }
        this.n.a();
        if (((Boolean) tw1Var.c.a(mz1.X9)).booleanValue()) {
            final int i = 3;
            md2.a.execute(new Runnable(this) { // from class: mi2
                public final /* synthetic */ oi2 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws ze4 {
                    String strA;
                    m12 m12Var;
                    boolean z;
                    String str;
                    switch (i) {
                        case 0:
                            i41.J(this.g.f, true);
                            return;
                        case 1:
                            oi2 oi2Var = this.g;
                            xz1 xz1Var = hg4.C.n;
                            Context context2 = oi2Var.f;
                            mv2 mv2Var2 = oi2Var.s;
                            if (xz1Var.b.getAndSet(true)) {
                                return;
                            }
                            xz1Var.c = context2;
                            xz1Var.d = mv2Var2;
                            if (xz1Var.f != null || context2 == null || (strA = sl.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                return;
                            }
                            xz1Var.a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(strA)) {
                                intent.setPackage(strA);
                            }
                            context2.bindService(intent, xz1Var, 33);
                            return;
                        case 2:
                            oi2 oi2Var2 = this.g;
                            oi2Var2.getClass();
                            t92 t92Var = new t92("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            nc3 nc3Var = oi2Var2.o;
                            nc3Var.getClass();
                            try {
                                try {
                                    IBinder iBinderB = pu1.z(nc3Var.f).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        m12Var = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        m12Var = iInterfaceQueryLocalInterface instanceof m12 ? (m12) iInterfaceQueryLocalInterface : new m12(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                    }
                                    Parcel parcelU = m12Var.U();
                                    iv1.e(parcelU, t92Var);
                                    m12Var.M0(parcelU, 1);
                                    return;
                                } catch (Exception e) {
                                    throw new ze4(e);
                                }
                            } catch (RemoteException e2) {
                                gi2.i0("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
                                return;
                            } catch (ze4 e3) {
                                gi2.i0("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
                                return;
                            }
                        default:
                            oi2 oi2Var3 = this.g;
                            hg4 hg4Var2 = hg4.C;
                            ra4 ra4VarG3 = hg4Var2.h.g();
                            ra4VarG3.h();
                            synchronized (ra4VarG3.a) {
                                z = ra4VarG3.y;
                            }
                            if (z) {
                                ra4 ra4VarG4 = hg4Var2.h.g();
                                ra4VarG4.h();
                                synchronized (ra4VarG4.a) {
                                    str = ra4VarG4.z;
                                }
                                if (hg4Var2.o.b(oi2Var3.f, str, oi2Var3.g.f)) {
                                    return;
                                }
                                hg4Var2.h.g().e(false);
                                hg4Var2.h.g().f("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) tw1Var.c.a(mz1.Kb)).booleanValue()) {
            final int i2 = 2;
            md2.a.execute(new Runnable(this) { // from class: mi2
                public final /* synthetic */ oi2 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws ze4 {
                    String strA;
                    m12 m12Var;
                    boolean z;
                    String str;
                    switch (i2) {
                        case 0:
                            i41.J(this.g.f, true);
                            return;
                        case 1:
                            oi2 oi2Var = this.g;
                            xz1 xz1Var = hg4.C.n;
                            Context context2 = oi2Var.f;
                            mv2 mv2Var2 = oi2Var.s;
                            if (xz1Var.b.getAndSet(true)) {
                                return;
                            }
                            xz1Var.c = context2;
                            xz1Var.d = mv2Var2;
                            if (xz1Var.f != null || context2 == null || (strA = sl.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                return;
                            }
                            xz1Var.a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(strA)) {
                                intent.setPackage(strA);
                            }
                            context2.bindService(intent, xz1Var, 33);
                            return;
                        case 2:
                            oi2 oi2Var2 = this.g;
                            oi2Var2.getClass();
                            t92 t92Var = new t92("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            nc3 nc3Var = oi2Var2.o;
                            nc3Var.getClass();
                            try {
                                try {
                                    IBinder iBinderB = pu1.z(nc3Var.f).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        m12Var = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        m12Var = iInterfaceQueryLocalInterface instanceof m12 ? (m12) iInterfaceQueryLocalInterface : new m12(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                    }
                                    Parcel parcelU = m12Var.U();
                                    iv1.e(parcelU, t92Var);
                                    m12Var.M0(parcelU, 1);
                                    return;
                                } catch (Exception e) {
                                    throw new ze4(e);
                                }
                            } catch (RemoteException e2) {
                                gi2.i0("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
                                return;
                            } catch (ze4 e3) {
                                gi2.i0("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
                                return;
                            }
                        default:
                            oi2 oi2Var3 = this.g;
                            hg4 hg4Var2 = hg4.C;
                            ra4 ra4VarG3 = hg4Var2.h.g();
                            ra4VarG3.h();
                            synchronized (ra4VarG3.a) {
                                z = ra4VarG3.y;
                            }
                            if (z) {
                                ra4 ra4VarG4 = hg4Var2.h.g();
                                ra4VarG4.h();
                                synchronized (ra4VarG4.a) {
                                    str = ra4VarG4.z;
                                }
                                if (hg4Var2.o.b(oi2Var3.f, str, oi2Var3.g.f)) {
                                    return;
                                }
                                hg4Var2.h.g().e(false);
                                hg4Var2.h.g().f("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) tw1Var.c.a(mz1.o3)).booleanValue()) {
            final int i3 = 0;
            md2.a.execute(new Runnable(this) { // from class: mi2
                public final /* synthetic */ oi2 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws ze4 {
                    String strA;
                    m12 m12Var;
                    boolean z;
                    String str;
                    switch (i3) {
                        case 0:
                            i41.J(this.g.f, true);
                            return;
                        case 1:
                            oi2 oi2Var = this.g;
                            xz1 xz1Var = hg4.C.n;
                            Context context2 = oi2Var.f;
                            mv2 mv2Var2 = oi2Var.s;
                            if (xz1Var.b.getAndSet(true)) {
                                return;
                            }
                            xz1Var.c = context2;
                            xz1Var.d = mv2Var2;
                            if (xz1Var.f != null || context2 == null || (strA = sl.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                return;
                            }
                            xz1Var.a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(strA)) {
                                intent.setPackage(strA);
                            }
                            context2.bindService(intent, xz1Var, 33);
                            return;
                        case 2:
                            oi2 oi2Var2 = this.g;
                            oi2Var2.getClass();
                            t92 t92Var = new t92("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            nc3 nc3Var = oi2Var2.o;
                            nc3Var.getClass();
                            try {
                                try {
                                    IBinder iBinderB = pu1.z(nc3Var.f).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        m12Var = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        m12Var = iInterfaceQueryLocalInterface instanceof m12 ? (m12) iInterfaceQueryLocalInterface : new m12(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                    }
                                    Parcel parcelU = m12Var.U();
                                    iv1.e(parcelU, t92Var);
                                    m12Var.M0(parcelU, 1);
                                    return;
                                } catch (Exception e) {
                                    throw new ze4(e);
                                }
                            } catch (RemoteException e2) {
                                gi2.i0("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
                                return;
                            } catch (ze4 e3) {
                                gi2.i0("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
                                return;
                            }
                        default:
                            oi2 oi2Var3 = this.g;
                            hg4 hg4Var2 = hg4.C;
                            ra4 ra4VarG3 = hg4Var2.h.g();
                            ra4VarG3.h();
                            synchronized (ra4VarG3.a) {
                                z = ra4VarG3.y;
                            }
                            if (z) {
                                ra4 ra4VarG4 = hg4Var2.h.g();
                                ra4VarG4.h();
                                synchronized (ra4VarG4.a) {
                                    str = ra4VarG4.z;
                                }
                                if (hg4Var2.o.b(oi2Var3.f, str, oi2Var3.g.f)) {
                                    return;
                                }
                                hg4Var2.h.g().e(false);
                                hg4Var2.h.g().f("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) tw1Var.c.a(mz1.Z4)).booleanValue()) {
            if (((Boolean) tw1Var.c.a(mz1.a5)).booleanValue()) {
                final int i4 = 1;
                md2.a.execute(new Runnable(this) { // from class: mi2
                    public final /* synthetic */ oi2 g;

                    {
                        this.g = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws ze4 {
                        String strA;
                        m12 m12Var;
                        boolean z;
                        String str;
                        switch (i4) {
                            case 0:
                                i41.J(this.g.f, true);
                                return;
                            case 1:
                                oi2 oi2Var = this.g;
                                xz1 xz1Var = hg4.C.n;
                                Context context2 = oi2Var.f;
                                mv2 mv2Var2 = oi2Var.s;
                                if (xz1Var.b.getAndSet(true)) {
                                    return;
                                }
                                xz1Var.c = context2;
                                xz1Var.d = mv2Var2;
                                if (xz1Var.f != null || context2 == null || (strA = sl.a(context2)) == null || strA.equals(context2.getPackageName())) {
                                    return;
                                }
                                xz1Var.a = context2.getApplicationContext();
                                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                                if (!TextUtils.isEmpty(strA)) {
                                    intent.setPackage(strA);
                                }
                                context2.bindService(intent, xz1Var, 33);
                                return;
                            case 2:
                                oi2 oi2Var2 = this.g;
                                oi2Var2.getClass();
                                t92 t92Var = new t92("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                nc3 nc3Var = oi2Var2.o;
                                nc3Var.getClass();
                                try {
                                    try {
                                        IBinder iBinderB = pu1.z(nc3Var.f).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (iBinderB == null) {
                                            m12Var = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            m12Var = iInterfaceQueryLocalInterface instanceof m12 ? (m12) iInterfaceQueryLocalInterface : new m12(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                        }
                                        Parcel parcelU = m12Var.U();
                                        iv1.e(parcelU, t92Var);
                                        m12Var.M0(parcelU, 1);
                                        return;
                                    } catch (Exception e) {
                                        throw new ze4(e);
                                    }
                                } catch (RemoteException e2) {
                                    gi2.i0("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
                                    return;
                                } catch (ze4 e3) {
                                    gi2.i0("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
                                    return;
                                }
                            default:
                                oi2 oi2Var3 = this.g;
                                hg4 hg4Var2 = hg4.C;
                                ra4 ra4VarG3 = hg4Var2.h.g();
                                ra4VarG3.h();
                                synchronized (ra4VarG3.a) {
                                    z = ra4VarG3.y;
                                }
                                if (z) {
                                    ra4 ra4VarG4 = hg4Var2.h.g();
                                    ra4VarG4.h();
                                    synchronized (ra4VarG4.a) {
                                        str = ra4VarG4.z;
                                    }
                                    if (hg4Var2.o.b(oi2Var3.f, str, oi2Var3.g.f)) {
                                        return;
                                    }
                                    hg4Var2.h.g().e(false);
                                    hg4Var2.h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.zn2
    public final void b2(ne3 ne3Var) {
        oc2 oc2Var = this.l;
        Context context = this.f;
        oc2Var.getClass();
        mc2 mc2VarM = mc2.m(context);
        vb2 vb2Var = (vb2) ((ba4) mc2VarM.i).d();
        ((ym) mc2VarM.g).getClass();
        vb2Var.a(-1, System.currentTimeMillis());
        if (((Boolean) tw1.e.c.a(mz1.A0)).booleanValue() && oc2Var.a(context) && oc2.g(context)) {
            synchronized (oc2Var.i) {
            }
        }
    }

    @Override // defpackage.zn2
    public final synchronized boolean i() {
        boolean z;
        jd1 jd1Var = hg4.C.i;
        synchronized (jd1Var) {
            z = jd1Var.a;
        }
        return z;
    }

    @Override // defpackage.zn2
    public final void i0(String str) {
        if (((Boolean) tw1.e.c.a(mz1.ja)).booleanValue()) {
            hg4.C.h.g = str;
        }
    }

    @Override // defpackage.zn2
    public final void j2(u10 u10Var, String str) {
        if (u10Var == null) {
            gi2.Z("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) oi0.l1(u10Var);
        if (context == null) {
            gi2.Z("Context is null. Failed to open debug menu.");
            return;
        }
        mq1 mq1Var = new mq1(context);
        mq1Var.d = str;
        mq1Var.e = this.g.f;
        mq1Var.b();
    }

    @Override // defpackage.zn2
    public final synchronized float k() {
        return hg4.C.i.a();
    }

    @Override // defpackage.zn2
    public final List m() {
        return this.k.b();
    }

    @Override // defpackage.zn2
    public final String n() {
        return this.g.f;
    }

    @Override // defpackage.zn2
    public final void u() {
        this.k.q = false;
    }

    @Override // defpackage.zn2
    public final void w3(ms2 ms2Var) {
        this.n.e(ms2Var, yw2.g);
    }

    @Override // defpackage.zn2
    public final void x2(u62 u62Var) {
        this.q.X(u62Var);
    }

    @Override // defpackage.zn2
    public final void y2(d52 d52Var) {
        mw2 mw2Var = this.k;
        mw2Var.getClass();
        mw2Var.e.f.c(new n62(mw2Var, d52Var, 24), mw2Var.j);
    }
}
