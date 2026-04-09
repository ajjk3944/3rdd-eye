package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4232x3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35165a;

    /* renamed from: b, reason: collision with root package name */
    private final zs f35166b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4127i2 f35167c;

    /* renamed from: d, reason: collision with root package name */
    private final ej0 f35168d;

    /* renamed from: e, reason: collision with root package name */
    private final wl0 f35169e;

    /* renamed from: f, reason: collision with root package name */
    private final pm0 f35170f;

    /* renamed from: g, reason: collision with root package name */
    private final cc2<tn0> f35171g;

    /* renamed from: h, reason: collision with root package name */
    private final C4134j2 f35172h;
    private final bg2 i;

    public /* synthetic */ C4232x3(Context context, zs zsVar, EnumC4127i2 enumC4127i2, ej0 ej0Var, wl0 wl0Var, pm0 pm0Var, cc2 cc2Var) {
        this(context, zsVar, enumC4127i2, ej0Var, wl0Var, pm0Var, cc2Var, new C4134j2(), new bg2(zsVar.d().d()));
    }

    public final C4225w3 a(mb2<tn0> videoAdInfo) {
        nc2 nc2Var;
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        C4134j2 c4134j2 = this.f35172h;
        EnumC4127i2 adBreakPosition = this.f35167c;
        c4134j2.getClass();
        kotlin.jvm.internal.l.f(adBreakPosition, "adBreakPosition");
        int iOrdinal = adBreakPosition.ordinal();
        if (iOrdinal == 0) {
            nc2Var = nc2.f30840b;
        } else if (iOrdinal == 1) {
            nc2Var = nc2.f30841c;
        } else if (iOrdinal == 2) {
            nc2Var = nc2.f30842d;
        } else {
            if (iOrdinal != 3) {
                throw new b9.j();
            }
            nc2Var = nc2.f30843e;
        }
        ag2 ag2VarA = this.i.a(this.f35165a, videoAdInfo, nc2Var);
        dd2 dd2Var = new dd2();
        Context context = this.f35165a;
        vu1 vu1VarD = this.f35166b.d();
        wl0 wl0Var = this.f35169e;
        pm0 pm0Var = this.f35170f;
        zs zsVar = this.f35166b;
        ej0 ej0Var = this.f35168d;
        cc2<tn0> cc2Var = this.f35171g;
        C4072a3 c4072a3 = new C4072a3(ns.f30992h, vu1VarD);
        tn0 tn0VarD = videoAdInfo.d();
        pn0 pn0Var = new pn0(tn0VarD, wl0Var);
        io0 io0Var = new io0(pm0Var);
        ho0 ho0Var = new ho0(zsVar, videoAdInfo, dd2Var, io0Var, new gg2(io0Var), new jo0(dd2Var, zsVar, videoAdInfo));
        qc2 qc2Var = new qc2();
        rn0 rn0Var = new rn0(cc2Var);
        i92 i92Var = new i92(context, c4072a3, pn0Var, io0Var, videoAdInfo, ho0Var, dd2Var, ag2VarA, qc2Var, rn0Var, null);
        wi0 wi0Var = new wi0(context);
        C4198s4 c4198s4 = new C4198s4();
        return new C4225w3(videoAdInfo, new qn0(context, vu1VarD, wl0Var, pm0Var, zsVar, videoAdInfo, dd2Var, ag2VarA, ej0Var, cc2Var, c4072a3, tn0VarD, pn0Var, io0Var, ho0Var, qc2Var, rn0Var, i92Var, wi0Var, c4198s4, new gn0(wi0Var, c4198s4), new em0(tn0VarD, io0Var, pn0Var, pm0Var, dd2Var), new ql0(tn0VarD, new pb2(tn0VarD)), new kl0(zsVar)), this.f35168d, dd2Var, ag2VarA);
    }

    public C4232x3(Context context, zs adBreak, EnumC4127i2 adBreakPosition, ej0 imageProvider, wl0 adPlayerController, pm0 adViewsHolderManager, cc2<tn0> playbackEventsListener, C4134j2 adBreakPositionConverter, bg2 videoTrackerCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(adBreakPosition, "adBreakPosition");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(adPlayerController, "adPlayerController");
        kotlin.jvm.internal.l.f(adViewsHolderManager, "adViewsHolderManager");
        kotlin.jvm.internal.l.f(playbackEventsListener, "playbackEventsListener");
        kotlin.jvm.internal.l.f(adBreakPositionConverter, "adBreakPositionConverter");
        kotlin.jvm.internal.l.f(videoTrackerCreator, "videoTrackerCreator");
        this.f35165a = context;
        this.f35166b = adBreak;
        this.f35167c = adBreakPosition;
        this.f35168d = imageProvider;
        this.f35169e = adPlayerController;
        this.f35170f = adViewsHolderManager;
        this.f35171g = playbackEventsListener;
        this.f35172h = adBreakPositionConverter;
        this.i = videoTrackerCreator;
    }
}
