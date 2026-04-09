package qf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f32298a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f32299b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f32300c;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        f32298a = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        f32299b = dVar2;
        f32300c = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f32300c.clone();
    }
}
