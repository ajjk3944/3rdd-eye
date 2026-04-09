package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class er extends mg implements fr {
    public er() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static fr h4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof fr ? (fr) iInterfaceQueryLocalInterface : new dr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        zu yuVar = null;
        switch (i4) {
            case 1:
                c();
                break;
            case 2:
                d();
                break;
            case 3:
                int i10 = parcel.readInt();
                ng.f(parcel);
                P1(i10);
                break;
            case 4:
                z1();
                break;
            case 5:
                C1();
                break;
            case 6:
                A1();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof hr) {
                        d.h.C(iInterfaceQueryLocalInterface);
                        throw null;
                    }
                }
                ng.f(parcel);
                break;
            case 8:
                D1();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                ng.f(parcel);
                B3(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (iInterfaceQueryLocalInterface2 instanceof jn) {
                    }
                }
                parcel.readString();
                ng.f(parcel);
                break;
            case 11:
                K();
                break;
            case 12:
                parcel.readString();
                ng.f(parcel);
                break;
            case 13:
                H1();
                break;
            case 14:
                xu xuVar = (xu) ng.b(parcel, xu.CREATOR);
                ng.f(parcel);
                a1(xuVar);
                break;
            case 15:
                l();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    yuVar = iInterfaceQueryLocalInterface3 instanceof zu ? (zu) iInterfaceQueryLocalInterface3 : new yu(strongBinder3);
                }
                ng.f(parcel);
                Z1(yuVar);
                break;
            case 17:
                int i11 = parcel.readInt();
                ng.f(parcel);
                F(i11);
                break;
            case 18:
                E2();
                break;
            case 19:
                ng.f(parcel);
                break;
            case 20:
                G();
                break;
            case 21:
                String string3 = parcel.readString();
                ng.f(parcel);
                H(string3);
                break;
            case 22:
                int i12 = parcel.readInt();
                String string4 = parcel.readString();
                ng.f(parcel);
                a4(i12, string4);
                break;
            case 23:
                va.w1 w1Var = (va.w1) ng.b(parcel, va.w1.CREATOR);
                ng.f(parcel);
                I3(w1Var);
                break;
            case 24:
                va.w1 w1Var2 = (va.w1) ng.b(parcel, va.w1.CREATOR);
                ng.f(parcel);
                c1(w1Var2);
                break;
            case 25:
                C();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
