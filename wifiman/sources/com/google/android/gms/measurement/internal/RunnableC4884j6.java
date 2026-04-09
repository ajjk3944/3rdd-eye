package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4884j6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ComponentName f36560a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC4868h6 f36561b;

    RunnableC4884j6(ServiceConnectionC4868h6 serviceConnectionC4868h6, ComponentName componentName) {
        this.f36560a = componentName;
        this.f36561b = serviceConnectionC4868h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5.K(this.f36561b.f36523c, this.f36560a);
    }
}
