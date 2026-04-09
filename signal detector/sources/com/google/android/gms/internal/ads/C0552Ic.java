package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552Ic {

    /* renamed from: a, reason: collision with root package name */
    public final List f9106a;

    public C0552Ic(JSONObject jSONObject) throws JSONException {
        if (u2.k.l(2)) {
            AbstractC2907C.m("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                C0535Hc c0535Hc = new C0535Hc(jSONArray.getJSONObject(i3));
                "banner".equalsIgnoreCase(c0535Hc.f8963c);
                arrayList.add(c0535Hc);
                if (i < 0) {
                    Iterator it = c0535Hc.f8961a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f9106a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            W9 w9 = p2.j.f22785C.f22808v;
            W9.h("click_urls", jSONObjectOptJSONObject);
            W9.h("imp_urls", jSONObjectOptJSONObject);
            W9.h("downloaded_imp_urls", jSONObjectOptJSONObject);
            W9.h("nofill_urls", jSONObjectOptJSONObject);
            W9.h("remote_ping_urls", jSONObjectOptJSONObject);
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            C0520Ge.a(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
