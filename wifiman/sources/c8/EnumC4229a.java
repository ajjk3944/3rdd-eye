package c8;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4229a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC4229a[] $VALUES;
    private final String baseUrl;
    public static final EnumC4229a PRODUCTION = new EnumC4229a("PRODUCTION", 0, "https://sp-dir.uwn.com");
    public static final EnumC4229a STAGE = new EnumC4229a("STAGE", 1, "https://stg-sp-dir.uwn.com");
    public static final EnumC4229a DEV = new EnumC4229a("DEV", 2, "https://dev-sp-dir.uwn.com");

    private static final /* synthetic */ EnumC4229a[] $values() {
        return new EnumC4229a[]{PRODUCTION, STAGE, DEV};
    }

    static {
        EnumC4229a[] enumC4229aArr$values = $values();
        $VALUES = enumC4229aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC4229aArr$values);
    }

    private EnumC4229a(String str, int i10, String str2) {
        this.baseUrl = str2;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4229a valueOf(String str) {
        return (EnumC4229a) Enum.valueOf(EnumC4229a.class, str);
    }

    public static EnumC4229a[] values() {
        return (EnumC4229a[]) $VALUES.clone();
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }
}
