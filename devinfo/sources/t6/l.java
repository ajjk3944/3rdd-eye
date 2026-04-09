package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f34379a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l[] f34380b;

    /* JADX INFO: Fake field, exist only in values array */
    l EF0;

    static {
        l lVar = new l("REPLACE", 0);
        l lVar2 = new l("KEEP", 1);
        f34379a = lVar2;
        f34380b = new l[]{lVar, lVar2, new l("APPEND", 2), new l("APPEND_OR_REPLACE", 3)};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f34380b.clone();
    }
}
