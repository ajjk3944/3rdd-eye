package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p72 extends hv1 implements e72 {
    public final hd1 f;

    public p72(hd1 hd1Var) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f = hd1Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String str = this.f.a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List listC = c();
                parcel2.writeNoException();
                parcel2.writeList(listC);
                return true;
            case 4:
                String str2 = this.f.c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                b22 b22VarF = f();
                parcel2.writeNoException();
                iv1.e(parcel2, b22VarF);
                return true;
            case 6:
                String str3 = this.f.e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.f.f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                double dK = k();
                parcel2.writeNoException();
                parcel2.writeDouble(dK);
                return true;
            case 9:
                String str5 = this.f.h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.f.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                py2 py2VarO = o();
                parcel2.writeNoException();
                iv1.e(parcel2, py2VarO);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                q();
                parcel2.writeNoException();
                ClassLoader classLoader2 = iv1.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 14:
                m();
                parcel2.writeNoException();
                ClassLoader classLoader3 = iv1.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 15:
                u10 u10VarE = E();
                parcel2.writeNoException();
                iv1.e(parcel2, u10VarE);
                return true;
            case 16:
                Bundle bundleU2 = u2();
                parcel2.writeNoException();
                iv1.d(parcel2, bundleU2);
                return true;
            case 17:
                boolean z = this.f.m;
                parcel2.writeNoException();
                ClassLoader classLoader4 = iv1.a;
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 18:
                boolean z2 = this.f.n;
                parcel2.writeNoException();
                ClassLoader classLoader5 = iv1.a;
                parcel2.writeInt(z2 ? 1 : 0);
                return true;
            case 19:
                s();
                parcel2.writeNoException();
                return true;
            case 20:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                l0(u10VarX0);
                parcel2.writeNoException();
                return true;
            case zy1.zzm /* 21 */:
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
                u10 u10VarX04 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                n1(u10VarX02, u10VarX03, u10VarX04);
                parcel2.writeNoException();
                return true;
            case 22:
                u10 u10VarX05 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                W0(u10VarX05);
                parcel2.writeNoException();
                return true;
            case 23:
                X();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                L();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                C();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 26:
                F();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.e72
    public final float C() {
        this.f.getClass();
        return 0.0f;
    }

    @Override // defpackage.e72
    public final u10 E() {
        Object obj = this.f.k;
        if (obj == null) {
            return null;
        }
        return new oi0(obj);
    }

    @Override // defpackage.e72
    public final void F() {
        this.f.getClass();
    }

    @Override // defpackage.e72
    public final float L() {
        this.f.getClass();
        return 0.0f;
    }

    @Override // defpackage.e72
    public final boolean N() {
        return this.f.m;
    }

    @Override // defpackage.e72
    public final void W0(u10 u10Var) {
        this.f.getClass();
    }

    @Override // defpackage.e72
    public final float X() {
        this.f.getClass();
        return 0.0f;
    }

    @Override // defpackage.e72
    public final String b() {
        return this.f.a;
    }

    @Override // defpackage.e72
    public final List c() {
        List<c22> list = this.f.b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (c22 c22Var : list) {
                arrayList.add(new p12(c22Var.b, c22Var.c, c22Var.d, c22Var.e, c22Var.f, null));
            }
        }
        return arrayList;
    }

    @Override // defpackage.e72
    public final String e() {
        return this.f.c;
    }

    @Override // defpackage.e72
    public final b22 f() {
        c22 c22Var = this.f.d;
        if (c22Var != null) {
            return new p12(c22Var.b, c22Var.c, c22Var.d, c22Var.e, c22Var.f, null);
        }
        return null;
    }

    @Override // defpackage.e72
    public final String g() {
        return this.f.f;
    }

    @Override // defpackage.e72
    public final boolean h0() {
        return this.f.n;
    }

    @Override // defpackage.e72
    public final String i() {
        return this.f.h;
    }

    @Override // defpackage.e72
    public final String j() {
        return this.f.e;
    }

    @Override // defpackage.e72
    public final double k() {
        Double d = this.f.g;
        if (d != null) {
            return d.doubleValue();
        }
        return -1.0d;
    }

    @Override // defpackage.e72
    public final void l0(u10 u10Var) {
        this.f.getClass();
    }

    @Override // defpackage.e72
    public final u10 m() {
        this.f.getClass();
        return null;
    }

    @Override // defpackage.e72
    public final String n() {
        return this.f.i;
    }

    @Override // defpackage.e72
    public final void n1(u10 u10Var, u10 u10Var2, u10 u10Var3) {
        View view = (View) oi0.l1(u10Var);
        this.f.getClass();
        if (kc2.a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // defpackage.e72
    public final py2 o() {
        py2 py2Var;
        j51 j51Var = this.f.j;
        if (j51Var == null) {
            return null;
        }
        synchronized (j51Var.a) {
            py2Var = j51Var.b;
        }
        return py2Var;
    }

    @Override // defpackage.e72
    public final x12 p() {
        return null;
    }

    @Override // defpackage.e72
    public final u10 q() {
        this.f.getClass();
        return null;
    }

    @Override // defpackage.e72
    public final void s() {
        this.f.getClass();
    }

    @Override // defpackage.e72
    public final Bundle u2() {
        return this.f.l;
    }
}
