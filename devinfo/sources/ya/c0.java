package ya;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.hh;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ww;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f37403b;

    /* renamed from: d, reason: collision with root package name */
    public vd.b f37405d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f37407f;
    public SharedPreferences.Editor g;

    /* renamed from: i, reason: collision with root package name */
    public String f37409i;
    public String j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f37402a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f37404c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public hh f37406e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37408h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37410k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f37411l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f37412m = -1;

    /* renamed from: n, reason: collision with root package name */
    public ww f37413n = new ww("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f37414o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f37415p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f37416q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f37417r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f37418s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f37419t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f37420u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f37421v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f37422w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f37423x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f37424y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f37425z = "";
    public String A = JsonUtils.EMPTY_JSON;
    public int B = -1;
    public int C = -1;
    public long D = 0;
    public boolean E = false;

    public final void A() {
        m();
        synchronized (this.f37402a) {
            try {
                this.f37419t = new JSONObject();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String B() {
        String str;
        m();
        synchronized (this.f37402a) {
            str = this.f37422w;
        }
        return str;
    }

    public final void C(String str) {
        m();
        synchronized (this.f37402a) {
            try {
                if (TextUtils.equals(this.f37422w, str)) {
                    return;
                }
                this.f37422w = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void D(boolean z3) {
        m();
        synchronized (this.f37402a) {
            try {
                if (z3 == this.f37410k) {
                    return;
                }
                this.f37410k = z3;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z3);
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean E() {
        boolean z3;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.U0)).booleanValue()) {
            return false;
        }
        m();
        synchronized (this.f37402a) {
            z3 = this.f37410k;
        }
        return z3;
    }

    public final void F(boolean z3) {
        m();
        synchronized (this.f37402a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) va.s.f36163e.f36166c.a(sk.Kb)).longValue();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z3);
                    this.g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(String str) {
        m();
        synchronized (this.f37402a) {
            try {
                this.f37411l = str;
                if (this.g != null) {
                    if (str.equals("-1")) {
                        this.g.remove("IABTCF_TCString");
                    } else {
                        this.g.putString("IABTCF_TCString", str);
                    }
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(int i4) {
        m();
        synchronized (this.f37402a) {
            try {
                this.f37412m = i4;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    if (i4 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i4);
                    }
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(int i4) {
        m();
        synchronized (this.f37402a) {
            try {
                if (this.C == i4) {
                    return;
                }
                this.C = i4;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i4);
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(long j) {
        m();
        synchronized (this.f37402a) {
            try {
                if (this.D == j) {
                    return;
                }
                this.D = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String e() {
        String str;
        m();
        synchronized (this.f37402a) {
            str = this.f37423x;
        }
        return str;
    }

    public final void f(String str) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16155ha)).booleanValue()) {
            m();
            synchronized (this.f37402a) {
                try {
                    if (this.f37423x.equals(str)) {
                        return;
                    }
                    this.f37423x = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.g.apply();
                    }
                    n();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean g() {
        boolean z3;
        m();
        synchronized (this.f37402a) {
            z3 = this.f37424y;
        }
        return z3;
    }

    public final void h(boolean z3) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16387wa)).booleanValue()) {
            m();
            synchronized (this.f37402a) {
                try {
                    if (this.f37424y == z3) {
                        return;
                    }
                    this.f37424y = z3;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z3);
                        this.g.apply();
                    }
                    n();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void i(String str) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16387wa)).booleanValue()) {
            m();
            synchronized (this.f37402a) {
                try {
                    if (this.f37425z.equals(str)) {
                        return;
                    }
                    this.f37425z = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.g.apply();
                    }
                    n();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final String j() {
        String str;
        m();
        synchronized (this.f37402a) {
            str = this.A;
        }
        return str;
    }

    public final void k(String str) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Ka)).booleanValue()) {
            m();
            synchronized (this.f37402a) {
                try {
                    if (this.A.equals(str)) {
                        return;
                    }
                    this.A = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.g.apply();
                    }
                    n();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void l() {
        m();
        synchronized (this.f37402a) {
            try {
                if (this.E) {
                    return;
                }
                this.E = true;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        vd.b bVar = this.f37405d;
        if (bVar == null || bVar.isDone()) {
            return;
        }
        try {
            this.f37405d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            za.i.i("Interrupted while waiting for preferences loaded.", e2);
        } catch (CancellationException e10) {
            e = e10;
            za.i.f("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e11) {
            e = e11;
            za.i.f("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e12) {
            e = e12;
            za.i.f("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void n() {
        fx.f11274a.execute(new o1(21, this));
    }

    public final void o(Context context) {
        synchronized (this.f37402a) {
            try {
                if (this.f37407f != null) {
                    return;
                }
                this.f37405d = fx.f11274a.c(new fb.r(24, this, context));
                this.f37403b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean p() {
        boolean z3;
        m();
        synchronized (this.f37402a) {
            z3 = this.f37420u;
        }
        return z3;
    }

    public final boolean q() {
        boolean z3;
        m();
        synchronized (this.f37402a) {
            z3 = this.f37421v;
        }
        return z3;
    }

    public final void r(int i4) {
        m();
        synchronized (this.f37402a) {
            try {
                if (this.f37417r == i4) {
                    return;
                }
                this.f37417r = i4;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("version_code", i4);
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ww s() {
        ww wwVar;
        m();
        synchronized (this.f37402a) {
            try {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Uc)).booleanValue() && this.f37413n.a()) {
                    ArrayList arrayList = this.f37404c;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((Runnable) obj).run();
                    }
                }
                wwVar = this.f37413n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wwVar;
    }

    public final long t() {
        long j;
        m();
        synchronized (this.f37402a) {
            j = this.f37414o;
        }
        return j;
    }

    public final void u(int i4) {
        m();
        synchronized (this.f37402a) {
            try {
                if (this.f37416q == i4) {
                    return;
                }
                this.f37416q = i4;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i4);
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int v() {
        int i4;
        m();
        synchronized (this.f37402a) {
            i4 = this.f37416q;
        }
        return i4;
    }

    public final void w(long j) {
        m();
        synchronized (this.f37402a) {
            try {
                if (this.f37415p == j) {
                    return;
                }
                this.f37415p = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.g.apply();
                }
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long x() {
        long j;
        m();
        synchronized (this.f37402a) {
            j = this.f37415p;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        ua.j.C.f35267k.getClass();
        r3.put("timestamp_ms", java.lang.System.currentTimeMillis());
        r1.put(r2, r3);
        r7.f37419t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        za.i.i("Could not update native advanced settings", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r7.m()
            java.lang.Object r0 = r7.f37402a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f37419t     // Catch: java.lang.Throwable -> L14
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
            ua.j r10 = ua.j.C     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            tb.a r10 = r10.f35267k     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r10.getClass()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            org.json.JSONObject r9 = r7.f37419t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            goto L76
        L70:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            za.i.i(r9, r8)     // Catch: java.lang.Throwable -> L14
        L76:
            android.content.SharedPreferences$Editor r8 = r7.g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L8a
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f37419t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L8a:
            r7.n()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.c0.y(java.lang.String, java.lang.String, boolean):void");
    }

    public final JSONObject z() {
        JSONObject jSONObject;
        m();
        synchronized (this.f37402a) {
            jSONObject = this.f37419t;
        }
        return jSONObject;
    }
}
