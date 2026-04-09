package G5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1689a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1690b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f1691c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f1692d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1693e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f1694f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f1689a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f1690b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f1691c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f1692d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f1693e = bVar5;
        f1694f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1694f.clone();
    }
}
