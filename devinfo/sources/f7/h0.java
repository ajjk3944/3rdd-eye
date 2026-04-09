package f7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f23744a;

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f23745b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f23746c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h0[] f23747d;

    static {
        h0 h0Var = new h0("AUTOMATIC", 0);
        f23744a = h0Var;
        h0 h0Var2 = new h0("HARDWARE", 1);
        f23745b = h0Var2;
        h0 h0Var3 = new h0("SOFTWARE", 2);
        f23746c = h0Var3;
        f23747d = new h0[]{h0Var, h0Var2, h0Var3};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f23747d.clone();
    }
}
