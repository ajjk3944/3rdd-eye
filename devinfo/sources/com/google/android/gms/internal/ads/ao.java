package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ao extends mg implements pn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pq0 f9374a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(pq0 pq0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f9374a = pq0Var;
    }

    @Override // com.google.android.gms.internal.ads.pn
    public final void W3(jn jnVar) {
        fk0 fk0Var;
        String strZ1;
        pq0 pq0Var = this.f9374a;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) pq0Var.f15073b;
        synchronized (pq0Var) {
            fk0Var = (fk0) pq0Var.f15075d;
            if (fk0Var == null) {
                fk0Var = new fk0(jnVar);
                pq0Var.f15075d = fk0Var;
            }
        }
        pq0 pq0Var2 = (pq0) ((bb.v) eVar.f9005c);
        pq0Var2.getClass();
        pb.y.d("#008 Must be called on the main UI thread.");
        try {
            strZ1 = ((jn) fk0Var.f11194b).z1();
        } catch (RemoteException e2) {
            za.i.f("", e2);
            strZ1 = null;
        }
        za.i.c("Adapter called onAdLoaded with template id ".concat(String.valueOf(strZ1)));
        pq0Var2.f15075d = fk0Var;
        try {
            ((fr) pq0Var2.f15073b).A1();
        } catch (RemoteException e10) {
            za.i.k("#007 Could not call remote method.", e10);
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
        ng.f(parcel);
        W3(inVar);
        parcel2.writeNoException();
        return true;
    }
}
