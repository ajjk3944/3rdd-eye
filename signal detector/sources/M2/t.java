package M2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class t implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f2816a;

    public t(IBinder iBinder) {
        this.f2816a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2816a;
    }

    public final void g0(y yVar, C0167g c0167g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(yVar);
            parcelObtain.writeInt(1);
            A3.q.a(c0167g, parcelObtain, 0);
            this.f2816a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
