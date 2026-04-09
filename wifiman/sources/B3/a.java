package B3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f1141a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1142b;

    protected a(IBinder iBinder, String str) {
        this.f1141a = iBinder;
        this.f1142b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1141a;
    }

    protected final Parcel b(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f1141a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f1142b);
        return parcelObtain;
    }
}
