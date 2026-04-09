package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e6 extends i5 implements m2 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f5936g;

    /* renamed from: h, reason: collision with root package name */
    private final u f5937h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f5938i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f5939j;

    public e6(JSONObject jSONObject, u uVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(jSONObject, uVar, false, appLovinAdLoadListener, kVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, HandleInvocationsFromAdViewer.KEY_AD_TYPE, AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Starting task for AppLovin ad...");
            }
            this.f6218a.q0().a(new j6(jSONObject, this.f5936g, this, this.f6218a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Starting task for VAST ad...");
            }
            this.f6218a.q0().a(h6.a(jSONObject, this.f5936g, this, this.f6218a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f5938i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f5939j || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f6218a.g().a(d2.A, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.m2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f5938i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f5939j) {
            return;
        }
        this.f6218a.g().a(d2.B, this.f5937h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f5936g, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.k(this.f6219b, "No ads were returned from the server");
            }
            n7.a(this.f5937h.e(), this.f5937h.d(), this.f5936g, this.f6218a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public e6(JSONObject jSONObject, u uVar, boolean z10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f5936g = jSONObject;
        this.f5937h = uVar;
        this.f5938i = appLovinAdLoadListener;
        this.f5939j = z10;
    }
}
