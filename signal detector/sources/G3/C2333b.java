package g3;

import T2.g;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.Locale;
import k0.C2598b;
import k0.C2599c;
import k0.G;
import k0.L;
import k0.O;
import m2.C2654a;
import m2.C2658e;
import o.C2700K;
import o.C2721k;
import o3.C2761a;
import p2.f;
import q0.C2795h;
import q5.i;
import r2.C2876a;
import s2.e;
import t2.o;
import u2.C2951a;

/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2333b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20180a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f20180a) {
            case 0:
                C2334c c2334c = new C2334c();
                c2334c.i = 255;
                c2334c.f20206k = -2;
                c2334c.f20207l = -2;
                c2334c.f20208m = -2;
                c2334c.f20186H = Boolean.TRUE;
                c2334c.f20197a = parcel.readInt();
                c2334c.f20198b = (Integer) parcel.readSerializable();
                c2334c.f20199c = (Integer) parcel.readSerializable();
                c2334c.f20200d = (Integer) parcel.readSerializable();
                c2334c.f20201e = (Integer) parcel.readSerializable();
                c2334c.f20202f = (Integer) parcel.readSerializable();
                c2334c.f20203g = (Integer) parcel.readSerializable();
                c2334c.f20204h = (Integer) parcel.readSerializable();
                c2334c.i = parcel.readInt();
                c2334c.f20205j = parcel.readString();
                c2334c.f20206k = parcel.readInt();
                c2334c.f20207l = parcel.readInt();
                c2334c.f20208m = parcel.readInt();
                c2334c.f20181C = parcel.readString();
                c2334c.f20182D = parcel.readString();
                c2334c.f20183E = parcel.readInt();
                c2334c.f20185G = (Integer) parcel.readSerializable();
                c2334c.f20187I = (Integer) parcel.readSerializable();
                c2334c.f20188J = (Integer) parcel.readSerializable();
                c2334c.f20189K = (Integer) parcel.readSerializable();
                c2334c.f20190L = (Integer) parcel.readSerializable();
                c2334c.M = (Integer) parcel.readSerializable();
                c2334c.f20191N = (Integer) parcel.readSerializable();
                c2334c.f20194Q = (Integer) parcel.readSerializable();
                c2334c.f20192O = (Integer) parcel.readSerializable();
                c2334c.f20193P = (Integer) parcel.readSerializable();
                c2334c.f20186H = (Boolean) parcel.readSerializable();
                c2334c.f20209n = (Locale) parcel.readSerializable();
                c2334c.f20195R = (Boolean) parcel.readSerializable();
                c2334c.f20196S = (Integer) parcel.readSerializable();
                return c2334c;
            case 1:
                return new C2598b(parcel);
            case 2:
                return new C2599c(parcel);
            case 3:
                G g2 = new G();
                g2.f21482a = parcel.readString();
                g2.f21483b = parcel.readInt();
                return g2;
            case 4:
                L l2 = new L();
                l2.f21532e = null;
                l2.f21533f = new ArrayList();
                l2.f21534g = new ArrayList();
                l2.f21528a = parcel.createStringArrayList();
                l2.f21529b = parcel.createStringArrayList();
                l2.f21530c = (C2598b[]) parcel.createTypedArray(C2598b.CREATOR);
                l2.f21531d = parcel.readInt();
                l2.f21532e = parcel.readString();
                l2.f21533f = parcel.createStringArrayList();
                l2.f21534g = parcel.createTypedArrayList(C2599c.CREATOR);
                l2.f21535h = parcel.createTypedArrayList(G.CREATOR);
                return l2;
            case 5:
                return new O(parcel);
            case 6:
                int iO = g.O(parcel);
                boolean zD = false;
                while (parcel.dataPosition() < iO) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        g.L(parcel, i);
                    } else {
                        zD = g.D(parcel, i);
                    }
                }
                g.n(parcel, iO);
                return new C2654a(zD);
            case 7:
                int iO2 = g.O(parcel);
                IBinder iBinderF = null;
                boolean zD2 = false;
                IBinder iBinderF2 = null;
                while (parcel.dataPosition() < iO2) {
                    int i3 = parcel.readInt();
                    char c6 = (char) i3;
                    if (c6 == 1) {
                        zD2 = g.D(parcel, i3);
                    } else if (c6 == 2) {
                        iBinderF = g.F(parcel, i3);
                    } else if (c6 != 3) {
                        g.L(parcel, i3);
                    } else {
                        iBinderF2 = g.F(parcel, i3);
                    }
                }
                g.n(parcel, iO2);
                return new C2658e(zD2, iBinderF, iBinderF2);
            case 8:
                C2721k c2721k = new C2721k();
                c2721k.f22540a = parcel.readInt();
                return c2721k;
            case 9:
                C2700K c2700k = new C2700K(parcel);
                c2700k.f22398a = parcel.readByte() != 0;
                return c2700k;
            case 10:
                C2761a c2761a = new C2761a(parcel);
                c2761a.f22700a = ((Integer) parcel.readValue(C2761a.class.getClassLoader())).intValue();
                return c2761a;
            case 11:
                int iO3 = g.O(parcel);
                boolean zD3 = false;
                boolean zD4 = false;
                boolean zD5 = false;
                int iH = 0;
                boolean zD6 = false;
                boolean zD7 = false;
                boolean zD8 = false;
                float f2 = 0.0f;
                String strJ = null;
                while (parcel.dataPosition() < iO3) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            zD3 = g.D(parcel, i6);
                            break;
                        case 3:
                            zD4 = g.D(parcel, i6);
                            break;
                        case 4:
                            strJ = g.j(parcel, i6);
                            break;
                        case 5:
                            zD5 = g.D(parcel, i6);
                            break;
                        case 6:
                            g.R(parcel, i6, 4);
                            f2 = parcel.readFloat();
                            break;
                        case 7:
                            iH = g.H(parcel, i6);
                            break;
                        case '\b':
                            zD6 = g.D(parcel, i6);
                            break;
                        case '\t':
                            zD7 = g.D(parcel, i6);
                            break;
                        case '\n':
                            zD8 = g.D(parcel, i6);
                            break;
                        default:
                            g.L(parcel, i6);
                            break;
                    }
                }
                g.n(parcel, iO3);
                return new f(zD3, zD4, strJ, zD5, f2, iH, zD6, zD7, zD8);
            case 12:
                i.e(parcel, "inParcel");
                return new C2795h(parcel);
            case 13:
                int iO4 = g.O(parcel);
                String strJ2 = null;
                String strJ3 = null;
                String strJ4 = null;
                while (parcel.dataPosition() < iO4) {
                    int i7 = parcel.readInt();
                    char c7 = (char) i7;
                    if (c7 == 1) {
                        strJ2 = g.j(parcel, i7);
                    } else if (c7 == 2) {
                        strJ3 = g.j(parcel, i7);
                    } else if (c7 != 3) {
                        g.L(parcel, i7);
                    } else {
                        strJ4 = g.j(parcel, i7);
                    }
                }
                g.n(parcel, iO4);
                return new C2876a(strJ2, strJ3, strJ4);
            case 14:
                int iO5 = g.O(parcel);
                String strJ5 = null;
                String strJ6 = null;
                String strJ7 = null;
                String strJ8 = null;
                String strJ9 = null;
                String strJ10 = null;
                String strJ11 = null;
                Intent intent = null;
                IBinder iBinderF3 = null;
                Bundle bundleG = null;
                boolean zD9 = false;
                while (parcel.dataPosition() < iO5) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            strJ5 = g.j(parcel, i8);
                            break;
                        case 3:
                            strJ6 = g.j(parcel, i8);
                            break;
                        case 4:
                            strJ7 = g.j(parcel, i8);
                            break;
                        case 5:
                            strJ8 = g.j(parcel, i8);
                            break;
                        case 6:
                            strJ9 = g.j(parcel, i8);
                            break;
                        case 7:
                            strJ10 = g.j(parcel, i8);
                            break;
                        case '\b':
                            strJ11 = g.j(parcel, i8);
                            break;
                        case '\t':
                            intent = (Intent) g.i(parcel, i8, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderF3 = g.F(parcel, i8);
                            break;
                        case 11:
                            zD9 = g.D(parcel, i8);
                            break;
                        case '\f':
                            bundleG = g.g(parcel, i8);
                            break;
                        default:
                            g.L(parcel, i8);
                            break;
                    }
                }
                g.n(parcel, iO5);
                return new e(strJ5, strJ6, strJ7, strJ8, strJ9, strJ10, strJ11, intent, iBinderF3, zD9, bundleG);
            case 15:
                int iO6 = g.O(parcel);
                long jI = 0;
                boolean zD10 = false;
                int iH2 = 0;
                int iH3 = 0;
                boolean zD11 = false;
                e eVar = null;
                IBinder iBinderF4 = null;
                IBinder iBinderF5 = null;
                IBinder iBinderF6 = null;
                IBinder iBinderF7 = null;
                String strJ12 = null;
                String strJ13 = null;
                IBinder iBinderF8 = null;
                String strJ14 = null;
                C2951a c2951a = null;
                String strJ15 = null;
                f fVar = null;
                IBinder iBinderF9 = null;
                String strJ16 = null;
                String strJ17 = null;
                String strJ18 = null;
                IBinder iBinderF10 = null;
                IBinder iBinderF11 = null;
                IBinder iBinderF12 = null;
                while (parcel.dataPosition() < iO6) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            eVar = (e) g.i(parcel, i9, e.CREATOR);
                            break;
                        case 3:
                            iBinderF4 = g.F(parcel, i9);
                            break;
                        case 4:
                            iBinderF5 = g.F(parcel, i9);
                            break;
                        case 5:
                            iBinderF6 = g.F(parcel, i9);
                            break;
                        case 6:
                            iBinderF7 = g.F(parcel, i9);
                            break;
                        case 7:
                            strJ12 = g.j(parcel, i9);
                            break;
                        case '\b':
                            zD10 = g.D(parcel, i9);
                            break;
                        case '\t':
                            strJ13 = g.j(parcel, i9);
                            break;
                        case '\n':
                            iBinderF8 = g.F(parcel, i9);
                            break;
                        case 11:
                            iH2 = g.H(parcel, i9);
                            break;
                        case '\f':
                            iH3 = g.H(parcel, i9);
                            break;
                        case '\r':
                            strJ14 = g.j(parcel, i9);
                            break;
                        case 14:
                            c2951a = (C2951a) g.i(parcel, i9, C2951a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        default:
                            g.L(parcel, i9);
                            break;
                        case 16:
                            strJ15 = g.j(parcel, i9);
                            break;
                        case 17:
                            fVar = (f) g.i(parcel, i9, f.CREATOR);
                            break;
                        case 18:
                            iBinderF9 = g.F(parcel, i9);
                            break;
                        case 19:
                            strJ16 = g.j(parcel, i9);
                            break;
                        case 24:
                            strJ17 = g.j(parcel, i9);
                            break;
                        case 25:
                            strJ18 = g.j(parcel, i9);
                            break;
                        case 26:
                            iBinderF10 = g.F(parcel, i9);
                            break;
                        case 27:
                            iBinderF11 = g.F(parcel, i9);
                            break;
                        case 28:
                            iBinderF12 = g.F(parcel, i9);
                            break;
                        case 29:
                            zD11 = g.D(parcel, i9);
                            break;
                        case 30:
                            jI = g.I(parcel, i9);
                            break;
                    }
                }
                g.n(parcel, iO6);
                return new AdOverlayInfoParcel(eVar, iBinderF4, iBinderF5, iBinderF6, iBinderF7, strJ12, zD10, strJ13, iBinderF8, iH2, iH3, strJ14, c2951a, strJ15, fVar, iBinderF9, strJ16, strJ17, strJ18, iBinderF10, iBinderF11, iBinderF12, zD11, jI);
            case 16:
                int iO7 = g.O(parcel);
                int iH4 = 0;
                String strJ19 = null;
                while (parcel.dataPosition() < iO7) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        strJ19 = g.j(parcel, i10);
                    } else if (c8 != 2) {
                        g.L(parcel, i10);
                    } else {
                        iH4 = g.H(parcel, i10);
                    }
                }
                g.n(parcel, iO7);
                return new o(strJ19, iH4);
            default:
                int iO8 = g.O(parcel);
                int iH5 = 0;
                int iH6 = 0;
                boolean zD12 = false;
                boolean zD13 = false;
                String strJ20 = null;
                while (parcel.dataPosition() < iO8) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 2) {
                        strJ20 = g.j(parcel, i11);
                    } else if (c9 == 3) {
                        iH5 = g.H(parcel, i11);
                    } else if (c9 == 4) {
                        iH6 = g.H(parcel, i11);
                    } else if (c9 == 5) {
                        zD12 = g.D(parcel, i11);
                    } else if (c9 != 6) {
                        g.L(parcel, i11);
                    } else {
                        zD13 = g.D(parcel, i11);
                    }
                }
                g.n(parcel, iO8);
                return new C2951a(strJ20, iH5, iH6, zD12, zD13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f20180a) {
            case 0:
                return new C2334c[i];
            case 1:
                return new C2598b[i];
            case 2:
                return new C2599c[i];
            case 3:
                return new G[i];
            case 4:
                return new L[i];
            case 5:
                return new O[i];
            case 6:
                return new C2654a[i];
            case 7:
                return new C2658e[i];
            case 8:
                return new C2721k[i];
            case 9:
                return new C2700K[i];
            case 10:
                return new C2761a[i];
            case 11:
                return new f[i];
            case 12:
                return new C2795h[i];
            case 13:
                return new C2876a[i];
            case 14:
                return new e[i];
            case 15:
                return new AdOverlayInfoParcel[i];
            case 16:
                return new o[i];
            default:
                return new C2951a[i];
        }
    }
}
