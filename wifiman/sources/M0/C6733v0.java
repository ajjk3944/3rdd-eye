package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.AbstractC6858c;
import n0.AbstractC6859d;
import n0.C6862g;
import org.snmp4j.smi.Counter32;

/* renamed from: m0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6733v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52951b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f52952c = AbstractC6737x0.d(4278190080L);

    /* renamed from: d, reason: collision with root package name */
    private static final long f52953d = AbstractC6737x0.d(4282664004L);

    /* renamed from: e, reason: collision with root package name */
    private static final long f52954e = AbstractC6737x0.d(4287137928L);

    /* renamed from: f, reason: collision with root package name */
    private static final long f52955f = AbstractC6737x0.d(4291611852L);

    /* renamed from: g, reason: collision with root package name */
    private static final long f52956g = AbstractC6737x0.d(Counter32.MAX_COUNTER32_VALUE);

    /* renamed from: h, reason: collision with root package name */
    private static final long f52957h = AbstractC6737x0.d(4294901760L);

    /* renamed from: i, reason: collision with root package name */
    private static final long f52958i = AbstractC6737x0.d(4278255360L);

    /* renamed from: j, reason: collision with root package name */
    private static final long f52959j = AbstractC6737x0.d(4278190335L);

    /* renamed from: k, reason: collision with root package name */
    private static final long f52960k = AbstractC6737x0.d(4294967040L);

    /* renamed from: l, reason: collision with root package name */
    private static final long f52961l = AbstractC6737x0.d(4278255615L);

    /* renamed from: m, reason: collision with root package name */
    private static final long f52962m = AbstractC6737x0.d(4294902015L);

    /* renamed from: n, reason: collision with root package name */
    private static final long f52963n = AbstractC6737x0.b(0);

    /* renamed from: o, reason: collision with root package name */
    private static final long f52964o = AbstractC6737x0.a(0.0f, 0.0f, 0.0f, 0.0f, C6862g.f54113a.y());

    /* renamed from: a, reason: collision with root package name */
    private final long f52965a;

    /* renamed from: m0.v0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ long h(a aVar, float f10, float f11, float f12, float f13, n0.x xVar, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f13 = 1.0f;
            }
            float f14 = f13;
            if ((i10 & 16) != 0) {
                xVar = C6862g.f54113a.w();
            }
            return aVar.g(f10, f11, f12, f14, xVar);
        }

        private final float i(int i10, float f10, float f11, float f12) {
            float f13 = (i10 + (f10 / 30.0f)) % 12.0f;
            return f12 - ((f11 * Math.min(f12, 1.0f - f12)) * Math.max(-1.0f, Math.min(f13 - 3, Math.min(9 - f13, 1.0f))));
        }

        public final long a() {
            return C6733v0.f52952c;
        }

        public final long b() {
            return C6733v0.f52959j;
        }

        public final long c() {
            return C6733v0.f52957h;
        }

        public final long d() {
            return C6733v0.f52963n;
        }

        public final long e() {
            return C6733v0.f52964o;
        }

        public final long f() {
            return C6733v0.f52956g;
        }

        public final long g(float f10, float f11, float f12, float f13, n0.x xVar) {
            if (!(0.0f <= f10 && f10 <= 360.0f && 0.0f <= f11 && f11 <= 1.0f && 0.0f <= f12 && f12 <= 1.0f)) {
                M0.a("HSL (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return AbstractC6737x0.a(i(0, f10, f11, f12), i(8, f10, f11, f12), i(4, f10, f11, f12), f13, xVar);
        }

        private a() {
        }
    }

    private /* synthetic */ C6733v0(long j10) {
        this.f52965a = j10;
    }

    public static final /* synthetic */ C6733v0 g(long j10) {
        return new C6733v0(j10);
    }

    public static long h(long j10) {
        return j10;
    }

    public static final long i(long j10, AbstractC6858c abstractC6858c) {
        return AbstractC6859d.i(p(j10), abstractC6858c, 0, 2, null).a(j10);
    }

    public static final long j(long j10, float f10, float f11, float f12, float f13) {
        return AbstractC6737x0.a(f11, f12, f13, f10, p(j10));
    }

    public static /* synthetic */ long k(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = n(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = r(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = q(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = o(j10);
        }
        return j(j10, f14, f15, f16, f13);
    }

    public static boolean l(long j10, Object obj) {
        return (obj instanceof C6733v0) && j10 == ((C6733v0) obj).u();
    }

    public static final boolean m(long j10, long j11) {
        return Yg.E.d(j10, j11);
    }

    public static final float n(long j10) {
        float fC;
        float f10;
        if (Yg.E.b(63 & j10) == 0) {
            fC = (float) Yg.L.c(Yg.E.b(Yg.E.b(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fC = (float) Yg.L.c(Yg.E.b(Yg.E.b(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fC / f10;
    }

    public static final float o(long j10) {
        int i10;
        int i11;
        int i12;
        if (Yg.E.b(63 & j10) == 0) {
            return ((float) Yg.L.c(Yg.E.b(Yg.E.b(j10 >>> 32) & 255))) / 255.0f;
        }
        short sB = (short) Yg.E.b(Yg.E.b(j10 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & sB;
        int i14 = ((65535 & sB) >>> 10) & 31;
        int i15 = sB & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC6669G0.f52810c;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final AbstractC6858c p(long j10) {
        C6862g c6862g = C6862g.f54113a;
        return c6862g.l()[(int) Yg.E.b(j10 & 63)];
    }

    public static final float q(long j10) {
        int i10;
        int i11;
        int i12;
        if (Yg.E.b(63 & j10) == 0) {
            return ((float) Yg.L.c(Yg.E.b(Yg.E.b(j10 >>> 40) & 255))) / 255.0f;
        }
        short sB = (short) Yg.E.b(Yg.E.b(j10 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & sB;
        int i14 = ((65535 & sB) >>> 10) & 31;
        int i15 = sB & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC6669G0.f52810c;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float r(long j10) {
        int i10;
        int i11;
        int i12;
        if (Yg.E.b(63 & j10) == 0) {
            return ((float) Yg.L.c(Yg.E.b(Yg.E.b(j10 >>> 48) & 255))) / 255.0f;
        }
        short sB = (short) Yg.E.b(Yg.E.b(j10 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & sB;
        int i14 = ((65535 & sB) >>> 10) & 31;
        int i15 = sB & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC6669G0.f52810c;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static int s(long j10) {
        return Yg.E.g(j10);
    }

    public static String t(long j10) {
        return "Color(" + r(j10) + ", " + q(j10) + ", " + o(j10) + ", " + n(j10) + ", " + p(j10).f() + ')';
    }

    public boolean equals(Object obj) {
        return l(this.f52965a, obj);
    }

    public int hashCode() {
        return s(this.f52965a);
    }

    public String toString() {
        return t(this.f52965a);
    }

    public final /* synthetic */ long u() {
        return this.f52965a;
    }
}
