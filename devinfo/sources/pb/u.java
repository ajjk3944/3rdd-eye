package pb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f31674a;

    public u(IBinder iBinder) {
        this.f31674a = iBinder;
    }

    public final void O(c0 c0Var, g gVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(c0Var);
            parcelObtain.writeInt(1);
            j4.g.a(gVar, parcelObtain, 0);
            this.f31674a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31674a;
    }
}
