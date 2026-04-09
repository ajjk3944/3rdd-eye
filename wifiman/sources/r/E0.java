package r;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC7020k;
import o.AbstractC7022m;

/* loaded from: classes.dex */
public final class E0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7020k f59455a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7022m f59456b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59457c;

    /* renamed from: d, reason: collision with root package name */
    private final int f59458d;

    /* renamed from: e, reason: collision with root package name */
    private final E f59459e;

    /* renamed from: f, reason: collision with root package name */
    private final int f59460f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f59461g;

    /* renamed from: h, reason: collision with root package name */
    private float[] f59462h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC7542q f59463i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC7542q f59464j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC7542q f59465k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC7542q f59466l;

    /* renamed from: m, reason: collision with root package name */
    private float[] f59467m;

    /* renamed from: n, reason: collision with root package name */
    private float[] f59468n;

    /* renamed from: o, reason: collision with root package name */
    private C7545u f59469o;

    public /* synthetic */ E0(AbstractC7020k abstractC7020k, AbstractC7022m abstractC7022m, int i10, int i11, E e10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7020k, abstractC7022m, i10, i11, e10, i12);
    }

    private final int h(int i10) {
        int iB = Q.b(this.f59455a, i10, 0, 0, 6, null);
        return iB < -1 ? -(iB + 2) : iB;
    }

    private final float i(int i10) {
        return j(h(i10), i10, false);
    }

    private final float j(int i10, int i11, boolean z10) {
        E eB;
        float f10;
        AbstractC7020k abstractC7020k = this.f59455a;
        if (i10 >= abstractC7020k.f54979b - 1) {
            f10 = i11;
        } else {
            int iA = abstractC7020k.a(i10);
            int iA2 = this.f59455a.a(i10 + 1);
            if (i11 == iA) {
                f10 = iA;
            } else {
                int i12 = iA2 - iA;
                D0 d02 = (D0) this.f59456b.c(iA);
                if (d02 == null || (eB = d02.b()) == null) {
                    eB = this.f59459e;
                }
                float f11 = i12;
                float fA = eB.a((i11 - iA) / f11);
                if (z10) {
                    return fA;
                }
                f10 = (f11 * fA) + iA;
            }
        }
        return f10 / 1000;
    }

    private final void k(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        float[] fArr;
        float[] fArr2;
        boolean z10 = this.f59469o != null;
        if (this.f59463i == null) {
            this.f59463i = r.g(abstractC7542q);
            this.f59464j = r.g(abstractC7542q3);
            int iB = this.f59455a.b();
            float[] fArr3 = new float[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                fArr3[i10] = this.f59455a.a(i10) / 1000;
            }
            this.f59462h = fArr3;
            int iB2 = this.f59455a.b();
            int[] iArr = new int[iB2];
            for (int i11 = 0; i11 < iB2; i11++) {
                D0 d02 = (D0) this.f59456b.c(this.f59455a.a(i11));
                int iA = d02 != null ? d02.a() : this.f59460f;
                if (!AbstractC7544t.c(iA, AbstractC7544t.f59860a.a())) {
                    z10 = true;
                }
                iArr[i11] = iA;
            }
            this.f59461g = iArr;
        }
        if (z10) {
            float[] fArr4 = null;
            if (this.f59469o != null) {
                AbstractC7542q abstractC7542q4 = this.f59465k;
                if (abstractC7542q4 == null) {
                    AbstractC6492s.v("lastInitialValue");
                    abstractC7542q4 = null;
                }
                if (AbstractC6492s.d(abstractC7542q4, abstractC7542q)) {
                    AbstractC7542q abstractC7542q5 = this.f59466l;
                    if (abstractC7542q5 == null) {
                        AbstractC6492s.v("lastTargetValue");
                        abstractC7542q5 = null;
                    }
                    if (AbstractC6492s.d(abstractC7542q5, abstractC7542q2)) {
                        return;
                    }
                }
            }
            this.f59465k = abstractC7542q;
            this.f59466l = abstractC7542q2;
            int iB3 = (abstractC7542q.b() % 2) + abstractC7542q.b();
            this.f59467m = new float[iB3];
            this.f59468n = new float[iB3];
            int iB4 = this.f59455a.b();
            float[][] fArr5 = new float[iB4][];
            for (int i12 = 0; i12 < iB4; i12++) {
                int iA2 = this.f59455a.a(i12);
                if (iA2 != 0) {
                    if (iA2 != g()) {
                        fArr = new float[iB3];
                        Object objC = this.f59456b.c(iA2);
                        AbstractC6492s.f(objC);
                        AbstractC7542q abstractC7542qC = ((D0) objC).c();
                        for (int i13 = 0; i13 < iB3; i13++) {
                            fArr[i13] = abstractC7542qC.a(i13);
                        }
                    } else if (this.f59456b.a(iA2)) {
                        fArr = new float[iB3];
                        Object objC2 = this.f59456b.c(iA2);
                        AbstractC6492s.f(objC2);
                        AbstractC7542q abstractC7542qC2 = ((D0) objC2).c();
                        for (int i14 = 0; i14 < iB3; i14++) {
                            fArr[i14] = abstractC7542qC2.a(i14);
                        }
                    } else {
                        fArr2 = new float[iB3];
                        for (int i15 = 0; i15 < iB3; i15++) {
                            fArr2[i15] = abstractC7542q2.a(i15);
                        }
                    }
                    fArr2 = fArr;
                } else if (this.f59456b.a(iA2)) {
                    fArr = new float[iB3];
                    Object objC3 = this.f59456b.c(iA2);
                    AbstractC6492s.f(objC3);
                    AbstractC7542q abstractC7542qC3 = ((D0) objC3).c();
                    for (int i16 = 0; i16 < iB3; i16++) {
                        fArr[i16] = abstractC7542qC3.a(i16);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[iB3];
                    for (int i17 = 0; i17 < iB3; i17++) {
                        fArr2[i17] = abstractC7542q.a(i17);
                    }
                }
                fArr5[i12] = fArr2;
            }
            int[] iArr2 = this.f59461g;
            if (iArr2 == null) {
                AbstractC6492s.v("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.f59462h;
            if (fArr6 == null) {
                AbstractC6492s.v("times");
            } else {
                fArr4 = fArr6;
            }
            this.f59469o = new C7545u(iArr2, fArr4, fArr5);
        }
    }

    @Override // r.v0
    public AbstractC7542q c(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        int iB = (int) w0.b(this, j10 / 1000000);
        if (this.f59456b.a(iB)) {
            Object objC = this.f59456b.c(iB);
            AbstractC6492s.f(objC);
            return ((D0) objC).c();
        }
        if (iB >= g()) {
            return abstractC7542q2;
        }
        if (iB <= 0) {
            return abstractC7542q;
        }
        k(abstractC7542q, abstractC7542q2, abstractC7542q3);
        int i10 = 0;
        if (this.f59469o == null) {
            int iH = h(iB);
            float fJ = j(iH, iB, true);
            int iA = this.f59455a.a(iH);
            if (this.f59456b.a(iA)) {
                Object objC2 = this.f59456b.c(iA);
                AbstractC6492s.f(objC2);
                abstractC7542q = ((D0) objC2).c();
            }
            int iA2 = this.f59455a.a(iH + 1);
            if (this.f59456b.a(iA2)) {
                Object objC3 = this.f59456b.c(iA2);
                AbstractC6492s.f(objC3);
                abstractC7542q2 = ((D0) objC3).c();
            }
            AbstractC7542q abstractC7542q4 = this.f59463i;
            if (abstractC7542q4 == null) {
                AbstractC6492s.v("valueVector");
                abstractC7542q4 = null;
            }
            int iB2 = abstractC7542q4.b();
            while (i10 < iB2) {
                AbstractC7542q abstractC7542q5 = this.f59463i;
                if (abstractC7542q5 == null) {
                    AbstractC6492s.v("valueVector");
                    abstractC7542q5 = null;
                }
                abstractC7542q5.e(i10, u0.k(abstractC7542q.a(i10), abstractC7542q2.a(i10), fJ));
                i10++;
            }
            AbstractC7542q abstractC7542q6 = this.f59463i;
            if (abstractC7542q6 != null) {
                return abstractC7542q6;
            }
            AbstractC6492s.v("valueVector");
            return null;
        }
        float fI = i(iB);
        C7545u c7545u = this.f59469o;
        if (c7545u == null) {
            AbstractC6492s.v("arcSpline");
            c7545u = null;
        }
        float[] fArr = this.f59467m;
        if (fArr == null) {
            AbstractC6492s.v("posArray");
            fArr = null;
        }
        c7545u.a(fI, fArr);
        float[] fArr2 = this.f59467m;
        if (fArr2 == null) {
            AbstractC6492s.v("posArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i10 < length) {
            AbstractC7542q abstractC7542q7 = this.f59463i;
            if (abstractC7542q7 == null) {
                AbstractC6492s.v("valueVector");
                abstractC7542q7 = null;
            }
            float[] fArr3 = this.f59467m;
            if (fArr3 == null) {
                AbstractC6492s.v("posArray");
                fArr3 = null;
            }
            abstractC7542q7.e(i10, fArr3[i10]);
            i10++;
        }
        AbstractC7542q abstractC7542q8 = this.f59463i;
        if (abstractC7542q8 != null) {
            return abstractC7542q8;
        }
        AbstractC6492s.v("valueVector");
        return null;
    }

    @Override // r.y0
    public int e() {
        return this.f59458d;
    }

    @Override // r.v0
    public AbstractC7542q f(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        long jB = w0.b(this, j10 / 1000000);
        if (jB < 0) {
            return abstractC7542q3;
        }
        k(abstractC7542q, abstractC7542q2, abstractC7542q3);
        int i10 = 0;
        if (this.f59469o == null) {
            AbstractC7542q abstractC7542qD = w0.d(this, jB - 1, abstractC7542q, abstractC7542q2, abstractC7542q3);
            AbstractC7542q abstractC7542qD2 = w0.d(this, jB, abstractC7542q, abstractC7542q2, abstractC7542q3);
            int iB = abstractC7542qD.b();
            while (i10 < iB) {
                AbstractC7542q abstractC7542q4 = this.f59464j;
                if (abstractC7542q4 == null) {
                    AbstractC6492s.v("velocityVector");
                    abstractC7542q4 = null;
                }
                abstractC7542q4.e(i10, (abstractC7542qD.a(i10) - abstractC7542qD2.a(i10)) * 1000.0f);
                i10++;
            }
            AbstractC7542q abstractC7542q5 = this.f59464j;
            if (abstractC7542q5 != null) {
                return abstractC7542q5;
            }
            AbstractC6492s.v("velocityVector");
            return null;
        }
        float fI = i((int) jB);
        C7545u c7545u = this.f59469o;
        if (c7545u == null) {
            AbstractC6492s.v("arcSpline");
            c7545u = null;
        }
        float[] fArr = this.f59468n;
        if (fArr == null) {
            AbstractC6492s.v("slopeArray");
            fArr = null;
        }
        c7545u.b(fI, fArr);
        float[] fArr2 = this.f59468n;
        if (fArr2 == null) {
            AbstractC6492s.v("slopeArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i10 < length) {
            AbstractC7542q abstractC7542q6 = this.f59464j;
            if (abstractC7542q6 == null) {
                AbstractC6492s.v("velocityVector");
                abstractC7542q6 = null;
            }
            float[] fArr3 = this.f59468n;
            if (fArr3 == null) {
                AbstractC6492s.v("slopeArray");
                fArr3 = null;
            }
            abstractC7542q6.e(i10, fArr3[i10]);
            i10++;
        }
        AbstractC7542q abstractC7542q7 = this.f59464j;
        if (abstractC7542q7 != null) {
            return abstractC7542q7;
        }
        AbstractC6492s.v("velocityVector");
        return null;
    }

    @Override // r.y0
    public int g() {
        return this.f59457c;
    }

    private E0(AbstractC7020k abstractC7020k, AbstractC7022m abstractC7022m, int i10, int i11, E e10, int i12) {
        this.f59455a = abstractC7020k;
        this.f59456b = abstractC7022m;
        this.f59457c = i10;
        this.f59458d = i11;
        this.f59459e = e10;
        this.f59460f = i12;
    }
}
