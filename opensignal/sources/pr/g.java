package pr;

import or.o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'KFunction' uses external variables
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
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final f Companion;
    public static final g KFunction;
    public static final g KSuspendFunction;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final qs.c packageFqName;
    public static final g Function = new g("Function", 0, o.j, "Function", false, false);
    public static final g SuspendFunction = new g("SuspendFunction", 1, o.f19717e, "SuspendFunction", true, false);

    private static final /* synthetic */ g[] $values() {
        return new g[]{Function, SuspendFunction, KFunction, KSuspendFunction};
    }

    static {
        qs.c cVar = o.f19720h;
        KFunction = new g("KFunction", 2, cVar, "KFunction", false, true);
        KSuspendFunction = new g("KSuspendFunction", 3, cVar, "KSuspendFunction", true, true);
        $VALUES = $values();
        Companion = new f();
    }

    private g(String str, int i10, qs.c cVar, String str2, boolean z10, boolean z11) {
        this.packageFqName = cVar;
        this.classNamePrefix = str2;
        this.isSuspendType = z10;
        this.isReflectType = z11;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final qs.c getPackageFqName() {
        return this.packageFqName;
    }

    public final qs.g numberedClassName(int i10) {
        return qs.g.e(this.classNamePrefix + i10);
    }
}
