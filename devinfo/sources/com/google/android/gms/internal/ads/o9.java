package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o9 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final ne0 f14612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p9 f14613b;

    public /* synthetic */ o9(p9 p9Var, ne0 ne0Var) {
        Objects.requireNonNull(p9Var);
        this.f14613b = p9Var;
        this.f14612a = ne0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qg ogVar;
        jz.i("Install Referrer service connected.");
        int i4 = pg.f15001a;
        if (iBinder == null) {
            ogVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            ogVar = iInterfaceQueryLocalInterface instanceof qg ? (qg) iInterfaceQueryLocalInterface : new og(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 1);
        }
        p9 p9Var = this.f14613b;
        p9Var.K = ogVar;
        p9Var.H = 2;
        this.f14612a.p(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        jz.l("Install Referrer service disconnected.");
        p9 p9Var = this.f14613b;
        p9Var.K = null;
        p9Var.H = 0;
    }
}
