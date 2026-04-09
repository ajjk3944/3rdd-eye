package k1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27781a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f27782b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f27783c;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        f27781a = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        f27782b = aVar2;
        f27783c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f27783c.clone();
    }
}
