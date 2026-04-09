package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.play.integrity.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class ServiceConnectionC5029e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5030f f38127a;

    /* synthetic */ ServiceConnectionC5029e(C5030f c5030f, AbstractC5028d abstractC5028d) {
        this.f38127a = c5030f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f38127a.f38130b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f38127a.c().post(new C5026b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f38127a.f38130b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f38127a.c().post(new C5027c(this));
    }
}
