package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f1499a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ s0[] f1500b;

    static {
        s0 s0Var = new s0("ALLOW", 0);
        f1499a = s0Var;
        f1500b = new s0[]{s0Var, new s0("PREVENT_WHEN_EMPTY", 1), new s0("PREVENT", 2)};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f1500b.clone();
    }
}
