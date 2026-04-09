package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h34 {
    public static final h34 f;
    public static final h34 g;
    public static final h34 h;
    public static final /* synthetic */ h34[] i;

    static {
        h34 h34Var = new h34("NIST_P256", 0);
        f = h34Var;
        h34 h34Var2 = new h34("NIST_P384", 1);
        g = h34Var2;
        h34 h34Var3 = new h34("NIST_P521", 2);
        h = h34Var3;
        i = new h34[]{h34Var, h34Var2, h34Var3};
    }

    public static h34[] values() {
        return (h34[]) i.clone();
    }
}
