package kotlin.reflect.jvm.internal.impl.types.error;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final String debugText;
    public static final b ERROR_CLASS = new b("ERROR_CLASS", 0, "<Error class: %s>");
    public static final b ERROR_FUNCTION = new b("ERROR_FUNCTION", 1, "<Error function>");
    public static final b ERROR_SCOPE = new b("ERROR_SCOPE", 2, "<Error scope>");
    public static final b ERROR_MODULE = new b("ERROR_MODULE", 3, "<Error module>");
    public static final b ERROR_PROPERTY = new b("ERROR_PROPERTY", 4, "<Error property>");
    public static final b ERROR_TYPE = new b("ERROR_TYPE", 5, "[Error type: %s]");
    public static final b PARENT_OF_ERROR_SCOPE = new b("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    private static final /* synthetic */ b[] $values() {
        return new b[]{ERROR_CLASS, ERROR_FUNCTION, ERROR_SCOPE, ERROR_MODULE, ERROR_PROPERTY, ERROR_TYPE, PARENT_OF_ERROR_SCOPE};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = AbstractC5827b.a(bVarArr$values);
    }

    private b(String str, int i10, String str2) {
        this.debugText = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getDebugText() {
        return this.debugText;
    }
}
