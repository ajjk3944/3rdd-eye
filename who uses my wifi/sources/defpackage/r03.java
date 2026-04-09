package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r03 implements f03 {
    public final /* synthetic */ int a = 0;
    public final Context b;
    public final Object c;
    public Object d;
    public Object e;

    public r03(Context context, e51 e51Var, ei2 ei2Var, ld2 ld2Var) {
        this.b = context;
        this.d = e51Var;
        this.c = ei2Var;
        this.e = ld2Var;
    }

    @Override // defpackage.f03
    public final Object a(h83 h83Var, a83 a83Var, c03 c03Var) throws r13, n83 {
        View view;
        int i = this.a;
        int i2 = 7;
        Object obj = this.c;
        Object obj2 = null;
        int i3 = 1;
        switch (i) {
            case 0:
                if (((Boolean) tw1.e.c.a(mz1.z8)).booleanValue() && a83Var.g0) {
                    try {
                        a72 a72Var = (a72) this.e;
                        Parcel parcelY = a72Var.Y(a72Var.U(), 1);
                        u10 u10VarX0 = oi0.X0(parcelY.readStrongBinder());
                        parcelY.recycle();
                        view = (View) oi0.l1(u10VarX0);
                        a72 a72Var2 = (a72) this.e;
                        Parcel parcelY2 = a72Var2.Y(a72Var2.U(), 2);
                        ClassLoader classLoader = iv1.a;
                        boolean z = parcelY2.readInt() != 0;
                        parcelY2.recycle();
                        if (view == null) {
                            throw new n83(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (z) {
                            try {
                                view = (View) pu1.O(lq3.g, new op1(this, view, a83Var, 7), md2.f).get();
                            } catch (InterruptedException | ExecutionException e) {
                                throw new n83(e);
                            }
                        }
                    } catch (RemoteException e2) {
                        throw new n83(e2);
                    }
                } else {
                    view = (View) this.d;
                }
                bi2 bi2Var = (bi2) obj;
                xb4 xb4Var = new xb4(h83Var, a83Var, c03Var.a);
                p21 p21Var = new p21(view, (ag2) null, (dl2) new zs1(24, c03Var), (b83) a83Var.u.get(0));
                th2 th2Var = bi2Var.d;
                bi2 bi2Var2 = bi2Var.e;
                ai2 ai2Var = new ai2(th2Var, bi2Var2, xb4Var, p21Var);
                ((vp2) ai2Var.L.d()).U1(view);
                ((u03) c03Var.c).C3(new a23((sm2) ai2Var.x.d(), (wp2) ai2Var.D.d(), (cn2) ai2Var.A.d(), (gn2) ai2Var.w.d(), ai2Var.y(), (vo2) bi2Var2.S.d(), (xn2) ai2Var.G.d(), (fq2) ai2Var.H.d(), (so2) ai2Var.I.d(), (an2) ai2Var.J.d()));
                return ai2Var.z();
            case 1:
                xb4 xb4Var2 = new xb4(h83Var, a83Var, c03Var.a);
                l92 l92Var = new l92(new xb4(this, c03Var, a83Var, 27, false), obj2);
                ei2 ei2Var = (ei2) obj;
                th2 th2Var2 = ei2Var.b;
                ei2 ei2Var2 = ei2Var.c;
                di2 di2Var = new di2(th2Var2, ei2Var2, xb4Var2, l92Var);
                ((fn2) di2Var.r.d()).L1(new cj2(0, (u83) c03Var.b), (Executor) this.e);
                ((u03) c03Var.c).C3(new c23((sm2) di2Var.z.d(), (wp2) di2Var.C.d(), (cn2) di2Var.v.d(), (gn2) di2Var.y.d(), (qn2) di2Var.D.d(), (vo2) ei2Var2.Q.d(), (xn2) di2Var.F.d(), (fq2) di2Var.G.d(), (so2) di2Var.H.d(), (an2) di2Var.J.d()));
                return di2Var.y();
            default:
                ArrayList arrayList = ((l83) h83Var.a.g).h;
                if (!arrayList.contains(Integer.toString(6))) {
                    throw new r13("Unified must be used for RTB.", 2);
                }
                tr2 tr2VarL = tr2.l((e72) this.d);
                if (!arrayList.contains(Integer.toString(tr2VarL.q()))) {
                    throw new r13("No corresponding native ad listener", 1);
                }
                sh2 sh2Var = (sh2) obj;
                xb4 xb4Var3 = new xb4(h83Var, a83Var, c03Var.a);
                f23 f23Var = new f23(21, tr2VarL);
                t83 t83Var = new t83(null, null, (e72) this.d);
                th2 th2Var3 = sh2Var.b;
                sh2 sh2Var2 = sh2Var.c;
                ll2 ll2Var = new ll2(xb4Var3, 0);
                ba4 ba4Var = sh2Var2.g;
                rv1 rv1Var = th2Var3.F0;
                ba4 ba4VarA = ba4.a(new jj2(ba4Var, ll2Var, i3));
                ba4 ba4VarA2 = ba4.a(new zl2(ba4VarA, i2));
                int i4 = ha4.c;
                ArrayList arrayList2 = new ArrayList(1);
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(sh2Var2.o);
                arrayList3.add(sh2Var2.p);
                arrayList2.add(ba4VarA2);
                ba4 ba4VarA3 = ba4.a(new tm2(new ha4(arrayList2, arrayList3), 3));
                ba4 ba4VarA4 = ba4.a(ob1.l);
                ba4 ba4Var2 = th2Var3.c;
                ba4 ba4VarA5 = ba4.a(new sj2(ba4VarA4, (ga4) ba4Var2, 4));
                ll2 ll2Var2 = new ll2(xb4Var3, 3);
                ll2 ll2Var3 = new ll2(xb4Var3, 2);
                hh2 hh2Var = th2Var3.g;
                ba4 ba4VarA6 = ba4.a(new ar2(th2Var3.I, th2Var3.H, ll2Var, ll2Var3, ba4.a(new hj2(hh2Var, th2Var3.X, ba4.a(new ri2(hh2Var, 20)), ba4.a(yb.o), th2Var3.D0, th2Var3.d)), sh2Var2.e));
                zq2 zq2Var = new zq2(4);
                zq2 zq2Var2 = new zq2(2);
                ba4 ba4VarA7 = ba4.a(new sj2(ba4VarA4, (ga4) ba4Var2, 9));
                ba4 ba4VarA8 = ba4.a(wl2.E);
                gr2 gr2Var = new gr2(ba4VarA8, 2);
                ArrayList arrayList4 = new ArrayList(2);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(sh2Var2.u);
                arrayList4.add(ba4VarA7);
                arrayList4.add(gr2Var);
                ba4 ba4VarA9 = ba4.a(new wb2(new ha4(arrayList4, arrayList5), ll2Var, ll2Var2, 5));
                ba4 ba4VarA10 = ba4.a(new u12(9, ll2Var2));
                ba4 ba4VarA11 = ba4.a(new oj2(th2Var3.g, th2Var3.c, th2Var3.d, ll2Var2, ll2Var, sh2Var2.k, ba4VarA6, zq2Var, zq2Var2, th2Var3.E, sh2Var2.l, sh2Var2.e, sh2Var2.t, ba4VarA9, ba4VarA10));
                mh2 mh2Var = new mh2(ba4VarA11, 24);
                zl2 zl2Var = new zl2(ba4.a(new jj2(ll2Var, th2Var3.V, 0)), 11);
                ArrayList arrayList6 = new ArrayList(4);
                ArrayList arrayList7 = new ArrayList(2);
                arrayList6.add(sh2Var2.q);
                arrayList7.add(sh2Var2.r);
                arrayList7.add(sh2Var2.s);
                arrayList6.add(ba4VarA5);
                arrayList6.add(mh2Var);
                arrayList6.add(zl2Var);
                ba4 ba4VarA12 = ba4.a(new tm2(new ha4(arrayList6, arrayList7), 4));
                ba4 ba4VarA13 = ba4.a(new bm2(th2Var3.g, th2Var3.C0, th2Var3.j, ll2Var2, ll2Var, th2Var3.G, uk2.k));
                ba4 ba4VarA14 = ba4.a(new zl2(ba4VarA13, 5));
                ba4 ba4VarA15 = ba4.a(new sj2(ba4VarA4, (ga4) ba4Var2, 3));
                ba4 ba4Var3 = th2Var3.y0;
                qm2 qm2Var = sh2Var2.d;
                ba4 ba4VarA16 = ba4.a(new zl2(ba4.a(new qk2(ba4Var3, qm2Var, 1)), 3));
                mh2 mh2Var2 = new mh2(ba4VarA11, 23);
                ArrayList arrayList8 = new ArrayList(5);
                ArrayList arrayList9 = new ArrayList(3);
                arrayList8.add(sh2Var2.v);
                arrayList8.add(sh2Var2.w);
                arrayList9.add(sh2Var2.x);
                arrayList9.add(sh2Var2.y);
                arrayList8.add(ba4VarA14);
                arrayList8.add(ba4VarA15);
                arrayList9.add(ba4VarA16);
                arrayList8.add(mh2Var2);
                ba4 ba4VarA17 = ba4.a(new tm2(new ha4(arrayList8, arrayList9), 0));
                int i5 = 6;
                ba4 ba4VarA18 = ba4.a(new zl2(ba4VarA13, i5));
                ba4 ba4VarA19 = ba4.a(new sj2(ba4VarA4, (ga4) ba4Var2, i5));
                mh2 mh2Var3 = new mh2(ba4VarA9, 12);
                mh2 mh2Var4 = new mh2(ba4VarA11, 26);
                ArrayList arrayList10 = new ArrayList(6);
                ArrayList arrayList11 = new ArrayList(2);
                arrayList10.add(sh2Var2.z);
                arrayList10.add(sh2Var2.A);
                arrayList11.add(sh2Var2.B);
                arrayList11.add(sh2Var2.C);
                arrayList10.add(ba4VarA18);
                arrayList10.add(ba4VarA19);
                arrayList10.add(mh2Var3);
                arrayList10.add(mh2Var4);
                ba4 ba4VarA20 = ba4.a(new tm2(new ha4(arrayList10, arrayList11), 2));
                mh2 mh2Var5 = new mh2(ba4VarA11, 29);
                ArrayList arrayList12 = new ArrayList(1);
                ArrayList arrayList13 = new ArrayList(1);
                arrayList13.add(sh2Var2.D);
                arrayList12.add(mh2Var5);
                ba4 ba4VarA21 = ba4.a(new tm2(new ha4(arrayList12, arrayList13), 19));
                mh2 mh2Var6 = new mh2(ba4.a(new jj2(ll2Var, th2Var3.I, 2)), 22);
                ArrayList arrayList14 = new ArrayList(1);
                new ArrayList(1).add(sh2Var2.E);
                arrayList14.add(mh2Var6);
                ba4 ba4VarA22 = ba4.a(new sj2(ba4VarA4, (ga4) ba4Var2, 10));
                ArrayList arrayList15 = new ArrayList(1);
                ArrayList arrayList16 = new ArrayList(1);
                arrayList16.add(sh2Var2.F);
                arrayList15.add(ba4VarA22);
                ba4 ba4VarA23 = ba4.a(new tm2(new ha4(arrayList15, arrayList16), 20));
                int i6 = 8;
                ba4 ba4VarA24 = ba4.a(new zl2(ba4VarA, i6));
                mh2 mh2Var7 = new mh2(ba4VarA11, 27);
                ArrayList arrayList17 = new ArrayList(7);
                ArrayList arrayList18 = new ArrayList(4);
                arrayList17.add(sh2Var2.G);
                arrayList18.add(sh2Var2.H);
                arrayList17.add(sh2Var2.I);
                arrayList17.add(sh2Var2.J);
                arrayList18.add(sh2Var2.K);
                arrayList18.add(sh2Var2.L);
                arrayList18.add(sh2Var2.M);
                arrayList17.add(sh2Var2.N);
                arrayList17.add(sh2Var2.O);
                arrayList17.add(ba4VarA24);
                arrayList17.add(mh2Var7);
                ba4 ba4VarA25 = ba4.a(new tm2(new ha4(arrayList17, arrayList18), 5));
                zl2 zl2Var2 = new zl2(ba4.a(new mh2(ba4VarA12, 11)), 1);
                ba4 ba4VarA26 = ba4.a(new sj2(ba4VarA4, (ga4) ba4Var2, i6));
                ArrayList arrayList19 = new ArrayList(2);
                ArrayList arrayList20 = new ArrayList(1);
                arrayList20.add(sh2Var2.Q);
                arrayList19.add(zl2Var2);
                arrayList19.add(ba4VarA26);
                ba4 ba4VarA27 = ba4.a(new tm2(new ha4(arrayList19, arrayList20), 9));
                u12 u12Var = new u12(14, f23Var);
                rc2 rc2Var = new rc2(new jr2(u12Var, 1), ba4Var2, 15);
                ArrayList arrayList21 = new ArrayList(1);
                ArrayList arrayList22 = new ArrayList(1);
                arrayList22.add(sh2Var2.R);
                arrayList21.add(rc2Var);
                ba4 ba4VarA28 = ba4.a(new tm2(new ha4(arrayList21, arrayList22), 24));
                ba4 ba4VarA29 = ba4.a(new zl2(ba4VarA13, 4));
                us2 us2Var = new us2(t83Var, 0);
                us2 us2Var2 = new us2(t83Var, 1);
                int i7 = 2;
                us2 us2Var3 = new us2(t83Var, i7);
                ba4 ba4VarA30 = ba4.a(new zl2(ba4VarA13, i7));
                mh2 mh2Var8 = new mh2(ba4VarA11, 28);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(sh2Var2.Y);
                arrayList23.add(ba4VarA30);
                arrayList23.add(mh2Var8);
                ba4 ba4VarA31 = ba4.a(new ol2(us2Var, us2Var2, us2Var3, ba4VarA20, ba4.a(new tm2(new ha4(arrayList23, arrayList24), 10)), ba4VarA17, ba4VarA23, sh2Var2.g, ll2Var, th2Var3.h, qm2Var));
                gr2 gr2Var2 = new gr2(ba4VarA31, 5);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList25.add(ba4VarA29);
                arrayList26.add(gr2Var2);
                ba4 ba4VarA32 = ba4.a(new tm2(new ha4(arrayList25, arrayList26), 13));
                ba4 ba4VarA33 = ba4.a(new sj2(ba4VarA4, (ga4) ba4Var2, 5));
                mh2 mh2Var9 = new mh2(ba4VarA11, 25);
                ArrayList arrayList27 = new ArrayList(2);
                ArrayList arrayList28 = new ArrayList(1);
                arrayList28.add(sh2Var2.S);
                arrayList27.add(ba4VarA33);
                arrayList27.add(mh2Var9);
                tm2 tm2Var = new tm2(new ha4(arrayList27, arrayList28), 1);
                ba4 ba4VarA34 = ba4.a(new zl2(ba4VarA13, 0));
                ArrayList arrayList29 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList29.add(ba4VarA34);
                ba4 ba4VarA35 = ba4.a(new wb2(tm2Var, new ha4(arrayList29, list), th2Var3.d, 4));
                ll2 ll2Var4 = new ll2(xb4Var3, 1);
                ic2 ic2Var = new ic2(ll2Var, ll2Var4, sh2Var2.h, ll2Var3, sh2Var2.f, 4);
                ArrayList arrayList30 = new ArrayList(1);
                ArrayList arrayList31 = new ArrayList(1);
                arrayList31.add(sh2Var2.U);
                arrayList30.add(sh2Var2.V);
                ol2 ol2Var = new ol2(ll2Var2, ll2Var, ba4VarA3, ba4VarA25, sh2Var2.T, ic2Var, ba4VarA4, new tm2(new ha4(arrayList30, arrayList31), 6), ba4VarA21, ba4VarA10, th2Var3.n0);
                gr2 gr2Var3 = new gr2(ba4VarA31, 4);
                ba4 ba4VarA36 = ba4.a(new ak2(ll2Var, 1));
                zq2 zq2Var3 = new zq2(5);
                zq2 zq2Var4 = new zq2(6);
                ba4 ba4VarA37 = ba4.a(new u12(13, new jr2(u12Var, 0)));
                fh2 fh2Var = th2Var3.X;
                ba4 ba4Var4 = th2Var3.c;
                es2 es2Var = new es2(fh2Var, qm2Var, ba4VarA36, u12Var, zq2Var3, zq2Var4, ba4Var4, ba4VarA37);
                u43 u43Var = new u43();
                ba4 ba4VarA38 = ba4.a(new rt2(ll2Var4, u43Var, u12Var, 1));
                ba4 ba4VarA39 = ba4.a(new rt2(ll2Var4, u43Var, u12Var, 0));
                ba4 ba4VarA40 = ba4.a(new e02((ga4) ll2Var4, (ga4) u43Var, (ga4) u12Var, (ga4) th2Var3.j, 8));
                ba4 ba4VarA41 = ba4.a(new rc2(u43Var, u12Var, 17));
                hh2 hh2Var2 = th2Var3.g;
                u43.a(u43Var, ba4.a(new qr2(ol2Var, ba4Var4, u12Var, gr2Var3, es2Var, ba4VarA36, sh2Var2.i, ba4VarA38, ba4VarA39, ba4VarA40, ba4VarA41, ba4.a(new e02(hh2Var2, u12Var, es2Var, u43Var, 7)), new zr2(hh2Var2, qm2Var, 0), th2Var3.E, th2Var3.h, hh2Var2, ba4VarA37, ba4VarA8, th2Var3.M0)));
                ((u03) c03Var.c).C3(new a23((sm2) ba4VarA17.d(), (wp2) ba4VarA23.d(), (cn2) ba4VarA20.d(), (gn2) ba4VarA12.d(), (qn2) ba4VarA25.d(), (vo2) sh2Var2.P.d(), (xn2) ba4VarA27.d(), (fq2) ba4VarA28.d(), (so2) ba4VarA32.d(), (an2) ba4VarA35.d()));
                return (pr2) u43Var.d();
        }
    }

    @Override // defpackage.f03
    public final void b(h83 h83Var, a83 a83Var, c03 c03Var) throws JSONException, n83, IOException {
        switch (this.a) {
            case 0:
                try {
                    Object obj = c03Var.b;
                    IInterface iInterface = c03Var.c;
                    d82 d82Var = (d82) obj;
                    String str = a83Var.Z;
                    JSONObject jSONObject = a83Var.v;
                    d82Var.j1(str);
                    boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.z8)).booleanValue();
                    Context context = this.b;
                    if (zBooleanValue && a83Var.g0) {
                        String str2 = a83Var.U;
                        String string = jSONObject.toString();
                        l83 l83Var = (l83) h83Var.a.g;
                        d82Var.P1(str2, string, l83Var.d, new oi0(context), new q03(this, c03Var), (z62) iInterface, l83Var.f);
                        return;
                    }
                    String str3 = a83Var.U;
                    String string2 = jSONObject.toString();
                    l83 l83Var2 = (l83) h83Var.a.g;
                    d82Var.y1(str3, string2, l83Var2.d, new oi0(context), new q03(this, c03Var), (z62) iInterface, l83Var2.f);
                    return;
                } catch (RemoteException th) {
                    throw new n83(th);
                }
            case 1:
                u83 u83Var = (u83) c03Var.b;
                l83 l83Var3 = (l83) h83Var.a.g;
                String string3 = a83Var.v.toString();
                String strZ = bd2.Z(a83Var.s);
                Context context2 = this.b;
                z62 z62Var = (z62) c03Var.c;
                try {
                    u83Var.a.A0(new oi0(context2), l83Var3.d, string3, strZ, z62Var);
                    return;
                } finally {
                    n83 n83Var = new n83(th);
                }
            default:
                try {
                    Object obj2 = c03Var.b;
                    IInterface iInterface2 = c03Var.c;
                    d82 d82Var2 = (d82) obj2;
                    String str4 = a83Var.Z;
                    JSONObject jSONObject2 = a83Var.v;
                    d82Var2.j1(str4);
                    int i = ((e51) this.e).h;
                    int iIntValue = ((Integer) tw1.e.c.a(mz1.P1)).intValue();
                    Context context3 = this.b;
                    if (i < iIntValue) {
                        d82Var2.p3(a83Var.U, jSONObject2.toString(), ((l83) h83Var.a.g).d, new oi0(context3), new f13(this, c03Var), (z62) iInterface2);
                        return;
                    }
                    String str5 = a83Var.U;
                    String string4 = jSONObject2.toString();
                    l83 l83Var4 = (l83) h83Var.a.g;
                    d82Var2.L1(str5, string4, l83Var4.d, new oi0(context3), new f13(this, c03Var), (z62) iInterface2, l83Var4.j);
                    return;
                } catch (RemoteException th2) {
                    throw new n83(th2);
                }
        }
    }

    public r03(Context context, sh2 sh2Var, e51 e51Var) {
        this.b = context;
        this.c = sh2Var;
        this.e = e51Var;
    }

    public r03(Context context, bi2 bi2Var) {
        this.b = context;
        this.c = bi2Var;
    }
}
