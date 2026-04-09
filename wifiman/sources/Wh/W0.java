package wh;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;
import ni.InterfaceC6987s;
import ni.InterfaceC6988t;
import wh.a1;

/* loaded from: classes4.dex */
public final class W0 implements th.q, Y {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ th.l[] f65085d = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(W0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    private final Bh.l0 f65086a;

    /* renamed from: b, reason: collision with root package name */
    private final a1.a f65087b;

    /* renamed from: c, reason: collision with root package name */
    private final X0 f65088c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65089a;

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
            f65089a = iArr;
        }
    }

    public W0(X0 x02, Bh.l0 descriptor) {
        X xE;
        Object objT0;
        AbstractC6492s.i(descriptor, "descriptor");
        this.f65086a = descriptor;
        this.f65087b = a1.c(new V0(this));
        if (x02 == null) {
            InterfaceC2503m interfaceC2503mB = a().b();
            AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
            if (interfaceC2503mB instanceof InterfaceC2495e) {
                objT0 = e((InterfaceC2495e) interfaceC2503mB);
            } else {
                if (!(interfaceC2503mB instanceof InterfaceC2492b)) {
                    throw new Y0("Unknown type parameter container: " + interfaceC2503mB);
                }
                InterfaceC2503m interfaceC2503mB2 = ((InterfaceC2492b) interfaceC2503mB).b();
                AbstractC6492s.h(interfaceC2503mB2, "getContainingDeclaration(...)");
                if (interfaceC2503mB2 instanceof InterfaceC2495e) {
                    xE = e((InterfaceC2495e) interfaceC2503mB2);
                } else {
                    InterfaceC6988t interfaceC6988t = interfaceC2503mB instanceof InterfaceC6988t ? (InterfaceC6988t) interfaceC2503mB : null;
                    if (interfaceC6988t == null) {
                        throw new Y0("Non-class callable descriptor must be deserialized: " + interfaceC2503mB);
                    }
                    th.d dVarE = AbstractC6596a.e(c(interfaceC6988t));
                    AbstractC6492s.g(dVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    xE = (X) dVarE;
                }
                objT0 = interfaceC2503mB.t0(new C8366j(xE), Yg.J.f24997a);
            }
            x02 = (X0) objT0;
        }
        this.f65088c = x02;
    }

    private final Class c(InterfaceC6988t interfaceC6988t) {
        Class clsE;
        InterfaceC6987s interfaceC6987sZ = interfaceC6988t.Z();
        Sh.r rVar = interfaceC6987sZ instanceof Sh.r ? (Sh.r) interfaceC6987sZ : null;
        Object objG = rVar != null ? rVar.g() : null;
        Fh.f fVar = objG instanceof Fh.f ? (Fh.f) objG : null;
        if (fVar != null && (clsE = fVar.e()) != null) {
            return clsE;
        }
        throw new Y0("Container of deserialized member is not resolved: " + interfaceC6988t);
    }

    private final X e(InterfaceC2495e interfaceC2495e) {
        Class clsQ = j1.q(interfaceC2495e);
        X x10 = (X) (clsQ != null ? AbstractC6596a.e(clsQ) : null);
        if (x10 != null) {
            return x10;
        }
        throw new Y0("Type parameter container is not resolved: " + interfaceC2495e.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(W0 w02) {
        List upperBounds = w02.a().getUpperBounds();
        AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
        List list = upperBounds;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new U0((pi.S) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // wh.Y
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Bh.l0 a() {
        return this.f65086a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof W0) {
            W0 w02 = (W0) obj;
            if (AbstractC6492s.d(this.f65088c, w02.f65088c) && AbstractC6492s.d(getName(), w02.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // th.q
    public String getName() {
        String strB = a().getName().b();
        AbstractC6492s.h(strB, "asString(...)");
        return strB;
    }

    @Override // th.q
    public List getUpperBounds() {
        Object objB = this.f65087b.b(this, f65085d[0]);
        AbstractC6492s.h(objB, "getValue(...)");
        return (List) objB;
    }

    public int hashCode() {
        return (this.f65088c.hashCode() * 31) + getName().hashCode();
    }

    @Override // th.q
    public th.s p() {
        int i10 = a.f65089a[a().p().ordinal()];
        if (i10 == 1) {
            return th.s.INVARIANT;
        }
        if (i10 == 2) {
            return th.s.IN;
        }
        if (i10 == 3) {
            return th.s.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return kotlin.jvm.internal.W.f51695a.a(this);
    }
}
