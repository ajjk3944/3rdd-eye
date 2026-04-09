package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.o91;

/* loaded from: classes3.dex */
public final class q90 extends x80 {

    /* renamed from: A, reason: collision with root package name */
    private final k71 f32107A;

    /* renamed from: B, reason: collision with root package name */
    private final o91 f32108B;

    /* renamed from: C, reason: collision with root package name */
    private final dg0 f32109C;

    /* renamed from: x, reason: collision with root package name */
    private final u90 f32110x;

    /* renamed from: y, reason: collision with root package name */
    private final h7 f32111y;

    /* renamed from: z, reason: collision with root package name */
    private final rt1 f32112z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(Context context, vu1 sdkEnvironmentModule, C4072a3 adConfiguration, u90 feedItemLoadListener, h7 adRequestData, fa0 fa0Var, rt1 sdkAdapterReporter, k71 requestParameterManager, o91 nativeResponseCreator, dg0 htmlAdResponseReportManager) {
        super(context, adConfiguration, new C4198s4(), fa0Var);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(feedItemLoadListener, "feedItemLoadListener");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(sdkAdapterReporter, "sdkAdapterReporter");
        kotlin.jvm.internal.l.f(requestParameterManager, "requestParameterManager");
        kotlin.jvm.internal.l.f(nativeResponseCreator, "nativeResponseCreator");
        kotlin.jvm.internal.l.f(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        this.f32110x = feedItemLoadListener;
        this.f32111y = adRequestData;
        this.f32112z = sdkAdapterReporter;
        this.f32107A = requestParameterManager;
        this.f32108B = nativeResponseCreator;
        this.f32109C = htmlAdResponseReportManager;
    }

    public final void y() {
        b(this.f32111y);
    }

    public final class b implements o91.b {

        /* renamed from: a, reason: collision with root package name */
        private final a8<String> f32115a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q90 f32116b;

        public b(q90 q90Var, a8<String> adResponse) {
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            this.f32116b = q90Var;
            this.f32115a = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.o91.b
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            this.f32116b.b(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.o91.b
        public final void a(h61 nativeAd) {
            kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
            if (nativeAd instanceof pz1) {
                this.f32116b.u();
                this.f32116b.f32110x.a(new tr0((pz1) nativeAd, this.f32115a));
            } else {
                this.f32116b.b(i7.x());
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        super.a(error);
        this.f32110x.a(error);
    }

    public final class a implements xq1 {

        /* renamed from: a, reason: collision with root package name */
        private final a8<String> f32113a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q90 f32114b;

        public a(q90 q90Var, a8<String> adResponse) {
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            this.f32114b = q90Var;
            this.f32113a = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            this.f32114b.f32112z.a(this.f32114b.l(), this.f32113a, this.f32114b.f32107A);
            this.f32114b.f32112z.a(this.f32114b.l(), this.f32113a, (l71) null);
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(p61 nativeAdResponse) {
            kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
            l71 l71Var = new l71(this.f32113a, nativeAdResponse, this.f32114b.f());
            this.f32114b.f32112z.a(this.f32114b.l(), this.f32113a, this.f32114b.f32107A);
            this.f32114b.f32112z.a(this.f32114b.l(), this.f32113a, l71Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vj, com.yandex.mobile.ads.impl.rq1.b
    public final void a(a8<String> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        super.a((a8) adResponse);
        this.f32109C.a(adResponse);
        this.f32109C.a(f());
        this.f32108B.a(adResponse, new b(this, adResponse), new a(this, adResponse));
    }
}
