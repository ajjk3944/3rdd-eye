package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zk extends u.o {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f19095b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public Context f19096c;

    /* renamed from: d, reason: collision with root package name */
    public qd0 f19097d;

    /* renamed from: e, reason: collision with root package name */
    public u.p f19098e;

    /* renamed from: f, reason: collision with root package name */
    public u.n f19099f;

    @Override // u.o
    public final void onCustomTabsServiceConnected(ComponentName componentName, u.h hVar) {
        this.f19099f = (u.n) hVar;
        try {
            ((b.b) hVar.f34709a).g1();
        } catch (RemoteException unused) {
        }
        this.f19098e = hVar.c(new yk(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f19099f = null;
        this.f19098e = null;
    }
}
