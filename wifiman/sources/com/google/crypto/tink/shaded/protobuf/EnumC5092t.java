package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5092t {
    private static final /* synthetic */ EnumC5092t[] $VALUES;
    public static final EnumC5092t BOOL;
    public static final EnumC5092t BOOL_LIST;
    public static final EnumC5092t BOOL_LIST_PACKED;
    public static final EnumC5092t BYTES;
    public static final EnumC5092t BYTES_LIST;
    public static final EnumC5092t DOUBLE;
    public static final EnumC5092t DOUBLE_LIST;
    public static final EnumC5092t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC5092t ENUM;
    public static final EnumC5092t ENUM_LIST;
    public static final EnumC5092t ENUM_LIST_PACKED;
    public static final EnumC5092t FIXED32;
    public static final EnumC5092t FIXED32_LIST;
    public static final EnumC5092t FIXED32_LIST_PACKED;
    public static final EnumC5092t FIXED64;
    public static final EnumC5092t FIXED64_LIST;
    public static final EnumC5092t FIXED64_LIST_PACKED;
    public static final EnumC5092t FLOAT;
    public static final EnumC5092t FLOAT_LIST;
    public static final EnumC5092t FLOAT_LIST_PACKED;
    public static final EnumC5092t GROUP;
    public static final EnumC5092t GROUP_LIST;
    public static final EnumC5092t INT32;
    public static final EnumC5092t INT32_LIST;
    public static final EnumC5092t INT32_LIST_PACKED;
    public static final EnumC5092t INT64;
    public static final EnumC5092t INT64_LIST;
    public static final EnumC5092t INT64_LIST_PACKED;
    public static final EnumC5092t MAP;
    public static final EnumC5092t MESSAGE;
    public static final EnumC5092t MESSAGE_LIST;
    public static final EnumC5092t SFIXED32;
    public static final EnumC5092t SFIXED32_LIST;
    public static final EnumC5092t SFIXED32_LIST_PACKED;
    public static final EnumC5092t SFIXED64;
    public static final EnumC5092t SFIXED64_LIST;
    public static final EnumC5092t SFIXED64_LIST_PACKED;
    public static final EnumC5092t SINT32;
    public static final EnumC5092t SINT32_LIST;
    public static final EnumC5092t SINT32_LIST_PACKED;
    public static final EnumC5092t SINT64;
    public static final EnumC5092t SINT64_LIST;
    public static final EnumC5092t SINT64_LIST_PACKED;
    public static final EnumC5092t STRING;
    public static final EnumC5092t STRING_LIST;
    public static final EnumC5092t UINT32;
    public static final EnumC5092t UINT32_LIST;
    public static final EnumC5092t UINT32_LIST_PACKED;
    public static final EnumC5092t UINT64;
    public static final EnumC5092t UINT64_LIST;
    public static final EnumC5092t UINT64_LIST_PACKED;
    private static final EnumC5092t[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f38590id;
    private final EnumC5098z javaType;
    private final boolean primitiveScalar;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38591a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f38592b;

        static {
            int[] iArr = new int[EnumC5098z.values().length];
            f38592b = iArr;
            try {
                iArr[EnumC5098z.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38592b[EnumC5098z.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38592b[EnumC5098z.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f38591a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38591a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38591a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$b */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z10) {
            this.isList = z10;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        b bVar = b.SCALAR;
        EnumC5098z enumC5098z = EnumC5098z.DOUBLE;
        EnumC5092t enumC5092t = new EnumC5092t("DOUBLE", 0, 0, bVar, enumC5098z);
        DOUBLE = enumC5092t;
        EnumC5098z enumC5098z2 = EnumC5098z.FLOAT;
        EnumC5092t enumC5092t2 = new EnumC5092t("FLOAT", 1, 1, bVar, enumC5098z2);
        FLOAT = enumC5092t2;
        EnumC5098z enumC5098z3 = EnumC5098z.LONG;
        EnumC5092t enumC5092t3 = new EnumC5092t("INT64", 2, 2, bVar, enumC5098z3);
        INT64 = enumC5092t3;
        EnumC5092t enumC5092t4 = new EnumC5092t("UINT64", 3, 3, bVar, enumC5098z3);
        UINT64 = enumC5092t4;
        EnumC5098z enumC5098z4 = EnumC5098z.INT;
        EnumC5092t enumC5092t5 = new EnumC5092t("INT32", 4, 4, bVar, enumC5098z4);
        INT32 = enumC5092t5;
        EnumC5092t enumC5092t6 = new EnumC5092t("FIXED64", 5, 5, bVar, enumC5098z3);
        FIXED64 = enumC5092t6;
        EnumC5092t enumC5092t7 = new EnumC5092t("FIXED32", 6, 6, bVar, enumC5098z4);
        FIXED32 = enumC5092t7;
        EnumC5098z enumC5098z5 = EnumC5098z.BOOLEAN;
        EnumC5092t enumC5092t8 = new EnumC5092t("BOOL", 7, 7, bVar, enumC5098z5);
        BOOL = enumC5092t8;
        EnumC5098z enumC5098z6 = EnumC5098z.STRING;
        EnumC5092t enumC5092t9 = new EnumC5092t("STRING", 8, 8, bVar, enumC5098z6);
        STRING = enumC5092t9;
        EnumC5098z enumC5098z7 = EnumC5098z.MESSAGE;
        EnumC5092t enumC5092t10 = new EnumC5092t("MESSAGE", 9, 9, bVar, enumC5098z7);
        MESSAGE = enumC5092t10;
        EnumC5098z enumC5098z8 = EnumC5098z.BYTE_STRING;
        EnumC5092t enumC5092t11 = new EnumC5092t("BYTES", 10, 10, bVar, enumC5098z8);
        BYTES = enumC5092t11;
        EnumC5092t enumC5092t12 = new EnumC5092t("UINT32", 11, 11, bVar, enumC5098z4);
        UINT32 = enumC5092t12;
        EnumC5098z enumC5098z9 = EnumC5098z.ENUM;
        EnumC5092t enumC5092t13 = new EnumC5092t("ENUM", 12, 12, bVar, enumC5098z9);
        ENUM = enumC5092t13;
        EnumC5092t enumC5092t14 = new EnumC5092t("SFIXED32", 13, 13, bVar, enumC5098z4);
        SFIXED32 = enumC5092t14;
        EnumC5092t enumC5092t15 = new EnumC5092t("SFIXED64", 14, 14, bVar, enumC5098z3);
        SFIXED64 = enumC5092t15;
        EnumC5092t enumC5092t16 = new EnumC5092t("SINT32", 15, 15, bVar, enumC5098z4);
        SINT32 = enumC5092t16;
        EnumC5092t enumC5092t17 = new EnumC5092t("SINT64", 16, 16, bVar, enumC5098z3);
        SINT64 = enumC5092t17;
        EnumC5092t enumC5092t18 = new EnumC5092t("GROUP", 17, 17, bVar, enumC5098z7);
        GROUP = enumC5092t18;
        b bVar2 = b.VECTOR;
        EnumC5092t enumC5092t19 = new EnumC5092t("DOUBLE_LIST", 18, 18, bVar2, enumC5098z);
        DOUBLE_LIST = enumC5092t19;
        EnumC5092t enumC5092t20 = new EnumC5092t("FLOAT_LIST", 19, 19, bVar2, enumC5098z2);
        FLOAT_LIST = enumC5092t20;
        EnumC5092t enumC5092t21 = new EnumC5092t("INT64_LIST", 20, 20, bVar2, enumC5098z3);
        INT64_LIST = enumC5092t21;
        EnumC5092t enumC5092t22 = new EnumC5092t("UINT64_LIST", 21, 21, bVar2, enumC5098z3);
        UINT64_LIST = enumC5092t22;
        EnumC5092t enumC5092t23 = new EnumC5092t("INT32_LIST", 22, 22, bVar2, enumC5098z4);
        INT32_LIST = enumC5092t23;
        EnumC5092t enumC5092t24 = new EnumC5092t("FIXED64_LIST", 23, 23, bVar2, enumC5098z3);
        FIXED64_LIST = enumC5092t24;
        EnumC5092t enumC5092t25 = new EnumC5092t("FIXED32_LIST", 24, 24, bVar2, enumC5098z4);
        FIXED32_LIST = enumC5092t25;
        EnumC5092t enumC5092t26 = new EnumC5092t("BOOL_LIST", 25, 25, bVar2, enumC5098z5);
        BOOL_LIST = enumC5092t26;
        EnumC5092t enumC5092t27 = new EnumC5092t("STRING_LIST", 26, 26, bVar2, enumC5098z6);
        STRING_LIST = enumC5092t27;
        EnumC5092t enumC5092t28 = new EnumC5092t("MESSAGE_LIST", 27, 27, bVar2, enumC5098z7);
        MESSAGE_LIST = enumC5092t28;
        EnumC5092t enumC5092t29 = new EnumC5092t("BYTES_LIST", 28, 28, bVar2, enumC5098z8);
        BYTES_LIST = enumC5092t29;
        EnumC5092t enumC5092t30 = new EnumC5092t("UINT32_LIST", 29, 29, bVar2, enumC5098z4);
        UINT32_LIST = enumC5092t30;
        EnumC5092t enumC5092t31 = new EnumC5092t("ENUM_LIST", 30, 30, bVar2, enumC5098z9);
        ENUM_LIST = enumC5092t31;
        EnumC5092t enumC5092t32 = new EnumC5092t("SFIXED32_LIST", 31, 31, bVar2, enumC5098z4);
        SFIXED32_LIST = enumC5092t32;
        EnumC5092t enumC5092t33 = new EnumC5092t("SFIXED64_LIST", 32, 32, bVar2, enumC5098z3);
        SFIXED64_LIST = enumC5092t33;
        EnumC5092t enumC5092t34 = new EnumC5092t("SINT32_LIST", 33, 33, bVar2, enumC5098z4);
        SINT32_LIST = enumC5092t34;
        EnumC5092t enumC5092t35 = new EnumC5092t("SINT64_LIST", 34, 34, bVar2, enumC5098z3);
        SINT64_LIST = enumC5092t35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC5092t enumC5092t36 = new EnumC5092t("DOUBLE_LIST_PACKED", 35, 35, bVar3, enumC5098z);
        DOUBLE_LIST_PACKED = enumC5092t36;
        EnumC5092t enumC5092t37 = new EnumC5092t("FLOAT_LIST_PACKED", 36, 36, bVar3, enumC5098z2);
        FLOAT_LIST_PACKED = enumC5092t37;
        EnumC5092t enumC5092t38 = new EnumC5092t("INT64_LIST_PACKED", 37, 37, bVar3, enumC5098z3);
        INT64_LIST_PACKED = enumC5092t38;
        EnumC5092t enumC5092t39 = new EnumC5092t("UINT64_LIST_PACKED", 38, 38, bVar3, enumC5098z3);
        UINT64_LIST_PACKED = enumC5092t39;
        EnumC5092t enumC5092t40 = new EnumC5092t("INT32_LIST_PACKED", 39, 39, bVar3, enumC5098z4);
        INT32_LIST_PACKED = enumC5092t40;
        EnumC5092t enumC5092t41 = new EnumC5092t("FIXED64_LIST_PACKED", 40, 40, bVar3, enumC5098z3);
        FIXED64_LIST_PACKED = enumC5092t41;
        EnumC5092t enumC5092t42 = new EnumC5092t("FIXED32_LIST_PACKED", 41, 41, bVar3, enumC5098z4);
        FIXED32_LIST_PACKED = enumC5092t42;
        EnumC5092t enumC5092t43 = new EnumC5092t("BOOL_LIST_PACKED", 42, 42, bVar3, enumC5098z5);
        BOOL_LIST_PACKED = enumC5092t43;
        EnumC5092t enumC5092t44 = new EnumC5092t("UINT32_LIST_PACKED", 43, 43, bVar3, enumC5098z4);
        UINT32_LIST_PACKED = enumC5092t44;
        EnumC5092t enumC5092t45 = new EnumC5092t("ENUM_LIST_PACKED", 44, 44, bVar3, enumC5098z9);
        ENUM_LIST_PACKED = enumC5092t45;
        EnumC5092t enumC5092t46 = new EnumC5092t("SFIXED32_LIST_PACKED", 45, 45, bVar3, enumC5098z4);
        SFIXED32_LIST_PACKED = enumC5092t46;
        EnumC5092t enumC5092t47 = new EnumC5092t("SFIXED64_LIST_PACKED", 46, 46, bVar3, enumC5098z3);
        SFIXED64_LIST_PACKED = enumC5092t47;
        EnumC5092t enumC5092t48 = new EnumC5092t("SINT32_LIST_PACKED", 47, 47, bVar3, enumC5098z4);
        SINT32_LIST_PACKED = enumC5092t48;
        EnumC5092t enumC5092t49 = new EnumC5092t("SINT64_LIST_PACKED", 48, 48, bVar3, enumC5098z3);
        SINT64_LIST_PACKED = enumC5092t49;
        EnumC5092t enumC5092t50 = new EnumC5092t("GROUP_LIST", 49, 49, bVar2, enumC5098z7);
        GROUP_LIST = enumC5092t50;
        EnumC5092t enumC5092t51 = new EnumC5092t("MAP", 50, 50, b.MAP, EnumC5098z.VOID);
        MAP = enumC5092t51;
        $VALUES = new EnumC5092t[]{enumC5092t, enumC5092t2, enumC5092t3, enumC5092t4, enumC5092t5, enumC5092t6, enumC5092t7, enumC5092t8, enumC5092t9, enumC5092t10, enumC5092t11, enumC5092t12, enumC5092t13, enumC5092t14, enumC5092t15, enumC5092t16, enumC5092t17, enumC5092t18, enumC5092t19, enumC5092t20, enumC5092t21, enumC5092t22, enumC5092t23, enumC5092t24, enumC5092t25, enumC5092t26, enumC5092t27, enumC5092t28, enumC5092t29, enumC5092t30, enumC5092t31, enumC5092t32, enumC5092t33, enumC5092t34, enumC5092t35, enumC5092t36, enumC5092t37, enumC5092t38, enumC5092t39, enumC5092t40, enumC5092t41, enumC5092t42, enumC5092t43, enumC5092t44, enumC5092t45, enumC5092t46, enumC5092t47, enumC5092t48, enumC5092t49, enumC5092t50, enumC5092t51};
        EMPTY_TYPES = new Type[0];
        EnumC5092t[] enumC5092tArrValues = values();
        VALUES = new EnumC5092t[enumC5092tArrValues.length];
        for (EnumC5092t enumC5092t52 : enumC5092tArrValues) {
            VALUES[enumC5092t52.f38590id] = enumC5092t52;
        }
    }

    private EnumC5092t(String str, int i10, int i11, b bVar, EnumC5098z enumC5098z) {
        int i12;
        this.f38590id = i11;
        this.collection = bVar;
        this.javaType = enumC5098z;
        int i13 = a.f38591a[bVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.elementType = enumC5098z.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f38592b[enumC5098z.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC5092t forId(int i10) {
        if (i10 < 0) {
            return null;
        }
        EnumC5092t[] enumC5092tArr = VALUES;
        if (i10 >= enumC5092tArr.length) {
            return null;
        }
        return enumC5092tArr[i10];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i10 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i10 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i10];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i10++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                    Type type = actualTypeArguments[i11];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        for (int i12 = 0; i12 < typeParameters.length; i12++) {
                            if (type == typeParameters[i12]) {
                                actualTypeArguments[i11] = typeArr[i12];
                            }
                        }
                        throw new RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static EnumC5092t valueOf(String str) {
        return (EnumC5092t) Enum.valueOf(EnumC5092t.class, str);
    }

    public static EnumC5092t[] values() {
        return (EnumC5092t[]) $VALUES.clone();
    }

    public EnumC5098z getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f38590id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == b.MAP;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return b.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
