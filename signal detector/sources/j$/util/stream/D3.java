package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class D3 {
    public static final D3 MAYBE_MORE;
    public static final D3 NO_MORE;
    public static final D3 UNLIMITED;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ D3[] f20845a;

    static {
        D3 d32 = new D3("NO_MORE", 0);
        NO_MORE = d32;
        D3 d33 = new D3("MAYBE_MORE", 1);
        MAYBE_MORE = d33;
        D3 d34 = new D3("UNLIMITED", 2);
        UNLIMITED = d34;
        f20845a = new D3[]{d32, d33, d34};
    }

    public static D3 valueOf(String str) {
        return (D3) Enum.valueOf(D3.class, str);
    }

    public static D3[] values() {
        return (D3[]) f20845a.clone();
    }
}
