package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class z1 extends mg implements a2 {
    public z1() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static a2 h4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof a2 ? (a2) iInterfaceQueryLocalInterface : new y1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        b2 b2Var;
        switch (i4) {
            case 1:
                c();
                parcel2.writeNoException();
                return true;
            case 2:
                d();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zA = ng.a(parcel);
                ng.f(parcel);
                S1(zA);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZ1 = z1();
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeInt(zZ1 ? 1 : 0);
                return true;
            case 5:
                int iC1 = C1();
                parcel2.writeNoException();
                parcel2.writeInt(iC1);
                return true;
            case 6:
                float fA1 = A1();
                parcel2.writeNoException();
                parcel2.writeFloat(fA1);
                return true;
            case 7:
                float fD1 = D1();
                parcel2.writeNoException();
                parcel2.writeFloat(fD1);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    b2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    b2Var = iInterfaceQueryLocalInterface instanceof b2 ? (b2) iInterfaceQueryLocalInterface : new b2(strongBinder);
                }
                ng.f(parcel);
                X1(b2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                float fF1 = F1();
                parcel2.writeNoException();
                parcel2.writeFloat(fF1);
                return true;
            case 10:
                boolean zG1 = G1();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ng.f14287a;
                parcel2.writeInt(zG1 ? 1 : 0);
                return true;
            case 11:
                b2 b2VarH1 = H1();
                parcel2.writeNoException();
                ng.e(parcel2, b2VarH1);
                return true;
            case 12:
                boolean zI1 = I1();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ng.f14287a;
                parcel2.writeInt(zI1 ? 1 : 0);
                return true;
            case 13:
                l();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
