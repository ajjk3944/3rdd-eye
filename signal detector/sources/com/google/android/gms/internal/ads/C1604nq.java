package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import j2.C2552h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.nq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1604nq implements InterfaceC1282hq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15819a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15820b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f15821c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15822d;

    public /* synthetic */ C1604nq(Context context, Object obj, Executor executor, int i) {
        this.f15819a = i;
        this.f15820b = context;
        this.f15822d = obj;
        this.f15821c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0529  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object c(com.google.android.gms.internal.ads.Xt r70, com.google.android.gms.internal.ads.Qt r71, com.google.android.gms.internal.ads.C1119eq r72) throws com.google.android.gms.internal.ads.C0736Sq {
        /*
            Method dump skipped, instructions count: 3116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1604nq.c(com.google.android.gms.internal.ads.Xt, com.google.android.gms.internal.ads.Qt, com.google.android.gms.internal.ads.eq):java.lang.Object");
    }

    public static final boolean d(Xt xt, int i) {
        return ((C0960bu) xt.f12509a.f10110b).f13486h.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1282hq
    public final void a(Xt xt, Qt qt, C1119eq c1119eq) throws JSONException, IOException {
        C1123eu c1123eu;
        q2.d1 d1VarF;
        switch (this.f15819a) {
            case 0:
                C1392ju c1392ju = (C1392ju) c1119eq.f13987b;
                C0960bu c0960bu = (C0960bu) xt.f12509a.f10110b;
                String string = qt.f10797v.toString();
                Context context = this.f15820b;
                InterfaceC0688Qc interfaceC0688Qc = (InterfaceC0688Qc) c1119eq.f13988c;
                try {
                    c1392ju.f15016a.w0(new S2.b(context), c0960bu.f13482d, string, interfaceC0688Qc);
                    return;
                } finally {
                }
            case 1:
                Ut ut = qt.f10791s;
                JSONObject jSONObject = qt.f10797v;
                boolean z6 = qt.f10769g0;
                IInterface iInterface = c1119eq.f13988c;
                Object obj = c1119eq.f13987b;
                C0960bu c0960bu2 = (C0960bu) xt.f12509a.f10110b;
                q2.d1 d1Var = c0960bu2.f13484f;
                boolean z7 = d1Var.f23200n;
                int i = d1Var.f23189b;
                int i3 = d1Var.f23192e;
                Context context2 = this.f15820b;
                if (z7) {
                    C2552h c2552h = new C2552h(i3, i);
                    c2552h.f21344e = true;
                    c2552h.f21345f = i;
                    d1VarF = new q2.d1(context2, c2552h);
                } else {
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.U8)).booleanValue() && z6) {
                        C2552h c2552h2 = new C2552h(i3, i);
                        c2552h2.f21346g = true;
                        c2552h2.f21347h = i;
                        d1VarF = new q2.d1(context2, c2552h2);
                    } else {
                        d1VarF = C1476lN.f(context2, qt.f10795u);
                    }
                }
                q2.d1 d1Var2 = d1VarF;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.U8)).booleanValue() && z6) {
                    C1392ju c1392ju2 = (C1392ju) obj;
                    try {
                        c1392ju2.f15016a.U2(new S2.b(context2), d1Var2, c0960bu2.f13482d, jSONObject.toString(), a4.p.H(ut), (InterfaceC0688Qc) iInterface);
                        return;
                    } finally {
                    }
                }
                C1392ju c1392ju3 = (C1392ju) obj;
                try {
                    c1392ju3.f15016a.Z1(new S2.b(context2), d1Var2, c0960bu2.f13482d, jSONObject.toString(), a4.p.H(ut), (InterfaceC0688Qc) iInterface);
                    return;
                } finally {
                }
            default:
                C1392ju c1392ju4 = (C1392ju) c1119eq.f13987b;
                C0960bu c0960bu3 = (C0960bu) xt.f12509a.f10110b;
                String string2 = qt.f10797v.toString();
                String strH = a4.p.H(qt.f10791s);
                Context context3 = this.f15820b;
                InterfaceC0688Qc interfaceC0688Qc2 = (InterfaceC0688Qc) c1119eq.f13988c;
                C0499Fa c0499Fa = c0960bu3.f13487j;
                ArrayList arrayList = c0960bu3.f13486h;
                try {
                    c1392ju4.f15016a.k3(new S2.b(context3), c0960bu3.f13482d, string2, strH, interfaceC0688Qc2, c0499Fa, arrayList);
                    return;
                } finally {
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1282hq
    public final Object b(Xt xt, Qt qt, C1119eq c1119eq) throws C1123eu {
        C1123eu c1123eu;
        View view;
        int i = this.f15819a;
        Executor executor = this.f15821c;
        Object obj = this.f15822d;
        switch (i) {
            case 0:
                C1338iu c1338iu = new C1338iu(xt, qt, c1119eq.f13986a);
                C0697Ql c0697Ql = new C0697Ql(new C1550mq(this, c1119eq, qt, 0), 16, (Object) null);
                V0.m mVar = new V0.m(qt.f10758a0, 4);
                C0761Uh c0761Uh = (C0761Uh) obj;
                C0710Rh c0710Rh = c0761Uh.f11735c;
                C0761Uh c0761Uh2 = c0761Uh.f11736d;
                C0727Sh c0727Sh = new C0727Sh(c0710Rh, c0761Uh2, c1338iu, c0697Ql, mVar);
                ((C2137xk) c0727Sh.f11199I.c()).z1(new C2081wi(0, (C1392ju) c1119eq.f13987b), executor);
                ((BinderC2251zq) c1119eq.f13988c).L3(new BinderC1175fr((C1276hk) c0727Sh.f11206Q.c(), (C2030vl) c0727Sh.f11208S.c(), (C1867sk) c0727Sh.M.c(), (C2191yk) c0727Sh.f11205P.c(), (C0424Ak) c0727Sh.f11209T.c(), (C0849Zk) c0761Uh2.f11726R.c(), (C0543Hk) c0727Sh.f11210U.c(), (C0459Cl) c0727Sh.f11211V.c(), (C0815Xk) c0727Sh.f11212W.c(), (C1760qk) c0727Sh.f11214Y.c()));
                return c0727Sh.B();
            case 1:
                Object obj2 = c1119eq.f13987b;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.U8)).booleanValue() && qt.f10769g0) {
                    try {
                        C0705Rc c0705RcI0 = ((C1392ju) obj2).f15016a.i0();
                        if (c0705RcI0 == null) {
                            u2.k.e("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new C1123eu(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            boolean z6 = true;
                            Parcel parcelK0 = c0705RcI0.k0(c0705RcI0.h0(), 1);
                            S2.a aVarD1 = S2.b.d1(parcelK0.readStrongBinder());
                            parcelK0.recycle();
                            view = (View) S2.b.n1(aVarD1);
                            Parcel parcelK02 = c0705RcI0.k0(c0705RcI0.h0(), 2);
                            ClassLoader classLoader = C7.f7544a;
                            if (parcelK02.readInt() == 0) {
                                z6 = false;
                            }
                            parcelK02.recycle();
                            if (view == null) {
                                throw new C1123eu(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (z6) {
                                try {
                                    view = (View) AbstractC1984ut.F(ED.f7928b, new C2028vj(this, view, qt, 5), AbstractC0640Nf.f10010f).get();
                                } catch (InterruptedException | ExecutionException e6) {
                                    throw new C1123eu(e6);
                                }
                            }
                        } catch (RemoteException e62) {
                            throw new C1123eu(e62);
                        }
                    } finally {
                    }
                } else {
                    try {
                        view = (View) S2.b.n1(((C1392ju) obj2).f15016a.d());
                    } finally {
                    }
                }
                C0795Wh c0795Wh = (C0795Wh) obj;
                C1338iu c1338iu2 = new C1338iu(xt, qt, c1119eq.f13986a);
                C1392ju c1392ju = (C1392ju) obj2;
                C1431kf c1431kf = new C1431kf(view, (InterfaceC0828Yg) null, new L6(25, c1392ju), (Rt) qt.f10795u.get(0));
                C0710Rh c0710Rh2 = c0795Wh.f12278d;
                C0795Wh c0795Wh2 = c0795Wh.f12280e;
                C0778Vh c0778Vh = new C0778Vh(c0710Rh2, c0795Wh2, c1338iu2, c1431kf);
                ((C1976ul) c0778Vh.b0.c()).H1(view);
                ((C2137xk) c0778Vh.f12047I.c()).z1(new C2081wi(0, c1392ju), executor);
                ((BinderC2251zq) c1119eq.f13988c).L3(new BinderC1175fr((C1276hk) c0778Vh.f12051N.c(), (C2030vl) c0778Vh.f12057T.c(), (C1867sk) c0778Vh.f12054Q.c(), (C2191yk) c0778Vh.M.c(), c0778Vh.B(), (C0849Zk) c0795Wh2.f12266T.c(), (C0543Hk) c0778Vh.f12060W.c(), (C0459Cl) c0778Vh.f12061X.c(), (C0815Xk) c0778Vh.f12062Y.c(), (C1760qk) c0778Vh.f12063Z.c()));
                return c0778Vh.C();
            default:
                return c(xt, qt, c1119eq);
        }
    }
}
