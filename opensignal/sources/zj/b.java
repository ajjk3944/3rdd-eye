package zj;

import ak.a0;
import ak.a1;
import ak.c0;
import ak.c1;
import ak.f1;
import ak.h1;
import ak.j1;
import ak.l1;
import ak.p0;
import ak.q0;
import ak.s0;
import ak.x0;
import br.l;
import ch.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xj.i;
import y9.u;
import yi.g;
import z4.e;
import z4.f;
import z7.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final z4.d f27424a;

    /* renamed from: b, reason: collision with root package name */
    public final e f27425b;

    /* renamed from: c, reason: collision with root package name */
    public final z7.b f27426c;

    /* renamed from: d, reason: collision with root package name */
    public final d f27427d;

    /* renamed from: e, reason: collision with root package name */
    public final u f27428e;

    /* renamed from: f, reason: collision with root package name */
    public final zi.a f27429f;

    /* renamed from: g, reason: collision with root package name */
    public final zc.d f27430g;

    /* renamed from: h, reason: collision with root package name */
    public final zc.d f27431h;

    /* renamed from: i, reason: collision with root package name */
    public final j f27432i;
    public final xr.a j;
    public final z.b k;

    /* renamed from: l, reason: collision with root package name */
    public final e f27433l;

    /* renamed from: m, reason: collision with root package name */
    public final g f27434m;

    /* renamed from: n, reason: collision with root package name */
    public final z.b f27435n;

    /* renamed from: o, reason: collision with root package name */
    public final z4.d f27436o;

    /* renamed from: p, reason: collision with root package name */
    public final f f27437p;

    /* renamed from: q, reason: collision with root package name */
    public final z7.b f27438q;

    /* renamed from: r, reason: collision with root package name */
    public final zc.d f27439r;

    /* renamed from: s, reason: collision with root package name */
    public final yh.c f27440s;

    public b(z4.d dVar, e eVar, z7.b bVar, d dVar2, u uVar, zi.a aVar, zc.d dVar3, zc.d dVar4, j jVar, xr.a aVar2, z.b bVar2, e eVar2, z.b bVar3, g gVar, z.b bVar4, z4.d dVar5, f fVar, z7.b bVar5, zc.d dVar6, yh.c cVar, cj.a aVar3) {
        l.e(dVar, "backgroundConfigMapper");
        l.e(eVar, "locationConfigMapper");
        l.e(bVar, "udpConfigMapper");
        l.e(dVar2, "udpVerificationConfigMapper");
        l.e(uVar, "speedTestConfigMapper");
        l.e(aVar, "videoConfigMapper");
        l.e(dVar3, "traceRouteConfigMapper");
        l.e(dVar4, "dataLimitsConfigMapper");
        l.e(jVar, "serverResponseTestConfigMapper");
        l.e(aVar2, "throughputTestConfigMapper");
        l.e(bVar2, "icmpTestConfigMapper");
        l.e(eVar2, "cellConfigMapper");
        l.e(gVar, "wifiScanConfigMapper");
        l.e(bVar4, "assistantConfigMapper");
        l.e(dVar5, "sdkInSdkConfigMapper");
        l.e(fVar, "mlvisConfigMapper");
        l.e(bVar5, "httpHeadLatencyConfigMapper");
        l.e(dVar6, "networkRestrictionsConfigMapper");
        this.f27424a = dVar;
        this.f27425b = eVar;
        this.f27426c = bVar;
        this.f27427d = dVar2;
        this.f27428e = uVar;
        this.f27429f = aVar;
        this.f27430g = dVar3;
        this.f27431h = dVar4;
        this.f27432i = jVar;
        this.j = aVar2;
        this.k = bVar2;
        this.f27433l = eVar2;
        this.f27434m = gVar;
        this.f27435n = bVar4;
        this.f27436o = dVar5;
        this.f27437p = fVar;
        this.f27438q = bVar5;
        this.f27439r = dVar6;
        this.f27440s = cVar;
    }

    public static JSONObject a(b bVar, c0 c0Var) {
        JSONObject jSONObjectX;
        JSONObject jSONObjectX2;
        JSONObject jSONObjectX3;
        JSONObject jSONObjectX4;
        JSONObject jSONObjectX5;
        JSONObject jSONObjectX6;
        JSONObject jSONObjectX7;
        JSONObject jSONObjectX8;
        JSONObject jSONObjectX9;
        JSONObject jSONObjectX10;
        JSONObject jSONObjectX11;
        JSONObject jSONObjectX12;
        JSONObject jSONObjectX13;
        JSONObject jSONObject = new JSONObject();
        if (c0Var == null) {
            return jSONObject;
        }
        z4.d dVar = bVar.f27436o;
        p0 p0Var = c0Var.f462p;
        dVar.getClass();
        try {
            jSONObjectX = new JSONObject();
            jSONObjectX.put("priority_list", p0Var.f638a);
        } catch (JSONException e4) {
            jSONObjectX = h0.b.x("SdkInSdkConfigMapper", e4, e4);
        }
        jSONObject.put("sdk_in_sdk", jSONObjectX);
        z4.d dVar2 = bVar.f27424a;
        ak.d dVar3 = c0Var.f449a;
        dVar2.getClass();
        boolean z10 = dVar3.f491v;
        try {
            jSONObjectX2 = new JSONObject();
            jSONObjectX2.put("regex_nrstate", dVar3.f472a);
            jSONObjectX2.put("ip_collection_enabled", dVar3.f473b);
            jSONObjectX2.put("ip_lookup_url", dVar3.f474c);
            jSONObjectX2.put("max_reports_per_upload", dVar3.f475d);
            jSONObjectX2.put("cell_info_updater_method", dVar3.f477f);
            jSONObjectX2.put("target_dt_delta_interval", dVar3.f476e);
            jSONObjectX2.put("ip_freshness_time_ms", dVar3.f478g);
            jSONObjectX2.put("store_results_for_max_ms", dVar3.f479h);
            jSONObjectX2.put("wifi_identity_collection_enabled", dVar3.f480i);
            jSONObjectX2.put("use_telephony_callback_for_api_31_plus", dVar3.j);
            jSONObjectX2.put("connection_tracking_enabled", dVar3.k);
            jSONObjectX2.put("mmwave_detection_method", dVar3.f481l);
            jSONObjectX2.put("logging_thread_factory_enabled", dVar3.f482m);
            jSONObjectX2.put("connection_tracking_nr_status_enabled", dVar3.f484o);
            jSONObjectX2.put("use_flag_update_current_to_cancel_alarms", dVar3.f483n);
            jSONObjectX2.put("connection_last_task_time_enabled", dVar3.f485p);
            jSONObjectX2.put("crash_catcher_version", dVar3.f486q);
            jSONObjectX2.put("payload_encryption_enabled", dVar3.f487r);
            jSONObjectX2.put("data_sim_detection_method", dVar3.f488s);
            jSONObjectX2.put("devices_excluded_from_sentry_logging", new JSONArray((Collection) dVar3.f489t));
            jSONObjectX2.put("monitor_is_connected_field", dVar3.f490u);
            jSONObjectX2.put("monitor_network_state", z10);
            jSONObjectX2.put("use_long_running_pipeline", dVar3.f492w);
            jSONObjectX2.put("check_is_network_connected", dVar3.f493x);
            jSONObjectX2.put("monitor_network_state", z10);
            jSONObjectX2.put("dual_sim_core_collection_enabled", dVar3.f494y);
            jSONObjectX2.put("dns_servers_obfuscation_enabled", dVar3.f495z);
            jSONObjectX2.put("should_stop_running_job", dVar3.A);
            jSONObjectX2.put("check_is_network_validated", dVar3.B);
            jSONObjectX2.put("finish_keep_alive_job_service_after_execution", dVar3.C);
        } catch (JSONException e10) {
            jSONObjectX2 = h0.b.x("BackgroundConfigMapper", e10, e10);
        }
        jSONObject.put("background", jSONObjectX2);
        e eVar = bVar.f27425b;
        a0 a0Var = c0Var.f450b;
        eVar.getClass();
        try {
            jSONObjectX3 = new JSONObject();
            jSONObjectX3.put("freshness_time_in_ms", a0Var.f413a);
            jSONObjectX3.put("distance_freshness_in_meters", a0Var.f414b);
            jSONObjectX3.put("get_new_location_timeout_ms", a0Var.f415c);
            jSONObjectX3.put("get_new_location_foreground_timeout_ms", a0Var.f416d);
            jSONObjectX3.put("location_request_expiration_duration_ms", a0Var.f417e);
            jSONObjectX3.put("location_request_update_interval_ms", a0Var.f418f);
            jSONObjectX3.put("location_request_num_updates", a0Var.f419g);
            jSONObjectX3.put("location_request_update_fastest_interval_ms", a0Var.f420h);
            jSONObjectX3.put("location_age_method", a0Var.f422l);
            jSONObjectX3.put("location_request_passive_enabled", a0Var.f421i);
            jSONObjectX3.put("location_request_passive_fastest_interval_ms", a0Var.j);
            jSONObjectX3.put("location_request_passive_smallest_displacement_meters", a0Var.k);
            jSONObjectX3.put("decimal_places_precision", a0Var.f423m);
            jSONObjectX3.put("caching_freshness_time_ms", a0Var.f424n);
        } catch (JSONException e11) {
            jSONObjectX3 = h0.b.x("LocationConfigMapper", e11, e11);
        }
        jSONObject.put("location", jSONObjectX3);
        z7.b bVar2 = bVar.f27426c;
        f1 f1Var = c0Var.f451c;
        bVar2.getClass();
        try {
            jSONObjectX4 = new JSONObject();
            jSONObjectX4.put("tests", ((i) bVar2.f26690a).g(f1Var.f520a));
            jSONObjectX4.put("packet_sending_offset_enabled", f1Var.f521b);
            jSONObjectX4.put("test_completion_method", f1Var.f522c);
            jSONObjectX4.put("create_packets_before_test", f1Var.f523d);
        } catch (JSONException e12) {
            jSONObjectX4 = h0.b.x("UdpConfigMapper", e12, e12);
        }
        jSONObject.put("udp", jSONObjectX4);
        d dVar4 = bVar.f27427d;
        h1 h1Var = c0Var.f452d;
        dVar4.getClass();
        try {
            jSONObjectX5 = new JSONObject();
            jSONObjectX5.put("version", h1Var.f543a);
            jSONObjectX5.put("number_of_probes", h1Var.f544b);
            jSONObjectX5.put("target_send_rate_kbps", h1Var.f545c);
        } catch (JSONException e13) {
            jSONObjectX5 = h0.b.x("UdpVerificationConfigMapper", e13, e13);
        }
        jSONObject.put("udp_verification", jSONObjectX5);
        u uVar = bVar.f27428e;
        s0 s0Var = c0Var.f453e;
        uVar.getClass();
        try {
            jSONObjectX6 = new JSONObject();
            jSONObjectX6.put("download_duration_bg", s0Var.f673a);
            jSONObjectX6.put("download_duration_fg", s0Var.f674b);
            jSONObjectX6.put("download_duration_fg_wifi", s0Var.f675c);
            jSONObjectX6.put("download_threads", s0Var.f677e);
            xu.d.Y(jSONObjectX6, "download_threshold_in_kilobytes", Long.valueOf(s0Var.f678f));
            jSONObjectX6.put("download_timeout", s0Var.f679g);
            jSONObjectX6.put("num_pings", s0Var.f681i);
            jSONObjectX6.put("ping_max_duration", s0Var.j);
            jSONObjectX6.put("ping_timeout", s0Var.k);
            jSONObjectX6.put("ping_wait_time", s0Var.f682l);
            jSONObjectX6.put("wait_for_all_latency_tests", s0Var.f683m);
            jSONObjectX6.put("upload_duration_bg", s0Var.f684n);
            jSONObjectX6.put("upload_duration_fg", s0Var.f685o);
            jSONObjectX6.put("upload_duration_fg_wifi", s0Var.f676d);
            jSONObjectX6.put("upload_threads", s0Var.f686p);
            xu.d.Y(jSONObjectX6, "upload_threshold_in_kilobytes", Long.valueOf(s0Var.f687q));
            jSONObjectX6.put("upload_timeout", s0Var.f688r);
            jSONObjectX6.put("randomize_latency_urls_order", s0Var.f689s);
            jSONObjectX6.put("test_config", ((u) uVar.f25996d).a(s0Var.f695y));
            xu.d.Y(jSONObjectX6, "cloudfront_chunking_method", Integer.valueOf(s0Var.f691u));
            xu.d.Y(jSONObjectX6, "cloudfront_upload_chunk_size", Integer.valueOf(s0Var.f692v));
            xu.d.Y(jSONObjectX6, "cloudflare_chunking_method", Integer.valueOf(s0Var.f693w));
            xu.d.Y(jSONObjectX6, "cloudflare_upload_chunk_size", Integer.valueOf(s0Var.f694x));
            xu.d.Y(jSONObjectX6, "download_traffic_data_frequency_ms", Long.valueOf(s0Var.f680h));
            xu.d.Y(jSONObjectX6, "upload_traffic_data_frequency_ms", Long.valueOf(s0Var.f690t));
        } catch (JSONException e14) {
            jSONObjectX6 = h0.b.x("SpeedTestConfigJsonMapper", e14, e14);
        }
        jSONObject.put("speedtest", jSONObjectX6);
        zi.a aVar = bVar.f27429f;
        j1 j1Var = c0Var.f454f;
        aVar.getClass();
        try {
            jSONObjectX7 = new JSONObject();
            jSONObjectX7.put("buffer_for_playback_after_rebuffer_ms", j1Var.f579a);
            jSONObjectX7.put("buffer_for_playback_ms", j1Var.f580b);
            jSONObjectX7.put("max_buffer_ms", j1Var.f581c);
            jSONObjectX7.put("min_buffer_ms", j1Var.f582d);
            jSONObjectX7.put("test_length", j1Var.f583e);
            jSONObjectX7.put("global_timeout_ms", j1Var.f584f);
            jSONObjectX7.put("initialisation_timeout_ms", j1Var.f585g);
            jSONObjectX7.put("buffering_timeout_ms", j1Var.f586h);
            jSONObjectX7.put("seeking_timeout_ms", j1Var.f587i);
            jSONObjectX7.put("information_request_timeout_ms", j1Var.k);
            jSONObjectX7.put("tests", ((yh.c) aVar.f27421a).c(j1Var.j));
            jSONObjectX7.put("youtube_url_format", j1Var.f588l);
            jSONObjectX7.put("use_exoplayer_analytics_listener", j1Var.f589m);
            jSONObjectX7.put("youtube_parser_version", j1Var.f590n);
            jSONObjectX7.put("innertube_config", ((z4.d) aVar.f27422b).a(j1Var.f591o));
            jSONObjectX7.put("youtube_consent_url", j1Var.f592p);
            jSONObjectX7.put("youtube_player_response_regex", j1Var.f593q);
            jSONObjectX7.put("youtube_consent_form_parameter_regex", j1Var.f594r);
            jSONObjectX7.put("adaptive_streaming", ((g) aVar.f27423c).f(j1Var.f595s));
            jSONObjectX7.put("remote_url_endpoint", j1Var.f596t);
            jSONObjectX7.put("video_playback_library", j1Var.f597u);
            jSONObjectX7.put("traffic_stats_frequency_ms", j1Var.f598v);
        } catch (JSONException e15) {
            jSONObjectX7 = h0.b.x("VideoConfigMapper", e15, e15);
        }
        jSONObject.put("video", jSONObjectX7);
        zc.d dVar5 = bVar.f27430g;
        c1 c1Var = c0Var.f455g;
        dVar5.getClass();
        try {
            jSONObjectX8 = new JSONObject();
            jSONObjectX8.put("endpoints", xu.d.h0(c1Var.f467a));
            jSONObjectX8.put("max_hops", c1Var.f468b);
            jSONObjectX8.put("send_request_number_times", c1Var.f469c);
            jSONObjectX8.put("min_wait_response_ms", c1Var.f470d);
            jSONObjectX8.put("max_wait_response_ms", c1Var.f471e);
        } catch (JSONException e16) {
            jSONObjectX8 = h0.b.x("TracerouteConfigMapper", e16, e16);
        }
        jSONObject.put("traceroute", jSONObjectX8);
        zc.d dVar6 = bVar.f27431h;
        ak.l lVar = c0Var.f456h;
        dVar6.getClass();
        try {
            jSONObjectX9 = new JSONObject();
            jSONObjectX9.put("check_speed_for_ms", lVar.f610c);
            jSONObjectX9.put("download_speed_threshold_kilobytes_per_second", lVar.f608a);
            jSONObjectX9.put("upload_speed_threshold_kilobytes_per_second", lVar.f609b);
        } catch (JSONException e17) {
            jSONObjectX9 = h0.b.x("DataLimitsConfigMapper", e17, e17);
        }
        jSONObject.put("data_limits", jSONObjectX9);
        xr.a aVar2 = bVar.j;
        a1 a1Var = c0Var.f457i;
        aVar2.getClass();
        try {
            jSONObjectX10 = new JSONObject();
            jSONObjectX10.put("download_configurations", ((gi.a) aVar2.f25482d).b(a1Var.f425a));
            jSONObjectX10.put("upload_configurations", ((gi.a) aVar2.f25483g).b(a1Var.f426b));
        } catch (JSONException e18) {
            jSONObjectX10 = h0.b.x("ThroughputTestConfigMapper", e18, e18);
        }
        jSONObject.put("throughput_test", jSONObjectX10);
        j jVar = bVar.f27432i;
        q0 q0Var = c0Var.j;
        jVar.getClass();
        try {
            jSONObjectX11 = new JSONObject();
            jSONObjectX11.put("test_servers", ((e) jVar.f26706d).a(q0Var.f641a));
            jSONObjectX11.put("packet_size_bytes", q0Var.f642b);
            jSONObjectX11.put("packet_count", q0Var.f643c);
            jSONObjectX11.put("timeout_ms", q0Var.f644d);
            jSONObjectX11.put("packet_delay_ms", q0Var.f645e);
            jSONObjectX11.put("test_server_default", q0Var.f647g);
            jSONObjectX11.put("port", q0Var.f646f);
            jSONObjectX11.put("randomize_payload", q0Var.f648h);
            jSONObjectX11.put("verification_version", q0Var.f649i);
            jSONObjectX11.put("verification_packets_to_send", q0Var.j);
            jSONObjectX11.put("verification_packets_spacing", q0Var.k);
            jSONObjectX11.put("verification_packet_encryption", q0Var.f650l);
        } catch (JSONException e19) {
            jSONObjectX11 = h0.b.x("ServerResponseTestConfigMapper", e19, e19);
        }
        jSONObject.put("server_response_test", jSONObjectX11);
        jSONObject.put("icmp", bVar.k.d(c0Var.k));
        e eVar2 = bVar.f27433l;
        ak.e eVar3 = c0Var.f458l;
        eVar2.getClass();
        try {
            jSONObjectX12 = new JSONObject();
            jSONObjectX12.put("nr_cell_min_nrarfcn", eVar3.f505a);
            jSONObjectX12.put("nr_cell_max_nrarfcn", eVar3.f506b);
            jSONObjectX12.put("freshness_ms", eVar3.f507c);
        } catch (JSONException e20) {
            jSONObjectX12 = h0.b.x("CellConfigMapper", e20, e20);
        }
        jSONObject.put("cell", jSONObjectX12);
        jSONObject.put("sdk_data_usage_limits", z.b.e(c0Var.f459m));
        g gVar = bVar.f27434m;
        l1 l1Var = c0Var.f460n;
        gVar.getClass();
        try {
            jSONObjectX13 = new JSONObject();
            jSONObjectX13.put("count", l1Var.f611a);
            jSONObjectX13.put("same_location_interval_ms", l1Var.f612b);
            jSONObjectX13.put("enable_information_elements", l1Var.f613c);
            jSONObjectX13.put("information_elements_count", l1Var.f614d);
            jSONObjectX13.put("information_elements_byte_limit", l1Var.f615e);
        } catch (JSONException e21) {
            jSONObjectX13 = h0.b.x("WifiScanConfigMapper", e21, e21);
        }
        jSONObject.put("wifi_scan", jSONObjectX13);
        jSONObject.put("connectivity_assistant_recipes", bVar.f27435n.c(c0Var.f461o));
        jSONObject.put("mlvis", bVar.f27437p.d(c0Var.f463q));
        jSONObject.put("http_head_latency", bVar.f27438q.a(c0Var.f464r));
        jSONObject.put("network_restrictions", bVar.f27439r.b(c0Var.f465s));
        jSONObject.put("region_restrictions", bVar.f27440s.b(c0Var.f466t));
        return jSONObject;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final c0 b(JSONObject jSONObject, c0 c0Var, boolean z10) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        a0 a0Var;
        ak.d dVar;
        f1 f1Var;
        h1 h1Var;
        s0 s0Var;
        c1 c1Var;
        ak.l lVar;
        a1 a1Var;
        q0 q0Var;
        if (jSONObject == null) {
            return c0Var;
        }
        if (z10) {
            if (jSONObject.optJSONObject("background") == null || jSONObject.optJSONObject("location") == null || jSONObject.optJSONObject("udp") == null || jSONObject.optJSONObject("speedtest") == null || jSONObject.optJSONObject("video") == null) {
                String strValueOf = String.valueOf(jSONObject.toString(4));
                n.g("MeasurementConfigMapper", "JSONObject is missing mandatory data: ");
                n.a();
                cj.a.F("JSONObject is missing mandatory data: ".concat(strValueOf));
            } else {
                n.b("MeasurementConfigMapper", "Base config is valid");
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sdk_in_sdk");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("background");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("location");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("udp");
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("udp_verification");
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("speedtest");
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("video");
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("traceroute");
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("data_limits");
        JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("throughput_test");
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("server_response_test");
        JSONObject jSONObjectOptJSONObject12 = jSONObject.optJSONObject("icmp");
        JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject("cell");
        JSONObject jSONObjectOptJSONObject14 = jSONObject.optJSONObject("sdk_data_usage_limits");
        JSONObject jSONObjectOptJSONObject15 = jSONObject.optJSONObject("wifi_scan");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("connectivity_assistant_recipes");
        JSONObject jSONObjectOptJSONObject16 = jSONObject.optJSONObject("mlvis");
        JSONObject jSONObjectOptJSONObject17 = jSONObject.optJSONObject("http_head_latency");
        JSONObject jSONObjectOptJSONObject18 = jSONObject.optJSONObject("network_restrictions");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("region_restrictions");
        a0 a0Var2 = c0Var.f450b;
        this.f27425b.getClass();
        if (jSONObjectOptJSONObject3 == null) {
            a0Var = a0Var2;
            jSONObject2 = jSONObjectOptJSONObject12;
            jSONObject3 = jSONObjectOptJSONObject13;
        } else {
            jSONObject2 = jSONObjectOptJSONObject12;
            jSONObject3 = jSONObjectOptJSONObject13;
            try {
                a0Var = new a0(jSONObjectOptJSONObject3.optLong("freshness_time_in_ms", a0Var2.f413a), jSONObjectOptJSONObject3.optLong("distance_freshness_in_meters", a0Var2.f414b), jSONObjectOptJSONObject3.optLong("get_new_location_timeout_ms", a0Var2.f415c), jSONObjectOptJSONObject3.optLong("get_new_location_foreground_timeout_ms", a0Var2.f416d), jSONObjectOptJSONObject3.optLong("location_request_expiration_duration_ms", a0Var2.f417e), jSONObjectOptJSONObject3.optLong("location_request_update_interval_ms", a0Var2.f418f), jSONObjectOptJSONObject3.optInt("location_request_num_updates", a0Var2.f419g), jSONObjectOptJSONObject3.optLong("location_request_update_fastest_interval_ms", a0Var2.f420h), jSONObjectOptJSONObject3.optBoolean("location_request_passive_enabled", a0Var2.f421i), jSONObjectOptJSONObject3.optLong("location_request_passive_fastest_interval_ms", a0Var2.j), jSONObjectOptJSONObject3.optLong("location_request_passive_smallest_displacement_meters", a0Var2.k), jSONObjectOptJSONObject3.optInt("location_age_method", a0Var2.f422l), jSONObjectOptJSONObject3.optInt("decimal_places_precision", a0Var2.f423m), jSONObjectOptJSONObject3.optLong("caching_freshness_time_ms", a0Var2.f424n));
            } catch (JSONException e4) {
                String str = "Can't mapTo() to LocationConfig for input: " + jSONObjectOptJSONObject3;
                n.d("LocationConfigMapper", str, e4);
                cj.a.E(e4, str);
                a0Var = a0Var2;
            }
        }
        ak.d dVar2 = c0Var.f449a;
        this.f27424a.getClass();
        boolean z11 = dVar2.f495z;
        if (jSONObjectOptJSONObject2 == null) {
            dVar = dVar2;
        } else {
            try {
                String strOptString = jSONObjectOptJSONObject2.optString("regex_nrstate", dVar2.f472a);
                l.d(strOptString, "optString(...)");
                boolean zOptBoolean = jSONObjectOptJSONObject2.optBoolean("ip_collection_enabled", dVar2.f473b);
                String strOptString2 = jSONObjectOptJSONObject2.optString("ip_lookup_url", dVar2.f474c);
                l.d(strOptString2, "optString(...)");
                int iOptInt = jSONObjectOptJSONObject2.optInt("max_reports_per_upload", dVar2.f475d);
                int iOptInt2 = jSONObjectOptJSONObject2.optInt("target_dt_delta_interval", dVar2.f476e);
                int iOptInt3 = jSONObjectOptJSONObject2.optInt("cell_info_updater_method", dVar2.f477f);
                long jOptLong = jSONObjectOptJSONObject2.optLong("ip_freshness_time_ms", dVar2.f478g);
                long jOptLong2 = jSONObjectOptJSONObject2.optLong("store_results_for_max_ms", dVar2.f479h);
                boolean zOptBoolean2 = jSONObjectOptJSONObject2.optBoolean("wifi_identity_collection_enabled", dVar2.f480i);
                boolean zOptBoolean3 = jSONObjectOptJSONObject2.optBoolean("use_telephony_callback_for_api_31_plus", dVar2.j);
                boolean zOptBoolean4 = jSONObjectOptJSONObject2.optBoolean("connection_tracking_enabled", dVar2.k);
                int iOptInt4 = jSONObjectOptJSONObject2.optInt("mmwave_detection_method", dVar2.f481l);
                boolean zOptBoolean5 = jSONObjectOptJSONObject2.optBoolean("logging_thread_factory_enabled", dVar2.f482m);
                boolean zOptBoolean6 = jSONObjectOptJSONObject2.optBoolean("use_flag_update_current_to_cancel_alarms", dVar2.f483n);
                boolean zOptBoolean7 = jSONObjectOptJSONObject2.optBoolean("connection_tracking_nr_status_enabled", dVar2.f484o);
                boolean zOptBoolean8 = jSONObjectOptJSONObject2.optBoolean("connection_last_task_time_enabled", dVar2.f485p);
                int iOptInt5 = jSONObjectOptJSONObject2.optInt("crash_catcher_version", dVar2.f486q);
                boolean zOptBoolean9 = jSONObjectOptJSONObject2.optBoolean("payload_encryption_enabled", dVar2.f487r);
                int iOptInt6 = jSONObjectOptJSONObject2.optInt("data_sim_detection_method", dVar2.f488s);
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("devices_excluded_from_sentry_logging");
                List listI0 = jSONArrayOptJSONArray3 != null ? xu.d.i0(jSONArrayOptJSONArray3) : null;
                if (listI0 == null) {
                    listI0 = dVar2.f489t;
                }
                dVar = new ak.d(strOptString, zOptBoolean, strOptString2, iOptInt, iOptInt2, iOptInt3, jOptLong, jOptLong2, zOptBoolean2, zOptBoolean3, zOptBoolean4, iOptInt4, zOptBoolean5, zOptBoolean6, zOptBoolean7, zOptBoolean8, iOptInt5, zOptBoolean9, iOptInt6, listI0, jSONObjectOptJSONObject2.optBoolean("monitor_is_connected_field", dVar2.f490u), jSONObjectOptJSONObject2.optBoolean("monitor_network_state", dVar2.f491v), jSONObjectOptJSONObject2.optBoolean("use_long_running_pipeline", dVar2.f492w), jSONObjectOptJSONObject2.optBoolean("check_is_network_connected", dVar2.f493x), jSONObjectOptJSONObject2.optBoolean("dual_sim_core_collection_enabled", dVar2.f494y), jSONObjectOptJSONObject2.optBoolean("dns_servers_obfuscation_enabled", z11), jSONObjectOptJSONObject2.optBoolean("should_stop_running_job", z11), jSONObjectOptJSONObject2.optBoolean("check_is_network_validated", dVar2.B), jSONObjectOptJSONObject2.optBoolean("finish_keep_alive_job_service_after_execution", dVar2.C));
            } catch (JSONException e10) {
                n.e("BackgroundConfigMapper", e10);
                cj.a.G(e10);
            }
        }
        f1 f1Var2 = c0Var.f451c;
        z7.b bVar = this.f27426c;
        bVar.getClass();
        if (jSONObjectOptJSONObject4 == null) {
            f1Var = f1Var2;
        } else {
            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject4.optJSONArray("tests");
            List list = jSONArrayOptJSONArray4 != null ? (List) ((i) bVar.f26690a).a(jSONArrayOptJSONArray4) : f1Var2.f520a;
            try {
                Boolean boolR = xu.d.r("packet_sending_offset_enabled", jSONObjectOptJSONObject4);
                boolean zBooleanValue = boolR != null ? boolR.booleanValue() : f1Var2.f521b;
                Integer numY = xu.d.y("test_completion_method", jSONObjectOptJSONObject4);
                int iIntValue = numY != null ? numY.intValue() : f1Var2.f522c;
                Boolean boolR2 = xu.d.r("create_packets_before_test", jSONObjectOptJSONObject4);
                f1Var = new f1(list, zBooleanValue, iIntValue, boolR2 != null ? boolR2.booleanValue() : f1Var2.f523d);
            } catch (JSONException e11) {
                String str2 = "Can't mapTo() to UdpConfig for input: " + jSONObjectOptJSONObject4;
                n.d("UdpConfigMapper", str2, e11);
                cj.a.E(e11, str2);
            }
        }
        h1 h1Var2 = c0Var.f452d;
        this.f27427d.getClass();
        if (jSONObjectOptJSONObject5 == null) {
            h1Var = h1Var2;
        } else {
            try {
                h1Var = new h1(jSONObjectOptJSONObject5.optInt("version", h1Var2.f543a), jSONObjectOptJSONObject5.optInt("number_of_probes", h1Var2.f544b), jSONObjectOptJSONObject5.optInt("target_send_rate_kbps", h1Var2.f545c));
            } catch (JSONException e12) {
                String str3 = "Can't mapTo() to UdpVerificationConfig for input: " + jSONObjectOptJSONObject5;
                n.d("UdpVerificationConfigMapper", str3, e12);
                cj.a.E(e12, str3);
            }
        }
        s0 s0Var2 = c0Var.f453e;
        u uVar = this.f27428e;
        uVar.getClass();
        if (jSONObjectOptJSONObject6 == null) {
            s0Var = s0Var2;
        } else {
            try {
                x0 x0VarB = ((u) uVar.f25996d).b(jSONObjectOptJSONObject6.optJSONObject("test_config"), s0Var2.f695y);
                Integer numY2 = xu.d.y("download_duration_bg", jSONObjectOptJSONObject6);
                int iIntValue2 = numY2 != null ? numY2.intValue() : s0Var2.f673a;
                Integer numY3 = xu.d.y("download_duration_fg", jSONObjectOptJSONObject6);
                int iIntValue3 = numY3 != null ? numY3.intValue() : s0Var2.f674b;
                Integer numY4 = xu.d.y("download_threads", jSONObjectOptJSONObject6);
                int iIntValue4 = numY4 != null ? numY4.intValue() : s0Var2.f677e;
                Long lC = xu.d.C("download_threshold_in_kilobytes", jSONObjectOptJSONObject6);
                long jLongValue = lC != null ? lC.longValue() : s0Var2.f678f;
                Integer numY5 = xu.d.y("download_timeout", jSONObjectOptJSONObject6);
                int iIntValue5 = numY5 != null ? numY5.intValue() : s0Var2.f679g;
                Integer numY6 = xu.d.y("num_pings", jSONObjectOptJSONObject6);
                int iIntValue6 = numY6 != null ? numY6.intValue() : s0Var2.f681i;
                Integer numY7 = xu.d.y("ping_max_duration", jSONObjectOptJSONObject6);
                int iIntValue7 = numY7 != null ? numY7.intValue() : s0Var2.j;
                Integer numY8 = xu.d.y("ping_timeout", jSONObjectOptJSONObject6);
                int iIntValue8 = numY8 != null ? numY8.intValue() : s0Var2.k;
                Long lC2 = xu.d.C("ping_wait_time", jSONObjectOptJSONObject6);
                long jLongValue2 = lC2 != null ? lC2.longValue() : s0Var2.f682l;
                Boolean boolR3 = xu.d.r("wait_for_all_latency_tests", jSONObjectOptJSONObject6);
                boolean zBooleanValue2 = boolR3 != null ? boolR3.booleanValue() : s0Var2.f683m;
                Integer numY9 = xu.d.y("upload_duration_bg", jSONObjectOptJSONObject6);
                int iIntValue9 = numY9 != null ? numY9.intValue() : s0Var2.f684n;
                Integer numY10 = xu.d.y("upload_duration_fg", jSONObjectOptJSONObject6);
                int iIntValue10 = numY10 != null ? numY10.intValue() : s0Var2.f685o;
                Integer numY11 = xu.d.y("upload_threads", jSONObjectOptJSONObject6);
                int iIntValue11 = numY11 != null ? numY11.intValue() : s0Var2.f686p;
                Long lC3 = xu.d.C("upload_threshold_in_kilobytes", jSONObjectOptJSONObject6);
                long jLongValue3 = lC3 != null ? lC3.longValue() : s0Var2.f687q;
                Integer numY12 = xu.d.y("upload_timeout", jSONObjectOptJSONObject6);
                int iIntValue12 = numY12 != null ? numY12.intValue() : s0Var2.f688r;
                Boolean boolR4 = xu.d.r("randomize_latency_urls_order", jSONObjectOptJSONObject6);
                boolean zBooleanValue3 = boolR4 != null ? boolR4.booleanValue() : s0Var2.f689s;
                Integer numY13 = xu.d.y("download_duration_fg_wifi", jSONObjectOptJSONObject6);
                int iIntValue13 = numY13 != null ? numY13.intValue() : s0Var2.f675c;
                Integer numY14 = xu.d.y("upload_duration_fg_wifi", jSONObjectOptJSONObject6);
                int iIntValue14 = numY14 != null ? numY14.intValue() : s0Var2.f676d;
                Integer numY15 = xu.d.y("cloudfront_chunking_method", jSONObjectOptJSONObject6);
                int iIntValue15 = numY15 != null ? numY15.intValue() : s0Var2.f691u;
                Integer numY16 = xu.d.y("cloudfront_upload_chunk_size", jSONObjectOptJSONObject6);
                int iIntValue16 = numY16 != null ? numY16.intValue() : s0Var2.f692v;
                Integer numY17 = xu.d.y("cloudflare_chunking_method", jSONObjectOptJSONObject6);
                int iIntValue17 = numY17 != null ? numY17.intValue() : s0Var2.f693w;
                Integer numY18 = xu.d.y("cloudflare_upload_chunk_size", jSONObjectOptJSONObject6);
                int iIntValue18 = numY18 != null ? numY18.intValue() : s0Var2.f694x;
                Long lC4 = xu.d.C("download_traffic_data_frequency_ms", jSONObjectOptJSONObject6);
                long jLongValue4 = lC4 != null ? lC4.longValue() : s0Var2.f680h;
                Long lC5 = xu.d.C("upload_traffic_data_frequency_ms", jSONObjectOptJSONObject6);
                s0Var = new s0(iIntValue2, iIntValue3, iIntValue13, iIntValue14, iIntValue4, jLongValue, iIntValue5, jLongValue4, iIntValue6, iIntValue7, iIntValue8, jLongValue2, zBooleanValue2, iIntValue9, iIntValue10, iIntValue11, jLongValue3, iIntValue12, zBooleanValue3, lC5 != null ? lC5.longValue() : s0Var2.f690t, iIntValue15, iIntValue16, iIntValue17, iIntValue18, x0VarB);
            } catch (JSONException e13) {
                String str4 = "Can't mapTo() to SpeedTestConfig for input: " + jSONObjectOptJSONObject6;
                n.d("SpeedTestConfigJsonMapper", str4, e13);
                cj.a.E(e13, str4);
            }
        }
        j1 j1VarA = this.f27429f.a(jSONObjectOptJSONObject7, c0Var.f454f);
        c1 c1Var2 = c0Var.f455g;
        this.f27430g.getClass();
        if (jSONObjectOptJSONObject8 == null) {
            c1Var = c1Var2;
        } else {
            try {
                JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject8.optJSONArray("endpoints");
                List listI02 = jSONArrayOptJSONArray5 != null ? xu.d.i0(jSONArrayOptJSONArray5) : c1Var2.f467a;
                Integer numY19 = xu.d.y("max_hops", jSONObjectOptJSONObject8);
                int iIntValue19 = numY19 != null ? numY19.intValue() : c1Var2.f468b;
                Integer numY20 = xu.d.y("send_request_number_times", jSONObjectOptJSONObject8);
                int iIntValue20 = numY20 != null ? numY20.intValue() : c1Var2.f469c;
                Long lC6 = xu.d.C("min_wait_response_ms", jSONObjectOptJSONObject8);
                long jLongValue5 = lC6 != null ? lC6.longValue() : c1Var2.f470d;
                Long lC7 = xu.d.C("max_wait_response_ms", jSONObjectOptJSONObject8);
                c1Var = new c1(listI02, iIntValue19, iIntValue20, jLongValue5, lC7 != null ? lC7.longValue() : c1Var2.f471e);
            } catch (JSONException e14) {
                n.e("TracerouteConfigMapper", e14);
                cj.a.G(e14);
            }
        }
        ak.l lVar2 = c0Var.f456h;
        this.f27431h.getClass();
        if (jSONObjectOptJSONObject9 == null) {
            lVar = lVar2;
        } else {
            try {
                Long lC8 = xu.d.C("check_speed_for_ms", jSONObjectOptJSONObject9);
                long jLongValue6 = lC8 != null ? lC8.longValue() : lVar2.f610c;
                Long lC9 = xu.d.C("download_speed_threshold_kilobytes_per_second", jSONObjectOptJSONObject9);
                long jLongValue7 = lC9 != null ? lC9.longValue() : lVar2.f608a;
                Long lC10 = xu.d.C("upload_speed_threshold_kilobytes_per_second", jSONObjectOptJSONObject9);
                lVar = new ak.l(jLongValue7, lC10 != null ? lC10.longValue() : lVar2.f609b, jLongValue6);
            } catch (JSONException e15) {
                n.e("DataLimitsConfigMapper", e15);
                cj.a.G(e15);
            }
        }
        a1 a1Var2 = c0Var.f457i;
        xr.a aVar = this.j;
        aVar.getClass();
        if (jSONObjectOptJSONObject10 == null) {
            a1Var = a1Var2;
        } else {
            ArrayList arrayList = a1Var2.f425a;
            try {
                JSONArray jSONArray = jSONObjectOptJSONObject10.getJSONArray("download_configurations");
                ArrayList arrayListE = (jSONArray == null || jSONArray.length() == 0) ? arrayList : ((gi.a) aVar.f25482d).e(jSONArray);
                if (arrayListE.isEmpty()) {
                    arrayListE.addAll(arrayList);
                }
                arrayList = arrayListE;
            } catch (Exception e16) {
                n.e("ThroughputTestConfigMapper", e16);
            }
            ArrayList arrayList2 = a1Var2.f426b;
            try {
                JSONArray jSONArray2 = jSONObjectOptJSONObject10.getJSONArray("upload_configurations");
                ArrayList arrayListE2 = (jSONArray2 == null || jSONArray2.length() == 0) ? arrayList2 : ((gi.a) aVar.f25483g).e(jSONArray2);
                if (arrayListE2.isEmpty()) {
                    arrayListE2.addAll(arrayList2);
                }
                arrayList2 = arrayListE2;
            } catch (Exception e17) {
                n.e("ThroughputTestConfigMapper", e17);
            }
            a1Var = new a1(arrayList, arrayList2);
        }
        q0 q0Var2 = c0Var.j;
        j jVar = this.f27432i;
        jVar.getClass();
        if (jSONObjectOptJSONObject11 == null) {
            q0Var = q0Var2;
        } else {
            try {
                e eVar = (e) jVar.f26706d;
                JSONArray jSONArray3 = jSONObjectOptJSONObject11.getJSONArray("test_servers");
                l.d(jSONArray3, "getJSONArray(...)");
                ArrayList arrayListC = eVar.c(jSONArray3);
                Integer numY21 = xu.d.y("packet_size_bytes", jSONObjectOptJSONObject11);
                int iIntValue21 = numY21 != null ? numY21.intValue() : q0Var2.f642b;
                Integer numY22 = xu.d.y("packet_count", jSONObjectOptJSONObject11);
                int iIntValue22 = numY22 != null ? numY22.intValue() : q0Var2.f643c;
                Long lC11 = xu.d.C("timeout_ms", jSONObjectOptJSONObject11);
                long jLongValue8 = lC11 != null ? lC11.longValue() : q0Var2.f644d;
                Integer numY23 = xu.d.y("packet_delay_ms", jSONObjectOptJSONObject11);
                int iIntValue23 = numY23 != null ? numY23.intValue() : q0Var2.f645e;
                Integer numY24 = xu.d.y("port", jSONObjectOptJSONObject11);
                int iIntValue24 = numY24 != null ? numY24.intValue() : q0Var2.f646f;
                String strK = xu.d.K("test_server_default", jSONObjectOptJSONObject11);
                if (strK == null) {
                    strK = q0Var2.f647g;
                }
                String str5 = strK;
                Boolean boolR5 = xu.d.r("randomize_payload", jSONObjectOptJSONObject11);
                boolean zBooleanValue4 = boolR5 != null ? boolR5.booleanValue() : q0Var2.f648h;
                Integer numY25 = xu.d.y("verification_version", jSONObjectOptJSONObject11);
                if (numY25 == null) {
                    numY25 = q0Var2.f649i;
                }
                Integer num = numY25;
                Integer numY26 = xu.d.y("verification_packets_to_send", jSONObjectOptJSONObject11);
                if (numY26 == null) {
                    numY26 = q0Var2.j;
                }
                Integer num2 = numY26;
                Integer numY27 = xu.d.y("verification_packets_spacing", jSONObjectOptJSONObject11);
                if (numY27 == null) {
                    numY27 = q0Var2.k;
                }
                Integer num3 = numY27;
                Integer numY28 = xu.d.y("verification_packet_encryption", jSONObjectOptJSONObject11);
                if (numY28 == null) {
                    numY28 = q0Var2.f650l;
                }
                q0Var = new q0(arrayListC, iIntValue21, iIntValue22, jLongValue8, iIntValue23, iIntValue24, str5, zBooleanValue4, num, num2, num3, numY28);
            } catch (Exception e18) {
                n.e("ServerResponseTestConfigMapper", e18);
                cj.a.G(e18);
            }
        }
        return new c0(dVar, a0Var, f1Var, h1Var, s0Var, j1VarA, c1Var, lVar, a1Var, q0Var, this.k.h(jSONObject2, c0Var.k), this.f27433l.b(jSONObject3, c0Var.f458l), z.b.i(jSONObjectOptJSONObject14, c0Var.f459m), this.f27434m.k(jSONObjectOptJSONObject15, c0Var.f460n), this.f27435n.g(jSONArrayOptJSONArray, c0Var.f461o), this.f27436o.c(jSONObjectOptJSONObject, c0Var.f462p), this.f27437p.f(jSONObjectOptJSONObject16, c0Var.f463q), this.f27438q.b(jSONObjectOptJSONObject17, c0Var.f464r), this.f27439r.c(jSONObjectOptJSONObject18, c0Var.f465s), this.f27440s.d(jSONArrayOptJSONArray2, c0Var.f466t));
    }
}
