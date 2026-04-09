package Sh;

import Bh.EnumC2496f;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.M;
import Bh.Z;
import Bh.k0;
import Bh.l0;
import kotlin.jvm.internal.AbstractC6492s;
import pi.B0;
import pi.J0;
import pi.N0;
import pi.Q;
import pi.S;
import pi.v0;
import si.AbstractC7984d;
import xi.AbstractC8543j;

/* renamed from: Sh.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3510j {
    public static final String a(InterfaceC2495e klass, G typeMappingConfiguration) {
        AbstractC6492s.i(klass, "klass");
        AbstractC6492s.i(typeMappingConfiguration, "typeMappingConfiguration");
        String strE = typeMappingConfiguration.e(klass);
        if (strE != null) {
            return strE;
        }
        InterfaceC2503m interfaceC2503mB = klass.b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        String strD = Zh.h.b(klass.getName()).d();
        AbstractC6492s.h(strD, "getIdentifier(...)");
        if (interfaceC2503mB instanceof M) {
            Zh.c cVarE = ((M) interfaceC2503mB).e();
            if (cVarE.d()) {
                return strD;
            }
            StringBuilder sb2 = new StringBuilder();
            String strB = cVarE.b();
            AbstractC6492s.h(strB, "asString(...)");
            sb2.append(kotlin.text.t.K(strB, '.', '/', false, 4, null));
            sb2.append('/');
            sb2.append(strD);
            return sb2.toString();
        }
        InterfaceC2495e interfaceC2495e = interfaceC2503mB instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mB : null;
        if (interfaceC2495e == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC2503mB + " for " + klass);
        }
        String strB2 = typeMappingConfiguration.b(interfaceC2495e);
        if (strB2 == null) {
            strB2 = a(interfaceC2495e, typeMappingConfiguration);
        }
        return strB2 + '$' + strD;
    }

    public static /* synthetic */ String b(InterfaceC2495e interfaceC2495e, G g10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g10 = H.f20705a;
        }
        return a(interfaceC2495e, g10);
    }

    public static final boolean c(InterfaceC2491a descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (descriptor instanceof InterfaceC2502l) {
            return true;
        }
        S returnType = descriptor.getReturnType();
        AbstractC6492s.f(returnType);
        if (kotlin.reflect.jvm.internal.impl.builtins.i.C0(returnType)) {
            S returnType2 = descriptor.getReturnType();
            AbstractC6492s.f(returnType2);
            if (!J0.l(returnType2) && !(descriptor instanceof Z)) {
                return true;
            }
        }
        return false;
    }

    public static final Object d(S kotlinType, t factory, I mode, G typeMappingConfiguration, q qVar, mh.q writeGenericType) {
        Object objC;
        S s10;
        Object objD;
        AbstractC6492s.i(kotlinType, "kotlinType");
        AbstractC6492s.i(factory, "factory");
        AbstractC6492s.i(mode, "mode");
        AbstractC6492s.i(typeMappingConfiguration, "typeMappingConfiguration");
        AbstractC6492s.i(writeGenericType, "writeGenericType");
        S sD = typeMappingConfiguration.d(kotlinType);
        if (sD != null) {
            return d(sD, factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.h.r(kotlinType)) {
            return d(kotlin.reflect.jvm.internal.impl.builtins.p.a(kotlinType), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        kotlin.reflect.jvm.internal.impl.types.checker.s sVar = kotlin.reflect.jvm.internal.impl.types.checker.s.f52171a;
        Object objB = J.b(sVar, kotlinType, factory, mode);
        if (objB != null) {
            Object objA = J.a(factory, objB, mode.d());
            writeGenericType.s(kotlinType, objA, mode);
            return objA;
        }
        v0 v0VarN0 = kotlinType.N0();
        if (v0VarN0 instanceof Q) {
            Q q10 = (Q) v0VarN0;
            S sL = q10.l();
            if (sL == null) {
                sL = typeMappingConfiguration.c(q10.a());
            }
            return d(AbstractC7984d.D(sL), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        InterfaceC2498h interfaceC2498hC = v0VarN0.c();
        if (interfaceC2498hC == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.l.m(interfaceC2498hC)) {
            Object objC2 = factory.c("error/NonExistentClass");
            typeMappingConfiguration.a(kotlinType, (InterfaceC2495e) interfaceC2498hC);
            return objC2;
        }
        boolean z10 = interfaceC2498hC instanceof InterfaceC2495e;
        if (z10 && kotlin.reflect.jvm.internal.impl.builtins.i.c0(kotlinType)) {
            if (kotlinType.L0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            B0 b02 = (B0) kotlinType.L0().get(0);
            S type = b02.getType();
            AbstractC6492s.h(type, "getType(...)");
            if (b02.a() == N0.IN_VARIANCE) {
                objD = factory.c("java/lang/Object");
            } else {
                N0 n0A = b02.a();
                AbstractC6492s.h(n0A, "getProjectionKind(...)");
                objD = d(type, factory, mode.f(n0A, true), typeMappingConfiguration, qVar, writeGenericType);
            }
            return factory.b('[' + factory.a(objD));
        }
        if (!z10) {
            if (interfaceC2498hC instanceof l0) {
                S sO = AbstractC7984d.o((l0) interfaceC2498hC);
                if (kotlinType.O0()) {
                    sO = AbstractC7984d.B(sO);
                }
                return d(sO, factory, mode, typeMappingConfiguration, null, AbstractC8543j.l());
            }
            if ((interfaceC2498hC instanceof k0) && mode.b()) {
                return d(((k0) interfaceC2498hC).U(), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (bi.k.b(interfaceC2498hC) && !mode.c() && (s10 = (S) pi.H.a(sVar, kotlinType)) != null) {
            return d(s10, factory, mode.g(), typeMappingConfiguration, qVar, writeGenericType);
        }
        if (mode.e() && kotlin.reflect.jvm.internal.impl.builtins.i.l0((InterfaceC2495e) interfaceC2498hC)) {
            objC = factory.e();
        } else {
            InterfaceC2495e interfaceC2495e = (InterfaceC2495e) interfaceC2498hC;
            InterfaceC2495e interfaceC2495eA = interfaceC2495e.a();
            AbstractC6492s.h(interfaceC2495eA, "getOriginal(...)");
            Object objF = typeMappingConfiguration.f(interfaceC2495eA);
            if (objF == null) {
                if (interfaceC2495e.h() == EnumC2496f.ENUM_ENTRY) {
                    InterfaceC2503m interfaceC2503mB = interfaceC2495e.b();
                    AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC2495e = (InterfaceC2495e) interfaceC2503mB;
                }
                InterfaceC2495e interfaceC2495eA2 = interfaceC2495e.a();
                AbstractC6492s.h(interfaceC2495eA2, "getOriginal(...)");
                objC = factory.c(a(interfaceC2495eA2, typeMappingConfiguration));
            } else {
                objC = objF;
            }
        }
        writeGenericType.s(kotlinType, objC, mode);
        return objC;
    }

    public static /* synthetic */ Object e(S s10, t tVar, I i10, G g10, q qVar, mh.q qVar2, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            qVar2 = AbstractC8543j.l();
        }
        return d(s10, tVar, i10, g10, qVar, qVar2);
    }
}
