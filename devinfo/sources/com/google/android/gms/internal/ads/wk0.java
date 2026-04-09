package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wk0 implements va.a, t80 {

    /* renamed from: a, reason: collision with root package name */
    public va.v f18045a;

    @Override // com.google.android.gms.internal.ads.t80
    public final synchronized void D() {
    }

    @Override // va.a
    public final synchronized void onAdClicked() {
        va.v vVar = this.f18045a;
        if (vVar != null) {
            try {
                vVar.m();
            } catch (RemoteException e2) {
                za.i.i("Remote Exception at onAdClicked.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final synchronized void x() {
        va.v vVar = this.f18045a;
        if (vVar != null) {
            try {
                vVar.m();
            } catch (RemoteException e2) {
                za.i.i("Remote Exception at onPhysicalClick.", e2);
            }
        }
    }
}
