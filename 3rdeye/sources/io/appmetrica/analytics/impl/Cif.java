package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cif extends Ld implements vo {

    /* renamed from: d, reason: collision with root package name */
    public static final long f41068d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f41069e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final String f41070f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final String f41071g = "";

    /* renamed from: q, reason: collision with root package name */
    public static final String f41080q = "SESSION_";

    /* renamed from: h, reason: collision with root package name */
    public static final C4743kf f41072h = new C4743kf("PERMISSIONS_CHECK_TIME", null);
    public static final C4743kf i = new C4743kf("PROFILE_ID", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C4743kf f41073j = new C4743kf("APP_ENVIRONMENT", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C4743kf f41074k = new C4743kf("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C4743kf f41075l = new C4743kf("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C4743kf f41076m = new C4743kf("APPLICATION_FEATURES", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C4743kf f41077n = new C4743kf("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C4743kf f41078o = new C4743kf("VITAL_DATA", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C4743kf f41079p = new C4743kf("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C4743kf f41081r = new C4743kf("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public Cif(InterfaceC4481ab interfaceC4481ab) {
        super(interfaceC4481ab);
    }

    public final Cif a(C4625g0 c4625g0) {
        synchronized (this) {
            b(f41073j.f41141b, c4625g0.f40909a);
            b(f41074k.f41141b, c4625g0.f40910b);
        }
        return this;
    }

    public final void b(boolean z10) {
        b(f41081r.f41141b, z10);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4717jf
    public final Set<String> c() {
        return this.f41115a.a();
    }

    public final C4625g0 d() {
        C4625g0 c4625g0;
        synchronized (this) {
            c4625g0 = new C4625g0(this.f41115a.getString(f41073j.f41141b, JsonUtils.EMPTY_JSON), this.f41115a.getLong(f41074k.f41141b, 0L));
        }
        return c4625g0;
    }

    public final String e() {
        return this.f41115a.getString(f41076m.f41141b, "");
    }

    public final List<String> f() {
        String str = f41077n.f41141b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.f41115a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.optString(i10);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int g() {
        return this.f41115a.getInt(f41075l.f41141b, -1);
    }

    public final long h() {
        return this.f41115a.getLong(f41072h.f41141b, 0L);
    }

    public final Cif i(String str) {
        return (Cif) b(f41076m.f41141b, str);
    }

    public final Cif j(String str) {
        return (Cif) b(i.f41141b, str);
    }

    public final String h(String str) {
        return this.f41115a.getString(new C4743kf(f41080q, str).f41141b, "");
    }

    public final String i() {
        return this.f41115a.getString(i.f41141b, null);
    }

    public final Map<Integer, String> j() {
        HashMap map = new HashMap();
        try {
            String string = this.f41115a.getString(f41079p.f41141b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public final Cif e(String str, String str2) {
        return (Cif) b(new C4743kf(f41080q, str).f41141b, str2);
    }

    public final Cif a(long j4) {
        return (Cif) b(f41072h.f41141b, j4);
    }

    @Override // io.appmetrica.analytics.impl.Ld
    public final String f(String str) {
        return new C4743kf(str, null).f41141b;
    }

    public final Cif a(int i10) {
        return (Cif) b(f41075l.f41141b, i10);
    }

    public final Cif a(List<String> list) {
        return (Cif) a(f41077n.f41141b, list);
    }

    public final boolean a(boolean z10) {
        return this.f41115a.getBoolean(f41081r.f41141b, z10);
    }

    @Override // io.appmetrica.analytics.impl.vo
    public final String a() {
        return this.f41115a.getString(f41078o.f41141b, null);
    }

    @Override // io.appmetrica.analytics.impl.vo
    public final void a(String str) {
        b(f41078o.f41141b, str);
    }

    public final void a(Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f41079p.f41141b, jSONObject.toString());
    }
}
