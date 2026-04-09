package com.google.protobuf;

import com.google.protobuf.B;
import g0.C4356c;
import java.lang.reflect.Field;

/* compiled from: FieldInfo.java */
/* renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4037u implements Comparable<C4037u> {
    private final Field cachedSizeField;
    private final boolean enforceUtf8;
    private final B.e enumVerifier;
    private final Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final d0 oneof;
    private final Class<?> oneofStoredType;
    private final Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final EnumC4039w type;

    /* compiled from: FieldInfo.java */
    /* renamed from: com.google.protobuf.u$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

        static {
            int[] iArr = new int[EnumC4039w.values().length];
            $SwitchMap$com$google$protobuf$FieldType = iArr;
            try {
                iArr[EnumC4039w.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[EnumC4039w.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[EnumC4039w.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[EnumC4039w.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: FieldInfo.java */
    /* renamed from: com.google.protobuf.u$b */
    public static final class b {
        private Field cachedSizeField;
        private boolean enforceUtf8;
        private B.e enumVerifier;
        private Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private d0 oneof;
        private Class<?> oneofStoredType;
        private Field presenceField;
        private int presenceMask;
        private boolean required;
        private EnumC4039w type;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public C4037u build() {
            d0 d0Var = this.oneof;
            if (d0Var != null) {
                return C4037u.forOneofMemberField(this.fieldNumber, this.type, d0Var, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return C4037u.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            Field field = this.presenceField;
            if (field != null) {
                return this.required ? C4037u.forProto2RequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : C4037u.forProto2OptionalField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            B.e eVar = this.enumVerifier;
            if (eVar != null) {
                Field field2 = this.cachedSizeField;
                return field2 == null ? C4037u.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, eVar) : C4037u.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, eVar, field2);
            }
            Field field3 = this.cachedSizeField;
            return field3 == null ? C4037u.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8) : C4037u.forPackedField(this.field, this.fieldNumber, this.type, field3);
        }

        public b withCachedSizeField(Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public b withEnforceUtf8(boolean z10) {
            this.enforceUtf8 = z10;
            return this;
        }

        public b withEnumVerifier(B.e eVar) {
            this.enumVerifier = eVar;
            return this;
        }

        public b withField(Field field) {
            if (this.oneof != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.field = field;
            return this;
        }

        public b withFieldNumber(int i) {
            this.fieldNumber = i;
            return this;
        }

        public b withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public b withOneof(d0 d0Var, Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneof = d0Var;
            this.oneofStoredType = cls;
            return this;
        }

        public b withPresence(Field field, int i) {
            this.presenceField = (Field) B.checkNotNull(field, "presenceField");
            this.presenceMask = i;
            return this;
        }

        public b withRequired(boolean z10) {
            this.required = z10;
            return this;
        }

        public b withType(EnumC4039w enumC4039w) {
            this.type = enumC4039w;
            return this;
        }

        private b() {
        }
    }

    private C4037u(Field field, int i, EnumC4039w enumC4039w, Class<?> cls, Field field2, int i10, boolean z10, boolean z11, d0 d0Var, Class<?> cls2, Object obj, B.e eVar, Field field3) {
        this.field = field;
        this.type = enumC4039w;
        this.messageClass = cls;
        this.fieldNumber = i;
        this.presenceField = field2;
        this.presenceMask = i10;
        this.required = z10;
        this.enforceUtf8 = z11;
        this.oneof = d0Var;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = eVar;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(C4356c.h(i, "fieldNumber must be positive: "));
        }
    }

    public static C4037u forField(Field field, int i, EnumC4039w enumC4039w, boolean z10) {
        checkFieldNumber(i);
        B.checkNotNull(field, "field");
        B.checkNotNull(enumC4039w, "fieldType");
        if (enumC4039w == EnumC4039w.MESSAGE_LIST || enumC4039w == EnumC4039w.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C4037u(field, i, enumC4039w, null, null, 0, false, z10, null, null, null, null, null);
    }

    public static C4037u forFieldWithEnumVerifier(Field field, int i, EnumC4039w enumC4039w, B.e eVar) {
        checkFieldNumber(i);
        B.checkNotNull(field, "field");
        return new C4037u(field, i, enumC4039w, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static C4037u forMapField(Field field, int i, Object obj, B.e eVar) {
        B.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i);
        B.checkNotNull(field, "field");
        return new C4037u(field, i, EnumC4039w.MAP, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static C4037u forOneofMemberField(int i, EnumC4039w enumC4039w, d0 d0Var, Class<?> cls, boolean z10, B.e eVar) {
        checkFieldNumber(i);
        B.checkNotNull(enumC4039w, "fieldType");
        B.checkNotNull(d0Var, "oneof");
        B.checkNotNull(cls, "oneofStoredType");
        if (enumC4039w.isScalar()) {
            return new C4037u(null, i, enumC4039w, null, null, 0, false, z10, d0Var, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + enumC4039w);
    }

    public static C4037u forPackedField(Field field, int i, EnumC4039w enumC4039w, Field field2) {
        checkFieldNumber(i);
        B.checkNotNull(field, "field");
        B.checkNotNull(enumC4039w, "fieldType");
        if (enumC4039w == EnumC4039w.MESSAGE_LIST || enumC4039w == EnumC4039w.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C4037u(field, i, enumC4039w, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static C4037u forPackedFieldWithEnumVerifier(Field field, int i, EnumC4039w enumC4039w, B.e eVar, Field field2) {
        checkFieldNumber(i);
        B.checkNotNull(field, "field");
        return new C4037u(field, i, enumC4039w, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static C4037u forProto2OptionalField(Field field, int i, EnumC4039w enumC4039w, Field field2, int i10, boolean z10, B.e eVar) {
        checkFieldNumber(i);
        B.checkNotNull(field, "field");
        B.checkNotNull(enumC4039w, "fieldType");
        B.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i10)) {
            return new C4037u(field, i, enumC4039w, null, field2, i10, false, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException(C4356c.h(i10, "presenceMask must have exactly one bit set: "));
    }

    public static C4037u forProto2RequiredField(Field field, int i, EnumC4039w enumC4039w, Field field2, int i10, boolean z10, B.e eVar) {
        checkFieldNumber(i);
        B.checkNotNull(field, "field");
        B.checkNotNull(enumC4039w, "fieldType");
        B.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i10)) {
            return new C4037u(field, i, enumC4039w, null, field2, i10, true, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException(C4356c.h(i10, "presenceMask must have exactly one bit set: "));
    }

    public static C4037u forRepeatedMessageField(Field field, int i, EnumC4039w enumC4039w, Class<?> cls) {
        checkFieldNumber(i);
        B.checkNotNull(field, "field");
        B.checkNotNull(enumC4039w, "fieldType");
        B.checkNotNull(cls, "messageClass");
        return new C4037u(field, i, enumC4039w, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public static b newBuilder() {
        return new b(null);
    }

    public Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public B.e getEnumVerifier() {
        return this.enumVerifier;
    }

    public Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i = a.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i == 3 || i == 4) {
            return this.messageClass;
        }
        return null;
    }

    public d0 getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public EnumC4039w getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    @Override // java.lang.Comparable
    public int compareTo(C4037u c4037u) {
        return this.fieldNumber - c4037u.fieldNumber;
    }
}
