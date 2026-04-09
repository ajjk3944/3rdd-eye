package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class t5 extends i5 {
    private static final AtomicBoolean j = new AtomicBoolean();
    private final int g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f5770h;

    /* renamed from: i, reason: collision with root package name */
    private b f5771i;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface b {
        void a(JSONObject jSONObject);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c extends i5 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f5771i != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4289c.b(this.f4288b, "Timing out fetch basic settings...");
                }
                t5.this.a(new JSONObject());
            }
        }
    }

    public t5(int i4, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f5770h = new Object();
        this.g = i4;
        this.f5771i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return r0.a((String) this.f4287a.a(x4.f6070k0), "5.0/i", b());
    }

    private String g() {
        return r0.a((String) this.f4287a.a(x4.f6061j0), "5.0/i", b());
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.f4287a;
            x4 x4Var = x4.f6190z5;
            if (((Boolean) kVar.a(x4Var)).booleanValue() || ((Boolean) this.f4287a.a(x4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.g);
            jSONObject.put("server_installed_at", this.f4287a.a(x4.f6100o));
            if (this.f4287a.C0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f4287a.z0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", n7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", n7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f4287a.a(x4.L3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f4287a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f4287a.C());
            jSONObject.put("installed_mediation_adapters", w3.b(this.f4287a));
            Map mapG = this.f4287a.A().G();
            jSONObject.put("package_name", mapG.get("package_name"));
            jSONObject.put("app_version", mapG.get("app_version"));
            jSONObject.put("debug", mapG.get("debug"));
            jSONObject.put("tg", mapG.get("tg"));
            jSONObject.put("target_sdk", mapG.get("target_sdk"));
            jSONObject.put("session_id", mapG.get("session_id"));
            List list = (List) mapG.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) mapG.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f4287a.J() != null ? this.f4287a.J().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", mapG.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", mapG.get("IABTCF_gdprApplies"));
            Object obj = mapG.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f4287a.x().b());
            Map mapN = this.f4287a.A().N();
            jSONObject.put("platform", mapN.get("platform"));
            jSONObject.put("os", mapN.get("os"));
            jSONObject.put("locale", mapN.get("locale"));
            jSONObject.put("brand", mapN.get("brand"));
            jSONObject.put("brand_name", mapN.get("brand_name"));
            jSONObject.put("hardware", mapN.get("hardware"));
            jSONObject.put("model", mapN.get("model"));
            jSONObject.put("revision", mapN.get("revision"));
            jSONObject.put("is_tablet", mapN.get("is_tablet"));
            jSONObject.put("screen_size_in", mapN.get("screen_size_in"));
            jSONObject.put("supported_abis", mapN.get("supported_abis"));
            Object obj2 = mapN.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.f4287a.a(x4.W3)).booleanValue()) {
                jSONObject.put("mtl", this.f4287a.m0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            v.a aVarF = this.f4287a.A().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = p0.c().b(a());
            if (((Boolean) this.f4287a.a(x4.G3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            l.b bVarH = this.f4287a.A().H();
            if (((Boolean) this.f4287a.a(x4.z3)).booleanValue() && bVarH != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarH.f5587a);
                jSONObject.put("idfv_scope", bVarH.f5588b);
            }
            if (((Boolean) this.f4287a.a(x4.C3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f4287a.u());
            }
            if (((Boolean) this.f4287a.a(x4.E3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f4287a.h0());
            }
            if (((Boolean) this.f4287a.a(x4.I3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f4287a.r());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f4287a.E());
            if (this.f4287a.s0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f4287a.s0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f4287a.n0().getExtraParameters()));
            Map mapK0 = this.f4287a.k0();
            if (!CollectionUtils.isEmpty(mapK0)) {
                jSONObject.put("segments", new JSONObject(mapK0));
            }
        } catch (JSONException e2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Failed to create JSON body", e2);
            }
            this.f4287a.D().a(this.f4288b, "createJSONBody", e2);
        }
        return jSONObject;
    }

    public Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f4287a.a(x4.A5)).booleanValue() && !((Boolean) this.f4287a.a(x4.f6190z5)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f4287a.a(x4.f6074k5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4287a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f4287a.q(), map);
        Boolean boolB = p0.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = p0.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = p0.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        if (!o0.i() && j.compareAndSet(false, true)) {
            try {
                fc.a.a(com.applovin.impl.sdk.k.o());
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4289c.a(this.f4288b, "Cannot update security provider", th2);
                }
            }
        }
        this.f4287a.v0().d(d2.g, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f4287a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.f4287a.a(x4.L5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f4287a.a(x4.f6006c3)).intValue()).b(((Integer) this.f4287a.a(x4.f6032f3)).intValue()).c(((Integer) this.f4287a.a(x4.f5997b3)).intValue()).e(((Boolean) this.f4287a.a(x4.f6104o3)).booleanValue()).a(u4.a.a(((Integer) this.f4287a.a(x4.f6113p5)).intValue())).f(true).a();
        this.f4287a.q0().a(new c(this.f4287a), d6.b.TIMEOUT, ((Integer) this.f4287a.a(r3)).intValue() + 250);
        a aVar = new a(aVarA, this.f4287a, d(), jElapsedRealtime);
        aVar.c(x4.f6061j0);
        aVar.b(x4.f6070k0);
        this.f4287a.q0().a(aVar);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends l6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f5772m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z3, long j) {
            super(aVar, kVar, z3);
            this.f5772m = j;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i4) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f5772m;
            t5.this.a(jSONObject);
            this.f4287a.v0().d(d2.f3884h, t5.this.a(str, jElapsedRealtime, i4, jSONObject, null));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Unable to fetch basic SDK settings: server returned " + i4);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f5772m;
            t5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f4287a.v0().d(d2.f3886i, t5.this.a(str, jElapsedRealtime, i4, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j8, int i4, JSONObject jSONObject, String str2) {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "domain", uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j8));
        map.put("code", Integer.toString(i4));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f5770h) {
            bVar = this.f5771i;
            this.f5771i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
