package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qw2 {
    public static final qw2 f;
    public static final qw2 g;
    public static final qw2 h;
    public static final /* synthetic */ qw2[] i;

    static {
        qw2 qw2Var = new qw2("AD_REQUESTED", 0);
        f = qw2Var;
        qw2 qw2Var2 = new qw2("AD_LOADED", 1);
        g = qw2Var2;
        qw2 qw2Var3 = new qw2("AD_LOAD_FAILED", 2);
        h = qw2Var3;
        i = new qw2[]{qw2Var, qw2Var2, qw2Var3};
    }

    public static qw2[] values() {
        return (qw2[]) i.clone();
    }
}
