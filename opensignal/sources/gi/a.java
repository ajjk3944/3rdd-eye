package gi;

import ak.b1;
import ak.f;
import ak.g1;
import ak.p;
import ak.s;
import ak.u;
import ak.z;
import ak.z0;
import android.os.Bundle;
import br.l;
import ch.n;
import fh.g;
import g4.j;
import ih.k;
import ih.m;
import ir.f0;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mq.w;
import ni.a0;
import ni.c0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xj.i;

/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9580a;

    public /* synthetic */ a(int i10) {
        this.f9580a = i10;
    }

    public static JSONObject c(z0 z0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", z0Var.f801a);
        xu.d.Y(jSONObject, "timeout_ms", Long.valueOf(z0Var.f802b));
        xu.d.Y(jSONObject, "monitor_collection_rate_ms", Long.valueOf(z0Var.f803c));
        jSONObject.put("test_size", z0Var.f804d.getNumberValue());
        xu.d.Y(jSONObject, "probability", Integer.valueOf(z0Var.f805e));
        return jSONObject;
    }

    public static JSONObject d(b1 b1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", b1Var.f438a);
        jSONObject.put("http_method", b1Var.f439b);
        xu.d.Y(jSONObject, "timeout_ms", Long.valueOf(b1Var.f440c));
        jSONObject.put("url_suffix_range", b1Var.f441d);
        xu.d.Y(jSONObject, "monitor_collection_rate_ms", Long.valueOf(b1Var.f442e));
        xu.d.Y(jSONObject, "traffic_stats_frequency_ms", Long.valueOf(b1Var.f443f));
        xu.d.Y(jSONObject, "wait_for_traffic_stats_to_complete", Boolean.valueOf(b1Var.f444g));
        xu.d.Y(jSONObject, "skip_traffic_stats_end_time", Boolean.valueOf(b1Var.f445h));
        xu.d.Y(jSONObject, "use_server_response_end_time", Boolean.valueOf(b1Var.f446i));
        xu.d.Y(jSONObject, "perform_head_request", Boolean.valueOf(b1Var.j));
        jSONObject.put("test_size", b1Var.k.getNumberValue());
        xu.d.Y(jSONObject, "probability", Integer.valueOf(b1Var.f447l));
        return jSONObject;
    }

    public static z0 f(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("url");
        l.d(string, "getString(...)");
        Long lC = xu.d.C("timeout_ms", jSONObject);
        long jLongValue = lC != null ? lC.longValue() : 25000L;
        Long lC2 = xu.d.C("monitor_collection_rate_ms", jSONObject);
        long jLongValue2 = lC2 != null ? lC2.longValue() : 0L;
        yh.l testSizeFromInt = yh.l.getTestSizeFromInt(jSONObject.getInt("test_size"));
        l.d(testSizeFromInt, "getTestSizeFromInt(...)");
        return new z0(string, jLongValue, jLongValue2, testSizeFromInt, jSONObject.optInt("probability", -1));
    }

    public static b1 h(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("url");
        l.d(string, "getString(...)");
        String string2 = jSONObject.getString("http_method");
        l.d(string2, "getString(...)");
        Long lC = xu.d.C("timeout_ms", jSONObject);
        long jLongValue = lC != null ? lC.longValue() : 25000L;
        int i10 = jSONObject.getInt("url_suffix_range");
        Long lC2 = xu.d.C("monitor_collection_rate_ms", jSONObject);
        long jLongValue2 = lC2 != null ? lC2.longValue() : 0L;
        Long lC3 = xu.d.C("traffic_stats_frequency_ms", jSONObject);
        long jLongValue3 = lC3 != null ? lC3.longValue() : 2L;
        Boolean boolR = xu.d.r("wait_for_traffic_stats_to_complete", jSONObject);
        boolean zBooleanValue = boolR != null ? boolR.booleanValue() : false;
        Boolean boolR2 = xu.d.r("skip_traffic_stats_end_time", jSONObject);
        boolean zBooleanValue2 = boolR2 != null ? boolR2.booleanValue() : false;
        Boolean boolR3 = xu.d.r("use_server_response_end_time", jSONObject);
        boolean zBooleanValue3 = boolR3 != null ? boolR3.booleanValue() : false;
        Boolean boolR4 = xu.d.r("perform_head_request", jSONObject);
        boolean zBooleanValue4 = boolR4 != null ? boolR4.booleanValue() : false;
        yh.l testSizeFromInt = yh.l.getTestSizeFromInt(jSONObject.getInt("test_size"));
        l.d(testSizeFromInt, "getTestSizeFromInt(...)");
        return new b1(string, string2, jLongValue, i10, jLongValue2, jLongValue3, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, testSizeFromInt, jSONObject.optInt("probability", -1));
    }

    public static g1 i(JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt("echo_factor");
        int i11 = jSONObject.getInt("local_port");
        int i12 = jSONObject.getInt("number_packets_to_send");
        int i13 = jSONObject.getInt("packet_header_size_bytes");
        int i14 = jSONObject.getInt("payload_length_bytes");
        int i15 = jSONObject.getInt("remote_port");
        int i16 = jSONObject.getInt("target_send_rate_kbps");
        String string = jSONObject.getString("test_name");
        l.d(string, "getString(...)");
        String string2 = jSONObject.getString("url");
        l.d(string2, "getString(...)");
        return new g1(i10, i11, i12, i13, i14, i15, i16, string, string2, xu.d.y("verification_version", jSONObject), xu.d.y("verification_packet_encryption", jSONObject), xu.d.y("verification_packets_to_send", jSONObject), xu.d.y("verification_packets_spacing", jSONObject));
    }

    public static JSONObject j(g1 g1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("echo_factor", g1Var.f531a);
        jSONObject.put("local_port", g1Var.f532b);
        jSONObject.put("number_packets_to_send", g1Var.f533c);
        jSONObject.put("packet_header_size_bytes", g1Var.f534d);
        jSONObject.put("payload_length_bytes", g1Var.f535e);
        jSONObject.put("remote_port", g1Var.f536f);
        jSONObject.put("target_send_rate_kbps", g1Var.f537g);
        jSONObject.put("test_name", g1Var.f538h);
        jSONObject.put("url", g1Var.f539i);
        xu.d.Y(jSONObject, "verification_version", g1Var.j);
        xu.d.Y(jSONObject, "verification_packet_encryption", g1Var.k);
        xu.d.Y(jSONObject, "verification_packets_to_send", g1Var.f540l);
        xu.d.Y(jSONObject, "verification_packets_spacing", g1Var.f541m);
        return jSONObject;
    }

    @Override // xj.h
    public final Object a(Object obj) throws JSONException {
        float f10;
        float size;
        int i10;
        switch (this.f9580a) {
            case 0:
                rj.a aVar = (rj.a) obj;
                l.e(aVar, "input");
                return new z(aVar.f21545a, aVar.f21546b, aVar.f21547c, aVar.f21548d);
            case 1:
                rj.e eVar = (rj.e) obj;
                if (eVar == null) {
                    return null;
                }
                String str = eVar.f21579b;
                int i11 = eVar.f21580c;
                int i12 = eVar.f21581d;
                nj.a aVar2 = nj.b.Companion;
                String str2 = eVar.f21582e;
                aVar2.getClass();
                return new bj.a(str, i11, i12, nj.a.a(str2), Long.parseLong(eVar.f21583f), eVar.f21584g, eVar.f21585h, Long.parseLong(eVar.f21586i), Long.parseLong(eVar.j), Long.parseLong(eVar.k), Long.parseLong(eVar.f21587l), Long.parseLong(eVar.f21588m), Long.parseLong(eVar.f21589n), eVar.f21590o);
            case 2:
                s sVar = (s) obj;
                l.e(sVar, "input");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("device_connection_id", sVar.f656a);
                xu.d.Y(jSONObject, "device_connection_start_time", sVar.f659d);
                xu.d.Y(jSONObject, "device_connection_end_time", sVar.f660e);
                xu.d.Y(jSONObject, "device_connection_type", sVar.f657b);
                xu.d.Y(jSONObject, "device_connection_mobile_subtype", sVar.f658c);
                xu.d.Y(jSONObject, "device_connection_wifi_bssid", sVar.f662g);
                f fVar = sVar.f661f;
                xu.d.Y(jSONObject, "device_connection_cell_tower", fVar != null ? fVar.a() : null);
                xu.d.Y(jSONObject, "device_connection_is_roaming", Boolean.valueOf(sVar.f663h));
                c0 c0Var = sVar.f664i;
                xu.d.Y(jSONObject, "device_connection_location", c0Var != null ? c0Var.a() : null);
                xu.d.Y(jSONObject, "device_connection_nr_state", sVar.f665l);
                xu.d.Y(jSONObject, "device_connection_last_task_time", sVar.f666m);
                xu.d.Y(jSONObject, "device_connection_initial_bytes_tx", sVar.f667n);
                xu.d.Y(jSONObject, "device_connection_initial_bytes_tx_wifi", sVar.f668o);
                xu.d.Y(jSONObject, "device_connection_initial_bytes_tx_cell", sVar.f669p);
                xu.d.Y(jSONObject, "device_connection_initial_bytes_rx", sVar.f670q);
                xu.d.Y(jSONObject, "device_connection_initial_bytes_rx_wifi", sVar.f671r);
                xu.d.Y(jSONObject, "device_connection_initial_bytes_rx_cell", sVar.f672s);
                return jSONObject;
            case 3:
                k kVar = (k) obj;
                l.e(kVar, "input");
                dh.b bVar = kVar.f11406b;
                String str3 = bVar.f7343a;
                String str4 = bVar.f7344b;
                String str5 = kVar.f11408d;
                float fA = kVar.a();
                CopyOnWriteArrayList copyOnWriteArrayList = kVar.f11405a;
                float fH = ((int) (((copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) ? -1.0f : m.h(50, copyOnWriteArrayList)) * 1000.0f)) / 1000.0f;
                if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
                    f10 = -1.0f;
                } else {
                    Iterator it = copyOnWriteArrayList.iterator();
                    f10 = Float.MAX_VALUE;
                    while (it.hasNext()) {
                        float fFloatValue = ((Float) it.next()).floatValue();
                        if (fFloatValue >= 0.0f && fFloatValue < f10) {
                            f10 = fFloatValue;
                        }
                    }
                }
                int iRound = Math.round(f10);
                int iRound2 = Math.round((copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) ? -1.0f : ((Float) Collections.max(copyOnWriteArrayList)).floatValue());
                int size2 = copyOnWriteArrayList.size();
                l.d(copyOnWriteArrayList, "getResults(...)");
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(Float.valueOf(((Number) it2.next()).floatValue()));
                }
                String string = jSONArray.toString();
                l.d(string, "toString(...)");
                String str6 = kVar.f11407c;
                if (copyOnWriteArrayList.isEmpty()) {
                    size = -1.0f;
                } else {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    float f11 = 0.0f;
                    while (it3.hasNext()) {
                        if (((Float) it3.next()).floatValue() > 0.0f) {
                            f11 += 1.0f;
                        }
                    }
                    size = f11 / copyOnWriteArrayList.size();
                }
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                Charset charset = zh.f.f27419a;
                StringBuilder sb2 = new StringBuilder();
                int size3 = copyOnWriteArrayList.size();
                int i13 = 0;
                while (i13 < size3) {
                    Float f12 = (Float) copyOnWriteArrayList.get(i13);
                    String strValueOf = String.valueOf(f12);
                    try {
                        strValueOf = decimalFormat.format(f12);
                        i10 = size3;
                    } catch (IllegalArgumentException e4) {
                        i10 = size3;
                        n.e("StringUtils", e4);
                    }
                    String str7 = strValueOf;
                    float f13 = fA;
                    sb2.append(str7.replaceAll(",", "."));
                    if (i13 < i10 - 1) {
                        sb2.append(", ");
                    }
                    i13++;
                    size3 = i10;
                    fA = f13;
                }
                return new a0(str3, str4, str5, Float.valueOf(fA), Float.valueOf(fH), Integer.valueOf(iRound), Integer.valueOf(iRound2), Integer.valueOf(size2), h0.b.o("[", sb2.toString().replaceAll(" ", ""), "]"), str6, Float.valueOf(size), string);
            case 4:
                si.a aVar3 = (si.a) obj;
                l.e(aVar3, "input");
                Bundle bundle = new Bundle();
                bundle.putLong("com.opensignal.sdk.data.receiver.SDK_INTENT_EXTRA_PIPELINE_ID", aVar3.f22059a);
                bundle.putString("com.opensignal.sdk.data.receiver.SDK_INTENT_EXTRA_PIPELINE_TASK", aVar3.f22060b);
                gk.c cVar = aVar3.f22061c;
                bundle.putLong("key_initial_delay", cVar.f9617c);
                bundle.putLong("key_repeat_period", cVar.f9618d);
                bundle.putInt("key_repeat_count", cVar.f9619e);
                bundle.putLong("key_last_successful_execution_time", cVar.f9621g);
                bundle.putLong("key_schedule_execution_time", cVar.f9622h);
                bundle.putInt("key_current_execution_count", cVar.j);
                return bundle;
            case j.STRING_FIELD_NUMBER /* 5 */:
                si.a aVar4 = (si.a) obj;
                l.e(aVar4, "input");
                Bundle bundle2 = new Bundle();
                bundle2.putLong("com.opensignal.sdk.data.receiver.SDK_INTENT_EXTRA_PIPELINE_ID", aVar4.f22059a);
                bundle2.putString("com.opensignal.sdk.data.receiver.SDK_INTENT_EXTRA_PIPELINE_TASK", aVar4.f22060b);
                gk.c cVar2 = aVar4.f22061c;
                bundle2.putLong("key_initial_delay", cVar2.f9617c);
                bundle2.putLong("key_repeat_period", cVar2.f9618d);
                bundle2.putLong("key_last_successful_execution_time", cVar2.f9621g);
                bundle2.putInt("key_repeat_count", cVar2.f9619e);
                bundle2.putLong("key_schedule_execution_time", cVar2.f9622h);
                bundle2.putInt("key_current_execution_count", cVar2.j);
                return bundle2;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                u uVar = (u) obj;
                l.e(uVar, "input");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("latitude", uVar.f721a);
                jSONObject2.put("longitude", uVar.f722b);
                jSONObject2.put("provider", uVar.f723c);
                jSONObject2.put("elapsedRealTimeMillis", uVar.f724d);
                jSONObject2.put("receiveTime", uVar.f725e);
                jSONObject2.put("utcTime", uVar.f726f);
                jSONObject2.put("altitude", uVar.f727g);
                jSONObject2.put("speed", Float.valueOf(uVar.f728h));
                jSONObject2.put("bearing", Float.valueOf(uVar.f729i));
                jSONObject2.put("accuracy", Float.valueOf(uVar.j));
                jSONObject2.put("satelliteCount", uVar.k);
                jSONObject2.put("isFromMockProvider", uVar.f730l);
                xu.d.Y(jSONObject2, "mslAltitudeMeters", uVar.f731m);
                xu.d.Y(jSONObject2, "mslAltitudeAccuracyMeters", uVar.f732n);
                xu.d.Y(jSONObject2, "altitudeAccuracyMeters", uVar.f733o);
                String string2 = jSONObject2.toString();
                l.d(string2, "toString(...)");
                return string2;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                g gVar = (g) obj;
                l.e(gVar, "input");
                JSONObject jSONObject3 = new JSONObject();
                xu.d.Y(jSONObject3, "url", gVar.f8872a);
                xu.d.Y(jSONObject3, "location", gVar.f8873b);
                xu.d.Y(jSONObject3, "endpoint_type", Integer.valueOf(gVar.f8874c));
                xu.d.Y(jSONObject3, "response_code", Integer.valueOf(gVar.f8875d));
                xu.d.Y(jSONObject3, "latency_ms", Long.valueOf(gVar.f8876e));
                xu.d.Y(jSONObject3, "exception", gVar.f8877f);
                xu.d.Y(jSONObject3, "connection_timeout_ms", gVar.f8878g);
                xu.d.Y(jSONObject3, "test_timeout_ms", gVar.f8879h);
                return jSONObject3;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                a0 a0Var = (a0) obj;
                l.e(a0Var, "input");
                JSONObject jSONObject4 = new JSONObject();
                xu.d.Y(jSONObject4, "JOB_RESULT_ENDPOINT_NAME", a0Var.f17633a);
                xu.d.Y(jSONObject4, "JOB_RESULT_ENDPOINT_URL", a0Var.f17634b);
                xu.d.Y(jSONObject4, "JOB_RESULT_HOSTNAME", a0Var.f17635c);
                xu.d.Y(jSONObject4, "JOB_RESULT_MEAN", a0Var.f17636d);
                xu.d.Y(jSONObject4, "JOB_RESULT_MEDIAN", a0Var.f17637e);
                xu.d.Y(jSONObject4, "JOB_RESULT_MIN", a0Var.f17638f);
                xu.d.Y(jSONObject4, "JOB_RESULT_MAX", a0Var.f17639g);
                xu.d.Y(jSONObject4, "JOB_RESULT_NR", a0Var.f17640h);
                xu.d.Y(jSONObject4, "JOB_RESULT_FULL", a0Var.f17641i);
                xu.d.Y(jSONObject4, "JOB_RESULT_IP", a0Var.j);
                xu.d.Y(jSONObject4, "JOB_RESULT_SUCCESS", a0Var.k);
                xu.d.Y(jSONObject4, "JOB_RESULT_RESULTS", a0Var.f17642l);
                return jSONObject4;
            case 9:
                return e((JSONArray) obj);
            case 10:
                return e((JSONArray) obj);
            default:
                JSONArray jSONArray2 = (JSONArray) obj;
                l.e(jSONArray2, "input");
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray2.length();
                    for (int i14 = 0; i14 < length; i14++) {
                        JSONObject jSONObject5 = jSONArray2.getJSONObject(i14);
                        l.d(jSONObject5, "getJSONObject(...)");
                        arrayList.add(i(jSONObject5));
                    }
                    return arrayList;
                } catch (JSONException e10) {
                    n.e("UdpConfigItemMapper", e10);
                    cj.a.G(e10);
                    return w.f16945a;
                }
        }
    }

    public JSONArray b(List list) {
        switch (this.f9580a) {
            case 9:
                l.e(list, "input");
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(c((z0) it.next()));
                    }
                    break;
                } catch (JSONException e4) {
                    n.e("ThroughputDownloadTestConfigMapper", e4);
                    cj.a.G(e4);
                    return new JSONArray();
                }
            default:
                l.e(list, "input");
                try {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put(d((b1) it2.next()));
                    }
                    break;
                } catch (JSONException e10) {
                    n.e("ThroughputUploadTestConfigMapper", e10);
                    cj.a.G(e10);
                    return new JSONArray();
                }
        }
        return new JSONArray();
    }

    public ArrayList e(JSONArray jSONArray) throws JSONException {
        switch (this.f9580a) {
            case 9:
                l.e(jSONArray, "input");
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        l.b(jSONObject);
                        arrayList.add(f(jSONObject));
                    }
                    break;
                } catch (JSONException e4) {
                    n.e("ThroughputDownloadTestConfigMapper", e4);
                    cj.a.G(e4);
                    return new ArrayList();
                }
            default:
                l.e(jSONArray, "input");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = jSONArray.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        l.b(jSONObject2);
                        arrayList2.add(h(jSONObject2));
                    }
                    break;
                } catch (JSONException e10) {
                    n.e("ThroughputUploadTestConfigMapper", e10);
                    cj.a.G(e10);
                    return new ArrayList();
                }
        }
        return new ArrayList();
    }

    @Override // xj.g
    public final Object g(Object obj) throws JSONException {
        switch (this.f9580a) {
            case 0:
                z zVar = (z) obj;
                l.e(zVar, "input");
                return new rj.a(zVar.f797a, zVar.f798b, zVar.f799c, zVar.f800d);
            case 1:
                bj.a aVar = (bj.a) obj;
                if (aVar == null) {
                    return null;
                }
                return new rj.e(-1L, aVar.f2770a, aVar.f2771b, aVar.f2772c, aVar.f2773d.name(), String.valueOf(aVar.f2774e), aVar.f2775f, aVar.f2776g, String.valueOf(aVar.f2777h), String.valueOf(aVar.f2778i), String.valueOf(aVar.j), String.valueOf(aVar.k), String.valueOf(aVar.f2779l), String.valueOf(aVar.f2780m), aVar.f2781n);
            case 2:
                JSONObject jSONObject = (JSONObject) obj;
                l.e(jSONObject, "input");
                String string = jSONObject.getString("device_connection_id");
                l.d(string, "getString(...)");
                Integer numY = xu.d.y("device_connection_type", jSONObject);
                Integer numY2 = xu.d.y("device_connection_mobile_subtype", jSONObject);
                Long lC = xu.d.C("device_connection_start_time", jSONObject);
                Long lC2 = xu.d.C("device_connection_end_time", jSONObject);
                f fVarC = p.c(xu.d.K("device_connection_cell_tower", jSONObject));
                String strK = xu.d.K("device_connection_wifi_bssid", jSONObject);
                Boolean boolR = xu.d.r("device_connection_is_roaming", jSONObject);
                return new s(string, numY, numY2, lC, lC2, fVarC, strK, boolR != null ? boolR.booleanValue() : false, f0.y(xu.d.K("device_connection_location", jSONObject)), null, null, xu.d.y("device_connection_nr_state", jSONObject), xu.d.C("device_connection_last_task_time", jSONObject), xu.d.C("device_connection_initial_bytes_tx", jSONObject), xu.d.C("device_connection_initial_bytes_tx_wifi", jSONObject), xu.d.C("device_connection_initial_bytes_tx_cell", jSONObject), xu.d.C("device_connection_initial_bytes_rx", jSONObject), xu.d.C("device_connection_initial_bytes_rx_wifi", jSONObject), xu.d.C("device_connection_initial_bytes_rx_cell", jSONObject), 1536);
            case 3:
                a0 a0Var = (a0) obj;
                l.e(a0Var, "input");
                return new k(a0Var.f17633a, a0Var.f17634b, a0Var.f17635c, a0Var.j, a0Var.f17642l);
            case 4:
                Bundle bundle = (Bundle) obj;
                l.e(bundle, "input");
                long j = bundle.getLong("com.opensignal.sdk.data.receiver.SDK_INTENT_EXTRA_PIPELINE_ID");
                String string2 = bundle.getString("com.opensignal.sdk.data.receiver.SDK_INTENT_EXTRA_PIPELINE_TASK");
                if (string2 == null) {
                    string2 = "";
                }
                return new si.a(j, string2, bundle.containsKey("key_initial_delay") ? new gk.c(null, bundle.getLong("key_initial_delay"), bundle.getLong("key_repeat_period"), bundle.getInt("key_repeat_count"), bundle.getLong("key_last_successful_execution_time"), bundle.getLong("key_schedule_execution_time"), 0L, bundle.getInt("key_current_execution_count"), false, false, 7459) : gk.c.f9613n);
            case j.STRING_FIELD_NUMBER /* 5 */:
                Bundle bundle2 = (Bundle) obj;
                l.e(bundle2, "input");
                long j7 = bundle2.getLong("com.opensignal.sdk.data.receiver.SDK_INTENT_EXTRA_PIPELINE_ID");
                String string3 = bundle2.getString("com.opensignal.sdk.data.receiver.SDK_INTENT_EXTRA_PIPELINE_TASK");
                if (string3 == null) {
                    string3 = "";
                }
                return new si.a(j7, string3, bundle2.containsKey("key_initial_delay") ? new gk.c(null, bundle2.getLong("key_initial_delay"), bundle2.getLong("key_repeat_period"), bundle2.getInt("key_repeat_count"), bundle2.getLong("key_last_successful_execution_time"), bundle2.getLong("key_schedule_execution_time"), 0L, bundle2.getInt("key_current_execution_count"), false, false, 7459) : gk.c.f9613n);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = (String) obj;
                l.e(str, "input");
                JSONObject jSONObject2 = tt.l.D0(str) ? new JSONObject() : new JSONObject(str);
                double dOptDouble = jSONObject2.optDouble("latitude", 0.0d);
                double dOptDouble2 = jSONObject2.optDouble("longitude", 0.0d);
                String strOptString = jSONObject2.optString("provider", "saved");
                l.d(strOptString, "optString(...)");
                long jOptLong = jSONObject2.optLong("elapsedRealTimeMillis", -1L);
                long jOptLong2 = jSONObject2.optLong("receiveTime", -1L);
                long jOptLong3 = jSONObject2.optLong("utcTime", -1L);
                double dOptDouble3 = jSONObject2.optDouble("altitude", 0.0d);
                Float fV = xu.d.v("speed", jSONObject2);
                float fFloatValue = fV != null ? fV.floatValue() : 0.0f;
                Float fV2 = xu.d.v("bearing", jSONObject2);
                float fFloatValue2 = fV2 != null ? fV2.floatValue() : 0.0f;
                Float fV3 = xu.d.v("accuracy", jSONObject2);
                return new u(dOptDouble, dOptDouble2, strOptString, jOptLong, jOptLong2, jOptLong3, dOptDouble3, fFloatValue, fFloatValue2, fV3 != null ? fV3.floatValue() : 0.0f, jSONObject2.optInt("satelliteCount", 0), jSONObject2.optBoolean("isFromMockProvider", false), xu.d.t("mslAltitudeMeters", jSONObject2), xu.d.v("mslAltitudeAccuracyMeters", jSONObject2), xu.d.v("altitudeAccuracyMeters", jSONObject2));
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                JSONObject jSONObject3 = (JSONObject) obj;
                l.e(jSONObject3, "input");
                String string4 = jSONObject3.getString("url");
                l.d(string4, "getString(...)");
                return new g(string4, xu.d.K("location", jSONObject3), jSONObject3.optInt("endpoint_type"), jSONObject3.optInt("response_code"), jSONObject3.optLong("latency_ms"), xu.d.K("exception", jSONObject3), Long.valueOf(jSONObject3.optLong("connection_timeout_ms")), xu.d.C("test_timeout_ms", jSONObject3));
            case j.BYTES_FIELD_NUMBER /* 8 */:
                JSONObject jSONObject4 = (JSONObject) obj;
                l.e(jSONObject4, "input");
                return new a0(xu.d.K("JOB_RESULT_ENDPOINT_NAME", jSONObject4), xu.d.K("JOB_RESULT_ENDPOINT_URL", jSONObject4), xu.d.K("JOB_RESULT_HOSTNAME", jSONObject4), xu.d.v("JOB_RESULT_MEAN", jSONObject4), xu.d.v("JOB_RESULT_MEDIAN", jSONObject4), xu.d.y("JOB_RESULT_MIN", jSONObject4), xu.d.y("JOB_RESULT_MAX", jSONObject4), xu.d.y("JOB_RESULT_NR", jSONObject4), xu.d.K("JOB_RESULT_FULL", jSONObject4), xu.d.K("JOB_RESULT_IP", jSONObject4), xu.d.v("JOB_RESULT_SUCCESS", jSONObject4), xu.d.K("JOB_RESULT_RESULTS", jSONObject4));
            case 9:
                return b((List) obj);
            case 10:
                return b((List) obj);
            default:
                List list = (List) obj;
                l.e(list, "input");
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(j((g1) it.next()));
                    }
                    return jSONArray;
                } catch (JSONException e4) {
                    n.e("UdpConfigItemMapper", e4);
                    cj.a.G(e4);
                    return new JSONArray();
                }
        }
    }

    public /* synthetic */ a(cj.a aVar, int i10) {
        this.f9580a = i10;
    }
}
