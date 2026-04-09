package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f25567a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f25568b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f25569c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f25570d;

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f25571e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a0[] f25572f;

    static {
        a0 a0Var = new a0("Measuring", 0);
        f25567a = a0Var;
        a0 a0Var2 = new a0("LookaheadMeasuring", 1);
        f25568b = a0Var2;
        a0 a0Var3 = new a0("LayingOut", 2);
        f25569c = a0Var3;
        a0 a0Var4 = new a0("LookaheadLayingOut", 3);
        f25570d = a0Var4;
        a0 a0Var5 = new a0("Idle", 4);
        f25571e = a0Var5;
        f25572f = new a0[]{a0Var, a0Var2, a0Var3, a0Var4, a0Var5};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f25572f.clone();
    }
}
