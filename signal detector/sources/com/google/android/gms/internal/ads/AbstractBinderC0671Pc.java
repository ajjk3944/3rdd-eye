package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0671Pc extends B7 implements InterfaceC0688Qc {
    public AbstractBinderC0671Pc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC0688Qc K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0688Qc ? (InterfaceC0688Qc) iInterfaceQueryLocalInterface : new C0654Oc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0554Ie c0537He;
        switch (i) {
            case 1:
                b();
                break;
            case 2:
                d();
                break;
            case 3:
                int i3 = parcel.readInt();
                C7.f(parcel);
                o0(i3);
                break;
            case 4:
                g();
                break;
            case 5:
                j();
                break;
            case 6:
                h();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof AbstractC0722Sc) {
                        A.f.s(iInterfaceQueryLocalInterface);
                    }
                }
                C7.f(parcel);
                break;
            case 8:
                k();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                C7.f(parcel);
                f3(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (iInterfaceQueryLocalInterface2 instanceof InterfaceC0839Za) {
                    }
                }
                parcel.readString();
                C7.f(parcel);
                break;
            case 11:
                Z();
                break;
            case 12:
                parcel.readString();
                C7.f(parcel);
                break;
            case 13:
                p();
                break;
            case 14:
                C0520Ge c0520Ge = (C0520Ge) C7.b(parcel, C0520Ge.CREATOR);
                C7.f(parcel);
                m1(c0520Ge);
                break;
            case 15:
                y();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    c0537He = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c0537He = iInterfaceQueryLocalInterface3 instanceof InterfaceC0554Ie ? (InterfaceC0554Ie) iInterfaceQueryLocalInterface3 : new C0537He(strongBinder3);
                }
                C7.f(parcel);
                I1(c0537He);
                break;
            case 17:
                int i6 = parcel.readInt();
                C7.f(parcel);
                U(i6);
                break;
            case 18:
                k2();
                break;
            case 19:
                C7.f(parcel);
                break;
            case 20:
                W();
                break;
            case 21:
                String string3 = parcel.readString();
                C7.f(parcel);
                X(string3);
                break;
            case 22:
                int i7 = parcel.readInt();
                String string4 = parcel.readString();
                C7.f(parcel);
                D3(i7, string4);
                break;
            case 23:
                C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
                C7.f(parcel);
                d3(c2852x0);
                break;
            case 24:
                C2852x0 c2852x02 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
                C7.f(parcel);
                Z0(c2852x02);
                break;
            case 25:
                T();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
