package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes.dex */
public final class c extends Binder implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2360e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f2361d;

    public c(ResultReceiver resultReceiver) {
        this.f2361d = resultReceiver;
        attachInterface(this, b.f2359a);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = b.f2359a;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        this.f2361d.d(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
