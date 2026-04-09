package S8;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import org.snmp4j.util.SnmpConfigurator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: A, reason: collision with root package name */
    public static final a f20354A = new a(SnmpConfigurator.O_AUTH_PASSPHRASE, 0);

    /* renamed from: B, reason: collision with root package name */
    public static final a f20355B = new a("B", 1);

    /* renamed from: G, reason: collision with root package name */
    public static final a f20356G = new a("G", 2);

    /* renamed from: N, reason: collision with root package name */
    public static final a f20357N = new a("N", 3);
    public static final a AC = new a("AC", 4);
    public static final a AD = new a("AD", 5);
    public static final a AX = new a("AX", 6);
    public static final a BE = new a("BE", 7);

    private static final /* synthetic */ a[] $values() {
        return new a[]{f20354A, f20355B, f20356G, f20357N, AC, AD, AX, BE};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = AbstractC5827b.a(aVarArr$values);
    }

    private a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
