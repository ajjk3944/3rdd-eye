package n9;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public p9.d f29835f;

    /* renamed from: l, reason: collision with root package name */
    public int f29839l;

    /* renamed from: m, reason: collision with root package name */
    public int f29840m;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f29845r;
    public int g = -7829368;

    /* renamed from: h, reason: collision with root package name */
    public float f29836h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f29837i = -7829368;
    public final float j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float[] f29838k = new float[0];

    /* renamed from: n, reason: collision with root package name */
    public int f29841n = 6;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29842o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29843p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29844q = true;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f29846s = true;

    /* renamed from: t, reason: collision with root package name */
    public float f29847t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f29848u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f29849v = 0.0f;

    public a() {
        this.f29853d = w9.g.c(10.0f);
        this.f29851b = w9.g.c(5.0f);
        this.f29852c = w9.g.c(5.0f);
        this.f29845r = new ArrayList();
    }

    public void a(float f10, float f11) {
        float f12 = f10 - 0.0f;
        float f13 = f11 + 0.0f;
        if (Math.abs(f13 - f12) == 0.0f) {
            f13 += 1.0f;
            f12 -= 1.0f;
        }
        this.f29848u = f12;
        this.f29847t = f13;
        this.f29849v = Math.abs(f13 - f12);
    }

    public final String b() {
        int i4 = 0;
        String str = "";
        while (true) {
            float[] fArr = this.f29838k;
            if (i4 >= fArr.length) {
                return str;
            }
            String strA = (i4 < 0 || i4 >= fArr.length) ? "" : c().a(this.f29838k[i4]);
            if (strA != null && str.length() < strA.length()) {
                str = strA;
            }
            i4++;
        }
    }

    public final p9.d c() {
        p9.d dVar = this.f29835f;
        if (dVar == null || ((dVar instanceof p9.a) && ((p9.a) dVar).f31506b != this.f29840m)) {
            int i4 = this.f29840m;
            p9.a aVar = new p9.a();
            aVar.f31506b = i4;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < i4; i10++) {
                if (i10 == 0) {
                    stringBuffer.append(".");
                }
                stringBuffer.append("0");
            }
            aVar.f31505a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
            this.f29835f = aVar;
        }
        return this.f29835f;
    }
}
