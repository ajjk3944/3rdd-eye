package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kq0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ kq0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        z10 z10Var = null;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        PendingIntent pendingIntent = null;
        String strG8 = null;
        Account account = null;
        rh rhVar = null;
        ArrayList arrayListI = null;
        Intent intent = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        boolean zT = false;
        int iV4 = 0;
        boolean zT2 = false;
        int iV5 = 0;
        int iV6 = 0;
        int iV7 = 0;
        int iV8 = 0;
        int iV9 = 0;
        int iV10 = 0;
        switch (this.a) {
            case 0:
                mq0 mq0Var = new mq0();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = lq0.g;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(z10.c);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof z10)) {
                        y10 y10Var = new y10();
                        y10Var.f = strongBinder;
                        z10Var = y10Var;
                    } else {
                        z10Var = (z10) iInterfaceQueryLocalInterface;
                    }
                }
                mq0Var.f = z10Var;
                return mq0Var;
            case 1:
                return new wt0(parcel);
            case 2:
                sx0 sx0Var = new sx0();
                sx0Var.f = parcel.readInt();
                sx0Var.g = parcel.readInt();
                sx0Var.i = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    sx0Var.h = iArr;
                    parcel.readIntArray(iArr);
                }
                return sx0Var;
            case 3:
                tx0 tx0Var = new tx0();
                tx0Var.f = parcel.readInt();
                tx0Var.g = parcel.readInt();
                int i3 = parcel.readInt();
                tx0Var.h = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    tx0Var.i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                tx0Var.j = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    tx0Var.k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                tx0Var.m = parcel.readInt() == 1;
                tx0Var.n = parcel.readInt() == 1;
                tx0Var.o = parcel.readInt() == 1;
                tx0Var.l = parcel.readArrayList(sx0.class.getClassLoader());
                return tx0Var;
            case 4:
                return new h31(parcel);
            case 5:
                int iZ = gi2.z(parcel);
                while (true) {
                    ArrayList arrayListCreateTypedArrayList = null;
                    while (parcel.dataPosition() < iZ) {
                        int i5 = parcel.readInt();
                        char c = (char) i5;
                        if (c == 1) {
                            iV = gi2.v(parcel, i5);
                        } else if (c != 2) {
                            gi2.y(parcel, i5);
                        } else {
                            Parcelable.Creator<re0> creator = re0.CREATOR;
                            int iX = gi2.x(parcel, i5);
                            int iDataPosition = parcel.dataPosition();
                            if (iX == 0) {
                                break;
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition + iX);
                        }
                    }
                    gi2.k(parcel, iZ);
                    return new q01(iV, arrayListCreateTypedArrayList);
                    break;
                }
            case 6:
                int iZ2 = gi2.z(parcel);
                int iV11 = 0;
                while (parcel.dataPosition() < iZ2) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        iV10 = gi2.v(parcel, i6);
                    } else if (c2 == 2) {
                        iV11 = gi2.v(parcel, i6);
                    } else if (c2 != 3) {
                        gi2.y(parcel, i6);
                    } else {
                        intent = (Intent) gi2.f(parcel, i6, Intent.CREATOR);
                    }
                }
                gi2.k(parcel, iZ2);
                return new rb1(iV10, iV11, intent);
            case 7:
                int iZ3 = gi2.z(parcel);
                long jW = 0;
                String strG9 = null;
                String strG10 = null;
                String strG11 = null;
                String strG12 = null;
                Uri uri = null;
                String strG13 = null;
                String strG14 = null;
                ArrayList arrayList = null;
                String strG15 = null;
                String strG16 = null;
                int iV12 = 0;
                while (parcel.dataPosition() < iZ3) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iV12 = gi2.v(parcel, i7);
                            break;
                        case 2:
                            strG9 = gi2.g(parcel, i7);
                            break;
                        case 3:
                            strG10 = gi2.g(parcel, i7);
                            break;
                        case 4:
                            strG11 = gi2.g(parcel, i7);
                            break;
                        case 5:
                            strG12 = gi2.g(parcel, i7);
                            break;
                        case 6:
                            uri = (Uri) gi2.f(parcel, i7, Uri.CREATOR);
                            break;
                        case 7:
                            strG13 = gi2.g(parcel, i7);
                            break;
                        case '\b':
                            jW = gi2.w(parcel, i7);
                            break;
                        case '\t':
                            strG14 = gi2.g(parcel, i7);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int iX2 = gi2.x(parcel, i7);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iX2 != 0) {
                                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(iDataPosition2 + iX2);
                                arrayList = arrayListCreateTypedArrayList2;
                                break;
                            } else {
                                arrayList = null;
                                break;
                            }
                        case 11:
                            strG15 = gi2.g(parcel, i7);
                            break;
                        case '\f':
                            strG16 = gi2.g(parcel, i7);
                            break;
                        default:
                            gi2.y(parcel, i7);
                            break;
                    }
                }
                gi2.k(parcel, iZ3);
                return new GoogleSignInAccount(iV12, strG9, strG10, strG11, strG12, uri, strG13, jW, strG14, arrayList, strG15, strG16);
            case 8:
                int iZ4 = gi2.z(parcel);
                String strG17 = null;
                while (parcel.dataPosition() < iZ4) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        arrayListI = gi2.i(parcel, i8);
                    } else if (c3 != 2) {
                        gi2.y(parcel, i8);
                    } else {
                        strG17 = gi2.g(parcel, i8);
                    }
                }
                gi2.k(parcel, iZ4);
                return new oc1(arrayListI, strG17);
            case 9:
                int iZ5 = gi2.z(parcel);
                yc1 yc1Var = null;
                while (parcel.dataPosition() < iZ5) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        iV9 = gi2.v(parcel, i9);
                    } else if (c4 == 2) {
                        rhVar = (rh) gi2.f(parcel, i9, rh.CREATOR);
                    } else if (c4 != 3) {
                        gi2.y(parcel, i9);
                    } else {
                        yc1Var = (yc1) gi2.f(parcel, i9, yc1.CREATOR);
                    }
                }
                gi2.k(parcel, iZ5);
                return new sc1(iV9, rhVar, yc1Var);
            case 10:
                int iZ6 = gi2.z(parcel);
                int iV13 = -1;
                long jW2 = 0;
                long jW3 = 0;
                String strG18 = null;
                String strG19 = null;
                int iV14 = 0;
                int iV15 = 0;
                int iV16 = 0;
                int iV17 = 0;
                while (parcel.dataPosition() < iZ6) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iV14 = gi2.v(parcel, i10);
                            break;
                        case 2:
                            iV15 = gi2.v(parcel, i10);
                            break;
                        case 3:
                            iV16 = gi2.v(parcel, i10);
                            break;
                        case 4:
                            jW2 = gi2.w(parcel, i10);
                            break;
                        case 5:
                            jW3 = gi2.w(parcel, i10);
                            break;
                        case 6:
                            strG18 = gi2.g(parcel, i10);
                            break;
                        case 7:
                            strG19 = gi2.g(parcel, i10);
                            break;
                        case '\b':
                            iV17 = gi2.v(parcel, i10);
                            break;
                        case '\t':
                            iV13 = gi2.v(parcel, i10);
                            break;
                        default:
                            gi2.y(parcel, i10);
                            break;
                    }
                }
                gi2.k(parcel, iZ6);
                return new re0(iV14, iV15, iV16, jW2, jW3, strG18, strG19, iV17, iV13);
            case 11:
                int iZ7 = gi2.z(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iV18 = 0;
                while (parcel.dataPosition() < iZ7) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        iV8 = gi2.v(parcel, i11);
                    } else if (c5 == 2) {
                        account = (Account) gi2.f(parcel, i11, Account.CREATOR);
                    } else if (c5 == 3) {
                        iV18 = gi2.v(parcel, i11);
                    } else if (c5 != 4) {
                        gi2.y(parcel, i11);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) gi2.f(parcel, i11, GoogleSignInAccount.CREATOR);
                    }
                }
                gi2.k(parcel, iZ7);
                return new xc1(iV8, account, iV18, googleSignInAccount);
            case 12:
                int iZ8 = gi2.z(parcel);
                IBinder iBinderU = null;
                rh rhVar2 = null;
                int iV19 = 0;
                boolean zT3 = false;
                boolean zT4 = false;
                while (parcel.dataPosition() < iZ8) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        iV19 = gi2.v(parcel, i12);
                    } else if (c6 == 2) {
                        iBinderU = gi2.u(parcel, i12);
                    } else if (c6 == 3) {
                        rhVar2 = (rh) gi2.f(parcel, i12, rh.CREATOR);
                    } else if (c6 == 4) {
                        zT3 = gi2.t(parcel, i12);
                    } else if (c6 != 5) {
                        gi2.y(parcel, i12);
                    } else {
                        zT4 = gi2.t(parcel, i12);
                    }
                }
                gi2.k(parcel, iZ8);
                return new yc1(iV19, iBinderU, rhVar2, zT3, zT4);
            case 13:
                int iZ9 = gi2.z(parcel);
                while (parcel.dataPosition() < iZ9) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        iV7 = gi2.v(parcel, i13);
                    } else if (c7 != 2) {
                        gi2.y(parcel, i13);
                    } else {
                        strG8 = gi2.g(parcel, i13);
                    }
                }
                gi2.k(parcel, iZ9);
                return new Scope(strG8, iV7);
            case 14:
                int iZ10 = gi2.z(parcel);
                int iV20 = 0;
                int iV21 = 0;
                int iV22 = 0;
                boolean zT5 = false;
                boolean zT6 = false;
                while (parcel.dataPosition() < iZ10) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        iV20 = gi2.v(parcel, i14);
                    } else if (c8 == 2) {
                        zT5 = gi2.t(parcel, i14);
                    } else if (c8 == 3) {
                        zT6 = gi2.t(parcel, i14);
                    } else if (c8 == 4) {
                        iV21 = gi2.v(parcel, i14);
                    } else if (c8 != 5) {
                        gi2.y(parcel, i14);
                    } else {
                        iV22 = gi2.v(parcel, i14);
                    }
                }
                gi2.k(parcel, iZ10);
                return new tq0(iV20, iV21, iV22, zT5, zT6);
            case 15:
                int iZ11 = gi2.z(parcel);
                String strG20 = null;
                int iV23 = 0;
                while (parcel.dataPosition() < iZ11) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        iV6 = gi2.v(parcel, i15);
                    } else if (c9 == 2) {
                        iV23 = gi2.v(parcel, i15);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) gi2.f(parcel, i15, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        gi2.y(parcel, i15);
                    } else {
                        strG20 = gi2.g(parcel, i15);
                    }
                }
                gi2.k(parcel, iZ11);
                return new rh(iV6, iV23, pendingIntent, strG20);
            case 16:
                int iZ12 = gi2.z(parcel);
                PendingIntent pendingIntent2 = null;
                rh rhVar3 = null;
                while (parcel.dataPosition() < iZ12) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 1) {
                        iV5 = gi2.v(parcel, i16);
                    } else if (c10 == 2) {
                        strG7 = gi2.g(parcel, i16);
                    } else if (c10 == 3) {
                        pendingIntent2 = (PendingIntent) gi2.f(parcel, i16, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        gi2.y(parcel, i16);
                    } else {
                        rhVar3 = (rh) gi2.f(parcel, i16, rh.CREATOR);
                    }
                }
                gi2.k(parcel, iZ12);
                return new Status(iV5, strG7, pendingIntent2, rhVar3);
            case 17:
                int iZ13 = gi2.z(parcel);
                while (parcel.dataPosition() < iZ13) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        gi2.y(parcel, i17);
                    } else {
                        zT2 = gi2.t(parcel, i17);
                    }
                }
                gi2.k(parcel, iZ13);
                return new z2(zT2);
            case 18:
                int iZ14 = gi2.z(parcel);
                String strG21 = null;
                String strG22 = null;
                while (parcel.dataPosition() < iZ14) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        strG6 = gi2.g(parcel, i18);
                    } else if (c11 == 2) {
                        strG21 = gi2.g(parcel, i18);
                    } else if (c11 != 3) {
                        gi2.y(parcel, i18);
                    } else {
                        strG22 = gi2.g(parcel, i18);
                    }
                }
                gi2.k(parcel, iZ14);
                return new gd1(strG6, strG21, strG22);
            case 19:
                int iZ15 = gi2.z(parcel);
                String strG23 = null;
                String strG24 = null;
                String strG25 = null;
                String strG26 = null;
                String strG27 = null;
                String strG28 = null;
                String strG29 = null;
                Intent intent2 = null;
                IBinder iBinderU2 = null;
                Bundle bundleD = null;
                boolean zT7 = false;
                while (parcel.dataPosition() < iZ15) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            strG23 = gi2.g(parcel, i19);
                            break;
                        case 3:
                            strG24 = gi2.g(parcel, i19);
                            break;
                        case 4:
                            strG25 = gi2.g(parcel, i19);
                            break;
                        case 5:
                            strG26 = gi2.g(parcel, i19);
                            break;
                        case 6:
                            strG27 = gi2.g(parcel, i19);
                            break;
                        case 7:
                            strG28 = gi2.g(parcel, i19);
                            break;
                        case '\b':
                            strG29 = gi2.g(parcel, i19);
                            break;
                        case '\t':
                            intent2 = (Intent) gi2.f(parcel, i19, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderU2 = gi2.u(parcel, i19);
                            break;
                        case 11:
                            zT7 = gi2.t(parcel, i19);
                            break;
                        case '\f':
                            bundleD = gi2.d(parcel, i19);
                            break;
                        default:
                            gi2.y(parcel, i19);
                            break;
                    }
                }
                gi2.k(parcel, iZ15);
                return new fc2(strG23, strG24, strG25, strG26, strG27, strG28, strG29, intent2, iBinderU2, zT7, bundleD);
            case 20:
                int iZ16 = gi2.z(parcel);
                while (parcel.dataPosition() < iZ16) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        strG5 = gi2.g(parcel, i20);
                    } else if (c12 != 2) {
                        gi2.y(parcel, i20);
                    } else {
                        iV4 = gi2.v(parcel, i20);
                    }
                }
                gi2.k(parcel, iZ16);
                return new wu1(strG5, iV4);
            case zy1.zzm /* 21 */:
                int iZ17 = gi2.z(parcel);
                long jW4 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                boolean zT8 = false;
                boolean zT9 = false;
                boolean zT10 = false;
                while (parcel.dataPosition() < iZ17) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) gi2.f(parcel, i21, ParcelFileDescriptor.CREATOR);
                    } else if (c13 == 3) {
                        zT8 = gi2.t(parcel, i21);
                    } else if (c13 == 4) {
                        zT9 = gi2.t(parcel, i21);
                    } else if (c13 == 5) {
                        jW4 = gi2.w(parcel, i21);
                    } else if (c13 != 6) {
                        gi2.y(parcel, i21);
                    } else {
                        zT10 = gi2.t(parcel, i21);
                    }
                }
                gi2.k(parcel, iZ17);
                return new uw1(parcelFileDescriptor, zT8, zT9, jW4, zT10);
            case 22:
                int iZ18 = gi2.z(parcel);
                long jW5 = 0;
                long jW6 = 0;
                String strG30 = null;
                String strG31 = null;
                String strG32 = null;
                String strG33 = null;
                Bundle bundleD2 = null;
                String strG34 = null;
                boolean zT11 = false;
                int iV24 = 0;
                while (parcel.dataPosition() < iZ18) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strG30 = gi2.g(parcel, i22);
                            break;
                        case 3:
                            jW5 = gi2.w(parcel, i22);
                            break;
                        case 4:
                            strG31 = gi2.g(parcel, i22);
                            break;
                        case 5:
                            strG32 = gi2.g(parcel, i22);
                            break;
                        case 6:
                            strG33 = gi2.g(parcel, i22);
                            break;
                        case 7:
                            bundleD2 = gi2.d(parcel, i22);
                            break;
                        case '\b':
                            zT11 = gi2.t(parcel, i22);
                            break;
                        case '\t':
                            jW6 = gi2.w(parcel, i22);
                            break;
                        case '\n':
                            strG34 = gi2.g(parcel, i22);
                            break;
                        case 11:
                            iV24 = gi2.v(parcel, i22);
                            break;
                        default:
                            gi2.y(parcel, i22);
                            break;
                    }
                }
                gi2.k(parcel, iZ18);
                return new ww1(strG30, jW5, strG31, strG32, strG33, bundleD2, zT11, jW6, strG34, iV24);
            case 23:
                int iZ19 = gi2.z(parcel);
                ih3 ih3Var = null;
                int iV25 = 0;
                boolean zT12 = false;
                int iV26 = 0;
                boolean zT13 = false;
                int iV27 = 0;
                boolean zT14 = false;
                int iV28 = 0;
                int iV29 = 0;
                boolean zT15 = false;
                int iV30 = 0;
                while (parcel.dataPosition() < iZ19) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iV25 = gi2.v(parcel, i23);
                            break;
                        case 2:
                            zT12 = gi2.t(parcel, i23);
                            break;
                        case 3:
                            iV26 = gi2.v(parcel, i23);
                            break;
                        case 4:
                            zT13 = gi2.t(parcel, i23);
                            break;
                        case 5:
                            iV27 = gi2.v(parcel, i23);
                            break;
                        case 6:
                            ih3Var = (ih3) gi2.f(parcel, i23, ih3.CREATOR);
                            break;
                        case 7:
                            zT14 = gi2.t(parcel, i23);
                            break;
                        case '\b':
                            iV28 = gi2.v(parcel, i23);
                            break;
                        case '\t':
                            iV29 = gi2.v(parcel, i23);
                            break;
                        case '\n':
                            zT15 = gi2.t(parcel, i23);
                            break;
                        case 11:
                            iV30 = gi2.v(parcel, i23);
                            break;
                        default:
                            gi2.y(parcel, i23);
                            break;
                    }
                }
                gi2.k(parcel, iZ19);
                return new r12(iV25, zT12, iV26, zT13, iV27, ih3Var, zT14, iV28, iV29, zT15, iV30);
            case 24:
                int iZ20 = gi2.z(parcel);
                String[] strArrH = null;
                String[] strArrH2 = null;
                while (parcel.dataPosition() < iZ20) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 1) {
                        strG4 = gi2.g(parcel, i24);
                    } else if (c14 == 2) {
                        strArrH = gi2.h(parcel, i24);
                    } else if (c14 != 3) {
                        gi2.y(parcel, i24);
                    } else {
                        strArrH2 = gi2.h(parcel, i24);
                    }
                }
                gi2.k(parcel, iZ20);
                return new q42(strG4, strArrH, strArrH2);
            case 25:
                int iZ21 = gi2.z(parcel);
                long jW7 = 0;
                String strG35 = null;
                byte[] bArrE = null;
                String[] strArrH3 = null;
                String[] strArrH4 = null;
                boolean zT16 = false;
                int iV31 = 0;
                boolean zT17 = false;
                while (parcel.dataPosition() < iZ21) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            zT16 = gi2.t(parcel, i25);
                            break;
                        case 2:
                            strG35 = gi2.g(parcel, i25);
                            break;
                        case 3:
                            iV31 = gi2.v(parcel, i25);
                            break;
                        case 4:
                            bArrE = gi2.e(parcel, i25);
                            break;
                        case 5:
                            strArrH3 = gi2.h(parcel, i25);
                            break;
                        case 6:
                            strArrH4 = gi2.h(parcel, i25);
                            break;
                        case 7:
                            zT17 = gi2.t(parcel, i25);
                            break;
                        case '\b':
                            jW7 = gi2.w(parcel, i25);
                            break;
                        default:
                            gi2.y(parcel, i25);
                            break;
                    }
                }
                gi2.k(parcel, iZ21);
                return new r42(zT16, strG35, iV31, bArrE, strArrH3, strArrH4, zT17, jW7);
            case 26:
                int iZ22 = gi2.z(parcel);
                String strG36 = null;
                int iV32 = 0;
                while (parcel.dataPosition() < iZ22) {
                    int i26 = parcel.readInt();
                    char c15 = (char) i26;
                    if (c15 == 1) {
                        strG3 = gi2.g(parcel, i26);
                    } else if (c15 == 2) {
                        zT = gi2.t(parcel, i26);
                    } else if (c15 == 3) {
                        iV32 = gi2.v(parcel, i26);
                    } else if (c15 != 4) {
                        gi2.y(parcel, i26);
                    } else {
                        strG36 = gi2.g(parcel, i26);
                    }
                }
                gi2.k(parcel, iZ22);
                return new w42(strG3, iV32, strG36, zT);
            case 27:
                int iZ23 = gi2.z(parcel);
                Bundle bundleD3 = null;
                while (parcel.dataPosition() < iZ23) {
                    int i27 = parcel.readInt();
                    char c16 = (char) i27;
                    if (c16 == 1) {
                        strG2 = gi2.g(parcel, i27);
                    } else if (c16 != 2) {
                        gi2.y(parcel, i27);
                    } else {
                        bundleD3 = gi2.d(parcel, i27);
                    }
                }
                gi2.k(parcel, iZ23);
                return new e52(bundleD3, strG2);
            case 28:
                int iZ24 = gi2.z(parcel);
                int iV33 = 0;
                int iV34 = 0;
                while (parcel.dataPosition() < iZ24) {
                    int i28 = parcel.readInt();
                    char c17 = (char) i28;
                    if (c17 == 1) {
                        iV33 = gi2.v(parcel, i28);
                    } else if (c17 == 2) {
                        strG = gi2.g(parcel, i28);
                    } else if (c17 == 3) {
                        iV34 = gi2.v(parcel, i28);
                    } else if (c17 != 1000) {
                        gi2.y(parcel, i28);
                    } else {
                        iV3 = gi2.v(parcel, i28);
                    }
                }
                gi2.k(parcel, iZ24);
                return new f52(iV3, iV33, iV34, strG);
            default:
                int iZ25 = gi2.z(parcel);
                int iV35 = 0;
                int iV36 = 0;
                while (parcel.dataPosition() < iZ25) {
                    int i29 = parcel.readInt();
                    char c18 = (char) i29;
                    if (c18 == 1) {
                        iV2 = gi2.v(parcel, i29);
                    } else if (c18 == 2) {
                        iV35 = gi2.v(parcel, i29);
                    } else if (c18 != 3) {
                        gi2.y(parcel, i29);
                    } else {
                        iV36 = gi2.v(parcel, i29);
                    }
                }
                gi2.k(parcel, iZ25);
                return new i82(iV2, iV35, iV36);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mq0[i];
            case 1:
                return new wt0[i];
            case 2:
                return new sx0[i];
            case 3:
                return new tx0[i];
            case 4:
                return new h31[i];
            case 5:
                return new q01[i];
            case 6:
                return new rb1[i];
            case 7:
                return new GoogleSignInAccount[i];
            case 8:
                return new oc1[i];
            case 9:
                return new sc1[i];
            case 10:
                return new re0[i];
            case 11:
                return new xc1[i];
            case 12:
                return new yc1[i];
            case 13:
                return new Scope[i];
            case 14:
                return new tq0[i];
            case 15:
                return new rh[i];
            case 16:
                return new Status[i];
            case 17:
                return new z2[i];
            case 18:
                return new gd1[i];
            case 19:
                return new fc2[i];
            case 20:
                return new wu1[i];
            case zy1.zzm /* 21 */:
                return new uw1[i];
            case 22:
                return new ww1[i];
            case 23:
                return new r12[i];
            case 24:
                return new q42[i];
            case 25:
                return new r42[i];
            case 26:
                return new w42[i];
            case 27:
                return new e52[i];
            case 28:
                return new f52[i];
            default:
                return new i82[i];
        }
    }
}
