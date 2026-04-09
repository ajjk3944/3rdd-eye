package A3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f274a;

    /* renamed from: b, reason: collision with root package name */
    private final String f275b;

    protected a(IBinder iBinder, String str) {
        this.f274a = iBinder;
        this.f275b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f274a;
    }

    protected final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f275b);
        return parcelObtain;
    }

    protected final void c(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f274a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void f(int i10, Parcel parcel) {
        try {
            this.f274a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
