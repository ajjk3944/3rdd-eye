package kotlin.reflect.jvm.internal.impl.types.error;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    private final String debugMessage;
    public static final h CAPTURED_TYPE_SCOPE = new h("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
    public static final h INTEGER_LITERAL_TYPE_SCOPE = new h("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
    public static final h ERASED_RECEIVER_TYPE_SCOPE = new h("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
    public static final h SCOPE_FOR_ABBREVIATION_TYPE = new h("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
    public static final h STUB_TYPE_SCOPE = new h("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
    public static final h NON_CLASSIFIER_SUPER_TYPE_SCOPE = new h("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
    public static final h ERROR_TYPE_SCOPE = new h("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
    public static final h UNSUPPORTED_TYPE_SCOPE = new h("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
    public static final h SCOPE_FOR_ERROR_CLASS = new h("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
    public static final h SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = new h("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    private static final /* synthetic */ h[] $values() {
        return new h[]{CAPTURED_TYPE_SCOPE, INTEGER_LITERAL_TYPE_SCOPE, ERASED_RECEIVER_TYPE_SCOPE, SCOPE_FOR_ABBREVIATION_TYPE, STUB_TYPE_SCOPE, NON_CLASSIFIER_SUPER_TYPE_SCOPE, ERROR_TYPE_SCOPE, UNSUPPORTED_TYPE_SCOPE, SCOPE_FOR_ERROR_CLASS, SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE};
    }

    static {
        h[] hVarArr$values = $values();
        $VALUES = hVarArr$values;
        $ENTRIES = AbstractC5827b.a(hVarArr$values);
    }

    private h(String str, int i10, String str2) {
        this.debugMessage = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }
}
