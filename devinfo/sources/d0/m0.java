package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f21787a;

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f21788b;

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f21789c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m0[] f21790d;

    static {
        m0 m0Var = new m0("Yes", 0);
        f21787a = m0Var;
        m0 m0Var2 = new m0("No", 1);
        f21788b = m0Var2;
        m0 m0Var3 = new m0("NotInitialized", 2);
        f21789c = m0Var3;
        f21790d = new m0[]{m0Var, m0Var2, m0Var3};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f21790d.clone();
    }
}
