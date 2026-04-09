package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import q2.C2841s;
import q2.InterfaceC2806a;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.On, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665On implements InterfaceC0832Yk, InterfaceC2806a, InterfaceC1921tk, InterfaceC1598nk, InterfaceC0628Mk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10237a;

    /* renamed from: b, reason: collision with root package name */
    public final C1286hu f10238b;

    /* renamed from: c, reason: collision with root package name */
    public final C0784Vn f10239c;

    /* renamed from: d, reason: collision with root package name */
    public final Xt f10240d;

    /* renamed from: e, reason: collision with root package name */
    public final Qt f10241e;

    /* renamed from: f, reason: collision with root package name */
    public final C0633Mp f10242f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10243g;
    public Boolean i;

    /* renamed from: h, reason: collision with root package name */
    public long f10244h = -1;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f10246k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f10247l = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10245j = ((Boolean) C2841s.f23267e.f23270c.a(H9.B7)).booleanValue();

    public C0665On(Context context, C1286hu c1286hu, C0784Vn c0784Vn, Xt xt, Qt qt, C0633Mp c0633Mp, String str) {
        this.f10237a = context;
        this.f10238b = c1286hu;
        this.f10239c = c0784Vn;
        this.f10240d = xt;
        this.f10241e = qt;
        this.f10242f = c0633Mp;
        this.f10243g = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1598nk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(q2.C2852x0 r6) {
        /*
            r5 = this;
            boolean r0 = r5.f10245j
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            com.google.android.gms.internal.ads.Ql r0 = r5.d(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "adapter"
            r0.r(r1, r2)
            int r1 = r6.f23273a
            java.lang.String r2 = r6.f23274b
            java.lang.String r3 = r6.f23275c
            java.lang.String r4 = "com.google.android.gms.ads"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            q2.x0 r3 = r6.f23276d
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.f23275c
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L32
            q2.x0 r6 = r6.f23276d
            int r1 = r6.f23273a
            java.lang.String r2 = r6.f23274b
        L32:
            if (r1 < 0) goto L3d
            java.lang.String r6 = "arec"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.r(r6, r1)
        L3d:
            com.google.android.gms.internal.ads.hu r6 = r5.f10238b
            java.util.regex.Pattern r6 = r6.f14617a
            if (r6 == 0) goto L55
            if (r2 != 0) goto L46
            goto L55
        L46:
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r1 = r6.find()
            if (r1 == 0) goto L55
            java.lang.String r6 = r6.group()
            goto L56
        L55:
            r6 = 0
        L56:
            if (r6 == 0) goto L5d
            java.lang.String r1 = "areec"
            r0.r(r1, r6)
        L5d:
            r0.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0665On.V(q2.x0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1598nk
    public final void W(C0578Jl c0578Jl) {
        if (this.f10245j) {
            C0697Ql c0697QlD = d("ifts");
            c0697QlD.r("reason", "exception");
            if (!TextUtils.isEmpty(c0578Jl.getMessage())) {
                c0697QlD.r("msg", c0578Jl.getMessage());
            }
            c0697QlD.s();
        }
    }

    public final boolean a() {
        String strO;
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    String str = (String) C2841s.f23267e.f23270c.a(H9.Q1);
                    C2911G c2911g = p2.j.f22785C.f22790c;
                    try {
                        strO = C2911G.O(this.f10237a);
                    } catch (RemoteException unused) {
                        strO = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strO != null) {
                        try {
                            zMatches = Pattern.matches(str, strO);
                        } catch (RuntimeException e6) {
                            p2.j.f22785C.f22795h.f("CsiActionsListener.isPatternMatched", e6);
                        }
                    }
                    this.i = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.i.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1598nk
    public final void b() {
        if (this.f10245j) {
            C0697Ql c0697QlD = d("ifts");
            c0697QlD.r("reason", "blocked");
            c0697QlD.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0832Yk
    public final void c() {
        if (a()) {
            C0697Ql c0697QlD = d("adapter_impression");
            c0697QlD.r("imp_type", String.valueOf(this.f10241e.f10764e));
            if (this.f10247l.get()) {
                c0697QlD.r("po", "1");
                p2.j.f22785C.f22797k.getClass();
                c0697QlD.r("pil", String.valueOf(System.currentTimeMillis() - this.f10244h));
            } else {
                c0697QlD.r("po", "0");
            }
            E9 e9 = H9.Ne;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && f()) {
                C2911G c2911g = p2.j.f22785C.f22790c;
                c0697QlD.r("foreground", true != C2911G.h(this.f10237a) ? "1" : "0");
                c0697QlD.r("fg_show", true != this.f10246k.get() ? "0" : "1");
            }
            if (((Boolean) c2841s.f23270c.a(H9.Oe)).booleanValue() && f()) {
                c0697QlD.r("fg_al", true == p2.j.f22785C.f22794g.s() ? "1" : "0");
            }
            c0697QlD.s();
        }
    }

    public final C0697Ql d(String str) {
        Xt xt = this.f10240d;
        C1431kf c1431kf = xt.f12510b;
        Nx nx = xt.f12509a;
        C0697Ql c0697QlA = this.f10239c.a();
        c0697QlA.r("gqi", ((St) c1431kf.f15174c).f11269b);
        Qt qt = this.f10241e;
        c0697QlA.o(qt);
        c0697QlA.r("action", str);
        c0697QlA.r("ad_format", this.f10243g.toUpperCase(Locale.ROOT));
        List list = qt.f10793t;
        if (!list.isEmpty()) {
            c0697QlA.r("ancn", (String) list.get(0));
        }
        if (qt.b()) {
            p2.j jVar = p2.j.f22785C;
            c0697QlA.r("device_connectivity", true != jVar.f22795h.k(this.f10237a) ? "offline" : "online");
            jVar.f22797k.getClass();
            c0697QlA.r("event_timestamp", String.valueOf(System.currentTimeMillis()));
            c0697QlA.r("offline_ad", "1");
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.I7)).booleanValue()) {
            boolean z6 = I5.b.E((C0960bu) nx.f10110b) != 1;
            c0697QlA.r("scar", String.valueOf(z6));
            if (z6) {
                q2.a1 a1Var = ((C0960bu) nx.f10110b).f13482d;
                c0697QlA.r("ragent", a1Var.f23153D);
                c0697QlA.r("rtype", I5.b.A(I5.b.B(a1Var)));
            }
        }
        return c0697QlA;
    }

    public final void e(C0697Ql c0697Ql) {
        if (!this.f10241e.b()) {
            c0697Ql.s();
            return;
        }
        C0852Zn c0852Zn = ((C0784Vn) c0697Ql.f10692c).f12083a;
        String strA = c0852Zn.f12963f.a((ConcurrentHashMap) c0697Ql.f10691b);
        p2.j.f22785C.f22797k.getClass();
        N4 n42 = new N4(System.currentTimeMillis(), ((St) this.f10240d.f12510b.f15174c).f11269b, strA, 2);
        C0633Mp c0633Mp = this.f10242f;
        c0633Mp.getClass();
        c0633Mp.a(new C0889ae(c0633Mp, 25, n42));
    }

    public final boolean f() {
        int i = this.f10241e.f10759b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0628Mk
    public final void k() {
        if (a()) {
            this.f10247l.set(true);
            p2.j jVar = p2.j.f22785C;
            jVar.f22797k.getClass();
            this.f10244h = System.currentTimeMillis();
            C0697Ql c0697QlD = d("presentation");
            E9 e9 = H9.Ne;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && f()) {
                boolean z6 = !C2911G.h(this.f10237a);
                AtomicBoolean atomicBoolean = this.f10246k;
                atomicBoolean.set(z6);
                c0697QlD.r("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) c2841s.f23270c.a(H9.Oe)).booleanValue() && f()) {
                c0697QlD.r("fg_al", true != jVar.f22794g.s() ? "0" : "1");
            }
            c0697QlD.s();
        }
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() {
        if (this.f10241e.b()) {
            e(d("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0832Yk
    public final void s() {
        if (a()) {
            d("adapter_shown").s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final void z() {
        boolean zA = a();
        Qt qt = this.f10241e;
        if (zA || qt.b()) {
            C0697Ql c0697QlD = d("impression");
            c0697QlD.r("imp_type", String.valueOf(qt.f10764e));
            if (this.f10244h > 0) {
                p2.j.f22785C.f22797k.getClass();
                c0697QlD.r("p_imp_l", String.valueOf(System.currentTimeMillis() - this.f10244h));
            }
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ne)).booleanValue() && f()) {
                C2911G c2911g = p2.j.f22785C.f22790c;
                c0697QlD.r("foreground", true != C2911G.h(this.f10237a) ? "1" : "0");
                c0697QlD.r("fg_show", true == this.f10246k.get() ? "1" : "0");
            }
            e(c0697QlD);
        }
    }
}
