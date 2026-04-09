package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4542ck extends C4940s5 {
    public C4542ck(Context context, C4544cm c4544cm, C4759l5 c4759l5, J4 j4, InterfaceC4952sh interfaceC4952sh, AbstractC4889q5 abstractC4889q5, C4733k5 c4733k5) {
        this(context, c4759l5, new C4677i0(), new TimePassedChecker(), new C5066x5(context, c4759l5, j4, abstractC4889q5, c4544cm, interfaceC4952sh, Ga.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ga.j().k(), c4733k5), j4);
    }

    @Override // io.appmetrica.analytics.impl.C4940s5, io.appmetrica.analytics.impl.Xa
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C4542ck(Context context, C4759l5 c4759l5, C4677i0 c4677i0, TimePassedChecker timePassedChecker, C5066x5 c5066x5, J4 j4) {
        super(context, c4759l5, c4677i0, timePassedChecker, c5066x5, j4);
    }
}
