package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qe2 {
    public static final qe2 f;
    public static final /* synthetic */ qe2[] g;

    /* JADX INFO: Fake field, exist only in values array */
    qe2 EF0;

    static {
        qe2 qe2Var = new qe2("DEBUG_PARAM_UNKNOWN", 0);
        qe2 qe2Var2 = new qe2("ALWAYS_SHOW", 1);
        qe2 qe2Var3 = new qe2("GEO_OVERRIDE_EEA", 2);
        qe2 qe2Var4 = new qe2("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        qe2 qe2Var5 = new qe2("GEO_OVERRIDE_OTHER", 4);
        qe2 qe2Var6 = new qe2("GEO_OVERRIDE_NON_EEA", 5);
        qe2 qe2Var7 = new qe2("PREVIEWING_DEBUG_MESSAGES", 6);
        f = qe2Var7;
        g = new qe2[]{qe2Var, qe2Var2, qe2Var3, qe2Var4, qe2Var5, qe2Var6, qe2Var7};
    }

    public static qe2[] values() {
        return (qe2[]) g.clone();
    }
}
