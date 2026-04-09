package n0;

import Zg.AbstractC3682n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import mh.InterfaceC6835l;
import org.snmp4j.smi.Counter32;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class x extends AbstractC6858c {

    /* renamed from: t, reason: collision with root package name */
    public static final a f54178t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    private static final InterfaceC6865j f54179u = new InterfaceC6865j() { // from class: n0.q
        @Override // n0.InterfaceC6865j
        public final double a(double d10) {
            return x.t(d10);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final z f54180e;

    /* renamed from: f, reason: collision with root package name */
    private final float f54181f;

    /* renamed from: g, reason: collision with root package name */
    private final float f54182g;

    /* renamed from: h, reason: collision with root package name */
    private final y f54183h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f54184i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f54185j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f54186k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC6865j f54187l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC6835l f54188m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC6865j f54189n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC6865j f54190o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC6835l f54191p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC6865j f54192q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f54193r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f54194s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float e(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean f(double d10, InterfaceC6865j interfaceC6865j, InterfaceC6865j interfaceC6865j2) {
            return Math.abs(interfaceC6865j.a(d10) - interfaceC6865j2.a(d10)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] fArr, z zVar) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float fA = zVar.a();
            float fB = zVar.b();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - fA) / fB;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (fA / fB) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[2] - fArr2[2];
            float f15 = fArr[3] - fArr2[3];
            float f16 = fArr[4];
            float f17 = fArr2[4];
            float f18 = fArr[5];
            float f19 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, f14, f15, f16 - f17, f18 - f19};
            return i(fArr3[0], fArr3[1], f11 - f17, f13 - f19) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        private final float i(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] fArr, z zVar, InterfaceC6865j interfaceC6865j, InterfaceC6865j interfaceC6865j2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            C6862g c6862g = C6862g.f54113a;
            if (!AbstractC6859d.g(fArr, c6862g.x()) || !AbstractC6859d.f(zVar, k.f54148a.e()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            x xVarW = c6862g.w();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!f(d10, interfaceC6865j, xVarW.J()) || !f(d10, interfaceC6865j2, xVarW.F())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] fArr, float f10, float f11) {
            float fE = e(fArr);
            C6862g c6862g = C6862g.f54113a;
            return (fE / e(c6862g.s()) > 0.9f && h(fArr, c6862g.x())) || (f10 < 0.0f && f11 > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f10 = fArr[0];
                float f11 = fArr[1];
                float f12 = f10 + f11 + fArr[2];
                fArr2[0] = f10 / f12;
                fArr2[1] = f11 / f12;
                float f13 = fArr[3];
                float f14 = fArr[4];
                float f15 = f13 + f14 + fArr[5];
                fArr2[2] = f13 / f15;
                fArr2[3] = f14 / f15;
                float f16 = fArr[6];
                float f17 = fArr[7];
                float f18 = f16 + f17 + fArr[8];
                fArr2[4] = f16 / f18;
                fArr2[5] = f17 / f18;
            } else {
                AbstractC3682n.o(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(x.this.F().a(AbstractC7978m.i(d10, x.this.f54181f, x.this.f54182g)));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {
        c() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(AbstractC7978m.i(x.this.J().a(d10), x.this.f54181f, x.this.f54182g));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    public x(String str, float[] fArr, z zVar, float[] fArr2, InterfaceC6865j interfaceC6865j, InterfaceC6865j interfaceC6865j2, float f10, float f11, y yVar, int i10) {
        super(str, AbstractC6857b.f54104a.b(), i10, null);
        this.f54180e = zVar;
        this.f54181f = f10;
        this.f54182g = f11;
        this.f54183h = yVar;
        this.f54187l = interfaceC6865j;
        this.f54188m = new c();
        this.f54189n = new InterfaceC6865j() { // from class: n0.o
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return x.O(this.f54170a, d10);
            }
        };
        this.f54190o = interfaceC6865j2;
        this.f54191p = new b();
        this.f54192q = new InterfaceC6865j() { // from class: n0.p
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return x.C(this.f54171a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        a aVar = f54178t;
        float[] fArrL = aVar.l(fArr);
        this.f54184i = fArrL;
        if (fArr2 == null) {
            this.f54185j = aVar.g(fArrL, zVar);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f54185j = fArr2;
        }
        this.f54186k = AbstractC6859d.k(this.f54185j);
        this.f54193r = aVar.k(fArrL, f10, f11);
        this.f54194s = aVar.j(fArrL, zVar, interfaceC6865j, interfaceC6865j2, f10, f11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(x xVar, double d10) {
        return xVar.f54190o.a(AbstractC7978m.i(d10, xVar.f54181f, xVar.f54182g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double O(x xVar, double d10) {
        return AbstractC7978m.i(xVar.f54187l.a(d10), xVar.f54181f, xVar.f54182g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double t(double d10) {
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double u(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double v(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double w(y yVar, double d10) {
        return AbstractC6859d.o(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(y yVar, double d10) {
        return AbstractC6859d.p(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(y yVar, double d10) {
        return AbstractC6859d.q(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(y yVar, double d10) {
        return AbstractC6859d.r(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    public final InterfaceC6835l D() {
        return this.f54191p;
    }

    public final InterfaceC6865j E() {
        return this.f54192q;
    }

    public final InterfaceC6865j F() {
        return this.f54190o;
    }

    public final float[] G() {
        return this.f54186k;
    }

    public final InterfaceC6835l H() {
        return this.f54188m;
    }

    public final InterfaceC6865j I() {
        return this.f54189n;
    }

    public final InterfaceC6865j J() {
        return this.f54187l;
    }

    public final float[] K() {
        return this.f54184i;
    }

    public final y L() {
        return this.f54183h;
    }

    public final float[] M() {
        return this.f54185j;
    }

    public final z N() {
        return this.f54180e;
    }

    @Override // n0.AbstractC6858c
    public float c(int i10) {
        return this.f54182g;
    }

    @Override // n0.AbstractC6858c
    public float d(int i10) {
        return this.f54181f;
    }

    @Override // n0.AbstractC6858c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        x xVar = (x) obj;
        if (Float.compare(xVar.f54181f, this.f54181f) != 0 || Float.compare(xVar.f54182g, this.f54182g) != 0 || !AbstractC6492s.d(this.f54180e, xVar.f54180e) || !Arrays.equals(this.f54184i, xVar.f54184i)) {
            return false;
        }
        y yVar = this.f54183h;
        if (yVar != null) {
            return AbstractC6492s.d(yVar, xVar.f54183h);
        }
        if (xVar.f54183h == null) {
            return true;
        }
        if (AbstractC6492s.d(this.f54187l, xVar.f54187l)) {
            return AbstractC6492s.d(this.f54190o, xVar.f54190o);
        }
        return false;
    }

    @Override // n0.AbstractC6858c
    public boolean g() {
        return this.f54194s;
    }

    @Override // n0.AbstractC6858c
    public long h(float f10, float f11, float f12) {
        float fA = (float) this.f54192q.a(f10);
        float fA2 = (float) this.f54192q.a(f11);
        float fA3 = (float) this.f54192q.a(f12);
        float[] fArr = this.f54185j;
        float f13 = (fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3);
        float f14 = (fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3);
        return (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & Counter32.MAX_COUNTER32_VALUE);
    }

    @Override // n0.AbstractC6858c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f54180e.hashCode()) * 31) + Arrays.hashCode(this.f54184i)) * 31;
        float f10 = this.f54181f;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f54182g;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        y yVar = this.f54183h;
        int iHashCode2 = iFloatToIntBits2 + (yVar != null ? yVar.hashCode() : 0);
        return this.f54183h == null ? (((iHashCode2 * 31) + this.f54187l.hashCode()) * 31) + this.f54190o.hashCode() : iHashCode2;
    }

    @Override // n0.AbstractC6858c
    public float i(float f10, float f11, float f12) {
        float fA = (float) this.f54192q.a(f10);
        float fA2 = (float) this.f54192q.a(f11);
        float fA3 = (float) this.f54192q.a(f12);
        float[] fArr = this.f54185j;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // n0.AbstractC6858c
    public long j(float f10, float f11, float f12, float f13, AbstractC6858c abstractC6858c) {
        float[] fArr = this.f54186k;
        return AbstractC6737x0.a((float) this.f54189n.a((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12)), (float) this.f54189n.a((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12)), (float) this.f54189n.a((fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12)), f13, abstractC6858c);
    }

    public x(String str, float[] fArr, z zVar, final y yVar, int i10) {
        this(str, fArr, zVar, null, (yVar.e() == 0.0d && yVar.f() == 0.0d) ? new InterfaceC6865j() { // from class: n0.t
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return x.w(yVar, d10);
            }
        } : new InterfaceC6865j() { // from class: n0.u
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return x.x(yVar, d10);
            }
        }, (yVar.e() == 0.0d && yVar.f() == 0.0d) ? new InterfaceC6865j() { // from class: n0.v
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return x.y(yVar, d10);
            }
        } : new InterfaceC6865j() { // from class: n0.w
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return x.z(yVar, d10);
            }
        }, 0.0f, 1.0f, yVar, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(String str, float[] fArr, z zVar, final double d10, float f10, float f11, int i10) {
        InterfaceC6865j interfaceC6865j;
        InterfaceC6865j interfaceC6865j2;
        if (d10 == 1.0d) {
            interfaceC6865j = f54179u;
        } else {
            interfaceC6865j = new InterfaceC6865j() { // from class: n0.r
                @Override // n0.InterfaceC6865j
                public final double a(double d11) {
                    return x.u(d10, d11);
                }
            };
        }
        InterfaceC6865j interfaceC6865j3 = interfaceC6865j;
        if (d10 == 1.0d) {
            interfaceC6865j2 = f54179u;
        } else {
            interfaceC6865j2 = new InterfaceC6865j() { // from class: n0.s
                @Override // n0.InterfaceC6865j
                public final double a(double d11) {
                    return x.v(d10, d11);
                }
            };
        }
        this(str, fArr, zVar, null, interfaceC6865j3, interfaceC6865j2, f10, f11, new y(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    public x(x xVar, float[] fArr, z zVar) {
        this(xVar.f(), xVar.f54184i, zVar, fArr, xVar.f54187l, xVar.f54190o, xVar.f54181f, xVar.f54182g, xVar.f54183h, -1);
    }
}
