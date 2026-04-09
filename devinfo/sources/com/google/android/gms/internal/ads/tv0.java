package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tv0 extends ua.b {

    /* renamed from: y, reason: collision with root package name */
    public final int f16975y;

    public tv0(Context context, Looper looper, pb.b bVar, pb.c cVar, int i4) {
        super(context, looper, 116, bVar, cVar);
        this.f16975y = i4;
    }

    @Override // pb.e
    public final int j() {
        return this.f16975y;
    }

    @Override // pb.e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof wv0 ? (wv0) iInterfaceQueryLocalInterface : new wv0(iBinder, "com.google.android.gms.gass.internal.IGassService", 1);
    }

    @Override // pb.e
    public final String u() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // pb.e
    public final String v() {
        return "com.google.android.gms.gass.START";
    }
}
