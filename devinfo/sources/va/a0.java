package va;

import android.os.Parcel;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a0 extends mg implements b0 {
    public a0() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            m();
        } else {
            if (i4 != 2) {
                return false;
            }
            w1 w1Var = (w1) ng.b(parcel, w1.CREATOR);
            ng.f(parcel);
            J(w1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
