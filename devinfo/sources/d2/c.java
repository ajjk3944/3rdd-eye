package d2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f21941a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f21942b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f21943c;

    static {
        c cVar = new c("Lsq2", 0);
        f21941a = cVar;
        c cVar2 = new c("Impulse", 1);
        f21942b = cVar2;
        f21943c = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f21943c.clone();
    }
}
