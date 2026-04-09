package va;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.lt;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.mt;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.su;
import com.google.android.gms.internal.ads.vh;
import com.google.android.gms.internal.ads.xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class k0 extends mg implements l0 {
    public k0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        y wVar = null;
        a1 z0Var = null;
        b0 zVar = null;
        r1 q1Var = null;
        vh shVar = null;
        su suVar = null;
        y0 y0Var = null;
        v uVar = null;
        xk xkVar = null;
        v0 u0Var = null;
        switch (i4) {
            case 1:
                vb.a aVarA = a();
                parcel2.writeNoException();
                ng.e(parcel2, aVarA);
                return true;
            case 2:
                h();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zF = f();
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 4:
                z2 z2Var = (z2) ng.b(parcel, z2.CREATOR);
                ng.f(parcel);
                boolean zP = P(z2Var);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
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
                    wVar = iInterfaceQueryLocalInterface instanceof y ? (y) iInterfaceQueryLocalInterface : new w(strongBinder);
                }
                ng.f(parcel);
                x3(wVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    u0Var = iInterfaceQueryLocalInterface2 instanceof v0 ? (v0) iInterfaceQueryLocalInterface2 : new u0(strongBinder2);
                }
                ng.f(parcel);
                X3(u0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                B1();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                F1();
                parcel2.writeNoException();
                return true;
            case 12:
                c3 c3VarG1 = G1();
                parcel2.writeNoException();
                ng.d(parcel2, c3VarG1);
                return true;
            case 13:
                c3 c3Var = (c3) ng.b(parcel, c3.CREATOR);
                ng.f(parcel);
                j1(c3Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (iInterfaceQueryLocalInterface3 instanceof lt) {
                    }
                }
                ng.f(parcel);
                I1();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (iInterfaceQueryLocalInterface4 instanceof mt) {
                    }
                }
                parcel.readString();
                ng.f(parcel);
                E1();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strL1 = L1();
                parcel2.writeNoException();
                parcel2.writeString(strL1);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    xkVar = iInterfaceQueryLocalInterface5 instanceof xk ? (xk) iInterfaceQueryLocalInterface5 : new xk(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 1);
                }
                ng.f(parcel);
                e4(xkVar);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    uVar = iInterfaceQueryLocalInterface6 instanceof v ? (v) iInterfaceQueryLocalInterface6 : new u(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 1);
                }
                ng.f(parcel);
                t0(uVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y0Var = iInterfaceQueryLocalInterface7 instanceof y0 ? (y0) iInterfaceQueryLocalInterface7 : new y0(strongBinder7);
                }
                ng.f(parcel);
                s1(y0Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zA = ng.a(parcel);
                ng.f(parcel);
                S2(zA);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zR = r();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ng.f14287a;
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    suVar = iInterfaceQueryLocalInterface8 instanceof su ? (su) iInterfaceQueryLocalInterface8 : new su(strongBinder8);
                }
                ng.f(parcel);
                n2(suVar);
                parcel2.writeNoException();
                return true;
            case 25:
                String string = parcel.readString();
                ng.f(parcel);
                g3(string);
                parcel2.writeNoException();
                return true;
            case 26:
                a2 a2VarY = y();
                parcel2.writeNoException();
                ng.e(parcel2, a2VarY);
                return true;
            case 29:
                x2 x2Var = (x2) ng.b(parcel, x2.CREATOR);
                ng.f(parcel);
                P2(x2Var);
                parcel2.writeNoException();
                return true;
            case 30:
                ng.f(parcel);
                t();
                parcel2.writeNoException();
                return true;
            case 31:
                String strM1 = M1();
                parcel2.writeNoException();
                parcel2.writeString(strM1);
                return true;
            case 32:
                v0 v0VarI = i();
                parcel2.writeNoException();
                ng.e(parcel2, v0VarI);
                return true;
            case 33:
                y yVarI = I();
                parcel2.writeNoException();
                ng.e(parcel2, yVarI);
                return true;
            case 34:
                boolean zA2 = ng.a(parcel);
                ng.f(parcel);
                E0(zA2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strJ1 = J1();
                parcel2.writeNoException();
                parcel2.writeString(strJ1);
                return true;
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (iInterfaceQueryLocalInterface9 instanceof n0) {
                    }
                }
                ng.f(parcel);
                p1();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleD1 = D1();
                parcel2.writeNoException();
                ng.d(parcel2, bundleD1);
                return true;
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                parcel.readString();
                ng.f(parcel);
                N();
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                f3 f3Var = (f3) ng.b(parcel, f3.CREATOR);
                ng.f(parcel);
                A2(f3Var);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    shVar = iInterfaceQueryLocalInterface10 instanceof vh ? (vh) iInterfaceQueryLocalInterface10 : new sh(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 1);
                }
                ng.f(parcel);
                t1(shVar);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                x1 x1VarN1 = N1();
                parcel2.writeNoException();
                ng.e(parcel2, x1VarN1);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    q1Var = iInterfaceQueryLocalInterface11 instanceof r1 ? (r1) iInterfaceQueryLocalInterface11 : new q1(strongBinder11);
                }
                ng.f(parcel);
                d1(q1Var);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                z2 z2Var2 = (z2) ng.b(parcel, z2.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zVar = iInterfaceQueryLocalInterface12 instanceof b0 ? (b0) iInterfaceQueryLocalInterface12 : new z(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 1);
                }
                ng.f(parcel);
                Z3(z2Var2, zVar);
                parcel2.writeNoException();
                return true;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                j3(aVarR0);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    z0Var = iInterfaceQueryLocalInterface13 instanceof a1 ? (a1) iInterfaceQueryLocalInterface13 : new z0(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 1);
                }
                ng.f(parcel);
                F0(z0Var);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zU = u();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ng.f14287a;
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 47:
                long jM = M();
                parcel2.writeNoException();
                parcel2.writeLong(jM);
                return true;
            case 48:
                long j = parcel.readLong();
                ng.f(parcel);
                D0(j);
                parcel2.writeNoException();
                return true;
        }
    }
}
