package va;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.yq;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b1 extends ac.a implements d1 {
    @Override // va.d1
    public final ar getAdapterCreator() {
        Parcel parcelR0 = r0(T(), 2);
        ar arVarH4 = yq.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return arVarH4;
    }

    @Override // va.d1
    public final l2 getLiteSdkVersion() {
        Parcel parcelR0 = r0(T(), 1);
        l2 l2Var = (l2) ng.b(parcelR0, l2.CREATOR);
        parcelR0.recycle();
        return l2Var;
    }
}
