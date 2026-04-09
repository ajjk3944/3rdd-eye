package j4;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import java.util.ArrayList;
import java.util.Locale;
import nb.s;
import p.l0;
import pb.g0;
import pb.m;
import pb.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27388a;

    public /* synthetic */ g(int i4) {
        this.f27388a = i4;
    }

    public static void a(pb.g gVar, Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        int i10 = gVar.f31597a;
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = gVar.f31598b;
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = gVar.f31599c;
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(i12);
        com.bumptech.glide.f.I(parcel, 4, gVar.f31600d);
        com.bumptech.glide.f.F(parcel, 5, gVar.f31601e);
        com.bumptech.glide.f.L(parcel, 6, gVar.f31602f, i4);
        com.bumptech.glide.f.D(parcel, 7, gVar.g);
        com.bumptech.glide.f.H(parcel, 8, gVar.f31603h, i4);
        com.bumptech.glide.f.L(parcel, 10, gVar.f31604i, i4);
        com.bumptech.glide.f.L(parcel, 11, gVar.j, i4);
        boolean z3 = gVar.f31605k;
        com.bumptech.glide.f.N(parcel, 12, 4);
        parcel.writeInt(z3 ? 1 : 0);
        int i13 = gVar.f31606l;
        com.bumptech.glide.f.N(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z10 = gVar.f31607m;
        com.bumptech.glide.f.N(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        com.bumptech.glide.f.I(parcel, 15, gVar.f31608n);
        com.bumptech.glide.f.P(parcel, iO);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z3;
        switch (this.f27388a) {
            case 0:
                h hVar = new h(parcel);
                hVar.f27389a = parcel.readInt();
                return hVar;
            case 1:
                return new WrappedParcelable(parcel);
            case 2:
                ki.d dVar = new ki.d(parcel);
                dVar.f28302a = parcel.readInt();
                dVar.f28303b = parcel.readInt();
                dVar.f28304c = parcel.readInt() == 1;
                return dVar;
            case 3:
                return new ParcelImpl(parcel);
            case 4:
                int iT = com.bumptech.glide.e.T(parcel);
                String strW = null;
                String strW2 = null;
                String strW3 = null;
                String strW4 = null;
                Uri uri = null;
                String strW5 = null;
                String strW6 = null;
                ArrayList arrayListA = null;
                String strW7 = null;
                String strW8 = null;
                long jO = 0;
                int iN = 0;
                while (parcel.dataPosition() < iT) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iN = com.bumptech.glide.e.N(parcel, i4);
                            break;
                        case 2:
                            strW = com.bumptech.glide.e.w(parcel, i4);
                            break;
                        case 3:
                            strW2 = com.bumptech.glide.e.w(parcel, i4);
                            break;
                        case 4:
                            strW3 = com.bumptech.glide.e.w(parcel, i4);
                            break;
                        case 5:
                            strW4 = com.bumptech.glide.e.w(parcel, i4);
                            break;
                        case 6:
                            uri = (Uri) com.bumptech.glide.e.v(parcel, i4, Uri.CREATOR);
                            break;
                        case 7:
                            strW5 = com.bumptech.glide.e.w(parcel, i4);
                            break;
                        case '\b':
                            jO = com.bumptech.glide.e.O(parcel, i4);
                            break;
                        case '\t':
                            strW6 = com.bumptech.glide.e.w(parcel, i4);
                            break;
                        case '\n':
                            arrayListA = com.bumptech.glide.e.A(parcel, i4, Scope.CREATOR);
                            break;
                        case 11:
                            strW7 = com.bumptech.glide.e.w(parcel, i4);
                            break;
                        case '\f':
                            strW8 = com.bumptech.glide.e.w(parcel, i4);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i4);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT);
                return new GoogleSignInAccount(iN, strW, strW2, strW3, strW4, uri, strW5, jO, strW6, arrayListA, strW7, strW8);
            case 5:
                lc.b bVar = new lc.b();
                bVar.f28670i = 255;
                bVar.f28671k = -2;
                bVar.f28672l = -2;
                bVar.f28673m = -2;
                bVar.f28680t = Boolean.TRUE;
                bVar.f28663a = parcel.readInt();
                bVar.f28664b = (Integer) parcel.readSerializable();
                bVar.f28665c = (Integer) parcel.readSerializable();
                bVar.f28666d = (Integer) parcel.readSerializable();
                bVar.f28667e = (Integer) parcel.readSerializable();
                bVar.f28668f = (Integer) parcel.readSerializable();
                bVar.g = (Integer) parcel.readSerializable();
                bVar.f28669h = (Integer) parcel.readSerializable();
                bVar.f28670i = parcel.readInt();
                bVar.j = parcel.readString();
                bVar.f28671k = parcel.readInt();
                bVar.f28672l = parcel.readInt();
                bVar.f28673m = parcel.readInt();
                bVar.f28675o = parcel.readString();
                bVar.f28676p = parcel.readString();
                bVar.f28677q = parcel.readInt();
                bVar.f28679s = (Integer) parcel.readSerializable();
                bVar.f28681u = (Integer) parcel.readSerializable();
                bVar.f28682v = (Integer) parcel.readSerializable();
                bVar.f28683w = (Integer) parcel.readSerializable();
                bVar.f28684x = (Integer) parcel.readSerializable();
                bVar.f28685y = (Integer) parcel.readSerializable();
                bVar.f28686z = (Integer) parcel.readSerializable();
                bVar.C = (Integer) parcel.readSerializable();
                bVar.A = (Integer) parcel.readSerializable();
                bVar.B = (Integer) parcel.readSerializable();
                bVar.f28680t = (Boolean) parcel.readSerializable();
                bVar.f28674n = (Locale) parcel.readSerializable();
                bVar.D = (Boolean) parcel.readSerializable();
                bVar.E = (Integer) parcel.readSerializable();
                return bVar;
            case 6:
                int iT2 = com.bumptech.glide.e.T(parcel);
                PendingIntent pendingIntent = null;
                String strW9 = null;
                Integer numValueOf = null;
                int iN2 = 0;
                int iN3 = 0;
                while (parcel.dataPosition() < iT2) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        iN2 = com.bumptech.glide.e.N(parcel, i10);
                    } else if (c9 == 2) {
                        iN3 = com.bumptech.glide.e.N(parcel, i10);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) com.bumptech.glide.e.v(parcel, i10, PendingIntent.CREATOR);
                    } else if (c9 == 4) {
                        strW9 = com.bumptech.glide.e.w(parcel, i10);
                    } else if (c9 != 5) {
                        com.bumptech.glide.e.S(parcel, i10);
                    } else {
                        int iP = com.bumptech.glide.e.P(parcel, i10);
                        if (iP == 0) {
                            numValueOf = null;
                        } else {
                            com.bumptech.glide.e.X(parcel, iP, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                com.bumptech.glide.e.C(parcel, iT2);
                return new nb.b(iN2, iN3, pendingIntent, strW9, numValueOf);
            case 7:
                int iT3 = com.bumptech.glide.e.T(parcel);
                int iN4 = 0;
                boolean zL = false;
                long jO2 = -1;
                String strW10 = null;
                while (parcel.dataPosition() < iT3) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        strW10 = com.bumptech.glide.e.w(parcel, i11);
                    } else if (c10 == 2) {
                        iN4 = com.bumptech.glide.e.N(parcel, i11);
                    } else if (c10 == 3) {
                        jO2 = com.bumptech.glide.e.O(parcel, i11);
                    } else if (c10 != 4) {
                        com.bumptech.glide.e.S(parcel, i11);
                    } else {
                        zL = com.bumptech.glide.e.L(parcel, i11);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT3);
                return new nb.d(iN4, jO2, strW10, zL);
            case 8:
                int iT4 = com.bumptech.glide.e.T(parcel);
                long jO3 = -1;
                boolean zL2 = false;
                int iN5 = 0;
                int iN6 = 0;
                String strW11 = null;
                while (parcel.dataPosition() < iT4) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        zL2 = com.bumptech.glide.e.L(parcel, i12);
                    } else if (c11 == 2) {
                        strW11 = com.bumptech.glide.e.w(parcel, i12);
                    } else if (c11 == 3) {
                        iN5 = com.bumptech.glide.e.N(parcel, i12);
                    } else if (c11 == 4) {
                        iN6 = com.bumptech.glide.e.N(parcel, i12);
                    } else if (c11 != 5) {
                        com.bumptech.glide.e.S(parcel, i12);
                    } else {
                        jO3 = com.bumptech.glide.e.O(parcel, i12);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT4);
                return new s(zL2, strW11, iN5, iN6, jO3);
            case 9:
                o9.d dVar2 = new o9.d();
                dVar2.f30453a = 0.0f;
                dVar2.f30454b = null;
                dVar2.f30455c = 0.0f;
                dVar2.f30455c = parcel.readFloat();
                dVar2.f30453a = parcel.readFloat();
                if (parcel.readInt() == 1) {
                    dVar2.f30454b = parcel.readParcelable(Object.class.getClassLoader());
                }
                return dVar2;
            case 10:
                int iT5 = com.bumptech.glide.e.T(parcel);
                String strW12 = null;
                int iN7 = 0;
                while (parcel.dataPosition() < iT5) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 1) {
                        iN7 = com.bumptech.glide.e.N(parcel, i13);
                    } else if (c12 != 2) {
                        com.bumptech.glide.e.S(parcel, i13);
                    } else {
                        strW12 = com.bumptech.glide.e.w(parcel, i13);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT5);
                return new Scope(iN7, strW12);
            case 11:
                int iT6 = com.bumptech.glide.e.T(parcel);
                String strW13 = null;
                nb.b bVar2 = null;
                int iN8 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iT6) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        iN8 = com.bumptech.glide.e.N(parcel, i14);
                    } else if (c13 == 2) {
                        strW13 = com.bumptech.glide.e.w(parcel, i14);
                    } else if (c13 == 3) {
                        pendingIntent2 = (PendingIntent) com.bumptech.glide.e.v(parcel, i14, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        com.bumptech.glide.e.S(parcel, i14);
                    } else {
                        bVar2 = (nb.b) com.bumptech.glide.e.v(parcel, i14, nb.b.CREATOR);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT6);
                return new Status(iN8, strW13, pendingIntent2, bVar2);
            case 12:
                l0 l0Var = new l0(parcel);
                l0Var.f30758a = parcel.readByte() != 0;
                return l0Var;
            case 13:
                int iT7 = com.bumptech.glide.e.T(parcel);
                ArrayList arrayListA2 = null;
                int iN9 = 0;
                while (parcel.dataPosition() < iT7) {
                    int i15 = parcel.readInt();
                    char c14 = (char) i15;
                    if (c14 == 1) {
                        iN9 = com.bumptech.glide.e.N(parcel, i15);
                    } else if (c14 != 2) {
                        com.bumptech.glide.e.S(parcel, i15);
                    } else {
                        arrayListA2 = com.bumptech.glide.e.A(parcel, i15, pb.j.CREATOR);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT7);
                return new m(iN9, arrayListA2);
            case 14:
                int iT8 = com.bumptech.glide.e.T(parcel);
                int iN10 = -1;
                int iN11 = 0;
                int iN12 = 0;
                int iN13 = 0;
                int iN14 = 0;
                String strW14 = null;
                String strW15 = null;
                long jO4 = 0;
                long jO5 = 0;
                while (parcel.dataPosition() < iT8) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iN11 = com.bumptech.glide.e.N(parcel, i16);
                            break;
                        case 2:
                            iN12 = com.bumptech.glide.e.N(parcel, i16);
                            break;
                        case 3:
                            iN13 = com.bumptech.glide.e.N(parcel, i16);
                            break;
                        case 4:
                            jO4 = com.bumptech.glide.e.O(parcel, i16);
                            break;
                        case 5:
                            jO5 = com.bumptech.glide.e.O(parcel, i16);
                            break;
                        case 6:
                            strW14 = com.bumptech.glide.e.w(parcel, i16);
                            break;
                        case 7:
                            strW15 = com.bumptech.glide.e.w(parcel, i16);
                            break;
                        case '\b':
                            iN14 = com.bumptech.glide.e.N(parcel, i16);
                            break;
                        case '\t':
                            iN10 = com.bumptech.glide.e.N(parcel, i16);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i16);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT8);
                return new pb.j(iN11, iN12, iN13, jO4, jO5, strW14, strW15, iN14, iN10);
            case 15:
                int iT9 = com.bumptech.glide.e.T(parcel);
                Account account = null;
                int iN15 = 0;
                int iN16 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iT9) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        iN15 = com.bumptech.glide.e.N(parcel, i17);
                    } else if (c15 == 2) {
                        account = (Account) com.bumptech.glide.e.v(parcel, i17, Account.CREATOR);
                    } else if (c15 == 3) {
                        iN16 = com.bumptech.glide.e.N(parcel, i17);
                    } else if (c15 != 4) {
                        com.bumptech.glide.e.S(parcel, i17);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) com.bumptech.glide.e.v(parcel, i17, GoogleSignInAccount.CREATOR);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT9);
                return new r(iN15, account, iN16, googleSignInAccount);
            case 16:
                int iT10 = com.bumptech.glide.e.T(parcel);
                int iN17 = 0;
                boolean zL3 = false;
                boolean zL4 = false;
                IBinder iBinderM = null;
                nb.b bVar3 = null;
                while (parcel.dataPosition() < iT10) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 1) {
                        iN17 = com.bumptech.glide.e.N(parcel, i18);
                    } else if (c16 == 2) {
                        iBinderM = com.bumptech.glide.e.M(parcel, i18);
                    } else if (c16 == 3) {
                        bVar3 = (nb.b) com.bumptech.glide.e.v(parcel, i18, nb.b.CREATOR);
                    } else if (c16 == 4) {
                        zL3 = com.bumptech.glide.e.L(parcel, i18);
                    } else if (c16 != 5) {
                        com.bumptech.glide.e.S(parcel, i18);
                    } else {
                        zL4 = com.bumptech.glide.e.L(parcel, i18);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT10);
                return new pb.s(iN17, iBinderM, bVar3, zL3, zL4);
            case 17:
                int iT11 = com.bumptech.glide.e.T(parcel);
                int iN18 = 0;
                int iN19 = 0;
                int iN20 = 0;
                boolean zL5 = false;
                boolean zL6 = false;
                while (parcel.dataPosition() < iT11) {
                    int i19 = parcel.readInt();
                    char c17 = (char) i19;
                    if (c17 == 1) {
                        iN18 = com.bumptech.glide.e.N(parcel, i19);
                    } else if (c17 == 2) {
                        zL5 = com.bumptech.glide.e.L(parcel, i19);
                    } else if (c17 == 3) {
                        zL6 = com.bumptech.glide.e.L(parcel, i19);
                    } else if (c17 == 4) {
                        iN19 = com.bumptech.glide.e.N(parcel, i19);
                    } else if (c17 != 5) {
                        com.bumptech.glide.e.S(parcel, i19);
                    } else {
                        iN20 = com.bumptech.glide.e.N(parcel, i19);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT11);
                return new pb.l(iN18, iN19, iN20, zL5, zL6);
            case 18:
                int iT12 = com.bumptech.glide.e.T(parcel);
                Bundle bundleS = null;
                pb.f fVar = null;
                int iN21 = 0;
                nb.d[] dVarArr = null;
                while (parcel.dataPosition() < iT12) {
                    int i20 = parcel.readInt();
                    char c18 = (char) i20;
                    if (c18 == 1) {
                        bundleS = com.bumptech.glide.e.s(parcel, i20);
                    } else if (c18 == 2) {
                        dVarArr = (nb.d[]) com.bumptech.glide.e.z(parcel, i20, nb.d.CREATOR);
                    } else if (c18 == 3) {
                        iN21 = com.bumptech.glide.e.N(parcel, i20);
                    } else if (c18 != 4) {
                        com.bumptech.glide.e.S(parcel, i20);
                    } else {
                        fVar = (pb.f) com.bumptech.glide.e.v(parcel, i20, pb.f.CREATOR);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT12);
                g0 g0Var = new g0();
                g0Var.f31609a = bundleS;
                g0Var.f31610b = dVarArr;
                g0Var.f31611c = iN21;
                g0Var.f31612d = fVar;
                return g0Var;
            case 19:
                int iT13 = com.bumptech.glide.e.T(parcel);
                pb.l lVar = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zL7 = false;
                boolean zL8 = false;
                int iN22 = 0;
                while (parcel.dataPosition() < iT13) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            lVar = (pb.l) com.bumptech.glide.e.v(parcel, i21, pb.l.CREATOR);
                            break;
                        case 2:
                            zL7 = com.bumptech.glide.e.L(parcel, i21);
                            break;
                        case 3:
                            zL8 = com.bumptech.glide.e.L(parcel, i21);
                            break;
                        case 4:
                            int iP2 = com.bumptech.glide.e.P(parcel, i21);
                            int iDataPosition = parcel.dataPosition();
                            if (iP2 == 0) {
                                iArrCreateIntArray = null;
                                break;
                            } else {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iP2);
                                break;
                            }
                        case 5:
                            iN22 = com.bumptech.glide.e.N(parcel, i21);
                            break;
                        case 6:
                            int iP3 = com.bumptech.glide.e.P(parcel, i21);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iP3 == 0) {
                                iArrCreateIntArray2 = null;
                                break;
                            } else {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iP3);
                                break;
                            }
                        default:
                            com.bumptech.glide.e.S(parcel, i21);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT13);
                return new pb.f(lVar, zL7, zL8, iArrCreateIntArray, iN22, iArrCreateIntArray2);
            case 20:
                int iT14 = com.bumptech.glide.e.T(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = pb.g.f31595o;
                String strW16 = null;
                IBinder iBinderM2 = null;
                Account account2 = null;
                String strW17 = null;
                int iN23 = 0;
                int iN24 = 0;
                int iN25 = 0;
                boolean zL9 = false;
                int iN26 = 0;
                boolean zL10 = false;
                nb.d[] dVarArr2 = pb.g.f31596p;
                nb.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < iT14) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            iN23 = com.bumptech.glide.e.N(parcel, i22);
                            break;
                        case 2:
                            iN24 = com.bumptech.glide.e.N(parcel, i22);
                            break;
                        case 3:
                            iN25 = com.bumptech.glide.e.N(parcel, i22);
                            break;
                        case 4:
                            strW16 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                        case 5:
                            iBinderM2 = com.bumptech.glide.e.M(parcel, i22);
                            break;
                        case 6:
                            scopeArr = (Scope[]) com.bumptech.glide.e.z(parcel, i22, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = com.bumptech.glide.e.s(parcel, i22);
                            break;
                        case '\b':
                            account2 = (Account) com.bumptech.glide.e.v(parcel, i22, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            com.bumptech.glide.e.S(parcel, i22);
                            break;
                        case '\n':
                            dVarArr2 = (nb.d[]) com.bumptech.glide.e.z(parcel, i22, nb.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (nb.d[]) com.bumptech.glide.e.z(parcel, i22, nb.d.CREATOR);
                            break;
                        case '\f':
                            zL9 = com.bumptech.glide.e.L(parcel, i22);
                            break;
                        case '\r':
                            iN26 = com.bumptech.glide.e.N(parcel, i22);
                            break;
                        case 14:
                            zL10 = com.bumptech.glide.e.L(parcel, i22);
                            break;
                        case 15:
                            strW17 = com.bumptech.glide.e.w(parcel, i22);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT14);
                return new pb.g(iN23, iN24, iN25, strW16, iBinderM2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zL9, iN26, zL10, strW17);
            case 21:
                rc.b bVar4 = new rc.b(parcel);
                bVar4.f32903a = ((Integer) parcel.readValue(rc.b.class.getClassLoader())).intValue();
                return bVar4;
            case 22:
                int iT15 = com.bumptech.glide.e.T(parcel);
                boolean zL11 = false;
                while (parcel.dataPosition() < iT15) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        com.bumptech.glide.e.S(parcel, i23);
                    } else {
                        zL11 = com.bumptech.glide.e.L(parcel, i23);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT15);
                return new sa.a(zL11);
            case 23:
                int iT16 = com.bumptech.glide.e.T(parcel);
                IBinder iBinderM3 = null;
                boolean zL12 = false;
                IBinder iBinderM4 = null;
                while (parcel.dataPosition() < iT16) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 1) {
                        zL12 = com.bumptech.glide.e.L(parcel, i24);
                    } else if (c19 == 2) {
                        iBinderM3 = com.bumptech.glide.e.M(parcel, i24);
                    } else if (c19 != 3) {
                        com.bumptech.glide.e.S(parcel, i24);
                    } else {
                        iBinderM4 = com.bumptech.glide.e.M(parcel, i24);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT16);
                return new sa.e(zL12, iBinderM3, iBinderM4);
            case 24:
                int iT17 = com.bumptech.glide.e.T(parcel);
                boolean zL13 = false;
                boolean zL14 = false;
                boolean zL15 = false;
                int iN27 = 0;
                boolean zL16 = false;
                boolean zL17 = false;
                boolean zL18 = false;
                float f10 = 0.0f;
                String strW18 = null;
                while (parcel.dataPosition() < iT17) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            zL13 = com.bumptech.glide.e.L(parcel, i25);
                            break;
                        case 3:
                            zL14 = com.bumptech.glide.e.L(parcel, i25);
                            break;
                        case 4:
                            strW18 = com.bumptech.glide.e.w(parcel, i25);
                            break;
                        case 5:
                            zL15 = com.bumptech.glide.e.L(parcel, i25);
                            break;
                        case 6:
                            com.bumptech.glide.e.V(parcel, i25, 4);
                            f10 = parcel.readFloat();
                            break;
                        case 7:
                            iN27 = com.bumptech.glide.e.N(parcel, i25);
                            break;
                        case '\b':
                            zL16 = com.bumptech.glide.e.L(parcel, i25);
                            break;
                        case '\t':
                            zL17 = com.bumptech.glide.e.L(parcel, i25);
                            break;
                        case '\n':
                            zL18 = com.bumptech.glide.e.L(parcel, i25);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i25);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT17);
                return new ua.f(zL13, zL14, strW18, zL15, f10, iN27, zL16, zL17, zL18);
            case 25:
                int iT18 = com.bumptech.glide.e.T(parcel);
                String strW19 = null;
                String strW20 = null;
                String strW21 = null;
                while (parcel.dataPosition() < iT18) {
                    int i26 = parcel.readInt();
                    char c20 = (char) i26;
                    if (c20 == 1) {
                        strW19 = com.bumptech.glide.e.w(parcel, i26);
                    } else if (c20 == 2) {
                        strW20 = com.bumptech.glide.e.w(parcel, i26);
                    } else if (c20 != 3) {
                        com.bumptech.glide.e.S(parcel, i26);
                    } else {
                        strW21 = com.bumptech.glide.e.w(parcel, i26);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT18);
                return new wa.a(strW19, strW20, strW21);
            case 26:
                nk.k.e(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z10 = true;
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z10 = false;
                }
                float f11 = parcel.readFloat();
                float f12 = parcel.readFloat();
                boolean z11 = parcel.readInt() != 0 ? z3 : false;
                float f13 = parcel.readFloat();
                float f14 = parcel.readFloat();
                int i27 = parcel.readInt();
                int i28 = parcel.readInt();
                int i29 = parcel.readInt();
                int i30 = parcel.readInt();
                long j = parcel.readLong();
                long j8 = parcel.readLong();
                boolean z12 = parcel.readInt() != 0 ? z3 : false;
                boolean z13 = parcel.readInt() != 0 ? z3 : false;
                boolean z14 = parcel.readInt() != 0 ? z3 : false;
                int i31 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i31);
                for (int i32 = 0; i32 != i31; i32++) {
                    arrayList.add(wg.s.valueOf(parcel.readString()));
                }
                return new CustomMonitorConfig(string, string2, z10, f11, f12, z11, f13, f14, i27, i28, i29, i30, j, j8, z12, z13, z14, arrayList);
            case 27:
                int iT19 = com.bumptech.glide.e.T(parcel);
                String strW22 = null;
                String strW23 = null;
                String strW24 = null;
                String strW25 = null;
                String strW26 = null;
                String strW27 = null;
                String strW28 = null;
                Intent intent = null;
                IBinder iBinderM5 = null;
                Bundle bundleS2 = null;
                boolean zL19 = false;
                while (parcel.dataPosition() < iT19) {
                    int i33 = parcel.readInt();
                    switch ((char) i33) {
                        case 2:
                            strW22 = com.bumptech.glide.e.w(parcel, i33);
                            break;
                        case 3:
                            strW23 = com.bumptech.glide.e.w(parcel, i33);
                            break;
                        case 4:
                            strW24 = com.bumptech.glide.e.w(parcel, i33);
                            break;
                        case 5:
                            strW25 = com.bumptech.glide.e.w(parcel, i33);
                            break;
                        case 6:
                            strW26 = com.bumptech.glide.e.w(parcel, i33);
                            break;
                        case 7:
                            strW27 = com.bumptech.glide.e.w(parcel, i33);
                            break;
                        case '\b':
                            strW28 = com.bumptech.glide.e.w(parcel, i33);
                            break;
                        case '\t':
                            intent = (Intent) com.bumptech.glide.e.v(parcel, i33, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderM5 = com.bumptech.glide.e.M(parcel, i33);
                            break;
                        case 11:
                            zL19 = com.bumptech.glide.e.L(parcel, i33);
                            break;
                        case '\f':
                            bundleS2 = com.bumptech.glide.e.s(parcel, i33);
                            break;
                        default:
                            com.bumptech.glide.e.S(parcel, i33);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT19);
                return new xa.e(strW22, strW23, strW24, strW25, strW26, strW27, strW28, intent, iBinderM5, zL19, bundleS2);
            case 28:
                int iT20 = com.bumptech.glide.e.T(parcel);
                long jO6 = 0;
                boolean zL20 = false;
                int iN28 = 0;
                int iN29 = 0;
                boolean zL21 = false;
                xa.e eVar = null;
                IBinder iBinderM6 = null;
                IBinder iBinderM7 = null;
                IBinder iBinderM8 = null;
                IBinder iBinderM9 = null;
                String strW29 = null;
                String strW30 = null;
                IBinder iBinderM10 = null;
                String strW31 = null;
                za.a aVar = null;
                String strW32 = null;
                ua.f fVar2 = null;
                IBinder iBinderM11 = null;
                String strW33 = null;
                String strW34 = null;
                String strW35 = null;
                IBinder iBinderM12 = null;
                IBinder iBinderM13 = null;
                IBinder iBinderM14 = null;
                while (parcel.dataPosition() < iT20) {
                    int i34 = parcel.readInt();
                    switch ((char) i34) {
                        case 2:
                            eVar = (xa.e) com.bumptech.glide.e.v(parcel, i34, xa.e.CREATOR);
                            break;
                        case 3:
                            iBinderM6 = com.bumptech.glide.e.M(parcel, i34);
                            break;
                        case 4:
                            iBinderM7 = com.bumptech.glide.e.M(parcel, i34);
                            break;
                        case 5:
                            iBinderM8 = com.bumptech.glide.e.M(parcel, i34);
                            break;
                        case 6:
                            iBinderM9 = com.bumptech.glide.e.M(parcel, i34);
                            break;
                        case 7:
                            strW29 = com.bumptech.glide.e.w(parcel, i34);
                            break;
                        case '\b':
                            zL20 = com.bumptech.glide.e.L(parcel, i34);
                            break;
                        case '\t':
                            strW30 = com.bumptech.glide.e.w(parcel, i34);
                            break;
                        case '\n':
                            iBinderM10 = com.bumptech.glide.e.M(parcel, i34);
                            break;
                        case 11:
                            iN28 = com.bumptech.glide.e.N(parcel, i34);
                            break;
                        case '\f':
                            iN29 = com.bumptech.glide.e.N(parcel, i34);
                            break;
                        case '\r':
                            strW31 = com.bumptech.glide.e.w(parcel, i34);
                            break;
                        case 14:
                            aVar = (za.a) com.bumptech.glide.e.v(parcel, i34, za.a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        default:
                            com.bumptech.glide.e.S(parcel, i34);
                            break;
                        case 16:
                            strW32 = com.bumptech.glide.e.w(parcel, i34);
                            break;
                        case 17:
                            fVar2 = (ua.f) com.bumptech.glide.e.v(parcel, i34, ua.f.CREATOR);
                            break;
                        case 18:
                            iBinderM11 = com.bumptech.glide.e.M(parcel, i34);
                            break;
                        case 19:
                            strW33 = com.bumptech.glide.e.w(parcel, i34);
                            break;
                        case 24:
                            strW34 = com.bumptech.glide.e.w(parcel, i34);
                            break;
                        case 25:
                            strW35 = com.bumptech.glide.e.w(parcel, i34);
                            break;
                        case 26:
                            iBinderM12 = com.bumptech.glide.e.M(parcel, i34);
                            break;
                        case 27:
                            iBinderM13 = com.bumptech.glide.e.M(parcel, i34);
                            break;
                        case 28:
                            iBinderM14 = com.bumptech.glide.e.M(parcel, i34);
                            break;
                        case 29:
                            zL21 = com.bumptech.glide.e.L(parcel, i34);
                            break;
                        case 30:
                            jO6 = com.bumptech.glide.e.O(parcel, i34);
                            break;
                    }
                }
                com.bumptech.glide.e.C(parcel, iT20);
                return new AdOverlayInfoParcel(eVar, iBinderM6, iBinderM7, iBinderM8, iBinderM9, strW29, zL20, strW30, iBinderM10, iN28, iN29, strW31, aVar, strW32, fVar2, iBinderM11, strW33, strW34, strW35, iBinderM12, iBinderM13, iBinderM14, zL21, jO6);
            default:
                int iT21 = com.bumptech.glide.e.T(parcel);
                int iN30 = 0;
                String strW36 = null;
                while (parcel.dataPosition() < iT21) {
                    int i35 = parcel.readInt();
                    char c21 = (char) i35;
                    if (c21 == 1) {
                        strW36 = com.bumptech.glide.e.w(parcel, i35);
                    } else if (c21 != 2) {
                        com.bumptech.glide.e.S(parcel, i35);
                    } else {
                        iN30 = com.bumptech.glide.e.N(parcel, i35);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT21);
                return new ya.l(strW36, iN30);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f27388a) {
            case 0:
                return new h[i4];
            case 1:
                return new WrappedParcelable[i4];
            case 2:
                return new ki.d[i4];
            case 3:
                return new ParcelImpl[i4];
            case 4:
                return new GoogleSignInAccount[i4];
            case 5:
                return new lc.b[i4];
            case 6:
                return new nb.b[i4];
            case 7:
                return new nb.d[i4];
            case 8:
                return new s[i4];
            case 9:
                return new o9.d[i4];
            case 10:
                return new Scope[i4];
            case 11:
                return new Status[i4];
            case 12:
                return new l0[i4];
            case 13:
                return new m[i4];
            case 14:
                return new pb.j[i4];
            case 15:
                return new r[i4];
            case 16:
                return new pb.s[i4];
            case 17:
                return new pb.l[i4];
            case 18:
                return new g0[i4];
            case 19:
                return new pb.f[i4];
            case 20:
                return new pb.g[i4];
            case 21:
                return new rc.b[i4];
            case 22:
                return new sa.a[i4];
            case 23:
                return new sa.e[i4];
            case 24:
                return new ua.f[i4];
            case 25:
                return new wa.a[i4];
            case 26:
                return new CustomMonitorConfig[i4];
            case 27:
                return new xa.e[i4];
            case 28:
                return new AdOverlayInfoParcel[i4];
            default:
                return new ya.l[i4];
        }
    }
}
