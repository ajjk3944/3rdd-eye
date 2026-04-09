package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v5 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final a3 f8280g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONArray f8281h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f8282i;

    /* renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0078a f8283j;

    public v5(a3 a3Var, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0078a interfaceC0078a) {
        super("TaskFetchMediatedAd", kVar, a3Var.b());
        this.f8280g = a3Var;
        this.f8281h = jSONArray;
        this.f8282i = context;
        this.f8283j = interfaceC0078a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            r0.c(jSONObject, this.f6218a);
            r0.b(jSONObject, this.f6218a);
            r0.a(jSONObject, this.f6218a);
            l3.f(jSONObject, this.f6218a);
            l3.d(jSONObject, this.f6218a);
            l3.e(jSONObject, this.f6218a);
            l3.g(jSONObject, this.f6218a);
            this.f6218a.m().a();
            MaxAdFormat maxAdFormatA = this.f8280g.a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (maxAdFormatA == fromString) {
                a(jSONObject);
                return;
            }
            String strB = this.f8280g.b();
            if (fromString == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.b(this.f6219b, "Mediated ad response is missing the ad format field for ad unit " + strB);
                }
                if (jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f6218a.D().a(d2.f5716a1, this.f6219b, map);
                }
                this.f8283j.onAdLoadFailed(strB, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatA.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strB + ") is assigned to the correct ad format.";
            if (n7.a(maxAdFormatA, fromString)) {
                com.applovin.impl.sdk.o.j(this.f6219b, str);
                a(jSONObject);
                return;
            }
            l1.a(str, new Object[0]);
            com.applovin.impl.sdk.o.h(this.f6219b, str);
            this.f8283j.onAdLoadFailed(strB, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB);
            CollectionUtils.putStringIfValid("name", label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f6218a.D().a(d2.S0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Unable to process mediated ad response for ad unit " + this.f8280g.b(), th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void c(JSONObject jSONObject) throws JSONException {
        JSONObject andResetCustomPostBodyData = this.f6218a.X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !n7.h(com.applovin.impl.sdk.k.o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f6218a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f6218a.Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            s3 s3Var = s3.f7538f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) u3VarY.a(s3.f7539g, t3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return l3.a(this.f6218a);
    }

    private String f() {
        return l3.b(this.f6218a);
    }

    private JSONObject g() throws JSONException {
        Map mapA = this.f6218a.A().a((Map) null, false, true);
        mapA.putAll(this.f8280g.c());
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private Map h() {
        HashMap map = new HashMap(4);
        map.put("AppLovin-Ad-Unit-Id", this.f8280g.b());
        map.put("AppLovin-Ad-Format", this.f8280g.a().getLabel());
        Map mapD = this.f8280g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapD.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapD.get("retry_delay_sec"), map);
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        v5 v5Var;
        JSONObject jSONObjectG;
        HashMap map;
        MaxAdFormat maxAdFormatA = this.f8280g.a();
        String strB = this.f8280g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Fetching next ad for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        k2.a();
        if (((Boolean) this.f6218a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "User is connected to a VPN");
        }
        this.f6218a.P().a(d2.f5730h0, maxAdFormatA, strB, (MaxError) null);
        if (((Boolean) this.f6218a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f6218a.Y();
            s3 s3Var = s3.f7538f;
            u3VarY.a(s3Var, t3.a(strB));
            u3VarY.a(s3Var, t3.a(maxAdFormatA));
        }
        n7.a(this.f6218a, this.f6219b);
        try {
            jSONObjectG = g();
            map = new HashMap();
            if (!((Boolean) this.f6218a.a(x4.B5)).booleanValue() && !((Boolean) this.f6218a.a(x4.f8632z5)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f6218a.a(x4.f8510k5)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f6218a.i0());
            }
            if (this.f6218a.s0().c()) {
                map.put("test_mode", "1");
            }
            List listB = this.f6218a.s0().b();
            String str = this.f6218a.n0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                String strA = wc.a(",", listB);
                map.put("filter_ad_network", strA);
                if (!this.f6218a.s0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f6218a.s0().d()) {
                    map.put("force_ad_network", strA);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            v5Var = this;
        } catch (Throwable th) {
            th = th;
            v5Var = this;
        }
        try {
            a aVar = v5Var.new a(com.applovin.impl.sdk.network.a.a(this.f6218a).c("POST").a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f6218a.a(r3.f7492y8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f6218a.a(r3.f7479s7)).intValue()).a(((Integer) this.f6218a.a(x4.W2)).intValue()).b(((Long) this.f6218a.a(r3.f7477r7)).intValue()).a(u4.a.a(((Integer) this.f6218a.a(x4.f8560q5)).intValue())).f(true).a(), this.f6218a, strB, maxAdFormatA);
            aVar.c(r3.f7473p7);
            aVar.b(r3.f7475q7);
            v5Var.f6218a.q0().a(aVar);
        } catch (Throwable th2) {
            th = th2;
            if (com.applovin.impl.sdk.o.a()) {
                v5Var.f6220c.a(v5Var.f6219b, "Unable to fetch ad for Ad Unit ID: " + strB, th);
            }
            a("", 0, th.getMessage());
        }
    }

    public class a extends l6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f8284m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f8285n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, String str, MaxAdFormat maxAdFormat) {
            super(aVar, kVar);
            this.f8284m = str;
            this.f8285n = maxAdFormat;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) throws JSONException {
            if (i10 != 200) {
                v5.this.a(str, i10, (String) null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f6417l.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f6417l.b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
            CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, this.f8284m, map);
            CollectionUtils.putStringIfValid("ad_format", this.f8285n.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f6417l.a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f6417l.b()), map);
            this.f6218a.P().d(d2.f5732i0, map);
            v5.this.b(jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            v5.this.a(str, i10, str2);
            this.f6218a.D().a("fetchMediatedAd", str, i10, str2);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        String strB = this.f8280g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB);
        jSONObject2.put("ad_format", this.f8280g.a().getLabel());
        Map map = CollectionUtils.map(this.f8280g.d());
        com.applovin.impl.sdk.p pVarA0 = this.f6218a.a0();
        CollectionUtils.putStringIfValid("previous_request_id", pVarA0.b(strB), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", pVarA0.a(strB), map);
        p.a aVarC = pVarA0.c(strB);
        if (aVarC != null) {
            if (Boolean.parseBoolean(this.f6218a.n0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
            }
            if (this.f6218a.R() != null) {
                Queue<y2> queueC = this.f6218a.R().c(strB);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (y2 y2Var : queueC) {
                    arrayList.add(y2Var.c());
                    arrayList2.add(y2Var.getNetworkName());
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", wc.a(",", arrayList), map);
                CollectionUtils.putStringIfValid("queued_ad_network_names", wc.a(",", arrayList2), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f6218a.T().a()));
            jSONObject2.put("installed", w3.b(this.f6218a));
            jSONObject2.put("initialized", this.f6218a.S().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f6218a.S().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f6218a.T().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f6218a.T().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Failed to populate adapter classNames", e10);
            }
            throw new RuntimeException("Failed to populate classNames: " + e10);
        }
    }

    private void a(JSONObject jSONObject) {
        f6 f6Var = new f6(this.f8280g, jSONObject, this.f8282i, this.f6218a, this.f8283j);
        long j10 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j10 > 0) {
            this.f6218a.q0().a(f6Var, d6.b.MEDIATION, j10, true);
        } else {
            this.f6218a.q0().a(f6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, String str2) {
        MaxErrorImpl maxErrorImpl;
        String strB = this.f8280g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "Unable to fetch ad for ad unit " + strB + ": server returned " + i10);
        }
        if (i10 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i10 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map);
        CollectionUtils.putStringIfValid("ad_format", this.f8280g.a().getLabel(), map);
        this.f6218a.P().d(d2.f5734j0, map);
        t2.a(this.f8283j, strB, maxErrorImpl);
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f8281h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void g(JSONObject jSONObject) throws JSONException {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f6218a.n0().getExtraParameters()));
    }
}
