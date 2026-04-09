package ec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public static final t3 f23082a;

    /* renamed from: b, reason: collision with root package name */
    public static final t3 f23083b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t3[] f23084c;

    static {
        t3 t3Var = new t3("CONSENT", 0);
        f23082a = t3Var;
        t3 t3Var2 = new t3("LEGITIMATE_INTEREST", 1);
        t3 t3Var3 = new t3("FLEXIBLE_CONSENT", 2);
        t3 t3Var4 = new t3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f23083b = t3Var4;
        f23084c = new t3[]{t3Var, t3Var2, t3Var3, t3Var4};
    }

    public static t3[] values() {
        return (t3[]) f23084c.clone();
    }
}
