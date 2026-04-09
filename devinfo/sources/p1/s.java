package p1;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final long f31013b = z.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f31014c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f31015d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f31016e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f31017f;
    public static final long g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f31018h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f31019i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f31020a;

    static {
        z.c(4282664004L);
        z.c(4287137928L);
        f31014c = z.c(4291611852L);
        f31015d = z.c(4294967295L);
        f31016e = z.c(4294901760L);
        z.c(4278255360L);
        f31017f = z.c(4278190335L);
        z.c(4294967040L);
        z.c(4278255615L);
        z.c(4294902015L);
        g = z.b(0);
        f31018h = z.a(0.0f, 0.0f, 0.0f, 0.0f, q1.d.f32094u);
    }

    public static final long a(long j, q1.c cVar) {
        q1.g gVarE;
        q1.c cVarF = f(j);
        int i4 = cVarF.f32075c;
        int i10 = cVar.f32075c;
        if ((i4 | i10) < 0) {
            gVarE = q1.j.e(cVarF, cVar);
        } else {
            x.u uVar = q1.h.f32105a;
            int i11 = i4 | (i10 << 6);
            Object objB = uVar.b(i11);
            if (objB == null) {
                objB = q1.j.e(cVarF, cVar);
                uVar.h(i11, objB);
            }
            gVarE = (q1.g) objB;
        }
        return gVarE.a(j);
    }

    public static long b(long j, float f10) {
        return z.a(h(j), g(j), e(j), f10, f(j));
    }

    public static final boolean c(long j, long j8) {
        return j == j8;
    }

    public static final float d(long j) {
        float fP;
        float f10;
        if ((63 & j) == 0) {
            fP = (float) cm.g.P((j >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fP = (float) cm.g.P((j >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fP / f10;
    }

    public static final float e(long j) {
        int i4;
        int i10;
        int i11;
        if ((63 & j) == 0) {
            return ((float) cm.g.P((j >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i4 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i4 = i13 + AppLovinMediationAdapter.ERROR_CHILD_USER;
            }
            int i16 = i4;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - w.f31023a;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final q1.c f(long j) {
        float[] fArr = q1.d.f32076a;
        return q1.d.f32098y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i4;
        int i10;
        int i11;
        if ((63 & j) == 0) {
            return ((float) cm.g.P((j >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i4 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i4 = i13 + AppLovinMediationAdapter.ERROR_CHILD_USER;
            }
            int i16 = i4;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - w.f31023a;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final float h(long j) {
        int i4;
        int i10;
        int i11;
        if ((63 & j) == 0) {
            return ((float) cm.g.P((j >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i4 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i4 = i13 + AppLovinMediationAdapter.ERROR_CHILD_USER;
            }
            int i16 = i4;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - w.f31023a;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
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
        return r5.c.l(sb2, f(j).f32073a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f31020a == ((s) obj).f31020a;
        }
        return false;
    }

    public final int hashCode() {
        return yj.q.a(this.f31020a);
    }

    public final String toString() {
        return i(this.f31020a);
    }
}
