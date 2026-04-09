package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class p0 extends x implements r0 {
    public p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final int b() {
        Parcel parcelF = f(R(), 2);
        int i10 = parcelF.readInt();
        parcelF.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void l(long j, Bundle bundle, String str, String str2) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        z.b(parcelR, bundle);
        parcelR.writeLong(j);
        S(parcelR, 1);
    }
}
