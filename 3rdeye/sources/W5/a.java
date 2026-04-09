package W5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BalloonOverlayAnimation.kt */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NONE = new a("NONE", 0);
    public static final a FADE = new a("FADE", 1);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NONE, FADE};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(aVarArr$values);
    }

    private a(String str, int i) {
    }

    public static InterfaceC4463a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
