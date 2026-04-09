package lc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f15133d;

    public b(IBinder iBinder) {
        this.f15133d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15133d;
    }

    public final Parcel d(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f15133d.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e4) {
                parcelObtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }
}
