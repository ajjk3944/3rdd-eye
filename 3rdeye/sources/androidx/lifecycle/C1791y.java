package androidx.lifecycle;

import N7.C1154e9;
import android.os.Looper;
import androidx.lifecycle.AbstractC1781n;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p.C5437b;
import q.C5485a;
import q.C5486b;

/* compiled from: LifecycleRegistry.jvm.kt */
/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1791y extends AbstractC1781n {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16183b = true;

    /* renamed from: c, reason: collision with root package name */
    public C5485a<InterfaceC1789w, a> f16184c = new C5485a<>();

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1781n.b f16185d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference<InterfaceC1790x> f16186e;

    /* renamed from: f, reason: collision with root package name */
    public int f16187f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16188g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16189h;
    public final ArrayList<AbstractC1781n.b> i;

    /* renamed from: j, reason: collision with root package name */
    public final D9.J f16190j;

    /* compiled from: LifecycleRegistry.jvm.kt */
    /* renamed from: androidx.lifecycle.y$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC1781n.b f16191a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC1788v f16192b;

        public final void a(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
            AbstractC1781n.b targetState = aVar.getTargetState();
            AbstractC1781n.b state1 = this.f16191a;
            kotlin.jvm.internal.l.f(state1, "state1");
            if (targetState != null && targetState.compareTo(state1) < 0) {
                state1 = targetState;
            }
            this.f16191a = state1;
            this.f16192b.c(interfaceC1790x, aVar);
            this.f16191a = targetState;
        }
    }

    public C1791y(InterfaceC1790x interfaceC1790x) {
        AbstractC1781n.b bVar = AbstractC1781n.b.INITIALIZED;
        this.f16185d = bVar;
        this.i = new ArrayList<>();
        this.f16186e = new WeakReference<>(interfaceC1790x);
        this.f16190j = D9.E.c(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.AbstractC1781n
    public final void addObserver(InterfaceC1789w observer) {
        InterfaceC1788v l5;
        InterfaceC1790x interfaceC1790x;
        ArrayList<AbstractC1781n.b> arrayList = this.i;
        a aVar = null;
        kotlin.jvm.internal.l.f(observer, "observer");
        c("addObserver");
        AbstractC1781n.b bVar = this.f16185d;
        AbstractC1781n.b initialState = AbstractC1781n.b.DESTROYED;
        if (bVar != initialState) {
            initialState = AbstractC1781n.b.INITIALIZED;
        }
        kotlin.jvm.internal.l.f(initialState, "initialState");
        a aVar2 = new a();
        HashMap map = B.f16020a;
        boolean z10 = observer instanceof InterfaceC1788v;
        boolean z11 = observer instanceof InterfaceC1771d;
        if (z10 && z11) {
            l5 = new C1772e((InterfaceC1771d) observer, (InterfaceC1788v) observer);
        } else if (z11) {
            l5 = new C1772e((InterfaceC1771d) observer, null);
        } else if (z10) {
            l5 = (InterfaceC1788v) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (B.b(cls) == 2) {
                Object obj = B.f16021b.get(cls);
                kotlin.jvm.internal.l.c(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    l5 = new a0(B.a((Constructor) list.get(0), observer));
                } else {
                    int size = list.size();
                    InterfaceC1776i[] interfaceC1776iArr = new InterfaceC1776i[size];
                    for (int i = 0; i < size; i++) {
                        interfaceC1776iArr[i] = B.a((Constructor) list.get(i), observer);
                    }
                    l5 = new C1770c(interfaceC1776iArr);
                }
            } else {
                l5 = new L(observer);
            }
        }
        aVar2.f16192b = l5;
        aVar2.f16191a = initialState;
        C5485a<InterfaceC1789w, a> c5485a = this.f16184c;
        C5486b.c<InterfaceC1789w, a> cVarB = c5485a.b(observer);
        if (cVarB != null) {
            aVar = cVarB.f45308c;
        } else {
            HashMap<InterfaceC1789w, C5486b.c<InterfaceC1789w, a>> map2 = c5485a.f45302f;
            C5486b.c<K, V> cVar = new C5486b.c<>(observer, aVar2);
            c5485a.f45306e++;
            C5486b.c cVar2 = c5485a.f45304c;
            if (cVar2 == null) {
                c5485a.f45303b = cVar;
                c5485a.f45304c = cVar;
            } else {
                cVar2.f45309d = cVar;
                cVar.f45310e = cVar2;
                c5485a.f45304c = cVar;
            }
            map2.put(observer, cVar);
        }
        if (aVar == null && (interfaceC1790x = this.f16186e.get()) != null) {
            boolean z12 = this.f16187f != 0 || this.f16188g;
            AbstractC1781n.b bVarB = b(observer);
            this.f16187f++;
            while (aVar2.f16191a.compareTo(bVarB) < 0 && this.f16184c.f45302f.containsKey(observer)) {
                arrayList.add(aVar2.f16191a);
                AbstractC1781n.a.C0246a c0246a = AbstractC1781n.a.Companion;
                AbstractC1781n.b bVar2 = aVar2.f16191a;
                c0246a.getClass();
                AbstractC1781n.a aVarB = AbstractC1781n.a.C0246a.b(bVar2);
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + aVar2.f16191a);
                }
                aVar2.a(interfaceC1790x, aVarB);
                arrayList.remove(arrayList.size() - 1);
                bVarB = b(observer);
            }
            if (!z12) {
                g();
            }
            this.f16187f--;
        }
    }

    public final AbstractC1781n.b b(InterfaceC1789w interfaceC1789w) {
        a aVar;
        HashMap<InterfaceC1789w, C5486b.c<InterfaceC1789w, a>> map = this.f16184c.f45302f;
        C5486b.c<InterfaceC1789w, a> cVar = map.containsKey(interfaceC1789w) ? map.get(interfaceC1789w).f45310e : null;
        AbstractC1781n.b bVar = (cVar == null || (aVar = cVar.f45308c) == null) ? null : aVar.f16191a;
        ArrayList<AbstractC1781n.b> arrayList = this.i;
        AbstractC1781n.b bVar2 = arrayList.isEmpty() ? null : arrayList.get(arrayList.size() - 1);
        AbstractC1781n.b state1 = this.f16185d;
        kotlin.jvm.internal.l.f(state1, "state1");
        if (bVar == null || bVar.compareTo(state1) >= 0) {
            bVar = state1;
        }
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public final void c(String str) {
        if (this.f16183b) {
            C5437b.i0().f44961b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(C1154e9.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(AbstractC1781n.a event) {
        kotlin.jvm.internal.l.f(event, "event");
        c("handleLifecycleEvent");
        e(event.getTargetState());
    }

    public final void e(AbstractC1781n.b bVar) {
        AbstractC1781n.b bVar2 = this.f16185d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1781n.b.INITIALIZED && bVar == AbstractC1781n.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f16185d + " in component " + this.f16186e.get()).toString());
        }
        this.f16185d = bVar;
        if (this.f16188g || this.f16187f != 0) {
            this.f16189h = true;
            return;
        }
        this.f16188g = true;
        g();
        this.f16188g = false;
        if (this.f16185d == AbstractC1781n.b.DESTROYED) {
            this.f16184c = new C5485a<>();
        }
    }

    public final void f(AbstractC1781n.b state) {
        kotlin.jvm.internal.l.f(state, "state");
        c("setCurrentState");
        e(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.f16189h = false;
        r7.f16190j.setValue(r7.f16185d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1791y.g():void");
    }

    @Override // androidx.lifecycle.AbstractC1781n
    public final AbstractC1781n.b getCurrentState() {
        return this.f16185d;
    }

    @Override // androidx.lifecycle.AbstractC1781n
    public final D9.I<AbstractC1781n.b> getCurrentStateFlow() {
        return D9.H.a(this.f16190j);
    }

    @Override // androidx.lifecycle.AbstractC1781n
    public final void removeObserver(InterfaceC1789w observer) {
        kotlin.jvm.internal.l.f(observer, "observer");
        c("removeObserver");
        this.f16184c.c(observer);
    }
}
