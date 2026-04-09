package com.google.ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
final class O implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N f38205a;

    O(N n10) {
        this.f38205a = n10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f38205a.d(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f38205a.e();
    }
}
