package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ci implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10133a;

    public /* synthetic */ ci(int i4) {
        this.f10133a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10133a) {
            case 0:
                int iT = com.bumptech.glide.e.T(parcel);
                boolean zL = false;
                boolean zL2 = false;
                boolean zL3 = false;
                long jO = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iT) {
                    int i4 = parcel.readInt();
                    char c9 = (char) i4;
                    if (c9 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) com.bumptech.glide.e.v(parcel, i4, ParcelFileDescriptor.CREATOR);
                    } else if (c9 == 3) {
                        zL = com.bumptech.glide.e.L(parcel, i4);
                    } else if (c9 == 4) {
                        zL2 = com.bumptech.glide.e.L(parcel, i4);
                    } else if (c9 == 5) {
                        jO = com.bumptech.glide.e.O(parcel, i4);
                    } else if (c9 != 6) {
                        com.bumptech.glide.e.S(parcel, i4);
                    } else {
                        zL3 = com.bumptech.glide.e.L(parcel, i4);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT);
                return new bi(parcelFileDescriptor, zL, zL2, jO, zL3);
            case 1:
                int iT2 = com.bumptech.glide.e.T(parcel);
                boolean zL4 = false;
                int iN = 0;
                String strW = null;
                String strW2 = null;
                String strW3 = null;
                String strW4 = null;
                Bundle bundleS = null;
                String strW5 = null;
                long jO2 = 0;
                long jO3 = 0;
                while (parcel.dataPosition() < iT2) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strW = com.bumptech.glide.e.w(parcel, i10);
                            break;
                        case 3:
                            jO2 = com.bumptech.glide.e.O(parcel, i10);
                            break;
                        case 4:
                            strW2 = com.bumptech.glide.e.w(parcel, i10);
                            break;
                        case 5:
                            strW3 = com.bumptech.glide.e.w(parcel, i10);
                            break;
                        case 6:
                            strW4 = com.bumptech.glide.e.w(parcel, i10);
                            break;
                        case 7:
                            bundleS = com.bumptech.glide.e.s(parcel, i10);
                            break;
                        case '\b':
                            zL4 = com.bumptech.glide.e.L(parcel, i10);
                            break;
                        case '\t':
                            jO3 = com.bumptech.glide.e.O(parcel, i10);
                            break;
                        case '\n':
                            strW5 = com.bumptech.glide.e.w(parcel, i10);
                            break;
                        case 11:
                            iN = com.bumptech.glide.e.N(parcel, i10);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i10);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT2);
                return new ei(strW, jO2, strW2, strW3, strW4, bundleS, zL4, jO3, strW5, iN);
            case 2:
                int iT3 = com.bumptech.glide.e.T(parcel);
                int iN2 = 0;
                boolean zL5 = false;
                int iN3 = 0;
                boolean zL6 = false;
                int iN4 = 0;
                boolean zL7 = false;
                int iN5 = 0;
                int iN6 = 0;
                boolean zL8 = false;
                int iN7 = 0;
                va.x2 x2Var = null;
                while (parcel.dataPosition() < iT3) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iN2 = com.bumptech.glide.e.N(parcel, i11);
                            break;
                        case 2:
                            zL5 = com.bumptech.glide.e.L(parcel, i11);
                            break;
                        case 3:
                            iN3 = com.bumptech.glide.e.N(parcel, i11);
                            break;
                        case 4:
                            zL6 = com.bumptech.glide.e.L(parcel, i11);
                            break;
                        case 5:
                            iN4 = com.bumptech.glide.e.N(parcel, i11);
                            break;
                        case 6:
                            x2Var = (va.x2) com.bumptech.glide.e.v(parcel, i11, va.x2.CREATOR);
                            break;
                        case 7:
                            zL7 = com.bumptech.glide.e.L(parcel, i11);
                            break;
                        case '\b':
                            iN5 = com.bumptech.glide.e.N(parcel, i11);
                            break;
                        case '\t':
                            iN6 = com.bumptech.glide.e.N(parcel, i11);
                            break;
                        case '\n':
                            zL8 = com.bumptech.glide.e.L(parcel, i11);
                            break;
                        case 11:
                            iN7 = com.bumptech.glide.e.N(parcel, i11);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i11);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT3);
                return new qm(iN2, zL5, iN3, zL6, iN4, x2Var, zL7, iN5, iN6, zL8, iN7);
            case 3:
                int iT4 = com.bumptech.glide.e.T(parcel);
                String strW6 = null;
                String[] strArrX = null;
                String[] strArrX2 = null;
                while (parcel.dataPosition() < iT4) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        strW6 = com.bumptech.glide.e.w(parcel, i12);
                    } else if (c10 == 2) {
                        strArrX = com.bumptech.glide.e.x(parcel, i12);
                    } else if (c10 != 3) {
                        com.bumptech.glide.e.S(parcel, i12);
                    } else {
                        strArrX2 = com.bumptech.glide.e.x(parcel, i12);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT4);
                return new ap(strW6, strArrX, strArrX2);
            case 4:
                int iT5 = com.bumptech.glide.e.T(parcel);
                long jO4 = 0;
                boolean zL9 = false;
                int iN8 = 0;
                boolean zL10 = false;
                String strW7 = null;
                byte[] bArrT = null;
                String[] strArrX3 = null;
                String[] strArrX4 = null;
                while (parcel.dataPosition() < iT5) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            zL9 = com.bumptech.glide.e.L(parcel, i13);
                            break;
                        case 2:
                            strW7 = com.bumptech.glide.e.w(parcel, i13);
                            break;
                        case 3:
                            iN8 = com.bumptech.glide.e.N(parcel, i13);
                            break;
                        case 4:
                            bArrT = com.bumptech.glide.e.t(parcel, i13);
                            break;
                        case 5:
                            strArrX3 = com.bumptech.glide.e.x(parcel, i13);
                            break;
                        case 6:
                            strArrX4 = com.bumptech.glide.e.x(parcel, i13);
                            break;
                        case 7:
                            zL10 = com.bumptech.glide.e.L(parcel, i13);
                            break;
                        case '\b':
                            jO4 = com.bumptech.glide.e.O(parcel, i13);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i13);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT5);
                return new bp(zL9, strW7, iN8, bArrT, strArrX3, strArrX4, zL10, jO4);
            case 5:
                int iT6 = com.bumptech.glide.e.T(parcel);
                String strW8 = null;
                boolean zL11 = false;
                int iN9 = 0;
                String strW9 = null;
                while (parcel.dataPosition() < iT6) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        strW8 = com.bumptech.glide.e.w(parcel, i14);
                    } else if (c11 == 2) {
                        zL11 = com.bumptech.glide.e.L(parcel, i14);
                    } else if (c11 == 3) {
                        iN9 = com.bumptech.glide.e.N(parcel, i14);
                    } else if (c11 != 4) {
                        com.bumptech.glide.e.S(parcel, i14);
                    } else {
                        strW9 = com.bumptech.glide.e.w(parcel, i14);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT6);
                return new ip(strW8, iN9, strW9, zL11);
            case 6:
                int iT7 = com.bumptech.glide.e.T(parcel);
                String strW10 = null;
                Bundle bundleS2 = null;
                while (parcel.dataPosition() < iT7) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        strW10 = com.bumptech.glide.e.w(parcel, i15);
                    } else if (c12 != 2) {
                        com.bumptech.glide.e.S(parcel, i15);
                    } else {
                        bundleS2 = com.bumptech.glide.e.s(parcel, i15);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT7);
                return new np(bundleS2, strW10);
            case 7:
                int iT8 = com.bumptech.glide.e.T(parcel);
                int iN10 = 0;
                int iN11 = 0;
                String strW11 = null;
                int iN12 = 0;
                while (parcel.dataPosition() < iT8) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 1) {
                        iN12 = com.bumptech.glide.e.N(parcel, i16);
                    } else if (c13 == 2) {
                        strW11 = com.bumptech.glide.e.w(parcel, i16);
                    } else if (c13 == 3) {
                        iN11 = com.bumptech.glide.e.N(parcel, i16);
                    } else if (c13 != 1000) {
                        com.bumptech.glide.e.S(parcel, i16);
                    } else {
                        iN10 = com.bumptech.glide.e.N(parcel, i16);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT8);
                return new op(iN10, iN12, iN11, strW11);
            case 8:
                int iT9 = com.bumptech.glide.e.T(parcel);
                int iN13 = 0;
                int iN14 = 0;
                int iN15 = 0;
                while (parcel.dataPosition() < iT9) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 1) {
                        iN13 = com.bumptech.glide.e.N(parcel, i17);
                    } else if (c14 == 2) {
                        iN14 = com.bumptech.glide.e.N(parcel, i17);
                    } else if (c14 != 3) {
                        com.bumptech.glide.e.S(parcel, i17);
                    } else {
                        iN15 = com.bumptech.glide.e.N(parcel, i17);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT9);
                return new os(iN13, iN14, iN15);
            case 9:
                int iT10 = com.bumptech.glide.e.T(parcel);
                IBinder iBinderM = null;
                IBinder iBinderM2 = null;
                while (parcel.dataPosition() < iT10) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iBinderM = com.bumptech.glide.e.M(parcel, i18);
                    } else if (c15 != 2) {
                        com.bumptech.glide.e.S(parcel, i18);
                    } else {
                        iBinderM2 = com.bumptech.glide.e.M(parcel, i18);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT10);
                return new st(iBinderM, iBinderM2);
            case 10:
                int iT11 = com.bumptech.glide.e.T(parcel);
                Bundle bundleS3 = null;
                va.z2 z2Var = null;
                va.c3 c3Var = null;
                String strW12 = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String strW13 = null;
                String strW14 = null;
                String strW15 = null;
                za.a aVar = null;
                Bundle bundleS4 = null;
                ArrayList arrayListY = null;
                Bundle bundleS5 = null;
                String strW16 = null;
                String strW17 = null;
                ArrayList arrayListY2 = null;
                String strW18 = null;
                qm qmVar = null;
                ArrayList arrayListY3 = null;
                String strW19 = null;
                String strW20 = null;
                String strW21 = null;
                Bundle bundleS6 = null;
                String strW22 = null;
                va.c2 c2Var = null;
                Bundle bundleS7 = null;
                String strW23 = null;
                String strW24 = null;
                String strW25 = null;
                ArrayList arrayListU = null;
                String strW26 = null;
                ArrayList arrayListY4 = null;
                ArrayList arrayListY5 = null;
                String strW27 = null;
                op opVar = null;
                String strW28 = null;
                Bundle bundleS8 = null;
                int iN16 = 0;
                int iN17 = 0;
                boolean zL12 = false;
                int iN18 = 0;
                int iN19 = 0;
                boolean zL13 = false;
                int iN20 = 0;
                int iN21 = 0;
                boolean zL14 = false;
                boolean zL15 = false;
                int iN22 = 0;
                boolean zL16 = false;
                boolean zL17 = false;
                int iN23 = 0;
                boolean zL18 = false;
                boolean zL19 = false;
                boolean zL20 = false;
                float f10 = 0.0f;
                float f11 = 0.0f;
                long jO5 = 0;
                long jO6 = 0;
                while (parcel.dataPosition() < iT11) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iN16 = com.bumptech.glide.e.N(parcel, i19);
                            break;
                        case 2:
                            bundleS3 = com.bumptech.glide.e.s(parcel, i19);
                            break;
                        case 3:
                            z2Var = (va.z2) com.bumptech.glide.e.v(parcel, i19, va.z2.CREATOR);
                            break;
                        case 4:
                            c3Var = (va.c3) com.bumptech.glide.e.v(parcel, i19, va.c3.CREATOR);
                            break;
                        case 5:
                            strW12 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) com.bumptech.glide.e.v(parcel, i19, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) com.bumptech.glide.e.v(parcel, i19, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            strW13 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case '\t':
                            strW14 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case '\n':
                            strW15 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case 11:
                            aVar = (za.a) com.bumptech.glide.e.v(parcel, i19, za.a.CREATOR);
                            break;
                        case '\f':
                            bundleS4 = com.bumptech.glide.e.s(parcel, i19);
                            break;
                        case '\r':
                            iN17 = com.bumptech.glide.e.N(parcel, i19);
                            break;
                        case 14:
                            arrayListY = com.bumptech.glide.e.y(parcel, i19);
                            break;
                        case 15:
                            bundleS5 = com.bumptech.glide.e.s(parcel, i19);
                            break;
                        case 16:
                            zL12 = com.bumptech.glide.e.L(parcel, i19);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                        case '>':
                        default:
                            com.bumptech.glide.e.S(parcel, i19);
                            break;
                        case 18:
                            iN18 = com.bumptech.glide.e.N(parcel, i19);
                            break;
                        case 19:
                            iN19 = com.bumptech.glide.e.N(parcel, i19);
                            break;
                        case 20:
                            com.bumptech.glide.e.V(parcel, i19, 4);
                            f10 = parcel.readFloat();
                            break;
                        case 21:
                            strW16 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case 25:
                            jO5 = com.bumptech.glide.e.O(parcel, i19);
                            break;
                        case 26:
                            strW17 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case 27:
                            arrayListY2 = com.bumptech.glide.e.y(parcel, i19);
                            break;
                        case 28:
                            strW18 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case 29:
                            qmVar = (qm) com.bumptech.glide.e.v(parcel, i19, qm.CREATOR);
                            break;
                        case 30:
                            arrayListY3 = com.bumptech.glide.e.y(parcel, i19);
                            break;
                        case 31:
                            jO6 = com.bumptech.glide.e.O(parcel, i19);
                            break;
                        case '!':
                            strW19 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case '\"':
                            com.bumptech.glide.e.V(parcel, i19, 4);
                            f11 = parcel.readFloat();
                            break;
                        case '#':
                            iN20 = com.bumptech.glide.e.N(parcel, i19);
                            break;
                        case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                            iN21 = com.bumptech.glide.e.N(parcel, i19);
                            break;
                        case '%':
                            zL14 = com.bumptech.glide.e.L(parcel, i19);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                            strW20 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                            zL13 = com.bumptech.glide.e.L(parcel, i19);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                            strW21 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case '*':
                            zL15 = com.bumptech.glide.e.L(parcel, i19);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                            iN22 = com.bumptech.glide.e.N(parcel, i19);
                            break;
                        case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                            bundleS6 = com.bumptech.glide.e.s(parcel, i19);
                            break;
                        case '-':
                            strW22 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case '.':
                            c2Var = (va.c2) com.bumptech.glide.e.v(parcel, i19, va.c2.CREATOR);
                            break;
                        case '/':
                            zL16 = com.bumptech.glide.e.L(parcel, i19);
                            break;
                        case '0':
                            bundleS7 = com.bumptech.glide.e.s(parcel, i19);
                            break;
                        case '1':
                            strW23 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                            strW24 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case '3':
                            strW25 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case '4':
                            zL17 = com.bumptech.glide.e.L(parcel, i19);
                            break;
                        case '5':
                            arrayListU = com.bumptech.glide.e.u(parcel, i19);
                            break;
                        case '6':
                            strW26 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case '7':
                            arrayListY4 = com.bumptech.glide.e.y(parcel, i19);
                            break;
                        case '8':
                            iN23 = com.bumptech.glide.e.N(parcel, i19);
                            break;
                        case '9':
                            zL18 = com.bumptech.glide.e.L(parcel, i19);
                            break;
                        case ':':
                            zL19 = com.bumptech.glide.e.L(parcel, i19);
                            break;
                        case ';':
                            zL20 = com.bumptech.glide.e.L(parcel, i19);
                            break;
                        case '<':
                            arrayListY5 = com.bumptech.glide.e.y(parcel, i19);
                            break;
                        case '=':
                            strW27 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case '?':
                            opVar = (op) com.bumptech.glide.e.v(parcel, i19, op.CREATOR);
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                            strW28 = com.bumptech.glide.e.w(parcel, i19);
                            break;
                        case 'A':
                            bundleS8 = com.bumptech.glide.e.s(parcel, i19);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT11);
                return new xt(iN16, bundleS3, z2Var, c3Var, strW12, applicationInfo, packageInfo, strW13, strW14, strW15, aVar, bundleS4, iN17, arrayListY, bundleS5, zL12, iN18, iN19, f10, strW16, jO5, strW17, arrayListY2, strW18, qmVar, arrayListY3, jO6, strW19, f11, zL13, iN20, iN21, zL14, strW20, strW21, zL15, iN22, bundleS6, strW22, c2Var, zL16, bundleS7, strW23, strW24, strW25, zL17, arrayListU, strW26, arrayListY4, iN23, zL18, zL19, zL20, arrayListY5, strW27, opVar, strW28, bundleS8);
            case 11:
                int iT12 = com.bumptech.glide.e.T(parcel);
                ArrayList arrayListY6 = null;
                boolean zL21 = false;
                while (parcel.dataPosition() < iT12) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 2) {
                        zL21 = com.bumptech.glide.e.L(parcel, i20);
                    } else if (c16 != 3) {
                        com.bumptech.glide.e.S(parcel, i20);
                    } else {
                        arrayListY6 = com.bumptech.glide.e.y(parcel, i20);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT12);
                return new yt(arrayListY6, zL21);
            case 12:
                int iT13 = com.bumptech.glide.e.T(parcel);
                String strW29 = null;
                while (parcel.dataPosition() < iT13) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        com.bumptech.glide.e.S(parcel, i21);
                    } else {
                        strW29 = com.bumptech.glide.e.w(parcel, i21);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT13);
                return new zt(strW29);
            case 13:
                int iT14 = com.bumptech.glide.e.T(parcel);
                boolean zL22 = false;
                boolean zL23 = false;
                int iN24 = 0;
                Bundle bundleS9 = null;
                za.a aVar2 = null;
                ApplicationInfo applicationInfo2 = null;
                String strW30 = null;
                ArrayList arrayListY7 = null;
                PackageInfo packageInfo2 = null;
                String strW31 = null;
                String strW32 = null;
                zq0 zq0Var = null;
                String strW33 = null;
                Bundle bundleS10 = null;
                Bundle bundleS11 = null;
                while (parcel.dataPosition() < iT14) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            bundleS9 = com.bumptech.glide.e.s(parcel, i22);
                            break;
                        case 2:
                            aVar2 = (za.a) com.bumptech.glide.e.v(parcel, i22, za.a.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) com.bumptech.glide.e.v(parcel, i22, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            strW30 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case 5:
                            arrayListY7 = com.bumptech.glide.e.y(parcel, i22);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) com.bumptech.glide.e.v(parcel, i22, PackageInfo.CREATOR);
                            break;
                        case 7:
                            strW31 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case '\b':
                        default:
                            com.bumptech.glide.e.S(parcel, i22);
                            break;
                        case '\t':
                            strW32 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case '\n':
                            zq0Var = (zq0) com.bumptech.glide.e.v(parcel, i22, zq0.CREATOR);
                            break;
                        case 11:
                            strW33 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case '\f':
                            zL22 = com.bumptech.glide.e.L(parcel, i22);
                            break;
                        case '\r':
                            zL23 = com.bumptech.glide.e.L(parcel, i22);
                            break;
                        case 14:
                            bundleS10 = com.bumptech.glide.e.s(parcel, i22);
                            break;
                        case 15:
                            bundleS11 = com.bumptech.glide.e.s(parcel, i22);
                            break;
                        case 16:
                            iN24 = com.bumptech.glide.e.N(parcel, i22);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT14);
                return new iu(bundleS9, aVar2, applicationInfo2, strW30, arrayListY7, packageInfo2, strW31, strW32, zq0Var, strW33, zL22, zL23, bundleS10, bundleS11, iN24);
            case 14:
                int iT15 = com.bumptech.glide.e.T(parcel);
                va.z2 z2Var2 = null;
                String strW34 = null;
                while (parcel.dataPosition() < iT15) {
                    int i23 = parcel.readInt();
                    char c17 = (char) i23;
                    if (c17 == 2) {
                        z2Var2 = (va.z2) com.bumptech.glide.e.v(parcel, i23, va.z2.CREATOR);
                    } else if (c17 != 3) {
                        com.bumptech.glide.e.S(parcel, i23);
                    } else {
                        strW34 = com.bumptech.glide.e.w(parcel, i23);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT15);
                return new tu(strW34, z2Var2);
            case 15:
                int iT16 = com.bumptech.glide.e.T(parcel);
                int iN25 = 0;
                String strW35 = null;
                while (parcel.dataPosition() < iT16) {
                    int i24 = parcel.readInt();
                    char c18 = (char) i24;
                    if (c18 == 2) {
                        strW35 = com.bumptech.glide.e.w(parcel, i24);
                    } else if (c18 != 3) {
                        com.bumptech.glide.e.S(parcel, i24);
                    } else {
                        iN25 = com.bumptech.glide.e.N(parcel, i24);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT16);
                return new xu(strW35, iN25);
            case 16:
                int iT17 = com.bumptech.glide.e.T(parcel);
                String strW36 = null;
                String strW37 = null;
                while (parcel.dataPosition() < iT17) {
                    int i25 = parcel.readInt();
                    char c19 = (char) i25;
                    if (c19 == 1) {
                        strW36 = com.bumptech.glide.e.w(parcel, i25);
                    } else if (c19 != 2) {
                        com.bumptech.glide.e.S(parcel, i25);
                    } else {
                        strW37 = com.bumptech.glide.e.w(parcel, i25);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT17);
                return new nv(strW36, strW37);
            case 17:
                int iT18 = com.bumptech.glide.e.T(parcel);
                String strW38 = null;
                String strW39 = null;
                ArrayList arrayListY8 = null;
                ArrayList arrayListY9 = null;
                boolean zL24 = false;
                boolean zL25 = false;
                boolean zL26 = false;
                boolean zL27 = false;
                while (parcel.dataPosition() < iT18) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            strW38 = com.bumptech.glide.e.w(parcel, i26);
                            break;
                        case 3:
                            strW39 = com.bumptech.glide.e.w(parcel, i26);
                            break;
                        case 4:
                            zL24 = com.bumptech.glide.e.L(parcel, i26);
                            break;
                        case 5:
                            zL25 = com.bumptech.glide.e.L(parcel, i26);
                            break;
                        case 6:
                            arrayListY8 = com.bumptech.glide.e.y(parcel, i26);
                            break;
                        case 7:
                            zL26 = com.bumptech.glide.e.L(parcel, i26);
                            break;
                        case '\b':
                            zL27 = com.bumptech.glide.e.L(parcel, i26);
                            break;
                        case '\t':
                            arrayListY9 = com.bumptech.glide.e.y(parcel, i26);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i26);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT18);
                return new tv(strW38, strW39, zL24, zL25, arrayListY8, zL26, zL27, arrayListY9);
            case 18:
                int iT19 = com.bumptech.glide.e.T(parcel);
                String strW40 = null;
                String strW41 = null;
                va.c3 c3Var2 = null;
                va.z2 z2Var3 = null;
                String strW42 = null;
                int iN26 = 0;
                while (parcel.dataPosition() < iT19) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            strW40 = com.bumptech.glide.e.w(parcel, i27);
                            break;
                        case 2:
                            strW41 = com.bumptech.glide.e.w(parcel, i27);
                            break;
                        case 3:
                            c3Var2 = (va.c3) com.bumptech.glide.e.v(parcel, i27, va.c3.CREATOR);
                            break;
                        case 4:
                            z2Var3 = (va.z2) com.bumptech.glide.e.v(parcel, i27, va.z2.CREATOR);
                            break;
                        case 5:
                            iN26 = com.bumptech.glide.e.N(parcel, i27);
                            break;
                        case 6:
                            strW42 = com.bumptech.glide.e.w(parcel, i27);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i27);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT19);
                return new rw(strW40, strW41, c3Var2, z2Var3, iN26, strW42);
            case 19:
                int iT20 = com.bumptech.glide.e.T(parcel);
                int iN27 = 0;
                int iN28 = 0;
                int iN29 = 0;
                int iN30 = 0;
                int iN31 = 0;
                int iN32 = 0;
                String strW43 = null;
                while (parcel.dataPosition() < iT20) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            iN27 = com.bumptech.glide.e.N(parcel, i28);
                            break;
                        case 2:
                            iN28 = com.bumptech.glide.e.N(parcel, i28);
                            break;
                        case 3:
                            iN29 = com.bumptech.glide.e.N(parcel, i28);
                            break;
                        case 4:
                            iN30 = com.bumptech.glide.e.N(parcel, i28);
                            break;
                        case 5:
                            strW43 = com.bumptech.glide.e.w(parcel, i28);
                            break;
                        case 6:
                            iN31 = com.bumptech.glide.e.N(parcel, i28);
                            break;
                        case 7:
                            iN32 = com.bumptech.glide.e.N(parcel, i28);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i28);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT20);
                return new zq0(iN27, iN28, iN29, iN30, strW43, iN31, iN32);
            case 20:
                int iT21 = com.bumptech.glide.e.T(parcel);
                byte[] bArrT2 = null;
                int iN33 = 0;
                while (parcel.dataPosition() < iT21) {
                    int i29 = parcel.readInt();
                    char c20 = (char) i29;
                    if (c20 == 1) {
                        iN33 = com.bumptech.glide.e.N(parcel, i29);
                    } else if (c20 != 2) {
                        com.bumptech.glide.e.S(parcel, i29);
                    } else {
                        bArrT2 = com.bumptech.glide.e.t(parcel, i29);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT21);
                return new sv0(iN33, bArrT2);
            case 21:
                int iT22 = com.bumptech.glide.e.T(parcel);
                String strW44 = null;
                int iN34 = 0;
                String strW45 = null;
                while (parcel.dataPosition() < iT22) {
                    int i30 = parcel.readInt();
                    char c21 = (char) i30;
                    if (c21 == 1) {
                        iN34 = com.bumptech.glide.e.N(parcel, i30);
                    } else if (c21 == 2) {
                        strW44 = com.bumptech.glide.e.w(parcel, i30);
                    } else if (c21 != 3) {
                        com.bumptech.glide.e.S(parcel, i30);
                    } else {
                        strW45 = com.bumptech.glide.e.w(parcel, i30);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT22);
                return new uv0(iN34, strW44, strW45);
            case 22:
                int iT23 = com.bumptech.glide.e.T(parcel);
                byte[] bArrT3 = null;
                int iN35 = 0;
                while (parcel.dataPosition() < iT23) {
                    int i31 = parcel.readInt();
                    char c22 = (char) i31;
                    if (c22 == 1) {
                        iN35 = com.bumptech.glide.e.N(parcel, i31);
                    } else if (c22 != 2) {
                        com.bumptech.glide.e.S(parcel, i31);
                    } else {
                        bArrT3 = com.bumptech.glide.e.t(parcel, i31);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT23);
                return new vv0(iN35, bArrT3);
            case 23:
                int iT24 = com.bumptech.glide.e.T(parcel);
                String strW46 = null;
                String strW47 = null;
                int iN36 = 0;
                int iN37 = 0;
                int iN38 = 0;
                while (parcel.dataPosition() < iT24) {
                    int i32 = parcel.readInt();
                    char c23 = (char) i32;
                    if (c23 == 1) {
                        iN36 = com.bumptech.glide.e.N(parcel, i32);
                    } else if (c23 == 2) {
                        iN37 = com.bumptech.glide.e.N(parcel, i32);
                    } else if (c23 == 3) {
                        strW46 = com.bumptech.glide.e.w(parcel, i32);
                    } else if (c23 == 4) {
                        strW47 = com.bumptech.glide.e.w(parcel, i32);
                    } else if (c23 != 5) {
                        com.bumptech.glide.e.S(parcel, i32);
                    } else {
                        iN38 = com.bumptech.glide.e.N(parcel, i32);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT24);
                return new yv0(iN36, iN37, iN38, strW46, strW47);
            case 24:
                int iT25 = com.bumptech.glide.e.T(parcel);
                int iN39 = 0;
                byte[] bArrT4 = null;
                int iN40 = 0;
                while (parcel.dataPosition() < iT25) {
                    int i33 = parcel.readInt();
                    char c24 = (char) i33;
                    if (c24 == 1) {
                        iN39 = com.bumptech.glide.e.N(parcel, i33);
                    } else if (c24 == 2) {
                        bArrT4 = com.bumptech.glide.e.t(parcel, i33);
                    } else if (c24 != 3) {
                        com.bumptech.glide.e.S(parcel, i33);
                    } else {
                        iN40 = com.bumptech.glide.e.N(parcel, i33);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT25);
                return new zv0(iN39, iN40, bArrT4);
            case 25:
                return new iv1(parcel);
            default:
                return new vu1(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.f10133a) {
            case 0:
                return new bi[i4];
            case 1:
                return new ei[i4];
            case 2:
                return new qm[i4];
            case 3:
                return new ap[i4];
            case 4:
                return new bp[i4];
            case 5:
                return new ip[i4];
            case 6:
                return new np[i4];
            case 7:
                return new op[i4];
            case 8:
                return new os[i4];
            case 9:
                return new st[i4];
            case 10:
                return new xt[i4];
            case 11:
                return new yt[i4];
            case 12:
                return new zt[i4];
            case 13:
                return new iu[i4];
            case 14:
                return new tu[i4];
            case 15:
                return new xu[i4];
            case 16:
                return new nv[i4];
            case 17:
                return new tv[i4];
            case 18:
                return new rw[i4];
            case 19:
                return new zq0[i4];
            case 20:
                return new sv0[i4];
            case 21:
                return new uv0[i4];
            case 22:
                return new vv0[i4];
            case 23:
                return new yv0[i4];
            case 24:
                return new zv0[i4];
            case 25:
                return new iv1[i4];
            default:
                return new vu1[i4];
        }
    }
}
