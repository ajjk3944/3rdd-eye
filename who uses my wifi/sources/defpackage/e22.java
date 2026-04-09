package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class e22 extends hv1 implements f22 {
    public static final /* synthetic */ int f = 0;

    public e22() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        z12 y12Var;
        switch (i) {
            case 1:
                String string = parcel.readString();
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                V0(u10VarX0, string);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                iv1.f(parcel);
                u10 u10VarP = P(string2);
                parcel2.writeNoException();
                iv1.e(parcel2, u10VarP);
                return true;
            case 3:
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                L0(u10VarX02);
                parcel2.writeNoException();
                return true;
            case 4:
                b();
                parcel2.writeNoException();
                return true;
            case 5:
                oi0.X0(parcel.readStrongBinder());
                parcel.readInt();
                iv1.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                M(u10VarX03);
                parcel2.writeNoException();
                return true;
            case 7:
                u10 u10VarX04 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                E0(u10VarX04);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    y12Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    y12Var = iInterfaceQueryLocalInterface instanceof z12 ? (z12) iInterfaceQueryLocalInterface : new y12(strongBinder);
                }
                iv1.f(parcel);
                T2(y12Var);
                parcel2.writeNoException();
                return true;
            case 9:
                u10 u10VarX05 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                z1(u10VarX05);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
