package pi;

import ci.AbstractC4268e;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import mh.InterfaceC6835l;
import si.AbstractC7984d;
import ti.AbstractC8119c;
import xi.AbstractC8537d;

/* loaded from: classes4.dex */
public class G0 {

    /* renamed from: b, reason: collision with root package name */
    public static final G0 f58062b = g(E0.f58057b);

    /* renamed from: a, reason: collision with root package name */
    private final E0 f58063a;

    static class a implements InterfaceC6835l {
        a() {
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(Zh.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(o.a.f51834Q));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58064a;

        static {
            int[] iArr = new int[d.values().length];
            f58064a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58064a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58064a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected G0(E0 e02) {
        if (e02 == null) {
            a(7);
        }
        this.f58063a = e02;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.G0.a(int):void");
    }

    private static void b(int i10, B0 b02, E0 e02) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(b02) + "; substitution: " + o(e02));
    }

    public static N0 c(N0 n02, B0 b02) {
        if (n02 == null) {
            a(35);
        }
        if (b02 == null) {
            a(36);
        }
        if (!b02.c()) {
            return d(n02, b02.a());
        }
        N0 n03 = N0.OUT_VARIANCE;
        if (n03 == null) {
            a(37);
        }
        return n03;
    }

    public static N0 d(N0 n02, N0 n03) {
        if (n02 == null) {
            a(38);
        }
        if (n03 == null) {
            a(39);
        }
        N0 n04 = N0.INVARIANT;
        if (n02 == n04) {
            if (n03 == null) {
                a(40);
            }
            return n03;
        }
        if (n03 == n04) {
            if (n02 == null) {
                a(41);
            }
            return n02;
        }
        if (n02 == n03) {
            if (n03 == null) {
                a(42);
            }
            return n03;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + n02 + "' and projection kind '" + n03 + "' cannot be combined");
    }

    private static d e(N0 n02, N0 n03) {
        N0 n04 = N0.IN_VARIANCE;
        return (n02 == n04 && n03 == N0.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (n02 == N0.OUT_VARIANCE && n03 == n04) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static G0 f(S s10) {
        if (s10 == null) {
            a(6);
        }
        return g(w0.i(s10.N0(), s10.L0()));
    }

    public static G0 g(E0 e02) {
        if (e02 == null) {
            a(0);
        }
        return new G0(e02);
    }

    public static G0 h(E0 e02, E0 e03) {
        if (e02 == null) {
            a(3);
        }
        if (e03 == null) {
            a(4);
        }
        return g(C7336D.i(e02, e03));
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.annotations.h i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        if (hVar == null) {
            a(33);
        }
        return !hVar.P(o.a.f51834Q) ? hVar : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.p(hVar, new a());
    }

    private static B0 l(S s10, B0 b02, Bh.l0 l0Var, B0 b03) {
        if (s10 == null) {
            a(26);
        }
        if (b02 == null) {
            a(27);
        }
        if (b03 == null) {
            a(28);
        }
        if (!s10.getAnnotations().P(o.a.f51834Q)) {
            if (b02 == null) {
                a(29);
            }
            return b02;
        }
        v0 v0VarN0 = b02.getType().N0();
        if (!(v0VarN0 instanceof kotlin.reflect.jvm.internal.impl.types.checker.n)) {
            return b02;
        }
        B0 b0E = ((kotlin.reflect.jvm.internal.impl.types.checker.n) v0VarN0).e();
        N0 n0A = b0E.a();
        d dVarE = e(b03.a(), n0A);
        d dVar = d.OUT_IN_IN_POSITION;
        return dVarE == dVar ? new D0(b0E.getType()) : (l0Var != null && e(l0Var.p(), n0A) == dVar) ? new D0(b0E.getType()) : b02;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (AbstractC8537d.a(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    private B0 r(B0 b02, int i10) {
        S type = b02.getType();
        N0 n0A = b02.a();
        if (type.N0().c() instanceof Bh.l0) {
            return b02;
        }
        AbstractC7346d0 abstractC7346d0B = AbstractC7354h0.b(type);
        S sP = abstractC7346d0B != null ? m().p(abstractC7346d0B, N0.INVARIANT) : null;
        S sB = F0.b(type, s(type.N0().getParameters(), type.L0(), i10), this.f58063a.d(type.getAnnotations()));
        if ((sB instanceof AbstractC7346d0) && (sP instanceof AbstractC7346d0)) {
            sB = AbstractC7354h0.j((AbstractC7346d0) sB, (AbstractC7346d0) sP);
        }
        return new D0(n0A, sB);
    }

    private List s(List list, List list2, int i10) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Bh.l0 l0Var = (Bh.l0) list.get(i11);
            B0 b02 = (B0) list2.get(i11);
            B0 b0U = u(b02, l0Var, i10 + 1);
            int i12 = b.f58064a[e(l0Var.p(), b0U.a()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                b0U = J0.s(l0Var);
            } else if (i12 == 3) {
                N0 n0P = l0Var.p();
                N0 n02 = N0.INVARIANT;
                if (n0P != n02 && !b0U.c()) {
                    b0U = new D0(n02, b0U.getType());
                }
            }
            if (b0U != b02) {
                z10 = true;
            }
            arrayList.add(b0U);
        }
        return !z10 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private B0 u(B0 b02, Bh.l0 l0Var, int i10) throws c {
        if (b02 == null) {
            a(18);
        }
        b(i10, b02, this.f58063a);
        if (b02.c()) {
            return b02;
        }
        S type = b02.getType();
        if (type instanceof K0) {
            K0 k02 = (K0) type;
            M0 m0G0 = k02.G0();
            S sI = k02.I();
            B0 b0U = u(new D0(b02.a(), m0G0), l0Var, i10 + 1);
            return b0U.c() ? b0U : new D0(b0U.a(), L0.d(b0U.getType().Q0(), p(sI, b02.a())));
        }
        if (!AbstractC7337E.a(type) && !(type.Q0() instanceof InterfaceC7344c0)) {
            B0 b0E = this.f58063a.e(type);
            B0 b0L = b0E != null ? l(type, b0E, l0Var, b02) : null;
            N0 n0A = b02.a();
            if (b0L == null && L.b(type) && !t0.b(type)) {
                I iA = L.a(type);
                int i11 = i10 + 1;
                B0 b0U2 = u(new D0(n0A, iA.V0()), l0Var, i11);
                B0 b0U3 = u(new D0(n0A, iA.W0()), l0Var, i11);
                return (b0U2.getType() == iA.V0() && b0U3.getType() == iA.W0()) ? b02 : new D0(b0U2.a(), V.e(F0.a(b0U2.getType()), F0.a(b0U3.getType())));
            }
            if (!kotlin.reflect.jvm.internal.impl.builtins.i.n0(type) && !W.a(type)) {
                if (b0L != null) {
                    d dVarE = e(n0A, b0L.a());
                    if (!AbstractC4268e.f(type)) {
                        int i12 = b.f58064a[dVarE.ordinal()];
                        if (i12 == 1) {
                            throw new c("Out-projection in in-position");
                        }
                        if (i12 == 2) {
                            return new D0(N0.OUT_VARIANCE, type.N0().q().I());
                        }
                    }
                    InterfaceC7375w interfaceC7375wA = t0.a(type);
                    if (b0L.c()) {
                        return b0L;
                    }
                    S sI0 = interfaceC7375wA != null ? interfaceC7375wA.i0(b0L.getType()) : J0.q(b0L.getType(), type.O0());
                    if (!type.getAnnotations().isEmpty()) {
                        sI0 = AbstractC7984d.C(sI0, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.o(sI0.getAnnotations(), i(this.f58063a.d(type.getAnnotations()))));
                    }
                    if (dVarE == d.NO_CONFLICT) {
                        n0A = d(n0A, b0L.a());
                    }
                    return new D0(n0A, sI0);
                }
                b02 = r(b02, i10);
                if (b02 == null) {
                    a(25);
                }
            }
        }
        return b02;
    }

    public E0 j() {
        E0 e02 = this.f58063a;
        if (e02 == null) {
            a(8);
        }
        return e02;
    }

    public boolean k() {
        return this.f58063a.f();
    }

    public G0 m() {
        E0 e02 = this.f58063a;
        return ((e02 instanceof M) && e02.b()) ? new G0(new M(((M) this.f58063a).j(), ((M) this.f58063a).i(), false)) : this;
    }

    public S n(S s10, N0 n02) {
        if (s10 == null) {
            a(9);
        }
        if (n02 == null) {
            a(10);
        }
        if (k()) {
            if (s10 == null) {
                a(11);
            }
            return s10;
        }
        try {
            S type = u(new D0(n02, s10), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e10) {
            kotlin.reflect.jvm.internal.impl.types.error.i iVarD = kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
            if (iVarD == null) {
                a(13);
            }
            return iVarD;
        }
    }

    public S p(S s10, N0 n02) {
        if (s10 == null) {
            a(14);
        }
        if (n02 == null) {
            a(15);
        }
        B0 b0Q = q(new D0(n02, j().g(s10, n02)));
        if (b0Q == null) {
            return null;
        }
        return b0Q.getType();
    }

    public B0 q(B0 b02) {
        if (b02 == null) {
            a(16);
        }
        B0 b0T = t(b02);
        return (this.f58063a.a() || this.f58063a.b()) ? AbstractC8119c.d(b0T, this.f58063a.b()) : b0T;
    }

    public B0 t(B0 b02) {
        if (b02 == null) {
            a(17);
        }
        if (k()) {
            return b02;
        }
        try {
            return u(b02, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
