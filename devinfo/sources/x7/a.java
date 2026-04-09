package x7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36993a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f36994b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f36995c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f36996d;

    static {
        a aVar = new a("PREFER_ARGB_8888", 0);
        f36993a = aVar;
        a aVar2 = new a("PREFER_RGB_565", 1);
        f36994b = aVar2;
        f36996d = new a[]{aVar, aVar2};
        f36995c = aVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f36996d.clone();
    }
}
