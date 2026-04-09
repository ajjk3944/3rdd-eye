package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.View;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class aw implements s6, p81, ix, ki, f90 {

    /* renamed from: f, reason: collision with root package name */
    public static aw f9449f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9450a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9451b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9452c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9453d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9454e;

    public aw(Context context, w81 w81Var, w81 w81Var2, cs1 cs1Var, za.a aVar, ix0 ix0Var, qd0 qd0Var) {
        this.f9450a = 17;
        this.f9451b = context;
        this.f9452c = cs1Var;
        this.f9453d = aVar;
        this.f9454e = qd0Var;
    }

    public static final boolean B(Context context) {
        if (((Boolean) am.f9358c.u()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return ((String) ya.f0.K(context).f37477b).toLowerCase(Locale.ROOT).equals("ru");
    }

    public static aw f(Reader reader, Bundle bundle) {
        try {
            try {
                return new aw(new JsonReader(reader), bundle);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e2) {
                throw new zp0("unable to parse ServerResponse", e2);
            }
        } finally {
            tb.b.d(reader);
        }
    }

    public static synchronized aw o(Context context) {
        try {
            aw awVar = f9449f;
            if (awVar != null) {
                return awVar;
            }
            Context applicationContext = context.getApplicationContext();
            sk.a(applicationContext);
            ua.j jVar = ua.j.C;
            ya.c0 c0VarI = jVar.f35265h.i();
            c0VarI.o(applicationContext);
            applicationContext.getClass();
            tb.a aVar = jVar.f35267k;
            aVar.getClass();
            dw dwVar = jVar.f35281y;
            al0.E(dw.class, dwVar);
            aw awVar2 = new aw(applicationContext, aVar, c0VarI, dwVar);
            f9449f = awVar2;
            vv vvVar = (vv) ((es1) awVar2.f9452c).a();
            SharedPreferences sharedPreferences = vvVar.f17727b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(vvVar);
            vvVar.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            pk pkVar = sk.Y0;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                vvVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
            } else {
                vvVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            gw gwVar = (gw) ((es1) f9449f.f9454e).a();
            if (((Boolean) sVar.f36166c.a(sk.S0)).booleanValue()) {
                HashMap mapR = ya.f0.R((String) sVar.f36166c.a(sk.T0));
                Iterator it = mapR.keySet().iterator();
                while (it.hasNext()) {
                    gwVar.b((String) it.next());
                }
                gwVar.a(new fw(gwVar, mapR));
            }
            return f9449f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void q(Object obj) {
        bs0 bs0Var;
        to0 to0Var = (to0) this.f9454e;
        u30 u30Var = (u30) obj;
        synchronized (to0Var) {
            if (u30Var != null) {
                try {
                    u30Var.b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (to0Var.f16906m) {
                to0Var.c();
            }
            if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var = (bs0) this.f9451b) == null) {
                cs0 cs0Var = to0Var.f16903i;
                yr0 yr0Var = (yr0) this.f9452c;
                yr0Var.j(u30Var.f14532a.f10544b);
                yr0Var.c0(u30Var.f14537f.f9997a);
                yr0Var.c(true);
                cs0Var.b(yr0Var.F1());
            } else {
                bs0Var.e(u30Var.f14532a.f10544b);
                bs0Var.g(u30Var.f14537f.f9997a);
                yr0 yr0Var2 = (yr0) this.f9452c;
                yr0Var2.c(true);
                bs0Var.a(yr0Var2);
                bs0Var.h();
            }
        }
    }

    public void A(int i4, vd.b bVar) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.I2)).booleanValue()) {
            t7.m mVar = new t7.m(this, i4, 7);
            bVar.a(new q81(0, bVar, mVar), (w81) this.f9451b);
        }
    }

    public String C() {
        int i4 = ((fg) this.f9454e).f11160a;
        return d.h.q(i4, "LATMTD", new StringBuilder(String.valueOf(i4).length() + 6));
    }

    @Override // com.google.android.gms.internal.ads.f90
    public wp0 a() {
        return (wp0) this.f9451b;
    }

    public oq b(Context context, za.a aVar, cs0 cs0Var) {
        oq oqVar;
        String str;
        synchronized (this.f9452c) {
            try {
                if (((oq) this.f9454e) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (B(context)) {
                        str = (String) va.s.f36163e.f36166c.a(sk.f16067c);
                    } else {
                        str = (String) nn1.f14347l.u();
                    }
                    this.f9454e = new oq(applicationContext, aVar, str, cs0Var);
                }
                oqVar = (oq) this.f9454e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oqVar;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public void c(Object obj) throws JSONException {
        jq jqVar = (jq) obj;
        ya.a0.m("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f9452c;
        gx gxVar = (gx) this.f9453d;
        qq qqVar = (qq) this.f9454e;
        hq hqVar = (hq) this.f9451b;
        qqVar.getClass();
        try {
            ya.f0 f0Var = ua.j.C.f35261c;
            String string = UUID.randomUUID().toString();
            no.j.b(string, new pq(qqVar, hqVar, gxVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, string);
            jSONObject.put("args", ((nq) qqVar.f15397d).h(obj2));
            jqVar.c((String) qqVar.f15395b, jSONObject);
        } catch (Exception e2) {
            try {
                gxVar.d(e2);
                za.i.f("Unable to invokeJavascript", e2);
            } finally {
                hqVar.y();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f1  */
    @Override // com.google.android.gms.internal.ads.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(byte[] r40, int r41, int r42, ca.c r43) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aw.d(byte[], int, int, ca.c):void");
    }

    @Override // com.google.android.gms.internal.ads.f90
    public void e(boolean z3, Context context, m60 m60Var) throws e90 {
        boolean zO2;
        is isVar = (is) this.f9452c;
        try {
            int iOrdinal = ((pa.b) this.f9453d).ordinal();
            if (iOrdinal == 1) {
                zO2 = isVar.O2(new vb.b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zO2 = isVar.V(new vb.b(context));
                    }
                    throw new e90("Adapter failed to show.");
                }
                zO2 = isVar.F3(new vb.b(context));
            }
            if (zO2) {
                o60 o60Var = (o60) this.f9454e;
                if (o60Var == null) {
                    return;
                }
                if (((Boolean) va.s.f36163e.f36166c.a(sk.T1)).booleanValue() || ((wp0) this.f9451b).Y != 2) {
                    return;
                }
                o60Var.a();
                return;
            }
            throw new e90("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new e90(th2);
        }
    }

    public void g(ha haVar, b5.i0 i0Var) {
        List list;
        x9 x9Var = (x9) i0Var.f1822c;
        if (x9Var == null || x9Var.f18326e < System.currentTimeMillis()) {
            p(haVar);
            return;
        }
        String strD = haVar.d();
        synchronized (this) {
            list = (List) ((HashMap) this.f9451b).remove(strD);
        }
        if (list != null) {
            if (na.f14189a) {
                na.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strD);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((fk0) this.f9454e).i((ha) it.next(), i0Var, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo163h(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aw.mo163h(java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i(com.google.android.gms.internal.ads.gg r9, com.google.android.gms.internal.ads.w5 r10) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aw.i(com.google.android.gms.internal.ads.gg, com.google.android.gms.internal.ads.w5):boolean");
    }

    @Override // com.google.android.gms.internal.ads.ki
    public void l(hk hkVar) {
        ni niVar = (ni) ((ik) hkVar.f14755b).C().s();
        mi miVar = (mi) this.f9451b;
        niVar.b();
        ((oi) niVar.f14755b).B(miVar);
        hkVar.b();
        ((ik) hkVar.f14755b).H((oi) niVar.e());
        ek ekVar = (ek) ((ik) hkVar.f14755b).A().s();
        String str = (String) this.f9452c;
        ekVar.b();
        ((fk) ekVar.f14755b).B(str);
        dj djVar = (dj) this.f9453d;
        ekVar.b();
        ((fk) ekVar.f14755b).C(djVar);
        hkVar.b();
        ((ik) hkVar.f14755b).G((fk) ekVar.e());
        String str2 = (String) this.f9454e;
        hkVar.b();
        ((ik) hkVar.f14755b).B(str2);
    }

    public oq m(Context context, za.a aVar, cs0 cs0Var) {
        oq oqVar;
        String str;
        synchronized (this.f9451b) {
            try {
                if (((oq) this.f9453d) == null) {
                    if (B(context)) {
                        str = (String) va.s.f36163e.f36166c.a(sk.f16067c);
                    } else if (((Boolean) am.g.u()).booleanValue()) {
                        str = (String) va.s.f36163e.f36166c.a(sk.f16033a);
                    } else {
                        str = (String) va.s.f36163e.f36166c.a(sk.f16050b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f9453d = new oq(context, aVar, str, cs0Var);
                }
                oqVar = (oq) this.f9453d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oqVar;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        bs0 bs0Var;
        switch (this.f9450a) {
            case 5:
                ua.j.C.f35265h.f("OpenGmsgHandler.attributionReportingManager", th2);
                return;
            case 8:
                za.i.h("Failed to parse gmsg params for: ".concat(String.valueOf((Uri) this.f9453d)));
                return;
            case 10:
                ((ex) ((t20) this.f9454e).f16674e).c(new ty(this, th2, (ct0) this.f9451b, (String) this.f9452c, (z.e) this.f9453d));
                return;
            case 14:
                return;
            case 20:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.B6)).booleanValue()) {
                    ya.a0.n("Banner ad failed to load", th2);
                }
                to0 to0Var = (to0) this.f9454e;
                synchronized (to0Var) {
                    try {
                        p10 p10Var = (p10) this.f9453d;
                        va.w1 w1VarT = yo0.t(th2, ((y40) p10Var.f14850s.a()).f18636l);
                        to0Var.f16907n = w1VarT;
                        ((h60) p10Var.f14844m.a()).o(w1VarT);
                        al0.o(w1VarT.f36177a, "BannerAdLoader.onFailure", th2);
                        if (to0Var.f16906m) {
                            to0Var.f();
                            to0Var.f16902h.v1(to0Var.j.a());
                        }
                        if (!((Boolean) ol.f14724c.u()).booleanValue() || (bs0Var = (bs0) this.f9451b) == null) {
                            cs0 cs0Var = to0Var.f16903i;
                            yr0 yr0Var = (yr0) this.f9452c;
                            yr0Var.i(w1VarT);
                            yr0Var.h(th2);
                            yr0Var.c(false);
                            cs0Var.b(yr0Var.F1());
                        } else {
                            bs0Var.f(w1VarT);
                            yr0 yr0Var2 = (yr0) this.f9452c;
                            yr0Var2.h(th2);
                            yr0Var2.c(false);
                            bs0Var.a(yr0Var2);
                            bs0Var.h();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 23:
                return;
            default:
                yr0 yr0Var3 = (yr0) this.f9451b;
                if (yr0Var3 == null) {
                    return;
                }
                yr0Var3.c(false);
                bs0 bs0Var2 = (bs0) this.f9452c;
                if (bs0Var2 == null) {
                    ((ct0) this.f9454e).f10217f.b(yr0Var3.F1());
                    return;
                } else {
                    bs0Var2.a(yr0Var3);
                    bs0Var2.h();
                    return;
                }
        }
    }

    public synchronized void p(ha haVar) {
        try {
            HashMap map = (HashMap) this.f9451b;
            String strD = haVar.d();
            List list = (List) map.remove(strD);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (na.f14189a) {
                na.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strD);
            }
            ha haVar2 = (ha) list.remove(0);
            map.put(strD, list);
            haVar2.k(this);
            try {
                ((BlockingQueue) this.f9453d).put(haVar2);
            } catch (InterruptedException e2) {
                na.c("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                y9 y9Var = (y9) this.f9452c;
                y9Var.f18680d = true;
                y9Var.interrupt();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public kg r(int i4) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f9453d;
        String string = i4 == 1 ? sharedPreferences.getString(C(), null) : sharedPreferences.getString(y(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrL = tb.b.l(string);
                kg kgVarF = kg.F(bn1.v(0, bArrL.length, bArrL));
                String strA = kgVarF.A();
                File fileB = mq0.b(strA, "pcam.jar", u());
                if (!fileB.exists()) {
                    fileB = mq0.b(strA, "pcam", u());
                }
                File fileB2 = mq0.b(strA, "pcbc", u());
                if (fileB.exists()) {
                    if (fileB2.exists()) {
                        return kgVarF;
                    }
                }
            } catch (ao1 unused) {
            }
        }
        return null;
    }

    public void s() {
        synchronized (this.f9451b) {
            try {
                oq oqVar = (oq) this.f9453d;
                if (oqVar != null) {
                    y50 y50Var = oqVar.f14769a;
                    iq iqVar = (iq) y50Var.f18647f;
                    if (iqVar != null) {
                        iqVar.A();
                        y50Var.f18647f = null;
                    }
                    this.f9453d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized boolean t(ha haVar) {
        try {
            HashMap map = (HashMap) this.f9451b;
            String strD = haVar.d();
            if (!map.containsKey(strD)) {
                map.put(strD, null);
                haVar.k(this);
                if (na.f14189a) {
                    na.b("new request, sending to network %s", strD);
                }
                return false;
            }
            List arrayList = (List) map.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            haVar.a("waiting-for-response");
            arrayList.add(haVar);
            map.put(strD, arrayList);
            if (na.f14189a) {
                na.b("Request for cacheKey=%s is in flight, putting on hold.", strD);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public File u() {
        File file = new File((File) this.f9451b, Integer.toString(((fg) this.f9454e).f11160a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public v60 v(Set set) {
        return new v60(set);
    }

    public cr0 w() {
        hq0 hq0VarA = ((x50) this.f9452c).a();
        va.z2 z2Var = hq0VarA.f11944d;
        String str = hq0VarA.g;
        va.f3 f3Var = hq0VarA.f11949k;
        zq0 zq0Var = (zq0) ((pq0) this.f9451b).f15074c;
        return new cr0(z2Var, str, new ku(zq0Var.f19143a).a().j, zq0Var.g, f3Var);
    }

    public fa1 x() throws GeneralSecurityException {
        kh0 kh0Var;
        vl1 vl1VarB;
        la1 la1Var = (la1) this.f9451b;
        if (la1Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        kh0 kh0Var2 = (kh0) this.f9452c;
        if (kh0Var2 == null || (kh0Var = (kh0) this.f9453d) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (la1Var.f13434a != ((vl1) kh0Var2.f13160b).f17649a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (la1Var.f13435b != ((vl1) kh0Var.f13160b).f17649a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (la1Var.a() && ((Integer) this.f9454e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((la1) this.f9451b).a() && ((Integer) this.f9454e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ka1 ka1Var = ((la1) this.f9451b).f13438e;
        if (ka1Var == ka1.f13099e) {
            vl1VarB = nd1.f14254a;
        } else if (ka1Var == ka1.f13098d) {
            vl1VarB = nd1.a(((Integer) this.f9454e).intValue());
        } else {
            if (ka1Var != ka1.f13097c) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((la1) this.f9451b).f13438e)));
            }
            vl1VarB = nd1.b(((Integer) this.f9454e).intValue());
        }
        return new fa1((la1) this.f9451b, (kh0) this.f9452c, (kh0) this.f9453d, vl1VarB, (Integer) this.f9454e);
    }

    public String y() {
        int i4 = ((fg) this.f9454e).f11160a;
        return d.h.q(i4, "FBAMTD", new StringBuilder(String.valueOf(i4).length() + 6));
    }

    public void z() {
        try {
            ((xg0) ((cs1) this.f9452c).a()).c0(((za.a) this.f9453d).f38129a);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16329sf)).booleanValue()) {
                rt rtVarA = ((qd0) this.f9454e).a();
                rtVarA.u("action", "ptard");
                rtVarA.u("ptard", "l");
                rtVarA.v();
            }
        } catch (RemoteException | NullPointerException e2) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.tf)).booleanValue()) {
                ua.j.C.f35265h.f("Preconnect Local", e2);
            }
        }
    }

    public aw(Context context, Executor executor, gv0 gv0Var, kv0 kv0Var) {
        this.f9450a = 25;
        this.f9451b = context;
        this.f9452c = executor;
        this.f9453d = gv0Var;
    }

    public aw(Context context, tb.a aVar, ya.c0 c0Var, dw dwVar) {
        this.f9450a = 0;
        this.f9451b = aVar;
        gs1 gs1VarB = gs1.b(context);
        gs1 gs1VarB2 = gs1.b(c0Var);
        int i4 = 0;
        this.f9452c = es1.b(new wv(gs1VarB, gs1VarB2, i4));
        gs1 gs1VarB3 = gs1.b(aVar);
        es1 es1VarB = es1.b(new yv(gs1VarB3, gs1VarB2, gs1.b(dwVar), i4));
        this.f9453d = es1VarB;
        this.f9454e = es1.b(new hw(gs1VarB, new zv(gs1VarB3, es1VarB), 0));
    }

    public aw(View view, qz qzVar, n40 n40Var, xp0 xp0Var) {
        this.f9450a = 11;
        this.f9452c = view;
        this.f9454e = qzVar;
        this.f9451b = n40Var;
        this.f9453d = xp0Var;
    }

    public aw(k10 k10Var, t7.m mVar) {
        this.f9450a = 9;
        this.f9454e = k10Var;
        this.f9451b = mVar;
        this.f9452c = es1.b(new zm0(k10Var.f12958t, 9));
        jo0 jo0Var = new jo0(mVar, 1);
        jo0 jo0Var2 = new jo0(mVar, 2);
        jo0 jo0Var3 = new jo0(mVar, 3);
        a10 a10Var = k10Var.g;
        es1 es1Var = k10Var.f12928d;
        new g40((js1) a10Var, (js1) es1Var, (fs1) jo0Var, (js1) jo0Var2, (js1) jo0Var3, 16);
        int i4 = 5;
        new zm0(a10Var, i4);
        jo0 jo0Var4 = new jo0(mVar, 0);
        new m20(21, jo0Var4);
        new a40(es1Var, a10Var, 10);
        jo0 jo0Var5 = new jo0(mVar, i4);
        jo0 jo0Var6 = new jo0(mVar, 6);
        es1 es1Var2 = k10Var.B;
        new j90((js1) es1Var2, (fs1) jo0Var3, (fs1) jo0Var4, (js1) es1Var, (js1) jo0Var5, (js1) jo0Var6, 7);
        new yv(jo0Var4, es1Var2, es1Var, 29);
        jo0 jo0Var7 = new jo0(mVar, 4);
        es1 es1VarB = es1.b(ls.f13600r);
        es1 es1VarB2 = es1.b(nn1.f14353r);
        es1 es1VarB3 = es1.b(jz.f12895r);
        es1 es1VarB4 = es1.b(a80.E);
        int i10 = hs1.f11964b;
        LinkedHashMap linkedHashMapG = mq0.G(4);
        linkedHashMapG.put(qr0.GMS_SIGNALS, es1VarB);
        linkedHashMapG.put(qr0.BUILD_URL, es1VarB2);
        linkedHashMapG.put(qr0.HTTP, es1VarB3);
        linkedHashMapG.put(qr0.PRE_PROCESS, es1VarB4);
        es1 es1VarB5 = es1.b(new yv(jo0Var7, k10Var.g, new hs1(linkedHashMapG), 11));
        int i11 = ks1.f13231c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(es1VarB5);
        this.f9453d = es1.b(new qm0(k10Var.f12928d, new f60(new ks1(list, arrayList), 25)));
    }

    private final void j(Throwable th2) {
    }

    private final void k(Throwable th2) {
    }

    public aw(wp0 wp0Var, is isVar, pa.b bVar) {
        this.f9450a = 18;
        this.f9454e = null;
        this.f9451b = wp0Var;
        this.f9452c = isVar;
        this.f9453d = bVar;
    }

    public aw(pq0 pq0Var, x50 x50Var, Executor executor) {
        this.f9450a = 21;
        this.f9451b = pq0Var;
        this.f9452c = x50Var;
        this.f9453d = executor;
    }

    public /* synthetic */ aw(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f9450a = i4;
        this.f9451b = obj2;
        this.f9452c = obj3;
        this.f9453d = obj4;
        this.f9454e = obj;
    }

    public /* synthetic */ aw(Object obj, Object obj2, Object obj3, Object obj4, int i4, boolean z3) {
        this.f9450a = i4;
        this.f9451b = obj;
        this.f9452c = obj2;
        this.f9453d = obj3;
        this.f9454e = obj4;
    }

    public aw(int i4) {
        this.f9450a = i4;
        switch (i4) {
            case 6:
                this.f9451b = new Object();
                this.f9452c = new Object();
                break;
            case 29:
                this.f9451b = null;
                this.f9452c = null;
                this.f9453d = null;
                this.f9454e = null;
                break;
            default:
                this.f9451b = new sk0();
                this.f9452c = new sk0();
                this.f9453d = new c7();
                break;
        }
    }

    public aw(Context context, fg fgVar) {
        this.f9450a = 26;
        this.f9453d = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        mq0.N(dir, false);
        this.f9451b = dir;
        File dir2 = context.getDir("tmppccache", 0);
        mq0.N(dir2, true);
        this.f9452c = dir2;
        this.f9454e = fgVar;
    }

    public aw(Context context, String str) {
        String packageName;
        this.f9450a = 4;
        this.f9453d = context;
        this.f9454e = str;
        this.f9451b = (String) jz.f12888k.u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9452c = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        ua.j jVar = ua.j.C;
        ya.f0 f0Var = jVar.f35261c;
        linkedHashMap.put("device", ya.f0.Q());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        linkedHashMap.put("is_lite_sdk", true != ya.f0.g(context) ? "0" : "1");
        ix0 ix0Var = jVar.f35272p;
        ix0Var.getClass();
        vd.b bVarE = fx.f11274a.e(new ae(ix0Var, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((lu) bVarE.get()).j));
            linkedHashMap.put("network_fine", Integer.toString(((lu) bVarE.get()).f13627k));
        } catch (Exception e2) {
            ua.j.C.f35265h.f("CsiConfiguration.CsiConfiguration", e2);
        }
        pk pkVar = sk.Dc;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f9452c;
            ya.f0 f0Var2 = ua.j.C.f35261c;
            linkedHashMap2.put("is_bstar", true != ya.f0.e(context) ? "0" : "1");
        }
        if (((Boolean) rkVar2.a(sk.Ia)).booleanValue() && ((Boolean) rkVar2.a(sk.O2)).booleanValue()) {
            ua.j jVar2 = ua.j.C;
            if (yr1.k(jVar2.f35265h.g)) {
                return;
            }
            ((LinkedHashMap) this.f9452c).put("plugin", jVar2.f35265h.g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public aw(JsonReader jsonReader, Bundle bundle) throws IOException {
        this.f9450a = 22;
        this.f9454e = bundle;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue() && bundle != null) {
            d.h.D(ua.j.C.f35267k, bundle, "server-response-parse-start");
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        yp0 yp0Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new wp0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        yp0Var = new yp0(jsonReader);
                        if (((Boolean) va.s.f36163e.f36166c.a(sk.C2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", yp0Var.f18835s);
                            bundle.putLong("normalize-ad-response-end", yp0Var.f18836t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectY = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectY = pd.b.y(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new cq0(strNextString, jSONObjectY));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f9453d = arrayList2;
        this.f9451b = arrayList;
        this.f9452c = yp0Var == null ? new yp0(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : yp0Var;
    }

    public aw(y9 y9Var, BlockingQueue blockingQueue, fk0 fk0Var) {
        this.f9450a = 3;
        this.f9451b = new HashMap();
        this.f9454e = fk0Var;
        this.f9452c = y9Var;
        this.f9453d = blockingQueue;
    }

    public aw(t20 t20Var, ct0 ct0Var, String str, z.e eVar) {
        this.f9450a = 10;
        this.f9451b = ct0Var;
        this.f9452c = str;
        this.f9453d = eVar;
        Objects.requireNonNull(t20Var);
        this.f9454e = t20Var;
    }

    public aw(d80 d80Var) {
        this.f9450a = 27;
        this.f9454e = this;
        this.f9451b = d80Var;
        es1 es1VarB = es1.b(new k50((gs1) d80Var.f10364b, (gs1) d80Var.f10366d, (es1) d80Var.f10372l, es1.b(ls.f13607y), (es1) d80Var.f10374n, (es1) d80Var.f10370i, (gs1) d80Var.f10367e));
        this.f9452c = es1VarB;
        this.f9453d = es1.b(new k50((gs1) d80Var.f10366d, es1VarB, (es1) d80Var.f10372l, (es1) d80Var.f10371k, es1.b(jz.A), new tx0(3, this), (gs1) d80Var.f10367e));
    }

    public aw(u51 u51Var, rt rtVar, l90 l90Var, ce1 ce1Var) {
        Object objQ;
        this.f9450a = 28;
        if (u51Var != null) {
            objQ = x41.q(u51Var);
        } else {
            v41 v41Var = x41.f18307b;
            objQ = u51.f17096e;
        }
        this.f9451b = objQ;
        this.f9452c = rtVar;
        this.f9453d = l90Var;
        this.f9454e = ce1Var;
    }

    public aw(List list) throws NumberFormatException {
        int i4;
        this.f9450a = 2;
        this.f9451b = new sk0();
        this.f9452c = new sk0();
        t7 t7Var = new t7();
        this.f9453d = t7Var;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = bq0.f9768a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                t7Var.f16723d = new int[strArrSplit.length];
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    int[] iArr = t7Var.f16723d;
                    try {
                        i4 = Integer.parseInt(strArrSplit[i10].trim(), 16);
                    } catch (RuntimeException unused) {
                        i4 = 0;
                    }
                    iArr[i10] = i4;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        t7Var.f16724e = Integer.parseInt(strArrSplit2[0]);
                        t7Var.f16725f = Integer.parseInt(strArrSplit2[1]);
                        t7Var.f16721b = true;
                    } catch (RuntimeException e2) {
                        ls.y("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }
}
