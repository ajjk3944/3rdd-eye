package io.appmetrica.analytics.impl;

import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4487ah extends Ih {

    /* renamed from: e, reason: collision with root package name */
    public final Gh f40524e;

    public C4487ah(C4780m0 c4780m0, Wk wk, Gh gh) {
        super(c4780m0, wk);
        this.f40524e = gh;
    }

    @Override // io.appmetrica.analytics.impl.Ih
    public final void a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.Ih
    public final void a(IAppMetricaService iAppMetricaService) throws RemoteException {
        Gh gh = this.f40524e;
        iAppMetricaService.reportData(gh.f39535c, gh.f39533a.d(gh.f39537e.c()));
    }
}
