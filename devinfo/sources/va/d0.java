package va;

import android.os.Parcel;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class d0 extends mg implements e0 {
    public d0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            z2 z2Var = (z2) ng.b(parcel, z2.CREATOR);
            ng.f(parcel);
            P(z2Var);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 2) {
            String strD = d();
            parcel2.writeNoException();
            parcel2.writeString(strD);
            return true;
        }
        if (i4 == 3) {
            boolean zE = e();
            parcel2.writeNoException();
            ClassLoader classLoader = ng.f14287a;
            parcel2.writeInt(zE ? 1 : 0);
            return true;
        }
        if (i4 == 4) {
            String strZ1 = z1();
            parcel2.writeNoException();
            parcel2.writeString(strZ1);
            return true;
        }
        if (i4 != 5) {
            return false;
        }
        z2 z2Var2 = (z2) ng.b(parcel, z2.CREATOR);
        int i10 = parcel.readInt();
        ng.f(parcel);
        l3(z2Var2, i10);
        parcel2.writeNoException();
        return true;
    }
}
