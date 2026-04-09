package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f5282a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ F[] f5283b;

    static {
        F f2 = new F("ALLOW", 0);
        f5282a = f2;
        f5283b = new F[]{f2, new F("PREVENT_WHEN_EMPTY", 1), new F("PREVENT", 2)};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f5283b.clone();
    }
}
