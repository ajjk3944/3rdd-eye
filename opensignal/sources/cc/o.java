package cc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* loaded from: classes.dex */
public final class o implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f3668d;

    public o(IBinder iBinder) {
        this.f3668d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3668d;
    }

    public final void d(w wVar, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(wVar);
            parcelObtain.writeInt(1);
            a0.a(getServiceRequest, parcelObtain, 0);
            this.f3668d.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
