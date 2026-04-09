package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f33379a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f33380b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f33381c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f33382d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f33383e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f33384f;
    public static final g g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g[] f33385h;

    static {
        g gVar = new g("Paragraph", 0);
        f33379a = gVar;
        g gVar2 = new g("Span", 1);
        f33380b = gVar2;
        g gVar3 = new g("VerbatimTts", 2);
        f33381c = gVar3;
        g gVar4 = new g("Url", 3);
        f33382d = gVar4;
        g gVar5 = new g("Link", 4);
        f33383e = gVar5;
        g gVar6 = new g("Clickable", 5);
        f33384f = gVar6;
        g gVar7 = new g("String", 6);
        g = gVar7;
        f33385h = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f33385h.clone();
    }
}
