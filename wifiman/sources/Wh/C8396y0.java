package wh;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import lh.C6597b;
import mh.InterfaceC6824a;
import sh.C7974i;
import th.k;
import wh.a1;
import xh.n;

/* renamed from: wh.y0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8396y0 implements th.k {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ th.l[] f65229f = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C8396y0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C8396y0.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8339A f65230a;

    /* renamed from: b, reason: collision with root package name */
    private final int f65231b;

    /* renamed from: c, reason: collision with root package name */
    private final k.a f65232c;

    /* renamed from: d, reason: collision with root package name */
    private final a1.a f65233d;

    /* renamed from: e, reason: collision with root package name */
    private final a1.a f65234e;

    /* renamed from: wh.y0$a */
    private static final class a implements Type {

        /* renamed from: a, reason: collision with root package name */
        private final Type[] f65235a;

        /* renamed from: b, reason: collision with root package name */
        private final int f65236b;

        public a(Type[] types) {
            AbstractC6492s.i(types, "types");
            this.f65235a = types;
            this.f65236b = Arrays.hashCode(types);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Arrays.equals(this.f65235a, ((a) obj).f65235a);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return AbstractC3682n.I0(this.f65235a, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f65236b;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public C8396y0(AbstractC8339A callable, int i10, k.a kind, InterfaceC6824a computeDescriptor) {
        AbstractC6492s.i(callable, "callable");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(computeDescriptor, "computeDescriptor");
        this.f65230a = callable;
        this.f65231b = i10;
        this.f65232c = kind;
        this.f65233d = a1.c(computeDescriptor);
        this.f65234e = a1.c(new C8392w0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type a(C8396y0 c8396y0) {
        List listU0;
        Bh.V vM = c8396y0.m();
        if ((vM instanceof Bh.b0) && AbstractC6492s.d(j1.i(c8396y0.f65230a.d0()), vM) && c8396y0.f65230a.d0().h() == InterfaceC2492b.a.FAKE_OVERRIDE) {
            InterfaceC2503m interfaceC2503mB = c8396y0.f65230a.d0().b();
            AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class clsQ = j1.q((InterfaceC2495e) interfaceC2503mB);
            if (clsQ != null) {
                return clsQ;
            }
            throw new Y0("Cannot determine receiver Java type of inherited declaration: " + vM);
        }
        xh.h hVarV = c8396y0.f65230a.V();
        if (!(hVarV instanceof xh.n)) {
            if (!(hVarV instanceof n.b)) {
                return (Type) hVarV.a().get(c8396y0.getIndex());
            }
            Class[] clsArr = (Class[]) ((Collection) ((n.b) hVarV).d().get(c8396y0.getIndex())).toArray(new Class[0]);
            return c8396y0.i((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (c8396y0.f65230a.b0()) {
            xh.n nVar = (xh.n) hVarV;
            C7974i c7974iF = nVar.f(c8396y0.getIndex() + 1);
            int iJ = nVar.f(0).j() + 1;
            listU0 = AbstractC3689v.U0(nVar.a(), new C7974i(c7974iF.i() - iJ, c7974iF.j() - iJ));
        } else {
            xh.n nVar2 = (xh.n) hVarV;
            listU0 = AbstractC3689v.U0(nVar2.a(), nVar2.f(c8396y0.getIndex()));
        }
        Type[] typeArr = (Type[]) listU0.toArray(new Type[0]);
        return c8396y0.i((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(C8396y0 c8396y0) {
        return j1.e(c8396y0.m());
    }

    private final Type i(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) AbstractC3682n.Q0(typeArr);
        }
        throw new C6597b("Expected at least 1 type for compound type");
    }

    private final Bh.V m() {
        Object objB = this.f65233d.b(this, f65229f[0]);
        AbstractC6492s.h(objB, "getValue(...)");
        return (Bh.V) objB;
    }

    @Override // th.k
    public boolean S() {
        Bh.V vM = m();
        Bh.s0 s0Var = vM instanceof Bh.s0 ? (Bh.s0) vM : null;
        if (s0Var != null) {
            return AbstractC5833e.f(s0Var);
        }
        return false;
    }

    @Override // th.k
    public boolean c() {
        Bh.V vM = m();
        return (vM instanceof Bh.s0) && ((Bh.s0) vM).j0() != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8396y0) {
            C8396y0 c8396y0 = (C8396y0) obj;
            if (AbstractC6492s.d(this.f65230a, c8396y0.f65230a) && getIndex() == c8396y0.getIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override // th.k
    public int getIndex() {
        return this.f65231b;
    }

    @Override // th.k
    public String getName() {
        Bh.V vM = m();
        Bh.s0 s0Var = vM instanceof Bh.s0 ? (Bh.s0) vM : null;
        if (s0Var == null || s0Var.b().H()) {
            return null;
        }
        Zh.f name = s0Var.getName();
        AbstractC6492s.h(name, "getName(...)");
        if (name.j()) {
            return null;
        }
        return name.b();
    }

    @Override // th.k
    public th.p getType() {
        pi.S type = m().getType();
        AbstractC6492s.h(type, "getType(...)");
        return new U0(type, new C8394x0(this));
    }

    @Override // th.k
    public k.a h() {
        return this.f65232c;
    }

    public int hashCode() {
        return (this.f65230a.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    public final AbstractC8339A k() {
        return this.f65230a;
    }

    public String toString() {
        return e1.f65136a.j(this);
    }
}
