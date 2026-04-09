package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import q2.InterfaceC2842s0;

/* renamed from: com.google.android.gms.internal.ads.xr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2144xr implements InterfaceC0577Jk {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f17636a = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.InterfaceC0577Jk
    public final void a(q2.e1 e1Var) {
        Object obj = this.f17636a.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC2842s0) obj).u1(e1Var);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }
}
