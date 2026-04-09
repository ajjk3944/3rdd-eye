package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class HA implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0447Bq f8872a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object[] objArr = {componentName};
        C0447Bq c0447Bq = this.f8872a;
        ((YD) c0447Bq.f7448d).c("LmdServiceConnectionManager.onServiceConnected(%s)", objArr);
        c0447Bq.b(new RunnableC0786Vp(this, 17, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object[] objArr = {componentName};
        C0447Bq c0447Bq = this.f8872a;
        ((YD) c0447Bq.f7448d).c("LmdServiceConnectionManager.onServiceDisconnected(%s)", objArr);
        c0447Bq.b(new Fu(11, this));
    }
}
