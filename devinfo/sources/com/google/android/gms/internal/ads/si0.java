package com.google.android.gms.internal.ads;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class si0 implements fi0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16018a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16019b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16020c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16021d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16022e;

    public si0(Context context, j10 j10Var, za.a aVar) {
        this.f16019b = context;
        this.f16020c = j10Var;
        this.f16022e = aVar;
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final void a(dq0 dq0Var, wp0 wp0Var, ci0 ci0Var) throws JSONException, IOException, kq0 {
        switch (this.f16018a) {
            case 0:
                try {
                    Object obj = ci0Var.f10135b;
                    IInterface iInterface = ci0Var.f10136c;
                    is isVar = (is) obj;
                    String str = wp0Var.Z;
                    JSONObject jSONObject = wp0Var.f18112v;
                    isVar.U2(str);
                    boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.U8)).booleanValue();
                    Context context = this.f16019b;
                    if (zBooleanValue && wp0Var.f18084g0) {
                        String str2 = wp0Var.U;
                        String string = jSONObject.toString();
                        hq0 hq0Var = (hq0) dq0Var.f10543a.f15651b;
                        isVar.k3(str2, string, hq0Var.f11944d, new vb.b(context), new ri0(this, ci0Var), (fr) iInterface, hq0Var.f11946f);
                        return;
                    }
                    String str3 = wp0Var.U;
                    String string2 = jSONObject.toString();
                    hq0 hq0Var2 = (hq0) dq0Var.f10543a.f15651b;
                    isVar.W2(str3, string2, hq0Var2.f11944d, new vb.b(context), new ri0(this, ci0Var), (fr) iInterface, hq0Var2.f11946f);
                    return;
                } catch (RemoteException th2) {
                    throw new kq0(th2);
                }
            case 1:
                qq0 qq0Var = (qq0) ci0Var.f10135b;
                hq0 hq0Var3 = (hq0) dq0Var.f10543a.f15651b;
                String string3 = wp0Var.f18112v.toString();
                String strE = pd.b.E(wp0Var.f18106s);
                Context context2 = this.f16019b;
                fr frVar = (fr) ci0Var.f10136c;
                try {
                    qq0Var.f15399a.Q2(new vb.b(context2), hq0Var3.f11944d, string3, strE, frVar);
                    return;
                } finally {
                    kq0 kq0Var = new kq0(th2);
                }
            default:
                try {
                    Object obj2 = ci0Var.f10135b;
                    IInterface iInterface2 = ci0Var.f10136c;
                    is isVar2 = (is) obj2;
                    String str4 = wp0Var.Z;
                    JSONObject jSONObject2 = wp0Var.f18112v;
                    isVar2.U2(str4);
                    int i4 = ((za.a) this.f16022e).f38131c;
                    int iIntValue = ((Integer) va.s.f36163e.f36166c.a(sk.e2)).intValue();
                    Context context3 = this.f16019b;
                    if (i4 < iIntValue) {
                        isVar2.h1(wp0Var.U, jSONObject2.toString(), ((hq0) dq0Var.f10543a.f15651b).f11944d, new vb.b(context3), new dj0(this, ci0Var), (fr) iInterface2);
                        return;
                    }
                    String str5 = wp0Var.U;
                    String string4 = jSONObject2.toString();
                    hq0 hq0Var4 = (hq0) dq0Var.f10543a.f15651b;
                    isVar2.l0(str5, string4, hq0Var4.f11944d, new vb.b(context3), new dj0(this, ci0Var), (fr) iInterface2, hq0Var4.j);
                    return;
                } catch (RemoteException th22) {
                    throw new kq0(th22);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final Object b(dq0 dq0Var, wp0 wp0Var, ci0 ci0Var) throws qj0, kq0 {
        View view;
        int i4 = this.f16018a;
        int i10 = 23;
        Object obj = this.f16020c;
        Object obj2 = null;
        int i11 = 1;
        switch (i4) {
            case 0:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.U8)).booleanValue() && wp0Var.f18084g0) {
                    try {
                        gr grVar = (gr) this.f16022e;
                        Parcel parcelR0 = grVar.r0(grVar.T(), 1);
                        vb.a aVarR0 = vb.b.r0(parcelR0.readStrongBinder());
                        parcelR0.recycle();
                        view = (View) vb.b.U0(aVarR0);
                        gr grVar2 = (gr) this.f16022e;
                        Parcel parcelR02 = grVar2.r0(grVar2.T(), 2);
                        ClassLoader classLoader = ng.f14287a;
                        boolean z3 = parcelR02.readInt() != 0;
                        parcelR02.recycle();
                        if (view == null) {
                            throw new kq0(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (z3) {
                            try {
                                view = (View) yo0.F(s81.f15906b, new s40(this, view, wp0Var, 6), fx.f11279f).get();
                            } catch (InterruptedException | ExecutionException e2) {
                                throw new kq0(e2);
                            }
                        }
                    } catch (RemoteException e10) {
                        throw new kq0(e10);
                    }
                } else {
                    view = (View) this.f16021d;
                }
                p10 p10Var = (p10) obj;
                pq0 pq0Var = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                aw awVar = new aw(view, (qz) null, new rg0(2, ci0Var), (xp0) wp0Var.f18110u.get(0));
                k10 k10Var = p10Var.f14832d;
                p10 p10Var2 = p10Var.f14834e;
                o10 o10Var = new o10(k10Var, p10Var2, pq0Var, awVar);
                ((r80) o10Var.f14509f0.a()).v1(view);
                ((vi0) ci0Var.f10136c).i4(new ak0((e60) o10Var.R.a(), (s80) o10Var.X.a(), (o60) o10Var.U.a(), (t60) o10Var.Q.a(), o10Var.Z(), (v70) p10Var2.T.a(), (c70) o10Var.f14504a0.a(), (z80) o10Var.f14505b0.a(), (s70) o10Var.f14506c0.a(), (m60) o10Var.f14507d0.a()));
                return o10Var.a0();
            case 1:
                pq0 pq0Var2 = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                l90 l90Var = new l90(11, new pq0(this, ci0Var, wp0Var, 23), obj2);
                t10 t10Var = (t10) obj;
                k10 k10Var2 = t10Var.f16640b;
                t10 t10Var2 = t10Var.f16641c;
                s10 s10Var = new s10(k10Var2, t10Var2, pq0Var2, l90Var);
                ((s60) s10Var.L.a()).m1(new r20(0, (qq0) ci0Var.f10135b), (Executor) this.f16022e);
                ((vi0) ci0Var.f10136c).i4(new dk0((e60) s10Var.T.a(), (s80) s10Var.W.a(), (o60) s10Var.P.a(), (t60) s10Var.S.a(), (v60) s10Var.X.a(), (v70) t10Var2.R.a(), (c70) s10Var.Z.a(), (z80) s10Var.f15834a0.a(), (s70) s10Var.f15835b0.a(), (m60) s10Var.f15837d0.a()));
                return s10Var.Z();
            default:
                ArrayList arrayList = ((hq0) dq0Var.f10543a.f15651b).f11947h;
                if (!arrayList.contains(Integer.toString(6))) {
                    throw new qj0(2, "Unified must be used for RTB.");
                }
                ga0 ga0VarA = ga0.A((lr) this.f16021d);
                if (!arrayList.contains(Integer.toString(ga0VarA.W()))) {
                    throw new qj0(1, "No corresponding native ad listener");
                }
                j10 j10Var = (j10) obj;
                pq0 pq0Var3 = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                mx0 mx0Var = new mx0(i10, ga0VarA);
                pq0 pq0Var4 = new pq0((jr) null, (ir) null, (lr) this.f16021d);
                k10 k10Var3 = j10Var.f12567b;
                j10 j10Var2 = j10Var.f12568c;
                v40 v40Var = new v40(pq0Var3, 0);
                es1 es1Var = j10Var2.g;
                ah ahVar = k10Var3.F0;
                es1 es1VarB = es1.b(new w20(es1Var, v40Var, i11));
                es1 es1VarB2 = es1.b(new h50(es1VarB, 7));
                int i12 = ks1.f13231c;
                ArrayList arrayList2 = new ArrayList(1);
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(j10Var2.f12579p);
                arrayList3.add(j10Var2.f12580q);
                arrayList2.add(es1VarB2);
                es1 es1VarB3 = es1.b(new f60(new ks1(arrayList2, arrayList3), 3));
                es1 es1VarB4 = es1.b(a80.A);
                es1 es1Var2 = k10Var3.f12926c;
                es1 es1VarB5 = es1.b(new g30(es1VarB4, (js1) es1Var2, 4));
                v40 v40Var2 = new v40(pq0Var3, 3);
                v40 v40Var3 = new v40(pq0Var3, 2);
                a10 a10Var = k10Var3.g;
                es1 es1VarB6 = es1.b(new j90(k10Var3.K, k10Var3.J, v40Var, v40Var3, es1.b(new u20(a10Var, k10Var3.C, es1.b(new f20(a10Var, 20)), es1.b(nn1.f14352q), k10Var3.D0, k10Var3.f12928d)), j10Var2.f12570e));
                o90 o90Var = new o90(4);
                o90 o90Var2 = new o90(2);
                es1 es1VarB7 = es1.b(new g30(es1VarB4, (js1) es1Var2, 9));
                es1 es1VarB8 = es1.b(jz.f12893p);
                u90 u90Var = new u90(es1VarB8, 2);
                ArrayList arrayList4 = new ArrayList(2);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(j10Var2.f12585v);
                arrayList4.add(es1VarB7);
                arrayList4.add(u90Var);
                es1 es1VarB9 = es1.b(new yv(new ks1(arrayList4, arrayList5), v40Var, v40Var2, 6));
                es1 es1VarB10 = es1.b(new m20(8, v40Var2));
                es1 es1VarB11 = es1.b(new c30(k10Var3.g, k10Var3.f12926c, k10Var3.f12928d, v40Var2, v40Var, j10Var2.f12575l, es1VarB6, o90Var, o90Var2, k10Var3.G, j10Var2.f12576m, j10Var2.f12570e, j10Var2.f12584u, es1VarB9, es1VarB10, j10Var2.j));
                c10 c10Var = new c10(es1VarB11, 24);
                h50 h50Var = new h50(es1.b(new w20(v40Var, k10Var3.W, 0)), 11);
                ArrayList arrayList6 = new ArrayList(4);
                ArrayList arrayList7 = new ArrayList(2);
                arrayList6.add(j10Var2.f12581r);
                arrayList7.add(j10Var2.f12582s);
                arrayList7.add(j10Var2.f12583t);
                arrayList6.add(es1VarB5);
                arrayList6.add(c10Var);
                arrayList6.add(h50Var);
                es1 es1VarB12 = es1.b(new f60(new ks1(arrayList6, arrayList7), 4));
                es1 es1VarB13 = es1.b(new k50(k10Var3.g, k10Var3.C0, k10Var3.j, v40Var2, v40Var, k10Var3.I, ls.f13598p));
                es1 es1VarB14 = es1.b(new h50(es1VarB13, 5));
                es1 es1VarB15 = es1.b(new g30(es1VarB4, (js1) es1Var2, 3));
                es1 es1Var3 = k10Var3.f12969y0;
                b60 b60Var = j10Var2.f12569d;
                es1 es1VarB16 = es1.b(new h50(es1.b(new a40(es1Var3, b60Var, 1)), 3));
                c10 c10Var2 = new c10(es1VarB11, 23);
                ArrayList arrayList8 = new ArrayList(5);
                ArrayList arrayList9 = new ArrayList(3);
                arrayList8.add(j10Var2.f12586w);
                arrayList8.add(j10Var2.f12587x);
                arrayList9.add(j10Var2.f12588y);
                arrayList9.add(j10Var2.f12589z);
                arrayList8.add(es1VarB14);
                arrayList8.add(es1VarB15);
                arrayList9.add(es1VarB16);
                arrayList8.add(c10Var2);
                es1 es1VarB17 = es1.b(new f60(new ks1(arrayList8, arrayList9), 0));
                int i13 = 6;
                es1 es1VarB18 = es1.b(new h50(es1VarB13, i13));
                es1 es1VarB19 = es1.b(new g30(es1VarB4, (js1) es1Var2, i13));
                c10 c10Var3 = new c10(es1VarB9, 12);
                c10 c10Var4 = new c10(es1VarB11, 26);
                ArrayList arrayList10 = new ArrayList(6);
                ArrayList arrayList11 = new ArrayList(2);
                arrayList10.add(j10Var2.A);
                arrayList10.add(j10Var2.B);
                arrayList11.add(j10Var2.C);
                arrayList11.add(j10Var2.D);
                arrayList10.add(es1VarB18);
                arrayList10.add(es1VarB19);
                arrayList10.add(c10Var3);
                arrayList10.add(c10Var4);
                es1 es1VarB20 = es1.b(new f60(new ks1(arrayList10, arrayList11), 2));
                c10 c10Var5 = new c10(es1VarB11, 29);
                ArrayList arrayList12 = new ArrayList(1);
                ArrayList arrayList13 = new ArrayList(1);
                arrayList13.add(j10Var2.E);
                arrayList12.add(c10Var5);
                es1 es1VarB21 = es1.b(new f60(new ks1(arrayList12, arrayList13), 19));
                c10 c10Var6 = new c10(es1.b(new w20(v40Var, k10Var3.K, 2)), 22);
                ArrayList arrayList14 = new ArrayList(1);
                new ArrayList(1).add(j10Var2.F);
                arrayList14.add(c10Var6);
                es1 es1VarB22 = es1.b(new g30(es1VarB4, (js1) es1Var2, 10));
                ArrayList arrayList15 = new ArrayList(1);
                ArrayList arrayList16 = new ArrayList(1);
                arrayList16.add(j10Var2.G);
                arrayList15.add(es1VarB22);
                es1 es1VarB23 = es1.b(new f60(new ks1(arrayList15, arrayList16), 20));
                es1 es1VarB24 = es1.b(new h50(es1VarB, 8));
                c10 c10Var7 = new c10(es1VarB11, 27);
                ArrayList arrayList17 = new ArrayList(7);
                ArrayList arrayList18 = new ArrayList(4);
                arrayList17.add(j10Var2.H);
                arrayList18.add(j10Var2.I);
                arrayList17.add(j10Var2.J);
                arrayList17.add(j10Var2.K);
                arrayList18.add(j10Var2.L);
                arrayList18.add(j10Var2.M);
                arrayList18.add(j10Var2.N);
                arrayList17.add(j10Var2.O);
                arrayList17.add(j10Var2.P);
                arrayList17.add(es1VarB24);
                arrayList17.add(c10Var7);
                es1 es1VarB25 = es1.b(new f60(new ks1(arrayList17, arrayList18), 5));
                h50 h50Var2 = new h50(es1.b(new c10(es1VarB12, 11)), 1);
                es1 es1VarB26 = es1.b(new g30(es1VarB4, (js1) es1Var2, 8));
                ArrayList arrayList19 = new ArrayList(2);
                ArrayList arrayList20 = new ArrayList(1);
                arrayList20.add(j10Var2.R);
                arrayList19.add(h50Var2);
                arrayList19.add(es1VarB26);
                es1 es1VarB27 = es1.b(new f60(new ks1(arrayList19, arrayList20), 9));
                m20 m20Var = new m20(13, mx0Var);
                hw hwVar = new hw(new x90(m20Var, 1), es1Var2, 15);
                ArrayList arrayList21 = new ArrayList(1);
                ArrayList arrayList22 = new ArrayList(1);
                arrayList22.add(j10Var2.S);
                arrayList21.add(hwVar);
                es1 es1VarB28 = es1.b(new f60(new ks1(arrayList21, arrayList22), 24));
                es1 es1VarB29 = es1.b(new h50(es1VarB13, 4));
                eb0 eb0Var = new eb0(pq0Var4, 0);
                eb0 eb0Var2 = new eb0(pq0Var4, 1);
                int i14 = 2;
                eb0 eb0Var3 = new eb0(pq0Var4, i14);
                es1 es1VarB30 = es1.b(new h50(es1VarB13, i14));
                c10 c10Var8 = new c10(es1VarB11, 28);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(j10Var2.Z);
                arrayList23.add(es1VarB30);
                arrayList23.add(c10Var8);
                es1 es1VarB31 = es1.b(new z40(eb0Var, eb0Var2, eb0Var3, es1VarB20, es1.b(new f60(new ks1(arrayList23, arrayList24), 10)), es1VarB17, es1VarB23, j10Var2.g, v40Var, k10Var3.f12935h, b60Var));
                u90 u90Var2 = new u90(es1VarB31, 5);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList25.add(es1VarB29);
                arrayList26.add(u90Var2);
                es1 es1VarB32 = es1.b(new f60(new ks1(arrayList25, arrayList26), 13));
                es1 es1VarB33 = es1.b(new g30(es1VarB4, (js1) es1Var2, 5));
                c10 c10Var9 = new c10(es1VarB11, 25);
                ArrayList arrayList27 = new ArrayList(2);
                ArrayList arrayList28 = new ArrayList(1);
                arrayList28.add(j10Var2.T);
                arrayList27.add(es1VarB33);
                arrayList27.add(c10Var9);
                f60 f60Var = new f60(new ks1(arrayList27, arrayList28), 1);
                es1 es1VarB34 = es1.b(new h50(es1VarB13, 0));
                ArrayList arrayList29 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList29.add(es1VarB34);
                es1 es1VarB35 = es1.b(new yv(f60Var, new ks1(arrayList29, list), k10Var3.f12928d, 5));
                v40 v40Var4 = new v40(pq0Var3, 1);
                g40 g40Var = new g40(v40Var, v40Var4, j10Var2.f12572h, v40Var3, j10Var2.f12571f);
                ArrayList arrayList30 = new ArrayList(1);
                ArrayList arrayList31 = new ArrayList(1);
                arrayList31.add(j10Var2.V);
                arrayList30.add(j10Var2.W);
                z40 z40Var = new z40(v40Var2, v40Var, es1VarB3, es1VarB25, j10Var2.U, g40Var, es1VarB4, new f60(new ks1(arrayList30, arrayList31), 6), es1VarB21, es1VarB10, k10Var3.f12947n0);
                u90 u90Var3 = new u90(es1VarB31, 4);
                es1 es1VarB36 = es1.b(new n30(v40Var, 1));
                o90 o90Var3 = new o90(5);
                o90 o90Var4 = new o90(6);
                es1 es1VarB37 = es1.b(new m20(12, new x90(m20Var, 0)));
                x00 x00Var = k10Var3.C;
                es1 es1Var4 = k10Var3.f12926c;
                qa0 qa0Var = new qa0(x00Var, b60Var, es1VarB36, m20Var, o90Var3, o90Var4, es1Var4, es1VarB37);
                zm0 zm0Var = new zm0();
                es1 es1VarB38 = es1.b(new yb0(v40Var4, zm0Var, m20Var, 1));
                es1 es1VarB39 = es1.b(new yb0(v40Var4, zm0Var, m20Var, 0));
                es1 es1VarB40 = es1.b(new el((js1) v40Var4, (js1) zm0Var, (js1) m20Var, (js1) k10Var3.j, 8));
                es1 es1VarB41 = es1.b(new hw(zm0Var, m20Var, 17));
                a10 a10Var2 = k10Var3.g;
                zm0.b(zm0Var, es1.b(new da0(z40Var, es1Var4, m20Var, u90Var3, qa0Var, es1VarB36, j10Var2.f12573i, es1VarB38, es1VarB39, es1VarB40, es1VarB41, es1.b(new el(a10Var2, m20Var, qa0Var, zm0Var, 7)), new la0(a10Var2, b60Var), k10Var3.G, k10Var3.f12935h, a10Var2, es1VarB37, es1VarB8, k10Var3.M0)));
                ((vi0) ci0Var.f10136c).i4(new ak0((e60) es1VarB17.a(), (s80) es1VarB23.a(), (o60) es1VarB20.a(), (t60) es1VarB12.a(), (v60) es1VarB25.a(), (v70) j10Var2.Q.a(), (c70) es1VarB27.a(), (z80) es1VarB28.a(), (s70) es1VarB32.a(), (m60) es1VarB35.a()));
                return (ca0) zm0Var.a();
        }
    }

    public si0(Context context, p10 p10Var) {
        this.f16019b = context;
        this.f16020c = p10Var;
    }

    public si0(Context context, za.a aVar, t10 t10Var, ex exVar) {
        this.f16019b = context;
        this.f16021d = aVar;
        this.f16020c = t10Var;
        this.f16022e = exVar;
    }
}
