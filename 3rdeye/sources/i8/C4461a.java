package i8;

import A9.C0575f;
import A9.C0580h0;
import A9.E;
import A9.F;
import A9.U;
import J8.AbstractC0686a;
import J8.C0706v;
import J8.N;
import J8.x;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import b8.C1991a;
import b9.C1992A;
import c8.C2074a;
import c8.C2075b;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.Singular;
import com.singular.sdk.SingularAdData;
import com.zipoapps.premiumhelper.billing.ActivePurchaseInfo;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.toto.TotoApiResponseInfo;
import f9.InterfaceC4347e;
import i9.InterfaceC4463a;
import io.appmetrica.analytics.impl.Oo;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import j8.C5201c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import k8.I;
import org.json.JSONException;
import p9.InterfaceC5480a;
import va.a;
import w8.i;

/* compiled from: Analytics.kt */
/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4461a {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w9.i<Object>[] f38482n;

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f38483a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.b f38484b;

    /* renamed from: c, reason: collision with root package name */
    public final C1991a f38485c;

    /* renamed from: d, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.c f38486d;

    /* renamed from: e, reason: collision with root package name */
    public final C5201c f38487e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38489g;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedList f38491j;

    /* renamed from: k, reason: collision with root package name */
    public final K9.d f38492k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38493l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f38494m;

    /* renamed from: f, reason: collision with root package name */
    public final r8.d f38488f = new r8.d(null);

    /* renamed from: h, reason: collision with root package name */
    public String f38490h = "";
    public String i = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Analytics.kt */
    /* renamed from: i8.a$a, reason: collision with other inner class name */
    public static final class EnumC0466a {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ EnumC0466a[] $VALUES;
        private final String value;
        public static final EnumC0466a ONBOARDING = new EnumC0466a("ONBOARDING", 0, "onboarding");
        public static final EnumC0466a MAIN_ACTIVITY = new EnumC0466a("MAIN_ACTIVITY", 1, "main_activity");
        public static final EnumC0466a SETTINGS = new EnumC0466a("SETTINGS", 2, "settings");
        public static final EnumC0466a PREFERENCE = new EnumC0466a("PREFERENCE", 3, "preference");
        public static final EnumC0466a MENU = new EnumC0466a("MENU", 4, "menu");

        private static final /* synthetic */ EnumC0466a[] $values() {
            return new EnumC0466a[]{ONBOARDING, MAIN_ACTIVITY, SETTINGS, PREFERENCE, MENU};
        }

        static {
            EnumC0466a[] enumC0466aArr$values = $values();
            $VALUES = enumC0466aArr$values;
            $ENTRIES = com.google.gson.internal.c.l(enumC0466aArr$values);
        }

        private EnumC0466a(String str, int i, String str2) {
            this.value = str2;
        }

        public static InterfaceC4463a<EnumC0466a> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0466a valueOf(String str) {
            return (EnumC0466a) Enum.valueOf(EnumC0466a.class, str);
        }

        public static EnumC0466a[] values() {
            return (EnumC0466a[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Analytics.kt */
    /* renamed from: i8.a$b */
    public static final class b {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DIALOG = new b("DIALOG", 0, "dialog");
        public static final b IN_APP_REVIEW = new b("IN_APP_REVIEW", 1, "in_app_review");
        private final String value;

        private static final /* synthetic */ b[] $values() {
            return new b[]{DIALOG, IN_APP_REVIEW};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(bVarArr$values);
        }

        private b(String str, int i, String str2) {
            this.value = str2;
        }

        public static InterfaceC4463a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Analytics.kt */
    /* renamed from: i8.a$c */
    public static final class c {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final String value;
        public static final c UNKNOWN = new c("UNKNOWN", 0, "unknown");
        public static final c HOLD = new c("HOLD", 1, "hold");
        public static final c RECOVERED = new c("RECOVERED", 2, "recovered");
        public static final c CANCELLED = new c("CANCELLED", 3, "cancelled");

        private static final /* synthetic */ c[] $values() {
            return new c[]{UNKNOWN, HOLD, RECOVERED, CANCELLED};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(cVarArr$values);
        }

        private c(String str, int i, String str2) {
            this.value = str2;
        }

        public static InterfaceC4463a<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: Analytics.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.Analytics$onAppOpened$1", f = "Analytics.kt", l = {514}, m = "invokeSuspend")
    /* renamed from: i8.a$d */
    public static final class d extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public C4461a f38495l;

        /* renamed from: m, reason: collision with root package name */
        public int f38496m;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ x f38498o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x xVar, InterfaceC4347e<? super d> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f38498o = xVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return C4461a.this.new d(this.f38498o, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((d) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C4461a c4461a;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f38496m;
            if (i == 0) {
                b9.n.b(obj);
                C4461a c4461a2 = C4461a.this;
                this.f38495l = c4461a2;
                this.f38496m = 1;
                x xVar = this.f38498o;
                xVar.getClass();
                Object objH = C0575f.h(U.f212b, new C0706v(xVar, null), this);
                if (objH == aVar) {
                    return aVar;
                }
                c4461a = c4461a2;
                obj = objH;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4461a = this.f38495l;
                b9.n.b(obj);
            }
            String installReferrer = (String) obj;
            c4461a.getClass();
            kotlin.jvm.internal.l.f(installReferrer, "installReferrer");
            if (installReferrer.length() == 0) {
                installReferrer = "not_set";
            }
            c4461a.s("Install", G0.d.a(new b9.l(AdRevenueConstants.SOURCE_KEY, installReferrer)));
            return C1992A.f18074a;
        }
    }

    /* compiled from: Analytics.kt */
    /* renamed from: i8.a$e */
    public static final class e extends AbstractC0686a {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f38500c;

        /* compiled from: Analytics.kt */
        @h9.e(c = "com.zipoapps.premiumhelper.Analytics$onAppOpened$2$onActivityResumed$1", f = "Analytics.kt", l = {533}, m = "invokeSuspend")
        /* renamed from: i8.a$e$a, reason: collision with other inner class name */
        public static final class C0467a extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public C4461a f38501l;

            /* renamed from: m, reason: collision with root package name */
            public String f38502m;

            /* renamed from: n, reason: collision with root package name */
            public int f38503n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ C4461a f38504o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f38505p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ x f38506q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0467a(C4461a c4461a, String str, x xVar, InterfaceC4347e<? super C0467a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f38504o = c4461a;
                this.f38505p = str;
                this.f38506q = xVar;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new C0467a(this.f38504o, this.f38505p, this.f38506q, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return ((C0467a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) throws Throwable {
                String launchFrom;
                C4461a c4461a;
                String value;
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f38503n;
                C4461a c4461a2 = this.f38504o;
                if (i == 0) {
                    b9.n.b(obj);
                    this.f38501l = c4461a2;
                    String str = this.f38505p;
                    this.f38502m = str;
                    this.f38503n = 1;
                    x xVar = this.f38506q;
                    xVar.getClass();
                    Object objH = C0575f.h(U.f212b, new C0706v(xVar, null), this);
                    if (objH == aVar) {
                        return aVar;
                    }
                    launchFrom = str;
                    obj = objH;
                    c4461a = c4461a2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    launchFrom = this.f38502m;
                    c4461a = this.f38501l;
                    b9.n.b(obj);
                }
                String installReferrer = (String) obj;
                ActivePurchaseInfo activePurchaseInfoH = c4461a2.f38486d.h();
                c4461a.getClass();
                kotlin.jvm.internal.l.f(launchFrom, "launchFrom");
                kotlin.jvm.internal.l.f(installReferrer, "installReferrer");
                try {
                    C2075b c2075bD = c4461a.d("App_open", new Bundle[0]);
                    c2075bD.b(AdRevenueConstants.SOURCE_KEY, launchFrom);
                    if (installReferrer.length() > 0) {
                        c2075bD.b("referrer", installReferrer);
                    }
                    ArrayList arrayList = c4461a.f38494m;
                    if (activePurchaseInfoH != null) {
                        I status = activePurchaseInfoH.getStatus();
                        if (status == null || (value = status.getValue()) == null) {
                            value = "";
                        }
                        c2075bD.a(Integer.valueOf(C4461a.b(activePurchaseInfoH.getPurchaseTime())), "days_since_purchase");
                        c2075bD.b("status", value);
                        arrayList.add(new w8.b(2, c4461a, value));
                    } else {
                        String str2 = c4461a.f38486d.f37004a.getBoolean("has_history_purchases", false) ? "back_to_free" : "free";
                        c2075bD.b("status", str2);
                        arrayList.add(new A8.j(1, c4461a, str2));
                        C0575f.e(C0580h0.f248b, null, null, new com.zipoapps.premiumhelper.a(c4461a, null), 3);
                    }
                    c4461a.q();
                    c4461a.r(c2075bD);
                } catch (Throwable th) {
                    c4461a.e().d(th);
                }
                return C1992A.f18074a;
            }
        }

        public e(x xVar) {
            this.f38500c = xVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
        @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onActivityResumed(android.app.Activity r11) {
            /*
                r10 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.l.f(r11, r0)
                android.content.Intent r0 = r11.getIntent()
                r1 = 0
                java.lang.String r2 = "app_launch_source"
                java.lang.String r3 = "shortcut"
                java.lang.String r4 = "widget"
                java.lang.String r5 = "notification"
                if (r0 == 0) goto L3b
                r6 = 0
                boolean r7 = r0.getBooleanExtra(r5, r6)
                if (r7 == 0) goto L1d
                r0 = r5
                goto L39
            L1d:
                boolean r7 = r0.getBooleanExtra(r4, r6)
                if (r7 == 0) goto L25
                r0 = r4
                goto L39
            L25:
                boolean r6 = r0.getBooleanExtra(r3, r6)
                if (r6 == 0) goto L2d
                r0 = r3
                goto L39
            L2d:
                boolean r6 = r0.hasExtra(r2)
                if (r6 == 0) goto L38
                java.lang.String r0 = r0.getStringExtra(r2)
                goto L39
            L38:
                r0 = r1
            L39:
                if (r0 != 0) goto L3d
            L3b:
                java.lang.String r0 = "launcher"
            L3d:
                A9.h0 r6 = A9.C0580h0.f248b
                i8.a$e$a r7 = new i8.a$e$a
                i8.a r8 = i8.C4461a.this
                J8.x r9 = r10.f38500c
                r7.<init>(r8, r0, r9, r1)
                r0 = 3
                A9.C0575f.e(r6, r1, r1, r7, r0)
                android.content.Intent r11 = r11.getIntent()
                if (r11 == 0) goto L5e
                r11.removeExtra(r5)
                r11.removeExtra(r4)
                r11.removeExtra(r3)
                r11.removeExtra(r2)
            L5e:
                com.zipoapps.premiumhelper.d r11 = r8.f38483a
                r11.unregisterActivityLifecycleCallbacks(r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i8.C4461a.e.onActivityResumed(android.app.Activity):void");
        }
    }

    /* compiled from: Analytics.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.Analytics$onPaidImpression$1", f = "Analytics.kt", l = {}, m = "invokeSuspend")
    /* renamed from: i8.a$f */
    public static final class f extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Bundle f38508m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Bundle bundle, InterfaceC4347e<? super f> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f38508m = bundle;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return C4461a.this.new f(this.f38508m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((f) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws JSONException {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            w9.i<Object>[] iVarArr = C4461a.f38482n;
            C4461a.this.getClass();
            Bundle bundle = this.f38508m;
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            l8.d<Boolean> PH_SINGULAR_ENABLED = i8.d.f38554d0;
            kotlin.jvm.internal.l.e(PH_SINGULAR_ENABLED, "PH_SINGULAR_ENABLED");
            if (((Boolean) eVarA.f37020j.h(PH_SINGULAR_ENABLED)).booleanValue()) {
                Object obj2 = bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                SingularAdData singularAdData = null;
                Double dValueOf = (obj2 instanceof Float ? (Float) obj2 : null) != null ? Double.valueOf(r0.floatValue()) : null;
                String strValueOf = String.valueOf(bundle.get(AppLovinEventParameters.REVENUE_CURRENCY));
                String strValueOf2 = String.valueOf(bundle.get("adunitid"));
                String strValueOf3 = String.valueOf(bundle.get("network"));
                String strValueOf4 = String.valueOf(bundle.get("mediation"));
                Object obj3 = bundle.get("ad_format");
                String type = strValueOf4.equalsIgnoreCase("applovin") ? N.APPLOVIN.getType() : N.ADMOB.getType();
                if (dValueOf != null) {
                    singularAdData = new SingularAdData(type, strValueOf, dValueOf.doubleValue());
                    singularAdData.withAdUnitId(strValueOf2);
                    singularAdData.withNetworkName(strValueOf3);
                    if (obj3 != null) {
                        singularAdData.withAdType(obj3.toString());
                    }
                    singularAdData.put("premium_helper_version", "5.0.3");
                }
                if (singularAdData != null) {
                    Singular.adRevenue(singularAdData);
                }
            } else {
                a.b bVar = va.a.f47104a;
                bVar.o("SingularUtils");
                bVar.a("SingularUtils:onPaidAdImpression: Singular disabled", new Object[0]);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: Analytics.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.Analytics$sendEvent$1", f = "Analytics.kt", l = {710}, m = "invokeSuspend")
    /* renamed from: i8.a$g */
    public static final class g extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public K9.d f38509l;

        /* renamed from: m, reason: collision with root package name */
        public C4461a f38510m;

        /* renamed from: n, reason: collision with root package name */
        public C2075b f38511n;

        /* renamed from: o, reason: collision with root package name */
        public int f38512o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C2075b f38514q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C2075b c2075b, InterfaceC4347e<? super g> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f38514q = c2075b;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return C4461a.this.new g(this.f38514q, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((g) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            C4461a c4461a;
            K9.d dVar;
            C2075b c2075b;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f38512o;
            if (i == 0) {
                b9.n.b(obj);
                c4461a = C4461a.this;
                K9.d dVar2 = c4461a.f38492k;
                this.f38509l = dVar2;
                this.f38510m = c4461a;
                C2075b c2075b2 = this.f38514q;
                this.f38511n = c2075b2;
                this.f38512o = 1;
                if (dVar2.a(this) == aVar) {
                    return aVar;
                }
                dVar = dVar2;
                c2075b = c2075b2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2075b = this.f38511n;
                c4461a = this.f38510m;
                dVar = this.f38509l;
                b9.n.b(obj);
            }
            try {
                c4461a.f38491j.add(c2075b);
                if (c4461a.f38493l) {
                    c4461a.a();
                }
                C1992A c1992a = C1992A.f18074a;
                dVar.c(null);
                return C1992A.f18074a;
            } catch (Throwable th) {
                dVar.c(null);
                throw th;
            }
        }
    }

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(C4461a.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        kotlin.jvm.internal.x.f43661a.getClass();
        f38482n = new w9.i[]{qVar};
    }

    public C4461a(com.zipoapps.premiumhelper.d dVar, l8.b bVar, C1991a c1991a, com.zipoapps.premiumhelper.c cVar, C5201c c5201c) {
        this.f38483a = dVar;
        this.f38484b = bVar;
        this.f38485c = c1991a;
        this.f38486d = cVar;
        this.f38487e = c5201c;
        new HashMap();
        this.f38491j = new LinkedList();
        this.f38492k = K9.f.a();
        this.f38494m = new ArrayList();
    }

    public static int b(long j4) {
        String id = TimeZone.getDefault().getID();
        Map<String, String> map = ma.p.f44145b;
        ma.p pVarD = ma.p.d(id, map);
        ma.d dVarL0 = ma.d.l0(j4);
        ma.f fVar = ma.f.f44102e;
        com.google.gson.internal.c.v(dVarL0, "instant");
        com.google.gson.internal.c.v(pVarD, "zone");
        ma.f fVarV0 = ma.f.v0(dVarL0.f44091b, dVarL0.f44092c, pVarD.c().a(dVarL0));
        ma.p pVarD2 = ma.p.d(TimeZone.getDefault().getID(), map);
        ma.e eVarD0 = ma.e.D0(com.google.gson.internal.c.o(ma.d.l0(System.currentTimeMillis()).f44091b + pVarD2.c().a(r0).f44150c, 86400L));
        ma.l lVar = ma.l.f44129e;
        ma.e eVar = fVarV0.f44104c;
        eVar.getClass();
        ma.e eVarT0 = ma.e.t0(eVarD0);
        long jX0 = eVarT0.x0() - eVar.x0();
        int iA0 = eVarT0.f44099e - eVar.f44099e;
        if (jX0 > 0 && iA0 < 0) {
            jX0--;
            iA0 = (int) (eVarT0.o0() - eVar.G0(jX0).o0());
        } else if (jX0 < 0 && iA0 > 0) {
            jX0++;
            iA0 -= eVarT0.A0();
        }
        int i = (int) (jX0 % 12);
        int iG = com.google.gson.internal.c.G(jX0 / 12);
        return (((iG | i) | iA0) == 0 ? ma.l.f44129e : new ma.l(iG, i, iA0)).f44133d;
    }

    public static void g(C4461a c4461a, P7.r type) {
        kotlin.jvm.internal.l.f(type, "type");
        try {
            C2075b c2075bD = c4461a.d("Ad_clicked", new Bundle[0]);
            String strName = type.name();
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.l.e(ROOT, "ROOT");
            String lowerCase = strName.toLowerCase(ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            c2075bD.f18555d.add(new C2074a(c2075bD.f18552a, "occurrence_" + lowerCase + "_clicked"));
            String lowerCase2 = type.name().toLowerCase(ROOT);
            kotlin.jvm.internal.l.e(lowerCase2, "toLowerCase(...)");
            c2075bD.b("type", lowerCase2);
            B7.e.f581d.q(c2075bD);
        } catch (Throwable th) {
            c4461a.e().d(th);
        }
    }

    public static void h(C4461a c4461a, P7.r type) {
        kotlin.jvm.internal.l.f(type, "type");
        try {
            C2075b c2075bD = c4461a.d("Ad_shown", new Bundle[0]);
            String strName = type.name();
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.l.e(ROOT, "ROOT");
            String lowerCase = strName.toLowerCase(ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            c2075bD.f18555d.add(new C2074a(c2075bD.f18552a, "occurrence_" + lowerCase + "_shown"));
            String lowerCase2 = type.name().toLowerCase(ROOT);
            kotlin.jvm.internal.l.e(lowerCase2, "toLowerCase(...)");
            c2075bD.b("type", lowerCase2);
            B7.e.f581d.q(c2075bD);
        } catch (Throwable th) {
            c4461a.e().d(th);
        }
    }

    public final void a() {
        C1992A c1992a;
        B7.e eVar;
        do {
            try {
                C2075b c2075b = (C2075b) this.f38491j.poll();
                c1992a = null;
                if (c2075b != null && (eVar = B7.e.f581d) != null) {
                    eVar.q(c2075b);
                    c1992a = C1992A.f18074a;
                }
            } catch (Throwable th) {
                e().d(th);
                return;
            }
        } while (c1992a != null);
    }

    public final C2075b c(String str, boolean z10, Bundle... bundleArr) {
        C2075b c2075b = new C2075b(str, z10);
        c2075b.a(Integer.valueOf(this.f38487e.d(this.f38483a)), "days_since_install");
        c2075b.f18555d.add(new C2074a(c2075b.f18552a, "occurrence"));
        for (Bundle bundle : bundleArr) {
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            c2075b.f18554c.putAll(bundle);
        }
        return c2075b;
    }

    public final C2075b d(String str, Bundle... bundleArr) {
        return c(str, true, (Bundle[]) Arrays.copyOf(bundleArr, bundleArr.length));
    }

    public final r8.c e() {
        return this.f38488f.a(this, f38482n[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(h9.c r13) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.C4461a.f(h9.c):java.lang.Object");
    }

    public final void i(x installReferrer) {
        PackageInfo packageInfo;
        kotlin.jvm.internal.l.f(installReferrer, "installReferrer");
        boolean z10 = this.f38486d.f37004a.getInt("app_start_counter", 0) == 0;
        com.zipoapps.premiumhelper.d dVar = this.f38483a;
        if (z10) {
            try {
                packageInfo = dVar.getPackageManager().getPackageInfo(dVar.getPackageName(), 0);
            } catch (Throwable unused) {
            }
            if (packageInfo.firstInstallTime == packageInfo.lastUpdateTime) {
                C0575f.e(C0580h0.f248b, null, null, new d(installReferrer, null), 3);
            }
        }
        dVar.registerActivityLifecycleCallbacks(new e(installReferrer));
    }

    public final void j(TotoApiResponseInfo responseInfo, String str) {
        kotlin.jvm.internal.l.f(responseInfo, "responseInfo");
        s("TotoGetConfig", G0.d.a(new b9.l("splash_timeout", String.valueOf(this.f38489g)), new b9.l("toto_response_code", String.valueOf(responseInfo.getResponseCode())), new b9.l("toto_latency", Long.valueOf(responseInfo.getResponseTime())), new b9.l("x_cache", str)));
    }

    public final void k(i.a happyMomentRateMode) {
        kotlin.jvm.internal.l.f(happyMomentRateMode, "happyMomentRateMode");
        s("Happy_Moment", G0.d.a(new b9.l("happy_moment", happyMomentRateMode.name())));
    }

    public final void l(Bundle bundle) {
        r(c("paid_ad_impression", false, bundle));
        C0575f.e(F.a(U.f211a), null, null, new f(bundle, null), 3);
    }

    public final void m(String adUnitId, AdValue adValue, String str) {
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        b9.l lVar = new b9.l("valuemicros", Long.valueOf(adValue.getValueMicros()));
        b9.l lVar2 = new b9.l(AppMeasurementSdk.ConditionalUserProperty.VALUE, Float.valueOf(adValue.getValueMicros() / 1000000.0f));
        b9.l lVar3 = new b9.l(AppLovinEventParameters.REVENUE_CURRENCY, adValue.getCurrencyCode());
        b9.l lVar4 = new b9.l("precision", Integer.valueOf(adValue.getPrecisionType()));
        b9.l lVar5 = new b9.l("adunitid", adUnitId);
        b9.l lVar6 = new b9.l("mediation", AppLovinMediationProvider.ADMOB);
        if (str == null) {
            str = "unknown";
        }
        l(G0.d.a(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, new b9.l("network", str)));
    }

    public final void n(String sku, String source) {
        kotlin.jvm.internal.l.f(sku, "sku");
        kotlin.jvm.internal.l.f(source, "source");
        s("Purchase_impression", G0.d.a(new b9.l(AppLovinEventParameters.PRODUCT_IDENTIFIER, sku), new b9.l("offer", source)));
    }

    public final void o(String sku) {
        kotlin.jvm.internal.l.f(sku, "sku");
        s("Relaunch", G0.d.a(new b9.l(AppLovinEventParameters.PRODUCT_IDENTIFIER, sku)));
    }

    public final void p(TotoApiResponseInfo responseInfo) {
        kotlin.jvm.internal.l.f(responseInfo, "responseInfo");
        s("TotoRegister", G0.d.a(new b9.l("toto_response_code", String.valueOf(responseInfo.getResponseCode())), new b9.l("toto_latency", Long.valueOf(responseInfo.getResponseTime()))));
    }

    public final void q() {
        if (B7.e.f581d != null) {
            ArrayList arrayList = this.f38494m;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC5480a) it.next()).invoke();
            }
            arrayList.clear();
        }
    }

    public final void r(C2075b c2075b) {
        C0575f.e(F.a(U.f211a), null, null, new g(c2075b, null), 3);
    }

    public final void s(String str, Bundle... params) {
        kotlin.jvm.internal.l.f(params, "params");
        r(d(str, (Bundle[]) Arrays.copyOf(params, params.length)));
    }

    public final void t(Object obj, String str) {
        try {
            B7.e eVar = B7.e.f581d;
            if (eVar != null) {
                eVar.p(obj, str);
            } else {
                e().c("Error. Trying to set user property before analytics initialization: ".concat(str), new Object[0]);
            }
        } catch (Throwable th) {
            e().d(th);
        }
    }

    public final void u(String str, Bundle... bundleArr) {
        com.zipoapps.premiumhelper.d dVar = this.f38483a;
        try {
            PackageInfo packageInfo = dVar.getPackageManager().getPackageInfo(dVar.getPackageName(), 0);
            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                return;
            }
        } catch (Throwable unused) {
        }
        SharedPreferences sharedPreferences = this.f38485c.f18073a;
        if (sharedPreferences.getBoolean(str, false)) {
            return;
        }
        s(str, (Bundle[]) Arrays.copyOf(bundleArr, bundleArr.length));
        Oo.j(sharedPreferences, str, true);
    }
}
