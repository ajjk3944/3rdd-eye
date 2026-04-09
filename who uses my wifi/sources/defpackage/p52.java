package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class p52 extends hv1 implements a62 {
    public p52() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            pc4 pc4Var = (pc4) iv1.b(parcel, pc4.CREATOR);
            iv1.f(parcel);
            Z(pc4Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String strC = c();
            parcel2.writeNoException();
            parcel2.writeString(strC);
            return true;
        }
        if (i == 3) {
            boolean zE = e();
            parcel2.writeNoException();
            ClassLoader classLoader = iv1.a;
            parcel2.writeInt(zE ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String strF = f();
            parcel2.writeNoException();
            parcel2.writeString(strF);
            return true;
        }
        if (i != 5) {
            return false;
        }
        pc4 pc4Var2 = (pc4) iv1.b(parcel, pc4.CREATOR);
        int i2 = parcel.readInt();
        iv1.f(parcel);
        P2(pc4Var2, i2);
        parcel2.writeNoException();
        return true;
    }
}
