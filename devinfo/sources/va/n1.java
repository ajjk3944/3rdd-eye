package va;

import android.os.Parcel;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class n1 extends mg implements o1 {
    public n1() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        w1 w1Var = (w1) ng.b(parcel, w1.CREATOR);
        ng.f(parcel);
        Q(w1Var);
        parcel2.writeNoException();
        return true;
    }
}
