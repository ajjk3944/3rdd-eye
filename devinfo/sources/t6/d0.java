package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f34331a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f34332b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d0[] f34333c;

    static {
        d0 d0Var = new d0("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f34331a = d0Var;
        d0 d0Var2 = new d0("DROP_WORK_REQUEST", 1);
        f34332b = d0Var2;
        f34333c = new d0[]{d0Var, d0Var2};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f34333c.clone();
    }
}
