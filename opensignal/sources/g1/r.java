package g1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final long f9264b = f0.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f9265c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f9266d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f9267e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f9268f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f9269g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9270h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f9271a;

    static {
        f0.c(4282664004L);
        f0.c(4287137928L);
        f0.c(4291611852L);
        f9265c = f0.c(4294967295L);
        f9266d = f0.c(4294901760L);
        f0.c(4278255360L);
        f9267e = f0.c(4278190335L);
        f0.c(4294967040L);
        f0.c(4278255615L);
        f0.c(4294902015L);
        f9268f = f0.b(0);
        f9269g = f0.a(0.0f, 0.0f, 0.0f, 0.0f, h1.d.f9705u);
    }

    public /* synthetic */ r(long j) {
        this.f9271a = j;
    }

    public static final long a(long j, h1.c cVar) {
        h1.g gVarE;
        h1.c cVarF = f(j);
        int i10 = cVarF.f9686c;
        int i11 = cVar.f9686c;
        if ((i10 | i11) < 0) {
            gVarE = h1.j.e(cVarF, cVar);
        } else {
            u.t tVar = h1.h.f9717a;
            int i12 = i10 | (i11 << 6);
            Object objB = tVar.b(i12);
            if (objB == null) {
                objB = h1.j.e(cVarF, cVar);
                tVar.h(i12, objB);
            }
            gVarE = (h1.g) objB;
        }
        return gVarE.a(j);
    }

    public static long b(long j, float f10) {
        return f0.a(h(j), g(j), e(j), f10, f(j));
    }

    public static final boolean c(long j, long j7) {
        return j == j7;
    }

    public static final float d(long j) {
        float fD0;
        float f10;
        if ((63 & j) == 0) {
            fD0 = (float) se.b.d0((j >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fD0 = (float) se.b.d0((j >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fD0 / f10;
    }

    public static final float e(long j) {
        int i10;
        int i11;
        int i12;
        if ((63 & j) == 0) {
            return ((float) se.b.d0((j >>> 32) & 255)) / 255.0f;
        }
        short s8 = (short) ((j >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & s8;
        int i14 = ((65535 & s8) >>> 10) & 31;
        int i15 = s8 & 1023;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - v.f9274a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final h1.c f(long j) {
        float[] fArr = h1.d.f9687a;
        return h1.d.f9709y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i10;
        int i11;
        int i12;
        if ((63 & j) == 0) {
            return ((float) se.b.d0((j >>> 40) & 255)) / 255.0f;
        }
        short s8 = (short) ((j >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & s8;
        int i14 = ((65535 & s8) >>> 10) & 31;
        int i15 = s8 & 1023;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - v.f9274a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float h(long j) {
        int i10;
        int i11;
        int i12;
        if ((63 & j) == 0) {
            return ((float) se.b.d0((j >>> 48) & 255)) / 255.0f;
        }
        short s8 = (short) ((j >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & s8;
        int i14 = ((65535 & s8) >>> 10) & 31;
        int i15 = s8 & 1023;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - v.f9274a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String i(long j) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j));
        sb2.append(", ");
        sb2.append(g(j));
        sb2.append(", ");
        sb2.append(e(j));
        sb2.append(", ");
        sb2.append(d(j));
        sb2.append(", ");
        return h0.b.r(sb2, f(j).f9684a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f9271a == ((r) obj).f9271a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9271a);
    }

    public final String toString() {
        return i(this.f9271a);
    }
}
