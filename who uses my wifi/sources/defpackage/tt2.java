package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tt2 extends hv1 implements p22 {
    public final Context f;
    public final tr2 g;
    public ds2 h;
    public pr2 i;

    public tt2(Context context, tr2 tr2Var, ds2 ds2Var, pr2 pr2Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f = context;
        this.g = tr2Var;
        this.h = ds2Var;
        this.i = pr2Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws SecurityException {
        List<String> arrayList;
        bw0 bw0Var;
        bw0 bw0Var2;
        String str;
        z12 z12Var;
        bw0 bw0Var3;
        bw0 bw0Var4;
        pr2 pr2Var;
        ds2 ds2Var;
        z12 z12Var2 = null;
        int i2 = 0;
        switch (i) {
            case 1:
                String string = parcel.readString();
                iv1.f(parcel);
                tr2 tr2Var = this.g;
                synchronized (tr2Var) {
                    bw0Var3 = tr2Var.w;
                }
                String str2 = (String) bw0Var3.get(string);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String string2 = parcel.readString();
                iv1.f(parcel);
                tr2 tr2Var2 = this.g;
                synchronized (tr2Var2) {
                    bw0Var4 = tr2Var2.v;
                }
                b22 b22Var = (b22) bw0Var4.get(string2);
                parcel2.writeNoException();
                iv1.e(parcel2, b22Var);
                return true;
            case 3:
                try {
                    tr2 tr2Var3 = this.g;
                    synchronized (tr2Var3) {
                        bw0Var = tr2Var3.v;
                    }
                    synchronized (tr2Var3) {
                        bw0Var2 = tr2Var3.w;
                    }
                    String[] strArr = new String[bw0Var.h + bw0Var2.h];
                    int i3 = 0;
                    for (int i4 = 0; i4 < bw0Var.h; i4++) {
                        strArr[i3] = (String) bw0Var.f(i4);
                        i3++;
                    }
                    while (i2 < bw0Var2.h) {
                        strArr[i3] = (String) bw0Var2.f(i2);
                        i3++;
                        i2++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e) {
                    hg4.C.h.d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String strG = this.g.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 5:
                String string3 = parcel.readString();
                iv1.f(parcel);
                pr2 pr2Var2 = this.i;
                if (pr2Var2 != null) {
                    synchronized (pr2Var2) {
                        pr2Var2.n.J(string3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                pr2 pr2Var3 = this.i;
                if (pr2Var3 != null) {
                    synchronized (pr2Var3) {
                        if (!pr2Var3.y) {
                            pr2Var3.n.j0();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 7:
                py2 py2VarR = this.g.r();
                parcel2.writeNoException();
                iv1.e(parcel2, py2VarR);
                return true;
            case 8:
                pr2 pr2Var4 = this.i;
                if (pr2Var4 != null) {
                    pr2Var4.o();
                }
                this.i = null;
                this.h = null;
                parcel2.writeNoException();
                return true;
            case 9:
                u10 u10VarR0 = R0();
                parcel2.writeNoException();
                iv1.e(parcel2, u10VarR0);
                return true;
            case 10:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                boolean zD = D(u10VarX0);
                parcel2.writeNoException();
                parcel2.writeInt(zD ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = iv1.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                pr2 pr2Var5 = this.i;
                if (pr2Var5 == null || pr2Var5.p.c()) {
                    tr2 tr2Var4 = this.g;
                    if (tr2Var4.j() != null && tr2Var4.h() == null) {
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = iv1.a;
                parcel2.writeInt(i2);
                return true;
            case 13:
                tr2 tr2Var5 = this.g;
                xz2 xz2VarK = tr2Var5.k();
                if (xz2VarK != null) {
                    su2 su2Var = hg4.C.x;
                    xb3 xb3Var = xz2VarK.a;
                    su2Var.getClass();
                    su2.j(xb3Var);
                    if (tr2Var5.j() != null) {
                        tr2Var5.j().a("onSdkLoaded", new s8(0));
                    }
                    i2 = 1;
                } else {
                    gi2.i0("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = iv1.a;
                parcel2.writeInt(i2);
                return true;
            case 14:
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                Object objL1 = oi0.l1(u10VarX02);
                if ((objL1 instanceof View) && this.g.k() != null && (pr2Var = this.i) != null) {
                    pr2Var.f((View) objL1);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    tr2 tr2Var6 = this.g;
                    synchronized (tr2Var6) {
                        str = tr2Var6.y;
                    }
                    if (Objects.equals(str, "Google")) {
                        gi2.i0("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        gi2.i0("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        pr2 pr2Var6 = this.i;
                        if (pr2Var6 != null) {
                            pr2Var6.e(str, false);
                        }
                    }
                } catch (NullPointerException e2) {
                    hg4.C.h.d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e2);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    rr2 rr2Var = this.i.F;
                    synchronized (rr2Var) {
                        z12Var = rr2Var.a;
                    }
                    z12Var2 = z12Var;
                } catch (NullPointerException e3) {
                    hg4.C.h.d("InternalNativeCustomTemplateAdShim.getMediaContent", e3);
                }
                parcel2.writeNoException();
                iv1.e(parcel2, z12Var2);
                return true;
            case 17:
                u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                Object objL12 = oi0.l1(u10VarX03);
                if ((objL12 instanceof ViewGroup) && (ds2Var = this.h) != null && ds2Var.c((ViewGroup) objL12, false)) {
                    this.g.i().N(new zs1(21, this));
                    i2 = 1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.p22
    public final boolean D(u10 u10Var) throws SecurityException {
        ds2 ds2Var;
        Object objL1 = oi0.l1(u10Var);
        if (!(objL1 instanceof ViewGroup) || (ds2Var = this.h) == null || !ds2Var.c((ViewGroup) objL1, true)) {
            return false;
        }
        this.g.h().N(new zs1(21, this));
        return true;
    }

    @Override // defpackage.p22
    public final u10 R0() {
        return new oi0(this.f);
    }

    @Override // defpackage.p22
    public final String f() {
        return this.g.g();
    }
}
