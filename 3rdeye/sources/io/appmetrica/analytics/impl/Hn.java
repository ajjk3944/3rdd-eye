package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes3.dex */
public final class Hn extends Ih {

    /* renamed from: e, reason: collision with root package name */
    public final int f39588e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f39589f;

    public Hn(C4780m0 c4780m0, Wk wk, int i, Bundle bundle) {
        super(c4780m0, wk);
        this.f39588e = i;
        this.f39589f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Ih
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        iAppMetricaService.reportData(this.f39588e, this.f39589f);
    }
}
