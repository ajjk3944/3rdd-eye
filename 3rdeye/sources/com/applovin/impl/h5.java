package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.AbstractC2147u;
import com.applovin.impl.i4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.security.ProviderInstaller;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h5 extends w4 {

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f19499j = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final int f19500g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f19501h;
    private b i;

    public interface b {
        void a(JSONObject jSONObject);
    }

    public class c extends w4 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h5.this.i != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "Timing out fetch basic settings...");
                }
                h5.this.a(new JSONObject());
            }
        }
    }

    public h5(int i, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f19501h = new Object();
        this.f19500g = i;
        this.i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return AbstractC2135n0.a((String) this.f21692a.a(l4.f19987o0), "5.0/i", b());
    }

    private String g() {
        return AbstractC2135n0.a((String) this.f21692a.a(l4.f19979n0), "5.0/i", b());
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.f21692a;
            l4 l4Var = l4.f19878Z4;
            if (((Boolean) kVar.a(l4Var)).booleanValue() || ((Boolean) this.f21692a.a(l4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", C2123i.b());
            jSONObject.put("init_count", this.f19500g);
            jSONObject.put("server_installed_at", this.f21692a.a(l4.f19986o));
            if (this.f21692a.C0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f21692a.z0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", a7.b(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", a7.g(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f21692a.a(l4.f19705B3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f21692a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f21692a.D());
            jSONObject.put("installed_mediation_adapters", l3.b(this.f21692a));
            Map mapD = this.f21692a.B().D();
            jSONObject.put("package_name", mapD.get("package_name"));
            jSONObject.put("app_version", mapD.get("app_version"));
            jSONObject.put("debug", mapD.get("debug"));
            jSONObject.put("tg", mapD.get("tg"));
            jSONObject.put("target_sdk", mapD.get("target_sdk"));
            jSONObject.put("session_id", mapD.get("session_id"));
            List<String> adUnitIds = this.f21692a.K() != null ? this.f21692a.K().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", mapD.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", mapD.get("IABTCF_gdprApplies"));
            Object obj = mapD.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f21692a.y().b());
            Map mapL = this.f21692a.B().L();
            jSONObject.put("platform", mapL.get("platform"));
            jSONObject.put("os", mapL.get("os"));
            jSONObject.put(CommonUrlParts.LOCALE, mapL.get(CommonUrlParts.LOCALE));
            jSONObject.put("brand", mapL.get("brand"));
            jSONObject.put("brand_name", mapL.get("brand_name"));
            jSONObject.put("hardware", mapL.get("hardware"));
            jSONObject.put(CommonUrlParts.MODEL, mapL.get(CommonUrlParts.MODEL));
            jSONObject.put("revision", mapL.get("revision"));
            jSONObject.put("is_tablet", mapL.get("is_tablet"));
            jSONObject.put("screen_size_in", mapL.get("screen_size_in"));
            jSONObject.put("supported_abis", mapL.get("supported_abis"));
            Object obj2 = mapL.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.f21692a.a(l4.f19789M3)).booleanValue()) {
                jSONObject.put("mtl", this.f21692a.m0().getLastTrimMemoryLevel());
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
            AbstractC2147u.a aVarF = this.f21692a.B().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = AbstractC2130l0.c().b(a());
            if (((Boolean) this.f21692a.a(l4.f20054w3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            l.b bVarE = this.f21692a.B().E();
            if (((Boolean) this.f21692a.a(l4.f19998p3)).booleanValue() && bVarE != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarE.f21264a);
                jSONObject.put("idfv_scope", bVarE.f21265b);
            }
            if (((Boolean) this.f21692a.a(l4.f20022s3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f21692a.v());
            }
            if (((Boolean) this.f21692a.a(l4.f20038u3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f21692a.h0());
            }
            if (((Boolean) this.f21692a.a(l4.f20070y3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f21692a.s());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f21692a.F());
            if (this.f21692a.s0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f21692a.s0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f21692a.n0().getExtraParameters()));
            Map mapK0 = this.f21692a.k0();
            if (!CollectionUtils.isEmpty(mapK0)) {
                jSONObject.put("segments", new JSONObject(mapK0));
            }
            if (this.f19500g > 1) {
                ArrayService arrayServiceP = this.f21692a.p();
                if (arrayServiceP.getIsDirectDownloadEnabled() != null) {
                    jSONObject.put("ah_dd_enabled", arrayServiceP.getIsDirectDownloadEnabled());
                }
                jSONObject.put("ah_sdk_version_code", arrayServiceP.getAppHubVersionCode());
                jSONObject.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceP.getRandomUserToken()));
                jSONObject.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceP.getAppHubPackageName()));
            }
        } catch (JSONException e4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Failed to create JSON body", e4);
            }
            this.f21692a.E().a(this.f21693b, "createJSONBody", e4);
        }
        return jSONObject;
    }

    public Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f21692a.a(l4.f19885a5)).booleanValue() && !((Boolean) this.f21692a.a(l4.f19878Z4)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f21692a.a(l4.f19783L4)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21692a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f21692a.r(), map);
        Boolean boolB = AbstractC2130l0.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = AbstractC2130l0.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = AbstractC2130l0.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        if (!AbstractC2128k0.i() && f19499j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.o());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.a(this.f21693b, "Cannot update security provider", th);
                }
            }
        }
        this.f21692a.v0().d(y1.f21792f, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f21692a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.f21692a.a(l4.l5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f21692a.a(l4.f19842U2)).intValue()).b(((Integer) this.f21692a.a(l4.f19863X2)).intValue()).c(((Integer) this.f21692a.a(l4.f19835T2)).intValue()).e(((Boolean) this.f21692a.a(l4.f19929g3)).booleanValue()).a(i4.a.a(((Integer) this.f21692a.a(l4.f19817Q4)).intValue())).f(true).a();
        this.f21692a.q0().a(new c(this.f21692a), r5.b.TIMEOUT, ((Integer) this.f21692a.a(r3)).intValue() + 250);
        a aVar = new a(aVarA, this.f21692a, d(), jElapsedRealtime);
        aVar.c(l4.f19979n0);
        aVar.b(l4.f19987o0);
        this.f21692a.q0().a(aVar);
    }

    public class a extends z5 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f19502m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10, long j4) {
            super(aVar, kVar, z10);
            this.f19502m = j4;
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, JSONObject jSONObject, int i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f19502m;
            h5.this.a(jSONObject);
            this.f21692a.v0().d(y1.f21794g, h5.this.a(str, jElapsedRealtime, i, jSONObject, null));
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f19502m;
            h5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f21692a.v0().d(y1.f21796h, h5.this.a(str, jElapsedRealtime, i, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j4, int i, JSONObject jSONObject, String str2) throws JSONException {
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
        map.put("attempt_number", Integer.toString(this.f19500g));
        map.put("error_message", str2);
        map.put(ImagesContract.URL, uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j4));
        map.put("code", Integer.toString(i));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f19501h) {
            bVar = this.i;
            this.i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
