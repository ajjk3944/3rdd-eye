package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk0 implements i60 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uk0 f19100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sp f19101b;

    public /* synthetic */ zk0(uk0 uk0Var, sp spVar) {
        this.f19100a = uk0Var;
        this.f19101b = spVar;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void o(va.w1 w1Var) {
        this.f19100a.o(w1Var);
        sp spVar = this.f19101b;
        if (spVar != null) {
            try {
                Parcel parcelT = spVar.T();
                ng.c(parcelT, w1Var);
                spVar.g1(parcelT, 3);
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            }
        }
        if (spVar != null) {
            try {
                int i4 = w1Var.f36177a;
                Parcel parcelT2 = spVar.T();
                parcelT2.writeInt(i4);
                spVar.g1(parcelT2, 2);
            } catch (RemoteException e10) {
                za.i.k("#007 Could not call remote method.", e10);
            }
        }
    }
}
