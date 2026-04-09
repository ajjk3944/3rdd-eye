package A3;

import M2.C0166f;
import M2.C0167g;
import a.AbstractC0241a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.C0326x;
import androidx.recyclerview.widget.n0;
import androidx.recyclerview.widget.o0;
import androidx.versionedparcelable.ParcelImpl;
import b3.C0332b;
import b3.C0334d;
import b3.C0335e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import e.C2284a;
import e.C2292i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f491a;

    public /* synthetic */ q(int i) {
        this.f491a = i;
    }

    public static void a(C0167g c0167g, Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        int i3 = c0167g.f2763a;
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(i3);
        int i6 = c0167g.f2764b;
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(i6);
        int i7 = c0167g.f2765c;
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(i7);
        AbstractC0241a.u(parcel, 4, c0167g.f2766d);
        AbstractC0241a.s(parcel, 5, c0167g.f2767e);
        AbstractC0241a.x(parcel, 6, c0167g.f2768f, i);
        AbstractC0241a.q(parcel, 7, c0167g.f2769g);
        AbstractC0241a.t(parcel, 8, c0167g.f2770h, i);
        AbstractC0241a.x(parcel, 10, c0167g.i, i);
        AbstractC0241a.x(parcel, 11, c0167g.f2771j, i);
        boolean z6 = c0167g.f2772k;
        AbstractC0241a.B(parcel, 12, 4);
        parcel.writeInt(z6 ? 1 : 0);
        int i8 = c0167g.f2773l;
        AbstractC0241a.B(parcel, 13, 4);
        parcel.writeInt(i8);
        boolean z7 = c0167g.f2774m;
        AbstractC0241a.B(parcel, 14, 4);
        parcel.writeInt(z7 ? 1 : 0);
        AbstractC0241a.u(parcel, 15, c0167g.f2775n);
        AbstractC0241a.H(parcel, iE);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f491a) {
            case 0:
                r rVar = new r();
                rVar.f492a = parcel.readInt();
                rVar.f493b = (x3.s) parcel.readParcelable(r.class.getClassLoader());
                return rVar;
            case 1:
                int iO = T2.g.O(parcel);
                String strJ = null;
                int iH = 0;
                while (parcel.dataPosition() < iO) {
                    int i3 = parcel.readInt();
                    char c6 = (char) i3;
                    if (c6 == 1) {
                        strJ = T2.g.j(parcel, i3);
                    } else if (c6 != 2) {
                        T2.g.L(parcel, i3);
                    } else {
                        iH = T2.g.H(parcel, i3);
                    }
                }
                T2.g.n(parcel, iO);
                return new G2.c(strJ, iH);
            case 2:
                int iO2 = T2.g.O(parcel);
                long jI = 0;
                int iH2 = 0;
                String strJ2 = null;
                String strJ3 = null;
                String strJ4 = null;
                String strJ5 = null;
                Uri uri = null;
                String strJ6 = null;
                String strJ7 = null;
                ArrayList arrayList = null;
                String strJ8 = null;
                String strJ9 = null;
                while (true) {
                    long j6 = jI;
                    while (parcel.dataPosition() < iO2) {
                        i = parcel.readInt();
                        switch ((char) i) {
                            case 1:
                                iH2 = T2.g.H(parcel, i);
                                break;
                            case 2:
                                strJ2 = T2.g.j(parcel, i);
                                break;
                            case 3:
                                strJ3 = T2.g.j(parcel, i);
                                break;
                            case 4:
                                strJ4 = T2.g.j(parcel, i);
                                break;
                            case 5:
                                strJ5 = T2.g.j(parcel, i);
                                break;
                            case 6:
                                uri = (Uri) T2.g.i(parcel, i, Uri.CREATOR);
                                break;
                            case 7:
                                strJ6 = T2.g.j(parcel, i);
                                break;
                            case '\b':
                                break;
                            case '\t':
                                strJ7 = T2.g.j(parcel, i);
                                break;
                            case '\n':
                                Parcelable.Creator<Scope> creator = Scope.CREATOR;
                                int iJ = T2.g.J(parcel, i);
                                int iDataPosition = parcel.dataPosition();
                                if (iJ != 0) {
                                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                                    parcel.setDataPosition(iDataPosition + iJ);
                                    arrayList = arrayListCreateTypedArrayList;
                                    break;
                                } else {
                                    arrayList = null;
                                    break;
                                }
                            case 11:
                                strJ8 = T2.g.j(parcel, i);
                                break;
                            case '\f':
                                strJ9 = T2.g.j(parcel, i);
                                break;
                            default:
                                T2.g.L(parcel, i);
                                break;
                        }
                    }
                    T2.g.n(parcel, iO2);
                    return new GoogleSignInAccount(iH2, strJ2, strJ3, strJ4, strJ5, uri, strJ6, j6, strJ7, arrayList, strJ8, strJ9);
                    jI = T2.g.I(parcel, i);
                    break;
                }
                break;
            case 3:
                I3.d dVar = new I3.d(parcel);
                dVar.f1898a = parcel.readFloat();
                dVar.f1899b = parcel.readFloat();
                ArrayList arrayList2 = new ArrayList();
                dVar.f1900c = arrayList2;
                parcel.readList(arrayList2, Float.class.getClassLoader());
                dVar.f1901d = parcel.readFloat();
                dVar.f1902e = parcel.createBooleanArray()[0];
                return dVar;
            case 4:
                int iO3 = T2.g.O(parcel);
                PendingIntent pendingIntent = null;
                String strJ10 = null;
                Integer numValueOf = null;
                int iH3 = 0;
                int iH4 = 0;
                while (parcel.dataPosition() < iO3) {
                    int i6 = parcel.readInt();
                    char c7 = (char) i6;
                    if (c7 == 1) {
                        iH3 = T2.g.H(parcel, i6);
                    } else if (c7 == 2) {
                        iH4 = T2.g.H(parcel, i6);
                    } else if (c7 == 3) {
                        pendingIntent = (PendingIntent) T2.g.i(parcel, i6, PendingIntent.CREATOR);
                    } else if (c7 == 4) {
                        strJ10 = T2.g.j(parcel, i6);
                    } else if (c7 != 5) {
                        T2.g.L(parcel, i6);
                    } else {
                        int iJ2 = T2.g.J(parcel, i6);
                        if (iJ2 == 0) {
                            numValueOf = null;
                        } else {
                            if (iJ2 != 4) {
                                String hexString = Integer.toHexString(iJ2);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(iJ2).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(iJ2);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new J0.c(sb.toString(), parcel);
                            }
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                T2.g.n(parcel, iO3);
                return new J2.b(iH3, iH4, pendingIntent, strJ10, numValueOf);
            case 5:
                int iO4 = T2.g.O(parcel);
                int iH5 = 0;
                boolean zD = false;
                long jI2 = -1;
                String strJ11 = null;
                while (parcel.dataPosition() < iO4) {
                    int i7 = parcel.readInt();
                    char c8 = (char) i7;
                    if (c8 == 1) {
                        strJ11 = T2.g.j(parcel, i7);
                    } else if (c8 == 2) {
                        iH5 = T2.g.H(parcel, i7);
                    } else if (c8 == 3) {
                        jI2 = T2.g.I(parcel, i7);
                    } else if (c8 != 4) {
                        T2.g.L(parcel, i7);
                    } else {
                        zD = T2.g.D(parcel, i7);
                    }
                }
                T2.g.n(parcel, iO4);
                return new J2.d(iH5, jI2, strJ11, zD);
            case 6:
                int iO5 = T2.g.O(parcel);
                String strJ12 = null;
                int iH6 = 0;
                while (parcel.dataPosition() < iO5) {
                    int i8 = parcel.readInt();
                    char c9 = (char) i8;
                    if (c9 == 1) {
                        iH6 = T2.g.H(parcel, i8);
                    } else if (c9 != 2) {
                        T2.g.L(parcel, i8);
                    } else {
                        strJ12 = T2.g.j(parcel, i8);
                    }
                }
                T2.g.n(parcel, iO5);
                return new Scope(iH6, strJ12);
            case 7:
                int iO6 = T2.g.O(parcel);
                String strJ13 = null;
                J2.b bVar = null;
                int iH7 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iO6) {
                    int i9 = parcel.readInt();
                    char c10 = (char) i9;
                    if (c10 == 1) {
                        iH7 = T2.g.H(parcel, i9);
                    } else if (c10 == 2) {
                        strJ13 = T2.g.j(parcel, i9);
                    } else if (c10 == 3) {
                        pendingIntent2 = (PendingIntent) T2.g.i(parcel, i9, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        T2.g.L(parcel, i9);
                    } else {
                        bVar = (J2.b) T2.g.i(parcel, i9, J2.b.CREATOR);
                    }
                }
                T2.g.n(parcel, iO6);
                return new Status(iH7, strJ13, pendingIntent2, bVar);
            case 8:
                int iO7 = T2.g.O(parcel);
                int iH8 = 0;
                while (true) {
                    ArrayList arrayListCreateTypedArrayList2 = null;
                    while (parcel.dataPosition() < iO7) {
                        int i10 = parcel.readInt();
                        char c11 = (char) i10;
                        if (c11 == 1) {
                            iH8 = T2.g.H(parcel, i10);
                        } else if (c11 != 2) {
                            T2.g.L(parcel, i10);
                        } else {
                            Parcelable.Creator<M2.j> creator2 = M2.j.CREATOR;
                            int iJ3 = T2.g.J(parcel, i10);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iJ3 == 0) {
                                break;
                            }
                            arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(iDataPosition2 + iJ3);
                        }
                    }
                    T2.g.n(parcel, iO7);
                    return new M2.m(iH8, arrayListCreateTypedArrayList2);
                    break;
                }
            case 9:
                int iO8 = T2.g.O(parcel);
                int iH9 = 0;
                int iH10 = 0;
                int iH11 = 0;
                int iH12 = 0;
                long jI3 = 0;
                long jI4 = 0;
                String strJ14 = null;
                String strJ15 = null;
                int iH13 = -1;
                while (parcel.dataPosition() < iO8) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iH9 = T2.g.H(parcel, i11);
                            break;
                        case 2:
                            iH10 = T2.g.H(parcel, i11);
                            break;
                        case 3:
                            iH11 = T2.g.H(parcel, i11);
                            break;
                        case 4:
                            jI3 = T2.g.I(parcel, i11);
                            break;
                        case 5:
                            jI4 = T2.g.I(parcel, i11);
                            break;
                        case 6:
                            strJ14 = T2.g.j(parcel, i11);
                            break;
                        case 7:
                            strJ15 = T2.g.j(parcel, i11);
                            break;
                        case '\b':
                            iH12 = T2.g.H(parcel, i11);
                            break;
                        case '\t':
                            iH13 = T2.g.H(parcel, i11);
                            break;
                        default:
                            T2.g.L(parcel, i11);
                            break;
                    }
                }
                T2.g.n(parcel, iO8);
                return new M2.j(iH9, iH10, iH11, jI3, jI4, strJ14, strJ15, iH12, iH13);
            case 10:
                int iO9 = T2.g.O(parcel);
                int iH14 = 0;
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int iH15 = 0;
                while (parcel.dataPosition() < iO9) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        iH14 = T2.g.H(parcel, i12);
                    } else if (c12 == 2) {
                        account = (Account) T2.g.i(parcel, i12, Account.CREATOR);
                    } else if (c12 == 3) {
                        iH15 = T2.g.H(parcel, i12);
                    } else if (c12 != 4) {
                        T2.g.L(parcel, i12);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) T2.g.i(parcel, i12, GoogleSignInAccount.CREATOR);
                    }
                }
                T2.g.n(parcel, iO9);
                return new M2.q(iH14, account, iH15, googleSignInAccount);
            case 11:
                int iO10 = T2.g.O(parcel);
                int iH16 = 0;
                boolean zD2 = false;
                boolean zD3 = false;
                IBinder iBinderF = null;
                J2.b bVar2 = null;
                while (parcel.dataPosition() < iO10) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 1) {
                        iH16 = T2.g.H(parcel, i13);
                    } else if (c13 == 2) {
                        iBinderF = T2.g.F(parcel, i13);
                    } else if (c13 == 3) {
                        bVar2 = (J2.b) T2.g.i(parcel, i13, J2.b.CREATOR);
                    } else if (c13 == 4) {
                        zD2 = T2.g.D(parcel, i13);
                    } else if (c13 != 5) {
                        T2.g.L(parcel, i13);
                    } else {
                        zD3 = T2.g.D(parcel, i13);
                    }
                }
                T2.g.n(parcel, iO10);
                return new M2.r(iH16, iBinderF, bVar2, zD2, zD3);
            case 12:
                int iO11 = T2.g.O(parcel);
                int iH17 = 0;
                int iH18 = 0;
                int iH19 = 0;
                boolean zD4 = false;
                boolean zD5 = false;
                while (parcel.dataPosition() < iO11) {
                    int i14 = parcel.readInt();
                    char c14 = (char) i14;
                    if (c14 == 1) {
                        iH17 = T2.g.H(parcel, i14);
                    } else if (c14 == 2) {
                        zD4 = T2.g.D(parcel, i14);
                    } else if (c14 == 3) {
                        zD5 = T2.g.D(parcel, i14);
                    } else if (c14 == 4) {
                        iH18 = T2.g.H(parcel, i14);
                    } else if (c14 != 5) {
                        T2.g.L(parcel, i14);
                    } else {
                        iH19 = T2.g.H(parcel, i14);
                    }
                }
                T2.g.n(parcel, iO11);
                return new M2.l(iH17, iH18, iH19, zD4, zD5);
            case 13:
                int iO12 = T2.g.O(parcel);
                Bundle bundleG = null;
                C0166f c0166f = null;
                int iH20 = 0;
                J2.d[] dVarArr = null;
                while (parcel.dataPosition() < iO12) {
                    int i15 = parcel.readInt();
                    char c15 = (char) i15;
                    if (c15 == 1) {
                        bundleG = T2.g.g(parcel, i15);
                    } else if (c15 == 2) {
                        dVarArr = (J2.d[]) T2.g.m(parcel, i15, J2.d.CREATOR);
                    } else if (c15 == 3) {
                        iH20 = T2.g.H(parcel, i15);
                    } else if (c15 != 4) {
                        T2.g.L(parcel, i15);
                    } else {
                        c0166f = (C0166f) T2.g.i(parcel, i15, C0166f.CREATOR);
                    }
                }
                T2.g.n(parcel, iO12);
                M2.C c16 = new M2.C();
                c16.f2708a = bundleG;
                c16.f2709b = dVarArr;
                c16.f2710c = iH20;
                c16.f2711d = c0166f;
                return c16;
            case 14:
                int iO13 = T2.g.O(parcel);
                M2.l lVar = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zD6 = false;
                boolean zD7 = false;
                int iH21 = 0;
                while (parcel.dataPosition() < iO13) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            lVar = (M2.l) T2.g.i(parcel, i16, M2.l.CREATOR);
                            break;
                        case 2:
                            zD6 = T2.g.D(parcel, i16);
                            break;
                        case 3:
                            zD7 = T2.g.D(parcel, i16);
                            break;
                        case 4:
                            int iJ4 = T2.g.J(parcel, i16);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iJ4 != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iJ4);
                                break;
                            } else {
                                iArrCreateIntArray = null;
                                break;
                            }
                        case 5:
                            iH21 = T2.g.H(parcel, i16);
                            break;
                        case 6:
                            int iJ5 = T2.g.J(parcel, i16);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iJ5 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition4 + iJ5);
                                break;
                            } else {
                                iArrCreateIntArray2 = null;
                                break;
                            }
                        default:
                            T2.g.L(parcel, i16);
                            break;
                    }
                }
                T2.g.n(parcel, iO13);
                return new C0166f(lVar, zD6, zD7, iArrCreateIntArray, iH21, iArrCreateIntArray2);
            case 15:
                int iO14 = T2.g.O(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = C0167g.f2761C;
                String strJ16 = null;
                IBinder iBinderF2 = null;
                Account account2 = null;
                String strJ17 = null;
                int iH22 = 0;
                int iH23 = 0;
                int iH24 = 0;
                boolean zD8 = false;
                int iH25 = 0;
                boolean zD9 = false;
                J2.d[] dVarArr2 = C0167g.f2762D;
                J2.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < iO14) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iH22 = T2.g.H(parcel, i17);
                            break;
                        case 2:
                            iH23 = T2.g.H(parcel, i17);
                            break;
                        case 3:
                            iH24 = T2.g.H(parcel, i17);
                            break;
                        case 4:
                            strJ16 = T2.g.j(parcel, i17);
                            break;
                        case 5:
                            iBinderF2 = T2.g.F(parcel, i17);
                            break;
                        case 6:
                            scopeArr = (Scope[]) T2.g.m(parcel, i17, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = T2.g.g(parcel, i17);
                            break;
                        case '\b':
                            account2 = (Account) T2.g.i(parcel, i17, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            T2.g.L(parcel, i17);
                            break;
                        case '\n':
                            dVarArr2 = (J2.d[]) T2.g.m(parcel, i17, J2.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (J2.d[]) T2.g.m(parcel, i17, J2.d.CREATOR);
                            break;
                        case '\f':
                            zD8 = T2.g.D(parcel, i17);
                            break;
                        case '\r':
                            iH25 = T2.g.H(parcel, i17);
                            break;
                        case 14:
                            zD9 = T2.g.D(parcel, i17);
                            break;
                        case 15:
                            strJ17 = T2.g.j(parcel, i17);
                            break;
                    }
                }
                T2.g.n(parcel, iO14);
                return new C0167g(iH22, iH23, iH24, strJ16, iBinderF2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zD8, iH25, zD9, strJ17);
            case 16:
                return new ParcelImpl(parcel);
            case 17:
                U.g gVar = new U.g(parcel);
                gVar.f3658a = parcel.readInt();
                return gVar;
            case 18:
                return new W3.b((PendingIntent) parcel.readParcelable(W3.a.class.getClassLoader()), parcel.readInt() != 0);
            case 19:
                C0326x c0326x = new C0326x();
                c0326x.f5630a = parcel.readInt();
                c0326x.f5631b = parcel.readInt();
                c0326x.f5632c = parcel.readInt() == 1;
                return c0326x;
            case 20:
                n0 n0Var = new n0();
                n0Var.f5554a = parcel.readInt();
                n0Var.f5555b = parcel.readInt();
                n0Var.f5557d = parcel.readInt() == 1;
                int i18 = parcel.readInt();
                if (i18 > 0) {
                    int[] iArr = new int[i18];
                    n0Var.f5556c = iArr;
                    parcel.readIntArray(iArr);
                }
                return n0Var;
            case 21:
                o0 o0Var = new o0();
                o0Var.f5562a = parcel.readInt();
                o0Var.f5563b = parcel.readInt();
                int i19 = parcel.readInt();
                o0Var.f5564c = i19;
                if (i19 > 0) {
                    int[] iArr2 = new int[i19];
                    o0Var.f5565d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i20 = parcel.readInt();
                o0Var.f5566e = i20;
                if (i20 > 0) {
                    int[] iArr3 = new int[i20];
                    o0Var.f5567f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                o0Var.f5569h = parcel.readInt() == 1;
                o0Var.i = parcel.readInt() == 1;
                o0Var.f5570j = parcel.readInt() == 1;
                o0Var.f5568g = parcel.readArrayList(n0.class.getClassLoader());
                return o0Var;
            case 22:
                int iO15 = T2.g.O(parcel);
                int iH26 = 0;
                Intent intent = null;
                int iH27 = 0;
                while (parcel.dataPosition() < iO15) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        iH26 = T2.g.H(parcel, i21);
                    } else if (c17 == 2) {
                        iH27 = T2.g.H(parcel, i21);
                    } else if (c17 != 3) {
                        T2.g.L(parcel, i21);
                    } else {
                        intent = (Intent) T2.g.i(parcel, i21, Intent.CREATOR);
                    }
                }
                T2.g.n(parcel, iO15);
                return new C0332b(iH26, iH27, intent);
            case 23:
                int iO16 = T2.g.O(parcel);
                ArrayList arrayListL = null;
                String strJ18 = null;
                while (parcel.dataPosition() < iO16) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        arrayListL = T2.g.l(parcel, i22);
                    } else if (c18 != 2) {
                        T2.g.L(parcel, i22);
                    } else {
                        strJ18 = T2.g.j(parcel, i22);
                    }
                }
                T2.g.n(parcel, iO16);
                return new C0334d(arrayListL, strJ18);
            case 24:
                int iO17 = T2.g.O(parcel);
                int iH28 = 0;
                J2.b bVar3 = null;
                M2.r rVar2 = null;
                while (parcel.dataPosition() < iO17) {
                    int i23 = parcel.readInt();
                    char c19 = (char) i23;
                    if (c19 == 1) {
                        iH28 = T2.g.H(parcel, i23);
                    } else if (c19 == 2) {
                        bVar3 = (J2.b) T2.g.i(parcel, i23, J2.b.CREATOR);
                    } else if (c19 != 3) {
                        T2.g.L(parcel, i23);
                    } else {
                        rVar2 = (M2.r) T2.g.i(parcel, i23, M2.r.CREATOR);
                    }
                }
                T2.g.n(parcel, iO17);
                return new C0335e(iH28, bVar3, rVar2);
            case 25:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.m) parcel.readParcelable(com.google.android.material.datepicker.m.class.getClassLoader()), (com.google.android.material.datepicker.m) parcel.readParcelable(com.google.android.material.datepicker.m.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.m) parcel.readParcelable(com.google.android.material.datepicker.m.class.getClassLoader()), parcel.readInt());
            case 26:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 27:
                return com.google.android.material.datepicker.m.a(parcel.readInt(), parcel.readInt());
            case 28:
                q5.i.e(parcel, "parcel");
                return new C2284a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            default:
                q5.i.e(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                q5.i.b(parcelable);
                return new C2292i((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f491a) {
            case 0:
                return new r[i];
            case 1:
                return new G2.c[i];
            case 2:
                return new GoogleSignInAccount[i];
            case 3:
                return new I3.d[i];
            case 4:
                return new J2.b[i];
            case 5:
                return new J2.d[i];
            case 6:
                return new Scope[i];
            case 7:
                return new Status[i];
            case 8:
                return new M2.m[i];
            case 9:
                return new M2.j[i];
            case 10:
                return new M2.q[i];
            case 11:
                return new M2.r[i];
            case 12:
                return new M2.l[i];
            case 13:
                return new M2.C[i];
            case 14:
                return new C0166f[i];
            case 15:
                return new C0167g[i];
            case 16:
                return new ParcelImpl[i];
            case 17:
                return new U.g[i];
            case 18:
                return new W3.a[i];
            case 19:
                return new C0326x[i];
            case 20:
                return new n0[i];
            case 21:
                return new o0[i];
            case 22:
                return new C0332b[i];
            case 23:
                return new C0334d[i];
            case 24:
                return new C0335e[i];
            case 25:
                return new com.google.android.material.datepicker.b[i];
            case 26:
                return new com.google.android.material.datepicker.d[i];
            case 27:
                return new com.google.android.material.datepicker.m[i];
            case 28:
                return new C2284a[i];
            default:
                return new C2292i[i];
        }
    }
}
