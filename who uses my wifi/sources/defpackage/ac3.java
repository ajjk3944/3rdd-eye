package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ac3 {
    public static final ac3 f;
    public static final /* synthetic */ ac3[] g;

    /* JADX INFO: Fake field, exist only in values array */
    ac3 EF0;

    static {
        ac3 ac3Var = new ac3("VIDEO_CONTROLS", 0);
        ac3 ac3Var2 = new ac3("CLOSE_AD", 1);
        ac3 ac3Var3 = new ac3("NOT_VISIBLE", 2);
        f = ac3Var3;
        g = new ac3[]{ac3Var, ac3Var2, ac3Var3, new ac3("OTHER", 3)};
    }

    public static ac3[] values() {
        return (ac3[]) g.clone();
    }
}
