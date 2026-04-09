package q2;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: q2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2819g0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23222a;

    public /* synthetic */ C2819g0(int i) {
        this.f23222a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f23222a) {
            case 0:
                int iO = T2.g.O(parcel);
                String strJ = null;
                String strJ2 = null;
                while (parcel.dataPosition() < iO) {
                    int i = parcel.readInt();
                    char c6 = (char) i;
                    if (c6 == 1) {
                        strJ = T2.g.j(parcel, i);
                    } else if (c6 != 2) {
                        T2.g.L(parcel, i);
                    } else {
                        strJ2 = T2.g.j(parcel, i);
                    }
                }
                T2.g.n(parcel, iO);
                return new O(strJ, strJ2);
            case 1:
                int iO2 = T2.g.O(parcel);
                int iH = 0;
                while (parcel.dataPosition() < iO2) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 2) {
                        T2.g.L(parcel, i3);
                    } else {
                        iH = T2.g.H(parcel, i3);
                    }
                }
                T2.g.n(parcel, iO2);
                return new D0(iH);
            case 2:
                int iO3 = T2.g.O(parcel);
                String strJ3 = null;
                String strJ4 = null;
                C2852x0 c2852x0 = null;
                IBinder iBinderF = null;
                int iH2 = 0;
                while (parcel.dataPosition() < iO3) {
                    int i6 = parcel.readInt();
                    char c7 = (char) i6;
                    if (c7 == 1) {
                        iH2 = T2.g.H(parcel, i6);
                    } else if (c7 == 2) {
                        strJ3 = T2.g.j(parcel, i6);
                    } else if (c7 == 3) {
                        strJ4 = T2.g.j(parcel, i6);
                    } else if (c7 == 4) {
                        c2852x0 = (C2852x0) T2.g.i(parcel, i6, C2852x0.CREATOR);
                    } else if (c7 != 5) {
                        T2.g.L(parcel, i6);
                    } else {
                        iBinderF = T2.g.F(parcel, i6);
                    }
                }
                T2.g.n(parcel, iO3);
                return new C2852x0(iH2, strJ3, strJ4, c2852x0, iBinderF);
            case 3:
                int iO4 = T2.g.O(parcel);
                String strJ5 = null;
                int iH3 = 0;
                int iH4 = 0;
                while (parcel.dataPosition() < iO4) {
                    int i7 = parcel.readInt();
                    char c8 = (char) i7;
                    if (c8 == 1) {
                        iH3 = T2.g.H(parcel, i7);
                    } else if (c8 == 2) {
                        iH4 = T2.g.H(parcel, i7);
                    } else if (c8 != 3) {
                        T2.g.L(parcel, i7);
                    } else {
                        strJ5 = T2.g.j(parcel, i7);
                    }
                }
                T2.g.n(parcel, iO4);
                return new L0(iH3, iH4, strJ5);
            case 4:
                int iO5 = T2.g.O(parcel);
                int iH5 = 0;
                String strJ6 = null;
                a1 a1Var = null;
                int iH6 = 0;
                while (parcel.dataPosition() < iO5) {
                    int i8 = parcel.readInt();
                    char c9 = (char) i8;
                    if (c9 == 1) {
                        strJ6 = T2.g.j(parcel, i8);
                    } else if (c9 == 2) {
                        iH5 = T2.g.H(parcel, i8);
                    } else if (c9 == 3) {
                        a1Var = (a1) T2.g.i(parcel, i8, a1.CREATOR);
                    } else if (c9 != 4) {
                        T2.g.L(parcel, i8);
                    } else {
                        iH6 = T2.g.H(parcel, i8);
                    }
                }
                T2.g.n(parcel, iO5);
                return new U0(strJ6, iH5, a1Var, iH6);
            case 5:
                int iO6 = T2.g.O(parcel);
                int iH7 = 0;
                int iH8 = 0;
                while (parcel.dataPosition() < iO6) {
                    int i9 = parcel.readInt();
                    char c10 = (char) i9;
                    if (c10 == 1) {
                        iH7 = T2.g.H(parcel, i9);
                    } else if (c10 != 2) {
                        T2.g.L(parcel, i9);
                    } else {
                        iH8 = T2.g.H(parcel, i9);
                    }
                }
                T2.g.n(parcel, iO6);
                return new V0(iH7, iH8);
            case 6:
                int iO7 = T2.g.O(parcel);
                String strJ7 = null;
                while (parcel.dataPosition() < iO7) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 15) {
                        T2.g.L(parcel, i10);
                    } else {
                        strJ7 = T2.g.j(parcel, i10);
                    }
                }
                T2.g.n(parcel, iO7);
                return new W0(strJ7);
            case 7:
                int iO8 = T2.g.O(parcel);
                boolean zD = false;
                boolean zD2 = false;
                boolean zD3 = false;
                while (parcel.dataPosition() < iO8) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 2) {
                        zD = T2.g.D(parcel, i11);
                    } else if (c11 == 3) {
                        zD2 = T2.g.D(parcel, i11);
                    } else if (c11 != 4) {
                        T2.g.L(parcel, i11);
                    } else {
                        zD3 = T2.g.D(parcel, i11);
                    }
                }
                T2.g.n(parcel, iO8);
                return new Y0(zD, zD2, zD3);
            case 8:
                int iO9 = T2.g.O(parcel);
                long jI = 0;
                long jI2 = 0;
                long jI3 = 0;
                int iH9 = 0;
                int iH10 = 0;
                boolean zD4 = false;
                int iH11 = 0;
                boolean zD5 = false;
                boolean zD6 = false;
                int iH12 = 0;
                int iH13 = 0;
                int iH14 = 0;
                Bundle bundleG = null;
                ArrayList arrayListL = null;
                String strJ8 = null;
                W0 w02 = null;
                Location location = null;
                String strJ9 = null;
                Bundle bundleG2 = null;
                Bundle bundleG3 = null;
                ArrayList arrayListL2 = null;
                String strJ10 = null;
                String strJ11 = null;
                O o5 = null;
                String strJ12 = null;
                ArrayList arrayListL3 = null;
                String strJ13 = null;
                while (parcel.dataPosition() < iO9) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iH9 = T2.g.H(parcel, i12);
                            break;
                        case 2:
                            jI = T2.g.I(parcel, i12);
                            break;
                        case 3:
                            bundleG = T2.g.g(parcel, i12);
                            break;
                        case 4:
                            iH10 = T2.g.H(parcel, i12);
                            break;
                        case 5:
                            arrayListL = T2.g.l(parcel, i12);
                            break;
                        case 6:
                            zD4 = T2.g.D(parcel, i12);
                            break;
                        case 7:
                            iH11 = T2.g.H(parcel, i12);
                            break;
                        case '\b':
                            zD5 = T2.g.D(parcel, i12);
                            break;
                        case '\t':
                            strJ8 = T2.g.j(parcel, i12);
                            break;
                        case '\n':
                            w02 = (W0) T2.g.i(parcel, i12, W0.CREATOR);
                            break;
                        case 11:
                            location = (Location) T2.g.i(parcel, i12, Location.CREATOR);
                            break;
                        case '\f':
                            strJ9 = T2.g.j(parcel, i12);
                            break;
                        case '\r':
                            bundleG2 = T2.g.g(parcel, i12);
                            break;
                        case 14:
                            bundleG3 = T2.g.g(parcel, i12);
                            break;
                        case 15:
                            arrayListL2 = T2.g.l(parcel, i12);
                            break;
                        case 16:
                            strJ10 = T2.g.j(parcel, i12);
                            break;
                        case 17:
                            strJ11 = T2.g.j(parcel, i12);
                            break;
                        case 18:
                            zD6 = T2.g.D(parcel, i12);
                            break;
                        case 19:
                            o5 = (O) T2.g.i(parcel, i12, O.CREATOR);
                            break;
                        case 20:
                            iH12 = T2.g.H(parcel, i12);
                            break;
                        case 21:
                            strJ12 = T2.g.j(parcel, i12);
                            break;
                        case 22:
                            arrayListL3 = T2.g.l(parcel, i12);
                            break;
                        case 23:
                            iH13 = T2.g.H(parcel, i12);
                            break;
                        case 24:
                            strJ13 = T2.g.j(parcel, i12);
                            break;
                        case 25:
                            iH14 = T2.g.H(parcel, i12);
                            break;
                        case 26:
                            jI2 = T2.g.I(parcel, i12);
                            break;
                        case 27:
                            jI3 = T2.g.I(parcel, i12);
                            break;
                        default:
                            T2.g.L(parcel, i12);
                            break;
                    }
                }
                T2.g.n(parcel, iO9);
                return new a1(iH9, jI, bundleG, iH10, arrayListL, zD4, iH11, zD5, strJ8, w02, location, strJ9, bundleG2, bundleG3, arrayListL2, strJ10, strJ11, zD6, o5, iH12, strJ12, arrayListL3, iH13, strJ13, iH14, jI2, jI3);
            case 9:
                int iO10 = T2.g.O(parcel);
                int iH15 = 0;
                int iH16 = 0;
                boolean zD7 = false;
                int iH17 = 0;
                int iH18 = 0;
                boolean zD8 = false;
                boolean zD9 = false;
                boolean zD10 = false;
                boolean zD11 = false;
                boolean zD12 = false;
                boolean zD13 = false;
                boolean zD14 = false;
                boolean zD15 = false;
                String strJ14 = null;
                d1[] d1VarArr = null;
                while (parcel.dataPosition() < iO10) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strJ14 = T2.g.j(parcel, i13);
                            break;
                        case 3:
                            iH15 = T2.g.H(parcel, i13);
                            break;
                        case 4:
                            iH16 = T2.g.H(parcel, i13);
                            break;
                        case 5:
                            zD7 = T2.g.D(parcel, i13);
                            break;
                        case 6:
                            iH17 = T2.g.H(parcel, i13);
                            break;
                        case 7:
                            iH18 = T2.g.H(parcel, i13);
                            break;
                        case '\b':
                            d1VarArr = (d1[]) T2.g.m(parcel, i13, d1.CREATOR);
                            break;
                        case '\t':
                            zD8 = T2.g.D(parcel, i13);
                            break;
                        case '\n':
                            zD9 = T2.g.D(parcel, i13);
                            break;
                        case 11:
                            zD10 = T2.g.D(parcel, i13);
                            break;
                        case '\f':
                            zD11 = T2.g.D(parcel, i13);
                            break;
                        case '\r':
                            zD12 = T2.g.D(parcel, i13);
                            break;
                        case 14:
                            zD13 = T2.g.D(parcel, i13);
                            break;
                        case 15:
                            zD14 = T2.g.D(parcel, i13);
                            break;
                        case 16:
                            zD15 = T2.g.D(parcel, i13);
                            break;
                        default:
                            T2.g.L(parcel, i13);
                            break;
                    }
                }
                T2.g.n(parcel, iO10);
                return new d1(strJ14, iH15, iH16, zD7, iH17, iH18, d1VarArr, zD8, zD9, zD10, zD11, zD12, zD13, zD14, zD15);
            case 10:
                int iO11 = T2.g.O(parcel);
                long jI4 = 0;
                String strJ15 = null;
                int iH19 = 0;
                int iH20 = 0;
                while (parcel.dataPosition() < iO11) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iH19 = T2.g.H(parcel, i14);
                    } else if (c12 == 2) {
                        iH20 = T2.g.H(parcel, i14);
                    } else if (c12 == 3) {
                        strJ15 = T2.g.j(parcel, i14);
                    } else if (c12 != 4) {
                        T2.g.L(parcel, i14);
                    } else {
                        jI4 = T2.g.I(parcel, i14);
                    }
                }
                T2.g.n(parcel, iO11);
                return new e1(iH19, jI4, iH20, strJ15);
            case 11:
                int iO12 = T2.g.O(parcel);
                String strJ16 = null;
                C2852x0 c2852x02 = null;
                Bundle bundleG4 = null;
                String strJ17 = null;
                String strJ18 = null;
                String strJ19 = null;
                String strJ20 = null;
                long jI5 = 0;
                while (parcel.dataPosition() < iO12) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strJ16 = T2.g.j(parcel, i15);
                            break;
                        case 2:
                            jI5 = T2.g.I(parcel, i15);
                            break;
                        case 3:
                            c2852x02 = (C2852x0) T2.g.i(parcel, i15, C2852x0.CREATOR);
                            break;
                        case 4:
                            bundleG4 = T2.g.g(parcel, i15);
                            break;
                        case 5:
                            strJ17 = T2.g.j(parcel, i15);
                            break;
                        case 6:
                            strJ18 = T2.g.j(parcel, i15);
                            break;
                        case 7:
                            strJ19 = T2.g.j(parcel, i15);
                            break;
                        case '\b':
                            strJ20 = T2.g.j(parcel, i15);
                            break;
                        default:
                            T2.g.L(parcel, i15);
                            break;
                    }
                }
                T2.g.n(parcel, iO12);
                return new f1(strJ16, jI5, c2852x02, bundleG4, strJ17, strJ18, strJ19, strJ20);
            default:
                int iO13 = T2.g.O(parcel);
                int iH21 = 0;
                while (parcel.dataPosition() < iO13) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 2) {
                        T2.g.L(parcel, i16);
                    } else {
                        iH21 = T2.g.H(parcel, i16);
                    }
                }
                T2.g.n(parcel, iO13);
                return new g1(iH21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f23222a) {
            case 0:
                return new O[i];
            case 1:
                return new D0[i];
            case 2:
                return new C2852x0[i];
            case 3:
                return new L0[i];
            case 4:
                return new U0[i];
            case 5:
                return new V0[i];
            case 6:
                return new W0[i];
            case 7:
                return new Y0[i];
            case 8:
                return new a1[i];
            case 9:
                return new d1[i];
            case 10:
                return new e1[i];
            case 11:
                return new f1[i];
            default:
                return new g1[i];
        }
    }
}
