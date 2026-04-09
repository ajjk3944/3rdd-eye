package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaf extends zzar implements zzag {
    public zzaf() {
        super("com.android.vending.billing.IInAppBillingGetExternalPaymentDialogIntentCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final boolean zzb(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzas.zza(parcel, Bundle.CREATOR);
        zzas.zzb(parcel);
        zza(bundle);
        return true;
    }
}
