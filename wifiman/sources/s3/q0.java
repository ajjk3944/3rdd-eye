package s3;

import android.os.IBinder;
import android.os.Parcel;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public final class q0 extends B3.a implements N {
    q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // s3.N
    public final int zzc() {
        Parcel parcelB = b(2, c());
        int i10 = parcelB.readInt();
        parcelB.recycle();
        return i10;
    }

    @Override // s3.N
    public final InterfaceC8420a zzd() {
        Parcel parcelB = b(1, c());
        InterfaceC8420a interfaceC8420aC = InterfaceC8420a.AbstractBinderC2309a.c(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC8420aC;
    }
}
