package Bh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class D {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ D[] $VALUES;
    public static final a Companion;
    public static final D FINAL = new D("FINAL", 0);
    public static final D SEALED = new D("SEALED", 1);
    public static final D OPEN = new D("OPEN", 2);
    public static final D ABSTRACT = new D("ABSTRACT", 3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D a(boolean z10, boolean z11, boolean z12) {
            return z10 ? D.SEALED : z11 ? D.ABSTRACT : z12 ? D.OPEN : D.FINAL;
        }

        private a() {
        }
    }

    private static final /* synthetic */ D[] $values() {
        return new D[]{FINAL, SEALED, OPEN, ABSTRACT};
    }

    static {
        D[] dArr$values = $values();
        $VALUES = dArr$values;
        $ENTRIES = AbstractC5827b.a(dArr$values);
        Companion = new a(null);
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
