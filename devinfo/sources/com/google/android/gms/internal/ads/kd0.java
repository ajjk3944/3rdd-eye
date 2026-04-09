package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kd0 implements t70, va.a, p60, j60, h70 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13130a;

    /* renamed from: b, reason: collision with root package name */
    public final oq0 f13131b;

    /* renamed from: c, reason: collision with root package name */
    public final qd0 f13132c;

    /* renamed from: d, reason: collision with root package name */
    public final dq0 f13133d;

    /* renamed from: e, reason: collision with root package name */
    public final wp0 f13134e;

    /* renamed from: f, reason: collision with root package name */
    public final lh0 f13135f;
    public final String g;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f13137i;

    /* renamed from: h, reason: collision with root package name */
    public long f13136h = -1;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f13138k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f13139l = new AtomicBoolean(false);
    public final boolean j = ((Boolean) va.s.f36163e.f36166c.a(sk.B7)).booleanValue();

    public kd0(Context context, oq0 oq0Var, qd0 qd0Var, dq0 dq0Var, wp0 wp0Var, lh0 lh0Var, String str) {
        this.f13130a = context;
        this.f13131b = oq0Var;
        this.f13132c = qd0Var;
        this.f13133d = dq0Var;
        this.f13134e = wp0Var;
        this.f13135f = lh0Var;
        this.g = str;
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final void D1() {
        if (a()) {
            this.f13139l.set(true);
            ua.j jVar = ua.j.C;
            jVar.f35267k.getClass();
            this.f13136h = System.currentTimeMillis();
            rt rtVarB = b("presentation");
            pk pkVar = sk.Pe;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && e()) {
                boolean z3 = !ya.f0.h(this.f13130a);
                AtomicBoolean atomicBoolean = this.f13138k;
                atomicBoolean.set(z3);
                rtVarB.u("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) sVar.f36166c.a(sk.Qe)).booleanValue() && e()) {
                rtVarB.u("fg_al", true != jVar.g.l() ? "0" : "1");
            }
            rtVarB.v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.google.android.gms.internal.ads.j60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(va.w1 r6) {
        /*
            r5 = this;
            boolean r0 = r5.j
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            com.google.android.gms.internal.ads.rt r0 = r5.b(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "adapter"
            r0.u(r1, r2)
            int r1 = r6.f36177a
            java.lang.String r2 = r6.f36178b
            java.lang.String r3 = r6.f36179c
            java.lang.String r4 = "com.google.android.gms.ads"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            va.w1 r3 = r6.f36180d
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.f36179c
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L32
            va.w1 r6 = r6.f36180d
            int r1 = r6.f36177a
            java.lang.String r2 = r6.f36178b
        L32:
            if (r1 < 0) goto L3d
            java.lang.String r6 = "arec"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.u(r6, r1)
        L3d:
            com.google.android.gms.internal.ads.oq0 r6 = r5.f13131b
            java.util.regex.Pattern r6 = r6.f14770a
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
            r0.u(r1, r6)
        L5d:
            r0.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kd0.J(va.w1):void");
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void K(e90 e90Var) {
        if (this.j) {
            rt rtVarB = b("ifts");
            rtVarB.u("reason", "exception");
            if (!TextUtils.isEmpty(e90Var.getMessage())) {
                rtVarB.u("msg", e90Var.getMessage());
            }
            rtVarB.v();
        }
    }

    public final boolean a() {
        String strO;
        if (this.f13137i == null) {
            synchronized (this) {
                if (this.f13137i == null) {
                    String str = (String) va.s.f36163e.f36166c.a(sk.Q1);
                    ya.f0 f0Var = ua.j.C.f35261c;
                    try {
                        strO = ya.f0.O(this.f13130a);
                    } catch (RemoteException unused) {
                        strO = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strO != null) {
                        try {
                            zMatches = Pattern.matches(str, strO);
                        } catch (RuntimeException e2) {
                            ua.j.C.f35265h.f("CsiActionsListener.isPatternMatched", e2);
                        }
                    }
                    this.f13137i = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f13137i.booleanValue();
    }

    public final rt b(String str) {
        dq0 dq0Var = this.f13133d;
        aw awVar = dq0Var.f10544b;
        rg0 rg0Var = dq0Var.f10543a;
        rt rtVarA = this.f13132c.a();
        rtVarA.u("gqi", ((yp0) awVar.f9452c).f18820b);
        wp0 wp0Var = this.f13134e;
        rtVarA.q(wp0Var);
        rtVarA.u("action", str);
        rtVarA.u("ad_format", this.g.toUpperCase(Locale.ROOT));
        List list = wp0Var.f18108t;
        if (!list.isEmpty()) {
            rtVarA.u("ancn", (String) list.get(0));
        }
        if (wp0Var.b()) {
            ua.j jVar = ua.j.C;
            rtVarA.u("device_connectivity", true != jVar.f35265h.k(this.f13130a) ? "offline" : u.a.ONLINE_EXTRAS_KEY);
            jVar.f35267k.getClass();
            rtVarA.u("event_timestamp", String.valueOf(System.currentTimeMillis()));
            rtVarA.u("offline_ad", "1");
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.I7)).booleanValue()) {
            boolean z3 = u6.t.D((hq0) rg0Var.f15651b) != 1;
            rtVarA.u("scar", String.valueOf(z3));
            if (z3) {
                va.z2 z2Var = ((hq0) rg0Var.f15651b).f11944d;
                rtVarA.u("ragent", z2Var.f36201p);
                rtVarA.u("rtype", u6.t.v(u6.t.x(z2Var)));
            }
        }
        return rtVarA;
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void c() {
        if (this.j) {
            rt rtVarB = b("ifts");
            rtVarB.u("reason", "blocked");
            rtVarB.v();
        }
    }

    public final void d(rt rtVar) {
        if (!this.f13134e.b()) {
            rtVar.v();
            return;
        }
        ud0 ud0Var = ((qd0) rtVar.f15754c).f15315a;
        String strA = ud0Var.f17179f.a((ConcurrentHashMap) rtVar.f15753b);
        ua.j.C.f35267k.getClass();
        sa saVar = new sa(((yp0) this.f13133d.f10544b.f9452c).f18820b, strA, 2, System.currentTimeMillis());
        lh0 lh0Var = this.f13135f;
        lh0Var.getClass();
        lh0Var.c(new ce1(lh0Var, false, saVar, 15));
    }

    public final boolean e() {
        int i4 = this.f13134e.f18074b;
        return i4 == 2 || i4 == 5 || i4 == 6 || i4 == 7;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void f() {
        if (a()) {
            rt rtVarB = b("adapter_impression");
            rtVarB.u("imp_type", String.valueOf(this.f13134e.f18080e));
            if (this.f13139l.get()) {
                rtVarB.u("po", "1");
                ua.j.C.f35267k.getClass();
                rtVarB.u("pil", String.valueOf(System.currentTimeMillis() - this.f13136h));
            } else {
                rtVarB.u("po", "0");
            }
            pk pkVar = sk.Pe;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && e()) {
                ya.f0 f0Var = ua.j.C.f35261c;
                rtVarB.u("foreground", true != ya.f0.h(this.f13130a) ? "1" : "0");
                rtVarB.u("fg_show", true != this.f13138k.get() ? "0" : "1");
            }
            if (((Boolean) sVar.f36166c.a(sk.Qe)).booleanValue() && e()) {
                rtVarB.u("fg_al", true == ua.j.C.g.l() ? "1" : "0");
            }
            rtVarB.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void n() {
        boolean zA = a();
        wp0 wp0Var = this.f13134e;
        if (zA || wp0Var.b()) {
            rt rtVarB = b(AdSDKNotificationListener.IMPRESSION_EVENT);
            rtVarB.u("imp_type", String.valueOf(wp0Var.f18080e));
            if (this.f13136h > 0) {
                ua.j.C.f35267k.getClass();
                rtVarB.u("p_imp_l", String.valueOf(System.currentTimeMillis() - this.f13136h));
            }
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Pe)).booleanValue() && e()) {
                ya.f0 f0Var = ua.j.C.f35261c;
                rtVarB.u("foreground", true != ya.f0.h(this.f13130a) ? "1" : "0");
                rtVarB.u("fg_show", true == this.f13138k.get() ? "1" : "0");
            }
            d(rtVarB);
        }
    }

    @Override // va.a
    public final void onAdClicked() {
        if (this.f13134e.b()) {
            d(b("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void r() {
        if (a()) {
            b("adapter_shown").v();
        }
    }
}
