package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class el3 implements cl3 {
    public static final el3 f;
    public static final /* synthetic */ el3[] g;

    static {
        el3 el3Var = new el3("ALWAYS_TRUE", 0);
        f = el3Var;
        g = new el3[]{el3Var, new el3("ALWAYS_FALSE", 1), new el3("IS_NULL", 2), new el3("NOT_NULL", 3)};
    }

    public static el3[] values() {
        return (el3[]) g.clone();
    }

    @Override // defpackage.cl3
    public final /* synthetic */ boolean c(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }
}
