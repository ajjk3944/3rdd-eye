package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface ILicensingService extends IInterface {

    public static abstract class a extends Binder implements ILicensingService {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f18722b = 0;

        /* renamed from: com.android.vending.licensing.ILicensingService$a$a, reason: collision with other inner class name */
        public static class C0301a implements ILicensingService {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f18723b;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f18723b;
            }

            @Override // com.android.vending.licensing.ILicensingService
            public final void m(long j4, String str, com.android.vending.licensing.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    parcelObtain.writeLong(j4);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(aVar.asBinder());
                    this.f18723b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    void m(long j4, String str, com.android.vending.licensing.a aVar) throws RemoteException;
}
