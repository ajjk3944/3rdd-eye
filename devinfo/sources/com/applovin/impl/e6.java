package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e6 extends i5 implements m2 {
    private final JSONObject g;

    /* renamed from: h, reason: collision with root package name */
    private final u f4068h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f4069i;
    private final boolean j;

    public e6(JSONObject jSONObject, u uVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(jSONObject, uVar, false, appLovinAdLoadListener, kVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", "undefined");
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Starting task for AppLovin ad...");
            }
            this.f4287a.q0().a(new j6(jSONObject, this.g, this, this.f4287a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Starting task for VAST ad...");
            }
            this.f4287a.q0().a(h6.a(jSONObject, this.g, this, this.f4287a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.b(this.f4288b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, je.u.t("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f4069i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.j || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f4287a.g().a(d2.A, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i4) {
        failedToReceiveAdV2(new AppLovinError(i4, ""));
    }

    @Override // com.applovin.impl.m2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f4069i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.j) {
            return;
        }
        this.f4287a.g().a(d2.B, this.f4068h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayS = a0.g.s("ads", this.g);
        if (jSONArrayS.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArrayS, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.k(this.f4288b, "No ads were returned from the server");
            }
            n7.a(this.f4068h.e(), this.f4068h.d(), this.g, this.f4287a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public e6(JSONObject jSONObject, u uVar, boolean z3, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.g = jSONObject;
        this.f4068h = uVar;
        this.f4069i = appLovinAdLoadListener;
        this.j = z3;
    }
}
