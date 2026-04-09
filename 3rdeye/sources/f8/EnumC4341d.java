package f8;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PremiumScreenType.kt */
/* renamed from: f8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4341d {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ EnumC4341d[] $VALUES;
    public static final EnumC4341d START_LIKE_PRO = new EnumC4341d("START_LIKE_PRO", 0);
    public static final EnumC4341d RELAUNCH = new EnumC4341d("RELAUNCH", 1);

    private static final /* synthetic */ EnumC4341d[] $values() {
        return new EnumC4341d[]{START_LIKE_PRO, RELAUNCH};
    }

    static {
        EnumC4341d[] enumC4341dArr$values = $values();
        $VALUES = enumC4341dArr$values;
        $ENTRIES = com.google.gson.internal.c.l(enumC4341dArr$values);
    }

    private EnumC4341d(String str, int i) {
    }

    public static InterfaceC4463a<EnumC4341d> getEntries() {
        return $ENTRIES;
    }

    public static EnumC4341d valueOf(String str) {
        return (EnumC4341d) Enum.valueOf(EnumC4341d.class, str);
    }

    public static EnumC4341d[] values() {
        return (EnumC4341d[]) $VALUES.clone();
    }
}
