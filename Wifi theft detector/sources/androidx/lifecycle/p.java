package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k.b;

/* loaded from: classes.dex */
public class p extends Lifecycle {

    /* renamed from: j, reason: collision with root package name */
    public static final a f3523j = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3524b;

    /* renamed from: c, reason: collision with root package name */
    public k.a f3525c;

    /* renamed from: d, reason: collision with root package name */
    public Lifecycle.State f3526d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f3527e;

    /* renamed from: f, reason: collision with root package name */
    public int f3528f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3529g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3530h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3531i;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final Lifecycle.State a(Lifecycle.State state1, Lifecycle.State state) {
            kotlin.jvm.internal.p.e(state1, "state1");
            return (state == null || state.compareTo(state1) >= 0) ? state1 : state;
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Lifecycle.State f3532a;

        /* renamed from: b, reason: collision with root package name */
        public j f3533b;

        public b(m mVar, Lifecycle.State initialState) {
            kotlin.jvm.internal.p.e(initialState, "initialState");
            kotlin.jvm.internal.p.b(mVar);
            this.f3533b = q.f(mVar);
            this.f3532a = initialState;
        }

        public final void a(n nVar, Lifecycle.Event event) {
            kotlin.jvm.internal.p.e(event, "event");
            Lifecycle.State stateG = event.g();
            this.f3532a = p.f3523j.a(this.f3532a, stateG);
            j jVar = this.f3533b;
            kotlin.jvm.internal.p.b(nVar);
            jVar.onStateChanged(nVar, event);
            this.f3532a = stateG;
        }

        public final Lifecycle.State b() {
            return this.f3532a;
        }
    }

    public p(n nVar, boolean z10) {
        this.f3524b = z10;
        this.f3525c = new k.a();
        this.f3526d = Lifecycle.State.INITIALIZED;
        this.f3531i = new ArrayList();
        this.f3527e = new WeakReference(nVar);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void a(m observer) {
        n nVar;
        kotlin.jvm.internal.p.e(observer, "observer");
        g("addObserver");
        Lifecycle.State state = this.f3526d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        b bVar = new b(observer, state2);
        if (((b) this.f3525c.g(observer, bVar)) == null && (nVar = (n) this.f3527e.get()) != null) {
            boolean z10 = this.f3528f != 0 || this.f3529g;
            Lifecycle.State stateF = f(observer);
            this.f3528f++;
            while (bVar.b().compareTo(stateF) < 0 && this.f3525c.contains(observer)) {
                m(bVar.b());
                Lifecycle.Event eventB = Lifecycle.Event.INSTANCE.b(bVar.b());
                if (eventB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(nVar, eventB);
                l();
                stateF = f(observer);
            }
            if (!z10) {
                o();
            }
            this.f3528f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State b() {
        return this.f3526d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void d(m observer) {
        kotlin.jvm.internal.p.e(observer, "observer");
        g("removeObserver");
        this.f3525c.h(observer);
    }

    public final void e(n nVar) {
        Iterator itDescendingIterator = this.f3525c.descendingIterator();
        kotlin.jvm.internal.p.d(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f3530h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            kotlin.jvm.internal.p.d(entry, "next()");
            m mVar = (m) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3526d) > 0 && !this.f3530h && this.f3525c.contains(mVar)) {
                Lifecycle.Event eventA = Lifecycle.Event.INSTANCE.a(bVar.b());
                if (eventA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(eventA.g());
                bVar.a(nVar, eventA);
                l();
            }
        }
    }

    public final Lifecycle.State f(m mVar) {
        b bVar;
        Map.Entry entryI = this.f3525c.i(mVar);
        Lifecycle.State state = null;
        Lifecycle.State stateB = (entryI == null || (bVar = (b) entryI.getValue()) == null) ? null : bVar.b();
        if (!this.f3531i.isEmpty()) {
            state = (Lifecycle.State) this.f3531i.get(r0.size() - 1);
        }
        a aVar = f3523j;
        return aVar.a(aVar.a(this.f3526d, stateB), state);
    }

    public final void g(String str) {
        if (!this.f3524b || j.c.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void h(n nVar) {
        b.d dVarD = this.f3525c.d();
        kotlin.jvm.internal.p.d(dVarD, "observerMap.iteratorWithAdditions()");
        while (dVarD.hasNext() && !this.f3530h) {
            Map.Entry entry = (Map.Entry) dVarD.next();
            m mVar = (m) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3526d) < 0 && !this.f3530h && this.f3525c.contains(mVar)) {
                m(bVar.b());
                Lifecycle.Event eventB = Lifecycle.Event.INSTANCE.b(bVar.b());
                if (eventB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(nVar, eventB);
                l();
            }
        }
    }

    public void i(Lifecycle.Event event) {
        kotlin.jvm.internal.p.e(event, "event");
        g("handleLifecycleEvent");
        k(event.g());
    }

    public final boolean j() {
        if (this.f3525c.size() == 0) {
            return true;
        }
        Map.Entry entryB = this.f3525c.b();
        kotlin.jvm.internal.p.b(entryB);
        Lifecycle.State stateB = ((b) entryB.getValue()).b();
        Map.Entry entryE = this.f3525c.e();
        kotlin.jvm.internal.p.b(entryE);
        Lifecycle.State stateB2 = ((b) entryE.getValue()).b();
        return stateB == stateB2 && this.f3526d == stateB2;
    }

    public final void k(Lifecycle.State state) {
        Lifecycle.State state2 = this.f3526d;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f3526d + " in component " + this.f3527e.get()).toString());
        }
        this.f3526d = state;
        if (this.f3529g || this.f3528f != 0) {
            this.f3530h = true;
            return;
        }
        this.f3529g = true;
        o();
        this.f3529g = false;
        if (this.f3526d == Lifecycle.State.DESTROYED) {
            this.f3525c = new k.a();
        }
    }

    public final void l() {
        this.f3531i.remove(r0.size() - 1);
    }

    public final void m(Lifecycle.State state) {
        this.f3531i.add(state);
    }

    public void n(Lifecycle.State state) {
        kotlin.jvm.internal.p.e(state, "state");
        g("setCurrentState");
        k(state);
    }

    public final void o() {
        n nVar = (n) this.f3527e.get();
        if (nVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.f3530h = false;
            Lifecycle.State state = this.f3526d;
            Map.Entry entryB = this.f3525c.b();
            kotlin.jvm.internal.p.b(entryB);
            if (state.compareTo(((b) entryB.getValue()).b()) < 0) {
                e(nVar);
            }
            Map.Entry entryE = this.f3525c.e();
            if (!this.f3530h && entryE != null && this.f3526d.compareTo(((b) entryE.getValue()).b()) > 0) {
                h(nVar);
            }
        }
        this.f3530h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(n provider) {
        this(provider, true);
        kotlin.jvm.internal.p.e(provider, "provider");
    }
}
