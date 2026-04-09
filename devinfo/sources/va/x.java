package va;

import android.os.Parcel;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class x extends mg implements y {
    public x() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 1:
                m();
                break;
            case 2:
                int i10 = parcel.readInt();
                ng.f(parcel);
                p(i10);
                break;
            case 3:
                break;
            case 4:
                d();
                break;
            case 5:
                e();
                break;
            case 6:
                z1();
                break;
            case 7:
                A1();
                break;
            case 8:
                w1 w1Var = (w1) ng.b(parcel, w1.CREATOR);
                ng.f(parcel);
                W(w1Var);
                break;
            case 9:
                C1();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
