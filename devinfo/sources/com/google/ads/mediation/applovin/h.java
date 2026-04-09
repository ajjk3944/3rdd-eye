package com.google.ads.mediation.applovin;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.kp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb.b f8981a;

    public h(bb.b bVar) {
        this.f8981a = bVar;
    }

    @Override // com.google.ads.mediation.applovin.e
    public final void onInitializeSuccess() {
        fk0 fk0Var = (fk0) this.f8981a;
        fk0Var.getClass();
        try {
            ((kp) fk0Var.f11194b).c();
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }
}
