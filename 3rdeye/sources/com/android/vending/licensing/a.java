package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ILicenseResultListener.java */
/* loaded from: classes.dex */
public interface a extends IInterface {
    void verifyLicense(int i, String str, String str2) throws RemoteException;

    /* compiled from: ILicenseResultListener.java */
    /* renamed from: com.android.vending.licensing.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0302a extends Binder implements a {
        private static final String DESCRIPTOR = "com.android.vending.licensing.ILicenseResultListener";
        static final int TRANSACTION_verifyLicense = 1;

        /* compiled from: ILicenseResultListener.java */
        /* renamed from: com.android.vending.licensing.a$a$a, reason: collision with other inner class name */
        public static class C0303a implements a {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f18724b;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f18724b;
            }
        }

        public AbstractBinderC0302a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            C0303a c0303a = new C0303a();
            c0303a.f18724b = iBinder;
            return c0303a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                verifyLicense(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i10);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
