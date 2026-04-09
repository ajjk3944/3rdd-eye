package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s80 {
    public static final s80 f;
    public static final s80 g;
    public static final s80 h;
    public static final s80 i;
    public static final s80 j;
    public static final s80 k;
    public static final /* synthetic */ s80[] l;

    static {
        s80 s80Var = new s80("SET_ANIMATION", 0);
        f = s80Var;
        s80 s80Var2 = new s80("SET_PROGRESS", 1);
        g = s80Var2;
        s80 s80Var3 = new s80("SET_REPEAT_MODE", 2);
        h = s80Var3;
        s80 s80Var4 = new s80("SET_REPEAT_COUNT", 3);
        i = s80Var4;
        s80 s80Var5 = new s80("SET_IMAGE_ASSETS", 4);
        j = s80Var5;
        s80 s80Var6 = new s80("PLAY_OPTION", 5);
        k = s80Var6;
        l = new s80[]{s80Var, s80Var2, s80Var3, s80Var4, s80Var5, s80Var6};
    }

    public static s80 valueOf(String str) {
        return (s80) Enum.valueOf(s80.class, str);
    }

    public static s80[] values() {
        return (s80[]) l.clone();
    }
}
