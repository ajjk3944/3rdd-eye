package r;

import m0.AbstractC6695c0;
import org.snmp4j.smi.Counter32;

/* renamed from: r.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7548x implements E {

    /* renamed from: a, reason: collision with root package name */
    private final float f59922a;

    /* renamed from: b, reason: collision with root package name */
    private final float f59923b;

    /* renamed from: c, reason: collision with root package name */
    private final float f59924c;

    /* renamed from: d, reason: collision with root package name */
    private final float f59925d;

    /* renamed from: e, reason: collision with root package name */
    private final float f59926e;

    /* renamed from: f, reason: collision with root package name */
    private final float f59927f;

    public C7548x(float f10, float f11, float f12, float f13) {
        this.f59922a = f10;
        this.f59923b = f11;
        this.f59924c = f12;
        this.f59925d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            AbstractC7518a0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        long jB = AbstractC6695c0.b(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.f59926e = Float.intBitsToFloat((int) (jB >> 32));
        this.f59927f = Float.intBitsToFloat((int) (jB & Counter32.MAX_COUNTER32_VALUE));
    }

    private final void b(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f59922a + ", " + this.f59923b + ", " + this.f59924c + ", " + this.f59925d + ") has no solution at " + f10);
    }

    @Override // r.E
    public float a(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float fE = AbstractC6695c0.e(0.0f - f10, this.f59922a - f10, this.f59924c - f10, 1.0f - f10);
        if (Float.isNaN(fE)) {
            b(f10);
        }
        float fC = AbstractC6695c0.c(this.f59923b, this.f59925d, fE);
        float f11 = this.f59926e;
        float f12 = this.f59927f;
        if (fC < f11) {
            fC = f11;
        }
        return fC > f12 ? f12 : fC;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7548x) {
            C7548x c7548x = (C7548x) obj;
            if (this.f59922a == c7548x.f59922a && this.f59923b == c7548x.f59923b && this.f59924c == c7548x.f59924c && this.f59925d == c7548x.f59925d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f59922a) * 31) + Float.hashCode(this.f59923b)) * 31) + Float.hashCode(this.f59924c)) * 31) + Float.hashCode(this.f59925d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f59922a + ", b=" + this.f59923b + ", c=" + this.f59924c + ", d=" + this.f59925d + ')';
    }
}
