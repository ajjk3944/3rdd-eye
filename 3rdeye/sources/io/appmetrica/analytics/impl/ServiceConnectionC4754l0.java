package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC4754l0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4780m0 f41161a;

    public ServiceConnectionC4754l0(C4780m0 c4780m0) {
        this.f41161a = c4780m0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f41161a) {
            this.f41161a.f41226d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f41161a.f41227e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f41161a) {
            this.f41161a.f41226d = null;
        }
    }
}
