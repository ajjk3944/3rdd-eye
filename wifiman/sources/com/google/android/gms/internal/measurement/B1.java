package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class B1 {

    /* renamed from: a, reason: collision with root package name */
    private final E f34937a;

    /* renamed from: b, reason: collision with root package name */
    final Z2 f34938b;

    /* renamed from: c, reason: collision with root package name */
    final Z2 f34939c;

    /* renamed from: d, reason: collision with root package name */
    private final P4 f34940d;

    public B1() {
        E e10 = new E();
        this.f34937a = e10;
        Z2 z22 = new Z2(null, e10);
        this.f34939c = z22;
        this.f34938b = z22.d();
        P4 p42 = new P4();
        this.f34940d = p42;
        z22.h("require", new I7(p42));
        p42.b("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.e1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new H7();
            }
        });
        z22.h("runtime.counter", new C4386k(Double.valueOf(0.0d)));
    }

    public final InterfaceC4449s a(Z2 z22, N2... n2Arr) {
        InterfaceC4449s interfaceC4449sA = InterfaceC4449s.f35450e0;
        for (N2 n22 : n2Arr) {
            interfaceC4449sA = W3.a(n22);
            AbstractC4354g2.b(this.f34939c);
            if ((interfaceC4449sA instanceof C4473v) || (interfaceC4449sA instanceof C4457t)) {
                interfaceC4449sA = this.f34937a.a(z22, interfaceC4449sA);
            }
        }
        return interfaceC4449sA;
    }

    public final void b(String str, Callable callable) {
        this.f34940d.b(str, callable);
    }
}
