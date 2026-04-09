package com.google.ar.core;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC5044g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f38246a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f38247b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N f38248c;

    RunnableC5044g(N n10, Activity activity, L l10) {
        this.f38246a = activity;
        this.f38247b = l10;
        this.f38248c = n10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f38248c.f().d(this.f38246a.getApplicationInfo().packageName, Collections.singletonList(N.k()), new Bundle(), new BinderC5042e(this, atomicBoolean, this.f38247b, this.f38246a));
            new Handler().postDelayed(new RunnableC5043f(this, atomicBoolean, this.f38246a, this.f38247b), 3000L);
        } catch (RemoteException e10) {
            Log.w("ARCore-InstallService", "requestInstall threw, launching fullscreen.", e10);
            this.f38248c.i(this.f38246a, this.f38247b);
        }
    }
}
