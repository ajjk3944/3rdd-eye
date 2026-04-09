package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes3.dex */
public final class Oi extends Ih {

    /* renamed from: e, reason: collision with root package name */
    public final Nf f39943e;

    public Oi(C4780m0 c4780m0, Wk wk, Nf nf) {
        super(c4780m0, wk);
        this.f39943e = nf;
    }

    @Override // io.appmetrica.analytics.impl.Ih
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        Nf nf = this.f39943e;
        synchronized (nf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", nf);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
