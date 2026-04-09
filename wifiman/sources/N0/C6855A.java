package n0;

import m0.AbstractC6737x0;
import org.snmp4j.smi.Counter32;

/* renamed from: n0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6855A extends AbstractC6858c {
    public C6855A(String str, int i10) {
        super(str, AbstractC6857b.f54104a.c(), i10, null);
    }

    @Override // n0.AbstractC6858c
    public float c(int i10) {
        return 2.0f;
    }

    @Override // n0.AbstractC6858c
    public float d(int i10) {
        return -2.0f;
    }

    @Override // n0.AbstractC6858c
    public long h(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f) & Counter32.MAX_COUNTER32_VALUE);
    }

    @Override // n0.AbstractC6858c
    public float i(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // n0.AbstractC6858c
    public long j(float f10, float f11, float f12, float f13, AbstractC6858c abstractC6858c) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return AbstractC6737x0.a(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, abstractC6858c);
    }
}
