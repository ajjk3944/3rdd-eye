package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class l0 extends x implements m0 {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 0);
    }

    @Override // com.google.android.gms.internal.measurement.m0
    public final void C(Bundle bundle) {
        Parcel parcelR = R();
        z.b(parcelR, bundle);
        S(parcelR, 1);
    }
}
