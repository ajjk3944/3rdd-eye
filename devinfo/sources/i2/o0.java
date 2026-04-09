package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f25728a;

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f25729b;

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f25730c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o0[] f25731d;

    static {
        o0 o0Var = new o0("IsPlacedInLookahead", 0);
        f25728a = o0Var;
        o0 o0Var2 = new o0("IsPlacedInApproach", 1);
        f25729b = o0Var2;
        o0 o0Var3 = new o0("IsNotPlaced", 2);
        f25730c = o0Var3;
        f25731d = new o0[]{o0Var, o0Var2, o0Var3};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f25731d.clone();
    }
}
