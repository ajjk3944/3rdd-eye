package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ji0 {

    /* renamed from: a, reason: collision with root package name */
    private final j50 f29151a;

    /* renamed from: b, reason: collision with root package name */
    private final C4245z3 f29152b;

    public ji0(j50 environmentConfiguration, C4245z3 adHostConfigurator) {
        kotlin.jvm.internal.l.f(environmentConfiguration, "environmentConfiguration");
        kotlin.jvm.internal.l.f(adHostConfigurator, "adHostConfigurator");
        this.f29151a = environmentConfiguration;
        this.f29152b = adHostConfigurator;
    }

    public final void a(Context context, ii0 identifiers) {
        String strA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(identifiers, "identifiers");
        ue identifiers2 = identifiers.a();
        String strC = identifiers.c();
        ni0 identifiersType = identifiers.b();
        C4245z3 c4245z3 = this.f29152b;
        c4245z3.getClass();
        kotlin.jvm.internal.l.f(identifiers2, "identifiers");
        kotlin.jvm.internal.l.f(identifiersType, "identifiersType");
        int iOrdinal = identifiersType.ordinal();
        if (iOrdinal == 0) {
            strA = c4245z3.a(context);
        } else {
            if (iOrdinal != 1) {
                throw new b9.j();
            }
            strA = identifiers2.a();
            if (strA == null) {
                strA = c4245z3.a(context);
            }
        }
        this.f29151a.a(strA);
        this.f29151a.b(identifiers2.b());
        this.f29151a.d(identifiers2.c());
        this.f29151a.c(strC);
    }
}
