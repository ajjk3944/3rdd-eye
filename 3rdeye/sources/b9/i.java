package b9;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Lazy.kt */
/* loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i SYNCHRONIZED = new i("SYNCHRONIZED", 0);
    public static final i PUBLICATION = new i("PUBLICATION", 1);
    public static final i NONE = new i("NONE", 2);

    private static final /* synthetic */ i[] $values() {
        return new i[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        i[] iVarArr$values = $values();
        $VALUES = iVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(iVarArr$values);
    }

    private i(String str, int i) {
    }

    public static InterfaceC4463a<i> getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
