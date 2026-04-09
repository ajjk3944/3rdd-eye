package androidx.lifecycle;

import androidx.lifecycle.AbstractC4013k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.C6853a;
import n.C6854b;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4018p extends AbstractC4013k {

    /* renamed from: k, reason: collision with root package name */
    public static final a f31662k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31663b;

    /* renamed from: c, reason: collision with root package name */
    private C6853a f31664c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC4013k.b f31665d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f31666e;

    /* renamed from: f, reason: collision with root package name */
    private int f31667f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31668g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f31669h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f31670i;

    /* renamed from: j, reason: collision with root package name */
    private final Li.z f31671j;

    /* renamed from: androidx.lifecycle.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC4013k.b a(AbstractC4013k.b state1, AbstractC4013k.b bVar) {
            AbstractC6492s.i(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    /* renamed from: androidx.lifecycle.p$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC4013k.b f31672a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC4015m f31673b;

        public b(InterfaceC4016n interfaceC4016n, AbstractC4013k.b initialState) {
            AbstractC6492s.i(initialState, "initialState");
            AbstractC6492s.f(interfaceC4016n);
            this.f31673b = r.f(interfaceC4016n);
            this.f31672a = initialState;
        }

        public final void a(InterfaceC4017o interfaceC4017o, AbstractC4013k.a event) {
            AbstractC6492s.i(event, "event");
            AbstractC4013k.b targetState = event.getTargetState();
            this.f31672a = C4018p.f31662k.a(this.f31672a, targetState);
            InterfaceC4015m interfaceC4015m = this.f31673b;
            AbstractC6492s.f(interfaceC4017o);
            interfaceC4015m.j(interfaceC4017o, event);
            this.f31672a = targetState;
        }

        public final AbstractC4013k.b b() {
            return this.f31672a;
        }
    }

    private C4018p(InterfaceC4017o interfaceC4017o, boolean z10) {
        this.f31663b = z10;
        this.f31664c = new C6853a();
        AbstractC4013k.b bVar = AbstractC4013k.b.INITIALIZED;
        this.f31665d = bVar;
        this.f31670i = new ArrayList();
        this.f31666e = new WeakReference(interfaceC4017o);
        this.f31671j = Li.P.a(bVar);
    }

    private final void d(InterfaceC4017o interfaceC4017o) {
        Iterator itDescendingIterator = this.f31664c.descendingIterator();
        AbstractC6492s.h(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f31669h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            AbstractC6492s.h(entry, "next()");
            InterfaceC4016n interfaceC4016n = (InterfaceC4016n) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f31665d) > 0 && !this.f31669h && this.f31664c.contains(interfaceC4016n)) {
                AbstractC4013k.a aVarA = AbstractC4013k.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                l(aVarA.getTargetState());
                bVar.a(interfaceC4017o, aVarA);
                k();
            }
        }
    }

    private final AbstractC4013k.b e(InterfaceC4016n interfaceC4016n) {
        b bVar;
        Map.Entry entryM = this.f31664c.m(interfaceC4016n);
        AbstractC4013k.b bVar2 = null;
        AbstractC4013k.b bVarB = (entryM == null || (bVar = (b) entryM.getValue()) == null) ? null : bVar.b();
        if (!this.f31670i.isEmpty()) {
            bVar2 = (AbstractC4013k.b) this.f31670i.get(r0.size() - 1);
        }
        a aVar = f31662k;
        return aVar.a(aVar.a(this.f31665d, bVarB), bVar2);
    }

    private final void f(String str) {
        if (!this.f31663b || AbstractC4019q.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(InterfaceC4017o interfaceC4017o) {
        C6854b.d dVarF = this.f31664c.f();
        AbstractC6492s.h(dVarF, "observerMap.iteratorWithAdditions()");
        while (dVarF.hasNext() && !this.f31669h) {
            Map.Entry entry = (Map.Entry) dVarF.next();
            InterfaceC4016n interfaceC4016n = (InterfaceC4016n) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f31665d) < 0 && !this.f31669h && this.f31664c.contains(interfaceC4016n)) {
                l(bVar.b());
                AbstractC4013k.a aVarC = AbstractC4013k.a.Companion.c(bVar.b());
                if (aVarC == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC4017o, aVarC);
                k();
            }
        }
    }

    private final boolean i() {
        if (this.f31664c.size() == 0) {
            return true;
        }
        Map.Entry entryB = this.f31664c.b();
        AbstractC6492s.f(entryB);
        AbstractC4013k.b bVarB = ((b) entryB.getValue()).b();
        Map.Entry entryG = this.f31664c.g();
        AbstractC6492s.f(entryG);
        AbstractC4013k.b bVarB2 = ((b) entryG.getValue()).b();
        return bVarB == bVarB2 && this.f31665d == bVarB2;
    }

    private final void j(AbstractC4013k.b bVar) {
        AbstractC4013k.b bVar2 = this.f31665d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC4013k.b.INITIALIZED && bVar == AbstractC4013k.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f31665d + " in component " + this.f31666e.get()).toString());
        }
        this.f31665d = bVar;
        if (this.f31668g || this.f31667f != 0) {
            this.f31669h = true;
            return;
        }
        this.f31668g = true;
        n();
        this.f31668g = false;
        if (this.f31665d == AbstractC4013k.b.DESTROYED) {
            this.f31664c = new C6853a();
        }
    }

    private final void k() {
        this.f31670i.remove(r0.size() - 1);
    }

    private final void l(AbstractC4013k.b bVar) {
        this.f31670i.add(bVar);
    }

    private final void n() {
        InterfaceC4017o interfaceC4017o = (InterfaceC4017o) this.f31666e.get();
        if (interfaceC4017o == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.f31669h = false;
            AbstractC4013k.b bVar = this.f31665d;
            Map.Entry entryB = this.f31664c.b();
            AbstractC6492s.f(entryB);
            if (bVar.compareTo(((b) entryB.getValue()).b()) < 0) {
                d(interfaceC4017o);
            }
            Map.Entry entryG = this.f31664c.g();
            if (!this.f31669h && entryG != null && this.f31665d.compareTo(((b) entryG.getValue()).b()) > 0) {
                g(interfaceC4017o);
            }
        }
        this.f31669h = false;
        this.f31671j.setValue(b());
    }

    @Override // androidx.lifecycle.AbstractC4013k
    public void a(InterfaceC4016n observer) {
        InterfaceC4017o interfaceC4017o;
        AbstractC6492s.i(observer, "observer");
        f("addObserver");
        AbstractC4013k.b bVar = this.f31665d;
        AbstractC4013k.b bVar2 = AbstractC4013k.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC4013k.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f31664c.j(observer, bVar3)) == null && (interfaceC4017o = (InterfaceC4017o) this.f31666e.get()) != null) {
            boolean z10 = this.f31667f != 0 || this.f31668g;
            AbstractC4013k.b bVarE = e(observer);
            this.f31667f++;
            while (bVar3.b().compareTo(bVarE) < 0 && this.f31664c.contains(observer)) {
                l(bVar3.b());
                AbstractC4013k.a aVarC = AbstractC4013k.a.Companion.c(bVar3.b());
                if (aVarC == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC4017o, aVarC);
                k();
                bVarE = e(observer);
            }
            if (!z10) {
                n();
            }
            this.f31667f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC4013k
    public AbstractC4013k.b b() {
        return this.f31665d;
    }

    @Override // androidx.lifecycle.AbstractC4013k
    public void c(InterfaceC4016n observer) {
        AbstractC6492s.i(observer, "observer");
        f("removeObserver");
        this.f31664c.k(observer);
    }

    public void h(AbstractC4013k.a event) {
        AbstractC6492s.i(event, "event");
        f("handleLifecycleEvent");
        j(event.getTargetState());
    }

    public void m(AbstractC4013k.b state) {
        AbstractC6492s.i(state, "state");
        f("setCurrentState");
        j(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4018p(InterfaceC4017o provider) {
        this(provider, true);
        AbstractC6492s.i(provider, "provider");
    }
}
