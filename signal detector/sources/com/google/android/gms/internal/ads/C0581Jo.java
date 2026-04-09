package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.InterfaceC2837p0;
import t2.C2909E;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581Jo {

    /* renamed from: a, reason: collision with root package name */
    public final C0615Lo f9349a;

    /* renamed from: b, reason: collision with root package name */
    public final C0768Uo f9350b;

    /* renamed from: c, reason: collision with root package name */
    public final C2249zo f9351c;

    /* renamed from: d, reason: collision with root package name */
    public final C0513Fo f9352d;

    /* renamed from: e, reason: collision with root package name */
    public final C2195yo f9353e;

    /* renamed from: f, reason: collision with root package name */
    public final BinderC0751To f9354f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1647of f9355g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1647of f9356h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f9357j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9358k;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f9363p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9366s;

    /* renamed from: t, reason: collision with root package name */
    public int f9367t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9368u;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f9359l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f9360m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f9361n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public String f9362o = "{}";

    /* renamed from: q, reason: collision with root package name */
    public long f9364q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0530Go f9365r = EnumC0530Go.f8442a;

    /* renamed from: v, reason: collision with root package name */
    public EnumC0564Io f9369v = EnumC0564Io.f9165a;

    /* renamed from: w, reason: collision with root package name */
    public long f9370w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f9371x = "";

    public C0581Jo(C0615Lo c0615Lo, C0768Uo c0768Uo, C2249zo c2249zo, Context context, C2951a c2951a, C0513Fo c0513Fo, BinderC0751To binderC0751To, SharedPreferencesOnSharedPreferenceChangeListenerC1647of sharedPreferencesOnSharedPreferenceChangeListenerC1647of, SharedPreferencesOnSharedPreferenceChangeListenerC1647of sharedPreferencesOnSharedPreferenceChangeListenerC1647of2, String str) {
        this.f9349a = c0615Lo;
        this.f9350b = c0768Uo;
        this.f9351c = c2249zo;
        this.f9353e = new C2195yo(context);
        this.i = c2951a.f23784a;
        this.f9358k = str;
        this.f9352d = c0513Fo;
        this.f9354f = binderC0751To;
        this.f9355g = sharedPreferencesOnSharedPreferenceChangeListenerC1647of;
        this.f9356h = sharedPreferencesOnSharedPreferenceChangeListenerC1647of2;
        this.f9357j = context;
        p2.j.f22785C.f22801o.f23637g = this;
    }

    public final void a() throws JSONException {
        E9 e9 = H9.fa;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            if (((Boolean) c2841s.f23270c.a(H9.ua)).booleanValue() && p2.j.f22785C.f22795h.i().g()) {
                k();
                return;
            }
            String strE = p2.j.f22785C.f22795h.i().e();
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

    public final void b(boolean z6) throws JSONException {
        if (!this.f9368u && z6) {
            k();
        }
        h(z6, true);
    }

    public final synchronized boolean c() {
        return this.f9366s;
    }

    public final synchronized void d(String str, C0445Bo c0445Bo) {
        E9 e9 = H9.fa;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && g()) {
            if (this.f9367t >= ((Integer) c2841s.f23270c.a(H9.ha)).intValue()) {
                u2.k.h("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap map = this.f9359l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.f9367t++;
            ((List) map.get(str)).add(c0445Bo);
            if (((Boolean) c2841s.f23270c.a(H9.Da)).booleanValue()) {
                String str2 = c0445Bo.f7432c;
                this.f9360m.put(str2, c0445Bo);
                HashMap map2 = this.f9361n;
                if (map2.containsKey(str2)) {
                    List list = (List) map2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C0657Of) it.next()).b(c0445Bo);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized C0657Of e(String str) {
        C0657Of c0657Of;
        try {
            c0657Of = new C0657Of();
            HashMap map = this.f9360m;
            if (map.containsKey(str)) {
                c0657Of.b((C0445Bo) map.get(str));
            } else {
                HashMap map2 = this.f9361n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(c0657Of);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0657Of;
    }

    public final synchronized void f(InterfaceC2837p0 interfaceC2837p0, EnumC0564Io enumC0564Io) {
        if (!g()) {
            try {
                interfaceC2837p0.c0(AbstractC1984ut.A(18, null, null));
                return;
            } catch (RemoteException unused) {
                u2.k.h("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.fa)).booleanValue()) {
            this.f9369v = enumC0564Io;
            this.f9349a.a(interfaceC2837p0, new C0483Eb(this, 1), new C1858sb(4, this.f9354f), new C0483Eb(this, 0));
            return;
        } else {
            try {
                interfaceC2837p0.c0(AbstractC1984ut.A(1, null, null));
                return;
            } catch (RemoteException unused2) {
                u2.k.h("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean g() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.ua)).booleanValue()) {
            return this.f9366s || p2.j.f22785C.f22801o.g();
        }
        return this.f9366s;
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
            boolean r0 = r1.f9366s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f9366s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.ua     // Catch: java.lang.Throwable -> L27
            q2.s r0 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.G9 r0 = r0.f23270c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            p2.j r2 = p2.j.f22785C     // Catch: java.lang.Throwable -> L27
            t2.l r2 = r2.f22801o     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L27
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0581Jo.h(boolean, boolean):void");
    }

    public final synchronized void i(EnumC0530Go enumC0530Go, boolean z6) {
        try {
            if (this.f9365r != enumC0530Go) {
                if (g()) {
                    m();
                }
                this.f9365r = enumC0530Go;
                if (g()) {
                    l();
                }
                if (z6) {
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
            for (Map.Entry entry : this.f9359l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (C0445Bo c0445Bo : (List) entry.getValue()) {
                    if (c0445Bo.f7434e != EnumC0428Ao.f7044a) {
                        jSONArray.put(c0445Bo.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void k() throws JSONException {
        this.f9368u = true;
        C0513Fo c0513Fo = this.f9352d;
        c0513Fo.getClass();
        BinderC0462Co binderC0462Co = new BinderC0462Co(0, c0513Fo);
        C2087wo c2087wo = c0513Fo.f8185a;
        c2087wo.getClass();
        c2087wo.f17477e.f10212a.a(new CD(c2087wo, 28, binderC0462Co), c2087wo.f17481j);
        this.f9349a.f9760c = this;
        this.f9350b.f11793f = this;
        this.f9351c.i = this;
        this.f9354f.f11468f = this;
        E9 e9 = H9.Ja;
        C2841s c2841s = C2841s.f23267e;
        if (!TextUtils.isEmpty((CharSequence) c2841s.f23270c.a(e9))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f9357j);
            List listAsList = Arrays.asList(((String) c2841s.f23270c.a(e9)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC1647of sharedPreferencesOnSharedPreferenceChangeListenerC1647of = this.f9355g;
            sharedPreferencesOnSharedPreferenceChangeListenerC1647of.f15970c = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1647of);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1647of.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        E9 e92 = H9.Ka;
        if (!TextUtils.isEmpty((CharSequence) c2841s.f23270c.a(e92))) {
            SharedPreferences sharedPreferences = this.f9357j.getSharedPreferences("admob", 0);
            List listAsList2 = Arrays.asList(((String) c2841s.f23270c.a(e92)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC1647of sharedPreferencesOnSharedPreferenceChangeListenerC1647of2 = this.f9356h;
            sharedPreferencesOnSharedPreferenceChangeListenerC1647of2.f15970c = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1647of2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1647of2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String strE = p2.j.f22785C.f22795h.i().e();
        synchronized (this) {
            if (!TextUtils.isEmpty(strE)) {
                try {
                    JSONObject jSONObject = new JSONObject(strE);
                    h(jSONObject.optBoolean("isTestMode", false), false);
                    i((EnumC0530Go) Enum.valueOf(EnumC0530Go.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f9362o = jSONObject.optString("networkExtras", "{}");
                    this.f9364q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        this.f9371x = p2.j.f22785C.f22795h.i().j();
    }

    public final synchronized void l() {
        int iOrdinal = this.f9365r.ordinal();
        if (iOrdinal == 1) {
            this.f9350b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f9351c.b();
        }
    }

    public final synchronized void m() {
        int iOrdinal = this.f9365r.ordinal();
        if (iOrdinal == 1) {
            this.f9350b.c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f9351c.c();
        }
    }

    public final void n() {
        String string;
        p2.j jVar = p2.j.f22785C;
        C2909E c2909eI = jVar.f22795h.i();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.f9366s);
                jSONObject.put("gesture", this.f9365r);
                long j6 = this.f9364q;
                jVar.f22797k.getClass();
                if (j6 > System.currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.f9362o);
                    jSONObject.put("networkExtrasExpirationSecs", this.f9364q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        c2909eI.f(string);
    }
}
