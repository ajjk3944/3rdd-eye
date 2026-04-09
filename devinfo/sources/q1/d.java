package q1;

import pf.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f32076a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f32077b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f32078c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f32079d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f32080e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f32081f;
    public static final q g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f32082h;

    /* renamed from: i, reason: collision with root package name */
    public static final q f32083i;
    public static final q j;

    /* renamed from: k, reason: collision with root package name */
    public static final q f32084k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f32085l;

    /* renamed from: m, reason: collision with root package name */
    public static final q f32086m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f32087n;

    /* renamed from: o, reason: collision with root package name */
    public static final q f32088o;

    /* renamed from: p, reason: collision with root package name */
    public static final q f32089p;

    /* renamed from: q, reason: collision with root package name */
    public static final q f32090q;

    /* renamed from: r, reason: collision with root package name */
    public static final q f32091r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f32092s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f32093t;

    /* renamed from: u, reason: collision with root package name */
    public static final q f32094u;

    /* renamed from: v, reason: collision with root package name */
    public static final q f32095v;

    /* renamed from: w, reason: collision with root package name */
    public static final q f32096w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f32097x;

    /* renamed from: y, reason: collision with root package name */
    public static final c[] f32098y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f32076a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f32077b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f32078c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f32079d = rVar4;
        s sVar = j.f32109d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f32080e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f32081f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new u(1), new u(2), -0.799f, 2.399f, rVar, 2);
        g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f32082h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f32083i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f32084k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f32085l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f32106a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f32086m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f32087n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f32088o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f32107b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f32089p = qVar12;
        s sVar2 = j.f32108c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f32090q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f32091r = qVar14;
        k kVar = new k(14, b.f32069b, 1, "Generic XYZ");
        f32092s = kVar;
        long j8 = b.f32070c;
        k kVar2 = new k(15, j8, 0, "Generic L*a*b*");
        f32093t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f32094u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new u(3), new u(4), 0.0f, 1.0f, rVar3, 17);
        f32095v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new u(5), new u(6), 0.0f, 1.0f, rVar4, 18);
        f32096w = qVar17;
        l lVar = new l(19, j8, "Oklab");
        f32097x = lVar;
        f32098y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    public static double a(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = rVar.f32137b;
        double d14 = rVar.f32138c;
        double d15 = rVar.f32139d;
        double d16 = rVar.f32140e;
        double d17 = rVar.f32141f;
        double d18 = d13 * d12;
        return (rVar.g + 1.0d) * d11 * (d18 <= 1.0d ? Math.pow(d18, d14) : Math.exp((d12 - d17) * d15) + d16);
    }

    public static double b(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = 1.0d / rVar.f32137b;
        double d13 = 1.0d / rVar.f32138c;
        double d14 = 1.0d / rVar.f32139d;
        double d15 = rVar.f32140e;
        double d16 = rVar.f32141f;
        double d17 = (d10 * d11) / (rVar.g + 1.0d);
        return d11 * (d17 <= 1.0d ? Math.pow(d17, d13) * d12 : (Math.log(d17 - d15) * d14) + d16);
    }

    public static double c(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = rVar.f32137b;
        double d14 = rVar.f32139d;
        double dPow = (Math.pow(d12, d14) * rVar.f32138c) + d13;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d12, d14) * rVar.f32141f) + rVar.f32140e), rVar.g) * d11;
    }

    public static double d(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -rVar.f32137b;
        double d14 = rVar.f32140e;
        double d15 = 1.0d / rVar.g;
        return Math.pow(Math.max((Math.pow(d12, d15) * d14) + d13, 0.0d) / ((Math.pow(d12, d15) * (-rVar.f32141f)) + rVar.f32138c), 1.0d / rVar.f32139d) * d11;
    }
}
