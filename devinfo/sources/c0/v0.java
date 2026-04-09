package c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f2516a;

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f2517b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v0[] f2518c;

    static {
        v0 v0Var = new v0("Default", 0);
        f2516a = v0Var;
        v0 v0Var2 = new v0("UserInput", 1);
        f2517b = v0Var2;
        f2518c = new v0[]{v0Var, v0Var2, new v0("PreventUserInput", 2)};
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) f2518c.clone();
    }
}
