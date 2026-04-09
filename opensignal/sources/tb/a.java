package tb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements c, IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f22693d;

    public a(IBinder iBinder) {
        this.f22693d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f22693d;
    }

    public final Bundle d(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i10 = i9.a.f11282a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain = Parcel.obtain();
        try {
            this.f22693d.transact(1, parcelObtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            return (Bundle) (parcelObtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain));
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            parcelObtain.recycle();
        }
    }
}
