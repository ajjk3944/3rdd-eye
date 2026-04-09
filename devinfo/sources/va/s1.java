package va;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s1 extends ac.a implements t1 {
    public s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 1);
    }

    @Override // va.t1
    public final void S3(String str, vb.a aVar, vb.a aVar2) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        ng.e(parcelT, aVar);
        ng.e(parcelT, aVar2);
        g1(parcelT, 1);
    }
}
