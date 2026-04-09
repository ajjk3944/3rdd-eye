package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
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
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.nr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1605nr {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15823a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15824b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15825c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15826d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f15827e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Executor f15828f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f15829g;

    public C1605nr(C0623Mf c0623Mf) {
        this.f15828f = c0623Mf;
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

    public final synchronized C1465lC a() {
        if (TextUtils.isEmpty(p2.j.f22785C.f22795h.i().s().f7976e)) {
            return C1465lC.f15361g;
        }
        return C1465lC.a(this.f15824b);
    }

    public final synchronized C1465lC b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(p2.j.f22785C.f22795h.i().s().f7976e) && (map = (Map) this.f15825c.get(str)) != null) {
                List<C1659or> list = (List) map.get(str2);
                if (list == null) {
                    String strD = AbstractC2022vd.d(this.f15829g, str2, str);
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.fc)).booleanValue()) {
                        strD = strD.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strD);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (C1659or c1659or : list) {
                        String str3 = c1659or.f16066a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(c1659or.f16067b);
                    }
                    return C1465lC.a(map2);
                }
            }
            return C1465lC.f15361g;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized HashMap c(String str, String str2) {
        HashMap map;
        try {
            C1465lC c1465lCB = b(str, str2);
            C1465lC c1465lCK = k(str2);
            map = new HashMap();
            Iterator it = ((C1305iC) c1465lCB.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                if (c1465lCK.containsKey(str3)) {
                    C1767qr c1767qr = (C1767qr) c1465lCK.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new C1767qr(str3, c1767qr.f16407b, c1767qr.f16408c, c1767qr.f16409d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            AbstractC1896tC abstractC1896tCA = c1465lCK.entrySet().a();
            while (abstractC1896tCA.hasNext()) {
                Map.Entry entry2 = (Map.Entry) abstractC1896tCA.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((C1767qr) entry2.getValue()).f16409d) {
                    map.put(str4, (C1767qr) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap map = this.f15823a;
            if (!map.containsKey(str)) {
                map.put(str, new C1659or(str, new Bundle()));
            }
        }
    }

    public final synchronized void e() {
        this.f15824b.clear();
        this.f15823a.clear();
        this.f15827e.clear();
        this.f15826d.clear();
        h();
        f();
        g();
    }

    public final synchronized void f() {
        JSONObject jSONObject;
        if (!((Boolean) AbstractC1696pa.f16176f.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8759i2)).booleanValue() && (jSONObject = p2.j.f22785C.f22795h.i().s().f7978g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle bundleL = l(jSONObject2.optJSONObject("data"));
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject2.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f15824b.put(strOptString, new C1767qr(strOptString, zOptBoolean2, zOptBoolean, true, bundleL));
                        }
                    }
                } catch (JSONException e6) {
                    AbstractC2907C.n("Malformed config loading JSON.", e6);
                }
            }
        }
    }

    public final synchronized void g() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) AbstractC1696pa.f16172b.v()).booleanValue()) {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8765j2)).booleanValue() && (jSONObject = p2.j.f22785C.f22795h.i().s().f7978g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i3);
                                boolean zOptBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject3.optString("platform");
                                C1767qr c1767qr = new C1767qr(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.f15826d.put(strOptString, c1767qr);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.f15827e.put(strOptString, c1767qr);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e6) {
            AbstractC2907C.n("Malformed config loading JSON.", e6);
        } finally {
        }
    }

    public final synchronized void h() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = p2.j.f22785C.f22795h.i().s().f7978g;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f15829g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) C2841s.f23267e.f23270c.a(H9.fc)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String strOptString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                    arrayList.addAll(i(jSONArrayOptJSONArray.getJSONObject(i3)));
                                }
                            }
                            j(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e6) {
                    AbstractC2907C.n("Malformed config loading JSON.", e6);
                }
            }
        } catch (Throwable th) {
            throw th;
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
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str = (String) arrayList2.get(i3);
                        d(str);
                        if (((C1659or) this.f15823a.get(str)) != null) {
                            arrayList.add(new C1659or(str, bundleL));
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
            HashMap map = this.f15825c;
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
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C1465lC k(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(p2.j.f22785C.f22795h.i().s().f7976e)) {
                E9 e9 = H9.f8663R3;
                C2841s c2841s = C2841s.f23267e;
                boolean zMatches = Pattern.matches((String) c2841s.f23270c.a(e9), str);
                boolean zMatches2 = Pattern.matches((String) c2841s.f23270c.a(H9.f8669S3), str);
                if (zMatches) {
                    map = new HashMap(this.f15827e);
                } else if (zMatches2) {
                    map = new HashMap(this.f15826d);
                }
                return C1465lC.a(map);
            }
            return C1465lC.f15361g;
        } catch (Throwable th) {
            throw th;
        }
    }
}
