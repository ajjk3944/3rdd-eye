package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.Objects;
import java.io.IOException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ne0 implements p81, qg0, ki, lr0, n40, ua.d, bl0, fp0, c80, o6.e, OnFailureListener, k31, ll1, ko1, l31, rd0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14279a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14280b;

    public /* synthetic */ ne0(int i4) {
        this.f14279a = i4;
    }

    private final void q() {
        synchronized (((pq0) this.f14280b)) {
        }
    }

    private final void r() {
        so0 so0Var = (so0) this.f14280b;
        synchronized (so0Var) {
            so0Var.f16497k = null;
        }
    }

    private final void v(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            re0 re0Var = (re0) this.f14280b;
            re0Var.f15619c = true;
            ua.j.C.f35267k.getClass();
            re0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - re0Var.f15620d), "", true);
            re0Var.f15624i.execute(new q81(25, this, str));
        }
    }

    private final void w(o40 o40Var) {
        pq0 pq0Var = (pq0) this.f14280b;
        synchronized (pq0Var) {
            pq0Var.f15075d = o40Var.f14537f;
            o40Var.a();
        }
    }

    private final void x(o40 o40Var) {
        p30 p30Var = (p30) o40Var;
        so0 so0Var = (so0) this.f14280b;
        synchronized (so0Var) {
            try {
                p30 p30Var2 = so0Var.f16497k;
                if (p30Var2 != null) {
                    p30Var2.d();
                }
                so0Var.f16497k = p30Var;
                qz qzVar = p30Var.f14877l;
                if (qzVar != null) {
                    qzVar.I0(so0Var);
                }
                so0Var.f16494f.c(new q30(p30Var, so0Var, so0Var.f16494f, so0Var.f16495h));
                p30Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ua.d
    public synchronized void a() {
        ua.d dVar = (ua.d) this.f14280b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.l31
    public /* synthetic */ Object b() {
        return (bz) this.f14280b;
    }

    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c */
    public /* synthetic */ Object mo170c(Object obj) {
        lh0.g((SQLiteDatabase) obj, (za.l) this.f14280b);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ko1
    public boolean d(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (((ko1[]) this.f14280b)[i4].d(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ko1
    public to1 e(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            ko1 ko1Var = ((ko1[]) this.f14280b)[i4];
            if (ko1Var.d(cls)) {
                return ko1Var.e(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public Object f() {
        x50 x50Var;
        synchronized (this) {
            x50Var = (x50) this.f14280b;
        }
        return x50Var;
    }

    @Override // com.google.android.gms.internal.ads.ll1
    public Object g(String str) {
        nl1 nl1Var = (nl1) this.f14280b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                return nl1Var.g(str, (Provider) obj);
            } catch (Exception unused) {
            }
        }
        return nl1Var.g(str, null);
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        switch (this.f14279a) {
            case 0:
                v(obj);
                return;
            default:
                az0 az0Var = (az0) obj;
                vy0 vy0Var = (vy0) ((ez0) this.f14280b).f10928c;
                synchronized (vy0Var.f17771m) {
                    oc ocVar = vy0Var.f17774p;
                    String strB = az0Var.b();
                    ocVar.b();
                    ((pc) ocVar.f14755b).K(strB);
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public void i(o40 o40Var) {
        switch (this.f14279a) {
            case 10:
                w(o40Var);
                return;
            case 11:
                x(o40Var);
                return;
            default:
                tp0 tp0Var = (tp0) this.f14280b;
                oc0 oc0Var = (oc0) o40Var;
                synchronized (tp0Var) {
                    try {
                        tp0Var.f16917d = oc0Var;
                        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16193k4)).booleanValue()) {
                            oc0Var.f14665u.f11255a = tp0Var.f16916c;
                        }
                        tp0Var.f16917d.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public /* synthetic */ vd.b j(iu iuVar) {
        return ((xg0) ((cs1) ((pq0) this.f14280b).f15075d).a()).i4(iuVar, Binder.getCallingUid());
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public /* bridge */ /* synthetic */ vd.b k(ce1 ce1Var, ep0 ep0Var) {
        return t(ce1Var, ep0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.ki
    public void l(hk hkVar) {
        ek ekVar = (ek) ((ik) hkVar.f14755b).A().s();
        dj djVar = (dj) this.f14280b;
        ekVar.b();
        ((fk) ekVar.f14755b).C(djVar);
        hkVar.b();
        ((ik) hkVar.f14755b).G((fk) ekVar.e());
    }

    @Override // com.google.android.gms.internal.ads.k31
    public Iterator m(rg0 rg0Var, CharSequence charSequence) {
        return new h31(charSequence, new rg0(((a31) this.f14280b).f9199c.matcher(charSequence)), 1);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f14279a) {
            case 0:
                synchronized (this) {
                    re0 re0Var = (re0) this.f14280b;
                    re0Var.f15619c = true;
                    ua.j.C.f35267k.getClass();
                    re0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - re0Var.f15620d), "Internal Error.", false);
                    re0Var.f15621e.d(new Exception());
                }
                return;
            default:
                return;
        }
    }

    @Override // ua.d
    public synchronized void o(View view) {
        ua.d dVar = (ua.d) this.f14280b;
        if (dVar != null) {
            dVar.o(view);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        aw awVar = (aw) this.f14280b;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((gv0) awVar.f9453d).c(2025, -1L, exc);
    }

    @Override // o6.e
    public void onPostMessage(WebView webView, o6.d dVar, Uri uri, boolean z3, o6.a aVar) throws JSONException {
        zt0 zt0Var = (zt0) this.f14280b;
        try {
            JSONObject jSONObject = new JSONObject(dVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                zt0Var.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap map = zt0Var.f19178d;
                vt0 vt0Var = (vt0) map.get(string2);
                if (vt0Var != null) {
                    vt0Var.c();
                    map.remove(string2);
                }
            }
        } catch (JSONException e2) {
            yo0.k("Error parsing JS message in JavaScriptSessionService.", e2);
        }
    }

    public void p(int i4) {
        p9 p9Var;
        sf0 sf0Var = (sf0) this.f14280b;
        try {
            ks0 ks0VarA = ls0.A();
            int i10 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? 7 : 6 : 5 : 4 : 3;
            ks0VarA.b();
            ((ls0) ks0VarA.f14755b).I(i10);
            if (i4 == 0) {
                rf0 rf0Var = sf0Var.f16006b;
                rf0Var.getClass();
                try {
                    p9Var = rf0Var.f15649b;
                } catch (RemoteException unused) {
                }
                ix0 ix0VarA0 = (p9Var == null || !p9Var.Z()) ? null : p9Var.a0();
                if (ix0VarA0 != null) {
                    long j = ((Bundle) ix0VarA0.f12502b).getLong("referrer_click_timestamp_seconds");
                    ks0VarA.b();
                    ((ls0) ks0VarA.f14755b).C(j);
                    long j8 = ((Bundle) ix0VarA0.f12502b).getLong("install_begin_timestamp_seconds");
                    ks0VarA.b();
                    ((ls0) ks0VarA.f14755b).D(j8);
                    boolean z3 = ((Bundle) ix0VarA0.f12502b).getBoolean("google_play_instant");
                    ks0VarA.b();
                    ((ls0) ks0VarA.f14755b).E(z3);
                    long j9 = ((Bundle) ix0VarA0.f12502b).getLong("referrer_click_timestamp_server_seconds");
                    ks0VarA.b();
                    ((ls0) ks0VarA.f14755b).F(j9);
                    long j10 = ((Bundle) ix0VarA0.f12502b).getLong("install_begin_timestamp_server_seconds");
                    ks0VarA.b();
                    ((ls0) ks0VarA.f14755b).G(j10);
                    if (!TextUtils.isEmpty(((Bundle) ix0VarA0.f12502b).getString("install_referrer"))) {
                        String string = ((Bundle) ix0VarA0.f12502b).getString("install_referrer");
                        ks0VarA.b();
                        ((ls0) ks0VarA.f14755b).B(string);
                    }
                    if (!TextUtils.isEmpty(((Bundle) ix0VarA0.f12502b).getString("install_version"))) {
                        String string2 = ((Bundle) ix0VarA0.f12502b).getString("install_version");
                        ks0VarA.b();
                        ((ls0) ks0VarA.f14755b).H(string2);
                    }
                }
            }
            p9 p9Var2 = sf0Var.f16006b.f15649b;
            p9Var2.H = 3;
            if (p9Var2.L != null) {
                jz.i("Unbinding from service.");
                p9Var2.I.unbindService(p9Var2.L);
                p9Var2.L = null;
            }
            p9Var2.K = null;
            qd0 qd0Var = sf0Var.f16007c;
            String strEncodeToString = Base64.encodeToString(((ls0) ks0VarA.e()).b(), 1);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.F5)).booleanValue()) {
                rt rtVarA = qd0Var.a();
                rtVarA.u("action", "irda");
                rtVarA.u("irdd", strEncodeToString);
                rtVarA.x();
            }
            sf0Var.f16008d.l();
        } catch (Exception e2) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.G5)).booleanValue()) {
                if (sf0Var.f16010f == null) {
                    sf0Var.f16010f = ut.c(sf0Var.f16005a);
                }
                sf0Var.f16010f.d("InstallReferrerUnsampled.onInstallReferrerSetupFinished", e2);
            } else {
                if (sf0Var.f16009e == null) {
                    sf0Var.f16009e = ut.a(sf0Var.f16005a);
                }
                sf0Var.f16009e.d("InstallReferrer.onInstallReferrerSetupFinished", e2);
            }
        }
    }

    public synchronized vd.b t(ce1 ce1Var, ep0 ep0Var, x50 x50Var) {
        y40 y40VarB;
        try {
            if (x50Var != null) {
                this.f14280b = x50Var;
            } else {
                this.f14280b = (x50) ep0Var.d((dp0) ce1Var.f10095c).c();
            }
            y40VarB = ((x50) this.f14280b).b();
        } catch (Throwable th2) {
            throw th2;
        }
        return y40VarB.c(y40VarB.b());
    }

    public void u(RemoteException remoteException) {
        ((aw) this.f14280b).z();
        if (((Boolean) va.s.f36163e.f36166c.a(sk.tf)).booleanValue()) {
            ua.j.C.f35265h.f("Preconnect Remote", remoteException);
        }
    }

    @Override // ua.d
    /* renamed from: zzc */
    public synchronized void mo171zzc() {
        ua.d dVar = (ua.d) this.f14280b;
        if (dVar != null) {
            dVar.mo171zzc();
        }
    }

    public /* synthetic */ ne0(int i4, Object obj) {
        this.f14279a = i4;
        this.f14280b = obj;
    }

    @Override // com.google.android.gms.internal.ads.n40
    /* renamed from: b */
    public /* synthetic */ va.a2 mo165b() {
        return ((qz) this.f14280b).z1();
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public void mo162c(Object obj) {
        switch (this.f14279a) {
            case 15:
                pr0 pr0Var = (pr0) this.f14280b;
                ((tr0) obj).a(pr0Var.f15080b);
                break;
            default:
                ((ru1) obj).o((IOException) this.f14280b);
                break;
        }
    }

    public /* synthetic */ ne0(qu1 qu1Var, cy1 cy1Var, a0.c0 c0Var, IOException iOException, boolean z3) {
        this.f14279a = 28;
        this.f14280b = iOException;
    }

    @Override // com.google.android.gms.internal.ads.bl0
    /* renamed from: b */
    public void mo167b() {
        switch (this.f14279a) {
            case 3:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16329sf)).booleanValue()) {
                    rt rtVarA = ((qd0) ((aw) this.f14280b).f9454e).a();
                    rtVarA.u("action", "ptard");
                    rtVarA.u("ptard", "r");
                    rtVarA.v();
                    return;
                }
                return;
            case 10:
                q();
                return;
            case 11:
                r();
                return;
            default:
                tp0 tp0Var = (tp0) this.f14280b;
                synchronized (tp0Var) {
                    tp0Var.f16917d = null;
                }
                return;
        }
    }

    public ne0(re0 re0Var) {
        this.f14279a = 0;
        Objects.requireNonNull(re0Var);
        this.f14280b = re0Var;
    }

    public ne0(sf0 sf0Var) {
        this.f14279a = 1;
        Objects.requireNonNull(sf0Var);
        this.f14280b = sf0Var;
    }

    public ne0(pq0 pq0Var) {
        this.f14279a = 10;
        Objects.requireNonNull(pq0Var);
        this.f14280b = pq0Var;
    }

    private final void s(Throwable th2) {
    }
}
