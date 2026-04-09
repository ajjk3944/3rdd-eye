package d3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f21966a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f21967b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f21968c;

    static {
        l lVar = new l("Ltr", 0);
        f21966a = lVar;
        l lVar2 = new l("Rtl", 1);
        f21967b = lVar2;
        f21968c = new l[]{lVar, lVar2};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f21968c.clone();
    }
}
