package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class bv extends mg implements cv {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9811a = 0;

    public bv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        jv hvVar = null;
        jv hvVar2 = null;
        va.p1 p1Var = null;
        kv kvVar = null;
        fv dvVar = null;
        switch (i4) {
            case 1:
                va.z2 z2Var = (va.z2) ng.b(parcel, va.z2.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    hvVar = iInterfaceQueryLocalInterface instanceof jv ? (jv) iInterfaceQueryLocalInterface : new hv(strongBinder);
                }
                ng.f(parcel);
                v2(z2Var, hvVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    dvVar = iInterfaceQueryLocalInterface2 instanceof fv ? (fv) iInterfaceQueryLocalInterface2 : new dv(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 1);
                }
                ng.f(parcel);
                Y2(dvVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zC1 = C1();
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeInt(zC1 ? 1 : 0);
                return true;
            case 4:
                String strA1 = A1();
                parcel2.writeNoException();
                parcel2.writeString(strA1);
                return true;
            case 5:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                I2(aVarR0);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    kvVar = iInterfaceQueryLocalInterface3 instanceof kv ? (kv) iInterfaceQueryLocalInterface3 : new kv(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 1);
                }
                ng.f(parcel);
                Y1(kvVar);
                parcel2.writeNoException();
                return true;
            case 7:
                nv nvVar = (nv) ng.b(parcel, nv.CREATOR);
                ng.f(parcel);
                w0(nvVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    p1Var = iInterfaceQueryLocalInterface4 instanceof va.p1 ? (va.p1) iInterfaceQueryLocalInterface4 : new va.p1(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 1);
                }
                ng.f(parcel);
                Y0(p1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleE = e();
                parcel2.writeNoException();
                ng.d(parcel2, bundleE);
                return true;
            case 10:
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                ClassLoader classLoader2 = ng.f14287a;
                boolean z3 = parcel.readInt() != 0;
                ng.f(parcel);
                l1(aVarR02, z3);
                parcel2.writeNoException();
                return true;
            case 11:
                zu zuVarB1 = B1();
                parcel2.writeNoException();
                ng.e(parcel2, zuVarB1);
                return true;
            case 12:
                va.x1 x1VarF1 = F1();
                parcel2.writeNoException();
                ng.e(parcel2, x1VarF1);
                return true;
            case 13:
                va.r1 r1VarH4 = va.s2.h4(parcel.readStrongBinder());
                ng.f(parcel);
                M2(r1VarH4);
                parcel2.writeNoException();
                return true;
            case 14:
                va.z2 z2Var2 = (va.z2) ng.b(parcel, va.z2.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    hvVar2 = iInterfaceQueryLocalInterface5 instanceof jv ? (jv) iInterfaceQueryLocalInterface5 : new hv(strongBinder5);
                }
                ng.f(parcel);
                V2(z2Var2, hvVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zA = ng.a(parcel);
                ng.f(parcel);
                c4(zA);
                parcel2.writeNoException();
                return true;
            case 16:
                String strG1 = G1();
                parcel2.writeNoException();
                parcel2.writeString(strG1);
                return true;
            case 17:
                long jE1 = E1();
                parcel2.writeNoException();
                parcel2.writeLong(jE1);
                return true;
            case 18:
                long j = parcel.readLong();
                ng.f(parcel);
                T2(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
