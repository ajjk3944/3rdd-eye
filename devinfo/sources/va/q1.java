package va;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q1 extends ac.a implements r1 {
    public q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 1);
    }

    @Override // va.r1
    public final boolean d() {
        Parcel parcelR0 = r0(T(), 2);
        ClassLoader classLoader = ng.f14287a;
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // va.r1
    public final void x1(d3 d3Var) {
        Parcel parcelT = T();
        ng.c(parcelT, d3Var);
        g1(parcelT, 1);
    }
}
