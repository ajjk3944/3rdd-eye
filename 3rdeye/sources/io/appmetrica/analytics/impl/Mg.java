package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class Mg implements Nl, Za {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39866a;

    /* renamed from: b, reason: collision with root package name */
    public final C4759l5 f39867b;

    /* renamed from: c, reason: collision with root package name */
    public final C4785m5 f39868c;

    /* renamed from: d, reason: collision with root package name */
    public final C5108ym f39869d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4688ib f39870e;

    public Mg(Context context, C4759l5 c4759l5, K4 k42, InterfaceC4966t5 interfaceC4966t5, C4785m5 c4785m5, El el) {
        this.f39866a = context;
        this.f39867b = c4759l5;
        this.f39868c = c4785m5;
        C5108ym c5108ymA = el.a(context, c4759l5, k42.f39708a);
        this.f39869d = c5108ymA;
        this.f39870e = interfaceC4966t5.a(context, c4759l5, k42.f39709b, c5108ymA);
        el.a(c4759l5, this);
    }

    public final C4759l5 a() {
        return this.f39867b;
    }

    public final Context b() {
        return this.f39866a;
    }

    public final void a(A4 a42) {
        this.f39868c.f41239a.add(a42);
    }

    public final void b(A4 a42) {
        this.f39868c.f41239a.remove(a42);
    }

    @Override // io.appmetrica.analytics.impl.Nl
    public final void a(C4544cm c4544cm) {
        this.f39870e.a(c4544cm);
    }

    @Override // io.appmetrica.analytics.impl.Nl
    public final void a(Gl gl, C4544cm c4544cm) {
        ((C4940s5) this.f39870e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final void a(K4 k42) {
        this.f39869d.a(k42.f39708a);
        this.f39870e.a(k42.f39709b);
    }

    public Mg(Context context, C4759l5 c4759l5, K4 k42, InterfaceC4966t5 interfaceC4966t5) {
        this(context, c4759l5, k42, interfaceC4966t5, new C4785m5(), El.a());
    }

    public final void a(C4683i6 c4683i6, K4 k42) {
        if (!O9.f39925c.contains(EnumC4997ub.a(c4683i6.f41047d))) {
            this.f39870e.a(k42.f39709b);
        }
        ((C4940s5) this.f39870e).a(c4683i6);
    }
}
