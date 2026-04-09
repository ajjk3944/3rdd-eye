package B5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f766a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f767b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("SUSPEND", 0);
        a aVar2 = new a("DROP_OLDEST", 1);
        f766a = aVar2;
        f767b = new a[]{aVar, aVar2, new a("DROP_LATEST", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f767b.clone();
    }
}
