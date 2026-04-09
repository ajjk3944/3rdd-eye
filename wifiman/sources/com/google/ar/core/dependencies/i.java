package com.google.ar.core.dependencies;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class i extends d implements j {
    public i() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    @Override // com.google.ar.core.dependencies.d
    protected final boolean a(int i10, Parcel parcel) throws RemoteException {
        if (i10 == 1) {
            Bundle bundle = (Bundle) e.a(parcel, Bundle.CREATOR);
            e.d(parcel);
            b(bundle);
        } else if (i10 == 2) {
            Bundle bundle2 = (Bundle) e.a(parcel, Bundle.CREATOR);
            e.d(parcel);
            c(bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            e.d(parcel);
        }
        return true;
    }
}
