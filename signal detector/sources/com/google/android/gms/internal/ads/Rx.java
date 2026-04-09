package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import m2.C2655b;
import org.json.JSONObject;
import q2.C2841s;
import q2.C2852x0;
import t2.AbstractC2907C;
import w2.InterfaceC2970b;

/* loaded from: classes.dex */
public final class Rx implements InterfaceC1673p4, InterfaceC0691Qf, InterfaceC2970b, BD, Eu, InterfaceC1223gl, InterfaceC1918th, InterfaceC1872sp, p2.d, Dr, Bt {

    /* renamed from: c, reason: collision with root package name */
    public static Rx f11088c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11089a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11090b;

    public /* synthetic */ Rx(int i, Object obj) {
        this.f11089a = i;
        this.f11090b = obj;
    }

    public static final Rx h(Context context) {
        Rx rx;
        synchronized (Rx.class) {
            try {
                if (f11088c == null) {
                    f11088c = new Rx(context);
                }
                rx = f11088c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rx;
    }

    private final void p() {
        synchronized (((C1338iu) this.f11090b)) {
        }
    }

    private final void r(AbstractC1812rj abstractC1812rj) {
        C1338iu c1338iu = (C1338iu) this.f11090b;
        synchronized (c1338iu) {
            c1338iu.f14824d = abstractC1812rj.f16605f;
            abstractC1812rj.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1673p4
    public long a() {
        return ((ByteBuffer) this.f11090b).capacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.gf] */
    @Override // com.google.android.gms.internal.ads.Eu
    public Object b(Object obj) {
        Xt xt = (Xt) obj;
        C0697Ql c0697Ql = ((C0440Bj) this.f11090b).f7397d;
        ArrayList arrayList = (ArrayList) xt.f12510b.f15175d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Wt wt = (Wt) obj2;
            Map map = (Map) c0697Ql.f10691b;
            String str = wt.f12334a;
            JSONObject jSONObject = wt.f12335b;
            if (map.containsKey(str) && jSONObject != null) {
                C1865si c1865si = (C1865si) map.get(str);
                switch (c1865si.f16773a) {
                    case 0:
                        if (((Boolean) C2841s.f23267e.f23270c.a(H9.va)).booleanValue()) {
                            C0581Jo c0581Jo = (C0581Jo) c1865si.f16774b;
                            synchronized (c0581Jo) {
                                c0581Jo.f9363p = jSONObject;
                            }
                            break;
                        } else {
                            continue;
                        }
                    default:
                        ((C1217gf) ((C0697Ql) c1865si.f16774b).f10692c).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                        break;
                }
            } else {
                Map map2 = (Map) c0697Ql.f10692c;
                if (map2.containsKey(str) && jSONObject != null) {
                    InterfaceC1542mi interfaceC1542mi = (InterfaceC1542mi) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    interfaceC1542mi.a(map3);
                }
            }
        }
        return xt;
    }

    @Override // p2.d
    public void c() {
        switch (this.f11089a) {
            case 0:
                synchronized (Rx.class) {
                    Vu vu = (Vu) this.f11090b;
                    vu.I("vendor_scoped_gpid_v2_id");
                    vu.I("vendor_scoped_gpid_v2_creation_time");
                }
                return;
            default:
                ((C1276hk) ((C0846Zh) this.f11090b).f12925P.c()).onAdClicked();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        switch (this.f11089a) {
            case 13:
                C0507Fi c0507Fi = (C0507Fi) this.f11090b;
                C2148xv c2148xv = c0507Fi.f8170g;
                Xt xt = c0507Fi.f8168e;
                Qt qt = c0507Fi.f8169f;
                c0507Fi.f8171h.b(true == p2.j.f22785C.f22795h.k(c0507Fi.f8164a) ? 2 : 1, c2148xv.b(xt, qt, false, "", (String) obj, qt.f10760c, null, null));
                break;
            case 22:
                ((C0445Bo) obj).f7441m = true;
                ((BinderC0751To) this.f11090b).f11466d.b();
                break;
            default:
                Xt xt2 = (Xt) obj;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8597G2)).booleanValue()) {
                    ((C1173fp) this.f11090b).f14152k.w(xt2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1872sp
    public /* synthetic */ InterfaceFutureC2326a e(C1807re c1807re) {
        return ((BinderC2196yp) ((InterfaceC1692pN) ((C1338iu) this.f11090b).f14824d).c()).L3(c1807re, Binder.getCallingUid());
    }

    @Override // p2.d
    public void f() {
        C0846Zh c0846Zh = (C0846Zh) this.f11090b;
        ((C1867sk) c0846Zh.f12922L.c()).a();
        C2138xl c2138xl = (C2138xl) c0846Zh.f12927R.c();
        synchronized (c2138xl) {
            c2138xl.C1(C1437kl.f15261k);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1673p4
    public void g(MessageDigest[] messageDigestArr, long j6, int i) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = (ByteBuffer) this.f11090b;
        synchronized (byteBuffer) {
            int i3 = (int) j6;
            byteBuffer.position(i3);
            byteBuffer.limit(i3 + i);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    public PP[] i(Handler handler, NN nn, NN nn2) {
        C0641Ng c0641Ng = (C0641Ng) this.f11090b;
        EO eo = EO.f7955h;
        Context context = c0641Ng.f10020a;
        C1640oP c1640oP = new C1640oP(context);
        AbstractC0582Jp.h0(!c1640oP.f15950c);
        c1640oP.f15950c = true;
        if (c1640oP.f15953f == null) {
            c1640oP.f15953f = new C2041vw(new InterfaceC0812Xh[0]);
        }
        if (c1640oP.f15952e == null) {
            if (c1640oP.f15954g == null) {
                c1640oP.f15954g = new C1879sw(context);
            }
            if (c1640oP.f15951d == null) {
                c1640oP.f15951d = C1994v2.f17212j;
            }
            C2041vw c2041vw = new C2041vw(context);
            OO oo = context != null ? null : c1640oP.f15949b;
            Context context2 = (Context) c2041vw.f17369b;
            if (context2 == null) {
                c2041vw.f17370c = oo;
            }
            C1879sw c1879sw = c1640oP.f15954g;
            c2041vw.f17371d = c1879sw;
            if (c1879sw == null) {
                c2041vw.f17371d = new C1879sw(context2);
            }
            c1640oP.f15952e = new K4.c(c2041vw);
        } else {
            AbstractC0582Jp.h0(c1640oP.f15954g == null);
            AbstractC0582Jp.h0(c1640oP.f15951d == null);
        }
        C1909tP c1909tP = new C1909tP(context, new C2181ya(context), handler, nn2, new C1801rP(c1640oP));
        L2.m mVar = new L2.m();
        mVar.f2537b = context;
        mVar.f2538c = EO.f7955h;
        mVar.f2539d = new C2181ya(context);
        mVar.f2538c = eo;
        mVar.f2540e = handler;
        mVar.f2541f = nn;
        AbstractC0582Jp.h0(!mVar.f2536a);
        Handler handler2 = (Handler) mVar.f2540e;
        AbstractC0582Jp.h0((handler2 == null && ((NN) mVar.f2541f) == null) || !(handler2 == null || ((NN) mVar.f2541f) == null));
        mVar.f2536a = true;
        return new PP[]{c1909tP, new H(mVar)};
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* bridge */ /* synthetic */ InterfaceFutureC2326a j(C0697Ql c0697Ql, At at) {
        return q(c0697Ql, at, null);
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* synthetic */ Object m() {
        return (InterfaceC0848Zj) this.f11090b;
    }

    public InterfaceFutureC2326a q(C0697Ql c0697Ql, At at, InterfaceC0848Zj interfaceC0848Zj) {
        C0744Th c0744ThS = at.s((InterfaceC2254zt) c0697Ql.f10692c);
        Ct ct = new Ct();
        switch (c0744ThS.f11421a) {
            case 0:
                c0744ThS.f11423c = ct;
                break;
            default:
                c0744ThS.f11423c = ct;
                break;
        }
        InterfaceC0848Zj interfaceC0848Zj2 = (InterfaceC0848Zj) c0744ThS.c();
        this.f11090b = interfaceC0848Zj2;
        C0440Bj c0440BjA = interfaceC0848Zj2.a();
        C1877su c1877su = new C1877su();
        AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(c0440BjA.b());
        C0467Dc c0467Dc = new C0467Dc(c1877su, 12, c0440BjA);
        EnumC2059wD enumC2059wD = EnumC2059wD.f17407a;
        return AbstractC1984ut.G(AbstractC1984ut.F(abstractC2221zDR, c0467Dc, enumC2059wD), new C1754qe(7, c1877su), enumC2059wD);
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        int i = this.f11089a;
    }

    @Override // com.google.android.gms.internal.ads.Dr
    public void v(AbstractC1812rj abstractC1812rj) {
        switch (this.f11089a) {
            case 27:
                r(abstractC1812rj);
                return;
            default:
                Nt nt = (Nt) this.f11090b;
                C1870sn c1870sn = (C1870sn) abstractC1812rj;
                synchronized (nt) {
                    try {
                        nt.f10097j = c1870sn;
                        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8774k4)).booleanValue()) {
                            c1870sn.f16792u.f12980a = nt.f10093e;
                        }
                        nt.f10097j.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ Rx(Object obj, int i, Object obj2) {
        this.f11089a = i;
        this.f11090b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918th, com.google.android.gms.internal.ads.InterfaceC0674Pf, com.google.android.gms.internal.ads.InterfaceC0482Ea, com.google.android.gms.internal.ads.Dr
    /* renamed from: a */
    public void mo6a() {
        switch (this.f11089a) {
            case 20:
                ((C2000v8) this.f11090b).d();
                return;
            case 25:
                InterfaceFutureC2326a interfaceFutureC2326aA = ((C0969c3) this.f11090b).a();
                if (!((Boolean) C2841s.f23267e.f23270c.a(H9.C8)).booleanValue()) {
                    AbstractC2022vd.g(interfaceFutureC2326aA, "persistFlags");
                    return;
                }
                C1952uE c1952uE = new C1952uE("persistFlags", 4);
                interfaceFutureC2326aA.a(new CD(interfaceFutureC2326aA, 0, c1952uE), AbstractC0640Nf.f10011g);
                return;
            case 27:
                p();
                return;
            default:
                Nt nt = (Nt) this.f11090b;
                synchronized (nt) {
                    nt.f10097j = null;
                }
                return;
        }
    }

    public Rx(int i) {
        this.f11089a = i;
        switch (i) {
            case 10:
                this.f11090b = new WeakHashMap();
                break;
            case 28:
                break;
            default:
                this.f11090b = new CopyOnWriteArrayList();
                break;
        }
    }

    public Rx(Context context) {
        this.f11089a = 0;
        if (Vu.f12104c == null) {
            Vu.f12104c = new Vu(context, 2);
        }
        this.f11090b = Vu.f12104c;
        Nx.f(context);
    }

    public Rx(InterfaceC0839Za interfaceC0839Za) {
        Context context;
        this.f11089a = 6;
        this.f11090b = interfaceC0839Za;
        try {
            context = (Context) S2.b.n1(interfaceC0839Za.o2());
        } catch (RemoteException | NullPointerException e6) {
            u2.k.f("", e6);
            context = null;
        }
        if (context != null) {
            try {
                ((InterfaceC0839Za) this.f11090b).L(new S2.b(new C2655b(context)));
            } catch (RemoteException e7) {
                u2.k.f("", e7);
            }
        }
    }

    public Rx(C2021vc c2021vc, C1967uc c1967uc) {
        this.f11089a = 8;
        this.f11090b = c1967uc;
        Objects.requireNonNull(c2021vc);
    }

    public Rx(C1338iu c1338iu) {
        this.f11089a = 27;
        Objects.requireNonNull(c1338iu);
        this.f11090b = c1338iu;
    }

    public Rx(ByteBuffer byteBuffer) {
        this.f11089a = 4;
        this.f11090b = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0691Qf, com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f11089a) {
            case 8:
                C1536mc c1536mc = (C1536mc) obj;
                AbstractC2907C.m("Getting a new session for JS Engine.");
                c1536mc.getClass();
                ((C0657Of) ((C1967uc) this.f11090b).f662a).b(new C2129xc(c1536mc));
                break;
            case 15:
                ((InterfaceC1813rk) obj).f((C2852x0) this.f11090b);
                break;
            case 16:
                ((InterfaceC0577Jk) obj).a((q2.e1) this.f11090b);
                break;
            case 17:
                ((InterfaceC1005cl) obj).B((C1084e9) this.f11090b);
                break;
            default:
                ((InterfaceC0425Al) obj).a((A2.w) this.f11090b);
                break;
        }
    }

    private final void l(Throwable th) {
    }

    private final void n(Throwable th) {
    }

    private final void o(Throwable th) {
    }

    @Override // p2.d
    public void k(View view) {
    }
}
