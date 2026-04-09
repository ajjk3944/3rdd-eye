package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import f4.InterfaceFutureC2326a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Ni, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643Ni implements M7, InterfaceC2029vk, s2.k, InterfaceC1921tk {

    /* renamed from: a, reason: collision with root package name */
    public final C0575Ji f10034a;

    /* renamed from: b, reason: collision with root package name */
    public final C0592Ki f10035b;

    /* renamed from: d, reason: collision with root package name */
    public final C0518Gc f10037d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10038e;

    /* renamed from: f, reason: collision with root package name */
    public final Q2.a f10039f;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f10036c = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f10040g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final C0626Mi f10041h = new C0626Mi();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public WeakReference f10042j = new WeakReference(this);

    public C0643Ni(C0501Fc c0501Fc, C0592Ki c0592Ki, Executor executor, C0575Ji c0575Ji, Q2.a aVar) {
        this.f10034a = c0575Ji;
        c0501Fc.a();
        this.f10037d = new C0518Gc(0, c0501Fc.f8142b);
        this.f10035b = c0592Ki;
        this.f10038e = executor;
        this.f10039f = aVar;
    }

    @Override // s2.k
    public final void I0() {
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final synchronized void K(L7 l7) {
        C0626Mi c0626Mi = this.f10041h;
        c0626Mi.f9885a = l7.f9629j;
        c0626Mi.f9889e = l7;
        i();
    }

    @Override // s2.k
    public final void K1() {
    }

    @Override // s2.k
    public final void N2() {
    }

    @Override // s2.k
    public final synchronized void R1() {
        this.f10041h.f9886b = false;
        i();
    }

    public final synchronized void a() {
        b();
        this.i = true;
    }

    public final void b() {
        Iterator it = this.f10036c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            C0575Ji c0575Ji = this.f10034a;
            if (!zHasNext) {
                C0501Fc c0501Fc = c0575Ji.f9336b;
                C0541Hi c0541Hi = c0575Ji.f9339e;
                InterfaceFutureC2326a interfaceFutureC2326a = c0501Fc.f8142b;
                C0484Ec c0484Ec = new C0484Ec(str2, 0, c0541Hi);
                C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
                C1358jD c1358jDG = AbstractC1984ut.G(interfaceFutureC2326a, c0484Ec, c0623Mf);
                c0501Fc.f8142b = c1358jDG;
                c0501Fc.f8142b = AbstractC1984ut.G(c1358jDG, new C0484Ec(str, 0, c0575Ji.f9340f), c0623Mf);
                return;
            }
            InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) it.next();
            interfaceC0828Yg.j1("/updateActiveView", c0575Ji.f9339e);
            interfaceC0828Yg.j1("/untrackActiveViewUnit", c0575Ji.f9340f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final synchronized void c(Context context) {
        this.f10041h.f9886b = false;
        i();
    }

    @Override // s2.k
    public final void d1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final synchronized void f(Context context) {
        this.f10041h.f9888d = "u";
        i();
        b();
        this.i = true;
    }

    @Override // s2.k
    public final void g() {
    }

    @Override // s2.k
    public final void h0() {
    }

    public final synchronized void i() {
        try {
            if (this.f10042j.get() == null) {
                a();
                return;
            }
            if (this.i || !this.f10040g.get()) {
                return;
            }
            try {
                C0626Mi c0626Mi = this.f10041h;
                this.f10039f.getClass();
                c0626Mi.f9887c = SystemClock.elapsedRealtime();
                JSONObject jSONObjectD = this.f10035b.d(c0626Mi);
                Iterator it = this.f10036c.iterator();
                while (it.hasNext()) {
                    this.f10038e.execute(new RunnableC0609Li(jSONObjectD, (InterfaceC0828Yg) it.next()));
                }
                C0518Gc c0518Gc = this.f10037d;
                c0518Gc.getClass();
                C0467Dc c0467Dc = new C0467Dc(c0518Gc, 1, jSONObjectD);
                InterfaceFutureC2326a interfaceFutureC2326a = c0518Gc.f8393b;
                C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
                C1306iD c1306iDF = AbstractC1984ut.F(interfaceFutureC2326a, c0467Dc, c0623Mf);
                c1306iDF.a(new CD(c1306iDF, 0, new C1952uE("ActiveViewListener.callActiveViewJs", 4)), c0623Mf);
            } catch (Exception e6) {
                AbstractC2907C.n("Failed to call ActiveViewJS", e6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.k
    public final void j2() {
    }

    @Override // s2.k
    public final void k0(int i) {
    }

    @Override // s2.k
    public final void n1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final synchronized void u(Context context) {
        this.f10041h.f9886b = true;
        i();
    }

    @Override // s2.k
    public final synchronized void x1() {
        this.f10041h.f9886b = true;
        i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final synchronized void z() {
        if (this.f10040g.compareAndSet(false, true)) {
            C0575Ji c0575Ji = this.f10034a;
            C0501Fc c0501Fc = c0575Ji.f9336b;
            C0541Hi c0541Hi = c0575Ji.f9339e;
            c0501Fc.a();
            InterfaceFutureC2326a interfaceFutureC2326a = c0501Fc.f8142b;
            C0467Dc c0467Dc = new C0467Dc("/updateActiveView", 0, c0541Hi);
            C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
            c0501Fc.f8142b = AbstractC1984ut.F(interfaceFutureC2326a, c0467Dc, c0623Mf);
            C0541Hi c0541Hi2 = c0575Ji.f9340f;
            c0501Fc.a();
            c0501Fc.f8142b = AbstractC1984ut.F(c0501Fc.f8142b, new C0467Dc("/untrackActiveViewUnit", 0, c0541Hi2), c0623Mf);
            c0575Ji.f9338d = this;
            i();
        }
    }
}
