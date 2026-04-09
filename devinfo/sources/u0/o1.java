package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f34892a;

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f34893b;

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f34894c;

    /* renamed from: d, reason: collision with root package name */
    public static final o1 f34895d;

    /* renamed from: e, reason: collision with root package name */
    public static final o1 f34896e;

    /* renamed from: f, reason: collision with root package name */
    public static final o1 f34897f;
    public static final /* synthetic */ o1[] g;

    static {
        o1 o1Var = new o1("ShutDown", 0);
        f34892a = o1Var;
        o1 o1Var2 = new o1("ShuttingDown", 1);
        f34893b = o1Var2;
        o1 o1Var3 = new o1("Inactive", 2);
        f34894c = o1Var3;
        o1 o1Var4 = new o1("InactivePendingWork", 3);
        f34895d = o1Var4;
        o1 o1Var5 = new o1("Idle", 4);
        f34896e = o1Var5;
        o1 o1Var6 = new o1("PendingWork", 5);
        f34897f = o1Var6;
        g = new o1[]{o1Var, o1Var2, o1Var3, o1Var4, o1Var5, o1Var6};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) g.clone();
    }
}
