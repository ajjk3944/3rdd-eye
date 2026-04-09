package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pr2 extends el2 {
    public static final sn3 J;
    public boolean A;
    public final nc2 B;
    public final vs1 C;
    public final e51 D;
    public final Context E;
    public final rr2 F;
    public final t23 G;
    public final HashMap H;
    public final ArrayList I;
    public final Executor l;
    public final tr2 m;
    public final wr2 n;
    public final ds2 o;
    public final vr2 p;
    public final yr2 q;
    public final z94 r;
    public final z94 s;
    public final z94 t;
    public final z94 u;
    public final z94 v;
    public hv1 w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        vm3 vm3Var = xm3.g;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        wl2.G(objArr, 6);
        J = xm3.o(objArr, 6);
    }

    public pr2(ko1 ko1Var, Executor executor, tr2 tr2Var, wr2 wr2Var, ds2 ds2Var, vr2 vr2Var, yr2 yr2Var, z94 z94Var, z94 z94Var2, z94 z94Var3, z94 z94Var4, z94 z94Var5, nc2 nc2Var, vs1 vs1Var, e51 e51Var, Context context, rr2 rr2Var, t23 t23Var) {
        super(ko1Var);
        this.l = executor;
        this.m = tr2Var;
        this.n = wr2Var;
        this.o = ds2Var;
        this.p = vr2Var;
        this.q = yr2Var;
        this.r = z94Var;
        this.s = z94Var2;
        this.t = z94Var3;
        this.u = z94Var4;
        this.v = z94Var5;
        this.B = nc2Var;
        this.C = vs1Var;
        this.D = e51Var;
        this.E = context;
        this.F = rr2Var;
        this.G = t23Var;
        this.H = new HashMap();
        this.I = new ArrayList();
    }

    public static boolean d(View view) {
        iz1 iz1Var = mz1.sb;
        tw1 tw1Var = tw1.e;
        if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        lf4 lf4Var = hg4.C.c;
        long jA = lf4.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return jA >= ((long) ((Integer) tw1Var.c.a(mz1.tb)).intValue());
        }
        return false;
    }

    @Override // defpackage.el2
    public final void a() {
        nr2 nr2Var = new nr2(this, 1);
        Executor executor = this.l;
        executor.execute(nr2Var);
        if (this.m.q() != 7) {
            wr2 wr2Var = this.n;
            Objects.requireNonNull(wr2Var);
            executor.execute(new fu1(29, wr2Var));
        }
        super.a();
    }

    public final synchronized void c(View view, int i) {
        if (((Boolean) tw1.e.c.a(mz1.oc)).booleanValue()) {
            hv1 hv1Var = this.w;
            if (hv1Var == null) {
                gi2.U("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                this.l.execute(new ib(this, view, hv1Var instanceof as2, i));
            }
        }
    }

    public final xz2 e(String str, boolean z) {
        boolean z2;
        boolean z3;
        String str2;
        xz2 xz2Var;
        vr2 vr2Var = this.p;
        if (!vr2Var.c() || TextUtils.isEmpty(str)) {
            return null;
        }
        tr2 tr2Var = this.m;
        ag2 ag2VarJ = tr2Var.j();
        ag2 ag2VarH = tr2Var.h();
        if (ag2VarJ == null && ag2VarH == null) {
            gi2.i0("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        vr2Var.f();
        int iA = vr2Var.f().A();
        int i = iA - 1;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                String str3 = iA != 1 ? iA != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                StringBuilder sb = new StringBuilder(str3.length() + 49);
                sb.append("Unknown omid media type: ");
                sb.append(str3);
                sb.append(". Not initializing Omid.");
                gi2.i0(sb.toString());
                return null;
            }
            if (ag2VarJ == null) {
                gi2.i0("Omid media type was display but there was no display webview.");
                return null;
            }
            z3 = false;
            z2 = true;
        } else {
            if (ag2VarH == null) {
                gi2.i0("Omid media type was video but there was no video webview.");
                return null;
            }
            z2 = false;
            z3 = true;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            ag2VarJ = ag2VarH;
        }
        if (ag2VarJ == null) {
            gi2.i0("Webview is null in InternalNativeAd");
            return null;
        }
        Context context = this.E;
        hg4 hg4Var = hg4.C;
        hg4Var.x.getClass();
        if (!su2.d(context)) {
            gi2.i0("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        e51 e51Var = this.D;
        int i3 = e51Var.g;
        int i4 = e51Var.h;
        StringBuilder sb2 = new StringBuilder(ga1.f(i3, 1) + String.valueOf(i4).length());
        sb2.append(i3);
        sb2.append(".");
        sb2.append(i4);
        String string = sb2.toString();
        if (!z3) {
            i = 2;
            i2 = tr2Var.q() == 3 ? 4 : 3;
        }
        su2 su2Var = hg4Var.x;
        WebView webViewT = ag2VarJ.t();
        String str4 = this.b.l0;
        su2Var.getClass();
        if (((Boolean) tw1.e.c.a(mz1.G5)).booleanValue() && m54.f.g) {
            vh2 vh2Var = new vh2();
            vh2Var.f = str;
            vh2Var.g = string;
            vh2Var.h = str2;
            vh2Var.i = i;
            vh2Var.k = webViewT;
            vh2Var.l = str4;
            vh2Var.j = i2;
            xz2Var = (xz2) su2.r(vh2Var);
        } else {
            xz2Var = null;
        }
        if (xz2Var == null) {
            gi2.i0("Failed to create omid session in InternalNativeAd");
            return null;
        }
        synchronized (tr2Var) {
            tr2Var.l = xz2Var;
        }
        ag2VarJ.m0(xz2Var);
        if (z3) {
            xb3 xb3Var = xz2Var.a;
            if (ag2VarH != null) {
                View viewP0 = ag2VarH.p0();
                hg4Var.x.getClass();
                su2.k(xb3Var, viewP0);
            }
            this.A = true;
        }
        if (z) {
            su2 su2Var2 = hg4Var.x;
            xb3 xb3Var2 = xz2Var.a;
            su2Var2.getClass();
            su2.j(xb3Var2);
            ag2VarJ.a("onSdkLoaded", new s8(0));
        }
        return xz2Var;
    }

    public final void f(View view) {
        pd2 pd2Var;
        tr2 tr2Var = this.m;
        if (!((Boolean) tw1.e.c.a(mz1.N5)).booleanValue() || tr2Var.q() == 3) {
            m(view, tr2Var.k());
            return;
        }
        synchronized (tr2Var) {
            pd2Var = tr2Var.n;
        }
        if (pd2Var == null) {
            return;
        }
        mr2 mr2Var = new mr2(this, view, 0);
        pd2Var.c(new jq3(pd2Var, mr2Var, 0), this.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [hv1, rs2] */
    public final synchronized void g(rs2 rs2Var) {
        Iterator<String> itKeys;
        View view;
        rs1 rs1Var;
        try {
            if (!this.x) {
                this.w = (hv1) rs2Var;
                ds2 ds2Var = this.o;
                ds2Var.g.execute(new n62(ds2Var, rs2Var));
                this.n.a(rs2Var.X0(), rs2Var.k(), rs2Var.i(), rs2Var, rs2Var);
                iz1 iz1Var = mz1.Q2;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && (rs1Var = this.C.b) != null) {
                    rs1Var.e(rs2Var.X0());
                }
                if (((Boolean) tw1Var.c.a(mz1.S1)).booleanValue()) {
                    a83 a83Var = this.b;
                    if (a83Var.k0 && (itKeys = a83Var.j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ?? r2 = this.w;
                            WeakReference weakReference = r2 == 0 ? null : (WeakReference) r2.g().get(next);
                            this.H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                pv1 pv1Var = new pv1(this.E, view);
                                this.I.add(pv1Var);
                                pv1Var.q.add(new lr2(this, next));
                                pv1Var.d(3);
                            }
                        }
                    }
                }
                if (rs2Var.f() != null) {
                    pv1 pv1VarF = rs2Var.f();
                    pv1VarF.q.add(this.B);
                    pv1VarF.d(3);
                }
            }
        } finally {
        }
    }

    public final void h(rs2 rs2Var) {
        View viewX0 = rs2Var.X0();
        rs2Var.g();
        this.n.c(viewX0);
        if (rs2Var.M0() != null) {
            rs2Var.M0().setClickable(false);
            rs2Var.M0().removeAllViews();
        }
        if (rs2Var.f() != null) {
            pv1 pv1VarF = rs2Var.f();
            pv1VarF.q.remove(this.B);
        }
        this.w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hv1, rs2] */
    public final synchronized void i(View view, Map map, Map map2) {
        this.o.a(this.w);
        this.n.r(view, map, map2, k());
        this.y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[Catch: all -> 0x0075, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:14:0x0028, B:21:0x0031, B:23:0x0044, B:25:0x0054, B:27:0x005e, B:29:0x0068, B:34:0x0078, B:36:0x0088, B:38:0x008e, B:41:0x009b, B:43:0x00b0, B:45:0x00cd, B:47:0x00e9, B:18:0x002d, B:53:0x00f9, B:9:0x000b, B:11:0x0012, B:13:0x0022), top: B:56:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void j(android.view.View r9, java.util.Map r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr2.j(android.view.View, java.util.Map, java.util.Map):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hv1, rs2] */
    public final synchronized ImageView.ScaleType k() {
        ?? r0 = this.w;
        if (r0 == 0) {
            gi2.U("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        u10 u10VarP = r0.p();
        if (u10VarP != null) {
            return (ImageView.ScaleType) oi0.l1(u10VarP);
        }
        return ds2.k;
    }

    public final void l() {
        n70 n70Var;
        if (!((Boolean) tw1.e.c.a(mz1.N5)).booleanValue()) {
            e("Google", true);
            return;
        }
        tr2 tr2Var = this.m;
        synchronized (tr2Var) {
            n70Var = tr2Var.m;
        }
        if (n70Var == null) {
            return;
        }
        z71 z71Var = new z71(22, this);
        n70Var.c(new jq3(n70Var, z71Var, 0), this.l);
    }

    public final void m(View view, xz2 xz2Var) {
        ag2 ag2VarJ = this.m.j();
        if (!this.p.c() || xz2Var == null || ag2VarJ == null || view == null) {
            return;
        }
        su2 su2Var = hg4.C.x;
        xb3 xb3Var = xz2Var.a;
        su2Var.getClass();
        su2.k(xb3Var, view);
    }

    public final synchronized void o() {
        this.x = true;
        this.l.execute(new nr2(this, 0));
        fn2 fn2Var = this.c;
        fn2Var.getClass();
        fn2Var.P1(new z71(20, (Object) null));
    }

    public final synchronized boolean p(Bundle bundle) {
        if (this.y) {
            return true;
        }
        boolean zT = this.n.t(bundle);
        this.y = zT;
        return zT;
    }

    public final synchronized void q(rs2 rs2Var) {
        if (((Boolean) tw1.e.c.a(mz1.Q1)).booleanValue()) {
            lf4.l.post(new or2(this, rs2Var, 0));
        } else {
            g(rs2Var);
        }
    }

    public final synchronized void r(rs2 rs2Var) {
        if (((Boolean) tw1.e.c.a(mz1.Q1)).booleanValue()) {
            lf4.l.post(new or2(this, rs2Var, 1));
        } else {
            h(rs2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[Catch: all -> 0x0057, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:10:0x0012, B:12:0x001a, B:14:0x0026, B:15:0x0029, B:17:0x003b, B:20:0x0044, B:22:0x004a), top: B:33:0x0001, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [hv1, rs2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void s(android.view.View r8, android.view.View r9, java.util.Map r10, java.util.Map r11, boolean r12) {
        /*
            r7 = this;
            monitor-enter(r7)
            ds2 r0 = r7.o     // Catch: java.lang.Throwable -> L57
            hv1 r1 = r7.w     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L29
            ns2 r2 = r0.e     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L29
            android.widget.FrameLayout r3 = r1.M0()     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L12
            goto L29
        L12:
            vr2 r0 = r0.c     // Catch: java.lang.Throwable -> L57
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L29
            android.widget.FrameLayout r0 = r1.M0()     // Catch: defpackage.hg2 -> L26 java.lang.Throwable -> L57
            android.view.View r1 = r2.a()     // Catch: defpackage.hg2 -> L26 java.lang.Throwable -> L57
            r0.addView(r1)     // Catch: defpackage.hg2 -> L26 java.lang.Throwable -> L57
            goto L29
        L26:
            defpackage.gi2.R()     // Catch: java.lang.Throwable -> L57
        L29:
            android.widget.ImageView$ScaleType r6 = r7.k()     // Catch: java.lang.Throwable -> L57
            wr2 r0 = r7.n     // Catch: java.lang.Throwable -> L57
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.q(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L57
            boolean r8 = r7.A     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L5a
            tr2 r8 = r7.m     // Catch: java.lang.Throwable -> L57
            ag2 r9 = r8.h()     // Catch: java.lang.Throwable -> L57
            if (r9 != 0) goto L44
            goto L5a
        L44:
            ag2 r8 = r8.h()     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L5a
            s8 r9 = new s8     // Catch: java.lang.Throwable -> L57
            r10 = 0
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L57
            java.lang.String r10 = "onSdkAdUserInteractionClick"
            r8.a(r10, r9)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r7)
            return
        L57:
            r0 = move-exception
            r8 = r0
            goto L5c
        L5a:
            monitor-exit(r7)
            return
        L5c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr2.s(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void t(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.y     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.j(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            iz1 r0 = defpackage.mz1.S1     // Catch: java.lang.Throwable -> La
            tw1 r1 = defpackage.tw1.e     // Catch: java.lang.Throwable -> La
            kz1 r1 = r1.c     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            a83 r0 = r3.b     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.k0     // Catch: java.lang.Throwable -> La
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
            iz1 r7 = defpackage.mz1.l4     // Catch: java.lang.Throwable -> La
            tw1 r0 = defpackage.tw1.e     // Catch: java.lang.Throwable -> La
            kz1 r0 = r0.c     // Catch: java.lang.Throwable -> La
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
            boolean r0 = d(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            r3.i(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r3.i(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            r3.j(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr2.t(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }
}
