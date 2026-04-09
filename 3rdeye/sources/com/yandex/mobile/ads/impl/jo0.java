package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nn0;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* loaded from: classes3.dex */
public final class jo0 {

    /* renamed from: a, reason: collision with root package name */
    private final dd2 f29245a;

    /* renamed from: b, reason: collision with root package name */
    private final zs f29246b;

    /* renamed from: c, reason: collision with root package name */
    private final mb2<tn0> f29247c;

    /* renamed from: d, reason: collision with root package name */
    private final nn0 f29248d;

    public /* synthetic */ jo0(dd2 dd2Var, zs zsVar, mb2 mb2Var) {
        this(dd2Var, zsVar, mb2Var, nn0.a.a());
    }

    public final boolean a() {
        cd2 cd2Var;
        mc2 mc2VarB = this.f29247c.d().b();
        if (!this.f29248d.d() || mc2VarB.a() <= 1) {
            String strE = this.f29246b.e();
            int iHashCode = strE.hashCode();
            cd2Var = (iHashCode == -1183812830 ? strE.equals(InstreamAdBreakType.INROLL) : iHashCode == 830323571 ? strE.equals(InstreamAdBreakType.PAUSEROLL) : iHashCode == 1055572677 && strE.equals(InstreamAdBreakType.MIDROLL)) ? mc2VarB.a() == 1 ? cd2.f25604e : cd2.f25602c : cd2.f25602c;
        } else {
            cd2Var = cd2.f25604e;
        }
        return this.f29245a.a(cd2Var);
    }

    public jo0(dd2 statusController, zs adBreak, mb2<tn0> videoAdInfo, nn0 instreamSettings) {
        kotlin.jvm.internal.l.f(statusController, "statusController");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(instreamSettings, "instreamSettings");
        this.f29245a = statusController;
        this.f29246b = adBreak;
        this.f29247c = videoAdInfo;
        this.f29248d = instreamSettings;
    }
}
