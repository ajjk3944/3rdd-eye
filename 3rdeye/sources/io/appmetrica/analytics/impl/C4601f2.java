package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* renamed from: io.appmetrica.analytics.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4601f2 implements AppSetIdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4627g2 f40834a;

    public C4601f2(C4627g2 c4627g2) {
        this.f40834a = c4627g2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope) {
        this.f40834a.f40915c = new AppSetId(str, appSetIdScope);
        this.f40834a.f40916d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onFailure(Throwable th) {
        this.f40834a.f40916d.countDown();
    }
}
