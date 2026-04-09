package kotlin.reflect.jvm.internal.impl.builtins;

import Zh.b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q UBYTEARRAY;
    public static final q UINTARRAY;
    public static final q ULONGARRAY;
    public static final q USHORTARRAY;
    private final Zh.b classId;
    private final Zh.f typeName;

    private static final /* synthetic */ q[] $values() {
        return new q[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        b.a aVar = Zh.b.f25401d;
        UBYTEARRAY = new q("UBYTEARRAY", 0, b.a.b(aVar, "kotlin/UByteArray", false, 2, null));
        USHORTARRAY = new q("USHORTARRAY", 1, b.a.b(aVar, "kotlin/UShortArray", false, 2, null));
        UINTARRAY = new q("UINTARRAY", 2, b.a.b(aVar, "kotlin/UIntArray", false, 2, null));
        ULONGARRAY = new q("ULONGARRAY", 3, b.a.b(aVar, "kotlin/ULongArray", false, 2, null));
        q[] qVarArr$values = $values();
        $VALUES = qVarArr$values;
        $ENTRIES = AbstractC5827b.a(qVarArr$values);
    }

    private q(String str, int i10, Zh.b bVar) {
        this.classId = bVar;
        this.typeName = bVar.h();
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final Zh.f getTypeName() {
        return this.typeName;
    }
}
