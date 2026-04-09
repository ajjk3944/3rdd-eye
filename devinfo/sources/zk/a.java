package zk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38322a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f38323b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f38324c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f38325d;

    static {
        a aVar = new a("SUSPEND", 0);
        f38322a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f38323b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f38324c = aVar3;
        f38325d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f38325d.clone();
    }
}
