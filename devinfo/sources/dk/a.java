package dk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22275a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f22276b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f22277c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f22278d;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f22275a = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f22276b = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f22277c = aVar3;
        f22278d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f22278d.clone();
    }
}
