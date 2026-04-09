package C0;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f1042a;

    @Override // C0.f
    public final void U0(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(f.f1043o);
            parcelObtain.writeStringArray(strArr);
            this.f1042a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1042a;
    }
}
