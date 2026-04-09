package X0;

import A9.C0575f;
import A9.E;
import A9.InterfaceC0594o0;
import C.e0;
import C9.k;
import H6.I;
import K6.M;
import X0.o;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SimpleActor.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13448a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13449b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13450c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13451d;

    public n(s6.k kVar, e0 e0Var, H7.e functionProvider, I i) {
        kotlin.jvm.internal.l.f(functionProvider, "functionProvider");
        this.f13448a = kVar;
        this.f13449b = e0Var;
        this.f13450c = functionProvider;
        this.f13451d = i;
    }

    public void a(o.a aVar) throws Throwable {
        Object objI = ((C9.b) this.f13450c).i(aVar);
        if (objI instanceof k.a) {
            k.b bVar = (k.b) objI;
            k.a aVar2 = bVar instanceof k.a ? (k.a) bVar : null;
            Throwable th = aVar2 != null ? aVar2.f1006a : null;
            if (th != null) {
                throw th;
            }
            throw new C9.n("Channel was closed normally");
        }
        if (objI instanceof k.b) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f13451d).getAndIncrement() == 0) {
            C0575f.e((E) this.f13448a, null, null, new m(this, null), 3);
        }
    }

    public n(E e4, o.c cVar, o.d onUndeliveredElement, o.e eVar) {
        kotlin.jvm.internal.l.f(onUndeliveredElement, "onUndeliveredElement");
        this.f13448a = e4;
        this.f13449b = eVar;
        this.f13450c = C9.j.a(Integer.MAX_VALUE, 6, null);
        this.f13451d = new AtomicInteger(0);
        InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) e4.k0().get(InterfaceC0594o0.a.f263b);
        if (interfaceC0594o0 == null) {
            return;
        }
        interfaceC0594o0.F(new M(cVar, this, onUndeliveredElement, 3));
    }
}
