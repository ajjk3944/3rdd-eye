package t2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.C0487Ef;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.W7;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n1.RunnableC2683a;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: t2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2909E {

    /* renamed from: b, reason: collision with root package name */
    public boolean f23549b;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceFutureC2326a f23551d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f23553f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f23554g;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f23556j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f23548a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23550c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public W7 f23552e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23555h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23557k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f23558l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f23559m = -1;

    /* renamed from: n, reason: collision with root package name */
    public C0487Ef f23560n = new C0487Ef("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f23561o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f23562p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f23563q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f23564r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f23565s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f23566t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f23567u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f23568v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f23569w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f23570x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f23571y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f23572z = "";

    /* renamed from: A, reason: collision with root package name */
    public String f23543A = "{}";

    /* renamed from: B, reason: collision with root package name */
    public int f23544B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f23545C = -1;

    /* renamed from: D, reason: collision with root package name */
    public long f23546D = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f23547E = false;

    public final void A() {
        m();
        synchronized (this.f23548a) {
            try {
                this.f23566t = new JSONObject();
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String B() {
        String str;
        m();
        synchronized (this.f23548a) {
            str = this.f23569w;
        }
        return str;
    }

    public final void C(String str) {
        m();
        synchronized (this.f23548a) {
            try {
                if (TextUtils.equals(this.f23569w, str)) {
                    return;
                }
                this.f23569w = str;
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(boolean z6) {
        m();
        synchronized (this.f23548a) {
            try {
                if (z6 == this.f23557k) {
                    return;
                }
                this.f23557k = z6;
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z6);
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean E() {
        boolean z6;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8677U0)).booleanValue()) {
            return false;
        }
        m();
        synchronized (this.f23548a) {
            z6 = this.f23557k;
        }
        return z6;
    }

    public final void F(boolean z6) {
        m();
        synchronized (this.f23548a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) C2841s.f23267e.f23270c.a(H9.Ib)).longValue();
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z6);
                    this.f23554g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        m();
        synchronized (this.f23548a) {
            try {
                this.f23558l = str;
                if (this.f23554g != null) {
                    if (str.equals("-1")) {
                        this.f23554g.remove("IABTCF_TCString");
                    } else {
                        this.f23554g.putString("IABTCF_TCString", str);
                    }
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        m();
        synchronized (this.f23548a) {
            try {
                this.f23559m = i;
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i) {
        m();
        synchronized (this.f23548a) {
            try {
                if (this.f23545C == i) {
                    return;
                }
                this.f23545C = i;
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j6) {
        m();
        synchronized (this.f23548a) {
            try {
                if (this.f23546D == j6) {
                    return;
                }
                this.f23546D = j6;
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j6);
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        String str;
        m();
        synchronized (this.f23548a) {
            str = this.f23570x;
        }
        return str;
    }

    public final void f(String str) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.fa)).booleanValue()) {
            m();
            synchronized (this.f23548a) {
                try {
                    if (this.f23570x.equals(str)) {
                        return;
                    }
                    this.f23570x = str;
                    SharedPreferences.Editor editor = this.f23554g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f23554g.apply();
                    }
                    n();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean g() {
        boolean z6;
        m();
        synchronized (this.f23548a) {
            z6 = this.f23571y;
        }
        return z6;
    }

    public final void h(boolean z6) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.ua)).booleanValue()) {
            m();
            synchronized (this.f23548a) {
                try {
                    if (this.f23571y == z6) {
                        return;
                    }
                    this.f23571y = z6;
                    SharedPreferences.Editor editor = this.f23554g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z6);
                        this.f23554g.apply();
                    }
                    n();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void i(String str) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.ua)).booleanValue()) {
            m();
            synchronized (this.f23548a) {
                try {
                    if (this.f23572z.equals(str)) {
                        return;
                    }
                    this.f23572z = str;
                    SharedPreferences.Editor editor = this.f23554g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f23554g.apply();
                    }
                    n();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String j() {
        String str;
        m();
        synchronized (this.f23548a) {
            str = this.f23543A;
        }
        return str;
    }

    public final void k(String str) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ia)).booleanValue()) {
            m();
            synchronized (this.f23548a) {
                try {
                    if (this.f23543A.equals(str)) {
                        return;
                    }
                    this.f23543A = str;
                    SharedPreferences.Editor editor = this.f23554g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f23554g.apply();
                    }
                    n();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l() {
        m();
        synchronized (this.f23548a) {
            try {
                if (this.f23547E) {
                    return;
                }
                this.f23547E = true;
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        InterfaceFutureC2326a interfaceFutureC2326a = this.f23551d;
        if (interfaceFutureC2326a == null || interfaceFutureC2326a.isDone()) {
            return;
        }
        try {
            this.f23551d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            Thread.currentThread().interrupt();
            u2.k.i("Interrupted while waiting for preferences loaded.", e6);
        } catch (CancellationException e7) {
            e = e7;
            u2.k.f("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e8) {
            e = e8;
            u2.k.f("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e9) {
            e = e9;
            u2.k.f("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void n() {
        AbstractC0640Nf.f10005a.execute(new RunnableC2683a(10, this));
    }

    public final void o(Context context) {
        synchronized (this.f23548a) {
            try {
                if (this.f23553f != null) {
                    return;
                }
                this.f23551d = AbstractC0640Nf.f10005a.a(new f1.i(this, 9, context));
                this.f23549b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p() {
        boolean z6;
        m();
        synchronized (this.f23548a) {
            z6 = this.f23567u;
        }
        return z6;
    }

    public final boolean q() {
        boolean z6;
        m();
        synchronized (this.f23548a) {
            z6 = this.f23568v;
        }
        return z6;
    }

    public final void r(int i) {
        m();
        synchronized (this.f23548a) {
            try {
                if (this.f23564r == i) {
                    return;
                }
                this.f23564r = i;
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0487Ef s() {
        C0487Ef c0487Ef;
        m();
        synchronized (this.f23548a) {
            try {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Sc)).booleanValue() && this.f23560n.a()) {
                    ArrayList arrayList = this.f23550c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                }
                c0487Ef = this.f23560n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0487Ef;
    }

    public final long t() {
        long j6;
        m();
        synchronized (this.f23548a) {
            j6 = this.f23561o;
        }
        return j6;
    }

    public final void u(int i) {
        m();
        synchronized (this.f23548a) {
            try {
                if (this.f23563q == i) {
                    return;
                }
                this.f23563q = i;
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int v() {
        int i;
        m();
        synchronized (this.f23548a) {
            i = this.f23563q;
        }
        return i;
    }

    public final void w(long j6) {
        m();
        synchronized (this.f23548a) {
            try {
                if (this.f23562p == j6) {
                    return;
                }
                this.f23562p = j6;
                SharedPreferences.Editor editor = this.f23554g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j6);
                    this.f23554g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long x() {
        long j6;
        m();
        synchronized (this.f23548a) {
            j6 = this.f23562p;
        }
        return j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        p2.j.f22785C.f22797k.getClass();
        r3.put("timestamp_ms", java.lang.System.currentTimeMillis());
        r1.put(r2, r3);
        r7.f23566t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        u2.k.i("Could not update native advanced settings", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r7.m()
            java.lang.Object r0 = r7.f23548a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f23566t     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L8f
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = r3
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r9 = "timestamp_ms"
            p2.j r10 = p2.j.f22785C     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            Q2.a r10 = r10.f22797k     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r10.getClass()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            org.json.JSONObject r9 = r7.f23566t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            goto L76
        L70:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            u2.k.i(r9, r8)     // Catch: java.lang.Throwable -> L14
        L76:
            android.content.SharedPreferences$Editor r8 = r7.f23554g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L8a
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f23566t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.f23554g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L8a:
            r7.n()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2909E.y(java.lang.String, java.lang.String, boolean):void");
    }

    public final JSONObject z() {
        JSONObject jSONObject;
        m();
        synchronized (this.f23548a) {
            jSONObject = this.f23566t;
        }
        return jSONObject;
    }
}
