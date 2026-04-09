package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public class Ag {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4636gb f39109a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5027vg f39110b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4584eb f39111c;

    public Ag(InterfaceC4636gb interfaceC4636gb, InterfaceC5027vg interfaceC5027vg, InterfaceC4584eb interfaceC4584eb) {
        this.f39109a = interfaceC4636gb;
        this.f39110b = interfaceC5027vg;
        this.f39111c = interfaceC4584eb;
    }

    public final void a(C5102yg c5102yg) {
        if (this.f39109a.a(c5102yg)) {
            this.f39110b.a(c5102yg);
            this.f39111c.a();
        }
    }

    public final InterfaceC5027vg b() {
        return this.f39110b;
    }

    public final InterfaceC4584eb c() {
        return this.f39111c;
    }

    public final InterfaceC4636gb a() {
        return this.f39109a;
    }
}
