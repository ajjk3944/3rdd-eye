package nm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f30051a;

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f30052b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h0[] f30053c;

    static {
        h0 h0Var = new h0("BACKWARD", 0);
        f30051a = h0Var;
        h0 h0Var2 = new h0("FORWARD", 1);
        f30052b = h0Var2;
        f30053c = new h0[]{h0Var, h0Var2};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f30053c.clone();
    }
}
