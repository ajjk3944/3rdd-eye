package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class k6 implements b7 {

    /* renamed from: a, reason: collision with root package name */
    private final AdQualityVerifierAdapter f29518a;

    /* renamed from: b, reason: collision with root package name */
    private final AdQualityVerifierAdapterConfiguration f29519b;

    /* renamed from: c, reason: collision with root package name */
    private final long f29520c;

    /* renamed from: d, reason: collision with root package name */
    private final z6 f29521d;

    /* renamed from: e, reason: collision with root package name */
    private final t6 f29522e;

    /* renamed from: f, reason: collision with root package name */
    private final u6 f29523f;

    @h9.e(c = "com.monetization.ads.base.quality.policy.AdQualitySdkVerifierWithPolicy", f = "AdQualitySdkVerifierWithPolicy.kt", l = {82}, m = "verifyAdWithPolicy")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29524b;

        /* renamed from: d, reason: collision with root package name */
        int f29526d;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f29524b = obj;
            this.f29526d |= RecyclerView.UNDEFINED_DURATION;
            return k6.a(k6.this, this);
        }
    }

    @h9.e(c = "com.monetization.ads.base.quality.policy.AdQualitySdkVerifierWithPolicy", f = "AdQualitySdkVerifierWithPolicy.kt", l = {97}, m = "verifyAdWithTimeout")
    public static final class b extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        k6 f29527b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29528c;

        /* renamed from: e, reason: collision with root package name */
        int f29530e;

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f29528c = obj;
            this.f29530e |= RecyclerView.UNDEFINED_DURATION;
            return k6.b(k6.this, this);
        }
    }

    @h9.e(c = "com.monetization.ads.base.quality.policy.AdQualitySdkVerifierWithPolicy$verifyAdWithTimeout$2", f = "AdQualitySdkVerifierWithPolicy.kt", l = {99}, m = "invokeSuspend")
    public static final class c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super AdQualityVerificationResult>, Object> {

        /* renamed from: b, reason: collision with root package name */
        t6 f29531b;

        /* renamed from: c, reason: collision with root package name */
        int f29532c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f29534e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AdQualityVerificationAdConfiguration f29535f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f29534e = context;
            this.f29535f = adQualityVerificationAdConfiguration;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return k6.this.new c(this.f29534e, this.f29535f, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super AdQualityVerificationResult> interfaceC4347e) {
            return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            t6 t6Var;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f29532c;
            if (i == 0) {
                b9.n.b(obj);
                t6 t6Var2 = k6.this.f29522e;
                AdQualityVerifierAdapter adQualityVerifierAdapter = k6.this.f29518a;
                Context context = this.f29534e;
                AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = k6.this.f29519b;
                AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = this.f29535f;
                this.f29531b = t6Var2;
                this.f29532c = 1;
                Object objVerifyAd = adQualityVerifierAdapter.verifyAd(context, adQualityVerifierAdapterConfiguration, adQualityVerificationAdConfiguration, this);
                if (objVerifyAd == aVar) {
                    return aVar;
                }
                t6Var = t6Var2;
                obj = objVerifyAd;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t6Var = this.f29531b;
                b9.n.b(obj);
            }
            return t6Var.a((AdQualityVerificationResult) obj);
        }
    }

    public /* synthetic */ k6(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j4, z6 z6Var, t6 t6Var) {
        this(adQualityVerifierAdapter, adQualityVerifierAdapterConfiguration, j4, z6Var, t6Var, new u6());
    }

    @Override // com.yandex.mobile.ads.impl.b7
    public final void onAdClicked() {
        try {
            this.f29518a.onAdClicked();
            C1992A c1992a = C1992A.f18074a;
        } catch (Throwable th) {
            b9.n.a(th);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b7
    public final void onAdClosed() {
        try {
            this.f29518a.onAdClosed();
            C1992A c1992a = C1992A.f18074a;
        } catch (Throwable th) {
            b9.n.a(th);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b7
    public final void onAdWillDisplay() {
        try {
            this.f29518a.onAdWillDisplay();
            C1992A c1992a = C1992A.f18074a;
        } catch (Throwable th) {
            b9.n.a(th);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b7
    public final void onInvalidated() {
        try {
            this.f29518a.onInvalidated();
            C1992A c1992a = C1992A.f18074a;
        } catch (Throwable th) {
            b9.n.a(th);
        }
    }

    public static final /* synthetic */ Object a(k6 k6Var, InterfaceC4347e interfaceC4347e) {
        return k6Var.a(null, null, interfaceC4347e);
    }

    public static final /* synthetic */ Object b(k6 k6Var, InterfaceC4347e interfaceC4347e) {
        return k6Var.b(null, null, interfaceC4347e);
    }

    public k6(AdQualityVerifierAdapter verifierAdapter, AdQualityVerifierAdapterConfiguration verifierAdapterConfiguration, long j4, z6 policyAcceptor, t6 statusHandler, u6 verifierAdConfigurationCreator) {
        kotlin.jvm.internal.l.f(verifierAdapter, "verifierAdapter");
        kotlin.jvm.internal.l.f(verifierAdapterConfiguration, "verifierAdapterConfiguration");
        kotlin.jvm.internal.l.f(policyAcceptor, "policyAcceptor");
        kotlin.jvm.internal.l.f(statusHandler, "statusHandler");
        kotlin.jvm.internal.l.f(verifierAdConfigurationCreator, "verifierAdConfigurationCreator");
        this.f29518a = verifierAdapter;
        this.f29519b = verifierAdapterConfiguration;
        this.f29520c = j4;
        this.f29521d = policyAcceptor;
        this.f29522e = statusHandler;
        this.f29523f = verifierAdConfigurationCreator;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object a(android.content.Context r5, com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration r6, f9.InterfaceC4347e<? super com.monetization.ads.quality.base.result.AdQualityVerificationResult> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.yandex.mobile.ads.impl.k6.a
            if (r0 == 0) goto L13
            r0 = r7
            com.yandex.mobile.ads.impl.k6$a r0 = (com.yandex.mobile.ads.impl.k6.a) r0
            int r1 = r0.f29526d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29526d = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.k6$a r0 = new com.yandex.mobile.ads.impl.k6$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29524b
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f29526d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b9.n.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L45
        L27:
            r5 = move-exception
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            b9.n.b(r7)
            com.yandex.mobile.ads.impl.z6 r7 = r4.f29521d     // Catch: java.lang.Throwable -> L27
            com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotVerified r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L27
            if (r7 != 0) goto L4c
            r0.f29526d = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r4.b(r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L45
            return r1
        L45:
            com.monetization.ads.quality.base.result.AdQualityVerificationResult r7 = (com.monetization.ads.quality.base.result.AdQualityVerificationResult) r7     // Catch: java.lang.Throwable -> L27
            goto L4c
        L48:
            b9.m$a r7 = b9.n.a(r5)
        L4c:
            java.lang.Throwable r5 = b9.m.a(r7)
            if (r5 != 0) goto L53
            goto L65
        L53:
            com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotVerified r7 = new com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotVerified
            com.monetization.ads.quality.base.model.AdQualityVerificationError$UnknownError r6 = new com.monetization.ads.quality.base.model.AdQualityVerificationError$UnknownError
            java.lang.String r5 = r5.getMessage()
            if (r5 != 0) goto L5f
            java.lang.String r5 = "Unknown error with empty description"
        L5f:
            r6.<init>(r5)
            r7.<init>(r6)
        L65:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k6.a(android.content.Context, com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration, f9.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b(android.content.Context r7, com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration r8, f9.InterfaceC4347e<? super com.monetization.ads.quality.base.result.AdQualityVerificationResult> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yandex.mobile.ads.impl.k6.b
            if (r0 == 0) goto L13
            r0 = r9
            com.yandex.mobile.ads.impl.k6$b r0 = (com.yandex.mobile.ads.impl.k6.b) r0
            int r1 = r0.f29530e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29530e = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.k6$b r0 = new com.yandex.mobile.ads.impl.k6$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29528c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f29530e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.yandex.mobile.ads.impl.k6 r7 = r0.f29527b
            b9.n.b(r9)     // Catch: A9.O0 -> L52
            goto L4e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            b9.n.b(r9)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: A9.O0 -> L51
            long r4 = r6.f29520c     // Catch: A9.O0 -> L51
            long r4 = r9.toMillis(r4)     // Catch: A9.O0 -> L51
            com.yandex.mobile.ads.impl.k6$c r9 = new com.yandex.mobile.ads.impl.k6$c     // Catch: A9.O0 -> L51
            r2 = 0
            r9.<init>(r7, r8, r2)     // Catch: A9.O0 -> L51
            r0.f29527b = r6     // Catch: A9.O0 -> L51
            r0.f29530e = r3     // Catch: A9.O0 -> L51
            java.lang.Object r9 = A9.C0585k.b(r4, r9, r0)     // Catch: A9.O0 -> L51
            if (r9 != r1) goto L4d
            return r1
        L4d:
            r7 = r6
        L4e:
            com.monetization.ads.quality.base.result.AdQualityVerificationResult r9 = (com.monetization.ads.quality.base.result.AdQualityVerificationResult) r9     // Catch: A9.O0 -> L52
            return r9
        L51:
            r7 = r6
        L52:
            com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotVerified r8 = new com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotVerified
            com.monetization.ads.quality.base.model.AdQualityVerificationError$TimeoutError r9 = new com.monetization.ads.quality.base.model.AdQualityVerificationError$TimeoutError
            long r0 = r7.f29520c
            r9.<init>(r0)
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k6.b(android.content.Context, com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration, f9.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0012, B:19:0x0036, B:22:0x0042, B:23:0x004f, B:25:0x0055, B:29:0x0068, B:33:0x0074, B:35:0x0078, B:38:0x0081, B:41:0x008a, B:44:0x0093, B:47:0x009c, B:50:0x00a5, B:12:0x0027, B:15:0x002d, B:16:0x0030, B:17:0x0033), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0012, B:19:0x0036, B:22:0x0042, B:23:0x004f, B:25:0x0055, B:29:0x0068, B:33:0x0074, B:35:0x0078, B:38:0x0081, B:41:0x008a, B:44:0x0093, B:47:0x009c, B:50:0x00a5, B:12:0x0027, B:15:0x002d, B:16:0x0030, B:17:0x0033), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0012, B:19:0x0036, B:22:0x0042, B:23:0x004f, B:25:0x0055, B:29:0x0068, B:33:0x0074, B:35:0x0078, B:38:0x0081, B:41:0x008a, B:44:0x0093, B:47:0x009c, B:50:0x00a5, B:12:0x0027, B:15:0x002d, B:16:0x0030, B:17:0x0033), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0012, B:19:0x0036, B:22:0x0042, B:23:0x004f, B:25:0x0055, B:29:0x0068, B:33:0x0074, B:35:0x0078, B:38:0x0081, B:41:0x008a, B:44:0x0093, B:47:0x009c, B:50:0x00a5, B:12:0x0027, B:15:0x002d, B:16:0x0030, B:17:0x0033), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0012, B:19:0x0036, B:22:0x0042, B:23:0x004f, B:25:0x0055, B:29:0x0068, B:33:0x0074, B:35:0x0078, B:38:0x0081, B:41:0x008a, B:44:0x0093, B:47:0x009c, B:50:0x00a5, B:12:0x0027, B:15:0x002d, B:16:0x0030, B:17:0x0033), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0012, B:19:0x0036, B:22:0x0042, B:23:0x004f, B:25:0x0055, B:29:0x0068, B:33:0x0074, B:35:0x0078, B:38:0x0081, B:41:0x008a, B:44:0x0093, B:47:0x009c, B:50:0x00a5, B:12:0x0027, B:15:0x002d, B:16:0x0030, B:17:0x0033), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0067 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r13, java.lang.Object r14, com.yandex.mobile.ads.impl.a8<?> r15, com.yandex.mobile.ads.impl.C4072a3 r16, com.monetization.ads.mediation.base.model.MediatedAdObjectInfo r17, f9.InterfaceC4347e<? super com.monetization.ads.quality.base.result.AdQualityVerificationResult> r18) {
        /*
            r12 = this;
            com.yandex.mobile.ads.impl.u6 r0 = r12.f29523f
            r0.getClass()
            java.lang.String r0 = "adObject"
            kotlin.jvm.internal.l.f(r14, r0)
            java.lang.String r0 = "adConfiguration"
            r1 = r16
            kotlin.jvm.internal.l.f(r1, r0)
            r11 = 0
            com.yandex.mobile.ads.impl.ns r0 = r1.b()     // Catch: java.lang.Throwable -> L2a
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L33
            r2 = 1
            if (r0 == r2) goto L30
            r2 = 2
            if (r0 == r2) goto L2d
            r2 = 3
            if (r0 == r2) goto L27
            r5 = r11
            goto L36
        L27:
            com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType r0 = com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType.NATIVE     // Catch: java.lang.Throwable -> L2a
            goto L35
        L2a:
            r0 = move-exception
            goto Laa
        L2d:
            com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType r0 = com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType.REWARDED     // Catch: java.lang.Throwable -> L2a
            goto L35
        L30:
            com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType r0 = com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType.INTERSTITIAL     // Catch: java.lang.Throwable -> L2a
            goto L35
        L33:
            com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType r0 = com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType.BANNER     // Catch: java.lang.Throwable -> L2a
        L35:
            r5 = r0
        L36:
            java.lang.String r3 = r1.c()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = r1.j()     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L42
            java.lang.String r0 = "yandex"
        L42:
            com.yandex.mobile.ads.impl.l6$a r1 = com.yandex.mobile.ads.impl.l6.f29895c     // Catch: java.lang.Throwable -> L2a
            r1.getClass()     // Catch: java.lang.Throwable -> L2a
            i9.a r1 = com.yandex.mobile.ads.impl.l6.a()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        L4f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            r6 = r2
            com.yandex.mobile.ads.impl.l6 r6 = (com.yandex.mobile.ads.impl.l6) r6     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = r6.b()     // Catch: java.lang.Throwable -> L2a
            boolean r6 = kotlin.jvm.internal.l.b(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L4f
            goto L68
        L67:
            r2 = r11
        L68:
            com.yandex.mobile.ads.impl.l6 r2 = (com.yandex.mobile.ads.impl.l6) r2     // Catch: java.lang.Throwable -> L2a
            com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork r2 = com.yandex.mobile.ads.impl.l6.a.a(r2)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto Lad
            if (r3 == 0) goto Lad
            if (r2 == 0) goto Lad
            com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration r1 = new com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration     // Catch: java.lang.Throwable -> L2a
            if (r17 == 0) goto L7e
            java.lang.String r0 = r17.getAdContent()     // Catch: java.lang.Throwable -> L2a
            r6 = r0
            goto L7f
        L7e:
            r6 = r11
        L7f:
            if (r17 == 0) goto L87
            java.lang.String r0 = r17.getAdUnitId()     // Catch: java.lang.Throwable -> L2a
            r7 = r0
            goto L88
        L87:
            r7 = r11
        L88:
            if (r15 == 0) goto L90
            java.lang.String r0 = r15.d()     // Catch: java.lang.Throwable -> L2a
            r8 = r0
            goto L91
        L90:
            r8 = r11
        L91:
            if (r17 == 0) goto L99
            java.lang.String r0 = r17.getAdId()     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            goto L9a
        L99:
            r9 = r11
        L9a:
            if (r17 == 0) goto La3
            java.util.Map r0 = r17.getExtraData()     // Catch: java.lang.Throwable -> L2a
            r10 = r0
        La1:
            r4 = r14
            goto La5
        La3:
            r10 = r11
            goto La1
        La5:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2a
            r11 = r1
            goto Lad
        Laa:
            b9.n.a(r0)
        Lad:
            if (r11 == 0) goto Lb6
            r2 = r18
            java.lang.Object r0 = r12.a(r13, r11, r2)
            return r0
        Lb6:
            com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotVerified r0 = new com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotVerified
            com.monetization.ads.quality.base.model.AdQualityVerificationError$InternalError r1 = new com.monetization.ads.quality.base.model.AdQualityVerificationError$InternalError
            java.lang.String r2 = "Failed to create ad configuration for verification"
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k6.a(android.content.Context, java.lang.Object, com.yandex.mobile.ads.impl.a8, com.yandex.mobile.ads.impl.a3, com.monetization.ads.mediation.base.model.MediatedAdObjectInfo, f9.e):java.lang.Object");
    }
}
