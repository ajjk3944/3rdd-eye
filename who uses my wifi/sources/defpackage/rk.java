package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rk {
    public static final rk f;
    public static final /* synthetic */ rk[] g;

    static {
        rk rkVar = new rk("COROUTINE_SUSPENDED", 0);
        f = rkVar;
        g = new rk[]{rkVar, new rk("UNDECIDED", 1), new rk("RESUMED", 2)};
    }

    public static rk valueOf(String str) {
        return (rk) Enum.valueOf(rk.class, str);
    }

    public static rk[] values() {
        return (rk[]) g.clone();
    }
}
