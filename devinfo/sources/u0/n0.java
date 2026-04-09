package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f34877a;

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f34878b;

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f34879c;

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f34880d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n0[] f34881e;

    static {
        n0 n0Var = new n0("IGNORED", 0);
        f34877a = n0Var;
        n0 n0Var2 = new n0("SCHEDULED", 1);
        f34878b = n0Var2;
        n0 n0Var3 = new n0("DEFERRED", 2);
        f34879c = n0Var3;
        n0 n0Var4 = new n0("IMMINENT", 3);
        f34880d = n0Var4;
        f34881e = new n0[]{n0Var, n0Var2, n0Var3, n0Var4};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f34881e.clone();
    }
}
