package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class hy2 extends hv1 implements py2 {
    public hy2() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static py2 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof py2 ? (py2) iInterfaceQueryLocalInterface : new xx2(iBinder);
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        wy2 wy2Var;
        switch (i) {
            case 1:
                b();
                parcel2.writeNoException();
                return true;
            case 2:
                c();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zA = iv1.a(parcel);
                iv1.f(parcel);
                o0(zA);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zF = f();
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 5:
                int iJ = j();
                parcel2.writeNoException();
                parcel2.writeInt(iJ);
                return true;
            case 6:
                float fG = g();
                parcel2.writeNoException();
                parcel2.writeFloat(fG);
                return true;
            case 7:
                float fK = k();
                parcel2.writeNoException();
                parcel2.writeFloat(fK);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    wy2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    wy2Var = iInterfaceQueryLocalInterface instanceof wy2 ? (wy2) iInterfaceQueryLocalInterface : new wy2(strongBinder);
                }
                iv1.f(parcel);
                Z0(wy2Var);
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
                ClassLoader classLoader2 = iv1.a;
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 11:
                wy2 wy2VarP = p();
                parcel2.writeNoException();
                iv1.e(parcel2, wy2VarP);
                return true;
            case 12:
                boolean zQ = q();
                parcel2.writeNoException();
                ClassLoader classLoader3 = iv1.a;
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case 13:
                x();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
