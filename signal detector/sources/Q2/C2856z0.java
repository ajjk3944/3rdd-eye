package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2856z0 extends W2.a implements B0 {
    public C2856z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 2);
    }

    @Override // q2.B0
    public final void J1(C0 c02) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, c02);
        I0(parcelH0, 8);
    }

    @Override // q2.B0
    public final float h() {
        throw null;
    }

    @Override // q2.B0
    public final float k() {
        throw null;
    }

    @Override // q2.B0
    public final float n() {
        throw null;
    }

    @Override // q2.B0
    public final C0 p() {
        C0 c02;
        Parcel parcelK0 = k0(h0(), 11);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c02 = iInterfaceQueryLocalInterface instanceof C0 ? (C0) iInterfaceQueryLocalInterface : new C0(strongBinder);
        }
        parcelK0.recycle();
        return c02;
    }
}
