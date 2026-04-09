package gc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5895b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5895b[] $VALUES;
    public static final EnumC5895b SIGNAL = new EnumC5895b("SIGNAL", 0);
    public static final EnumC5895b THROUGHPUT = new EnumC5895b("THROUGHPUT", 1);
    public static final EnumC5895b LATENCY = new EnumC5895b("LATENCY", 2);

    private static final /* synthetic */ EnumC5895b[] $values() {
        return new EnumC5895b[]{SIGNAL, THROUGHPUT, LATENCY};
    }

    static {
        EnumC5895b[] enumC5895bArr$values = $values();
        $VALUES = enumC5895bArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5895bArr$values);
    }

    private EnumC5895b(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5895b valueOf(String str) {
        return (EnumC5895b) Enum.valueOf(EnumC5895b.class, str);
    }

    public static EnumC5895b[] values() {
        return (EnumC5895b[]) $VALUES.clone();
    }
}
