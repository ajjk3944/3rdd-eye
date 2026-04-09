package ai;

import ak.j0;
import br.l;
import ch.n;
import com.google.android.gms.internal.measurement.e5;
import com.opensignal.sdk.domain.model.TaskInfo;
import g4.j;
import java.util.HashMap;
import java.util.Iterator;
import jj.o0;
import ni.a0;
import ni.b1;
import ni.c0;
import ni.c1;
import ni.d1;
import ni.g0;
import ni.g1;
import ni.h0;
import ni.i1;
import ni.q;
import ni.s0;
import ni.t;
import ni.t0;
import ni.u;
import ni.u0;
import ni.v;
import ni.w;
import ni.w0;
import ni.x;
import ni.z;
import ni.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xj.h;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f396a;

    public /* synthetic */ g(int i10) {
        this.f396a = i10;
    }

    public static String b(int i10, String str) {
        return h0.b.m("SP_HTTP_LAT_", i10, str);
    }

    public static wi.h c(o0 o0Var) {
        l.e(o0Var, "input");
        switch (ri.a.f21544a[o0Var.ordinal()]) {
            case 1:
            case 2:
                return wi.h.POWER_STATE;
            case 3:
                return wi.h.DEVICE_SHUTDOWN;
            case 4:
            case j.STRING_FIELD_NUMBER /* 5 */:
                return wi.h.BATTERY_STATE;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return wi.h.SCREEN_STATE;
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return wi.h.RADIO_STATE;
            case 31:
                return wi.h.WIFI_SCAN;
            default:
                n.b("ReceiverTypeMapper", o0Var + " not mapped to ReceiverType");
                return null;
        }
    }

    @Override // xj.h
    public final Object a(Object obj) throws JSONException {
        switch (this.f396a) {
            case 0:
                e eVar = (e) obj;
                l.e(eVar, "input");
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it = eVar.f392g.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((bh.a) it.next()).a());
                }
                jSONObject.put("assistant_results", jSONArray);
                jSONObject.put("assistant_entity_id", eVar.f394i);
                jSONObject.put("assistant_duration_in_millis", eVar.f393h);
                return jSONObject;
            case 1:
                rj.b bVar = (rj.b) obj;
                l.e(bVar, "input");
                return new TaskInfo(bVar.f21550b, "result", bVar.f21551c, bVar.f21553e, -1);
            case 2:
                hk.h hVar = (hk.h) obj;
                l.e(hVar, "input");
                long j = hVar.f10804a;
                String str = hVar.f10805b;
                gk.c cVar = hVar.f10809f;
                return new TaskInfo(j, "result", str, cVar.f9622h, cVar.j);
            case 3:
                rj.f fVar = (rj.f) obj;
                l.e(fVar, "input");
                return new TaskInfo(fVar.f21591a, "", fVar.f21592b, fVar.f21603o, fVar.f21604p);
            case 4:
                e eVar2 = (e) obj;
                l.e(eVar2, "input");
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = eVar2.f392g.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((bh.a) it2.next()).f2745b);
                }
                HashMap map = new HashMap();
                map.put("CONNECTIVITY_ASSISTANT_RESULTS", jSONArray2);
                map.put("CONNECTIVITY_ASSISTANT_ENTITY_ID", eVar2.f394i);
                return map;
            case j.STRING_FIELD_NUMBER /* 5 */:
                ni.n nVar = (ni.n) obj;
                l.e(nVar, "input");
                HashMap map2 = new HashMap();
                map2.put("SP_DL_TTS", Long.valueOf(nVar.f18045g));
                map2.put("SP_DL_SPEED", Long.valueOf(nVar.f18046h));
                map2.put("SP_DL_SPEED_TRIMMED", Long.valueOf(nVar.f18047i));
                map2.put("SP_DL_SIZE", Long.valueOf(nVar.j));
                vc.e.F(map2, "SP_DL_TIME", nVar.k);
                vc.e.F(map2, "SP_DL_FILESIZES", nVar.f18048l);
                vc.e.F(map2, "SP_DL_TIMES", nVar.f18049m);
                map2.put("SP_CDN", nVar.f18050n);
                map2.put("SP_DL_IP", nVar.f18051o);
                map2.put("SP_DL_HOST", nVar.f18052p);
                map2.put("SP_DL_THREADS", Integer.valueOf(nVar.f18053q));
                map2.put("SP_DL_UNRELIABLE", Integer.valueOf(nVar.f18054r));
                vc.e.F(map2, "SP_DL_EVENTS", nVar.f18055s);
                return map2;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                q qVar = (q) obj;
                l.e(qVar, "input");
                HashMap map3 = new HashMap();
                map3.put("_id", Long.valueOf(qVar.f18104a));
                map3.put("TIME", Long.valueOf(qVar.f18109f));
                map3.put("NAME", qVar.f18106c);
                vc.e.F(map3, "END_NC_CAPABILITIES", qVar.f18110g);
                vc.e.F(map3, "END_EXPERIMENTAL", qVar.f18111h);
                Boolean bool = qVar.f18112i;
                vc.e.F(map3, "END_IS_CONNECTED", bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null);
                vc.e.F(map3, "END_NETWORK_STATE", qVar.j);
                vc.e.F(map3, "END_NETWORK_DETAILED_STATE", qVar.k);
                return map3;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                t tVar = (t) obj;
                l.e(tVar, "input");
                HashMap map4 = new HashMap();
                map4.put("_id", Long.valueOf(tVar.f18146a));
                map4.put("TIME", Long.valueOf(tVar.f18151f));
                map4.put("NAME", tVar.f18148c);
                map4.put("APP_VRS_CODE", tVar.f18152g);
                map4.put("DC_VRS_CODE", tVar.f18153h);
                map4.put("DB_VRS_CODE", Integer.valueOf(tVar.f18154i));
                map4.put("ANDROID_VRS", tVar.j);
                map4.put("ANDROID_SDK", Integer.valueOf(tVar.k));
                vc.e.F(map4, "ANDROID_SDK_FULL", tVar.D);
                map4.put("CLIENT_VRS_CODE", Long.valueOf(tVar.f18155l));
                map4.put("COHORT_ID", tVar.f18156m);
                map4.put("REPORT_CONFIG_REVISION", Integer.valueOf(tVar.f18157n));
                map4.put("REPORT_CONFIG_ID", Integer.valueOf(tVar.f18158o));
                map4.put("CONFIG_HASH", tVar.f18159p);
                map4.put("CONNECTION_ID", tVar.f18160q);
                vc.e.F(map4, "CONNECTION_START_TIME", tVar.f18163t);
                vc.e.F(map4, "CONNECTION_END_TIME", tVar.f18164u);
                vc.e.F(map4, "DEVICE_CONNECTION_TYPE", tVar.f18161r);
                vc.e.F(map4, "DEVICE_CONNECTION_MOBILE_SUBTYPE", tVar.f18162s);
                vc.e.F(map4, "DEVICE_CONNECTION_WIFI_BSSID", tVar.f18166w);
                ak.f fVar2 = tVar.f18165v;
                vc.e.F(map4, "DEVICE_CONNECTION_CELL_TOWER", fVar2 != null ? fVar2.a().toString() : null);
                map4.put("DEVICE_CONNECTION_IS_ROAMING", Integer.valueOf(tVar.f18167x ? 1 : 0));
                vc.e.F(map4, "DEVICE_CONNECTION_NETWORK_ID_SIM", tVar.f18169z);
                vc.e.F(map4, "DEVICE_CONNECTION_NETWORK_NAME_SIM", tVar.A);
                c0 c0Var = tVar.f18168y;
                if (c0Var != null) {
                    Double d6 = c0Var.f17698c;
                    Double d10 = c0Var.f17697b;
                    if (d10 != null && d6 != null) {
                        vc.e.F(map4, "ALTITUDE", c0Var.f17696a);
                        vc.e.F(map4, "LATITUDE", d10);
                        vc.e.F(map4, "LONGITUDE", d6);
                        vc.e.F(map4, "LOC_ACCURACY", c0Var.f17699d);
                        vc.e.F(map4, "LOC_AGE", c0Var.f17700e);
                        Boolean bool2 = c0Var.f17701f;
                        vc.e.F(map4, "LOC_MOCKING_ENABLED", bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null);
                        vc.e.F(map4, "LOC_SPEED", c0Var.f17702g);
                        vc.e.F(map4, "LOC_TIME", c0Var.f17703h);
                        vc.e.F(map4, "LOC_PROVIDER", c0Var.f17704i);
                        vc.e.F(map4, "LOC_MSL_ALTITUDE_METERS", c0Var.j);
                        vc.e.F(map4, "LOC_MSL_ALTITUDE_ACCURACY_METERS", c0Var.k);
                        vc.e.F(map4, "ALTITUDE_ACCURACY_METERS", c0Var.f17705l);
                    }
                }
                vc.e.F(map4, "DEVICE_CONNECTION_NR_STATE", tVar.B);
                vc.e.F(map4, "DEVICE_CONNECTION_LAST_TASK_TIME", tVar.C);
                return map4;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                if (obj != null) {
                    throw new ClassCastException();
                }
                l.e(null, "input");
                throw null;
            case 9:
                u uVar = (u) obj;
                l.e(uVar, "input");
                HashMap map5 = new HashMap();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = uVar.f18200g.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((fh.g) it3.next()).b());
                }
                vc.e.F(map5, "HTTP_HEAD_LATENCY", jSONArray3.toString());
                return map5;
            case 10:
                w wVar = (w) obj;
                l.e(wVar, "input");
                HashMap map6 = new HashMap();
                vc.e.F(map6, "THROUGHPUT_ICMP_CONFIG_PACKET_COUNT", wVar.f18257g);
                vc.e.F(map6, "THROUGHPUT_ICMP_CONFIG_PACKET_SIZE", wVar.f18258h);
                vc.e.F(map6, "THROUGHPUT_ICMP_CONFIG_PACKET_DELAY", wVar.f18259i);
                vc.e.F(map6, "THROUGHPUT_ICMP_CONFIG_ARGUMENTS", wVar.j);
                vc.e.F(map6, "THROUGHPUT_ICMP_MAX_LATENCY", wVar.f18261m);
                vc.e.F(map6, "THROUGHPUT_ICMP_MIN_LATENCY", wVar.f18262n);
                vc.e.F(map6, "THROUGHPUT_ICMP_AVG_LATENCY", wVar.f18263o);
                vc.e.F(map6, "THROUGHPUT_ICMP_PACKETS_SENT", wVar.f18264p);
                vc.e.F(map6, "THROUGHPUT_ICMP_PACKETS_LOST", wVar.f18265q);
                vc.e.F(map6, "THROUGHPUT_ICMP_PACKETS_LOST_PERCENTAGE", wVar.f18266r);
                vc.e.F(map6, "THROUGHPUT_ICMP_BYTES_SENT", wVar.f18267s);
                vc.e.F(map6, "THROUGHPUT_ICMP_TEST_STATUS", wVar.k);
                vc.e.F(map6, "THROUGHPUT_ICMP_TEST_SERVER", wVar.f18260l);
                vc.e.F(map6, "THROUGHPUT_ICMP_EVENTS", wVar.f18268t);
                return map6;
            case 11:
                v vVar = (v) obj;
                l.e(vVar, "input");
                HashMap map7 = new HashMap();
                vc.e.F(map7, "THROUGHPUT_ICMP_CONFIG_PACKET_COUNT", vVar.f18224g);
                vc.e.F(map7, "THROUGHPUT_ICMP_CONFIG_PACKET_SIZE", vVar.f18225h);
                vc.e.F(map7, "THROUGHPUT_ICMP_CONFIG_PACKET_DELAY", vVar.f18226i);
                vc.e.F(map7, "THROUGHPUT_ICMP_CONFIG_ARGUMENTS", vVar.j);
                vc.e.F(map7, "THROUGHPUT_ICMP_MAX_LATENCY", vVar.f18228m);
                vc.e.F(map7, "THROUGHPUT_ICMP_MIN_LATENCY", vVar.f18229n);
                vc.e.F(map7, "THROUGHPUT_ICMP_AVG_LATENCY", vVar.f18230o);
                vc.e.F(map7, "THROUGHPUT_ICMP_PACKETS_SENT", vVar.f18231p);
                vc.e.F(map7, "THROUGHPUT_ICMP_PACKETS_LOST", vVar.f18232q);
                vc.e.F(map7, "THROUGHPUT_ICMP_PACKETS_LOST_PERCENTAGE", vVar.f18233r);
                vc.e.F(map7, "THROUGHPUT_ICMP_BYTES_SENT", vVar.f18234s);
                vc.e.F(map7, "THROUGHPUT_ICMP_TEST_STATUS", vVar.k);
                vc.e.F(map7, "THROUGHPUT_ICMP_TEST_SERVER", vVar.f18227l);
                vc.e.F(map7, "THROUGHPUT_ICMP_TRACEROUTE_TEST_STATUS", vVar.f18235t);
                vc.e.F(map7, "THROUGHPUT_ICMP_TRACEROUTE_NODE_INFO", vVar.f18236u);
                vc.e.F(map7, "THROUGHPUT_ICMP_TRACEROUTE_TTL", vVar.f18237v);
                vc.e.F(map7, "THROUGHPUT_ICMP_EVENTS", vVar.f18238w);
                vc.e.F(map7, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_PACKET_DELAY", vVar.f18239x);
                vc.e.F(map7, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_PACKET_COUNT", vVar.f18240y);
                vc.e.F(map7, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_MAX_HOP_COUNT", vVar.f18241z);
                vc.e.F(map7, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_MAX_NODE_TIMEOUT", vVar.A);
                vc.e.F(map7, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_IP_MASK_COUNT", vVar.B);
                return map7;
            case 12:
                x xVar = (x) obj;
                l.e(xVar, "input");
                HashMap map8 = new HashMap();
                vc.e.F(map8, "THROUGHPUT_ICMP_TRACEROUTE_TEST_STATUS", xVar.f18284g);
                vc.e.F(map8, "THROUGHPUT_ICMP_TRACEROUTE_NODE_INFO", xVar.f18285h);
                vc.e.F(map8, "THROUGHPUT_ICMP_TRACEROUTE_TTL", xVar.f18286i);
                vc.e.F(map8, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_PACKET_DELAY", xVar.k);
                vc.e.F(map8, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_PACKET_COUNT", xVar.f18287l);
                vc.e.F(map8, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_MAX_HOP_COUNT", xVar.f18288m);
                vc.e.F(map8, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_MAX_NODE_TIMEOUT", xVar.f18289n);
                vc.e.F(map8, "THROUGHPUT_ICMP_TRACEROUTE_CONFIG_IP_MASK_COUNT", xVar.f18290o);
                vc.e.F(map8, "THROUGHPUT_ICMP_TRACEROUTE_EVENTS", xVar.j);
                return map8;
            case 13:
                z zVar = (z) obj;
                l.e(zVar, "input");
                HashMap map9 = new HashMap();
                vc.e.F(map9, "SP_LAT_UNRELIABLE", zVar.f18321g);
                vc.e.F(map9, "SP_LAT_EVENTS", zVar.j);
                int i10 = 0;
                for (Object obj2 : zVar.f18323i) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        e5.Q();
                        throw null;
                    }
                    a0 a0Var = (a0) obj2;
                    vc.e.F(map9, b(i10, "_NAME"), a0Var.f17633a);
                    vc.e.F(map9, b(i10, "_URL"), a0Var.f17634b);
                    vc.e.F(map9, b(i10, "_MEAN"), a0Var.f17636d);
                    vc.e.F(map9, b(i10, "_MEDIAN"), a0Var.f17637e);
                    vc.e.F(map9, b(i10, "_SUCC"), a0Var.k);
                    vc.e.F(map9, b(i10, "_MAX"), a0Var.f17639g);
                    vc.e.F(map9, b(i10, "_MIN"), a0Var.f17638f);
                    vc.e.F(map9, b(i10, "_FULL"), a0Var.f17641i);
                    vc.e.F(map9, b(i10, "_NR"), a0Var.f17640h);
                    vc.e.F(map9, b(i10, "_IP"), a0Var.j);
                    vc.e.F(map9, b(i10, "_HOST"), a0Var.f17635c);
                    i10 = i11;
                }
                return map9;
            case 14:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? 0 : -1);
            case 15:
                g0 g0Var = (g0) obj;
                l.e(g0Var, "input");
                HashMap map10 = new HashMap();
                vc.e.F(map10, "PUBLIC_IP", g0Var.f17852g);
                return map10;
            case 16:
                h0 h0Var = (h0) obj;
                l.e(h0Var, "input");
                HashMap map11 = new HashMap();
                vc.e.F(map11, "TRIGGER_TYPE", h0Var.f17890g);
                return map11;
            case 17:
                ni.o0 o0Var = (ni.o0) obj;
                l.e(o0Var, "input");
                HashMap map12 = new HashMap();
                vc.e.F(map12, "TASK_EVENTS", o0Var.f18072g);
                return map12;
            case 18:
                s0 s0Var = (s0) obj;
                l.e(s0Var, "input");
                HashMap map13 = new HashMap();
                map13.put("THROUGHPUT_DOWNLOAD_SPEED", Double.valueOf(s0Var.f18134g));
                map13.put("THROUGHPUT_DOWNLOAD_SPEED_TEST_BYTES_ONLY", Double.valueOf(s0Var.f18135h));
                vc.e.F(map13, "THROUGHPUT_DOWNLOAD_TEST_SERVER", s0Var.f18136i);
                vc.e.F(map13, "THROUGHPUT_DOWNLOAD_AWS_DIAGNOSTIC", s0Var.j);
                map13.put("THROUGHPUT_DOWNLOAD_TEST_SIZE", Long.valueOf(s0Var.k));
                map13.put("THROUGHPUT_DOWNLOAD_TEST_STATUS", Integer.valueOf(s0Var.f18137l));
                map13.put("THROUGHPUT_DOWNLOAD_DNS_LOOKUP_TIME", Integer.valueOf(s0Var.f18138m));
                map13.put("THROUGHPUT_DOWNLOAD_TTFA", Integer.valueOf(s0Var.f18139n));
                map13.put("THROUGHPUT_DOWNLOAD_TTFB", Integer.valueOf(s0Var.f18140o));
                vc.e.F(map13, "THROUGHPUT_DOWNLOAD_AWS_EDGE_LOCATION", s0Var.f18141p);
                vc.e.F(map13, "THROUGHPUT_DOWNLOAD_AWS_X_CACHE", s0Var.f18142q);
                vc.e.F(map13, "THROUGHPUT_DOWNLOAD_TIMES", s0Var.f18143r);
                vc.e.F(map13, "THROUGHPUT_DOWNLOAD_CUMULATIVE_BYTES", s0Var.f18144s);
                vc.e.F(map13, "THROUGHPUT_DOWNLOAD_EVENTS", s0Var.f18145t);
                return map13;
            case 19:
                t0 t0Var = (t0) obj;
                l.e(t0Var, "input");
                HashMap map14 = new HashMap();
                map14.put("THROUGHPUT_SERVER_RESPONSE_MIN_LATENCY", Double.valueOf(t0Var.f18176g));
                map14.put("THROUGHPUT_SERVER_RESPONSE_MAX_LATENCY", Double.valueOf(t0Var.f18177h));
                map14.put("THROUGHPUT_SERVER_RESPONSE_AVG_LATENCY", Double.valueOf(t0Var.f18178i));
                map14.put("THROUGHPUT_SERVER_RESPONSE_MIN_JITTER", Double.valueOf(t0Var.j));
                map14.put("THROUGHPUT_SERVER_RESPONSE_MAX_JITTER", Double.valueOf(t0Var.k));
                map14.put("THROUGHPUT_SERVER_RESPONSE_AVG_JITTER", Double.valueOf(t0Var.f18179l));
                map14.put("THROUGHPUT_SERVER_RESPONSE_PACKETS_SENT", Integer.valueOf(t0Var.f18180m));
                map14.put("THROUGHPUT_SERVER_RESPONSE_PACKETS_DISCARDED", Integer.valueOf(t0Var.f18181n));
                map14.put("THROUGHPUT_SERVER_RESPONSE_PACKETS_DISCARD_PERCENTAGE", Double.valueOf(t0Var.f18182o));
                map14.put("THROUGHPUT_SERVER_RESPONSE_PACKETS_LOST", Integer.valueOf(t0Var.f18183p));
                map14.put("THROUGHPUT_SERVER_RESPONSE_PACKETS_LOST_PERCENTAGE", Double.valueOf(t0Var.f18184q));
                vc.e.F(map14, "THROUGHPUT_SERVER_RESPONSE_TEST_SERVER", t0Var.f18185r);
                map14.put("THROUGHPUT_SERVER_RESPONSE_CONFIG_NUMBER_OF_PACKETS", Integer.valueOf(t0Var.f18186s));
                map14.put("THROUGHPUT_SERVER_RESPONSE_CONFIG_PACKET_SIZE", Integer.valueOf(t0Var.f18187t));
                map14.put("THROUGHPUT_SERVER_RESPONSE_CONFIG_PACKET_DELAY", Integer.valueOf(t0Var.f18188u));
                map14.put("THROUGHPUT_SERVER_RESPONSE_TEST_STATUS", Integer.valueOf(t0Var.f18189v));
                map14.put("THROUGHPUT_SERVER_RESPONSE_DNS_LOOKUP_TIME", Integer.valueOf(t0Var.f18190w));
                vc.e.F(map14, "THROUGHPUT_SERVER_RESPONSE_SENT_TIMES", t0Var.f18191x);
                vc.e.F(map14, "THROUGHPUT_SERVER_RESPONSE_RECEIVED_TIMES", t0Var.f18192y);
                vc.e.F(map14, "THROUGHPUT_SERVER_RESPONSE_RECEIVED_PACKETS", t0Var.f18193z);
                vc.e.F(map14, "THROUGHPUT_SERVER_RESPONSE_EVENTS", t0Var.A);
                vc.e.F(map14, "THROUGHPUT_SERVER_RESPONSE_VERSION", t0Var.B);
                vc.e.F(map14, "THROUGHPUT_SERVER_RESPONSE_VERIFICATION_STATUSES", t0Var.C);
                return map14;
            case 20:
                u0 u0Var = (u0) obj;
                l.e(u0Var, "input");
                HashMap map15 = new HashMap();
                map15.put("THROUGHPUT_UPLOAD_SPEED", Double.valueOf(u0Var.f18207g));
                map15.put("THROUGHPUT_UPLOAD_SPEED_TEST_BYTES_ONLY", Double.valueOf(u0Var.f18208h));
                vc.e.F(map15, "THROUGHPUT_UPLOAD_TEST_SERVER", u0Var.f18209i);
                map15.put("THROUGHPUT_UPLOAD_TEST_SERVER_TIMESTAMP", Long.valueOf(u0Var.j));
                map15.put("THROUGHPUT_UPLOAD_TEST_SIZE", Long.valueOf(u0Var.k));
                map15.put("THROUGHPUT_UPLOAD_TEST_STATUS", Integer.valueOf(u0Var.f18210l));
                map15.put("THROUGHPUT_UPLOAD_DNS_LOOKUP_TIME", Integer.valueOf(u0Var.f18211m));
                map15.put("THROUGHPUT_UPLOAD_TTFA", Integer.valueOf(u0Var.f18212n));
                vc.e.F(map15, "THROUGHPUT_UPLOAD_AWS_DIAGNOSTIC", u0Var.f18213o);
                vc.e.F(map15, "THROUGHPUT_UPLOAD_AWS_EDGE_LOCATION", u0Var.f18214p);
                vc.e.F(map15, "THROUGHPUT_UPLOAD_TIMES", u0Var.f18215q);
                vc.e.F(map15, "THROUGHPUT_UPLOAD_CUMULATIVE_BYTES", u0Var.f18216r);
                vc.e.F(map15, "THROUGHPUT_UPLOAD_EVENTS", u0Var.f18217s);
                return map15;
            case 21:
                w0 w0Var = (w0) obj;
                l.e(w0Var, "input");
                HashMap map16 = new HashMap();
                map16.put("TIME", Long.valueOf(w0Var.f18274f));
                JSONArray jSONArray4 = w0Var.f18275g;
                vc.e.F(map16, "TRACEROUTE", jSONArray4 != null ? jSONArray4.toString() : null);
                vc.e.F(map16, "TR_EVENTS", w0Var.f18276h.toString());
                vc.e.F(map16, "TR_ENDPOINT", w0Var.f18277i);
                vc.e.F(map16, "TR_IP_ADDRESS", w0Var.j);
                return map16;
            case 22:
                z0 z0Var = (z0) obj;
                l.e(z0Var, "input");
                HashMap map17 = new HashMap();
                map17.put("UDP_ECHO_FACTOR", Long.valueOf(dr.a.G(z0Var.j)));
                vc.e.F(map17, "UDP_EVENTS", z0Var.f18339r);
                vc.e.F(map17, "UDP_HOST", z0Var.f18334m);
                vc.e.F(map17, "UDP_IP", z0Var.f18333l);
                map17.put("UDP_NETWORK_CHANGED", Integer.valueOf(z0Var.f18338q ? 1 : 0));
                map17.put("UDP_PACKETS_SENT", Integer.valueOf(z0Var.f18330g));
                map17.put("UDP_PAYLOAD_SIZE", Integer.valueOf(z0Var.f18331h));
                vc.e.F(map17, "UDP_RECEIVED_TIMES", z0Var.f18336o);
                vc.e.F(map17, "UDP_SENT_TIMES", z0Var.f18335n);
                map17.put("UDP_TARGET_SEND_KBPS", Integer.valueOf(z0Var.f18332i));
                map17.put("UDP_TEST_NAME", z0Var.f18340s);
                vc.e.F(map17, "UDP_VERIFICATION_STATUSES", z0Var.f18341t);
                vc.e.F(map17, "UDP_VERSION", z0Var.f18342u);
                return map17;
            case 23:
                b1 b1Var = (b1) obj;
                l.e(b1Var, "input");
                HashMap map18 = new HashMap();
                vc.e.F(map18, "UDP_VERIFICATION_PROBES_SENT_COUNT", b1Var.f17678h);
                vc.e.F(map18, "UDP_VERIFICATION_PROBES_RECEIVED_COUNT", b1Var.f17679i);
                vc.e.F(map18, "UDP_VERIFICATION_PROBES_RECEIVED_SUCCESSFUL_COUNT", b1Var.j);
                vc.e.F(map18, "UDP_VERIFICATION_RESPONSE", b1Var.f17680l);
                vc.e.F(map18, "UDP_VERIFICATION_EVENTS", b1Var.k);
                vc.e.F(map18, "UDP_VERIFICATION_SENT_TIMES", b1Var.f17681m);
                vc.e.F(map18, "UDP_VERIFICATION_RECEIVED_TIMES", b1Var.f17682n);
                Boolean bool3 = b1Var.f17683o;
                vc.e.F(map18, "UDP_VERIFICATION_PAYLOAD_IS_VALID", bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null);
                Boolean bool4 = b1Var.f17684p;
                vc.e.F(map18, "UDP_VERIFICATION_RESPONSE_IS_VALID", bool4 != null ? Integer.valueOf(bool4.booleanValue() ? 1 : 0) : null);
                vc.e.F(map18, "UDP_VERIFICATION_RESPONSE_AGE_MS", b1Var.f17685q);
                vc.e.F(map18, "UDP_VERIFICATION_RAW_RESPONSES", b1Var.f17686r);
                return map18;
            case 24:
                c1 c1Var = (c1) obj;
                l.e(c1Var, "input");
                HashMap map19 = new HashMap();
                map19.put("SP_UL_TTS", Long.valueOf(c1Var.f17712g));
                map19.put("SP_UL_SPEED", Long.valueOf(c1Var.f17713h));
                map19.put("SP_UL_SPEED_TRIMMED", Long.valueOf(c1Var.f17714i));
                map19.put("SP_UL_SIZE", Long.valueOf(c1Var.j));
                vc.e.F(map19, "SP_UL_TIME", c1Var.k);
                vc.e.F(map19, "SP_UL_FILESIZES", c1Var.f17715l);
                vc.e.F(map19, "SP_UL_TIMES", c1Var.f17716m);
                map19.put("SP_UL_IP", c1Var.f17717n);
                map19.put("SP_UL_HOST", c1Var.f17718o);
                map19.put("SP_UL_THREADS", Integer.valueOf(c1Var.f17719p));
                map19.put("SP_UL_CDN", c1Var.f17720q);
                map19.put("SP_UL_UNRELIABLE", Integer.valueOf(c1Var.f17721r));
                vc.e.F(map19, "SP_UL_EVENTS", c1Var.f17722s);
                map19.put("SP_UL_MONITOR_TYPE", Integer.valueOf(c1Var.f17723t));
                map19.put("SP_UL_SPEED_BUFF", Long.valueOf(c1Var.f17724u));
                map19.put("SP_UL_SPEED_TRIMMED_BUFF", Long.valueOf(c1Var.f17725v));
                vc.e.F(map19, "SP_UL_SPEED_BUFFER_SIZES", c1Var.f17727x);
                vc.e.F(map19, "SP_UL_SPEED_BUFFER_TIMES", c1Var.f17728y);
                return map19;
            case 25:
                d1 d1Var = (d1) obj;
                l.e(d1Var, "input");
                HashMap map20 = new HashMap();
                map20.put("VT_INITIALISATION_TIME", Long.valueOf(d1Var.f17747h));
                map20.put("VT_TIME_TO_FIRST_FRAME", Long.valueOf(d1Var.f17748i));
                map20.put("VT_BUFFERING_TIME", Long.valueOf(d1Var.j));
                map20.put("VT_BUFFERING_COUNTER", Long.valueOf(d1Var.k));
                map20.put("VT_SEEKING_TIME", Long.valueOf(d1Var.f17749l));
                map20.put("VT_SEEKING_COUNTER", Long.valueOf(d1Var.f17750m));
                map20.put("VT_EVENTS", d1Var.f17751n);
                map20.put("VT_TRAFFIC", d1Var.f17752o);
                map20.put("VT_PLATFORM_TESTED", d1Var.f17753p);
                map20.put("VT_INTERFACE_USED", d1Var.f17754q);
                map20.put("VT_RESOURCE_USED", d1Var.f17755r);
                map20.put("VT_RESOURCE_DURATION", Long.valueOf(d1Var.f17756s));
                map20.put("VT_NETWORK_CHANGED", Integer.valueOf(d1Var.f17757t ? 1 : 0));
                map20.put("VT_REQUESTED_QUALITY", d1Var.f17758u);
                map20.put("VT_QUALITY_CHANGED", Integer.valueOf(d1Var.f17759v ? 1 : 0));
                map20.put("VT_HOST", d1Var.f17760w);
                map20.put("VT_IP", d1Var.f17761x);
                map20.put("VT_TEST_DURATION", Long.valueOf(d1Var.f17762y));
                map20.put("VT_BITRATE", Long.valueOf(d1Var.f17763z));
                map20.put("VT_MIME", d1Var.A);
                map20.put("VT_VIDEO_HEIGHT", Integer.valueOf(d1Var.C));
                map20.put("VT_VIDEO_WIDTH", Integer.valueOf(d1Var.B));
                map20.put("VT_CODEC", d1Var.D);
                map20.put("VT_PROFILE", Integer.valueOf(d1Var.E));
                map20.put("VT_LEVEL", Integer.valueOf(d1Var.F));
                map20.put("VT_INITIAL_BUFFER_TIME", Double.valueOf(d1Var.G));
                map20.put("VT_STALLING_RATIO", Double.valueOf(d1Var.H));
                map20.put("VT_VIDEO_PLAY_DURATION", Double.valueOf(d1Var.I));
                map20.put("VT_VIDEO_RESOLUTION", Integer.valueOf(d1Var.J));
                map20.put("VT_VIDEO_CODE", Integer.valueOf(d1Var.K));
                map20.put("VT_VIDEO_CODE_PROFILE", Integer.valueOf(d1Var.L));
                map20.put("VT_BUFFERING_UPDATES", d1Var.M);
                map20.put("VT_TIMEOUT_REASON", Integer.valueOf(d1Var.N));
                map20.put("VT_REQUESTED_VIDEO_LENGTH", Long.valueOf(d1Var.O));
                map20.put("VT_SCREEN_INFO", d1Var.P);
                vc.e.F(map20, "EXOPLAYER_VERSION", d1Var.Q);
                Boolean bool5 = d1Var.R;
                vc.e.F(map20, "EXOPLAYER_DASH_AVAILABLE", bool5 != null ? Integer.valueOf(bool5.booleanValue() ? 1 : 0) : null);
                vc.e.F(map20, "EXOPLAYER_DASH_INFERRED_VERSION", d1Var.S);
                Boolean bool6 = d1Var.T;
                vc.e.F(map20, "EXOPLAYER_HLS_AVAILABLE", bool6 != null ? Integer.valueOf(bool6.booleanValue() ? 1 : 0) : null);
                vc.e.F(map20, "EXOPLAYER_HLS_INFERRED_VERSION", d1Var.U);
                Boolean bool7 = d1Var.V;
                vc.e.F(map20, "VT_IGNORE_SCREEN_RESOLUTION", bool7 != null ? Integer.valueOf(bool7.booleanValue() ? 1 : 0) : null);
                vc.e.F(map20, "MEDIA3_VERSION", d1Var.W);
                Boolean bool8 = d1Var.Y;
                vc.e.F(map20, "MEDIA3_DASH_AVAILABLE", bool8 != null ? Integer.valueOf(bool8.booleanValue() ? 1 : 0) : null);
                Boolean bool9 = d1Var.X;
                vc.e.F(map20, "MEDIA3_HLS_AVAILABLE", bool9 != null ? Integer.valueOf(bool9.booleanValue() ? 1 : 0) : null);
                return map20;
            case 26:
                g1 g1Var = (g1) obj;
                l.e(g1Var, "input");
                HashMap map21 = new HashMap();
                vc.e.F(map21, "WF_INFORMATION_ELEMENTS", g1Var.f17859g);
                return map21;
            case 27:
                i1 i1Var = (i1) obj;
                l.e(i1Var, "input");
                HashMap map22 = new HashMap();
                i1Var.toString();
                n.a();
                map22.put("_id", Long.valueOf(i1Var.f17923a));
                map22.put("TIME", Long.valueOf(i1Var.f17928f));
                map22.put("NAME", i1Var.f17925c);
                map22.put("APP_VRS_CODE", i1Var.f17929g);
                map22.put("DC_VRS_CODE", i1Var.f17930h);
                map22.put("DB_VRS_CODE", Integer.valueOf(i1Var.f17931i));
                map22.put("ANDROID_VRS", i1Var.j);
                map22.put("ANDROID_SDK", Integer.valueOf(i1Var.k));
                vc.e.F(map22, "ANDROID_SDK_FULL", i1Var.f17932l);
                map22.put("CLIENT_VRS_CODE", Long.valueOf(i1Var.f17933m));
                map22.put("COHORT_ID", i1Var.f17934n);
                map22.put("REPORT_CONFIG_REVISION", Integer.valueOf(i1Var.f17935o));
                map22.put("REPORT_CONFIG_ID", Integer.valueOf(i1Var.f17936p));
                map22.put("CONFIG_HASH", i1Var.f17937q);
                vc.e.F(map22, "CONNECTION_ID", i1Var.f17938r);
                vc.e.F(map22, "CONNECTION_START_TIME", i1Var.f17939s);
                c0 c0Var2 = i1Var.B;
                if (c0Var2 != null) {
                    Double d11 = c0Var2.f17698c;
                    Double d12 = c0Var2.f17697b;
                    if (d12 != null && d11 != null) {
                        vc.e.F(map22, "ALTITUDE", c0Var2.f17696a);
                        vc.e.F(map22, "LATITUDE", d12);
                        vc.e.F(map22, "LONGITUDE", d11);
                        vc.e.F(map22, "LOC_ACCURACY", c0Var2.f17699d);
                        vc.e.F(map22, "LOC_AGE", c0Var2.f17700e);
                        Boolean bool10 = c0Var2.f17701f;
                        vc.e.F(map22, "LOC_MOCKING_ENABLED", bool10 != null ? Integer.valueOf(bool10.booleanValue() ? 1 : 0) : null);
                        vc.e.F(map22, "LOC_SPEED", c0Var2.f17702g);
                        vc.e.F(map22, "LOC_TIME", c0Var2.f17703h);
                        vc.e.F(map22, "LOC_PROVIDER", c0Var2.f17704i);
                        vc.e.F(map22, "LOC_MSL_ALTITUDE_METERS", c0Var2.j);
                        vc.e.F(map22, "LOC_MSL_ALTITUDE_ACCURACY_METERS", c0Var2.k);
                        vc.e.F(map22, "ALTITUDE_ACCURACY_METERS", c0Var2.f17705l);
                    }
                }
                map22.put("WF_BSSID", i1Var.f17940t);
                map22.put("WF_SSID", i1Var.f17941u);
                map22.put("WF_RSSI", Integer.valueOf(i1Var.f17942v));
                map22.put("WF_FREQUENCY", Integer.valueOf(i1Var.f17943w));
                map22.put("WF_CAPABILITIES", i1Var.f17944x);
                vc.e.F(map22, "WF_CHANNEL_WIDTH", i1Var.f17945y);
                vc.e.F(map22, "WF_STANDARD", i1Var.f17946z);
                vc.e.F(map22, "WF_INFORMATION_ELEMENTS", i1Var.A);
                return map22;
            case 28:
                return c((o0) obj);
            default:
                j0 j0Var = (j0) obj;
                l.e(j0Var, "input");
                return new ak.j(j0Var.f574r, j0Var.f575s, j0Var.f561c, j0Var.f578v, j0Var.f576t, j0Var.f577u);
        }
    }
}
