package s3;

import android.os.IBinder;
import android.os.Parcel;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public final class Q extends B3.a implements T {
    Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // s3.T
    public final boolean C(r3.D d10, InterfaceC8420a interfaceC8420a) {
        Parcel parcelC = c();
        B3.d.c(parcelC, d10);
        B3.d.d(parcelC, interfaceC8420a);
        Parcel parcelB = b(5, parcelC);
        boolean zE = B3.d.e(parcelB);
        parcelB.recycle();
        return zE;
    }

    @Override // s3.T
    public final r3.B j(r3.z zVar) {
        Parcel parcelC = c();
        B3.d.c(parcelC, zVar);
        Parcel parcelB = b(8, parcelC);
        r3.B b10 = (r3.B) B3.d.a(parcelB, r3.B.CREATOR);
        parcelB.recycle();
        return b10;
    }

    @Override // s3.T
    public final r3.B w(r3.z zVar) {
        Parcel parcelC = c();
        B3.d.c(parcelC, zVar);
        Parcel parcelB = b(6, parcelC);
        r3.B b10 = (r3.B) B3.d.a(parcelB, r3.B.CREATOR);
        parcelB.recycle();
        return b10;
    }

    @Override // s3.T
    public final boolean zzi() {
        Parcel parcelB = b(7, c());
        boolean zE = B3.d.e(parcelB);
        parcelB.recycle();
        return zE;
    }
}
