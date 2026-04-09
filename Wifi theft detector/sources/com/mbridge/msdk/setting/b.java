package com.mbridge.msdk.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.k0;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: h1, reason: collision with root package name */
    public static int f16910h1 = 1500;
    private boolean E0;
    private long F;
    private JSONArray G0;
    private ArrayList<Integer> H;
    private JSONObject H0;
    private d I;
    private C0311b J;
    private long J0;
    private HashMap<String, String> O;
    private long O0;
    private String P;
    private boolean P0;
    private int U;
    private String V0;
    private String X;
    private Map<String, String> Y;

    /* renamed from: b1, reason: collision with root package name */
    private int f16916b1;

    /* renamed from: c1, reason: collision with root package name */
    private int f16919c1;

    /* renamed from: d1, reason: collision with root package name */
    private int f16922d1;

    /* renamed from: e1, reason: collision with root package name */
    private String f16925e1;

    /* renamed from: f1, reason: collision with root package name */
    private int f16928f1;

    /* renamed from: g1, reason: collision with root package name */
    private String f16931g1;

    /* renamed from: h0, reason: collision with root package name */
    private int f16933h0;

    /* renamed from: k0, reason: collision with root package name */
    private String f16939k0;

    /* renamed from: l, reason: collision with root package name */
    private int f16940l;

    /* renamed from: l0, reason: collision with root package name */
    private String f16941l0;

    /* renamed from: n, reason: collision with root package name */
    private List<com.mbridge.msdk.foundation.entity.a> f16944n;

    /* renamed from: o0, reason: collision with root package name */
    private int f16947o0;

    /* renamed from: p, reason: collision with root package name */
    private long f16948p;

    /* renamed from: p0, reason: collision with root package name */
    private int f16949p0;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.setting.a f16950q;

    /* renamed from: q0, reason: collision with root package name */
    private int f16951q0;

    /* renamed from: r, reason: collision with root package name */
    private String f16952r;

    /* renamed from: r0, reason: collision with root package name */
    private int f16953r0;

    /* renamed from: s, reason: collision with root package name */
    private Map<String, a> f16954s;

    /* renamed from: s0, reason: collision with root package name */
    private int f16955s0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16956t;

    /* renamed from: u, reason: collision with root package name */
    private int f16958u;

    /* renamed from: v0, reason: collision with root package name */
    private long f16961v0;

    /* renamed from: w0, reason: collision with root package name */
    private long f16963w0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f16911a = false;

    /* renamed from: b, reason: collision with root package name */
    private JSONArray f16914b = new JSONArray();

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f16917c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    private String f16920d = "";

    /* renamed from: e, reason: collision with root package name */
    private int f16923e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f16926f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f16929g = 2;

    /* renamed from: h, reason: collision with root package name */
    private int f16932h = 0;

    /* renamed from: i, reason: collision with root package name */
    private String f16934i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f16936j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f16938k = "";

    /* renamed from: m, reason: collision with root package name */
    private int f16942m = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f16946o = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f16960v = 1;

    /* renamed from: w, reason: collision with root package name */
    private boolean f16962w = false;

    /* renamed from: x, reason: collision with root package name */
    private String f16964x = "";

    /* renamed from: y, reason: collision with root package name */
    private String f16966y = "";

    /* renamed from: z, reason: collision with root package name */
    private String f16968z = "";
    private String A = "";
    private String B = "";
    private int C = 120;
    private String D = com.mbridge.msdk.foundation.same.net.utils.d.h().f15173i;
    private String E = com.mbridge.msdk.foundation.same.net.utils.d.h().f15177m;
    private int G = f16910h1;
    private int K = 0;
    private long L = 86400;
    private int M = 0;
    private int N = 3;
    private boolean Q = true;
    private int R = 0;
    private boolean S = false;
    private boolean T = false;
    private int V = 0;
    private int W = 0;
    private String Z = "1.0";

    /* renamed from: a0, reason: collision with root package name */
    private int f16912a0 = 30;

    /* renamed from: b0, reason: collision with root package name */
    private int f16915b0 = 9377;

    /* renamed from: c0, reason: collision with root package name */
    private int f16918c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    private int f16921d0 = 5;

    /* renamed from: e0, reason: collision with root package name */
    private int f16924e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    private int f16927f0 = 8000;

    /* renamed from: g0, reason: collision with root package name */
    private String f16930g0 = "";

    /* renamed from: i0, reason: collision with root package name */
    private int f16935i0 = 10;

    /* renamed from: j0, reason: collision with root package name */
    private int f16937j0 = 120;

    /* renamed from: m0, reason: collision with root package name */
    private String f16943m0 = "";

    /* renamed from: n0, reason: collision with root package name */
    private String f16945n0 = "";

    /* renamed from: t0, reason: collision with root package name */
    private String f16957t0 = "";

    /* renamed from: u0, reason: collision with root package name */
    private String f16959u0 = "";

    /* renamed from: x0, reason: collision with root package name */
    private List<Integer> f16965x0 = new ArrayList();

    /* renamed from: y0, reason: collision with root package name */
    private int f16967y0 = 3;

    /* renamed from: z0, reason: collision with root package name */
    private int f16969z0 = 0;
    private int A0 = 3;
    private int B0 = 0;
    private int C0 = 10;
    private int D0 = Sdk$SDKError.Reason.NATIVE_ASSET_ERROR_VALUE;
    private int F0 = 0;
    private String I0 = "";
    private int K0 = 8000;
    private int L0 = 1;
    private long M0 = 10;
    private int N0 = 3;
    private int Q0 = 1;
    private int R0 = 1;
    private int S0 = 1;
    private int T0 = 1;
    private String U0 = "";
    private int W0 = 1300;
    private int X0 = 0;
    private int Y0 = 0;
    private long Z0 = 3600;

    /* renamed from: a1, reason: collision with root package name */
    private String f16913a1 = "";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f16970a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f16971b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f16972c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f16973d;

        public List<String> a() {
            return this.f16970a;
        }

        public List<String> b() {
            return this.f16971b;
        }

        public List<String> c() {
            return this.f16972c;
        }

        public List<String> d() {
            return this.f16973d;
        }

        public void a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("x");
                if (jSONArrayOptJSONArray != null) {
                    this.f16972c = d0.a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("y");
                if (jSONArrayOptJSONArray2 != null) {
                    this.f16973d = d0.a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.f16971b = d0.a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.f16970a = d0.a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static String a(Context context, String str) {
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD != null && gVarD.H() != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = gVarD.H().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = gVarD.H().get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", com.mbridge.msdk.foundation.tools.g.d());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public C0311b A() {
        return this.J;
    }

    public String A0() {
        return this.V0;
    }

    public long B() {
        return this.L;
    }

    public int B0() {
        return this.W0;
    }

    public int C() {
        return this.N;
    }

    public int C0() {
        return this.X0;
    }

    public HashMap<String, String> D() {
        return this.O;
    }

    public int D0() {
        return this.Y0;
    }

    public void E(int i10) {
        this.f16916b1 = i10;
    }

    public boolean E0() {
        return this.Q;
    }

    public int F() {
        return this.U;
    }

    public boolean F0() {
        return this.f16956t;
    }

    public int G() {
        return this.V;
    }

    public boolean G0() {
        return this.f16962w;
    }

    public Map<String, String> H() {
        return this.Y;
    }

    public boolean H0() {
        return this.S;
    }

    public JSONArray I() {
        return this.f16914b;
    }

    public boolean I0() {
        return this.f16911a;
    }

    public JSONArray J() {
        return this.f16917c;
    }

    public boolean J0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f16968z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f16964x)) ? false : true;
    }

    public String K() {
        return this.Z;
    }

    public boolean K0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f16968z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f16966y)) ? false : true;
    }

    public int L() {
        return this.f16924e0;
    }

    public boolean L0() {
        return this.T;
    }

    public int M() {
        return this.f16927f0;
    }

    public boolean M0() {
        return this.E0;
    }

    public int N() {
        return this.f16933h0;
    }

    public boolean N0() {
        return this.P0;
    }

    public int O() {
        return this.f16937j0;
    }

    public void O0() {
        String language = Locale.getDefault().getLanguage();
        if (!K0()) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.B = "Confirm to close? ";
                this.f16968z = "You will not be rewarded after closing the window";
                this.A = "Close it";
                this.f16966y = "Continue";
            } else {
                this.B = "确认关闭？";
                this.f16968z = "关闭后您将不会获得任何奖励噢~ ";
                this.A = "确认关闭";
                this.f16966y = "继续观看";
            }
        }
        if (J0()) {
            return;
        }
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.B = "Confirm to close? ";
            this.f16968z = "You will not be rewarded after closing the window";
            this.A = "Close it";
            this.f16964x = "Continue";
            return;
        }
        this.B = "确认关闭？";
        this.f16968z = "关闭后您将不会获得任何奖励噢~ ";
        this.A = "确认关闭";
        this.f16964x = "继续试玩";
    }

    public String P() {
        return this.f16939k0;
    }

    public String Q() {
        return this.f16941l0;
    }

    public String R() {
        return this.f16913a1;
    }

    public long S() {
        return this.Z0;
    }

    public int T() {
        return this.f16916b1;
    }

    public String U() {
        return this.f16943m0;
    }

    public String V() {
        return this.f16945n0;
    }

    public int W() {
        return this.f16947o0;
    }

    public int X() {
        return this.f16949p0;
    }

    public int Y() {
        return this.f16953r0;
    }

    public int Z() {
        return this.f16955s0;
    }

    public void a0(int i10) {
        this.W0 = i10;
    }

    public void b(Map<String, String> map) {
        this.Y = map;
    }

    public long b0() {
        return this.f16961v0;
    }

    public void c(int i10) {
        this.f16923e = i10;
    }

    public long c0() {
        if (this.f16963w0 <= 0) {
            this.f16963w0 = 7200L;
        }
        return this.f16963w0;
    }

    public void d(long j10) {
        this.Z0 = j10;
    }

    public String d0() {
        return this.f16925e1;
    }

    public void e(int i10) {
        this.f16929g = i10;
    }

    public int e0() {
        return this.f16922d1;
    }

    public void f(int i10) {
        this.f16932h = i10;
    }

    public int f0() {
        return this.f16967y0;
    }

    public void g(int i10) {
        this.f16940l = i10;
    }

    public int g0() {
        return this.f16969z0;
    }

    public void h(int i10) {
        this.f16942m = i10;
    }

    public int h0() {
        return this.A0;
    }

    public void i(int i10) {
        this.f16946o = i10;
    }

    public int i0() {
        return this.B0;
    }

    public com.mbridge.msdk.setting.a j() {
        return this.f16950q;
    }

    public int j0() {
        return this.C0;
    }

    public String k() {
        return this.f16952r;
    }

    public int k0() {
        return this.D0;
    }

    public Map<String, a> l() {
        return this.f16954s;
    }

    public int l0() {
        return this.F0;
    }

    public int m() {
        return this.f16958u;
    }

    public JSONArray m0() {
        return this.G0;
    }

    public int n() {
        return this.f16960v;
    }

    public JSONObject n0() {
        return this.H0;
    }

    public void o(int i10) {
        this.K = i10;
    }

    public String o0() {
        return this.I0;
    }

    public String p() {
        return this.f16964x;
    }

    public long p0() {
        return this.J0;
    }

    public String q() {
        return this.f16966y;
    }

    public int q0() {
        return this.K0;
    }

    public String r() {
        return this.f16968z;
    }

    public int r0() {
        return this.L0;
    }

    public String s() {
        return this.A;
    }

    public long s0() {
        return this.M0 * 1000;
    }

    public void t(String str) {
        this.f16913a1 = str;
    }

    public int t0() {
        return this.N0;
    }

    public String toString() {
        return " cfc=" + this.f16958u + " getpf=" + this.L + " rurl=" + this.E0;
    }

    public int u() {
        return this.C;
    }

    public long u0() {
        return this.O0;
    }

    public String v() {
        return this.D;
    }

    public int v0() {
        return this.Q0;
    }

    public String w() {
        return this.E;
    }

    public int w0() {
        return this.R0;
    }

    public long x() {
        return this.F;
    }

    public int x0() {
        return this.S0;
    }

    public ArrayList<Integer> y() {
        return this.H;
    }

    public int y0() {
        return this.T0;
    }

    public d z() {
        return this.I;
    }

    public String z0() {
        return this.U0;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x050e A[Catch: Exception -> 0x0576, TryCatch #6 {Exception -> 0x0576, blocks: (B:128:0x04ec, B:130:0x050e, B:131:0x0510, B:133:0x0515, B:134:0x0517, B:136:0x051c, B:137:0x051e, B:139:0x0523, B:140:0x0525, B:143:0x0531), top: B:221:0x04ec }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0515 A[Catch: Exception -> 0x0576, TryCatch #6 {Exception -> 0x0576, blocks: (B:128:0x04ec, B:130:0x050e, B:131:0x0510, B:133:0x0515, B:134:0x0517, B:136:0x051c, B:137:0x051e, B:139:0x0523, B:140:0x0525, B:143:0x0531), top: B:221:0x04ec }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x051c A[Catch: Exception -> 0x0576, TryCatch #6 {Exception -> 0x0576, blocks: (B:128:0x04ec, B:130:0x050e, B:131:0x0510, B:133:0x0515, B:134:0x0517, B:136:0x051c, B:137:0x051e, B:139:0x0523, B:140:0x0525, B:143:0x0531), top: B:221:0x04ec }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0523 A[Catch: Exception -> 0x0576, TryCatch #6 {Exception -> 0x0576, blocks: (B:128:0x04ec, B:130:0x050e, B:131:0x0510, B:133:0x0515, B:134:0x0517, B:136:0x051c, B:137:0x051e, B:139:0x0523, B:140:0x0525, B:143:0x0531), top: B:221:0x04ec }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05ed A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0604 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0615 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0622 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x062f A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x063c A[Catch: Exception -> 0x02b4, TRY_LEAVE, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0368 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ae A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b7 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x033c A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0352 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d6 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.setting.g b(org.json.JSONObject r22) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.setting.b.b(org.json.JSONObject):com.mbridge.msdk.setting.g");
    }

    public void A(int i10) {
        this.f16927f0 = i10;
    }

    public void B(int i10) {
        if (i10 > 0) {
            this.f16935i0 = i10;
        }
    }

    public void C(int i10) {
        this.f16933h0 = i10;
    }

    public void D(int i10) {
        this.f16937j0 = i10;
    }

    public int E() {
        return this.R;
    }

    public void F(int i10) {
        this.f16947o0 = i10;
    }

    public void G(int i10) {
        this.f16951q0 = i10;
    }

    public void H(int i10) {
        this.f16949p0 = i10;
    }

    public void I(int i10) {
        this.f16953r0 = i10;
    }

    public void J(int i10) {
        this.f16955s0 = i10;
    }

    public void K(int i10) {
        this.f16919c1 = i10;
    }

    public void L(int i10) {
        this.f16922d1 = i10;
    }

    public void M(int i10) {
        this.f16967y0 = i10;
    }

    public void N(int i10) {
        this.f16969z0 = i10;
    }

    public void O(int i10) {
        this.A0 = i10;
    }

    public void P(int i10) {
        this.B0 = i10;
    }

    public void Q(int i10) {
        this.C0 = i10;
    }

    public void R(int i10) {
        this.D0 = i10;
    }

    public void S(int i10) {
        this.F0 = i10;
    }

    public void T(int i10) {
        this.K0 = i10;
    }

    public void U(int i10) {
        this.L0 = i10;
    }

    public void V(int i10) {
        this.N0 = i10;
    }

    public void W(int i10) {
        this.Q0 = i10;
    }

    public void X(int i10) {
        this.R0 = i10;
    }

    public void Y(int i10) {
        this.S0 = i10;
    }

    public void Z(int i10) {
        this.T0 = i10;
    }

    public int a0() {
        return this.f16919c1;
    }

    public void b0(int i10) {
        this.X0 = i10;
    }

    public void c(String str) {
        this.f16934i = str;
    }

    public void d(int i10) {
        this.f16926f = i10;
    }

    public void e(String str) {
        this.f16938k = str;
    }

    public int f() {
        return this.f16942m;
    }

    public List<com.mbridge.msdk.foundation.entity.a> g() {
        return this.f16944n;
    }

    public int h() {
        return this.f16946o;
    }

    public long i() {
        return this.f16948p;
    }

    public void j(int i10) {
        this.f16958u = i10;
    }

    public void k(int i10) {
        this.f16960v = i10;
    }

    public void l(String str) {
        this.D = str;
    }

    public void m(int i10) {
        this.C = i10;
    }

    public void n(int i10) {
        this.G = i10;
        com.mbridge.msdk.click.utils.a.f13078d = i10;
    }

    public void o(String str) {
        this.P = str;
    }

    public void p(int i10) {
        this.M = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().d(i10);
    }

    public void q(int i10) {
        this.N = i10;
    }

    public void r(int i10) {
        this.R = i10;
    }

    public void s(int i10) {
        this.U = i10;
    }

    public String t() {
        return this.B;
    }

    public void u(int i10) {
        this.W = i10;
    }

    public void v(int i10) {
        this.f16912a0 = i10;
    }

    public void w(int i10) {
        this.f16915b0 = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().b(i10);
        com.mbridge.msdk.foundation.same.net.utils.d.h().c(i10);
    }

    public void x(int i10) {
        this.f16918c0 = i10;
    }

    public void y(int i10) {
        this.f16921d0 = i10;
    }

    public void z(int i10) {
        this.f16924e0 = i10;
    }

    public void A(String str) {
        if (TextUtils.isEmpty(this.f16930g0)) {
            return;
        }
        this.f16930g0 = str;
        if (TextUtils.isEmpty(com.mbridge.msdk.foundation.controller.c.n().j())) {
            com.mbridge.msdk.foundation.controller.c.n().d(this.f16930g0);
        }
    }

    public void B(String str) {
        this.U0 = str;
    }

    public void C(String str) {
        this.V0 = str;
    }

    public String c() {
        return this.f16936j;
    }

    public void d(String str) {
        this.f16936j = str;
    }

    public int e() {
        return this.f16940l;
    }

    public void f(String str) {
        this.f16952r = str;
    }

    public void g(String str) {
        this.f16964x = str;
    }

    public void h(String str) {
        this.f16966y = str;
    }

    public void i(String str) {
        this.f16968z = str;
    }

    public void j(String str) {
        this.A = str;
    }

    public void k(String str) {
        this.B = str;
    }

    public void l(int i10) {
        this.f16928f1 = i10;
    }

    public void m(String str) {
        this.E = str;
    }

    public int o() {
        return this.f16928f1;
    }

    public void q(String str) {
        this.Z = str;
    }

    public void r(String str) {
        this.f16939k0 = str;
    }

    public void s(String str) {
        this.f16941l0 = str;
    }

    public void t(int i10) {
        this.V = i10;
    }

    public void u(String str) {
        this.f16943m0 = str;
    }

    public void v(String str) {
        this.f16945n0 = str;
    }

    public void x(String str) {
        this.f16959u0 = str;
    }

    public void y(String str) {
        this.f16925e1 = str;
    }

    public void z(String str) {
        this.I0 = str;
    }

    public void c(long j10) {
        this.L = j10;
    }

    public void c0(int i10) {
        this.Y0 = i10;
    }

    public String d() {
        return this.f16938k;
    }

    public void e(long j10) {
        this.f16961v0 = j10;
    }

    public void f(long j10) {
        this.f16963w0 = j10;
    }

    public void g(long j10) {
        this.J0 = j10;
    }

    public void h(long j10) {
        this.M0 = j10;
    }

    public void i(long j10) {
        this.O0 = j10;
    }

    public void n(String str) throws JSONException {
        this.f16931g1 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e.a().b(k0.a(str));
    }

    public void p(String str) {
        this.X = str;
    }

    public void c(JSONArray jSONArray) {
        this.G0 = jSONArray;
    }

    public void d(boolean z10) {
        this.S = z10;
    }

    public void e(boolean z10) {
        this.f16911a = z10;
    }

    public void f(boolean z10) {
        this.T = z10;
    }

    public void g(boolean z10) {
        this.E0 = z10;
    }

    public void h(boolean z10) {
        this.P0 = z10;
    }

    public void w(String str) {
        this.f16957t0 = str;
    }

    public void c(JSONObject jSONObject) {
        this.H0 = jSONObject;
    }

    public void c(boolean z10) {
        this.f16962w = z10;
    }

    public static Map<String, a> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    aVar.a(jSONObjectOptJSONObject);
                }
                map.put(next, aVar);
            }
            return map;
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return null;
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: com.mbridge.msdk.setting.b$b, reason: collision with other inner class name */
    public static class C0311b {

        /* renamed from: a, reason: collision with root package name */
        private String f16974a;

        /* renamed from: b, reason: collision with root package name */
        private JSONArray f16975b;

        /* renamed from: c, reason: collision with root package name */
        private String f16976c;

        /* renamed from: d, reason: collision with root package name */
        private String f16977d;

        /* renamed from: e, reason: collision with root package name */
        private String f16978e;

        /* renamed from: f, reason: collision with root package name */
        private String f16979f;

        public static C0311b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0311b c0311b = new C0311b();
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            c0311b.f16979f = jSONObject.optString(CampaignEx.JSON_KEY_TITLE, contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_title", "string")));
            c0311b.f16974a = jSONObject.optString("cancel", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_close", "string")));
            c0311b.f16977d = jSONObject.optString("submit", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_submit", "string")));
            c0311b.f16978e = jSONObject.optString("submit_notice", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_submit_notice", "string")));
            c0311b.f16976c = jSONObject.optString("privacy", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_privacy_des", "string")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            c0311b.f16975b = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0311b.f16975b = jSONArray;
                jSONArray.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_not_play", "string")));
                c0311b.f16975b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_sound_problems", "string")));
                c0311b.f16975b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_misleading", "string")));
                c0311b.f16975b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_fraud", "string")));
                c0311b.f16975b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_por_violence", "string")));
                c0311b.f16975b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_other", "string")));
            }
            return c0311b;
        }

        public JSONArray b() {
            return this.f16975b;
        }

        public String c() {
            return this.f16976c;
        }

        public String d() {
            return this.f16977d;
        }

        public String e() {
            return this.f16978e;
        }

        public String f() {
            return this.f16979f;
        }

        public String a() {
            return this.f16974a;
        }
    }

    public void a(int i10) {
        this.f16965x0.add(Integer.valueOf(i10));
    }

    private static void a(JSONObject jSONObject) {
        FastKV fastKVBuild = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (fastKVBuild != null) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (jSONObject == null || contextD == null) {
                    return;
                }
                String strOptString = jSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString)) {
                    com.mbridge.msdk.foundation.same.a.V = strOptString;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                    try {
                        fastKVBuild.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    } catch (Exception unused2) {
                    }
                }
                String strOptString2 = jSONObject.optString("c");
                if (TextUtils.isEmpty(strOptString2) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f15032g, strOptString2)) {
                    return;
                }
                com.mbridge.msdk.foundation.same.a.f15032g = strOptString2;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f15032g);
                try {
                    fastKVBuild.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f15032g);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
            if (jSONObject == null || contextD2 == null) {
                return;
            }
            String strOptString3 = jSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString3)) {
                com.mbridge.msdk.foundation.same.a.V = strOptString3;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                SharedPreferences sharedPreferences = contextD2.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    editorEdit.apply();
                }
            }
            String strOptString4 = jSONObject.optString("c");
            if (TextUtils.isEmpty(strOptString4) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f15032g, strOptString4)) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.f15032g = strOptString4;
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f15032g);
            SharedPreferences sharedPreferences2 = contextD2.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f15032g);
                editorEdit2.apply();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String a() {
        return this.f16920d;
    }

    public void a(List<com.mbridge.msdk.foundation.entity.a> list) {
        this.f16944n = list;
    }

    public void a(long j10) {
        this.f16948p = j10;
    }

    public void a(com.mbridge.msdk.setting.a aVar) {
        this.f16950q = aVar;
    }

    public void a(Map<String, a> map) {
        this.f16954s = map;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.H = arrayList;
    }

    public void a(d dVar) {
        this.I = dVar;
    }

    public void a(C0311b c0311b) {
        this.J = c0311b;
    }

    public void a(HashMap<String, String> map) {
        this.O = map;
    }

    public void a(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000088");
        }
        this.f16914b = jSONArray;
    }

    public void a(boolean z10) {
        this.Q = z10;
    }

    public void b(String str) {
        this.f16920d = str;
    }

    public String b() {
        return this.f16934i;
    }

    public void b(long j10) {
        this.F = j10;
    }

    public void b(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000041");
            jSONArray.put("2000042");
            jSONArray.put("2000032");
            jSONArray.put("2000079");
        }
        this.f16917c = jSONArray;
    }

    public void b(boolean z10) {
        this.f16956t = z10;
    }

    public boolean b(int i10) {
        return this.f16965x0.contains(Integer.valueOf(i10));
    }
}
