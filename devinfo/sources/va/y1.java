package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y1 extends ac.a implements a2 {
    public y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 1);
    }

    @Override // va.a2
    public final float A1() {
        throw null;
    }

    @Override // va.a2
    public final float D1() {
        throw null;
    }

    @Override // va.a2
    public final float F1() {
        throw null;
    }

    @Override // va.a2
    public final b2 H1() {
        b2 b2Var;
        Parcel parcelR0 = r0(T(), 11);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            b2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            b2Var = iInterfaceQueryLocalInterface instanceof b2 ? (b2) iInterfaceQueryLocalInterface : new b2(strongBinder);
        }
        parcelR0.recycle();
        return b2Var;
    }

    @Override // va.a2
    public final void X1(b2 b2Var) {
        Parcel parcelT = T();
        ng.e(parcelT, b2Var);
        g1(parcelT, 8);
    }
}
