package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ff0 {

    /* renamed from: a, reason: collision with root package name */
    public final hf0 f11129a;

    /* renamed from: b, reason: collision with root package name */
    public final qf0 f11130b;

    /* renamed from: c, reason: collision with root package name */
    public final ue0 f11131c;

    /* renamed from: d, reason: collision with root package name */
    public final bf0 f11132d;

    /* renamed from: e, reason: collision with root package name */
    public final te0 f11133e;

    /* renamed from: f, reason: collision with root package name */
    public final pf0 f11134f;
    public final ew g;

    /* renamed from: h, reason: collision with root package name */
    public final ew f11135h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11136i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11137k;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f11142p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11145s;

    /* renamed from: t, reason: collision with root package name */
    public int f11146t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11147u;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f11138l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f11139m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f11140n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public String f11141o = JsonUtils.EMPTY_JSON;

    /* renamed from: q, reason: collision with root package name */
    public long f11143q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public cf0 f11144r = cf0.f10096a;

    /* renamed from: v, reason: collision with root package name */
    public ef0 f11148v = ef0.f10772a;

    /* renamed from: w, reason: collision with root package name */
    public long f11149w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f11150x = "";

    public ff0(hf0 hf0Var, qf0 qf0Var, ue0 ue0Var, Context context, za.a aVar, bf0 bf0Var, pf0 pf0Var, ew ewVar, ew ewVar2, String str) {
        this.f11129a = hf0Var;
        this.f11130b = qf0Var;
        this.f11131c = ue0Var;
        te0 te0Var = new te0();
        te0Var.f16797e = "";
        te0Var.f16795c = context;
        te0Var.f16796d = context.getApplicationInfo();
        pk pkVar = sk.f16354ua;
        va.s sVar = va.s.f36163e;
        te0Var.f16793a = ((Integer) sVar.f36166c.a(pkVar)).intValue();
        te0Var.f16794b = ((Integer) sVar.f36166c.a(sk.f16371va)).intValue();
        this.f11133e = te0Var;
        this.f11136i = aVar.f38129a;
        this.f11137k = str;
        this.f11132d = bf0Var;
        this.f11134f = pf0Var;
        this.g = ewVar;
        this.f11135h = ewVar2;
        this.j = context;
        ua.j.C.f35271o.g = this;
    }

    public final void a() throws JSONException {
        pk pkVar = sk.f16155ha;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            if (((Boolean) sVar.f36166c.a(sk.f16387wa)).booleanValue() && ua.j.C.f35265h.i().g()) {
                k();
                return;
            }
            String strE = ua.j.C.f35265h.i().e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            try {
                if (new JSONObject(strE).optBoolean("isTestMode", false)) {
                    k();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z3) throws JSONException {
        if (!this.f11147u && z3) {
            k();
        }
        h(z3, true);
    }

    public final synchronized boolean c() {
        return this.f11145s;
    }

    public final synchronized void d(String str, we0 we0Var) {
        pk pkVar = sk.f16155ha;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && g()) {
            if (this.f11146t >= ((Integer) sVar.f36166c.a(sk.f16183ja)).intValue()) {
                za.i.h("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap map = this.f11138l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.f11146t++;
            ((List) map.get(str)).add(we0Var);
            if (((Boolean) sVar.f36166c.a(sk.Fa)).booleanValue()) {
                String str2 = we0Var.f17995c;
                this.f11139m.put(str2, we0Var);
                HashMap map2 = this.f11140n;
                if (map2.containsKey(str2)) {
                    List list = (List) map2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((gx) it.next()).b(we0Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized gx e(String str) {
        gx gxVar;
        try {
            gxVar = new gx();
            HashMap map = this.f11139m;
            if (map.containsKey(str)) {
                gxVar.b((we0) map.get(str));
            } else {
                HashMap map2 = this.f11140n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(gxVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return gxVar;
    }

    public final synchronized void f(va.o1 o1Var, ef0 ef0Var) {
        if (!g()) {
            try {
                o1Var.Q(yo0.A(18, null, null));
                return;
            } catch (RemoteException unused) {
                za.i.h("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16155ha)).booleanValue()) {
            this.f11148v = ef0Var;
            this.f11129a.a(o1Var, new po(this, 1), new co(4, this.f11134f), new po(this, 0));
            return;
        } else {
            try {
                o1Var.Q(yo0.A(1, null, null));
                return;
            } catch (RemoteException unused2) {
                za.i.h("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean g() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16387wa)).booleanValue()) {
            return this.f11145s || ua.j.C.f35271o.n();
        }
        return this.f11145s;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f11145s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f11145s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.f16387wa     // Catch: java.lang.Throwable -> L27
            va.s r0 = va.s.f36163e     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.rk r0 = r0.f36166c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            ua.j r2 = ua.j.C     // Catch: java.lang.Throwable -> L27
            t5.p r2 = r2.f35271o     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.n()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.l()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.g()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.m()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.n()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ff0.h(boolean, boolean):void");
    }

    public final synchronized void i(cf0 cf0Var, boolean z3) {
        try {
            if (this.f11144r != cf0Var) {
                if (g()) {
                    m();
                }
                this.f11144r = cf0Var;
                if (g()) {
                    l();
                }
                if (z3) {
                    n();
                }
            }
        } finally {
        }
    }

    public final synchronized JSONObject j() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f11138l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (we0 we0Var : (List) entry.getValue()) {
                    if (we0Var.f17997e != ve0.f17606a) {
                        jSONArray.put(we0Var.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public final void k() throws JSONException {
        this.f11147u = true;
        bf0 bf0Var = this.f11132d;
        bf0Var.getClass();
        ye0 ye0Var = new ye0(0, bf0Var);
        re0 re0Var = bf0Var.f9670a;
        re0Var.getClass();
        re0Var.f15621e.f11625a.a(new q81(27, re0Var, ye0Var), re0Var.j);
        this.f11129a.f11852c = this;
        this.f11130b.f15340f = this;
        this.f11131c.f17191i = this;
        this.f11134f.f15000f = this;
        pk pkVar = sk.La;
        va.s sVar = va.s.f36163e;
        if (!TextUtils.isEmpty((CharSequence) sVar.f36166c.a(pkVar))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.j);
            List listAsList = Arrays.asList(((String) sVar.f36166c.a(pkVar)).split(","));
            ew ewVar = this.g;
            ewVar.f10896c = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(ewVar);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                ewVar.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        pk pkVar2 = sk.Ma;
        if (!TextUtils.isEmpty((CharSequence) sVar.f36166c.a(pkVar2))) {
            SharedPreferences sharedPreferences = this.j.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
            List listAsList2 = Arrays.asList(((String) sVar.f36166c.a(pkVar2)).split(","));
            ew ewVar2 = this.f11135h;
            ewVar2.f10896c = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(ewVar2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                ewVar2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String strE = ua.j.C.f35265h.i().e();
        synchronized (this) {
            if (!TextUtils.isEmpty(strE)) {
                try {
                    JSONObject jSONObject = new JSONObject(strE);
                    h(jSONObject.optBoolean("isTestMode", false), false);
                    i((cf0) Enum.valueOf(cf0.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f11141o = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
                    this.f11143q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        this.f11150x = ua.j.C.f35265h.i().j();
    }

    public final synchronized void l() {
        int iOrdinal = this.f11144r.ordinal();
        if (iOrdinal == 1) {
            this.f11130b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f11131c.b();
        }
    }

    public final synchronized void m() {
        int iOrdinal = this.f11144r.ordinal();
        if (iOrdinal == 1) {
            this.f11130b.c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f11131c.c();
        }
    }

    public final void n() {
        String string;
        ua.j jVar = ua.j.C;
        ya.c0 c0VarI = jVar.f35265h.i();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.f11145s);
                jSONObject.put("gesture", this.f11144r);
                long j = this.f11143q;
                jVar.f35267k.getClass();
                if (j > System.currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.f11141o);
                    jSONObject.put("networkExtrasExpirationSecs", this.f11143q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        c0VarI.f(string);
    }
}
