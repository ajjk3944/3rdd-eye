package el;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23546a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f23547b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f23548c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f23549d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f23550e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f23551f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f23546a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f23547b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f23548c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f23549d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f23550e = bVar5;
        f23551f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f23551f.clone();
    }
}
