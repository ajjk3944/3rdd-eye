package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g1 f34813a;

    /* renamed from: b, reason: collision with root package name */
    public static final g1 f34814b;

    /* renamed from: c, reason: collision with root package name */
    public static final g1 f34815c;

    /* renamed from: d, reason: collision with root package name */
    public static final g1 f34816d;

    /* renamed from: e, reason: collision with root package name */
    public static final g1 f34817e;

    /* renamed from: f, reason: collision with root package name */
    public static final g1 f34818f;
    public static final g1 g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g1[] f34819h;

    static {
        g1 g1Var = new g1("Invalid", 0);
        f34813a = g1Var;
        g1 g1Var2 = new g1("Cancelled", 1);
        f34814b = g1Var2;
        g1 g1Var3 = new g1("InitialPending", 2);
        f34815c = g1Var3;
        g1 g1Var4 = new g1("RecomposePending", 3);
        f34816d = g1Var4;
        g1 g1Var5 = new g1("Recomposing", 4);
        f34817e = g1Var5;
        g1 g1Var6 = new g1("ApplyPending", 5);
        f34818f = g1Var6;
        g1 g1Var7 = new g1("Applied", 6);
        g = g1Var7;
        f34819h = new g1[]{g1Var, g1Var2, g1Var3, g1Var4, g1Var5, g1Var6, g1Var7};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) f34819h.clone();
    }
}
