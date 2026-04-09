package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4317c1 extends Y implements InterfaceC4299a1 {
    C4317c1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4299a1
    public final void P(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC4298a0.d(parcelB, bundle);
        parcelB.writeLong(j10);
        f(1, parcelB);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4299a1
    public final int zza() {
        Parcel parcelC = c(2, b());
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }
}
