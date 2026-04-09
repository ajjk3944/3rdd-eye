package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class n92 extends hv1 implements ba2 {
    public n92() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        d32 v12Var = null;
        pl2 vk2Var = null;
        p42 s32Var = null;
        zu2 fu2Var = null;
        nw1 lw1Var = null;
        ma2 ma2Var = null;
        pk2 pk2Var = null;
        b12 pz1Var = null;
        vz1 vz1Var = null;
        wi2 hi2Var = null;
        switch (i) {
            case 1:
                u10 u10VarD = d();
                parcel2.writeNoException();
                iv1.e(parcel2, u10VarD);
                return true;
            case 2:
                r();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zL = l();
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 4:
                pc4 pc4Var = (pc4) iv1.b(parcel, pc4.CREATOR);
                iv1.f(parcel);
                boolean Z = Z(pc4Var);
                parcel2.writeNoException();
                parcel2.writeInt(Z ? 1 : 0);
                return true;
            case 5:
                c();
                parcel2.writeNoException();
                return true;
            case 6:
                e();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    v12Var = iInterfaceQueryLocalInterface instanceof d32 ? (d32) iInterfaceQueryLocalInterface : new v12(strongBinder);
                }
                iv1.f(parcel);
                W2(v12Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    hi2Var = iInterfaceQueryLocalInterface2 instanceof wi2 ? (wi2) iInterfaceQueryLocalInterface2 : new hi2(strongBinder2);
                }
                iv1.f(parcel);
                I0(hi2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                i();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                n();
                parcel2.writeNoException();
                return true;
            case 12:
                xe4 xe4VarO = o();
                parcel2.writeNoException();
                iv1.d(parcel2, xe4VarO);
                return true;
            case 13:
                xe4 xe4Var = (xe4) iv1.b(parcel, xe4.CREATOR);
                iv1.f(parcel);
                N0(xe4Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                }
                iv1.f(parcel);
                q();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                }
                parcel.readString();
                iv1.f(parcel);
                m();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strE = E();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    vz1Var = iInterfaceQueryLocalInterface3 instanceof vz1 ? (vz1) iInterfaceQueryLocalInterface3 : new vz1(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 2);
                }
                iv1.f(parcel);
                o3(vz1Var);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    pz1Var = iInterfaceQueryLocalInterface4 instanceof b12 ? (b12) iInterfaceQueryLocalInterface4 : new pz1(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 2);
                }
                iv1.f(parcel);
                H2(pz1Var);
                parcel2.writeNoException();
                return true;
            case zy1.zzm /* 21 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    pk2Var = iInterfaceQueryLocalInterface5 instanceof pk2 ? (pk2) iInterfaceQueryLocalInterface5 : new pk2(strongBinder7);
                }
                iv1.f(parcel);
                N1(pk2Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zA = iv1.a(parcel);
                iv1.f(parcel);
                g1(zA);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zC = C();
                parcel2.writeNoException();
                ClassLoader classLoader2 = iv1.a;
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    ma2Var = iInterfaceQueryLocalInterface6 instanceof ma2 ? (ma2) iInterfaceQueryLocalInterface6 : new ma2(strongBinder8);
                }
                iv1.f(parcel);
                n2(ma2Var);
                parcel2.writeNoException();
                return true;
            case 25:
                String string = parcel.readString();
                iv1.f(parcel);
                D1(string);
                parcel2.writeNoException();
                return true;
            case 26:
                py2 py2VarA = A();
                parcel2.writeNoException();
                iv1.e(parcel2, py2VarA);
                return true;
            case 29:
                ih3 ih3Var = (ih3) iv1.b(parcel, ih3.CREATOR);
                iv1.f(parcel);
                J2(ih3Var);
                parcel2.writeNoException();
                return true;
            case 30:
                iv1.f(parcel);
                H();
                parcel2.writeNoException();
                return true;
            case 31:
                String strV = v();
                parcel2.writeNoException();
                parcel2.writeString(strV);
                return true;
            case 32:
                wi2 wi2VarS = s();
                parcel2.writeNoException();
                iv1.e(parcel2, wi2VarS);
                return true;
            case 33:
                d32 d32VarP2 = p2();
                parcel2.writeNoException();
                iv1.e(parcel2, d32VarP2);
                return true;
            case 34:
                boolean zA2 = iv1.a(parcel);
                iv1.f(parcel);
                t1(zA2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strU = u();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                }
                iv1.f(parcel);
                i2();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleK = k();
                parcel2.writeNoException();
                iv1.d(parcel2, bundleK);
                return true;
            case 38:
                parcel.readString();
                iv1.f(parcel);
                p0();
                parcel2.writeNoException();
                return true;
            case 39:
                vi4 vi4Var = (vi4) iv1.b(parcel, vi4.CREATOR);
                iv1.f(parcel);
                A1(vi4Var);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    lw1Var = iInterfaceQueryLocalInterface7 instanceof nw1 ? (nw1) iInterfaceQueryLocalInterface7 : new lw1(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 2);
                }
                iv1.f(parcel);
                K2(lw1Var);
                parcel2.writeNoException();
                return true;
            case 41:
                tx2 tx2VarN = N();
                parcel2.writeNoException();
                iv1.e(parcel2, tx2VarN);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    fu2Var = iInterfaceQueryLocalInterface8 instanceof zu2 ? (zu2) iInterfaceQueryLocalInterface8 : new fu2(strongBinder11);
                }
                iv1.f(parcel);
                Z1(fu2Var);
                parcel2.writeNoException();
                return true;
            case 43:
                pc4 pc4Var2 = (pc4) iv1.b(parcel, pc4.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    s32Var = iInterfaceQueryLocalInterface9 instanceof p42 ? (p42) iInterfaceQueryLocalInterface9 : new s32(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 2);
                }
                iv1.f(parcel);
                a1(pc4Var2, s32Var);
                parcel2.writeNoException();
                return true;
            case 44:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                k3(u10VarX0);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    vk2Var = iInterfaceQueryLocalInterface10 instanceof pl2 ? (pl2) iInterfaceQueryLocalInterface10 : new vk2(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 2);
                }
                iv1.f(parcel);
                o2(vk2Var);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zL2 = L();
                parcel2.writeNoException();
                ClassLoader classLoader3 = iv1.a;
                parcel2.writeInt(zL2 ? 1 : 0);
                return true;
            case 47:
                long jK0 = k0();
                parcel2.writeNoException();
                parcel2.writeLong(jK0);
                return true;
            case 48:
                long j = parcel.readLong();
                iv1.f(parcel);
                s1(j);
                parcel2.writeNoException();
                return true;
        }
    }
}
