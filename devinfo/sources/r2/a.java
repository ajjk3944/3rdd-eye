package r2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32728a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f32729b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f32730c;

    static {
        a aVar = new a("On", 0);
        f32728a = aVar;
        a aVar2 = new a("Off", 1);
        f32729b = aVar2;
        f32730c = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f32730c.clone();
    }
}
