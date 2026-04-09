package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final B1 f34953a;

    /* renamed from: b, reason: collision with root package name */
    private Z2 f34954b;

    /* renamed from: c, reason: collision with root package name */
    private C4324d f34955c;

    /* renamed from: d, reason: collision with root package name */
    private final C4306b f34956d;

    public C() {
        this(new B1());
    }

    public static /* synthetic */ AbstractC4410n b(C c10) {
        return new C4470u4(c10.f34955c);
    }

    public static /* synthetic */ AbstractC4410n f(C c10) {
        return new F7(c10.f34956d);
    }

    public final C4324d a() {
        return this.f34955c;
    }

    public final void c(M2 m22) throws zzc {
        AbstractC4410n abstractC4410n;
        try {
            this.f34954b = this.f34953a.f34938b.d();
            if (this.f34953a.a(this.f34954b, (N2[]) m22.H().toArray(new N2[0])) instanceof C4394l) {
                throw new IllegalStateException("Program loading failed");
            }
            for (L2 l22 : m22.F().H()) {
                List listH = l22.H();
                String strG = l22.G();
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    InterfaceC4449s interfaceC4449sA = this.f34953a.a(this.f34954b, (N2) it.next());
                    if (!(interfaceC4449sA instanceof r)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    Z2 z22 = this.f34954b;
                    if (z22.g(strG)) {
                        InterfaceC4449s interfaceC4449sC = z22.c(strG);
                        if (!(interfaceC4449sC instanceof AbstractC4410n)) {
                            throw new IllegalStateException("Invalid function name: " + strG);
                        }
                        abstractC4410n = (AbstractC4410n) interfaceC4449sC;
                    } else {
                        abstractC4410n = null;
                    }
                    if (abstractC4410n == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strG);
                    }
                    abstractC4410n.a(this.f34954b, Collections.singletonList(interfaceC4449sA));
                }
            }
        } catch (Throwable th2) {
            throw new zzc(th2);
        }
    }

    public final void d(String str, Callable callable) {
        this.f34953a.b(str, callable);
    }

    public final boolean e(C4333e c4333e) {
        try {
            this.f34955c.b(c4333e);
            this.f34953a.f34939c.h("runtime.counter", new C4386k(Double.valueOf(0.0d)));
            this.f34956d.b(this.f34954b.d(), this.f34955c);
            if (h()) {
                return true;
            }
            return g();
        } catch (Throwable th2) {
            throw new zzc(th2);
        }
    }

    public final boolean g() {
        return !this.f34955c.f().isEmpty();
    }

    public final boolean h() {
        return !this.f34955c.d().equals(this.f34955c.a());
    }

    private C(B1 b12) {
        this.f34953a = b12;
        this.f34954b = b12.f34938b.d();
        this.f34955c = new C4324d();
        this.f34956d = new C4306b();
        b12.b("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.f(this.f35174a);
            }
        });
        b12.b("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.D0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.b(this.f34965a);
            }
        });
    }
}
