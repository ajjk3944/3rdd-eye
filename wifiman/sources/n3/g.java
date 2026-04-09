package N3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends A3.a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void n0(j jVar, f fVar) {
        Parcel parcelB = b();
        A3.c.c(parcelB, jVar);
        A3.c.d(parcelB, fVar);
        c(12, parcelB);
    }
}
