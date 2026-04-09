package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ca0 extends o40 {
    public static final u51 J;
    public boolean A;
    public final bw B;
    public final oe C;
    public final za.a D;
    public final Context E;
    public final ea0 F;
    public final vk0 G;
    public final HashMap H;
    public final ArrayList I;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f10022l;

    /* renamed from: m, reason: collision with root package name */
    public final ga0 f10023m;

    /* renamed from: n, reason: collision with root package name */
    public final ja0 f10024n;

    /* renamed from: o, reason: collision with root package name */
    public final pa0 f10025o;

    /* renamed from: p, reason: collision with root package name */
    public final ia0 f10026p;

    /* renamed from: q, reason: collision with root package name */
    public final ka0 f10027q;

    /* renamed from: r, reason: collision with root package name */
    public final cs1 f10028r;

    /* renamed from: s, reason: collision with root package name */
    public final cs1 f10029s;

    /* renamed from: t, reason: collision with root package name */
    public final cs1 f10030t;

    /* renamed from: u, reason: collision with root package name */
    public final cs1 f10031u;

    /* renamed from: v, reason: collision with root package name */
    public final cs1 f10032v;

    /* renamed from: w, reason: collision with root package name */
    public mg f10033w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10034x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10035y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10036z;

    static {
        v41 v41Var = x41.f18307b;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        yo0.m(objArr, 6);
        J = x41.s(objArr, 6);
    }

    public ca0(c1.o oVar, Executor executor, ga0 ga0Var, ja0 ja0Var, pa0 pa0Var, ia0 ia0Var, ka0 ka0Var, cs1 cs1Var, cs1 cs1Var2, cs1 cs1Var3, cs1 cs1Var4, cs1 cs1Var5, bw bwVar, oe oeVar, za.a aVar, Context context, ea0 ea0Var, vk0 vk0Var) {
        super(oVar);
        this.f10022l = executor;
        this.f10023m = ga0Var;
        this.f10024n = ja0Var;
        this.f10025o = pa0Var;
        this.f10026p = ia0Var;
        this.f10027q = ka0Var;
        this.f10028r = cs1Var;
        this.f10029s = cs1Var2;
        this.f10030t = cs1Var3;
        this.f10031u = cs1Var4;
        this.f10032v = cs1Var5;
        this.B = bwVar;
        this.C = oeVar;
        this.D = aVar;
        this.E = context;
        this.F = ea0Var;
        this.G = vk0Var;
        this.H = new HashMap();
        this.I = new ArrayList();
    }

    public static boolean f(View view) {
        pk pkVar = sk.Rb;
        va.s sVar = va.s.f36163e;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        ya.f0 f0Var = ua.j.C.f35261c;
        long jA = ya.f0.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return jA >= ((long) ((Integer) sVar.f36166c.a(sk.Sb)).intValue());
        }
        return false;
    }

    public final synchronized JSONObject A(View view, Map map, Map map2) {
        return this.f10024n.c(view, map, map2, o());
    }

    public final synchronized JSONObject B(View view, Map map, Map map2) {
        return this.f10024n.m(view, map, map2, o());
    }

    public final synchronized void C(View view) {
        this.f10024n.b(view);
    }

    public final synchronized void D() {
        this.f10024n.l();
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final void a() {
        z90 z90Var = new z90(this, 1);
        Executor executor = this.f10022l;
        executor.execute(z90Var);
        if (this.f10023m.W() != 7) {
            ja0 ja0Var = this.f10024n;
            Objects.requireNonNull(ja0Var);
            executor.execute(new s30(6, ja0Var));
        }
        super.a();
    }

    public final synchronized void c(int i4, View view) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Nc)).booleanValue()) {
            mg mgVar = this.f10033w;
            if (mgVar == null) {
                za.i.c("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                this.f10022l.execute(new c7.m(this, view, mgVar instanceof na0, i4));
            }
        }
    }

    public final synchronized int d() {
        return this.f10024n.M1();
    }

    public final synchronized boolean e() {
        return this.f10024n.i();
    }

    public final xh0 g(String str, boolean z3) {
        boolean z10;
        boolean z11;
        String str2;
        int i4;
        int i10;
        ua.j jVar;
        xh0 xh0Var;
        ia0 ia0Var = this.f10026p;
        if (ia0Var.c() && !TextUtils.isEmpty(str)) {
            ga0 ga0Var = this.f10023m;
            qz qzVarT = ga0Var.t();
            qz qzVarR = ga0Var.r();
            if (qzVarT == null && qzVarR == null) {
                za.i.h("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            ia0Var.f();
            int iA = ia0Var.f().a();
            int i11 = iA - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    String str3 = iA != 1 ? iA != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    StringBuilder sb2 = new StringBuilder(str3.length() + 49);
                    sb2.append("Unknown omid media type: ");
                    sb2.append(str3);
                    sb2.append(". Not initializing Omid.");
                    za.i.h(sb2.toString());
                    return null;
                }
                if (qzVarT == null) {
                    za.i.h("Omid media type was display but there was no display webview.");
                    return null;
                }
                z11 = false;
                z10 = true;
            } else if (qzVarR != null) {
                z10 = false;
                z11 = true;
            } else {
                za.i.h("Omid media type was video but there was no video webview.");
            }
            if (z10) {
                str2 = null;
            } else {
                str2 = "javascript";
                qzVarT = qzVarR;
            }
            if (qzVarT == null) {
                za.i.h("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.E;
            ua.j jVar2 = ua.j.C;
            jVar2.f35280x.getClass();
            if (!h80.f(context)) {
                za.i.h("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            za.a aVar = this.D;
            int i12 = aVar.f38130b;
            int i13 = aVar.f38131c;
            StringBuilder sb3 = new StringBuilder(r5.c.e(i12, 1) + String.valueOf(i13).length());
            sb3.append(i12);
            sb3.append(".");
            sb3.append(i13);
            String string = sb3.toString();
            if (z11) {
                i10 = 3;
                i4 = 2;
            } else {
                i4 = ga0Var.W() == 3 ? 4 : 3;
                i10 = 2;
            }
            h80 h80Var = jVar2.f35280x;
            WebView webViewI = qzVarT.i();
            String str4 = this.f14533b.f18093l0;
            h80Var.getClass();
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16040a6)).booleanValue() && jz.f12903z.f15871b) {
                jVar = jVar2;
                xh0Var = (xh0) h80.r(new sh0(str, string, str2, i10, webViewI, str4, i4));
            } else {
                jVar = jVar2;
                xh0Var = null;
            }
            if (xh0Var == null) {
                za.i.h("Failed to create omid session in InternalNativeAd");
                return null;
            }
            synchronized (ga0Var) {
                ga0Var.f11422l = xh0Var;
            }
            qzVarT.d0(xh0Var);
            if (z11) {
                vt0 vt0Var = xh0Var.f18390a;
                if (qzVarR != null) {
                    View viewN = qzVarR.N();
                    jVar.f35280x.getClass();
                    h80.l(vt0Var, viewN);
                }
                this.A = true;
            }
            if (z3) {
                h80 h80Var2 = jVar.f35280x;
                vt0 vt0Var2 = xh0Var.f18390a;
                h80Var2.getClass();
                h80.j(vt0Var2);
                qzVarT.a("onSdkLoaded", new x.e(0));
            }
            return xh0Var;
        }
        return null;
    }

    public final void h(View view) {
        gx gxVar;
        ga0 ga0Var = this.f10023m;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16153h6)).booleanValue() || ga0Var.W() == 3) {
            q(view, ga0Var.w());
            return;
        }
        synchronized (ga0Var) {
            gxVar = ga0Var.f11424n;
        }
        if (gxVar == null) {
            return;
        }
        ce1 ce1Var = new ce1(11, this, view);
        gxVar.a(new q81(0, gxVar, ce1Var), this.f10022l);
    }

    public final synchronized void i(String str) {
        this.f10024n.q(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    public final synchronized void j(bb0 bb0Var) {
        Iterator<String> itKeys;
        View view;
        me meVar;
        try {
            if (!this.f10034x) {
                this.f10033w = (mg) bb0Var;
                pa0 pa0Var = this.f10025o;
                pa0Var.g.execute(new q81(pa0Var, bb0Var));
                this.f10024n.a(bb0Var.f2(), bb0Var.D1(), bb0Var.B1(), bb0Var, bb0Var);
                pk pkVar = sk.f16150h3;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && (meVar = this.C.f14684b) != null) {
                    meVar.g(bb0Var.f2());
                }
                if (((Boolean) sVar.f36166c.a(sk.f16149h2)).booleanValue()) {
                    wp0 wp0Var = this.f14533b;
                    if (wp0Var.f18091k0 && (itKeys = wp0Var.f18089j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ?? r22 = this.f10033w;
                            WeakReference weakReference = r22 == 0 ? null : (WeakReference) r22.A1().get(next);
                            this.H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                yg ygVar = new yg(this.E, view);
                                this.I.add(ygVar);
                                ygVar.f18745l.add(new y90(this, next));
                                ygVar.d(3);
                            }
                        }
                    }
                }
                if (bb0Var.z1() != null) {
                    yg ygVarZ1 = bb0Var.z1();
                    ygVarZ1.f18745l.add(this.B);
                    ygVarZ1.d(3);
                }
            }
        } finally {
        }
    }

    public final void k(bb0 bb0Var) {
        View viewF2 = bb0Var.f2();
        bb0Var.A1();
        this.f10024n.j(viewF2);
        if (bb0Var.O3() != null) {
            bb0Var.O3().setClickable(false);
            bb0Var.O3().removeAllViews();
        }
        if (bb0Var.z1() != null) {
            yg ygVarZ1 = bb0Var.z1();
            ygVarZ1.f18745l.remove(this.B);
        }
        this.f10033w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    public final synchronized void l(View view, Map map, Map map2) {
        this.f10025o.a(this.f10033w);
        this.f10024n.t(view, map, map2, o());
        this.f10035y = true;
    }

    public final synchronized void m(View view, Map map, Map map2) {
        View viewN;
        if (!this.f10036z && (viewN = n(map)) != null) {
            pk pkVar = sk.Se;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                Rect rect = new Rect();
                if (viewN.getGlobalVisibleRect(rect, new Point()) && viewN.getHeight() == rect.height() && viewN.getWidth() == rect.width()) {
                    this.f10024n.s(view, map, map2, o());
                    this.f10036z = true;
                }
            } else if (!((Boolean) sVar.f36166c.a(sk.Te)).booleanValue()) {
                pk pkVar2 = sk.Ue;
                if (((Float) sVar.f36166c.a(pkVar2)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) sVar.f36166c.a(pkVar2)).floatValue();
                    if (viewN.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r4.height() * r4.width() >= viewN.getHeight() * viewN.getWidth() * (dFloatValue / 100.0d)) {
                            this.f10024n.s(view, map, map2, o());
                            this.f10036z = true;
                        }
                    }
                }
            } else if (f(viewN)) {
                this.f10024n.s(view, map, map2, o());
                this.f10036z = true;
            }
        }
    }

    public final synchronized View n(Map map) {
        if (map != null) {
            u51 u51Var = J;
            int i4 = u51Var.f17098d;
            int i10 = 0;
            while (i10 < i4) {
                WeakReference weakReference = (WeakReference) map.get((String) u51Var.get(i10));
                i10++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    public final synchronized ImageView.ScaleType o() {
        ?? r02 = this.f10033w;
        if (r02 == 0) {
            za.i.c("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        vb.a aVarH1 = r02.H1();
        if (aVarH1 != null) {
            return (ImageView.ScaleType) vb.b.U0(aVarH1);
        }
        return pa0.f14942k;
    }

    public final void p() {
        vd.b bVar;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16153h6)).booleanValue()) {
            g("Google", true);
            return;
        }
        ga0 ga0Var = this.f10023m;
        synchronized (ga0Var) {
            bVar = ga0Var.f11423m;
        }
        if (bVar == null) {
            return;
        }
        ix0 ix0Var = new ix0(22, this);
        bVar.a(new q81(0, bVar, ix0Var), this.f10022l);
    }

    public final void q(View view, xh0 xh0Var) {
        qz qzVarT = this.f10023m.t();
        if (!this.f10026p.c() || xh0Var == null || qzVarT == null || view == null) {
            return;
        }
        h80 h80Var = ua.j.C.f35280x;
        vt0 vt0Var = xh0Var.f18390a;
        h80Var.getClass();
        h80.l(vt0Var, view);
    }

    public final synchronized void r(Bundle bundle) {
        this.f10024n.d(bundle);
    }

    public final synchronized void s() {
        this.f10034x = true;
        this.f10022l.execute(new z90(this, 0));
        s60 s60Var = this.f14534c;
        s60Var.getClass();
        s60Var.p1(new nk(null, 2));
    }

    public final synchronized boolean t(Bundle bundle) {
        if (this.f10035y) {
            return true;
        }
        boolean zV = this.f10024n.v(bundle);
        this.f10035y = zV;
        return zV;
    }

    public final synchronized void u(Bundle bundle) {
        this.f10024n.o(bundle);
    }

    public final synchronized void v(bb0 bb0Var) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16118f2)).booleanValue()) {
            ya.f0.f37440l.post(new aa0(this, bb0Var, 0));
        } else {
            j(bb0Var);
        }
    }

    public final synchronized void w(bb0 bb0Var) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16118f2)).booleanValue()) {
            ya.f0.f37440l.post(new aa0(this, bb0Var, 1));
        } else {
            k(bb0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x005a, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:10:0x0012, B:12:0x001a, B:15:0x0027, B:16:0x002c, B:18:0x003e, B:21:0x0047, B:23:0x004d), top: B:34:0x0001, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void x(android.view.View r8, android.view.View r9, java.util.Map r10, java.util.Map r11, boolean r12) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.pa0 r0 = r7.f10025o     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.ads.mg r1 = r7.f10033w     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.ads.wa0 r2 = r0.f14947e     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L2c
            android.widget.FrameLayout r3 = r1.O3()     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto L12
            goto L2c
        L12:
            com.google.android.gms.internal.ads.ia0 r0 = r0.f14945c     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L2c
            android.widget.FrameLayout r0 = r1.O3()     // Catch: com.google.android.gms.internal.ads.zz -> L26 java.lang.Throwable -> L5a
            android.view.View r1 = r2.a()     // Catch: com.google.android.gms.internal.ads.zz -> L26 java.lang.Throwable -> L5a
            r0.addView(r1)     // Catch: com.google.android.gms.internal.ads.zz -> L26 java.lang.Throwable -> L5a
            goto L2c
        L26:
            r0 = move-exception
            java.lang.String r1 = "web view can not be obtained"
            ya.a0.n(r1, r0)     // Catch: java.lang.Throwable -> L5a
        L2c:
            android.widget.ImageView$ScaleType r6 = r7.o()     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.ads.ja0 r0 = r7.f10024n     // Catch: java.lang.Throwable -> L5a
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.g(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5a
            boolean r8 = r7.A     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L5d
            com.google.android.gms.internal.ads.ga0 r8 = r7.f10023m     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.internal.ads.qz r9 = r8.r()     // Catch: java.lang.Throwable -> L5a
            if (r9 != 0) goto L47
            goto L5d
        L47:
            com.google.android.gms.internal.ads.qz r8 = r8.r()     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L5d
            x.e r9 = new x.e     // Catch: java.lang.Throwable -> L5a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ca0.x(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void y(View view, MotionEvent motionEvent, View view2) {
        this.f10024n.w(view2, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void z(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f10035y     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.m(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16149h2     // Catch: java.lang.Throwable -> La
            va.s r1 = va.s.f36163e     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.rk r1 = r1.f36166c     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.wp0 r0 = r3.f14533b     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.f18091k0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            java.util.HashMap r0 = r3.H     // Catch: java.lang.Throwable -> La
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
            com.google.android.gms.internal.ads.pk r7 = com.google.android.gms.internal.ads.sk.C4     // Catch: java.lang.Throwable -> La
            va.s r0 = va.s.f36163e     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.rk r0 = r0.f36166c     // Catch: java.lang.Throwable -> La
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ca0.z(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }
}
