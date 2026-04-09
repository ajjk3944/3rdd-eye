package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC4298a0;

/* loaded from: classes.dex */
public final class A2 extends com.google.android.gms.internal.measurement.Y implements InterfaceC4999y2 {
    A2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4999y2
    public final void k(S6 s62) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, s62);
        n0(2, parcelB);
    }
}
