package th;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f34631a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f34632b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f34633c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f34634d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f34635e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f34636f;
    public static final /* synthetic */ l[] g;

    static {
        l lVar = new l("NAME_ASC", 0);
        f34631a = lVar;
        l lVar2 = new l("NAME_DESC", 1);
        f34632b = lVar2;
        l lVar3 = new l("APK_SIZE_ASC", 2);
        f34633c = lVar3;
        l lVar4 = new l("APK_SIZE_DESC", 3);
        f34634d = lVar4;
        l lVar5 = new l("UPDATE_TIME_ASC", 4);
        f34635e = lVar5;
        l lVar6 = new l("UPDATE_TIME_DESC", 5);
        f34636f = lVar6;
        g = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) g.clone();
    }
}
