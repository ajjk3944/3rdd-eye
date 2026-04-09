package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4900l6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC4868h6 f36585a;

    RunnableC4900l6(ServiceConnectionC4868h6 serviceConnectionC4868h6) {
        this.f36585a = serviceConnectionC4868h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5.K(this.f36585a.f36523c, new ComponentName(this.f36585a.f36523c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
