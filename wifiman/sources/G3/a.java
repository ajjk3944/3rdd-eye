package G3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f6857a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6858b = "com.google.android.gms.oss.licenses.IOSSLicenseService";

    protected a(IBinder iBinder, String str) {
        this.f6857a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6857a;
    }

    protected final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f6858b);
        return parcelObtain;
    }

    protected final Parcel c(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f6857a.transact(i10, parcel, parcelObtain, 0);
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
}
