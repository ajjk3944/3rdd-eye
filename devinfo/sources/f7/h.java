package f7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f23738a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f23739b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f23740c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f23741d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f23742e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f23743f;
    public static final /* synthetic */ h[] g;

    static {
        h hVar = new h("SET_ANIMATION", 0);
        f23738a = hVar;
        h hVar2 = new h("SET_PROGRESS", 1);
        f23739b = hVar2;
        h hVar3 = new h("SET_REPEAT_MODE", 2);
        f23740c = hVar3;
        h hVar4 = new h("SET_REPEAT_COUNT", 3);
        f23741d = hVar4;
        h hVar5 = new h("SET_IMAGE_ASSETS", 4);
        f23742e = hVar5;
        h hVar6 = new h("PLAY_OPTION", 5);
        f23743f = hVar6;
        g = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) g.clone();
    }
}
