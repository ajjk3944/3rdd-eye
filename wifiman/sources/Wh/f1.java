package wh;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Gh.AbstractC2914f;
import Xh.a;
import Yh.d;
import Zh.b;
import fi.AbstractC5833e;
import gi.EnumC5923e;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import ni.C6963N;
import ni.InterfaceC6970b;
import ni.InterfaceC6988t;
import wh.AbstractC8374n;
import wh.AbstractC8378p;

/* loaded from: classes4.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f65142a = new f1();

    /* renamed from: b, reason: collision with root package name */
    private static final Zh.b f65143b = Zh.b.f25401d.c(new Zh.c("java.lang.Void"));

    private f1() {
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.l a(Class cls) {
        if (cls.isPrimitive()) {
            return EnumC5923e.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    private final boolean b(InterfaceC2515z interfaceC2515z) {
        if (bi.h.p(interfaceC2515z) || bi.h.q(interfaceC2515z)) {
            return true;
        }
        return AbstractC6492s.d(interfaceC2515z.getName(), Ah.a.f767e.a()) && interfaceC2515z.i().isEmpty();
    }

    private final AbstractC8374n.e d(InterfaceC2515z interfaceC2515z) {
        return new AbstractC8374n.e(new d.b(e(interfaceC2515z), Sh.C.c(interfaceC2515z, false, false, 1, null)));
    }

    private final String e(InterfaceC2492b interfaceC2492b) {
        String strE = Jh.T.e(interfaceC2492b);
        if (strE != null) {
            return strE;
        }
        if (interfaceC2492b instanceof Bh.Z) {
            String strB = AbstractC5833e.w(interfaceC2492b).getName().b();
            AbstractC6492s.h(strB, "asString(...)");
            return Jh.H.b(strB);
        }
        if (interfaceC2492b instanceof Bh.a0) {
            String strB2 = AbstractC5833e.w(interfaceC2492b).getName().b();
            AbstractC6492s.h(strB2, "asString(...)");
            return Jh.H.e(strB2);
        }
        String strB3 = interfaceC2492b.getName().b();
        AbstractC6492s.h(strB3, "asString(...)");
        return strB3;
    }

    public final Zh.b c(Class klass) {
        Zh.b bVarM;
        AbstractC6492s.i(klass, "klass");
        if (!klass.isArray()) {
            if (AbstractC6492s.d(klass, Void.TYPE)) {
                return f65143b;
            }
            kotlin.reflect.jvm.internal.impl.builtins.l lVarA = a(klass);
            if (lVarA != null) {
                return new Zh.b(kotlin.reflect.jvm.internal.impl.builtins.o.f51769A, lVarA.getTypeName());
            }
            Zh.b bVarE = AbstractC2914f.e(klass);
            return (bVarE.i() || (bVarM = Ah.c.f771a.m(bVarE.a())) == null) ? bVarE : bVarM;
        }
        Class<?> componentType = klass.getComponentType();
        AbstractC6492s.h(componentType, "getComponentType(...)");
        kotlin.reflect.jvm.internal.impl.builtins.l lVarA2 = a(componentType);
        if (lVarA2 != null) {
            return new Zh.b(kotlin.reflect.jvm.internal.impl.builtins.o.f51769A, lVarA2.getArrayTypeName());
        }
        b.a aVar = Zh.b.f25401d;
        Zh.c cVarL = o.a.f51860i.l();
        AbstractC6492s.h(cVarL, "toSafe(...)");
        return aVar.c(cVarL);
    }

    public final AbstractC8378p f(Bh.Y possiblyOverriddenProperty) {
        AbstractC6492s.i(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        Bh.Y yA = ((Bh.Y) bi.i.L(possiblyOverriddenProperty)).a();
        AbstractC6492s.h(yA, "getOriginal(...)");
        if (yA instanceof C6963N) {
            C6963N c6963n = (C6963N) yA;
            Uh.n nVarF1 = c6963n.F();
            h.f propertySignature = Xh.a.f24345d;
            AbstractC6492s.h(propertySignature, "propertySignature");
            a.d dVar = (a.d) Wh.e.a(nVarF1, propertySignature);
            if (dVar != null) {
                return new AbstractC8378p.c(yA, nVarF1, dVar, c6963n.X(), c6963n.R());
            }
        } else if (yA instanceof Lh.f) {
            Lh.f fVar = (Lh.f) yA;
            Bh.g0 g0VarJ = fVar.j();
            Ph.a aVar = g0VarJ instanceof Ph.a ? (Ph.a) g0VarJ : null;
            Qh.l lVarB = aVar != null ? aVar.b() : null;
            if (lVarB instanceof Gh.w) {
                return new AbstractC8378p.a(((Gh.w) lVarB).S());
            }
            if (lVarB instanceof Gh.z) {
                Method methodS = ((Gh.z) lVarB).S();
                Bh.a0 a0VarG = fVar.g();
                Bh.g0 g0VarJ2 = a0VarG != null ? a0VarG.j() : null;
                Ph.a aVar2 = g0VarJ2 instanceof Ph.a ? (Ph.a) g0VarJ2 : null;
                Qh.l lVarB2 = aVar2 != null ? aVar2.b() : null;
                Gh.z zVar = lVarB2 instanceof Gh.z ? (Gh.z) lVarB2 : null;
                return new AbstractC8378p.b(methodS, zVar != null ? zVar.S() : null);
            }
            throw new Y0("Incorrect resolution sequence for Java field " + yA + " (source = " + lVarB + ')');
        }
        Bh.Z zD = yA.d();
        AbstractC6492s.f(zD);
        AbstractC8374n.e eVarD = d(zD);
        Bh.a0 a0VarG2 = yA.g();
        return new AbstractC8378p.d(eVarD, a0VarG2 != null ? d(a0VarG2) : null);
    }

    public final AbstractC8374n g(InterfaceC2515z possiblySubstitutedFunction) {
        Method methodS;
        d.b bVarB;
        d.b bVarE;
        AbstractC6492s.i(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC2515z interfaceC2515zA = ((InterfaceC2515z) bi.i.L(possiblySubstitutedFunction)).a();
        AbstractC6492s.h(interfaceC2515zA, "getOriginal(...)");
        if (!(interfaceC2515zA instanceof InterfaceC6970b)) {
            if (interfaceC2515zA instanceof Lh.e) {
                Bh.g0 g0VarJ = ((Lh.e) interfaceC2515zA).j();
                Ph.a aVar = g0VarJ instanceof Ph.a ? (Ph.a) g0VarJ : null;
                Qh.l lVarB = aVar != null ? aVar.b() : null;
                Gh.z zVar = lVarB instanceof Gh.z ? (Gh.z) lVarB : null;
                if (zVar != null && (methodS = zVar.S()) != null) {
                    return new AbstractC8374n.c(methodS);
                }
                throw new Y0("Incorrect resolution sequence for Java method " + interfaceC2515zA);
            }
            if (!(interfaceC2515zA instanceof Lh.b)) {
                if (b(interfaceC2515zA)) {
                    return d(interfaceC2515zA);
                }
                throw new Y0("Unknown origin of " + interfaceC2515zA + " (" + interfaceC2515zA.getClass() + ')');
            }
            Bh.g0 g0VarJ2 = ((Lh.b) interfaceC2515zA).j();
            Ph.a aVar2 = g0VarJ2 instanceof Ph.a ? (Ph.a) g0VarJ2 : null;
            Qh.l lVarB2 = aVar2 != null ? aVar2.b() : null;
            if (lVarB2 instanceof Gh.t) {
                return new AbstractC8374n.b(((Gh.t) lVarB2).S());
            }
            if (lVarB2 instanceof Gh.q) {
                Gh.q qVar = (Gh.q) lVarB2;
                if (qVar.n()) {
                    return new AbstractC8374n.a(qVar.v());
                }
            }
            throw new Y0("Incorrect resolution sequence for Java constructor " + interfaceC2515zA + " (" + lVarB2 + ')');
        }
        InterfaceC6988t interfaceC6988t = (InterfaceC6988t) interfaceC2515zA;
        kotlin.reflect.jvm.internal.impl.protobuf.n nVarF = interfaceC6988t.F();
        if ((nVarF instanceof Uh.i) && (bVarE = Yh.i.f25057a.e((Uh.i) nVarF, interfaceC6988t.X(), interfaceC6988t.R())) != null) {
            return new AbstractC8374n.e(bVarE);
        }
        if (!(nVarF instanceof Uh.d) || (bVarB = Yh.i.f25057a.b((Uh.d) nVarF, interfaceC6988t.X(), interfaceC6988t.R())) == null) {
            return d(interfaceC2515zA);
        }
        InterfaceC2503m interfaceC2503mB = possiblySubstitutedFunction.b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        if (bi.k.b(interfaceC2503mB)) {
            return new AbstractC8374n.e(bVarB);
        }
        InterfaceC2503m interfaceC2503mB2 = possiblySubstitutedFunction.b();
        AbstractC6492s.h(interfaceC2503mB2, "getContainingDeclaration(...)");
        if (!bi.k.d(interfaceC2503mB2)) {
            return new AbstractC8374n.d(bVarB);
        }
        InterfaceC2502l interfaceC2502l = (InterfaceC2502l) possiblySubstitutedFunction;
        if (interfaceC2502l.B()) {
            if (!AbstractC6492s.d(bVarB.e(), "constructor-impl") || !kotlin.text.t.B(bVarB.d(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        } else {
            if (!AbstractC6492s.d(bVarB.e(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
            InterfaceC2495e interfaceC2495eC = interfaceC2502l.C();
            AbstractC6492s.h(interfaceC2495eC, "getConstructedClass(...)");
            String strU = xh.o.u(interfaceC2495eC);
            if (kotlin.text.t.B(bVarB.d(), ")V", false, 2, null)) {
                bVarB = d.b.c(bVarB, null, kotlin.text.t.H0(bVarB.d(), "V") + strU, 1, null);
            } else if (!kotlin.text.t.B(bVarB.d(), strU, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        }
        return new AbstractC8374n.e(bVarB);
    }
}
