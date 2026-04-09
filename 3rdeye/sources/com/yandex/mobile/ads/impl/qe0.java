package com.yandex.mobile.ads.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class qe0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f32167a = new LinkedBlockingQueue();

    public final IBinder a() throws InterruptedException {
        return (IBinder) this.f32167a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder binder) throws InterruptedException {
        kotlin.jvm.internal.l.f(componentName, "componentName");
        kotlin.jvm.internal.l.f(binder, "binder");
        try {
            this.f32167a.put(binder);
        } catch (InterruptedException unused) {
            fp0.c(new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kotlin.jvm.internal.l.f(componentName, "componentName");
        try {
            this.f32167a.clear();
        } catch (UnsupportedOperationException unused) {
            fp0.c(new Object[0]);
        }
    }
}
