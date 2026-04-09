package K6;

import K6.InterfaceC3130c;
import hg.InterfaceC6043c;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;

/* renamed from: K6.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3146t implements InterfaceC3142o {

    /* renamed from: a, reason: collision with root package name */
    private final O6.a f10450a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3130c.a f10451b;

    /* renamed from: c, reason: collision with root package name */
    final gg.y f10452c;

    public C3146t(O6.a aVar, InterfaceC3130c.a aVar2, gg.y yVar) {
        this.f10450a = aVar;
        this.f10451b = aVar2;
        this.f10452c = yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Set set, InterfaceC6043c interfaceC6043c) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC3141n) it.next()).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC3141n) it.next()).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ gg.v h(G6.z zVar) {
        InterfaceC3130c interfaceC3130cA = this.f10451b.b(zVar.f7089a).c(zVar.f7090b).d(zVar.f7091c).a();
        final Set setA = interfaceC3130cA.a();
        return j(interfaceC3130cA).m0(i(interfaceC3130cA)).u(e(interfaceC3130cA)).G(new InterfaceC6469f() { // from class: K6.q
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                C3146t.f(setA, (InterfaceC6043c) obj);
            }
        }).y(new InterfaceC6464a() { // from class: K6.r
            @Override // kg.InterfaceC6464a
            public final void run() {
                C3146t.g(setA);
            }
        }).M0(this.f10452c).e1(this.f10452c);
    }

    static gg.s i(InterfaceC3130c interfaceC3130c) {
        return interfaceC3130c.c().k();
    }

    static gg.s j(final InterfaceC3130c interfaceC3130c) {
        Objects.requireNonNull(interfaceC3130c);
        return gg.s.b0(new Callable() { // from class: K6.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return interfaceC3130c.d();
            }
        });
    }

    @Override // K6.InterfaceC3142o
    public gg.s a(final G6.z zVar) {
        return gg.s.r(new kg.q() { // from class: K6.p
            @Override // kg.q
            public final Object get() {
                return this.f10444a.h(zVar);
            }
        });
    }

    gg.s e(InterfaceC3130c interfaceC3130c) {
        return this.f10450a.a(interfaceC3130c.b());
    }
}
