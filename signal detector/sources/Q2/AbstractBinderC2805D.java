package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2805D extends B7 implements E {
    public AbstractBinderC2805D() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a1 a1Var = (a1) C7.b(parcel, a1.CREATOR);
            C7.f(parcel);
            f0(a1Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String strD = d();
            parcel2.writeNoException();
            parcel2.writeString(strD);
            return true;
        }
        if (i == 3) {
            boolean zE = e();
            parcel2.writeNoException();
            ClassLoader classLoader = C7.f7544a;
            parcel2.writeInt(zE ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String strG = g();
            parcel2.writeNoException();
            parcel2.writeString(strG);
            return true;
        }
        if (i != 5) {
            return false;
        }
        a1 a1Var2 = (a1) C7.b(parcel, a1.CREATOR);
        int i3 = parcel.readInt();
        C7.f(parcel);
        a1(a1Var2, i3);
        parcel2.writeNoException();
        return true;
    }
}
