package kotlin.reflect.jvm.internal.impl.builtins;

import Bh.AbstractC2508s;
import Bh.AbstractC2514y;
import Bh.G;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.M;
import Bh.Y;
import Bh.Z;
import Bh.a0;
import Ch.a;
import Ch.c;
import Dh.F;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.ar.core.ImageFormat;
import fi.AbstractC5833e;
import ii.InterfaceC6164k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.snmp4j.asn1.BER;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.SMIConstants;
import org.snmp4j.transport.DefaultTcpTransportMapping;
import pi.AbstractC7346d0;
import pi.B0;
import pi.D0;
import pi.J0;
import pi.N0;
import pi.S;
import pi.V;
import pi.s0;
import pi.v0;
import zh.C8762a;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: g, reason: collision with root package name */
    public static final Zh.f f51738g = Zh.f.n("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    private F f51739a;

    /* renamed from: b, reason: collision with root package name */
    private oi.i f51740b;

    /* renamed from: c, reason: collision with root package name */
    private final oi.i f51741c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.i f51742d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.g f51743e;

    /* renamed from: f, reason: collision with root package name */
    private final oi.n f51744f;

    class a implements InterfaceC6824a {
        a() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            return Arrays.asList(i.this.r().y(o.f51769A), i.this.r().y(o.f51771C), i.this.r().y(o.f51772D), i.this.r().y(o.f51770B));
        }
    }

    class b implements InterfaceC6824a {
        b() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(l.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (l lVar : l.values()) {
                AbstractC7346d0 abstractC7346d0Q = i.this.q(lVar.getTypeName().b());
                AbstractC7346d0 abstractC7346d0Q2 = i.this.q(lVar.getArrayTypeName().b());
                enumMap.put((EnumMap) lVar, (l) abstractC7346d0Q2);
                map.put(abstractC7346d0Q, abstractC7346d0Q2);
                map2.put(abstractC7346d0Q2, abstractC7346d0Q);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    class c implements InterfaceC6835l {
        c() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC2495e invoke(Zh.f fVar) {
            InterfaceC2498h interfaceC2498hG = i.this.s().g(fVar, Ih.d.FROM_BUILTINS);
            if (interfaceC2498hG == null) {
                throw new AssertionError("Built-in class " + o.f51769A.c(fVar) + " is not found");
            }
            if (interfaceC2498hG instanceof InterfaceC2495e) {
                return (InterfaceC2495e) interfaceC2498hG;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + interfaceC2498hG);
        }
    }

    class d implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F f51748a;

        d(F f10) {
            this.f51748a = f10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (i.this.f51739a == null) {
                i.this.f51739a = this.f51748a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + i.this.f51739a + " (attempting to reset to " + this.f51748a + ")");
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Map f51750a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f51751b;

        /* renamed from: c, reason: collision with root package name */
        public final Map f51752c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map map, Map map2, Map map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f51750a = map;
            this.f51751b = map2;
            this.f51752c = map3;
        }
    }

    protected i(oi.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f51744f = nVar;
        this.f51742d = nVar.f(new a());
        this.f51741c = nVar.f(new b());
        this.f51743e = nVar.e(new c());
    }

    private static S A(S s10, G g10) {
        Zh.b bVarN;
        Zh.b bVarA;
        InterfaceC2495e interfaceC2495eB;
        if (s10 == null) {
            a(72);
        }
        if (g10 == null) {
            a(73);
        }
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC == null) {
            return null;
        }
        s sVar = s.f51897a;
        if (!sVar.b(interfaceC2498hC.getName()) || (bVarN = AbstractC5833e.n(interfaceC2498hC)) == null || (bVarA = sVar.a(bVarN)) == null || (interfaceC2495eB = AbstractC2514y.b(g10, bVarA)) == null) {
            return null;
        }
        return interfaceC2495eB.u();
    }

    public static boolean A0(S s10) {
        if (s10 == null) {
            a(130);
        }
        return i0(s10, o.a.f51820I0.j());
    }

    public static boolean B0(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(10);
        }
        while (interfaceC2503m != null) {
            if (interfaceC2503m instanceof M) {
                return ((M) interfaceC2503m).e().i(o.f51802z);
            }
            interfaceC2503m = interfaceC2503m.b();
        }
        return false;
    }

    public static boolean C0(S s10) {
        if (s10 == null) {
            a(143);
        }
        return m0(s10, o.a.f51854f);
    }

    public static boolean D0(S s10) {
        if (s10 == null) {
            a(133);
        }
        return x0(s10) || A0(s10) || y0(s10) || z0(s10);
    }

    public static l N(S s10) {
        if (s10 == null) {
            a(93);
        }
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC == null) {
            return null;
        }
        return P(interfaceC2498hC);
    }

    public static l P(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(78);
        }
        if (o.a.f51828M0.contains(interfaceC2503m.getName())) {
            return (l) o.a.f51832O0.get(bi.i.m(interfaceC2503m));
        }
        return null;
    }

    private InterfaceC2495e Q(l lVar) {
        if (lVar == null) {
            a(16);
        }
        return p(lVar.getTypeName().b());
    }

    public static l S(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(77);
        }
        if (o.a.f51826L0.contains(interfaceC2503m.getName())) {
            return (l) o.a.f51830N0.get(bi.i.m(interfaceC2503m));
        }
        return null;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case ImageFormat.YUV_420_888 /* 35 */:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
            case 66:
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
            case 69:
            case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case ImageFormat.YUV_420_888 /* 35 */:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
            case 66:
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
            case 69:
            case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case ImageFormat.YUV_420_888 /* 35 */:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
            case 66:
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
            case 69:
            case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case SnmpConstants.DEFAULT_COMMAND_RESPONDER_PORT /* 161 */:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case DefaultTcpTransportMapping.DEFAULT_MAX_BUSY_LOOPS /* 100 */:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case BER.MAX_OID_LENGTH /* 127 */:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case ModuleDescriptor.MODULE_VERSION /* 140 */:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case SnmpConstants.DEFAULT_NOTIFICATION_RECEIVER_PORT /* 162 */:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case ImageFormat.YUV_420_888 /* 35 */:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case ImageFormat.YUV_420_888 /* 35 */:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
            case 66:
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
            case 69:
            case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case DefaultTcpTransportMapping.DEFAULT_MAX_BUSY_LOOPS /* 100 */:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case BER.MAX_OID_LENGTH /* 127 */:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 140 */:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case SnmpConstants.DEFAULT_COMMAND_RESPONDER_PORT /* 161 */:
                objArr[2] = "isCloneable";
                break;
            case SnmpConstants.DEFAULT_NOTIFICATION_RECEIVER_PORT /* 162 */:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case ImageFormat.YUV_420_888 /* 35 */:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
            case 66:
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
            case 69:
            case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean a0(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(109);
        }
        return e(interfaceC2495e, o.a.f51846b);
    }

    public static boolean b0(S s10) {
        if (s10 == null) {
            a(ModuleDescriptor.MODULE_VERSION);
        }
        return h0(s10, o.a.f51846b);
    }

    public static boolean c0(S s10) {
        if (s10 == null) {
            a(89);
        }
        return h0(s10, o.a.f51860i);
    }

    public static boolean d0(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(90);
        }
        return e(interfaceC2495e, o.a.f51860i) || P(interfaceC2495e) != null;
    }

    private static boolean e(InterfaceC2498h interfaceC2498h, Zh.d dVar) {
        if (interfaceC2498h == null) {
            a(104);
        }
        if (dVar == null) {
            a(105);
        }
        return interfaceC2498h.getName().equals(dVar.i()) && dVar.equals(bi.i.m(interfaceC2498h));
    }

    public static boolean e0(S s10) {
        if (s10 == null) {
            a(91);
        }
        return c0(s10) || q0(s10);
    }

    public static boolean f0(S s10) {
        if (s10 == null) {
            a(111);
        }
        return i0(s10, o.a.f51862j);
    }

    public static boolean g0(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(9);
        }
        return bi.i.r(interfaceC2503m, kotlin.reflect.jvm.internal.impl.builtins.c.class, false) != null;
    }

    private static boolean h0(S s10, Zh.d dVar) {
        if (s10 == null) {
            a(98);
        }
        if (dVar == null) {
            a(99);
        }
        return w0(s10.N0(), dVar);
    }

    private static boolean i0(S s10, Zh.d dVar) {
        if (s10 == null) {
            a(135);
        }
        if (dVar == null) {
            a(136);
        }
        return h0(s10, dVar) && !s10.O0();
    }

    public static boolean j0(S s10) {
        if (s10 == null) {
            a(142);
        }
        return p0(s10);
    }

    public static boolean k0(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(SnmpConstants.DEFAULT_NOTIFICATION_RECEIVER_PORT);
        }
        if (interfaceC2503m.a().getAnnotations().P(o.a.f51892y)) {
            return true;
        }
        if (!(interfaceC2503m instanceof Y)) {
            return false;
        }
        Y y10 = (Y) interfaceC2503m;
        boolean zH0 = y10.h0();
        Z zD = y10.d();
        a0 a0VarG = y10.g();
        if (zD != null && k0(zD)) {
            if (!zH0) {
                return true;
            }
            if (a0VarG != null && k0(a0VarG)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(159);
        }
        return e(interfaceC2495e, o.a.f51867l0);
    }

    private static boolean m0(S s10, Zh.d dVar) {
        if (s10 == null) {
            a(106);
        }
        if (dVar == null) {
            a(107);
        }
        return !s10.O0() && h0(s10, dVar);
    }

    public static boolean n0(S s10) {
        if (s10 == null) {
            a(137);
        }
        return o0(s10) && !J0.l(s10);
    }

    public static boolean o0(S s10) {
        if (s10 == null) {
            a(139);
        }
        return h0(s10, o.a.f51848c);
    }

    private InterfaceC2495e p(String str) {
        if (str == null) {
            a(14);
        }
        InterfaceC2495e interfaceC2495e = (InterfaceC2495e) this.f51743e.invoke(Zh.f.h(str));
        if (interfaceC2495e == null) {
            a(15);
        }
        return interfaceC2495e;
    }

    public static boolean p0(S s10) {
        if (s10 == null) {
            a(141);
        }
        return b0(s10) && s10.O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC7346d0 q(String str) {
        if (str == null) {
            a(47);
        }
        AbstractC7346d0 abstractC7346d0U = p(str).u();
        if (abstractC7346d0U == null) {
            a(48);
        }
        return abstractC7346d0U;
    }

    public static boolean q0(S s10) {
        if (s10 == null) {
            a(92);
        }
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        return (interfaceC2498hC == null || P(interfaceC2498hC) == null) ? false : true;
    }

    public static boolean r0(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(97);
        }
        return S(interfaceC2495e) != null;
    }

    public static boolean s0(S s10) {
        if (s10 == null) {
            a(95);
        }
        return !s10.O0() && t0(s10);
    }

    public static boolean t0(S s10) {
        if (s10 == null) {
            a(96);
        }
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        return (interfaceC2498hC instanceof InterfaceC2495e) && r0((InterfaceC2495e) interfaceC2498hC);
    }

    public static boolean u0(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(108);
        }
        return e(interfaceC2495e, o.a.f51846b) || e(interfaceC2495e, o.a.f51848c);
    }

    public static boolean v0(S s10) {
        return s10 != null && m0(s10, o.a.f51858h);
    }

    public static boolean w0(v0 v0Var, Zh.d dVar) {
        if (v0Var == null) {
            a(102);
        }
        if (dVar == null) {
            a(103);
        }
        InterfaceC2498h interfaceC2498hC = v0Var.c();
        return (interfaceC2498hC instanceof InterfaceC2495e) && e(interfaceC2498hC, dVar);
    }

    public static boolean x0(S s10) {
        if (s10 == null) {
            a(129);
        }
        return i0(s10, o.a.f51818H0.j());
    }

    public static boolean y0(S s10) {
        if (s10 == null) {
            a(131);
        }
        return i0(s10, o.a.f51822J0.j());
    }

    public static boolean z0(S s10) {
        if (s10 == null) {
            a(132);
        }
        return i0(s10, o.a.f51824K0.j());
    }

    public AbstractC7346d0 B() {
        AbstractC7346d0 abstractC7346d0R = R(l.FLOAT);
        if (abstractC7346d0R == null) {
            a(61);
        }
        return abstractC7346d0R;
    }

    public InterfaceC2495e C(int i10) {
        return p(o.b(i10));
    }

    public AbstractC7346d0 D() {
        AbstractC7346d0 abstractC7346d0R = R(l.INT);
        if (abstractC7346d0R == null) {
            a(59);
        }
        return abstractC7346d0R;
    }

    public InterfaceC2495e E() {
        InterfaceC2495e interfaceC2495eO = o(o.a.f51867l0.l());
        if (interfaceC2495eO == null) {
            a(21);
        }
        return interfaceC2495eO;
    }

    public void E0(F f10) {
        if (f10 == null) {
            a(1);
        }
        this.f51744f.d(new d(f10));
    }

    public AbstractC7346d0 F() {
        AbstractC7346d0 abstractC7346d0R = R(l.LONG);
        if (abstractC7346d0R == null) {
            a(60);
        }
        return abstractC7346d0R;
    }

    public InterfaceC2495e G() {
        return p("Nothing");
    }

    public AbstractC7346d0 H() {
        AbstractC7346d0 abstractC7346d0U = G().u();
        if (abstractC7346d0U == null) {
            a(49);
        }
        return abstractC7346d0U;
    }

    public AbstractC7346d0 I() {
        AbstractC7346d0 abstractC7346d0U0 = i().R0(true);
        if (abstractC7346d0U0 == null) {
            a(52);
        }
        return abstractC7346d0U0;
    }

    public AbstractC7346d0 J() {
        AbstractC7346d0 abstractC7346d0U0 = H().R0(true);
        if (abstractC7346d0U0 == null) {
            a(50);
        }
        return abstractC7346d0U0;
    }

    public InterfaceC2495e K() {
        return p("Number");
    }

    public AbstractC7346d0 L() {
        AbstractC7346d0 abstractC7346d0U = K().u();
        if (abstractC7346d0U == null) {
            a(56);
        }
        return abstractC7346d0U;
    }

    protected Ch.c M() {
        c.b bVar = c.b.f2754a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public AbstractC7346d0 O(l lVar) {
        if (lVar == null) {
            a(74);
        }
        AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) ((e) this.f51741c.invoke()).f51750a.get(lVar);
        if (abstractC7346d0 == null) {
            a(75);
        }
        return abstractC7346d0;
    }

    public AbstractC7346d0 R(l lVar) {
        if (lVar == null) {
            a(54);
        }
        AbstractC7346d0 abstractC7346d0U = Q(lVar).u();
        if (abstractC7346d0U == null) {
            a(55);
        }
        return abstractC7346d0U;
    }

    public AbstractC7346d0 T() {
        AbstractC7346d0 abstractC7346d0R = R(l.SHORT);
        if (abstractC7346d0R == null) {
            a(58);
        }
        return abstractC7346d0R;
    }

    protected oi.n U() {
        oi.n nVar = this.f51744f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public InterfaceC2495e V() {
        return p("String");
    }

    public AbstractC7346d0 W() {
        AbstractC7346d0 abstractC7346d0U = V().u();
        if (abstractC7346d0U == null) {
            a(66);
        }
        return abstractC7346d0U;
    }

    public InterfaceC2495e X(int i10) {
        InterfaceC2495e interfaceC2495eO = o(o.f51795s.c(Zh.f.h(o.d(i10))));
        if (interfaceC2495eO == null) {
            a(18);
        }
        return interfaceC2495eO;
    }

    public InterfaceC2495e Y() {
        return p("Unit");
    }

    public AbstractC7346d0 Z() {
        AbstractC7346d0 abstractC7346d0U = Y().u();
        if (abstractC7346d0U == null) {
            a(65);
        }
        return abstractC7346d0U;
    }

    protected void f(boolean z10) {
        F f10 = new F(f51738g, this.f51744f, this, null);
        this.f51739a = f10;
        f10.O0(kotlin.reflect.jvm.internal.impl.builtins.b.f51730a.c().a(this.f51744f, this.f51739a, v(), M(), g(), z10));
        F f11 = this.f51739a;
        f11.W0(f11);
    }

    protected Ch.a g() {
        a.C0138a c0138a = a.C0138a.f2752a;
        if (c0138a == null) {
            a(3);
        }
        return c0138a;
    }

    public InterfaceC2495e h() {
        return p("Any");
    }

    public AbstractC7346d0 i() {
        AbstractC7346d0 abstractC7346d0U = h().u();
        if (abstractC7346d0U == null) {
            a(51);
        }
        return abstractC7346d0U;
    }

    public InterfaceC2495e j() {
        return p("Array");
    }

    public S k(S s10) {
        S sA;
        if (s10 == null) {
            a(68);
        }
        if (c0(s10)) {
            if (s10.L0().size() != 1) {
                throw new IllegalStateException();
            }
            S type = ((B0) s10.L0().get(0)).getType();
            if (type == null) {
                a(69);
            }
            return type;
        }
        S sN = J0.n(s10);
        S s11 = (S) ((e) this.f51741c.invoke()).f51752c.get(sN);
        if (s11 != null) {
            return s11;
        }
        G gI = bi.i.i(sN);
        if (gI != null && (sA = A(sN, gI)) != null) {
            return sA;
        }
        throw new IllegalStateException("not array: " + s10);
    }

    public AbstractC7346d0 l(N0 n02, S s10) {
        if (n02 == null) {
            a(83);
        }
        if (s10 == null) {
            a(84);
        }
        AbstractC7346d0 abstractC7346d0M = m(n02, s10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b());
        if (abstractC7346d0M == null) {
            a(85);
        }
        return abstractC7346d0M;
    }

    public AbstractC7346d0 m(N0 n02, S s10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        if (n02 == null) {
            a(79);
        }
        if (s10 == null) {
            a(80);
        }
        if (hVar == null) {
            a(81);
        }
        AbstractC7346d0 abstractC7346d0H = V.h(s0.b(hVar), j(), Collections.singletonList(new D0(n02, s10)));
        if (abstractC7346d0H == null) {
            a(82);
        }
        return abstractC7346d0H;
    }

    public AbstractC7346d0 n() {
        AbstractC7346d0 abstractC7346d0R = R(l.BOOLEAN);
        if (abstractC7346d0R == null) {
            a(64);
        }
        return abstractC7346d0R;
    }

    public InterfaceC2495e o(Zh.c cVar) {
        if (cVar == null) {
            a(12);
        }
        InterfaceC2495e interfaceC2495eD = AbstractC2508s.d(r(), cVar, Ih.d.FROM_BUILTINS);
        if (interfaceC2495eD == null) {
            a(13);
        }
        return interfaceC2495eD;
    }

    public F r() {
        if (this.f51739a == null) {
            this.f51739a = (F) this.f51740b.invoke();
        }
        F f10 = this.f51739a;
        if (f10 == null) {
            a(7);
        }
        return f10;
    }

    public InterfaceC6164k s() {
        InterfaceC6164k interfaceC6164kR = r().y(o.f51769A).r();
        if (interfaceC6164kR == null) {
            a(11);
        }
        return interfaceC6164kR;
    }

    public AbstractC7346d0 t() {
        AbstractC7346d0 abstractC7346d0R = R(l.BYTE);
        if (abstractC7346d0R == null) {
            a(57);
        }
        return abstractC7346d0R;
    }

    public AbstractC7346d0 u() {
        AbstractC7346d0 abstractC7346d0R = R(l.CHAR);
        if (abstractC7346d0R == null) {
            a(63);
        }
        return abstractC7346d0R;
    }

    protected Iterable v() {
        List listSingletonList = Collections.singletonList(new C8762a(this.f51744f, r()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public InterfaceC2495e w() {
        InterfaceC2495e interfaceC2495eO = o(o.a.f51841X);
        if (interfaceC2495eO == null) {
            a(35);
        }
        return interfaceC2495eO;
    }

    public InterfaceC2495e x() {
        return p("Comparable");
    }

    public AbstractC7346d0 y() {
        AbstractC7346d0 abstractC7346d0I = I();
        if (abstractC7346d0I == null) {
            a(53);
        }
        return abstractC7346d0I;
    }

    public AbstractC7346d0 z() {
        AbstractC7346d0 abstractC7346d0R = R(l.DOUBLE);
        if (abstractC7346d0R == null) {
            a(62);
        }
        return abstractC7346d0R;
    }
}
