package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.lp;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.yq;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g1 extends mg implements h1 {
    public g1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        mp lpVar = null;
        o1 m1Var = null;
        switch (i4) {
            case 1:
                c();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                ng.f(parcel);
                W0(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                ng.f(parcel);
                i3(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zA = ng.a(parcel);
                ng.f(parcel);
                Q1(zA);
                parcel2.writeNoException();
                return true;
            case 5:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                ng.f(parcel);
                C3(string2, aVarR0);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                n3(string3, aVarR02);
                parcel2.writeNoException();
                return true;
            case 7:
                float fD1 = D1();
                parcel2.writeNoException();
                parcel2.writeFloat(fD1);
                return true;
            case 8:
                boolean zB1 = B1();
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeInt(zB1 ? 1 : 0);
                return true;
            case 9:
                String strF1 = F1();
                parcel2.writeNoException();
                parcel2.writeString(strF1);
                return true;
            case 10:
                String string4 = parcel.readString();
                ng.f(parcel);
                L(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                ar arVarH4 = yq.h4(parcel.readStrongBinder());
                ng.f(parcel);
                G3(arVarH4);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    lpVar = iInterfaceQueryLocalInterface instanceof mp ? (mp) iInterfaceQueryLocalInterface : new lp(strongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 1);
                }
                ng.f(parcel);
                U1(lpVar);
                parcel2.writeNoException();
                return true;
            case 13:
                List listE1 = E1();
                parcel2.writeNoException();
                parcel2.writeTypedList(listE1);
                return true;
            case 14:
                u2 u2Var = (u2) ng.b(parcel, u2.CREATOR);
                ng.f(parcel);
                r3(u2Var);
                parcel2.writeNoException();
                return true;
            case 15:
                J1();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    m1Var = iInterfaceQueryLocalInterface2 instanceof o1 ? (o1) iInterfaceQueryLocalInterface2 : new m1(strongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 1);
                }
                ng.f(parcel);
                z2(m1Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zA2 = ng.a(parcel);
                ng.f(parcel);
                i0(zA2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                ng.f(parcel);
                H(string5);
                parcel2.writeNoException();
                return true;
            case 19:
                I();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
