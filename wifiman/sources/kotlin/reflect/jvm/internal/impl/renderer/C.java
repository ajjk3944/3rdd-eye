package kotlin.reflect.jvm.internal.impl.renderer;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class C {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ C[] $VALUES;
    public static final C RENDER_OVERRIDE = new C("RENDER_OVERRIDE", 0);
    public static final C RENDER_OPEN = new C("RENDER_OPEN", 1);
    public static final C RENDER_OPEN_OVERRIDE = new C("RENDER_OPEN_OVERRIDE", 2);

    private static final /* synthetic */ C[] $values() {
        return new C[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    static {
        C[] cArr$values = $values();
        $VALUES = cArr$values;
        $ENTRIES = AbstractC5827b.a(cArr$values);
    }

    private C(String str, int i10) {
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }
}
