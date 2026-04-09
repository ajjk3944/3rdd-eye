package ai;

import ak.p;
import ak.s;
import br.l;
import com.google.android.gms.internal.measurement.i4;
import g4.j;
import ir.f0;
import java.util.ArrayList;
import java.util.Iterator;
import ni.a1;
import ni.b1;
import ni.c0;
import ni.c1;
import ni.d0;
import ni.d1;
import ni.e0;
import ni.e1;
import ni.f1;
import ni.g0;
import ni.g1;
import ni.h;
import ni.h0;
import ni.i;
import ni.i0;
import ni.i1;
import ni.j0;
import ni.j1;
import ni.k0;
import ni.l0;
import ni.m;
import ni.m0;
import ni.n;
import ni.n0;
import ni.o0;
import ni.p0;
import ni.q;
import ni.q0;
import ni.r;
import ni.r0;
import ni.s0;
import ni.t;
import ni.t0;
import ni.u0;
import ni.v;
import ni.v0;
import ni.w;
import ni.w0;
import ni.x;
import ni.y0;
import ni.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends xj.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f395a;

    public /* synthetic */ f(int i10) {
        this.f395a = i10;
    }

    public static JSONObject O(i1 i1Var) throws JSONException {
        l.e(i1Var, "input");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("APP_VRS_CODE", i1Var.f17929g);
        jSONObject.put("DC_VRS_CODE", i1Var.f17930h);
        jSONObject.put("DB_VRS_CODE", i1Var.f17931i);
        jSONObject.put("ANDROID_VRS", i1Var.j);
        jSONObject.put("ANDROID_SDK", i1Var.k);
        xu.d.Y(jSONObject, "ANDROID_SDK_FULL", i1Var.f17932l);
        jSONObject.put("CLIENT_VRS_CODE", i1Var.f17933m);
        jSONObject.put("COHORT_ID", i1Var.f17934n);
        jSONObject.put("REPORT_CONFIG_REVISION", i1Var.f17935o);
        jSONObject.put("REPORT_CONFIG_ID", i1Var.f17936p);
        jSONObject.put("CONFIG_HASH", i1Var.f17937q);
        xu.d.Y(jSONObject, "CONNECTION_ID", i1Var.f17938r);
        xu.d.Y(jSONObject, "CONNECTION_START_TIME", i1Var.f17939s);
        xu.d.Y(jSONObject, "wifi_bssid", i1Var.f17940t);
        xu.d.Y(jSONObject, "wifi_ssid", i1Var.f17941u);
        xu.d.Y(jSONObject, "wifi_rssi", Integer.valueOf(i1Var.f17942v));
        xu.d.Y(jSONObject, "wifi_frequency", Integer.valueOf(i1Var.f17943w));
        xu.d.Y(jSONObject, "wifi_capabilities", i1Var.f17944x);
        xu.d.Y(jSONObject, "wifi_channel_width", i1Var.f17945y);
        xu.d.Y(jSONObject, "wifi_standard", i1Var.f17946z);
        xu.d.Y(jSONObject, "wifi_information_elements", i1Var.A);
        c0 c0Var = i1Var.B;
        xu.d.Y(jSONObject, "wifi_scan_location", c0Var != null ? c0Var.a() : null);
        return jSONObject;
    }

    public static e d(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("assistant_results");
        String string = jSONObject.getString("assistant_entity_id");
        long j = jSONObject.getLong("assistant_duration_in_millis");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            l.b(jSONObject2);
            bh.a aVarP = i4.p(jSONObject2);
            if (aVarP != null) {
                arrayList.add(aVarP);
            }
        }
        long j7 = aVarB.f25376a;
        long j10 = aVarB.f25377b;
        String str = aVarB.f25378c;
        String str2 = aVarB.f25379d;
        String str3 = aVarB.f25380e;
        long j11 = aVarB.f25381f;
        l.b(string);
        return new e(j7, j10, str, str2, str3, j11, arrayList, j, string);
    }

    public static h e(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        long j = jSONObject.getLong("APP_VRS_CODE");
        String string = jSONObject.getString("DC_VRS_CODE");
        int i10 = jSONObject.getInt("DB_VRS_CODE");
        String string2 = jSONObject.getString("ANDROID_VRS");
        int i11 = jSONObject.getInt("ANDROID_SDK");
        Integer numY = xu.d.y("ANDROID_SDK_FULL", jSONObject);
        long j7 = jSONObject.getLong("CLIENT_VRS_CODE");
        String string3 = jSONObject.getString("COHORT_ID");
        int i12 = jSONObject.getInt("REPORT_CONFIG_REVISION");
        int i13 = jSONObject.getInt("REPORT_CONFIG_ID");
        String string4 = jSONObject.getString("CONFIG_HASH");
        boolean z10 = jSONObject.getBoolean("NETWORK_ROAMING");
        boolean z11 = jSONObject.getBoolean("HAS_READ_PHONE_STATE");
        boolean z12 = jSONObject.getBoolean("HAS_READ_BASIC_PHONE_STATE");
        boolean z13 = jSONObject.getBoolean("HAS_COARSE_LOCATION");
        boolean z14 = jSONObject.getBoolean("HAS_FINE_LOCATION");
        boolean z15 = jSONObject.getBoolean("HAS_ACCESS_BACKGROUND_LOCATION");
        boolean z16 = jSONObject.getBoolean("HAS_ACCESS_WIFI_STATE");
        boolean z17 = jSONObject.getBoolean("HAS_ACCESS_NETWORK_STATE");
        boolean z18 = jSONObject.getBoolean("HAS_RECEIVE_BOOT_COMPLETED");
        boolean z19 = jSONObject.getBoolean("HAS_IGNORE_BATTERY_OPTIMIZATIONS");
        String strK = xu.d.K("EXOPLAYER_VERSION", jSONObject);
        Boolean boolR = xu.d.r("EXOPLAYER_DASH_AVAILABLE", jSONObject);
        String strK2 = xu.d.K("EXOPLAYER_DASH_INFERRED_VERSION", jSONObject);
        Boolean boolR2 = xu.d.r("EXOPLAYER_HLS_AVAILABLE", jSONObject);
        String strK3 = xu.d.K("EXOPLAYER_HLS_INFERRED_VERSION", jSONObject);
        String strOptString = jSONObject.optString("KOTLIN_VERSION");
        int iOptInt = jSONObject.optInt("ANDROID_MIN_SDK");
        int iOptInt2 = jSONObject.optInt("APP_STANDBY_BUCKET");
        String strK4 = xu.d.K("SDK_DATA_USAGE_INFO", jSONObject);
        String strK5 = xu.d.K("CONNECTION_ID", jSONObject);
        s sVar = strK5 != null ? new s(strK5, null, null, Long.valueOf(jSONObject.optLong("CONNECTION_START_TIME")), null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 524278) : null;
        String strK6 = xu.d.K("ACCESS_POINT_NAME", jSONObject);
        Integer numY2 = xu.d.y("SIM_CARRIER_ID", jSONObject);
        String strK7 = xu.d.K("MEDIA3_VERSION", jSONObject);
        Boolean boolR3 = xu.d.r("MEDIA3_DASH_AVAILABLE", jSONObject);
        Boolean boolR4 = xu.d.r("MEDIA3_HLS_AVAILABLE", jSONObject);
        String strK8 = xu.d.K("LAST_PUBLIC_IPS", jSONObject);
        long j10 = aVarB.f25376a;
        long j11 = aVarB.f25377b;
        String str = aVarB.f25378c;
        String str2 = aVarB.f25379d;
        String str3 = aVarB.f25380e;
        long j12 = aVarB.f25381f;
        l.b(string);
        l.b(string2);
        l.b(string3);
        l.b(string4);
        l.b(strOptString);
        return new h(j10, j11, str, str2, str3, j12, j, string, i10, string2, i11, numY, j7, string3, i12, i13, string4, z10, z11, z12, z14, z13, z15, z16, z17, z18, z19, strK, boolR, strK2, boolR2, strK3, strOptString, Integer.valueOf(iOptInt), Integer.valueOf(iOptInt2), strK4, sVar, strK6, numY2, strK7, boolR3, boolR4, strK8);
    }

    public static n f(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        long j = jSONObject.getLong("download_time_response");
        long j7 = jSONObject.getLong("download_speed");
        long j10 = jSONObject.getLong("trimmed_download_speed");
        long j11 = jSONObject.getLong("download_file_size");
        Long lC = xu.d.C("download_last_time", jSONObject);
        String strK = xu.d.K("download_file_sizes", jSONObject);
        String strK2 = xu.d.K("download_times", jSONObject);
        String string = jSONObject.getString("download_cdn_name");
        String string2 = jSONObject.getString("download_ip");
        String string3 = jSONObject.getString("download_host");
        int i10 = jSONObject.getInt("download_thread_count");
        int i11 = jSONObject.getInt("download_unreliability");
        String strK3 = xu.d.K("download_events", jSONObject);
        long j12 = jSONObject.getLong("download_test_duration");
        long j13 = aVarB.f25376a;
        long j14 = aVarB.f25377b;
        String str = aVarB.f25378c;
        String str2 = aVarB.f25379d;
        String str3 = aVarB.f25380e;
        long j15 = aVarB.f25381f;
        l.b(string);
        l.b(string2);
        l.b(string3);
        return new n(j13, j14, str, str2, str3, j15, j, j7, j10, j11, lC, strK, strK2, string, string2, string3, i10, i11, strK3, j12);
    }

    public static v h(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        Integer numY = xu.d.y("ICMP_TEST_COUNT", jSONObject);
        Integer numY2 = xu.d.y("ICMP_TEST_SIZE_BYTES", jSONObject);
        Integer numY3 = xu.d.y("ICMP_TEST_PERIOD_MS", jSONObject);
        String strK = xu.d.K("ICMP_TEST_ARGUMENTS", jSONObject);
        Integer numY4 = xu.d.y("ICMP_TEST_STATUS", jSONObject);
        String strK2 = xu.d.K("ICMP_TEST_SERVER", jSONObject);
        Double dT = xu.d.t("ICMP_TEST_LATENCY_MIN", jSONObject);
        return new v(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25381f, aVarB.f25380e, aVarB.f25379d, numY, numY2, numY3, strK, numY4, strK2, xu.d.t("ICMP_TEST_LATENCY_MAX", jSONObject), dT, xu.d.t("ICMP_TEST_LATENCY_AVERAGE", jSONObject), xu.d.y("ICMP_TEST_PACKET_SENT", jSONObject), xu.d.y("ICMP_TEST_PACKET_LOST", jSONObject), xu.d.t("ICMP_TEST_PACKET_LOST_PERCENTAGE", jSONObject), xu.d.y("ICMP_TEST_BYTES_SENT", jSONObject), xu.d.y("ICMP_TRACEROUTE_STATUS", jSONObject), xu.d.K("ICMP_TRACEROUTE_NODE_INFO", jSONObject), xu.d.y("ICMP_TRACEROUTE_TTL", jSONObject), xu.d.K("KEY_ICMP_TEST_EVENTS", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_PACKET_DELAY", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_PACKET_COUNT", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_MAX_HOP_COUNT", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_MAX_NODE_TIMEOUT", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_IP_MASK_COUNT", jSONObject));
    }

    public static w i(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        Integer numY = xu.d.y("ICMP_TEST_COUNT", jSONObject);
        Integer numY2 = xu.d.y("ICMP_TEST_SIZE_BYTES", jSONObject);
        Integer numY3 = xu.d.y("ICMP_TEST_PERIOD_MS", jSONObject);
        String string = jSONObject.getString("ICMP_TEST_ARGUMENTS");
        Integer numY4 = xu.d.y("ICMP_TEST_STATUS", jSONObject);
        String strK = xu.d.K("ICMP_TEST_SERVER", jSONObject);
        Double dT = xu.d.t("ICMP_TEST_LATENCY_MIN", jSONObject);
        return new w(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25381f, aVarB.f25380e, aVarB.f25379d, numY, numY2, numY3, string, numY4, strK, xu.d.t("ICMP_TEST_LATENCY_MAX", jSONObject), dT, xu.d.t("ICMP_TEST_LATENCY_AVERAGE", jSONObject), xu.d.y("ICMP_TEST_PACKET_SENT", jSONObject), xu.d.y("ICMP_TEST_PACKET_LOST", jSONObject), xu.d.t("ICMP_TEST_PACKET_LOST_PERCENTAGE", jSONObject), xu.d.y("ICMP_TEST_BYTES_SENT", jSONObject), xu.d.K("ICMP_TEST_EVENTS", jSONObject));
    }

    public static x j(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        return new x(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25381f, aVarB.f25380e, aVarB.f25379d, xu.d.y("ICMP_TRACEROUTE_STATUS", jSONObject), xu.d.K("ICMP_TRACEROUTE_NODE_INFO", jSONObject), xu.d.y("ICMP_TRACEROUTE_TTL", jSONObject), xu.d.K("ICMP_TRACEROUTE_TEST_EVENTS", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_PACKET_DELAY", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_PACKET_COUNT", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_MAX_HOP_COUNT", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_MAX_NODE_TIMEOUT", jSONObject), xu.d.y("ICMP_TRACEROUTE_CONFIG_IP_MASK_COUNT", jSONObject));
    }

    public static g0 k(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        String strK = xu.d.K("PUBLIC_IP", jSONObject);
        return new g0(aVarB.f25376a, aVarB.f25377b, aVarB.f25381f, aVarB.f25378c, aVarB.f25379d, aVarB.f25380e, strK);
    }

    public static h0 l(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        String string = jSONObject.getString("JOB_RESULT_TRIGGER_TYPE");
        long j = aVarB.f25376a;
        long j7 = aVarB.f25377b;
        String str = aVarB.f25378c;
        String str2 = aVarB.f25379d;
        String str3 = aVarB.f25380e;
        long j10 = aVarB.f25381f;
        l.b(string);
        return new h0(j, j7, j10, str, str2, str3, string);
    }

    public static o0 m(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        String strOptString = jSONObject.optString("task_result_events");
        return new o0(aVarB.f25376a, aVarB.f25377b, aVarB.f25381f, aVarB.f25378c, aVarB.f25380e, aVarB.f25379d, strOptString);
    }

    public static s0 n(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        double d6 = jSONObject.getDouble("THROUGHPUT_DOWNLOAD_SPEED");
        double d10 = jSONObject.getDouble("THROUGHPUT_DOWNLOAD_SPEED_TEST_BYTES_ONLY");
        String strK = xu.d.K("THROUGHPUT_DOWNLOAD_TEST_SERVER", jSONObject);
        String strK2 = xu.d.K("THROUGHPUT_DOWNLOAD_AWS_DIAGNOSTIC", jSONObject);
        int i10 = jSONObject.getInt("THROUGHPUT_DOWNLOAD_DNS_LOOKUP_TIME");
        int i11 = jSONObject.getInt("THROUGHPUT_DOWNLOAD_TTFA");
        int i12 = jSONObject.getInt("THROUGHPUT_DOWNLOAD_TTFB");
        return new s0(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25381f, aVarB.f25380e, aVarB.f25379d, d6, d10, strK, strK2, jSONObject.getLong("THROUGHPUT_DOWNLOAD_TEST_SIZE"), jSONObject.getInt("THROUGHPUT_DOWNLOAD_TEST_STATUS"), i10, i11, i12, xu.d.K("THROUGHPUT_DOWNLOAD_AWS_EDGE_LOCATION", jSONObject), xu.d.K("THROUGHPUT_DOWNLOAD_AWS_X_CACHE", jSONObject), xu.d.K("THROUGHPUT_DOWNLOAD_TIMES", jSONObject), xu.d.K("THROUGHPUT_DOWNLOAD_CUMULATIVE_BYTES", jSONObject), xu.d.K("THROUGHPUT_DOWNLOAD_EVENTS", jSONObject));
    }

    public static t0 o(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        return new t0(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25381f, aVarB.f25380e, aVarB.f25379d, jSONObject.getDouble("throughput_server_response_min_latency"), jSONObject.getDouble("throughput_server_response_max_latency"), jSONObject.getDouble("throughput_server_response_avg_latency"), jSONObject.getDouble("throughput_server_response_min_jitter"), jSONObject.getDouble("throughput_server_response_max_jitter"), jSONObject.getDouble("throughput_server_response_avg_jitter"), jSONObject.getInt("throughput_server_response_packets_sent"), jSONObject.getInt("throughput_server_response_packets_discarded"), jSONObject.getDouble("throughput_server_response_packets_discard_percentage"), jSONObject.getInt("throughput_server_response_packets_lost"), jSONObject.getDouble("throughput_server_response_packets_lost_percentage"), xu.d.K("throughput_server_response_test_server", jSONObject), jSONObject.getInt("throughput_server_response_config_number_of_packets"), jSONObject.getInt("throughput_server_response_config_packet_size"), jSONObject.getInt("throughput_server_response_config_packet_delay"), jSONObject.getInt("throughput_server_response_test_status"), jSONObject.getInt("throughput_server_response_dns_lookup_time"), xu.d.K("throughput_server_response_sent_times", jSONObject), xu.d.K("throughput_server_response_received_times", jSONObject), xu.d.K("throughput_server_response_received_packets", jSONObject), xu.d.K("throughput_server_response_events", jSONObject), xu.d.y("throughput_server_response_version", jSONObject), xu.d.K("throughput_server_response_verification_statuses", jSONObject));
    }

    public static u0 p(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        double d6 = jSONObject.getDouble("THROUGHPUT_UPLOAD_SPEED");
        double d10 = jSONObject.getDouble("THROUGHPUT_UPLOAD_SPEED_TEST_BYTES_ONLY");
        String strK = xu.d.K("THROUGHPUT_UPLOAD_TEST_SERVER", jSONObject);
        long j = jSONObject.getLong("THROUGHPUT_UPLOAD_TEST_SERVER_TIMESTAMP");
        int i10 = jSONObject.getInt("THROUGHPUT_UPLOAD_DNS_LOOKUP_TIME");
        int i11 = jSONObject.getInt("THROUGHPUT_UPLOAD_TTFA");
        return new u0(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25381f, aVarB.f25380e, aVarB.f25379d, d6, d10, strK, j, jSONObject.getLong("THROUGHPUT_UPLOAD_TEST_SIZE"), jSONObject.getInt("THROUGHPUT_UPLOAD_TEST_STATUS"), i10, i11, xu.d.K("THROUGHPUT_UPLOAD_AWS_DIAGNOSTICS", jSONObject), xu.d.K("THROUGHPUT_UPLOAD_AWS_EDGE_LOCATION", jSONObject), xu.d.K("THROUGHPUT_UPLOAD_TIMES", jSONObject), xu.d.K("THROUGHPUT_UPLOAD_CUMULATIVE_BYTES", jSONObject), xu.d.K("THROUGHPUT_UPLOAD_EVENTS", jSONObject));
    }

    public static v0 q(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        String strOptString = jSONObject.optString("JOB_RESULT_TRACEROUTE_HOP");
        String strOptString2 = jSONObject.optString("JOB_RESULT_TRACEROUTE_ENDPOINT");
        String strOptString3 = jSONObject.optString("JOB_RESULT_TRACEROUTE_IP");
        long j = aVarB.f25376a;
        long j7 = aVarB.f25377b;
        String str = aVarB.f25378c;
        String str2 = aVarB.f25380e;
        long j10 = aVarB.f25381f;
        String str3 = aVarB.f25379d;
        l.b(strOptString);
        return new v0(j, j7, str, str3, str2, j10, strOptString, strOptString2, strOptString3);
    }

    public static y0 r(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        boolean z10 = jSONObject.getBoolean("JOB_RESULT_KEY_IS_SENDING_RESULT");
        int i10 = jSONObject.getInt("JOB_RESULT_PAYLOAD_LENGTH");
        int i11 = jSONObject.getInt("JOB_RESULT_ECHO_FACTOR");
        int i12 = jSONObject.getInt("JOB_RESULT_SEQUENCE_NUMBER");
        int i13 = jSONObject.getInt("JOB_RESULT_ECHO_SEQUENCE_NUMBER");
        long j = jSONObject.getLong("JOB_RESULT_ELAPSED_SEND_TIME");
        long j7 = jSONObject.getLong("JOB_RESULT_ELAPSED_RECEIVED_TIME");
        long j10 = jSONObject.getLong("JOB_RESULT_SEND_TIME");
        String string = jSONObject.getString("JOB_RESULT_TEST_ID");
        l.d(string, "getString(...)");
        byte[] bytes = string.getBytes(tt.a.f22975a);
        l.d(bytes, "getBytes(...)");
        String string2 = jSONObject.getString("JOB_RESULT_URL");
        String string3 = jSONObject.getString("JOB_RESULT_TEST_NAME");
        long j11 = aVarB.f25376a;
        long j12 = aVarB.f25377b;
        String str = aVarB.f25378c;
        String str2 = aVarB.f25379d;
        String str3 = aVarB.f25380e;
        long j13 = aVarB.f25381f;
        l.b(string2);
        l.b(string3);
        return new y0(j11, j12, str, str2, str3, j13, z10, i10, i11, i12, i13, j, j10, j7, bytes, string2, string3);
    }

    public static a1 s(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        boolean z10 = jSONObject.getBoolean("JOB_RESULT_KEY_IS_SENDING_RESULT");
        int i10 = jSONObject.getInt("JOB_RESULT_PAYLOAD_LENGTH");
        int i11 = jSONObject.getInt("JOB_RESULT_ECHO_FACTOR");
        int i12 = jSONObject.getInt("JOB_RESULT_SEQUENCE_NUMBER");
        int i13 = jSONObject.getInt("JOB_RESULT_ECHO_SEQUENCE_NUMBER");
        long j = jSONObject.getLong("JOB_RESULT_ELAPSED_SEND_TIME");
        long j7 = jSONObject.getLong("JOB_RESULT_ELAPSED_RECEIVED_TIME");
        long j10 = jSONObject.getLong("JOB_RESULT_SEND_TIME");
        String string = jSONObject.getString("JOB_RESULT_TEST_ID");
        l.d(string, "getString(...)");
        byte[] bytes = string.getBytes(tt.a.f22975a);
        l.d(bytes, "getBytes(...)");
        String string2 = jSONObject.getString("JOB_RESULT_URL");
        String string3 = jSONObject.getString("JOB_RESULT_TEST_NAME");
        long j11 = aVarB.f25376a;
        long j12 = aVarB.f25377b;
        String str = aVarB.f25378c;
        String str2 = aVarB.f25379d;
        String str3 = aVarB.f25380e;
        long j13 = aVarB.f25381f;
        l.b(string2);
        l.b(string3);
        return new a1(j11, j12, str, str2, str3, j13, z10, i10, i11, i12, i13, j, j10, j7, bytes, string2, string3);
    }

    public static c1 t(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        long j = jSONObject.getLong("upload_time_response");
        long j7 = jSONObject.getLong("upload_speed");
        long j10 = jSONObject.getLong("trimmed_upload_speed");
        long j11 = jSONObject.getLong("upload_file_size");
        Long lC = xu.d.C("upload_last_time", jSONObject);
        String strK = xu.d.K("upload_file_sizes", jSONObject);
        String strK2 = xu.d.K("upload_times", jSONObject);
        String string = jSONObject.getString("upload_cdn_name");
        String string2 = jSONObject.getString("upload_ip");
        String string3 = jSONObject.getString("upload_host");
        int i10 = jSONObject.getInt("upload_thread_count");
        int i11 = jSONObject.getInt("upload_unreliability");
        String strK3 = xu.d.K("upload_events", jSONObject);
        int i12 = jSONObject.getInt("upload_monitor_type");
        long j12 = jSONObject.getLong("upload_speed_buffer");
        long j13 = jSONObject.getLong("upload_trimmed_speed_buffer");
        long j14 = jSONObject.getLong("upload_test_duration");
        String strK4 = xu.d.K("upload_buffer_file_sizes", jSONObject);
        String strK5 = xu.d.K("upload_buffer_times", jSONObject);
        long j15 = aVarB.f25376a;
        long j16 = aVarB.f25377b;
        String str = aVarB.f25378c;
        String str2 = aVarB.f25379d;
        String str3 = aVarB.f25380e;
        long j17 = aVarB.f25381f;
        l.b(string2);
        l.b(string3);
        l.b(string);
        return new c1(j15, j16, str, str2, str3, j17, j, j7, j10, j11, lC, strK, strK2, string2, string3, i10, string, i11, strK3, i12, j12, j13, j14, strK4, strK5);
    }

    public static f1 u(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        String str = aVarB.f25380e;
        String str2 = aVarB.f25379d;
        String str3 = aVarB.f25378c;
        if (jSONObject.getBoolean("is_progress_result")) {
            return new e1(aVarB.f25376a, aVarB.f25377b, str3, str2, str, aVarB.f25381f, jSONObject.getLong("video_current_position"), jSONObject.getLong("KEY_RESOURCE_DURATION"));
        }
        long j = aVarB.f25376a;
        long j7 = aVarB.f25377b;
        long j10 = aVarB.f25381f;
        long j11 = jSONObject.getLong("KEY_INITIALISATION_TIME");
        long j12 = jSONObject.getLong("KEY_TIME_TO_FIRST_FRAME");
        long j13 = jSONObject.getLong("KEY_BUFFERING_TIME");
        long j14 = jSONObject.getLong("KEY_BUFFERING_COUNTER");
        long j15 = jSONObject.getLong("KEY_SEEKING_TIME");
        long j16 = jSONObject.getLong("KEY_SEEKING_COUNTER");
        String string = jSONObject.getString("KEY_EVENTS");
        String string2 = jSONObject.getString("KEY_TRAFFIC");
        String string3 = jSONObject.getString("KEY_PLATFORM_TESTED");
        String string4 = jSONObject.getString("KEY_INTERFACE_USED");
        String string5 = jSONObject.getString("KEY_RESOURCE_USED");
        long j17 = jSONObject.getLong("KEY_RESOURCE_DURATION");
        boolean z10 = jSONObject.getBoolean("KEY_NETWORK_CHANGED");
        String string6 = jSONObject.getString("KEY_REQUESTED_QUALITY");
        boolean z11 = jSONObject.getBoolean("KEY_QUALITY_CHANGED");
        String string7 = jSONObject.getString("KEY_HOST");
        String string8 = jSONObject.getString("KEY_IP");
        long j18 = jSONObject.getLong("KEY_TEST_DURATION");
        long j19 = jSONObject.getLong("KEY_BITRATE");
        String string9 = jSONObject.getString("KEY_MIME");
        int i10 = jSONObject.getInt("KEY_VIDEO_WIDTH");
        int i11 = jSONObject.getInt("KEY_VIDEO_HEIGHT");
        String string10 = jSONObject.getString("KEY_CODEC");
        int i12 = jSONObject.getInt("KEY_PROFILE");
        int i13 = jSONObject.getInt("KEY_LEVEL");
        double d6 = jSONObject.getDouble("KEY_INITIAL_BUFFER_TIME");
        double d10 = jSONObject.getDouble("KEY_STALLING_RATIO");
        double d11 = jSONObject.getDouble("KEY_VIDEO_PLAY_DURATION");
        int i14 = jSONObject.getInt("KEY_VIDEO_RESOLUTION");
        int i15 = jSONObject.getInt("KEY_VIDEO_CODE");
        int i16 = jSONObject.getInt("KEY_VIDEO_CODE_PROFILE");
        String string11 = jSONObject.getString("KEY_BUFFERING_UPDATES");
        int i17 = jSONObject.getInt("KEY_TIMEOUT_REASON");
        long j20 = jSONObject.getLong("KEY_REQUESTED_VIDEO_LENGTH");
        String string12 = jSONObject.getString("KEY_SCREEN_INFO");
        String strOptString = jSONObject.optString("EXOPLAYER_VERSION");
        boolean zOptBoolean = jSONObject.optBoolean("EXOPLAYER_DASH_AVAILABLE");
        String strOptString2 = jSONObject.optString("EXOPLAYER_DASH_INFERRED_VERSION");
        boolean zOptBoolean2 = jSONObject.optBoolean("EXOPLAYER_HLS_AVAILABLE");
        String strOptString3 = jSONObject.optString("EXOPLAYER_HLS_INFERRED_VERSION");
        boolean zOptBoolean3 = jSONObject.optBoolean("KEY_IGNORE_SCREEN_RESOLUTION");
        String strK = xu.d.K("MEDIA3_VERSION", jSONObject);
        Boolean boolR = xu.d.r("MEDIA3_DASH_AVAILABLE", jSONObject);
        Boolean boolR2 = xu.d.r("MEDIA3_HLS_AVAILABLE", jSONObject);
        l.b(string);
        l.b(string2);
        l.b(string3);
        l.b(string4);
        l.b(string5);
        l.b(string6);
        l.b(string7);
        l.b(string8);
        l.b(string9);
        l.b(string10);
        l.b(string11);
        l.b(string12);
        return new d1(j, j7, str3, str2, str, j10, j11, j12, j13, j14, j15, j16, string, string2, string3, string4, string5, j17, z10, string6, z11, string7, string8, j18, j19, string9, i10, i11, string10, i12, i13, d6, d10, d11, i14, i15, i16, string11, i17, j20, string12, strOptString, Boolean.valueOf(zOptBoolean), strOptString2, Boolean.valueOf(zOptBoolean2), strOptString3, Boolean.valueOf(zOptBoolean3), strK, boolR2, boolR);
    }

    public static g1 v(JSONObject jSONObject) {
        l.e(jSONObject, "input");
        xj.a aVarB = xj.b.b(jSONObject);
        String strK = xu.d.K("wifi_information_elements", jSONObject);
        return new g1(aVarB.f25376a, aVarB.f25377b, aVarB.f25381f, aVarB.f25378c, aVarB.f25380e, aVarB.f25379d, strK);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object w(java.lang.Object r77) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 2634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.f.w(java.lang.Object):java.lang.Object");
    }

    public JSONObject A(n nVar) throws JSONException {
        l.e(nVar, "input");
        JSONObject jSONObjectA = super.a(nVar);
        jSONObjectA.put("download_speed", nVar.f18046h);
        jSONObjectA.put("trimmed_download_speed", nVar.f18047i);
        jSONObjectA.put("download_file_size", nVar.j);
        jSONObjectA.put("download_last_time", nVar.k);
        jSONObjectA.put("download_file_sizes", nVar.f18048l);
        jSONObjectA.put("download_times", nVar.f18049m);
        jSONObjectA.put("download_cdn_name", nVar.f18050n);
        jSONObjectA.put("download_ip", nVar.f18051o);
        jSONObjectA.put("download_host", nVar.f18052p);
        jSONObjectA.put("download_thread_count", nVar.f18053q);
        jSONObjectA.put("download_unreliability", nVar.f18054r);
        jSONObjectA.put("download_events", nVar.f18055s);
        jSONObjectA.put("download_time_response", nVar.f18045g);
        jSONObjectA.put("download_test_duration", nVar.f18056t);
        return jSONObjectA;
    }

    public JSONObject B(q qVar) throws JSONException {
        l.e(qVar, "input");
        JSONObject jSONObjectA = super.a(qVar);
        xu.d.Y(jSONObjectA, "END_EXPERIMENTAL", qVar.f18111h);
        xu.d.Y(jSONObjectA, "END_CAPABILITIES", qVar.f18110g);
        xu.d.Y(jSONObjectA, "END_IS_CONNECTED", qVar.f18112i);
        xu.d.Y(jSONObjectA, "END_NETWORK_STATE", qVar.j);
        xu.d.Y(jSONObjectA, "END_NETWORK_DETAILED_STATE", qVar.k);
        return jSONObjectA;
    }

    public JSONObject C(t tVar) throws JSONException {
        l.e(tVar, "input");
        JSONObject jSONObjectA = super.a(tVar);
        ch.n.b("FlushConnectionInfoJobResultItemMapper", "mapTo() called with input : " + tVar);
        jSONObjectA.put("APP_VRS_CODE", tVar.f18152g);
        jSONObjectA.put("DC_VRS_CODE", tVar.f18153h);
        jSONObjectA.put("DB_VRS_CODE", tVar.f18154i);
        jSONObjectA.put("ANDROID_VRS", tVar.j);
        jSONObjectA.put("ANDROID_SDK", tVar.k);
        xu.d.Y(jSONObjectA, "ANDROID_SDK_FULL", tVar.D);
        jSONObjectA.put("CLIENT_VRS_CODE", tVar.f18155l);
        jSONObjectA.put("COHORT_ID", tVar.f18156m);
        jSONObjectA.put("REPORT_CONFIG_REVISION", tVar.f18157n);
        jSONObjectA.put("REPORT_CONFIG_ID", tVar.f18158o);
        jSONObjectA.put("CONFIG_HASH", tVar.f18159p);
        jSONObjectA.put("CONNECTION_ID", tVar.f18160q);
        jSONObjectA.put("DEVICE_CONNECTION_IS_ROAMING", tVar.f18167x);
        xu.d.Y(jSONObjectA, "CONNECTION_START_TIME", tVar.f18163t);
        xu.d.Y(jSONObjectA, "CONNECTION_END_TIME", tVar.f18164u);
        xu.d.Y(jSONObjectA, "DEVICE_CONNECTION_TYPE", tVar.f18161r);
        xu.d.Y(jSONObjectA, "DEVICE_CONNECTION_MOBILE_SUBTYPE", tVar.f18162s);
        xu.d.Y(jSONObjectA, "DEVICE_CONNECTION_WIFI_BSSID", tVar.f18166w);
        ak.f fVar = tVar.f18165v;
        xu.d.Y(jSONObjectA, "DEVICE_CONNECTION_CELL_TOWER", fVar != null ? fVar.a() : null);
        xu.d.Y(jSONObjectA, "JOB_RESULT_DEVICE_CONNECTION_NETWORK_ID_SIM", tVar.f18169z);
        xu.d.Y(jSONObjectA, "JOB_RESULT_DEVICE_CONNECTION_NETWORK_NAME_SIM", tVar.A);
        xu.d.Y(jSONObjectA, "JOB_RESULT_DEVICE_CONNECTION_NR_STATE", tVar.B);
        xu.d.Y(jSONObjectA, "JOB_RESULT_DEVICE_CONNECTION_LAST_TASK_TIME", tVar.C);
        return jSONObjectA;
    }

    public JSONObject D(v vVar) throws JSONException {
        l.e(vVar, "input");
        JSONObject jSONObjectA = super.a(vVar);
        xu.d.Y(jSONObjectA, "ICMP_TEST_COUNT", vVar.f18224g);
        xu.d.Y(jSONObjectA, "ICMP_TEST_SIZE_BYTES", vVar.f18225h);
        xu.d.Y(jSONObjectA, "ICMP_TEST_PERIOD_MS", vVar.f18226i);
        xu.d.Y(jSONObjectA, "ICMP_TEST_ARGUMENTS", vVar.j);
        xu.d.Y(jSONObjectA, "ICMP_TEST_STATUS", vVar.k);
        xu.d.Y(jSONObjectA, "ICMP_TEST_SERVER", vVar.f18227l);
        xu.d.Y(jSONObjectA, "ICMP_TEST_LATENCY_MAX", vVar.f18228m);
        xu.d.Y(jSONObjectA, "ICMP_TEST_LATENCY_MIN", vVar.f18229n);
        xu.d.Y(jSONObjectA, "ICMP_TEST_LATENCY_AVERAGE", vVar.f18230o);
        xu.d.Y(jSONObjectA, "ICMP_TEST_PACKET_SENT", vVar.f18231p);
        xu.d.Y(jSONObjectA, "ICMP_TEST_PACKET_LOST", vVar.f18232q);
        xu.d.Y(jSONObjectA, "ICMP_TEST_PACKET_LOST_PERCENTAGE", vVar.f18233r);
        xu.d.Y(jSONObjectA, "ICMP_TEST_BYTES_SENT", vVar.f18234s);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_STATUS", vVar.f18235t);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_NODE_INFO", vVar.f18236u);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_TTL", vVar.f18237v);
        xu.d.Y(jSONObjectA, "KEY_ICMP_TEST_EVENTS", vVar.f18238w);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_PACKET_DELAY", vVar.f18239x);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_PACKET_COUNT", vVar.f18240y);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_MAX_HOP_COUNT", vVar.f18241z);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_MAX_NODE_TIMEOUT", vVar.A);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_IP_MASK_COUNT", vVar.B);
        return jSONObjectA;
    }

    public JSONObject E(w wVar) throws JSONException {
        l.e(wVar, "input");
        JSONObject jSONObjectA = super.a(wVar);
        xu.d.Y(jSONObjectA, "ICMP_TEST_COUNT", wVar.f18257g);
        xu.d.Y(jSONObjectA, "ICMP_TEST_SIZE_BYTES", wVar.f18258h);
        xu.d.Y(jSONObjectA, "ICMP_TEST_PERIOD_MS", wVar.f18259i);
        xu.d.Y(jSONObjectA, "ICMP_TEST_ARGUMENTS", wVar.j);
        xu.d.Y(jSONObjectA, "ICMP_TEST_STATUS", wVar.k);
        xu.d.Y(jSONObjectA, "ICMP_TEST_SERVER", wVar.f18260l);
        xu.d.Y(jSONObjectA, "ICMP_TEST_LATENCY_MAX", wVar.f18261m);
        xu.d.Y(jSONObjectA, "ICMP_TEST_LATENCY_MIN", wVar.f18262n);
        xu.d.Y(jSONObjectA, "ICMP_TEST_LATENCY_AVERAGE", wVar.f18263o);
        xu.d.Y(jSONObjectA, "ICMP_TEST_PACKET_SENT", wVar.f18264p);
        xu.d.Y(jSONObjectA, "ICMP_TEST_PACKET_LOST", wVar.f18265q);
        xu.d.Y(jSONObjectA, "ICMP_TEST_PACKET_LOST_PERCENTAGE", wVar.f18266r);
        xu.d.Y(jSONObjectA, "ICMP_TEST_BYTES_SENT", wVar.f18267s);
        xu.d.Y(jSONObjectA, "ICMP_TEST_EVENTS", wVar.f18268t);
        return jSONObjectA;
    }

    public JSONObject F(x xVar) throws JSONException {
        l.e(xVar, "input");
        JSONObject jSONObjectA = super.a(xVar);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_STATUS", xVar.f18284g);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_NODE_INFO", xVar.f18285h);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_TTL", xVar.f18286i);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_TEST_EVENTS", xVar.j);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_PACKET_DELAY", xVar.k);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_PACKET_COUNT", xVar.f18287l);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_MAX_HOP_COUNT", xVar.f18288m);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_MAX_NODE_TIMEOUT", xVar.f18289n);
        xu.d.Y(jSONObjectA, "ICMP_TRACEROUTE_CONFIG_IP_MASK_COUNT", xVar.f18290o);
        return jSONObjectA;
    }

    public JSONObject G(s0 s0Var) throws JSONException {
        l.e(s0Var, "input");
        JSONObject jSONObjectA = super.a(s0Var);
        jSONObjectA.put("THROUGHPUT_DOWNLOAD_SPEED", s0Var.f18134g);
        jSONObjectA.put("THROUGHPUT_DOWNLOAD_SPEED_TEST_BYTES_ONLY", s0Var.f18135h);
        xu.d.Y(jSONObjectA, "THROUGHPUT_DOWNLOAD_TEST_SERVER", s0Var.f18136i);
        xu.d.Y(jSONObjectA, "THROUGHPUT_DOWNLOAD_AWS_DIAGNOSTIC", s0Var.j);
        jSONObjectA.put("THROUGHPUT_DOWNLOAD_TEST_SIZE", s0Var.k);
        jSONObjectA.put("THROUGHPUT_DOWNLOAD_TEST_STATUS", s0Var.f18137l);
        jSONObjectA.put("THROUGHPUT_DOWNLOAD_DNS_LOOKUP_TIME", s0Var.f18138m);
        jSONObjectA.put("THROUGHPUT_DOWNLOAD_TTFA", s0Var.f18139n);
        jSONObjectA.put("THROUGHPUT_DOWNLOAD_TTFB", s0Var.f18140o);
        xu.d.Y(jSONObjectA, "THROUGHPUT_DOWNLOAD_AWS_EDGE_LOCATION", s0Var.f18141p);
        xu.d.Y(jSONObjectA, "THROUGHPUT_DOWNLOAD_AWS_X_CACHE", s0Var.f18142q);
        xu.d.Y(jSONObjectA, "THROUGHPUT_DOWNLOAD_TIMES", s0Var.f18143r);
        xu.d.Y(jSONObjectA, "THROUGHPUT_DOWNLOAD_CUMULATIVE_BYTES", s0Var.f18144s);
        xu.d.Y(jSONObjectA, "THROUGHPUT_DOWNLOAD_EVENTS", s0Var.f18145t);
        return jSONObjectA;
    }

    public JSONObject H(t0 t0Var) throws JSONException {
        l.e(t0Var, "input");
        JSONObject jSONObjectA = super.a(t0Var);
        jSONObjectA.put("throughput_server_response_min_latency", t0Var.f18176g);
        jSONObjectA.put("throughput_server_response_max_latency", t0Var.f18177h);
        jSONObjectA.put("throughput_server_response_avg_latency", t0Var.f18178i);
        jSONObjectA.put("throughput_server_response_min_jitter", t0Var.j);
        jSONObjectA.put("throughput_server_response_max_jitter", t0Var.k);
        jSONObjectA.put("throughput_server_response_avg_jitter", t0Var.f18179l);
        jSONObjectA.put("throughput_server_response_packets_sent", t0Var.f18180m);
        jSONObjectA.put("throughput_server_response_packets_discarded", t0Var.f18181n);
        jSONObjectA.put("throughput_server_response_packets_discard_percentage", t0Var.f18182o);
        jSONObjectA.put("throughput_server_response_packets_lost", t0Var.f18183p);
        jSONObjectA.put("throughput_server_response_packets_lost_percentage", t0Var.f18184q);
        xu.d.Y(jSONObjectA, "throughput_server_response_test_server", t0Var.f18185r);
        jSONObjectA.put("throughput_server_response_config_number_of_packets", t0Var.f18186s);
        jSONObjectA.put("throughput_server_response_config_packet_size", t0Var.f18187t);
        jSONObjectA.put("throughput_server_response_config_packet_delay", t0Var.f18188u);
        jSONObjectA.put("throughput_server_response_test_status", t0Var.f18189v);
        jSONObjectA.put("throughput_server_response_dns_lookup_time", t0Var.f18190w);
        xu.d.Y(jSONObjectA, "throughput_server_response_sent_times", t0Var.f18191x);
        xu.d.Y(jSONObjectA, "throughput_server_response_received_times", t0Var.f18192y);
        xu.d.Y(jSONObjectA, "throughput_server_response_received_packets", t0Var.f18193z);
        xu.d.Y(jSONObjectA, "throughput_server_response_events", t0Var.A);
        xu.d.Y(jSONObjectA, "throughput_server_response_version", t0Var.B);
        xu.d.Y(jSONObjectA, "throughput_server_response_verification_statuses", t0Var.C);
        return jSONObjectA;
    }

    public JSONObject I(u0 u0Var) throws JSONException {
        l.e(u0Var, "input");
        JSONObject jSONObjectA = super.a(u0Var);
        jSONObjectA.put("THROUGHPUT_UPLOAD_SPEED", u0Var.f18207g);
        jSONObjectA.put("THROUGHPUT_UPLOAD_SPEED_TEST_BYTES_ONLY", u0Var.f18208h);
        xu.d.Y(jSONObjectA, "THROUGHPUT_UPLOAD_TEST_SERVER", u0Var.f18209i);
        jSONObjectA.put("THROUGHPUT_UPLOAD_TEST_SERVER_TIMESTAMP", u0Var.j);
        xu.d.Y(jSONObjectA, "THROUGHPUT_UPLOAD_AWS_DIAGNOSTICS", u0Var.f18213o);
        jSONObjectA.put("THROUGHPUT_UPLOAD_TEST_SIZE", u0Var.k);
        jSONObjectA.put("THROUGHPUT_UPLOAD_TEST_STATUS", u0Var.f18210l);
        jSONObjectA.put("THROUGHPUT_UPLOAD_DNS_LOOKUP_TIME", u0Var.f18211m);
        jSONObjectA.put("THROUGHPUT_UPLOAD_TTFA", u0Var.f18212n);
        xu.d.Y(jSONObjectA, "THROUGHPUT_UPLOAD_AWS_EDGE_LOCATION", u0Var.f18214p);
        xu.d.Y(jSONObjectA, "THROUGHPUT_UPLOAD_TIMES", u0Var.f18215q);
        xu.d.Y(jSONObjectA, "THROUGHPUT_UPLOAD_CUMULATIVE_BYTES", u0Var.f18216r);
        xu.d.Y(jSONObjectA, "THROUGHPUT_UPLOAD_EVENTS", u0Var.f18217s);
        return jSONObjectA;
    }

    public JSONObject J(v0 v0Var) throws JSONException {
        l.e(v0Var, "input");
        JSONObject jSONObjectA = super.a(v0Var);
        jSONObjectA.put("TIME", v0Var.f18247f);
        xu.d.Y(jSONObjectA, "JOB_RESULT_TRACEROUTE_HOP", v0Var.f18248g);
        xu.d.Y(jSONObjectA, "JOB_RESULT_TRACEROUTE_ENDPOINT", v0Var.f18249h);
        xu.d.Y(jSONObjectA, "JOB_RESULT_TRACEROUTE_IP", v0Var.f18250i);
        return jSONObjectA;
    }

    public JSONObject K(w0 w0Var) throws JSONException {
        l.e(w0Var, "input");
        JSONObject jSONObjectA = super.a(w0Var);
        jSONObjectA.put("TIME", w0Var.f18274f);
        xu.d.Y(jSONObjectA, "TRACEROUTE", w0Var.f18275g);
        xu.d.Y(jSONObjectA, "TR_EVENTS", w0Var.f18276h);
        xu.d.Y(jSONObjectA, "TR_ENDPOINT", w0Var.f18277i);
        xu.d.Y(jSONObjectA, "TR_IP_ADDRESS", w0Var.j);
        return jSONObjectA;
    }

    public JSONObject L(z0 z0Var) throws JSONException {
        l.e(z0Var, "input");
        JSONObject jSONObjectA = super.a(z0Var);
        jSONObjectA.put("JOB_RESULT_PACKETS_SENT", z0Var.f18330g);
        jSONObjectA.put("JOB_RESULT_PAYLOAD_SIZE", z0Var.f18331h);
        jSONObjectA.put("JOB_RESULT_TARGET_SEND_KBPS", z0Var.f18332i);
        jSONObjectA.put("JOB_RESULT_ECHO_FACTOR", Float.valueOf(z0Var.j));
        xu.d.Y(jSONObjectA, "JOB_RESULT_PROVIDER_NAME", z0Var.k);
        xu.d.Y(jSONObjectA, "JOB_RESULT_IP", z0Var.f18333l);
        xu.d.Y(jSONObjectA, "JOB_RESULT_HOST", z0Var.f18334m);
        xu.d.Y(jSONObjectA, "JOB_RESULT_SENT_TIMES", z0Var.f18335n);
        xu.d.Y(jSONObjectA, "JOB_RESULT_RECEIVED_TIMES", z0Var.f18336o);
        xu.d.Y(jSONObjectA, "JOB_RESULT_TRAFFIC", z0Var.f18337p);
        jSONObjectA.put("JOB_RESULT_NETWORK_CHANGED", z0Var.f18338q);
        xu.d.Y(jSONObjectA, "JOB_RESULT_EVENTS", z0Var.f18339r);
        jSONObjectA.put("JOB_RESULT_TEST_NAME", z0Var.f18340s);
        xu.d.Y(jSONObjectA, "JOB_RESULT_UDP_VERIFICATION_STATUSES", z0Var.f18341t);
        xu.d.Y(jSONObjectA, "JOB_RESULT_UDP_VERSION", z0Var.f18342u);
        return jSONObjectA;
    }

    public JSONObject M(b1 b1Var) throws JSONException {
        l.e(b1Var, "input");
        JSONObject jSONObjectA = super.a(b1Var);
        jSONObjectA.put("JOB_RESULT_VERIFICATION_TEST_NAME", b1Var.f17677g);
        xu.d.Y(jSONObjectA, "JOB_RESULT_SENT_VERIFICATION_PROBES_COUNT", b1Var.f17678h);
        xu.d.Y(jSONObjectA, "JOB_RESULT_RECEIVED_VERIFICATION_PROBES_COUNT", b1Var.f17679i);
        xu.d.Y(jSONObjectA, "JOB_RESULT_SUCCESSFUL_RECEIVED_VERIFICATION_PROBES_COUNT", b1Var.j);
        xu.d.Y(jSONObjectA, "JOB_RESULT_EVENTS", b1Var.k);
        xu.d.Y(jSONObjectA, "JOB_RESULT_VERIFICATION_RESPONSE", b1Var.f17680l);
        xu.d.Y(jSONObjectA, "JOB_RESULT_VERIFICATION_SENT_TIMES", b1Var.f17681m);
        xu.d.Y(jSONObjectA, "JOB_RESULT_VERIFICATION_RECEIVED_TIMES", b1Var.f17682n);
        xu.d.Y(jSONObjectA, "JOB_RESULT_UDP_VERIFICATION_PAYLOAD_IS_VALID", b1Var.f17683o);
        xu.d.Y(jSONObjectA, "JOB_RESULT_UDP_VERIFICATION_RESPONSE_IS_VALID", b1Var.f17684p);
        xu.d.Y(jSONObjectA, "JOB_RESULT_UDP_VERIFICATION_RESPONSE_AGE_MS", b1Var.f17685q);
        xu.d.Y(jSONObjectA, "JOB_RESULT_UDP_VERIFICATION_RAW_RESPONSES", b1Var.f17686r);
        return jSONObjectA;
    }

    public JSONObject N(c1 c1Var) throws JSONException {
        l.e(c1Var, "input");
        JSONObject jSONObjectA = super.a(c1Var);
        jSONObjectA.put("upload_time_response", c1Var.f17712g);
        jSONObjectA.put("upload_speed", c1Var.f17713h);
        jSONObjectA.put("trimmed_upload_speed", c1Var.f17714i);
        jSONObjectA.put("upload_file_size", c1Var.j);
        xu.d.Y(jSONObjectA, "upload_last_time", c1Var.k);
        xu.d.Y(jSONObjectA, "upload_file_sizes", c1Var.f17715l);
        xu.d.Y(jSONObjectA, "upload_times", c1Var.f17716m);
        jSONObjectA.put("upload_ip", c1Var.f17717n);
        jSONObjectA.put("upload_host", c1Var.f17718o);
        jSONObjectA.put("upload_thread_count", c1Var.f17719p);
        jSONObjectA.put("upload_cdn_name", c1Var.f17720q);
        jSONObjectA.put("upload_unreliability", c1Var.f17721r);
        xu.d.Y(jSONObjectA, "upload_events", c1Var.f17722s);
        jSONObjectA.put("upload_monitor_type", c1Var.f17723t);
        jSONObjectA.put("upload_speed_buffer", c1Var.f17724u);
        jSONObjectA.put("upload_trimmed_speed_buffer", c1Var.f17725v);
        jSONObjectA.put("upload_test_duration", c1Var.f17726w);
        xu.d.Y(jSONObjectA, "upload_buffer_file_sizes", c1Var.f17727x);
        xu.d.Y(jSONObjectA, "upload_buffer_times", c1Var.f17728y);
        return jSONObjectA;
    }

    @Override // xj.b, xj.h
    public Object a(Object obj) throws JSONException {
        switch (this.f395a) {
            case 0:
                return x((e) obj);
            case 1:
                return C((t) obj);
            case 2:
                o0 o0Var = (o0) obj;
                l.e(o0Var, "input");
                JSONObject jSONObjectA = super.a(o0Var);
                jSONObjectA.put("task_result_events", o0Var.f18072g);
                return jSONObjectA;
            case 3:
                return y((ni.g) obj);
            case 4:
                return z((h) obj);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return A((n) obj);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return B((q) obj);
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return D((v) obj);
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return E((w) obj);
            case 9:
                return F((x) obj);
            case 10:
                g0 g0Var = (g0) obj;
                l.e(g0Var, "input");
                JSONObject jSONObjectA2 = super.a(g0Var);
                xu.d.Y(jSONObjectA2, "PUBLIC_IP", g0Var.f17852g);
                return jSONObjectA2;
            case 11:
                h0 h0Var = (h0) obj;
                l.e(h0Var, "input");
                JSONObject jSONObjectA3 = super.a(h0Var);
                jSONObjectA3.put("JOB_RESULT_TRIGGER_TYPE", h0Var.f17890g);
                return jSONObjectA3;
            case 12:
                return G((s0) obj);
            case 13:
                return H((t0) obj);
            case 14:
                return I((u0) obj);
            case 15:
                return J((v0) obj);
            case 16:
                return K((w0) obj);
            case 17:
            case 19:
            default:
                return super.a(obj);
            case 18:
                return L((z0) obj);
            case 20:
                return M((b1) obj);
            case 21:
                return N((c1) obj);
            case 22:
                f1 f1Var = (f1) obj;
                l.e(f1Var, "input");
                return new JSONObject(f1Var.h());
            case 23:
                g1 g1Var = (g1) obj;
                l.e(g1Var, "input");
                JSONObject jSONObjectA4 = super.a(g1Var);
                xu.d.Y(jSONObjectA4, "wifi_information_elements", g1Var.f17859g);
                return jSONObjectA4;
            case 24:
                return O((i1) obj);
        }
    }

    @Override // xj.b
    /* renamed from: c */
    public JSONObject a(vj.c cVar) throws JSONException {
        switch (this.f395a) {
            case 0:
                return x((e) cVar);
            case 1:
                return C((t) cVar);
            case 2:
                o0 o0Var = (o0) cVar;
                l.e(o0Var, "input");
                JSONObject jSONObjectA = super.a(o0Var);
                jSONObjectA.put("task_result_events", o0Var.f18072g);
                return jSONObjectA;
            case 3:
                return y((ni.g) cVar);
            case 4:
                return z((h) cVar);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return A((n) cVar);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return B((q) cVar);
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return D((v) cVar);
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return E((w) cVar);
            case 9:
                return F((x) cVar);
            case 10:
                g0 g0Var = (g0) cVar;
                l.e(g0Var, "input");
                JSONObject jSONObjectA2 = super.a(g0Var);
                xu.d.Y(jSONObjectA2, "PUBLIC_IP", g0Var.f17852g);
                return jSONObjectA2;
            case 11:
                h0 h0Var = (h0) cVar;
                l.e(h0Var, "input");
                JSONObject jSONObjectA3 = super.a(h0Var);
                jSONObjectA3.put("JOB_RESULT_TRIGGER_TYPE", h0Var.f17890g);
                return jSONObjectA3;
            case 12:
                return G((s0) cVar);
            case 13:
                return H((t0) cVar);
            case 14:
                return I((u0) cVar);
            case 15:
                return J((v0) cVar);
            case 16:
                return K((w0) cVar);
            case 17:
            case 19:
            default:
                return super.a(cVar);
            case 18:
                return L((z0) cVar);
            case 20:
                return M((b1) cVar);
            case 21:
                return N((c1) cVar);
            case 22:
                f1 f1Var = (f1) cVar;
                l.e(f1Var, "input");
                return new JSONObject(f1Var.h());
            case 23:
                g1 g1Var = (g1) cVar;
                l.e(g1Var, "input");
                JSONObject jSONObjectA4 = super.a(g1Var);
                xu.d.Y(jSONObjectA4, "wifi_information_elements", g1Var.f17859g);
                return jSONObjectA4;
            case 24:
                return O((i1) cVar);
        }
    }

    @Override // xj.g
    public final Object g(Object obj) throws JSONException {
        switch (this.f395a) {
            case 0:
                return d((JSONObject) obj);
            case 1:
                JSONObject jSONObject = (JSONObject) obj;
                l.e(jSONObject, "input");
                ch.n.b("FlushConnectionInfoJobResultItemMapper", "mapFrom() called with input : " + jSONObject);
                xj.a aVarB = xj.b.b(jSONObject);
                String string = jSONObject.getString("CONNECTION_ID");
                Long lC = xu.d.C("CONNECTION_START_TIME", jSONObject);
                Long lC2 = xu.d.C("CONNECTION_END_TIME", jSONObject);
                Integer numY = xu.d.y("DEVICE_CONNECTION_TYPE", jSONObject);
                Integer numY2 = xu.d.y("DEVICE_CONNECTION_MOBILE_SUBTYPE", jSONObject);
                String strK = xu.d.K("DEVICE_CONNECTION_WIFI_BSSID", jSONObject);
                String strK2 = xu.d.K("DEVICE_CONNECTION_CELL_TOWER", jSONObject);
                String string2 = jSONObject.getString("APP_VRS_CODE");
                String string3 = jSONObject.getString("DC_VRS_CODE");
                int i10 = jSONObject.getInt("DB_VRS_CODE");
                String string4 = jSONObject.getString("ANDROID_VRS");
                int i11 = jSONObject.getInt("ANDROID_SDK");
                Integer numY3 = xu.d.y("ANDROID_SDK_FULL", jSONObject);
                long j = jSONObject.getLong("CLIENT_VRS_CODE");
                String string5 = jSONObject.getString("COHORT_ID");
                int i12 = jSONObject.getInt("REPORT_CONFIG_REVISION");
                int i13 = jSONObject.getInt("REPORT_CONFIG_ID");
                String string6 = jSONObject.getString("CONFIG_HASH");
                boolean z10 = jSONObject.getBoolean("DEVICE_CONNECTION_IS_ROAMING");
                String strK3 = xu.d.K("JOB_RESULT_DEVICE_CONNECTION_LOCATION", jSONObject);
                String strK4 = xu.d.K("JOB_RESULT_DEVICE_CONNECTION_NETWORK_ID_SIM", jSONObject);
                String strK5 = xu.d.K("JOB_RESULT_DEVICE_CONNECTION_NETWORK_NAME_SIM", jSONObject);
                Integer numY4 = xu.d.y("JOB_RESULT_DEVICE_CONNECTION_NR_STATE", jSONObject);
                Long lC3 = xu.d.C("JOB_RESULT_DEVICE_CONNECTION_LAST_TASK_TIME", jSONObject);
                long j7 = aVarB.f25376a;
                long j10 = aVarB.f25377b;
                String str = aVarB.f25378c;
                String str2 = aVarB.f25379d;
                String str3 = aVarB.f25380e;
                long j11 = aVarB.f25381f;
                ak.f fVarC = p.c(strK2);
                c0 c0VarY = f0.y(strK3);
                l.b(string2);
                l.b(string3);
                l.b(string4);
                l.b(string5);
                l.b(string6);
                l.b(string);
                return new t(j7, j10, str, str2, str3, j11, string2, string3, i10, string4, i11, j, string5, i12, i13, string6, string, numY, numY2, lC, lC2, fVarC, strK, z10, c0VarY, strK4, strK5, numY4, lC3, numY3);
            case 2:
                return m((JSONObject) obj);
            case 3:
                return w(obj);
            case 4:
                return e((JSONObject) obj);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return f((JSONObject) obj);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                JSONObject jSONObject2 = (JSONObject) obj;
                l.e(jSONObject2, "input");
                xj.a aVarB2 = xj.b.b(jSONObject2);
                return new q(aVarB2.f25376a, aVarB2.f25377b, aVarB2.f25378c, aVarB2.f25379d, aVarB2.f25380e, aVarB2.f25381f, xu.d.K("END_CAPABILITIES", jSONObject2), xu.d.K("END_EXPERIMENTAL", jSONObject2), xu.d.r("END_IS_CONNECTED", jSONObject2), xu.d.y("END_NETWORK_STATE", jSONObject2), xu.d.y("END_NETWORK_DETAILED_STATE", jSONObject2));
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return h((JSONObject) obj);
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return i((JSONObject) obj);
            case 9:
                return j((JSONObject) obj);
            case 10:
                return k((JSONObject) obj);
            case 11:
                return l((JSONObject) obj);
            case 12:
                return n((JSONObject) obj);
            case 13:
                return o((JSONObject) obj);
            case 14:
                return p((JSONObject) obj);
            case 15:
                return q((JSONObject) obj);
            case 16:
                JSONObject jSONObject3 = (JSONObject) obj;
                l.e(jSONObject3, "input");
                xj.a aVarB3 = xj.b.b(jSONObject3);
                return new w0(aVarB3.f25376a, aVarB3.f25377b, aVarB3.f25378c, aVarB3.f25379d, aVarB3.f25380e, aVarB3.f25381f, new JSONArray(jSONObject3.optString("TRACEROUTE")), new JSONArray(jSONObject3.optString("TR_EVENTS")), jSONObject3.optString("TR_ENDPOINT"), jSONObject3.optString("TR_IP_ADDRESS"));
            case 17:
                return r((JSONObject) obj);
            case 18:
                JSONObject jSONObject4 = (JSONObject) obj;
                l.e(jSONObject4, "input");
                xj.a aVarB4 = xj.b.b(jSONObject4);
                int i14 = jSONObject4.getInt("JOB_RESULT_PACKETS_SENT");
                int i15 = jSONObject4.getInt("JOB_RESULT_PAYLOAD_SIZE");
                int i16 = jSONObject4.getInt("JOB_RESULT_TARGET_SEND_KBPS");
                Float fV = xu.d.v("JOB_RESULT_ECHO_FACTOR", jSONObject4);
                float fFloatValue = fV != null ? fV.floatValue() : 0.0f;
                String strK6 = xu.d.K("JOB_RESULT_PROVIDER_NAME", jSONObject4);
                String strK7 = xu.d.K("JOB_RESULT_IP", jSONObject4);
                String strK8 = xu.d.K("JOB_RESULT_HOST", jSONObject4);
                String strK9 = xu.d.K("JOB_RESULT_SENT_TIMES", jSONObject4);
                String strK10 = xu.d.K("JOB_RESULT_RECEIVED_TIMES", jSONObject4);
                String strK11 = xu.d.K("JOB_RESULT_TRAFFIC", jSONObject4);
                boolean z11 = jSONObject4.getBoolean("JOB_RESULT_NETWORK_CHANGED");
                String strK12 = xu.d.K("JOB_RESULT_EVENTS", jSONObject4);
                String string7 = jSONObject4.getString("JOB_RESULT_TEST_NAME");
                String strK13 = xu.d.K("JOB_RESULT_UDP_VERIFICATION_STATUSES", jSONObject4);
                Integer numY5 = xu.d.y("JOB_RESULT_UDP_VERSION", jSONObject4);
                long j12 = aVarB4.f25376a;
                long j13 = aVarB4.f25377b;
                String str4 = aVarB4.f25378c;
                String str5 = aVarB4.f25380e;
                long j14 = aVarB4.f25381f;
                String str6 = aVarB4.f25379d;
                l.b(string7);
                return new z0(j12, j13, str4, str6, str5, j14, i14, i15, i16, fFloatValue, strK6, strK7, strK8, strK9, strK10, strK11, z11, strK12, string7, strK13, numY5);
            case 19:
                return s((JSONObject) obj);
            case 20:
                JSONObject jSONObject5 = (JSONObject) obj;
                l.e(jSONObject5, "input");
                xj.a aVarB5 = xj.b.b(jSONObject5);
                String string8 = jSONObject5.getString("JOB_RESULT_VERIFICATION_TEST_NAME");
                Integer numY6 = xu.d.y("JOB_RESULT_SENT_VERIFICATION_PROBES_COUNT", jSONObject5);
                Integer numY7 = xu.d.y("JOB_RESULT_RECEIVED_VERIFICATION_PROBES_COUNT", jSONObject5);
                Integer numY8 = xu.d.y("JOB_RESULT_SUCCESSFUL_RECEIVED_VERIFICATION_PROBES_COUNT", jSONObject5);
                Long lC4 = xu.d.C("JOB_RESULT_VERIFICATION_RESPONSE", jSONObject5);
                String strK14 = xu.d.K("JOB_RESULT_EVENTS", jSONObject5);
                String strK15 = xu.d.K("JOB_RESULT_VERIFICATION_SENT_TIMES", jSONObject5);
                String strK16 = xu.d.K("JOB_RESULT_VERIFICATION_RECEIVED_TIMES", jSONObject5);
                Boolean boolR = xu.d.r("JOB_RESULT_UDP_VERIFICATION_PAYLOAD_IS_VALID", jSONObject5);
                Boolean boolR2 = xu.d.r("JOB_RESULT_UDP_VERIFICATION_RESPONSE_IS_VALID", jSONObject5);
                Long lC5 = xu.d.C("JOB_RESULT_UDP_VERIFICATION_RESPONSE_AGE_MS", jSONObject5);
                String strK17 = xu.d.K("JOB_RESULT_UDP_VERIFICATION_RAW_RESPONSES", jSONObject5);
                long j15 = aVarB5.f25376a;
                long j16 = aVarB5.f25377b;
                String str7 = aVarB5.f25378c;
                String str8 = aVarB5.f25379d;
                String str9 = aVarB5.f25380e;
                long j17 = aVarB5.f25381f;
                l.b(string8);
                return new b1(j15, j16, str7, str8, str9, j17, string8, numY6, numY7, numY8, strK14, lC4, strK15, strK16, boolR, boolR2, lC5, strK17);
            case 21:
                return t((JSONObject) obj);
            case 22:
                return u((JSONObject) obj);
            case 23:
                return v((JSONObject) obj);
            default:
                JSONObject jSONObject6 = (JSONObject) obj;
                l.e(jSONObject6, "input");
                xj.a aVarB6 = xj.b.b(jSONObject6);
                String string9 = jSONObject6.getString("wifi_bssid");
                String string10 = jSONObject6.getString("wifi_ssid");
                int i17 = jSONObject6.getInt("wifi_rssi");
                int i18 = jSONObject6.getInt("wifi_frequency");
                String string11 = jSONObject6.getString("wifi_capabilities");
                Integer numY9 = xu.d.y("wifi_channel_width", jSONObject6);
                Integer numY10 = xu.d.y("wifi_standard", jSONObject6);
                String strK18 = xu.d.K("wifi_information_elements", jSONObject6);
                c0 c0VarY2 = f0.y(xu.d.K("wifi_scan_location", jSONObject6));
                String string12 = jSONObject6.getString("APP_VRS_CODE");
                String string13 = jSONObject6.getString("DC_VRS_CODE");
                int i19 = jSONObject6.getInt("DB_VRS_CODE");
                String string14 = jSONObject6.getString("ANDROID_VRS");
                int i20 = jSONObject6.getInt("ANDROID_SDK");
                Integer numY11 = xu.d.y("ANDROID_SDK_FULL", jSONObject6);
                long j18 = jSONObject6.getLong("CLIENT_VRS_CODE");
                String string15 = jSONObject6.getString("COHORT_ID");
                int i21 = jSONObject6.getInt("REPORT_CONFIG_REVISION");
                int i22 = jSONObject6.getInt("REPORT_CONFIG_ID");
                String string16 = jSONObject6.getString("CONFIG_HASH");
                String strK19 = xu.d.K("CONNECTION_ID", jSONObject6);
                Long lC6 = xu.d.C("CONNECTION_START_TIME", jSONObject6);
                long j19 = aVarB6.f25376a;
                long j20 = aVarB6.f25377b;
                String str10 = aVarB6.f25378c;
                String str11 = aVarB6.f25379d;
                String str12 = aVarB6.f25380e;
                long j21 = aVarB6.f25381f;
                l.b(string12);
                l.b(string13);
                l.b(string14);
                l.b(string15);
                l.b(string16);
                l.b(string9);
                l.b(string10);
                l.b(string11);
                return new i1(j19, j20, str10, str11, str12, j21, string12, string13, i19, string14, i20, numY11, j18, string15, i21, i22, string16, strK19, lC6, string9, string10, i17, i18, string11, numY9, numY10, strK18, c0VarY2);
        }
    }

    public JSONObject x(e eVar) throws JSONException {
        l.e(eVar, "input");
        JSONObject jSONObjectA = super.a(eVar);
        JSONArray jSONArray = new JSONArray();
        Iterator it = eVar.f392g.iterator();
        while (it.hasNext()) {
            jSONArray.put(((bh.a) it.next()).a());
        }
        jSONObjectA.put("assistant_results", jSONArray);
        jSONObjectA.put("assistant_entity_id", eVar.f394i);
        jSONObjectA.put("assistant_duration_in_millis", eVar.f393h);
        return jSONObjectA;
    }

    public JSONObject y(ni.g gVar) throws JSONException {
        String string;
        String string2;
        l.e(gVar, "input");
        JSONObject jSONObjectA = super.a(gVar);
        String str = gVar.f17830i;
        jSONObjectA.put("app_version", str);
        jSONObjectA.put("device_sdk_int", gVar.f17828g);
        xu.d.Y(jSONObjectA, "device_sdk_int_full", gVar.f17829h);
        jSONObjectA.put("app_version", str);
        jSONObjectA.put("CLIENT_VRS_CODE", gVar.j);
        jSONObjectA.put("DC_VRS_CODE", gVar.k);
        jSONObjectA.put("ANDROID_VRS", gVar.f17831l);
        jSONObjectA.put("DB_VRS_CODE", gVar.f17832m);
        jSONObjectA.put("REPORT_CONFIG_REVISION", gVar.f17833n);
        jSONObjectA.put("REPORT_CONFIG_ID", gVar.f17834o);
        jSONObjectA.put("CONFIG_HASH", gVar.f17835p);
        jSONObjectA.put("COHORT_ID", gVar.f17836q);
        j0 j0Var = gVar.f17837r;
        String string3 = null;
        xu.d.Y(jSONObjectA, "SERVICE_STATE", j0Var != null ? j0Var.a() : null);
        ni.f0 f0Var = gVar.f17838s;
        xu.d.Y(jSONObjectA, "PERMISSION_STATE", f0Var != null ? f0Var.a() : null);
        c0 c0Var = gVar.f17839t;
        xu.d.Y(jSONObjectA, "LOCATION_DATA", c0Var != null ? c0Var.a() : null);
        d0 d0Var = gVar.f17840u;
        if (d0Var != null) {
            JSONObject jSONObject = new JSONObject();
            xu.d.Y(jSONObject, "location_enabled", d0Var.f17740a);
            string = jSONObject.toString();
            l.d(string, "toString(...)");
        } else {
            string = null;
        }
        xu.d.Y(jSONObjectA, "LOCATION_SETTINGS", string);
        m0 m0Var = gVar.f17841v;
        xu.d.Y(jSONObjectA, "SUBSCRIPTIONS", m0Var != null ? m0Var.a() : null);
        p0 p0Var = gVar.f17842w;
        xu.d.Y(jSONObjectA, "TELEPHONY_DATA", p0Var != null ? p0Var.a() : null);
        xu.d.Y(jSONObjectA, "CELLS_INFO", gVar.f17844y);
        xu.d.Y(jSONObjectA, "NETWORK_CONNECTION_TYPE", Integer.valueOf(gVar.f17845z));
        n0 n0Var = gVar.A;
        xu.d.Y(jSONObjectA, "SYSTEM_STATUS", n0Var != null ? n0Var.a() : null);
        xu.d.Y(jSONObjectA, "EXPERIMENTAL", gVar.B);
        j1 j1Var = gVar.C;
        xu.d.Y(jSONObjectA, "WIFI_STATUS", j1Var != null ? j1Var.a() : null);
        m mVar = gVar.D;
        xu.d.Y(jSONObjectA, "DHCP_STATUS", mVar != null ? mVar.a() : null);
        e0 e0Var = gVar.E;
        xu.d.Y(jSONObjectA, "NETWORK_CAPABILITY", e0Var != null ? e0Var.a() : null);
        ni.a aVar = gVar.F;
        xu.d.Y(jSONObjectA, "BATTERY_STATUS", aVar != null ? aVar.a() : null);
        ni.c cVar = gVar.G;
        xu.d.Y(jSONObjectA, "CELL_INFO_GSM", cVar != null ? cVar.a() : null);
        ni.d dVar = gVar.H;
        xu.d.Y(jSONObjectA, "CELL_INFO_LTE", dVar != null ? dVar.a() : null);
        ni.b bVar = gVar.I;
        xu.d.Y(jSONObjectA, "CELL_INFO_CDMA", bVar != null ? bVar.a() : null);
        ni.e eVar = gVar.J;
        xu.d.Y(jSONObjectA, "CELL_INFO_WCDMA", eVar != null ? eVar.a() : null);
        l0 l0Var = gVar.K;
        xu.d.Y(jSONObjectA, "SIM_CARRIER", l0Var != null ? l0Var.a() : null);
        i0 i0Var = gVar.L;
        if (i0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            xu.d.Y(jSONObject2, "is_screen_on", i0Var.f17921a);
            xu.d.Y(jSONObject2, "is_screen_locked", i0Var.f17922b);
            string2 = jSONObject2.toString();
            l.d(string2, "toString(...)");
        } else {
            string2 = null;
        }
        xu.d.Y(jSONObjectA, "SCREEN_STATUS", string2);
        r rVar = gVar.M;
        xu.d.Y(jSONObjectA, "ESIM_STATUS", rVar != null ? rVar.a() : null);
        ni.l lVar = gVar.f17843x;
        xu.d.Y(jSONObjectA, "DEVICE_SETTINGS", lVar != null ? lVar.a() : null);
        k0 k0Var = gVar.N;
        xu.d.Y(jSONObjectA, "SIGNAL_STRENGTH_FIELDS", k0Var != null ? k0Var.a() : null);
        i iVar = gVar.Q;
        xu.d.Y(jSONObjectA, "DATA_USAGE", iVar != null ? iVar.a() : null);
        q0 q0Var = gVar.O;
        xu.d.Y(jSONObjectA, "TELEPHONY_DISPLAY_INFO", q0Var != null ? q0Var.a() : null);
        r0 r0Var = gVar.R;
        if (r0Var != null) {
            JSONObject jSONObject3 = new JSONObject();
            xu.d.Y(jSONObject3, "physical_channel_config_string", r0Var.f18119a);
            xu.d.Y(jSONObject3, "physical_channel_config_timestamp", r0Var.f18120b);
            string3 = jSONObject3.toString();
            l.d(string3, "toString(...)");
        }
        xu.d.Y(jSONObjectA, "TELEPHONY_PHYSICAL_CHANNEL_CONFIG", string3);
        xu.d.Y(jSONObjectA, "ELAPSED_REAL_TIME", gVar.S);
        jSONObjectA.put("AUDIO_MODE", gVar.T);
        xu.d.Y(jSONObjectA, "DEVICE_CONNECTION", gVar.U);
        xu.d.Y(jSONObjectA, "LIGHT_SENSOR", gVar.W);
        xu.d.Y(jSONObjectA, "IS_CONNECTED", gVar.X);
        xu.d.Y(jSONObjectA, "NETWORK_STATE", gVar.Y);
        xu.d.Y(jSONObjectA, "NETWORK_DETAILED_STATE", gVar.Z);
        return jSONObjectA;
    }

    public JSONObject z(h hVar) throws JSONException {
        l.e(hVar, "input");
        JSONObject jSONObjectA = super.a(hVar);
        jSONObjectA.put("COHORT_ID", hVar.f17871n);
        jSONObjectA.put("APP_VRS_CODE", hVar.f17866g);
        jSONObjectA.put("DC_VRS_CODE", hVar.f17867h);
        jSONObjectA.put("DB_VRS_CODE", hVar.f17868i);
        jSONObjectA.put("ANDROID_VRS", hVar.j);
        jSONObjectA.put("ANDROID_SDK", hVar.k);
        xu.d.Y(jSONObjectA, "ANDROID_SDK_FULL", hVar.f17869l);
        jSONObjectA.put("CLIENT_VRS_CODE", hVar.f17870m);
        jSONObjectA.put("REPORT_CONFIG_REVISION", hVar.f17872o);
        jSONObjectA.put("REPORT_CONFIG_ID", hVar.f17873p);
        jSONObjectA.put("CONFIG_HASH", hVar.f17874q);
        jSONObjectA.put("NETWORK_ROAMING", hVar.f17875r);
        jSONObjectA.put("HAS_READ_PHONE_STATE", hVar.f17876s);
        jSONObjectA.put("HAS_READ_BASIC_PHONE_STATE", hVar.f17877t);
        jSONObjectA.put("HAS_FINE_LOCATION", hVar.f17878u);
        jSONObjectA.put("HAS_COARSE_LOCATION", hVar.f17879v);
        jSONObjectA.put("HAS_ACCESS_BACKGROUND_LOCATION", hVar.f17880w);
        jSONObjectA.put("HAS_ACCESS_WIFI_STATE", hVar.f17881x);
        jSONObjectA.put("HAS_ACCESS_NETWORK_STATE", hVar.f17882y);
        jSONObjectA.put("HAS_RECEIVE_BOOT_COMPLETED", hVar.f17883z);
        jSONObjectA.put("HAS_IGNORE_BATTERY_OPTIMIZATIONS", hVar.A);
        jSONObjectA.put("EXOPLAYER_VERSION", hVar.B);
        jSONObjectA.put("EXOPLAYER_DASH_AVAILABLE", hVar.C);
        jSONObjectA.put("EXOPLAYER_DASH_INFERRED_VERSION", hVar.D);
        jSONObjectA.put("EXOPLAYER_HLS_AVAILABLE", hVar.E);
        jSONObjectA.put("EXOPLAYER_HLS_INFERRED_VERSION", hVar.F);
        jSONObjectA.put("KOTLIN_VERSION", hVar.G);
        jSONObjectA.put("ANDROID_MIN_SDK", hVar.H);
        jSONObjectA.put("APP_STANDBY_BUCKET", hVar.I);
        jSONObjectA.put("SDK_DATA_USAGE_INFO", hVar.J);
        s sVar = hVar.K;
        xu.d.Y(jSONObjectA, "CONNECTION_ID", sVar != null ? sVar.f656a : null);
        xu.d.Y(jSONObjectA, "CONNECTION_START_TIME", sVar != null ? sVar.f659d : null);
        xu.d.Y(jSONObjectA, "ACCESS_POINT_NAME", hVar.L);
        xu.d.Y(jSONObjectA, "SIM_CARRIER_ID", hVar.M);
        xu.d.Y(jSONObjectA, "MEDIA3_VERSION", hVar.N);
        xu.d.Y(jSONObjectA, "MEDIA3_DASH_AVAILABLE", hVar.O);
        xu.d.Y(jSONObjectA, "MEDIA3_HLS_AVAILABLE", hVar.P);
        xu.d.Y(jSONObjectA, "LAST_PUBLIC_IPS", hVar.Q);
        return jSONObjectA;
    }
}
