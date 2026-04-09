package wh;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import gi.AbstractC5920b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6480f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC6488n;
import wh.AbstractC8374n;
import wh.InterfaceC8370l;
import wh.a1;
import xh.C8533a;
import xh.i;
import xh.n;

/* renamed from: wh.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8365i0 extends AbstractC8339A implements InterfaceC6488n, th.g, InterfaceC8370l {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ th.l[] f65155m = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C8365i0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC8355d0 f65156g;

    /* renamed from: h, reason: collision with root package name */
    private final String f65157h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f65158i;

    /* renamed from: j, reason: collision with root package name */
    private final a1.a f65159j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f65160k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f65161l;

    /* synthetic */ C8365i0(AbstractC8355d0 abstractC8355d0, String str, String str2, InterfaceC2515z interfaceC2515z, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC8355d0, str, str2, interfaceC2515z, (i10 & 16) != 0 ? AbstractC6480f.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xh.h g0(C8365i0 c8365i0) {
        Object objD;
        xh.i iVarI0;
        AbstractC8374n abstractC8374nG = f1.f65142a.g(c8365i0.d0());
        if (abstractC8374nG instanceof AbstractC8374n.d) {
            if (c8365i0.a0()) {
                Class clsB = c8365i0.W().b();
                List parameters = c8365i0.getParameters();
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((th.k) it.next()).getName();
                    AbstractC6492s.f(name);
                    arrayList.add(name);
                }
                return new C8533a(clsB, arrayList, C8533a.EnumC2347a.POSITIONAL_CALL, C8533a.b.KOTLIN, null, 16, null);
            }
            objD = c8365i0.W().s(((AbstractC8374n.d) abstractC8374nG).b());
        } else if (abstractC8374nG instanceof AbstractC8374n.e) {
            InterfaceC2515z interfaceC2515zD0 = c8365i0.d0();
            InterfaceC2503m interfaceC2503mB = interfaceC2515zD0.b();
            AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
            if (bi.k.d(interfaceC2503mB) && (interfaceC2515zD0 instanceof InterfaceC2502l) && ((InterfaceC2502l) interfaceC2515zD0).B()) {
                InterfaceC2515z interfaceC2515zD02 = c8365i0.d0();
                AbstractC8355d0 abstractC8355d0W = c8365i0.W();
                String strB = ((AbstractC8374n.e) abstractC8374nG).b();
                List listI = c8365i0.d0().i();
                AbstractC6492s.h(listI, "getValueParameters(...)");
                return new n.b(interfaceC2515zD02, abstractC8355d0W, strB, listI);
            }
            AbstractC8374n.e eVar = (AbstractC8374n.e) abstractC8374nG;
            objD = c8365i0.W().z(eVar.c(), eVar.b());
        } else if (abstractC8374nG instanceof AbstractC8374n.c) {
            objD = ((AbstractC8374n.c) abstractC8374nG).b();
            AbstractC6492s.g(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(abstractC8374nG instanceof AbstractC8374n.b)) {
                if (!(abstractC8374nG instanceof AbstractC8374n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                List listD = ((AbstractC8374n.a) abstractC8374nG).d();
                Class clsB2 = c8365i0.W().b();
                List list = listD;
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new C8533a(clsB2, arrayList2, C8533a.EnumC2347a.POSITIONAL_CALL, C8533a.b.JAVA, listD);
            }
            objD = ((AbstractC8374n.b) abstractC8374nG).d();
            AbstractC6492s.g(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (objD instanceof Constructor) {
            iVarI0 = c8365i0.h0((Constructor) objD, c8365i0.d0(), false);
        } else {
            if (!(objD instanceof Method)) {
                throw new Y0("Could not compute caller for function: " + c8365i0.d0() + " (member = " + objD + ')');
            }
            Method method = (Method) objD;
            iVarI0 = !Modifier.isStatic(method.getModifiers()) ? c8365i0.i0(method) : c8365i0.d0().getAnnotations().l(j1.j()) != null ? c8365i0.j0(method) : c8365i0.k0(method);
        }
        return xh.o.j(iVarI0, c8365i0.d0(), false, 2, null);
    }

    private final xh.i h0(Constructor constructor, InterfaceC2515z interfaceC2515z, boolean z10) {
        return (z10 || !AbstractC5920b.f(interfaceC2515z)) ? b0() ? new i.c(constructor, n0()) : new i.e(constructor) : b0() ? new i.a(constructor, n0()) : new i.b(constructor);
    }

    private final i.h i0(Method method) {
        return b0() ? new i.h.a(method, n0()) : new i.h.e(method);
    }

    private final i.h j0(Method method) {
        return b0() ? new i.h.b(method) : new i.h.f(method);
    }

    private final i.h k0(Method method) {
        if (b0()) {
            return new i.h.c(method, q0(method) ? this.f65158i : n0());
        }
        return new i.h.g(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final xh.h l0(wh.C8365i0 r11) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.C8365i0.l0(wh.i0):xh.h");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2515z m0(C8365i0 c8365i0, String str) {
        return c8365i0.W().x(str, c8365i0.f65157h);
    }

    private final Object n0() {
        return xh.o.h(this.f65158i, d0());
    }

    private final InterfaceC2515z p0(InterfaceC2515z interfaceC2515z) {
        Object next;
        List listI = interfaceC2515z.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        List list = listI;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Bh.s0) it.next()).s0()) {
                    return null;
                }
            }
        }
        InterfaceC2503m interfaceC2503mB = interfaceC2515z.b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        if (!bi.k.g(interfaceC2503mB)) {
            return null;
        }
        Member memberB = V().b();
        AbstractC6492s.f(memberB);
        if (!Modifier.isStatic(memberB.getModifiers())) {
            return null;
        }
        Iterator it2 = AbstractC5833e.z(interfaceC2515z, false).iterator();
        loop0: while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            List listI2 = ((InterfaceC2492b) next).i();
            AbstractC6492s.h(listI2, "getValueParameters(...)");
            List list2 = listI2;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (((Bh.s0) it3.next()).s0()) {
                        break loop0;
                    }
                }
            }
        }
        if (next instanceof InterfaceC2515z) {
            return (InterfaceC2515z) next;
        }
        return null;
    }

    private final boolean q0(Method method) {
        pi.S type;
        Bh.b0 b0VarD0 = d0().d0();
        if (b0VarD0 != null && (type = b0VarD0.getType()) != null && bi.k.c(type)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC6492s.h(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) AbstractC3682n.a0(parameterTypes);
            if (cls != null && cls.isInterface()) {
                return true;
            }
        }
        return false;
    }

    @Override // mh.t
    public Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return InterfaceC8370l.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // mh.s
    public Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return InterfaceC8370l.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // wh.AbstractC8339A
    public xh.h V() {
        return (xh.h) this.f65160k.getValue();
    }

    @Override // wh.AbstractC8339A
    public AbstractC8355d0 W() {
        return this.f65156g;
    }

    @Override // wh.AbstractC8339A
    public xh.h X() {
        return (xh.h) this.f65161l.getValue();
    }

    @Override // wh.AbstractC8339A
    public boolean b0() {
        return this.f65158i != AbstractC6480f.NO_RECEIVER;
    }

    public boolean equals(Object obj) {
        C8365i0 c8365i0C = j1.c(obj);
        return c8365i0C != null && AbstractC6492s.d(W(), c8365i0C.W()) && AbstractC6492s.d(getName(), c8365i0C.getName()) && AbstractC6492s.d(this.f65157h, c8365i0C.f65157h) && AbstractC6492s.d(this.f65158i, c8365i0C.f65158i);
    }

    @Override // kotlin.jvm.internal.InterfaceC6488n
    public int getArity() {
        return xh.j.a(V());
    }

    @Override // th.c
    public String getName() {
        String strB = d0().getName().b();
        AbstractC6492s.h(strB, "asString(...)");
        return strB;
    }

    public int hashCode() {
        return (((W().hashCode() * 31) + getName().hashCode()) * 31) + this.f65157h.hashCode();
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return InterfaceC8370l.a.a(this);
    }

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

    @Override // wh.AbstractC8339A
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public InterfaceC2515z d0() {
        Object objB = this.f65159j.b(this, f65155m[0]);
        AbstractC6492s.h(objB, "getValue(...)");
        return (InterfaceC2515z) objB;
    }

    @Override // mh.q
    public Object s(Object obj, Object obj2, Object obj3) {
        return InterfaceC8370l.a.d(this, obj, obj2, obj3);
    }

    public String toString() {
        return e1.f65136a.f(d0());
    }

    @Override // mh.r
    public Object y(Object obj, Object obj2, Object obj3, Object obj4) {
        return InterfaceC8370l.a.e(this, obj, obj2, obj3, obj4);
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return InterfaceC8370l.a.b(this, obj);
    }

    private C8365i0(AbstractC8355d0 abstractC8355d0, String str, String str2, InterfaceC2515z interfaceC2515z, Object obj) {
        this.f65156g = abstractC8355d0;
        this.f65157h = str2;
        this.f65158i = obj;
        this.f65159j = a1.b(interfaceC2515z, new C8359f0(this, str));
        Yg.q qVar = Yg.q.PUBLICATION;
        this.f65160k = Yg.n.a(qVar, new C8361g0(this));
        this.f65161l = Yg.n.a(qVar, new C8363h0(this));
    }

    @Override // mh.InterfaceC6839p
    public Object invoke(Object obj, Object obj2) {
        return InterfaceC8370l.a.c(this, obj, obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8365i0(AbstractC8355d0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8365i0(AbstractC8355d0 container, InterfaceC2515z descriptor) {
        AbstractC6492s.i(container, "container");
        AbstractC6492s.i(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        AbstractC6492s.h(strB, "asString(...)");
        this(container, strB, f1.f65142a.g(descriptor).a(), descriptor, null, 16, null);
    }
}
