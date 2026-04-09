package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a7;
import com.applovin.impl.b0;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class o3 extends s2 implements AppLovinCommunicatorSubscriber, b0.a {
    private List A;
    private List B;
    private List C;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f4942e;

    /* renamed from: f, reason: collision with root package name */
    private List f4943f;
    private List g;

    /* renamed from: h, reason: collision with root package name */
    private List f4944h;

    /* renamed from: i, reason: collision with root package name */
    private List f4945i;
    private String j;

    /* renamed from: k, reason: collision with root package name */
    private String f4946k;

    /* renamed from: l, reason: collision with root package name */
    private String f4947l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4948m;

    /* renamed from: n, reason: collision with root package name */
    private final StringBuilder f4949n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f4950o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4951p;

    /* renamed from: q, reason: collision with root package name */
    private List f4952q;

    /* renamed from: r, reason: collision with root package name */
    private List f4953r;

    /* renamed from: s, reason: collision with root package name */
    private List f4954s;

    /* renamed from: t, reason: collision with root package name */
    private List f4955t;

    /* renamed from: u, reason: collision with root package name */
    private List f4956u;

    /* renamed from: v, reason: collision with root package name */
    private List f4957v;

    /* renamed from: w, reason: collision with root package name */
    private List f4958w;

    /* renamed from: x, reason: collision with root package name */
    private List f4959x;

    /* renamed from: y, reason: collision with root package name */
    private List f4960y;

    /* renamed from: z, reason: collision with root package name */
    private List f4961z;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4962a;

        static {
            int[] iArr = new int[b0.b.values().length];
            f4962a = iArr;
            try {
                iArr[b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4962a[b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4962a[b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4962a[b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4962a[b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public o3(Context context) {
        super(context);
        this.f4949n = new StringBuilder("");
        this.f4950o = new AtomicBoolean();
        this.f4952q = new ArrayList();
        this.f4953r = new ArrayList();
        this.f4954s = new ArrayList();
        this.f4955t = new ArrayList();
        this.f4956u = new ArrayList();
        this.f4957v = new ArrayList();
        this.f4958w = new ArrayList();
        this.f4959x = new ArrayList();
        this.f4960y = new ArrayList();
        this.f4961z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
    }

    private List g() {
        boolean zC = this.f4942e.s0().c();
        List listB = this.f4942e.s0().b();
        return zC ? a((String) null, a(listB, false)) : a(a(listB, true), (String) null);
    }

    private List j() {
        ArrayList arrayList = new ArrayList(7);
        PackageInfo packageInfoA = n7.a(this.f5283a, 0);
        String str = packageInfoA != null ? packageInfoA.versionName : null;
        arrayList.add(r2.a().d("Package Name").c(this.f5283a.getPackageName()).a());
        r2.b bVarD = r2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(r2.a().d("OS").c(n7.d()).a());
        arrayList.add(r2.a().d("Account").c(StringUtils.isValidString(this.f4947l) ? this.f4947l : "None").a());
        arrayList.add(r2.a().d("Mediation Provider").c(StringUtils.isValidString(this.f4942e.V()) ? this.f4942e.V() : "None").a());
        arrayList.add(r2.a().d("OM SDK Version").c(this.f4942e.e0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.F0()));
        return arrayList;
    }

    private r2 l() {
        String strD = this.f4942e.r0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.f4942e.r0().j());
        r2.b bVarD = r2.a(r2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : "None";
        }
        r2.b bVarC = bVarD.c(strD);
        if (this.f4948m) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f5283a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z3 = this.f4942e.v().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z3 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(m0.a(z3 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f5283a));
            }
        }
        return bVarC.a();
    }

    private r2 m() {
        return r2.a().d("MAX Terms and Privacy Policy Flow").a(this.f5283a).a(true).a();
    }

    private r2 n() {
        boolean zHasSupportedCmp = this.f4942e.s().hasSupportedCmp();
        return r2.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f5283a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private List q() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(r2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f4942e.a(x4.L3);
        r2.b bVarD = r2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(e());
        if (this.f4942e.H0()) {
            String strA = n7.a(this.f4942e.n0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(strA) ? strA : "None"));
        }
        if (this.f4942e.x().j()) {
            arrayList.add(m());
            arrayList.add(n());
            return arrayList;
        }
        if (this.f4942e.x().l()) {
            arrayList.add(u());
        }
        return arrayList;
    }

    private r2 r() {
        return r2.a().d("Network Consent Statuses").a(this.f5283a).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.f4942e.r0().j())) {
            arrayList.add(r());
        } else {
            arrayList.add(new r4(p0.b(), false, this.f5283a));
        }
        arrayList.add(new r4(p0.a(), true, this.f5283a));
        return arrayList;
    }

    private r2 u() {
        return r2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.f5283a)).b("Terms Flow has been replaced").a(this.f4942e.x().g()).a(true).a();
    }

    private void z() {
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + n7.c(this.f4942e));
        sb2.append("\nTest Mode - ".concat(this.f4942e.s0().c() ? "enabled" : "disabled"));
        sb2.append("\nTarget SDK - " + this.f4942e.A().G().get("target_sdk"));
        sb2.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f4942e.a(x4.L3);
        String strB = j.b();
        sb2.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb3.append(str2);
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb4.append(strB);
        sb2.append(sb4.toString());
        if (this.f4942e.H0()) {
            String strA = n7.a(this.f4942e.n0());
            StringBuilder sb5 = new StringBuilder("\nUnity Version - ");
            sb5.append(StringUtils.isValidString(strA) ? strA : "None");
            sb2.append(sb5.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(p0.a(this.f5283a));
        sb2.append(this.f4942e.x().e());
        sb2.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb2.append(this.f4942e.r0().i());
        sb2.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb2.append(((a7) it.next()).e());
        }
        sb2.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f4953r.iterator();
        while (it2.hasNext()) {
            a(sb2, ((e3) it2.next()).j());
        }
        Iterator it3 = this.f4952q.iterator();
        while (it3.hasNext()) {
            a(sb2, ((e3) it3.next()).j());
        }
        sb2.append("\n========== AD UNITS ==========");
        Iterator it4 = this.g.iterator();
        while (it4.hasNext()) {
            a(sb2, ((n) it4.next()).e());
        }
        sb2.append("\n========== END ==========");
        com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", sb2.toString());
        this.f4949n.append(sb2.toString());
    }

    public boolean a(r2 r2Var) {
        if (r2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(r2Var.k().toString());
    }

    public void b(boolean z3) {
        this.f4951p = z3;
    }

    @Override // com.applovin.impl.s2
    public List c(int i4) {
        return i4 == e.APP_INFO.ordinal() ? this.f4958w : i4 == e.MAX.ordinal() ? this.f4959x : i4 == e.PRIVACY.ordinal() ? this.f4960y : i4 == e.ADS.ordinal() ? this.f4961z : i4 == e.INCOMPLETE_NETWORKS.ordinal() ? this.A : i4 == e.COMPLETED_NETWORKS.ordinal() ? this.B : this.C;
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4943f.iterator();
        while (it.hasNext()) {
            arrayList.add(((e3) it.next()).t());
        }
        String strK = this.f4942e.r0().k();
        int i4 = 0;
        if (strK != null) {
            String strC = this.f4942e.r0().c();
            int size = arrayList.size();
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                a7 a7Var = (a7) obj;
                if (a7Var.f() == a7.a.TCF_VENDOR && a7Var.d() != null) {
                    a7Var.a(Boolean.valueOf(c7.a(strK, a7Var.d().intValue() - 1)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK && a7Var.d() != null) {
                    a7Var.a(c7.a(a7Var.d().intValue(), strC));
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                ((a7) obj2).a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i4) {
        return i4 == e.APP_INFO.ordinal() ? new v4("APP INFO") : i4 == e.MAX.ordinal() ? new v4("MAX") : i4 == e.PRIVACY.ordinal() ? new v4("PRIVACY") : i4 == e.ADS.ordinal() ? new v4("ADS") : i4 == e.INCOMPLETE_NETWORKS.ordinal() ? new v4("INCOMPLETE SDK INTEGRATIONS") : i4 == e.COMPLETED_NETWORKS.ordinal() ? new v4("COMPLETED SDK INTEGRATIONS") : new v4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f4946k;
    }

    public String i() {
        return this.j;
    }

    public List k() {
        return this.f4955t;
    }

    public List o() {
        return this.f4944h;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f4960y = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(this.f4952q);
            this.B = a(this.f4953r);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f4961z = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f4961z = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public String p() {
        return this.f4949n.toString();
    }

    public com.applovin.impl.sdk.k t() {
        return this.f4942e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f4950o.get() + "}";
    }

    public List v() {
        return this.f4957v;
    }

    public List w() {
        return this.f4956u;
    }

    public boolean x() {
        return this.f4951p;
    }

    public boolean y() {
        return this.f4950o.get();
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVarF = ((n) it.next()).f();
            Iterator it2 = oVarF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((i8) it2.next()).b());
            }
            Iterator it3 = oVarF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((i8) it3.next()).b());
            }
        }
        this.f4955t = new ArrayList(hashSet);
        this.f4956u = new ArrayList(hashSet2);
        Collections.sort(this.f4955t);
        Collections.sort(this.f4956u);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z3, com.applovin.impl.sdk.k kVar) {
        this.f4942e = kVar;
        this.f4943f = list;
        this.g = list2;
        this.f4944h = list3;
        this.f4945i = list4;
        this.j = str;
        this.f4946k = str2;
        this.f4947l = str3;
        this.f4948m = z3;
        if (list != null && this.f4950o.compareAndSet(false, true)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.f4953r);
            this.f4958w.addAll(j());
            this.f4959x.addAll(q());
            this.f4960y.addAll(s());
            this.f4961z.addAll(g());
            this.A = a(this.f4952q);
            this.B = a(this.f4953r);
            this.C = a(this.f4954s);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f5283a).subscribe(this, arrayList);
            z();
        }
        AppLovinSdkUtils.runOnUiThread(new v9(13, this));
    }

    @Override // com.applovin.impl.s2
    public int d(int i4) {
        if (i4 == e.APP_INFO.ordinal()) {
            return this.f4958w.size();
        }
        if (i4 == e.MAX.ordinal()) {
            return this.f4959x.size();
        }
        if (i4 == e.PRIVACY.ordinal()) {
            return this.f4960y.size();
        }
        if (i4 == e.ADS.ordinal()) {
            return this.f4961z.size();
        }
        if (i4 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.A.size();
        }
        if (i4 == e.COMPLETED_NETWORKS.ordinal()) {
            return this.B.size();
        }
        return this.C.size();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (!e3Var.G()) {
                if (e3Var.q() != e3.a.INCOMPLETE_INTEGRATION && e3Var.q() != e3.a.INVALID_INTEGRATION) {
                    if (e3Var.q() == e3.a.COMPLETE) {
                        this.f4953r.add(e3Var);
                    } else if (e3Var.q() == e3.a.MISSING) {
                        this.f4954s.add(e3Var);
                    }
                } else {
                    this.f4952q.add(e3Var);
                }
            }
        }
    }

    private r2 e() {
        String strW;
        r2.b bVarD = r2.a().d("Ad Review Version");
        String strB = j.b();
        if (StringUtils.isValidString(strB)) {
            String strA = j.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.f4942e.i0())) {
                strW = null;
            } else {
                strW = d.h.w(new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your "), this.f4942e.H0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated", " from the correct account.");
            }
        } else {
            strW = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (strW != null) {
            bVarD.b("MAX Ad Review").a(strW).a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.f5283a)).a(true);
        } else {
            bVarD.c(strB);
        }
        return bVarD.a();
    }

    private r2 b(String str, String str2) {
        r2.b bVarD = r2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(m0.a(R.color.applovin_sdk_xmarkColor, this.f5283a));
        }
        return bVarD.a();
    }

    private r2 b(String str) {
        r2.b bVarA = r2.a();
        if (this.f4942e.s0().c()) {
            bVarA.a(this.f5283a);
        }
        r2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f4942e.s0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.y() == e3.b.READY) {
                this.f4957v.add(e3Var);
            }
        }
    }

    @Override // com.applovin.impl.b0.a
    public void a(z zVar, String str) {
        String strA;
        c cVarA;
        c cVar;
        String strT;
        List<a0> listA = b0.a(zVar, this.f4945i);
        if (listA.isEmpty()) {
            strT = d.h.t("All required entries found at ", str, ".");
            cVar = c.SUCCESS;
        } else {
            a0 a0Var = null;
            for (a0 a0Var2 : listA) {
                this.f4942e.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = this.f4942e.O();
                    StringBuilder sbB = i3.e.b(str, " is missing a required entry: ");
                    sbB.append(a0Var2.d());
                    oVarO.b("MediationDebuggerListAdapter", sbB.toString());
                }
                if (a0Var2.g()) {
                    a0Var = a0Var2;
                }
            }
            if (a0Var != null) {
                b0.b bVar = b0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, a0Var.d());
                cVarA = a(bVar);
            } else {
                b0.b bVar2 = b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str2 = strA;
            cVar = cVarA;
            strT = str2;
        }
        this.f4959x.add(a(strT, cVar));
        c();
    }

    @Override // com.applovin.impl.b0.a
    public void a(b0.b bVar, String str) {
        if (bVar == b0.b.APP_DETAILS_NOT_FOUND) {
            this.f4942e.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4942e.O().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f4959x.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb2, String str) {
        String string = sb2.toString();
        if (str.length() + string.length() >= ((Integer) this.f4942e.a(x4.f6122r)).intValue()) {
            com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", string);
            this.f4949n.append(string);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(r2.a().d("View Ad Units (" + this.g.size() + ")").a(this.f5283a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f4944h.isEmpty()) {
            arrayList.add(r2.a().d("Selective Init Ad Units (" + this.f4944h.size() + ")").a(this.f5283a).a(true).a());
        }
        arrayList.add(r2.a().d("Test Mode Enabled").c(String.valueOf(this.f4942e.s0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new z3((e3) it.next(), this.f5283a));
        }
        return arrayList;
    }

    private r2 a(String str) {
        r2.b bVarA = r2.a();
        if (!this.f4942e.s0().c()) {
            bVarA.a(this.f5283a);
        }
        r2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f4942e.s0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private r2 a(boolean z3) {
        return r2.a().d("Java 8").a(z3 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(z3 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f5283a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://support.axon.ai/en/max/android/overview/integration").a(!z3).a();
    }

    private r2 a(String str, c cVar) {
        int i4;
        int iA;
        if (cVar == c.SUCCESS) {
            i4 = R.drawable.applovin_ic_check_mark_bordered;
            iA = m0.a(R.color.applovin_sdk_checkmarkColor, this.f5283a);
        } else if (cVar == c.WARNING) {
            i4 = R.drawable.applovin_ic_warning;
            iA = m0.a(R.color.applovin_sdk_warningColor, this.f5283a);
        } else {
            i4 = R.drawable.applovin_ic_x_mark;
            iA = m0.a(R.color.applovin_sdk_xmarkColor, this.f5283a);
        }
        return r2.a().d("app-ads.txt").a(i4).b(iA).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i4 = a.f4962a[bVar.ordinal()];
        if (i4 == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i4 == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i4 == 3) {
            return d.h.t("Unable to find app-ads.txt file or parse entries of the file at ", str, ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i4 == 4) {
            return a0.g.n("Text file at ", str, " is missing the required AppLovin line:\n\n", str2, "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i4 != 5) {
            return "";
        }
        return d.h.t("Text file at ", str, " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    private c a(b0.b bVar) {
        int i4 = a.f4962a[bVar.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
            return c.ERROR;
        }
        if (i4 != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z3) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z3) {
            for (u2 u2Var : this.f4955t) {
                if (list.equals(u2Var.b())) {
                    return u2Var.a();
                }
            }
            for (u2 u2Var2 : this.f4956u) {
                if (list.equals(u2Var2.b())) {
                    return u2Var2.a();
                }
            }
        } else {
            for (e3 e3Var : this.f4957v) {
                if (list.equals(e3Var.u())) {
                    return e3Var.g();
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ",");
            }
        }
        return sb2.toString();
    }
}
