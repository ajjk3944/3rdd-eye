package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.yandex.mobile.ads.impl.ew1;
import f9.InterfaceC4347e;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f35194a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35195b;

    /* renamed from: c, reason: collision with root package name */
    private final q6 f35196c;

    /* renamed from: d, reason: collision with root package name */
    private a8<?> f35197d;

    /* renamed from: e, reason: collision with root package name */
    private AdQualityVerificationResult f35198e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2000g f35199f;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<b7> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final b7 invoke() {
            return new c7(0).a(x6.this.f35195b);
        }
    }

    @h9.e(c = "com.monetization.ads.base.quality.AdQualityVerifierController", f = "AdQualityVerifierController.kt", l = {42}, m = "verifyAd-BWLJW6A")
    public static final class b extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        x6 f35201b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f35202c;

        /* renamed from: e, reason: collision with root package name */
        int f35204e;

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f35202c = obj;
            this.f35204e |= RecyclerView.UNDEFINED_DURATION;
            Object objA = x6.this.a(null, null, null, this);
            return objA == g9.a.COROUTINE_SUSPENDED ? objA : new b9.m(objA);
        }
    }

    public /* synthetic */ x6(C4072a3 c4072a3, Context context) {
        this(c4072a3, context, new q6(c4072a3));
    }

    private final boolean e() {
        du1 du1VarA = ew1.a.a().a(this.f35195b);
        n6 n6VarF = du1VarA != null ? du1VarA.f() : null;
        return n6VarF != null && n6VarF.e();
    }

    public final void b() {
        if (e()) {
            ((b7) this.f35199f.getValue()).onAdClosed();
            d();
        }
    }

    public final void c() {
        if (e()) {
            ((b7) this.f35199f.getValue()).onAdWillDisplay();
        }
    }

    public final void d() {
        if (e()) {
            this.f35196c.a(this.f35195b, this.f35198e, this.f35197d);
            ((b7) this.f35199f.getValue()).onInvalidated();
        }
    }

    public final void a() {
        if (e()) {
            ((b7) this.f35199f.getValue()).onAdClicked();
        }
    }

    public x6(C4072a3 adConfiguration, Context context, q6 adQualityVerificationReporter) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adQualityVerificationReporter, "adQualityVerificationReporter");
        this.f35194a = adConfiguration;
        this.f35195b = context;
        this.f35196c = adQualityVerificationReporter;
        this.f35198e = AdQualityVerificationResult.WaitingForVerification.INSTANCE;
        this.f35199f = C2001h.b(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, com.yandex.mobile.ads.impl.a8<?> r10, com.monetization.ads.mediation.base.model.MediatedAdObjectInfo r11, f9.InterfaceC4347e<? super b9.m<b9.C1992A>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.yandex.mobile.ads.impl.x6.b
            if (r0 == 0) goto L14
            r0 = r12
            com.yandex.mobile.ads.impl.x6$b r0 = (com.yandex.mobile.ads.impl.x6.b) r0
            int r1 = r0.f35204e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f35204e = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.yandex.mobile.ads.impl.x6$b r0 = new com.yandex.mobile.ads.impl.x6$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f35202c
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r7.f35204e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            com.yandex.mobile.ads.impl.x6 r9 = r7.f35201b
            b9.n.b(r12)
            goto L5b
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            b9.n.b(r12)
            boolean r12 = r8.e()
            if (r12 == 0) goto Lb4
            r8.f35197d = r10
            b9.g r12 = r8.f35199f
            java.lang.Object r12 = r12.getValue()
            r1 = r12
            com.yandex.mobile.ads.impl.b7 r1 = (com.yandex.mobile.ads.impl.b7) r1
            r12 = r2
            android.content.Context r2 = r8.f35195b
            com.yandex.mobile.ads.impl.a3 r5 = r8.f35194a
            r7.f35201b = r8
            r7.f35204e = r12
            r3 = r9
            r4 = r10
            r6 = r11
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L5a
            return r0
        L5a:
            r9 = r8
        L5b:
            com.monetization.ads.quality.base.result.AdQualityVerificationResult r12 = (com.monetization.ads.quality.base.result.AdQualityVerificationResult) r12
            r9.f35198e = r12
            boolean r10 = r12 instanceof com.monetization.ads.quality.base.result.AdQualityVerificationResult.Verified
            if (r10 == 0) goto L89
            com.monetization.ads.quality.base.result.AdQualityVerificationResult$Verified r12 = (com.monetization.ads.quality.base.result.AdQualityVerificationResult.Verified) r12
            com.monetization.ads.quality.base.AdQualityVerificationStateFlow r10 = r12.getVerifiedAd()
            D9.I r10 = r10.getVerificationResultStateFlow()
            java.lang.Object r10 = r10.getValue()
            com.monetization.ads.quality.base.state.AdQualityVerificationState r10 = (com.monetization.ads.quality.base.state.AdQualityVerificationState) r10
            boolean r11 = r10 instanceof com.monetization.ads.quality.base.state.AdQualityVerificationState.Blocked
            if (r11 == 0) goto L7e
            com.monetization.ads.quality.base.state.AdQualityVerificationState$Blocked r10 = (com.monetization.ads.quality.base.state.AdQualityVerificationState.Blocked) r10
            com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons r10 = r10.getReason()
            goto L8a
        L7e:
            boolean r11 = r10 instanceof com.monetization.ads.quality.base.state.AdQualityVerificationState.ShouldBeBlockedOnDisplay
            if (r11 == 0) goto L89
            com.monetization.ads.quality.base.state.AdQualityVerificationState$ShouldBeBlockedOnDisplay r10 = (com.monetization.ads.quality.base.state.AdQualityVerificationState.ShouldBeBlockedOnDisplay) r10
            com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons r10 = r10.getReason()
            goto L8a
        L89:
            r10 = 0
        L8a:
            if (r10 == 0) goto Lb1
            java.util.List r11 = r10.getBlockReasons()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto La0
            java.util.List r11 = r10.getReportReasons()
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto Lb1
        La0:
            r9.d()
            java.lang.Throwable r9 = new java.lang.Throwable
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            b9.m$a r9 = b9.n.a(r9)
            return r9
        Lb1:
            b9.A r9 = b9.C1992A.f18074a
            return r9
        Lb4:
            b9.A r9 = b9.C1992A.f18074a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.x6.a(java.lang.Object, com.yandex.mobile.ads.impl.a8, com.monetization.ads.mediation.base.model.MediatedAdObjectInfo, f9.e):java.lang.Object");
    }
}
