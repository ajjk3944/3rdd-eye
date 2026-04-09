package va;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u0 extends ac.a implements v0 {
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 1);
    }

    @Override // va.v0
    public final void Y(String str, String str2) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        g1(parcelT, 1);
    }
}
