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
    private final com.applovin.impl.sdk.k f5888a;

    /* renamed from: b, reason: collision with root package name */
    private final a f5889b;

    /* renamed from: c, reason: collision with root package name */
    private int f5890c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5891d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5892e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5893f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5894g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5895h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f5896i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f5897j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f5898k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f5899l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f5900m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f5901n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f5902o;

    /* renamed from: p, reason: collision with root package name */
    private final String f5903p;

    /* renamed from: q, reason: collision with root package name */
    private final String f5904q;

    /* renamed from: r, reason: collision with root package name */
    private String f5905r;

    /* renamed from: s, reason: collision with root package name */
    private String f5906s;

    /* renamed from: t, reason: collision with root package name */
    private final String f5907t;

    /* renamed from: u, reason: collision with root package name */
    private final String f5908u;

    /* renamed from: v, reason: collision with root package name */
    private final String f5909v;

    /* renamed from: w, reason: collision with root package name */
    private final String f5910w;

    /* renamed from: x, reason: collision with root package name */
    private final int f5911x;

    /* renamed from: y, reason: collision with root package name */
    private final List f5912y;

    /* renamed from: z, reason: collision with root package name */
    private final List f5913z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: a, reason: collision with root package name */
        private final String f5919a;

        a(String str) {
            this.f5919a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f5919a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* renamed from: a, reason: collision with root package name */
        private final String f5926a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5927b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5928c;

        b(String str, int i10, String str2) {
            this.f5926a = str;
            this.f5927b = i10;
            this.f5928c = str2;
        }

        public String b() {
            return this.f5928c;
        }

        public String c() {
            return this.f5926a;
        }

        public int d() {
            return this.f5927b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e3(org.json.JSONObject r21, com.applovin.impl.sdk.k r22) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e3.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    private a a() {
        a aVar = this.f5891d ? this.f5892e ? a.COMPLETE : this.f5894g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.f5892e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f5913z.iterator();
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
        return (!this.f5902o || com.applovin.impl.sdk.k.F0()) ? E() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f5893f;
    }

    public boolean B() {
        return this.f5895h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.f5902o;
    }

    public boolean E() {
        if (!this.f5901n || !StringUtils.isValidString(this.f5906s)) {
            return false;
        }
        return !n7.d(this.f5906s).equals(n7.a(this.f5907t, this.f5906s.split("\\.").length));
    }

    public boolean F() {
        return this.f5891d;
    }

    public boolean G() {
        return this.f5889b == a.MISSING && this.f5898k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.f5899l;
    }

    public boolean J() {
        return this.f5900m;
    }

    public String b() {
        return this.f5905r;
    }

    public String c() {
        return this.f5907t;
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
        return this.f5904q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f5911x;
    }

    public int i() {
        return this.f5890c;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.f5903p);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.f5889b.b());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f5891d || TextUtils.isEmpty(this.f5906s)) ? "UNAVAILABLE" : this.f5906s);
        sb.append("\nAdapter - ");
        if (this.f5892e && !TextUtils.isEmpty(this.f5907t)) {
            str = this.f5907t;
        }
        sb.append(str);
        for (p4 p4Var : n()) {
            if (!p4Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(p4Var.b());
                sb.append(": ");
                sb.append(p4Var.a());
            }
        }
        for (k1 k1Var : f()) {
            if (!k1Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(k1Var.b());
                sb.append(": ");
                sb.append(k1Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.f5908u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f5903p;
    }

    public List n() {
        return this.f5913z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f5888a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f5905r.equals(string)) {
            this.f5890c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = w3.a(string, this.f5888a);
            if (maxAdapterA != null) {
                String strA = w3.a(maxAdapterA);
                if (this.f5906s.equals(strA)) {
                    return;
                }
                this.f5906s = strA;
                this.f5888a.t().a(this.f5906s, string);
            }
        }
    }

    public String p() {
        return this.f5906s;
    }

    public a q() {
        return this.f5889b;
    }

    public List r() {
        return this.f5912y;
    }

    public List s() {
        return this.B;
    }

    public a7 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f5903p + ", displayName=" + this.f5904q + ", sdkAvailable=" + this.f5891d + ", sdkVersion=" + this.f5906s + ", adapterAvailable=" + this.f5892e + ", adapterVersion=" + this.f5907t + "}";
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.f5909v;
    }

    public String w() {
        return this.f5910w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.f5896i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f5889b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && F() && z())) ? !this.f5888a.s0().c() ? b.DISABLED : (this.f5897j && (this.f5890c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f5890c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.f5892e;
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
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
            if (z10) {
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
        if (this.f5905r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
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
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new k1(jSONObject2, kVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && k1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new k1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e3 e3Var) {
        return this.f5904q.compareToIgnoreCase(e3Var.f5904q);
    }
}
