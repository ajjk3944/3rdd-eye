package zd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f38240a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f38241b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f38242c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f38243d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f38244e;

    static {
        b bVar = new b("AD_STORAGE", 0);
        f38240a = bVar;
        b bVar2 = new b("ANALYTICS_STORAGE", 1);
        f38241b = bVar2;
        b bVar3 = new b("AD_USER_DATA", 2);
        f38242c = bVar3;
        b bVar4 = new b("AD_PERSONALIZATION", 3);
        f38243d = bVar4;
        f38244e = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f38244e.clone();
    }
}
