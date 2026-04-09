package com.google.android.gms.internal.ads;

import Y2.C0217t;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import o4.AbstractC2763b;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2911G;
import u.C2936e;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.hm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278hm extends AbstractC1812rj {

    /* renamed from: J, reason: collision with root package name */
    public static final C1197gC f14556J;

    /* renamed from: A, reason: collision with root package name */
    public boolean f14557A;

    /* renamed from: B, reason: collision with root package name */
    public final C1485lf f14558B;

    /* renamed from: C, reason: collision with root package name */
    public final H6 f14559C;

    /* renamed from: D, reason: collision with root package name */
    public final C2951a f14560D;

    /* renamed from: E, reason: collision with root package name */
    public final Context f14561E;

    /* renamed from: F, reason: collision with root package name */
    public final C1384jm f14562F;

    /* renamed from: G, reason: collision with root package name */
    public final C2144xr f14563G;

    /* renamed from: H, reason: collision with root package name */
    public final HashMap f14564H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f14565I;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f14566l;

    /* renamed from: m, reason: collision with root package name */
    public final C1492lm f14567m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC1654om f14568n;

    /* renamed from: o, reason: collision with root package name */
    public final C1977um f14569o;

    /* renamed from: p, reason: collision with root package name */
    public final C1600nm f14570p;

    /* renamed from: q, reason: collision with root package name */
    public final C1708pm f14571q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1692pN f14572r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1692pN f14573s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC1692pN f14574t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC1692pN f14575u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1692pN f14576v;

    /* renamed from: w, reason: collision with root package name */
    public B7 f14577w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14578x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14579y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14580z;

    static {
        JB jb = LB.f9635b;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        AbstractC1984ut.k(6, objArr);
        f14556J = LB.o(6, objArr);
    }

    public C1278hm(K4.j jVar, Executor executor, C1492lm c1492lm, InterfaceC1654om interfaceC1654om, C1977um c1977um, C1600nm c1600nm, C1708pm c1708pm, InterfaceC1692pN interfaceC1692pN, InterfaceC1692pN interfaceC1692pN2, InterfaceC1692pN interfaceC1692pN3, InterfaceC1692pN interfaceC1692pN4, InterfaceC1692pN interfaceC1692pN5, C1485lf c1485lf, H6 h6, C2951a c2951a, Context context, C1384jm c1384jm, C2144xr c2144xr) {
        super(jVar);
        this.f14566l = executor;
        this.f14567m = c1492lm;
        this.f14568n = interfaceC1654om;
        this.f14569o = c1977um;
        this.f14570p = c1600nm;
        this.f14571q = c1708pm;
        this.f14572r = interfaceC1692pN;
        this.f14573s = interfaceC1692pN2;
        this.f14574t = interfaceC1692pN3;
        this.f14575u = interfaceC1692pN4;
        this.f14576v = interfaceC1692pN5;
        this.f14558B = c1485lf;
        this.f14559C = h6;
        this.f14560D = c2951a;
        this.f14561E = context;
        this.f14562F = c1384jm;
        this.f14563G = c2144xr;
        this.f14564H = new HashMap();
        this.f14565I = new ArrayList();
    }

    public static boolean f(View view) {
        E9 e9 = H9.Pb;
        C2841s c2841s = C2841s.f23267e;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        C2911G c2911g = p2.j.f22785C.f22790c;
        long jA = C2911G.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return jA >= ((long) ((Integer) c2841s.f23270c.a(H9.Qb)).intValue());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f14579y     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.m(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.f8754h2     // Catch: java.lang.Throwable -> La
            q2.s r1 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.G9 r1 = r1.f23270c     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.Qt r0 = r3.f16601b     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.f10776k0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            java.util.HashMap r0 = r3.f14564H     // Catch: java.lang.Throwable -> La
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L2f
            goto L8b
        L48:
            if (r7 != 0) goto L8d
            com.google.android.gms.internal.ads.E9 r7 = com.google.android.gms.internal.ads.H9.f8573C4     // Catch: java.lang.Throwable -> La
            q2.s r0 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.G9 r0 = r0.f23270c     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r0.a(r7)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> La
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r7 == 0) goto L8b
            if (r5 == 0) goto L8b
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La
        L66:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> La
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            boolean r0 = f(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            r3.l(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r3.l(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            r3.m(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1278hm.A(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized JSONObject B(View view, Map map, Map map2) {
        return this.f14568n.d(view, map, map2, p());
    }

    public final synchronized JSONObject C(View view, Map map, Map map2) {
        return this.f14568n.l(view, map, map2, p());
    }

    public final synchronized void D(View view) {
        this.f14568n.b(view);
    }

    public final synchronized void E() {
        this.f14568n.y();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1812rj
    public final void a() {
        RunnableC1061dm runnableC1061dm = new RunnableC1061dm(this, 1);
        Executor executor = this.f14566l;
        executor.execute(runnableC1061dm);
        if (this.f14567m.W() != 7) {
            InterfaceC1654om interfaceC1654om = this.f14568n;
            Objects.requireNonNull(interfaceC1654om);
            executor.execute(new RunnableC0558Ii(7, interfaceC1654om));
        }
        super.a();
    }

    public final synchronized void c(final int i, final View view) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Lc)).booleanValue()) {
            B7 b7 = this.f14577w;
            if (b7 == null) {
                u2.k.c("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z6 = b7 instanceof ViewTreeObserverOnGlobalLayoutListenerC1869sm;
                this.f14566l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fm
                    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
                    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C1278hm c1278hm = this.f14134a;
                        ?? r12 = c1278hm.f14577w;
                        if (r12 == 0) {
                            u2.k.c("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        c1278hm.f14568n.n(view, r12.N1(), c1278hm.f14577w.h(), c1278hm.f14577w.k(), z6, c1278hm.p(), i);
                    }
                });
            }
        }
    }

    public final synchronized int d() {
        return this.f14568n.A();
    }

    public final synchronized boolean e() {
        return this.f14568n.u();
    }

    public final C0837Yp g(String str, boolean z6) {
        boolean z7;
        boolean z8;
        String str2;
        C0837Yp c0837Yp;
        C1600nm c1600nm = this.f14570p;
        if (!c1600nm.c() || TextUtils.isEmpty(str)) {
            return null;
        }
        C1492lm c1492lm = this.f14567m;
        InterfaceC0828Yg interfaceC0828YgT = c1492lm.t();
        InterfaceC0828Yg interfaceC0828YgR = c1492lm.r();
        if (interfaceC0828YgT == null && interfaceC0828YgR == null) {
            u2.k.h("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        c1600nm.f();
        int iH = c1600nm.f().h();
        int i = iH - 1;
        int i3 = 2;
        if (i != 0) {
            if (i != 1) {
                String str3 = iH != 1 ? iH != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                StringBuilder sb = new StringBuilder(str3.length() + 49);
                sb.append("Unknown omid media type: ");
                sb.append(str3);
                sb.append(". Not initializing Omid.");
                u2.k.h(sb.toString());
                return null;
            }
            if (interfaceC0828YgT == null) {
                u2.k.h("Omid media type was display but there was no display webview.");
                return null;
            }
            z8 = false;
            z7 = true;
        } else {
            if (interfaceC0828YgR == null) {
                u2.k.h("Omid media type was video but there was no video webview.");
                return null;
            }
            z7 = false;
            z8 = true;
        }
        if (z7) {
            str2 = null;
        } else {
            str2 = "javascript";
            interfaceC0828YgT = interfaceC0828YgR;
        }
        if (interfaceC0828YgT == null) {
            u2.k.h("Webview is null in InternalNativeAd");
            return null;
        }
        Context context = this.f14561E;
        p2.j jVar = p2.j.f22785C;
        jVar.f22810x.getClass();
        if (!C1437kl.g(context)) {
            u2.k.h("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        C2951a c2951a = this.f14560D;
        int i6 = c2951a.f23785b;
        int i7 = c2951a.f23786c;
        StringBuilder sb2 = new StringBuilder(AbstractC2763b.a(i6, 1) + String.valueOf(i7).length());
        sb2.append(i6);
        sb2.append(".");
        sb2.append(i7);
        String string = sb2.toString();
        if (!z8) {
            i = 2;
            i3 = c1492lm.W() == 3 ? 4 : 3;
        }
        C1437kl c1437kl = jVar.f22810x;
        WebView webViewT = interfaceC0828YgT.t();
        String str4 = this.f16601b.f10778l0;
        c1437kl.getClass();
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.a6)).booleanValue() && AbstractC0709Rg.f10942z.f16455b) {
            C0217t c0217t = new C0217t();
            c0217t.f4365a = str;
            c0217t.f4366b = string;
            c0217t.f4367c = str2;
            c0217t.f4368d = i;
            c0217t.f4370f = webViewT;
            c0217t.f4371g = str4;
            c0217t.f4369e = i3;
            c0837Yp = (C0837Yp) C1437kl.p(c0217t);
        } else {
            c0837Yp = null;
        }
        if (c0837Yp == null) {
            u2.k.h("Failed to create omid session in InternalNativeAd");
            return null;
        }
        synchronized (c1492lm) {
            c1492lm.f15445l = c0837Yp;
        }
        interfaceC0828YgT.o0(c0837Yp);
        if (z8) {
            Rv rv = c0837Yp.f12708a;
            if (interfaceC0828YgR != null) {
                View viewB0 = interfaceC0828YgR.b0();
                jVar.f22810x.getClass();
                C1437kl.k(rv, viewB0);
            }
            this.f14557A = true;
        }
        if (z6) {
            C1437kl c1437kl2 = jVar.f22810x;
            Rv rv2 = c0837Yp.f12708a;
            c1437kl2.getClass();
            C1437kl.j(rv2);
            interfaceC0828YgT.a("onSdkLoaded", new C2936e(0));
        }
        return c0837Yp;
    }

    public final void h(View view) {
        C0657Of c0657Of;
        C1492lm c1492lm = this.f14567m;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.h6)).booleanValue() || c1492lm.W() == 3) {
            r(view, c1492lm.w());
            return;
        }
        synchronized (c1492lm) {
            c0657Of = c1492lm.f15447n;
        }
        if (c0657Of == null) {
            return;
        }
        C0889ae c0889ae = new C0889ae((Object) this, (Object) view, 19, false);
        c0657Of.a(new CD(c0657Of, 0 == true ? 1 : 0, c0889ae), this.f14566l);
    }

    public final synchronized void i(String str) {
        this.f14568n.F(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    public final synchronized void j(InterfaceViewOnClickListenerC0528Gm interfaceViewOnClickListenerC0528Gm) {
        Iterator<String> itKeys;
        View view;
        F6 f6;
        try {
            if (!this.f14578x) {
                this.f14577w = (B7) interfaceViewOnClickListenerC0528Gm;
                C1977um c1977um = this.f14569o;
                c1977um.f17163g.execute(new CD(c1977um, interfaceViewOnClickListenerC0528Gm));
                this.f14568n.a(interfaceViewOnClickListenerC0528Gm.N1(), interfaceViewOnClickListenerC0528Gm.k(), interfaceViewOnClickListenerC0528Gm.i(), interfaceViewOnClickListenerC0528Gm, interfaceViewOnClickListenerC0528Gm);
                E9 e9 = H9.f8755h3;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && (f6 = this.f14559C.f8555b) != null) {
                    f6.h(interfaceViewOnClickListenerC0528Gm.N1());
                }
                if (((Boolean) c2841s.f23270c.a(H9.f8754h2)).booleanValue()) {
                    Qt qt = this.f16601b;
                    if (qt.f10776k0 && (itKeys = qt.f10774j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ?? r22 = this.f14577w;
                            WeakReference weakReference = r22 == 0 ? null : (WeakReference) r22.h().get(next);
                            this.f14564H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                N7 n7 = new N7(this.f14561E, view);
                                this.f14565I.add(n7);
                                n7.f9970l.add(new C1006cm(this, next));
                                n7.d(3);
                            }
                        }
                    }
                }
                if (interfaceViewOnClickListenerC0528Gm.g() != null) {
                    N7 n7G = interfaceViewOnClickListenerC0528Gm.g();
                    n7G.f9970l.add(this.f14558B);
                    n7G.d(3);
                }
            }
        } finally {
        }
    }

    public final void k(InterfaceViewOnClickListenerC0528Gm interfaceViewOnClickListenerC0528Gm) {
        View viewN1 = interfaceViewOnClickListenerC0528Gm.N1();
        interfaceViewOnClickListenerC0528Gm.h();
        this.f14568n.j(viewN1);
        if (interfaceViewOnClickListenerC0528Gm.q3() != null) {
            interfaceViewOnClickListenerC0528Gm.q3().setClickable(false);
            interfaceViewOnClickListenerC0528Gm.q3().removeAllViews();
        }
        if (interfaceViewOnClickListenerC0528Gm.g() != null) {
            N7 n7G = interfaceViewOnClickListenerC0528Gm.g();
            n7G.f9970l.remove(this.f14558B);
        }
        this.f14577w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    public final synchronized void l(View view, Map map, Map map2) {
        this.f14569o.a(this.f14577w);
        this.f14568n.r(view, map, map2, p());
        this.f14579y = true;
    }

    public final synchronized void m(View view, Map map, Map map2) {
        View viewO;
        if (!this.f14580z && (viewO = o(map)) != null) {
            E9 e9 = H9.Qe;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                Rect rect = new Rect();
                if (viewO.getGlobalVisibleRect(rect, new Point()) && viewO.getHeight() == rect.height() && viewO.getWidth() == rect.width()) {
                    this.f14568n.q(view, map, map2, p());
                    this.f14580z = true;
                }
            } else if (!((Boolean) c2841s.f23270c.a(H9.Re)).booleanValue()) {
                E9 e92 = H9.Se;
                if (((Float) c2841s.f23270c.a(e92)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) c2841s.f23270c.a(e92)).floatValue();
                    if (viewO.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r4.height() * r4.width() >= viewO.getHeight() * viewO.getWidth() * (dFloatValue / 100.0d)) {
                            this.f14568n.q(view, map, map2, p());
                            this.f14580z = true;
                        }
                    }
                }
            } else if (f(viewO)) {
                this.f14568n.q(view, map, map2, p());
                this.f14580z = true;
            }
        }
    }

    public final synchronized View o(Map map) {
        if (map != null) {
            C1197gC c1197gC = f14556J;
            int i = c1197gC.f14229d;
            int i3 = 0;
            while (i3 < i) {
                WeakReference weakReference = (WeakReference) map.get((String) c1197gC.get(i3));
                i3++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    public final synchronized ImageView.ScaleType p() {
        ?? r02 = this.f14577w;
        if (r02 == 0) {
            u2.k.c("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        S2.a aVarP = r02.p();
        if (aVarP != null) {
            return (ImageView.ScaleType) S2.b.n1(aVarP);
        }
        return C1977um.f17156k;
    }

    public final void q() {
        InterfaceFutureC2326a interfaceFutureC2326a;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.h6)).booleanValue()) {
            g("Google", true);
            return;
        }
        C1492lm c1492lm = this.f14567m;
        synchronized (c1492lm) {
            interfaceFutureC2326a = c1492lm.f15446m;
        }
        if (interfaceFutureC2326a == null) {
            return;
        }
        L6 l6 = new L6(18, this);
        interfaceFutureC2326a.a(new CD(interfaceFutureC2326a, 0, l6), this.f14566l);
    }

    public final void r(View view, C0837Yp c0837Yp) {
        InterfaceC0828Yg interfaceC0828YgT = this.f14567m.t();
        if (!this.f14570p.c() || c0837Yp == null || interfaceC0828YgT == null || view == null) {
            return;
        }
        C1437kl c1437kl = p2.j.f22785C.f22810x;
        Rv rv = c0837Yp.f12708a;
        c1437kl.getClass();
        C1437kl.k(rv, view);
    }

    public final synchronized void s(Bundle bundle) {
        this.f14568n.f(bundle);
    }

    public final synchronized void t() {
        this.f14578x = true;
        this.f14566l.execute(new RunnableC1061dm(this, 0));
        C2137xk c2137xk = this.f16602c;
        c2137xk.getClass();
        c2137xk.C1(new C9(null, false));
    }

    public final synchronized boolean u(Bundle bundle) {
        if (this.f14579y) {
            return true;
        }
        boolean zT = this.f14568n.t(bundle);
        this.f14579y = zT;
        return zT;
    }

    public final synchronized void v(Bundle bundle) {
        this.f14568n.o(bundle);
    }

    public final synchronized void w(InterfaceViewOnClickListenerC0528Gm interfaceViewOnClickListenerC0528Gm) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f2)).booleanValue()) {
            C2911G.f23576l.post(new RunnableC1115em(this, interfaceViewOnClickListenerC0528Gm, 0));
        } else {
            j(interfaceViewOnClickListenerC0528Gm);
        }
    }

    public final synchronized void x(InterfaceViewOnClickListenerC0528Gm interfaceViewOnClickListenerC0528Gm) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f2)).booleanValue()) {
            C2911G.f23576l.post(new RunnableC1115em(this, interfaceViewOnClickListenerC0528Gm, 1));
        } else {
            k(interfaceViewOnClickListenerC0528Gm);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x005a, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:10:0x0012, B:12:0x001a, B:15:0x0027, B:16:0x002c, B:18:0x003e, B:21:0x0047, B:23:0x004d), top: B:34:0x0001, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void y(android.view.View r8, android.view.View r9, java.util.Map r10, java.util.Map r11, boolean r12) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.um r0 = r7.f14569o     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.ads.B7 r1 = r7.f14577w     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.ads.Bm r2 = r0.f17161e     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L2c
            android.widget.FrameLayout r3 = r1.q3()     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto L12
            goto L2c
        L12:
            com.google.android.gms.internal.ads.nm r0 = r0.f17159c     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L2c
            android.widget.FrameLayout r0 = r1.q3()     // Catch: com.google.android.gms.internal.ads.C1165fh -> L26 java.lang.Throwable -> L5a
            android.view.View r1 = r2.a()     // Catch: com.google.android.gms.internal.ads.C1165fh -> L26 java.lang.Throwable -> L5a
            r0.addView(r1)     // Catch: com.google.android.gms.internal.ads.C1165fh -> L26 java.lang.Throwable -> L5a
            goto L2c
        L26:
            r0 = move-exception
            java.lang.String r1 = "web view can not be obtained"
            t2.AbstractC2907C.n(r1, r0)     // Catch: java.lang.Throwable -> L5a
        L2c:
            android.widget.ImageView$ScaleType r6 = r7.p()     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.ads.om r0 = r7.f14568n     // Catch: java.lang.Throwable -> L5a
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.h(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5a
            boolean r8 = r7.f14557A     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L5d
            com.google.android.gms.internal.ads.lm r8 = r7.f14567m     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.ads.Yg r9 = r8.r()     // Catch: java.lang.Throwable -> L5a
            if (r9 != 0) goto L47
            goto L5d
        L47:
            com.google.android.gms.internal.ads.Yg r8 = r8.r()     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L5d
            u.e r9 = new u.e     // Catch: java.lang.Throwable -> L5a
            r10 = 0
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = "onSdkAdUserInteractionClick"
            r8.a(r10, r9)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r7)
            return
        L5a:
            r0 = move-exception
            r8 = r0
            goto L5f
        L5d:
            monitor-exit(r7)
            return
        L5f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1278hm.y(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void z(View view, MotionEvent motionEvent, View view2) {
        this.f14568n.v(view2, motionEvent);
    }
}
