package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f34401a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f34402b;

    /* renamed from: c, reason: collision with root package name */
    public static final w f34403c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f34404d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f34405e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f34406f;
    public static final /* synthetic */ w[] g;

    static {
        w wVar = new w("NOT_REQUIRED", 0);
        f34401a = wVar;
        w wVar2 = new w("CONNECTED", 1);
        f34402b = wVar2;
        w wVar3 = new w("UNMETERED", 2);
        f34403c = wVar3;
        w wVar4 = new w("NOT_ROAMING", 3);
        f34404d = wVar4;
        w wVar5 = new w("METERED", 4);
        f34405e = wVar5;
        w wVar6 = new w("TEMPORARILY_UNMETERED", 5);
        f34406f = wVar6;
        g = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) g.clone();
    }
}
