package V6;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p DRAWABLE = new p("DRAWABLE", 0);
    public static final p BITMAP = new p("BITMAP", 1);
    public static final p GIF = new p("GIF", 2);

    private static final /* synthetic */ p[] $values() {
        return new p[]{DRAWABLE, BITMAP, GIF};
    }

    static {
        p[] pVarArr$values = $values();
        $VALUES = pVarArr$values;
        $ENTRIES = AbstractC5827b.a(pVarArr$values);
    }

    private p(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
