package com.google.android.gms.internal.ads;

import A2.C0131t;
import M2.InterfaceC0162b;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q2.C2841s;
import t2.AbstractC2907C;
import y2.InterfaceC3012b;

/* renamed from: com.google.android.gms.internal.ads.hr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1283hr implements EA, M4, Mw, InterfaceC0162b, InterfaceC0691Qf, InterfaceC3012b, BD, InterfaceC1223gl, InterfaceC1864sh, InterfaceC1872sp, InterfaceC2216z8, InterfaceC1759qj, Dr, At, Bt {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14589c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static C1283hr f14590d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14591a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14592b;

    public /* synthetic */ C1283hr() {
        this.f14591a = 28;
    }

    @Override // com.google.android.gms.internal.ads.M4
    public File a() {
        return (File) this.f14592b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0691Qf, com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f14591a) {
            case 8:
                AbstractC2907C.m("Releasing engine reference.");
                ((C1967uc) this.f14592b).f17128d.E();
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                Ju ju = (Ju) this.f14592b;
                ((Nu) obj).x((Ku) ju.f9392a, ju.f9393b);
                break;
            case 13:
                ((InterfaceC0475Dk) obj).I((AbstractC1812rj) this.f14592b);
                break;
            case 14:
                ((InterfaceC0730Sk) obj).E((C1807re) this.f14592b);
                break;
            case 15:
                ((InterfaceC1005cl) obj).y((C1084e9) this.f14592b);
                break;
            case 16:
                ((InterfaceC0619Mb) obj).N((C0520Ge) this.f14592b);
                break;
        }
    }

    public void c(int i) {
        C1184g c1184g;
        C0802Wo c0802Wo = (C0802Wo) this.f14592b;
        try {
            C1233gv c1233gvA = C1287hv.A();
            int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3;
            c1233gvA.b();
            ((C1287hv) c1233gvA.f13551b).I(i3);
            if (i == 0) {
                C0785Vo c0785Vo = c0802Wo.f12318b;
                c0785Vo.getClass();
                try {
                    c1184g = c0785Vo.f12087b;
                } catch (RemoteException unused) {
                }
                Nx nxG = (c1184g == null || !c1184g.b()) ? null : c1184g.g();
                if (nxG != null) {
                    long j6 = ((Bundle) nxG.f10110b).getLong("referrer_click_timestamp_seconds");
                    c1233gvA.b();
                    ((C1287hv) c1233gvA.f13551b).C(j6);
                    long j7 = ((Bundle) nxG.f10110b).getLong("install_begin_timestamp_seconds");
                    c1233gvA.b();
                    ((C1287hv) c1233gvA.f13551b).D(j7);
                    boolean z6 = ((Bundle) nxG.f10110b).getBoolean("google_play_instant");
                    c1233gvA.b();
                    ((C1287hv) c1233gvA.f13551b).E(z6);
                    long j8 = ((Bundle) nxG.f10110b).getLong("referrer_click_timestamp_server_seconds");
                    c1233gvA.b();
                    ((C1287hv) c1233gvA.f13551b).F(j8);
                    long j9 = ((Bundle) nxG.f10110b).getLong("install_begin_timestamp_server_seconds");
                    c1233gvA.b();
                    ((C1287hv) c1233gvA.f13551b).G(j9);
                    if (!TextUtils.isEmpty(((Bundle) nxG.f10110b).getString("install_referrer"))) {
                        String string = ((Bundle) nxG.f10110b).getString("install_referrer");
                        c1233gvA.b();
                        ((C1287hv) c1233gvA.f13551b).B(string);
                    }
                    if (!TextUtils.isEmpty(((Bundle) nxG.f10110b).getString("install_version"))) {
                        String string2 = ((Bundle) nxG.f10110b).getString("install_version");
                        c1233gvA.b();
                        ((C1287hv) c1233gvA.f13551b).H(string2);
                    }
                }
            }
            C1184g c1184g2 = c0802Wo.f12318b.f12087b;
            c1184g2.f14179a = 3;
            if (((ServiceConnectionC1565n4) c1184g2.f14183e) != null) {
                AbstractC0709Rg.h("Unbinding from service.");
                ((Context) c1184g2.f14180b).unbindService((ServiceConnectionC1565n4) c1184g2.f14183e);
                c1184g2.f14183e = null;
            }
            c1184g2.f14182d = null;
            C0784Vn c0784Vn = c0802Wo.f12319c;
            String strEncodeToString = Base64.encodeToString(((C1287hv) c1233gvA.d()).b(), 1);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.F5)).booleanValue()) {
                C0697Ql c0697QlA = c0784Vn.a();
                c0697QlA.r("action", "irda");
                c0697QlA.r("irdd", strEncodeToString);
                c0697QlA.x();
            }
            c0802Wo.f12320d.l();
        } catch (Exception e6) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8600G5)).booleanValue()) {
                if (c0802Wo.f12322f == null) {
                    c0802Wo.f12322f = C1053de.c(c0802Wo.f12317a);
                }
                c0802Wo.f12322f.e("InstallReferrerUnsampled.onInstallReferrerSetupFinished", e6);
            } else {
                if (c0802Wo.f12321e == null) {
                    c0802Wo.f12321e = C1053de.a(c0802Wo.f12317a);
                }
                c0802Wo.f12321e.e("InstallReferrer.onInstallReferrerSetupFinished", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public /* synthetic */ void mo11d(Object obj) {
        switch (this.f14591a) {
            case 10:
                C0945bf.f13397l.remove((InterfaceFutureC2326a) this.f14592b);
                break;
            case 12:
                ((C0440Bj) this.f14592b).f7399f.x(true);
                break;
            case 19:
                ((InterfaceC0828Yg) obj).a("sendMessageToNativeJs", (Map) this.f14592b);
                break;
            default:
                ((C1657op) this.f14592b).f16064c.w((Xt) obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1872sp
    public /* synthetic */ InterfaceFutureC2326a e(C1807re c1807re) {
        return ((BinderC2196yp) ((InterfaceC1692pN) ((C1338iu) this.f14592b).f14824d).c()).M3(c1807re.f16583h);
    }

    @Override // com.google.android.gms.internal.ads.Mw
    public void f(int i, long j6, String str) {
        ((Cw) this.f14592b).e(i, System.currentTimeMillis() - j6, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2216z8
    public void g(C2055w9 c2055w9) {
        C1893t9 c1893t9 = (C1893t9) ((C2109x9) c2055w9.f13551b).A().s();
        S8 s8 = (S8) this.f14592b;
        c1893t9.b();
        ((C1947u9) c1893t9.f13551b).C(s8);
        c2055w9.b();
        ((C2109x9) c2055w9.f13551b).G((C1947u9) c1893t9.d());
    }

    @Override // M2.InterfaceC0162b
    public void g0(int i) {
        C1677p8 c1677p8 = (C1677p8) this.f14592b;
        synchronized (c1677p8.f16139c) {
            c1677p8.f16142f = null;
            c1677p8.f16139c.notifyAll();
        }
    }

    @Override // M2.InterfaceC0162b
    public void h0() {
        C1838s8 c1838s8;
        C1677p8 c1677p8 = (C1677p8) this.f14592b;
        synchronized (c1677p8.f16139c) {
            try {
                c1838s8 = (C1838s8) c1677p8.f16140d;
            } catch (DeadObjectException e6) {
                u2.k.f("Unable to obtain a cache service instance.", e6);
                ((C1677p8) this.f14592b).s();
            }
            if (c1838s8 != null) {
                c1677p8.f16142f = (C1946u8) c1838s8.t();
                ((C1677p8) this.f14592b).f16139c.notifyAll();
            } else {
                ((C1677p8) this.f14592b).f16139c.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.EA
    public /* synthetic */ void i(long j6, C2036vr c2036vr) {
        AbstractC0933bL.n(j6, c2036vr, ((C1025d4) this.f14592b).f13724c);
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* bridge */ /* synthetic */ InterfaceFutureC2326a j(C0697Ql c0697Ql, At at) {
        return o(c0697Ql, at, null);
    }

    @Override // com.google.android.gms.internal.ads.Mw
    public void k(int i, long j6) {
        ((Cw) this.f14592b).b(i, System.currentTimeMillis() - j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1864sh
    public /* synthetic */ void l(String str, int i, String str2, boolean z6) {
        ((C2000v8) this.f14592b).d();
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public Object m() {
        InterfaceC0848Zj interfaceC0848Zj;
        synchronized (this) {
            interfaceC0848Zj = (InterfaceC0848Zj) this.f14592b;
        }
        return interfaceC0848Zj;
    }

    public synchronized InterfaceFutureC2326a o(C0697Ql c0697Ql, At at, InterfaceC0848Zj interfaceC0848Zj) {
        C0440Bj c0440BjA;
        try {
            if (interfaceC0848Zj != null) {
                this.f14592b = interfaceC0848Zj;
            } else {
                this.f14592b = (InterfaceC0848Zj) at.s((InterfaceC2254zt) c0697Ql.f10692c).c();
            }
            c0440BjA = ((InterfaceC0848Zj) this.f14592b).a();
        } catch (Throwable th) {
            throw th;
        }
        return c0440BjA.c(c0440BjA.b());
    }

    public void p() {
        C2205yy c2205yy = ((Ux) this.f14592b).f11840a;
        synchronized (c2205yy) {
            try {
                if (c2205yy.f17803e != null) {
                    return;
                }
                Set set = (Set) c2205yy.f17800b.c();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC2151xy) it.next()).a());
                }
                C1948uA c1948uA = (C1948uA) c2205yy.f17802d.c();
                C1358jD c1358jDG = AbstractC1984ut.G(new C1789rD(LB.m(arrayList), true), C1563n2.f15727t, c2205yy.f17801c);
                c1948uA.e(2, c1358jDG);
                c2205yy.f17803e = c1358jDG;
                Iterator it2 = ((Set) c2205yy.f17799a.c()).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2151xy) it2.next()).a();
                }
                if (c2205yy.f17803e != null) {
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String q(Context context) {
        String string;
        C1358jD c1358jD;
        Ux ux = (Ux) this.f14592b;
        InterfaceC1666oy interfaceC1666oy = ux.f11844e;
        C1948uA c1948uA = ux.f11843d;
        long j6 = ux.i;
        boolean z6 = false;
        if (ux.f11848j && System.currentTimeMillis() - j6 <= ux.f11849k) {
            z6 = true;
        }
        C1894tA c1894tAA = c1948uA.a(3);
        try {
            try {
                try {
                    try {
                        c1894tAA.a();
                        C2205yy c2205yy = ux.f11840a;
                        synchronized (c2205yy) {
                            c1358jD = c2205yy.f17803e;
                            if (c1358jD == null) {
                                throw null;
                            }
                        }
                        string = (String) AbstractC1984ut.F(c1358jD, new C0467Dc(ux, 14, context), EnumC2059wD.f17407a).get(z6 ? ux.f11847h : ux.f11845f, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e6) {
                        Thread.currentThread().interrupt();
                        c1894tAA.b(e6);
                        string = "";
                    } catch (TimeoutException unused) {
                        if (z6) {
                            string = ((C2152xz) ux.f11846g.c()).a(j6);
                        } else {
                            c1948uA.b(56);
                            string = Integer.toString(17);
                        }
                    }
                } catch (Throwable th) {
                    c1894tAA.b(th);
                    throw th;
                }
            } catch (ExecutionException e7) {
                e = e7;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                c1894tAA.b(e);
                string = Integer.toString(3);
            }
            c1894tAA.c();
            interfaceC1666oy.c();
            return string;
        } catch (Throwable th2) {
            c1894tAA.c();
            interfaceC1666oy.c();
            throw th2;
        }
    }

    public void r(long j6) {
        C1677p8 c1677p8 = new C1677p8("creation");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "nativeObjectNotCreated";
        x(c1677p8);
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* synthetic */ C0744Th s(InterfaceC2254zt interfaceC2254zt) {
        return ((C1445kt) this.f14592b).b(interfaceC2254zt);
    }

    public String t(Context context, View view, String str) {
        String string;
        C1358jD c1358jD;
        Ux ux = (Ux) this.f14592b;
        InterfaceC1666oy interfaceC1666oy = ux.f11844e;
        C1948uA c1948uA = ux.f11843d;
        C1894tA c1894tAA = c1948uA.a(5);
        try {
            try {
                try {
                    c1894tAA.a();
                    C2205yy c2205yy = ux.f11840a;
                    synchronized (c2205yy) {
                        c1358jD = c2205yy.f17803e;
                        if (c1358jD == null) {
                            throw null;
                        }
                    }
                    string = (String) AbstractC1984ut.F(c1358jD, new C0450Cc((Object) ux, (Object) context, str, (Object) view, 7), EnumC2059wD.f17407a).get(ux.f11845f, TimeUnit.MILLISECONDS);
                } catch (ExecutionException e6) {
                    Throwable th = e6;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    c1894tAA.b(th);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    c1948uA.b(58);
                    string = Integer.toString(17);
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                c1894tAA.b(e7);
                string = "";
            } catch (Throwable th2) {
                c1894tAA.b(th2);
                throw th2;
            }
            c1894tAA.c();
            interfaceC1666oy.c();
            return string;
        } catch (Throwable th3) {
            c1894tAA.c();
            interfaceC1666oy.c();
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        switch (this.f14591a) {
            case 10:
                C0945bf.f13397l.remove((InterfaceFutureC2326a) this.f14592b);
                break;
            case 12:
                ((C0440Bj) this.f14592b).f7399f.x(false);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Dr
    public void v(AbstractC1812rj abstractC1812rj) {
        C0712Rj c0712Rj;
        BinderC1982ur binderC1982ur = (BinderC1982ur) this.f14592b;
        C0830Yi c0830Yi = (C0830Yi) abstractC1812rj;
        synchronized (binderC1982ur) {
            try {
                C0830Yi c0830Yi2 = binderC1982ur.i;
                if (c0830Yi2 != null) {
                    C0712Rj c0712Rj2 = c0830Yi.f16608j;
                    if (c0712Rj2 != null && (c0712Rj = c0830Yi2.f16608j) != null) {
                        c0712Rj2.a(c0712Rj.f11035a.get());
                    }
                    C2137xk c2137xk = binderC1982ur.i.f16602c;
                    c2137xk.getClass();
                    c2137xk.C1(new C9(null, false));
                }
                binderC1982ur.i = c0830Yi;
                c0830Yi.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(MotionEvent motionEvent) {
        Qy qy = ((Ux) this.f14592b).f11841b;
        My my = (My) qy.f10818f.get();
        if (my == null) {
            qy.f10817e.b(54);
        } else {
            my.d(motionEvent);
        }
    }

    public void x(C1677p8 c1677p8) {
        String strA = c1677p8.a();
        u2.k.g("Dispatching AFMA event on publisher webview: ".concat(strA));
        C0636Nb c0636Nb = (C0636Nb) this.f14592b;
        Parcel parcelH0 = c0636Nb.h0();
        parcelH0.writeString(strA);
        c0636Nb.I0(parcelH0, 1);
    }

    public /* synthetic */ C1283hr(int i, Object obj) {
        this.f14591a = i;
        this.f14592b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1759qj
    /* renamed from: a */
    public q2.B0 mo5a() throws C1123eu {
        try {
            return ((InterfaceC1860sd) ((C1119eq) this.f14592b).f13987b).g();
        } catch (RemoteException e6) {
            throw new C1123eu(e6);
        }
    }

    public /* synthetic */ C1283hr(Object obj, int i, Object obj2) {
        this.f14591a = i;
        this.f14592b = obj2;
    }

    public C1283hr(C1967uc c1967uc) {
        this.f14591a = 8;
        Objects.requireNonNull(c1967uc);
        this.f14592b = c1967uc;
    }

    public C1283hr(C0710Rh c0710Rh, Context context, String str, q2.d1 d1Var) {
        this.f14591a = 11;
        C1907tN c1907tNA = C1907tN.a(context);
        C1907tN c1907tNA2 = C1907tN.a(d1Var);
        C1907tN c1907tNA3 = C1907tN.a(str);
        C1799rN c1799rN = c0710Rh.f11000j;
        C1799rN c1799rNA = C1799rN.a(new C0901aq(c1799rN, 2));
        C1799rN c1799rNA2 = C1799rN.a(new C0901aq(c0710Rh.f10961I0, 16));
        this.f14592b = C1799rN.a(new C0131t(c1907tNA, c1907tNA2, c1907tNA3, C1799rN.a(new C2197yq(c1907tNA, c0710Rh.f10987c, c0710Rh.f10954F, c1799rNA, c1799rNA2)), c1799rNA, c1799rNA2, c0710Rh.f10997h, c0710Rh.f10956G, c1799rN));
    }

    @Override // com.google.android.gms.internal.ads.Dr
    /* renamed from: a */
    public void mo6a() {
        BinderC1982ur binderC1982ur = (BinderC1982ur) this.f14592b;
        synchronized (binderC1982ur) {
            binderC1982ur.i = null;
        }
    }

    public C1283hr(C1547mn c1547mn, Map map) {
        this.f14591a = 19;
        this.f14592b = map;
        Objects.requireNonNull(c1547mn);
    }

    public C1283hr(C0802Wo c0802Wo) {
        this.f14591a = 21;
        Objects.requireNonNull(c0802Wo);
        this.f14592b = c0802Wo;
    }

    public C1283hr(Context context, C0623Mf c0623Mf, Xx xx) {
        this.f14591a = 1;
        context.getClass();
        c0623Mf.getClass();
        this.f14592b = (Ux) ((C1799rN) new K4.e(c0623Mf, context, xx).f2248m).c();
    }

    private final void h(Throwable th) {
    }

    private final void n(Throwable th) {
    }
}
