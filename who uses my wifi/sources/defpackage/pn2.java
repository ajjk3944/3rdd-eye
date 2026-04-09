package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class pn2 extends hv1 implements zn2 {
    public pn2() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        d52 c52Var = null;
        ms2 kr2Var = null;
        switch (i) {
            case 1:
                b();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                iv1.f(parcel);
                S1(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                iv1.f(parcel);
                I1(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zA = iv1.a(parcel);
                iv1.f(parcel);
                Q(zA);
                parcel2.writeNoException();
                return true;
            case 5:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                iv1.f(parcel);
                j2(u10VarX0, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                S2(u10VarX02, string3);
                parcel2.writeNoException();
                return true;
            case 7:
                float fK = k();
                parcel2.writeNoException();
                parcel2.writeFloat(fK);
                return true;
            case 8:
                boolean zI = i();
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 9:
                String strN = n();
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case 10:
                String string4 = parcel.readString();
                iv1.f(parcel);
                C2(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                u62 u62VarB3 = s62.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                x2(u62VarB3);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    c52Var = iInterfaceQueryLocalInterface instanceof d52 ? (d52) iInterfaceQueryLocalInterface : new c52(strongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 2);
                }
                iv1.f(parcel);
                y2(c52Var);
                parcel2.writeNoException();
                return true;
            case 13:
                List listM = m();
                parcel2.writeNoException();
                parcel2.writeTypedList(listM);
                return true;
            case 14:
                ne3 ne3Var = (ne3) iv1.b(parcel, ne3.CREATOR);
                iv1.f(parcel);
                b2(ne3Var);
                parcel2.writeNoException();
                return true;
            case 15:
                u();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    kr2Var = iInterfaceQueryLocalInterface2 instanceof ms2 ? (ms2) iInterfaceQueryLocalInterface2 : new kr2(strongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 2);
                }
                iv1.f(parcel);
                w3(kr2Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zA2 = iv1.a(parcel);
                iv1.f(parcel);
                D0(zA2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                iv1.f(parcel);
                i0(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
