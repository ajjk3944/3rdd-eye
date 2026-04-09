package wh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Jh.AbstractC3121o;
import Xh.a;
import Yh.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6480f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;
import th.h;
import th.l;
import vh.AbstractC8230a;
import wh.AbstractC8378p;
import wh.a1;

/* loaded from: classes4.dex */
public abstract class K0 extends AbstractC8339A implements th.l {

    /* renamed from: m, reason: collision with root package name */
    public static final b f65036m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Object f65037n = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC8355d0 f65038g;

    /* renamed from: h, reason: collision with root package name */
    private final String f65039h;

    /* renamed from: i, reason: collision with root package name */
    private final String f65040i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f65041j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f65042k;

    /* renamed from: l, reason: collision with root package name */
    private final a1.a f65043l;

    public static abstract class a extends AbstractC8339A implements th.g, l.a {
        @Override // wh.AbstractC8339A
        public AbstractC8355d0 W() {
            return e0().W();
        }

        @Override // wh.AbstractC8339A
        public xh.h X() {
            return null;
        }

        @Override // wh.AbstractC8339A
        public boolean b0() {
            return e0().b0();
        }

        public abstract Bh.X d0();

        public abstract K0 e0();

        @Override // th.g
        public boolean isExternal() {
            return d0().isExternal();
        }

        @Override // th.g
        public boolean isInfix() {
            return d0().isInfix();
        }

        @Override // th.g
        public boolean isInline() {
            return d0().isInline();
        }

        @Override // th.g
        public boolean isOperator() {
            return d0().isOperator();
        }

        @Override // th.c, th.g
        public boolean isSuspend() {
            return d0().isSuspend();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static abstract class c extends a implements l.b {

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ th.l[] f65044i = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* renamed from: g, reason: collision with root package name */
        private final a1.a f65045g = a1.c(new L0(this));

        /* renamed from: h, reason: collision with root package name */
        private final Yg.m f65046h = Yg.n.a(Yg.q.PUBLICATION, new M0(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final xh.h h0(c cVar) {
            return P0.b(cVar, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bh.Z i0(c cVar) {
            Bh.Z zD = cVar.e0().d0().d();
            if (zD != null) {
                return zD;
            }
            Dh.L lD = bi.h.d(cVar.e0().d0(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b());
            AbstractC6492s.h(lD, "createDefaultGetter(...)");
            return lD;
        }

        @Override // wh.AbstractC8339A
        public xh.h V() {
            return (xh.h) this.f65046h.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && AbstractC6492s.d(e0(), ((c) obj).e0());
        }

        @Override // th.c
        public String getName() {
            return "<get-" + e0().getName() + '>';
        }

        public int hashCode() {
            return e0().hashCode();
        }

        @Override // wh.K0.a
        /* renamed from: j0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Bh.Z d0() {
            Object objB = this.f65045g.b(this, f65044i[0]);
            AbstractC6492s.h(objB, "getValue(...)");
            return (Bh.Z) objB;
        }

        public String toString() {
            return "getter of " + e0();
        }
    }

    public static abstract class d extends a implements h.a {

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ th.l[] f65047i = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* renamed from: g, reason: collision with root package name */
        private final a1.a f65048g = a1.c(new N0(this));

        /* renamed from: h, reason: collision with root package name */
        private final Yg.m f65049h = Yg.n.a(Yg.q.PUBLICATION, new O0(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final xh.h h0(d dVar) {
            return P0.b(dVar, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bh.a0 i0(d dVar) {
            Bh.a0 a0VarG = dVar.e0().d0().g();
            if (a0VarG != null) {
                return a0VarG;
            }
            Bh.Y yD0 = dVar.e0().d0();
            h.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1;
            Dh.M mE = bi.h.e(yD0, aVar.b(), aVar.b());
            AbstractC6492s.h(mE, "createDefaultSetter(...)");
            return mE;
        }

        @Override // wh.AbstractC8339A
        public xh.h V() {
            return (xh.h) this.f65049h.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && AbstractC6492s.d(e0(), ((d) obj).e0());
        }

        @Override // th.c
        public String getName() {
            return "<set-" + e0().getName() + '>';
        }

        public int hashCode() {
            return e0().hashCode();
        }

        @Override // wh.K0.a
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public Bh.a0 d0() {
            Object objB = this.f65048g.b(this, f65047i[0]);
            AbstractC6492s.h(objB, "getValue(...)");
            return (Bh.a0) objB;
        }

        public String toString() {
            return "setter of " + e0();
        }
    }

    private K0(AbstractC8355d0 abstractC8355d0, String str, String str2, Bh.Y y10, Object obj) {
        this.f65038g = abstractC8355d0;
        this.f65039h = str;
        this.f65040i = str2;
        this.f65041j = obj;
        this.f65042k = Yg.n.a(Yg.q.PUBLICATION, new I0(this));
        a1.a aVarB = a1.b(y10, new J0(this));
        AbstractC6492s.h(aVarB, "lazySoft(...)");
        this.f65043l = aVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bh.Y d0(K0 k02) {
        return k02.W().A(k02.getName(), k02.f65040i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field e0(K0 k02) {
        Class<?> enclosingClass;
        AbstractC8378p abstractC8378pF = f1.f65142a.f(k02.d0());
        if (!(abstractC8378pF instanceof AbstractC8378p.c)) {
            if (abstractC8378pF instanceof AbstractC8378p.a) {
                return ((AbstractC8378p.a) abstractC8378pF).b();
            }
            if ((abstractC8378pF instanceof AbstractC8378p.b) || (abstractC8378pF instanceof AbstractC8378p.d)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC8378p.c cVar = (AbstractC8378p.c) abstractC8378pF;
        Bh.Y yB = cVar.b();
        d.a aVarD = Yh.i.d(Yh.i.f25057a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
        if (aVarD == null) {
            return null;
        }
        if (AbstractC3121o.e(yB) || Yh.i.f(cVar.e())) {
            enclosingClass = k02.W().b().getEnclosingClass();
        } else {
            InterfaceC2503m interfaceC2503mB = yB.b();
            enclosingClass = interfaceC2503mB instanceof InterfaceC2495e ? j1.q((InterfaceC2495e) interfaceC2503mB) : k02.W().b();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(aVarD.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // wh.AbstractC8339A
    public xh.h V() {
        return l0().V();
    }

    @Override // wh.AbstractC8339A
    public AbstractC8355d0 W() {
        return this.f65038g;
    }

    @Override // wh.AbstractC8339A
    public xh.h X() {
        return l0().X();
    }

    @Override // wh.AbstractC8339A
    public boolean b0() {
        return this.f65041j != AbstractC6480f.NO_RECEIVER;
    }

    public boolean equals(Object obj) {
        K0 k0D = j1.d(obj);
        return k0D != null && AbstractC6492s.d(W(), k0D.W()) && AbstractC6492s.d(getName(), k0D.getName()) && AbstractC6492s.d(this.f65040i, k0D.f65040i) && AbstractC6492s.d(this.f65041j, k0D.f65041j);
    }

    @Override // th.c
    public String getName() {
        return this.f65039h;
    }

    protected final Member h0() {
        if (!d0().N()) {
            return null;
        }
        AbstractC8378p abstractC8378pF = f1.f65142a.f(d0());
        if (abstractC8378pF instanceof AbstractC8378p.c) {
            AbstractC8378p.c cVar = (AbstractC8378p.c) abstractC8378pF;
            if (cVar.f().G0()) {
                a.c cVarD0 = cVar.f().d0();
                if (!cVarD0.d0() || !cVarD0.T()) {
                    return null;
                }
                return W().z(cVar.d().getString(cVarD0.S()), cVar.d().getString(cVarD0.P()));
            }
        }
        return m0();
    }

    public int hashCode() {
        return (((W().hashCode() * 31) + getName().hashCode()) * 31) + this.f65040i.hashCode();
    }

    public final Object i0() {
        return xh.o.h(this.f65041j, d0());
    }

    @Override // th.c, th.g
    public boolean isSuspend() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object j0(Member member, Object obj, Object obj2) throws IllegalPropertyDelegateAccessException, SecurityException {
        try {
            Object obj3 = f65037n;
            if ((obj == obj3 || obj2 == obj3) && d0().k0() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objI0 = b0() ? i0() : obj;
            if (objI0 == obj3) {
                objI0 = null;
            }
            if (!b0()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(AbstractC8230a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objI0);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objI0 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    AbstractC6492s.h(cls, "get(...)");
                    objI0 = j1.g(cls);
                }
                return method.invoke(null, objI0);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                AbstractC6492s.h(cls2, "get(...)");
                obj = j1.g(cls2);
            }
            return method2.invoke(null, objI0, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalPropertyDelegateAccessException(e10);
        }
    }

    @Override // wh.AbstractC8339A
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public Bh.Y d0() {
        Object objInvoke = this.f65043l.invoke();
        AbstractC6492s.h(objInvoke, "invoke(...)");
        return (Bh.Y) objInvoke;
    }

    public abstract c l0();

    public final Field m0() {
        return (Field) this.f65042k.getValue();
    }

    public final String n0() {
        return this.f65040i;
    }

    public String toString() {
        return e1.f65136a.k(d0());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K0(AbstractC8355d0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public K0(AbstractC8355d0 container, Bh.Y descriptor) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        AbstractC6492s.h(strB, "asString(...)");
        this(container, strB, f1.f65142a.f(descriptor).a(), descriptor, AbstractC6480f.NO_RECEIVER);
    }
}
