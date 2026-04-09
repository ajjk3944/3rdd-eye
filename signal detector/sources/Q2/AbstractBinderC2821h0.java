package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C0823Yb;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;
import com.google.android.gms.internal.ads.InterfaceC0840Zb;
import java.util.List;

/* renamed from: q2.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2821h0 extends B7 implements InterfaceC2823i0 {
    public AbstractBinderC2821h0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0840Zb c0823Yb = null;
        InterfaceC2837p0 c2833n0 = null;
        switch (i) {
            case 1:
                b();
                parcel2.writeNoException();
                return true;
            case 2:
                float f2 = parcel.readFloat();
                C7.f(parcel);
                i1(f2);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                C7.f(parcel);
                P2(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zA = C7.a(parcel);
                C7.f(parcel);
                d0(zA);
                parcel2.writeNoException();
                return true;
            case 5:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                String string2 = parcel.readString();
                C7.f(parcel);
                B1(aVarD1, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                V1(aVarD12, string3);
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
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 9:
                String strN = n();
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case 10:
                String string4 = parcel.readString();
                C7.f(parcel);
                G1(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC0603Lc interfaceC0603LcK3 = BinderC0569Jc.K3(parcel.readStrongBinder());
                C7.f(parcel);
                l3(interfaceC0603LcK3);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    c0823Yb = iInterfaceQueryLocalInterface instanceof InterfaceC0840Zb ? (InterfaceC0840Zb) iInterfaceQueryLocalInterface : new C0823Yb(strongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 2);
                }
                C7.f(parcel);
                F1(c0823Yb);
                parcel2.writeNoException();
                return true;
            case 13:
                List listL = l();
                parcel2.writeNoException();
                parcel2.writeTypedList(listL);
                return true;
            case 14:
                V0 v0 = (V0) C7.b(parcel, V0.CREATOR);
                C7.f(parcel);
                j1(v0);
                parcel2.writeNoException();
                return true;
            case 15:
                r();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    c2833n0 = iInterfaceQueryLocalInterface2 instanceof InterfaceC2837p0 ? (InterfaceC2837p0) iInterfaceQueryLocalInterface2 : new C2833n0(strongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 2);
                }
                C7.f(parcel);
                x0(c2833n0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zA2 = C7.a(parcel);
                C7.f(parcel);
                A0(zA2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                C7.f(parcel);
                X(string5);
                parcel2.writeNoException();
                return true;
            case 19:
                Y();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
