package z3;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d extends AbstractC8709a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // z3.f
    public final boolean s(boolean z10) {
        Parcel parcelB = b();
        c.a(parcelB, true);
        Parcel parcelC = c(2, parcelB);
        boolean zB = c.b(parcelC);
        parcelC.recycle();
        return zB;
    }

    @Override // z3.f
    public final String zzc() {
        Parcel parcelC = c(1, b());
        String string = parcelC.readString();
        parcelC.recycle();
        return string;
    }
}
