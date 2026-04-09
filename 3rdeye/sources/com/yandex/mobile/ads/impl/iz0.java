package com.yandex.mobile.ads.impl;

import d9.C4285c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class iz0 {

    /* renamed from: a, reason: collision with root package name */
    private final xy0 f28903a;

    public /* synthetic */ iz0() {
        this(new xy0());
    }

    public final zy0 a(JSONObject jsonMediationNetwork) {
        C4108f4 c4108f4;
        kotlin.jvm.internal.l.f(jsonMediationNetwork, "jsonMediationNetwork");
        try {
            iq0.f28836a.getClass();
            String strA = iq0.a("adapter", jsonMediationNetwork);
            JSONObject jSONObject = jsonMediationNetwork.getJSONObject("network_data");
            C4285c c4285c = new C4285c();
            Iterator<String> itKeys = jSONObject.keys();
            kotlin.jvm.internal.l.e(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                kotlin.jvm.internal.l.c(next);
                String string = jSONObject.getString(next);
                kotlin.jvm.internal.l.e(string, "getString(...)");
                c4285c.put(next, string);
            }
            C4285c c4285cC = c4285c.c();
            if (c4285cC.isEmpty()) {
                return null;
            }
            List listC = iq0.c("click_tracking_urls", jsonMediationNetwork);
            List listC2 = iq0.c("impression_tracking_urls", jsonMediationNetwork);
            List listC3 = iq0.c("ad_response_tracking_urls", jsonMediationNetwork);
            Map mapA = iq0.a(jsonMediationNetwork);
            if (jsonMediationNetwork.has("impression_data")) {
                this.f28903a.getClass();
                try {
                    String string2 = jsonMediationNetwork.getString("impression_data");
                    kotlin.jvm.internal.l.c(string2);
                    if (string2.length() == 0 || "null".equals(string2)) {
                        throw new JSONException("Json has not required attributes");
                    }
                    c4108f4 = new C4108f4(string2);
                } catch (Exception unused) {
                    fp0.b(new Object[0]);
                }
            } else {
                c4108f4 = null;
            }
            return new zy0(strA, c4285cC, listC2, listC, listC3, c4108f4, mapA);
        } catch (JSONException unused2) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    public iz0(xy0 impressionDataParser) {
        kotlin.jvm.internal.l.f(impressionDataParser, "impressionDataParser");
        this.f28903a = impressionDataParser;
    }
}
