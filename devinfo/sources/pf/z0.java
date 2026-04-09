package pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f31930a;

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f31931b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z0[] f31932c;

    static {
        z0 z0Var = new z0("GENERAL", 0);
        f31930a = z0Var;
        z0 z0Var2 = new z0("FALLBACK", 1);
        f31931b = z0Var2;
        f31932c = new z0[]{z0Var, z0Var2};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f31932c.clone();
    }
}
