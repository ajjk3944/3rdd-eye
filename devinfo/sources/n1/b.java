package n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f29510a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f29511b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f29512c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f29513d;

    static {
        b bVar = new b("None", 0);
        f29510a = bVar;
        b bVar2 = new b("Cancelled", 1);
        f29511b = bVar2;
        b bVar3 = new b("Redirected", 2);
        f29512c = bVar3;
        f29513d = new b[]{bVar, bVar2, bVar3, new b("RedirectCancelled", 3)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f29513d.clone();
    }
}
