package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import r.InterfaceC5503a;

/* loaded from: classes.dex */
public abstract class q2 extends a3 implements MaxAd {

    /* renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f20753k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f20754l;

    /* renamed from: m, reason: collision with root package name */
    protected com.applovin.impl.mediation.h f20755m;

    /* renamed from: n, reason: collision with root package name */
    private final String f20756n;

    /* renamed from: o, reason: collision with root package name */
    private MaxAdWaterfallInfo f20757o;

    /* renamed from: p, reason: collision with root package name */
    private long f20758p;

    /* renamed from: q, reason: collision with root package name */
    private String f20759q;

    /* renamed from: r, reason: collision with root package name */
    private String f20760r;

    /* renamed from: s, reason: collision with root package name */
    private Bundle f20761s;

    public q2(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(map, jSONObject, jSONObject2, kVar);
        this.f20753k = new AtomicBoolean();
        this.f20754l = new AtomicBoolean();
        this.f20755m = hVar;
        this.f20756n = hVar != null ? hVar.b() : null;
    }

    private long I() {
        return a("load_started_time_ms", 0L);
    }

    public static q2 a(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new s2(map, jSONObject, jSONObject2, kVar);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new u2(map, jSONObject, jSONObject2, kVar);
        }
        if (fromString.isFullscreenAd()) {
            return new t2(map, jSONObject, jSONObject2, kVar);
        }
        throw new IllegalArgumentException(androidx.work.s.d("Unsupported ad format: ", string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(v4 v4Var) {
        return JsonUtils.deepCopy(v4Var.a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(v4 v4Var) throws JSONException {
        JSONObject jSONObjectA;
        if (v4Var.a("credentials")) {
            jSONObjectA = v4Var.a("credentials", new JSONObject());
        } else {
            jSONObjectA = v4Var.a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, P());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(v4 v4Var) {
        return JsonUtils.deepCopy(v4Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double e(v4 v4Var) {
        return Double.valueOf(JsonUtils.getDouble(v4Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject f(v4 v4Var) {
        return JsonUtils.deepCopy(v4Var.a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(v4 v4Var) {
        return JsonUtils.getString(v4Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public com.applovin.impl.mediation.h A() {
        return this.f20755m;
    }

    public Bundle B() {
        return this.f20761s;
    }

    public String C() {
        return a("bcode", "");
    }

    public long D() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String E() {
        return a("bid_response", (String) null);
    }

    public Bundle F() throws JSONException {
        JSONObject jSONObjectA;
        v4 v4Var = this.f18932h;
        if (v4Var != null) {
            return (Bundle) v4Var.a(new InterfaceC5503a() { // from class: com.applovin.impl.E0
                @Override // r.InterfaceC5503a
                public final Object apply(Object obj) {
                    return this.f18797a.c((v4) obj);
                }
            });
        }
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, P());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public long G() {
        if (I() > 0) {
            return H() - I();
        }
        return -1L;
    }

    public long H() {
        return a("load_completed_time_ms", 0L);
    }

    public String J() {
        return this.f20759q;
    }

    public int K() {
        return a("mspc", ((Integer) this.f18925a.a(g3.f19366D7)).intValue());
    }

    public JSONObject L() {
        v4 v4Var = this.f18932h;
        return v4Var != null ? (JSONObject) v4Var.a(new G0(0)) : a("publisher_extra_info", new JSONObject());
    }

    public String M() {
        return JsonUtils.getString(N(), "revenue_event", "");
    }

    public JSONObject N() {
        v4 v4Var = this.f18932h;
        return v4Var != null ? (JSONObject) v4Var.a(new D0(0)) : a("revenue_parameters", new JSONObject());
    }

    public String O() {
        return b("event_id", "");
    }

    public String P() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public List Q() {
        return b("mwf_info_urls");
    }

    public String R() {
        return b("waterfall_name", "");
    }

    public String S() {
        return b("waterfall_test_name", "");
    }

    public boolean T() {
        return StringUtils.isValidString(E());
    }

    public boolean U() {
        com.applovin.impl.mediation.h hVar = this.f20755m;
        return hVar != null && hVar.k() && this.f20755m.j();
    }

    public boolean V() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean W() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void X() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void Y() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean Z() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    public abstract q2 a(com.applovin.impl.mediation.h hVar);

    public Boolean a0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public Boolean b0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f20760r;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.f20755m;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(P());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f20758p;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f18925a.a(g3.f19370I7)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            v4 v4Var = this.f18932h;
            return v4Var != null ? ((Double) v4Var.a(new D0(1))).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f18925a.O();
        if (!com.applovin.impl.sdk.o.a()) {
            return 0.0d;
        }
        this.f18925a.O().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        v4 v4Var = this.f18932h;
        return v4Var != null ? (String) v4Var.a(new F0(0)) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iA = a("ad_width", -3);
        int iA2 = a("ad_height", -3);
        return (iA == -3 || iA2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iA, iA2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f20757o;
    }

    public void h(String str) {
        this.f20760r = str;
    }

    public void i(String str) {
        this.f20759q = str;
    }

    @Override // com.applovin.impl.a3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + P() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public String z() {
        return this.f20756n;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectX = x();
        if (jSONObjectX.has(str)) {
            return JsonUtils.getString(jSONObjectX, str, str2);
        }
        Bundle bundleL = l();
        if (bundleL.containsKey(str)) {
            return bundleL.getString(str);
        }
        JSONObject jSONObjectL = L();
        return jSONObjectL.has(str) ? JsonUtils.getString(jSONObjectL, str, str2) : a(str, str2);
    }

    public void t() {
        this.f20755m = null;
        this.f20757o = null;
    }

    public AtomicBoolean u() {
        return this.f20753k;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.f20754l;
    }

    public JSONObject x() {
        v4 v4Var = this.f18932h;
        return v4Var != null ? (JSONObject) v4Var.a(new C.I(2)) : a("ad_values", new JSONObject());
    }

    public View y() {
        com.applovin.impl.mediation.h hVar;
        if (!U() || (hVar = this.f20755m) == null) {
            return null;
        }
        return hVar.d();
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f20757o = maxAdWaterfallInfo;
    }

    public void a(long j4) {
        this.f20758p = j4;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectL = L();
        JsonUtils.putAll(jSONObjectL, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectL);
    }

    public void a(Bundle bundle) throws JSONException {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i10 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i);
            c("ad_height", i10);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
        if (bundle.containsKey("array_parameters")) {
            this.f20761s = bundle.getBundle("array_parameters");
        }
    }
}
