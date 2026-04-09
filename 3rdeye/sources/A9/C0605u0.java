package A9;

import A9.InterfaceC0588l0;
import A9.InterfaceC0594o0;
import b9.C1992A;
import c9.C2096q;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* renamed from: A9.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0605u0 implements InterfaceC0594o0, G0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f274b = AtomicReferenceFieldUpdater.newUpdater(C0605u0.class, Object.class, "_state$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f275c = AtomicReferenceFieldUpdater.newUpdater(C0605u0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* compiled from: JobSupport.kt */
    /* renamed from: A9.u0$a */
    public static final class a<T> extends C0583j<T> {

        /* renamed from: j, reason: collision with root package name */
        public final C0605u0 f276j;

        public a(C0605u0 c0605u0, InterfaceC4347e interfaceC4347e) {
            super(1, interfaceC4347e);
            this.f276j = c0605u0;
        }

        @Override // A9.C0583j
        public final Throwable q(C0605u0 c0605u0) {
            Throwable thB;
            Object objL = this.f276j.L();
            return (!(objL instanceof c) || (thB = ((c) objL).b()) == null) ? objL instanceof C0602t ? ((C0602t) objL).f272a : c0605u0.A() : thB;
        }

        @Override // A9.C0583j
        public final String y() {
            return "AwaitContinuation";
        }
    }

    /* compiled from: JobSupport.kt */
    /* renamed from: A9.u0$b */
    public static final class b extends AbstractC0603t0 {

        /* renamed from: f, reason: collision with root package name */
        public final C0605u0 f277f;

        /* renamed from: g, reason: collision with root package name */
        public final c f278g;

        /* renamed from: h, reason: collision with root package name */
        public final C0593o f279h;
        public final Object i;

        public b(C0605u0 c0605u0, c cVar, C0593o c0593o, Object obj) {
            this.f277f = c0605u0;
            this.f278g = cVar;
            this.f279h = c0593o;
            this.i = obj;
        }

        @Override // A9.InterfaceC0588l0
        public final void a(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0605u0.f274b;
            C0605u0 c0605u0 = this.f277f;
            c0605u0.getClass();
            C0593o c0593oU = C0605u0.U(this.f279h);
            c cVar = this.f278g;
            Object obj = this.i;
            if (c0593oU != null) {
                while (C0572d0.d(c0593oU.f262f, false, new b(c0605u0, cVar, c0593oU, obj), 1) == E0.f187b) {
                    c0593oU = C0605u0.U(c0593oU);
                    if (c0593oU == null) {
                    }
                }
                return;
            }
            c0605u0.r(c0605u0.E(cVar, obj));
        }
    }

    /* compiled from: JobSupport.kt */
    /* renamed from: A9.u0$c */
    public static final class c implements InterfaceC0584j0 {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f280c = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f281d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f282e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: b, reason: collision with root package name */
        public final D0 f283b;

        public c(D0 d02, Throwable th) {
            this.f283b = d02;
            this._rootCause$volatile = th;
        }

        public final void a(Throwable th) {
            Throwable thB = b();
            if (thB == null) {
                f281d.set(this, th);
                return;
            }
            if (th == thB) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f282e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        public final Throwable b() {
            return (Throwable) f281d.get(this);
        }

        @Override // A9.InterfaceC0584j0
        public final D0 c() {
            return this.f283b;
        }

        public final boolean d() {
            return b() != null;
        }

        public final boolean e() {
            return f280c.get(this) != 0;
        }

        public final ArrayList f(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f282e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thB = b();
            if (thB != null) {
                arrayList.add(0, thB);
            }
            if (th != null && !th.equals(thB)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, A0.f179e);
            return arrayList;
        }

        @Override // A9.InterfaceC0584j0
        public final boolean isActive() {
            return b() == null;
        }

        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + f282e.get(this) + ", list=" + this.f283b + ']';
        }
    }

    /* compiled from: JobSupport.kt */
    /* renamed from: A9.u0$d */
    public final class d extends AbstractC0603t0 {

        /* renamed from: f, reason: collision with root package name */
        public final J9.c<?> f284f;

        public d(J9.c<?> cVar) {
            this.f284f = cVar;
        }

        @Override // A9.InterfaceC0588l0
        public final void a(Throwable th) {
            C0605u0 c0605u0 = C0605u0.this;
            Object objL = c0605u0.L();
            if (!(objL instanceof C0602t)) {
                objL = A0.b(objL);
            }
            this.f284f.d(c0605u0, objL);
        }
    }

    /* compiled from: JobSupport.kt */
    /* renamed from: A9.u0$e */
    public final class e extends AbstractC0603t0 {

        /* renamed from: f, reason: collision with root package name */
        public final J9.c<?> f286f;

        public e(J9.c<?> cVar) {
            this.f286f = cVar;
        }

        @Override // A9.InterfaceC0588l0
        public final void a(Throwable th) {
            this.f286f.d(C0605u0.this, C1992A.f18074a);
        }
    }

    public C0605u0(boolean z10) {
        this._state$volatile = z10 ? A0.f181g : A0.f180f;
    }

    public static C0593o U(F9.m mVar) {
        while (mVar.h()) {
            F9.m mVarD = mVar.d();
            if (mVarD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F9.m.f1769c;
                Object obj = atomicReferenceFieldUpdater.get(mVar);
                while (true) {
                    mVar = (F9.m) obj;
                    if (!mVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mVar);
                }
            } else {
                mVar = mVarD;
            }
        }
        while (true) {
            mVar = mVar.g();
            if (!mVar.h()) {
                if (mVar instanceof C0593o) {
                    return (C0593o) mVar;
                }
                if (mVar instanceof D0) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC0584j0 ? ((InterfaceC0584j0) obj).isActive() ? "Active" : "New" : obj instanceof C0602t ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.d() ? "Cancelling" : cVar.e() ? "Completing" : "Active";
    }

    @Override // A9.InterfaceC0594o0
    public final CancellationException A() {
        CancellationException c0596p0;
        Object objL = L();
        if (!(objL instanceof c)) {
            if (objL instanceof InterfaceC0584j0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objL instanceof C0602t)) {
                return new C0596p0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0602t) objL).f272a;
            c0596p0 = th instanceof CancellationException ? (CancellationException) th : null;
            return c0596p0 == null ? new C0596p0(x(), th, this) : c0596p0;
        }
        Throwable thB = ((c) objL).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        c0596p0 = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (c0596p0 == null) {
            if (strConcat == null) {
                strConcat = x();
            }
            c0596p0 = new C0596p0(strConcat, thB, this);
        }
        return c0596p0;
    }

    public final Throwable C(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C0596p0(x(), null, this) : th;
        }
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((G0) obj).v0();
    }

    public final Object E(c cVar, Object obj) {
        Throwable thH;
        C0602t c0602t = obj instanceof C0602t ? (C0602t) obj : null;
        Throwable th = c0602t != null ? c0602t.f272a : null;
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> arrayListF = cVar.f(th);
            thH = H(cVar, arrayListF);
            if (thH != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != thH && th2 != thH && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        b9.x.a(thH, th2);
                    }
                }
            }
        }
        if (thH != null && thH != th) {
            obj = new C0602t(false, thH);
        }
        if (thH != null && (w(thH) || M(thH))) {
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0602t.f271b.compareAndSet((C0602t) obj, 0, 1);
        }
        X(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f274b;
        Object c0586k0 = obj instanceof InterfaceC0584j0 ? new C0586k0((InterfaceC0584j0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, c0586k0) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        z(cVar, obj);
        return obj;
    }

    @Override // A9.InterfaceC0594o0
    public final W F(p9.l<? super Throwable, C1992A> lVar) {
        return P(false, true, new InterfaceC0588l0.a(lVar));
    }

    public final Object G() throws Throwable {
        Object objL = L();
        if (objL instanceof InterfaceC0584j0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objL instanceof C0602t) {
            throw ((C0602t) objL).f272a;
        }
        return A0.b(objL);
    }

    public final Throwable H(c cVar, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new C0596p0(x(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
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
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof O0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof O0)) {
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

    public boolean I() {
        return true;
    }

    public boolean J() {
        return this instanceof C0597q;
    }

    public final D0 K(InterfaceC0584j0 interfaceC0584j0) {
        D0 d0C = interfaceC0584j0.c();
        if (d0C != null) {
            return d0C;
        }
        if (interfaceC0584j0 instanceof Z) {
            return new D0();
        }
        if (interfaceC0584j0 instanceof AbstractC0603t0) {
            Z((AbstractC0603t0) interfaceC0584j0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0584j0).toString());
    }

    public final Object L() {
        while (true) {
            Object obj = f274b.get(this);
            if (!(obj instanceof F9.s)) {
                return obj;
            }
            ((F9.s) obj).a(this);
        }
    }

    public boolean M(Throwable th) {
        return false;
    }

    public final void O(InterfaceC0594o0 interfaceC0594o0) {
        E0 e02 = E0.f187b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f275c;
        if (interfaceC0594o0 == null) {
            atomicReferenceFieldUpdater.set(this, e02);
            return;
        }
        interfaceC0594o0.start();
        InterfaceC0591n interfaceC0591nK = interfaceC0594o0.k(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0591nK);
        if (L() instanceof InterfaceC0584j0) {
            return;
        }
        interfaceC0591nK.dispose();
        atomicReferenceFieldUpdater.set(this, e02);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final A9.W P(boolean r8, boolean r9, A9.InterfaceC0588l0 r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.C0605u0.P(boolean, boolean, A9.l0):A9.W");
    }

    public boolean Q() {
        return this instanceof C0571d;
    }

    public final boolean R(Object obj) {
        Object objC0;
        do {
            objC0 = c0(L(), obj);
            if (objC0 == A0.f175a) {
                return false;
            }
            if (objC0 == A0.f176b) {
                return true;
            }
        } while (objC0 == A0.f177c);
        return true;
    }

    public final Object S(Object obj) {
        Object objC0;
        do {
            objC0 = c0(L(), obj);
            if (objC0 == A0.f175a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0602t c0602t = obj instanceof C0602t ? (C0602t) obj : null;
                throw new IllegalStateException(str, c0602t != null ? c0602t.f272a : null);
            }
        } while (objC0 == A0.f177c);
        return objC0;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    public final void V(D0 d02, Throwable th) {
        Object objF = d02.f();
        kotlin.jvm.internal.l.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C0606v c0606v = null;
        for (F9.m mVarG = (F9.m) objF; !mVarG.equals(d02); mVarG = mVarG.g()) {
            if (mVarG instanceof AbstractC0598q0) {
                AbstractC0603t0 abstractC0603t0 = (AbstractC0603t0) mVarG;
                try {
                    abstractC0603t0.a(th);
                } catch (Throwable th2) {
                    if (c0606v != null) {
                        b9.x.a(c0606v, th2);
                    } else {
                        c0606v = new C0606v("Exception in completion handler " + abstractC0603t0 + " for " + this, th2);
                        C1992A c1992a = C1992A.f18074a;
                    }
                }
            }
        }
        if (c0606v != null) {
            N(c0606v);
        }
        w(th);
    }

    public final void Z(AbstractC0603t0 abstractC0603t0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        D0 d02 = new D0();
        abstractC0603t0.getClass();
        F9.m.f1769c.set(d02, abstractC0603t0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = F9.m.f1768b;
        atomicReferenceFieldUpdater2.set(d02, abstractC0603t0);
        loop0: while (true) {
            if (abstractC0603t0.f() == abstractC0603t0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0603t0, abstractC0603t0, d02)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC0603t0) != abstractC0603t0) {
                        break;
                    }
                }
                d02.e(abstractC0603t0);
                break loop0;
            }
            break;
        }
        F9.m mVarG = abstractC0603t0.g();
        do {
            atomicReferenceFieldUpdater = f274b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0603t0, mVarG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0603t0);
    }

    @Override // A9.InterfaceC0594o0
    public final C2096q a() {
        return new C2096q(new w0(this, null));
    }

    public final int a0(Object obj) {
        boolean z10 = obj instanceof Z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f274b;
        if (z10) {
            if (((Z) obj).f218b) {
                return 0;
            }
            Z z11 = A0.f181g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z11)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Y();
            return 1;
        }
        if (!(obj instanceof C0582i0)) {
            return 0;
        }
        D0 d02 = ((C0582i0) obj).f249b;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d02)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Y();
        return 1;
    }

    @Override // A9.InterfaceC0594o0
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0596p0(x(), null, this);
        }
        v(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.Throwable] */
    public final Object c0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0584j0)) {
            return A0.f175a;
        }
        if (((obj instanceof Z) || (obj instanceof AbstractC0603t0)) && !(obj instanceof C0593o) && !(obj2 instanceof C0602t)) {
            InterfaceC0584j0 interfaceC0584j0 = (InterfaceC0584j0) obj;
            Object c0586k0 = obj2 instanceof InterfaceC0584j0 ? new C0586k0((InterfaceC0584j0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f274b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0584j0, c0586k0)) {
                    X(obj2);
                    z(interfaceC0584j0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0584j0);
            return A0.f177c;
        }
        InterfaceC0584j0 interfaceC0584j02 = (InterfaceC0584j0) obj;
        D0 d0K = K(interfaceC0584j02);
        if (d0K == null) {
            return A0.f177c;
        }
        C0593o c0593oU = null;
        c cVar = interfaceC0584j02 instanceof c ? (c) interfaceC0584j02 : null;
        if (cVar == null) {
            cVar = new c(d0K, null);
        }
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        synchronized (cVar) {
            try {
                if (cVar.e()) {
                    return A0.f175a;
                }
                c.f280c.set(cVar, 1);
                if (cVar != interfaceC0584j02) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f274b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0584j02, cVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0584j02) {
                            return A0.f177c;
                        }
                    }
                }
                boolean zD = cVar.d();
                C0602t c0602t = obj2 instanceof C0602t ? (C0602t) obj2 : null;
                if (c0602t != null) {
                    cVar.a(c0602t.f272a);
                }
                ?? B10 = !zD ? cVar.b() : 0;
                wVar.f43660b = B10;
                C1992A c1992a = C1992A.f18074a;
                if (B10 != 0) {
                    V(d0K, B10);
                }
                C0593o c0593o = interfaceC0584j02 instanceof C0593o ? (C0593o) interfaceC0584j02 : null;
                if (c0593o == null) {
                    D0 d0C = interfaceC0584j02.c();
                    if (d0C != null) {
                        c0593oU = U(d0C);
                    }
                } else {
                    c0593oU = c0593o;
                }
                if (c0593oU != null) {
                    while (C0572d0.d(c0593oU.f262f, false, new b(this, cVar, c0593oU, obj2), 1) == E0.f187b) {
                        c0593oU = U(c0593oU);
                        if (c0593oU == null) {
                        }
                    }
                    return A0.f176b;
                }
                return E(cVar, obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object e() {
        return G();
    }

    @Override // f9.InterfaceC4350h
    public final <R> R fold(R r9, p9.p<? super R, ? super InterfaceC4350h.a, ? extends R> pVar) {
        return (R) InterfaceC4350h.a.C0456a.a(this, r9, pVar);
    }

    @Override // f9.InterfaceC4350h
    public final <E extends InterfaceC4350h.a> E get(InterfaceC4350h.b<E> bVar) {
        return (E) InterfaceC4350h.a.C0456a.b(this, bVar);
    }

    @Override // f9.InterfaceC4350h.a
    public final InterfaceC4350h.b<?> getKey() {
        return InterfaceC0594o0.a.f263b;
    }

    @Override // A9.InterfaceC0594o0
    public final InterfaceC0594o0 getParent() {
        InterfaceC0591n interfaceC0591n = (InterfaceC0591n) f275c.get(this);
        if (interfaceC0591n != null) {
            return interfaceC0591n.getParent();
        }
        return null;
    }

    @Override // A9.InterfaceC0594o0
    public boolean isActive() {
        Object objL = L();
        return (objL instanceof InterfaceC0584j0) && ((InterfaceC0584j0) objL).isActive();
    }

    @Override // A9.InterfaceC0594o0
    public final boolean isCancelled() {
        Object objL = L();
        if (objL instanceof C0602t) {
            return true;
        }
        return (objL instanceof c) && ((c) objL).d();
    }

    @Override // A9.InterfaceC0594o0
    public final InterfaceC0591n k(C0605u0 c0605u0) {
        W wD = C0572d0.d(this, true, new C0593o(c0605u0), 2);
        kotlin.jvm.internal.l.d(wD, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC0591n) wD;
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h minusKey(InterfaceC4350h.b<?> bVar) {
        return InterfaceC4350h.a.C0456a.c(this, bVar);
    }

    @Override // A9.InterfaceC0594o0
    public final W n(boolean z10, boolean z11, C0601s0 c0601s0) {
        return P(z10, z11, new InterfaceC0588l0.a(c0601s0));
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h plus(InterfaceC4350h interfaceC4350h) {
        return InterfaceC4350h.a.C0456a.d(this, interfaceC4350h);
    }

    public final boolean q(InterfaceC0584j0 interfaceC0584j0, D0 d02, AbstractC0603t0 abstractC0603t0) {
        char c10;
        C0607v0 c0607v0 = new C0607v0(abstractC0603t0, this, interfaceC0584j0);
        do {
            F9.m mVarD = d02.d();
            if (mVarD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F9.m.f1769c;
                Object obj = atomicReferenceFieldUpdater.get(d02);
                while (true) {
                    mVarD = (F9.m) obj;
                    if (!mVarD.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mVarD);
                }
            }
            F9.m.f1769c.set(abstractC0603t0, mVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = F9.m.f1768b;
            atomicReferenceFieldUpdater2.set(abstractC0603t0, d02);
            c0607v0.f1772c = d02;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(mVarD, d02, c0607v0)) {
                    c10 = c0607v0.a(mVarD) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(mVarD) != d02) {
                    c10 = 0;
                    break;
                }
            }
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    public boolean q0(Object obj) {
        return R(obj);
    }

    public void s(Object obj) {
        r(obj);
    }

    @Override // A9.InterfaceC0594o0
    public final boolean start() {
        int iA0;
        do {
            iA0 = a0(L());
            if (iA0 == 0) {
                return false;
            }
        } while (iA0 != 1);
        return true;
    }

    public final Object t(InterfaceC4347e<Object> interfaceC4347e) throws Throwable {
        Object objL;
        do {
            objL = L();
            if (!(objL instanceof InterfaceC0584j0)) {
                if (objL instanceof C0602t) {
                    throw ((C0602t) objL).f272a;
                }
                return A0.b(objL);
            }
        } while (a0(objL) < 0);
        a aVar = new a(this, com.google.gson.internal.c.r(interfaceC4347e));
        aVar.s();
        aVar.v(new X(C0572d0.d(this, false, new H0(aVar), 3)));
        Object objR = aVar.r();
        g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(T() + '{' + b0(L()) + '}');
        sb.append('@');
        sb.append(I.x(this));
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.C0605u0.u(java.lang.Object):boolean");
    }

    public void v(CancellationException cancellationException) {
        u(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // A9.G0
    public final CancellationException v0() {
        CancellationException cancellationExceptionB;
        Object objL = L();
        if (objL instanceof c) {
            cancellationExceptionB = ((c) objL).b();
        } else if (objL instanceof C0602t) {
            cancellationExceptionB = ((C0602t) objL).f272a;
        } else {
            if (objL instanceof InterfaceC0584j0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objL).toString());
            }
            cancellationExceptionB = null;
        }
        CancellationException cancellationException = cancellationExceptionB instanceof CancellationException ? cancellationExceptionB : null;
        return cancellationException == null ? new C0596p0("Parent job is ".concat(b0(objL)), cancellationExceptionB, this) : cancellationException;
    }

    public final boolean w(Throwable th) {
        if (!Q()) {
            boolean z10 = th instanceof CancellationException;
            InterfaceC0591n interfaceC0591n = (InterfaceC0591n) f275c.get(this);
            return (interfaceC0591n == null || interfaceC0591n == E0.f187b) ? z10 : interfaceC0591n.b(th) || z10;
        }
        return true;
    }

    @Override // A9.InterfaceC0594o0
    public final Object w0(h9.c cVar) {
        Object objL;
        do {
            objL = L();
            if (!(objL instanceof InterfaceC0584j0)) {
                C0572d0.c(cVar.getContext());
                return C1992A.f18074a;
            }
        } while (a0(objL) < 0);
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(cVar));
        c0583j.s();
        c0583j.v(new X(C0572d0.d(this, false, new I0(c0583j), 3)));
        Object objR = c0583j.r();
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        if (objR != aVar) {
            objR = C1992A.f18074a;
        }
        return objR == aVar ? objR : C1992A.f18074a;
    }

    public String x() {
        return "Job was cancelled";
    }

    public boolean y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return u(th) && I();
    }

    public final void z(InterfaceC0584j0 interfaceC0584j0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f275c;
        InterfaceC0591n interfaceC0591n = (InterfaceC0591n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0591n != null) {
            interfaceC0591n.dispose();
            atomicReferenceFieldUpdater.set(this, E0.f187b);
        }
        C0606v c0606v = null;
        C0602t c0602t = obj instanceof C0602t ? (C0602t) obj : null;
        Throwable th = c0602t != null ? c0602t.f272a : null;
        if (interfaceC0584j0 instanceof AbstractC0603t0) {
            try {
                ((AbstractC0603t0) interfaceC0584j0).a(th);
                return;
            } catch (Throwable th2) {
                N(new C0606v("Exception in completion handler " + interfaceC0584j0 + " for " + this, th2));
                return;
            }
        }
        D0 d0C = interfaceC0584j0.c();
        if (d0C != null) {
            Object objF = d0C.f();
            kotlin.jvm.internal.l.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (F9.m mVarG = (F9.m) objF; !mVarG.equals(d0C); mVarG = mVarG.g()) {
                if (mVarG instanceof AbstractC0603t0) {
                    AbstractC0603t0 abstractC0603t0 = (AbstractC0603t0) mVarG;
                    try {
                        abstractC0603t0.a(th);
                    } catch (Throwable th3) {
                        if (c0606v != null) {
                            b9.x.a(c0606v, th3);
                        } else {
                            c0606v = new C0606v("Exception in completion handler " + abstractC0603t0 + " for " + this, th3);
                            C1992A c1992a = C1992A.f18074a;
                        }
                    }
                }
            }
            if (c0606v != null) {
                N(c0606v);
            }
        }
    }

    public void Y() {
    }

    public void N(C0606v c0606v) {
        throw c0606v;
    }

    public void X(Object obj) {
    }

    public void r(Object obj) {
    }
}
