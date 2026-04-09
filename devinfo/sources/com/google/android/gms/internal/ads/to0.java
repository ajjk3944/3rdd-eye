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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class to0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16896a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f16897b;

    /* renamed from: c, reason: collision with root package name */
    public final k10 f16898c;

    /* renamed from: d, reason: collision with root package name */
    public final uk0 f16899d;

    /* renamed from: e, reason: collision with root package name */
    public final wk0 f16900e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f16901f;
    public xk g;

    /* renamed from: h, reason: collision with root package name */
    public final k70 f16902h;

    /* renamed from: i, reason: collision with root package name */
    public final cs0 f16903i;
    public final w70 j;

    /* renamed from: k, reason: collision with root package name */
    public final gq0 f16904k;

    /* renamed from: l, reason: collision with root package name */
    public pr0 f16905l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16906m;

    /* renamed from: n, reason: collision with root package name */
    public va.w1 f16907n;

    /* renamed from: o, reason: collision with root package name */
    public bl0 f16908o;

    public to0(Context context, Executor executor, va.c3 c3Var, k10 k10Var, uk0 uk0Var, wk0 wk0Var, gq0 gq0Var, w70 w70Var) {
        this.f16896a = context;
        this.f16897b = executor;
        this.f16898c = k10Var;
        this.f16899d = uk0Var;
        this.f16900e = wk0Var;
        this.f16904k = gq0Var;
        this.f16902h = new k70((ScheduledExecutorService) k10Var.f12928d.a(), (tb.a) k10Var.f12932f.a(), (qd0) k10Var.j.a());
        this.f16903i = k10Var.c();
        this.f16901f = new FrameLayout(context);
        this.j = w70Var;
        gq0Var.f11577b = c3Var;
        this.f16906m = true;
        this.f16907n = null;
        this.f16908o = null;
    }

    public final boolean a(va.z2 z2Var, String str, al0 al0Var, bl0 bl0Var) throws JSONException {
        p10 p10Var;
        int i4 = 0;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        Executor executor = this.f16897b;
        if (str == null) {
            za.i.e("Ad unit ID should not be null for banner ad.");
            executor.execute(new s30(22, this));
            return false;
        }
        boolean zB = b();
        gq0 gq0Var = this.f16904k;
        if (!zB) {
            pk pkVar = sk.Q2;
            va.s sVar = va.s.f36163e;
            rk rkVar = sVar.f36166c;
            rk rkVar2 = sVar.f36166c;
            if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
                va.r.a();
            }
            boolean zBooleanValue = ((Boolean) rkVar2.a(sk.f16155ha)).booleanValue();
            k10 k10Var = this.f16898c;
            if (zBooleanValue && z2Var.f36193f) {
                ((ff0) k10Var.f12970z.a()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(z2Var.f36211z));
            ua.j.C.f35267k.getClass();
            Bundle bundleC = ls.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            gq0Var.f11578c = str;
            gq0Var.f11576a = z2Var;
            gq0Var.f11593t = bundleC;
            hq0 hq0VarA = gq0Var.a();
            int iG = yr1.G(hq0VarA);
            Context context = this.f16896a;
            yr0 yr0VarD = d7.D(context, iG, 3, z2Var);
            boolean zBooleanValue2 = ((Boolean) am.f9360e.u()).booleanValue();
            uk0 uk0Var = this.f16899d;
            bs0 bs0Var = null;
            if (!zBooleanValue2 || !gq0Var.f11577b.f36046k) {
                boolean zBooleanValue3 = ((Boolean) rkVar2.a(sk.f16243n9)).booleanValue();
                int i10 = 10;
                FrameLayout frameLayout = this.f16901f;
                w70 w70Var = this.j;
                k70 k70Var = this.f16902h;
                if (zBooleanValue3) {
                    k10 k10Var2 = k10Var.f12924b;
                    y50 y50Var = new y50();
                    y50Var.f18642a = context;
                    y50Var.f18643b = hq0VarA;
                    y50 y50Var2 = new y50(y50Var);
                    d80 d80Var = new d80();
                    d80Var.d(uk0Var, executor);
                    d80Var.b(uk0Var, executor);
                    e80 e80Var = new e80(d80Var);
                    fk0 fk0Var = new fk0(i4, this.g);
                    l90 l90Var = new l90(b15 == true ? 1 : 0, ka0.f13090h, bs0Var);
                    ce1 ce1Var = new ce1(k70Var, b14 == true ? 1 : 0, w70Var, i10);
                    int i11 = 18;
                    p10Var = new p10(k10Var2, new fk0(i11, frameLayout), l90Var, new h80(i11), e80Var, y50Var2, new ne0(7), fk0Var, ce1Var, null, null);
                } else {
                    k10 k10Var3 = k10Var.f12924b;
                    y50 y50Var3 = new y50();
                    y50Var3.f18642a = context;
                    y50Var3.f18643b = hq0VarA;
                    y50 y50Var4 = new y50(y50Var3);
                    d80 d80Var2 = new d80();
                    HashSet hashSet = (HashSet) d80Var2.f10365c;
                    d80Var2.d(uk0Var, executor);
                    hashSet.add(new q80(uk0Var, executor));
                    hashSet.add(new q80(this.f16900e, executor));
                    d80Var2.c(uk0Var, executor);
                    ((HashSet) d80Var2.f10368f).add(new q80(uk0Var, executor));
                    ((HashSet) d80Var2.f10367e).add(new q80(uk0Var, executor));
                    ((HashSet) d80Var2.f10369h).add(new q80(uk0Var, executor));
                    d80Var2.a(uk0Var, executor);
                    d80Var2.b(uk0Var, executor);
                    ((HashSet) d80Var2.f10373m).add(new q80(uk0Var, executor));
                    e80 e80Var2 = new e80(d80Var2);
                    fk0 fk0Var2 = new fk0(b12 == true ? 1 : 0, this.g);
                    l90 l90Var2 = new l90(b11 == true ? 1 : 0, ka0.f13090h, bs0Var);
                    ce1 ce1Var2 = new ce1(k70Var, b10 == true ? 1 : 0, w70Var, 10);
                    int i12 = 18;
                    p10Var = new p10(k10Var3, new fk0(i12, frameLayout), l90Var2, new h80(i12), e80Var2, y50Var4, new ne0(7), fk0Var2, ce1Var2, null, null);
                }
                if (((Boolean) ol.f14724c.u()).booleanValue()) {
                    bs0Var = (bs0) p10Var.f14843l.a();
                    bs0Var.i(3);
                    bs0Var.c(z2Var.f36201p);
                    bs0Var.d(z2Var.f36198m);
                }
                this.f16908o = bl0Var;
                y40 y40Var = (y40) p10Var.f14850s.a();
                pr0 pr0VarC = y40Var.c(y40Var.b());
                this.f16905l = pr0VarC;
                pr0VarC.a(new q81(b13 == true ? 1 : 0, pr0VarC, new aw(this, bs0Var, yr0VarD, p10Var, 20)), executor);
                return true;
            }
            if (uk0Var != null) {
                uk0Var.o(yo0.A(7, null, null));
            }
        } else if (!gq0Var.f11589p) {
            this.f16906m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        pr0 pr0Var = this.f16905l;
        return (pr0Var == null || pr0Var.f15081c.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                pr0 pr0Var = this.f16905l;
                if (pr0Var != null && pr0Var.f15081c.isDone()) {
                    try {
                        u30 u30Var = (u30) this.f16905l.f15081c.get();
                        this.f16905l = null;
                        FrameLayout frameLayout = this.f16901f;
                        frameLayout.removeAllViews();
                        u30Var.getClass();
                        ViewParent parent = u30Var.f17043m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = u30Var.f14537f.f9997a;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 78);
                            sb2.append("Banner view provided from ");
                            sb2.append(str);
                            sb2.append(" already has a parent view. Removing its old parent.");
                            za.i.h(sb2.toString());
                            ((ViewGroup) parent).removeView(u30Var.f17043m);
                        }
                        pk pkVar = sk.f16243n9;
                        va.s sVar = va.s.f36163e;
                        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                            fk0 fk0Var = u30Var.g.f14913a;
                            uk0 uk0Var = this.f16899d;
                            p70 p70Var = (p70) fk0Var.f11194b;
                            p70Var.f14914b = uk0Var;
                            p70Var.f14915c = this.f16900e;
                        }
                        frameLayout.addView(u30Var.f17043m);
                        bl0 bl0Var = this.f16908o;
                        if (bl0Var != null) {
                            bl0Var.i(u30Var);
                        }
                        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                            Executor executor = this.f16897b;
                            uk0 uk0Var2 = this.f16899d;
                            Objects.requireNonNull(uk0Var2);
                            executor.execute(new s30(23, uk0Var2));
                        }
                        int i4 = ((yp0) u30Var.f14532a.f10544b.f9452c).f18822d;
                        if (i4 >= 0) {
                            this.f16906m = false;
                            k70 k70Var = this.f16902h;
                            k70Var.v1(i4);
                            k70Var.w1(u30Var.d());
                        } else {
                            this.f16906m = true;
                            this.f16902h.v1(u30Var.d());
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        f();
                        ya.a0.n("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f16906m = true;
                        this.f16902h.h();
                    } catch (ExecutionException e10) {
                        e = e10;
                        f();
                        ya.a0.n("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f16906m = true;
                        this.f16902h.h();
                    }
                } else if (this.f16905l != null) {
                    ya.a0.m("Show timer went off but there is an ongoing ad request.");
                    this.f16906m = true;
                } else {
                    ya.a0.m("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f16906m = true;
                    this.f16902h.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d() {
        Object parent = this.f16901f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        ya.f0 f0Var = ua.j.C.f35261c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return ya.f0.s(view, powerManager, keyguardManager);
    }

    public final void e() {
        int i4;
        w70 w70Var = this.j;
        k70 k70Var = this.f16902h;
        synchronized (w70Var) {
            i4 = w70Var.f17926b;
        }
        k70Var.w1(i4);
    }

    public final void f() {
        this.f16905l = null;
        va.w1 w1Var = this.f16907n;
        this.f16907n = null;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16243n9)).booleanValue() && w1Var != null) {
            this.f16897b.execute(new uh0(6, this, w1Var));
        }
        bl0 bl0Var = this.f16908o;
        if (bl0Var != null) {
            bl0Var.mo167b();
        }
    }
}
