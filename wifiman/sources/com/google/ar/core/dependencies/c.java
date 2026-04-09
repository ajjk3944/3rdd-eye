package com.google.ar.core.dependencies;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class c implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f38236a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38237b;

    protected c(IBinder iBinder, String str) {
        this.f38236a = iBinder;
        this.f38237b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f38237b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38236a;
    }

    protected final Parcel b(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f38236a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void c(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f38236a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
