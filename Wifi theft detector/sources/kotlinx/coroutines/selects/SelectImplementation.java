package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.m;
import kotlinx.coroutines.o;
import kotlinx.coroutines.u2;
import kotlinx.coroutines.y0;
import l9.l;
import l9.q;
import y8.s;

/* loaded from: classes4.dex */
public class SelectImplementation extends m implements b, h, u2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22632f = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.d f22633a;

    /* renamed from: c, reason: collision with root package name */
    public Object f22635c;
    private volatile /* synthetic */ Object state$volatile = SelectKt.f22648b;

    /* renamed from: b, reason: collision with root package name */
    public List f22634b = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public int f22636d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f22637e = SelectKt.f22651e;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f22638a;

        /* renamed from: b, reason: collision with root package name */
        public final q f22639b;

        /* renamed from: c, reason: collision with root package name */
        public final q f22640c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f22641d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f22642e;

        /* renamed from: f, reason: collision with root package name */
        public final q f22643f;

        /* renamed from: g, reason: collision with root package name */
        public Object f22644g;

        /* renamed from: h, reason: collision with root package name */
        public int f22645h = -1;

        public a(Object obj, q qVar, q qVar2, Object obj2, Object obj3, q qVar3) {
            this.f22638a = obj;
            this.f22639b = qVar;
            this.f22640c = qVar2;
            this.f22641d = obj2;
            this.f22642e = obj3;
            this.f22643f = qVar3;
        }

        public final l a(h hVar, Object obj) {
            q qVar = this.f22643f;
            if (qVar != null) {
                return (l) qVar.invoke(hVar, this.f22641d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f22644g;
            SelectImplementation selectImplementation = SelectImplementation.this;
            if (obj instanceof z) {
                ((z) obj).r(this.f22645h, null, selectImplementation.getContext());
                return;
            }
            y0 y0Var = obj instanceof y0 ? (y0) obj : null;
            if (y0Var != null) {
                y0Var.d();
            }
        }

        public final Object c(Object obj, c9.c cVar) {
            Object obj2 = this.f22642e;
            if (this.f22641d == SelectKt.i()) {
                p.c(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((l) obj2).invoke(cVar);
            }
            p.c(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((l9.p) obj2).invoke(obj, cVar);
        }

        public final Object d(Object obj) {
            return this.f22640c.invoke(this.f22638a, this.f22641d, obj);
        }

        public final boolean e(SelectImplementation selectImplementation) {
            this.f22639b.invoke(this.f22638a, selectImplementation, this.f22641d);
            return selectImplementation.f22637e == SelectKt.f22651e;
        }
    }

    public SelectImplementation(kotlin.coroutines.d dVar) {
        this.f22633a = dVar;
    }

    public static /* synthetic */ Object t(SelectImplementation selectImplementation, c9.c cVar) {
        return selectImplementation.x() ? selectImplementation.r(cVar) : selectImplementation.u(cVar);
    }

    public static /* synthetic */ void z(SelectImplementation selectImplementation, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        selectImplementation.y(aVar, z10);
    }

    public final void A(Object obj) {
        a aVarV = v(obj);
        p.b(aVarV);
        aVarV.f22644g = null;
        aVarV.f22645h = -1;
        y(aVarV, true);
    }

    public final TrySelectDetailedResult B(Object obj, Object obj2) {
        return SelectKt.a(C(obj, obj2));
    }

    public final int C(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f22632f.get(this);
            if (obj3 instanceof o) {
                a aVarV = v(obj);
                if (aVarV == null) {
                    continue;
                } else {
                    l lVarA = aVarV.a(this, obj2);
                    if (t.a.a(f22632f, this, obj3, aVarV)) {
                        this.f22637e = obj2;
                        if (SelectKt.j((o) obj3, lVarA)) {
                            return 0;
                        }
                        this.f22637e = SelectKt.f22651e;
                        return 2;
                    }
                }
            } else {
                if (p.a(obj3, SelectKt.f22649c) ? true : obj3 instanceof a) {
                    return 3;
                }
                if (p.a(obj3, SelectKt.f22650d)) {
                    return 2;
                }
                if (p.a(obj3, SelectKt.f22648b)) {
                    if (t.a.a(f22632f, this, obj3, z8.q.e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (t.a.a(f22632f, this, obj3, z8.z.U((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r0 = r0.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.a.f()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        d9.e.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.a.f()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return y8.s.f25199a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(c9.c r6) {
        /*
            r5 = this;
            kotlinx.coroutines.p r0 = new kotlinx.coroutines.p
            c9.c r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.F()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = n()
        L11:
            java.lang.Object r2 = r1.get(r5)
            kotlinx.coroutines.internal.c0 r3 = kotlinx.coroutines.selects.SelectKt.g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = n()
            boolean r2 = t.a.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            r0.e(r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = n()
            kotlinx.coroutines.internal.c0 r4 = kotlinx.coroutines.selects.SelectKt.g()
            boolean r3 = t.a.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            o(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof kotlinx.coroutines.selects.SelectImplementation.a
            if (r1 == 0) goto L79
            y8.s r1 = y8.s.f25199a
            kotlinx.coroutines.selects.SelectImplementation$a r2 = (kotlinx.coroutines.selects.SelectImplementation.a) r2
            java.lang.Object r3 = k(r5)
            l9.l r2 = r2.a(r5, r3)
            r0.y(r1, r2)
        L62:
            java.lang.Object r0 = r0.w()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            if (r0 != r1) goto L6f
            d9.e.c(r6)
        L6f:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.f()
            if (r0 != r6) goto L76
            return r0
        L76:
            y8.s r6 = y8.s.f25199a
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.D(c9.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.u2
    public void a(z zVar, int i10) {
        this.f22635c = zVar;
        this.f22636d = i10;
    }

    @Override // kotlinx.coroutines.selects.b
    public void b(c cVar, l lVar) {
        z(this, new a(cVar.d(), cVar.a(), cVar.c(), SelectKt.i(), lVar, cVar.b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.b
    public void d(e eVar, l9.p pVar) {
        z(this, new a(eVar.d(), eVar.a(), eVar.c(), null, pVar, eVar.b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.h
    public void e(Object obj) {
        this.f22637e = obj;
    }

    @Override // kotlinx.coroutines.selects.h
    public void g(y0 y0Var) {
        this.f22635c = y0Var;
    }

    @Override // kotlinx.coroutines.selects.h
    public kotlin.coroutines.d getContext() {
        return this.f22633a;
    }

    @Override // kotlinx.coroutines.selects.h
    public boolean h(Object obj, Object obj2) {
        return C(obj, obj2) == 0;
    }

    @Override // kotlinx.coroutines.n
    public void i(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22632f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f22649c) {
                return;
            }
        } while (!t.a.a(atomicReferenceFieldUpdater, this, obj, SelectKt.f22650d));
        List list = this.f22634b;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.f22637e = SelectKt.f22651e;
        this.f22634b = null;
    }

    @Override // l9.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return s.f25199a;
    }

    public final void p(Object obj) {
        List list = this.f22634b;
        p.b(list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f22638a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    public final void q(a aVar) {
        List<a> list = this.f22634b;
        if (list == null) {
            return;
        }
        for (a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        f22632f.set(this, SelectKt.f22649c);
        this.f22637e = SelectKt.f22651e;
        this.f22634b = null;
    }

    public final Object r(c9.c cVar) {
        Object obj = f22632f.get(this);
        p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f22637e;
        q(aVar);
        return aVar.c(aVar.d(obj2), cVar);
    }

    public Object s(c9.c cVar) {
        return t(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(c9.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.c.b(r6)
            goto L4b
        L3c:
            kotlin.c.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.D(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.r(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.u(c9.c):java.lang.Object");
    }

    public final a v(Object obj) {
        List list = this.f22634b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f22638a == obj) {
                obj2 = next;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final boolean x() {
        return f22632f.get(this) instanceof a;
    }

    public final void y(a aVar, boolean z10) {
        if (f22632f.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            p(aVar.f22638a);
        }
        if (!aVar.e(this)) {
            f22632f.set(this, aVar);
            return;
        }
        if (!z10) {
            List list = this.f22634b;
            p.b(list);
            list.add(aVar);
        }
        aVar.f22644g = this.f22635c;
        aVar.f22645h = this.f22636d;
        this.f22635c = null;
        this.f22636d = -1;
    }
}
