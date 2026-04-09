package n0;

/* renamed from: n0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6862g {

    /* renamed from: a, reason: collision with root package name */
    public static final C6862g f54113a = new C6862g();

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f54114b;

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f54115c;

    /* renamed from: d, reason: collision with root package name */
    private static final y f54116d;

    /* renamed from: e, reason: collision with root package name */
    private static final y f54117e;

    /* renamed from: f, reason: collision with root package name */
    private static final x f54118f;

    /* renamed from: g, reason: collision with root package name */
    private static final x f54119g;

    /* renamed from: h, reason: collision with root package name */
    private static final x f54120h;

    /* renamed from: i, reason: collision with root package name */
    private static final x f54121i;

    /* renamed from: j, reason: collision with root package name */
    private static final x f54122j;

    /* renamed from: k, reason: collision with root package name */
    private static final x f54123k;

    /* renamed from: l, reason: collision with root package name */
    private static final x f54124l;

    /* renamed from: m, reason: collision with root package name */
    private static final x f54125m;

    /* renamed from: n, reason: collision with root package name */
    private static final x f54126n;

    /* renamed from: o, reason: collision with root package name */
    private static final x f54127o;

    /* renamed from: p, reason: collision with root package name */
    private static final x f54128p;

    /* renamed from: q, reason: collision with root package name */
    private static final x f54129q;

    /* renamed from: r, reason: collision with root package name */
    private static final x f54130r;

    /* renamed from: s, reason: collision with root package name */
    private static final x f54131s;

    /* renamed from: t, reason: collision with root package name */
    private static final AbstractC6858c f54132t;

    /* renamed from: u, reason: collision with root package name */
    private static final AbstractC6858c f54133u;

    /* renamed from: v, reason: collision with root package name */
    private static final x f54134v;

    /* renamed from: w, reason: collision with root package name */
    private static final AbstractC6858c f54135w;

    /* renamed from: x, reason: collision with root package name */
    private static final AbstractC6858c[] f54136x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f54114b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f54115c = fArr2;
        y yVar = new y(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f54116d = yVar;
        y yVar2 = new y(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f54117e = yVar2;
        k kVar = k.f54148a;
        x xVar = new x("sRGB IEC61966-2.1", fArr, kVar.e(), yVar, 0);
        f54118f = xVar;
        x xVar2 = new x("sRGB IEC61966-2.1 (Linear)", fArr, kVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f54119g = xVar2;
        x xVar3 = new x("scRGB-nl IEC 61966-2-2:2003", fArr, kVar.e(), null, new InterfaceC6865j() { // from class: n0.e
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return C6862g.c(d10);
            }
        }, new InterfaceC6865j() { // from class: n0.f
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return C6862g.d(d10);
            }
        }, -0.799f, 2.399f, yVar, 2);
        f54120h = xVar3;
        x xVar4 = new x("scRGB IEC 61966-2-2:2003", fArr, kVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f54121i = xVar4;
        x xVar5 = new x("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, kVar.e(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f54122j = xVar5;
        x xVar6 = new x("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, kVar.e(), new y(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f54123k = xVar6;
        x xVar7 = new x("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new z(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f54124l = xVar7;
        x xVar8 = new x("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, kVar.e(), yVar, 7);
        f54125m = xVar8;
        x xVar9 = new x("NTSC (1953)", fArr2, kVar.a(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f54126n = xVar9;
        x xVar10 = new x("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, kVar.e(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f54127o = xVar10;
        x xVar11 = new x("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, kVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f54128p = xVar11;
        x xVar12 = new x("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, kVar.b(), new y(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f54129q = xVar12;
        x xVar13 = new x("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f54130r = xVar13;
        x xVar14 = new x("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f54131s = xVar14;
        C6855A c6855a = new C6855A("Generic XYZ", 14);
        f54132t = c6855a;
        l lVar = new l("Generic L*a*b*", 15);
        f54133u = lVar;
        x xVar15 = new x("None", fArr, kVar.e(), yVar2, 16);
        f54134v = xVar15;
        m mVar = new m("Oklab", 17);
        f54135w = mVar;
        f54136x = new AbstractC6858c[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, c6855a, lVar, xVar15, mVar};
    }

    private C6862g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(double d10) {
        return AbstractC6859d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d10) {
        return AbstractC6859d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final x e() {
        return f54130r;
    }

    public final x f() {
        return f54131s;
    }

    public final x g() {
        return f54128p;
    }

    public final x h() {
        return f54123k;
    }

    public final x i() {
        return f54122j;
    }

    public final AbstractC6858c j() {
        return f54133u;
    }

    public final AbstractC6858c k() {
        return f54132t;
    }

    public final AbstractC6858c[] l() {
        return f54136x;
    }

    public final x m() {
        return f54124l;
    }

    public final x n() {
        return f54125m;
    }

    public final x o() {
        return f54120h;
    }

    public final x p() {
        return f54121i;
    }

    public final x q() {
        return f54119g;
    }

    public final x r() {
        return f54126n;
    }

    public final float[] s() {
        return f54115c;
    }

    public final AbstractC6858c t() {
        return f54135w;
    }

    public final x u() {
        return f54129q;
    }

    public final x v() {
        return f54127o;
    }

    public final x w() {
        return f54118f;
    }

    public final float[] x() {
        return f54114b;
    }

    public final x y() {
        return f54134v;
    }
}
