package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qt2 extends hv1 implements j22 {
    public final String f;
    public final pr2 g;
    public final tr2 h;

    public qt2(String str, pr2 pr2Var, tr2 tr2Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f = str;
        this.g = pr2Var;
        this.h = tr2Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        b22 b22Var;
        double d;
        String strP;
        String strP2;
        u10 u10Var;
        pr2 pr2Var = this.g;
        tr2 tr2Var = this.h;
        switch (i) {
            case 2:
                oi0 oi0Var = new oi0(pr2Var);
                parcel2.writeNoException();
                iv1.e(parcel2, oi0Var);
                return true;
            case 3:
                String strA = tr2Var.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 4:
                synchronized (tr2Var) {
                    list = tr2Var.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strC = tr2Var.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 6:
                synchronized (tr2Var) {
                    b22Var = tr2Var.s;
                }
                parcel2.writeNoException();
                iv1.e(parcel2, b22Var);
                return true;
            case 7:
                String strE = tr2Var.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 8:
                synchronized (tr2Var) {
                    d = tr2Var.r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                synchronized (tr2Var) {
                    strP = tr2Var.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 10:
                synchronized (tr2Var) {
                    strP2 = tr2Var.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP2);
                return true;
            case 11:
                Bundle bundleD = tr2Var.d();
                parcel2.writeNoException();
                iv1.d(parcel2, bundleD);
                return true;
            case 12:
                pr2Var.o();
                parcel2.writeNoException();
                return true;
            case 13:
                py2 py2VarR = tr2Var.r();
                parcel2.writeNoException();
                iv1.e(parcel2, py2VarR);
                return true;
            case 14:
                Bundle bundle = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                synchronized (pr2Var) {
                    pr2Var.n.n(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                boolean zP = pr2Var.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                synchronized (pr2Var) {
                    pr2Var.n.k(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                x12 x12VarS = tr2Var.s();
                parcel2.writeNoException();
                iv1.e(parcel2, x12VarS);
                return true;
            case 18:
                synchronized (tr2Var) {
                    u10Var = tr2Var.q;
                }
                parcel2.writeNoException();
                iv1.e(parcel2, u10Var);
                return true;
            case 19:
                String str = this.f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
