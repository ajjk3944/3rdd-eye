package P7;

import A9.C0575f;
import A9.C0583j;
import A9.InterfaceC0594o0;
import A9.U;
import b9.C1992A;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import f9.InterfaceC4347e;
import java.util.LinkedHashMap;
import java.util.Map;
import l8.b;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2", f = "AdManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class l extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super InterfaceC0594o0>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10755l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1484a f10756m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f10757n;

    /* compiled from: AdManager.kt */
    @h9.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1", f = "AdManager.kt", l = {198, 213, 219, 238}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public InitializationStatus f10758l;

        /* renamed from: m, reason: collision with root package name */
        public int f10759m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C1484a f10760n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f10761o;

        /* compiled from: AdManager.kt */
        @h9.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1$1", f = "AdManager.kt", l = {363}, m = "invokeSuspend")
        /* renamed from: P7.l$a$a, reason: collision with other inner class name */
        public static final class C0123a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super InitializationStatus>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f10762l;

            /* renamed from: m, reason: collision with root package name */
            public /* synthetic */ Object f10763m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ C1484a f10764n;

            /* compiled from: AdManager.kt */
            @h9.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1$1$1$1", f = "AdManager.kt", l = {222, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
            /* renamed from: P7.l$a$a$a, reason: collision with other inner class name */
            public static final class C0124a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

                /* renamed from: l, reason: collision with root package name */
                public int f10765l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C1484a f10766m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ C0583j f10767n;

                /* compiled from: AdManager.kt */
                @h9.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1$1$1$1$1", f = "AdManager.kt", l = {}, m = "invokeSuspend")
                /* renamed from: P7.l$a$a$a$a, reason: collision with other inner class name */
                public static final class C0125a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ C0583j f10768l;

                    /* compiled from: AdManager.kt */
                    /* renamed from: P7.l$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C0126a implements InitializationStatus {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C0126a f10769a = new C0126a();

                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map<String, AdapterStatus> getAdapterStatusMap() {
                            return new LinkedHashMap();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0125a(C0583j c0583j, InterfaceC4347e interfaceC4347e) {
                        super(2, interfaceC4347e);
                        this.f10768l = c0583j;
                    }

                    @Override // h9.AbstractC4424a
                    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                        return new C0125a(this.f10768l, interfaceC4347e);
                    }

                    @Override // p9.p
                    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                        return ((C0125a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
                    }

                    @Override // h9.AbstractC4424a
                    public final Object invokeSuspend(Object obj) {
                        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                        b9.n.b(obj);
                        C0583j c0583j = this.f10768l;
                        if (c0583j.isActive()) {
                            c0583j.resumeWith(C0126a.f10769a);
                        }
                        return C1992A.f18074a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0124a(C1484a c1484a, C0583j c0583j, InterfaceC4347e interfaceC4347e) {
                    super(2, interfaceC4347e);
                    this.f10766m = c1484a;
                    this.f10767n = c0583j;
                }

                @Override // h9.AbstractC4424a
                public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                    return new C0124a(this.f10766m, this.f10767n, interfaceC4347e);
                }

                @Override // p9.p
                public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                    return ((C0124a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
                
                    if (A9.C0575f.h(r8, r1, r7) == r0) goto L20;
                 */
                @Override // h9.AbstractC4424a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        g9.a r0 = g9.a.COROUTINE_SUSPENDED
                        int r1 = r7.f10765l
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1d
                        if (r1 == r3) goto L19
                        if (r1 != r2) goto L11
                        b9.n.b(r8)
                        goto L8b
                    L11:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L19:
                        b9.n.b(r8)
                        goto L78
                    L1d:
                        b9.n.b(r8)
                        r7.f10765l = r3
                        w9.i<java.lang.Object>[] r8 = P7.C1484a.f10712m
                        P7.a r8 = r7.f10766m
                        A9.j r1 = new A9.j
                        f9.e r4 = com.google.gson.internal.c.r(r7)
                        r1.<init>(r3, r4)
                        r1.s()
                        com.applovin.sdk.AppLovinPrivacySettings.setHasUserConsent(r3)
                        com.zipoapps.premiumhelper.d r3 = r8.f10714a
                        r4 = 2131951707(0x7f13005b, float:1.9539836E38)
                        java.lang.String r4 = r3.getString(r4)
                        com.applovin.sdk.AppLovinSdkInitializationConfiguration$Builder r4 = com.applovin.sdk.AppLovinSdkInitializationConfiguration.builder(r4)
                        java.lang.String r5 = "max"
                        com.applovin.sdk.AppLovinSdkInitializationConfiguration$Builder r4 = r4.setMediationProvider(r5)
                        l8.b r5 = r8.f10715b
                        com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r5 = r5.f43910b
                        android.os.Bundle r5 = r5.getDebugData()
                        if (r5 == 0) goto L61
                        java.lang.String r6 = "test_advertising_ids"
                        java.lang.String[] r5 = r5.getStringArray(r6)
                        if (r5 == 0) goto L61
                        java.util.List r5 = c9.C2091l.t(r5)
                        r4.setTestDeviceAdvertisingIds(r5)
                    L61:
                        com.applovin.sdk.AppLovinSdk r3 = com.applovin.sdk.AppLovinSdk.getInstance(r3)
                        com.applovin.sdk.AppLovinSdkInitializationConfiguration r4 = r4.build()
                        P7.i r5 = new P7.i
                        r5.<init>(r8, r1)
                        r3.initialize(r4, r5)
                        java.lang.Object r8 = r1.r()
                        if (r8 != r0) goto L78
                        goto L8a
                    L78:
                        I9.b r8 = A9.U.f212b
                        P7.l$a$a$a$a r1 = new P7.l$a$a$a$a
                        A9.j r3 = r7.f10767n
                        r4 = 0
                        r1.<init>(r3, r4)
                        r7.f10765l = r2
                        java.lang.Object r8 = A9.C0575f.h(r8, r1, r7)
                        if (r8 != r0) goto L8b
                    L8a:
                        return r0
                    L8b:
                        b9.A r8 = b9.C1992A.f18074a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: P7.l.a.C0123a.C0124a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0123a(C1484a c1484a, InterfaceC4347e<? super C0123a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f10764n = c1484a;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                C0123a c0123a = new C0123a(this.f10764n, interfaceC4347e);
                c0123a.f10763m = obj;
                return c0123a;
            }

            @Override // p9.p
            public final Object invoke(A9.E e4, InterfaceC4347e<? super InitializationStatus> interfaceC4347e) {
                return ((C0123a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f10762l;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9.n.b(obj);
                    return obj;
                }
                b9.n.b(obj);
                A9.E e4 = (A9.E) this.f10763m;
                this.f10763m = e4;
                C1484a c1484a = this.f10764n;
                this.f10762l = 1;
                C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
                c0583j.s();
                I9.c cVar = U.f211a;
                C0575f.e(e4, F9.q.f1782a, null, new C0124a(c1484a, c0583j, null), 2);
                Object objR = c0583j.r();
                return objR == aVar ? aVar : objR;
            }
        }

        /* compiled from: AdManager.kt */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10770a;

            static {
                int[] iArr = new int[b.a.values().length];
                try {
                    iArr[b.a.ADMOB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.a.APPLOVIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f10770a = iArr;
            }
        }

        /* compiled from: AdManager.kt */
        @h9.e(c = "com.zipoapps.ads.AdManager$initializeAdSDK$2$1$status$1", f = "AdManager.kt", l = {363}, m = "invokeSuspend")
        public static final class c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super InitializationStatus>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f10771l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C1484a f10772m;

            /* compiled from: AdManager.kt */
            /* renamed from: P7.l$a$c$a, reason: collision with other inner class name */
            public static final class C0127a implements OnInitializationCompleteListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ C0583j f10773a;

                public C0127a(C0583j c0583j) {
                    this.f10773a = c0583j;
                }

                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus status) {
                    kotlin.jvm.internal.l.f(status, "status");
                    C0583j c0583j = this.f10773a;
                    if (c0583j.isActive()) {
                        c0583j.resumeWith(status);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C1484a c1484a, InterfaceC4347e<? super c> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f10772m = c1484a;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new c(this.f10772m, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(A9.E e4, InterfaceC4347e<? super InitializationStatus> interfaceC4347e) {
                return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f10771l;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9.n.b(obj);
                    return obj;
                }
                b9.n.b(obj);
                C1484a c1484a = this.f10772m;
                this.f10771l = 1;
                C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
                c0583j.s();
                MobileAds.initialize(c1484a.f10714a, new C0127a(c0583j));
                Object objR = c0583j.r();
                return objR == aVar ? aVar : objR;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1484a c1484a, long j4, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f10760n = c1484a;
            this.f10761o = j4;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f10760n, this.f10761o, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
        
            if (b9.C1992A.f18074a != r0) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0115 A[LOOP:0: B:47:0x010f->B:49:0x0115, LOOP_END] */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 349
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: P7.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C1484a c1484a, long j4, InterfaceC4347e<? super l> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10756m = c1484a;
        this.f10757n = j4;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        l lVar = new l(this.f10756m, this.f10757n, interfaceC4347e);
        lVar.f10755l = obj;
        return lVar;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super InterfaceC0594o0> interfaceC4347e) {
        return ((l) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        return C0575f.e((A9.E) this.f10755l, U.f212b, null, new a(this.f10756m, this.f10757n, null), 2);
    }
}
