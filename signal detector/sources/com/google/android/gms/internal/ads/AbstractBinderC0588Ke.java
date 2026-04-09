package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C2839q0;
import q2.InterfaceC2842s0;
import q2.InterfaceC2854y0;

/* renamed from: com.google.android.gms.internal.ads.Ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0588Ke extends B7 implements InterfaceC0605Le {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9489a = 0;

    public AbstractBinderC0588Ke() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0724Se c0690Qe = null;
        InterfaceC0724Se c0690Qe2 = null;
        C2839q0 c2839q0 = null;
        C0741Te c0741Te = null;
        InterfaceC0656Oe c0622Me = null;
        switch (i) {
            case 1:
                q2.a1 a1Var = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c0690Qe = iInterfaceQueryLocalInterface instanceof InterfaceC0724Se ? (InterfaceC0724Se) iInterfaceQueryLocalInterface : new C0690Qe(strongBinder);
                }
                C7.f(parcel);
                C0(a1Var, c0690Qe);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    c0622Me = iInterfaceQueryLocalInterface2 instanceof InterfaceC0656Oe ? (InterfaceC0656Oe) iInterfaceQueryLocalInterface2 : new C0622Me(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 2);
                }
                C7.f(parcel);
                F2(c0622Me);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zJ = j();
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 4:
                String strH = h();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                return true;
            case 5:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                o1(aVarD1);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c0741Te = iInterfaceQueryLocalInterface3 instanceof C0741Te ? (C0741Te) iInterfaceQueryLocalInterface3 : new C0741Te(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 2);
                }
                C7.f(parcel);
                H1(c0741Te);
                parcel2.writeNoException();
                return true;
            case 7:
                C0792We c0792We = (C0792We) C7.b(parcel, C0792We.CREATOR);
                C7.f(parcel);
                M0(c0792We);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    c2839q0 = iInterfaceQueryLocalInterface4 instanceof C2839q0 ? (C2839q0) iInterfaceQueryLocalInterface4 : new C2839q0(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 2);
                }
                C7.f(parcel);
                W2(c2839q0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleE = e();
                parcel2.writeNoException();
                C7.d(parcel2, bundleE);
                return true;
            case 10:
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                ClassLoader classLoader2 = C7.f7544a;
                boolean z6 = parcel.readInt() != 0;
                C7.f(parcel);
                v0(aVarD12, z6);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC0554Ie interfaceC0554IeI = i();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0554IeI);
                return true;
            case 12:
                InterfaceC2854y0 interfaceC2854y0N = n();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC2854y0N);
                return true;
            case 13:
                InterfaceC2842s0 interfaceC2842s0K3 = q2.T0.K3(parcel.readStrongBinder());
                C7.f(parcel);
                K0(interfaceC2842s0K3);
                parcel2.writeNoException();
                return true;
            case 14:
                q2.a1 a1Var2 = (q2.a1) C7.b(parcel, q2.a1.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c0690Qe2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC0724Se ? (InterfaceC0724Se) iInterfaceQueryLocalInterface5 : new C0690Qe(strongBinder5);
                }
                C7.f(parcel);
                X0(a1Var2, c0690Qe2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zA = C7.a(parcel);
                C7.f(parcel);
                G3(zA);
                parcel2.writeNoException();
                return true;
            case 16:
                String strO = o();
                parcel2.writeNoException();
                parcel2.writeString(strO);
                return true;
            case 17:
                long jL = l();
                parcel2.writeNoException();
                parcel2.writeLong(jL);
                return true;
            case 18:
                long j6 = parcel.readLong();
                C7.f(parcel);
                x2(j6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
