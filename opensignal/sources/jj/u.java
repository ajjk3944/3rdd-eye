package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    private final o0 triggerType;
    public static final u LOCATION_ENABLED_MANDATORY = new u("LOCATION_ENABLED_MANDATORY", 0, o0.LOCATION_ENABLED_MANDATORY);
    public static final u LOCATION_ENABLED_OPTIONAL = new u("LOCATION_ENABLED_OPTIONAL", 1, o0.LOCATION_ENABLED_OPTIONAL);
    public static final u LOCATION_DISABLED_MANDATORY = new u("LOCATION_DISABLED_MANDATORY", 2, o0.LOCATION_DISABLED_MANDATORY);
    public static final u LOCATION_DISABLED_OPTIONAL = new u("LOCATION_DISABLED_OPTIONAL", 3, o0.LOCATION_DISABLED_OPTIONAL);

    private static final /* synthetic */ u[] $values() {
        return new u[]{LOCATION_ENABLED_MANDATORY, LOCATION_ENABLED_OPTIONAL, LOCATION_DISABLED_MANDATORY, LOCATION_DISABLED_OPTIONAL};
    }

    static {
        u[] uVarArr$values = $values();
        $VALUES = uVarArr$values;
        $ENTRIES = a.a.j(uVarArr$values);
    }

    private u(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
