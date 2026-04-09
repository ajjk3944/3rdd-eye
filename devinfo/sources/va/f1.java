package va;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36092a;

    public /* synthetic */ f1(int i4) {
        this.f36092a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f36092a) {
            case 0:
                int iT = com.bumptech.glide.e.T(parcel);
                String strW = null;
                String strW2 = null;
                while (parcel.dataPosition() < iT) {
                    int i4 = parcel.readInt();
                    char c9 = (char) i4;
                    if (c9 == 1) {
                        strW = com.bumptech.glide.e.w(parcel, i4);
                    } else if (c9 != 2) {
                        com.bumptech.glide.e.S(parcel, i4);
                    } else {
                        strW2 = com.bumptech.glide.e.w(parcel, i4);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT);
                return new o0(strW, strW2);
            case 1:
                int iT2 = com.bumptech.glide.e.T(parcel);
                int iN = 0;
                while (parcel.dataPosition() < iT2) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 2) {
                        com.bumptech.glide.e.S(parcel, i10);
                    } else {
                        iN = com.bumptech.glide.e.N(parcel, i10);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT2);
                return new c2(iN);
            case 2:
                int iT3 = com.bumptech.glide.e.T(parcel);
                String strW3 = null;
                String strW4 = null;
                w1 w1Var = null;
                IBinder iBinderM = null;
                int iN2 = 0;
                while (parcel.dataPosition() < iT3) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iN2 = com.bumptech.glide.e.N(parcel, i11);
                    } else if (c10 == 2) {
                        strW3 = com.bumptech.glide.e.w(parcel, i11);
                    } else if (c10 == 3) {
                        strW4 = com.bumptech.glide.e.w(parcel, i11);
                    } else if (c10 == 4) {
                        w1Var = (w1) com.bumptech.glide.e.v(parcel, i11, w1.CREATOR);
                    } else if (c10 != 5) {
                        com.bumptech.glide.e.S(parcel, i11);
                    } else {
                        iBinderM = com.bumptech.glide.e.M(parcel, i11);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT3);
                return new w1(iN2, strW3, strW4, w1Var, iBinderM);
            case 3:
                int iT4 = com.bumptech.glide.e.T(parcel);
                String strW5 = null;
                int iN3 = 0;
                int iN4 = 0;
                while (parcel.dataPosition() < iT4) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        iN3 = com.bumptech.glide.e.N(parcel, i12);
                    } else if (c11 == 2) {
                        iN4 = com.bumptech.glide.e.N(parcel, i12);
                    } else if (c11 != 3) {
                        com.bumptech.glide.e.S(parcel, i12);
                    } else {
                        strW5 = com.bumptech.glide.e.w(parcel, i12);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT4);
                return new l2(iN3, iN4, strW5);
            case 4:
                int iT5 = com.bumptech.glide.e.T(parcel);
                int iN5 = 0;
                String strW6 = null;
                z2 z2Var = null;
                int iN6 = 0;
                while (parcel.dataPosition() < iT5) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 1) {
                        strW6 = com.bumptech.glide.e.w(parcel, i13);
                    } else if (c12 == 2) {
                        iN5 = com.bumptech.glide.e.N(parcel, i13);
                    } else if (c12 == 3) {
                        z2Var = (z2) com.bumptech.glide.e.v(parcel, i13, z2.CREATOR);
                    } else if (c12 != 4) {
                        com.bumptech.glide.e.S(parcel, i13);
                    } else {
                        iN6 = com.bumptech.glide.e.N(parcel, i13);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT5);
                return new t2(strW6, iN5, z2Var, iN6);
            case 5:
                int iT6 = com.bumptech.glide.e.T(parcel);
                int iN7 = 0;
                int iN8 = 0;
                while (parcel.dataPosition() < iT6) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        iN7 = com.bumptech.glide.e.N(parcel, i14);
                    } else if (c13 != 2) {
                        com.bumptech.glide.e.S(parcel, i14);
                    } else {
                        iN8 = com.bumptech.glide.e.N(parcel, i14);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT6);
                return new u2(iN7, iN8);
            case 6:
                int iT7 = com.bumptech.glide.e.T(parcel);
                String strW7 = null;
                while (parcel.dataPosition() < iT7) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 15) {
                        com.bumptech.glide.e.S(parcel, i15);
                    } else {
                        strW7 = com.bumptech.glide.e.w(parcel, i15);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT7);
                return new v2(strW7);
            case 7:
                int iT8 = com.bumptech.glide.e.T(parcel);
                boolean zL = false;
                boolean zL2 = false;
                boolean zL3 = false;
                while (parcel.dataPosition() < iT8) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 2) {
                        zL = com.bumptech.glide.e.L(parcel, i16);
                    } else if (c14 == 3) {
                        zL2 = com.bumptech.glide.e.L(parcel, i16);
                    } else if (c14 != 4) {
                        com.bumptech.glide.e.S(parcel, i16);
                    } else {
                        zL3 = com.bumptech.glide.e.L(parcel, i16);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT8);
                return new x2(zL, zL2, zL3);
            case 8:
                int iT9 = com.bumptech.glide.e.T(parcel);
                long jO = 0;
                long jO2 = 0;
                long jO3 = 0;
                int iN9 = 0;
                int iN10 = 0;
                boolean zL4 = false;
                int iN11 = 0;
                boolean zL5 = false;
                boolean zL6 = false;
                int iN12 = 0;
                int iN13 = 0;
                int iN14 = 0;
                Bundle bundleS = null;
                ArrayList arrayListY = null;
                String strW8 = null;
                v2 v2Var = null;
                Location location = null;
                String strW9 = null;
                Bundle bundleS2 = null;
                Bundle bundleS3 = null;
                ArrayList arrayListY2 = null;
                String strW10 = null;
                String strW11 = null;
                o0 o0Var = null;
                String strW12 = null;
                ArrayList arrayListY3 = null;
                String strW13 = null;
                while (parcel.dataPosition() < iT9) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iN9 = com.bumptech.glide.e.N(parcel, i17);
                            break;
                        case 2:
                            jO = com.bumptech.glide.e.O(parcel, i17);
                            break;
                        case 3:
                            bundleS = com.bumptech.glide.e.s(parcel, i17);
                            break;
                        case 4:
                            iN10 = com.bumptech.glide.e.N(parcel, i17);
                            break;
                        case 5:
                            arrayListY = com.bumptech.glide.e.y(parcel, i17);
                            break;
                        case 6:
                            zL4 = com.bumptech.glide.e.L(parcel, i17);
                            break;
                        case 7:
                            iN11 = com.bumptech.glide.e.N(parcel, i17);
                            break;
                        case '\b':
                            zL5 = com.bumptech.glide.e.L(parcel, i17);
                            break;
                        case '\t':
                            strW8 = com.bumptech.glide.e.w(parcel, i17);
                            break;
                        case '\n':
                            v2Var = (v2) com.bumptech.glide.e.v(parcel, i17, v2.CREATOR);
                            break;
                        case 11:
                            location = (Location) com.bumptech.glide.e.v(parcel, i17, Location.CREATOR);
                            break;
                        case '\f':
                            strW9 = com.bumptech.glide.e.w(parcel, i17);
                            break;
                        case '\r':
                            bundleS2 = com.bumptech.glide.e.s(parcel, i17);
                            break;
                        case 14:
                            bundleS3 = com.bumptech.glide.e.s(parcel, i17);
                            break;
                        case 15:
                            arrayListY2 = com.bumptech.glide.e.y(parcel, i17);
                            break;
                        case 16:
                            strW10 = com.bumptech.glide.e.w(parcel, i17);
                            break;
                        case 17:
                            strW11 = com.bumptech.glide.e.w(parcel, i17);
                            break;
                        case 18:
                            zL6 = com.bumptech.glide.e.L(parcel, i17);
                            break;
                        case 19:
                            o0Var = (o0) com.bumptech.glide.e.v(parcel, i17, o0.CREATOR);
                            break;
                        case 20:
                            iN12 = com.bumptech.glide.e.N(parcel, i17);
                            break;
                        case 21:
                            strW12 = com.bumptech.glide.e.w(parcel, i17);
                            break;
                        case 22:
                            arrayListY3 = com.bumptech.glide.e.y(parcel, i17);
                            break;
                        case 23:
                            iN13 = com.bumptech.glide.e.N(parcel, i17);
                            break;
                        case 24:
                            strW13 = com.bumptech.glide.e.w(parcel, i17);
                            break;
                        case 25:
                            iN14 = com.bumptech.glide.e.N(parcel, i17);
                            break;
                        case 26:
                            jO2 = com.bumptech.glide.e.O(parcel, i17);
                            break;
                        case 27:
                            jO3 = com.bumptech.glide.e.O(parcel, i17);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i17);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT9);
                return new z2(iN9, jO, bundleS, iN10, arrayListY, zL4, iN11, zL5, strW8, v2Var, location, strW9, bundleS2, bundleS3, arrayListY2, strW10, strW11, zL6, o0Var, iN12, strW12, arrayListY3, iN13, strW13, iN14, jO2, jO3);
            case 9:
                int iT10 = com.bumptech.glide.e.T(parcel);
                int iN15 = 0;
                int iN16 = 0;
                boolean zL7 = false;
                int iN17 = 0;
                int iN18 = 0;
                boolean zL8 = false;
                boolean zL9 = false;
                boolean zL10 = false;
                boolean zL11 = false;
                boolean zL12 = false;
                boolean zL13 = false;
                boolean zL14 = false;
                boolean zL15 = false;
                String strW14 = null;
                c3[] c3VarArr = null;
                while (parcel.dataPosition() < iT10) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            strW14 = com.bumptech.glide.e.w(parcel, i18);
                            break;
                        case 3:
                            iN15 = com.bumptech.glide.e.N(parcel, i18);
                            break;
                        case 4:
                            iN16 = com.bumptech.glide.e.N(parcel, i18);
                            break;
                        case 5:
                            zL7 = com.bumptech.glide.e.L(parcel, i18);
                            break;
                        case 6:
                            iN17 = com.bumptech.glide.e.N(parcel, i18);
                            break;
                        case 7:
                            iN18 = com.bumptech.glide.e.N(parcel, i18);
                            break;
                        case '\b':
                            c3VarArr = (c3[]) com.bumptech.glide.e.z(parcel, i18, c3.CREATOR);
                            break;
                        case '\t':
                            zL8 = com.bumptech.glide.e.L(parcel, i18);
                            break;
                        case '\n':
                            zL9 = com.bumptech.glide.e.L(parcel, i18);
                            break;
                        case 11:
                            zL10 = com.bumptech.glide.e.L(parcel, i18);
                            break;
                        case '\f':
                            zL11 = com.bumptech.glide.e.L(parcel, i18);
                            break;
                        case '\r':
                            zL12 = com.bumptech.glide.e.L(parcel, i18);
                            break;
                        case 14:
                            zL13 = com.bumptech.glide.e.L(parcel, i18);
                            break;
                        case 15:
                            zL14 = com.bumptech.glide.e.L(parcel, i18);
                            break;
                        case 16:
                            zL15 = com.bumptech.glide.e.L(parcel, i18);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i18);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT10);
                return new c3(strW14, iN15, iN16, zL7, iN17, iN18, c3VarArr, zL8, zL9, zL10, zL11, zL12, zL13, zL14, zL15);
            case 10:
                int iT11 = com.bumptech.glide.e.T(parcel);
                long jO4 = 0;
                String strW15 = null;
                int iN19 = 0;
                int iN20 = 0;
                while (parcel.dataPosition() < iT11) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 1) {
                        iN19 = com.bumptech.glide.e.N(parcel, i19);
                    } else if (c15 == 2) {
                        iN20 = com.bumptech.glide.e.N(parcel, i19);
                    } else if (c15 == 3) {
                        strW15 = com.bumptech.glide.e.w(parcel, i19);
                    } else if (c15 != 4) {
                        com.bumptech.glide.e.S(parcel, i19);
                    } else {
                        jO4 = com.bumptech.glide.e.O(parcel, i19);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT11);
                return new d3(iN19, jO4, iN20, strW15);
            case 11:
                int iT12 = com.bumptech.glide.e.T(parcel);
                String strW16 = null;
                w1 w1Var2 = null;
                Bundle bundleS4 = null;
                String strW17 = null;
                String strW18 = null;
                String strW19 = null;
                String strW20 = null;
                long jO5 = 0;
                while (parcel.dataPosition() < iT12) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strW16 = com.bumptech.glide.e.w(parcel, i20);
                            break;
                        case 2:
                            jO5 = com.bumptech.glide.e.O(parcel, i20);
                            break;
                        case 3:
                            w1Var2 = (w1) com.bumptech.glide.e.v(parcel, i20, w1.CREATOR);
                            break;
                        case 4:
                            bundleS4 = com.bumptech.glide.e.s(parcel, i20);
                            break;
                        case 5:
                            strW17 = com.bumptech.glide.e.w(parcel, i20);
                            break;
                        case 6:
                            strW18 = com.bumptech.glide.e.w(parcel, i20);
                            break;
                        case 7:
                            strW19 = com.bumptech.glide.e.w(parcel, i20);
                            break;
                        case '\b':
                            strW20 = com.bumptech.glide.e.w(parcel, i20);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i20);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT12);
                return new e3(strW16, jO5, w1Var2, bundleS4, strW17, strW18, strW19, strW20);
            default:
                int iT13 = com.bumptech.glide.e.T(parcel);
                int iN21 = 0;
                while (parcel.dataPosition() < iT13) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        com.bumptech.glide.e.S(parcel, i21);
                    } else {
                        iN21 = com.bumptech.glide.e.N(parcel, i21);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT13);
                return new f3(iN21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.f36092a) {
            case 0:
                return new o0[i4];
            case 1:
                return new c2[i4];
            case 2:
                return new w1[i4];
            case 3:
                return new l2[i4];
            case 4:
                return new t2[i4];
            case 5:
                return new u2[i4];
            case 6:
                return new v2[i4];
            case 7:
                return new x2[i4];
            case 8:
                return new z2[i4];
            case 9:
                return new c3[i4];
            case 10:
                return new d3[i4];
            case 11:
                return new e3[i4];
            default:
                return new f3[i4];
        }
    }
}
