package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.i3;
import com.applovin.impl.i4;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* loaded from: classes.dex */
public class j5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final String f19591g;

    /* renamed from: h, reason: collision with root package name */
    private final MaxAdFormat f19592h;
    private final Map i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f19593j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f19594k;

    /* renamed from: l, reason: collision with root package name */
    private final JSONArray f19595l;

    /* renamed from: m, reason: collision with root package name */
    private final Context f19596m;

    /* renamed from: n, reason: collision with root package name */
    private final a.InterfaceC0312a f19597n;

    public j5(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0312a interfaceC0312a) {
        super("TaskFetchMediatedAd", kVar, str);
        this.f19591g = str;
        this.f19592h = maxAdFormat;
        this.i = map;
        this.f19593j = map2;
        this.f19594k = map3;
        this.f19595l = jSONArray;
        this.f19596m = context;
        this.f19597n = interfaceC0312a;
    }

    private void c(JSONObject jSONObject) throws JSONException {
        JSONObject andResetCustomPostBodyData = this.f21692a.X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !a7.f(com.applovin.impl.sdk.k.o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f21692a.a(l4.f19983n4)).booleanValue()) {
            j3 j3VarY = this.f21692a.Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            h3 h3Var = h3.f19496c;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) j3VarY.a(h3Var, i3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) j3VarY.a(h3Var, i3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) j3VarY.a(h3.f19497d, i3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return b3.a(this.f21692a);
    }

    private String f() {
        return b3.b(this.f21692a);
    }

    private JSONObject g() throws JSONException {
        Map mapA = this.f21692a.B().a((Map) null, false, true);
        mapA.putAll(this.f19594k);
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
        HashMap map = new HashMap(2);
        map.put("AppLovin-Ad-Unit-Id", this.f19591g);
        map.put("AppLovin-Ad-Format", this.f19592h.getLabel());
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", this.f19593j.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", this.f19593j.get("retry_delay_sec"), map);
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Fetching next ad for " + this.f19592h.getLabel() + " ad unit " + this.f19591g);
        }
        e2.a();
        if (((Boolean) this.f21692a.a(l4.f19768J3)).booleanValue() && a7.j() && com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "User is connected to a VPN");
        }
        this.f21692a.P().a(y1.f21776S, this.f19592h, this.f19591g, (MaxError) null);
        if (((Boolean) this.f21692a.a(l4.f19983n4)).booleanValue()) {
            j3 j3VarY = this.f21692a.Y();
            h3 h3Var = h3.f19496c;
            j3VarY.a(h3Var, i3.a(this.f19591g));
            j3VarY.a(h3Var, i3.a(this.f19592h));
        }
        a7.a(this.f21692a, this.f21693b);
        try {
            JSONObject jSONObjectG = g();
            HashMap map = new HashMap();
            if (!((Boolean) this.f21692a.a(l4.f19892b5)).booleanValue() && !((Boolean) this.f21692a.a(l4.f19878Z4)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f21692a.a(l4.f19783L4)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21692a.i0());
            }
            if (this.f21692a.s0().c()) {
                map.put("test_mode", "1");
            }
            List listB = this.f21692a.s0().b();
            String str = this.f21692a.n0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator it = listB.iterator();
                if (it.hasNext()) {
                    CharSequence charSequence = (CharSequence) it.next();
                    while (true) {
                        sb.append(charSequence);
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) StringUtils.COMMA);
                        charSequence = (CharSequence) it.next();
                    }
                }
                String string = sb.toString();
                map.put("filter_ad_network", string);
                if (!this.f21692a.s0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f21692a.s0().d()) {
                    map.put("force_ad_network", string);
                }
            } else if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f21692a).c("POST").a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f21692a.a(g3.f19387R7)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f21692a.a(g3.f19382P6)).intValue()).a(((Integer) this.f21692a.a(l4.f19801O2)).intValue()).b(((Long) this.f21692a.a(g3.f19380O6)).intValue()).a(i4.a.a(((Integer) this.f21692a.a(l4.f19823R4)).intValue())).f(true).a(), this.f21692a);
            aVar.c(g3.f19376M6);
            aVar.b(g3.f19378N6);
            this.f21692a.q0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Unable to fetch ad for Ad Unit ID: " + this.f19591g, th);
            }
            a("", 0, th.getMessage());
        }
    }

    public class a extends z5 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (i == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f21904l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f21904l.b());
                HashMap map = new HashMap(6);
                CollectionUtils.putStringIfValid(ImagesContract.URL, com.applovin.impl.sdk.utils.StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i), map);
                CollectionUtils.putStringIfValid(Constants.ADMON_AD_UNIT_ID, j5.this.f19591g, map);
                CollectionUtils.putStringIfValid("ad_format", j5.this.f19592h.getLabel(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f21904l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f21904l.b()), map);
                this.f21692a.P().d(y1.f21777T, map);
                j5.this.b(jSONObject);
                return;
            }
            j5.this.a(str, i, (String) null);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            j5.this.a(str, i, str2);
            this.f21692a.E().a("fetchMediatedAd", str, i, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            AbstractC2135n0.c(jSONObject, this.f21692a);
            AbstractC2135n0.b(jSONObject, this.f21692a);
            AbstractC2135n0.a(jSONObject, this.f21692a);
            b3.f(jSONObject, this.f21692a);
            b3.d(jSONObject, this.f21692a);
            b3.e(jSONObject, this.f21692a);
            b3.g(jSONObject, this.f21692a);
            this.f21692a.m().a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (this.f19592h == fromString) {
                a(jSONObject);
                return;
            }
            if (fromString == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "Mediated ad response is missing the ad format field for ad unit " + this.f19591g);
                }
                if (jSONObject.has("ads")) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid(Constants.ADMON_AD_UNIT_ID, this.f19591g, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f21692a.E().a(y1.f21762E0, this.f21693b, map);
                }
                this.f19597n.onAdLoadFailed(this.f19591g, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = this.f19592h.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + this.f19591g + ") is assigned to the correct ad format.";
            if (a7.a(this.f19592h, fromString)) {
                com.applovin.impl.sdk.o.j(this.f21693b, str);
                a(jSONObject);
                return;
            }
            g1.a(str, new Object[0]);
            com.applovin.impl.sdk.o.h(this.f21693b, str);
            this.f19597n.onAdLoadFailed(this.f19591g, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(Constants.ADMON_AD_UNIT_ID, this.f19591g);
            CollectionUtils.putStringIfValid(AppMeasurementSdk.ConditionalUserProperty.NAME, label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f21692a.E().a(y1.f21826w0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Unable to process mediated ad response for ad unit " + this.f19591g, th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Constants.ADMON_AD_UNIT_ID, this.f19591g);
        jSONObject2.put("ad_format", this.f19592h.getLabel());
        Map map = CollectionUtils.map(this.f19593j);
        com.applovin.impl.sdk.p pVarA0 = this.f21692a.a0();
        CollectionUtils.putStringIfValid("previous_request_id", pVarA0.b(this.f19591g), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", pVarA0.a(this.f19591g), map);
        p.a aVarC = pVarA0.c(this.f19591g);
        if (aVarC != null) {
            if (Boolean.parseBoolean(this.f21692a.n0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
            }
            if (this.f21692a.R() != null) {
                Queue<q2> queueC = this.f21692a.R().c(this.f19591g);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (q2 q2Var : queueC) {
                    arrayList.add(q2Var.c());
                    arrayList2.add(q2Var.getNetworkName());
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) StringUtils.COMMA);
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", sb.toString(), map);
                StringBuilder sb2 = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) StringUtils.COMMA);
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_network_names", sb2.toString(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f21692a.T().a()));
            jSONObject2.put("installed", l3.b(this.f21692a));
            jSONObject2.put("initialized", this.f21692a.S().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f21692a.S().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f21692a.T().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f21692a.T().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Failed to populate adapter classNames", e4);
            }
            throw new RuntimeException("Failed to populate classNames: " + e4);
        }
    }

    private void a(JSONObject jSONObject) {
        t5 t5Var = new t5(this.f19591g, this.f19592h, this.i, jSONObject, this.f19596m, this.f21692a, this.f19597n);
        long j4 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j4 > 0) {
            this.f21692a.q0().a(t5Var, r5.b.MEDIATION, j4, true);
        } else {
            this.f21692a.q0().a(t5Var);
        }
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f19595l;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, String str2) {
        MaxErrorImpl maxErrorImpl;
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "Unable to fetch ad for ad unit " + this.f19591g + ": server returned " + i);
        }
        if (i == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid(ImagesContract.URL, com.applovin.impl.sdk.utils.StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid(Constants.ADMON_AD_UNIT_ID, this.f19591g, map);
        CollectionUtils.putStringIfValid("ad_format", this.f19592h.getLabel(), map);
        this.f21692a.P().d(y1.f21778U, map);
        l2.a(this.f19597n, this.f19591g, maxErrorImpl);
    }

    private void g(JSONObject jSONObject) throws JSONException {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f21692a.n0().getExtraParameters()));
    }
}
