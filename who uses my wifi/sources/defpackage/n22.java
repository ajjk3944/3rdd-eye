package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class n22 extends hv1 implements d32 {
    public n22() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                y();
                break;
            case 2:
                int i2 = parcel.readInt();
                iv1.f(parcel);
                I(i2);
                break;
            case 3:
                break;
            case 4:
                c();
                break;
            case 5:
                e();
                break;
            case 6:
                f();
                break;
            case 7:
                g();
                break;
            case 8:
                nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
                iv1.f(parcel);
                W(nx2Var);
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
