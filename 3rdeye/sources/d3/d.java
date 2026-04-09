package D3;

import E3.n;
import a9.InterfaceC1676a;
import java.util.concurrent.Executor;
import o2.C5410a;
import o2.C5411b;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes.dex */
public final class d implements A3.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1051b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1052c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1053d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1054e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1055f;

    public d(C5410a c5410a, C5411b c5411b, C5411b c5411b2, C5411b c5411b3, C5411b c5411b4) {
        this.f1051b = c5410a;
        this.f1052c = c5411b;
        this.f1053d = c5411b2;
        this.f1054e = c5411b3;
        this.f1055f = c5411b4;
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return new c((Executor) ((InterfaceC1676a) this.f1051b).get(), (z3.e) ((InterfaceC1676a) this.f1052c).get(), (n) ((f) this.f1055f).get(), (F3.d) ((InterfaceC1676a) this.f1053d).get(), (G3.b) ((InterfaceC1676a) this.f1054e).get());
    }

    public d(InterfaceC1676a interfaceC1676a, InterfaceC1676a interfaceC1676a2, f fVar, InterfaceC1676a interfaceC1676a3, InterfaceC1676a interfaceC1676a4) {
        this.f1051b = interfaceC1676a;
        this.f1052c = interfaceC1676a2;
        this.f1055f = fVar;
        this.f1053d = interfaceC1676a3;
        this.f1054e = interfaceC1676a4;
    }
}
