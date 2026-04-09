package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.AppLovinUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kk0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13177a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13178b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13179c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f13180d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f13181e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Executor f13182f;
    public JSONObject g;

    public kk0(ex exVar) {
        this.f13182f = exVar;
    }

    public static final Bundle l(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized z41 a() {
        if (TextUtils.isEmpty(ua.j.C.f35265h.i().s().f18213e)) {
            return z51.g;
        }
        return z41.a(this.f13178b);
    }

    public final synchronized z41 b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(ua.j.C.f35265h.i().s().f18213e) && (map = (Map) this.f13179c.get(str)) != null) {
                List<lk0> list = (List) map.get(str2);
                if (list == null) {
                    String strB = nn1.b(this.g, str2, str);
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16157hc)).booleanValue()) {
                        strB = strB.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strB);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (lk0 lk0Var : list) {
                        String str3 = lk0Var.f13511a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(lk0Var.f13512b);
                    }
                    return z41.a(map2);
                }
            }
            return z51.g;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized HashMap c(String str, String str2) {
        HashMap map;
        try {
            z41 z41VarB = b(str, str2);
            z41 z41VarK = k(str2);
            map = new HashMap();
            Iterator it = ((w51) z41VarB.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                if (z41VarK.containsKey(str3)) {
                    nk0 nk0Var = (nk0) z41VarK.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new nk0(str3, nk0Var.f14311b, nk0Var.f14312c, nk0Var.f14313d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            h61 h61VarA = z41VarK.entrySet().a();
            while (h61VarA.hasNext()) {
                Map.Entry entry2 = (Map.Entry) h61VarA.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((nk0) entry2.getValue()).f14313d) {
                    map.put(str4, (nk0) entry2.getValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    public final synchronized void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap map = this.f13177a;
            if (!map.containsKey(str)) {
                map.put(str, new lk0(new Bundle(), str));
            }
        }
    }

    public final synchronized void e() {
        this.f13178b.clear();
        this.f13177a.clear();
        this.f13181e.clear();
        this.f13180d.clear();
        h();
        f();
        g();
    }

    public final synchronized void f() {
        JSONObject jSONObject;
        if (!((Boolean) am.f9361f.u()).booleanValue()) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16164i2)).booleanValue() && (jSONObject = ua.j.C.f35265h.i().s().g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        Bundle bundleL = l(jSONObject2.optJSONObject("data"));
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject2.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f13178b.put(strOptString, new nk0(strOptString, zOptBoolean2, zOptBoolean, true, bundleL));
                        }
                    }
                } catch (JSONException e2) {
                    ya.a0.n("Malformed config loading JSON.", e2);
                }
            }
        }
    }

    public final synchronized void g() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) am.f9357b.u()).booleanValue()) {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16177j2)).booleanValue() && (jSONObject = ua.j.C.f35265h.i().s().g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i10);
                                boolean zOptBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject3.optString("platform");
                                nk0 nk0Var = new nk0(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.f13180d.put(strOptString, nk0Var);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.f13181e.put(strOptString, nk0Var);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e2) {
            ya.a0.n("Malformed config loading JSON.", e2);
        } finally {
        }
    }

    public final synchronized void h() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = ua.j.C.f35265h.i().s().g;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i4);
                            String lowerCase = ((Boolean) va.s.f36163e.f36166c.a(sk.f16157hc)).booleanValue() ? jSONObject2.optString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, "").toLowerCase(Locale.ROOT) : jSONObject2.optString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, "");
                            String strOptString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                    arrayList.addAll(i(jSONArrayOptJSONArray.getJSONObject(i10)));
                                }
                            }
                            j(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e2) {
                    ya.a0.n("Malformed config loading JSON.", e2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ArrayList i(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleL = l(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i4, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str = (String) arrayList2.get(i10);
                        d(str);
                        if (((lk0) this.f13177a.get(str)) != null) {
                            arrayList.add(new lk0(bundleL, str));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void j(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap map = this.f13179c;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList2 = (List) map2.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            map2.put(str2, arrayList2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized z41 k(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(ua.j.C.f35265h.i().s().f18213e)) {
                pk pkVar = sk.R3;
                va.s sVar = va.s.f36163e;
                boolean zMatches = Pattern.matches((String) sVar.f36166c.a(pkVar), str);
                boolean zMatches2 = Pattern.matches((String) sVar.f36166c.a(sk.S3), str);
                if (zMatches) {
                    map = new HashMap(this.f13181e);
                } else if (zMatches2) {
                    map = new HashMap(this.f13180d);
                }
                return z41.a(map);
            }
            return z51.g;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
