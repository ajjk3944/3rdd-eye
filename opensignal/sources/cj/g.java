package cj;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: d, reason: collision with root package name */
    public IBinder f3985d;

    @Override // cj.h
    public final void J(l lVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.opensignal.sdk.data.task.JobResultTestIBinder");
            parcelObtain.writeStrongInterface(lVar);
            this.f3985d.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // cj.h
    public final void P(l lVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.opensignal.sdk.data.task.JobResultTestIBinder");
            parcelObtain.writeStrongInterface(lVar);
            this.f3985d.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3985d;
    }
}
