package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f24401a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f24402b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r[] f24403c;

    static {
        r rVar = new r("Min", 0);
        f24401a = rVar;
        r rVar2 = new r("Max", 1);
        f24402b = rVar2;
        f24403c = new r[]{rVar, rVar2};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f24403c.clone();
    }
}
