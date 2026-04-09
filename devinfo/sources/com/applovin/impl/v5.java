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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class v5 extends i5 {
    private final a3 g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONArray f5876h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f5877i;
    private final a.InterfaceC0014a j;

    public v5(a3 a3Var, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0014a interfaceC0014a) {
        super("TaskFetchMediatedAd", kVar, a3Var.b());
        this.g = a3Var;
        this.f5876h = jSONArray;
        this.f5877i = context;
        this.j = interfaceC0014a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            r0.c(jSONObject, this.f4287a);
            r0.b(jSONObject, this.f4287a);
            r0.a(jSONObject, this.f4287a);
            l3.f(jSONObject, this.f4287a);
            l3.d(jSONObject, this.f4287a);
            l3.e(jSONObject, this.f4287a);
            l3.g(jSONObject, this.f4287a);
            this.f4287a.m().a();
            MaxAdFormat maxAdFormatA = this.g.a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (maxAdFormatA == fromString) {
                a(jSONObject);
                return;
            }
            String strB = this.g.b();
            if (fromString == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4289c.b(this.f4288b, "Mediated ad response is missing the ad format field for ad unit " + strB);
                }
                if (jSONObject.has("ads")) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f4287a.D().a(d2.f3872a1, this.f4288b, map);
                }
                this.j.onAdLoadFailed(strB, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatA.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strB + ") is assigned to the correct ad format.";
            if (n7.a(maxAdFormatA, fromString)) {
                com.applovin.impl.sdk.o.j(this.f4288b, str);
                a(jSONObject);
                return;
            }
            l1.a(str, new Object[0]);
            com.applovin.impl.sdk.o.h(this.f4288b, str);
            this.j.onAdLoadFailed(strB, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB);
            CollectionUtils.putStringIfValid("name", label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f4287a.D().a(d2.S0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Unable to process mediated ad response for ad unit " + this.g.b(), th2);
            }
            throw new RuntimeException("Unable to process ad: " + th2);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f4287a.X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !n7.h(com.applovin.impl.sdk.k.o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f4287a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f4287a.Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            s3 s3Var = s3.f5290f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) u3VarY.a(s3.g, t3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return l3.a(this.f4287a);
    }

    private String f() {
        return l3.b(this.f4287a);
    }

    private JSONObject g() throws JSONException {
        Map mapA = this.f4287a.A().a((Map) null, false, true);
        mapA.putAll(this.g.c());
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
        map.put("AppLovin-Ad-Unit-Id", this.g.b());
        map.put("AppLovin-Ad-Format", this.g.a().getLabel());
        Map mapD = this.g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapD.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapD.get("retry_delay_sec"), map);
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        v5 v5Var;
        JSONObject jSONObjectG;
        HashMap map;
        MaxAdFormat maxAdFormatA = this.g.a();
        String strB = this.g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Fetching next ad for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        k2.a();
        if (((Boolean) this.f4287a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "User is connected to a VPN");
        }
        this.f4287a.P().a(d2.f3885h0, maxAdFormatA, strB, (MaxError) null);
        if (((Boolean) this.f4287a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f4287a.Y();
            s3 s3Var = s3.f5290f;
            u3VarY.a(s3Var, t3.a(strB));
            u3VarY.a(s3Var, t3.a(maxAdFormatA));
        }
        n7.a(this.f4287a, this.f4288b);
        try {
            jSONObjectG = g();
            map = new HashMap();
            if (!((Boolean) this.f4287a.a(x4.B5)).booleanValue() && !((Boolean) this.f4287a.a(x4.f6190z5)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f4287a.a(x4.f6074k5)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4287a.i0());
            }
            if (this.f4287a.s0().c()) {
                map.put("test_mode", "1");
            }
            List listB = this.f4287a.s0().b();
            String str = this.f4287a.n0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = listB.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (true) {
                        sb2.append((CharSequence) next);
                        if (!it.hasNext()) {
                            break;
                        }
                        sb2.append((CharSequence) ",");
                        next = it.next();
                    }
                }
                String string = sb2.toString();
                map.put("filter_ad_network", string);
                if (!this.f4287a.s0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f4287a.s0().d()) {
                    map.put("force_ad_network", string);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            v5Var = this;
        } catch (Throwable th2) {
            th = th2;
            v5Var = this;
        }
        try {
            a aVar = v5Var.new a(com.applovin.impl.sdk.network.a.a(this.f4287a).c("POST").a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f4287a.a(r3.f5250y8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f4287a.a(r3.f5238s7)).intValue()).a(((Integer) this.f4287a.a(x4.W2)).intValue()).b(((Long) this.f4287a.a(r3.f5236r7)).intValue()).a(u4.a.a(((Integer) this.f4287a.a(x4.f6120q5)).intValue())).f(true).a(), this.f4287a, strB, maxAdFormatA);
            aVar.c(r3.f5232p7);
            aVar.b(r3.f5234q7);
            v5Var.f4287a.q0().a(aVar);
        } catch (Throwable th3) {
            th = th3;
            if (com.applovin.impl.sdk.o.a()) {
                v5Var.f4289c.a(v5Var.f4288b, "Unable to fetch ad for Ad Unit ID: " + strB, th);
            }
            a("", 0, th.getMessage());
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends l6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f5878m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f5879n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, String str, MaxAdFormat maxAdFormat) {
            super(aVar, kVar);
            this.f5878m = str;
            this.f5879n = maxAdFormat;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i4) {
            if (i4 != 200) {
                v5.this.a(str, i4, (String) null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f4443l.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f4443l.b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i4), map);
            CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, this.f5878m, map);
            CollectionUtils.putStringIfValid("ad_format", this.f5879n.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f4443l.a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f4443l.b()), map);
            this.f4287a.P().d(d2.f3887i0, map);
            v5.this.b(jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, JSONObject jSONObject) {
            v5.this.a(str, i4, str2);
            this.f4287a.D().a("fetchMediatedAd", str, i4, str2);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        String strB = this.g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB);
        jSONObject2.put("ad_format", this.g.a().getLabel());
        Map map = CollectionUtils.map(this.g.d());
        com.applovin.impl.sdk.p pVarA0 = this.f4287a.a0();
        CollectionUtils.putStringIfValid("previous_request_id", pVarA0.b(strB), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", pVarA0.a(strB), map);
        p.a aVarC = pVarA0.c(strB);
        if (aVarC != null) {
            if (Boolean.parseBoolean(this.f4287a.n0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
            }
            if (this.f4287a.R() != null) {
                Queue<y2> queueC = this.f4287a.R().c(strB);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (y2 y2Var : queueC) {
                    arrayList.add(y2Var.c());
                    arrayList2.add(y2Var.getNetworkName());
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) ",");
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", sb2.toString(), map);
                StringBuilder sb3 = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            sb3.append((CharSequence) ",");
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_network_names", sb3.toString(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f4287a.T().a()));
            jSONObject2.put("installed", w3.b(this.f4287a));
            jSONObject2.put("initialized", this.f4287a.S().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f4287a.S().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f4287a.T().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f4287a.T().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Failed to populate adapter classNames", e2);
            }
            throw new RuntimeException("Failed to populate classNames: " + e2);
        }
    }

    private void a(JSONObject jSONObject) {
        f6 f6Var = new f6(this.g, jSONObject, this.f5877i, this.f4287a, this.j);
        long j = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j > 0) {
            this.f4287a.q0().a(f6Var, d6.b.MEDIATION, j, true);
        } else {
            this.f4287a.q0().a(f6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i4, String str2) {
        MaxErrorImpl maxErrorImpl;
        String strB = this.g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.b(this.f4288b, "Unable to fetch ad for ad unit " + strB + ": server returned " + i4);
        }
        if (i4 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i4 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i4), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map);
        CollectionUtils.putStringIfValid("ad_format", this.g.a().getLabel(), map);
        this.f4287a.P().d(d2.f3888j0, map);
        t2.a(this.j, strB, maxErrorImpl);
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f5876h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f4287a.n0().getExtraParameters()));
    }
}
