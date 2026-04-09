package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x8 {
    public static final x8 f;
    public static final x8 g;
    public static final /* synthetic */ x8[] h;

    static {
        x8 x8Var = new x8("AUTOMATIC", 0);
        f = x8Var;
        x8 x8Var2 = new x8("ENABLED", 1);
        g = x8Var2;
        h = new x8[]{x8Var, x8Var2, new x8("DISABLED", 2)};
    }

    public static x8 valueOf(String str) {
        return (x8) Enum.valueOf(x8.class, str);
    }

    public static x8[] values() {
        return (x8[]) h.clone();
    }
}
