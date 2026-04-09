package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1784r8 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16471a;

    public /* synthetic */ C1784r8(int i) {
        this.f16471a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f16471a) {
            case 0:
                int iO = T2.g.O(parcel);
                boolean zD = false;
                boolean zD2 = false;
                boolean zD3 = false;
                long jI = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iO) {
                    int i = parcel.readInt();
                    char c6 = (char) i;
                    if (c6 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) T2.g.i(parcel, i, ParcelFileDescriptor.CREATOR);
                    } else if (c6 == 3) {
                        zD = T2.g.D(parcel, i);
                    } else if (c6 == 4) {
                        zD2 = T2.g.D(parcel, i);
                    } else if (c6 == 5) {
                        jI = T2.g.I(parcel, i);
                    } else if (c6 != 6) {
                        T2.g.L(parcel, i);
                    } else {
                        zD3 = T2.g.D(parcel, i);
                    }
                }
                T2.g.n(parcel, iO);
                return new C1731q8(parcelFileDescriptor, zD, zD2, jI, zD3);
            case 1:
                int iO2 = T2.g.O(parcel);
                boolean zD4 = false;
                int iH = 0;
                String strJ = null;
                String strJ2 = null;
                String strJ3 = null;
                String strJ4 = null;
                Bundle bundleG = null;
                String strJ5 = null;
                long jI2 = 0;
                long jI3 = 0;
                while (parcel.dataPosition() < iO2) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            strJ = T2.g.j(parcel, i3);
                            break;
                        case 3:
                            jI2 = T2.g.I(parcel, i3);
                            break;
                        case 4:
                            strJ2 = T2.g.j(parcel, i3);
                            break;
                        case 5:
                            strJ3 = T2.g.j(parcel, i3);
                            break;
                        case 6:
                            strJ4 = T2.g.j(parcel, i3);
                            break;
                        case 7:
                            bundleG = T2.g.g(parcel, i3);
                            break;
                        case '\b':
                            zD4 = T2.g.D(parcel, i3);
                            break;
                        case '\t':
                            jI3 = T2.g.I(parcel, i3);
                            break;
                        case '\n':
                            strJ5 = T2.g.j(parcel, i3);
                            break;
                        case 11:
                            iH = T2.g.H(parcel, i3);
                            break;
                        default:
                            T2.g.L(parcel, i3);
                            break;
                    }
                }
                T2.g.n(parcel, iO2);
                return new C1892t8(strJ, jI2, strJ2, strJ3, strJ4, bundleG, zD4, jI3, strJ5, iH);
            case 2:
                int iO3 = T2.g.O(parcel);
                int iH2 = 0;
                boolean zD5 = false;
                int iH3 = 0;
                boolean zD6 = false;
                int iH4 = 0;
                boolean zD7 = false;
                int iH5 = 0;
                int iH6 = 0;
                boolean zD8 = false;
                int iH7 = 0;
                q2.Y0 y02 = null;
                while (parcel.dataPosition() < iO3) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iH2 = T2.g.H(parcel, i6);
                            break;
                        case 2:
                            zD5 = T2.g.D(parcel, i6);
                            break;
                        case 3:
                            iH3 = T2.g.H(parcel, i6);
                            break;
                        case 4:
                            zD6 = T2.g.D(parcel, i6);
                            break;
                        case 5:
                            iH4 = T2.g.H(parcel, i6);
                            break;
                        case 6:
                            y02 = (q2.Y0) T2.g.i(parcel, i6, q2.Y0.CREATOR);
                            break;
                        case 7:
                            zD7 = T2.g.D(parcel, i6);
                            break;
                        case '\b':
                            iH5 = T2.g.H(parcel, i6);
                            break;
                        case '\t':
                            iH6 = T2.g.H(parcel, i6);
                            break;
                        case '\n':
                            zD8 = T2.g.D(parcel, i6);
                            break;
                        case 11:
                            iH7 = T2.g.H(parcel, i6);
                            break;
                        default:
                            T2.g.L(parcel, i6);
                            break;
                    }
                }
                T2.g.n(parcel, iO3);
                return new C0499Fa(iH2, zD5, iH3, zD6, iH4, y02, zD7, iH5, iH6, zD8, iH7);
            case 3:
                int iO4 = T2.g.O(parcel);
                String strJ6 = null;
                String[] strArrK = null;
                String[] strArrK2 = null;
                while (parcel.dataPosition() < iO4) {
                    int i7 = parcel.readInt();
                    char c7 = (char) i7;
                    if (c7 == 1) {
                        strJ6 = T2.g.j(parcel, i7);
                    } else if (c7 == 2) {
                        strArrK = T2.g.k(parcel, i7);
                    } else if (c7 != 3) {
                        T2.g.L(parcel, i7);
                    } else {
                        strArrK2 = T2.g.k(parcel, i7);
                    }
                }
                T2.g.n(parcel, iO4);
                return new C0653Ob(strJ6, strArrK, strArrK2);
            case 4:
                int iO5 = T2.g.O(parcel);
                long jI4 = 0;
                boolean zD9 = false;
                int iH8 = 0;
                boolean zD10 = false;
                String strJ7 = null;
                byte[] bArrH = null;
                String[] strArrK3 = null;
                String[] strArrK4 = null;
                while (parcel.dataPosition() < iO5) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            zD9 = T2.g.D(parcel, i8);
                            break;
                        case 2:
                            strJ7 = T2.g.j(parcel, i8);
                            break;
                        case 3:
                            iH8 = T2.g.H(parcel, i8);
                            break;
                        case 4:
                            bArrH = T2.g.h(parcel, i8);
                            break;
                        case 5:
                            strArrK3 = T2.g.k(parcel, i8);
                            break;
                        case 6:
                            strArrK4 = T2.g.k(parcel, i8);
                            break;
                        case 7:
                            zD10 = T2.g.D(parcel, i8);
                            break;
                        case '\b':
                            jI4 = T2.g.I(parcel, i8);
                            break;
                        default:
                            T2.g.L(parcel, i8);
                            break;
                    }
                }
                T2.g.n(parcel, iO5);
                return new C0670Pb(zD9, strJ7, iH8, bArrH, strArrK3, strArrK4, zD10, jI4);
            case 5:
                int iO6 = T2.g.O(parcel);
                String strJ8 = null;
                boolean zD11 = false;
                int iH9 = 0;
                String strJ9 = null;
                while (parcel.dataPosition() < iO6) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        strJ8 = T2.g.j(parcel, i9);
                    } else if (c8 == 2) {
                        zD11 = T2.g.D(parcel, i9);
                    } else if (c8 == 3) {
                        iH9 = T2.g.H(parcel, i9);
                    } else if (c8 != 4) {
                        T2.g.L(parcel, i9);
                    } else {
                        strJ9 = T2.g.j(parcel, i9);
                    }
                }
                T2.g.n(parcel, iO6);
                return new C0772Vb(strJ8, iH9, strJ9, zD11);
            case 6:
                int iO7 = T2.g.O(parcel);
                String strJ10 = null;
                Bundle bundleG2 = null;
                while (parcel.dataPosition() < iO7) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        strJ10 = T2.g.j(parcel, i10);
                    } else if (c9 != 2) {
                        T2.g.L(parcel, i10);
                    } else {
                        bundleG2 = T2.g.g(parcel, i10);
                    }
                }
                T2.g.n(parcel, iO7);
                return new C0887ac(strJ10, bundleG2);
            case 7:
                int iO8 = T2.g.O(parcel);
                int iH10 = 0;
                int iH11 = 0;
                String strJ11 = null;
                int iH12 = 0;
                while (parcel.dataPosition() < iO8) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iH12 = T2.g.H(parcel, i11);
                    } else if (c10 == 2) {
                        strJ11 = T2.g.j(parcel, i11);
                    } else if (c10 == 3) {
                        iH11 = T2.g.H(parcel, i11);
                    } else if (c10 != 1000) {
                        T2.g.L(parcel, i11);
                    } else {
                        iH10 = T2.g.H(parcel, i11);
                    }
                }
                T2.g.n(parcel, iO8);
                return new C0942bc(iH10, iH12, iH11, strJ11);
            case 8:
                int iO9 = T2.g.O(parcel);
                int iH13 = 0;
                int iH14 = 0;
                int iH15 = 0;
                while (parcel.dataPosition() < iO9) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        iH13 = T2.g.H(parcel, i12);
                    } else if (c11 == 2) {
                        iH14 = T2.g.H(parcel, i12);
                    } else if (c11 != 3) {
                        T2.g.L(parcel, i12);
                    } else {
                        iH15 = T2.g.H(parcel, i12);
                    }
                }
                T2.g.n(parcel, iO9);
                return new C2184yd(iH13, iH14, iH15);
            case 9:
                int iO10 = T2.g.O(parcel);
                IBinder iBinderF = null;
                IBinder iBinderF2 = null;
                while (parcel.dataPosition() < iO10) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 1) {
                        iBinderF = T2.g.F(parcel, i13);
                    } else if (c12 != 2) {
                        T2.g.L(parcel, i13);
                    } else {
                        iBinderF2 = T2.g.F(parcel, i13);
                    }
                }
                T2.g.n(parcel, iO10);
                return new C0944be(iBinderF, iBinderF2);
            case 10:
                int iO11 = T2.g.O(parcel);
                float f2 = 0.0f;
                float f5 = 0.0f;
                long jI5 = 0;
                long jI6 = 0;
                int iH16 = 0;
                Bundle bundleG3 = null;
                q2.a1 a1Var = null;
                q2.d1 d1Var = null;
                String strJ12 = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String strJ13 = null;
                String strJ14 = null;
                String strJ15 = null;
                C2951a c2951a = null;
                Bundle bundleG4 = null;
                int iH17 = 0;
                ArrayList arrayListL = null;
                Bundle bundleG5 = null;
                boolean zD12 = false;
                int iH18 = 0;
                int iH19 = 0;
                String strJ16 = null;
                String strJ17 = null;
                ArrayList arrayListL2 = null;
                String strJ18 = null;
                C0499Fa c0499Fa = null;
                ArrayList arrayListL3 = null;
                String strJ19 = null;
                boolean zD13 = false;
                int iH20 = 0;
                int iH21 = 0;
                boolean zD14 = false;
                String strJ20 = null;
                String strJ21 = null;
                boolean zD15 = false;
                int iH22 = 0;
                Bundle bundleG6 = null;
                String strJ22 = null;
                q2.D0 d02 = null;
                boolean zD16 = false;
                Bundle bundleG7 = null;
                String strJ23 = null;
                String strJ24 = null;
                String strJ25 = null;
                boolean zD17 = false;
                ArrayList arrayList = null;
                String strJ26 = null;
                ArrayList arrayListL4 = null;
                int iH23 = 0;
                boolean zD18 = false;
                boolean zD19 = false;
                boolean zD20 = false;
                ArrayList arrayListL5 = null;
                String strJ27 = null;
                C0942bc c0942bc = null;
                String strJ28 = null;
                Bundle bundleG8 = null;
                while (parcel.dataPosition() < iO11) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iH16 = T2.g.H(parcel, i14);
                            break;
                        case 2:
                            bundleG3 = T2.g.g(parcel, i14);
                            break;
                        case 3:
                            a1Var = (q2.a1) T2.g.i(parcel, i14, q2.a1.CREATOR);
                            break;
                        case 4:
                            d1Var = (q2.d1) T2.g.i(parcel, i14, q2.d1.CREATOR);
                            break;
                        case 5:
                            strJ12 = T2.g.j(parcel, i14);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) T2.g.i(parcel, i14, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) T2.g.i(parcel, i14, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            strJ13 = T2.g.j(parcel, i14);
                            break;
                        case '\t':
                            strJ14 = T2.g.j(parcel, i14);
                            break;
                        case '\n':
                            strJ15 = T2.g.j(parcel, i14);
                            break;
                        case 11:
                            c2951a = (C2951a) T2.g.i(parcel, i14, C2951a.CREATOR);
                            break;
                        case '\f':
                            bundleG4 = T2.g.g(parcel, i14);
                            break;
                        case '\r':
                            iH17 = T2.g.H(parcel, i14);
                            break;
                        case 14:
                            arrayListL = T2.g.l(parcel, i14);
                            break;
                        case 15:
                            bundleG5 = T2.g.g(parcel, i14);
                            break;
                        case 16:
                            zD12 = T2.g.D(parcel, i14);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                        case '>':
                        default:
                            T2.g.L(parcel, i14);
                            break;
                        case 18:
                            iH18 = T2.g.H(parcel, i14);
                            break;
                        case 19:
                            iH19 = T2.g.H(parcel, i14);
                            break;
                        case 20:
                            T2.g.R(parcel, i14, 4);
                            f2 = parcel.readFloat();
                            break;
                        case 21:
                            strJ16 = T2.g.j(parcel, i14);
                            break;
                        case 25:
                            jI5 = T2.g.I(parcel, i14);
                            break;
                        case 26:
                            strJ17 = T2.g.j(parcel, i14);
                            break;
                        case 27:
                            arrayListL2 = T2.g.l(parcel, i14);
                            break;
                        case 28:
                            strJ18 = T2.g.j(parcel, i14);
                            break;
                        case 29:
                            c0499Fa = (C0499Fa) T2.g.i(parcel, i14, C0499Fa.CREATOR);
                            break;
                        case 30:
                            arrayListL3 = T2.g.l(parcel, i14);
                            break;
                        case 31:
                            jI6 = T2.g.I(parcel, i14);
                            break;
                        case '!':
                            strJ19 = T2.g.j(parcel, i14);
                            break;
                        case '\"':
                            T2.g.R(parcel, i14, 4);
                            f5 = parcel.readFloat();
                            break;
                        case '#':
                            iH20 = T2.g.H(parcel, i14);
                            break;
                        case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                            iH21 = T2.g.H(parcel, i14);
                            break;
                        case '%':
                            zD14 = T2.g.D(parcel, i14);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                            strJ20 = T2.g.j(parcel, i14);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                            zD13 = T2.g.D(parcel, i14);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                            strJ21 = T2.g.j(parcel, i14);
                            break;
                        case '*':
                            zD15 = T2.g.D(parcel, i14);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                            iH22 = T2.g.H(parcel, i14);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                            bundleG6 = T2.g.g(parcel, i14);
                            break;
                        case '-':
                            strJ22 = T2.g.j(parcel, i14);
                            break;
                        case '.':
                            d02 = (q2.D0) T2.g.i(parcel, i14, q2.D0.CREATOR);
                            break;
                        case '/':
                            zD16 = T2.g.D(parcel, i14);
                            break;
                        case '0':
                            bundleG7 = T2.g.g(parcel, i14);
                            break;
                        case '1':
                            strJ23 = T2.g.j(parcel, i14);
                            break;
                        case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                            strJ24 = T2.g.j(parcel, i14);
                            break;
                        case '3':
                            strJ25 = T2.g.j(parcel, i14);
                            break;
                        case '4':
                            zD17 = T2.g.D(parcel, i14);
                            break;
                        case '5':
                            int iJ = T2.g.J(parcel, i14);
                            int iDataPosition = parcel.dataPosition();
                            if (iJ == 0) {
                                arrayList = null;
                                break;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                int i15 = parcel.readInt();
                                for (int i16 = 0; i16 < i15; i16++) {
                                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(iDataPosition + iJ);
                                arrayList = arrayList2;
                                break;
                            }
                        case '6':
                            strJ26 = T2.g.j(parcel, i14);
                            break;
                        case '7':
                            arrayListL4 = T2.g.l(parcel, i14);
                            break;
                        case '8':
                            iH23 = T2.g.H(parcel, i14);
                            break;
                        case '9':
                            zD18 = T2.g.D(parcel, i14);
                            break;
                        case ':':
                            zD19 = T2.g.D(parcel, i14);
                            break;
                        case ';':
                            zD20 = T2.g.D(parcel, i14);
                            break;
                        case '<':
                            arrayListL5 = T2.g.l(parcel, i14);
                            break;
                        case '=':
                            strJ27 = T2.g.j(parcel, i14);
                            break;
                        case '?':
                            c0942bc = (C0942bc) T2.g.i(parcel, i14, C0942bc.CREATOR);
                            break;
                        case '@':
                            strJ28 = T2.g.j(parcel, i14);
                            break;
                        case 'A':
                            bundleG8 = T2.g.g(parcel, i14);
                            break;
                    }
                }
                T2.g.n(parcel, iO11);
                return new C1216ge(iH16, bundleG3, a1Var, d1Var, strJ12, applicationInfo, packageInfo, strJ13, strJ14, strJ15, c2951a, bundleG4, iH17, arrayListL, bundleG5, zD12, iH18, iH19, f2, strJ16, jI5, strJ17, arrayListL2, strJ18, c0499Fa, arrayListL3, jI6, strJ19, f5, zD13, iH20, iH21, zD14, strJ20, strJ21, zD15, iH22, bundleG6, strJ22, d02, zD16, bundleG7, strJ23, strJ24, strJ25, zD17, arrayList, strJ26, arrayListL4, iH23, zD18, zD19, zD20, arrayListL5, strJ27, c0942bc, strJ28, bundleG8);
            case 11:
                int iO12 = T2.g.O(parcel);
                ArrayList arrayListL6 = null;
                boolean zD21 = false;
                while (parcel.dataPosition() < iO12) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 2) {
                        zD21 = T2.g.D(parcel, i17);
                    } else if (c13 != 3) {
                        T2.g.L(parcel, i17);
                    } else {
                        arrayListL6 = T2.g.l(parcel, i17);
                    }
                }
                T2.g.n(parcel, iO12);
                return new C1270he(arrayListL6, zD21);
            case 12:
                int iO13 = T2.g.O(parcel);
                String strJ29 = null;
                while (parcel.dataPosition() < iO13) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        T2.g.L(parcel, i18);
                    } else {
                        strJ29 = T2.g.j(parcel, i18);
                    }
                }
                T2.g.n(parcel, iO13);
                return new C1324ie(strJ29);
            case 13:
                int iO14 = T2.g.O(parcel);
                boolean zD22 = false;
                boolean zD23 = false;
                int iH24 = 0;
                Bundle bundleG9 = null;
                C2951a c2951a2 = null;
                ApplicationInfo applicationInfo2 = null;
                String strJ30 = null;
                ArrayList arrayListL7 = null;
                PackageInfo packageInfo2 = null;
                String strJ31 = null;
                String strJ32 = null;
                C1823ru c1823ru = null;
                String strJ33 = null;
                Bundle bundleG10 = null;
                Bundle bundleG11 = null;
                while (parcel.dataPosition() < iO14) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            bundleG9 = T2.g.g(parcel, i19);
                            break;
                        case 2:
                            c2951a2 = (C2951a) T2.g.i(parcel, i19, C2951a.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) T2.g.i(parcel, i19, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            strJ30 = T2.g.j(parcel, i19);
                            break;
                        case 5:
                            arrayListL7 = T2.g.l(parcel, i19);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) T2.g.i(parcel, i19, PackageInfo.CREATOR);
                            break;
                        case 7:
                            strJ31 = T2.g.j(parcel, i19);
                            break;
                        case '\b':
                        default:
                            T2.g.L(parcel, i19);
                            break;
                        case '\t':
                            strJ32 = T2.g.j(parcel, i19);
                            break;
                        case '\n':
                            c1823ru = (C1823ru) T2.g.i(parcel, i19, C1823ru.CREATOR);
                            break;
                        case 11:
                            strJ33 = T2.g.j(parcel, i19);
                            break;
                        case '\f':
                            zD22 = T2.g.D(parcel, i19);
                            break;
                        case '\r':
                            zD23 = T2.g.D(parcel, i19);
                            break;
                        case 14:
                            bundleG10 = T2.g.g(parcel, i19);
                            break;
                        case 15:
                            bundleG11 = T2.g.g(parcel, i19);
                            break;
                        case 16:
                            iH24 = T2.g.H(parcel, i19);
                            break;
                    }
                }
                T2.g.n(parcel, iO14);
                return new C1807re(bundleG9, c2951a2, applicationInfo2, strJ30, arrayListL7, packageInfo2, strJ31, strJ32, c1823ru, strJ33, zD22, zD23, bundleG10, bundleG11, iH24);
            case 14:
                int iO15 = T2.g.O(parcel);
                q2.a1 a1Var2 = null;
                String strJ34 = null;
                while (parcel.dataPosition() < iO15) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 2) {
                        a1Var2 = (q2.a1) T2.g.i(parcel, i20, q2.a1.CREATOR);
                    } else if (c14 != 3) {
                        T2.g.L(parcel, i20);
                    } else {
                        strJ34 = T2.g.j(parcel, i20);
                    }
                }
                T2.g.n(parcel, iO15);
                return new C0452Ce(strJ34, a1Var2);
            case 15:
                int iO16 = T2.g.O(parcel);
                int iH25 = 0;
                String strJ35 = null;
                while (parcel.dataPosition() < iO16) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 2) {
                        strJ35 = T2.g.j(parcel, i21);
                    } else if (c15 != 3) {
                        T2.g.L(parcel, i21);
                    } else {
                        iH25 = T2.g.H(parcel, i21);
                    }
                }
                T2.g.n(parcel, iO16);
                return new C0520Ge(strJ35, iH25);
            case 16:
                int iO17 = T2.g.O(parcel);
                String strJ36 = null;
                String strJ37 = null;
                while (parcel.dataPosition() < iO17) {
                    int i22 = parcel.readInt();
                    char c16 = (char) i22;
                    if (c16 == 1) {
                        strJ36 = T2.g.j(parcel, i22);
                    } else if (c16 != 2) {
                        T2.g.L(parcel, i22);
                    } else {
                        strJ37 = T2.g.j(parcel, i22);
                    }
                }
                T2.g.n(parcel, iO17);
                return new C0792We(strJ36, strJ37);
            case 17:
                int iO18 = T2.g.O(parcel);
                String strJ38 = null;
                String strJ39 = null;
                ArrayList arrayListL8 = null;
                ArrayList arrayListL9 = null;
                boolean zD24 = false;
                boolean zD25 = false;
                boolean zD26 = false;
                boolean zD27 = false;
                while (parcel.dataPosition() < iO18) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            strJ38 = T2.g.j(parcel, i23);
                            break;
                        case 3:
                            strJ39 = T2.g.j(parcel, i23);
                            break;
                        case 4:
                            zD24 = T2.g.D(parcel, i23);
                            break;
                        case 5:
                            zD25 = T2.g.D(parcel, i23);
                            break;
                        case 6:
                            arrayListL8 = T2.g.l(parcel, i23);
                            break;
                        case 7:
                            zD26 = T2.g.D(parcel, i23);
                            break;
                        case '\b':
                            zD27 = T2.g.D(parcel, i23);
                            break;
                        case '\t':
                            arrayListL9 = T2.g.l(parcel, i23);
                            break;
                        default:
                            T2.g.L(parcel, i23);
                            break;
                    }
                }
                T2.g.n(parcel, iO18);
                return new C0999cf(strJ38, strJ39, zD24, zD25, arrayListL8, zD26, zD27, arrayListL9);
            case 18:
                int iO19 = T2.g.O(parcel);
                String strJ40 = null;
                String strJ41 = null;
                q2.d1 d1Var2 = null;
                q2.a1 a1Var3 = null;
                String strJ42 = null;
                int iH26 = 0;
                while (parcel.dataPosition() < iO19) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            strJ40 = T2.g.j(parcel, i24);
                            break;
                        case 2:
                            strJ41 = T2.g.j(parcel, i24);
                            break;
                        case 3:
                            d1Var2 = (q2.d1) T2.g.i(parcel, i24, q2.d1.CREATOR);
                            break;
                        case 4:
                            a1Var3 = (q2.a1) T2.g.i(parcel, i24, q2.a1.CREATOR);
                            break;
                        case 5:
                            iH26 = T2.g.H(parcel, i24);
                            break;
                        case 6:
                            strJ42 = T2.g.j(parcel, i24);
                            break;
                        default:
                            T2.g.L(parcel, i24);
                            break;
                    }
                }
                T2.g.n(parcel, iO19);
                return new C0436Bf(strJ40, strJ41, d1Var2, a1Var3, iH26, strJ42);
            case 19:
                int iO20 = T2.g.O(parcel);
                int iH27 = 0;
                int iH28 = 0;
                int iH29 = 0;
                int iH30 = 0;
                int iH31 = 0;
                int iH32 = 0;
                String strJ43 = null;
                while (parcel.dataPosition() < iO20) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            iH27 = T2.g.H(parcel, i25);
                            break;
                        case 2:
                            iH28 = T2.g.H(parcel, i25);
                            break;
                        case 3:
                            iH29 = T2.g.H(parcel, i25);
                            break;
                        case 4:
                            iH30 = T2.g.H(parcel, i25);
                            break;
                        case 5:
                            strJ43 = T2.g.j(parcel, i25);
                            break;
                        case 6:
                            iH31 = T2.g.H(parcel, i25);
                            break;
                        case 7:
                            iH32 = T2.g.H(parcel, i25);
                            break;
                        default:
                            T2.g.L(parcel, i25);
                            break;
                    }
                }
                T2.g.n(parcel, iO20);
                return new C1823ru(iH27, iH28, iH29, iH30, strJ43, iH31, iH32);
            case 20:
                int iO21 = T2.g.O(parcel);
                byte[] bArrH2 = null;
                int iH33 = 0;
                while (parcel.dataPosition() < iO21) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 1) {
                        iH33 = T2.g.H(parcel, i26);
                    } else if (c17 != 2) {
                        T2.g.L(parcel, i26);
                    } else {
                        bArrH2 = T2.g.h(parcel, i26);
                    }
                }
                T2.g.n(parcel, iO21);
                return new Ow(iH33, bArrH2);
            case 21:
                int iO22 = T2.g.O(parcel);
                String strJ44 = null;
                int iH34 = 0;
                String strJ45 = null;
                while (parcel.dataPosition() < iO22) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 1) {
                        iH34 = T2.g.H(parcel, i27);
                    } else if (c18 == 2) {
                        strJ44 = T2.g.j(parcel, i27);
                    } else if (c18 != 3) {
                        T2.g.L(parcel, i27);
                    } else {
                        strJ45 = T2.g.j(parcel, i27);
                    }
                }
                T2.g.n(parcel, iO22);
                return new Qw(iH34, strJ44, strJ45);
            case 22:
                int iO23 = T2.g.O(parcel);
                byte[] bArrH3 = null;
                int iH35 = 0;
                while (parcel.dataPosition() < iO23) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 1) {
                        iH35 = T2.g.H(parcel, i28);
                    } else if (c19 != 2) {
                        T2.g.L(parcel, i28);
                    } else {
                        bArrH3 = T2.g.h(parcel, i28);
                    }
                }
                T2.g.n(parcel, iO23);
                return new Rw(iH35, bArrH3);
            case 23:
                int iO24 = T2.g.O(parcel);
                String strJ46 = null;
                String strJ47 = null;
                int iH36 = 0;
                int iH37 = 0;
                int iH38 = 0;
                while (parcel.dataPosition() < iO24) {
                    int i29 = parcel.readInt();
                    char c20 = (char) i29;
                    if (c20 == 1) {
                        iH36 = T2.g.H(parcel, i29);
                    } else if (c20 == 2) {
                        iH37 = T2.g.H(parcel, i29);
                    } else if (c20 == 3) {
                        strJ46 = T2.g.j(parcel, i29);
                    } else if (c20 == 4) {
                        strJ47 = T2.g.j(parcel, i29);
                    } else if (c20 != 5) {
                        T2.g.L(parcel, i29);
                    } else {
                        iH38 = T2.g.H(parcel, i29);
                    }
                }
                T2.g.n(parcel, iO24);
                return new Uw(iH36, iH37, iH38, strJ46, strJ47);
            case 24:
                int iO25 = T2.g.O(parcel);
                int iH39 = 0;
                byte[] bArrH4 = null;
                int iH40 = 0;
                while (parcel.dataPosition() < iO25) {
                    int i30 = parcel.readInt();
                    char c21 = (char) i30;
                    if (c21 == 1) {
                        iH39 = T2.g.H(parcel, i30);
                    } else if (c21 == 2) {
                        bArrH4 = T2.g.h(parcel, i30);
                    } else if (c21 != 3) {
                        T2.g.L(parcel, i30);
                    } else {
                        iH40 = T2.g.H(parcel, i30);
                    }
                }
                T2.g.n(parcel, iO25);
                return new Vw(iH39, iH40, bArrH4);
            case 25:
                return new SO(parcel);
            default:
                return new FO(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f16471a) {
            case 0:
                return new C1731q8[i];
            case 1:
                return new C1892t8[i];
            case 2:
                return new C0499Fa[i];
            case 3:
                return new C0653Ob[i];
            case 4:
                return new C0670Pb[i];
            case 5:
                return new C0772Vb[i];
            case 6:
                return new C0887ac[i];
            case 7:
                return new C0942bc[i];
            case 8:
                return new C2184yd[i];
            case 9:
                return new C0944be[i];
            case 10:
                return new C1216ge[i];
            case 11:
                return new C1270he[i];
            case 12:
                return new C1324ie[i];
            case 13:
                return new C1807re[i];
            case 14:
                return new C0452Ce[i];
            case 15:
                return new C0520Ge[i];
            case 16:
                return new C0792We[i];
            case 17:
                return new C0999cf[i];
            case 18:
                return new C0436Bf[i];
            case 19:
                return new C1823ru[i];
            case 20:
                return new Ow[i];
            case 21:
                return new Qw[i];
            case 22:
                return new Rw[i];
            case 23:
                return new Uw[i];
            case 24:
                return new Vw[i];
            case 25:
                return new SO[i];
            default:
                return new FO[i];
        }
    }
}
