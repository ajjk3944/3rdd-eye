package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e7 implements d7 {
    public static final n4 A;
    public static final n4 B;
    public static final n4 C;
    public static final n4 D;
    public static final n4 E;
    public static final n4 F;
    public static final n4 G;
    public static final n4 H;
    public static final n4 I;
    public static final n4 J;
    public static final n4 K;
    public static final n4 L;
    public static final n4 M;
    public static final n4 N;
    public static final n4 O;
    public static final n4 P;
    public static final n4 Q;
    public static final n4 R;
    public static final n4 S;
    public static final n4 T;
    public static final n4 U;
    public static final n4 V;
    public static final n4 W;
    public static final n4 X;
    public static final n4 Y;
    public static final n4 Z;

    /* renamed from: a, reason: collision with root package name */
    public static final n4 f19677a;

    /* renamed from: a0, reason: collision with root package name */
    public static final n4 f19678a0;

    /* renamed from: b, reason: collision with root package name */
    public static final n4 f19679b;

    /* renamed from: b0, reason: collision with root package name */
    public static final n4 f19680b0;

    /* renamed from: c, reason: collision with root package name */
    public static final n4 f19681c;

    /* renamed from: c0, reason: collision with root package name */
    public static final n4 f19682c0;

    /* renamed from: d, reason: collision with root package name */
    public static final n4 f19683d;

    /* renamed from: d0, reason: collision with root package name */
    public static final n4 f19684d0;

    /* renamed from: e, reason: collision with root package name */
    public static final n4 f19685e;

    /* renamed from: e0, reason: collision with root package name */
    public static final n4 f19686e0;

    /* renamed from: f, reason: collision with root package name */
    public static final n4 f19687f;

    /* renamed from: f0, reason: collision with root package name */
    public static final n4 f19688f0;
    public static final n4 g;

    /* renamed from: g0, reason: collision with root package name */
    public static final n4 f19689g0;

    /* renamed from: h, reason: collision with root package name */
    public static final n4 f19690h;

    /* renamed from: h0, reason: collision with root package name */
    public static final n4 f19691h0;

    /* renamed from: i, reason: collision with root package name */
    public static final n4 f19692i;

    /* renamed from: i0, reason: collision with root package name */
    public static final n4 f19693i0;
    public static final n4 j;

    /* renamed from: j0, reason: collision with root package name */
    public static final n4 f19694j0;

    /* renamed from: k, reason: collision with root package name */
    public static final n4 f19695k;

    /* renamed from: k0, reason: collision with root package name */
    public static final n4 f19696k0;

    /* renamed from: l, reason: collision with root package name */
    public static final n4 f19697l;

    /* renamed from: l0, reason: collision with root package name */
    public static final n4 f19698l0;

    /* renamed from: m, reason: collision with root package name */
    public static final n4 f19699m;

    /* renamed from: m0, reason: collision with root package name */
    public static final n4 f19700m0;

    /* renamed from: n, reason: collision with root package name */
    public static final n4 f19701n;

    /* renamed from: n0, reason: collision with root package name */
    public static final n4 f19702n0;

    /* renamed from: o, reason: collision with root package name */
    public static final n4 f19703o;

    /* renamed from: o0, reason: collision with root package name */
    public static final n4 f19704o0;

    /* renamed from: p, reason: collision with root package name */
    public static final n4 f19705p;

    /* renamed from: p0, reason: collision with root package name */
    public static final n4 f19706p0;

    /* renamed from: q, reason: collision with root package name */
    public static final n4 f19707q;

    /* renamed from: q0, reason: collision with root package name */
    public static final n4 f19708q0;

    /* renamed from: r, reason: collision with root package name */
    public static final n4 f19709r;

    /* renamed from: r0, reason: collision with root package name */
    public static final n4 f19710r0;

    /* renamed from: s, reason: collision with root package name */
    public static final n4 f19711s;

    /* renamed from: s0, reason: collision with root package name */
    public static final n4 f19712s0;

    /* renamed from: t, reason: collision with root package name */
    public static final n4 f19713t;

    /* renamed from: t0, reason: collision with root package name */
    public static final n4 f19714t0;

    /* renamed from: u, reason: collision with root package name */
    public static final n4 f19715u;

    /* renamed from: u0, reason: collision with root package name */
    public static final n4 f19716u0;

    /* renamed from: v, reason: collision with root package name */
    public static final n4 f19717v;

    /* renamed from: v0, reason: collision with root package name */
    public static final n4 f19718v0;

    /* renamed from: w, reason: collision with root package name */
    public static final n4 f19719w;

    /* renamed from: w0, reason: collision with root package name */
    public static final n4 f19720w0;

    /* renamed from: x, reason: collision with root package name */
    public static final n4 f19721x;

    /* renamed from: y, reason: collision with root package name */
    public static final n4 f19722y;

    /* renamed from: z, reason: collision with root package name */
    public static final n4 f19723z;

    static {
        a4.d dVar = new a4.d(m4.a(), true, true);
        f19677a = dVar.x(10000L, "measurement.ad_id_cache_time");
        f19679b = dVar.x(3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time");
        f19681c = dVar.A("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        f19683d = dVar.x(100L, "measurement.max_bundles_per_iteration");
        f19685e = dVar.C("measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid");
        f19687f = dVar.x(86400000L, "measurement.config.cache_time");
        dVar.C("measurement.log_tag", "FA");
        g = dVar.C("measurement.config.url_authority", "app-measurement.com");
        f19690h = dVar.C("measurement.config.url_scheme", "https");
        f19692i = dVar.x(1000L, "measurement.upload.debug_upload_interval");
        dVar.A("measurement.config.default_flag_values", true);
        j = dVar.x(3600000L, "measurement.session.engagement_interval");
        f19695k = dVar.C("measurement.rb.attribution.event_params", "value|currency");
        f19697l = dVar.C("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp");
        f19699m = dVar.x(605000L, "measurement.upload.google_signal_max_queue_time");
        f19701n = dVar.C("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        dVar.x(0L, "measurement.id.upload.max_conversions_per_day");
        f19703o = dVar.x(4L, "measurement.lifetimevalue.max_currency_tracked");
        f19705p = dVar.x(1L, "measurement.dma_consent.max_daily_dcu_realtime_events");
        f19707q = dVar.x(500L, "measurement.upload.max_event_parameter_value_length");
        f19709r = dVar.x(100000L, "measurement.store.max_stored_events_per_app");
        f19711s = dVar.x(50L, "measurement.experiment.max_ids");
        f19713t = dVar.x(200L, "measurement.audience.filter_result_max_count");
        f19715u = dVar.x(27L, "measurement.upload.max_item_scoped_custom_parameters");
        f19717v = dVar.x(1000L, "measurement.rb.max_trigger_registrations_per_day");
        f19719w = dVar.x(0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once");
        f19721x = dVar.x(7L, "measurement.rb.attribution.client.min_ad_services_version");
        f19722y = dVar.x(60000L, "measurement.alarm_manager.minimum_interval");
        f19723z = dVar.x(500L, "measurement.upload.minimum_delay");
        A = dVar.x(86400000L, "measurement.monitoring.sample_period_millis");
        B = dVar.x(3000L, "measurement.rb.attribution.notify_app_delay_millis");
        C = dVar.A("measurement.config.notify_trigger_uris_on_backgrounded", true);
        D = dVar.C("measurement.rb.attribution.app_allowlist", "");
        E = dVar.x(10000L, "measurement.upload.realtime_upload_interval");
        F = dVar.x(604800000L, "measurement.upload.refresh_blacklisted_config_interval");
        dVar.x(3600000L, "measurement.config.cache_time.service");
        G = dVar.x(5000L, "measurement.service_client.idle_disconnect_millis");
        dVar.C("measurement.log_tag.service", "FA-SVC");
        H = dVar.x(1000L, "measurement.service_client.reconnect_millis");
        dVar.C("measurement.sgtm.app_allowlist", "*");
        I = dVar.x(240000L, "measurement.sgtm.batch.long_queuing_threshold");
        J = dVar.x(1800000L, "measurement.sgtm.batch.retry_interval");
        K = dVar.x(10L, "measurement.sgtm.batch.retry_max_count");
        L = dVar.x(21600000L, "measurement.sgtm.batch.retry_max_wait");
        M = dVar.C("measurement.sgtm.service_upload_apps_list", "");
        N = dVar.C("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504");
        O = dVar.x(5L, "measurement.sgtm.upload.batches_retrieval_limit");
        P = dVar.x(5000L, "measurement.sgtm.upload.max_queued_batches");
        Q = dVar.x(TTAdConstant.AD_MAX_EVENT_TIME, "measurement.sgtm.upload.min_delay_after_background");
        R = dVar.x(1000L, "measurement.sgtm.upload.min_delay_after_broadcast");
        S = dVar.x(5000L, "measurement.sgtm.upload.min_delay_after_startup");
        T = dVar.x(TTAdConstant.AD_MAX_EVENT_TIME, "measurement.sgtm.upload.retry_interval");
        U = dVar.x(21600000L, "measurement.sgtm.upload.retry_max_wait");
        V = dVar.x(86400000L, "measurement.upload.stale_data_deletion_interval");
        W = dVar.x(16L, "measurement.rb.attribution.max_retry_delay_seconds");
        X = dVar.x(90L, "measurement.rb.attribution.client.min_time_after_boot_seconds");
        Y = dVar.C("measurement.rb.attribution.uri_authority", "google-analytics.com");
        Z = dVar.x(864000000L, "measurement.rb.attribution.max_queue_time");
        f19678a0 = dVar.C("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        f19680b0 = dVar.C("measurement.rb.attribution.query_parameters_to_remove", "");
        f19682c0 = dVar.C("measurement.rb.attribution.uri_scheme", "https");
        f19684d0 = dVar.x(604800000L, "measurement.sdk.attribution.cache.ttl");
        f19686e0 = dVar.x(7200000L, "measurement.redaction.app_instance_id.ttl");
        f19688f0 = dVar.x(43200000L, "measurement.upload.backoff_period");
        f19689g0 = dVar.x(15000L, "measurement.upload.initial_upload_delay_time");
        f19691h0 = dVar.x(3600000L, "measurement.upload.interval");
        f19693i0 = dVar.x(65536L, "measurement.upload.max_bundle_size");
        f19694j0 = dVar.x(100L, "measurement.upload.max_bundles");
        f19696k0 = dVar.x(500L, "measurement.upload.max_conversions_per_day");
        f19698l0 = dVar.x(1000L, "measurement.upload.max_error_events_per_day");
        f19700m0 = dVar.x(1000L, "measurement.upload.max_events_per_bundle");
        f19702n0 = dVar.x(100000L, "measurement.upload.max_events_per_day");
        f19704o0 = dVar.x(50000L, "measurement.upload.max_public_events_per_day");
        f19706p0 = dVar.x(518400000L, "measurement.upload.max_queue_time");
        f19708q0 = dVar.x(10L, "measurement.upload.max_realtime_events_per_day");
        f19710r0 = dVar.x(65536L, "measurement.upload.max_batch_size");
        f19712s0 = dVar.x(6L, "measurement.upload.retry_count");
        f19714t0 = dVar.x(1800000L, "measurement.upload.retry_time");
        f19716u0 = dVar.C("measurement.upload.url", "https://app-measurement.com/a");
        f19718v0 = dVar.x(3600000L, "measurement.upload.window_interval");
        f19720w0 = dVar.C("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }
}
