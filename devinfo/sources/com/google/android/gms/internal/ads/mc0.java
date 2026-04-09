package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mc0 {

    /* renamed from: a, reason: collision with root package name */
    public final ga0 f13863a;

    public mc0(ga0 ga0Var) {
        this.f13863a = ga0Var;
    }

    public final void a() {
        va.a2 a2VarX = this.f13863a.X();
        va.b2 b2VarH1 = null;
        if (a2VarX != null) {
            try {
                b2VarH1 = a2VarX.H1();
            } catch (RemoteException unused) {
            }
        }
        if (b2VarH1 == null) {
            return;
        }
        try {
            b2VarH1.c();
        } catch (RemoteException e2) {
            za.i.i("Unable to call onVideoEnd()", e2);
        }
    }
}
