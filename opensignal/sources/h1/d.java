package h1;

import d5.v;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f9687a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f9688b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f9689c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f9690d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f9691e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f9692f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f9693g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f9694h;

    /* renamed from: i, reason: collision with root package name */
    public static final q f9695i;
    public static final q j;
    public static final q k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f9696l;

    /* renamed from: m, reason: collision with root package name */
    public static final q f9697m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f9698n;

    /* renamed from: o, reason: collision with root package name */
    public static final q f9699o;

    /* renamed from: p, reason: collision with root package name */
    public static final q f9700p;

    /* renamed from: q, reason: collision with root package name */
    public static final q f9701q;

    /* renamed from: r, reason: collision with root package name */
    public static final q f9702r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f9703s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f9704t;

    /* renamed from: u, reason: collision with root package name */
    public static final q f9705u;

    /* renamed from: v, reason: collision with root package name */
    public static final q f9706v;

    /* renamed from: w, reason: collision with root package name */
    public static final q f9707w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f9708x;

    /* renamed from: y, reason: collision with root package name */
    public static final c[] f9709y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f9687a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f9688b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f9689c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f9690d = rVar4;
        s sVar = j.f9721d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f9691e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f9692f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new v(6), new v(7), -0.799f, 2.399f, rVar, 2);
        f9693g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f9694h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f9695i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f9696l = qVar8;
        double d6 = 0.2222222222222222d;
        double d10 = 0.081d;
        double d11 = 2.2222222222222223d;
        double d12 = 0.9099181073703367d;
        double d13 = 0.09008189262966333d;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f9718a, new r(d11, d12, d13, d6, d10), 8);
        f9697m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(d11, d12, d13, d6, d10), 9);
        f9698n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f9699o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f9719b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f9700p = qVar12;
        s sVar2 = j.f9720c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f9701q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f9702r = qVar14;
        k kVar = new k("Generic XYZ", 14, b.f9680b, 1);
        f9703s = kVar;
        long j7 = b.f9681c;
        k kVar2 = new k("Generic L*a*b*", 15, j7, 0);
        f9704t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f9705u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new v(8), new v(9), 0.0f, 1.0f, rVar3, 17);
        f9706v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new v(10), new v(11), 0.0f, 1.0f, rVar4, 18);
        f9707w = qVar17;
        l lVar = new l("Oklab", 19, j7);
        f9708x = lVar;
        f9709y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    public static double a(r rVar, double d6) {
        double d10 = d6 < 0.0d ? -1.0d : 1.0d;
        double d11 = d6 * d10;
        double d12 = rVar.f9750b;
        double d13 = rVar.f9751c;
        double d14 = rVar.f9752d;
        double d15 = rVar.f9753e;
        double d16 = rVar.f9754f;
        double d17 = d12 * d11;
        return (rVar.f9755g + 1.0d) * d10 * (d17 <= 1.0d ? Math.pow(d17, d13) : Math.exp((d11 - d16) * d14) + d15);
    }

    public static double b(r rVar, double d6) {
        double d10 = d6 < 0.0d ? -1.0d : 1.0d;
        double d11 = 1.0d / rVar.f9750b;
        double d12 = 1.0d / rVar.f9751c;
        double d13 = 1.0d / rVar.f9752d;
        double d14 = rVar.f9753e;
        double d15 = rVar.f9754f;
        double d16 = (d6 * d10) / (rVar.f9755g + 1.0d);
        return d10 * (d16 <= 1.0d ? Math.pow(d16, d12) * d11 : (Math.log(d16 - d14) * d13) + d15);
    }

    public static double c(r rVar, double d6) {
        double d10 = d6 < 0.0d ? -1.0d : 1.0d;
        double d11 = d6 * d10;
        double d12 = rVar.f9750b;
        double d13 = rVar.f9752d;
        double dPow = (Math.pow(d11, d13) * rVar.f9751c) + d12;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d11, d13) * rVar.f9754f) + rVar.f9753e), rVar.f9755g) * d10;
    }

    public static double d(r rVar, double d6) {
        double d10 = d6 < 0.0d ? -1.0d : 1.0d;
        double d11 = d6 * d10;
        double d12 = -rVar.f9750b;
        double d13 = rVar.f9753e;
        double d14 = 1.0d / rVar.f9755g;
        return Math.pow(Math.max((Math.pow(d11, d14) * d13) + d12, 0.0d) / ((Math.pow(d11, d14) * (-rVar.f9754f)) + rVar.f9751c), 1.0d / rVar.f9752d) * d10;
    }
}
