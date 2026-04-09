package t2;

import lf.t1;

/* loaded from: classes.dex */
public interface c {
    default int G(float f10) {
        float fZ = z(f10);
        if (Float.isInfinite(fZ)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fZ);
    }

    default long J(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fZ = z(Float.intBitsToFloat((int) (j >> 32)));
        float fZ2 = z(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(fZ2) & 4294967295L) | (Float.floatToRawIntBits(fZ) << 32);
    }

    default float L(long j) {
        if (!l.a(k.b(j), 4294967296L)) {
            g.b("Only Sp can convert to Px");
        }
        return z(l(j));
    }

    float getDensity();

    default long i(float f10) {
        float[] fArr = u2.b.f23139a;
        if (y() < 1.03f) {
            return t1.B(4294967296L, f10 / y());
        }
        u2.a aVarA = u2.b.a(y());
        return t1.B(4294967296L, aVarA != null ? aVarA.a(f10) : f10 / y());
    }

    default float l(long j) {
        float fC;
        float fY;
        if (!l.a(k.b(j), 4294967296L)) {
            g.b("Only Sp can convert to Px");
        }
        float[] fArr = u2.b.f23139a;
        if (y() >= 1.03f) {
            u2.a aVarA = u2.b.a(y());
            fC = k.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fY = y();
        } else {
            fC = k.c(j);
            fY = y();
        }
        return fY * fC;
    }

    default long r(float f10) {
        return i(v(f10));
    }

    default float v(float f10) {
        return f10 / getDensity();
    }

    float y();

    default float z(float f10) {
        return getDensity() * f10;
    }
}
