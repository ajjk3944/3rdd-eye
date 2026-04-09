package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f42241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f42242b;

    public j(k kVar, i iVar) {
        this.f42242b = kVar;
        this.f42241a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f42242b.f42245c;
        i iVar = this.f42241a;
        pVar.f42261a = iVar;
        CacheArguments cacheArguments = iVar.f42240b;
        pVar.f42262b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
