package s6;

import H6.C0680q;
import java.util.Collection;
import s6.o;

/* compiled from: MultiVariableSource.kt */
/* loaded from: classes.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final C5581b f46090a;

    /* renamed from: b, reason: collision with root package name */
    public final C0680q f46091b;

    public e(C5581b variableController, C0680q c0680q) {
        kotlin.jvm.internal.l.f(variableController, "variableController");
        this.f46090a = variableController;
        this.f46091b = c0680q;
    }

    @Override // s6.p
    public final Z6.d a(String variableName) {
        boolean zContains;
        kotlin.jvm.internal.l.f(variableName, "name");
        this.f46091b.invoke(variableName);
        C5581b c5581b = this.f46090a;
        c5581b.getClass();
        kotlin.jvm.internal.l.f(variableName, "variableName");
        synchronized (c5581b.f46087c) {
            zContains = c5581b.f46087c.contains(variableName);
        }
        if (zContains) {
            return c5581b.f46085a.get(variableName);
        }
        return null;
    }

    @Override // s6.p
    public final void b(o.b observer) {
        kotlin.jvm.internal.l.f(observer, "observer");
        C5581b c5581b = this.f46090a;
        c5581b.getClass();
        kotlin.jvm.internal.l.f(observer, "observer");
        Collection<Z6.d> collectionValues = c5581b.f46085a.values();
        kotlin.jvm.internal.l.e(collectionValues, "variables.values");
        for (Z6.d dVar : collectionValues) {
            dVar.getClass();
            dVar.f14034a.b(observer);
        }
    }

    @Override // s6.p
    public final void c(o.b observer) {
        kotlin.jvm.internal.l.f(observer, "observer");
        C5581b c5581b = this.f46090a;
        c5581b.getClass();
        kotlin.jvm.internal.l.f(observer, "observer");
        Collection<Z6.d> collectionValues = c5581b.f46085a.values();
        kotlin.jvm.internal.l.e(collectionValues, "variables.values");
        for (Z6.d it : collectionValues) {
            kotlin.jvm.internal.l.e(it, "it");
            observer.invoke(it);
        }
    }

    @Override // s6.p
    public final void d(InterfaceC5580a observer) {
        kotlin.jvm.internal.l.f(observer, "observer");
        C5581b c5581b = this.f46090a;
        c5581b.getClass();
        kotlin.jvm.internal.l.f(observer, "observer");
        c5581b.f46086b.add(observer);
    }

    @Override // s6.p
    public final void e(o.b observer) {
        kotlin.jvm.internal.l.f(observer, "observer");
        C5581b c5581b = this.f46090a;
        c5581b.getClass();
        kotlin.jvm.internal.l.f(observer, "observer");
        Collection<Z6.d> collectionValues = c5581b.f46085a.values();
        kotlin.jvm.internal.l.e(collectionValues, "variables.values");
        for (Z6.d dVar : collectionValues) {
            dVar.getClass();
            dVar.f14034a.c(observer);
        }
    }

    @Override // s6.p
    public final void f(InterfaceC5580a observer) {
        kotlin.jvm.internal.l.f(observer, "observer");
        C5581b c5581b = this.f46090a;
        c5581b.getClass();
        kotlin.jvm.internal.l.f(observer, "observer");
        c5581b.f46086b.remove(observer);
    }
}
