package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o0 extends ac.a implements q0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final void N0(long j, Bundle bundle, String str, String str2) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        y.b(parcelT, bundle);
        parcelT.writeLong(j);
        e0(parcelT, 1);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final int d() {
        Parcel parcelS = S(T(), 2);
        int i4 = parcelS.readInt();
        parcelS.recycle();
        return i4;
    }
}
