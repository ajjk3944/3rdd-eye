package C3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: C3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2544d extends Binder implements IInterface {
    protected AbstractBinderC2544d(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    protected abstract boolean b(int i10, Parcel parcel, Parcel parcel2, int i11);

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return b(i10, parcel, parcel2, i11);
    }
}
