package zh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zh.AbstractC8767f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: zh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC8764c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC8764c[] $VALUES;
    public static final a Companion;
    public static final EnumC8764c Function = new EnumC8764c("Function", 0);
    public static final EnumC8764c SuspendFunction = new EnumC8764c("SuspendFunction", 1);
    public static final EnumC8764c KFunction = new EnumC8764c("KFunction", 2);
    public static final EnumC8764c KSuspendFunction = new EnumC8764c("KSuspendFunction", 3);
    public static final EnumC8764c UNKNOWN = new EnumC8764c("UNKNOWN", 4);

    /* renamed from: zh.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC8764c a(AbstractC8767f functionTypeKind) {
            AbstractC6492s.i(functionTypeKind, "functionTypeKind");
            return AbstractC6492s.d(functionTypeKind, AbstractC8767f.a.f67310e) ? EnumC8764c.Function : AbstractC6492s.d(functionTypeKind, AbstractC8767f.d.f67313e) ? EnumC8764c.SuspendFunction : AbstractC6492s.d(functionTypeKind, AbstractC8767f.b.f67311e) ? EnumC8764c.KFunction : AbstractC6492s.d(functionTypeKind, AbstractC8767f.c.f67312e) ? EnumC8764c.KSuspendFunction : EnumC8764c.UNKNOWN;
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC8764c[] $values() {
        return new EnumC8764c[]{Function, SuspendFunction, KFunction, KSuspendFunction, UNKNOWN};
    }

    static {
        EnumC8764c[] enumC8764cArr$values = $values();
        $VALUES = enumC8764cArr$values;
        $ENTRIES = AbstractC5827b.a(enumC8764cArr$values);
        Companion = new a(null);
    }

    private EnumC8764c(String str, int i10) {
    }

    public static EnumC8764c valueOf(String str) {
        return (EnumC8764c) Enum.valueOf(EnumC8764c.class, str);
    }

    public static EnumC8764c[] values() {
        return (EnumC8764c[]) $VALUES.clone();
    }
}
