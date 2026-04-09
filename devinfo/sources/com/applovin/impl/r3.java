package com.applovin.impl;

import com.applovin.impl.b5;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class r3 extends x4 {
    public static final x4 A7;
    public static final x4 A8;
    public static final x4 B7;
    public static final x4 B8;
    public static final x4 C7;
    public static final x4 C8;
    public static final x4 D7;
    public static final x4 E7;
    public static final x4 F7;
    public static final x4 G7;
    public static final x4 H7;
    public static final x4 I7;
    public static final x4 J7;
    public static final x4 K7;
    public static final x4 L7;
    public static final x4 M7;
    public static final x4 N7;
    public static final x4 O7;
    public static final x4 P7;
    public static final x4 Q7;
    public static final x4 R7;
    public static final x4 S7;
    public static final x4 T7;
    public static final x4 U7;
    public static final x4 V7;
    public static final x4 W7;
    public static final x4 X7;
    public static final x4 Y7;
    public static final x4 Z7;

    /* renamed from: a8, reason: collision with root package name */
    public static final x4 f5217a8;

    /* renamed from: b8, reason: collision with root package name */
    public static final x4 f5218b8;

    /* renamed from: c8, reason: collision with root package name */
    public static final x4 f5219c8;

    /* renamed from: d8, reason: collision with root package name */
    public static final x4 f5220d8;

    /* renamed from: e8, reason: collision with root package name */
    public static final x4 f5221e8;

    /* renamed from: f8, reason: collision with root package name */
    public static final x4 f5222f8;

    /* renamed from: g8, reason: collision with root package name */
    public static final x4 f5223g8;
    public static final x4 h8;

    /* renamed from: i8, reason: collision with root package name */
    public static final x4 f5224i8;
    public static final x4 j8;

    /* renamed from: k8, reason: collision with root package name */
    public static final x4 f5225k8;

    /* renamed from: l8, reason: collision with root package name */
    public static final x4 f5226l8;

    /* renamed from: m7, reason: collision with root package name */
    public static final x4 f5227m7 = x4.a("afi", "");

    /* renamed from: m8, reason: collision with root package name */
    public static final x4 f5228m8;

    /* renamed from: n7, reason: collision with root package name */
    public static final x4 f5229n7;
    public static final x4 n8;

    /* renamed from: o7, reason: collision with root package name */
    public static final x4 f5230o7;

    /* renamed from: o8, reason: collision with root package name */
    public static final x4 f5231o8;

    /* renamed from: p7, reason: collision with root package name */
    public static final x4 f5232p7;

    /* renamed from: p8, reason: collision with root package name */
    public static final x4 f5233p8;

    /* renamed from: q7, reason: collision with root package name */
    public static final x4 f5234q7;

    /* renamed from: q8, reason: collision with root package name */
    public static final x4 f5235q8;

    /* renamed from: r7, reason: collision with root package name */
    public static final x4 f5236r7;

    /* renamed from: r8, reason: collision with root package name */
    public static final x4 f5237r8;

    /* renamed from: s7, reason: collision with root package name */
    public static final x4 f5238s7;

    /* renamed from: s8, reason: collision with root package name */
    public static final x4 f5239s8;

    /* renamed from: t7, reason: collision with root package name */
    public static final x4 f5240t7;

    /* renamed from: t8, reason: collision with root package name */
    public static final x4 f5241t8;
    public static final x4 u7;

    /* renamed from: u8, reason: collision with root package name */
    public static final x4 f5242u8;

    /* renamed from: v7, reason: collision with root package name */
    public static final x4 f5243v7;

    /* renamed from: v8, reason: collision with root package name */
    public static final x4 f5244v8;

    /* renamed from: w7, reason: collision with root package name */
    public static final x4 f5245w7;

    /* renamed from: w8, reason: collision with root package name */
    public static final x4 f5246w8;

    /* renamed from: x7, reason: collision with root package name */
    public static final x4 f5247x7;

    /* renamed from: x8, reason: collision with root package name */
    public static final x4 f5248x8;

    /* renamed from: y7, reason: collision with root package name */
    public static final x4 f5249y7;

    /* renamed from: y8, reason: collision with root package name */
    public static final x4 f5250y8;

    /* renamed from: z7, reason: collision with root package name */
    public static final x4 f5251z7;

    /* renamed from: z8, reason: collision with root package name */
    public static final x4 f5252z8;

    static {
        Boolean bool = Boolean.FALSE;
        f5229n7 = x4.a("iafiwaa", bool);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f5230o7 = a0.g.g("afi_ms", 5L, timeUnit);
        f5232p7 = x4.a("mediation_endpoint", "https://ms.applovin.com/");
        f5234q7 = x4.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f5236r7 = a0.g.g("fetch_next_ad_retry_delay_ms", 2L, timeUnit);
        f5238s7 = a0.g.g("fetch_next_ad_timeout_ms", 30L, timeUnit);
        f5240t7 = a0.g.g("fetch_mediation_debugger_info_timeout_ms", 7L, timeUnit);
        Boolean bool2 = Boolean.TRUE;
        u7 = x4.a("auto_init_mediation_debugger", bool2);
        f5243v7 = x4.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        f5245w7 = a0.g.g("max_signal_provider_latency_ms", 30L, timeUnit);
        f5247x7 = a0.g.g("default_adapter_timeout_ms", 10L, timeUnit);
        f5249y7 = a0.g.g("ad_refresh_ms", 30L, timeUnit);
        f5251z7 = a0.g.g("ad_load_failure_refresh_ms", 30L, timeUnit);
        A7 = x4.a("ad_load_failure_refresh_ignore_error_codes", "204");
        B7 = x4.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        C7 = x4.a("refresh_ad_view_timer_responds_to_background", bool2);
        D7 = x4.a("refresh_ad_view_timer_responds_to_store_kit", bool2);
        E7 = x4.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool);
        F7 = x4.a("avrsponse", bool);
        G7 = x4.a("allow_pause_auto_refresh_immediately", bool);
        H7 = x4.a("ad_view_race_condition_fix_enabled", bool);
        I7 = x4.a("always_destroy_ad_view_on_ui_thread", bool);
        J7 = x4.a("fullscreen_display_delay_ms", 0L);
        K7 = x4.a("susaode", bool);
        L7 = x4.a("ahdm", 500L);
        M7 = x4.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        N7 = x4.a("ad_view_refresh_precache_request_enabled", bool2);
        O7 = x4.a("famttl_ms", 0L);
        P7 = x4.a("signal_expiration_ms", -1L);
        Q7 = x4.a("signal_cache_level", Integer.valueOf(b5.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        R7 = a0.g.g("ad_expiration_ms", 4L, timeUnit2);
        S7 = a0.g.g("native_ad_expiration_ms", 4L, timeUnit2);
        T7 = x4.a("rena", bool2);
        U7 = x4.a("fullscreen_ad_displayed_timeout_ms", -1L);
        V7 = x4.a("freast_ms", -1L);
        W7 = x4.a("ad_hidden_timeout_ms", -1L);
        X7 = x4.a("schedule_ad_hidden_on_ad_dismiss", bool);
        Y7 = x4.a("schedule_ad_hidden_on_single_task_app_relaunch", bool);
        Z7 = a0.g.g("ad_hidden_on_ad_dismiss_callback_delay_ms", 1L, timeUnit);
        f5217a8 = x4.a("proe", bool);
        f5218b8 = x4.a("mute_state", 2);
        f5219c8 = x4.a("saf", "");
        f5220d8 = x4.a("saui", "");
        f5221e8 = x4.a("malm_v2_e", bool);
        f5222f8 = x4.a("slsaod", bool);
        f5223g8 = x4.a("mspc", 1);
        h8 = x4.a("mra", -1);
        f5224i8 = x4.a("mra_af", "INTER,REWARDED,BANNER,LEADER,MREC");
        j8 = x4.a("fadiafase", bool2);
        f5225k8 = x4.a("fadwvcv", bool2);
        f5226l8 = x4.a("bfarud", bool);
        f5228m8 = x4.a("inacc", Boolean.valueOf(n7.b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        n8 = x4.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        f5231o8 = x4.a("faomq", bool);
        f5233p8 = x4.a("rahcnct_sec", -1);
        f5235q8 = x4.a("paslbaf", JsonUtils.EMPTY_JSON);
        f5237r8 = x4.a("msbl", "{\"ad\":[\"ttdasi_ms\"]}");
        f5239s8 = x4.a("siarni", bool);
        f5241t8 = x4.a("spims", bool);
        f5242u8 = x4.a("uabta", bool);
        f5244v8 = x4.a("use_initialization_spec_during_init", bool);
        f5246w8 = x4.a("report_cimp_after_ierr", bool);
        f5248x8 = x4.a("fail_collection_for_empty_signal", bool);
        f5250y8 = x4.a("fetch_mediated_ad_gzip", bool2);
        f5252z8 = x4.a("max_postback_gzip", bool2);
        A8 = x4.a("md_endpoint", "https://md.applovin.com/");
        B8 = x4.a("md_backup_endpoint", "https://md.applvn.com/");
        C8 = x4.a("md_v2", bool);
    }
}
