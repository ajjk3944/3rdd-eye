package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f21662a;

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f21663b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a1[] f21664c;

    static {
        a1 a1Var = new a1("Vertical", 0);
        f21662a = a1Var;
        a1 a1Var2 = new a1("Horizontal", 1);
        f21663b = a1Var2;
        f21664c = new a1[]{a1Var, a1Var2};
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f21664c.clone();
    }
}
