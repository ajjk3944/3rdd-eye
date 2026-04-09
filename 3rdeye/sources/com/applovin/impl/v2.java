package com.applovin.impl;

import N7.H7;
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
public class v2 implements Comparable, AppLovinCommunicatorSubscriber {

    /* renamed from: A, reason: collision with root package name */
    private final List f21599A;

    /* renamed from: B, reason: collision with root package name */
    private final List f21600B;

    /* renamed from: C, reason: collision with root package name */
    private final List f21601C;

    /* renamed from: D, reason: collision with root package name */
    private final List f21602D;

    /* renamed from: E, reason: collision with root package name */
    private final Map f21603E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f21604F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f21605G;

    /* renamed from: H, reason: collision with root package name */
    private final n6 f21606H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f21607I;

    /* renamed from: J, reason: collision with root package name */
    private final String f21608J;

    /* renamed from: K, reason: collision with root package name */
    private final Map f21609K;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21610a;

    /* renamed from: b, reason: collision with root package name */
    private final a f21611b;

    /* renamed from: c, reason: collision with root package name */
    private int f21612c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21613d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21614e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21615f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21616g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21617h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f21618j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f21619k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f21620l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f21621m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f21622n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f21623o;

    /* renamed from: p, reason: collision with root package name */
    private final String f21624p;

    /* renamed from: q, reason: collision with root package name */
    private final String f21625q;

    /* renamed from: r, reason: collision with root package name */
    private String f21626r;

    /* renamed from: s, reason: collision with root package name */
    private String f21627s;

    /* renamed from: t, reason: collision with root package name */
    private final String f21628t;

    /* renamed from: u, reason: collision with root package name */
    private final String f21629u;

    /* renamed from: v, reason: collision with root package name */
    private final String f21630v;

    /* renamed from: w, reason: collision with root package name */
    private final String f21631w;

    /* renamed from: x, reason: collision with root package name */
    private final int f21632x;

    /* renamed from: y, reason: collision with root package name */
    private final List f21633y;

    /* renamed from: z, reason: collision with root package name */
    private final List f21634z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: a, reason: collision with root package name */
        private final String f21640a;

        a(String str) {
            this.f21640a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f21640a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* renamed from: a, reason: collision with root package name */
        private final String f21646a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21647b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21648c;

        b(String str, int i10, String str2) {
            this.f21646a = str;
            this.f21647b = i10;
            this.f21648c = str2;
        }

        public String b() {
            return this.f21648c;
        }

        public String c() {
            return this.f21646a;
        }

        public int d() {
            return this.f21647b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c9  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v2(org.json.JSONObject r22, com.applovin.impl.sdk.k r23) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.v2.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    private a a() {
        a aVar = this.f21613d ? this.f21614e ? a.COMPLETE : this.f21616g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.f21614e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f21634z.iterator();
        while (it.hasNext()) {
            if (!((c4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.f21599A.iterator();
        while (it2.hasNext()) {
            if (!((f1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f21623o || com.applovin.impl.sdk.k.F0()) ? F() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f21614e;
    }

    public boolean B() {
        return this.f21615f;
    }

    public boolean C() {
        return this.f21617h;
    }

    public boolean D() {
        return this.f21607I;
    }

    public boolean E() {
        return this.f21623o;
    }

    public boolean F() {
        if (!this.f21622n || !StringUtils.isValidString(this.f21627s)) {
            return false;
        }
        return !a7.d(this.f21627s).equals(a7.a(this.f21628t, this.f21627s.split("\\.").length));
    }

    public boolean G() {
        return this.f21613d;
    }

    public boolean H() {
        return this.f21611b == a.MISSING && this.f21619k;
    }

    public boolean I() {
        return this.f21605G;
    }

    public boolean J() {
        return this.f21620l;
    }

    public boolean K() {
        return this.f21621m;
    }

    public String b() {
        return this.f21626r;
    }

    public String c() {
        return this.f21628t;
    }

    public Map d() {
        return this.f21609K;
    }

    public String e() {
        return this.f21608J;
    }

    public List f() {
        return this.f21599A;
    }

    public String g() {
        return this.f21625q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f21632x;
    }

    public int i() {
        return this.f21612c;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder("\n---------- ");
        sb.append(this.f21624p);
        sb.append(" ----------\nStatus  - ");
        sb.append(this.f21611b.b());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f21613d || TextUtils.isEmpty(this.f21627s)) ? "UNAVAILABLE" : this.f21627s);
        sb.append("\nAdapter - ");
        if (this.f21614e && !TextUtils.isEmpty(this.f21628t)) {
            str = this.f21628t;
        }
        sb.append(str);
        for (c4 c4Var : n()) {
            if (!c4Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(c4Var.b());
                sb.append(": ");
                sb.append(c4Var.a());
            }
        }
        for (f1 f1Var : f()) {
            if (!f1Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(f1Var.b());
                sb.append(": ");
                sb.append(f1Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.f21629u;
    }

    public List l() {
        return this.f21601C;
    }

    public String m() {
        return this.f21624p;
    }

    public List n() {
        return this.f21634z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f21610a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f21626r.equals(string)) {
            this.f21612c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = l3.a(string, this.f21610a);
            if (maxAdapterA != null) {
                String strA = l3.a(maxAdapterA);
                if (this.f21627s.equals(strA)) {
                    return;
                }
                this.f21627s = strA;
                this.f21610a.u().a(this.f21627s, string);
            }
        }
    }

    public String p() {
        return this.f21627s;
    }

    public a q() {
        return this.f21611b;
    }

    public List r() {
        return this.f21633y;
    }

    public List s() {
        return this.f21600B;
    }

    public n6 t() {
        return this.f21606H;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediatedNetwork{name=");
        sb.append(this.f21624p);
        sb.append(", displayName=");
        sb.append(this.f21625q);
        sb.append(", sdkAvailable=");
        sb.append(this.f21613d);
        sb.append(", sdkVersion=");
        sb.append(this.f21627s);
        sb.append(", adapterAvailable=");
        sb.append(this.f21614e);
        sb.append(", adapterVersion=");
        return B4.f.c(sb, this.f21628t, "}");
    }

    public List u() {
        return this.f21602D;
    }

    public String v() {
        return this.f21630v;
    }

    public String w() {
        return this.f21631w;
    }

    public Map x() {
        return this.f21603E;
    }

    public b y() {
        if (!this.i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f21611b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && G() && A())) ? !this.f21610a.s0().c() ? b.DISABLED : (this.f21618j && (this.f21612c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f21612c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.f21604F;
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
        if (this.f21626r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            c4 c4Var = new c4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.o());
            if (c4Var.c()) {
                arrayList.add(c4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new c4(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayQ = H7.q("dependencies", jSONObject);
        JSONArray jSONArrayQ2 = H7.q("dependencies_v2", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayQ2.length() + jSONArrayQ.length());
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new f1(jSONObject2, kVar));
            }
        }
        for (int i10 = 0; i10 < jSONArrayQ2.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayQ2, i10, (JSONObject) null);
            if (jSONObject3 != null && f1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new f1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(v2 v2Var) {
        return this.f21625q.compareToIgnoreCase(v2Var.f21625q);
    }
}
