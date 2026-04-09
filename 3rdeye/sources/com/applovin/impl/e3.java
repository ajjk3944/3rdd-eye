package com.applovin.impl;

import N7.C1154e9;
import N7.G8;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C2106a0;
import com.applovin.impl.j2;
import com.applovin.impl.n6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e3 extends k2 implements AppLovinCommunicatorSubscriber, C2106a0.a {

    /* renamed from: A, reason: collision with root package name */
    private List f19266A;

    /* renamed from: B, reason: collision with root package name */
    private List f19267B;

    /* renamed from: C, reason: collision with root package name */
    private List f19268C;

    /* renamed from: D, reason: collision with root package name */
    private List f19269D;

    /* renamed from: E, reason: collision with root package name */
    private List f19270E;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f19271e;

    /* renamed from: f, reason: collision with root package name */
    private List f19272f;

    /* renamed from: g, reason: collision with root package name */
    private List f19273g;

    /* renamed from: h, reason: collision with root package name */
    private List f19274h;
    private List i;

    /* renamed from: j, reason: collision with root package name */
    private String f19275j;

    /* renamed from: k, reason: collision with root package name */
    private String f19276k;

    /* renamed from: l, reason: collision with root package name */
    private String f19277l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19278m;

    /* renamed from: n, reason: collision with root package name */
    private final StringBuilder f19279n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f19280o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19281p;

    /* renamed from: q, reason: collision with root package name */
    private List f19282q;

    /* renamed from: r, reason: collision with root package name */
    private List f19283r;

    /* renamed from: s, reason: collision with root package name */
    private List f19284s;

    /* renamed from: t, reason: collision with root package name */
    private List f19285t;

    /* renamed from: u, reason: collision with root package name */
    private List f19286u;

    /* renamed from: v, reason: collision with root package name */
    private List f19287v;

    /* renamed from: w, reason: collision with root package name */
    private List f19288w;

    /* renamed from: x, reason: collision with root package name */
    private List f19289x;

    /* renamed from: y, reason: collision with root package name */
    private List f19290y;

    /* renamed from: z, reason: collision with root package name */
    private List f19291z;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19292a;

        static {
            int[] iArr = new int[C2106a0.b.values().length];
            f19292a = iArr;
            try {
                iArr[C2106a0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19292a[C2106a0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19292a[C2106a0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19292a[C2106a0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19292a[C2106a0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        MICRO_SDK_PARTNER_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public e3(Context context) {
        super(context);
        this.f19279n = new StringBuilder("");
        this.f19280o = new AtomicBoolean();
        this.f19282q = new ArrayList();
        this.f19283r = new ArrayList();
        this.f19284s = new ArrayList();
        this.f19285t = new ArrayList();
        this.f19286u = new ArrayList();
        this.f19287v = new ArrayList();
        this.f19288w = new ArrayList();
        this.f19289x = new ArrayList();
        this.f19290y = new ArrayList();
        this.f19291z = new ArrayList();
        this.f19266A = new ArrayList();
        this.f19267B = new ArrayList();
        this.f19268C = new ArrayList();
        this.f19269D = new ArrayList();
        this.f19270E = new ArrayList();
    }

    private List g() {
        boolean zC = this.f19271e.s0().c();
        List listB = this.f19271e.s0().b();
        return zC ? a((String) null, a(listB, false)) : a(a(listB, true), (String) null);
    }

    private List j() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f19645a.getPackageManager().getPackageInfo(this.f19645a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(j2.a().d("Package Name").c(this.f19645a.getPackageName()).a());
        j2.b bVarD = j2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(j2.a().d("OS").c(a7.d()).a());
        arrayList.add(j2.a().d("Account").c(StringUtils.isValidString(this.f19277l) ? this.f19277l : "None").a());
        arrayList.add(j2.a().d("Mediation Provider").c(StringUtils.isValidString(this.f19271e.V()) ? this.f19271e.V() : "None").a());
        arrayList.add(j2.a().d("OM SDK Version").c(this.f19271e.d0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.F0()));
        return arrayList;
    }

    private j2 l() {
        String strD = this.f19271e.r0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.f19271e.r0().j());
        j2.b bVarD = j2.a(j2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : "None";
        }
        j2.b bVarC = bVarD.c(strD);
        if (this.f19278m) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f19645a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z10 = this.f19271e.w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(AbstractC2124i0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f19645a));
            }
        }
        return bVarC.a();
    }

    private j2 m() {
        return j2.a().d("MAX Terms and Privacy Policy Flow").a(this.f19645a).a(true).a();
    }

    private j2 n() {
        boolean zHasSupportedCmp = this.f19271e.t().hasSupportedCmp();
        return j2.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(AbstractC2124i0.a(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f19645a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private List q() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(j2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f19271e.a(l4.f19705B3);
        j2.b bVarD = j2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(e());
        if (this.f19271e.H0()) {
            String strA = a7.a(this.f19271e.n0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(strA) ? strA : "None"));
        }
        if (this.f19271e.y().j()) {
            arrayList.add(m());
            arrayList.add(n());
            return arrayList;
        }
        if (this.f19271e.y().l()) {
            arrayList.add(u());
        }
        return arrayList;
    }

    private j2 r() {
        return j2.a().d("Network Consent Statuses").a(this.f19645a).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.f19271e.r0().j())) {
            arrayList.add(r());
        } else {
            arrayList.add(new f4(AbstractC2130l0.b(), false, this.f19645a));
        }
        arrayList.add(new f4(AbstractC2130l0.a(), true, this.f19645a));
        return arrayList;
    }

    private j2 u() {
        return j2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(AbstractC2124i0.a(R.color.applovin_sdk_xmarkColor, this.f19645a)).b("Terms Flow has been replaced").a(this.f19271e.y().g()).a(true).a();
    }

    private void z() {
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + a7.c(this.f19271e));
        sb.append("\nTest Mode - ".concat(this.f19271e.s0().c() ? "enabled" : "disabled"));
        sb.append("\nTarget SDK - " + this.f19271e.B().D().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f19271e.a(l4.f19705B3);
        String strB = C2123i.b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb2 = new StringBuilder("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb2.append(str2);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb3.append(strB);
        sb.append(sb3.toString());
        if (this.f19271e.H0()) {
            String strA = a7.a(this.f19271e.n0());
            StringBuilder sb4 = new StringBuilder("\nUnity Version - ");
            sb4.append(StringUtils.isValidString(strA) ? strA : "None");
            sb.append(sb4.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(AbstractC2130l0.a(this.f19645a));
        sb.append(this.f19271e.y().e());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.f19271e.r0().i());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb.append(((n6) it.next()).e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f19283r.iterator();
        while (it2.hasNext()) {
            a(sb, ((v2) it2.next()).j());
        }
        Iterator it3 = this.f19284s.iterator();
        while (it3.hasNext()) {
            a(sb, ((v2) it3.next()).j());
        }
        Iterator it4 = this.f19282q.iterator();
        while (it4.hasNext()) {
            a(sb, ((v2) it4.next()).j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it5 = this.f19273g.iterator();
        while (it5.hasNext()) {
            a(sb, ((C2131m) it5.next()).e());
        }
        sb.append("\n========== END ==========");
        com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", sb.toString());
        this.f19279n.append(sb.toString());
    }

    public boolean a(j2 j2Var) {
        if (j2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(j2Var.k().toString());
    }

    public void b(boolean z10) {
        this.f19281p = z10;
    }

    @Override // com.applovin.impl.k2
    public List c(int i) {
        return i == e.APP_INFO.ordinal() ? this.f19289x : i == e.MAX.ordinal() ? this.f19290y : i == e.PRIVACY.ordinal() ? this.f19291z : i == e.ADS.ordinal() ? this.f19266A : i == e.INCOMPLETE_NETWORKS.ordinal() ? this.f19267B : i == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? this.f19268C : i == e.COMPLETED_NETWORKS.ordinal() ? this.f19269D : this.f19270E;
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f19272f.iterator();
        while (it.hasNext()) {
            arrayList.add(((v2) it.next()).t());
        }
        String strK = this.f19271e.r0().k();
        if (strK != null) {
            String strC = this.f19271e.r0().c();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                n6 n6Var = (n6) it2.next();
                if (n6Var.f() == n6.a.TCF_VENDOR && n6Var.d() != null) {
                    n6Var.a(Boolean.valueOf(p6.a(strK, n6Var.d().intValue() - 1)));
                } else if (n6Var.f() == n6.a.ATP_NETWORK && n6Var.d() != null) {
                    n6Var.a(p6.a(n6Var.d().intValue(), strC));
                }
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((n6) it3.next()).a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.k2
    public j2 e(int i) {
        return i == e.APP_INFO.ordinal() ? new j4("APP INFO") : i == e.MAX.ordinal() ? new j4("MAX") : i == e.PRIVACY.ordinal() ? new j4("PRIVACY") : i == e.ADS.ordinal() ? new j4("ADS") : i == e.INCOMPLETE_NETWORKS.ordinal() ? new j4("INCOMPLETE SDK INTEGRATIONS") : i == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? new j4("APPLOVIN MICRO SDK PARTNERS") : i == e.COMPLETED_NETWORKS.ordinal() ? new j4("COMPLETED SDK INTEGRATIONS") : new j4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.f19273g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f19276k;
    }

    public String i() {
        return this.f19275j;
    }

    public List k() {
        return this.f19286u;
    }

    public List o() {
        return this.f19274h;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f19291z = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f19267B = a(this.f19282q);
            this.f19268C = a(this.f19283r);
            this.f19269D = a(this.f19284s);
            c();
            return;
        }
        if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f19266A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f19266A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public String p() {
        return this.f19279n.toString();
    }

    public com.applovin.impl.sdk.k t() {
        return this.f19271e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f19280o.get() + "}";
    }

    public List v() {
        return this.f19288w;
    }

    public List w() {
        return this.f19287v;
    }

    public boolean x() {
        return this.f19281p;
    }

    public boolean y() {
        return this.f19280o.get();
    }

    @Override // com.applovin.impl.k2
    public int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2134n c2134nF = ((C2131m) it.next()).f();
            Iterator it2 = c2134nF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((v7) it2.next()).b());
            }
            Iterator it3 = c2134nF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((v7) it3.next()).b());
            }
        }
        this.f19286u = new ArrayList(hashSet);
        this.f19287v = new ArrayList(hashSet2);
        Collections.sort(this.f19286u);
        Collections.sort(this.f19287v);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z10, com.applovin.impl.sdk.k kVar) {
        this.f19271e = kVar;
        this.f19272f = list;
        this.f19273g = list2;
        this.f19274h = list3;
        this.i = list4;
        this.f19275j = str;
        this.f19276k = str2;
        this.f19277l = str3;
        this.f19278m = z10;
        if (list != null && this.f19280o.compareAndSet(false, true)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.f19284s);
            this.f19289x.addAll(j());
            this.f19290y.addAll(q());
            this.f19291z.addAll(s());
            this.f19266A.addAll(g());
            this.f19267B = a(this.f19282q);
            this.f19268C = a(this.f19283r);
            this.f19269D = a(this.f19284s);
            this.f19270E = a(this.f19285t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f19645a).subscribe(this, arrayList);
            z();
        }
        AppLovinSdkUtils.runOnUiThread(new C.V(this, 11));
    }

    @Override // com.applovin.impl.k2
    public int d(int i) {
        if (i == e.APP_INFO.ordinal()) {
            return this.f19289x.size();
        }
        if (i == e.MAX.ordinal()) {
            return this.f19290y.size();
        }
        if (i == e.PRIVACY.ordinal()) {
            return this.f19291z.size();
        }
        if (i == e.ADS.ordinal()) {
            return this.f19266A.size();
        }
        if (i == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f19267B.size();
        }
        if (i == e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return this.f19268C.size();
        }
        if (i == e.COMPLETED_NETWORKS.ordinal()) {
            return this.f19269D.size();
        }
        return this.f19270E.size();
    }

    private j2 b(String str, String str2) {
        j2.b bVarD = j2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(AbstractC2124i0.a(R.color.applovin_sdk_xmarkColor, this.f19645a));
        }
        return bVarD.a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v2 v2Var = (v2) it.next();
            if (!v2Var.H()) {
                if (v2Var.q() != v2.a.INCOMPLETE_INTEGRATION && v2Var.q() != v2.a.INVALID_INTEGRATION) {
                    if (v2Var.q() == v2.a.COMPLETE) {
                        if (v2Var.z()) {
                            this.f19283r.add(v2Var);
                        } else {
                            this.f19284s.add(v2Var);
                        }
                    } else if (v2Var.q() == v2.a.MISSING) {
                        this.f19285t.add(v2Var);
                    }
                } else if (v2Var.z()) {
                    this.f19283r.add(v2Var);
                } else {
                    this.f19282q.add(v2Var);
                }
            }
        }
    }

    private j2 e() {
        String strC;
        j2.b bVarD = j2.a().d("Ad Review Version");
        String strB = C2123i.b();
        if (StringUtils.isValidString(strB)) {
            String strA = C2123i.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.f19271e.i0())) {
                strC = null;
            } else {
                strC = B4.f.c(new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your "), this.f19271e.H0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated", " from the correct account.");
            }
        } else {
            strC = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (strC != null) {
            bVarD.b("MAX Ad Review").a(strC).a(R.drawable.applovin_ic_x_mark).b(AbstractC2124i0.a(R.color.applovin_sdk_xmarkColor, this.f19645a)).a(true);
        } else {
            bVarD.c(strB);
        }
        return bVarD.a();
    }

    private j2 b(String str) {
        j2.b bVarA = j2.a();
        if (this.f19271e.s0().c()) {
            bVarA.a(this.f19645a);
        }
        j2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f19271e.s0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v2 v2Var = (v2) it.next();
            if (v2Var.y() == v2.b.READY) {
                this.f19288w.add(v2Var);
            }
        }
    }

    @Override // com.applovin.impl.C2106a0.a
    public void a(C2155y c2155y, String str) {
        C2157z c2157z;
        String strA;
        c cVarA;
        c cVar;
        String strI;
        ArrayList arrayList = new ArrayList();
        for (C2157z c2157z2 : this.i) {
            List list = (List) c2155y.a().get(c2157z2.b());
            if (list == null || !list.contains(c2157z2)) {
                this.f19271e.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = this.f19271e.O();
                    StringBuilder sbV = G8.v(str, " is missing a required entry: ");
                    sbV.append(c2157z2.d());
                    oVarO.b("MediationDebuggerListAdapter", sbV.toString());
                }
                arrayList.add(c2157z2);
            }
        }
        if (arrayList.isEmpty()) {
            strI = C1154e9.i("All required entries found at ", str, ".");
            cVar = c.SUCCESS;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    c2157z = (C2157z) it.next();
                    if (c2157z.g()) {
                        break;
                    }
                } else {
                    c2157z = null;
                    break;
                }
            }
            if (c2157z != null) {
                C2106a0.b bVar = C2106a0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, c2157z.d());
                cVarA = a(bVar);
            } else {
                C2106a0.b bVar2 = C2106a0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str2 = strA;
            cVar = cVarA;
            strI = str2;
        }
        this.f19290y.add(a(strI, cVar));
        c();
    }

    @Override // com.applovin.impl.C2106a0.a
    public void a(C2106a0.b bVar, String str) {
        if (bVar == C2106a0.b.APP_DETAILS_NOT_FOUND) {
            this.f19271e.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f19271e.O().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f19290y.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb, String str) {
        String string = sb.toString();
        if (str.length() + string.length() >= ((Integer) this.f19271e.a(l4.f20010r)).intValue()) {
            com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", string);
            this.f19279n.append(string);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(j2.a().d("View Ad Units (" + this.f19273g.size() + ")").a(this.f19645a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f19274h.isEmpty()) {
            arrayList.add(j2.a().d("Selective Init Ad Units (" + this.f19274h.size() + ")").a(this.f19645a).a(true).a());
        }
        arrayList.add(j2.a().d("Test Mode Enabled").c(String.valueOf(this.f19271e.s0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new o3((v2) it.next(), this.f19645a));
        }
        return arrayList;
    }

    private j2 a(String str) {
        j2.b bVarA = j2.a();
        if (!this.f19271e.s0().c()) {
            bVarA.a(this.f19645a);
        }
        j2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f19271e.s0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private j2 a(boolean z10) {
        return j2.a().d("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(AbstractC2124i0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f19645a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z10).a();
    }

    private j2 a(String str, c cVar) {
        int i;
        int iA;
        if (cVar == c.SUCCESS) {
            i = R.drawable.applovin_ic_check_mark_bordered;
            iA = AbstractC2124i0.a(R.color.applovin_sdk_checkmarkColor, this.f19645a);
        } else if (cVar == c.WARNING) {
            i = R.drawable.applovin_ic_warning;
            iA = AbstractC2124i0.a(R.color.applovin_sdk_warningColor, this.f19645a);
        } else {
            i = R.drawable.applovin_ic_x_mark;
            iA = AbstractC2124i0.a(R.color.applovin_sdk_xmarkColor, this.f19645a);
        }
        return j2.a().d("app-ads.txt").a(i).b(iA).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(C2106a0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i = a.f19292a[bVar.ordinal()];
        if (i == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i == 3) {
            return C1154e9.i("Unable to find app-ads.txt file or parse entries of the file at ", str, ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i == 4) {
            return Oo.h("Text file at ", str, " is missing the required AppLovin line:\n\n", str2, "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i != 5) {
            return "";
        }
        return C1154e9.i("Text file at ", str, " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    private c a(C2106a0.b bVar) {
        int i = a.f19292a[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return c.ERROR;
        }
        if (i != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z10) {
            for (m2 m2Var : this.f19286u) {
                if (list.equals(m2Var.b())) {
                    return m2Var.a();
                }
            }
            for (m2 m2Var2 : this.f19287v) {
                if (list.equals(m2Var2.b())) {
                    return m2Var2.a();
                }
            }
        } else {
            for (v2 v2Var : this.f19288w) {
                if (list.equals(v2Var.u())) {
                    return v2Var.g();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA);
            }
        }
        return sb.toString();
    }
}
