package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2840r0 extends W2.a implements InterfaceC2842s0 {
    public C2840r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 2);
    }

    @Override // q2.InterfaceC2842s0
    public final boolean d() {
        Parcel parcelK0 = k0(h0(), 2);
        ClassLoader classLoader = C7.f7544a;
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // q2.InterfaceC2842s0
    public final void u1(e1 e1Var) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, e1Var);
        I0(parcelH0, 1);
    }
}
