package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y1 f25816a;

    /* renamed from: b, reason: collision with root package name */
    public static final y1 f25817b;

    /* renamed from: c, reason: collision with root package name */
    public static final y1 f25818c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y1[] f25819d;

    static {
        y1 y1Var = new y1("ContinueTraversal", 0);
        f25816a = y1Var;
        y1 y1Var2 = new y1("SkipSubtreeAndContinueTraversal", 1);
        f25817b = y1Var2;
        y1 y1Var3 = new y1("CancelTraversal", 2);
        f25818c = y1Var3;
        f25819d = new y1[]{y1Var, y1Var2, y1Var3};
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) f25819d.clone();
    }
}
