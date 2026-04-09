package zd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38238a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f38239b;

    static {
        a aVar = new a("GRANTED", 0);
        f38238a = aVar;
        f38239b = new a[]{aVar, new a("DENIED", 1)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f38239b.clone();
    }
}
