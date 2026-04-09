package ts;

import ht.m0;
import ht.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import rr.a0;
import rr.f0;
import rr.j0;
import rr.p;
import rr.p0;
import rr.z;
import ur.c0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22961a = 0;

    static {
        new qs.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "getFqNameUnsafe";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(rr.b bVar, LinkedHashSet linkedHashSet) {
        if (bVar == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(bVar)) {
            return;
        }
        Iterator it = bVar.u1().p().iterator();
        while (it.hasNext()) {
            rr.b bVarU1 = ((rr.b) it.next()).u1();
            b(bVarU1, linkedHashSet);
            linkedHashSet.add(bVarU1);
        }
    }

    public static rr.f c(x xVar) {
        if (xVar == null) {
            a(45);
            throw null;
        }
        m0 m0VarZ = xVar.Z();
        if (m0VarZ == null) {
            a(46);
            throw null;
        }
        rr.f fVar = (rr.f) m0VarZ.p();
        if (fVar != null) {
            return fVar;
        }
        a(47);
        throw null;
    }

    public static a0 d(rr.l lVar) {
        if (lVar == null) {
            a(21);
            throw null;
        }
        a0 a0VarE = e(lVar);
        if (a0VarE != null) {
            return a0VarE;
        }
        a(22);
        throw null;
    }

    public static a0 e(rr.l lVar) {
        if (lVar == null) {
            a(23);
            throw null;
        }
        while (lVar != null) {
            if (lVar instanceof a0) {
                return (a0) lVar;
            }
            if (lVar instanceof j0) {
                return ((ur.x) ((j0) lVar)).f23678r;
            }
            lVar = lVar.o();
        }
        return null;
    }

    public static p0 f(rr.l lVar) {
        p0 p0Var = p0.f21710d;
        if (lVar == null) {
            a(82);
            throw null;
        }
        if (lVar instanceof ur.j0) {
            lVar = ((ur.j0) lVar).v1();
        }
        if (lVar instanceof rr.m) {
            ((rr.m) lVar).h().getClass();
        }
        return p0Var;
    }

    public static qs.e g(rr.l lVar) {
        if (lVar != null) {
            qs.c cVarH = h(lVar);
            return cVarH != null ? cVarH.i() : g(lVar.o()).b(lVar.getName());
        }
        a(2);
        throw null;
    }

    public static qs.c h(rr.l lVar) {
        if (lVar == null) {
            a(5);
            throw null;
        }
        if ((lVar instanceof a0) || kt.k.f(lVar)) {
            return qs.c.f21024c;
        }
        if (lVar instanceof j0) {
            return ((ur.x) ((j0) lVar)).f23679x;
        }
        if (lVar instanceof f0) {
            return ((c0) ((f0) lVar)).f23629y;
        }
        return null;
    }

    public static rr.l i(rr.l lVar, Class cls, boolean z10) {
        if (lVar == null) {
            return null;
        }
        if (z10) {
            lVar = lVar.o();
        }
        while (lVar != null) {
            if (cls.isInstance(lVar)) {
                return lVar;
            }
            lVar = lVar.o();
        }
        return null;
    }

    public static rr.f j(rr.f fVar) {
        if (fVar == null) {
            a(44);
            throw null;
        }
        Iterator it = fVar.v().q().iterator();
        while (it.hasNext()) {
            rr.f fVarC = c((x) it.next());
            if (fVarC.f() != rr.g.INTERFACE) {
                return fVarC;
            }
        }
        return null;
    }

    public static boolean k(rr.l lVar) {
        return n(lVar, rr.g.CLASS) && lVar.getName().equals(qs.i.f21038a);
    }

    public static boolean l(rr.l lVar) {
        return n(lVar, rr.g.OBJECT) && ((rr.f) lVar).w();
    }

    public static boolean m(rr.l lVar) {
        if (lVar != null) {
            return n(lVar, rr.g.ENUM_ENTRY);
        }
        a(36);
        throw null;
    }

    public static boolean n(rr.l lVar, rr.g gVar) {
        if (gVar != null) {
            return (lVar instanceof rr.f) && ((rr.f) lVar).f() == gVar;
        }
        a(37);
        throw null;
    }

    public static boolean o(rr.l lVar) {
        if (lVar == null) {
            a(1);
            throw null;
        }
        while (lVar != null) {
            if (k(lVar) || ((lVar instanceof rr.o) && ((rr.o) lVar).c() == p.f21702f)) {
                return true;
            }
            lVar = lVar.o();
        }
        return false;
    }

    public static boolean p(x xVar, rr.l lVar) {
        if (xVar == null) {
            a(30);
            throw null;
        }
        if (lVar == null) {
            a(31);
            throw null;
        }
        rr.i iVarP = xVar.Z().p();
        if (iVarP == null) {
            return false;
        }
        rr.l lVarU1 = iVarP.u1();
        return (lVarU1 instanceof rr.i) && (lVar instanceof rr.i) && ((rr.i) lVar).v().equals(((rr.i) lVarU1).v());
    }

    public static boolean q(rr.l lVar) {
        return (n(lVar, rr.g.CLASS) || n(lVar, rr.g.INTERFACE)) && ((rr.f) lVar).j() == z.SEALED;
    }

    public static boolean r(x xVar, rr.l lVar) {
        if (xVar == null) {
            a(32);
            throw null;
        }
        if (lVar == null) {
            a(33);
            throw null;
        }
        if (p(xVar, lVar)) {
            return true;
        }
        Iterator it = xVar.Z().q().iterator();
        while (it.hasNext()) {
            if (r((x) it.next(), lVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(rr.l lVar) {
        return lVar != null && (lVar.o() instanceof f0);
    }

    public static rr.d t(rr.d dVar) {
        if (dVar == null) {
            a(59);
            throw null;
        }
        while (dVar.f() == rr.c.FAKE_OVERRIDE) {
            Collection collectionP = dVar.p();
            if (collectionP.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + dVar);
            }
            dVar = (rr.d) collectionP.iterator().next();
        }
        return dVar;
    }
}
