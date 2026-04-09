package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2146t0 extends C2141q0 {

    /* renamed from: c, reason: collision with root package name */
    private Map f21443c;

    public C2146t0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public Map d() {
        return this.f21443c;
    }

    public String e() {
        return JsonUtils.getString(this.f20733b, AppMeasurementSdk.ConditionalUserProperty.NAME, null);
    }

    @Override // com.applovin.impl.C2141q0
    public String toString() {
        return "ConsentFlowState{id=" + b() + ", type=" + c() + ", name=" + e() + "}";
    }
}
