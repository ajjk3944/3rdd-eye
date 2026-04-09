package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g1 f25670a;

    /* renamed from: b, reason: collision with root package name */
    public static final g1 f25671b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g1[] f25672c;

    static {
        g1 g1Var = new g1("Width", 0);
        f25670a = g1Var;
        g1 g1Var2 = new g1("Height", 1);
        f25671b = g1Var2;
        f25672c = new g1[]{g1Var, g1Var2};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) f25672c.clone();
    }
}
