package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.AbstractC2135n0;
import com.applovin.impl.C2125j;
import com.applovin.impl.l2;
import com.applovin.impl.l5;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u5;
import com.applovin.impl.w4;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final o logger;
    private final k sdk;

    public AppLovinNativeAdService(k kVar) {
        this.sdk = kVar;
        this.logger = kVar.O();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            o.h(TAG, "Empty ad token");
            l2.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        C2125j c2125j = new C2125j(strTrim, this.sdk);
        if (c2125j.c() == C2125j.a.REGULAR) {
            if (o.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + c2125j);
            }
            this.sdk.q0().a((w4) new l5(c2125j, appLovinNativeAdLoadListener, this.sdk), r5.b.CORE);
            return;
        }
        if (c2125j.c() != C2125j.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            o.h(TAG, "Invalid token type");
            l2.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject jSONObjectA = c2125j.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c2125j.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            o.h(TAG, str2);
            l2.b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        AbstractC2135n0.c(jSONObjectA, this.sdk);
        AbstractC2135n0.b(jSONObjectA, this.sdk);
        AbstractC2135n0.a(jSONObjectA, this.sdk);
        if (JsonUtils.getJSONArray(jSONObjectA, "ads", new JSONArray()).length() > 0) {
            if (o.a()) {
                this.logger.a(TAG, "Rendering ad for token: " + c2125j);
            }
            this.sdk.q0().a((w4) new u5(jSONObjectA, appLovinNativeAdLoadListener, this.sdk), r5.b.CORE);
            return;
        }
        if (o.a()) {
            this.logger.b(TAG, "No ad returned from the server for token: " + c2125j);
        }
        l2.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
    }
}
