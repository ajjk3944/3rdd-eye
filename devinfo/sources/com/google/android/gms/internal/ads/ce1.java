package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ce1 implements fe1, c9, pb.c, pb.b, bb.e, y81, p81, m00, lr0, or0, zd0 {

    /* renamed from: d, reason: collision with root package name */
    public static ce1 f10092d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10093a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10094b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10095c;

    public /* synthetic */ ce1(int i4) {
        this.f10093a = i4;
    }

    public static ce1 e(qh1 qh1Var) {
        return new ce1(0, qh1Var, je1.a(qh1Var.A()));
    }

    @Override // pb.c
    public void O(nb.b bVar) {
        synchronized (((b5.i0) this.f10095c).f1823d) {
            ((gi) this.f10094b).d(new RuntimeException("Connection failed."));
        }
    }

    @Override // pb.b
    public void S(int i4) {
        ((gx) this.f10094b).d(new RuntimeException(d.h.q(i4, "onConnectionSuspended: ", new StringBuilder(String.valueOf(i4).length() + 23))));
    }

    @Override // pb.b
    public void T() {
        try {
            ((gx) this.f10094b).b((cp) ((di) ((hp) this.f10095c).f11935b).t());
        } catch (DeadObjectException e2) {
            ((gx) this.f10094b).d(e2);
        }
    }

    public x1 a(Object... objArr) {
        Constructor constructorB;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f10095c;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    constructorB = ((u1) this.f10094b).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f10095c).set(true);
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating extension", e2);
                }
            }
            constructorB = null;
        }
        if (constructorB == null) {
            return null;
        }
        try {
            return (x1) constructorB.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.y81
    /* renamed from: b */
    public l91 mo168b() {
        switch (this.f10093a) {
            case 8:
                fz fzVar = (fz) this.f10094b;
                l91 l91VarMo168b = ((y81) this.f10095c).mo168b();
                ix0 ix0Var = new ix0(13, fzVar);
                return new cz(fzVar.f11294a, l91VarMo168b, fzVar.f11305n, fzVar.f11306o, fzVar, ix0Var);
            default:
                w4 w4Var = (w4) this.f10095c;
                return new xb1((Context) this.f10094b, new pe1(null, w4Var.f17860a, w4Var.f17861b, false, (ce1) w4Var.f17862c));
        }
    }

    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c */
    public Object mo170c(Object obj) {
        lh0 lh0Var = (lh0) this.f10094b;
        sa saVar = (sa) this.f10095c;
        lh0Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(saVar.f15934a));
        contentValues.put("gws_query_id", (String) saVar.f15936c);
        contentValues.put("url", (String) saVar.f15937d);
        contentValues.put("event_state", Integer.valueOf(saVar.f15935b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        ya.f0 f0Var = ua.j.C.f35261c;
        Context context = lh0Var.f13492a;
        ya.t tVarC = ya.f0.c(context);
        if (tVarC != null) {
            try {
                tVarC.zzf(new vb.b(context));
            } catch (RemoteException e2) {
                ya.a0.n("Failed to schedule offline ping sender.", e2);
            }
        }
        return null;
    }

    public Object f(p91 p91Var) {
        return ((yd1) this.f10094b).a(p91Var.a(), ((ae1) this.f10095c).a());
    }

    public synchronized Map g() {
        try {
            if (((Map) this.f10095c) == null) {
                this.f10095c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f10094b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f10095c;
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        switch (this.f10093a) {
            case 11:
                ((ca0) this.f10095c).q((View) this.f10094b, (xh0) obj);
                return;
            case 14:
                String str = (String) obj;
                try {
                    gu guVar = (gu) this.f10095c;
                    zt ztVar = (zt) this.f10094b;
                    Parcel parcelT = guVar.T();
                    parcelT.writeString(str);
                    ng.c(parcelT, ztVar);
                    guVar.g1(parcelT, 1);
                    return;
                } catch (RemoteException e2) {
                    ya.a0.n("Service can't call client", e2);
                    return;
                }
            case 16:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f10095c;
                oj0 oj0Var = (oj0) obj;
                synchronized (dVar) {
                    try {
                        ((fj0) dVar.f19301h).b(oj0Var, (wp0) this.f10094b);
                        wp0 wp0VarA = ((fj0) dVar.f19301h).a();
                        if (wp0VarA != null) {
                            dVar.j(wp0VarA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                ((sr0) ((ai) this.f10095c).f9335f).f16527c.p1(new rg0(10, (pr0) this.f10094b));
                return;
        }
    }

    @Override // bb.e
    public void i(pa.a aVar) {
        try {
            ((es) this.f10094b).b(aVar.a());
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zd0
    public /* synthetic */ void j(Object obj, yv1 yv1Var) {
        ru1 ru1Var = (ru1) obj;
        ru1Var.h((hp1) this.f10095c, new rt(yv1Var, ((wu1) this.f10094b).f18201e));
    }

    public void k(Object obj, String str) throws IOException {
        boolean zCommit;
        String str2 = (String) this.f10094b;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f10095c;
        if (obj instanceof String) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String strValueOf = String.valueOf(obj.getClass());
                Log.e("GpidLifecycleSPHandler", a0.g.p(new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", strValueOf, " for app ", str2));
                throw new IOException(a0.g.p(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException(a0.g.p(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    @Override // com.google.android.gms.internal.ads.c9
    public void l(sk0 sk0Var) {
        f9 f9Var = (f9) this.f10095c;
        if (sk0Var.K() == 0 && (sk0Var.K() & 128) != 0) {
            sk0Var.G(6);
            int iB = sk0Var.B() / 4;
            for (int i4 = 0; i4 < iB; i4++) {
                hk0 hk0Var = (hk0) this.f10094b;
                sk0Var.H(0, 4, hk0Var.f11893a);
                hk0Var.d(0);
                int iH = hk0Var.h(16);
                hk0Var.f(3);
                if (iH == 0) {
                    hk0Var.f(13);
                } else {
                    int iH2 = hk0Var.h(13);
                    if (f9Var.f11064f.get(iH2) == null) {
                        f9Var.f11064f.put(iH2, new d9(new g(f9Var, iH2)));
                    }
                }
            }
            f9Var.f11064f.remove(0);
        }
    }

    public void m(String str) throws IOException {
        if (((SharedPreferences) this.f10095c).edit().remove(str).commit()) {
            return;
        }
        String str2 = (String) this.f10094b;
        throw new IOException(a0.g.p(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f10093a) {
            case 11:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16167i6)).booleanValue()) {
                    ua.j.C.f35265h.g("omid native display exp", th2);
                    return;
                }
                return;
            case 14:
                try {
                    gu guVar = (gu) this.f10095c;
                    va.w1 w1VarI = yo0.i(th2);
                    ya.l lVar = new ya.l(yr1.k(th2.getMessage()) ? w1VarI.f36178b : th2.getMessage(), w1VarI.f36177a);
                    Parcel parcelT = guVar.T();
                    ng.c(parcelT, lVar);
                    guVar.g1(parcelT, 2);
                    return;
                } catch (RemoteException e2) {
                    ya.a0.n("Service can't call client", e2);
                    return;
                }
            case 16:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f10095c;
                synchronized (dVar) {
                    try {
                        fj0 fj0Var = (fj0) dVar.f19301h;
                        wp0 wp0Var = (wp0) this.f10094b;
                        fj0Var.c(wp0Var);
                        wp0 wp0VarA = ((fj0) dVar.f19301h).a();
                        if (wp0Var.f18113v0) {
                            while (wp0VarA != null) {
                                dVar.j(wp0VarA);
                                wp0VarA = ((fj0) dVar.f19301h).a();
                            }
                        } else if (wp0VarA != null) {
                            dVar.j(wp0VarA);
                        }
                    } finally {
                    }
                }
                return;
            default:
                ((sr0) ((ai) this.f10095c).f9335f).f16527c.p1(new rt(21, (pr0) this.f10094b, th2));
                return;
        }
    }

    @Override // bb.e
    public /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        es esVar = (es) this.f10094b;
        bb.a0 a0Var = (bb.a0) obj;
        if (a0Var != null) {
            try {
                esVar.m3(new wr(a0Var));
            } catch (RemoteException e2) {
                za.i.f("", e2);
            }
            return new ns((fr) this.f10095c);
        }
        za.i.h("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            esVar.g("Adapter returned null.");
            return null;
        } catch (RemoteException e10) {
            za.i.f("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.m00
    public void p(String str, int i4, String str2, boolean z3) {
        switch (this.f10093a) {
            case 12:
                ab0 ab0Var = (ab0) this.f10094b;
                Map map = (Map) this.f10095c;
                HashMap map2 = new HashMap();
                map2.put("messageType", "validatorHtmlLoaded");
                map2.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
                ab0Var.f9294b.d(map2);
                break;
            default:
                gx gxVar = (gx) this.f10095c;
                if (!z3) {
                    int length = String.valueOf(i4).length();
                    StringBuilder sb2 = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Ad Web View failed to load. Error code: ");
                    sb2.append(i4);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    gxVar.d(new Exception(d.h.w(sb2, ", Failing URL: ", str2)));
                    break;
                } else {
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.E2)).booleanValue()) {
                        d.h.D(ua.j.C.f35267k, (Bundle) this.f10094b, "rendering-webview-load-html-end");
                    }
                    gxVar.b(null);
                    break;
                }
        }
    }

    public /* synthetic */ ce1(int i4, Object obj, Object obj2) {
        this.f10093a = i4;
        this.f10095c = obj;
        this.f10094b = obj2;
    }

    public /* synthetic */ ce1(Object obj, boolean z3, Object obj2, int i4) {
        this.f10093a = i4;
        this.f10094b = obj;
        this.f10095c = obj2;
    }

    public ce1() {
        this.f10093a = 25;
        this.f10094b = new HashMap();
    }

    public ce1(Context context, int i4) {
        this.f10093a = i4;
        switch (i4) {
            case 22:
                w4 w4Var = new w4(5);
                this.f10094b = context.getApplicationContext();
                this.f10095c = w4Var;
                break;
            default:
                this.f10094b = context.getPackageName();
                this.f10095c = context.getSharedPreferences("paid_storage_sp", 0);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.or0
    /* renamed from: b, reason: collision with other method in class */
    public void mo161b() {
        ui0 ui0Var = (ui0) this.f10094b;
        wk wkVar = (wk) this.f10095c;
        xk xkVar = (xk) ui0Var.f17210d;
        Parcel parcelT = xkVar.T();
        ng.e(parcelT, wkVar);
        xkVar.g1(parcelT, 1);
    }

    public ce1(u1 u1Var) {
        this.f10093a = 1;
        this.f10094b = u1Var;
        this.f10095c = new AtomicBoolean(false);
    }

    public ce1(f9 f9Var) {
        this.f10093a = 3;
        this.f10095c = f9Var;
        this.f10094b = new hk0(new byte[4], 4);
    }

    public ce1(ms msVar, es esVar, fr frVar) {
        this.f10093a = 6;
        this.f10094b = esVar;
        this.f10095c = frVar;
    }

    public ce1(xg0 xg0Var, gu guVar, zt ztVar) {
        this.f10093a = 14;
        this.f10095c = guVar;
        this.f10094b = ztVar;
    }

    public ce1(u51 u51Var, int[] iArr) {
        this.f10093a = 21;
        this.f10094b = x41.q(u51Var);
        this.f10095c = iArr;
    }

    @Override // com.google.android.gms.internal.ads.c9
    public void d(zo0 zo0Var, z1 z1Var, h9 h9Var) {
    }
}
