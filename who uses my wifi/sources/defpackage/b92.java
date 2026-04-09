package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class b92 extends hv1 implements c92 {
    public static final /* synthetic */ int f = 0;

    public b92() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                X2(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                j();
                parcel2.writeNoException();
                return true;
            case 3:
                g();
                parcel2.writeNoException();
                return true;
            case 4:
                k();
                parcel2.writeNoException();
                return true;
            case 5:
                i();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                c0(bundle2);
                parcel2.writeNoException();
                iv1.d(parcel2, bundle2);
                return true;
            case 7:
                S();
                parcel2.writeNoException();
                return true;
            case 8:
                x();
                parcel2.writeNoException();
                return true;
            case 9:
                u();
                parcel2.writeNoException();
                return true;
            case 10:
                b();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zE = e();
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 12:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                Intent intent = (Intent) iv1.b(parcel, Intent.CREATOR);
                iv1.f(parcel);
                V1(i2, i3, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                D(u10VarX0);
                parcel2.writeNoException();
                return true;
            case 14:
                c();
                parcel2.writeNoException();
                return true;
            case 15:
                int i4 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                iv1.f(parcel);
                O1(i4, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
