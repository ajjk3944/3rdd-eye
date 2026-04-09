package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class mg extends Binder implements IInterface {
    public mg(String str) {
        attachInterface(this, str);
    }

    public abstract boolean g4(int i4, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i4 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i4, parcel, parcel2, i10)) {
            return true;
        }
        return g4(i4, parcel, parcel2);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
