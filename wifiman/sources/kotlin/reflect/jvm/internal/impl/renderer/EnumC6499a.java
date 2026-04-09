package kotlin.reflect.jvm.internal.impl.renderer;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC6499a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC6499a[] $VALUES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    public static final EnumC6499a NO_ARGUMENTS = new EnumC6499a("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final EnumC6499a UNLESS_EMPTY = new EnumC6499a("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final EnumC6499a ALWAYS_PARENTHESIZED = new EnumC6499a("ALWAYS_PARENTHESIZED", 2, true, true);

    private static final /* synthetic */ EnumC6499a[] $values() {
        return new EnumC6499a[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    static {
        EnumC6499a[] enumC6499aArr$values = $values();
        $VALUES = enumC6499aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC6499aArr$values);
    }

    private EnumC6499a(String str, int i10, boolean z10, boolean z11) {
        this.includeAnnotationArguments = z10;
        this.includeEmptyAnnotationArguments = z11;
    }

    public static EnumC6499a valueOf(String str) {
        return (EnumC6499a) Enum.valueOf(EnumC6499a.class, str);
    }

    public static EnumC6499a[] values() {
        return (EnumC6499a[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    /* synthetic */ EnumC6499a(String str, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11);
    }
}
