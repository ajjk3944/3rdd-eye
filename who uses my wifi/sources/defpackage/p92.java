package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p92 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ p92(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iZ = gi2.z(parcel);
                IBinder iBinderU = null;
                IBinder iBinderU2 = null;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iBinderU = gi2.u(parcel, i);
                    } else if (c != 2) {
                        gi2.y(parcel, i);
                    } else {
                        iBinderU2 = gi2.u(parcel, i);
                    }
                }
                gi2.k(parcel, iZ);
                return new o92(iBinderU, iBinderU2);
            case 1:
                int iZ2 = gi2.z(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                long jW = 0;
                long jW2 = 0;
                int iV = 0;
                Bundle bundleD = null;
                pc4 pc4Var = null;
                xe4 xe4Var = null;
                String strG = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String strG2 = null;
                String strG3 = null;
                String strG4 = null;
                e51 e51Var = null;
                Bundle bundleD2 = null;
                int iV2 = 0;
                ArrayList arrayListI = null;
                Bundle bundleD3 = null;
                boolean zT = false;
                int iV3 = 0;
                int iV4 = 0;
                String strG5 = null;
                String strG6 = null;
                ArrayList arrayListI2 = null;
                String strG7 = null;
                r12 r12Var = null;
                ArrayList arrayListI3 = null;
                String strG8 = null;
                boolean zT2 = false;
                int iV5 = 0;
                int iV6 = 0;
                boolean zT3 = false;
                String strG9 = null;
                String strG10 = null;
                boolean zT4 = false;
                int iV7 = 0;
                Bundle bundleD4 = null;
                String strG11 = null;
                vz2 vz2Var = null;
                boolean zT5 = false;
                Bundle bundleD5 = null;
                String strG12 = null;
                String strG13 = null;
                String strG14 = null;
                boolean zT6 = false;
                ArrayList arrayList = null;
                String strG15 = null;
                ArrayList arrayListI4 = null;
                int iV8 = 0;
                boolean zT7 = false;
                boolean zT8 = false;
                boolean zT9 = false;
                ArrayList arrayListI5 = null;
                String strG16 = null;
                f52 f52Var = null;
                String strG17 = null;
                Bundle bundleD6 = null;
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iV = gi2.v(parcel, i2);
                            break;
                        case 2:
                            bundleD = gi2.d(parcel, i2);
                            break;
                        case 3:
                            pc4Var = (pc4) gi2.f(parcel, i2, pc4.CREATOR);
                            break;
                        case 4:
                            xe4Var = (xe4) gi2.f(parcel, i2, xe4.CREATOR);
                            break;
                        case 5:
                            strG = gi2.g(parcel, i2);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) gi2.f(parcel, i2, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) gi2.f(parcel, i2, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            strG2 = gi2.g(parcel, i2);
                            break;
                        case '\t':
                            strG3 = gi2.g(parcel, i2);
                            break;
                        case '\n':
                            strG4 = gi2.g(parcel, i2);
                            break;
                        case 11:
                            e51Var = (e51) gi2.f(parcel, i2, e51.CREATOR);
                            break;
                        case '\f':
                            bundleD2 = gi2.d(parcel, i2);
                            break;
                        case '\r':
                            iV2 = gi2.v(parcel, i2);
                            break;
                        case 14:
                            arrayListI = gi2.i(parcel, i2);
                            break;
                        case 15:
                            bundleD3 = gi2.d(parcel, i2);
                            break;
                        case 16:
                            zT = gi2.t(parcel, i2);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case '&':
                        case '>':
                        default:
                            gi2.y(parcel, i2);
                            break;
                        case 18:
                            iV3 = gi2.v(parcel, i2);
                            break;
                        case 19:
                            iV4 = gi2.v(parcel, i2);
                            break;
                        case 20:
                            gi2.L(parcel, i2, 4);
                            f = parcel.readFloat();
                            break;
                        case zy1.zzm /* 21 */:
                            strG5 = gi2.g(parcel, i2);
                            break;
                        case 25:
                            jW = gi2.w(parcel, i2);
                            break;
                        case 26:
                            strG6 = gi2.g(parcel, i2);
                            break;
                        case 27:
                            arrayListI2 = gi2.i(parcel, i2);
                            break;
                        case 28:
                            strG7 = gi2.g(parcel, i2);
                            break;
                        case 29:
                            r12Var = (r12) gi2.f(parcel, i2, r12.CREATOR);
                            break;
                        case 30:
                            arrayListI3 = gi2.i(parcel, i2);
                            break;
                        case 31:
                            jW2 = gi2.w(parcel, i2);
                            break;
                        case '!':
                            strG8 = gi2.g(parcel, i2);
                            break;
                        case '\"':
                            gi2.L(parcel, i2, 4);
                            f2 = parcel.readFloat();
                            break;
                        case '#':
                            iV5 = gi2.v(parcel, i2);
                            break;
                        case '$':
                            iV6 = gi2.v(parcel, i2);
                            break;
                        case '%':
                            zT3 = gi2.t(parcel, i2);
                            break;
                        case '\'':
                            strG9 = gi2.g(parcel, i2);
                            break;
                        case '(':
                            zT2 = gi2.t(parcel, i2);
                            break;
                        case ')':
                            strG10 = gi2.g(parcel, i2);
                            break;
                        case '*':
                            zT4 = gi2.t(parcel, i2);
                            break;
                        case '+':
                            iV7 = gi2.v(parcel, i2);
                            break;
                        case ',':
                            bundleD4 = gi2.d(parcel, i2);
                            break;
                        case '-':
                            strG11 = gi2.g(parcel, i2);
                            break;
                        case '.':
                            vz2Var = (vz2) gi2.f(parcel, i2, vz2.CREATOR);
                            break;
                        case '/':
                            zT5 = gi2.t(parcel, i2);
                            break;
                        case '0':
                            bundleD5 = gi2.d(parcel, i2);
                            break;
                        case '1':
                            strG12 = gi2.g(parcel, i2);
                            break;
                        case '2':
                            strG13 = gi2.g(parcel, i2);
                            break;
                        case '3':
                            strG14 = gi2.g(parcel, i2);
                            break;
                        case '4':
                            zT6 = gi2.t(parcel, i2);
                            break;
                        case '5':
                            int iX = gi2.x(parcel, i2);
                            int iDataPosition = parcel.dataPosition();
                            if (iX == 0) {
                                arrayList = null;
                                break;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                int i3 = parcel.readInt();
                                for (int i4 = 0; i4 < i3; i4++) {
                                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(iDataPosition + iX);
                                arrayList = arrayList2;
                                break;
                            }
                        case '6':
                            strG15 = gi2.g(parcel, i2);
                            break;
                        case '7':
                            arrayListI4 = gi2.i(parcel, i2);
                            break;
                        case '8':
                            iV8 = gi2.v(parcel, i2);
                            break;
                        case '9':
                            zT7 = gi2.t(parcel, i2);
                            break;
                        case ':':
                            zT8 = gi2.t(parcel, i2);
                            break;
                        case ';':
                            zT9 = gi2.t(parcel, i2);
                            break;
                        case '<':
                            arrayListI5 = gi2.i(parcel, i2);
                            break;
                        case '=':
                            strG16 = gi2.g(parcel, i2);
                            break;
                        case '?':
                            f52Var = (f52) gi2.f(parcel, i2, f52.CREATOR);
                            break;
                        case '@':
                            strG17 = gi2.g(parcel, i2);
                            break;
                        case 'A':
                            bundleD6 = gi2.d(parcel, i2);
                            break;
                    }
                }
                gi2.k(parcel, iZ2);
                return new u92(iV, bundleD, pc4Var, xe4Var, strG, applicationInfo, packageInfo, strG2, strG3, strG4, e51Var, bundleD2, iV2, arrayListI, bundleD3, zT, iV3, iV4, f, strG5, jW, strG6, arrayListI2, strG7, r12Var, arrayListI3, jW2, strG8, f2, zT2, iV5, iV6, zT3, strG9, strG10, zT4, iV7, bundleD4, strG11, vz2Var, zT5, bundleD5, strG12, strG13, strG14, zT6, arrayList, strG15, arrayListI4, iV8, zT7, zT8, zT9, arrayListI5, strG16, f52Var, strG17, bundleD6);
            case 2:
                int iZ3 = gi2.z(parcel);
                ArrayList arrayListI6 = null;
                boolean zT10 = false;
                while (parcel.dataPosition() < iZ3) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 2) {
                        zT10 = gi2.t(parcel, i5);
                    } else if (c2 != 3) {
                        gi2.y(parcel, i5);
                    } else {
                        arrayListI6 = gi2.i(parcel, i5);
                    }
                }
                gi2.k(parcel, iZ3);
                return new v92(zT10, arrayListI6);
            case 3:
                int iZ4 = gi2.z(parcel);
                String strG18 = null;
                while (parcel.dataPosition() < iZ4) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        gi2.y(parcel, i6);
                    } else {
                        strG18 = gi2.g(parcel, i6);
                    }
                }
                gi2.k(parcel, iZ4);
                return new w92(strG18);
            case 4:
                int iZ5 = gi2.z(parcel);
                boolean zT11 = false;
                boolean zT12 = false;
                int iV9 = 0;
                Bundle bundleD7 = null;
                e51 e51Var2 = null;
                ApplicationInfo applicationInfo2 = null;
                String strG19 = null;
                ArrayList arrayListI7 = null;
                PackageInfo packageInfo2 = null;
                String strG20 = null;
                String strG21 = null;
                d93 d93Var = null;
                String strG22 = null;
                Bundle bundleD8 = null;
                Bundle bundleD9 = null;
                while (parcel.dataPosition() < iZ5) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            bundleD7 = gi2.d(parcel, i7);
                            break;
                        case 2:
                            e51Var2 = (e51) gi2.f(parcel, i7, e51.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) gi2.f(parcel, i7, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            strG19 = gi2.g(parcel, i7);
                            break;
                        case 5:
                            arrayListI7 = gi2.i(parcel, i7);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) gi2.f(parcel, i7, PackageInfo.CREATOR);
                            break;
                        case 7:
                            strG20 = gi2.g(parcel, i7);
                            break;
                        case '\b':
                        default:
                            gi2.y(parcel, i7);
                            break;
                        case '\t':
                            strG21 = gi2.g(parcel, i7);
                            break;
                        case '\n':
                            d93Var = (d93) gi2.f(parcel, i7, d93.CREATOR);
                            break;
                        case 11:
                            strG22 = gi2.g(parcel, i7);
                            break;
                        case '\f':
                            zT11 = gi2.t(parcel, i7);
                            break;
                        case '\r':
                            zT12 = gi2.t(parcel, i7);
                            break;
                        case 14:
                            bundleD8 = gi2.d(parcel, i7);
                            break;
                        case 15:
                            bundleD9 = gi2.d(parcel, i7);
                            break;
                        case 16:
                            iV9 = gi2.v(parcel, i7);
                            break;
                    }
                }
                gi2.k(parcel, iZ5);
                return new fa2(bundleD7, e51Var2, applicationInfo2, strG19, arrayListI7, packageInfo2, strG20, strG21, d93Var, strG22, zT11, zT12, bundleD8, bundleD9, iV9);
            case 5:
                int iZ6 = gi2.z(parcel);
                pc4 pc4Var2 = null;
                String strG23 = null;
                while (parcel.dataPosition() < iZ6) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 2) {
                        pc4Var2 = (pc4) gi2.f(parcel, i8, pc4.CREATOR);
                    } else if (c3 != 3) {
                        gi2.y(parcel, i8);
                    } else {
                        strG23 = gi2.g(parcel, i8);
                    }
                }
                gi2.k(parcel, iZ6);
                return new pa2(strG23, pc4Var2);
            case 6:
                int iZ7 = gi2.z(parcel);
                int iV10 = 0;
                String strG24 = null;
                while (parcel.dataPosition() < iZ7) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 2) {
                        strG24 = gi2.g(parcel, i9);
                    } else if (c4 != 3) {
                        gi2.y(parcel, i9);
                    } else {
                        iV10 = gi2.v(parcel, i9);
                    }
                }
                gi2.k(parcel, iZ7);
                return new ta2(strG24, iV10);
            case 7:
                int iZ8 = gi2.z(parcel);
                String strG25 = null;
                String strG26 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        strG25 = gi2.g(parcel, i10);
                    } else if (c5 != 2) {
                        gi2.y(parcel, i10);
                    } else {
                        strG26 = gi2.g(parcel, i10);
                    }
                }
                gi2.k(parcel, iZ8);
                return new mb2(strG25, strG26);
            case 8:
                int iZ9 = gi2.z(parcel);
                String strG27 = null;
                String strG28 = null;
                ArrayList arrayListI8 = null;
                ArrayList arrayListI9 = null;
                boolean zT13 = false;
                boolean zT14 = false;
                boolean zT15 = false;
                boolean zT16 = false;
                while (parcel.dataPosition() < iZ9) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strG27 = gi2.g(parcel, i11);
                            break;
                        case 3:
                            strG28 = gi2.g(parcel, i11);
                            break;
                        case 4:
                            zT13 = gi2.t(parcel, i11);
                            break;
                        case 5:
                            zT14 = gi2.t(parcel, i11);
                            break;
                        case 6:
                            arrayListI8 = gi2.i(parcel, i11);
                            break;
                        case 7:
                            zT15 = gi2.t(parcel, i11);
                            break;
                        case '\b':
                            zT16 = gi2.t(parcel, i11);
                            break;
                        case '\t':
                            arrayListI9 = gi2.i(parcel, i11);
                            break;
                        default:
                            gi2.y(parcel, i11);
                            break;
                    }
                }
                gi2.k(parcel, iZ9);
                return new rb2(strG27, strG28, zT13, zT14, arrayListI8, zT15, zT16, arrayListI9);
            case 9:
                int iZ10 = gi2.z(parcel);
                long jW3 = -1;
                int iV11 = 0;
                String strG29 = null;
                while (parcel.dataPosition() < iZ10) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        strG29 = gi2.g(parcel, i12);
                    } else if (c6 == 2) {
                        iV11 = gi2.v(parcel, i12);
                    } else if (c6 != 3) {
                        gi2.y(parcel, i12);
                    } else {
                        jW3 = gi2.w(parcel, i12);
                    }
                }
                gi2.k(parcel, iZ10);
                return new ju(iV11, jW3, strG29);
            case 10:
                int iZ11 = gi2.z(parcel);
                String strG30 = null;
                String strG31 = null;
                xe4 xe4Var2 = null;
                pc4 pc4Var3 = null;
                String strG32 = null;
                int iV12 = 0;
                while (parcel.dataPosition() < iZ11) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strG30 = gi2.g(parcel, i13);
                            break;
                        case 2:
                            strG31 = gi2.g(parcel, i13);
                            break;
                        case 3:
                            xe4Var2 = (xe4) gi2.f(parcel, i13, xe4.CREATOR);
                            break;
                        case 4:
                            pc4Var3 = (pc4) gi2.f(parcel, i13, pc4.CREATOR);
                            break;
                        case 5:
                            iV12 = gi2.v(parcel, i13);
                            break;
                        case 6:
                            strG32 = gi2.g(parcel, i13);
                            break;
                        default:
                            gi2.y(parcel, i13);
                            break;
                    }
                }
                gi2.k(parcel, iZ11);
                return new ad2(strG30, strG31, xe4Var2, pc4Var3, iV12, strG32);
            case 11:
                int iZ12 = gi2.z(parcel);
                String strG33 = null;
                String strG34 = null;
                while (parcel.dataPosition() < iZ12) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        strG33 = gi2.g(parcel, i14);
                    } else if (c7 != 2) {
                        gi2.y(parcel, i14);
                    } else {
                        strG34 = gi2.g(parcel, i14);
                    }
                }
                gi2.k(parcel, iZ12);
                return new ec2(strG33, strG34);
            case 12:
                int iZ13 = gi2.z(parcel);
                String strG35 = null;
                int iV13 = 0;
                while (parcel.dataPosition() < iZ13) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        strG35 = gi2.g(parcel, i15);
                    } else if (c8 != 2) {
                        gi2.y(parcel, i15);
                    } else {
                        iV13 = gi2.v(parcel, i15);
                    }
                }
                gi2.k(parcel, iZ13);
                return new jc2(strG35, iV13);
            case 13:
                int iZ14 = gi2.z(parcel);
                int iV14 = 0;
                while (parcel.dataPosition() < iZ14) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 2) {
                        gi2.y(parcel, i16);
                    } else {
                        iV14 = gi2.v(parcel, i16);
                    }
                }
                gi2.k(parcel, iZ14);
                return new vz2(iV14);
            case 14:
                int iZ15 = gi2.z(parcel);
                IBinder iBinderU3 = null;
                boolean zT17 = false;
                IBinder iBinderU4 = null;
                while (parcel.dataPosition() < iZ15) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 1) {
                        zT17 = gi2.t(parcel, i17);
                    } else if (c9 == 2) {
                        iBinderU3 = gi2.u(parcel, i17);
                    } else if (c9 != 3) {
                        gi2.y(parcel, i17);
                    } else {
                        iBinderU4 = gi2.u(parcel, i17);
                    }
                }
                gi2.k(parcel, iZ15);
                return new vm0(zT17, iBinderU3, iBinderU4);
            case 15:
                int iZ16 = gi2.z(parcel);
                String strG36 = null;
                String strG37 = null;
                nx2 nx2Var = null;
                IBinder iBinderU5 = null;
                int iV15 = 0;
                while (parcel.dataPosition() < iZ16) {
                    int i18 = parcel.readInt();
                    char c10 = (char) i18;
                    if (c10 == 1) {
                        iV15 = gi2.v(parcel, i18);
                    } else if (c10 == 2) {
                        strG36 = gi2.g(parcel, i18);
                    } else if (c10 == 3) {
                        strG37 = gi2.g(parcel, i18);
                    } else if (c10 == 4) {
                        nx2Var = (nx2) gi2.f(parcel, i18, nx2.CREATOR);
                    } else if (c10 != 5) {
                        gi2.y(parcel, i18);
                    } else {
                        iBinderU5 = gi2.u(parcel, i18);
                    }
                }
                gi2.k(parcel, iZ16);
                return new nx2(iV15, strG36, strG37, nx2Var, iBinderU5);
            case 16:
                int iZ17 = gi2.z(parcel);
                String strG38 = null;
                int iV16 = 0;
                int iV17 = 0;
                while (parcel.dataPosition() < iZ17) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        iV16 = gi2.v(parcel, i19);
                    } else if (c11 == 2) {
                        iV17 = gi2.v(parcel, i19);
                    } else if (c11 != 3) {
                        gi2.y(parcel, i19);
                    } else {
                        strG38 = gi2.g(parcel, i19);
                    }
                }
                gi2.k(parcel, iZ17);
                return new w63(strG38, iV16, iV17);
            case 17:
                int iZ18 = gi2.z(parcel);
                int iV18 = 0;
                int iV19 = 0;
                int iV20 = 0;
                int iV21 = 0;
                int iV22 = 0;
                int iV23 = 0;
                String strG39 = null;
                while (parcel.dataPosition() < iZ18) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iV18 = gi2.v(parcel, i20);
                            break;
                        case 2:
                            iV19 = gi2.v(parcel, i20);
                            break;
                        case 3:
                            iV20 = gi2.v(parcel, i20);
                            break;
                        case 4:
                            iV21 = gi2.v(parcel, i20);
                            break;
                        case 5:
                            strG39 = gi2.g(parcel, i20);
                            break;
                        case 6:
                            iV22 = gi2.v(parcel, i20);
                            break;
                        case 7:
                            iV23 = gi2.v(parcel, i20);
                            break;
                        default:
                            gi2.y(parcel, i20);
                            break;
                    }
                }
                gi2.k(parcel, iZ18);
                return new d93(iV18, iV19, iV20, iV21, strG39, iV22, iV23);
            case 18:
                int iZ19 = gi2.z(parcel);
                byte[] bArrE = null;
                int iV24 = 0;
                while (parcel.dataPosition() < iZ19) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 1) {
                        iV24 = gi2.v(parcel, i21);
                    } else if (c12 != 2) {
                        gi2.y(parcel, i21);
                    } else {
                        bArrE = gi2.e(parcel, i21);
                    }
                }
                gi2.k(parcel, iZ19);
                return new ud3(iV24, bArrE);
            case 19:
                int iZ20 = gi2.z(parcel);
                String strG40 = null;
                int iV25 = 0;
                String strG41 = null;
                while (parcel.dataPosition() < iZ20) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 1) {
                        iV25 = gi2.v(parcel, i22);
                    } else if (c13 == 2) {
                        strG40 = gi2.g(parcel, i22);
                    } else if (c13 != 3) {
                        gi2.y(parcel, i22);
                    } else {
                        strG41 = gi2.g(parcel, i22);
                    }
                }
                gi2.k(parcel, iZ20);
                return new wd3(iV25, strG40, strG41);
            case 20:
                int iZ21 = gi2.z(parcel);
                byte[] bArrE2 = null;
                int iV26 = 0;
                while (parcel.dataPosition() < iZ21) {
                    int i23 = parcel.readInt();
                    char c14 = (char) i23;
                    if (c14 == 1) {
                        iV26 = gi2.v(parcel, i23);
                    } else if (c14 != 2) {
                        gi2.y(parcel, i23);
                    } else {
                        bArrE2 = gi2.e(parcel, i23);
                    }
                }
                gi2.k(parcel, iZ21);
                return new xd3(iV26, bArrE2);
            case zy1.zzm /* 21 */:
                int iZ22 = gi2.z(parcel);
                String strG42 = null;
                String strG43 = null;
                int iV27 = 0;
                int iV28 = 0;
                int iV29 = 0;
                while (parcel.dataPosition() < iZ22) {
                    int i24 = parcel.readInt();
                    char c15 = (char) i24;
                    if (c15 == 1) {
                        iV27 = gi2.v(parcel, i24);
                    } else if (c15 == 2) {
                        iV28 = gi2.v(parcel, i24);
                    } else if (c15 == 3) {
                        strG42 = gi2.g(parcel, i24);
                    } else if (c15 == 4) {
                        strG43 = gi2.g(parcel, i24);
                    } else if (c15 != 5) {
                        gi2.y(parcel, i24);
                    } else {
                        iV29 = gi2.v(parcel, i24);
                    }
                }
                gi2.k(parcel, iZ22);
                return new be3(iV27, iV28, iV29, strG42, strG43);
            case 22:
                int iZ23 = gi2.z(parcel);
                int iV30 = 0;
                byte[] bArrE3 = null;
                int iV31 = 0;
                while (parcel.dataPosition() < iZ23) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        iV30 = gi2.v(parcel, i25);
                    } else if (c16 == 2) {
                        bArrE3 = gi2.e(parcel, i25);
                    } else if (c16 != 3) {
                        gi2.y(parcel, i25);
                    } else {
                        iV31 = gi2.v(parcel, i25);
                    }
                }
                gi2.k(parcel, iZ23);
                return new ce3(bArrE3, iV30, iV31);
            case 23:
                int iZ24 = gi2.z(parcel);
                int iV32 = 0;
                String strG44 = null;
                pc4 pc4Var4 = null;
                int iV33 = 0;
                while (parcel.dataPosition() < iZ24) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 1) {
                        strG44 = gi2.g(parcel, i26);
                    } else if (c17 == 2) {
                        iV32 = gi2.v(parcel, i26);
                    } else if (c17 == 3) {
                        pc4Var4 = (pc4) gi2.f(parcel, i26, pc4.CREATOR);
                    } else if (c17 != 4) {
                        gi2.y(parcel, i26);
                    } else {
                        iV33 = gi2.v(parcel, i26);
                    }
                }
                gi2.k(parcel, iZ24);
                return new ae3(strG44, iV32, pc4Var4, iV33);
            case 24:
                int iZ25 = gi2.z(parcel);
                int iV34 = 0;
                int iV35 = 0;
                while (parcel.dataPosition() < iZ25) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 1) {
                        iV34 = gi2.v(parcel, i27);
                    } else if (c18 != 2) {
                        gi2.y(parcel, i27);
                    } else {
                        iV35 = gi2.v(parcel, i27);
                    }
                }
                gi2.k(parcel, iZ25);
                return new ne3(iV34, iV35);
            case 25:
                int iZ26 = gi2.z(parcel);
                String strG45 = null;
                while (parcel.dataPosition() < iZ26) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 15) {
                        gi2.y(parcel, i28);
                    } else {
                        strG45 = gi2.g(parcel, i28);
                    }
                }
                gi2.k(parcel, iZ26);
                return new qf3(strG45);
            case 26:
                int iZ27 = gi2.z(parcel);
                boolean zT18 = false;
                boolean zT19 = false;
                boolean zT20 = false;
                while (parcel.dataPosition() < iZ27) {
                    int i29 = parcel.readInt();
                    char c19 = (char) i29;
                    if (c19 == 2) {
                        zT18 = gi2.t(parcel, i29);
                    } else if (c19 == 3) {
                        zT19 = gi2.t(parcel, i29);
                    } else if (c19 != 4) {
                        gi2.y(parcel, i29);
                    } else {
                        zT20 = gi2.t(parcel, i29);
                    }
                }
                gi2.k(parcel, iZ27);
                return new ih3(zT18, zT19, zT20);
            case 27:
                int iZ28 = gi2.z(parcel);
                Bundle bundleD10 = null;
                sh shVar = null;
                int iV36 = 0;
                ju[] juVarArr = null;
                while (parcel.dataPosition() < iZ28) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 1) {
                        bundleD10 = gi2.d(parcel, i30);
                    } else if (c20 == 2) {
                        juVarArr = (ju[]) gi2.j(parcel, i30, ju.CREATOR);
                    } else if (c20 == 3) {
                        iV36 = gi2.v(parcel, i30);
                    } else if (c20 != 4) {
                        gi2.y(parcel, i30);
                    } else {
                        shVar = (sh) gi2.f(parcel, i30, sh.CREATOR);
                    }
                }
                gi2.k(parcel, iZ28);
                eb4 eb4Var = new eb4();
                eb4Var.f = bundleD10;
                eb4Var.g = juVarArr;
                eb4Var.h = iV36;
                eb4Var.i = shVar;
                return eb4Var;
            case 28:
                int iZ29 = gi2.z(parcel);
                tq0 tq0Var = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zT21 = false;
                boolean zT22 = false;
                int iV37 = 0;
                while (parcel.dataPosition() < iZ29) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 1:
                            tq0Var = (tq0) gi2.f(parcel, i31, tq0.CREATOR);
                            break;
                        case 2:
                            zT21 = gi2.t(parcel, i31);
                            break;
                        case 3:
                            zT22 = gi2.t(parcel, i31);
                            break;
                        case 4:
                            int iX2 = gi2.x(parcel, i31);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iX2 == 0) {
                                iArrCreateIntArray = null;
                                break;
                            } else {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iX2);
                                break;
                            }
                        case 5:
                            iV37 = gi2.v(parcel, i31);
                            break;
                        case 6:
                            int iX3 = gi2.x(parcel, i31);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iX3 == 0) {
                                iArrCreateIntArray2 = null;
                                break;
                            } else {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iX3);
                                break;
                            }
                        default:
                            gi2.y(parcel, i31);
                            break;
                    }
                }
                gi2.k(parcel, iZ29);
                return new sh(tq0Var, zT21, zT22, iArrCreateIntArray, iV37, iArrCreateIntArray2);
            default:
                int iZ30 = gi2.z(parcel);
                boolean zT23 = false;
                boolean zT24 = false;
                boolean zT25 = false;
                int iV38 = 0;
                boolean zT26 = false;
                boolean zT27 = false;
                boolean zT28 = false;
                float f3 = 0.0f;
                String strG46 = null;
                while (parcel.dataPosition() < iZ30) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            zT23 = gi2.t(parcel, i32);
                            break;
                        case 3:
                            zT24 = gi2.t(parcel, i32);
                            break;
                        case 4:
                            strG46 = gi2.g(parcel, i32);
                            break;
                        case 5:
                            zT25 = gi2.t(parcel, i32);
                            break;
                        case 6:
                            gi2.L(parcel, i32, 4);
                            f3 = parcel.readFloat();
                            break;
                        case 7:
                            iV38 = gi2.v(parcel, i32);
                            break;
                        case '\b':
                            zT26 = gi2.t(parcel, i32);
                            break;
                        case '\t':
                            zT27 = gi2.t(parcel, i32);
                            break;
                        case '\n':
                            zT28 = gi2.t(parcel, i32);
                            break;
                        default:
                            gi2.y(parcel, i32);
                            break;
                    }
                }
                gi2.k(parcel, iZ30);
                return new zb4(zT23, zT24, strG46, zT25, f3, iV38, zT26, zT27, zT28);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new o92[i];
            case 1:
                return new u92[i];
            case 2:
                return new v92[i];
            case 3:
                return new w92[i];
            case 4:
                return new fa2[i];
            case 5:
                return new pa2[i];
            case 6:
                return new ta2[i];
            case 7:
                return new mb2[i];
            case 8:
                return new rb2[i];
            case 9:
                return new ju[i];
            case 10:
                return new ad2[i];
            case 11:
                return new ec2[i];
            case 12:
                return new jc2[i];
            case 13:
                return new vz2[i];
            case 14:
                return new vm0[i];
            case 15:
                return new nx2[i];
            case 16:
                return new w63[i];
            case 17:
                return new d93[i];
            case 18:
                return new ud3[i];
            case 19:
                return new wd3[i];
            case 20:
                return new xd3[i];
            case zy1.zzm /* 21 */:
                return new be3[i];
            case 22:
                return new ce3[i];
            case 23:
                return new ae3[i];
            case 24:
                return new ne3[i];
            case 25:
                return new qf3[i];
            case 26:
                return new ih3[i];
            case 27:
                return new eb4[i];
            case 28:
                return new sh[i];
            default:
                return new zb4[i];
        }
    }
}
