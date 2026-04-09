package Yg;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q SYNCHRONIZED = new q("SYNCHRONIZED", 0);
    public static final q PUBLICATION = new q("PUBLICATION", 1);
    public static final q NONE = new q("NONE", 2);

    private static final /* synthetic */ q[] $values() {
        return new q[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        q[] qVarArr$values = $values();
        $VALUES = qVarArr$values;
        $ENTRIES = AbstractC5827b.a(qVarArr$values);
    }

    private q(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
