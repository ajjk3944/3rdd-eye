package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.banner.MediatedBannerSize;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cz0 {
    public static JSONObject a(zy0 mediationNetwork, String bidderToken, MediatedBannerSize mediatedBannerSize) throws JSONException {
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(bidderToken, "bidderToken");
        String strE = mediationNetwork.e();
        Map<String, String> mapF = mediationNetwork.f();
        Map<String, String> mapI = mediationNetwork.i();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adapter", strE);
            if (mapF != null) {
                jSONObject.put("bidding_info", new JSONObject(mapF));
            }
            jSONObject.put("network_data", new JSONObject(mapI));
            jSONObject.put("bidder_token", bidderToken);
            if (mediatedBannerSize != null) {
                jSONObject.put("size", new JSONObject(mediatedBannerSize.toSizeData()));
            }
            return jSONObject;
        } catch (JSONException unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }
}
