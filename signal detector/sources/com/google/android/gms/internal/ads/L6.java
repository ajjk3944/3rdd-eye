package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import j2.C2545a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import q2.C2841s;
import t2.AbstractC2907C;
import w2.InterfaceC2973e;

/* loaded from: classes.dex */
public final class L6 implements InterfaceC1075e0, InterfaceC1507m0, EA, InterfaceC0691Qf, InterfaceC0674Pf, InterfaceC2973e, BD, InterfaceC1223gl, InterfaceC0482Ea, InterfaceC1872sp, Eu, InterfaceC1759qj, InterfaceC1682pD, Dr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9619a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9620b;

    public /* synthetic */ L6(int i, Object obj) {
        this.f9619a = i;
        this.f9620b = obj;
    }

    public static L6 j(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        L6 l6 = new L6(0);
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new A1.r(2, l6));
                return l6;
            } catch (RuntimeException unused) {
                synchronized (L6.class) {
                    l6.f9620b = null;
                }
            }
        }
        return l6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1682pD, Y2.O
    public InterfaceFutureC2326a a() {
        Bundle bundle;
        String str;
        Gs gs = (Gs) this.f9620b;
        E9 e9 = H9.fc;
        C2841s c2841s = C2841s.f23267e;
        String lowerCase = ((Boolean) c2841s.f23270c.a(e9)).booleanValue() ? gs.f8461e.f13485g.toLowerCase(Locale.ROOT) : gs.f8461e.f13485g;
        if (((Boolean) c2841s.f23270c.a(H9.f8710a2)).booleanValue()) {
            C2141xo c2141xo = gs.f8464h;
            synchronized (c2141xo) {
                bundle = new Bundle(c2141xo.f17627a);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (((Boolean) c2841s.f23270c.a(H9.f8675T4)).booleanValue()) {
            C0487Ef c0487EfS = p2.j.f22785C.f22795h.i().s();
            char c6 = (TextUtils.isEmpty(c0487EfS.f7976e) || c0487EfS.f7978g == null) ? (char) 3 : c0487EfS.b() ? (char) 1 : (char) 2;
            str = c6 != 1 ? c6 != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) c2841s.f23270c.a(H9.f8765j2)).booleanValue()) {
            gs.b(arrayList, gs.f8459c.c(gs.f8465j, lowerCase));
        } else {
            C1605nr c1605nr = gs.f8459c;
            Iterator it = ((C1305iC) c1605nr.b(gs.f8465j, lowerCase).entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                List list = (List) entry.getValue();
                Bundle bundle3 = gs.f8461e.f13482d.f23176m;
                arrayList.add(gs.d(str3, list, bundle3 != null ? bundle3.getBundle(str3) : null, true, true));
            }
            gs.b(arrayList, c1605nr.a());
        }
        LB lbM = LB.m(arrayList);
        CallableC0814Xj callableC0814Xj = new CallableC0814Xj(arrayList, bundle2, str2);
        ID id = gs.f8457a;
        C2005vD c2005vD = new C2005vD(lbM, true, false);
        c2005vD.f17236D = new C1951uD(c2005vD, callableC0814Xj, id);
        c2005vD.v();
        return c2005vD;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public /* synthetic */ Object b(Object obj) {
        C0633Mp.d((SQLiteDatabase) obj, (u2.n) this.f9620b);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1075e0
    public void c() {
        H h6 = (H) this.f9620b;
        Surface surface = h6.f8515e1;
        if (surface != null) {
            C0697Ql c0697Ql = h6.f8502R0;
            Handler handler = (Handler) c0697Ql.f10691b;
            if (handler != null) {
                handler.post(new RunnableC1021d0(c0697Ql, surface, SystemClock.elapsedRealtime()));
            }
            h6.f8518h1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        C0657Of c0657Of;
        switch (this.f9619a) {
            case 10:
                ((AtomicInteger) ((B3.u) this.f9620b).f663b).set(1);
                return;
            case 14:
                ((C0695Qj) this.f9620b).f10681a.a();
                return;
            case 18:
                C1278hm c1278hm = (C1278hm) this.f9620b;
                c1278hm.f14567m.P((InterfaceC0828Yg) obj);
                C1492lm c1492lm = c1278hm.f14567m;
                synchronized (c1492lm) {
                    c0657Of = c1492lm.f15447n;
                }
                C0837Yp c0837YpG = c1278hm.g("Google", true);
                if (c0837YpG != null && c0657Of != null) {
                    c0657Of.b(c0837YpG);
                    return;
                } else {
                    if (c0657Of != null) {
                        c0657Of.cancel(false);
                        return;
                    }
                    return;
                }
            case 19:
                C0657Of c0657Of2 = (C0657Of) this.f9620b;
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                if (interfaceC0828Yg == null) {
                    c0657Of2.c(new C0736Sq(1, "Missing webview from video view future."));
                    return;
                }
                interfaceC0828Yg.g0("/video", new C1858sb(7, new Rx(19, c0657Of2)));
                interfaceC0828Yg.j0();
                return;
            case 21:
                ((C0445Bo) obj).f7442n = true;
                ((BinderC0751To) this.f9620b).f11466d.b();
                return;
            default:
                try {
                    ((Eu) this.f9620b).b((SQLiteDatabase) obj);
                    return;
                } catch (Exception e6) {
                    u2.k.e("Error executing function on offline signal database: ".concat(String.valueOf(e6.getMessage())));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1872sp
    public InterfaceFutureC2326a e(C1807re c1807re) {
        C1549mp c1549mp = (C1549mp) ((C1338iu) this.f9620b).f14823c;
        String str = c1807re.f16583h;
        synchronized (c1549mp.f15280b) {
            try {
                int i = c1549mp.f15673h;
                if (i != 1 && i != 3) {
                    return AbstractC1984ut.w(new C1765qp(2));
                }
                if (c1549mp.f15281c) {
                    return c1549mp.f15279a;
                }
                c1549mp.f15673h = 3;
                c1549mp.f15281c = true;
                c1549mp.f15672g = str;
                c1549mp.f15284f.n();
                C0657Of c0657Of = c1549mp.f15279a;
                c0657Of.f10212a.a(new RunnableC1495lp(c1549mp, 0), AbstractC0640Nf.f10011g);
                return c0657Of;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0482Ea
    public JSONObject f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1507m0
    public long g(long j6) {
        ((C0) this.f9620b).getClass();
        String str = Vt.f12096a;
        return Math.max(0L, Math.min((j6 * r0.f7483e) / 1000000, r0.f7487j - 1));
    }

    @Override // com.google.android.gms.internal.ads.EA
    public /* synthetic */ void i(long j6, C2036vr c2036vr) {
        switch (this.f9619a) {
            case 3:
                AbstractC0933bL.e(j6, c2036vr, ((C1725q2) this.f9620b).f16283I);
                break;
            default:
                AbstractC0933bL.e(j6, c2036vr, ((C1025d4) this.f9620b).f13724c);
                break;
        }
    }

    @Override // w2.InterfaceC2973e
    public void k(C2545a c2545a) {
        try {
            ((InterfaceC1645od) this.f9620b).a(c2545a.b());
        } catch (RemoteException e6) {
            u2.k.f("", e6);
        }
    }

    public AtomicReference l(String str) {
        synchronized (this) {
            try {
                HashMap map = (HashMap) this.f9620b;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.f9620b).get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0482Ea
    public JSONObject m() {
        return null;
    }

    public void n(C4 c42, A1.s sVar, CD cd) {
        synchronized (c42.f7520e) {
            c42.i = true;
        }
        c42.a("post-response");
        ((ExecutorC1996v4) this.f9620b).f17222b.post(new RunnableC0912b0(c42, sVar, cd, 1));
    }

    @Override // w2.InterfaceC2973e
    public Object onSuccess(Object obj) {
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        switch (this.f9619a) {
            case 10:
                ((AtomicInteger) ((B3.u) this.f9620b).f663b).set(-1);
                break;
            case 14:
                break;
            case 18:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.i6)).booleanValue()) {
                    p2.j.f22785C.f22795h.g("omid native display exp", th);
                    break;
                }
                break;
            case 19:
                u2.k.e("Failed to load media data due to video view load failure.");
                ((C0657Of) this.f9620b).c(th);
                break;
            case 21:
                break;
            default:
                u2.k.e("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Dr
    public void v(AbstractC1812rj abstractC1812rj) {
        Ot ot = (Ot) this.f9620b;
        C1870sn c1870sn = (C1870sn) abstractC1812rj;
        synchronized (ot) {
            try {
                ot.f10267d = c1870sn;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8774k4)).booleanValue()) {
                    c1870sn.f16792u.f12980a = ot.f10266c;
                }
                ot.f10267d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public L6(int i) {
        this.f9619a = i;
        switch (i) {
            case 6:
                this.f9620b = new HashMap();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0691Qf, com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f9619a) {
            case 7:
                C0895ak c0895ak = (C0895ak) this.f9620b;
                c0895ak.getClass();
                InterfaceC0828Yg interfaceC0828Yg = ((C1536mc) obj).f15630a;
                if (interfaceC0828Yg == null || interfaceC0828Yg.t0()) {
                    c0895ak.f13219g = 1;
                    break;
                }
                break;
            case 15:
                ((InterfaceC1598nk) obj).W((C0578Jl) this.f9620b);
                break;
            case 16:
                ((InterfaceC1005cl) obj).H((C1084e9) this.f9620b);
                break;
            default:
                ((M7) obj).K((L7) this.f9620b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1075e0
    /* renamed from: f, reason: collision with other method in class */
    public void mo7f() {
        H h6 = (H) this.f9620b;
        if (h6.f8515e1 != null) {
            h6.t0(0, 1);
        }
    }

    public L6(Handler handler) {
        this.f9619a = 5;
        this.f9620b = new ExecutorC1996v4(this, handler);
    }

    public L6(C2021vc c2021vc, C1967uc c1967uc) {
        this.f9619a = 8;
        this.f9620b = c1967uc;
        Objects.requireNonNull(c2021vc);
    }

    public L6(BinderC2076wd binderC2076wd, InterfaceC1645od interfaceC1645od, InterfaceC0688Qc interfaceC0688Qc) {
        this.f9619a = 9;
        this.f9620b = interfaceC1645od;
    }

    public L6(C0697Ql c0697Ql, Eu eu) {
        this.f9619a = 23;
        this.f9620b = eu;
    }

    public L6(C0732Sm c0732Sm, C0657Of c0657Of) {
        this.f9619a = 19;
        this.f9620b = c0657Of;
        Objects.requireNonNull(c0732Sm);
    }

    private final void o(Throwable th) {
    }

    private final void p(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0482Ea
    public void h(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1759qj
    /* renamed from: a, reason: collision with other method in class */
    public q2.B0 mo5a() throws C1123eu {
        try {
            return ((C1392ju) this.f9620b).f15016a.H();
        } catch (Throwable th) {
            throw new C1123eu(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1075e0, com.google.android.gms.internal.ads.InterfaceC0674Pf, com.google.android.gms.internal.ads.InterfaceC0482Ea, com.google.android.gms.internal.ads.Dr
    /* renamed from: a, reason: collision with other method in class */
    public void mo6a() {
        switch (this.f9619a) {
            case 1:
                VN vn = ((H) this.f9620b).f10391V;
                if (vn != null) {
                    vn.a();
                    return;
                }
                return;
            case 8:
                C1967uc c1967uc = (C1967uc) this.f9620b;
                AbstractC2907C.m("Rejecting reference for JS Engine.");
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.B8)).booleanValue()) {
                    c1967uc.C("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    return;
                } else {
                    c1967uc.B();
                    return;
                }
            case 20:
                C1278hm c1278hm = ((BinderC1171fn) this.f9620b).f14141d;
                if (c1278hm != null) {
                    c1278hm.i("_videoMediaView");
                    return;
                }
                return;
            default:
                Ot ot = (Ot) this.f9620b;
                synchronized (ot) {
                    ot.f10267d = null;
                }
                return;
        }
    }
}
