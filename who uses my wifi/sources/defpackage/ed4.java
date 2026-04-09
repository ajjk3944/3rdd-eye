package defpackage;

import android.accounts.Account;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ed4 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ed4(int i) {
        this.a = i;
    }

    public static void a(xy xyVar, Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        int i2 = xyVar.f;
        uk2.T(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = xyVar.g;
        uk2.T(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = xyVar.h;
        uk2.T(parcel, 3, 4);
        parcel.writeInt(i4);
        uk2.D(parcel, 4, xyVar.i);
        uk2.B(parcel, 5, xyVar.j);
        uk2.G(parcel, 6, xyVar.k, i);
        uk2.z(parcel, 7, xyVar.l);
        uk2.C(parcel, 8, xyVar.m, i);
        uk2.G(parcel, 10, xyVar.n, i);
        uk2.G(parcel, 11, xyVar.o, i);
        boolean z = xyVar.p;
        uk2.T(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = xyVar.q;
        uk2.T(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = xyVar.r;
        uk2.T(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uk2.D(parcel, 15, xyVar.s);
        uk2.O(parcel, I);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iZ = gi2.z(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = xy.t;
                String strG = null;
                IBinder iBinderU = null;
                Account account = null;
                String strG2 = null;
                int iV = 0;
                int iV2 = 0;
                int iV3 = 0;
                boolean zT = false;
                int iV4 = 0;
                boolean zT2 = false;
                ju[] juVarArr = xy.u;
                ju[] juVarArr2 = juVarArr;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            iV = gi2.v(parcel, i);
                            break;
                        case 2:
                            iV2 = gi2.v(parcel, i);
                            break;
                        case 3:
                            iV3 = gi2.v(parcel, i);
                            break;
                        case 4:
                            strG = gi2.g(parcel, i);
                            break;
                        case 5:
                            iBinderU = gi2.u(parcel, i);
                            break;
                        case 6:
                            scopeArr = (Scope[]) gi2.j(parcel, i, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = gi2.d(parcel, i);
                            break;
                        case '\b':
                            account = (Account) gi2.f(parcel, i, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            gi2.y(parcel, i);
                            break;
                        case '\n':
                            juVarArr = (ju[]) gi2.j(parcel, i, ju.CREATOR);
                            break;
                        case 11:
                            juVarArr2 = (ju[]) gi2.j(parcel, i, ju.CREATOR);
                            break;
                        case '\f':
                            zT = gi2.t(parcel, i);
                            break;
                        case '\r':
                            iV4 = gi2.v(parcel, i);
                            break;
                        case 14:
                            zT2 = gi2.t(parcel, i);
                            break;
                        case 15:
                            strG2 = gi2.g(parcel, i);
                            break;
                    }
                }
                gi2.k(parcel, iZ);
                return new xy(iV, iV2, iV3, strG, iBinderU, scopeArr, bundle, account, juVarArr, juVarArr2, zT, iV4, zT2, strG2);
            case 1:
                return new ie4(parcel);
            case 2:
                int iZ2 = gi2.z(parcel);
                long jW = 0;
                long jW2 = 0;
                long jW3 = 0;
                int iV5 = 0;
                int iV6 = 0;
                boolean zT3 = false;
                int iV7 = 0;
                boolean zT4 = false;
                boolean zT5 = false;
                int iV8 = 0;
                int iV9 = 0;
                int iV10 = 0;
                Bundle bundleD = null;
                ArrayList arrayListI = null;
                String strG3 = null;
                qf3 qf3Var = null;
                Location location = null;
                String strG4 = null;
                Bundle bundleD2 = null;
                Bundle bundleD3 = null;
                ArrayList arrayListI2 = null;
                String strG5 = null;
                String strG6 = null;
                ec2 ec2Var = null;
                String strG7 = null;
                ArrayList arrayListI3 = null;
                String strG8 = null;
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iV5 = gi2.v(parcel, i2);
                            break;
                        case 2:
                            jW = gi2.w(parcel, i2);
                            break;
                        case 3:
                            bundleD = gi2.d(parcel, i2);
                            break;
                        case 4:
                            iV6 = gi2.v(parcel, i2);
                            break;
                        case 5:
                            arrayListI = gi2.i(parcel, i2);
                            break;
                        case 6:
                            zT3 = gi2.t(parcel, i2);
                            break;
                        case 7:
                            iV7 = gi2.v(parcel, i2);
                            break;
                        case '\b':
                            zT4 = gi2.t(parcel, i2);
                            break;
                        case '\t':
                            strG3 = gi2.g(parcel, i2);
                            break;
                        case '\n':
                            qf3Var = (qf3) gi2.f(parcel, i2, qf3.CREATOR);
                            break;
                        case 11:
                            location = (Location) gi2.f(parcel, i2, Location.CREATOR);
                            break;
                        case '\f':
                            strG4 = gi2.g(parcel, i2);
                            break;
                        case '\r':
                            bundleD2 = gi2.d(parcel, i2);
                            break;
                        case 14:
                            bundleD3 = gi2.d(parcel, i2);
                            break;
                        case 15:
                            arrayListI2 = gi2.i(parcel, i2);
                            break;
                        case 16:
                            strG5 = gi2.g(parcel, i2);
                            break;
                        case 17:
                            strG6 = gi2.g(parcel, i2);
                            break;
                        case 18:
                            zT5 = gi2.t(parcel, i2);
                            break;
                        case 19:
                            ec2Var = (ec2) gi2.f(parcel, i2, ec2.CREATOR);
                            break;
                        case 20:
                            iV8 = gi2.v(parcel, i2);
                            break;
                        case zy1.zzm /* 21 */:
                            strG7 = gi2.g(parcel, i2);
                            break;
                        case 22:
                            arrayListI3 = gi2.i(parcel, i2);
                            break;
                        case 23:
                            iV9 = gi2.v(parcel, i2);
                            break;
                        case 24:
                            strG8 = gi2.g(parcel, i2);
                            break;
                        case 25:
                            iV10 = gi2.v(parcel, i2);
                            break;
                        case 26:
                            jW2 = gi2.w(parcel, i2);
                            break;
                        case 27:
                            jW3 = gi2.w(parcel, i2);
                            break;
                        default:
                            gi2.y(parcel, i2);
                            break;
                    }
                }
                gi2.k(parcel, iZ2);
                return new pc4(iV5, jW, bundleD, iV6, arrayListI, zT3, iV7, zT4, strG3, qf3Var, location, strG4, bundleD2, bundleD3, arrayListI2, strG5, strG6, zT5, ec2Var, iV8, strG7, arrayListI3, iV9, strG8, iV10, jW2, jW3);
            case 3:
                int iZ3 = gi2.z(parcel);
                long jW4 = 0;
                boolean zT6 = false;
                int iV11 = 0;
                int iV12 = 0;
                boolean zT7 = false;
                fc2 fc2Var = null;
                IBinder iBinderU2 = null;
                IBinder iBinderU3 = null;
                IBinder iBinderU4 = null;
                IBinder iBinderU5 = null;
                String strG9 = null;
                String strG10 = null;
                IBinder iBinderU6 = null;
                String strG11 = null;
                e51 e51Var = null;
                String strG12 = null;
                zb4 zb4Var = null;
                IBinder iBinderU7 = null;
                String strG13 = null;
                String strG14 = null;
                String strG15 = null;
                IBinder iBinderU8 = null;
                IBinder iBinderU9 = null;
                IBinder iBinderU10 = null;
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            fc2Var = (fc2) gi2.f(parcel, i3, fc2.CREATOR);
                            break;
                        case 3:
                            iBinderU2 = gi2.u(parcel, i3);
                            break;
                        case 4:
                            iBinderU3 = gi2.u(parcel, i3);
                            break;
                        case 5:
                            iBinderU4 = gi2.u(parcel, i3);
                            break;
                        case 6:
                            iBinderU5 = gi2.u(parcel, i3);
                            break;
                        case 7:
                            strG9 = gi2.g(parcel, i3);
                            break;
                        case '\b':
                            zT6 = gi2.t(parcel, i3);
                            break;
                        case '\t':
                            strG10 = gi2.g(parcel, i3);
                            break;
                        case '\n':
                            iBinderU6 = gi2.u(parcel, i3);
                            break;
                        case 11:
                            iV11 = gi2.v(parcel, i3);
                            break;
                        case '\f':
                            iV12 = gi2.v(parcel, i3);
                            break;
                        case '\r':
                            strG11 = gi2.g(parcel, i3);
                            break;
                        case 14:
                            e51Var = (e51) gi2.f(parcel, i3, e51.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case zy1.zzm /* 21 */:
                        case 22:
                        case 23:
                        default:
                            gi2.y(parcel, i3);
                            break;
                        case 16:
                            strG12 = gi2.g(parcel, i3);
                            break;
                        case 17:
                            zb4Var = (zb4) gi2.f(parcel, i3, zb4.CREATOR);
                            break;
                        case 18:
                            iBinderU7 = gi2.u(parcel, i3);
                            break;
                        case 19:
                            strG13 = gi2.g(parcel, i3);
                            break;
                        case 24:
                            strG14 = gi2.g(parcel, i3);
                            break;
                        case 25:
                            strG15 = gi2.g(parcel, i3);
                            break;
                        case 26:
                            iBinderU8 = gi2.u(parcel, i3);
                            break;
                        case 27:
                            iBinderU9 = gi2.u(parcel, i3);
                            break;
                        case 28:
                            iBinderU10 = gi2.u(parcel, i3);
                            break;
                        case 29:
                            zT7 = gi2.t(parcel, i3);
                            break;
                        case 30:
                            jW4 = gi2.w(parcel, i3);
                            break;
                    }
                }
                gi2.k(parcel, iZ3);
                return new AdOverlayInfoParcel(fc2Var, iBinderU2, iBinderU3, iBinderU4, iBinderU5, strG9, zT6, strG10, iBinderU6, iV11, iV12, strG11, e51Var, strG12, zb4Var, iBinderU7, strG13, strG14, strG15, iBinderU8, iBinderU9, iBinderU10, zT7, jW4);
            case 4:
                return new vd4(parcel);
            case 5:
                int iZ4 = gi2.z(parcel);
                int iV13 = 0;
                int iV14 = 0;
                boolean zT8 = false;
                int iV15 = 0;
                int iV16 = 0;
                boolean zT9 = false;
                boolean zT10 = false;
                boolean zT11 = false;
                boolean zT12 = false;
                boolean zT13 = false;
                boolean zT14 = false;
                boolean zT15 = false;
                boolean zT16 = false;
                String strG16 = null;
                xe4[] xe4VarArr = null;
                while (parcel.dataPosition() < iZ4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strG16 = gi2.g(parcel, i4);
                            break;
                        case 3:
                            iV13 = gi2.v(parcel, i4);
                            break;
                        case 4:
                            iV14 = gi2.v(parcel, i4);
                            break;
                        case 5:
                            zT8 = gi2.t(parcel, i4);
                            break;
                        case 6:
                            iV15 = gi2.v(parcel, i4);
                            break;
                        case 7:
                            iV16 = gi2.v(parcel, i4);
                            break;
                        case '\b':
                            xe4VarArr = (xe4[]) gi2.j(parcel, i4, xe4.CREATOR);
                            break;
                        case '\t':
                            zT9 = gi2.t(parcel, i4);
                            break;
                        case '\n':
                            zT10 = gi2.t(parcel, i4);
                            break;
                        case 11:
                            zT11 = gi2.t(parcel, i4);
                            break;
                        case '\f':
                            zT12 = gi2.t(parcel, i4);
                            break;
                        case '\r':
                            zT13 = gi2.t(parcel, i4);
                            break;
                        case 14:
                            zT14 = gi2.t(parcel, i4);
                            break;
                        case 15:
                            zT15 = gi2.t(parcel, i4);
                            break;
                        case 16:
                            zT16 = gi2.t(parcel, i4);
                            break;
                        default:
                            gi2.y(parcel, i4);
                            break;
                    }
                }
                gi2.k(parcel, iZ4);
                return new xe4(strG16, iV13, iV14, zT8, iV15, iV16, xe4VarArr, zT9, zT10, zT11, zT12, zT13, zT14, zT15, zT16);
            case 6:
                int iZ5 = gi2.z(parcel);
                long jW5 = 0;
                String strG17 = null;
                int iV17 = 0;
                int iV18 = 0;
                while (parcel.dataPosition() < iZ5) {
                    int i5 = parcel.readInt();
                    char c = (char) i5;
                    if (c == 1) {
                        iV17 = gi2.v(parcel, i5);
                    } else if (c == 2) {
                        iV18 = gi2.v(parcel, i5);
                    } else if (c == 3) {
                        strG17 = gi2.g(parcel, i5);
                    } else if (c != 4) {
                        gi2.y(parcel, i5);
                    } else {
                        jW5 = gi2.w(parcel, i5);
                    }
                }
                gi2.k(parcel, iZ5);
                return new dg4(iV17, iV18, jW5, strG17);
            case 7:
                int iZ6 = gi2.z(parcel);
                String strG18 = null;
                nx2 nx2Var = null;
                Bundle bundleD4 = null;
                String strG19 = null;
                String strG20 = null;
                String strG21 = null;
                String strG22 = null;
                long jW6 = 0;
                while (parcel.dataPosition() < iZ6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            strG18 = gi2.g(parcel, i6);
                            break;
                        case 2:
                            jW6 = gi2.w(parcel, i6);
                            break;
                        case 3:
                            nx2Var = (nx2) gi2.f(parcel, i6, nx2.CREATOR);
                            break;
                        case 4:
                            bundleD4 = gi2.d(parcel, i6);
                            break;
                        case 5:
                            strG19 = gi2.g(parcel, i6);
                            break;
                        case 6:
                            strG20 = gi2.g(parcel, i6);
                            break;
                        case 7:
                            strG21 = gi2.g(parcel, i6);
                            break;
                        case '\b':
                            strG22 = gi2.g(parcel, i6);
                            break;
                        default:
                            gi2.y(parcel, i6);
                            break;
                    }
                }
                gi2.k(parcel, iZ6);
                return new qh4(strG18, jW6, nx2Var, bundleD4, strG19, strG20, strG21, strG22);
            case 8:
                int iZ7 = gi2.z(parcel);
                int iV19 = 0;
                int iV20 = 0;
                boolean zT17 = false;
                boolean zT18 = false;
                String strG23 = null;
                while (parcel.dataPosition() < iZ7) {
                    int i7 = parcel.readInt();
                    char c2 = (char) i7;
                    if (c2 == 2) {
                        strG23 = gi2.g(parcel, i7);
                    } else if (c2 == 3) {
                        iV19 = gi2.v(parcel, i7);
                    } else if (c2 == 4) {
                        iV20 = gi2.v(parcel, i7);
                    } else if (c2 == 5) {
                        zT17 = gi2.t(parcel, i7);
                    } else if (c2 != 6) {
                        gi2.y(parcel, i7);
                    } else {
                        zT18 = gi2.t(parcel, i7);
                    }
                }
                gi2.k(parcel, iZ7);
                return new e51(strG23, iV19, iV20, zT17, zT18);
            default:
                int iZ8 = gi2.z(parcel);
                int iV21 = 0;
                while (parcel.dataPosition() < iZ8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 2) {
                        gi2.y(parcel, i8);
                    } else {
                        iV21 = gi2.v(parcel, i8);
                    }
                }
                gi2.k(parcel, iZ8);
                return new vi4(iV21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new xy[i];
            case 1:
                return new ie4[i];
            case 2:
                return new pc4[i];
            case 3:
                return new AdOverlayInfoParcel[i];
            case 4:
                return new vd4[i];
            case 5:
                return new xe4[i];
            case 6:
                return new dg4[i];
            case 7:
                return new qh4[i];
            case 8:
                return new e51[i];
            default:
                return new vi4[i];
        }
    }
}
