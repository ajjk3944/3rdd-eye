package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C7;

/* loaded from: classes.dex */
public abstract class A0 extends B7 implements B0 {
    public A0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static B0 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof B0 ? (B0) iInterfaceQueryLocalInterface : new C2856z0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        C0 c02;
        switch (i) {
            case 1:
                b();
                parcel2.writeNoException();
                return true;
            case 2:
                d();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zA = C7.a(parcel);
                C7.f(parcel);
                r0(zA);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zG = g();
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 5:
                int iJ = j();
                parcel2.writeNoException();
                parcel2.writeInt(iJ);
                return true;
            case 6:
                float fH = h();
                parcel2.writeNoException();
                parcel2.writeFloat(fH);
                return true;
            case 7:
                float fK = k();
                parcel2.writeNoException();
                parcel2.writeFloat(fK);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c02 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c02 = iInterfaceQueryLocalInterface instanceof C0 ? (C0) iInterfaceQueryLocalInterface : new C0(strongBinder);
                }
                C7.f(parcel);
                J1(c02);
                parcel2.writeNoException();
                return true;
            case 9:
                float fN = n();
                parcel2.writeNoException();
                parcel2.writeFloat(fN);
                return true;
            case 10:
                boolean zO = o();
                parcel2.writeNoException();
                ClassLoader classLoader2 = C7.f7544a;
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 11:
                C0 c0P = p();
                parcel2.writeNoException();
                C7.e(parcel2, c0P);
                return true;
            case 12:
                boolean zQ = q();
                parcel2.writeNoException();
                ClassLoader classLoader3 = C7.f7544a;
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case 13:
                y();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
