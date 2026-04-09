package n0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class l extends AbstractC6858c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f54159e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(String str, int i10) {
        super(str, AbstractC6857b.f54104a.a(), i10, null);
    }

    @Override // n0.AbstractC6858c
    public float c(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // n0.AbstractC6858c
    public float d(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // n0.AbstractC6858c
    public long h(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        float f14 = (f11 * 0.002f) + f13;
        float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
        float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        float f17 = f15 * k.f54148a.c()[0];
        return (Float.floatToRawIntBits(f16 * r5.c()[1]) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f17) << 32);
    }

    @Override // n0.AbstractC6858c
    public float i(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        return (f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f)) * k.f54148a.c()[2];
    }

    @Override // n0.AbstractC6858c
    public long j(float f10, float f11, float f12, float f13, AbstractC6858c abstractC6858c) {
        k kVar = k.f54148a;
        float f14 = f10 / kVar.c()[0];
        float f15 = f11 / kVar.c()[1];
        float f16 = f12 / kVar.c()[2];
        float fCbrt = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
        float f17 = (116.0f * fCbrt2) - 16.0f;
        float f18 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        if (f18 > 128.0f) {
            f18 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return AbstractC6737x0.a(f17, f18, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f13, abstractC6858c);
    }
}
