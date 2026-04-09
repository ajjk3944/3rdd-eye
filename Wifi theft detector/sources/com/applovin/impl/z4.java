package com.applovin.impl;

import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;

/* loaded from: classes.dex */
public class z4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8800a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f8801b;

    /* renamed from: c, reason: collision with root package name */
    public static final z4 f8776c = new z4("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: d, reason: collision with root package name */
    public static final z4 f8777d = new z4("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: e, reason: collision with root package name */
    public static final z4 f8778e = new z4("com.applovin.sdk.launch_count", Long.class);

    /* renamed from: f, reason: collision with root package name */
    public static final z4 f8779f = new z4("com.applovin.sdk.last_launch_timestamp", Long.class);

    /* renamed from: g, reason: collision with root package name */
    public static final z4 f8780g = new z4("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: h, reason: collision with root package name */
    public static final z4 f8781h = new z4("com.applovin.sdk.install_date", Long.class);

    /* renamed from: i, reason: collision with root package name */
    public static final z4 f8782i = new z4("com.applovin.sdk.av", Boolean.class);

    /* renamed from: j, reason: collision with root package name */
    public static final z4 f8783j = new z4("com.applovin.sdk.save_settings_with_sdk_key_agnostic_name", Boolean.class);

    /* renamed from: k, reason: collision with root package name */
    public static final z4 f8784k = new z4("com.applovin.sdk.user_id", String.class);

    /* renamed from: l, reason: collision with root package name */
    public static final z4 f8785l = new z4("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: m, reason: collision with root package name */
    public static final z4 f8786m = new z4("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: n, reason: collision with root package name */
    public static final z4 f8787n = new z4("com.applovin.sdk.alart", String.class);

    /* renamed from: o, reason: collision with root package name */
    public static final z4 f8788o = new z4("com.applovin.sdk.aleid", String.class);

    /* renamed from: p, reason: collision with root package name */
    public static final z4 f8789p = new z4("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: q, reason: collision with root package name */
    public static final z4 f8790q = new z4("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: r, reason: collision with root package name */
    public static final z4 f8791r = new z4("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: s, reason: collision with root package name */
    public static final z4 f8792s = new z4("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: t, reason: collision with root package name */
    public static final z4 f8793t = new z4("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* renamed from: u, reason: collision with root package name */
    public static final z4 f8794u = new z4("IABTCF_CmpSdkID", Object.class);

    /* renamed from: v, reason: collision with root package name */
    public static final z4 f8795v = new z4("IABTCF_CmpSdkVersion", Object.class);

    /* renamed from: w, reason: collision with root package name */
    public static final z4 f8796w = new z4("IABTCF_gdprApplies", Object.class);

    /* renamed from: x, reason: collision with root package name */
    public static final z4 f8797x = new z4(AndroidTcfDataSource.TCF_TCSTRING_KEY, String.class);

    /* renamed from: y, reason: collision with root package name */
    public static final z4 f8798y = new z4("IABTCF_AddtlConsent", String.class);

    /* renamed from: z, reason: collision with root package name */
    public static final z4 f8799z = new z4("IABTCF_VendorConsents", String.class);
    public static final z4 A = new z4("IABTCF_VendorLegitimateInterests", String.class);
    public static final z4 B = new z4("IABTCF_PurposeConsents", String.class);
    public static final z4 C = new z4("IABTCF_PurposeLegitimateInterests", String.class);
    public static final z4 D = new z4("IABTCF_SpecialFeaturesOptIns", String.class);
    public static final z4 E = new z4("com.applovin.sdk.impl.ad.persistence.queue", String.class);
    public static final z4 F = new z4("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final z4 G = new z4("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final z4 H = new z4("com.applovin.sdk.persisted_data", String.class);
    public static final z4 I = new z4("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final z4 J = new z4("com.applovin.sdk.mediation.should_use_applovin_adaptive_sizing_formula", Boolean.class);
    public static final z4 K = new z4("com.applovin.sdk.mediation.stats_per_ad_unit_since_install", String.class);
    public static final z4 L = new z4("com.applovin.sdk.mediation.stats_per_ad_format_since_install", String.class);
    public static final z4 M = new z4("com.applovin.sdk.user_agent", String.class);
    public static final z4 N = new z4("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final z4 O = new z4("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);
    public static final z4 P = new z4("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final z4 Q = new z4("com.applovin.sdk.app_killed_last_ad_data", String.class);
    public static final z4 R = new z4("com.applovin.sdk.app_killed_last_mediated_ad_tracking_info", String.class);
    public static final z4 S = new z4("com.applovin.sdk.last_mediated_fullscreen_ad_duration_ms", Long.class);
    public static final z4 T = new z4("com.applovin.sdk.template_browser_package_name", String.class);

    public z4(String str, Class cls) {
        this.f8800a = str;
        this.f8801b = cls;
    }

    public String a() {
        return this.f8800a;
    }

    public Class b() {
        return this.f8801b;
    }

    public String toString() {
        return "Key{name='" + this.f8800a + "', type=" + this.f8801b + '}';
    }
}
