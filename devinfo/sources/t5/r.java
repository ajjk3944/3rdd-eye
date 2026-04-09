package t5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f34275a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f34276b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f34277c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r[] f34278d;

    static {
        r rVar = new r("AUTOMATIC", 0);
        f34275a = rVar;
        r rVar2 = new r("TRUNCATE", 1);
        f34276b = rVar2;
        r rVar3 = new r("WRITE_AHEAD_LOGGING", 2);
        f34277c = rVar3;
        f34278d = new r[]{rVar, rVar2, rVar3};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f34278d.clone();
    }
}
