package q2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C0435Be;
import com.google.android.gms.internal.ads.C1247h8;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC0757Ud;
import com.google.android.gms.internal.ads.InterfaceC0774Vd;
import com.google.android.gms.internal.ads.InterfaceC1407k8;
import com.google.android.gms.internal.ads.N9;

/* loaded from: classes.dex */
public abstract class K extends B7 implements L {
    public K() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2853y c2849w = null;
        InterfaceC2809b0 c2807a0 = null;
        InterfaceC2803B c2855z = null;
        InterfaceC2842s0 c2840r0 = null;
        InterfaceC1407k8 c1247h8 = null;
        C0435Be c0435Be = null;
        Z z6 = null;
        InterfaceC2847v c2845u = null;
        N9 n9 = null;
        W v6 = null;
        switch (i) {
            case 1:
                S2.a aVarC = c();
                parcel2.writeNoException();
                C7.e(parcel2, aVarC);
                return true;
            case 2:
                s();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zM = m();
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 4:
                a1 a1Var = (a1) C7.b(parcel, a1.CREATOR);
                C7.f(parcel);
                boolean zF0 = f0(a1Var);
                parcel2.writeNoException();
                parcel2.writeInt(zF0 ? 1 : 0);
                return true;
            case 5:
                d();
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
                    c2849w = iInterfaceQueryLocalInterface instanceof InterfaceC2853y ? (InterfaceC2853y) iInterfaceQueryLocalInterface : new C2849w(strongBinder);
                }
                C7.f(parcel);
                k1(c2849w);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    v6 = iInterfaceQueryLocalInterface2 instanceof W ? (W) iInterfaceQueryLocalInterface2 : new V(strongBinder2);
                }
                C7.f(parcel);
                C3(v6);
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
                d1 d1VarO = o();
                parcel2.writeNoException();
                C7.d(parcel2, d1VarO);
                return true;
            case 13:
                d1 d1Var = (d1) C7.b(parcel, d1.CREATOR);
                C7.f(parcel);
                D1(d1Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (iInterfaceQueryLocalInterface3 instanceof InterfaceC0757Ud) {
                    }
                }
                C7.f(parcel);
                q();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (iInterfaceQueryLocalInterface4 instanceof InterfaceC0774Vd) {
                    }
                }
                parcel.readString();
                C7.f(parcel);
                l();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strW = w();
                parcel2.writeNoException();
                parcel2.writeString(strW);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    n9 = iInterfaceQueryLocalInterface5 instanceof N9 ? (N9) iInterfaceQueryLocalInterface5 : new N9(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 2);
                }
                C7.f(parcel);
                H3(n9);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    c2845u = iInterfaceQueryLocalInterface6 instanceof InterfaceC2847v ? (InterfaceC2847v) iInterfaceQueryLocalInterface6 : new C2845u(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 2);
                }
                C7.f(parcel);
                q2(c2845u);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    z6 = iInterfaceQueryLocalInterface7 instanceof Z ? (Z) iInterfaceQueryLocalInterface7 : new Z(strongBinder7);
                }
                C7.f(parcel);
                v1(z6);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zA = C7.a(parcel);
                C7.f(parcel);
                w2(zA);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zH = H();
                parcel2.writeNoException();
                ClassLoader classLoader2 = C7.f7544a;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c0435Be = iInterfaceQueryLocalInterface8 instanceof C0435Be ? (C0435Be) iInterfaceQueryLocalInterface8 : new C0435Be(strongBinder8);
                }
                C7.f(parcel);
                S1(c0435Be);
                parcel2.writeNoException();
                return true;
            case 25:
                String string = parcel.readString();
                C7.f(parcel);
                L2(string);
                parcel2.writeNoException();
                return true;
            case 26:
                B0 b0C = C();
                parcel2.writeNoException();
                C7.e(parcel2, b0C);
                return true;
            case 29:
                Y0 y02 = (Y0) C7.b(parcel, Y0.CREATOR);
                C7.f(parcel);
                O0(y02);
                parcel2.writeNoException();
                return true;
            case 30:
                C7.f(parcel);
                K();
                parcel2.writeNoException();
                return true;
            case 31:
                String strA = A();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 32:
                W wU = u();
                parcel2.writeNoException();
                C7.e(parcel2, wU);
                return true;
            case 33:
                InterfaceC2853y interfaceC2853yY = Y();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC2853yY);
                return true;
            case 34:
                boolean zA2 = C7.a(parcel);
                C7.f(parcel);
                S0(zA2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strR = r();
                parcel2.writeNoException();
                parcel2.writeString(strR);
                return true;
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (iInterfaceQueryLocalInterface9 instanceof N) {
                    }
                }
                C7.f(parcel);
                s1();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleK = k();
                parcel2.writeNoException();
                C7.d(parcel2, bundleK);
                return true;
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                parcel.readString();
                C7.f(parcel);
                b0();
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                g1 g1Var = (g1) C7.b(parcel, g1.CREATOR);
                C7.f(parcel);
                u2(g1Var);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    c1247h8 = iInterfaceQueryLocalInterface10 instanceof InterfaceC1407k8 ? (InterfaceC1407k8) iInterfaceQueryLocalInterface10 : new C1247h8(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 2);
                }
                C7.f(parcel);
                w1(c1247h8);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                InterfaceC2854y0 interfaceC2854y0N = N();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC2854y0N);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    c2840r0 = iInterfaceQueryLocalInterface11 instanceof InterfaceC2842s0 ? (InterfaceC2842s0) iInterfaceQueryLocalInterface11 : new C2840r0(strongBinder11);
                }
                C7.f(parcel);
                V2(c2840r0);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                a1 a1Var2 = (a1) C7.b(parcel, a1.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    c2855z = iInterfaceQueryLocalInterface12 instanceof InterfaceC2803B ? (InterfaceC2803B) iInterfaceQueryLocalInterface12 : new C2855z(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 2);
                }
                C7.f(parcel);
                x3(a1Var2, c2855z);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                B2(aVarD1);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    c2807a0 = iInterfaceQueryLocalInterface13 instanceof InterfaceC2809b0 ? (InterfaceC2809b0) iInterfaceQueryLocalInterface13 : new C2807a0(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 2);
                }
                C7.f(parcel);
                I2(c2807a0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zM2 = M();
                parcel2.writeNoException();
                ClassLoader classLoader3 = C7.f7544a;
                parcel2.writeInt(zM2 ? 1 : 0);
                return true;
            case 47:
                long jA0 = a0();
                parcel2.writeNoException();
                parcel2.writeLong(jA0);
                return true;
            case 48:
                long j6 = parcel.readLong();
                C7.f(parcel);
                R0(j6);
                parcel2.writeNoException();
                return true;
        }
    }
}
