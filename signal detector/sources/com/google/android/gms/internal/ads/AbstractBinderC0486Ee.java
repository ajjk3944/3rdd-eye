package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0486Ee extends B7 implements InterfaceC0503Fe {
    public AbstractBinderC0486Ee() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                p0(aVarD1);
                break;
            case 2:
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                C7.f(parcel);
                n0(aVarD12, i3);
                break;
            case 3:
                S2.a aVarD13 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                D(aVarD13);
                break;
            case 4:
                S2.a aVarD14 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                Q(aVarD14);
                break;
            case 5:
                S2.a aVarD15 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                X1(aVarD15);
                break;
            case 6:
                S2.a aVarD16 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                y1(aVarD16);
                break;
            case 7:
                S2.a aVarD17 = S2.b.d1(parcel.readStrongBinder());
                C0520Ge c0520Ge = (C0520Ge) C7.b(parcel, C0520Ge.CREATOR);
                C7.f(parcel);
                T1(aVarD17, c0520Ge);
                break;
            case 8:
                S2.a aVarD18 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                p2(aVarD18);
                break;
            case 9:
                S2.a aVarD19 = S2.b.d1(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                C7.f(parcel);
                u3(aVarD19, i6);
                break;
            case 10:
                S2.a aVarD110 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                L(aVarD110);
                break;
            case 11:
                S2.a aVarD111 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                b3(aVarD111);
                break;
            case 12:
                C7.f(parcel);
                break;
            case 13:
                S2.a aVarD112 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                W0(aVarD112);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
