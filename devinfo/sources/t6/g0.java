package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f34349a;

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f34350b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f34351c;

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f34352d;

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f34353e;

    /* renamed from: f, reason: collision with root package name */
    public static final g0 f34354f;
    public static final /* synthetic */ g0[] g;

    static {
        g0 g0Var = new g0("ENQUEUED", 0);
        f34349a = g0Var;
        g0 g0Var2 = new g0("RUNNING", 1);
        f34350b = g0Var2;
        g0 g0Var3 = new g0("SUCCEEDED", 2);
        f34351c = g0Var3;
        g0 g0Var4 = new g0("FAILED", 3);
        f34352d = g0Var4;
        g0 g0Var5 = new g0("BLOCKED", 4);
        f34353e = g0Var5;
        g0 g0Var6 = new g0("CANCELLED", 5);
        f34354f = g0Var6;
        g = new g0[]{g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) g.clone();
    }

    public final boolean a() {
        return this == f34351c || this == f34352d || this == f34354f;
    }
}
