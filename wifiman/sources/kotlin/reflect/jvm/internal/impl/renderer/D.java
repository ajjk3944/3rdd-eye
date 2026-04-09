package kotlin.reflect.jvm.internal.impl.renderer;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class D {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ D[] $VALUES;
    public static final D ALL = new D("ALL", 0);
    public static final D ONLY_NON_SYNTHESIZED = new D("ONLY_NON_SYNTHESIZED", 1);
    public static final D NONE = new D("NONE", 2);

    private static final /* synthetic */ D[] $values() {
        return new D[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
    }

    static {
        D[] dArr$values = $values();
        $VALUES = dArr$values;
        $ENTRIES = AbstractC5827b.a(dArr$values);
    }

    private D(String str, int i10) {
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }
}
