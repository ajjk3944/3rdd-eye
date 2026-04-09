package t7;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f34444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34445b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34446c;

    public e(JSONObject jSONObject) {
        this.f34446c = jSONObject.optString("billingPeriod");
        this.f34445b = jSONObject.optString("priceCurrencyCode");
        this.f34444a = jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
