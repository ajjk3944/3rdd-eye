package X3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f4171a;

    public b(IBinder iBinder) {
        this.f4171a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4171a;
    }

    @Override // X3.d
    public final void n2(String str, Bundle bundle, W3.e eVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i = a.f4170a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(eVar);
        try {
            this.f4171a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
