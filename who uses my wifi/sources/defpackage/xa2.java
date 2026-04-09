package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class xa2 extends hv1 implements ya2 {
    public static final /* synthetic */ int f = 0;

    public xa2() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        fb2 db2Var = null;
        fb2 db2Var2 = null;
        xs2 xs2Var = null;
        gb2 gb2Var = null;
        bb2 za2Var = null;
        switch (i) {
            case 1:
                pc4 pc4Var = (pc4) iv1.b(parcel, pc4.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    db2Var = iInterfaceQueryLocalInterface instanceof fb2 ? (fb2) iInterfaceQueryLocalInterface : new db2(strongBinder);
                }
                iv1.f(parcel);
                q2(pc4Var, db2Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    za2Var = iInterfaceQueryLocalInterface2 instanceof bb2 ? (bb2) iInterfaceQueryLocalInterface2 : new za2(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 2);
                }
                iv1.f(parcel);
                c1(za2Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zJ = j();
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 4:
                String strG = g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 5:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                w2(u10VarX0);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    gb2Var = iInterfaceQueryLocalInterface3 instanceof gb2 ? (gb2) iInterfaceQueryLocalInterface3 : new gb2(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 2);
                }
                iv1.f(parcel);
                A2(gb2Var);
                parcel2.writeNoException();
                return true;
            case 7:
                mb2 mb2Var = (mb2) iv1.b(parcel, mb2.CREATOR);
                iv1.f(parcel);
                B2(mb2Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    xs2Var = iInterfaceQueryLocalInterface4 instanceof xs2 ? (xs2) iInterfaceQueryLocalInterface4 : new xs2(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 2);
                }
                iv1.f(parcel);
                d2(xs2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleE = e();
                parcel2.writeNoException();
                iv1.d(parcel2, bundleE);
                return true;
            case 10:
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                ClassLoader classLoader2 = iv1.a;
                boolean z = parcel.readInt() != 0;
                iv1.f(parcel);
                C1(u10VarX02, z);
                parcel2.writeNoException();
                return true;
            case 11:
                va2 va2VarI = i();
                parcel2.writeNoException();
                iv1.e(parcel2, va2VarI);
                return true;
            case 12:
                tx2 tx2VarN = n();
                parcel2.writeNoException();
                iv1.e(parcel2, tx2VarN);
                return true;
            case 13:
                zu2 zu2VarB3 = kd3.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                d1(zu2VarB3);
                parcel2.writeNoException();
                return true;
            case 14:
                pc4 pc4Var2 = (pc4) iv1.b(parcel, pc4.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    db2Var2 = iInterfaceQueryLocalInterface5 instanceof fb2 ? (fb2) iInterfaceQueryLocalInterface5 : new db2(strongBinder5);
                }
                iv1.f(parcel);
                K1(pc4Var2, db2Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zA = iv1.a(parcel);
                iv1.f(parcel);
                u3(zA);
                parcel2.writeNoException();
                return true;
            case 16:
                String strO = o();
                parcel2.writeNoException();
                parcel2.writeString(strO);
                return true;
            case 17:
                long jM = m();
                parcel2.writeNoException();
                parcel2.writeLong(jM);
                return true;
            case 18:
                long j = parcel.readLong();
                iv1.f(parcel);
                h1(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
