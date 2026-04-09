package ri;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ri.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC7611b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC7611b[] $VALUES;
    public static final EnumC7611b FOR_SUBTYPING = new EnumC7611b("FOR_SUBTYPING", 0);
    public static final EnumC7611b FOR_INCORPORATION = new EnumC7611b("FOR_INCORPORATION", 1);
    public static final EnumC7611b FROM_EXPRESSION = new EnumC7611b("FROM_EXPRESSION", 2);

    private static final /* synthetic */ EnumC7611b[] $values() {
        return new EnumC7611b[]{FOR_SUBTYPING, FOR_INCORPORATION, FROM_EXPRESSION};
    }

    static {
        EnumC7611b[] enumC7611bArr$values = $values();
        $VALUES = enumC7611bArr$values;
        $ENTRIES = AbstractC5827b.a(enumC7611bArr$values);
    }

    private EnumC7611b(String str, int i10) {
    }

    public static EnumC7611b valueOf(String str) {
        return (EnumC7611b) Enum.valueOf(EnumC7611b.class, str);
    }

    public static EnumC7611b[] values() {
        return (EnumC7611b[]) $VALUES.clone();
    }
}
