package Ii;

import Ii.InterfaceC3091y0;
import Ni.C3412n;
import Yg.AbstractC3663g;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import zi.AbstractC8782l;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public class D0 implements InterfaceC3091y0, InterfaceC3086w, M0 {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9238a = AtomicReferenceFieldUpdater.newUpdater(D0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9239b = AtomicReferenceFieldUpdater.newUpdater(D0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    private static final class a extends C3073p {

        /* renamed from: i, reason: collision with root package name */
        private final D0 f9240i;

        public a(InterfaceC5380e interfaceC5380e, D0 d02) {
            super(interfaceC5380e, 1);
            this.f9240i = d02;
        }

        @Override // Ii.C3073p
        protected String H() {
            return "AwaitContinuation";
        }

        @Override // Ii.C3073p
        public Throwable s(InterfaceC3091y0 interfaceC3091y0) {
            Throwable thE;
            Object objY = this.f9240i.Y();
            return (!(objY instanceof c) || (thE = ((c) objY).e()) == null) ? objY instanceof C ? ((C) objY).f9236a : interfaceC3091y0.getCancellationException() : thE;
        }
    }

    private static final class b extends C0 {

        /* renamed from: e, reason: collision with root package name */
        private final D0 f9241e;

        /* renamed from: f, reason: collision with root package name */
        private final c f9242f;

        /* renamed from: g, reason: collision with root package name */
        private final C3084v f9243g;

        /* renamed from: h, reason: collision with root package name */
        private final Object f9244h;

        public b(D0 d02, c cVar, C3084v c3084v, Object obj) {
            this.f9241e = d02;
            this.f9242f = cVar;
            this.f9243g = c3084v;
            this.f9244h = obj;
        }

        @Override // Ii.C0
        public boolean u() {
            return false;
        }

        @Override // Ii.C0
        public void v(Throwable th2) {
            this.f9241e.L(this.f9242f, this.f9243g, this.f9244h);
        }
    }

    private static final class c implements InterfaceC3083u0 {

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f9245b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f9246c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f9247d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name */
        private final I0 f9248a;

        public c(I0 i02, boolean z10, Throwable th2) {
            this.f9248a = i02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f9247d.get(this);
        }

        private final void n(Object obj) {
            f9247d.set(this, obj);
        }

        public final void a(Throwable th2) {
            Throwable thE = e();
            if (thE == null) {
                o(th2);
                return;
            }
            if (th2 == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                n(th2);
                return;
            }
            if (objD instanceof Throwable) {
                if (th2 == objD) {
                    return;
                }
                ArrayList arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th2);
                n(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        @Override // Ii.InterfaceC3083u0
        public I0 b() {
            return this.f9248a;
        }

        public final Throwable e() {
            return (Throwable) f9246c.get(this);
        }

        public final boolean i() {
            return e() != null;
        }

        @Override // Ii.InterfaceC3083u0
        public boolean isActive() {
            return e() == null;
        }

        public final boolean j() {
            return f9245b.get(this) == 1;
        }

        public final boolean k() {
            return d() == E0.f9263e;
        }

        public final List l(Throwable th2) {
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
            if (th2 != null && !AbstractC6492s.d(th2, thE)) {
                arrayListC.add(th2);
            }
            n(E0.f9263e);
            return arrayListC;
        }

        public final void m(boolean z10) {
            f9245b.set(this, z10 ? 1 : 0);
        }

        public final void o(Throwable th2) {
            f9246c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }
    }

    private final class d extends C0 {
        public d(Si.e eVar) {
        }

        @Override // Ii.C0
        public boolean u() {
            return false;
        }

        @Override // Ii.C0
        public void v(Throwable th2) {
            Object objY = D0.this.Y();
            if (!(objY instanceof C)) {
                E0.h(objY);
            }
            throw null;
        }
    }

    private final class e extends C0 {
        public e(Si.e eVar) {
        }

        @Override // Ii.C0
        public boolean u() {
            return false;
        }

        @Override // Ii.C0
        public void v(Throwable th2) {
            Yg.J j10 = Yg.J.f24997a;
            throw null;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        Object f9251b;

        /* renamed from: c, reason: collision with root package name */
        Object f9252c;

        /* renamed from: d, reason: collision with root package name */
        int f9253d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f9254e;

        f(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            f fVar = D0.this.new f(interfaceC5380e);
            fVar.f9254e = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r6.f9253d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f9252c
                Ni.n r1 = (Ni.C3412n) r1
                java.lang.Object r3 = r6.f9251b
                Ni.m r3 = (Ni.AbstractC3411m) r3
                java.lang.Object r4 = r6.f9254e
                zi.l r4 = (zi.AbstractC8782l) r4
                Yg.v.b(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                Yg.v.b(r7)
                goto L86
            L2a:
                Yg.v.b(r7)
                java.lang.Object r7 = r6.f9254e
                zi.l r7 = (zi.AbstractC8782l) r7
                Ii.D0 r1 = Ii.D0.this
                java.lang.Object r1 = r1.Y()
                boolean r4 = r1 instanceof Ii.C3084v
                if (r4 == 0) goto L48
                Ii.v r1 = (Ii.C3084v) r1
                Ii.w r1 = r1.f9358e
                r6.f9253d = r3
                java.lang.Object r7 = r7.d(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof Ii.InterfaceC3083u0
                if (r3 == 0) goto L86
                Ii.u0 r1 = (Ii.InterfaceC3083u0) r1
                Ii.I0 r1 = r1.b()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.AbstractC6492s.g(r3, r4)
                Ni.n r3 = (Ni.C3412n) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.AbstractC6492s.d(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof Ii.C3084v
                if (r7 == 0) goto L81
                r7 = r1
                Ii.v r7 = (Ii.C3084v) r7
                Ii.w r7 = r7.f9358e
                r6.f9254e = r4
                r6.f9251b = r3
                r6.f9252c = r1
                r6.f9253d = r2
                java.lang.Object r7 = r4.d(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                Ni.n r1 = r1.k()
                goto L63
            L86:
                Yg.J r7 = Yg.J.f24997a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Ii.D0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC8782l abstractC8782l, InterfaceC5380e interfaceC5380e) {
            return ((f) create(abstractC8782l, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* synthetic */ class g extends C6490p implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final g f9256a = new g();

        g() {
            super(3, D0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(D0 d02, Si.e eVar, Object obj) {
            d02.t0(eVar, obj);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            AbstractC5487d.a(obj2);
            a((D0) obj, null, obj3);
            return Yg.J.f24997a;
        }
    }

    /* synthetic */ class h extends C6490p implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final h f9257a = new h();

        h() {
            super(3, D0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // mh.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object s(D0 d02, Object obj, Object obj2) {
            return d02.s0(obj, obj2);
        }
    }

    /* synthetic */ class i extends C6490p implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final i f9258a = new i();

        i() {
            super(3, D0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(D0 d02, Si.e eVar, Object obj) {
            d02.z0(eVar, obj);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            AbstractC5487d.a(obj2);
            a((D0) obj, null, obj3);
            return Yg.J.f24997a;
        }
    }

    public D0(boolean z10) {
        this._state$volatile = z10 ? E0.f9265g : E0.f9264f;
    }

    private final int D0(Object obj) {
        if (obj instanceof C3058h0) {
            if (((C3058h0) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f9238a, this, obj, E0.f9265g)) {
                return -1;
            }
            w0();
            return 1;
        }
        if (!(obj instanceof C3081t0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f9238a, this, obj, ((C3081t0) obj).b())) {
            return -1;
        }
        w0();
        return 1;
    }

    private final String E0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC3083u0 ? ((InterfaceC3083u0) obj).isActive() ? "Active" : "New" : obj instanceof C ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.i() ? "Cancelling" : cVar.j() ? "Completing" : "Active";
    }

    private final Object F(Object obj) {
        Object objK0;
        do {
            Object objY = Y();
            if (!(objY instanceof InterfaceC3083u0) || ((objY instanceof c) && ((c) objY).j())) {
                return E0.f9259a;
            }
            objK0 = K0(objY, new C(M(obj), false, 2, null));
        } while (objK0 == E0.f9261c);
        return objK0;
    }

    private final boolean G(Throwable th2) {
        if (i0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        InterfaceC3082u interfaceC3082uX = X();
        return (interfaceC3082uX == null || interfaceC3082uX == K0.f9274a) ? z10 : interfaceC3082uX.a(th2) || z10;
    }

    public static /* synthetic */ CancellationException G0(D0 d02, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return d02.F0(th2, str);
    }

    private final boolean I0(InterfaceC3083u0 interfaceC3083u0, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f9238a, this, interfaceC3083u0, E0.g(obj))) {
            return false;
        }
        u0(null);
        v0(obj);
        K(interfaceC3083u0, obj);
        return true;
    }

    private final boolean J0(InterfaceC3083u0 interfaceC3083u0, Throwable th2) throws Throwable {
        I0 i0W = W(interfaceC3083u0);
        if (i0W == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f9238a, this, interfaceC3083u0, new c(i0W, false, th2))) {
            return false;
        }
        q0(i0W, th2);
        return true;
    }

    private final void K(InterfaceC3083u0 interfaceC3083u0, Object obj) throws Throwable {
        InterfaceC3082u interfaceC3082uX = X();
        if (interfaceC3082uX != null) {
            interfaceC3082uX.dispose();
            B0(K0.f9274a);
        }
        C c10 = obj instanceof C ? (C) obj : null;
        Throwable th2 = c10 != null ? c10.f9236a : null;
        if (!(interfaceC3083u0 instanceof C0)) {
            I0 i0B = interfaceC3083u0.b();
            if (i0B != null) {
                r0(i0B, th2);
                return;
            }
            return;
        }
        try {
            ((C0) interfaceC3083u0).v(th2);
        } catch (Throwable th3) {
            e0(new CompletionHandlerException("Exception in completion handler " + interfaceC3083u0 + " for " + this, th3));
        }
    }

    private final Object K0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC3083u0) ? E0.f9259a : ((!(obj instanceof C3058h0) && !(obj instanceof C0)) || (obj instanceof C3084v) || (obj2 instanceof C)) ? L0((InterfaceC3083u0) obj, obj2) : I0((InterfaceC3083u0) obj, obj2) ? obj2 : E0.f9261c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(c cVar, C3084v c3084v, Object obj) {
        C3084v c3084vP0 = p0(c3084v);
        if (c3084vP0 == null || !M0(cVar, c3084vP0, obj)) {
            cVar.b().f(2);
            C3084v c3084vP02 = p0(c3084v);
            if (c3084vP02 == null || !M0(cVar, c3084vP02, obj)) {
                w(N(cVar, obj));
            }
        }
    }

    private final Object L0(InterfaceC3083u0 interfaceC3083u0, Object obj) throws Throwable {
        I0 i0W = W(interfaceC3083u0);
        if (i0W == null) {
            return E0.f9261c;
        }
        c cVar = interfaceC3083u0 instanceof c ? (c) interfaceC3083u0 : null;
        if (cVar == null) {
            cVar = new c(i0W, false, null);
        }
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        synchronized (cVar) {
            if (cVar.j()) {
                return E0.f9259a;
            }
            cVar.m(true);
            if (cVar != interfaceC3083u0 && !androidx.concurrent.futures.b.a(f9238a, this, interfaceC3083u0, cVar)) {
                return E0.f9261c;
            }
            boolean zI = cVar.i();
            C c10 = obj instanceof C ? (C) obj : null;
            if (c10 != null) {
                cVar.a(c10.f9236a);
            }
            Throwable thE = zI ? null : cVar.e();
            n10.f51689a = thE;
            Yg.J j10 = Yg.J.f24997a;
            if (thE != null) {
                q0(i0W, thE);
            }
            C3084v c3084vP0 = p0(i0W);
            if (c3084vP0 != null && M0(cVar, c3084vP0, obj)) {
                return E0.f9260b;
            }
            i0W.f(2);
            C3084v c3084vP02 = p0(i0W);
            return (c3084vP02 == null || !M0(cVar, c3084vP02, obj)) ? N(cVar, obj) : E0.f9260b;
        }
    }

    private final Throwable M(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(H(), null, this) : th2;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((M0) obj).d0();
    }

    private final boolean M0(c cVar, C3084v c3084v, Object obj) {
        while (A0.n(c3084v.f9358e, false, new b(this, cVar, c3084v, obj)) == K0.f9274a) {
            c3084v = p0(c3084v);
            if (c3084v == null) {
                return false;
            }
        }
        return true;
    }

    private final Object N(c cVar, Object obj) throws Throwable {
        boolean zI;
        Throwable thQ;
        C c10 = obj instanceof C ? (C) obj : null;
        Throwable th2 = c10 != null ? c10.f9236a : null;
        synchronized (cVar) {
            zI = cVar.i();
            List listL = cVar.l(th2);
            thQ = Q(cVar, listL);
            if (thQ != null) {
                u(thQ, listL);
            }
        }
        if (thQ != null && thQ != th2) {
            obj = new C(thQ, false, 2, null);
        }
        if (thQ != null && (G(thQ) || c0(thQ))) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C) obj).c();
        }
        if (!zI) {
            u0(thQ);
        }
        v0(obj);
        androidx.concurrent.futures.b.a(f9238a, this, cVar, E0.g(obj));
        K(cVar, obj);
        return obj;
    }

    private final Throwable P(Object obj) {
        C c10 = obj instanceof C ? (C) obj : null;
        if (c10 != null) {
            return c10.f9236a;
        }
        return null;
    }

    private final Throwable Q(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.i()) {
                return new JobCancellationException(H(), null, this);
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
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final I0 W(InterfaceC3083u0 interfaceC3083u0) {
        I0 i0B = interfaceC3083u0.b();
        if (i0B != null) {
            return i0B;
        }
        if (interfaceC3083u0 instanceof C3058h0) {
            return new I0();
        }
        if (interfaceC3083u0 instanceof C0) {
            y0((C0) interfaceC3083u0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC3083u0).toString());
    }

    private final boolean j0() {
        Object objY;
        do {
            objY = Y();
            if (!(objY instanceof InterfaceC3083u0)) {
                return false;
            }
        } while (D0(objY) < 0);
        return true;
    }

    private final Object k0(InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        r.a(c3073p, B0.o(this, false, new O0(c3073p), 1, null));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : Yg.J.f24997a;
    }

    private final Object l0(Object obj) throws Throwable {
        Throwable thM = null;
        while (true) {
            Object objY = Y();
            if (objY instanceof c) {
                synchronized (objY) {
                    if (((c) objY).k()) {
                        return E0.f9262d;
                    }
                    boolean zI = ((c) objY).i();
                    if (obj != null || !zI) {
                        if (thM == null) {
                            thM = M(obj);
                        }
                        ((c) objY).a(thM);
                    }
                    Throwable thE = zI ? null : ((c) objY).e();
                    if (thE != null) {
                        q0(((c) objY).b(), thE);
                    }
                    return E0.f9259a;
                }
            }
            if (!(objY instanceof InterfaceC3083u0)) {
                return E0.f9262d;
            }
            if (thM == null) {
                thM = M(obj);
            }
            InterfaceC3083u0 interfaceC3083u0 = (InterfaceC3083u0) objY;
            if (!interfaceC3083u0.isActive()) {
                Object objK0 = K0(objY, new C(thM, false, 2, null));
                if (objK0 == E0.f9259a) {
                    throw new IllegalStateException(("Cannot happen in " + objY).toString());
                }
                if (objK0 != E0.f9261c) {
                    return objK0;
                }
            } else if (J0(interfaceC3083u0, thM)) {
                return E0.f9259a;
            }
        }
    }

    private final C3084v p0(C3412n c3412n) {
        while (c3412n.p()) {
            c3412n = c3412n.l();
        }
        while (true) {
            c3412n = c3412n.k();
            if (!c3412n.p()) {
                if (c3412n instanceof C3084v) {
                    return (C3084v) c3412n;
                }
                if (c3412n instanceof I0) {
                    return null;
                }
            }
        }
    }

    private final void q0(I0 i02, Throwable th2) throws Throwable {
        u0(th2);
        i02.f(4);
        Object objJ = i02.j();
        AbstractC6492s.g(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (C3412n c3412nK = (C3412n) objJ; !AbstractC6492s.d(c3412nK, i02); c3412nK = c3412nK.k()) {
            if ((c3412nK instanceof C0) && ((C0) c3412nK).u()) {
                try {
                    ((C0) c3412nK).v(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        AbstractC3663g.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c3412nK + " for " + this, th3);
                        Yg.J j10 = Yg.J.f24997a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            e0(completionHandlerException);
        }
        G(th2);
    }

    private final void r0(I0 i02, Throwable th2) throws Throwable {
        i02.f(1);
        Object objJ = i02.j();
        AbstractC6492s.g(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (C3412n c3412nK = (C3412n) objJ; !AbstractC6492s.d(c3412nK, i02); c3412nK = c3412nK.k()) {
            if (c3412nK instanceof C0) {
                try {
                    ((C0) c3412nK).v(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        AbstractC3663g.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c3412nK + " for " + this, th3);
                        Yg.J j10 = Yg.J.f24997a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            e0(completionHandlerException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s0(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof C) {
            throw ((C) obj2).f9236a;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(Si.e eVar, Object obj) {
        Object objY;
        do {
            objY = Y();
            if (!(objY instanceof InterfaceC3083u0)) {
                if (!(objY instanceof C)) {
                    objY = E0.h(objY);
                }
                eVar.b(objY);
                return;
            }
        } while (D0(objY) < 0);
        eVar.a(B0.o(this, false, new d(eVar), 1, null));
    }

    private final void u(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                AbstractC3663g.a(th2, th3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [Ii.t0] */
    private final void x0(C3058h0 c3058h0) {
        I0 i02 = new I0();
        if (!c3058h0.isActive()) {
            i02 = new C3081t0(i02);
        }
        androidx.concurrent.futures.b.a(f9238a, this, c3058h0, i02);
    }

    private final void y0(C0 c02) {
        c02.e(new I0());
        androidx.concurrent.futures.b.a(f9238a, this, c02, c02.k());
    }

    private final Object z(InterfaceC5380e interfaceC5380e) {
        a aVar = new a(AbstractC5467b.d(interfaceC5380e), this);
        aVar.A();
        r.a(aVar, B0.o(this, false, new N0(aVar), 1, null));
        Object objU = aVar.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(Si.e eVar, Object obj) {
        if (j0()) {
            eVar.a(B0.o(this, false, new e(eVar), 1, null));
        } else {
            eVar.b(Yg.J.f24997a);
        }
    }

    public final boolean A(Throwable th2) {
        return D(th2);
    }

    public final void A0(C0 c02) {
        Object objY;
        do {
            objY = Y();
            if (!(objY instanceof C0)) {
                if (!(objY instanceof InterfaceC3083u0) || ((InterfaceC3083u0) objY).b() == null) {
                    return;
                }
                c02.q();
                return;
            }
            if (objY != c02) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f9238a, this, objY, E0.f9265g));
    }

    public final void B0(InterfaceC3082u interfaceC3082u) {
        f9239b.set(this, interfaceC3082u);
    }

    public final boolean D(Object obj) throws Throwable {
        Object objL0 = E0.f9259a;
        if (V() && (objL0 = F(obj)) == E0.f9260b) {
            return true;
        }
        if (objL0 == E0.f9259a) {
            objL0 = l0(obj);
        }
        if (objL0 == E0.f9259a || objL0 == E0.f9260b) {
            return true;
        }
        if (objL0 == E0.f9262d) {
            return false;
        }
        w(objL0);
        return true;
    }

    public void E(Throwable th2) throws Throwable {
        D(th2);
    }

    protected final CancellationException F0(Throwable th2, String str) {
        CancellationException jobCancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = H();
            }
            jobCancellationException = new JobCancellationException(str, th2, this);
        }
        return jobCancellationException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String H() {
        return "Job was cancelled";
    }

    public final String H0() {
        return o0() + '{' + E0(Y()) + '}';
    }

    public boolean I(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return D(th2) && R();
    }

    public final Object O() throws Throwable {
        Object objY = Y();
        if (objY instanceof InterfaceC3083u0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objY instanceof C) {
            throw ((C) objY).f9236a;
        }
        return E0.h(objY);
    }

    public boolean R() {
        return true;
    }

    protected final Si.c U() {
        g gVar = g.f9256a;
        AbstractC6492s.g(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        mh.q qVar = (mh.q) kotlin.jvm.internal.V.f(gVar, 3);
        h hVar = h.f9257a;
        AbstractC6492s.g(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new Si.d(this, qVar, (mh.q) kotlin.jvm.internal.V.f(hVar, 3), null, 8, null);
    }

    public boolean V() {
        return false;
    }

    public final InterfaceC3082u X() {
        return (InterfaceC3082u) f9239b.get(this);
    }

    public final Object Y() {
        return f9238a.get(this);
    }

    @Override // Ii.InterfaceC3091y0
    public final InterfaceC3082u attachChild(InterfaceC3086w interfaceC3086w) {
        C3084v c3084v = new C3084v(interfaceC3086w);
        c3084v.w(this);
        while (true) {
            Object objY = Y();
            if (objY instanceof C3058h0) {
                C3058h0 c3058h0 = (C3058h0) objY;
                if (!c3058h0.isActive()) {
                    x0(c3058h0);
                } else if (androidx.concurrent.futures.b.a(f9238a, this, objY, c3084v)) {
                    break;
                }
            } else {
                if (!(objY instanceof InterfaceC3083u0)) {
                    Object objY2 = Y();
                    C c10 = objY2 instanceof C ? (C) objY2 : null;
                    c3084v.v(c10 != null ? c10.f9236a : null);
                    return K0.f9274a;
                }
                I0 i0B = ((InterfaceC3083u0) objY).b();
                if (i0B == null) {
                    AbstractC6492s.g(objY, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    y0((C0) objY);
                } else if (!i0B.c(c3084v, 7)) {
                    boolean zC = i0B.c(c3084v, 3);
                    Object objY3 = Y();
                    if (objY3 instanceof c) {
                        thE = ((c) objY3).e();
                    } else {
                        C c11 = objY3 instanceof C ? (C) objY3 : null;
                        if (c11 != null) {
                            thE = c11.f9236a;
                        }
                    }
                    c3084v.v(thE);
                    if (!zC) {
                        return K0.f9274a;
                    }
                }
            }
        }
        return c3084v;
    }

    protected boolean c0(Throwable th2) {
        return false;
    }

    @Override // Ii.InterfaceC3091y0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // Ii.M0
    public CancellationException d0() {
        CancellationException cancellationExceptionE;
        Object objY = Y();
        if (objY instanceof c) {
            cancellationExceptionE = ((c) objY).e();
        } else if (objY instanceof C) {
            cancellationExceptionE = ((C) objY).f9236a;
        } else {
            if (objY instanceof InterfaceC3083u0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objY).toString());
            }
            cancellationExceptionE = null;
        }
        CancellationException cancellationException = cancellationExceptionE instanceof CancellationException ? cancellationExceptionE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + E0(objY), cancellationExceptionE, this);
    }

    public void e0(Throwable th2) throws Throwable {
        throw th2;
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return InterfaceC3091y0.a.c(this, obj, interfaceC6839p);
    }

    protected final void g0(InterfaceC3091y0 interfaceC3091y0) {
        if (interfaceC3091y0 == null) {
            B0(K0.f9274a);
            return;
        }
        interfaceC3091y0.start();
        InterfaceC3082u interfaceC3082uAttachChild = interfaceC3091y0.attachChild(this);
        B0(interfaceC3082uAttachChild);
        if (isCompleted()) {
            interfaceC3082uAttachChild.dispose();
            B0(K0.f9274a);
        }
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return InterfaceC3091y0.a.d(this, cVar);
    }

    @Override // Ii.InterfaceC3091y0
    public final CancellationException getCancellationException() {
        Object objY = Y();
        if (!(objY instanceof c)) {
            if (objY instanceof InterfaceC3083u0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objY instanceof C) {
                return G0(this, ((C) objY).f9236a, null, 1, null);
            }
            return new JobCancellationException(S.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objY).e();
        if (thE != null) {
            CancellationException cancellationExceptionF0 = F0(thE, S.a(this) + " is cancelling");
            if (cancellationExceptionF0 != null) {
                return cancellationExceptionF0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // Ii.InterfaceC3091y0
    public final InterfaceC8780j getChildren() {
        return AbstractC8783m.b(new f(null));
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objY = Y();
        if (objY instanceof InterfaceC3083u0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return P(objY);
    }

    @Override // dh.InterfaceC5384i.b
    public final InterfaceC5384i.c getKey() {
        return InterfaceC3091y0.f9363O;
    }

    @Override // Ii.InterfaceC3091y0
    public final Si.a getOnJoin() {
        i iVar = i.f9258a;
        AbstractC6492s.g(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new Si.b(this, (mh.q) kotlin.jvm.internal.V.f(iVar, 3), null, 4, null);
    }

    @Override // Ii.InterfaceC3091y0
    public InterfaceC3091y0 getParent() {
        InterfaceC3082u interfaceC3082uX = X();
        if (interfaceC3082uX != null) {
            return interfaceC3082uX.getParent();
        }
        return null;
    }

    @Override // Ii.InterfaceC3086w
    public final void h(M0 m02) throws Throwable {
        D(m02);
    }

    public final InterfaceC3052e0 h0(boolean z10, C0 c02) {
        boolean z11;
        boolean zC;
        c02.w(this);
        while (true) {
            Object objY = Y();
            z11 = true;
            if (!(objY instanceof C3058h0)) {
                if (!(objY instanceof InterfaceC3083u0)) {
                    z11 = false;
                    break;
                }
                InterfaceC3083u0 interfaceC3083u0 = (InterfaceC3083u0) objY;
                I0 i0B = interfaceC3083u0.b();
                if (i0B == null) {
                    AbstractC6492s.g(objY, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    y0((C0) objY);
                } else {
                    if (c02.u()) {
                        c cVar = interfaceC3083u0 instanceof c ? (c) interfaceC3083u0 : null;
                        Throwable thE = cVar != null ? cVar.e() : null;
                        if (thE != null) {
                            if (z10) {
                                c02.v(thE);
                            }
                            return K0.f9274a;
                        }
                        zC = i0B.c(c02, 5);
                    } else {
                        zC = i0B.c(c02, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                C3058h0 c3058h0 = (C3058h0) objY;
                if (!c3058h0.isActive()) {
                    x0(c3058h0);
                } else if (androidx.concurrent.futures.b.a(f9238a, this, objY, c02)) {
                    break;
                }
            }
        }
        if (z11) {
            return c02;
        }
        if (z10) {
            Object objY2 = Y();
            C c10 = objY2 instanceof C ? (C) objY2 : null;
            c02.v(c10 != null ? c10.f9236a : null);
        }
        return K0.f9274a;
    }

    protected boolean i0() {
        return false;
    }

    @Override // Ii.InterfaceC3091y0
    public final InterfaceC3052e0 invokeOnCompletion(InterfaceC6835l interfaceC6835l) {
        return h0(true, new C3089x0(interfaceC6835l));
    }

    @Override // Ii.InterfaceC3091y0
    public boolean isActive() {
        Object objY = Y();
        return (objY instanceof InterfaceC3083u0) && ((InterfaceC3083u0) objY).isActive();
    }

    @Override // Ii.InterfaceC3091y0
    public final boolean isCancelled() {
        Object objY = Y();
        return (objY instanceof C) || ((objY instanceof c) && ((c) objY).i());
    }

    @Override // Ii.InterfaceC3091y0
    public final boolean isCompleted() {
        return !(Y() instanceof InterfaceC3083u0);
    }

    @Override // Ii.InterfaceC3091y0
    public final Object join(InterfaceC5380e interfaceC5380e) {
        if (j0()) {
            Object objK0 = k0(interfaceC5380e);
            return objK0 == AbstractC5467b.g() ? objK0 : Yg.J.f24997a;
        }
        A0.l(interfaceC5380e.getContext());
        return Yg.J.f24997a;
    }

    public final boolean m0(Object obj) {
        Object objK0;
        do {
            objK0 = K0(Y(), obj);
            if (objK0 == E0.f9259a) {
                return false;
            }
            if (objK0 == E0.f9260b) {
                return true;
            }
        } while (objK0 == E0.f9261c);
        w(objK0);
        return true;
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return InterfaceC3091y0.a.e(this, cVar);
    }

    public final Object n0(Object obj) {
        Object objK0;
        do {
            objK0 = K0(Y(), obj);
            if (objK0 == E0.f9259a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, P(obj));
            }
        } while (objK0 == E0.f9261c);
        return objK0;
    }

    public String o0() {
        return S.a(this);
    }

    @Override // Ii.InterfaceC3091y0
    public InterfaceC3091y0 plus(InterfaceC3091y0 interfaceC3091y0) {
        return InterfaceC3091y0.a.f(this, interfaceC3091y0);
    }

    @Override // Ii.InterfaceC3091y0
    public final boolean start() {
        int iD0;
        do {
            iD0 = D0(Y());
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    public String toString() {
        return H0() + '@' + S.b(this);
    }

    protected void u0(Throwable th2) {
    }

    protected void v0(Object obj) {
    }

    protected void w(Object obj) {
    }

    protected void w0() {
    }

    protected final Object x(InterfaceC5380e interfaceC5380e) throws Throwable {
        Object objY;
        do {
            objY = Y();
            if (!(objY instanceof InterfaceC3083u0)) {
                if (objY instanceof C) {
                    throw ((C) objY).f9236a;
                }
                return E0.h(objY);
            }
        } while (D0(objY) < 0);
        return z(interfaceC5380e);
    }

    @Override // Ii.InterfaceC3091y0
    public /* synthetic */ boolean cancel(Throwable th2) throws Throwable {
        Throwable jobCancellationException;
        if (th2 == null || (jobCancellationException = G0(this, th2, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(H(), null, this);
        }
        E(jobCancellationException);
        return true;
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return InterfaceC3091y0.a.g(this, interfaceC5384i);
    }

    @Override // Ii.InterfaceC3091y0
    public final InterfaceC3052e0 invokeOnCompletion(boolean z10, boolean z11, InterfaceC6835l interfaceC6835l) {
        C0 c3089x0;
        if (z10) {
            c3089x0 = new C3087w0(interfaceC6835l);
        } else {
            c3089x0 = new C3089x0(interfaceC6835l);
        }
        return h0(z11, c3089x0);
    }

    @Override // Ii.InterfaceC3091y0
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(H(), null, this);
        }
        E(cancellationException);
    }
}
