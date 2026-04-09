package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class g61 {

    /* renamed from: a, reason: collision with root package name */
    private final a61 f27557a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f27558b;

    /* renamed from: c, reason: collision with root package name */
    private final C4212u4 f27559c;

    /* renamed from: d, reason: collision with root package name */
    private ot f27560d;

    /* renamed from: e, reason: collision with root package name */
    private ut f27561e;

    /* renamed from: f, reason: collision with root package name */
    private du f27562f;

    public g61(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, a61 nativeAdLoadingFinishedListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(nativeAdLoadingFinishedListener, "nativeAdLoadingFinishedListener");
        this.f27557a = nativeAdLoadingFinishedListener;
        this.f27558b = new Handler(Looper.getMainLooper());
        this.f27559c = new C4212u4(context, adConfiguration, adLoadingPhasesManager);
    }

    public final void a() {
        this.f27558b.removeCallbacksAndMessages(null);
    }

    private final void a(C4128i3 c4128i3) {
        this.f27559c.a(c4128i3.c());
        this.f27558b.post(new V1(5, this, c4128i3));
    }

    public final void b(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g61 this$0, C4128i3 error) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(error, "$error");
        ot otVar = this$0.f27560d;
        if (otVar != null) {
            otVar.a(error);
        }
        ut utVar = this$0.f27561e;
        if (utVar != null) {
            utVar.a(error);
        }
        du duVar = this$0.f27562f;
        if (duVar != null) {
            duVar.a(error);
        }
        this$0.f27557a.a();
    }

    public final void a(h61 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        C4156m3.a(ns.f30991g.b());
        this.f27559c.a();
        this.f27558b.post(new L(3, this, nativeAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g61 this$0, h61 nativeAd) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(nativeAd, "$nativeAd");
        ot otVar = this$0.f27560d;
        if (otVar != null) {
            if (nativeAd instanceof i91) {
                otVar.b(nativeAd);
            } else {
                otVar.a(nativeAd);
            }
        }
        this$0.f27557a.a();
    }

    public final void a(ArrayList nativeAds) {
        kotlin.jvm.internal.l.f(nativeAds, "nativeAds");
        C4156m3.a(ns.f30991g.b());
        this.f27559c.a();
        this.f27558b.post(new L4(5, this, nativeAds));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g61 this$0, List nativeAds) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(nativeAds, "$nativeAds");
        ut utVar = this$0.f27561e;
        if (utVar != null) {
            utVar.onAdsLoaded(nativeAds);
        }
        this$0.f27557a.a();
    }

    public final void a(a81 sliderAd) {
        kotlin.jvm.internal.l.f(sliderAd, "sliderAd");
        C4156m3.a(ns.f30991g.b());
        this.f27559c.a();
        this.f27558b.post(new I2(3, this, sliderAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g61 this$0, pz1 sliderAd) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(sliderAd, "$sliderAd");
        du duVar = this$0.f27562f;
        if (duVar != null) {
            duVar.a(sliderAd);
        }
        this$0.f27557a.a();
    }

    public final void a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f27559c.a(new k7(adConfiguration));
    }

    public final void a(ot otVar) {
        this.f27560d = otVar;
        this.f27559c.a(otVar, this.f27561e, this.f27562f);
    }

    public final void a(ut utVar) {
        this.f27561e = utVar;
        this.f27559c.a(this.f27560d, utVar, this.f27562f);
    }

    public final void a(u61 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f27559c.a(reportParameterManager);
    }

    public final void a(du duVar) {
        this.f27562f = duVar;
        this.f27559c.a(this.f27560d, this.f27561e, duVar);
    }
}
