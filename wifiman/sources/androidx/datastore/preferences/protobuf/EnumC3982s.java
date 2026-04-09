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
/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3982s {
    private static final /* synthetic */ EnumC3982s[] $VALUES;
    public static final EnumC3982s BOOL;
    public static final EnumC3982s BOOL_LIST;
    public static final EnumC3982s BOOL_LIST_PACKED;
    public static final EnumC3982s BYTES;
    public static final EnumC3982s BYTES_LIST;
    public static final EnumC3982s DOUBLE;
    public static final EnumC3982s DOUBLE_LIST;
    public static final EnumC3982s DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC3982s ENUM;
    public static final EnumC3982s ENUM_LIST;
    public static final EnumC3982s ENUM_LIST_PACKED;
    public static final EnumC3982s FIXED32;
    public static final EnumC3982s FIXED32_LIST;
    public static final EnumC3982s FIXED32_LIST_PACKED;
    public static final EnumC3982s FIXED64;
    public static final EnumC3982s FIXED64_LIST;
    public static final EnumC3982s FIXED64_LIST_PACKED;
    public static final EnumC3982s FLOAT;
    public static final EnumC3982s FLOAT_LIST;
    public static final EnumC3982s FLOAT_LIST_PACKED;
    public static final EnumC3982s GROUP;
    public static final EnumC3982s GROUP_LIST;
    public static final EnumC3982s INT32;
    public static final EnumC3982s INT32_LIST;
    public static final EnumC3982s INT32_LIST_PACKED;
    public static final EnumC3982s INT64;
    public static final EnumC3982s INT64_LIST;
    public static final EnumC3982s INT64_LIST_PACKED;
    public static final EnumC3982s MAP;
    public static final EnumC3982s MESSAGE;
    public static final EnumC3982s MESSAGE_LIST;
    public static final EnumC3982s SFIXED32;
    public static final EnumC3982s SFIXED32_LIST;
    public static final EnumC3982s SFIXED32_LIST_PACKED;
    public static final EnumC3982s SFIXED64;
    public static final EnumC3982s SFIXED64_LIST;
    public static final EnumC3982s SFIXED64_LIST_PACKED;
    public static final EnumC3982s SINT32;
    public static final EnumC3982s SINT32_LIST;
    public static final EnumC3982s SINT32_LIST_PACKED;
    public static final EnumC3982s SINT64;
    public static final EnumC3982s SINT64_LIST;
    public static final EnumC3982s SINT64_LIST_PACKED;
    public static final EnumC3982s STRING;
    public static final EnumC3982s STRING_LIST;
    public static final EnumC3982s UINT32;
    public static final EnumC3982s UINT32_LIST;
    public static final EnumC3982s UINT32_LIST_PACKED;
    public static final EnumC3982s UINT64;
    public static final EnumC3982s UINT64_LIST;
    public static final EnumC3982s UINT64_LIST_PACKED;
    private static final EnumC3982s[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f30956id;
    private final EnumC3988y javaType;
    private final boolean primitiveScalar;

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30957a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30958b;

        static {
            int[] iArr = new int[EnumC3988y.values().length];
            f30958b = iArr;
            try {
                iArr[EnumC3988y.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30958b[EnumC3988y.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30958b[EnumC3988y.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f30957a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30957a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30957a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
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
        EnumC3988y enumC3988y = EnumC3988y.DOUBLE;
        EnumC3982s enumC3982s = new EnumC3982s("DOUBLE", 0, 0, bVar, enumC3988y);
        DOUBLE = enumC3982s;
        EnumC3988y enumC3988y2 = EnumC3988y.FLOAT;
        EnumC3982s enumC3982s2 = new EnumC3982s("FLOAT", 1, 1, bVar, enumC3988y2);
        FLOAT = enumC3982s2;
        EnumC3988y enumC3988y3 = EnumC3988y.LONG;
        EnumC3982s enumC3982s3 = new EnumC3982s("INT64", 2, 2, bVar, enumC3988y3);
        INT64 = enumC3982s3;
        EnumC3982s enumC3982s4 = new EnumC3982s("UINT64", 3, 3, bVar, enumC3988y3);
        UINT64 = enumC3982s4;
        EnumC3988y enumC3988y4 = EnumC3988y.INT;
        EnumC3982s enumC3982s5 = new EnumC3982s("INT32", 4, 4, bVar, enumC3988y4);
        INT32 = enumC3982s5;
        EnumC3982s enumC3982s6 = new EnumC3982s("FIXED64", 5, 5, bVar, enumC3988y3);
        FIXED64 = enumC3982s6;
        EnumC3982s enumC3982s7 = new EnumC3982s("FIXED32", 6, 6, bVar, enumC3988y4);
        FIXED32 = enumC3982s7;
        EnumC3988y enumC3988y5 = EnumC3988y.BOOLEAN;
        EnumC3982s enumC3982s8 = new EnumC3982s("BOOL", 7, 7, bVar, enumC3988y5);
        BOOL = enumC3982s8;
        EnumC3988y enumC3988y6 = EnumC3988y.STRING;
        EnumC3982s enumC3982s9 = new EnumC3982s("STRING", 8, 8, bVar, enumC3988y6);
        STRING = enumC3982s9;
        EnumC3988y enumC3988y7 = EnumC3988y.MESSAGE;
        EnumC3982s enumC3982s10 = new EnumC3982s("MESSAGE", 9, 9, bVar, enumC3988y7);
        MESSAGE = enumC3982s10;
        EnumC3988y enumC3988y8 = EnumC3988y.BYTE_STRING;
        EnumC3982s enumC3982s11 = new EnumC3982s("BYTES", 10, 10, bVar, enumC3988y8);
        BYTES = enumC3982s11;
        EnumC3982s enumC3982s12 = new EnumC3982s("UINT32", 11, 11, bVar, enumC3988y4);
        UINT32 = enumC3982s12;
        EnumC3988y enumC3988y9 = EnumC3988y.ENUM;
        EnumC3982s enumC3982s13 = new EnumC3982s("ENUM", 12, 12, bVar, enumC3988y9);
        ENUM = enumC3982s13;
        EnumC3982s enumC3982s14 = new EnumC3982s("SFIXED32", 13, 13, bVar, enumC3988y4);
        SFIXED32 = enumC3982s14;
        EnumC3982s enumC3982s15 = new EnumC3982s("SFIXED64", 14, 14, bVar, enumC3988y3);
        SFIXED64 = enumC3982s15;
        EnumC3982s enumC3982s16 = new EnumC3982s("SINT32", 15, 15, bVar, enumC3988y4);
        SINT32 = enumC3982s16;
        EnumC3982s enumC3982s17 = new EnumC3982s("SINT64", 16, 16, bVar, enumC3988y3);
        SINT64 = enumC3982s17;
        EnumC3982s enumC3982s18 = new EnumC3982s("GROUP", 17, 17, bVar, enumC3988y7);
        GROUP = enumC3982s18;
        b bVar2 = b.VECTOR;
        EnumC3982s enumC3982s19 = new EnumC3982s("DOUBLE_LIST", 18, 18, bVar2, enumC3988y);
        DOUBLE_LIST = enumC3982s19;
        EnumC3982s enumC3982s20 = new EnumC3982s("FLOAT_LIST", 19, 19, bVar2, enumC3988y2);
        FLOAT_LIST = enumC3982s20;
        EnumC3982s enumC3982s21 = new EnumC3982s("INT64_LIST", 20, 20, bVar2, enumC3988y3);
        INT64_LIST = enumC3982s21;
        EnumC3982s enumC3982s22 = new EnumC3982s("UINT64_LIST", 21, 21, bVar2, enumC3988y3);
        UINT64_LIST = enumC3982s22;
        EnumC3982s enumC3982s23 = new EnumC3982s("INT32_LIST", 22, 22, bVar2, enumC3988y4);
        INT32_LIST = enumC3982s23;
        EnumC3982s enumC3982s24 = new EnumC3982s("FIXED64_LIST", 23, 23, bVar2, enumC3988y3);
        FIXED64_LIST = enumC3982s24;
        EnumC3982s enumC3982s25 = new EnumC3982s("FIXED32_LIST", 24, 24, bVar2, enumC3988y4);
        FIXED32_LIST = enumC3982s25;
        EnumC3982s enumC3982s26 = new EnumC3982s("BOOL_LIST", 25, 25, bVar2, enumC3988y5);
        BOOL_LIST = enumC3982s26;
        EnumC3982s enumC3982s27 = new EnumC3982s("STRING_LIST", 26, 26, bVar2, enumC3988y6);
        STRING_LIST = enumC3982s27;
        EnumC3982s enumC3982s28 = new EnumC3982s("MESSAGE_LIST", 27, 27, bVar2, enumC3988y7);
        MESSAGE_LIST = enumC3982s28;
        EnumC3982s enumC3982s29 = new EnumC3982s("BYTES_LIST", 28, 28, bVar2, enumC3988y8);
        BYTES_LIST = enumC3982s29;
        EnumC3982s enumC3982s30 = new EnumC3982s("UINT32_LIST", 29, 29, bVar2, enumC3988y4);
        UINT32_LIST = enumC3982s30;
        EnumC3982s enumC3982s31 = new EnumC3982s("ENUM_LIST", 30, 30, bVar2, enumC3988y9);
        ENUM_LIST = enumC3982s31;
        EnumC3982s enumC3982s32 = new EnumC3982s("SFIXED32_LIST", 31, 31, bVar2, enumC3988y4);
        SFIXED32_LIST = enumC3982s32;
        EnumC3982s enumC3982s33 = new EnumC3982s("SFIXED64_LIST", 32, 32, bVar2, enumC3988y3);
        SFIXED64_LIST = enumC3982s33;
        EnumC3982s enumC3982s34 = new EnumC3982s("SINT32_LIST", 33, 33, bVar2, enumC3988y4);
        SINT32_LIST = enumC3982s34;
        EnumC3982s enumC3982s35 = new EnumC3982s("SINT64_LIST", 34, 34, bVar2, enumC3988y3);
        SINT64_LIST = enumC3982s35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC3982s enumC3982s36 = new EnumC3982s("DOUBLE_LIST_PACKED", 35, 35, bVar3, enumC3988y);
        DOUBLE_LIST_PACKED = enumC3982s36;
        EnumC3982s enumC3982s37 = new EnumC3982s("FLOAT_LIST_PACKED", 36, 36, bVar3, enumC3988y2);
        FLOAT_LIST_PACKED = enumC3982s37;
        EnumC3982s enumC3982s38 = new EnumC3982s("INT64_LIST_PACKED", 37, 37, bVar3, enumC3988y3);
        INT64_LIST_PACKED = enumC3982s38;
        EnumC3982s enumC3982s39 = new EnumC3982s("UINT64_LIST_PACKED", 38, 38, bVar3, enumC3988y3);
        UINT64_LIST_PACKED = enumC3982s39;
        EnumC3982s enumC3982s40 = new EnumC3982s("INT32_LIST_PACKED", 39, 39, bVar3, enumC3988y4);
        INT32_LIST_PACKED = enumC3982s40;
        EnumC3982s enumC3982s41 = new EnumC3982s("FIXED64_LIST_PACKED", 40, 40, bVar3, enumC3988y3);
        FIXED64_LIST_PACKED = enumC3982s41;
        EnumC3982s enumC3982s42 = new EnumC3982s("FIXED32_LIST_PACKED", 41, 41, bVar3, enumC3988y4);
        FIXED32_LIST_PACKED = enumC3982s42;
        EnumC3982s enumC3982s43 = new EnumC3982s("BOOL_LIST_PACKED", 42, 42, bVar3, enumC3988y5);
        BOOL_LIST_PACKED = enumC3982s43;
        EnumC3982s enumC3982s44 = new EnumC3982s("UINT32_LIST_PACKED", 43, 43, bVar3, enumC3988y4);
        UINT32_LIST_PACKED = enumC3982s44;
        EnumC3982s enumC3982s45 = new EnumC3982s("ENUM_LIST_PACKED", 44, 44, bVar3, enumC3988y9);
        ENUM_LIST_PACKED = enumC3982s45;
        EnumC3982s enumC3982s46 = new EnumC3982s("SFIXED32_LIST_PACKED", 45, 45, bVar3, enumC3988y4);
        SFIXED32_LIST_PACKED = enumC3982s46;
        EnumC3982s enumC3982s47 = new EnumC3982s("SFIXED64_LIST_PACKED", 46, 46, bVar3, enumC3988y3);
        SFIXED64_LIST_PACKED = enumC3982s47;
        EnumC3982s enumC3982s48 = new EnumC3982s("SINT32_LIST_PACKED", 47, 47, bVar3, enumC3988y4);
        SINT32_LIST_PACKED = enumC3982s48;
        EnumC3982s enumC3982s49 = new EnumC3982s("SINT64_LIST_PACKED", 48, 48, bVar3, enumC3988y3);
        SINT64_LIST_PACKED = enumC3982s49;
        EnumC3982s enumC3982s50 = new EnumC3982s("GROUP_LIST", 49, 49, bVar2, enumC3988y7);
        GROUP_LIST = enumC3982s50;
        EnumC3982s enumC3982s51 = new EnumC3982s("MAP", 50, 50, b.MAP, EnumC3988y.VOID);
        MAP = enumC3982s51;
        $VALUES = new EnumC3982s[]{enumC3982s, enumC3982s2, enumC3982s3, enumC3982s4, enumC3982s5, enumC3982s6, enumC3982s7, enumC3982s8, enumC3982s9, enumC3982s10, enumC3982s11, enumC3982s12, enumC3982s13, enumC3982s14, enumC3982s15, enumC3982s16, enumC3982s17, enumC3982s18, enumC3982s19, enumC3982s20, enumC3982s21, enumC3982s22, enumC3982s23, enumC3982s24, enumC3982s25, enumC3982s26, enumC3982s27, enumC3982s28, enumC3982s29, enumC3982s30, enumC3982s31, enumC3982s32, enumC3982s33, enumC3982s34, enumC3982s35, enumC3982s36, enumC3982s37, enumC3982s38, enumC3982s39, enumC3982s40, enumC3982s41, enumC3982s42, enumC3982s43, enumC3982s44, enumC3982s45, enumC3982s46, enumC3982s47, enumC3982s48, enumC3982s49, enumC3982s50, enumC3982s51};
        EMPTY_TYPES = new Type[0];
        EnumC3982s[] enumC3982sArrValues = values();
        VALUES = new EnumC3982s[enumC3982sArrValues.length];
        for (EnumC3982s enumC3982s52 : enumC3982sArrValues) {
            VALUES[enumC3982s52.f30956id] = enumC3982s52;
        }
    }

    private EnumC3982s(String str, int i10, int i11, b bVar, EnumC3988y enumC3988y) {
        int i12;
        this.f30956id = i11;
        this.collection = bVar;
        this.javaType = enumC3988y;
        int i13 = a.f30957a[bVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.elementType = enumC3988y.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f30958b[enumC3988y.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC3982s forId(int i10) {
        if (i10 < 0) {
            return null;
        }
        EnumC3982s[] enumC3982sArr = VALUES;
        if (i10 >= enumC3982sArr.length) {
            return null;
        }
        return enumC3982sArr[i10];
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

    public static EnumC3982s valueOf(String str) {
        return (EnumC3982s) Enum.valueOf(EnumC3982s.class, str);
    }

    public static EnumC3982s[] values() {
        return (EnumC3982s[]) $VALUES.clone();
    }

    public EnumC3988y getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f30956id;
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
