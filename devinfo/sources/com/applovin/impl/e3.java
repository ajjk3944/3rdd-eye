package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final a7 G;
    private final boolean H;
    private final String I;
    private final Map J;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4024a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4025b;

    /* renamed from: c, reason: collision with root package name */
    private int f4026c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4027d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4028e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4029f;
    private final boolean g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4030h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f4031i;
    private final boolean j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f4032k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f4033l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f4034m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f4035n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f4036o;

    /* renamed from: p, reason: collision with root package name */
    private final String f4037p;

    /* renamed from: q, reason: collision with root package name */
    private final String f4038q;

    /* renamed from: r, reason: collision with root package name */
    private String f4039r;

    /* renamed from: s, reason: collision with root package name */
    private String f4040s;

    /* renamed from: t, reason: collision with root package name */
    private final String f4041t;

    /* renamed from: u, reason: collision with root package name */
    private final String f4042u;

    /* renamed from: v, reason: collision with root package name */
    private final String f4043v;

    /* renamed from: w, reason: collision with root package name */
    private final String f4044w;

    /* renamed from: x, reason: collision with root package name */
    private final int f4045x;

    /* renamed from: y, reason: collision with root package name */
    private final List f4046y;

    /* renamed from: z, reason: collision with root package name */
    private final List f4047z;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: a, reason: collision with root package name */
        private final String f4053a;

        a(String str) {
            this.f4053a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f4053a;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* renamed from: a, reason: collision with root package name */
        private final String f4059a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4060b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4061c;

        b(String str, int i4, String str2) {
            this.f4059a = str;
            this.f4060b = i4;
            this.f4061c = str2;
        }

        public String b() {
            return this.f4061c;
        }

        public String c() {
            return this.f4059a;
        }

        public int d() {
            return this.f4060b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|(5:100|27|106|28|29)|(6:98|30|(2:32|(4:34|(1:40)(1:37)|110|41)(0))(1:45)|102|46|47)|108|55|56|104|57) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0200, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0202, code lost:
    
        r22.O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0209, code lost:
    
        if (com.applovin.impl.sdk.o.a() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020b, code lost:
    
        r22.O().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0214, code lost:
    
        r0 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e3(org.json.JSONObject r21, com.applovin.impl.sdk.k r22) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e3.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    private a a() {
        a aVar = this.f4027d ? this.f4028e ? a.COMPLETE : this.g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.f4028e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f4047z.iterator();
        while (it.hasNext()) {
            if (!((p4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((k1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f4036o || com.applovin.impl.sdk.k.F0()) ? E() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f4029f;
    }

    public boolean B() {
        return this.f4030h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.f4036o;
    }

    public boolean E() {
        if (!this.f4035n || !StringUtils.isValidString(this.f4040s)) {
            return false;
        }
        return !n7.d(this.f4040s).equals(n7.a(this.f4041t, this.f4040s.split("\\.").length));
    }

    public boolean F() {
        return this.f4027d;
    }

    public boolean G() {
        return this.f4025b == a.MISSING && this.f4032k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.f4033l;
    }

    public boolean J() {
        return this.f4034m;
    }

    public String b() {
        return this.f4039r;
    }

    public String c() {
        return this.f4041t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f4038q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f4045x;
    }

    public int i() {
        return this.f4026c;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder("\n---------- ");
        sb2.append(this.f4037p);
        sb2.append(" ----------\nStatus  - ");
        sb2.append(this.f4025b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f4027d || TextUtils.isEmpty(this.f4040s)) ? "UNAVAILABLE" : this.f4040s);
        sb2.append("\nAdapter - ");
        if (this.f4028e && !TextUtils.isEmpty(this.f4041t)) {
            str = this.f4041t;
        }
        sb2.append(str);
        for (p4 p4Var : n()) {
            if (!p4Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(p4Var.b());
                sb2.append(": ");
                sb2.append(p4Var.a());
            }
        }
        for (k1 k1Var : f()) {
            if (!k1Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(k1Var.b());
                sb2.append(": ");
                sb2.append(k1Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.f4042u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f4037p;
    }

    public List n() {
        return this.f4047z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f4024a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f4039r.equals(string)) {
            this.f4026c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = w3.a(string, this.f4024a);
            if (maxAdapterA != null) {
                String strA = w3.a(maxAdapterA);
                if (this.f4040s.equals(strA)) {
                    return;
                }
                this.f4040s = strA;
                this.f4024a.t().a(this.f4040s, string);
            }
        }
    }

    public String p() {
        return this.f4040s;
    }

    public a q() {
        return this.f4025b;
    }

    public List r() {
        return this.f4046y;
    }

    public List s() {
        return this.B;
    }

    public a7 t() {
        return this.G;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediatedNetwork{name=");
        sb2.append(this.f4037p);
        sb2.append(", displayName=");
        sb2.append(this.f4038q);
        sb2.append(", sdkAvailable=");
        sb2.append(this.f4027d);
        sb2.append(", sdkVersion=");
        sb2.append(this.f4040s);
        sb2.append(", adapterAvailable=");
        sb2.append(this.f4028e);
        sb2.append(", adapterVersion=");
        return d.h.w(sb2, this.f4041t, "}");
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.f4043v;
    }

    public String w() {
        return this.f4044w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.f4031i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f4025b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && F() && z())) ? !this.f4024a.s0().c() ? b.DISABLED : (this.j && (this.f4026c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f4026c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.f4028e;
    }

    private List a(MaxAdapter maxAdapter, boolean z3) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z3) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f4039r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            p4 p4Var = new p4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.o());
            if (p4Var.c()) {
                arrayList.add(p4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new p4(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayS = a0.g.s("dependencies", jSONObject);
        JSONArray jSONArrayS2 = a0.g.s("dependencies_v2", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayS2.length() + jSONArrayS.length());
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new k1(jSONObject2, kVar));
            }
        }
        for (int i10 = 0; i10 < jSONArrayS2.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayS2, i10, (JSONObject) null);
            if (jSONObject3 != null && k1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new k1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e3 e3Var) {
        return this.f4038q.compareToIgnoreCase(e3Var.f4038q);
    }
}
