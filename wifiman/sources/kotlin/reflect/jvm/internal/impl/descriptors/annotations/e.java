package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vi.AbstractC8233a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    private final String renderName;
    public static final e FIELD = new e("FIELD", 0, null, 1, null);
    public static final e FILE = new e("FILE", 1, null, 1, null);
    public static final e PROPERTY = new e("PROPERTY", 2, null, 1, null);
    public static final e PROPERTY_GETTER = new e("PROPERTY_GETTER", 3, "get");
    public static final e PROPERTY_SETTER = new e("PROPERTY_SETTER", 4, "set");
    public static final e RECEIVER = new e("RECEIVER", 5, null, 1, null);
    public static final e CONSTRUCTOR_PARAMETER = new e("CONSTRUCTOR_PARAMETER", 6, "param");
    public static final e SETTER_PARAMETER = new e("SETTER_PARAMETER", 7, "setparam");
    public static final e PROPERTY_DELEGATE_FIELD = new e("PROPERTY_DELEGATE_FIELD", 8, "delegate");

    private static final /* synthetic */ e[] $values() {
        return new e[]{FIELD, FILE, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, RECEIVER, CONSTRUCTOR_PARAMETER, SETTER_PARAMETER, PROPERTY_DELEGATE_FIELD};
    }

    static {
        e[] eVarArr$values = $values();
        $VALUES = eVarArr$values;
        $ENTRIES = AbstractC5827b.a(eVarArr$values);
    }

    private e(String str, int i10, String str2) {
        this.renderName = str2 == null ? AbstractC8233a.f(name()) : str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String getRenderName() {
        return this.renderName;
    }

    /* synthetic */ e(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? null : str2);
    }
}
