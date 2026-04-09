package androidx.datastore.preferences.protobuf;

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
/* compiled from: FieldType.java */
/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1741t {
    private static final /* synthetic */ EnumC1741t[] $VALUES;
    public static final EnumC1741t BOOL;
    public static final EnumC1741t BOOL_LIST;
    public static final EnumC1741t BOOL_LIST_PACKED;
    public static final EnumC1741t BYTES;
    public static final EnumC1741t BYTES_LIST;
    public static final EnumC1741t DOUBLE;
    public static final EnumC1741t DOUBLE_LIST;
    public static final EnumC1741t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC1741t ENUM;
    public static final EnumC1741t ENUM_LIST;
    public static final EnumC1741t ENUM_LIST_PACKED;
    public static final EnumC1741t FIXED32;
    public static final EnumC1741t FIXED32_LIST;
    public static final EnumC1741t FIXED32_LIST_PACKED;
    public static final EnumC1741t FIXED64;
    public static final EnumC1741t FIXED64_LIST;
    public static final EnumC1741t FIXED64_LIST_PACKED;
    public static final EnumC1741t FLOAT;
    public static final EnumC1741t FLOAT_LIST;
    public static final EnumC1741t FLOAT_LIST_PACKED;
    public static final EnumC1741t GROUP;
    public static final EnumC1741t GROUP_LIST;
    public static final EnumC1741t INT32;
    public static final EnumC1741t INT32_LIST;
    public static final EnumC1741t INT32_LIST_PACKED;
    public static final EnumC1741t INT64;
    public static final EnumC1741t INT64_LIST;
    public static final EnumC1741t INT64_LIST_PACKED;
    public static final EnumC1741t MAP;
    public static final EnumC1741t MESSAGE;
    public static final EnumC1741t MESSAGE_LIST;
    public static final EnumC1741t SFIXED32;
    public static final EnumC1741t SFIXED32_LIST;
    public static final EnumC1741t SFIXED32_LIST_PACKED;
    public static final EnumC1741t SFIXED64;
    public static final EnumC1741t SFIXED64_LIST;
    public static final EnumC1741t SFIXED64_LIST_PACKED;
    public static final EnumC1741t SINT32;
    public static final EnumC1741t SINT32_LIST;
    public static final EnumC1741t SINT32_LIST_PACKED;
    public static final EnumC1741t SINT64;
    public static final EnumC1741t SINT64_LIST;
    public static final EnumC1741t SINT64_LIST_PACKED;
    public static final EnumC1741t STRING;
    public static final EnumC1741t STRING_LIST;
    public static final EnumC1741t UINT32;
    public static final EnumC1741t UINT32_LIST;
    public static final EnumC1741t UINT32_LIST_PACKED;
    public static final EnumC1741t UINT64;
    public static final EnumC1741t UINT64_LIST;
    public static final EnumC1741t UINT64_LIST_PACKED;
    private static final EnumC1741t[] VALUES;
    private final b collection;
    private final Class<?> elementType;
    private final int id;
    private final A javaType;
    private final boolean primitiveScalar;

    /* compiled from: FieldType.java */
    /* renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15697a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15698b;

        static {
            int[] iArr = new int[A.values().length];
            f15698b = iArr;
            try {
                iArr[A.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15698b[A.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15698b[A.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f15697a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15697a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15697a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: FieldType.java */
    /* renamed from: androidx.datastore.preferences.protobuf.t$b */
    public enum b {
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
        A a10 = A.DOUBLE;
        EnumC1741t enumC1741t = new EnumC1741t("DOUBLE", 0, 0, bVar, a10);
        DOUBLE = enumC1741t;
        A a11 = A.FLOAT;
        EnumC1741t enumC1741t2 = new EnumC1741t("FLOAT", 1, 1, bVar, a11);
        FLOAT = enumC1741t2;
        A a12 = A.LONG;
        EnumC1741t enumC1741t3 = new EnumC1741t("INT64", 2, 2, bVar, a12);
        INT64 = enumC1741t3;
        EnumC1741t enumC1741t4 = new EnumC1741t("UINT64", 3, 3, bVar, a12);
        UINT64 = enumC1741t4;
        A a13 = A.INT;
        EnumC1741t enumC1741t5 = new EnumC1741t("INT32", 4, 4, bVar, a13);
        INT32 = enumC1741t5;
        EnumC1741t enumC1741t6 = new EnumC1741t("FIXED64", 5, 5, bVar, a12);
        FIXED64 = enumC1741t6;
        EnumC1741t enumC1741t7 = new EnumC1741t("FIXED32", 6, 6, bVar, a13);
        FIXED32 = enumC1741t7;
        A a14 = A.BOOLEAN;
        EnumC1741t enumC1741t8 = new EnumC1741t("BOOL", 7, 7, bVar, a14);
        BOOL = enumC1741t8;
        A a15 = A.STRING;
        EnumC1741t enumC1741t9 = new EnumC1741t("STRING", 8, 8, bVar, a15);
        STRING = enumC1741t9;
        A a16 = A.MESSAGE;
        EnumC1741t enumC1741t10 = new EnumC1741t("MESSAGE", 9, 9, bVar, a16);
        MESSAGE = enumC1741t10;
        A a17 = A.BYTE_STRING;
        EnumC1741t enumC1741t11 = new EnumC1741t("BYTES", 10, 10, bVar, a17);
        BYTES = enumC1741t11;
        EnumC1741t enumC1741t12 = new EnumC1741t("UINT32", 11, 11, bVar, a13);
        UINT32 = enumC1741t12;
        A a18 = A.ENUM;
        EnumC1741t enumC1741t13 = new EnumC1741t("ENUM", 12, 12, bVar, a18);
        ENUM = enumC1741t13;
        EnumC1741t enumC1741t14 = new EnumC1741t("SFIXED32", 13, 13, bVar, a13);
        SFIXED32 = enumC1741t14;
        EnumC1741t enumC1741t15 = new EnumC1741t("SFIXED64", 14, 14, bVar, a12);
        SFIXED64 = enumC1741t15;
        EnumC1741t enumC1741t16 = new EnumC1741t("SINT32", 15, 15, bVar, a13);
        SINT32 = enumC1741t16;
        EnumC1741t enumC1741t17 = new EnumC1741t("SINT64", 16, 16, bVar, a12);
        SINT64 = enumC1741t17;
        EnumC1741t enumC1741t18 = new EnumC1741t("GROUP", 17, 17, bVar, a16);
        GROUP = enumC1741t18;
        b bVar2 = b.VECTOR;
        EnumC1741t enumC1741t19 = new EnumC1741t("DOUBLE_LIST", 18, 18, bVar2, a10);
        DOUBLE_LIST = enumC1741t19;
        EnumC1741t enumC1741t20 = new EnumC1741t("FLOAT_LIST", 19, 19, bVar2, a11);
        FLOAT_LIST = enumC1741t20;
        EnumC1741t enumC1741t21 = new EnumC1741t("INT64_LIST", 20, 20, bVar2, a12);
        INT64_LIST = enumC1741t21;
        EnumC1741t enumC1741t22 = new EnumC1741t("UINT64_LIST", 21, 21, bVar2, a12);
        UINT64_LIST = enumC1741t22;
        EnumC1741t enumC1741t23 = new EnumC1741t("INT32_LIST", 22, 22, bVar2, a13);
        INT32_LIST = enumC1741t23;
        EnumC1741t enumC1741t24 = new EnumC1741t("FIXED64_LIST", 23, 23, bVar2, a12);
        FIXED64_LIST = enumC1741t24;
        EnumC1741t enumC1741t25 = new EnumC1741t("FIXED32_LIST", 24, 24, bVar2, a13);
        FIXED32_LIST = enumC1741t25;
        EnumC1741t enumC1741t26 = new EnumC1741t("BOOL_LIST", 25, 25, bVar2, a14);
        BOOL_LIST = enumC1741t26;
        EnumC1741t enumC1741t27 = new EnumC1741t("STRING_LIST", 26, 26, bVar2, a15);
        STRING_LIST = enumC1741t27;
        EnumC1741t enumC1741t28 = new EnumC1741t("MESSAGE_LIST", 27, 27, bVar2, a16);
        MESSAGE_LIST = enumC1741t28;
        EnumC1741t enumC1741t29 = new EnumC1741t("BYTES_LIST", 28, 28, bVar2, a17);
        BYTES_LIST = enumC1741t29;
        EnumC1741t enumC1741t30 = new EnumC1741t("UINT32_LIST", 29, 29, bVar2, a13);
        UINT32_LIST = enumC1741t30;
        EnumC1741t enumC1741t31 = new EnumC1741t("ENUM_LIST", 30, 30, bVar2, a18);
        ENUM_LIST = enumC1741t31;
        EnumC1741t enumC1741t32 = new EnumC1741t("SFIXED32_LIST", 31, 31, bVar2, a13);
        SFIXED32_LIST = enumC1741t32;
        EnumC1741t enumC1741t33 = new EnumC1741t("SFIXED64_LIST", 32, 32, bVar2, a12);
        SFIXED64_LIST = enumC1741t33;
        EnumC1741t enumC1741t34 = new EnumC1741t("SINT32_LIST", 33, 33, bVar2, a13);
        SINT32_LIST = enumC1741t34;
        EnumC1741t enumC1741t35 = new EnumC1741t("SINT64_LIST", 34, 34, bVar2, a12);
        SINT64_LIST = enumC1741t35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC1741t enumC1741t36 = new EnumC1741t("DOUBLE_LIST_PACKED", 35, 35, bVar3, a10);
        DOUBLE_LIST_PACKED = enumC1741t36;
        EnumC1741t enumC1741t37 = new EnumC1741t("FLOAT_LIST_PACKED", 36, 36, bVar3, a11);
        FLOAT_LIST_PACKED = enumC1741t37;
        EnumC1741t enumC1741t38 = new EnumC1741t("INT64_LIST_PACKED", 37, 37, bVar3, a12);
        INT64_LIST_PACKED = enumC1741t38;
        EnumC1741t enumC1741t39 = new EnumC1741t("UINT64_LIST_PACKED", 38, 38, bVar3, a12);
        UINT64_LIST_PACKED = enumC1741t39;
        EnumC1741t enumC1741t40 = new EnumC1741t("INT32_LIST_PACKED", 39, 39, bVar3, a13);
        INT32_LIST_PACKED = enumC1741t40;
        EnumC1741t enumC1741t41 = new EnumC1741t("FIXED64_LIST_PACKED", 40, 40, bVar3, a12);
        FIXED64_LIST_PACKED = enumC1741t41;
        EnumC1741t enumC1741t42 = new EnumC1741t("FIXED32_LIST_PACKED", 41, 41, bVar3, a13);
        FIXED32_LIST_PACKED = enumC1741t42;
        EnumC1741t enumC1741t43 = new EnumC1741t("BOOL_LIST_PACKED", 42, 42, bVar3, a14);
        BOOL_LIST_PACKED = enumC1741t43;
        EnumC1741t enumC1741t44 = new EnumC1741t("UINT32_LIST_PACKED", 43, 43, bVar3, a13);
        UINT32_LIST_PACKED = enumC1741t44;
        EnumC1741t enumC1741t45 = new EnumC1741t("ENUM_LIST_PACKED", 44, 44, bVar3, a18);
        ENUM_LIST_PACKED = enumC1741t45;
        EnumC1741t enumC1741t46 = new EnumC1741t("SFIXED32_LIST_PACKED", 45, 45, bVar3, a13);
        SFIXED32_LIST_PACKED = enumC1741t46;
        EnumC1741t enumC1741t47 = new EnumC1741t("SFIXED64_LIST_PACKED", 46, 46, bVar3, a12);
        SFIXED64_LIST_PACKED = enumC1741t47;
        EnumC1741t enumC1741t48 = new EnumC1741t("SINT32_LIST_PACKED", 47, 47, bVar3, a13);
        SINT32_LIST_PACKED = enumC1741t48;
        EnumC1741t enumC1741t49 = new EnumC1741t("SINT64_LIST_PACKED", 48, 48, bVar3, a12);
        SINT64_LIST_PACKED = enumC1741t49;
        EnumC1741t enumC1741t50 = new EnumC1741t("GROUP_LIST", 49, 49, bVar2, a16);
        GROUP_LIST = enumC1741t50;
        EnumC1741t enumC1741t51 = new EnumC1741t("MAP", 50, 50, b.MAP, A.VOID);
        MAP = enumC1741t51;
        $VALUES = new EnumC1741t[]{enumC1741t, enumC1741t2, enumC1741t3, enumC1741t4, enumC1741t5, enumC1741t6, enumC1741t7, enumC1741t8, enumC1741t9, enumC1741t10, enumC1741t11, enumC1741t12, enumC1741t13, enumC1741t14, enumC1741t15, enumC1741t16, enumC1741t17, enumC1741t18, enumC1741t19, enumC1741t20, enumC1741t21, enumC1741t22, enumC1741t23, enumC1741t24, enumC1741t25, enumC1741t26, enumC1741t27, enumC1741t28, enumC1741t29, enumC1741t30, enumC1741t31, enumC1741t32, enumC1741t33, enumC1741t34, enumC1741t35, enumC1741t36, enumC1741t37, enumC1741t38, enumC1741t39, enumC1741t40, enumC1741t41, enumC1741t42, enumC1741t43, enumC1741t44, enumC1741t45, enumC1741t46, enumC1741t47, enumC1741t48, enumC1741t49, enumC1741t50, enumC1741t51};
        EMPTY_TYPES = new Type[0];
        EnumC1741t[] enumC1741tArrValues = values();
        VALUES = new EnumC1741t[enumC1741tArrValues.length];
        for (EnumC1741t enumC1741t52 : enumC1741tArrValues) {
            VALUES[enumC1741t52.id] = enumC1741t52;
        }
    }

    private EnumC1741t(String str, int i, int i10, b bVar, A a10) {
        int i11;
        this.id = i10;
        this.collection = bVar;
        this.javaType = a10;
        int i12 = a.f15697a[bVar.ordinal()];
        if (i12 == 1 || i12 == 2) {
            this.elementType = a10.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i11 = a.f15698b[a10.ordinal()]) == 1 || i11 == 2 || i11 == 3) ? false : true;
    }

    public static EnumC1741t forId(int i) {
        if (i < 0) {
            return null;
        }
        EnumC1741t[] enumC1741tArr = VALUES;
        if (i >= enumC1741tArr.length) {
            return null;
        }
        return enumC1741tArr[i];
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
            int i = 0;
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
                    if (i >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                    Type type = actualTypeArguments[i10];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        for (int i11 = 0; i11 < typeParameters.length; i11++) {
                            if (type == typeParameters[i11]) {
                                actualTypeArguments[i10] = typeArr[i11];
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

    public static EnumC1741t valueOf(String str) {
        return (EnumC1741t) Enum.valueOf(EnumC1741t.class, str);
    }

    public static EnumC1741t[] values() {
        return (EnumC1741t[]) $VALUES.clone();
    }

    public A getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
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
