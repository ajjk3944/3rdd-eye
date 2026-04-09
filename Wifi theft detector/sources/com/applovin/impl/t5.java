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
import com.google.android.gms.security.ProviderInstaller;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t5 extends i5 {

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f8141j = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final int f8142g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f8143h;

    /* renamed from: i, reason: collision with root package name */
    private b f8144i;

    public interface b {
        void a(JSONObject jSONObject);
    }

    public class c extends i5 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f8144i != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.b(this.f6219b, "Timing out fetch basic settings...");
                }
                t5.this.a(new JSONObject());
            }
        }
    }

    public t5(int i10, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f8143h = new Object();
        this.f8142g = i10;
        this.f8144i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return r0.a((String) this.f6218a.a(x4.f8505k0), "5.0/i", b());
    }

    private String g() {
        return r0.a((String) this.f6218a.a(x4.f8496j0), "5.0/i", b());
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.f6218a;
            x4 x4Var = x4.f8632z5;
            if (((Boolean) kVar.a(x4Var)).booleanValue() || ((Boolean) this.f6218a.a(x4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.f8142g);
            jSONObject.put("server_installed_at", this.f6218a.a(x4.f8538o));
            if (this.f6218a.C0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f6218a.z0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", n7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", n7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f6218a.a(x4.L3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f6218a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f6218a.C());
            jSONObject.put("installed_mediation_adapters", w3.b(this.f6218a));
            Map mapG = this.f6218a.A().G();
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, mapG.get(CampaignEx.JSON_KEY_PACKAGE_NAME));
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
            List<String> adUnitIds = this.f6218a.J() != null ? this.f6218a.J().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put(AndroidTcfDataSource.TCF_TCSTRING_KEY, mapG.get(AndroidTcfDataSource.TCF_TCSTRING_KEY));
            jSONObject.put("IABTCF_gdprApplies", mapG.get("IABTCF_gdprApplies"));
            Object obj = mapG.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f6218a.x().b());
            Map mapN = this.f6218a.A().N();
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
            if (((Boolean) this.f6218a.a(x4.W3)).booleanValue()) {
                jSONObject.put("mtl", this.f6218a.m0().getLastTrimMemoryLevel());
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
            v.a aVarF = this.f6218a.A().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = p0.c().b(a());
            if (((Boolean) this.f6218a.a(x4.G3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            l.b bVarH = this.f6218a.A().H();
            if (((Boolean) this.f6218a.a(x4.f8630z3)).booleanValue() && bVarH != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarH.f7888a);
                jSONObject.put("idfv_scope", bVarH.f7889b);
            }
            if (((Boolean) this.f6218a.a(x4.C3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f6218a.u());
            }
            if (((Boolean) this.f6218a.a(x4.E3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f6218a.h0());
            }
            if (((Boolean) this.f6218a.a(x4.I3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f6218a.r());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f6218a.E());
            if (this.f6218a.s0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f6218a.s0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f6218a.n0().getExtraParameters()));
            Map mapK0 = this.f6218a.k0();
            if (!CollectionUtils.isEmpty(mapK0)) {
                jSONObject.put("segments", new JSONObject(mapK0));
            }
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Failed to create JSON body", e10);
            }
            this.f6218a.D().a(this.f6219b, "createJSONBody", e10);
        }
        return jSONObject;
    }

    public Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f6218a.a(x4.A5)).booleanValue() && !((Boolean) this.f6218a.a(x4.f8632z5)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f6218a.a(x4.f8510k5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f6218a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f6218a.q(), map);
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
        if (!o0.i() && f8141j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.o());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.a(this.f6219b, "Cannot update security provider", th);
                }
            }
        }
        this.f6218a.v0().d(d2.f5727g, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f6218a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.f6218a.a(x4.L5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f6218a.a(x4.f8436c3)).intValue()).b(((Integer) this.f6218a.a(x4.f8463f3)).intValue()).c(((Integer) this.f6218a.a(x4.f8427b3)).intValue()).e(((Boolean) this.f6218a.a(x4.f8542o3)).booleanValue()).a(u4.a.a(((Integer) this.f6218a.a(x4.f8552p5)).intValue())).f(true).a();
        this.f6218a.q0().a(new c(this.f6218a), d6.b.TIMEOUT, ((Integer) this.f6218a.a(r3)).intValue() + 250);
        a aVar = new a(aVarA, this.f6218a, d(), jElapsedRealtime);
        aVar.c(x4.f8496j0);
        aVar.b(x4.f8505k0);
        this.f6218a.q0().a(aVar);
    }

    public class a extends l6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f8145m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10, long j10) {
            super(aVar, kVar, z10);
            this.f8145m = j10;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8145m;
            t5.this.a(jSONObject);
            this.f6218a.v0().d(d2.f5729h, t5.this.a(str, jElapsedRealtime, i10, jSONObject, null));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to fetch basic SDK settings: server returned " + i10);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8145m;
            t5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f6218a.v0().d(d2.f5731i, t5.this.a(str, jElapsedRealtime, i10, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j10, int i10, JSONObject jSONObject, String str2) throws JSONException {
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
        map.put("attempt_number", Integer.toString(this.f8142g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j10));
        map.put("code", Integer.toString(i10));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f8143h) {
            bVar = this.f8144i;
            this.f8144i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
