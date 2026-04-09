package y4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class c implements e, IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f48107b;

    public c(IBinder iBinder) {
        this.f48107b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f48107b;
    }

    @Override // y4.e
    public final void d(String str, Bundle bundle, x4.h hVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i = b.f48106a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        try {
            this.f48107b.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
