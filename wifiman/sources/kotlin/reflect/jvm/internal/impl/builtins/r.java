package kotlin.reflect.jvm.internal.impl.builtins;

import Zh.b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r UBYTE;
    public static final r UINT;
    public static final r ULONG;
    public static final r USHORT;
    private final Zh.b arrayClassId;
    private final Zh.b classId;
    private final Zh.f typeName;

    private static final /* synthetic */ r[] $values() {
        return new r[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        b.a aVar = Zh.b.f25401d;
        UBYTE = new r("UBYTE", 0, b.a.b(aVar, "kotlin/UByte", false, 2, null));
        USHORT = new r("USHORT", 1, b.a.b(aVar, "kotlin/UShort", false, 2, null));
        UINT = new r("UINT", 2, b.a.b(aVar, "kotlin/UInt", false, 2, null));
        ULONG = new r("ULONG", 3, b.a.b(aVar, "kotlin/ULong", false, 2, null));
        r[] rVarArr$values = $values();
        $VALUES = rVarArr$values;
        $ENTRIES = AbstractC5827b.a(rVarArr$values);
    }

    private r(String str, int i10, Zh.b bVar) {
        this.classId = bVar;
        Zh.f fVarH = bVar.h();
        this.typeName = fVarH;
        Zh.c cVarF = bVar.f();
        Zh.f fVarH2 = Zh.f.h(fVarH.b() + "Array");
        AbstractC6492s.h(fVarH2, "identifier(...)");
        this.arrayClassId = new Zh.b(cVarF, fVarH2);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final Zh.b getArrayClassId() {
        return this.arrayClassId;
    }

    public final Zh.b getClassId() {
        return this.classId;
    }

    public final Zh.f getTypeName() {
        return this.typeName;
    }
}
