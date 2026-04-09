package com.monetization.ads.core.identifiers.ad.huawei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public interface OpenDeviceIdentifierService extends IInterface {
    String getOaid() throws RemoteException;

    boolean getOaidTrackLimited() throws RemoteException;

    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f23648a = 0;

        public static final class Proxy implements OpenDeviceIdentifierService {

            /* renamed from: a, reason: collision with root package name */
            private final IBinder f23649a;

            public Proxy(IBinder remote) {
                l.f(remote, "remote");
                this.f23649a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23649a;
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public String getOaid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                l.e(parcelObtain, "obtain(...)");
                Parcel parcelObtain2 = Parcel.obtain();
                l.e(parcelObtain2, "obtain(...)");
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f23649a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public boolean getOaidTrackLimited() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                l.e(parcelObtain, "obtain(...)");
                Parcel parcelObtain2 = Parcel.obtain();
                l.e(parcelObtain2, "obtain(...)");
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f23649a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel data, Parcel parcel, int i10) throws RemoteException {
            l.f(data, "data");
            if (i == 1) {
                data.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                String oaid = getOaid();
                if (parcel != null) {
                    parcel.writeNoException();
                }
                if (parcel != null) {
                    parcel.writeString(oaid);
                }
            } else if (i == 2) {
                data.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean oaidTrackLimited = getOaidTrackLimited();
                if (parcel != null) {
                    parcel.writeNoException();
                }
                if (parcel != null) {
                    parcel.writeInt(oaidTrackLimited ? 1 : 0);
                }
            } else {
                if (i != 1598968902) {
                    return super.onTransact(i, data, parcel, i10);
                }
                if (parcel != null) {
                    parcel.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                }
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
