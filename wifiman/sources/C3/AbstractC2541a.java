package C3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: C3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2541a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f2210a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2211b;

    protected AbstractC2541a(IBinder iBinder, String str) {
        this.f2210a = iBinder;
        this.f2211b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2210a;
    }

    protected final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2211b);
        return parcelObtain;
    }

    protected final Parcel c(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2210a.transact(i10, parcel, parcelObtain, 0);
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

    protected final void f(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f2210a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
