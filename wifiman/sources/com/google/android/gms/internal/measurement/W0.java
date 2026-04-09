package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class W0 extends Y implements U0 {
    W0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void a(Bundle bundle) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, bundle);
        f(1, parcelB);
    }
}
