package com.google.ar.core;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC5039b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f38229a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f38230b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N f38231c;

    RunnableC5039b(N n10, Context context, x xVar) {
        this.f38229a = context;
        this.f38230b = xVar;
        this.f38231c = n10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f38231c.f().e(this.f38229a.getApplicationInfo().packageName, N.k(), new P(this.f38230b));
        } catch (RemoteException e10) {
            Log.e("ARCore-InstallService", "requestInfo threw", e10);
            this.f38230b.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
