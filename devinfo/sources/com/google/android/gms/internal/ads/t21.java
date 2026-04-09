package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t21 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xi0 f16676a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object[] objArr = {componentName};
        xi0 xi0Var = this.f16676a;
        ((ka1) xi0Var.f18395d).a("LmdServiceConnectionManager.onServiceConnected(%s)", objArr);
        xi0Var.i(new uh0(16, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object[] objArr = {componentName};
        xi0 xi0Var = this.f16676a;
        ((ka1) xi0Var.f18395d).a("LmdServiceConnectionManager.onServiceDisconnected(%s)", objArr);
        xi0Var.i(new du0(10, this));
    }
}
