package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2851x extends B7 implements InterfaceC2853y {
    public AbstractBinderC2851x() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                z();
                break;
            case 2:
                int i3 = parcel.readInt();
                C7.f(parcel);
                E(i3);
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
                g();
                break;
            case 7:
                h();
                break;
            case 8:
                C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
                C7.f(parcel);
                j0(c2852x0);
                break;
            case 9:
                j();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
