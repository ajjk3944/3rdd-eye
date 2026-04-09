package z3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8709a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f67053a;

    /* renamed from: b, reason: collision with root package name */
    private final String f67054b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected AbstractC8709a(IBinder iBinder, String str) {
        this.f67053a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f67053a;
    }

    protected final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f67054b);
        return parcelObtain;
    }

    protected final Parcel c(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f67053a.transact(i10, parcel, parcelObtain, 0);
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
