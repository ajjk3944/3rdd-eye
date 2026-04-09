package com.google.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: FieldType.java */
/* renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4039w {
    private static final /* synthetic */ EnumC4039w[] $VALUES;
    public static final EnumC4039w BOOL;
    public static final EnumC4039w BOOL_LIST;
    public static final EnumC4039w BOOL_LIST_PACKED;
    public static final EnumC4039w BYTES;
    public static final EnumC4039w BYTES_LIST;
    public static final EnumC4039w DOUBLE;
    public static final EnumC4039w DOUBLE_LIST;
    public static final EnumC4039w DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC4039w ENUM;
    public static final EnumC4039w ENUM_LIST;
    public static final EnumC4039w ENUM_LIST_PACKED;
    public static final EnumC4039w FIXED32;
    public static final EnumC4039w FIXED32_LIST;
    public static final EnumC4039w FIXED32_LIST_PACKED;
    public static final EnumC4039w FIXED64;
    public static final EnumC4039w FIXED64_LIST;
    public static final EnumC4039w FIXED64_LIST_PACKED;
    public static final EnumC4039w FLOAT;
    public static final EnumC4039w FLOAT_LIST;
    public static final EnumC4039w FLOAT_LIST_PACKED;
    public static final EnumC4039w GROUP;
    public static final EnumC4039w GROUP_LIST;
    public static final EnumC4039w INT32;
    public static final EnumC4039w INT32_LIST;
    public static final EnumC4039w INT32_LIST_PACKED;
    public static final EnumC4039w INT64;
    public static final EnumC4039w INT64_LIST;
    public static final EnumC4039w INT64_LIST_PACKED;
    public static final EnumC4039w MAP;
    public static final EnumC4039w MESSAGE;
    public static final EnumC4039w MESSAGE_LIST;
    public static final EnumC4039w SFIXED32;
    public static final EnumC4039w SFIXED32_LIST;
    public static final EnumC4039w SFIXED32_LIST_PACKED;
    public static final EnumC4039w SFIXED64;
    public static final EnumC4039w SFIXED64_LIST;
    public static final EnumC4039w SFIXED64_LIST_PACKED;
    public static final EnumC4039w SINT32;
    public static final EnumC4039w SINT32_LIST;
    public static final EnumC4039w SINT32_LIST_PACKED;
    public static final EnumC4039w SINT64;
    public static final EnumC4039w SINT64_LIST;
    public static final EnumC4039w SINT64_LIST_PACKED;
    public static final EnumC4039w STRING;
    public static final EnumC4039w STRING_LIST;
    public static final EnumC4039w UINT32;
    public static final EnumC4039w UINT32_LIST;
    public static final EnumC4039w UINT32_LIST_PACKED;
    public static final EnumC4039w UINT64;
    public static final EnumC4039w UINT64_LIST;
    public static final EnumC4039w UINT64_LIST_PACKED;
    private static final EnumC4039w[] VALUES;
    private final b collection;
    private final Class<?> elementType;
    private final int id;
    private final E javaType;
    private final boolean primitiveScalar;

    /* compiled from: FieldType.java */
    /* renamed from: com.google.protobuf.w$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

        static {
            int[] iArr = new int[E.values().length];
            $SwitchMap$com$google$protobuf$JavaType = iArr;
            try {
                iArr[E.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[E.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[E.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            $SwitchMap$com$google$protobuf$FieldType$Collection = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: FieldType.java */
    /* renamed from: com.google.protobuf.w$b */
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

    private static /* synthetic */ EnumC4039w[] $values() {
        return new EnumC4039w[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        b bVar = b.SCALAR;
        E e4 = E.DOUBLE;
        DOUBLE = new EnumC4039w("DOUBLE", 0, 0, bVar, e4);
        E e10 = E.FLOAT;
        FLOAT = new EnumC4039w("FLOAT", 1, 1, bVar, e10);
        E e11 = E.LONG;
        INT64 = new EnumC4039w("INT64", 2, 2, bVar, e11);
        UINT64 = new EnumC4039w("UINT64", 3, 3, bVar, e11);
        E e12 = E.INT;
        INT32 = new EnumC4039w("INT32", 4, 4, bVar, e12);
        FIXED64 = new EnumC4039w("FIXED64", 5, 5, bVar, e11);
        FIXED32 = new EnumC4039w("FIXED32", 6, 6, bVar, e12);
        E e13 = E.BOOLEAN;
        BOOL = new EnumC4039w("BOOL", 7, 7, bVar, e13);
        E e14 = E.STRING;
        STRING = new EnumC4039w("STRING", 8, 8, bVar, e14);
        E e15 = E.MESSAGE;
        MESSAGE = new EnumC4039w("MESSAGE", 9, 9, bVar, e15);
        E e16 = E.BYTE_STRING;
        BYTES = new EnumC4039w("BYTES", 10, 10, bVar, e16);
        UINT32 = new EnumC4039w("UINT32", 11, 11, bVar, e12);
        E e17 = E.ENUM;
        ENUM = new EnumC4039w("ENUM", 12, 12, bVar, e17);
        SFIXED32 = new EnumC4039w("SFIXED32", 13, 13, bVar, e12);
        SFIXED64 = new EnumC4039w("SFIXED64", 14, 14, bVar, e11);
        SINT32 = new EnumC4039w("SINT32", 15, 15, bVar, e12);
        SINT64 = new EnumC4039w("SINT64", 16, 16, bVar, e11);
        GROUP = new EnumC4039w("GROUP", 17, 17, bVar, e15);
        b bVar2 = b.VECTOR;
        DOUBLE_LIST = new EnumC4039w("DOUBLE_LIST", 18, 18, bVar2, e4);
        FLOAT_LIST = new EnumC4039w("FLOAT_LIST", 19, 19, bVar2, e10);
        INT64_LIST = new EnumC4039w("INT64_LIST", 20, 20, bVar2, e11);
        UINT64_LIST = new EnumC4039w("UINT64_LIST", 21, 21, bVar2, e11);
        INT32_LIST = new EnumC4039w("INT32_LIST", 22, 22, bVar2, e12);
        FIXED64_LIST = new EnumC4039w("FIXED64_LIST", 23, 23, bVar2, e11);
        FIXED32_LIST = new EnumC4039w("FIXED32_LIST", 24, 24, bVar2, e12);
        BOOL_LIST = new EnumC4039w("BOOL_LIST", 25, 25, bVar2, e13);
        STRING_LIST = new EnumC4039w("STRING_LIST", 26, 26, bVar2, e14);
        MESSAGE_LIST = new EnumC4039w("MESSAGE_LIST", 27, 27, bVar2, e15);
        BYTES_LIST = new EnumC4039w("BYTES_LIST", 28, 28, bVar2, e16);
        UINT32_LIST = new EnumC4039w("UINT32_LIST", 29, 29, bVar2, e12);
        ENUM_LIST = new EnumC4039w("ENUM_LIST", 30, 30, bVar2, e17);
        SFIXED32_LIST = new EnumC4039w("SFIXED32_LIST", 31, 31, bVar2, e12);
        SFIXED64_LIST = new EnumC4039w("SFIXED64_LIST", 32, 32, bVar2, e11);
        SINT32_LIST = new EnumC4039w("SINT32_LIST", 33, 33, bVar2, e12);
        SINT64_LIST = new EnumC4039w("SINT64_LIST", 34, 34, bVar2, e11);
        b bVar3 = b.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new EnumC4039w("DOUBLE_LIST_PACKED", 35, 35, bVar3, e4);
        FLOAT_LIST_PACKED = new EnumC4039w("FLOAT_LIST_PACKED", 36, 36, bVar3, e10);
        INT64_LIST_PACKED = new EnumC4039w("INT64_LIST_PACKED", 37, 37, bVar3, e11);
        UINT64_LIST_PACKED = new EnumC4039w("UINT64_LIST_PACKED", 38, 38, bVar3, e11);
        INT32_LIST_PACKED = new EnumC4039w("INT32_LIST_PACKED", 39, 39, bVar3, e12);
        FIXED64_LIST_PACKED = new EnumC4039w("FIXED64_LIST_PACKED", 40, 40, bVar3, e11);
        FIXED32_LIST_PACKED = new EnumC4039w("FIXED32_LIST_PACKED", 41, 41, bVar3, e12);
        BOOL_LIST_PACKED = new EnumC4039w("BOOL_LIST_PACKED", 42, 42, bVar3, e13);
        UINT32_LIST_PACKED = new EnumC4039w("UINT32_LIST_PACKED", 43, 43, bVar3, e12);
        ENUM_LIST_PACKED = new EnumC4039w("ENUM_LIST_PACKED", 44, 44, bVar3, e17);
        SFIXED32_LIST_PACKED = new EnumC4039w("SFIXED32_LIST_PACKED", 45, 45, bVar3, e12);
        SFIXED64_LIST_PACKED = new EnumC4039w("SFIXED64_LIST_PACKED", 46, 46, bVar3, e11);
        SINT32_LIST_PACKED = new EnumC4039w("SINT32_LIST_PACKED", 47, 47, bVar3, e12);
        SINT64_LIST_PACKED = new EnumC4039w("SINT64_LIST_PACKED", 48, 48, bVar3, e11);
        GROUP_LIST = new EnumC4039w("GROUP_LIST", 49, 49, bVar2, e15);
        MAP = new EnumC4039w("MAP", 50, 50, b.MAP, E.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new Type[0];
        EnumC4039w[] enumC4039wArrValues = values();
        VALUES = new EnumC4039w[enumC4039wArrValues.length];
        for (EnumC4039w enumC4039w : enumC4039wArrValues) {
            VALUES[enumC4039w.id] = enumC4039w;
        }
    }

    private EnumC4039w(String str, int i, int i10, b bVar, E e4) {
        int i11;
        this.id = i10;
        this.collection = bVar;
        this.javaType = e4;
        int i12 = a.$SwitchMap$com$google$protobuf$FieldType$Collection[bVar.ordinal()];
        if (i12 == 1 || i12 == 2) {
            this.elementType = e4.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i11 = a.$SwitchMap$com$google$protobuf$JavaType[e4.ordinal()]) == 1 || i11 == 2 || i11 == 3) ? false : true;
    }

    public static EnumC4039w forId(int i) {
        if (i < 0) {
            return null;
        }
        EnumC4039w[] enumC4039wArr = VALUES;
        if (i >= enumC4039wArr.length) {
            return null;
        }
        return enumC4039wArr[i];
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

    public static EnumC4039w valueOf(String str) {
        return (EnumC4039w) Enum.valueOf(EnumC4039w.class, str);
    }

    public static EnumC4039w[] values() {
        return (EnumC4039w[]) $VALUES.clone();
    }

    public E getJavaType() {
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
