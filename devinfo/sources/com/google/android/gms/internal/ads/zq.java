package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zq extends ac.a implements ar {
    @Override // com.google.android.gms.internal.ads.ar
    public final cr j(String str) {
        cr brVar;
        Parcel parcelT = T();
        parcelT.writeString(str);
        Parcel parcelR0 = r0(parcelT, 1);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            brVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            brVar = iInterfaceQueryLocalInterface instanceof cr ? (cr) iInterfaceQueryLocalInterface : new br(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 1);
        }
        parcelR0.recycle();
        return brVar;
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final is k(String str) {
        is hsVar;
        Parcel parcelT = T();
        parcelT.writeString(str);
        Parcel parcelR0 = r0(parcelT, 3);
        IBinder strongBinder = parcelR0.readStrongBinder();
        int i4 = ms.f13999f;
        if (strongBinder == null) {
            hsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            hsVar = iInterfaceQueryLocalInterface instanceof is ? (is) iInterfaceQueryLocalInterface : new hs(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 1);
        }
        parcelR0.recycle();
        return hsVar;
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final boolean q(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        Parcel parcelR0 = r0(parcelT, 4);
        ClassLoader classLoader = ng.f14287a;
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.ar
    public final boolean x(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        Parcel parcelR0 = r0(parcelT, 2);
        ClassLoader classLoader = ng.f14287a;
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }
}
