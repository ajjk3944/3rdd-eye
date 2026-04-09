package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class y62 extends hv1 implements z62 {
    public y62() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static z62 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof z62 ? (z62) iInterfaceQueryLocalInterface : new x62(iBinder);
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        va2 ua2Var;
        switch (i) {
            case 1:
                b();
                break;
            case 2:
                c();
                break;
            case 3:
                int i2 = parcel.readInt();
                iv1.f(parcel);
                m0(i2);
                break;
            case 4:
                f();
                break;
            case 5:
                j();
                break;
            case 6:
                g();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                iv1.f(parcel);
                break;
            case 8:
                k();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                iv1.f(parcel);
                v2(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                }
                parcel.readString();
                iv1.f(parcel);
                break;
            case 11:
                j0();
                break;
            case 12:
                parcel.readString();
                iv1.f(parcel);
                break;
            case 13:
                p();
                break;
            case 14:
                ta2 ta2Var = (ta2) iv1.b(parcel, ta2.CREATOR);
                iv1.f(parcel);
                r3(ta2Var);
                break;
            case 15:
                x();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    ua2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    ua2Var = iInterfaceQueryLocalInterface instanceof va2 ? (va2) iInterfaceQueryLocalInterface : new ua2(strongBinder3);
                }
                iv1.f(parcel);
                l2(ua2Var);
                break;
            case 17:
                int i3 = parcel.readInt();
                iv1.f(parcel);
                f0(i3);
                break;
            case 18:
                G0();
                break;
            case 19:
                iv1.f(parcel);
                break;
            case 20:
                h0();
                break;
            case zy1.zzm /* 21 */:
                String string3 = parcel.readString();
                iv1.f(parcel);
                i0(string3);
                break;
            case 22:
                int i4 = parcel.readInt();
                String string4 = parcel.readString();
                iv1.f(parcel);
                w0(string4, i4);
                break;
            case 23:
                nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
                iv1.f(parcel);
                K0(nx2Var);
                break;
            case 24:
                nx2 nx2Var2 = (nx2) iv1.b(parcel, nx2.CREATOR);
                iv1.f(parcel);
                F1(nx2Var2);
                break;
            case 25:
                b0();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
