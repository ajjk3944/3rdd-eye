package c3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2719a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f2720b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f2721c;

    static {
        j jVar = new j("Ltr", 0);
        f2719a = jVar;
        j jVar2 = new j("Rtl", 1);
        f2720b = jVar2;
        f2721c = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f2721c.clone();
    }
}
