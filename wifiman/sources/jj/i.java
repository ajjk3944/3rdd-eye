package jj;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.N;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: o, reason: collision with root package name */
    public static final c f50950o = new c(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f50951p = 8;

    /* renamed from: q, reason: collision with root package name */
    private static final InterfaceC6835l f50952q = b.f50969a;

    /* renamed from: r, reason: collision with root package name */
    private static final InterfaceC6835l f50953r = a.f50968a;

    /* renamed from: a, reason: collision with root package name */
    private final N f50954a;

    /* renamed from: b, reason: collision with root package name */
    private final float f50955b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6839p f50956c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6839p f50957d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6839p f50958e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6350b f50959f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3551q0 f50960g;

    /* renamed from: h, reason: collision with root package name */
    private final Ki.g f50961h;

    /* renamed from: i, reason: collision with root package name */
    private final Ki.g f50962i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3551q0 f50963j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3551q0 f50964k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC3091y0 f50965l;

    /* renamed from: m, reason: collision with root package name */
    private final List f50966m;

    /* renamed from: n, reason: collision with root package name */
    private final List f50967n;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f50968a = new a();

        a() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(f10 * f10 * f10 * f10 * f10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f50969a = new b();

        b() {
            super(1);
        }

        public final Float a(float f10) {
            float f11 = 1;
            float f12 = f11 - f10;
            return Float.valueOf(f11 - (((f12 * f12) * f12) * f12));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(int i10, float f10, long j10, float f11) {
            if (f10 == 0.0f) {
                return 0.0f;
            }
            float fSignum = Math.signum(f10) * f11 * ((Number) i.f50952q.invoke(Float.valueOf(Math.min(1.0f, (Math.abs(f10) * 1.0f) / i10)))).floatValue() * ((Number) i.f50953r.invoke(Float.valueOf(j10 > 1500 ? 1.0f : j10 / 1500))).floatValue();
            return fSignum == 0.0f ? f10 > 0.0f ? 1.0f : -1.0f : fSignum;
        }

        private c() {
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f50970a;

        /* renamed from: b, reason: collision with root package name */
        Object f50971b;

        /* renamed from: c, reason: collision with root package name */
        int f50972c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f50973d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f50974e;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M f50975a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ K f50976b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f50977c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M m10, K k10, i iVar) {
                super(1);
                this.f50975a = m10;
                this.f50976b = k10;
                this.f50977c = iVar;
            }

            public final void a(long j10) {
                M m10 = this.f50975a;
                long j11 = m10.f51688a;
                if (j11 == 0) {
                    m10.f51688a = j10;
                    return;
                }
                K k10 = this.f50976b;
                i iVar = this.f50977c;
                k10.f51686a = iVar.h(j10 - j11, iVar.f50955b);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f10, i iVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f50973d = f10;
            this.f50974e = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f50973d, this.f50974e, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0058 -> B:19:0x005b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r5.f50972c
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r5.f50971b
                kotlin.jvm.internal.M r1 = (kotlin.jvm.internal.M) r1
                java.lang.Object r3 = r5.f50970a
                kotlin.jvm.internal.K r3 = (kotlin.jvm.internal.K) r3
                Yg.v.b(r6)
                goto L5b
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                Yg.v.b(r6)
                kotlin.jvm.internal.K r6 = new kotlin.jvm.internal.K
                r6.<init>()
                float r1 = r5.f50973d
                r6.f51686a = r1
                kotlin.jvm.internal.M r1 = new kotlin.jvm.internal.M
                r1.<init>()
                r3 = r6
            L31:
                float r6 = r3.f51686a
                r4 = 0
                int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r6 != 0) goto L39
                goto L6b
            L39:
                jj.i r6 = r5.f50974e
                Ii.y0 r6 = jj.i.b(r6)
                if (r6 == 0) goto L6b
                boolean r6 = r6.isActive()
                if (r6 != r2) goto L6b
                jj.i$d$a r6 = new jj.i$d$a
                jj.i r4 = r5.f50974e
                r6.<init>(r1, r3, r4)
                r5.f50970a = r3
                r5.f50971b = r1
                r5.f50972c = r2
                java.lang.Object r6 = T.AbstractC3535i0.b(r6, r5)
                if (r6 != r0) goto L5b
                return r0
            L5b:
                jj.i r6 = r5.f50974e
                Ki.g r6 = r6.B()
                float r4 = r3.f51686a
                java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.c(r4)
                r6.k(r4)
                goto L31
            L6b:
                Yg.J r6 = Yg.J.f24997a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jj.i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f50978a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f50980c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f50981d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, Object obj2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f50980c = obj;
            this.f50981d = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return i.this.new e(this.f50980c, this.f50981d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f50978a;
            if (i10 == 0) {
                v.b(obj);
                i.this.f50956c.invoke(new jj.d(i.this.x(this.f50980c), i.this.y(this.f50980c)), new jj.d(i.this.x(this.f50981d), i.this.y(this.f50981d)));
                i iVar = i.this;
                int iT = iVar.t();
                int iU = i.this.u();
                this.f50978a = 1;
                if (iVar.M(iT, iU, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class f extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f50982a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ jj.d f50984c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f50985d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(jj.d dVar, long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f50984c = dVar;
            this.f50985d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return i.this.new f(this.f50984c, this.f50985d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f50982a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC6350b interfaceC6350bM = i.this.m();
                jj.d dVar = this.f50984c;
                long j10 = this.f50985d;
                this.f50982a = 1;
                if (interfaceC6350bM.b(dVar, j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final class g extends l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f50986a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50987b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f50988c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f50989d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC5380e interfaceC5380e, i iVar) {
            super(3, interfaceC5380e);
            this.f50989d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f50986a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f50987b;
                InterfaceC3220g interfaceC3220gO = ((Boolean) this.f50988c).booleanValue() ? o1.o(this.f50989d.new C1887i()) : AbstractC3222i.B(null);
                this.f50986a = 1;
                if (AbstractC3222i.t(interfaceC3221h, interfaceC3220gO, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Object obj, InterfaceC5380e interfaceC5380e) {
            g gVar = new g(interfaceC5380e, this.f50989d);
            gVar.f50987b = interfaceC3221h;
            gVar.f50988c = obj;
            return gVar.invokeSuspend(J.f24997a);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {
        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(i.this.o() != null);
        }
    }

    /* renamed from: jj.i$i, reason: collision with other inner class name */
    static final class C1887i extends AbstractC6494u implements InterfaceC6824a {
        C1887i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return i.this.G();
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6839p {
        j() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List old, List list) {
            AbstractC6492s.i(old, "old");
            AbstractC6492s.i(list, "new");
            Object objS0 = AbstractC3689v.s0(old);
            Integer numValueOf = objS0 != null ? Integer.valueOf(i.this.x(objS0)) : null;
            Object objS02 = AbstractC3689v.s0(list);
            return Boolean.valueOf(AbstractC6492s.d(numValueOf, objS02 != null ? Integer.valueOf(i.this.x(objS02)) : null) && old.size() == list.size());
        }
    }

    public i(N scope, float f10, InterfaceC6839p onMove, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC6350b dragCancelledAnimation) {
        AbstractC6492s.i(scope, "scope");
        AbstractC6492s.i(onMove, "onMove");
        AbstractC6492s.i(dragCancelledAnimation, "dragCancelledAnimation");
        this.f50954a = scope;
        this.f50955b = f10;
        this.f50956c = onMove;
        this.f50957d = interfaceC6839p;
        this.f50958e = interfaceC6839p2;
        this.f50959f = dragCancelledAnimation;
        this.f50960g = t1.d(null, null, 2, null);
        this.f50961h = Ki.j.b(0, null, null, 7, null);
        this.f50962i = Ki.j.b(0, null, null, 7, null);
        this.f50963j = t1.d(C6531g.d(C6531g.f52335b.c()), null, 2, null);
        this.f50964k = t1.d(null, null, 2, null);
        this.f50966m = new ArrayList();
        this.f50967n = new ArrayList();
    }

    private final Object C() {
        return this.f50964k.getValue();
    }

    private final void N(long j10) {
        this.f50963j.setValue(C6531g.d(j10));
    }

    private final void O(Integer num) {
        this.f50960g.setValue(num);
    }

    private final void P(Object obj) {
        this.f50964k.setValue(obj);
    }

    private final void g(float f10) {
        if (f10 == 0.0f) {
            i();
            return;
        }
        InterfaceC3091y0 interfaceC3091y0 = this.f50965l;
        if (interfaceC3091y0 == null || !interfaceC3091y0.isActive()) {
            this.f50965l = AbstractC3063k.d(this.f50954a, null, null, new d(f10, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float h(long j10, float f10) {
        float fZ;
        float fH;
        float fM;
        float f11 = 0.0f;
        if (s() == null) {
            return 0.0f;
        }
        if (I()) {
            fZ = D(r0) + r();
            fH = v(r0) + fZ;
            fM = C6531g.n(n());
        } else {
            fZ = z(r0) + q();
            fH = H(r0) + fZ;
            fM = C6531g.m(n());
        }
        if (fM > 0.0f) {
            f11 = AbstractC7978m.c(fH - E(), 0.0f);
        } else if (fM < 0.0f) {
            f11 = AbstractC7978m.f(fZ - F(), 0.0f);
        }
        return f50950o.b((int) (fH - fZ), f11, j10, f10);
    }

    private final void i() {
        InterfaceC3091y0 interfaceC3091y0 = this.f50965l;
        if (interfaceC3091y0 != null) {
            InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
        }
        this.f50965l = null;
    }

    private final long n() {
        return ((C6531g) this.f50963j.getValue()).v();
    }

    private final Object s() {
        for (Object obj : G()) {
            int iX = x(obj);
            Integer numO = o();
            if (numO != null && iX == numO.intValue()) {
                return obj;
            }
        }
        return null;
    }

    protected abstract int A(Object obj);

    public final Ki.g B() {
        return this.f50962i;
    }

    protected abstract int D(Object obj);

    protected abstract int E();

    protected abstract int F();

    protected abstract List G();

    protected abstract int H(Object obj);

    public abstract boolean I();

    public final void J(int i10, int i11) {
        Object objC = C();
        if (objC == null) {
            return;
        }
        N(AbstractC6532h.a(C6531g.m(n()) + i10, C6531g.n(n()) + i11));
        Object objS = s();
        if (objS == null) {
            return;
        }
        Object objJ = j(objS, k((int) C6531g.m(n()), (int) C6531g.n(n()), objC), (int) (z(objS) + q()), (int) (D(objS) + r()));
        if (objJ != null) {
            if (x(objJ) == t() || x(objS) == t()) {
                AbstractC3063k.d(this.f50954a, null, null, new e(objS, objJ, null), 3, null);
            } else {
                this.f50956c.invoke(new jj.d(x(objS), y(objS)), new jj.d(x(objJ), y(objJ)));
            }
            O(Integer.valueOf(x(objJ)));
        }
        float fH = h(0L, this.f50955b);
        if (fH == 0.0f) {
            return;
        }
        g(fH);
    }

    public final void K() {
        Integer numO = o();
        if (numO != null) {
            int iIntValue = numO.intValue();
            Object objC = C();
            AbstractC3063k.d(this.f50954a, null, null, new f(new jj.d(iIntValue, objC != null ? y(objC) : null), AbstractC6532h.a(q(), r()), null), 3, null);
        }
        Object objC2 = C();
        Integer numValueOf = objC2 != null ? Integer.valueOf(x(objC2)) : null;
        Integer numO2 = o();
        P(null);
        N(C6531g.f52335b.c());
        O(null);
        i();
        InterfaceC6839p interfaceC6839p = this.f50958e;
        if (interfaceC6839p == null || numValueOf == null || numO2 == null) {
            return;
        }
        interfaceC6839p.invoke(numValueOf, numO2);
    }

    public boolean L(int i10, int i11) {
        Object obj;
        Object next;
        if (I()) {
            i11 += F();
        } else {
            i10 += F();
        }
        Iterator it = G().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iZ = z(next);
            if (i10 <= A(next) && iZ <= i10) {
                int iD = D(next);
                if (i11 <= l(next) && iD <= i11) {
                    break;
                }
            }
        }
        if (next != null) {
            P(next);
            O(Integer.valueOf(x(next)));
            obj = next;
        }
        return obj != null;
    }

    protected abstract Object M(int i10, int i11, InterfaceC5380e interfaceC5380e);

    public final InterfaceC3220g Q() {
        return AbstractC3222i.o(AbstractC3222i.w(AbstractC3222i.O(o1.o(new h()), new g(null, this))), new j());
    }

    protected Object j(Object obj, List items, int i10, int i11) {
        int iL;
        int iAbs;
        int iD;
        int iAbs2;
        int iZ;
        int iAbs3;
        int iA;
        int iAbs4;
        AbstractC6492s.i(items, "items");
        Object obj2 = null;
        if (obj == null) {
            if (o() != null) {
                return AbstractC3689v.D0(items);
            }
            return null;
        }
        int iH = i10 + H(obj);
        int iV = i11 + v(obj);
        int iZ2 = i10 - z(obj);
        int iD2 = i11 - D(obj);
        int size = items.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj3 = items.get(i13);
            if (iZ2 > 0 && (iA = A(obj3) - iH) < 0 && A(obj3) > A(obj) && (iAbs4 = Math.abs(iA)) > i12) {
                obj2 = obj3;
                i12 = iAbs4;
            }
            if (iZ2 < 0 && (iZ = z(obj3) - i10) > 0 && z(obj3) < z(obj) && (iAbs3 = Math.abs(iZ)) > i12) {
                obj2 = obj3;
                i12 = iAbs3;
            }
            if (iD2 < 0 && (iD = D(obj3) - i11) > 0 && D(obj3) < D(obj) && (iAbs2 = Math.abs(iD)) > i12) {
                obj2 = obj3;
                i12 = iAbs2;
            }
            if (iD2 > 0 && (iL = l(obj3) - iV) < 0 && l(obj3) > l(obj) && (iAbs = Math.abs(iL)) > i12) {
                obj2 = obj3;
                i12 = iAbs;
            }
        }
        return obj2;
    }

    protected List k(int i10, int i11, Object obj) {
        int i12;
        this.f50966m.clear();
        this.f50967n.clear();
        int iZ = i10 + z(obj);
        int iA = i10 + A(obj);
        int iD = i11 + D(obj);
        int iL = i11 + l(obj);
        int i13 = (iZ + iA) / 2;
        int i14 = (iD + iL) / 2;
        List listG = G();
        int size = listG.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj2 = listG.get(i15);
            int iX = x(obj2);
            Integer numO = o();
            if ((numO != null && iX == numO.intValue()) || l(obj2) < iD || D(obj2) > iL || A(obj2) < iZ || z(obj2) > iA) {
                i12 = iZ;
            } else {
                InterfaceC6839p interfaceC6839p = this.f50957d;
                if (interfaceC6839p != null) {
                    i12 = iZ;
                    if (!((Boolean) interfaceC6839p.invoke(new jj.d(x(obj2), y(obj2)), new jj.d(x(obj), y(obj)))).booleanValue()) {
                    }
                } else {
                    i12 = iZ;
                }
                int iAbs = Math.abs(i13 - ((z(obj2) + A(obj2)) / 2));
                int iAbs2 = Math.abs(i14 - ((D(obj2) + l(obj2)) / 2));
                int i16 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                int size2 = this.f50966m.size();
                int i17 = 0;
                for (int i18 = 0; i18 < size2 && i16 > ((Number) this.f50967n.get(i18)).intValue(); i18++) {
                    i17++;
                }
                this.f50966m.add(i17, obj2);
                this.f50967n.add(i17, Integer.valueOf(i16));
            }
            i15++;
            iZ = i12;
        }
        return this.f50966m;
    }

    protected abstract int l(Object obj);

    public final InterfaceC6350b m() {
        return this.f50959f;
    }

    public final Integer o() {
        return (Integer) this.f50960g.getValue();
    }

    public final Object p() {
        Object objC = C();
        if (objC != null) {
            return y(objC);
        }
        return null;
    }

    public final float q() {
        if (s() == null) {
            return 0.0f;
        }
        return ((C() != null ? z(r1) : 0) + C6531g.m(n())) - z(r0);
    }

    public final float r() {
        if (s() == null) {
            return 0.0f;
        }
        return ((C() != null ? D(r1) : 0) + C6531g.n(n())) - D(r0);
    }

    protected abstract int t();

    protected abstract int u();

    protected abstract int v(Object obj);

    public final Ki.g w() {
        return this.f50961h;
    }

    protected abstract int x(Object obj);

    protected abstract Object y(Object obj);

    protected abstract int z(Object obj);
}
