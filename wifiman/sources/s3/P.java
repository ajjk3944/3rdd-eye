package s3;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class P implements InterfaceC7897l {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f61195a;

    P(IBinder iBinder) {
        this.f61195a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f61195a;
    }

    @Override // s3.InterfaceC7897l
    public final void i0(InterfaceC7896k interfaceC7896k, C7891f c7891f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC7896k != null ? interfaceC7896k.asBinder() : null);
            if (c7891f != null) {
                parcelObtain.writeInt(1);
                g0.a(c7891f, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f61195a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
