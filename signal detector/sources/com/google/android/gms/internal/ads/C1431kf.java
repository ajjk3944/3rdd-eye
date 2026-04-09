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
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import j2.EnumC2546b;
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
import q2.C2841s;
import q2.C2852x0;
import t2.AbstractC2907C;
import t2.C2909E;
import t2.C2911G;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1431kf implements S2, BD, InterfaceC0691Qf, InterfaceC2216z8, InterfaceC0595Kl {

    /* renamed from: f, reason: collision with root package name */
    public static C1431kf f15171f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15172a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15173b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15174c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15175d;

    /* renamed from: e, reason: collision with root package name */
    public Object f15176e;

    public C1431kf(Context context, Q2.a aVar, C2909E c2909e, C1593nf c1593nf) {
        this.f15172a = 0;
        this.f15173b = aVar;
        C1907tN c1907tNA = C1907tN.a(context);
        C1907tN c1907tNA2 = C1907tN.a(c2909e);
        int i = 0;
        this.f15174c = C1799rN.a(new C1163ff(c1907tNA, c1907tNA2, i));
        C1907tN c1907tNA3 = C1907tN.a(aVar);
        C1799rN c1799rNA = C1799rN.a(new C1271hf(c1907tNA3, c1907tNA2, C1907tN.a(c1593nf), i));
        this.f15175d = c1799rNA;
        this.f15176e = C1799rN.a(new C1808rf(c1907tNA, new C1377jf(c1907tNA3, c1799rNA), 0));
    }

    public static final boolean C(Context context) {
        if (((Boolean) AbstractC1696pa.f16173c.v()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return C2911G.K(context).f4375b.toLowerCase(Locale.ROOT).equals("ru");
    }

    public static C1431kf e(Context context, Executor executor, Cw cw) {
        C1431kf c1431kf = new C1431kf(context, executor, cw, new Hw());
        Zs zs = new Zs(3, c1431kf);
        M2.u.f(executor, "Executor must not be null");
        c3.j jVar = new c3.j();
        executor.execute(new A1.d(jVar, zs, 28, false));
        jVar.f5912b.i(new c3.h(executor, new C2255zu(3, c1431kf)));
        jVar.j();
        c1431kf.f15176e = jVar;
        return c1431kf;
    }

    public static C1431kf f(Reader reader, Bundle bundle) throws IOException {
        try {
            try {
                return new C1431kf(new JsonReader(reader), bundle);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e6) {
                throw new Tt("unable to parse ServerResponse", e6);
            }
        } finally {
            Q2.b.c(reader);
        }
    }

    public static synchronized C1431kf n(Context context) {
        try {
            C1431kf c1431kf = f15171f;
            if (c1431kf != null) {
                return c1431kf;
            }
            Context applicationContext = context.getApplicationContext();
            H9.a(applicationContext);
            p2.j jVar = p2.j.f22785C;
            C2909E c2909eI = jVar.f22795h.i();
            c2909eI.o(applicationContext);
            applicationContext.getClass();
            Q2.a aVar = jVar.f22797k;
            aVar.getClass();
            C1593nf c1593nf = jVar.f22811y;
            Cr.A(c1593nf, C1593nf.class);
            C1431kf c1431kf2 = new C1431kf(applicationContext, aVar, c2909eI, c1593nf);
            f15171f = c1431kf2;
            SharedPreferencesOnSharedPreferenceChangeListenerC1108ef sharedPreferencesOnSharedPreferenceChangeListenerC1108ef = (SharedPreferencesOnSharedPreferenceChangeListenerC1108ef) ((C1799rN) c1431kf2.f15174c).c();
            SharedPreferences sharedPreferences = sharedPreferencesOnSharedPreferenceChangeListenerC1108ef.f13917b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1108ef);
            sharedPreferencesOnSharedPreferenceChangeListenerC1108ef.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            E9 e9 = H9.f8699Y0;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1108ef.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC1108ef.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            C1755qf c1755qf = (C1755qf) ((C1799rN) f15171f.f15176e).c();
            if (((Boolean) c2841s.f23270c.a(H9.f8666S0)).booleanValue()) {
                HashMap mapR = C2911G.R((String) c2841s.f23270c.a(H9.f8672T0));
                Iterator it = mapR.keySet().iterator();
                while (it.hasNext()) {
                    c1755qf.b((String) it.next());
                }
                c1755qf.a(new C1701pf(c1755qf, mapR));
            }
            return f15171f;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void q(Object obj) {
        Xu xu;
        C1715pt c1715pt = (C1715pt) this.f15176e;
        C0830Yi c0830Yi = (C0830Yi) obj;
        synchronized (c1715pt) {
            if (c0830Yi != null) {
                try {
                    c0830Yi.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c1715pt.f16247m) {
                c1715pt.c();
            }
            if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu = (Xu) this.f15173b) == null) {
                Yu yu = c1715pt.i;
                Su su = (Su) this.f15174c;
                su.h(c0830Yi.f16600a.f12510b);
                su.s0(c0830Yi.f16605f.f14124a);
                su.b(true);
                yu.b(su.n());
            } else {
                xu.e(c0830Yi.f16600a.f12510b);
                xu.g(c0830Yi.f16605f.f14124a);
                Su su2 = (Su) this.f15174c;
                su2.b(true);
                xu.a(su2);
                xu.h();
            }
        }
    }

    public void A() {
        try {
            ((BinderC2196yp) ((InterfaceC1692pN) this.f15174c).c()).s0(((C2951a) this.f15175d).f23784a);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.qf)).booleanValue()) {
                C0697Ql c0697QlA = ((C0784Vn) this.f15176e).a();
                c0697QlA.r("action", "ptard");
                c0697QlA.r("ptard", "l");
                c0697QlA.s();
            }
        } catch (RemoteException | NullPointerException e6) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.rf)).booleanValue()) {
                p2.j.f22785C.f22795h.f("Preconnect Local", e6);
            }
        }
    }

    public void B(int i, InterfaceFutureC2326a interfaceFutureC2326a) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8610I2)).booleanValue()) {
            L2.w wVar = new L2.w(i, 7, this);
            interfaceFutureC2326a.a(new CD(interfaceFutureC2326a, 0, wVar), (ID) this.f15173b);
        }
    }

    public String D() {
        int i = ((EnumC1945u7) this.f15176e).f17066a;
        return A.f.i(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public C0416Ac a(Context context, C2951a c2951a, Yu yu) {
        C0416Ac c0416Ac;
        String str;
        synchronized (this.f15174c) {
            try {
                if (((C0416Ac) this.f15176e) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (C(context)) {
                        str = (String) C2841s.f23267e.f23270c.a(H9.f8719c);
                    } else {
                        str = (String) AbstractC0933bL.f13361l.v();
                    }
                    this.f15176e = new C0416Ac(applicationContext, c2951a, str, yu);
                }
                c0416Ac = (C0416Ac) this.f15176e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0416Ac;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0691Qf, com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) throws JSONException {
        InterfaceC2075wc interfaceC2075wc = (InterfaceC2075wc) obj;
        AbstractC2907C.m("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f15174c;
        C0657Of c0657Of = (C0657Of) this.f15175d;
        C0450Cc c0450Cc = (C0450Cc) this.f15176e;
        C1967uc c1967uc = (C1967uc) this.f15173b;
        c0450Cc.getClass();
        try {
            C2911G c2911g = p2.j.f22785C.f22790c;
            String string = UUID.randomUUID().toString();
            AbstractC0449Cb.f7607j.b(string, new C0433Bc(c0450Cc, c1967uc, c0657Of));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", ((InterfaceC2237zc) c0450Cc.f7625d).d(obj2));
            interfaceC2075wc.b((String) c0450Cc.f7623b, jSONObject);
        } catch (Exception e6) {
            try {
                c0657Of.c(e6);
                u2.k.f("Unable to invokeJavascript", e6);
            } finally {
                c1967uc.D();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public Qt c() {
        return (Qt) this.f15173b;
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11d(java.lang.Object r30) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 2018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1431kf.mo11d(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2216z8
    public void g(C2055w9 c2055w9) {
        C8 c8 = (C8) ((C2109x9) c2055w9.f13551b).C().s();
        B8 b8 = (B8) this.f15173b;
        c8.b();
        ((D8) c8.f13551b).B(b8);
        c2055w9.b();
        ((C2109x9) c2055w9.f13551b).H((D8) c8.d());
        C1893t9 c1893t9 = (C1893t9) ((C2109x9) c2055w9.f13551b).A().s();
        String str = (String) this.f15174c;
        c1893t9.b();
        ((C1947u9) c1893t9.f13551b).B(str);
        S8 s8 = (S8) this.f15175d;
        c1893t9.b();
        ((C1947u9) c1893t9.f13551b).C(s8);
        c2055w9.b();
        ((C2109x9) c2055w9.f13551b).G((C1947u9) c1893t9.d());
        String str2 = (String) this.f15176e;
        c2055w9.b();
        ((C2109x9) c2055w9.f13551b).B(str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f1  */
    @Override // com.google.android.gms.internal.ads.S2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(byte[] r40, int r41, int r42, com.google.android.gms.internal.ads.T2 r43) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1431kf.h(byte[], int, int, com.google.android.gms.internal.ads.T2):void");
    }

    public void i(C4 c42, A1.s sVar) {
        List list;
        C1834s4 c1834s4 = (C1834s4) sVar.f124c;
        if (c1834s4 == null || c1834s4.f16675e < System.currentTimeMillis()) {
            o(c42);
            return;
        }
        String strD = c42.d();
        synchronized (this) {
            list = (List) ((HashMap) this.f15173b).remove(strD);
        }
        if (list != null) {
            if (I4.f9068a) {
                I4.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strD);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((L6) this.f15176e).n((C4) it.next(), sVar, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j(com.google.android.gms.internal.ads.C1999v7 r9, com.google.android.gms.internal.ads.C1994v2 r10) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1431kf.j(com.google.android.gms.internal.ads.v7, com.google.android.gms.internal.ads.v2):boolean");
    }

    public C0416Ac m(Context context, C2951a c2951a, Yu yu) {
        C0416Ac c0416Ac;
        String str;
        synchronized (this.f15173b) {
            try {
                if (((C0416Ac) this.f15175d) == null) {
                    if (C(context)) {
                        str = (String) C2841s.f23267e.f23270c.a(H9.f8719c);
                    } else if (((Boolean) AbstractC1696pa.f16177g.v()).booleanValue()) {
                        str = (String) C2841s.f23267e.f23270c.a(H9.f8707a);
                    } else {
                        str = (String) C2841s.f23267e.f23270c.a(H9.f8714b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f15175d = new C0416Ac(context, c2951a, str, yu);
                }
                c0416Ac = (C0416Ac) this.f15175d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0416Ac;
    }

    public synchronized void o(C4 c42) {
        try {
            HashMap map = (HashMap) this.f15173b;
            String strD = c42.d();
            List list = (List) map.remove(strD);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (I4.f9068a) {
                I4.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strD);
            }
            C4 c43 = (C4) list.remove(0);
            map.put(strD, list);
            c43.k(this);
            try {
                ((BlockingQueue) this.f15175d).put(c43);
            } catch (InterruptedException e6) {
                I4.c("Couldn't add request to queue. %s", e6.toString());
                Thread.currentThread().interrupt();
                C1888t4 c1888t4 = (C1888t4) this.f15174c;
                c1888t4.f16852d = true;
                c1888t4.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public void p(boolean z6, Context context, C1760qk c1760qk) throws C0578Jl {
        boolean zO2;
        InterfaceC1860sd interfaceC1860sd = (InterfaceC1860sd) this.f15174c;
        try {
            int iOrdinal = ((EnumC2546b) this.f15175d).ordinal();
            if (iOrdinal == 1) {
                zO2 = interfaceC1860sd.O2(new S2.b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zO2 = interfaceC1860sd.E2(new S2.b(context));
                    }
                    throw new C0578Jl("Adapter failed to show.");
                }
                zO2 = interfaceC1860sd.A3(new S2.b(context));
            }
            if (zO2) {
                C1867sk c1867sk = (C1867sk) this.f15176e;
                if (c1867sk == null) {
                    return;
                }
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8673T1)).booleanValue() || ((Qt) this.f15173b).f10755Y != 2) {
                    return;
                }
                c1867sk.a();
                return;
            }
            throw new C0578Jl("Adapter failed to show.");
        } catch (Throwable th) {
            throw new C0578Jl(th);
        }
    }

    public C2215z7 r(int i) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f15175d;
        String string = i == 1 ? sharedPreferences.getString(D(), null) : sharedPreferences.getString(z(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrI = Q2.b.i(string);
                C2215z7 c2215z7F = C2215z7.F(QK.r(0, bArrI.length, bArrI));
                String strA = c2215z7F.A();
                File fileB = AbstractC0582Jp.b(strA, "pcam.jar", v());
                if (!fileB.exists()) {
                    fileB = AbstractC0582Jp.b(strA, "pcam", v());
                }
                File fileB2 = AbstractC0582Jp.b(strA, "pcbc", v());
                if (fileB.exists()) {
                    if (fileB2.exists()) {
                        return c2215z7F;
                    }
                }
            } catch (C1636oL unused) {
            }
        }
        return null;
    }

    public void s() {
        synchronized (this.f15173b) {
            try {
                C0416Ac c0416Ac = (C0416Ac) this.f15175d;
                if (c0416Ac != null) {
                    C0895ak c0895ak = c0416Ac.f7014a;
                    C2021vc c2021vc = (C2021vc) c0895ak.f13218f;
                    if (c2021vc != null) {
                        c2021vc.F();
                        c0895ak.f13218f = null;
                    }
                    this.f15175d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean t(C4 c42) {
        try {
            HashMap map = (HashMap) this.f15173b;
            String strD = c42.d();
            if (!map.containsKey(strD)) {
                map.put(strD, null);
                c42.k(this);
                if (I4.f9068a) {
                    I4.b("new request, sending to network %s", strD);
                }
                return false;
            }
            List arrayList = (List) map.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            c42.a("waiting-for-response");
            arrayList.add(c42);
            map.put(strD, arrayList);
            if (I4.f9068a) {
                I4.b("Request for cacheKey=%s is in flight, putting on hold.", strD);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        Xu xu;
        switch (this.f15172a) {
            case 5:
                p2.j.f22785C.f22795h.f("OpenGmsgHandler.attributionReportingManager", th);
                return;
            case 8:
                u2.k.h("Failed to parse gmsg params for: ".concat(String.valueOf((Uri) this.f15175d)));
                return;
            case 10:
                ((C0623Mf) ((C2189yi) this.f15176e).f17745e).a(new RunnableC0437Bg(this, th, (C2202yv) this.f15173b, (String) this.f15174c, (d4.h) this.f15175d));
                return;
            case 14:
                return;
            case 20:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.B6)).booleanValue()) {
                    AbstractC2907C.n("Banner ad failed to load", th);
                }
                C1715pt c1715pt = (C1715pt) this.f15176e;
                synchronized (c1715pt) {
                    try {
                        C0795Wh c0795Wh = (C0795Wh) this.f15175d;
                        C2852x0 c2852x0T = AbstractC1984ut.t(th, ((C0440Bj) c0795Wh.f12297s.c()).f7404l);
                        c1715pt.f16248n = c2852x0T;
                        ((C1490lk) c0795Wh.f12291m.c()).D(c2852x0T);
                        Cr.j(c2852x0T.f23273a, "BannerAdLoader.onFailure", th);
                        if (c1715pt.f16247m) {
                            c1715pt.f();
                            c1715pt.f16243h.H1(c1715pt.f16244j.a());
                        }
                        if (!((Boolean) AbstractC1049da.f13768c.v()).booleanValue() || (xu = (Xu) this.f15173b) == null) {
                            Yu yu = c1715pt.i;
                            Su su = (Su) this.f15174c;
                            su.e(c2852x0T);
                            su.d(th);
                            su.b(false);
                            yu.b(su.n());
                        } else {
                            xu.f(c2852x0T);
                            Su su2 = (Su) this.f15174c;
                            su2.d(th);
                            su2.b(false);
                            xu.a(su2);
                            xu.h();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 23:
                return;
            default:
                Su su3 = (Su) this.f15173b;
                if (su3 == null) {
                    return;
                }
                su3.b(false);
                Xu xu2 = (Xu) this.f15174c;
                if (xu2 == null) {
                    ((C2202yv) this.f15176e).f17792f.b(su3.n());
                    return;
                } else {
                    xu2.a(su3);
                    xu2.h();
                    return;
                }
        }
    }

    public File v() {
        File file = new File((File) this.f15173b, Integer.toString(((EnumC1945u7) this.f15176e).f17066a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public C0424Ak w(Set set) {
        return new C0424Ak(set);
    }

    public C1985uu x() {
        C0960bu c0960buC = ((InterfaceC0848Zj) this.f15174c).c();
        q2.a1 a1Var = c0960buC.f13482d;
        String str = c0960buC.f13485g;
        q2.g1 g1Var = c0960buC.f13488k;
        C1823ru c1823ru = (C1823ru) ((C1338iu) this.f15173b).f14823c;
        return new C1985uu(a1Var, str, new C1915te(c1823ru.f16636a).a().f17138j, c1823ru.f16642g, g1Var);
    }

    public C1737qE y() throws GeneralSecurityException {
        C1448kw c1448kw;
        C1313iK c1313iKB;
        C2060wE c2060wE = (C2060wE) this.f15173b;
        if (c2060wE == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        C1448kw c1448kw2 = (C1448kw) this.f15174c;
        if (c1448kw2 == null || (c1448kw = (C1448kw) this.f15175d) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (c2060wE.f17409a != ((C1313iK) c1448kw2.f15314b).f14720a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (c2060wE.f17410b != ((C1313iK) c1448kw.f15314b).f14720a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (c2060wE.a() && ((Integer) this.f15176e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C2060wE) this.f15173b).a() && ((Integer) this.f15176e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C2006vE c2006vE = ((C2060wE) this.f15173b).f17413e;
        if (c2006vE == C2006vE.f17239e) {
            c1313iKB = AbstractC0873aG.f13089a;
        } else if (c2006vE == C2006vE.f17238d) {
            c1313iKB = AbstractC0873aG.a(((Integer) this.f15176e).intValue());
        } else {
            if (c2006vE != C2006vE.f17237c) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((C2060wE) this.f15173b).f17413e)));
            }
            c1313iKB = AbstractC0873aG.b(((Integer) this.f15176e).intValue());
        }
        return new C1737qE((C2060wE) this.f15173b, (C1448kw) this.f15174c, (C1448kw) this.f15175d, c1313iKB, (Integer) this.f15176e);
    }

    public String z() {
        int i = ((EnumC1945u7) this.f15176e).f17066a;
        return A.f.i(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public C1431kf(Context context, ID id, ID id2, InterfaceC1692pN interfaceC1692pN, C2951a c2951a, Nx nx, C0784Vn c0784Vn) {
        this.f15172a = 17;
        this.f15173b = context;
        this.f15174c = interfaceC1692pN;
        this.f15175d = c2951a;
        this.f15176e = c0784Vn;
    }

    public C1431kf(Context context, Executor executor, Cw cw, Hw hw) {
        this.f15172a = 25;
        this.f15173b = context;
        this.f15174c = executor;
        this.f15175d = cw;
    }

    public C1431kf(View view, InterfaceC0828Yg interfaceC0828Yg, InterfaceC1759qj interfaceC1759qj, Rt rt) {
        this.f15172a = 11;
        this.f15174c = view;
        this.f15176e = interfaceC0828Yg;
        this.f15173b = interfaceC1759qj;
        this.f15175d = rt;
    }

    public C1431kf(C0710Rh c0710Rh, L2.w wVar) {
        this.f15172a = 9;
        this.f15176e = c0710Rh;
        this.f15173b = wVar;
        this.f15174c = C1799rN.a(new C0901aq(c0710Rh.f11020t, 22));
        int i = 1;
        C1013ct c1013ct = new C1013ct(wVar, i);
        C1013ct c1013ct2 = new C1013ct(wVar, 2);
        C1013ct c1013ct3 = new C1013ct(wVar, 3);
        C0540Hh c0540Hh = c0710Rh.f10995g;
        C1799rN c1799rN = c0710Rh.f10989d;
        new C1381jj(c0540Hh, c1799rN, c1013ct, c1013ct2, c1013ct3, 14);
        new C0901aq(c0540Hh, 14);
        C1013ct c1013ct4 = new C1013ct(wVar, 0);
        new C1811ri(21, c1013ct4);
        new C0902ar(c1799rN, c0540Hh, 8);
        C1013ct c1013ct5 = new C1013ct(wVar, 5);
        C1013ct c1013ct6 = new C1013ct(wVar, 6);
        C1799rN c1799rN2 = c0710Rh.f10946B;
        new C0663Ol(c1799rN2, c1013ct3, c1013ct4, c1799rN, c1013ct5, c1013ct6);
        new C1840sA(c1013ct4, c1799rN2, c1799rN, i);
        C1013ct c1013ct7 = new C1013ct(wVar, 4);
        C1799rN c1799rNA = C1799rN.a(AbstractC2022vd.f17302r);
        C1799rN c1799rNA2 = C1799rN.a(AbstractC0933bL.f13367r);
        C1799rN c1799rNA3 = C1799rN.a(AbstractC0709Rg.f10934r);
        C1799rN c1799rNA4 = C1799rN.a(AbstractC1114el.f13936E);
        int i3 = C1961uN.f17115b;
        LinkedHashMap linkedHashMapH = AbstractC0582Jp.H(4);
        Cr.l(c1799rNA, "provider");
        linkedHashMapH.put(Ku.GMS_SIGNALS, c1799rNA);
        Cr.l(c1799rNA2, "provider");
        linkedHashMapH.put(Ku.BUILD_URL, c1799rNA2);
        Cr.l(c1799rNA3, "provider");
        linkedHashMapH.put(Ku.HTTP, c1799rNA3);
        Cr.l(c1799rNA4, "provider");
        linkedHashMapH.put(Ku.PRE_PROCESS, c1799rNA4);
        C1799rN c1799rNA5 = C1799rN.a(new C1271hf(c1013ct7, c0710Rh.f10995g, new C1961uN(linkedHashMapH), 11));
        int i6 = C2123xN.f17584c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c1799rNA5);
        this.f15175d = C1799rN.a(new C1768qs(c0710Rh.f10989d, new C1329ik(new C2123xN(list, arrayList), 25), 10));
    }

    private final void k(Throwable th) {
    }

    private final void l(Throwable th) {
    }

    public C1431kf(Qt qt, InterfaceC1860sd interfaceC1860sd, EnumC2546b enumC2546b) {
        this.f15172a = 18;
        this.f15176e = null;
        this.f15173b = qt;
        this.f15174c = interfaceC1860sd;
        this.f15175d = enumC2546b;
    }

    public C1431kf(C1338iu c1338iu, InterfaceC0848Zj interfaceC0848Zj, Executor executor) {
        this.f15172a = 21;
        this.f15173b = c1338iu;
        this.f15174c = interfaceC0848Zj;
        this.f15175d = executor;
    }

    public /* synthetic */ C1431kf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f15172a = i;
        this.f15173b = obj2;
        this.f15174c = obj3;
        this.f15175d = obj4;
        this.f15176e = obj;
    }

    public /* synthetic */ C1431kf(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z6) {
        this.f15172a = i;
        this.f15173b = obj;
        this.f15174c = obj2;
        this.f15175d = obj3;
        this.f15176e = obj4;
    }

    public C1431kf(int i) {
        this.f15172a = i;
        switch (i) {
            case 6:
                this.f15173b = new Object();
                this.f15174c = new Object();
                break;
            case 29:
                this.f15173b = null;
                this.f15174c = null;
                this.f15175d = null;
                this.f15176e = null;
                break;
            default:
                this.f15173b = new C2036vr();
                this.f15174c = new C2036vr();
                this.f15175d = new C1024d3();
                break;
        }
    }

    public C1431kf(K4.e eVar) {
        this.f15172a = 27;
        this.f15176e = this;
        this.f15173b = eVar;
        C1799rN c1799rNA = C1799rN.a(new C1397jz((C1907tN) eVar.f2238b, (C1907tN) eVar.f2240d, (C1799rN) eVar.f2247l, C1799rN.a(AbstractC2022vd.f17309y), (C1799rN) eVar.f2249n, (C1799rN) eVar.i, (C1907tN) eVar.f2241e, 0));
        this.f15174c = c1799rNA;
        this.f15175d = C1799rN.a(new C0682Pn((C1907tN) eVar.f2240d, c1799rNA, (C1799rN) eVar.f2247l, (C1799rN) eVar.f2246k, C1799rN.a(AbstractC0709Rg.f10915A), new Yx(3, this), (C1907tN) eVar.f2241e, 5));
    }

    public C1431kf(Context context, EnumC1945u7 enumC1945u7) {
        this.f15172a = 26;
        this.f15175d = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        AbstractC0582Jp.O(dir, false);
        this.f15173b = dir;
        File dir2 = context.getDir("tmppccache", 0);
        AbstractC0582Jp.O(dir2, true);
        this.f15174c = dir2;
        this.f15176e = enumC1945u7;
    }

    public C1431kf(Context context, String str) {
        String packageName;
        this.f15172a = 4;
        this.f15175d = context;
        this.f15176e = str;
        this.f15173b = (String) AbstractC0709Rg.f10927k.v();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f15174c = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        p2.j jVar = p2.j.f22785C;
        C2911G c2911g = jVar.f22790c;
        linkedHashMap.put("device", C2911G.Q());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        linkedHashMap.put("is_lite_sdk", true != C2911G.g(context) ? "0" : "1");
        Rx rx = jVar.f22802p;
        rx.getClass();
        InterfaceFutureC2326a interfaceFutureC2326aB = AbstractC0640Nf.f10005a.b(new CallableC1890t6(context, rx));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C1969ue) interfaceFutureC2326aB.get()).f17138j));
            linkedHashMap.put("network_fine", Integer.toString(((C1969ue) interfaceFutureC2326aB.get()).f17139k));
        } catch (Exception e6) {
            p2.j.f22785C.f22795h.f("CsiConfiguration.CsiConfiguration", e6);
        }
        E9 e9 = H9.Bc;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f15174c;
            C2911G c2911g2 = p2.j.f22785C.f22790c;
            linkedHashMap2.put("is_bstar", true != C2911G.e(context) ? "0" : "1");
        }
        if (((Boolean) g92.a(H9.Ga)).booleanValue() && ((Boolean) g92.a(H9.f8645O2)).booleanValue()) {
            p2.j jVar2 = p2.j.f22785C;
            if (C1476lN.k(jVar2.f22795h.f8974g)) {
                return;
            }
            ((LinkedHashMap) this.f15174c).put("plugin", jVar2.f22795h.f8974g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public C1431kf(JsonReader jsonReader, Bundle bundle) throws IOException {
        this.f15172a = 22;
        this.f15176e = bundle;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8565B2)).booleanValue() && bundle != null) {
            A.f.r(p2.j.f22785C.f22797k, bundle, "server-response-parse-start");
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        St st = null;
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
                            arrayList.add(new Qt(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        st = new St(jsonReader);
                        if (((Boolean) C2841s.f23267e.f23270c.a(H9.C2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", st.f11285s);
                            bundle.putLong("normalize-ad-response-end", st.f11286t);
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
                    JSONObject jSONObjectX = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectX = a4.p.x(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new Wt(strNextString, jSONObjectX));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f15175d = arrayList2;
        this.f15173b = arrayList;
        this.f15174c = st == null ? new St(new JsonReader(new StringReader("{}"))) : st;
    }

    public C1431kf(C1888t4 c1888t4, BlockingQueue blockingQueue, L6 l6) {
        this.f15172a = 3;
        this.f15173b = new HashMap();
        this.f15176e = l6;
        this.f15174c = c1888t4;
        this.f15175d = blockingQueue;
    }

    public C1431kf(C2189yi c2189yi, C2202yv c2202yv, String str, d4.h hVar) {
        this.f15172a = 10;
        this.f15173b = c2202yv;
        this.f15174c = str;
        this.f15175d = hVar;
        Objects.requireNonNull(c2189yi);
        this.f15176e = c2189yi;
    }

    public C1431kf(C1197gC c1197gC, C1342iy c1342iy, Vu vu, C1342iy c1342iy2) {
        Object objM;
        this.f15172a = 28;
        if (c1197gC != null) {
            objM = LB.m(c1197gC);
        } else {
            JB jb = LB.f9635b;
            objM = C1197gC.f14227e;
        }
        this.f15173b = objM;
        this.f15174c = c1342iy;
        this.f15175d = vu;
        this.f15176e = c1342iy2;
    }

    public C1431kf(List list) throws NumberFormatException {
        int i;
        this.f15172a = 2;
        this.f15173b = new C2036vr();
        this.f15174c = new C2036vr();
        C1833s3 c1833s3 = new C1833s3();
        this.f15175d = c1833s3;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = Vt.f12096a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                c1833s3.f16666d = new int[strArrSplit.length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int[] iArr = c1833s3.f16666d;
                    try {
                        i = Integer.parseInt(strArrSplit[i3].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i3] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        c1833s3.f16667e = Integer.parseInt(strArrSplit2[0]);
                        c1833s3.f16668f = Integer.parseInt(strArrSplit2[1]);
                        c1833s3.f16664b = true;
                    } catch (RuntimeException e6) {
                        AbstractC2022vd.z("VobsubParser", "Parsing IDX failed", e6);
                    }
                }
            }
        }
    }
}
