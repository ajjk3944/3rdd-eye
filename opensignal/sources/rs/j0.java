package rs;

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
public class j0 {
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 BOOL;
    public static final j0 BYTES;
    public static final j0 DOUBLE;
    public static final j0 ENUM;
    public static final j0 FIXED32;
    public static final j0 FIXED64;
    public static final j0 FLOAT;
    public static final j0 GROUP;
    public static final j0 INT32;
    public static final j0 INT64;
    public static final j0 MESSAGE;
    public static final j0 SFIXED32;
    public static final j0 SFIXED64;
    public static final j0 SINT32;
    public static final j0 SINT64;
    public static final j0 STRING;
    public static final j0 UINT32;
    public static final j0 UINT64;
    private final k0 javaType;
    private final int wireType;

    static {
        j0 j0Var = new j0("DOUBLE", 0, k0.DOUBLE, 1);
        DOUBLE = j0Var;
        j0 j0Var2 = new j0("FLOAT", 1, k0.FLOAT, 5);
        FLOAT = j0Var2;
        k0 k0Var = k0.LONG;
        j0 j0Var3 = new j0("INT64", 2, k0Var, 0);
        INT64 = j0Var3;
        j0 j0Var4 = new j0("UINT64", 3, k0Var, 0);
        UINT64 = j0Var4;
        k0 k0Var2 = k0.INT;
        j0 j0Var5 = new j0("INT32", 4, k0Var2, 0);
        INT32 = j0Var5;
        j0 j0Var6 = new j0("FIXED64", 5, k0Var, 1);
        FIXED64 = j0Var6;
        j0 j0Var7 = new j0("FIXED32", 6, k0Var2, 5);
        FIXED32 = j0Var7;
        j0 j0Var8 = new j0("BOOL", 7, k0.BOOLEAN, 0);
        BOOL = j0Var8;
        j0 j0Var9 = new j0("STRING", 8, k0.STRING, 2) { // from class: rs.j0.a
            @Override // rs.j0
            public boolean isPackable() {
                return false;
            }
        };
        STRING = j0Var9;
        k0 k0Var3 = k0.MESSAGE;
        j0 j0Var10 = new j0("GROUP", 9, k0Var3, 3) { // from class: rs.j0.b
            @Override // rs.j0
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = j0Var10;
        int i10 = 2;
        j0 j0Var11 = new j0("MESSAGE", 10, k0Var3, i10) { // from class: rs.j0.c
            @Override // rs.j0
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = j0Var11;
        j0 j0Var12 = new j0("BYTES", 11, k0.BYTE_STRING, i10) { // from class: rs.j0.d
            @Override // rs.j0
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = j0Var12;
        j0 j0Var13 = new j0("UINT32", 12, k0Var2, 0);
        UINT32 = j0Var13;
        j0 j0Var14 = new j0("ENUM", 13, k0.ENUM, 0);
        ENUM = j0Var14;
        j0 j0Var15 = new j0("SFIXED32", 14, k0Var2, 5);
        SFIXED32 = j0Var15;
        j0 j0Var16 = new j0("SFIXED64", 15, k0Var, 1);
        SFIXED64 = j0Var16;
        j0 j0Var17 = new j0("SINT32", 16, k0Var2, 0);
        SINT32 = j0Var17;
        j0 j0Var18 = new j0("SINT64", 17, k0Var, 0);
        SINT64 = j0Var18;
        $VALUES = new j0[]{j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6, j0Var7, j0Var8, j0Var9, j0Var10, j0Var11, j0Var12, j0Var13, j0Var14, j0Var15, j0Var16, j0Var17, j0Var18};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }

    public k0 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private j0(String str, int i10, k0 k0Var, int i11) {
        this.javaType = k0Var;
        this.wireType = i11;
    }
}
