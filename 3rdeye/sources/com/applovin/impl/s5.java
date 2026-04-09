package com.applovin.impl;

import N7.H7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s5 extends w4 implements g2 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f20941g;

    /* renamed from: h, reason: collision with root package name */
    private final C2145t f20942h;
    private final AppLovinAdLoadListener i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f20943j;

    public s5(JSONObject jSONObject, C2145t c2145t, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(jSONObject, c2145t, false, appLovinAdLoadListener, kVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", "undefined");
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Starting task for AppLovin ad...");
            }
            this.f21692a.q0().a(new x5(jSONObject, this.f20941g, this, this.f21692a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Starting task for VAST ad...");
            }
            this.f21692a.q0().a(v5.a(jSONObject, this.f20941g, this, this.f21692a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, androidx.work.s.d("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f20943j || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f21692a.g().a(y1.f21807n, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.g2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof g2) {
            ((g2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f20943j) {
            return;
        }
        this.f21692a.g().a(y1.f21809o, this.f20942h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayQ = H7.q("ads", this.f20941g);
        if (jSONArrayQ.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArrayQ, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.k(this.f21693b, "No ads were returned from the server");
            }
            a7.a(this.f20942h.e(), this.f20942h.d(), this.f20941g, this.f21692a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public s5(JSONObject jSONObject, C2145t c2145t, boolean z10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c2145t == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f20941g = jSONObject;
        this.f20942h = c2145t;
        this.i = appLovinAdLoadListener;
        this.f20943j = z10;
    }
}
