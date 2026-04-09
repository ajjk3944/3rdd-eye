package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4334e0 extends Y implements InterfaceC4325d0 {
    C4334e0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4325d0
    public final Bundle a(Bundle bundle) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, bundle);
        Parcel parcelC = c(1, parcelB);
        Bundle bundle2 = (Bundle) AbstractC4298a0.a(parcelC, Bundle.CREATOR);
        parcelC.recycle();
        return bundle2;
    }
}
