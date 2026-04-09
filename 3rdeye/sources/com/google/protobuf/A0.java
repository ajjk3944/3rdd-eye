package com.google.protobuf;

import java.io.IOException;

/* compiled from: WireFormat.java */
/* loaded from: classes2.dex */
public final class A0 {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);

    /* compiled from: WireFormat.java */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
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
    /* compiled from: WireFormat.java */
    public static class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOL;
        public static final b BYTES;
        public static final b ENUM;
        public static final b FIXED32;
        public static final b FIXED64;
        public static final b GROUP;
        public static final b INT32;
        public static final b INT64;
        public static final b MESSAGE;
        public static final b SFIXED32;
        public static final b SFIXED64;
        public static final b SINT32;
        public static final b SINT64;
        public static final b STRING;
        public static final b UINT32;
        public static final b UINT64;
        private final c javaType;
        private final int wireType;
        public static final b DOUBLE = new b("DOUBLE", 0, c.DOUBLE, 1);
        public static final b FLOAT = new b("FLOAT", 1, c.FLOAT, 5);

        /* compiled from: WireFormat.java */
        public enum a extends b {
            public a(String str, int i, c cVar, int i10) {
                super(str, i, cVar, i10, null);
            }

            @Override // com.google.protobuf.A0.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: com.google.protobuf.A0$b$b, reason: collision with other inner class name */
        public enum C0354b extends b {
            public C0354b(String str, int i, c cVar, int i10) {
                super(str, i, cVar, i10, null);
            }

            @Override // com.google.protobuf.A0.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        public enum c extends b {
            public c(String str, int i, c cVar, int i10) {
                super(str, i, cVar, i10, null);
            }

            @Override // com.google.protobuf.A0.b
            public boolean isPackable() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        public enum d extends b {
            public d(String str, int i, c cVar, int i10) {
                super(str, i, cVar, i10, null);
            }

            @Override // com.google.protobuf.A0.b
            public boolean isPackable() {
                return false;
            }
        }

        private static /* synthetic */ b[] $values() {
            return new b[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
        }

        static {
            c cVar = c.LONG;
            INT64 = new b("INT64", 2, cVar, 0);
            UINT64 = new b("UINT64", 3, cVar, 0);
            c cVar2 = c.INT;
            INT32 = new b("INT32", 4, cVar2, 0);
            FIXED64 = new b("FIXED64", 5, cVar, 1);
            FIXED32 = new b("FIXED32", 6, cVar2, 5);
            BOOL = new b("BOOL", 7, c.BOOLEAN, 0);
            STRING = new a("STRING", 8, c.STRING, 2);
            c cVar3 = c.MESSAGE;
            GROUP = new C0354b("GROUP", 9, cVar3, 3);
            MESSAGE = new c("MESSAGE", 10, cVar3, 2);
            BYTES = new d("BYTES", 11, c.BYTE_STRING, 2);
            UINT32 = new b("UINT32", 12, cVar2, 0);
            ENUM = new b("ENUM", 13, c.ENUM, 0);
            SFIXED32 = new b("SFIXED32", 14, cVar2, 5);
            SFIXED64 = new b("SFIXED64", 15, cVar, 1);
            SINT32 = new b("SINT32", 16, cVar2, 0);
            SINT64 = new b("SINT64", 17, cVar, 0);
            $VALUES = $values();
        }

        public /* synthetic */ b(String str, int i, c cVar, int i10, a aVar) {
            this(str, i, cVar, i10);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public c getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        private b(String str, int i, c cVar, int i10) {
            this.javaType = cVar;
            this.wireType = i10;
        }
    }

    /* compiled from: WireFormat.java */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC4026i.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        c(Object obj) {
            this.defaultDefault = obj;
        }

        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WireFormat.java */
    public static abstract class d {
        public static final d LOOSE = new a("LOOSE", 0);
        public static final d STRICT = new b("STRICT", 1);
        public static final d LAZY = new c("LAZY", 2);
        private static final /* synthetic */ d[] $VALUES = $values();

        /* compiled from: WireFormat.java */
        public enum a extends d {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.protobuf.A0.d
            public Object readString(AbstractC4027j abstractC4027j) throws IOException {
                return abstractC4027j.readString();
            }
        }

        /* compiled from: WireFormat.java */
        public enum b extends d {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.protobuf.A0.d
            public Object readString(AbstractC4027j abstractC4027j) throws IOException {
                return abstractC4027j.readStringRequireUtf8();
            }
        }

        /* compiled from: WireFormat.java */
        public enum c extends d {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.protobuf.A0.d
            public Object readString(AbstractC4027j abstractC4027j) throws IOException {
                return abstractC4027j.readBytes();
            }
        }

        private static /* synthetic */ d[] $values() {
            return new d[]{LOOSE, STRICT, LAZY};
        }

        private d(String str, int i) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public abstract Object readString(AbstractC4027j abstractC4027j) throws IOException;

        public /* synthetic */ d(String str, int i, a aVar) {
            this(str, i);
        }
    }

    private A0() {
    }

    public static int getTagFieldNumber(int i) {
        return i >>> 3;
    }

    public static int getTagWireType(int i) {
        return i & 7;
    }

    public static int makeTag(int i, int i10) {
        return (i << 3) | i10;
    }

    public static Object readPrimitiveField(AbstractC4027j abstractC4027j, b bVar, d dVar) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC4027j.readDouble());
            case 2:
                return Float.valueOf(abstractC4027j.readFloat());
            case 3:
                return Long.valueOf(abstractC4027j.readInt64());
            case 4:
                return Long.valueOf(abstractC4027j.readUInt64());
            case 5:
                return Integer.valueOf(abstractC4027j.readInt32());
            case 6:
                return Long.valueOf(abstractC4027j.readFixed64());
            case 7:
                return Integer.valueOf(abstractC4027j.readFixed32());
            case 8:
                return Boolean.valueOf(abstractC4027j.readBool());
            case 9:
                return abstractC4027j.readBytes();
            case 10:
                return Integer.valueOf(abstractC4027j.readUInt32());
            case 11:
                return Integer.valueOf(abstractC4027j.readSFixed32());
            case 12:
                return Long.valueOf(abstractC4027j.readSFixed64());
            case 13:
                return Integer.valueOf(abstractC4027j.readSInt32());
            case 14:
                return Long.valueOf(abstractC4027j.readSInt64());
            case 15:
                return dVar.readString(abstractC4027j);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
