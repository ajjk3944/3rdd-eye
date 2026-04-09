package u4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class f implements h, IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f46569b;

    public f(IBinder iBinder) {
        this.f46569b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46569b;
    }

    @Override // u4.h
    public final void k(String str, Bundle bundle, t4.h hVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i = e.f46568a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        try {
            this.f46569b.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
