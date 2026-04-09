package va;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.yq;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r0 extends ac.a implements s0 {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader", 1);
    }

    @Override // va.s0
    public final void A(int i4) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        g1(parcelT, 18);
    }

    @Override // va.s0
    public final void C2(yq yqVar) {
        Parcel parcelT = T();
        ng.e(parcelT, yqVar);
        g1(parcelT, 8);
    }
}
