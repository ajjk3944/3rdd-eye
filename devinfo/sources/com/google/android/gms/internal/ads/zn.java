package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zn extends mg implements nn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pq0 f19125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(pq0 pq0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.f19125a = pq0Var;
    }

    @Override // com.google.android.gms.internal.ads.nn
    public final void T1(jn jnVar, String str) {
        fk0 fk0Var;
        pq0 pq0Var = this.f19125a;
        if (((com.google.ads.mediation.e) pq0Var.f15074c) == null) {
            return;
        }
        synchronized (pq0Var) {
            fk0Var = (fk0) pq0Var.f15075d;
            if (fk0Var == null) {
                fk0Var = new fk0(jnVar);
                pq0Var.f15075d = fk0Var;
            }
        }
        pq0 pq0Var2 = (pq0) ((bb.v) ((com.google.ads.mediation.e) pq0Var.f15074c).f9005c);
        pq0Var2.getClass();
        try {
            ((fr) pq0Var2.f15073b).q1((jn) fk0Var.f11194b, str);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        jn inVar;
        if (i4 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            inVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            inVar = iInterfaceQueryLocalInterface instanceof jn ? (jn) iInterfaceQueryLocalInterface : new in(strongBinder);
        }
        String string = parcel.readString();
        ng.f(parcel);
        T1(inVar, string);
        parcel2.writeNoException();
        return true;
    }
}
