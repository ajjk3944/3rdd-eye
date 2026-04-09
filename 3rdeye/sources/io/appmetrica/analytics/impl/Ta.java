package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* loaded from: classes3.dex */
public interface Ta extends SimpleAdvertisingIdGetter, InterfaceC4673hm {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Qi qi);

    /* synthetic */ void a(C4544cm c4544cm);

    void b(boolean z10);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
