package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b30 implements g60, w60, p60, va.a, n60, p80, h70 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9567a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9568b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9569c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f9570d;

    /* renamed from: e, reason: collision with root package name */
    public final dq0 f9571e;

    /* renamed from: f, reason: collision with root package name */
    public final wp0 f9572f;
    public final bt0 g;

    /* renamed from: h, reason: collision with root package name */
    public final lq0 f9573h;

    /* renamed from: i, reason: collision with root package name */
    public final oe f9574i;
    public final fl j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f9575k;

    /* renamed from: l, reason: collision with root package name */
    public final WeakReference f9576l;

    /* renamed from: m, reason: collision with root package name */
    public final pq0 f9577m;

    /* renamed from: n, reason: collision with root package name */
    public final d70 f9578n;

    /* renamed from: o, reason: collision with root package name */
    public final o50 f9579o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f9580p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9581q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f9582r = new AtomicBoolean();

    /* renamed from: s, reason: collision with root package name */
    public h0 f9583s = null;

    public b30(Context context, ex exVar, Executor executor, ScheduledExecutorService scheduledExecutorService, dq0 dq0Var, wp0 wp0Var, bt0 bt0Var, lq0 lq0Var, View view, qz qzVar, oe oeVar, fl flVar, pq0 pq0Var, d70 d70Var, o50 o50Var, Set set) {
        this.f9567a = context;
        this.f9568b = exVar;
        this.f9569c = executor;
        this.f9570d = scheduledExecutorService;
        this.f9571e = dq0Var;
        this.f9572f = wp0Var;
        this.g = bt0Var;
        this.f9573h = lq0Var;
        this.f9574i = oeVar;
        this.f9575k = new WeakReference(view);
        this.f9576l = new WeakReference(qzVar);
        this.j = flVar;
        this.f9577m = pq0Var;
        this.f9578n = d70Var;
        this.f9579o = o50Var;
        this.f9580p = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.p80
    public final void C1() {
        wp0 wp0Var = this.f9572f;
        this.f9573h.a(this.g.a(this.f9571e, wp0Var, wp0Var.f18111u0), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.h70
    public final void D1() {
        wp0 wp0Var = this.f9572f;
        if (wp0Var.f18080e == 4) {
            this.f9573h.a(this.g.a(this.f9571e, wp0Var, wp0Var.A0), null);
        }
    }

    public final List a() {
        boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.Gc)).booleanValue();
        wp0 wp0Var = this.f9572f;
        if (zBooleanValue) {
            ya.f0 f0Var = ua.j.C.f35261c;
            Context context = this.f9567a;
            if (ya.f0.e(context)) {
                Object systemService = context.getSystemService("display");
                Integer numValueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (numValueOf != null) {
                    int iMin = Math.min(numValueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = wp0Var.f18078d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return wp0Var.f18078d;
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final void b(va.w1 w1Var) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.S1)).booleanValue()) {
            int i4 = w1Var.f36177a;
            ArrayList arrayList = new ArrayList();
            wp0 wp0Var = this.f9572f;
            for (String str : wp0Var.f18098o) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 2);
                sb2.append("2.");
                sb2.append(i4);
                arrayList.add(bt0.c(str, "@gw_mpe@", sb2.toString()));
            }
            this.f9573h.a(this.g.a(this.f9571e, wp0Var, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void c() {
        wp0 wp0Var = this.f9572f;
        this.f9573h.a(this.g.a(this.f9571e, wp0Var, wp0Var.g), null);
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void d() {
        wp0 wp0Var = this.f9572f;
        this.f9573h.a(this.g.a(this.f9571e, wp0Var, wp0Var.f18087i), null);
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final synchronized void e() {
        pq0 pq0Var;
        try {
            if (this.f9581q) {
                ArrayList arrayList = new ArrayList(a());
                wp0 wp0Var = this.f9572f;
                arrayList.addAll(wp0Var.f18082f);
                this.f9573h.a(this.g.b(this.f9571e, wp0Var, true, null, null, arrayList, null, null), null);
            } else {
                lq0 lq0Var = this.f9573h;
                bt0 bt0Var = this.g;
                dq0 dq0Var = this.f9571e;
                wp0 wp0Var2 = this.f9572f;
                lq0Var.a(bt0Var.a(dq0Var, wp0Var2, wp0Var2.f18094m), null);
                if (((Boolean) va.s.f36163e.f36166c.a(sk.o4)).booleanValue() && (pq0Var = this.f9577m) != null) {
                    List list = ((wp0) pq0Var.f15074c).f18094m;
                    String strF = ((nj0) pq0Var.f15075d).f();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(bt0.c((String) it.next(), "@gw_adnetstatus@", strF));
                    }
                    long jG = ((nj0) pq0Var.f15075d).g();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        arrayList3.add(bt0.c((String) obj, "@gw_ttr@", Long.toString(jG, 10)));
                    }
                    lq0Var.a(bt0Var.a((dq0) pq0Var.f15073b, (wp0) pq0Var.f15074c, arrayList3), null);
                }
                lq0Var.a(bt0Var.a(dq0Var, wp0Var2, wp0Var2.f18082f), null);
            }
            this.f9581q = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void f(int i4, int i10) {
        View view;
        if (i4 <= 0 || !((view = (View) this.f9575k.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            g();
        } else {
            this.f9570d.schedule(new a30(this, i4, i10, 0), i10, TimeUnit.MILLISECONDS);
        }
    }

    public final void g() {
        int i4;
        h0 h0Var;
        wp0 wp0Var = this.f9572f;
        List list = wp0Var.f18078d;
        if (list == null || list.isEmpty()) {
            return;
        }
        pk pkVar = sk.Ze;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && this.f9583s == null) {
            bx bxVar = ua.j.C.f35265h.f19195c;
            Set set = this.f9580p;
            String str = ((hq0) this.f9571e.f10543a.f15651b).g;
            ax axVar = bxVar.f9837d;
            synchronized (axVar.g) {
                try {
                    int i10 = axVar.f9474m;
                    axVar.f9474m = i10 + 1;
                    if (set.isEmpty()) {
                        h0Var = new h0(i10, -1, -1, false);
                    } else {
                        TreeSet treeSet = new TreeSet(set);
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = treeSet.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (true) {
                                sb2.append((CharSequence) next);
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb2.append((CharSequence) ",");
                                next = it.next();
                            }
                        }
                        String string = sb2.toString();
                        HashMap map = axVar.f9475n;
                        Integer num = (Integer) map.get(string);
                        int iIntValue = 0;
                        int iIntValue2 = num == null ? 0 : num.intValue();
                        map.put(string, Integer.valueOf(iIntValue2 + 1));
                        if (str == null) {
                            h0Var = new h0(i10, iIntValue2, -1, false);
                        } else {
                            StringBuilder sb3 = new StringBuilder(str.length() + 1 + String.valueOf(string).length());
                            sb3.append(str);
                            sb3.append("|");
                            sb3.append(string);
                            String string2 = sb3.toString();
                            HashMap map2 = axVar.f9476o;
                            Integer num2 = (Integer) map2.get(string2);
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            }
                            map2.put(string2, Integer.valueOf(iIntValue + 1));
                            h0Var = new h0(i10, iIntValue2, iIntValue, false);
                        }
                    }
                } finally {
                }
            }
            this.f9583s = h0Var;
        }
        String strI = ((Boolean) sVar.f36166c.a(sk.f16179j4)).booleanValue() ? this.f9574i.f14684b.i(this.f9567a, (View) this.f9575k.get(), null) : null;
        if ((((Boolean) sVar.f36166c.a(sk.Q0)).booleanValue() && ((yp0) this.f9571e.f10544b.f9452c).f18825h) || !((Boolean) tl.f16875h.u()).booleanValue()) {
            this.f9573h.a(this.g.b(this.f9571e, wp0Var, false, strI, null, a(), this.f9579o, this.f9583s), this.f9578n);
            return;
        }
        if (((Boolean) tl.g.u()).booleanValue() && ((i4 = wp0Var.f18074b) == 1 || i4 == 2 || i4 == 5)) {
        }
        n81 n81Var = (n81) yo0.E(n81.s(s81.f15906b), ((Long) sVar.f36166c.a(sk.f16332t1)).longValue(), TimeUnit.MILLISECONDS, this.f9570d);
        n81Var.a(new q81(0, n81Var, new rt((Object) this, false, (Object) strI, 10)), this.f9568b);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void n() {
        if (this.f9582r.compareAndSet(false, true)) {
            pk pkVar = sk.f16318s4;
            va.s sVar = va.s.f36163e;
            rk rkVar = sVar.f36166c;
            rk rkVar2 = sVar.f36166c;
            int iIntValue = ((Integer) rkVar.a(pkVar)).intValue();
            if (iIntValue > 0) {
                f(iIntValue, ((Integer) rkVar2.a(sk.f16335t4)).intValue());
            } else if (!((Boolean) rkVar2.a(sk.f16303r4)).booleanValue()) {
                g();
            } else {
                this.f9569c.execute(new z20(this, 0));
            }
        }
    }

    @Override // va.a
    public final void onAdClicked() {
        boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.Q0)).booleanValue();
        dq0 dq0Var = this.f9571e;
        if ((zBooleanValue && ((yp0) dq0Var.f10544b.f9452c).f18825h) || !((Boolean) tl.f16872d.u()).booleanValue()) {
            wp0 wp0Var = this.f9572f;
            this.f9573h.b(true == ua.j.C.f35265h.k(this.f9567a) ? 2 : 1, this.g.a(dq0Var, wp0Var, wp0Var.f18076c));
        } else {
            fl flVar = this.j;
            flVar.getClass();
            d71 d71VarC = yo0.C(n81.s((n81) yo0.E(n81.s(s81.f15906b), ((Long) tl.f16871c.u()).longValue(), TimeUnit.MILLISECONDS, flVar.f11201c)), Throwable.class, o5.f14544e, fx.g);
            d71VarC.a(new q81(0, d71VarC, new mx0(16, this)), this.f9568b);
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void q(pu puVar, String str, String str2) {
        eq0 eq0Var;
        wp0 wp0Var = this.f9572f;
        List list = wp0Var.f18085h;
        bt0 bt0Var = this.g;
        bt0Var.getClass();
        ArrayList arrayList = new ArrayList();
        bt0Var.f9802h.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = puVar.f15106a;
            String string = Integer.toString(puVar.f15107b);
            boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.f16193k4)).booleanValue();
            c31 g31Var = x21.f18283a;
            if (zBooleanValue) {
                fq0 fq0Var = bt0Var.g;
                if (fq0Var != null && (eq0Var = fq0Var.f11255a) != null) {
                    g31Var = new g31(eq0Var);
                }
            } else {
                eq0 eq0Var2 = bt0Var.f9801f;
                if (eq0Var2 != null) {
                    g31Var = new g31(eq0Var2);
                }
            }
            String str4 = (String) g31Var.b(o5.f14556s).a();
            String str5 = (String) g31Var.b(o5.f14555r).a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a80.a(bt0.c(bt0.c(bt0.c(bt0.c(bt0.c(bt0.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", bt0Var.f9797b), bt0Var.f9800e, wp0Var.W, wp0Var.f18115w0));
            }
        } catch (RemoteException e2) {
            za.i.f("Unable to determine award type and amount.", e2);
        }
        this.f9573h.a(arrayList, null);
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void E() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void v() {
    }
}
