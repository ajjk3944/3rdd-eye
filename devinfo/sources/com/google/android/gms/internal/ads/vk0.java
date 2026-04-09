package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vk0 implements e70 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f17640a = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.e70
    public final void a(va.d3 d3Var) {
        Object obj = this.f17640a.get();
        if (obj == null) {
            return;
        }
        try {
            ((va.r1) obj).x1(d3Var);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }
}
