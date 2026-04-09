package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import q2.C2841s;
import q2.C2852x0;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.pt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1715pt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16236a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f16237b;

    /* renamed from: c, reason: collision with root package name */
    public final C0710Rh f16238c;

    /* renamed from: d, reason: collision with root package name */
    public final C2090wr f16239d;

    /* renamed from: e, reason: collision with root package name */
    public final C2198yr f16240e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f16241f;

    /* renamed from: g, reason: collision with root package name */
    public N9 f16242g;

    /* renamed from: h, reason: collision with root package name */
    public final C0679Pk f16243h;
    public final Yu i;

    /* renamed from: j, reason: collision with root package name */
    public final C0896al f16244j;

    /* renamed from: k, reason: collision with root package name */
    public final C0905au f16245k;

    /* renamed from: l, reason: collision with root package name */
    public Ju f16246l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16247m;

    /* renamed from: n, reason: collision with root package name */
    public C2852x0 f16248n;

    /* renamed from: o, reason: collision with root package name */
    public Dr f16249o;

    public C1715pt(Context context, Executor executor, q2.d1 d1Var, C0710Rh c0710Rh, C2090wr c2090wr, C2198yr c2198yr, C0905au c0905au, C0896al c0896al) {
        this.f16236a = context;
        this.f16237b = executor;
        this.f16238c = c0710Rh;
        this.f16239d = c2090wr;
        this.f16240e = c2198yr;
        this.f16245k = c0905au;
        this.f16243h = new C0679Pk((ScheduledExecutorService) c0710Rh.f10989d.c(), (Q2.a) c0710Rh.f10993f.c(), (C0784Vn) c0710Rh.f11000j.c());
        this.i = c0710Rh.c();
        this.f16241f = new FrameLayout(context);
        this.f16244j = c0896al;
        c0905au.f13242b = d1Var;
        this.f16247m = true;
        this.f16248n = null;
        this.f16249o = null;
    }

    public final boolean a(q2.a1 a1Var, String str, Cr cr, Dr dr) throws JSONException {
        C0795Wh c0795Wh;
        int i = 23;
        int i3 = 0;
        Executor executor = this.f16237b;
        if (str == null) {
            u2.k.e("Ad unit ID should not be null for banner ad.");
            executor.execute(new RunnableC0558Ii(i, this));
            return false;
        }
        boolean zB = b();
        C0905au c0905au = this.f16245k;
        if (!zB) {
            E9 e9 = H9.f8656Q2;
            C2841s c2841s = C2841s.f23267e;
            G9 g9 = c2841s.f23270c;
            G9 g92 = c2841s.f23270c;
            if (((Boolean) g9.a(e9)).booleanValue()) {
                q2.r.a();
            }
            boolean zBooleanValue = ((Boolean) g92.a(H9.fa)).booleanValue();
            C0710Rh c0710Rh = this.f16238c;
            if (zBooleanValue && a1Var.f23170f) {
                ((C0581Jo) c0710Rh.f11031z.c()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(a1Var.f23162N));
            p2.j.f22785C.f22797k.getClass();
            Bundle bundleC = AbstractC0709Rg.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            c0905au.f13243c = str;
            c0905au.f13241a = a1Var;
            c0905au.f13259t = bundleC;
            C0960bu c0960buA = c0905au.a();
            int iH = C1476lN.H(c0960buA);
            Context context = this.f16236a;
            Su suZ = AbstractC1135f5.z(context, iH, 3, a1Var);
            boolean zBooleanValue2 = ((Boolean) AbstractC1696pa.f16175e.v()).booleanValue();
            C2090wr c2090wr = this.f16239d;
            Xu xu = null;
            if (!zBooleanValue2 || !c0905au.f13242b.f23197k) {
                boolean zBooleanValue3 = ((Boolean) g92.a(H9.l9)).booleanValue();
                int i6 = 16;
                FrameLayout frameLayout = this.f16241f;
                C0896al c0896al = this.f16244j;
                C0679Pk c0679Pk = this.f16243h;
                if (zBooleanValue3) {
                    C0710Rh c0710Rh2 = c0710Rh.f10986b;
                    C0895ak c0895ak = new C0895ak();
                    c0895ak.f13213a = context;
                    c0895ak.f13214b = c0960buA;
                    C0895ak c0895ak2 = new C0895ak(c0895ak);
                    K4.e eVar = new K4.e();
                    eVar.d(c2090wr, executor);
                    eVar.b(c2090wr, executor);
                    C1277hl c1277hl = new C1277hl(eVar);
                    C1283hr c1283hr = new C1283hr(i3, this.f16242g);
                    c0795Wh = new C0795Wh(c0710Rh2, new L6(13, frameLayout), new C0697Ql(C1708pm.f16215h, i3, xu), new C1437kl(19), c1277hl, c0895ak2, new Nx(23), c1283hr, new C0889ae(c0679Pk, i6, c0896al), null, null);
                } else {
                    C0710Rh c0710Rh3 = c0710Rh.f10986b;
                    C0895ak c0895ak3 = new C0895ak();
                    c0895ak3.f13213a = context;
                    c0895ak3.f13214b = c0960buA;
                    C0895ak c0895ak4 = new C0895ak(c0895ak3);
                    K4.e eVar2 = new K4.e();
                    HashSet hashSet = (HashSet) eVar2.f2239c;
                    eVar2.d(c2090wr, executor);
                    hashSet.add(new C1922tl(c2090wr, executor));
                    hashSet.add(new C1922tl(this.f16240e, executor));
                    eVar2.c(c2090wr, executor);
                    ((HashSet) eVar2.f2242f).add(new C1922tl(c2090wr, executor));
                    ((HashSet) eVar2.f2241e).add(new C1922tl(c2090wr, executor));
                    ((HashSet) eVar2.f2244h).add(new C1922tl(c2090wr, executor));
                    eVar2.a(c2090wr, executor);
                    eVar2.b(c2090wr, executor);
                    ((HashSet) eVar2.f2248m).add(new C1922tl(c2090wr, executor));
                    C1277hl c1277hl2 = new C1277hl(eVar2);
                    C1283hr c1283hr2 = new C1283hr(i3, this.f16242g);
                    c0795Wh = new C0795Wh(c0710Rh3, new L6(13, frameLayout), new C0697Ql(C1708pm.f16215h, i3, xu), new C1437kl(19), c1277hl2, c0895ak4, new Nx(23), c1283hr2, new C0889ae(c0679Pk, 16, c0896al), null, null);
                }
                if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
                    xu = (Xu) c0795Wh.f12290l.c();
                    xu.i(3);
                    xu.c(a1Var.f23153D);
                    xu.d(a1Var.f23176m);
                }
                this.f16249o = dr;
                C0440Bj c0440Bj = (C0440Bj) c0795Wh.f12297s.c();
                Ju juC = c0440Bj.c(c0440Bj.b());
                this.f16246l = juC;
                juC.a(new CD(juC, i3, new C1431kf(this, xu, suZ, c0795Wh, 20)), executor);
                return true;
            }
            if (c2090wr != null) {
                c2090wr.D(AbstractC1984ut.A(7, null, null));
            }
        } else if (!c0905au.f13255p) {
            this.f16247m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        Ju ju = this.f16246l;
        return (ju == null || ju.f9394c.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                Ju ju = this.f16246l;
                if (ju != null && ju.f9394c.isDone()) {
                    try {
                        C0830Yi c0830Yi = (C0830Yi) this.f16246l.f9394c.get();
                        this.f16246l = null;
                        FrameLayout frameLayout = this.f16241f;
                        frameLayout.removeAllViews();
                        c0830Yi.getClass();
                        ViewParent parent = c0830Yi.f12654m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = c0830Yi.f16605f.f14124a;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(str);
                            sb.append(" already has a parent view. Removing its old parent.");
                            u2.k.h(sb.toString());
                            ((ViewGroup) parent).removeView(c0830Yi.f12654m);
                        }
                        E9 e9 = H9.l9;
                        C2841s c2841s = C2841s.f23267e;
                        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                            Nx nx = c0830Yi.f16606g.f11770a;
                            C2090wr c2090wr = this.f16239d;
                            C0764Uk c0764Uk = (C0764Uk) nx.f10110b;
                            c0764Uk.f11771b = c2090wr;
                            c0764Uk.f11772c = this.f16240e;
                        }
                        frameLayout.addView(c0830Yi.f12654m);
                        Dr dr = this.f16249o;
                        if (dr != null) {
                            dr.v(c0830Yi);
                        }
                        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                            Executor executor = this.f16237b;
                            C2090wr c2090wr2 = this.f16239d;
                            Objects.requireNonNull(c2090wr2);
                            executor.execute(new RunnableC0558Ii(24, c2090wr2));
                        }
                        int i = ((St) c0830Yi.f16600a.f12510b.f15174c).f11271d;
                        if (i >= 0) {
                            this.f16247m = false;
                            C0679Pk c0679Pk = this.f16243h;
                            c0679Pk.H1(i);
                            c0679Pk.I1(c0830Yi.d());
                        } else {
                            this.f16247m = true;
                            this.f16243h.H1(c0830Yi.d());
                        }
                    } catch (InterruptedException e6) {
                        e = e6;
                        f();
                        AbstractC2907C.n("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f16247m = true;
                        this.f16243h.s();
                    } catch (ExecutionException e7) {
                        e = e7;
                        f();
                        AbstractC2907C.n("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f16247m = true;
                        this.f16243h.s();
                    }
                } else if (this.f16246l != null) {
                    AbstractC2907C.m("Show timer went off but there is an ongoing ad request.");
                    this.f16247m = true;
                } else {
                    AbstractC2907C.m("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f16247m = true;
                    this.f16243h.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        Object parent = this.f16241f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        C2911G c2911g = p2.j.f22785C.f22790c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return C2911G.s(view, powerManager, keyguardManager);
    }

    public final void e() {
        int i;
        C0896al c0896al = this.f16244j;
        C0679Pk c0679Pk = this.f16243h;
        synchronized (c0896al) {
            i = c0896al.f13221b;
        }
        c0679Pk.I1(i);
    }

    public final void f() {
        this.f16246l = null;
        C2852x0 c2852x0 = this.f16248n;
        this.f16248n = null;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.l9)).booleanValue() && c2852x0 != null) {
            this.f16237b.execute(new RunnableC0786Vp(this, 7, c2852x0));
        }
        Dr dr = this.f16249o;
        if (dr != null) {
            dr.mo6a();
        }
    }
}
