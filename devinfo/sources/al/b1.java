package al;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f483a;

    /* renamed from: b, reason: collision with root package name */
    public static final b1 f484b;

    /* renamed from: c, reason: collision with root package name */
    public static final b1 f485c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b1[] f486d;

    static {
        b1 b1Var = new b1("START", 0);
        f483a = b1Var;
        b1 b1Var2 = new b1("STOP", 1);
        f484b = b1Var2;
        b1 b1Var3 = new b1("STOP_AND_RESET_REPLAY_CACHE", 2);
        f485c = b1Var3;
        f486d = new b1[]{b1Var, b1Var2, b1Var3};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f486d.clone();
    }
}
