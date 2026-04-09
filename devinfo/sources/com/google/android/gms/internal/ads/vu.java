package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class vu extends mg implements wu {
    public vu() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 1:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                Z(aVarR0);
                break;
            case 2:
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                ng.f(parcel);
                b0(aVarR02, i10);
                break;
            case 3:
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                o(aVarR03);
                break;
            case 4:
                vb.a aVarR04 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                E(aVarR04);
                break;
            case 5:
                vb.a aVarR05 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                V1(aVarR05);
                break;
            case 6:
                vb.a aVarR06 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                y2(aVarR06);
                break;
            case 7:
                vb.a aVarR07 = vb.b.r0(parcel.readStrongBinder());
                xu xuVar = (xu) ng.b(parcel, xu.CREATOR);
                ng.f(parcel);
                o2(aVarR07, xuVar);
                break;
            case 8:
                vb.a aVarR08 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                t3(aVarR08);
                break;
            case 9:
                vb.a aVarR09 = vb.b.r0(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                ng.f(parcel);
                L2(aVarR09, i11);
                break;
            case 10:
                vb.a aVarR010 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                v(aVarR010);
                break;
            case 11:
                vb.a aVarR011 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                q0(aVarR011);
                break;
            case 12:
                ng.f(parcel);
                break;
            case 13:
                vb.a aVarR012 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                T0(aVarR012);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
