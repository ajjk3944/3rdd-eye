package nm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f30044a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g0[] f30045b;

    static {
        g0 g0Var = new g0("SWAP", 0);
        f30044a = g0Var;
        f30045b = new g0[]{g0Var, new g0("INSERT", 1)};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f30045b.clone();
    }
}
