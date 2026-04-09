package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes3.dex */
public final class Oh extends C4940s5 {

    /* renamed from: v, reason: collision with root package name */
    public final String f39941v;

    /* renamed from: w, reason: collision with root package name */
    public final W6 f39942w;

    public Oh(Context context, C4759l5 c4759l5, J4 j4, W6 w62, C4544cm c4544cm, AbstractC4889q5 abstractC4889q5, K9 k92) {
        this(context, c4759l5, new C4677i0(), new TimePassedChecker(), new C5066x5(context, c4759l5, j4, abstractC4889q5, c4544cm, new Jh(w62), Ga.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ga.j().k(), k92), w62, j4);
    }

    @Override // io.appmetrica.analytics.impl.C4940s5, io.appmetrica.analytics.impl.InterfaceC4688ib, io.appmetrica.analytics.impl.Xa
    public final synchronized void a(J4 j4) {
        super.a(j4);
        this.f39942w.a(this.f39941v, j4.i);
    }

    public Oh(Context context, C4759l5 c4759l5, C4677i0 c4677i0, TimePassedChecker timePassedChecker, C5066x5 c5066x5, W6 w62, J4 j4) {
        super(context, c4759l5, c4677i0, timePassedChecker, c5066x5, j4);
        this.f39941v = c4759l5.b();
        this.f39942w = w62;
    }
}
