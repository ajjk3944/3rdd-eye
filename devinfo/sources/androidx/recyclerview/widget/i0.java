package androidx.recyclerview.widget;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.liuzh.deviceinfo.pro.account.Sku;
import ec.a4;
import ec.i4;
import ec.n4;
import ec.v3;
import ec.y3;
import ec.z3;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1410a;

    public /* synthetic */ i0(int i4) {
        this.f1410a = i4;
    }

    public static void a(ec.u uVar, Parcel parcel, int i4) {
        String str = uVar.f23085a;
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 2, str);
        com.bumptech.glide.f.H(parcel, 3, uVar.f23086b, i4);
        com.bumptech.glide.f.I(parcel, 4, uVar.f23087c);
        long j = uVar.f23088d;
        com.bumptech.glide.f.N(parcel, 5, 8);
        parcel.writeLong(j);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public static void b(i4 i4Var, Parcel parcel) {
        int i4 = i4Var.f22799a;
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(i4);
        com.bumptech.glide.f.I(parcel, 2, i4Var.f22800b);
        long j = i4Var.f22801c;
        com.bumptech.glide.f.N(parcel, 3, 8);
        parcel.writeLong(j);
        Long l10 = i4Var.f22802d;
        if (l10 != null) {
            com.bumptech.glide.f.N(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        com.bumptech.glide.f.I(parcel, 6, i4Var.f22803e);
        com.bumptech.glide.f.I(parcel, 7, i4Var.f22804f);
        Double d10 = i4Var.g;
        if (d10 != null) {
            com.bumptech.glide.f.N(parcel, 8, 8);
            parcel.writeDouble(d10.doubleValue());
        }
        com.bumptech.glide.f.P(parcel, iO);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1410a) {
            case 0:
                j0 j0Var = new j0();
                j0Var.f1417a = parcel.readInt();
                j0Var.f1418b = parcel.readInt();
                j0Var.f1419c = parcel.readInt() == 1;
                return j0Var;
            case 1:
                e2 e2Var = new e2();
                e2Var.f1345a = parcel.readInt();
                e2Var.f1346b = parcel.readInt();
                e2Var.f1348d = parcel.readInt() == 1;
                int i4 = parcel.readInt();
                if (i4 > 0) {
                    int[] iArr = new int[i4];
                    e2Var.f1347c = iArr;
                    parcel.readIntArray(iArr);
                }
                return e2Var;
            case 2:
                f2 f2Var = new f2();
                f2Var.f1357a = parcel.readInt();
                f2Var.f1358b = parcel.readInt();
                int i10 = parcel.readInt();
                f2Var.f1359c = i10;
                if (i10 > 0) {
                    int[] iArr2 = new int[i10];
                    f2Var.f1360d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i11 = parcel.readInt();
                f2Var.f1361e = i11;
                if (i11 > 0) {
                    int[] iArr3 = new int[i11];
                    f2Var.f1362f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                f2Var.f1363h = parcel.readInt() == 1;
                f2Var.f1364i = parcel.readInt() == 1;
                f2Var.j = parcel.readInt() == 1;
                f2Var.g = parcel.readArrayList(e2.class.getClassLoader());
                return f2Var;
            case 3:
                return new b5.b(parcel);
            case 4:
                return new b5.c(parcel);
            case 5:
                b5.p0 p0Var = new b5.p0();
                p0Var.f1849a = parcel.readString();
                p0Var.f1850b = parcel.readInt();
                return p0Var;
            case 6:
                b5.v0 v0Var = new b5.v0();
                v0Var.f1906e = null;
                v0Var.f1907f = new ArrayList();
                v0Var.g = new ArrayList();
                v0Var.f1902a = parcel.createStringArrayList();
                v0Var.f1903b = parcel.createStringArrayList();
                v0Var.f1904c = (b5.b[]) parcel.createTypedArray(b5.b.CREATOR);
                v0Var.f1905d = parcel.readInt();
                v0Var.f1906e = parcel.readString();
                v0Var.f1907f = parcel.createStringArrayList();
                v0Var.g = parcel.createTypedArrayList(b5.c.CREATOR);
                v0Var.f1908h = parcel.createTypedArrayList(b5.p0.CREATOR);
                return v0Var;
            case 7:
                return new b5.z0(parcel);
            case 8:
                nk.k.e(parcel, "parcel");
                return new Sku(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
            case 9:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 10:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 11:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 12:
                int iT = com.bumptech.glide.e.T(parcel);
                long jO = 0;
                long jO2 = 0;
                int iN = 0;
                while (parcel.dataPosition() < iT) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        jO = com.bumptech.glide.e.O(parcel, i12);
                    } else if (c9 == 2) {
                        iN = com.bumptech.glide.e.N(parcel, i12);
                    } else if (c9 != 3) {
                        com.bumptech.glide.e.S(parcel, i12);
                    } else {
                        jO2 = com.bumptech.glide.e.O(parcel, i12);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT);
                return new ec.d(jO, jO2, iN);
            case 13:
                int iT2 = com.bumptech.glide.e.T(parcel);
                String strW = null;
                String strW2 = null;
                i4 i4Var = null;
                String strW3 = null;
                ec.u uVar = null;
                ec.u uVar2 = null;
                ec.u uVar3 = null;
                long jO3 = 0;
                long jO4 = 0;
                long jO5 = 0;
                boolean zL = false;
                while (parcel.dataPosition() < iT2) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strW = com.bumptech.glide.e.w(parcel, i13);
                            break;
                        case 3:
                            strW2 = com.bumptech.glide.e.w(parcel, i13);
                            break;
                        case 4:
                            i4Var = (i4) com.bumptech.glide.e.v(parcel, i13, i4.CREATOR);
                            break;
                        case 5:
                            jO3 = com.bumptech.glide.e.O(parcel, i13);
                            break;
                        case 6:
                            zL = com.bumptech.glide.e.L(parcel, i13);
                            break;
                        case 7:
                            strW3 = com.bumptech.glide.e.w(parcel, i13);
                            break;
                        case '\b':
                            uVar = (ec.u) com.bumptech.glide.e.v(parcel, i13, ec.u.CREATOR);
                            break;
                        case '\t':
                            jO4 = com.bumptech.glide.e.O(parcel, i13);
                            break;
                        case '\n':
                            uVar2 = (ec.u) com.bumptech.glide.e.v(parcel, i13, ec.u.CREATOR);
                            break;
                        case 11:
                            jO5 = com.bumptech.glide.e.O(parcel, i13);
                            break;
                        case '\f':
                            uVar3 = (ec.u) com.bumptech.glide.e.v(parcel, i13, ec.u.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i13);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT2);
                return new ec.e(strW, strW2, i4Var, jO3, zL, strW3, uVar, jO4, uVar2, jO5, uVar3);
            case 14:
                int iT3 = com.bumptech.glide.e.T(parcel);
                Bundle bundleS = null;
                while (parcel.dataPosition() < iT3) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        com.bumptech.glide.e.S(parcel, i14);
                    } else {
                        bundleS = com.bumptech.glide.e.s(parcel, i14);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT3);
                return new ec.i(bundleS);
            case 15:
                int iT4 = com.bumptech.glide.e.T(parcel);
                Bundle bundleS2 = null;
                while (parcel.dataPosition() < iT4) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        com.bumptech.glide.e.S(parcel, i15);
                    } else {
                        bundleS2 = com.bumptech.glide.e.s(parcel, i15);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT4);
                return new ec.t(bundleS2);
            case 16:
                int iT5 = com.bumptech.glide.e.T(parcel);
                long jO6 = 0;
                String strW4 = null;
                ec.t tVar = null;
                String strW5 = null;
                while (parcel.dataPosition() < iT5) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 2) {
                        strW4 = com.bumptech.glide.e.w(parcel, i16);
                    } else if (c10 == 3) {
                        tVar = (ec.t) com.bumptech.glide.e.v(parcel, i16, ec.t.CREATOR);
                    } else if (c10 == 4) {
                        strW5 = com.bumptech.glide.e.w(parcel, i16);
                    } else if (c10 != 5) {
                        com.bumptech.glide.e.S(parcel, i16);
                    } else {
                        jO6 = com.bumptech.glide.e.O(parcel, i16);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT5);
                return new ec.u(strW4, tVar, strW5, jO6);
            case 17:
                int iT6 = com.bumptech.glide.e.T(parcel);
                int iN2 = 0;
                long jO7 = 0;
                String strW6 = null;
                while (parcel.dataPosition() < iT6) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        strW6 = com.bumptech.glide.e.w(parcel, i17);
                    } else if (c11 == 2) {
                        jO7 = com.bumptech.glide.e.O(parcel, i17);
                    } else if (c11 != 3) {
                        com.bumptech.glide.e.S(parcel, i17);
                    } else {
                        iN2 = com.bumptech.glide.e.N(parcel, i17);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT6);
                return new v3(iN2, jO7, strW6);
            case 18:
                int iT7 = com.bumptech.glide.e.T(parcel);
                byte[] bArrT = null;
                String strW7 = null;
                Bundle bundleS3 = null;
                String strW8 = null;
                long jO8 = 0;
                long jO9 = 0;
                int iN3 = 0;
                while (parcel.dataPosition() < iT7) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            jO8 = com.bumptech.glide.e.O(parcel, i18);
                            break;
                        case 2:
                            bArrT = com.bumptech.glide.e.t(parcel, i18);
                            break;
                        case 3:
                            strW7 = com.bumptech.glide.e.w(parcel, i18);
                            break;
                        case 4:
                            bundleS3 = com.bumptech.glide.e.s(parcel, i18);
                            break;
                        case 5:
                            iN3 = com.bumptech.glide.e.N(parcel, i18);
                            break;
                        case 6:
                            jO9 = com.bumptech.glide.e.O(parcel, i18);
                            break;
                        case 7:
                            strW8 = com.bumptech.glide.e.w(parcel, i18);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i18);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT7);
                return new y3(jO8, bArrT, strW7, bundleS3, iN3, jO9, strW8);
            case 19:
                int iT8 = com.bumptech.glide.e.T(parcel);
                ArrayList arrayListU = null;
                while (parcel.dataPosition() < iT8) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        com.bumptech.glide.e.S(parcel, i19);
                    } else {
                        arrayListU = com.bumptech.glide.e.u(parcel, i19);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT8);
                return new z3(arrayListU);
            case 20:
                int iT9 = com.bumptech.glide.e.T(parcel);
                ArrayList arrayListA = null;
                while (parcel.dataPosition() < iT9) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        com.bumptech.glide.e.S(parcel, i20);
                    } else {
                        arrayListA = com.bumptech.glide.e.A(parcel, i20, y3.CREATOR);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT9);
                return new a4(arrayListA);
            case 21:
                int iT10 = com.bumptech.glide.e.T(parcel);
                String strW9 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strW10 = null;
                String strW11 = null;
                Double dValueOf = null;
                long jO10 = 0;
                int iN4 = 0;
                while (parcel.dataPosition() < iT10) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iN4 = com.bumptech.glide.e.N(parcel, i21);
                            break;
                        case 2:
                            strW9 = com.bumptech.glide.e.w(parcel, i21);
                            break;
                        case 3:
                            jO10 = com.bumptech.glide.e.O(parcel, i21);
                            break;
                        case 4:
                            int iP = com.bumptech.glide.e.P(parcel, i21);
                            if (iP != 0) {
                                com.bumptech.glide.e.X(parcel, iP, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                                break;
                            } else {
                                lValueOf = null;
                                break;
                            }
                        case 5:
                            int iP2 = com.bumptech.glide.e.P(parcel, i21);
                            if (iP2 != 0) {
                                com.bumptech.glide.e.X(parcel, iP2, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                                break;
                            } else {
                                fValueOf = null;
                                break;
                            }
                        case 6:
                            strW10 = com.bumptech.glide.e.w(parcel, i21);
                            break;
                        case 7:
                            strW11 = com.bumptech.glide.e.w(parcel, i21);
                            break;
                        case '\b':
                            int iP3 = com.bumptech.glide.e.P(parcel, i21);
                            if (iP3 != 0) {
                                com.bumptech.glide.e.X(parcel, iP3, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                dValueOf = null;
                                break;
                            }
                        default:
                            com.bumptech.glide.e.S(parcel, i21);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT10);
                return new i4(iN4, strW9, jO10, lValueOf, fValueOf, strW10, strW11, dValueOf);
            case 22:
                int iT11 = com.bumptech.glide.e.T(parcel);
                boolean zL2 = false;
                int iN5 = 0;
                boolean zL3 = false;
                boolean zL4 = false;
                int iN6 = 0;
                int iN7 = 0;
                long jO11 = 0;
                long jO12 = 0;
                long jO13 = 0;
                long jO14 = 0;
                long jO15 = 0;
                long jO16 = 0;
                long jO17 = 0;
                String strW12 = "";
                String strW13 = strW12;
                String strW14 = strW13;
                String strW15 = strW14;
                String strW16 = null;
                String strW17 = null;
                String strW18 = null;
                String strW19 = null;
                String strW20 = null;
                String strW21 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListY = null;
                String strW22 = null;
                String strW23 = null;
                int iN8 = 100;
                boolean zL5 = true;
                boolean zL6 = true;
                long jO18 = -2147483648L;
                while (parcel.dataPosition() < iT11) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strW16 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case 3:
                            strW17 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case 4:
                            strW18 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case 5:
                            strW19 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case 6:
                            jO11 = com.bumptech.glide.e.O(parcel, i22);
                            break;
                        case 7:
                            jO12 = com.bumptech.glide.e.O(parcel, i22);
                            break;
                        case '\b':
                            strW20 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case '\t':
                            zL5 = com.bumptech.glide.e.L(parcel, i22);
                            break;
                        case '\n':
                            zL2 = com.bumptech.glide.e.L(parcel, i22);
                            break;
                        case 11:
                            jO18 = com.bumptech.glide.e.O(parcel, i22);
                            break;
                        case '\f':
                            strW21 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            com.bumptech.glide.e.S(parcel, i22);
                            break;
                        case 14:
                            jO13 = com.bumptech.glide.e.O(parcel, i22);
                            break;
                        case 15:
                            iN5 = com.bumptech.glide.e.N(parcel, i22);
                            break;
                        case 16:
                            zL6 = com.bumptech.glide.e.L(parcel, i22);
                            break;
                        case 18:
                            zL3 = com.bumptech.glide.e.L(parcel, i22);
                            break;
                        case 21:
                            int iP4 = com.bumptech.glide.e.P(parcel, i22);
                            if (iP4 != 0) {
                                com.bumptech.glide.e.X(parcel, iP4, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        case 22:
                            jO14 = com.bumptech.glide.e.O(parcel, i22);
                            break;
                        case 23:
                            arrayListY = com.bumptech.glide.e.y(parcel, i22);
                            break;
                        case 25:
                            strW12 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case 26:
                            strW13 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case 27:
                            strW22 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case 28:
                            zL4 = com.bumptech.glide.e.L(parcel, i22);
                            break;
                        case 29:
                            jO15 = com.bumptech.glide.e.O(parcel, i22);
                            break;
                        case 30:
                            iN8 = com.bumptech.glide.e.N(parcel, i22);
                            break;
                        case 31:
                            strW14 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case ' ':
                            iN6 = com.bumptech.glide.e.N(parcel, i22);
                            break;
                        case '\"':
                            jO16 = com.bumptech.glide.e.O(parcel, i22);
                            break;
                        case '#':
                            strW23 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                            strW15 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case '%':
                            jO17 = com.bumptech.glide.e.O(parcel, i22);
                            break;
                        case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                            iN7 = com.bumptech.glide.e.N(parcel, i22);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT11);
                return new n4(strW16, strW17, strW18, strW19, jO11, jO12, strW20, zL5, zL2, jO18, strW21, jO13, iN5, zL6, zL3, boolValueOf, jO14, arrayListY, strW12, strW13, strW22, zL4, jO15, iN8, strW14, iN6, jO16, strW23, strW15, jO17, iN7);
            case 23:
                nk.k.e(parcel, "parcel");
                return new f.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 24:
                nk.k.e(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                nk.k.b(parcelable);
                return new f.i((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 25:
                f7.g gVar = new f7.g(parcel);
                gVar.f23731a = parcel.readString();
                gVar.f23733c = parcel.readFloat();
                gVar.f23734d = parcel.readInt() == 1;
                gVar.f23735e = parcel.readString();
                gVar.f23736f = parcel.readInt();
                gVar.g = parcel.readInt();
                return gVar;
            case 26:
                gd.d dVar = new gd.d(parcel);
                dVar.f24634a = parcel.readFloat();
                dVar.f24635b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                dVar.f24636c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                dVar.f24637d = parcel.readFloat();
                dVar.f24638e = parcel.createBooleanArray()[0];
                return dVar;
            case 27:
                int iT12 = com.bumptech.glide.e.T(parcel);
                Intent intent = null;
                int iN9 = 0;
                int iN10 = 0;
                while (parcel.dataPosition() < iT12) {
                    int i23 = parcel.readInt();
                    char c12 = (char) i23;
                    if (c12 == 1) {
                        iN9 = com.bumptech.glide.e.N(parcel, i23);
                    } else if (c12 == 2) {
                        iN10 = com.bumptech.glide.e.N(parcel, i23);
                    } else if (c12 != 3) {
                        com.bumptech.glide.e.S(parcel, i23);
                    } else {
                        intent = (Intent) com.bumptech.glide.e.v(parcel, i23, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT12);
                return new hc.b(iN9, iN10, intent);
            case 28:
                int iT13 = com.bumptech.glide.e.T(parcel);
                ArrayList arrayListY2 = null;
                String strW24 = null;
                while (parcel.dataPosition() < iT13) {
                    int i24 = parcel.readInt();
                    char c13 = (char) i24;
                    if (c13 == 1) {
                        arrayListY2 = com.bumptech.glide.e.y(parcel, i24);
                    } else if (c13 != 2) {
                        com.bumptech.glide.e.S(parcel, i24);
                    } else {
                        strW24 = com.bumptech.glide.e.w(parcel, i24);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT13);
                return new hc.d(strW24, arrayListY2);
            default:
                int iT14 = com.bumptech.glide.e.T(parcel);
                nb.b bVar = null;
                int iN11 = 0;
                pb.s sVar = null;
                while (parcel.dataPosition() < iT14) {
                    int i25 = parcel.readInt();
                    char c14 = (char) i25;
                    if (c14 == 1) {
                        iN11 = com.bumptech.glide.e.N(parcel, i25);
                    } else if (c14 == 2) {
                        bVar = (nb.b) com.bumptech.glide.e.v(parcel, i25, nb.b.CREATOR);
                    } else if (c14 != 3) {
                        com.bumptech.glide.e.S(parcel, i25);
                    } else {
                        sVar = (pb.s) com.bumptech.glide.e.v(parcel, i25, pb.s.CREATOR);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT14);
                return new hc.e(iN11, bVar, sVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f1410a) {
            case 0:
                return new j0[i4];
            case 1:
                return new e2[i4];
            case 2:
                return new f2[i4];
            case 3:
                return new b5.b[i4];
            case 4:
                return new b5.c[i4];
            case 5:
                return new b5.p0[i4];
            case 6:
                return new b5.v0[i4];
            case 7:
                return new b5.z0[i4];
            case 8:
                return new Sku[i4];
            case 9:
                return new com.google.android.material.datepicker.b[i4];
            case 10:
                return new com.google.android.material.datepicker.d[i4];
            case 11:
                return new com.google.android.material.datepicker.o[i4];
            case 12:
                return new ec.d[i4];
            case 13:
                return new ec.e[i4];
            case 14:
                return new ec.i[i4];
            case 15:
                return new ec.t[i4];
            case 16:
                return new ec.u[i4];
            case 17:
                return new v3[i4];
            case 18:
                return new y3[i4];
            case 19:
                return new z3[i4];
            case 20:
                return new a4[i4];
            case 21:
                return new i4[i4];
            case 22:
                return new n4[i4];
            case 23:
                return new f.a[i4];
            case 24:
                return new f.i[i4];
            case 25:
                return new f7.g[i4];
            case 26:
                return new gd.d[i4];
            case 27:
                return new hc.b[i4];
            case 28:
                return new hc.d[i4];
            default:
                return new hc.e[i4];
        }
    }
}
