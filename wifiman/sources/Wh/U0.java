package wh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Gh.AbstractC2914f;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC6493t;
import lh.AbstractC6596a;
import mh.InterfaceC6824a;
import vh.AbstractC8231b;
import wh.a1;

/* loaded from: classes4.dex */
public final class U0 implements InterfaceC6493t {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ th.l[] f65075e = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(U0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(U0.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    private final pi.S f65076a;

    /* renamed from: b, reason: collision with root package name */
    private final a1.a f65077b;

    /* renamed from: c, reason: collision with root package name */
    private final a1.a f65078c;

    /* renamed from: d, reason: collision with root package name */
    private final a1.a f65079d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65080a;

        static {
            int[] iArr = new int[pi.N0.values().length];
            try {
                iArr[pi.N0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pi.N0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pi.N0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65080a = iArr;
        }
    }

    public U0(pi.S type, InterfaceC6824a interfaceC6824a) {
        AbstractC6492s.i(type, "type");
        this.f65076a = type;
        a1.a aVarC = null;
        a1.a aVar = interfaceC6824a instanceof a1.a ? (a1.a) interfaceC6824a : null;
        if (aVar != null) {
            aVarC = aVar;
        } else if (interfaceC6824a != null) {
            aVarC = a1.c(interfaceC6824a);
        }
        this.f65077b = aVarC;
        this.f65078c = a1.c(new Q0(this));
        this.f65079d = a1.c(new R0(this, interfaceC6824a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(U0 u02, InterfaceC6824a interfaceC6824a) {
        th.r rVarD;
        List listL0 = u02.f65076a.L0();
        if (listL0.isEmpty()) {
            return AbstractC3689v.l();
        }
        Yg.m mVarA = Yg.n.a(Yg.q.PUBLICATION, new S0(u02));
        List list = listL0;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            pi.B0 b02 = (pi.B0) obj;
            if (b02.c()) {
                rVarD = th.r.f62641c.c();
            } else {
                pi.S type = b02.getType();
                AbstractC6492s.h(type, "getType(...)");
                U0 u03 = new U0(type, interfaceC6824a == null ? null : new T0(u02, i10, mVarA));
                int i12 = a.f65080a[b02.a().ordinal()];
                if (i12 == 1) {
                    rVarD = th.r.f62641c.d(u03);
                } else if (i12 == 2) {
                    rVarD = th.r.f62641c.a(u03);
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVarD = th.r.f62641c.b(u03);
                }
            }
            arrayList.add(rVarD);
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(U0 u02) {
        Type typeE = u02.E();
        AbstractC6492s.f(typeE);
        return AbstractC2914f.h(typeE);
    }

    private static final List m(Yg.m mVar) {
        return (List) mVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type p(U0 u02, int i10, Yg.m mVar) {
        Type type;
        Type typeE = u02.E();
        if (typeE instanceof Class) {
            Class cls = (Class) typeE;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            AbstractC6492s.f(componentType);
            return componentType;
        }
        if (typeE instanceof GenericArrayType) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) typeE).getGenericComponentType();
                AbstractC6492s.f(genericComponentType);
                return genericComponentType;
            }
            throw new Y0("Array type has been queried for a non-0th argument: " + u02);
        }
        if (!(typeE instanceof ParameterizedType)) {
            throw new Y0("Non-generic type has been queried for arguments: " + u02);
        }
        Type type2 = (Type) m(mVar).get(i10);
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        AbstractC6492s.h(lowerBounds, "getLowerBounds(...)");
        Type type3 = (Type) AbstractC3682n.a0(lowerBounds);
        if (type3 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
            type = (Type) AbstractC3682n.Z(upperBounds);
        } else {
            type = type3;
        }
        AbstractC6492s.f(type);
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final th.e q(U0 u02) {
        return u02.s(u02.f65076a);
    }

    private final th.e s(pi.S s10) {
        pi.S type;
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (!(interfaceC2498hC instanceof InterfaceC2495e)) {
            if (interfaceC2498hC instanceof Bh.l0) {
                return new W0(null, (Bh.l0) interfaceC2498hC);
            }
            if (!(interfaceC2498hC instanceof Bh.k0)) {
                return null;
            }
            throw new Yg.r("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class clsQ = j1.q((InterfaceC2495e) interfaceC2498hC);
        if (clsQ == null) {
            return null;
        }
        if (!clsQ.isArray()) {
            if (pi.J0.l(s10)) {
                return new X(clsQ);
            }
            Class clsI = AbstractC2914f.i(clsQ);
            if (clsI != null) {
                clsQ = clsI;
            }
            return new X(clsQ);
        }
        pi.B0 b02 = (pi.B0) AbstractC3689v.T0(s10.L0());
        if (b02 == null || (type = b02.getType()) == null) {
            return new X(clsQ);
        }
        th.e eVarS = s(type);
        if (eVarS != null) {
            return new X(j1.f(AbstractC6596a.b(AbstractC8231b.a(eVarS))));
        }
        throw new Y0("Cannot determine classifier for array element type: " + this);
    }

    @Override // kotlin.jvm.internal.InterfaceC6493t
    public Type E() {
        a1.a aVar = this.f65077b;
        if (aVar != null) {
            return (Type) aVar.invoke();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof U0) {
            U0 u02 = (U0) obj;
            if (AbstractC6492s.d(this.f65076a, u02.f65076a) && AbstractC6492s.d(r(), u02.r()) && AbstractC6492s.d(j(), u02.j())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f65076a.hashCode() * 31;
        th.e eVarR = r();
        return ((iHashCode + (eVarR != null ? eVarR.hashCode() : 0)) * 31) + j().hashCode();
    }

    @Override // th.p
    public List j() {
        Object objB = this.f65079d.b(this, f65075e[1]);
        AbstractC6492s.h(objB, "getValue(...)");
        return (List) objB;
    }

    @Override // th.p
    public th.e r() {
        return (th.e) this.f65078c.b(this, f65075e[0]);
    }

    @Override // th.p
    public boolean t() {
        return this.f65076a.O0();
    }

    public String toString() {
        return e1.f65136a.l(this.f65076a);
    }

    public final pi.S u() {
        return this.f65076a;
    }

    public /* synthetic */ U0(pi.S s10, InterfaceC6824a interfaceC6824a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, (i10 & 2) != 0 ? null : interfaceC6824a);
    }
}
