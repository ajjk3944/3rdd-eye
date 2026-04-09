package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class v1 {
    private static final /* synthetic */ v1[] $VALUES;
    public static final v1 BOOL;
    public static final v1 BYTES;
    public static final v1 DOUBLE;
    public static final v1 ENUM;
    public static final v1 FIXED32;
    public static final v1 FIXED64;
    public static final v1 FLOAT;
    public static final v1 GROUP;
    public static final v1 INT32;
    public static final v1 INT64;
    public static final v1 MESSAGE;
    public static final v1 SFIXED32;
    public static final v1 SFIXED64;
    public static final v1 SINT32;
    public static final v1 SINT64;
    public static final v1 STRING;
    public static final v1 UINT32;
    public static final v1 UINT64;
    private final w1 javaType;
    private final int wireType;

    static {
        v1 v1Var = new v1("DOUBLE", 0, w1.DOUBLE, 1);
        DOUBLE = v1Var;
        v1 v1Var2 = new v1("FLOAT", 1, w1.FLOAT, 5);
        FLOAT = v1Var2;
        w1 w1Var = w1.LONG;
        v1 v1Var3 = new v1("INT64", 2, w1Var, 0);
        INT64 = v1Var3;
        v1 v1Var4 = new v1("UINT64", 3, w1Var, 0);
        UINT64 = v1Var4;
        w1 w1Var2 = w1.INT;
        v1 v1Var5 = new v1("INT32", 4, w1Var2, 0);
        INT32 = v1Var5;
        v1 v1Var6 = new v1("FIXED64", 5, w1Var, 1);
        FIXED64 = v1Var6;
        v1 v1Var7 = new v1("FIXED32", 6, w1Var2, 5);
        FIXED32 = v1Var7;
        v1 v1Var8 = new v1("BOOL", 7, w1.BOOLEAN, 0);
        BOOL = v1Var8;
        v1 v1Var9 = new v1("STRING", 8, w1.STRING, 2) { // from class: androidx.datastore.preferences.protobuf.v1.a
            @Override // androidx.datastore.preferences.protobuf.v1
            public boolean isPackable() {
                return false;
            }
        };
        STRING = v1Var9;
        w1 w1Var3 = w1.MESSAGE;
        v1 v1Var10 = new v1("GROUP", 9, w1Var3, 3) { // from class: androidx.datastore.preferences.protobuf.v1.b
            @Override // androidx.datastore.preferences.protobuf.v1
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = v1Var10;
        int i10 = 2;
        v1 v1Var11 = new v1("MESSAGE", 10, w1Var3, i10) { // from class: androidx.datastore.preferences.protobuf.v1.c
            @Override // androidx.datastore.preferences.protobuf.v1
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = v1Var11;
        v1 v1Var12 = new v1("BYTES", 11, w1.BYTE_STRING, i10) { // from class: androidx.datastore.preferences.protobuf.v1.d
            @Override // androidx.datastore.preferences.protobuf.v1
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = v1Var12;
        v1 v1Var13 = new v1("UINT32", 12, w1Var2, 0);
        UINT32 = v1Var13;
        v1 v1Var14 = new v1("ENUM", 13, w1.ENUM, 0);
        ENUM = v1Var14;
        v1 v1Var15 = new v1("SFIXED32", 14, w1Var2, 5);
        SFIXED32 = v1Var15;
        v1 v1Var16 = new v1("SFIXED64", 15, w1Var, 1);
        SFIXED64 = v1Var16;
        v1 v1Var17 = new v1("SINT32", 16, w1Var2, 0);
        SINT32 = v1Var17;
        v1 v1Var18 = new v1("SINT64", 17, w1Var, 0);
        SINT64 = v1Var18;
        $VALUES = new v1[]{v1Var, v1Var2, v1Var3, v1Var4, v1Var5, v1Var6, v1Var7, v1Var8, v1Var9, v1Var10, v1Var11, v1Var12, v1Var13, v1Var14, v1Var15, v1Var16, v1Var17, v1Var18};
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) $VALUES.clone();
    }

    public w1 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private v1(String str, int i10, w1 w1Var, int i11) {
        this.javaType = w1Var;
        this.wireType = i11;
    }
}
