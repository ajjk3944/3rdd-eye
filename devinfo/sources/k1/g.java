package k1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f27809a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f27810b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f27811c;

    static {
        g gVar = new g("VIEW_APPEAR", 0);
        f27809a = gVar;
        g gVar2 = new g("VIEW_DISAPPEAR", 1);
        f27810b = gVar2;
        f27811c = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f27811c.clone();
    }
}
