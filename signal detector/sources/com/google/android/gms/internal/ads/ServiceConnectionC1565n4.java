package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.n4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1565n4 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final C1283hr f15743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1184g f15744b;

    public /* synthetic */ ServiceConnectionC1565n4(C1184g c1184g, C1283hr c1283hr) {
        Objects.requireNonNull(c1184g);
        this.f15744b = c1184g;
        this.f15743a = c1283hr;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        F7 d7;
        AbstractC0709Rg.h("Install Referrer service connected.");
        int i = E7.f7917a;
        if (iBinder == null) {
            d7 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            d7 = iInterfaceQueryLocalInterface instanceof F7 ? (F7) iInterfaceQueryLocalInterface : new D7(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
        }
        C1184g c1184g = this.f15744b;
        c1184g.f14182d = d7;
        c1184g.f14179a = 2;
        this.f15743a.c(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0709Rg.j("Install Referrer service disconnected.");
        C1184g c1184g = this.f15744b;
        c1184g.f14182d = null;
        c1184g.f14179a = 0;
    }
}
