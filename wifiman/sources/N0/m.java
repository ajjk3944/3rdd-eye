package n0;

import a1.AbstractC3751b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class m extends AbstractC6858c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f54160e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f54161f;

    /* renamed from: g, reason: collision with root package name */
    private static final float[] f54162g;

    /* renamed from: h, reason: collision with root package name */
    private static final float[] f54163h;

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f54164i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        float[] fArrB = AbstractC6856a.f54099b.a().b();
        k kVar = k.f54148a;
        float[] fArrL = AbstractC6859d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC6859d.e(fArrB, kVar.b().c(), kVar.e().c()));
        f54161f = fArrL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f54162g = fArr;
        f54163h = AbstractC6859d.k(fArrL);
        f54164i = AbstractC6859d.k(fArr);
    }

    public m(String str, int i10) {
        super(str, AbstractC6857b.f54104a.a(), i10, null);
    }

    @Override // n0.AbstractC6858c
    public float c(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // n0.AbstractC6858c
    public float d(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // n0.AbstractC6858c
    public long h(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f54164i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f54163h;
        return (Float.floatToRawIntBits(((fArr2[0] * f17) + (fArr2[3] * f18)) + (fArr2[6] * f19)) << 32) | (Float.floatToRawIntBits((fArr2[1] * f17) + (fArr2[4] * f18) + (fArr2[7] * f19)) & Counter32.MAX_COUNTER32_VALUE);
    }

    @Override // n0.AbstractC6858c
    public float i(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f54164i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f54163h;
        return (fArr2[2] * f17) + (fArr2[5] * f18) + (fArr2[8] * f16 * f16 * f16);
    }

    @Override // n0.AbstractC6858c
    public long j(float f10, float f11, float f12, float f13, AbstractC6858c abstractC6858c) {
        float[] fArr = f54161f;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        float fA = AbstractC3751b.a(f14);
        float fA2 = AbstractC3751b.a(f15);
        float fA3 = AbstractC3751b.a(f16);
        float[] fArr2 = f54162g;
        return AbstractC6737x0.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), f13, abstractC6858c);
    }
}
