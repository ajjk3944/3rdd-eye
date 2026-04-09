package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eg4 {
    public static final eg4 f;
    public static final eg4 g;
    public static final eg4 h;
    public static final eg4 i;
    public static final /* synthetic */ eg4[] j;

    static {
        eg4 eg4Var = new eg4("SUCCESS", 0);
        f = eg4Var;
        eg4 eg4Var2 = new eg4("PERMANENT_FAILURE", 1);
        g = eg4Var2;
        eg4 eg4Var3 = new eg4("RETRIABLE_FAILURE", 2);
        h = eg4Var3;
        eg4 eg4Var4 = new eg4("BUFFERED", 3);
        i = eg4Var4;
        j = new eg4[]{eg4Var, eg4Var2, eg4Var3, eg4Var4};
    }

    public static eg4[] values() {
        return (eg4[]) j.clone();
    }
}
