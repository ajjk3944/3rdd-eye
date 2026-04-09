package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ej3 {
    public static final ej3 f;
    public static final ej3 g;
    public static final ej3 h;
    public static final ej3 i;
    public static final ej3 j;
    public static final /* synthetic */ ej3[] k;

    static {
        ej3 ej3Var = new ej3("RESULT_UNKNOWN", 0);
        f = ej3Var;
        ej3 ej3Var2 = new ej3("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        g = ej3Var2;
        ej3 ej3Var3 = new ej3("RESULT_UPDATED", 2);
        h = ej3Var3;
        ej3 ej3Var4 = new ej3("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        i = ej3Var4;
        ej3 ej3Var5 = new ej3("RESULT_FAILURE_INVALID_RESPONSE", 4);
        j = ej3Var5;
        k = new ej3[]{ej3Var, ej3Var2, ej3Var3, ej3Var4, ej3Var5};
    }

    public static ej3[] values() {
        return (ej3[]) k.clone();
    }
}
