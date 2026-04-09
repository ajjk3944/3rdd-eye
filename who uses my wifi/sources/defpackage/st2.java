package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class st2 extends hv1 implements k22 {
    public final String f;
    public final pr2 g;
    public final tr2 h;

    public st2(String str, pr2 pr2Var, tr2 tr2Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f = str;
        this.g = pr2Var;
        this.h = tr2Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        b22 b22Var;
        u10 u10Var;
        switch (i) {
            case 2:
                oi0 oi0Var = new oi0(this.g);
                parcel2.writeNoException();
                iv1.e(parcel2, oi0Var);
                return true;
            case 3:
                String strA = this.h.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 4:
                tr2 tr2Var = this.h;
                synchronized (tr2Var) {
                    list = tr2Var.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strC = this.h.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 6:
                tr2 tr2Var2 = this.h;
                synchronized (tr2Var2) {
                    b22Var = tr2Var2.t;
                }
                parcel2.writeNoException();
                iv1.e(parcel2, b22Var);
                return true;
            case 7:
                String strE = this.h.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 8:
                String strF = this.h.f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 9:
                Bundle bundleD = this.h.d();
                parcel2.writeNoException();
                iv1.d(parcel2, bundleD);
                return true;
            case 10:
                this.g.o();
                parcel2.writeNoException();
                return true;
            case 11:
                py2 py2VarR = this.h.r();
                parcel2.writeNoException();
                iv1.e(parcel2, py2VarR);
                return true;
            case 12:
                Bundle bundle = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                pr2 pr2Var = this.g;
                synchronized (pr2Var) {
                    pr2Var.n.n(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                boolean zP = this.g.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) iv1.b(parcel, Bundle.CREATOR);
                iv1.f(parcel);
                pr2 pr2Var2 = this.g;
                synchronized (pr2Var2) {
                    pr2Var2.n.k(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                x12 x12VarS = this.h.s();
                parcel2.writeNoException();
                iv1.e(parcel2, x12VarS);
                return true;
            case 16:
                tr2 tr2Var3 = this.h;
                synchronized (tr2Var3) {
                    u10Var = tr2Var3.q;
                }
                parcel2.writeNoException();
                iv1.e(parcel2, u10Var);
                return true;
            case 17:
                String str = this.f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
