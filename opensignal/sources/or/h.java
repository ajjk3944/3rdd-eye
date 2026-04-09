package or;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.i4;
import ht.a1;
import ht.b0;
import ht.c1;
import ht.d1;
import ht.g0;
import ht.p0;
import ht.x;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rr.f0;
import rr.h0;
import rr.m0;
import rr.u;
import rr.w;
import ur.a0;
import ur.c0;
import ur.i0;
import ur.j0;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: e, reason: collision with root package name */
    public static final qs.g f19672e = qs.g.g("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    public a0 f19673a;

    /* renamed from: b, reason: collision with root package name */
    public final gt.i f19674b;

    /* renamed from: c, reason: collision with root package name */
    public final gt.e f19675c;

    /* renamed from: d, reason: collision with root package name */
    public final gt.l f19676d;

    public h(gt.l lVar) {
        this.f19676d = lVar;
        lVar.a(new f(this, 0));
        this.f19674b = new gt.i(lVar, new f(this, 1));
        this.f19675c = lVar.b(new bs.a(1, this));
    }

    public static boolean A(x xVar, qs.e eVar) {
        if (xVar == null) {
            a(97);
            throw null;
        }
        if (eVar != null) {
            return H(xVar.Z(), eVar);
        }
        a(98);
        throw null;
    }

    public static boolean B(x xVar, qs.e eVar) {
        if (eVar != null) {
            return A(xVar, eVar) && !xVar.c0();
        }
        a(135);
        throw null;
    }

    public static boolean C(u uVar) {
        if (uVar.u1().getAnnotations().G(n.f19699m)) {
            return true;
        }
        if (!(uVar instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) uVar;
        boolean zI0 = m0Var.i0();
        i0 i0VarB = m0Var.b();
        j0 j0VarD = m0Var.d();
        if (i0VarB == null || !C(i0VarB)) {
            return false;
        }
        if (zI0) {
            return j0VarD != null && C(j0VarD);
        }
        return true;
    }

    public static boolean D(x xVar, qs.e eVar) {
        if (xVar == null) {
            a(105);
            throw null;
        }
        if (eVar != null) {
            return !xVar.c0() && A(xVar, eVar);
        }
        a(106);
        throw null;
    }

    public static boolean E(x xVar) {
        if (xVar == null) {
            a(136);
            throw null;
        }
        if (xVar != null) {
            return A(xVar, n.f19688b) && !a1.e(xVar);
        }
        a(138);
        throw null;
    }

    public static boolean F(x xVar) {
        if (xVar.c0()) {
            return false;
        }
        rr.i iVarP = xVar.Z().p();
        return (iVarP instanceof rr.f) && t((rr.f) iVarP) != null;
    }

    public static boolean G(x xVar) {
        return D(xVar, n.f19694f);
    }

    public static boolean H(ht.m0 m0Var, qs.e eVar) {
        if (m0Var == null) {
            a(101);
            throw null;
        }
        if (eVar != null) {
            rr.i iVarP = m0Var.p();
            return (iVarP instanceof rr.f) && b((rr.f) iVarP, eVar);
        }
        a(102);
        throw null;
    }

    public static boolean I(rr.i iVar) {
        if (iVar == null) {
            a(10);
            throw null;
        }
        for (rr.i iVarO = iVar; iVarO != null; iVarO = iVarO.o()) {
            if (iVarO instanceof f0) {
                return ((c0) ((f0) iVarO)).f23629y.h(o.f19721i);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
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
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
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
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getStorageManager";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getBuiltInsModule";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
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
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
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
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
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
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
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
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(rr.f fVar, qs.e eVar) {
        if (fVar == null) {
            a(103);
            throw null;
        }
        if (eVar != null) {
            return fVar.getName().equals(eVar.f()) && eVar.equals(ts.d.g(fVar));
        }
        a(104);
        throw null;
    }

    public static k r(rr.i iVar) {
        if (iVar == null) {
            a(77);
            throw null;
        }
        if (n.f19687a0.contains(iVar.getName())) {
            return (k) n.f19691c0.get(ts.d.g(iVar));
        }
        return null;
    }

    public static k t(rr.f fVar) {
        if (n.Z.contains(fVar.getName())) {
            return (k) n.f19689b0.get(ts.d.g(fVar));
        }
        return null;
    }

    public static boolean x(x xVar) {
        if (xVar != null) {
            return A(xVar, n.f19686a);
        }
        a(139);
        throw null;
    }

    public static boolean y(x xVar) {
        if (xVar != null) {
            return A(xVar, n.f19695g);
        }
        a(88);
        throw null;
    }

    public static boolean z(rr.l lVar) {
        if (lVar != null) {
            return ts.d.i(lVar, et.c.class, false) != null;
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, lq.h] */
    public final void c() {
        qs.g gVar = f19672e;
        br.l.e(gVar, "moduleName");
        gt.l lVar = this.f19676d;
        a0 a0Var = new a0(gVar, lVar, this, 48);
        this.f19673a = a0Var;
        c.f19665a.getClass();
        c cVar = (c) b.f19664b.getValue();
        a0 a0Var2 = this.f19673a;
        Iterable iterableL = l();
        tr.d dVarP = p();
        tr.b bVarD = d();
        ((et.b) cVar).getClass();
        br.l.e(a0Var2, "builtInsModule");
        br.l.e(iterableL, "classDescriptorFactories");
        br.l.e(dVarP, "platformDependentDeclarationFilter");
        br.l.e(bVarD, "additionalClassPartsProvider");
        Set set = o.f19725o;
        br.l.e(set, "packageFqNames");
        Set<qs.c> set2 = set;
        ArrayList arrayList = new ArrayList(mq.p.a0(set2, 10));
        for (qs.c cVar2 : set2) {
            et.a.f8347m.getClass();
            String strA = et.a.a(cVar2);
            br.l.e(strA, "p0");
            InputStream inputStreamM = et.d.m(strA);
            if (inputStreamM == null) {
                throw new IllegalStateException(c7.a.p("Resource not found in classpath: ", strA));
            }
            arrayList.add(i4.k(cVar2, lVar, a0Var2, inputStreamM));
        }
        h0 h0Var = new h0(arrayList);
        js.e eVar = new js.e(lVar, a0Var2);
        a2.g gVar2 = new a2.g(h0Var);
        et.a aVar = et.a.f8347m;
        dt.k kVar = new dt.k(lVar, a0Var2, gVar2, new bm.e(a0Var2, eVar, aVar), h0Var, dt.m.f7514a, dt.l.f7512c, iterableL, eVar, bVarD, dVarP, aVar.f6667a, null, new z.b(lVar), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((et.c) it.next()).w1(kVar);
        }
        a0Var.E = h0Var;
        a0 a0Var3 = this.f19673a;
        a0Var3.getClass();
        a0Var3.D = new gb.k(2, mq.l.A0(new a0[]{a0Var3}));
    }

    public tr.b d() {
        return tr.a.f22953b;
    }

    public final b0 e() {
        b0 b0VarQ = j("Any").q();
        if (b0VarQ != null) {
            return b0VarQ;
        }
        a(50);
        throw null;
    }

    public final x f(x xVar) {
        qs.b bVarF;
        qs.b bVar;
        rr.f fVarD;
        b0 b0VarQ = null;
        if (xVar == null) {
            a(67);
            throw null;
        }
        if (y(xVar)) {
            if (xVar.L().size() != 1) {
                throw new IllegalStateException();
            }
            x xVarB = ((p0) xVar.L().get(0)).b();
            if (xVarB != null) {
                return xVarB;
            }
            a(68);
            throw null;
        }
        c1 c1VarG = a1.g(xVar, false);
        x xVar2 = (x) ((g) this.f19674b.c()).f19671b.get(c1VarG);
        if (xVar2 != null) {
            return xVar2;
        }
        int i10 = ts.d.f22961a;
        rr.i iVarP = c1VarG.Z().p();
        rr.a0 a0VarE = iVarP == null ? null : ts.d.e(iVarP);
        if (a0VarE != null) {
            rr.i iVarP2 = c1VarG.Z().p();
            if (iVarP2 != null) {
                Set set = s.f19727a;
                qs.g name = iVarP2.getName();
                br.l.e(name, "name");
                if (s.f19730d.contains(name) && (bVarF = xs.d.f(iVarP2)) != null && (bVar = (qs.b) s.f19728b.get(bVarF)) != null && (fVarD = w.d(a0VarE, bVar)) != null) {
                    b0VarQ = fVarD.q();
                }
            }
            if (b0VarQ != null) {
                return b0VarQ;
            }
        }
        throw new IllegalStateException("not array: " + xVar);
    }

    public final b0 g(d1 d1Var, x xVar, sr.h hVar) {
        if (d1Var == null) {
            a(78);
            throw null;
        }
        if (xVar != null) {
            return ht.e.q(ht.c.w(hVar), j("Array"), Collections.singletonList(new g0(xVar, d1Var)));
        }
        a(79);
        throw null;
    }

    public final b0 h(d1 d1Var, c1 c1Var) {
        if (d1Var == null) {
            a(82);
            throw null;
        }
        if (c1Var != null) {
            return g(d1Var, c1Var, sr.g.f22217a);
        }
        a(83);
        throw null;
    }

    public final rr.f i(qs.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        rr.f fVarJ = w.j(k(), cVar, zr.d.FROM_BUILTINS);
        if (fVarJ != null) {
            return fVarJ;
        }
        a(13);
        throw null;
    }

    public final rr.f j(String str) {
        if (str != null) {
            return (rr.f) this.f19675c.a(qs.g.e(str));
        }
        a(14);
        throw null;
    }

    public final a0 k() {
        this.f19673a.getClass();
        a0 a0Var = this.f19673a;
        if (a0Var != null) {
            return a0Var;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List listSingletonList = Collections.singletonList(new pr.a(this.f19676d, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final b0 m() {
        b0 b0VarO = o();
        if (b0VarO != null) {
            return b0VarO;
        }
        a(52);
        throw null;
    }

    public final b0 n() {
        b0 b0VarQ = j("Nothing").q();
        if (b0VarQ != null) {
            return b0VarQ;
        }
        a(48);
        throw null;
    }

    public final b0 o() {
        b0 b0VarU0 = e().p0(true);
        if (b0VarU0 != null) {
            return b0VarU0;
        }
        a(51);
        throw null;
    }

    public tr.d p() {
        return tr.a.f22955d;
    }

    public final b0 q(k kVar) {
        if (kVar == null) {
            a(73);
            throw null;
        }
        b0 b0Var = (b0) ((g) this.f19674b.c()).f19670a.get(kVar);
        if (b0Var != null) {
            return b0Var;
        }
        a(74);
        throw null;
    }

    public final b0 s(k kVar) {
        if (kVar == null) {
            a(53);
            throw null;
        }
        b0 b0VarQ = j(kVar.getTypeName().b()).q();
        if (b0VarQ != null) {
            return b0VarQ;
        }
        a(54);
        throw null;
    }

    public final b0 u() {
        b0 b0VarQ = j("String").q();
        if (b0VarQ != null) {
            return b0VarQ;
        }
        a(65);
        throw null;
    }

    public final rr.f v(int i10) {
        rr.f fVarI = i(o.f19717e.c(qs.g.e(pr.g.SuspendFunction.getClassNamePrefix() + i10)));
        if (fVarI != null) {
            return fVarI;
        }
        a(18);
        throw null;
    }

    public final b0 w() {
        b0 b0VarQ = j("Unit").q();
        if (b0VarQ != null) {
            return b0VarQ;
        }
        a(64);
        throw null;
    }
}
