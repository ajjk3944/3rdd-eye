package e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n implements l {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n Active = new n("Active", 0);
    public static final n ActiveParent = new n("ActiveParent", 1);
    public static final n Captured = new n("Captured", 2);
    public static final n Inactive = new n("Inactive", 3);

    private static final /* synthetic */ n[] $values() {
        return new n[]{Active, ActiveParent, Captured, Inactive};
    }

    static {
        n[] nVarArr$values = $values();
        $VALUES = nVarArr$values;
        $ENTRIES = a.a.j(nVarArr$values);
    }

    private n(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @Override // e1.l
    public boolean getHasFocus() {
        int i10 = m.f7664a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new bf.n();
    }

    public boolean isCaptured() {
        int i10 = m.f7664a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            return false;
        }
        throw new bf.n();
    }

    @Override // e1.l
    public boolean isFocused() {
        int i10 = m.f7664a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new bf.n();
    }
}
