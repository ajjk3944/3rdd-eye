package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.r1;

/* loaded from: classes4.dex */
public class y1 implements r1, w, h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22705a = AtomicReferenceFieldUpdater.newUpdater(y1.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22706b = AtomicReferenceFieldUpdater.newUpdater(y1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public static final class a extends p {

        /* renamed from: i, reason: collision with root package name */
        public final y1 f22707i;

        public a(c9.c cVar, y1 y1Var) {
            super(cVar, 1);
            this.f22707i = y1Var;
        }

        @Override // kotlinx.coroutines.p
        public String L() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.p
        public Throwable u(r1 r1Var) {
            Throwable thE;
            Object objI0 = this.f22707i.i0();
            return (!(objI0 instanceof c) || (thE = ((c) objI0).e()) == null) ? objI0 instanceof c0 ? ((c0) objI0).f22236a : r1Var.m() : thE;
        }
    }

    public static final class b extends x1 {

        /* renamed from: e, reason: collision with root package name */
        public final y1 f22708e;

        /* renamed from: f, reason: collision with root package name */
        public final c f22709f;

        /* renamed from: g, reason: collision with root package name */
        public final v f22710g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f22711h;

        public b(y1 y1Var, c cVar, v vVar, Object obj) {
            this.f22708e = y1Var;
            this.f22709f = cVar;
            this.f22710g = vVar;
            this.f22711h = obj;
        }

        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            y((Throwable) obj);
            return y8.s.f25199a;
        }

        @Override // kotlinx.coroutines.e0
        public void y(Throwable th) {
            this.f22708e.X(this.f22709f, this.f22710g, this.f22711h);
        }
    }

    public static final class c implements m1 {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f22712b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f22713c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f22714d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name */
        public final d2 f22715a;

        public c(d2 d2Var, boolean z10, Throwable th) {
            this.f22715a = d2Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        @Override // kotlinx.coroutines.m1
        public d2 a() {
            return this.f22715a;
        }

        public final void b(Throwable th) {
            Throwable thE = e();
            if (thE == null) {
                o(th);
                return;
            }
            if (th == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                n(th);
                return;
            }
            if (objD instanceof Throwable) {
                if (th == objD) {
                    return;
                }
                ArrayList arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th);
                n(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        public final ArrayList c() {
            return new ArrayList(4);
        }

        public final Object d() {
            return f22714d.get(this);
        }

        public final Throwable e() {
            return (Throwable) f22713c.get(this);
        }

        public final boolean i() {
            return e() != null;
        }

        @Override // kotlinx.coroutines.m1
        public boolean isActive() {
            return e() == null;
        }

        public final boolean j() {
            return f22712b.get(this) != 0;
        }

        public final boolean k() {
            return d() == z1.f22723e;
        }

        public final List l(Throwable th) {
            ArrayList arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th != null && !kotlin.jvm.internal.p.a(th, thE)) {
                arrayListC.add(th);
            }
            n(z1.f22723e);
            return arrayListC;
        }

        public final void m(boolean z10) {
            f22712b.set(this, z10 ? 1 : 0);
        }

        public final void n(Object obj) {
            f22714d.set(this, obj);
        }

        public final void o(Throwable th) {
            f22713c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + ']';
        }
    }

    public static final class d extends LockFreeLinkedListNode.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y1 f22716d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f22717e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LockFreeLinkedListNode lockFreeLinkedListNode, y1 y1Var, Object obj) {
            super(lockFreeLinkedListNode);
            this.f22716d = y1Var;
            this.f22717e = obj;
        }

        @Override // kotlinx.coroutines.internal.b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object e(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f22716d.i0() == this.f22717e) {
                return null;
            }
            return kotlinx.coroutines.internal.o.a();
        }
    }

    public y1(boolean z10) {
        this._state$volatile = z10 ? z1.f22725g : z1.f22724f;
    }

    public static /* synthetic */ CancellationException J0(y1 y1Var, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return y1Var.I0(th, str);
    }

    public void A0(Object obj) {
    }

    public void B0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.l1] */
    public final void C0(b1 b1Var) {
        d2 d2Var = new d2();
        if (!b1Var.isActive()) {
            d2Var = new l1(d2Var);
        }
        t.a.a(f22705a, this, b1Var, d2Var);
    }

    public final void D0(x1 x1Var) {
        x1Var.h(new d2());
        t.a.a(f22705a, this, x1Var, x1Var.o());
    }

    public final void E0(x1 x1Var) {
        Object objI0;
        do {
            objI0 = i0();
            if (!(objI0 instanceof x1)) {
                if (!(objI0 instanceof m1) || ((m1) objI0).a() == null) {
                    return;
                }
                x1Var.u();
                return;
            }
            if (objI0 != x1Var) {
                return;
            }
        } while (!t.a.a(f22705a, this, objI0, z1.f22725g));
    }

    public final boolean F(Object obj, d2 d2Var, x1 x1Var) {
        int iX;
        d dVar = new d(x1Var, this, obj);
        do {
            iX = d2Var.p().x(x1Var, d2Var, dVar);
            if (iX == 1) {
                return true;
            }
        } while (iX != 2);
        return false;
    }

    public final void F0(u uVar) {
        f22706b.set(this, uVar);
    }

    public final void G(Throwable th, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                y8.d.a(th, th2);
            }
        }
    }

    public final int G0(Object obj) {
        if (obj instanceof b1) {
            if (((b1) obj).isActive()) {
                return 0;
            }
            if (!t.a.a(f22705a, this, obj, z1.f22725g)) {
                return -1;
            }
            B0();
            return 1;
        }
        if (!(obj instanceof l1)) {
            return 0;
        }
        if (!t.a.a(f22705a, this, obj, ((l1) obj).a())) {
            return -1;
        }
        B0();
        return 1;
    }

    public void H(Object obj) {
    }

    public final String H0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof m1 ? ((m1) obj).isActive() ? "Active" : "New" : obj instanceof c0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.i() ? "Cancelling" : cVar.j() ? "Completing" : "Active";
    }

    public final CancellationException I0(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = R();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    public final Object J(c9.c cVar) throws Throwable {
        Object objI0;
        do {
            objI0 = i0();
            if (!(objI0 instanceof m1)) {
                if (objI0 instanceof c0) {
                    throw ((c0) objI0).f22236a;
                }
                return z1.h(objI0);
            }
        } while (G0(objI0) < 0);
        return K(cVar);
    }

    public final Object K(c9.c cVar) {
        a aVar = new a(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), this);
        aVar.F();
        r.a(aVar, U(new i2(aVar)));
        Object objW = aVar.w();
        if (objW == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objW;
    }

    public final String K0() {
        return v0() + '{' + H0(i0()) + '}';
    }

    public final boolean L(Throwable th) {
        return M(th);
    }

    public final boolean L0(m1 m1Var, Object obj) throws Throwable {
        if (!t.a.a(f22705a, this, m1Var, z1.g(obj))) {
            return false;
        }
        z0(null);
        A0(obj);
        T(m1Var, obj);
        return true;
    }

    public final boolean M(Object obj) throws Throwable {
        Object objR0 = z1.f22719a;
        if (f0() && (objR0 = O(obj)) == z1.f22720b) {
            return true;
        }
        if (objR0 == z1.f22719a) {
            objR0 = r0(obj);
        }
        if (objR0 == z1.f22719a || objR0 == z1.f22720b) {
            return true;
        }
        if (objR0 == z1.f22722d) {
            return false;
        }
        H(objR0);
        return true;
    }

    public final boolean M0(m1 m1Var, Throwable th) throws Throwable {
        d2 d2VarG0 = g0(m1Var);
        if (d2VarG0 == null) {
            return false;
        }
        if (!t.a.a(f22705a, this, m1Var, new c(d2VarG0, false, th))) {
            return false;
        }
        x0(d2VarG0, th);
        return true;
    }

    public void N(Throwable th) throws Throwable {
        M(th);
    }

    public final Object N0(Object obj, Object obj2) {
        return !(obj instanceof m1) ? z1.f22719a : ((!(obj instanceof b1) && !(obj instanceof x1)) || (obj instanceof v) || (obj2 instanceof c0)) ? O0((m1) obj, obj2) : L0((m1) obj, obj2) ? obj2 : z1.f22721c;
    }

    public final Object O(Object obj) {
        Object objN0;
        do {
            Object objI0 = i0();
            if (!(objI0 instanceof m1) || ((objI0 instanceof c) && ((c) objI0).j())) {
                return z1.f22719a;
            }
            objN0 = N0(objI0, new c0(Y(obj), false, 2, null));
        } while (objN0 == z1.f22721c);
        return objN0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object O0(m1 m1Var, Object obj) throws Throwable {
        d2 d2VarG0 = g0(m1Var);
        if (d2VarG0 == null) {
            return z1.f22721c;
        }
        c cVar = m1Var instanceof c ? (c) m1Var : null;
        if (cVar == null) {
            cVar = new c(d2VarG0, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (cVar) {
            if (cVar.j()) {
                return z1.f22719a;
            }
            cVar.m(true);
            if (cVar != m1Var && !t.a.a(f22705a, this, m1Var, cVar)) {
                return z1.f22721c;
            }
            boolean zI = cVar.i();
            c0 c0Var = obj instanceof c0 ? (c0) obj : null;
            if (c0Var != null) {
                cVar.b(c0Var.f22236a);
            }
            ?? E = zI ? 0 : cVar.e();
            ref$ObjectRef.element = E;
            y8.s sVar = y8.s.f25199a;
            if (E != 0) {
                x0(d2VarG0, E);
            }
            v vVarA0 = a0(m1Var);
            return (vVarA0 == null || !P0(cVar, vVarA0, obj)) ? Z(cVar, obj) : z1.f22720b;
        }
    }

    public final boolean P0(c cVar, v vVar, Object obj) {
        while (r1.a.d(vVar.f22695e, false, false, new b(this, cVar, vVar, obj), 1, null) == f2.f22359a) {
            vVar = w0(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean Q(Throwable th) {
        if (o0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        u uVarH0 = h0();
        return (uVarH0 == null || uVarH0 == f2.f22359a) ? z10 : uVarH0.b(th) || z10;
    }

    public String R() {
        return "Job was cancelled";
    }

    public boolean S(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return M(th) && e0();
    }

    public final void T(m1 m1Var, Object obj) throws Throwable {
        u uVarH0 = h0();
        if (uVarH0 != null) {
            uVarH0.d();
            F0(f2.f22359a);
        }
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th = c0Var != null ? c0Var.f22236a : null;
        if (!(m1Var instanceof x1)) {
            d2 d2VarA = m1Var.a();
            if (d2VarA != null) {
                y0(d2VarA, th);
                return;
            }
            return;
        }
        try {
            ((x1) m1Var).y(th);
        } catch (Throwable th2) {
            m0(new CompletionHandlerException("Exception in completion handler " + m1Var + " for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.r1
    public final y0 U(l9.l lVar) {
        return f(false, true, lVar);
    }

    @Override // kotlinx.coroutines.r1
    public final u W(w wVar) {
        y0 y0VarD = r1.a.d(this, true, false, new v(wVar), 2, null);
        kotlin.jvm.internal.p.c(y0VarD, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (u) y0VarD;
    }

    public final void X(c cVar, v vVar, Object obj) {
        v vVarW0 = w0(vVar);
        if (vVarW0 == null || !P0(cVar, vVarW0, obj)) {
            H(Z(cVar, obj));
        }
    }

    public final Throwable Y(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(R(), null, this) : th;
        }
        kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((h2) obj).r();
    }

    public final Object Z(c cVar, Object obj) throws Throwable {
        boolean zI;
        Throwable thD0;
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th = c0Var != null ? c0Var.f22236a : null;
        synchronized (cVar) {
            zI = cVar.i();
            List listL = cVar.l(th);
            thD0 = d0(cVar, listL);
            if (thD0 != null) {
                G(thD0, listL);
            }
        }
        if (thD0 != null && thD0 != th) {
            obj = new c0(thD0, false, 2, null);
        }
        if (thD0 != null && (Q(thD0) || l0(thD0))) {
            kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((c0) obj).c();
        }
        if (!zI) {
            z0(thD0);
        }
        A0(obj);
        t.a.a(f22705a, this, cVar, z1.g(obj));
        T(cVar, obj);
        return obj;
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.channels.n
    public void a(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(R(), null, this);
        }
        N(cancellationException);
    }

    public final v a0(m1 m1Var) {
        v vVar = m1Var instanceof v ? (v) m1Var : null;
        if (vVar != null) {
            return vVar;
        }
        d2 d2VarA = m1Var.a();
        if (d2VarA != null) {
            return w0(d2VarA);
        }
        return null;
    }

    public final Object b0() throws Throwable {
        Object objI0 = i0();
        if (objI0 instanceof m1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objI0 instanceof c0) {
            throw ((c0) objI0).f22236a;
        }
        return z1.h(objI0);
    }

    public final Throwable c0(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f22236a;
        }
        return null;
    }

    @Override // kotlinx.coroutines.r1
    public final boolean d() {
        return !(i0() instanceof m1);
    }

    public final Throwable d0(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.i()) {
                return new JobCancellationException(R(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean e0() {
        return true;
    }

    @Override // kotlinx.coroutines.r1
    public final y0 f(boolean z10, boolean z11, l9.l lVar) {
        x1 x1VarU0 = u0(lVar, z10);
        while (true) {
            Object objI0 = i0();
            if (objI0 instanceof b1) {
                b1 b1Var = (b1) objI0;
                if (!b1Var.isActive()) {
                    C0(b1Var);
                } else if (t.a.a(f22705a, this, objI0, x1VarU0)) {
                    break;
                }
            } else {
                if (!(objI0 instanceof m1)) {
                    if (z11) {
                        c0 c0Var = objI0 instanceof c0 ? (c0) objI0 : null;
                        lVar.invoke(c0Var != null ? c0Var.f22236a : null);
                    }
                    return f2.f22359a;
                }
                d2 d2VarA = ((m1) objI0).a();
                if (d2VarA == null) {
                    kotlin.jvm.internal.p.c(objI0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    D0((x1) objI0);
                } else {
                    y0 y0Var = f2.f22359a;
                    if (z10 && (objI0 instanceof c)) {
                        synchronized (objI0) {
                            try {
                                thE = ((c) objI0).e();
                                if (thE == null || ((lVar instanceof v) && !((c) objI0).j())) {
                                    if (F(objI0, d2VarA, x1VarU0)) {
                                        if (thE == null) {
                                            return x1VarU0;
                                        }
                                        y0Var = x1VarU0;
                                    }
                                }
                                y8.s sVar = y8.s.f25199a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thE != null) {
                        if (z11) {
                            lVar.invoke(thE);
                        }
                        return y0Var;
                    }
                    if (F(objI0, d2VarA, x1VarU0)) {
                        break;
                    }
                }
            }
        }
        return x1VarU0;
    }

    public boolean f0() {
        return false;
    }

    @Override // kotlin.coroutines.d
    public Object fold(Object obj, l9.p pVar) {
        return r1.a.b(this, obj, pVar);
    }

    @Override // kotlinx.coroutines.w
    public final void g(h2 h2Var) throws Throwable {
        M(h2Var);
    }

    public final d2 g0(m1 m1Var) {
        d2 d2VarA = m1Var.a();
        if (d2VarA != null) {
            return d2VarA;
        }
        if (m1Var instanceof b1) {
            return new d2();
        }
        if (m1Var instanceof x1) {
            D0((x1) m1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + m1Var).toString());
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public d.b get(d.c cVar) {
        return r1.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c getKey() {
        return r1.H8;
    }

    @Override // kotlinx.coroutines.r1
    public r1 getParent() {
        u uVarH0 = h0();
        if (uVarH0 != null) {
            return uVarH0.getParent();
        }
        return null;
    }

    public final u h0() {
        return (u) f22706b.get(this);
    }

    public final Object i0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22705a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.v)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.v) obj).a(this);
        }
    }

    @Override // kotlinx.coroutines.r1
    public boolean isActive() {
        Object objI0 = i0();
        return (objI0 instanceof m1) && ((m1) objI0).isActive();
    }

    @Override // kotlinx.coroutines.r1
    public final boolean isCancelled() {
        Object objI0 = i0();
        if (objI0 instanceof c0) {
            return true;
        }
        return (objI0 instanceof c) && ((c) objI0).i();
    }

    public boolean l0(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.r1
    public final CancellationException m() {
        Object objI0 = i0();
        if (!(objI0 instanceof c)) {
            if (objI0 instanceof m1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objI0 instanceof c0) {
                return J0(this, ((c0) objI0).f22236a, null, 1, null);
            }
            return new JobCancellationException(l0.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objI0).e();
        if (thE != null) {
            CancellationException cancellationExceptionI0 = I0(thE, l0.a(this) + " is cancelling");
            if (cancellationExceptionI0 != null) {
                return cancellationExceptionI0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(d.c cVar) {
        return r1.a.e(this, cVar);
    }

    public final void n0(r1 r1Var) {
        if (r1Var == null) {
            F0(f2.f22359a);
            return;
        }
        r1Var.start();
        u uVarW = r1Var.W(this);
        F0(uVarW);
        if (d()) {
            uVarW.d();
            F0(f2.f22359a);
        }
    }

    public boolean o0() {
        return false;
    }

    public final boolean p0() {
        Object objI0;
        do {
            objI0 = i0();
            if (!(objI0 instanceof m1)) {
                return false;
            }
        } while (G0(objI0) < 0);
        return true;
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return r1.a.f(this, dVar);
    }

    public final Object q0(c9.c cVar) {
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        r.a(pVar, U(new j2(pVar)));
        Object objW = pVar.w();
        if (objW == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objW == kotlin.coroutines.intrinsics.a.f() ? objW : y8.s.f25199a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.h2
    public CancellationException r() {
        CancellationException cancellationExceptionE;
        Object objI0 = i0();
        if (objI0 instanceof c) {
            cancellationExceptionE = ((c) objI0).e();
        } else if (objI0 instanceof c0) {
            cancellationExceptionE = ((c0) objI0).f22236a;
        } else {
            if (objI0 instanceof m1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objI0).toString());
            }
            cancellationExceptionE = null;
        }
        CancellationException cancellationException = cancellationExceptionE instanceof CancellationException ? cancellationExceptionE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + H0(objI0), cancellationExceptionE, this);
    }

    public final Object r0(Object obj) throws Throwable {
        Throwable thY = null;
        while (true) {
            Object objI0 = i0();
            if (objI0 instanceof c) {
                synchronized (objI0) {
                    if (((c) objI0).k()) {
                        return z1.f22722d;
                    }
                    boolean zI = ((c) objI0).i();
                    if (obj != null || !zI) {
                        if (thY == null) {
                            thY = Y(obj);
                        }
                        ((c) objI0).b(thY);
                    }
                    Throwable thE = zI ? null : ((c) objI0).e();
                    if (thE != null) {
                        x0(((c) objI0).a(), thE);
                    }
                    return z1.f22719a;
                }
            }
            if (!(objI0 instanceof m1)) {
                return z1.f22722d;
            }
            if (thY == null) {
                thY = Y(obj);
            }
            m1 m1Var = (m1) objI0;
            if (!m1Var.isActive()) {
                Object objN0 = N0(objI0, new c0(thY, false, 2, null));
                if (objN0 == z1.f22719a) {
                    throw new IllegalStateException(("Cannot happen in " + objI0).toString());
                }
                if (objN0 != z1.f22721c) {
                    return objN0;
                }
            } else if (M0(m1Var, thY)) {
                return z1.f22719a;
            }
        }
    }

    public final boolean s0(Object obj) {
        Object objN0;
        do {
            objN0 = N0(i0(), obj);
            if (objN0 == z1.f22719a) {
                return false;
            }
            if (objN0 == z1.f22720b) {
                return true;
            }
        } while (objN0 == z1.f22721c);
        H(objN0);
        return true;
    }

    @Override // kotlinx.coroutines.r1
    public final boolean start() {
        int iG0;
        do {
            iG0 = G0(i0());
            if (iG0 == 0) {
                return false;
            }
        } while (iG0 != 1);
        return true;
    }

    @Override // kotlinx.coroutines.r1
    public final Object t(c9.c cVar) {
        if (p0()) {
            Object objQ0 = q0(cVar);
            return objQ0 == kotlin.coroutines.intrinsics.a.f() ? objQ0 : y8.s.f25199a;
        }
        u1.g(cVar.getContext());
        return y8.s.f25199a;
    }

    public final Object t0(Object obj) {
        Object objN0;
        do {
            objN0 = N0(i0(), obj);
            if (objN0 == z1.f22719a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, c0(obj));
            }
        } while (objN0 == z1.f22721c);
        return objN0;
    }

    public String toString() {
        return K0() + '@' + l0.b(this);
    }

    public final x1 u0(l9.l lVar, boolean z10) {
        x1 q1Var;
        if (z10) {
            q1Var = lVar instanceof s1 ? (s1) lVar : null;
            if (q1Var == null) {
                q1Var = new p1(lVar);
            }
        } else {
            q1Var = lVar instanceof x1 ? (x1) lVar : null;
            if (q1Var == null) {
                q1Var = new q1(lVar);
            }
        }
        q1Var.A(this);
        return q1Var;
    }

    public String v0() {
        return l0.a(this);
    }

    public final v w0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.t()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.p();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.o();
            if (!lockFreeLinkedListNode.t()) {
                if (lockFreeLinkedListNode instanceof v) {
                    return (v) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof d2) {
                    return null;
                }
            }
        }
    }

    public final void x0(d2 d2Var, Throwable th) throws Throwable {
        z0(th);
        Object objN = d2Var.n();
        kotlin.jvm.internal.p.c(objN, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeO = (LockFreeLinkedListNode) objN; !kotlin.jvm.internal.p.a(lockFreeLinkedListNodeO, d2Var); lockFreeLinkedListNodeO = lockFreeLinkedListNodeO.o()) {
            if (lockFreeLinkedListNodeO instanceof s1) {
                x1 x1Var = (x1) lockFreeLinkedListNodeO;
                try {
                    x1Var.y(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        y8.d.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + x1Var + " for " + this, th2);
                        y8.s sVar = y8.s.f25199a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            m0(completionHandlerException);
        }
        Q(th);
    }

    public final void y0(d2 d2Var, Throwable th) throws Throwable {
        Object objN = d2Var.n();
        kotlin.jvm.internal.p.c(objN, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeO = (LockFreeLinkedListNode) objN; !kotlin.jvm.internal.p.a(lockFreeLinkedListNodeO, d2Var); lockFreeLinkedListNodeO = lockFreeLinkedListNodeO.o()) {
            if (lockFreeLinkedListNodeO instanceof x1) {
                x1 x1Var = (x1) lockFreeLinkedListNodeO;
                try {
                    x1Var.y(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        y8.d.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + x1Var + " for " + this, th2);
                        y8.s sVar = y8.s.f25199a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            m0(completionHandlerException);
        }
    }

    public void z0(Throwable th) {
    }

    public void m0(Throwable th) throws Throwable {
        throw th;
    }
}
