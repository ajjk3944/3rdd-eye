package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f25587a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f25588b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f25589c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c0[] f25590d;

    static {
        c0 c0Var = new c0("InMeasureBlock", 0);
        f25587a = c0Var;
        c0 c0Var2 = new c0("InLayoutBlock", 1);
        f25588b = c0Var2;
        c0 c0Var3 = new c0("NotUsed", 2);
        f25589c = c0Var3;
        f25590d = new c0[]{c0Var, c0Var2, c0Var3};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f25590d.clone();
    }
}
