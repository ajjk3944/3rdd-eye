package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f39054a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f39055b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f39056c = new Object();

    public e(Intent intent, String str) {
        this.f39054a = intent;
    }

    public final void a(Context context) {
        synchronized (this.f39056c) {
            this.f39055b = null;
            this.f39056c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f39056c) {
            this.f39055b = null;
            this.f39056c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f39056c) {
            this.f39056c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f39056c) {
            this.f39055b = iBinder;
            this.f39056c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f39056c) {
            this.f39055b = null;
            this.f39056c.notifyAll();
        }
    }
}
