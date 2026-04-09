package cs;

/* loaded from: classes.dex */
public enum f {
    NON_STABLE_DECLARED(false, false),
    STABLE_DECLARED(true, false),
    NON_STABLE_SYNTHESIZED(false, true),
    STABLE_SYNTHESIZED(true, true);

    public final boolean isStable;
    public final boolean isSynthesized;

    private static /* synthetic */ void $$$reportNull$$$0(int i10) {
        throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus.get must not return null");
    }

    f(boolean z10, boolean z11) {
        this.isStable = z10;
        this.isSynthesized = z11;
    }

    public static f get(boolean z10, boolean z11) {
        f fVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
        if (fVar == null) {
            $$$reportNull$$$0(0);
        }
        return fVar;
    }
}
