package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xx2 extends sb1 implements py2 {
    public xx2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 2);
    }

    @Override // defpackage.py2
    public final void Z0(wy2 wy2Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, wy2Var);
        M0(parcelU, 8);
    }

    @Override // defpackage.py2
    public final float g() {
        throw null;
    }

    @Override // defpackage.py2
    public final float k() {
        throw null;
    }

    @Override // defpackage.py2
    public final float n() {
        throw null;
    }

    @Override // defpackage.py2
    public final wy2 p() {
        wy2 wy2Var;
        Parcel parcelY = Y(U(), 11);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            wy2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            wy2Var = iInterfaceQueryLocalInterface instanceof wy2 ? (wy2) iInterfaceQueryLocalInterface : new wy2(strongBinder);
        }
        parcelY.recycle();
        return wy2Var;
    }
}
