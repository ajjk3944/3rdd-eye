package Jh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class O {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ O[] $VALUES;
    public static final a Companion;
    private final String description;
    public static final O IGNORE = new O("IGNORE", 0, "ignore");
    public static final O WARN = new O("WARN", 1, "warn");
    public static final O STRICT = new O("STRICT", 2, "strict");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final /* synthetic */ O[] $values() {
        return new O[]{IGNORE, WARN, STRICT};
    }

    static {
        O[] oArr$values = $values();
        $VALUES = oArr$values;
        $ENTRIES = AbstractC5827b.a(oArr$values);
        Companion = new a(null);
    }

    private O(String str, int i10, String str2) {
        this.description = str2;
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
