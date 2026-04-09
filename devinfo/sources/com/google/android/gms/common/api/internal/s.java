package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f9122a;

    public s(int i4) {
        this.f9122a = i4;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(n nVar);

    public abstract nb.d[] b(n nVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(n nVar);

    public abstract void f(yb.i iVar, boolean z3);
}
