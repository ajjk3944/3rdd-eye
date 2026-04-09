package f7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23689a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f23690b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f23691c;

    static {
        a aVar = new a("AUTOMATIC", 0);
        f23689a = aVar;
        a aVar2 = new a("ENABLED", 1);
        f23690b = aVar2;
        f23691c = new a[]{aVar, aVar2, new a("DISABLED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f23691c.clone();
    }
}
