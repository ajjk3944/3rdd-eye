package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes3.dex */
public final class De extends Ih {

    /* renamed from: e, reason: collision with root package name */
    public final Nf f39302e;

    public De(C4780m0 c4780m0, Wk wk, Nf nf) {
        super(c4780m0, wk);
        this.f39302e = nf;
    }

    @Override // io.appmetrica.analytics.impl.Ih
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        Nf nf = this.f39302e;
        synchronized (nf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", nf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
