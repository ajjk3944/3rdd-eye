package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n6 {

    /* renamed from: a, reason: collision with root package name */
    private final a f20595a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f20596b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20597c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20598d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f20599e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i) {
            return i != 0 ? i != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public n6(JSONObject jSONObject, String str) {
        this.f20598d = str;
        this.f20595a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f20596b = JsonUtils.getInteger(jSONObject, FacebookMediationAdapter.KEY_ID, null);
        this.f20597c = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, null);
    }

    public void a(Boolean bool) {
        this.f20599e = bool;
    }

    public String b() {
        return this.f20598d;
    }

    public String c() {
        return this.f20597c;
    }

    public Integer d() {
        return this.f20596b;
    }

    public String e() {
        Boolean bool = this.f20599e;
        return "\n" + this.f20598d + " - " + (bool != null ? String.valueOf(bool) : AbstractC2130l0.b().a(com.applovin.impl.sdk.k.o()));
    }

    public a f() {
        return this.f20595a;
    }

    public Boolean a() {
        return this.f20599e;
    }
}
