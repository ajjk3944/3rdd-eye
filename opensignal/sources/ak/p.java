package ak;

import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f631a = new y0("https://google.com", "google.com https");

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f632b = new y0("https://www.facebook.com", "facebook.com https");

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f633c = new y0("https://frosch.nmbdn.com/data600mb.zip", "google storage https");

    /* renamed from: d, reason: collision with root package name */
    public static final y0 f634d = new y0("https://d1i97uh4yu4esy.cloudfront.net/data600mb.zip", "cloudfront https");

    /* renamed from: e, reason: collision with root package name */
    public static final y0 f635e = new y0("https://connectivitymanager.akamaized.net/data600mb.zip", "akamai https");

    /* renamed from: f, reason: collision with root package name */
    public static final y0 f636f = new y0("https://dpevgsnn2jnn1.cloudfront.net", "cloudfront https");

    /* renamed from: g, reason: collision with root package name */
    public static final y0 f637g = new y0("https://connectivitymanager-nsu.akamaihd.net/1551528", "akamai https");

    public static c0 a() {
        ArrayList arrayList = dh.a.f7342b;
        br.l.d(arrayList, "DEFAULT_DEVICES_EXCLUDED_FROM_SENTRY_LOGGING");
        d dVar = new d("(?<=nrState=)(.*?)(?=\\W)", true, "https://api64.ipify.org?format=txt", 500, 400, 1, 3600000L, 604800000L, true, false, false, 0, false, false, false, false, 1, true, 0, arrayList, false, false, true, false, true, true, true, false, false);
        a0 a0Var = new a0(600000L, 30L, 10000L, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, 10000L, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, 1, 300L, false, 10000L, 5L, 0, -1, 600000L);
        f1 f1Var = new f1(e5.I(q.f639a, q.f640b), true, 0, false);
        h1 h1Var = new h1(1, 10, 62);
        s0 s0Var = new s0(5000, 10000, 5000, 5000, 4, 0L, 5000, 30L, 5, 20000, 3000, 50L, false, 5000, 10000, 4, 0L, 5000, false, 30L, 0, 1024, 0, 1024, new x0(90, 415, 415, 95, 80, 50, "max_latency_threshold", e5.I(o.f621a, o.f622b, o.f623c), e5.I(f636f, f637g), e5.I(f631a, f632b, f633c, f634d, f635e)));
        j1 j1VarB = b();
        mq.w wVar = mq.w.f16945a;
        c1 c1Var = new c1(wVar, 30, 3, 100L, 1000L);
        l lVar = new l(0L, 0L, 500L);
        yh.l lVar2 = yh.b.f26247a;
        br.l.d(lVar2, "DEFAULT_TEST_SIZE");
        a1 a1Var = new a1(e5.e(new z0("https://d2763msf1wgvw2.cloudfront.net/download/testfile", 25000L, 0L, lVar2, -1)), e5.e(new b1("https://upload-west.s3-accelerate.dualstack.amazonaws.com/uploadfile", "PUT", 25000L, 0, 0L, 2L, false, false, false, false, lVar2, -1)));
        q0 q0Var = new q0(new ArrayList(), 1, 20, 10000L, 20, 10050, "qt.bronze.systems", false, null, null, null, null);
        ArrayList arrayList2 = yh.b.f26248b;
        br.l.d(arrayList2, "ICMP_TEST_SERVERS");
        return new c0(dVar, a0Var, f1Var, h1Var, s0Var, j1VarB, c1Var, lVar, a1Var, q0Var, new x("www.google.com", arrayList2, 5, 10000L, 56, 1000, "", false, 200, 5000, 30, 60000, 3, 0, "255.255.255.255", "/128", 1, 1, false, false, false, false), new e(0L, 0L, 10000L), new mj.e(0L, 0L, mj.f.f16854a), new l1(10, 600000L, false, -1, -1), new c(bi.a.f2761a), new p0(null), new d0(dh.a.f7341a, 10, "MLVisLogs", "warning", "https://d1fpdhao7f8ux5.cloudfront.net/v2/upload.php", false), new v(m.f616a), new e0(7000L, true, false), new n0(wVar));
    }

    public static j1 b() {
        return new j1(4000, 4000, 30000, 15000, 30000L, 0L, 30000L, 30000L, 30000L, e5.I(r.f651a, r.f652b), 0L, "https://www.youtube.com/get_video_info?html5=1&c=TVHTML5&cver=7.20201028&video_id=%s", false, 3, new y("https://www.youtube.com/youtubei/v1/player", "", "WEB", "2.20200720.00.02", "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36"), "https://consent.youtube.com/s", "var\\s+ytInitialPlayerResponse\\s*=\\s*(\\{.*\\});(\\s*var\\s+meta\\s*=|</script>)", "<input type=\"hidden\"\\sname=\"(\\w+)\"\\svalue=\"([^\"]*)\">", new a(10000, 25000, 25000, 0.7f, 10000000L, 2000, 0, 3900000L, 160000L, 1300000L, 1500000L, 5000000L, 5000000L, 5000000L, 10000000L, 3000L, 0L, 58000L, false, 0.97f, 1.03f), "", "exoplayer", 30L);
    }

    public static f c(String str) {
        if (str == null || str.length() == 0 || tt.l.D0(str)) {
            ch.n.g("CellTower", "Null or blank JSON");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            nj.a aVar = nj.b.Companion;
            String strOptString = jSONObject.optString("cell_tower_network_generation", "UNKNOWN");
            aVar.getClass();
            return new f(nj.a.a(strOptString), xu.d.K("cell_tower_mcc", jSONObject), xu.d.K("cell_tower_mnc", jSONObject), xu.d.y("cell_tower_lac", jSONObject), xu.d.y("cell_tower_pci", jSONObject), xu.d.C("cell_tower_cid", jSONObject), xu.d.y("cell_tower_bandwidth", jSONObject), xu.d.y("cell_tower_rfcn", jSONObject), xu.d.y("cell_tower_cpid", jSONObject), xu.d.y("cell_tower_psc", jSONObject), xu.d.y("cell_tower_bsic", jSONObject));
        } catch (JSONException unused) {
            ch.n.c("CellTower", "Trying to parse invalid JSON: ".concat(str));
            return null;
        }
    }
}
