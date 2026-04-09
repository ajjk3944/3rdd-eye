package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p34 {
    public static final p34 f;
    public static final p34 g;
    public static final p34 h;
    public static final /* synthetic */ p34[] i;

    /* JADX INFO: Fake field, exist only in values array */
    p34 EF0;

    static {
        p34 p34Var = new p34("SHA1", 0);
        p34 p34Var2 = new p34("SHA224", 1);
        p34 p34Var3 = new p34("SHA256", 2);
        f = p34Var3;
        p34 p34Var4 = new p34("SHA384", 3);
        g = p34Var4;
        p34 p34Var5 = new p34("SHA512", 4);
        h = p34Var5;
        i = new p34[]{p34Var, p34Var2, p34Var3, p34Var4, p34Var5};
    }

    public static p34[] values() {
        return (p34[]) i.clone();
    }
}
