package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j30 implements xg, r60, xa.l, p60 {

    /* renamed from: a, reason: collision with root package name */
    public final e30 f12607a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f12608b;

    /* renamed from: d, reason: collision with root package name */
    public final vq f12610d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f12611e;

    /* renamed from: f, reason: collision with root package name */
    public final tb.a f12612f;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f12609c = new HashSet();
    public final AtomicBoolean g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final i30 f12613h = new i30();

    /* renamed from: i, reason: collision with root package name */
    public boolean f12614i = false;
    public WeakReference j = new WeakReference(this);

    public j30(uq uqVar, f30 f30Var, Executor executor, e30 e30Var, tb.a aVar) {
        this.f12607a = e30Var;
        uqVar.a();
        this.f12610d = new vq(0, uqVar.f17290b);
        this.f12608b = f30Var;
        this.f12611e = executor;
        this.f12612f = aVar;
    }

    public final synchronized void B1() {
        try {
            if (this.j.get() == null) {
                a();
                return;
            }
            if (this.f12614i || !this.g.get()) {
                return;
            }
            try {
                i30 i30Var = this.f12613h;
                this.f12612f.getClass();
                i30Var.f12135c = SystemClock.elapsedRealtime();
                JSONObject jSONObjectH = this.f12608b.h(i30Var);
                Iterator it = this.f12609c.iterator();
                while (it.hasNext()) {
                    this.f12611e.execute(new h30(jSONObjectH, (qz) it.next()));
                }
                vq vqVar = this.f12610d;
                vqVar.getClass();
                sq sqVar = new sq(1, vqVar, jSONObjectH);
                vd.b bVar = vqVar.f17687b;
                ex exVar = fx.g;
                w71 w71VarF = yo0.F(bVar, sqVar, exVar);
                w71VarF.a(new q81(0, w71VarF, new m91("ActiveViewListener.callActiveViewJs", 6)), exVar);
            } catch (Exception e2) {
                ya.a0.n("Failed to call ActiveViewJS", e2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a() {
        b();
        this.f12614i = true;
    }

    public final void b() {
        Iterator it = this.f12609c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            e30 e30Var = this.f12607a;
            if (!zHasNext) {
                uq uqVar = e30Var.f10687b;
                d30 d30Var = e30Var.f10690e;
                vd.b bVar = uqVar.f17290b;
                tq tqVar = new tq(0, str2, d30Var);
                ex exVar = fx.g;
                x71 x71VarG = yo0.G(bVar, tqVar, exVar);
                uqVar.f17290b = x71VarG;
                uqVar.f17290b = yo0.G(x71VarG, new tq(0, str, e30Var.f10691f), exVar);
                return;
            }
            qz qzVar = (qz) it.next();
            qzVar.W0("/updateActiveView", e30Var.f10690e);
            qzVar.W0("/untrackActiveViewUnit", e30Var.f10691f);
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final synchronized void f(Context context) {
        this.f12613h.f12136d = "u";
        B1();
        b();
        this.f12614i = true;
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final synchronized void h(Context context) {
        this.f12613h.f12134b = true;
        B1();
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final synchronized void k(Context context) {
        this.f12613h.f12134b = false;
        B1();
    }

    @Override // xa.l
    public final synchronized void k2() {
        this.f12613h.f12134b = false;
        B1();
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final synchronized void n() {
        if (this.g.compareAndSet(false, true)) {
            e30 e30Var = this.f12607a;
            uq uqVar = e30Var.f10687b;
            d30 d30Var = e30Var.f10690e;
            uqVar.a();
            vd.b bVar = uqVar.f17290b;
            sq sqVar = new sq(0, "/updateActiveView", d30Var);
            ex exVar = fx.g;
            uqVar.f17290b = yo0.F(bVar, sqVar, exVar);
            d30 d30Var2 = e30Var.f10691f;
            uqVar.a();
            uqVar.f17290b = yo0.F(uqVar.f17290b, new sq(0, "/untrackActiveViewUnit", d30Var2), exVar);
            e30Var.f10689d = this;
            B1();
        }
    }

    @Override // xa.l
    public final synchronized void u1() {
        this.f12613h.f12134b = true;
        B1();
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final synchronized void w(wg wgVar) {
        i30 i30Var = this.f12613h;
        i30Var.f12133a = wgVar.j;
        i30Var.f12137e = wgVar;
        B1();
    }

    @Override // xa.l
    public final void D2() {
    }

    @Override // xa.l
    public final void T() {
    }

    @Override // xa.l
    public final void U0() {
    }

    @Override // xa.l
    public final void a2() {
    }

    @Override // xa.l
    public final void g1() {
    }

    @Override // xa.l
    public final void h3() {
    }

    @Override // xa.l
    public final void r0() {
    }

    @Override // xa.l
    public final void z1() {
    }

    @Override // xa.l
    public final void e0(int i4) {
    }
}
