package ba;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2090a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f2091b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f2092c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f2093d;

    static {
        c cVar = new c("DEFAULT", 0);
        f2090a = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        f2091b = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f2092c = cVar3;
        f2093d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2093d.clone();
    }
}
