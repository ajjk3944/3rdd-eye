package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class gn0 {

    /* renamed from: a, reason: collision with root package name */
    private final wi0 f27839a;

    /* renamed from: b, reason: collision with root package name */
    private final C4198s4 f27840b;

    /* renamed from: c, reason: collision with root package name */
    private final ug f27841c;

    /* renamed from: d, reason: collision with root package name */
    private final oj0 f27842d;

    /* renamed from: e, reason: collision with root package name */
    private final ou f27843e;

    /* renamed from: f, reason: collision with root package name */
    private final qj0 f27844f;

    public interface a {
        void h(mb2<tn0> mb2Var);
    }

    public gn0(wi0 imageLoadManager, C4198s4 adLoadingPhasesManager) {
        kotlin.jvm.internal.l.f(imageLoadManager, "imageLoadManager");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f27839a = imageLoadManager;
        this.f27840b = adLoadingPhasesManager;
        this.f27841c = new ug();
        this.f27842d = new oj0();
        this.f27843e = new ou();
        this.f27844f = new qj0();
    }

    public final void a(mb2 videoAdInfo, ej0 imageProvider, rn0 loadListener) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(loadListener, "loadListener");
        ou ouVar = this.f27843e;
        nu nuVarB = videoAdInfo.b();
        ouVar.getClass();
        List<? extends ag<?>> listA = ou.a(nuVarB);
        Set<jj0> setA = this.f27844f.a(listA, null);
        C4198s4 c4198s4 = this.f27840b;
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32466p;
        uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        this.f27839a.a(setA, new hn0(this, listA, imageProvider, loadListener, videoAdInfo));
    }
}
