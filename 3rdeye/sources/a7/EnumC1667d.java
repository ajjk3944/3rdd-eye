package a7;

/* compiled from: EvaluableType.kt */
/* renamed from: a7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1667d {
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean"),
    STRING("String"),
    DATETIME("DateTime"),
    COLOR("Color"),
    URL("Url"),
    DICT("Dict"),
    ARRAY("Array");

    public static final a Companion = new a();
    private final String typeName;

    /* compiled from: EvaluableType.kt */
    /* renamed from: a7.d$a */
    public static final class a {
    }

    EnumC1667d(String str) {
        this.typeName = str;
    }

    public final String getTypeName$div_evaluable() {
        return this.typeName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeName;
    }
}
