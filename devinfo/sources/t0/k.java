package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f33995a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f33996b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f33997c;

    /* JADX INFO: Fake field, exist only in values array */
    k EF0;

    static {
        k kVar = new k("CornerExtraExtraLarge", 0);
        k kVar2 = new k("CornerExtraLarge", 1);
        k kVar3 = new k("CornerExtraLargeIncreased", 2);
        k kVar4 = new k("CornerExtraLargeTop", 3);
        k kVar5 = new k("CornerExtraSmall", 4);
        k kVar6 = new k("CornerExtraSmallTop", 5);
        k kVar7 = new k("CornerFull", 6);
        f33995a = kVar7;
        k kVar8 = new k("CornerLarge", 7);
        k kVar9 = new k("CornerLargeEnd", 8);
        k kVar10 = new k("CornerLargeIncreased", 9);
        k kVar11 = new k("CornerLargeStart", 10);
        k kVar12 = new k("CornerLargeTop", 11);
        k kVar13 = new k("CornerMedium", 12);
        f33996b = kVar13;
        f33997c = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, new k("CornerNone", 13), new k("CornerSmall", 14)};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f33997c.clone();
    }
}
