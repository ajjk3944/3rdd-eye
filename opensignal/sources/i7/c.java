package i7;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public IBinder f11248d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11248d;
    }

    @Override // i7.d
    public final void j(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.f11249b);
            parcelObtain.writeStringArray(strArr);
            this.f11248d.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
