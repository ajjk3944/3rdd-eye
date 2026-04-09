package com.google.ar.core;

import android.app.Activity;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC5043f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f38242a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f38243b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ RunnableC5044g f38244c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L f38245d;

    RunnableC5043f(RunnableC5044g runnableC5044g, AtomicBoolean atomicBoolean, Activity activity, L l10) {
        this.f38242a = atomicBoolean;
        this.f38243b = activity;
        this.f38245d = l10;
        this.f38244c = runnableC5044g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f38242a.getAndSet(true)) {
            return;
        }
        Log.w("ARCore-InstallService", "requestInstall timed out, launching fullscreen.");
        RunnableC5044g runnableC5044g = this.f38244c;
        runnableC5044g.f38248c.i(this.f38243b, this.f38245d);
    }
}
