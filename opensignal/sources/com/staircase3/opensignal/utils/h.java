package com.staircase3.opensignal.utils;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MB' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h B = new h("B", 0, 1, qk.l.unit_bytes_abbrev);
    public static final h GB;
    public static final h GBPS;
    public static final h KB;
    public static final h KBPS;
    public static final h MB;
    public static final h MBPS;
    final long baseValue;
    final int resourceId;

    private static /* synthetic */ h[] $values() {
        return new h[]{B, KB, MB, GB, KBPS, MBPS, GBPS};
    }

    static {
        h hVar = new h("KB", 1, 1024L, qk.l.unit_kilobytes_abbrev);
        KB = hVar;
        h hVar2 = new h("MB", 2, hVar.getBaseValue() * 1024, qk.l.units_mb_abbrev);
        MB = hVar2;
        GB = new h("GB", 3, hVar2.getBaseValue() * 1024, qk.l.units_gb_abbrev);
        KBPS = new h("KBPS", 4, 1L, qk.l.kbps);
        h hVar3 = new h("MBPS", 5, 1000L, qk.l.mbps);
        MBPS = hVar3;
        GBPS = new h("GBPS", 6, hVar3.getBaseValue() * hVar3.getBaseValue(), qk.l.gbps);
        $VALUES = $values();
    }

    private h(String str, int i10, long j, int i11) {
        this.resourceId = i11;
        this.baseValue = j;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public long getBaseValue() {
        return this.baseValue;
    }

    public int getResourceId() {
        return this.resourceId;
    }
}
