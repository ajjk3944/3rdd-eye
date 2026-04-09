package pi;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.w0;
import sh.AbstractC7978m;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public final class A0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f58042f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7338F f58043a;

    /* renamed from: b, reason: collision with root package name */
    private final x0 f58044b;

    /* renamed from: c, reason: collision with root package name */
    private final oi.f f58045c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f58046d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.g f58047e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final pi.S a(pi.S r17, pi.G0 r18, java.util.Set r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 506
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pi.A0.a.a(pi.S, pi.G0, java.util.Set, boolean):pi.S");
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Bh.l0 f58048a;

        /* renamed from: b, reason: collision with root package name */
        private final G f58049b;

        public b(Bh.l0 typeParameter, G typeAttr) {
            AbstractC6492s.i(typeParameter, "typeParameter");
            AbstractC6492s.i(typeAttr, "typeAttr");
            this.f58048a = typeParameter;
            this.f58049b = typeAttr;
        }

        public final G a() {
            return this.f58049b;
        }

        public final Bh.l0 b() {
            return this.f58048a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(bVar.f58048a, this.f58048a) && AbstractC6492s.d(bVar.f58049b, this.f58049b);
        }

        public int hashCode() {
            int iHashCode = this.f58048a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f58049b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f58048a + ", typeAttr=" + this.f58049b + ')';
        }
    }

    public A0(AbstractC7338F projectionComputer, x0 options) {
        AbstractC6492s.i(projectionComputer, "projectionComputer");
        AbstractC6492s.i(options, "options");
        this.f58043a = projectionComputer;
        this.f58044b = options;
        oi.f fVar = new oi.f("Type parameter upper bound erasure results");
        this.f58045c = fVar;
        this.f58046d = Yg.n.b(new y0(this));
        oi.g gVarE = fVar.e(new z0(this));
        AbstractC6492s.h(gVarE, "createMemoizedFunction(...)");
        this.f58047e = gVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.types.error.i c(A0 a02) {
        return kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.CANNOT_COMPUTE_ERASED_BOUND, a02.toString());
    }

    private final S d(G g10) {
        S sD;
        AbstractC7346d0 abstractC7346d0A = g10.a();
        return (abstractC7346d0A == null || (sD = AbstractC7984d.D(abstractC7346d0A)) == null) ? h() : sD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S f(A0 a02, b bVar) {
        return a02.g(bVar.b(), bVar.a());
    }

    private final S g(Bh.l0 l0Var, G g10) {
        B0 b0A;
        Set setC = g10.c();
        if (setC != null && setC.contains(l0Var.a())) {
            return d(g10);
        }
        AbstractC7346d0 abstractC7346d0U = l0Var.u();
        AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
        Set<Bh.l0> setL = AbstractC7984d.l(abstractC7346d0U, setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(setL, 10)), 16));
        for (Bh.l0 l0Var2 : setL) {
            if (setC == null || !setC.contains(l0Var2)) {
                b0A = this.f58043a.a(l0Var2, g10, this, e(l0Var2, g10.d(l0Var)));
            } else {
                b0A = J0.t(l0Var2, g10);
                AbstractC6492s.h(b0A, "makeStarProjection(...)");
            }
            Yg.s sVarA = Yg.z.a(l0Var2.k(), b0A);
            linkedHashMap.put(sVarA.h(), sVarA.j());
        }
        G0 g0G = G0.g(w0.a.e(w0.f58185c, linkedHashMap, false, 2, null));
        AbstractC6492s.h(g0G, "create(...)");
        List upperBounds = l0Var.getUpperBounds();
        AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
        Set setI = i(g0G, upperBounds, g10);
        if (setI.isEmpty()) {
            return d(g10);
        }
        if (!this.f58044b.a()) {
            if (setI.size() == 1) {
                return (S) AbstractC3689v.Q0(setI);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listI1 = AbstractC3689v.i1(setI);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listI1, 10));
        Iterator it = listI1.iterator();
        while (it.hasNext()) {
            arrayList.add(((S) it.next()).Q0());
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.d.a(arrayList);
    }

    private final kotlin.reflect.jvm.internal.impl.types.error.i h() {
        return (kotlin.reflect.jvm.internal.impl.types.error.i) this.f58046d.getValue();
    }

    private final Set i(G0 g02, List list, G g10) {
        Set setB = Zg.d0.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S s10 = (S) it.next();
            InterfaceC2498h interfaceC2498hC = s10.N0().c();
            if (interfaceC2498hC instanceof InterfaceC2495e) {
                setB.add(f58042f.a(s10, g02, g10.c(), this.f58044b.b()));
            } else if (interfaceC2498hC instanceof Bh.l0) {
                Set setC = g10.c();
                if (setC == null || !setC.contains(interfaceC2498hC)) {
                    List upperBounds = ((Bh.l0) interfaceC2498hC).getUpperBounds();
                    AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
                    setB.addAll(i(g02, upperBounds, g10));
                } else {
                    setB.add(d(g10));
                }
            }
            if (!this.f58044b.a()) {
                break;
            }
        }
        return Zg.d0.a(setB);
    }

    public final S e(Bh.l0 typeParameter, G typeAttr) {
        AbstractC6492s.i(typeParameter, "typeParameter");
        AbstractC6492s.i(typeAttr, "typeAttr");
        Object objInvoke = this.f58047e.invoke(new b(typeParameter, typeAttr));
        AbstractC6492s.h(objInvoke, "invoke(...)");
        return (S) objInvoke;
    }

    public /* synthetic */ A0(AbstractC7338F abstractC7338F, x0 x0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7338F, (i10 & 2) != 0 ? new x0(false, false) : x0Var);
    }
}
