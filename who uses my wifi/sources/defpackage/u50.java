package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u50 {
    public static final u50 f;
    public static final u50 g;
    public static final u50 h;
    public static final u50 i;
    public static final u50 j;
    public static final /* synthetic */ u50[] k;

    static {
        u50 u50Var = new u50("DESTROYED", 0);
        f = u50Var;
        u50 u50Var2 = new u50("INITIALIZED", 1);
        g = u50Var2;
        u50 u50Var3 = new u50("CREATED", 2);
        h = u50Var3;
        u50 u50Var4 = new u50("STARTED", 3);
        i = u50Var4;
        u50 u50Var5 = new u50("RESUMED", 4);
        j = u50Var5;
        k = new u50[]{u50Var, u50Var2, u50Var3, u50Var4, u50Var5};
    }

    public static u50 valueOf(String str) {
        return (u50) Enum.valueOf(u50.class, str);
    }

    public static u50[] values() {
        return (u50[]) k.clone();
    }
}
