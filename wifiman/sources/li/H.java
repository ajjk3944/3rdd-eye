package Li;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class H {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ H[] $VALUES;
    public static final H START = new H("START", 0);
    public static final H STOP = new H("STOP", 1);
    public static final H STOP_AND_RESET_REPLAY_CACHE = new H("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ H[] $values() {
        return new H[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        H[] hArr$values = $values();
        $VALUES = hArr$values;
        $ENTRIES = AbstractC5827b.a(hArr$values);
    }

    private H(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) $VALUES.clone();
    }
}
