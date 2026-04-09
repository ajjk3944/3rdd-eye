package bi;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.D;
import Bh.EnumC2496f;
import Bh.G;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2506p;
import Bh.InterfaceC2507q;
import Bh.M;
import Bh.U;
import Bh.a0;
import Bh.b0;
import Bh.h0;
import Bh.t0;
import com.google.ar.core.ImageFormat;
import fi.AbstractC5833e;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.snmp4j.smi.SMIConstants;
import pi.J0;
import pi.S;
import pi.W;
import pi.v0;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Zh.c f33355a = new Zh.c("kotlin.jvm.JvmName");

    public static boolean A(InterfaceC2503m interfaceC2503m) {
        return D(interfaceC2503m, EnumC2496f.ENUM_CLASS);
    }

    public static boolean B(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(36);
        }
        return D(interfaceC2503m, EnumC2496f.ENUM_ENTRY);
    }

    public static boolean C(InterfaceC2503m interfaceC2503m) {
        return D(interfaceC2503m, EnumC2496f.INTERFACE);
    }

    private static boolean D(InterfaceC2503m interfaceC2503m, EnumC2496f enumC2496f) {
        if (enumC2496f == null) {
            a(37);
        }
        return (interfaceC2503m instanceof InterfaceC2495e) && ((InterfaceC2495e) interfaceC2503m).h() == enumC2496f;
    }

    public static boolean E(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(1);
        }
        while (interfaceC2503m != null) {
            if (u(interfaceC2503m) || y(interfaceC2503m)) {
                return true;
            }
            interfaceC2503m = interfaceC2503m.b();
        }
        return false;
    }

    private static boolean F(S s10, InterfaceC2503m interfaceC2503m) {
        if (s10 == null) {
            a(30);
        }
        if (interfaceC2503m == null) {
            a(31);
        }
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC == null) {
            return false;
        }
        InterfaceC2503m interfaceC2503mA = interfaceC2498hC.a();
        return (interfaceC2503mA instanceof InterfaceC2498h) && (interfaceC2503m instanceof InterfaceC2498h) && ((InterfaceC2498h) interfaceC2503m).k().equals(((InterfaceC2498h) interfaceC2503mA).k());
    }

    public static boolean G(InterfaceC2503m interfaceC2503m) {
        return (D(interfaceC2503m, EnumC2496f.CLASS) || D(interfaceC2503m, EnumC2496f.INTERFACE)) && ((InterfaceC2495e) interfaceC2503m).l() == D.SEALED;
    }

    public static boolean H(InterfaceC2495e interfaceC2495e, InterfaceC2495e interfaceC2495e2) {
        if (interfaceC2495e == null) {
            a(28);
        }
        if (interfaceC2495e2 == null) {
            a(29);
        }
        return I(interfaceC2495e.u(), interfaceC2495e2.a());
    }

    public static boolean I(S s10, InterfaceC2503m interfaceC2503m) {
        if (s10 == null) {
            a(32);
        }
        if (interfaceC2503m == null) {
            a(33);
        }
        if (F(s10, interfaceC2503m)) {
            return true;
        }
        Iterator it = s10.N0().a().iterator();
        while (it.hasNext()) {
            if (I((S) it.next(), interfaceC2503m)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(InterfaceC2503m interfaceC2503m) {
        return interfaceC2503m != null && (interfaceC2503m.b() instanceof M);
    }

    public static boolean K(t0 t0Var, S s10) {
        if (t0Var == null) {
            a(66);
        }
        if (s10 == null) {
            a(67);
        }
        if (t0Var.h0() || W.a(s10)) {
            return false;
        }
        if (J0.b(s10)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.builtins.i iVarM = AbstractC5833e.m(t0Var);
        if (!kotlin.reflect.jvm.internal.impl.builtins.i.s0(s10)) {
            kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f52144a;
            if (!eVar.b(iVarM.W(), s10) && !eVar.b(iVarM.K().u(), s10) && !eVar.b(iVarM.i(), s10) && !kotlin.reflect.jvm.internal.impl.builtins.s.d(s10)) {
                return false;
            }
        }
        return true;
    }

    public static InterfaceC2492b L(InterfaceC2492b interfaceC2492b) {
        if (interfaceC2492b == null) {
            a(59);
        }
        while (interfaceC2492b.h() == InterfaceC2492b.a.FAKE_OVERRIDE) {
            Collection collectionF = interfaceC2492b.f();
            if (collectionF.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC2492b);
            }
            interfaceC2492b = (InterfaceC2492b) collectionF.iterator().next();
        }
        return interfaceC2492b;
    }

    public static InterfaceC2507q M(InterfaceC2507q interfaceC2507q) {
        if (interfaceC2507q == null) {
            a(64);
        }
        if (interfaceC2507q instanceof InterfaceC2492b) {
            return L((InterfaceC2492b) interfaceC2507q);
        }
        if (interfaceC2507q == null) {
            a(65);
        }
        return interfaceC2507q;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 62:
            case 63:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
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
            case 7:
            case 9:
            case 10:
            case 12:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 62:
            case 63:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
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
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case ImageFormat.YUV_420_888 /* 35 */:
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
            case 7:
            case 9:
            case 10:
            case 12:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 62:
            case 63:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
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
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 32:
            case 45:
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
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
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
            case 69:
            case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
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
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
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
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
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
            case 7:
            case 9:
            case 10:
            case 12:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 62:
            case 63:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
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
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
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
            case ImageFormat.YUV_420_888 /* 35 */:
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
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
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
            case 7:
            case 9:
            case 10:
            case 12:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 62:
            case 63:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
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

    public static boolean b(InterfaceC2503m interfaceC2503m, InterfaceC2503m interfaceC2503m2) {
        if (interfaceC2503m == null) {
            a(16);
        }
        if (interfaceC2503m2 == null) {
            a(17);
        }
        return g(interfaceC2503m).equals(g(interfaceC2503m2));
    }

    private static void c(InterfaceC2491a interfaceC2491a, Set set) {
        if (interfaceC2491a == null) {
            a(73);
        }
        if (set == null) {
            a(74);
        }
        if (set.contains(interfaceC2491a)) {
            return;
        }
        Iterator it = interfaceC2491a.a().f().iterator();
        while (it.hasNext()) {
            InterfaceC2491a interfaceC2491aA = ((InterfaceC2491a) it.next()).a();
            c(interfaceC2491aA, set);
            set.add(interfaceC2491aA);
        }
    }

    public static Set d(InterfaceC2491a interfaceC2491a) {
        if (interfaceC2491a == null) {
            a(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(interfaceC2491a.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static InterfaceC2495e e(S s10) {
        if (s10 == null) {
            a(45);
        }
        return f(s10.N0());
    }

    public static InterfaceC2495e f(v0 v0Var) {
        if (v0Var == null) {
            a(46);
        }
        InterfaceC2495e interfaceC2495e = (InterfaceC2495e) v0Var.c();
        if (interfaceC2495e == null) {
            a(47);
        }
        return interfaceC2495e;
    }

    public static G g(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(21);
        }
        G gH = h(interfaceC2503m);
        if (gH == null) {
            a(22);
        }
        return gH;
    }

    public static G h(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(23);
        }
        while (interfaceC2503m != null) {
            if (interfaceC2503m instanceof G) {
                return (G) interfaceC2503m;
            }
            if (interfaceC2503m instanceof U) {
                return ((U) interfaceC2503m).u0();
            }
            interfaceC2503m = interfaceC2503m.b();
        }
        return null;
    }

    public static G i(S s10) {
        if (s10 == null) {
            a(20);
        }
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC == null) {
            return null;
        }
        return h(interfaceC2498hC);
    }

    public static h0 j(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(82);
        }
        if (interfaceC2503m instanceof a0) {
            interfaceC2503m = ((a0) interfaceC2503m).C0();
        }
        if (interfaceC2503m instanceof InterfaceC2506p) {
            h0 h0VarA = ((InterfaceC2506p) interfaceC2503m).j().a();
            if (h0VarA == null) {
                a(83);
            }
            return h0VarA;
        }
        h0 h0Var = h0.f1785a;
        if (h0Var == null) {
            a(84);
        }
        return h0Var;
    }

    public static AbstractC2510u k(InterfaceC2495e interfaceC2495e, boolean z10) {
        if (interfaceC2495e == null) {
            a(48);
        }
        EnumC2496f enumC2496fH = interfaceC2495e.h();
        if (enumC2496fH == EnumC2496f.ENUM_CLASS || enumC2496fH.isSingleton()) {
            AbstractC2510u abstractC2510u = AbstractC2509t.f1792a;
            if (abstractC2510u == null) {
                a(49);
            }
            return abstractC2510u;
        }
        if (G(interfaceC2495e)) {
            if (z10) {
                AbstractC2510u abstractC2510u2 = AbstractC2509t.f1794c;
                if (abstractC2510u2 == null) {
                    a(50);
                }
                return abstractC2510u2;
            }
            AbstractC2510u abstractC2510u3 = AbstractC2509t.f1792a;
            if (abstractC2510u3 == null) {
                a(51);
            }
            return abstractC2510u3;
        }
        if (u(interfaceC2495e)) {
            AbstractC2510u abstractC2510u4 = AbstractC2509t.f1803l;
            if (abstractC2510u4 == null) {
                a(52);
            }
            return abstractC2510u4;
        }
        AbstractC2510u abstractC2510u5 = AbstractC2509t.f1796e;
        if (abstractC2510u5 == null) {
            a(53);
        }
        return abstractC2510u5;
    }

    public static b0 l(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(0);
        }
        if (interfaceC2503m instanceof InterfaceC2495e) {
            return ((InterfaceC2495e) interfaceC2503m).J0();
        }
        return null;
    }

    public static Zh.d m(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(2);
        }
        Zh.c cVarO = o(interfaceC2503m);
        return cVarO != null ? cVarO.j() : p(interfaceC2503m);
    }

    public static Zh.c n(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(3);
        }
        Zh.c cVarO = o(interfaceC2503m);
        if (cVarO == null) {
            cVarO = p(interfaceC2503m).l();
        }
        if (cVarO == null) {
            a(4);
        }
        return cVarO;
    }

    private static Zh.c o(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(5);
        }
        if ((interfaceC2503m instanceof G) || kotlin.reflect.jvm.internal.impl.types.error.l.m(interfaceC2503m)) {
            return Zh.c.f25405c;
        }
        if (interfaceC2503m instanceof U) {
            return ((U) interfaceC2503m).e();
        }
        if (interfaceC2503m instanceof M) {
            return ((M) interfaceC2503m).e();
        }
        return null;
    }

    private static Zh.d p(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(6);
        }
        Zh.d dVarC = m(interfaceC2503m.b()).c(interfaceC2503m.getName());
        if (dVarC == null) {
            a(7);
        }
        return dVarC;
    }

    public static InterfaceC2503m q(InterfaceC2503m interfaceC2503m, Class cls) {
        if (cls == null) {
            a(18);
        }
        return r(interfaceC2503m, cls, true);
    }

    public static InterfaceC2503m r(InterfaceC2503m interfaceC2503m, Class cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (interfaceC2503m == null) {
            return null;
        }
        if (z10) {
            interfaceC2503m = interfaceC2503m.b();
        }
        while (interfaceC2503m != null) {
            if (cls.isInstance(interfaceC2503m)) {
                return interfaceC2503m;
            }
            interfaceC2503m = interfaceC2503m.b();
        }
        return null;
    }

    public static InterfaceC2495e s(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(44);
        }
        Iterator it = interfaceC2495e.k().a().iterator();
        while (it.hasNext()) {
            InterfaceC2495e interfaceC2495eE = e((S) it.next());
            if (interfaceC2495eE.h() != EnumC2496f.INTERFACE) {
                return interfaceC2495eE;
            }
        }
        return null;
    }

    public static boolean t(InterfaceC2503m interfaceC2503m) {
        return D(interfaceC2503m, EnumC2496f.ANNOTATION_CLASS);
    }

    public static boolean u(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(34);
        }
        return v(interfaceC2503m) && interfaceC2503m.getName().equals(Zh.h.f25422b);
    }

    public static boolean v(InterfaceC2503m interfaceC2503m) {
        return D(interfaceC2503m, EnumC2496f.CLASS);
    }

    public static boolean w(InterfaceC2503m interfaceC2503m) {
        return v(interfaceC2503m) || A(interfaceC2503m);
    }

    public static boolean x(InterfaceC2503m interfaceC2503m) {
        return D(interfaceC2503m, EnumC2496f.OBJECT) && ((InterfaceC2495e) interfaceC2503m).z();
    }

    public static boolean y(InterfaceC2503m interfaceC2503m) {
        return (interfaceC2503m instanceof InterfaceC2507q) && ((InterfaceC2507q) interfaceC2503m).getVisibility() == AbstractC2509t.f1797f;
    }

    public static boolean z(InterfaceC2495e interfaceC2495e, InterfaceC2495e interfaceC2495e2) {
        if (interfaceC2495e == null) {
            a(26);
        }
        if (interfaceC2495e2 == null) {
            a(27);
        }
        Iterator it = interfaceC2495e.k().a().iterator();
        while (it.hasNext()) {
            if (F((S) it.next(), interfaceC2495e2.a())) {
                return true;
            }
        }
        return false;
    }
}
