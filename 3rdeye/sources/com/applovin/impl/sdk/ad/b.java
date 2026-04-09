package com.applovin.impl.sdk.ad;

import E.y;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import b2.C1841v;
import com.applovin.impl.AbstractC2128k0;
import com.applovin.impl.C2110b1;
import com.applovin.impl.F0;
import com.applovin.impl.G0;
import com.applovin.impl.a7;
import com.applovin.impl.a8;
import com.applovin.impl.adview.e;
import com.applovin.impl.adview.m;
import com.applovin.impl.b4;
import com.applovin.impl.d4;
import com.applovin.impl.l4;
import com.applovin.impl.q7;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r.InterfaceC5503a;

/* loaded from: classes.dex */
public abstract class b extends AppLovinAdImpl implements d4 {

    /* renamed from: d, reason: collision with root package name */
    private final List f21043d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f21044e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f21045f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f21046g;

    /* renamed from: h, reason: collision with root package name */
    private final Bundle f21047h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private int f21048j;

    /* renamed from: k, reason: collision with root package name */
    private String f21049k;

    /* renamed from: l, reason: collision with root package name */
    private d f21050l;

    /* renamed from: com.applovin.impl.sdk.ad.b$b, reason: collision with other inner class name */
    public enum EnumC0317b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f21059a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21060b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21061c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21062d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21063e;

        private d() {
            this.f21059a = AppLovinSdkUtils.dpToPx(k.o(), b.this.p());
            this.f21060b = AppLovinSdkUtils.dpToPx(k.o(), b.this.r());
            this.f21061c = AppLovinSdkUtils.dpToPx(k.o(), b.this.n());
            this.f21062d = AppLovinSdkUtils.dpToPx(k.o(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(l4.f19935h1)).intValue());
            this.f21063e = AppLovinSdkUtils.dpToPx(k.o(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(l4.f19927g1)).intValue());
        }
    }

    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f21043d = CollectionUtils.synchronizedList();
        this.f21044e = new AtomicBoolean();
        this.f21045f = new AtomicBoolean();
        this.f21046g = new AtomicReference();
        this.f21047h = new Bundle();
    }

    private List O() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List i(v4 v4Var) {
        return a7.a(v4Var.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle k(v4 v4Var) {
        return JsonUtils.toBundle(v4Var.a("ah_parameters", (JSONObject) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map m(v4 v4Var) {
        try {
            return JsonUtils.toStringMap(v4Var.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(v4 v4Var) {
        return JsonUtils.getString(v4Var.a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ q7 p(v4 v4Var) {
        return new q7(v4Var.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    private String s0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public List A0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public void B0() {
        this.f21048j++;
    }

    public boolean C0() {
        return getBooleanFromAdObject("aocve", (Boolean) this.sdk.a(l4.Q5));
    }

    public boolean D0() {
        return getBooleanFromAdObject("is_adaptive_ad", Boolean.FALSE);
    }

    public boolean E0() {
        return this.f21048j > 0;
    }

    public boolean F0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(l4.f19738F5));
    }

    public boolean G0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(l4.f19766J1));
    }

    public boolean H0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean I0() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public boolean J0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public boolean K0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean L() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public boolean L0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public String M() {
        return getStringFromFullResponse("event_id", null);
    }

    public abstract boolean M0();

    public List N() {
        List listO = O();
        if (listO == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listO.size());
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public AtomicBoolean N0() {
        return this.f21044e;
    }

    public boolean O0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(l4.f19855W1));
    }

    public List P() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public boolean P0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public Uri Q() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public abstract boolean Q0();

    public List R() {
        String stringFromAdObject = getStringFromAdObject("optional_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    public boolean R0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(a7.h(k.o()) || a7.f(k.o()) || ((Boolean) this.sdk.a(l4.f19852V5)).booleanValue()));
    }

    public abstract String S();

    public abstract void S0();

    public Map T() {
        HashMap map = new HashMap();
        try {
            v4 v4Var = this.synchronizedAdObject;
            map.putAll(v4Var != null ? (Map) v4Var.a(new G0(1)) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e4) {
            this.sdk.O();
            if (o.a()) {
                this.sdk.O().a("DirectAd", "Failed to retrieve http headers for postbacks", e4);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put("User-Agent", a8.a());
        }
        return map;
    }

    public boolean T0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public EnumC0317b U() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0317b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0317b.DO_NOT_DISMISS;
            }
        }
        return EnumC0317b.UNSPECIFIED;
    }

    public boolean U0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(l4.f19879Z5));
    }

    public int V() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public boolean V0() {
        v4 v4Var = this.synchronizedAdObject;
        return v4Var != null ? ((Boolean) v4Var.a(new C1841v(1))).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public long W() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public boolean W0() {
        return this.f21045f.get();
    }

    public List X() {
        return getStringListFromAdObject("pbpn", this.sdk.c(l4.f19962k6));
    }

    public boolean X0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public long Y() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public boolean Y0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(l4.f19799O0));
    }

    public int Z() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean Z0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public List a0() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    public boolean a1() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public int b0() {
        return this.f21048j;
    }

    public boolean b1() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public List c0() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        ArrayList arrayList = stringFromAdObject != null ? new ArrayList(CollectionUtils.explode(stringFromAdObject)) : new ArrayList(this.sdk.c(l4.f19741G0));
        if (a7.h(k.o())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    public boolean c1() {
        return getBooleanFromAdObject("sftbpn", Boolean.FALSE);
    }

    public List d0() {
        return getStringListFromAdObject("rea", a0());
    }

    public boolean d1() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    public e.a e0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? q() : a(intFromAdObject);
    }

    public boolean e1() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public List f0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.EMPTY_LIST);
    }

    public boolean f1() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public c g0() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? c.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public boolean g1() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.r3
    public abstract s3 getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        v4 v4Var = this.synchronizedAdObject;
        return v4Var != null ? (Bundle) v4Var.a(new G0(2)) : JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.r3
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.r3
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.r3
    public List getOpenMeasurementVerificationScriptResources() {
        List listA;
        com.applovin.impl.sdk.ad.e eVar = new com.applovin.impl.sdk.ad.e(this, 3);
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new i(eVar, 0));
        }
        synchronized (this.adObjectLock) {
            listA = a(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return listA;
    }

    public List getPrivacySandboxImpressionAttributionUrls() {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.EMPTY_LIST);
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        String clCode = getClCode();
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().replace("{CLCODE}", clCode));
        }
        return arrayList;
    }

    public String h0() {
        return this.f21049k;
    }

    public boolean h1() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public String i0() {
        return getStringFromAdObject("tmas", (String) this.sdk.a(l4.f19960k4));
    }

    public boolean i1() {
        return g() >= 0;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.r3
    public abstract boolean isOpenMeasurementEnabled();

    public List j() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new com.applovin.impl.sdk.ad.e(this, 2));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public Uri j0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean j1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public String k0() {
        v4 v4Var = this.synchronizedAdObject;
        return v4Var != null ? (String) v4Var.a(new C1841v(3)) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    public boolean k1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public List l() {
        return this.f21043d;
    }

    public String l0() {
        v4 v4Var = this.synchronizedAdObject;
        return v4Var != null ? (String) v4Var.a(new F0(2)) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    public boolean l1() {
        return getBooleanFromAdObject("sudbia", (Boolean) this.sdk.a(l4.f19954j6));
    }

    public abstract Uri m();

    public q7 m0() {
        v4 v4Var = this.synchronizedAdObject;
        return v4Var != null ? (q7) v4Var.a(new com.applovin.impl.sdk.ad.d(this, 0)) : new q7(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean m1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public int n() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(l4.f19773K1)).intValue());
    }

    public abstract Uri n0();

    public long o0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long p0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public e.a q() {
        List listO = O();
        int intFromAdObject = getIntFromAdObject("close_style", (listO == null || listO.size() <= 0) ? -1 : ((Integer) listO.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public int q0() {
        return a7.a(getIntFromAdObject("video_completion_percent", -1));
    }

    public int r() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(l4.f19787M1)).intValue());
    }

    public List r0() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new f(this, 1));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), s0(), this.sdk);
        }
        return listA;
    }

    public long s() {
        List listP = P();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listP == null || listP.size() <= 0) ? 0L : ((Integer) listP.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public int t() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public e t0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return "top".equals(stringFromAdObject) ? e.TOP : "bottom".equals(stringFromAdObject) ? e.BOTTOM : "left".equals(stringFromAdObject) ? e.LEFT : "right".equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    public int u0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean v0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public abstract Uri w0();

    public int x0() {
        return getIntFromAdObject("whalt", a7.a(getSize()) ? 1 : ((Boolean) this.sdk.a(l4.f20072y5)).booleanValue() ? 0 : -1);
    }

    public m y0() {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (m) v4Var.a(new F0(1));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new m(jsonObjectFromAdObject);
        }
        return null;
    }

    public List z0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List l(v4 v4Var) {
        return a7.a(v4Var.a("imp_urls", new JSONObject()), getClCode(), null, null, T(), Z0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(v4 v4Var) {
        return JsonUtils.getString(v4Var.a("video_button_properties", (JSONObject) null), "video_button_base_url", "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m r(v4 v4Var) {
        JSONObject jSONObjectA = v4Var.a("web_view_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new m(jSONObjectA);
        }
        return null;
    }

    public C2110b1 A() {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (C2110b1) v4Var.a(new C1841v(2));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new C2110b1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List B() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new f(this, 0));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List C() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new g(this, 1));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List D() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.EMPTY_LIST);
    }

    public boolean E() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public String F() {
        return this.i;
    }

    public int G() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public int H() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int I() {
        return a7.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public List J() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new com.applovin.impl.sdk.ad.e(this, 1));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, T(), Z0(), this.sdk);
        }
        return listA;
    }

    public int K() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(l4.f19806P0)).intValue());
    }

    public void b(String str) {
        this.f21049k = str;
    }

    public void c(String str) {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.a(new y(str, 3));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public List d(MotionEvent motionEvent, boolean z10, boolean z11) {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.EMPTY_LIST);
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        Map mapA = a(motionEvent, z10, z11);
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(StringUtils.replace(it.next(), mapA));
        }
        return arrayList;
    }

    public List e() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new com.applovin.impl.sdk.ad.e(this, 0));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public long f() {
        return getLongFromAdObject("ad_dismiss_delay_on_app_launch_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    public long g() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    public Bundle h() {
        return this.f21047h;
    }

    public int u() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public Bundle v() {
        Map map;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            map = (Map) v4Var.a(new i(this, 1));
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e4) {
                this.sdk.O();
                if (o.a()) {
                    this.sdk.O().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e4);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", a8.a());
        }
        return bundle;
    }

    public List w() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new g(this, 0));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List x() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new com.applovin.impl.sdk.ad.d(this, 1));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List y() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new com.applovin.impl.sdk.ad.d(this, 2));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List z() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new com.applovin.impl.sdk.ad.e(this, 4));
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List f(v4 v4Var) {
        return a7.a(v4Var.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g(v4 v4Var) {
        return a7.a(v4Var.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2110b1 h(v4 v4Var) {
        JSONObject jSONObjectA = v4Var.a("custom_tabs_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new C2110b1(jSONObjectA);
        }
        return null;
    }

    public void a(String str) {
        this.i = str;
    }

    public void b(boolean z10) {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.a("html_resources_cached", z10);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z10);
        }
    }

    public b4 i() {
        return (b4) this.f21046g.getAndSet(null);
    }

    public String k() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public d o() {
        if (this.f21050l == null) {
            this.f21050l = new d();
        }
        return this.f21050l;
    }

    public int p() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(l4.f19780L1)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, ImagesContract.URL, null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.O();
                if (o.a()) {
                    this.sdk.O().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean s(v4 v4Var) {
        return JsonUtils.getBoolean(v4Var.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q(v4 v4Var) {
        return a7.a(v4Var.a("video_end_urls", new JSONObject()), getClCode(), s0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List j(v4 v4Var) {
        return a7.a(v4Var.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d(v4 v4Var) {
        return a7.a(v4Var.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List e(v4 v4Var) {
        return a7.a(v4Var.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List b(v4 v4Var) {
        return a7.a(v4Var.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public long c() {
        return getLongFromAdObject("batfort", TimeUnit.SECONDS.toMillis(1L));
    }

    private String c(MotionEvent motionEvent, boolean z10, boolean z11) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map mapA = a(motionEvent, z10, z11);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapA);
        }
        return null;
    }

    public void d() {
        this.f21045f.set(true);
    }

    private List b(final MotionEvent motionEvent, final boolean z10, final boolean z11) {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new InterfaceC5503a() { // from class: com.applovin.impl.sdk.ad.h
                @Override // r.InterfaceC5503a
                public final Object apply(Object obj) {
                    return this.f21081a.a(motionEvent, z10, z11, (v4) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z10, z11), c(motionEvent, z10, z11), T(), Z0(), this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map c(v4 v4Var) {
        try {
            return JsonUtils.toStringMap(v4Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e4) {
            this.sdk.O();
            if (o.a()) {
                this.sdk.O().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e4);
            }
            return new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(InterfaceC5503a interfaceC5503a, v4 v4Var) {
        return (List) interfaceC5503a.apply(v4Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    public void c(Uri uri) {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    public void a(Uri uri) {
        this.f21043d.add(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, v4 v4Var) throws JSONException {
        JsonUtils.putString(v4Var.a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(v4 v4Var) {
        return a7.a(v4Var.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List b(final MotionEvent motionEvent, final boolean z10) {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            listA = (List) v4Var.a(new InterfaceC5503a() { // from class: com.applovin.impl.sdk.ad.j
                @Override // r.InterfaceC5503a
                public final Object apply(Object obj) {
                    return this.f21087a.a(motionEvent, z10, (v4) obj);
                }
            });
        } else {
            synchronized (this.adObjectLock) {
                listA = a7.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z10), null, T(), Z0(), this.sdk);
            }
        }
        return listA.isEmpty() ? b(motionEvent, true, z10) : listA;
    }

    public List a(MotionEvent motionEvent, boolean z10) {
        return b(motionEvent, false, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, boolean z11, v4 v4Var) {
        return a7.a(v4Var.a("click_tracking_urls", new JSONObject()), a(motionEvent, z10, z11), c(motionEvent, z10, z11), T(), Z0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, v4 v4Var) {
        return a7.a(v4Var.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z10), null, T(), Z0(), this.sdk);
    }

    public void b(Uri uri) {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    private Map a(MotionEvent motionEvent, boolean z10, boolean z11) {
        Point pointB = AbstractC2128k0.b(k.o());
        HashMap map = new HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        map.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        map.put("{SCREEN_WIDTH}", String.valueOf(pointB.x));
        map.put("{SCREEN_HEIGHT}", String.valueOf(pointB.y));
        map.put("{IS_VIDEO_CLICK}", String.valueOf(z10));
        map.put("{IS_INSTALL}", String.valueOf(z11));
        return map;
    }

    public void a(b4 b4Var) {
        this.f21046g.set(b4Var);
    }

    private e.a a(boolean z10) {
        return z10 ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    public e.a a(int i) {
        if (i == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i == 2) {
            return e.a.INVISIBLE;
        }
        if (i == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
