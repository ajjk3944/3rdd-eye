package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ra2 extends hv1 implements sa2 {
    public ra2() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                W1(u10VarX0);
                break;
            case 2:
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                iv1.f(parcel);
                d0(u10VarX02, i2);
                break;
            case 3:
                u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                M(u10VarX03);
                break;
            case 4:
                u10 u10VarX04 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                R(u10VarX04);
                break;
            case 5:
                u10 u10VarX05 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                z0(u10VarX05);
                break;
            case 6:
                u10 u10VarX06 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                o1(u10VarX06);
                break;
            case 7:
                u10 u10VarX07 = oi0.X0(parcel.readStrongBinder());
                ta2 ta2Var = (ta2) iv1.b(parcel, ta2.CREATOR);
                iv1.f(parcel);
                r0(u10VarX07, ta2Var);
                break;
            case 8:
                u10 u10VarX08 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                L2(u10VarX08);
                break;
            case 9:
                u10 u10VarX09 = oi0.X0(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                iv1.f(parcel);
                s3(u10VarX09, i3);
                break;
            case 10:
                u10 u10VarX010 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                D(u10VarX010);
                break;
            case 11:
                u10 u10VarX011 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                k2(u10VarX011);
                break;
            case 12:
                iv1.f(parcel);
                break;
            case 13:
                u10 u10VarX012 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                a3(u10VarX012);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
