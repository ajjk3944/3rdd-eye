package J9;

import A9.InterfaceC0579h;
import A9.InterfaceC0581i;
import A9.U0;
import A9.W;
import E.u;
import F9.w;
import F9.y;
import J9.d;
import b9.C1992A;
import b9.InterfaceC1997d;
import c9.C2097r;
import f9.InterfaceC4350h;
import h9.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p9.l;
import p9.p;
import p9.q;

/* compiled from: Select.kt */
/* loaded from: classes3.dex */
public final class a<R> implements InterfaceC0579h, c, U0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2911g = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4350h f2912b;

    /* renamed from: d, reason: collision with root package name */
    public Object f2914d;
    private volatile /* synthetic */ Object state$volatile = d.f2930b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2913c = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name */
    public int f2915e = -1;

    /* renamed from: f, reason: collision with root package name */
    public Object f2916f = d.f2933e;

    /* compiled from: Select.kt */
    /* renamed from: J9.a$a, reason: collision with other inner class name */
    public final class C0051a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2917a;

        /* renamed from: b, reason: collision with root package name */
        public final q<Object, c<?>, Object, C1992A> f2918b;

        /* renamed from: c, reason: collision with root package name */
        public final q<Object, Object, Object, Object> f2919c;

        /* renamed from: d, reason: collision with root package name */
        public final y f2920d;

        /* renamed from: e, reason: collision with root package name */
        public final i f2921e;

        /* renamed from: f, reason: collision with root package name */
        public final q<c<?>, Object, Object, l<Throwable, C1992A>> f2922f;

        /* renamed from: g, reason: collision with root package name */
        public Object f2923g;

        /* renamed from: h, reason: collision with root package name */
        public int f2924h = -1;

        public C0051a(Object obj, q qVar, q qVar2, y yVar, i iVar, q qVar3) {
            this.f2917a = obj;
            this.f2918b = qVar;
            this.f2919c = qVar2;
            this.f2920d = yVar;
            this.f2921e = iVar;
            this.f2922f = qVar3;
        }

        public final void a() {
            Object obj = this.f2923g;
            if (obj instanceof w) {
                ((w) obj).h(this.f2924h, a.this.f2912b);
                return;
            }
            W w10 = obj instanceof W ? (W) obj : null;
            if (w10 != null) {
                w10.dispose();
            }
        }
    }

    public a(InterfaceC4350h interfaceC4350h) {
        this.f2912b = interfaceC4350h;
    }

    @Override // A9.InterfaceC0579h
    public final void a(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2911g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == d.f2931c) {
                return;
            }
            y yVar = d.f2932d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, yVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f2913c;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0051a) it.next()).a();
            }
            this.f2916f = d.f2933e;
            this.f2913c = null;
            return;
        }
    }

    @Override // J9.c
    public final void b(W w10) {
        this.f2914d = w10;
    }

    @Override // A9.U0
    public final void c(w<?> wVar, int i) {
        this.f2914d = wVar;
        this.f2915e = i;
    }

    @Override // J9.c
    public final boolean d(Object obj, Object obj2) {
        return j(obj, obj2) == 0;
    }

    @Override // J9.c
    public final void e(Object obj) {
        this.f2916f = obj;
    }

    public final Object f(h9.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2911g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C0051a c0051a = (C0051a) obj;
        Object obj2 = this.f2916f;
        ArrayList arrayList = this.f2913c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0051a c0051a2 = (C0051a) it.next();
                if (c0051a2 != c0051a) {
                    c0051a2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, d.f2931c);
            this.f2916f = d.f2933e;
            this.f2913c = null;
        }
        Object objInvoke = c0051a.f2919c.invoke(c0051a.f2917a, c0051a.f2920d, obj2);
        c0051a.getClass();
        y yVar = d.f2934f;
        InterfaceC1997d interfaceC1997d = c0051a.f2921e;
        return c0051a.f2920d == yVar ? ((l) interfaceC1997d).invoke(cVar) : ((p) interfaceC1997d).invoke(objInvoke, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(h9.c r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J9.a.g(h9.c):java.lang.Object");
    }

    public final a<R>.C0051a h(Object obj) {
        ArrayList arrayList = this.f2913c;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C0051a) next).f2917a == obj) {
                obj2 = next;
                break;
            }
        }
        a<R>.C0051a c0051a = (C0051a) obj2;
        if (c0051a != null) {
            return c0051a;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void i(a<R>.C0051a c0051a, boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2911g;
        if (atomicReferenceFieldUpdater.get(this) instanceof C0051a) {
            return;
        }
        Object obj = c0051a.f2917a;
        if (!z10) {
            ArrayList arrayList = this.f2913c;
            kotlin.jvm.internal.l.c(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C0051a) it.next()).f2917a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        c0051a.f2918b.invoke(obj, this, c0051a.f2920d);
        if (this.f2916f != d.f2933e) {
            atomicReferenceFieldUpdater.set(this, c0051a);
            return;
        }
        if (!z10) {
            ArrayList arrayList2 = this.f2913c;
            kotlin.jvm.internal.l.c(arrayList2);
            arrayList2.add(c0051a);
        }
        c0051a.f2923g = this.f2914d;
        c0051a.f2924h = this.f2915e;
        this.f2914d = null;
        this.f2915e = -1;
    }

    public final int j(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2911g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (obj3 instanceof InterfaceC0581i) {
                a<R>.C0051a c0051aH = h(obj);
                if (c0051aH != null) {
                    q<c<?>, Object, Object, l<Throwable, C1992A>> qVar = c0051aH.f2922f;
                    l<Throwable, C1992A> lVarInvoke = qVar != null ? qVar.invoke(this, c0051aH.f2920d, obj2) : null;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, c0051aH)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    InterfaceC0581i interfaceC0581i = (InterfaceC0581i) obj3;
                    this.f2916f = obj2;
                    d.a aVar = d.f2929a;
                    y yVarJ = interfaceC0581i.j(C1992A.f18074a, lVarInvoke);
                    if (yVarJ == null) {
                        this.f2916f = d.f2933e;
                        return 2;
                    }
                    interfaceC0581i.p(yVarJ);
                    return 0;
                }
                continue;
            } else {
                if (kotlin.jvm.internal.l.b(obj3, d.f2931c) ? true : obj3 instanceof C0051a) {
                    return 3;
                }
                if (kotlin.jvm.internal.l.b(obj3, d.f2932d)) {
                    return 2;
                }
                if (kotlin.jvm.internal.l.b(obj3, d.f2930b)) {
                    List listG = u.G(obj);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, listG)) {
                            z10 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    ArrayList arrayListZ0 = C2097r.z0((Collection) obj3, obj);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListZ0)) {
                            z10 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    if (z10) {
                        break;
                    }
                }
            }
        }
        return 1;
    }
}
