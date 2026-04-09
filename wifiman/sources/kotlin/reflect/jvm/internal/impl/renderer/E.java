package kotlin.reflect.jvm.internal.impl.renderer;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class E {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ E[] $VALUES;
    public static final E PRETTY = new E("PRETTY", 0);
    public static final E DEBUG = new E("DEBUG", 1);
    public static final E NONE = new E("NONE", 2);

    private static final /* synthetic */ E[] $values() {
        return new E[]{PRETTY, DEBUG, NONE};
    }

    static {
        E[] eArr$values = $values();
        $VALUES = eArr$values;
        $ENTRIES = AbstractC5827b.a(eArr$values);
    }

    private E(String str, int i10) {
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) $VALUES.clone();
    }
}
