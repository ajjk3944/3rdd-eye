package d2;

import ac.m;
import com.bumptech.glide.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21944a;

    /* renamed from: b, reason: collision with root package name */
    public final c f21945b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21946c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f21947d;

    /* renamed from: e, reason: collision with root package name */
    public int f21948e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f21949f;
    public final float[] g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f21950h;

    public d(boolean z3, c cVar) {
        int i4;
        this.f21944a = z3;
        this.f21945b = cVar;
        if (z3 && cVar.equals(c.f21941a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            i4 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new m();
            }
            i4 = 2;
        }
        this.f21946c = i4;
        this.f21947d = new a[20];
        this.f21949f = new float[20];
        this.g = new float[20];
        this.f21950h = new float[3];
    }

    public final void a(long j, float f10) {
        int i4 = (this.f21948e + 1) % 20;
        this.f21948e = i4;
        a[] aVarArr = this.f21947d;
        a aVar = aVarArr[i4];
        if (aVar != null) {
            aVar.f21936a = j;
            aVar.f21937b = f10;
        } else {
            a aVar2 = new a();
            aVar2.f21936a = j;
            aVar2.f21937b = f10;
            aVarArr[i4] = aVar2;
        }
    }

    public final float b(float f10) {
        c cVar;
        float[] fArr;
        float[] fArr2;
        float f11;
        boolean z3;
        int i4;
        float fSignum;
        float f12 = f10;
        float f13 = 0.0f;
        if (f12 <= 0.0f) {
            f2.a.b("maximumVelocity should be a positive value. You specified=" + f12);
        }
        int i10 = this.f21948e;
        a[] aVarArr = this.f21947d;
        a aVar = aVarArr[i10];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            int i11 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i10];
                boolean z10 = this.f21944a;
                cVar = this.f21945b;
                fArr = this.f21949f;
                fArr2 = this.g;
                if (aVar3 == null) {
                    f11 = f13;
                    z3 = z10;
                    i4 = 1;
                    break;
                }
                long j = aVar.f21936a;
                f11 = f13;
                int i12 = i10;
                long j8 = aVar3.f21936a;
                float f14 = j - j8;
                z3 = z10;
                i4 = 1;
                float fAbs = Math.abs(j8 - aVar2.f21936a);
                aVar2 = (cVar == c.f21941a || z3) ? aVar3 : aVar;
                if (f14 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i11] = aVar3.f21937b;
                fArr2[i11] = -f14;
                i10 = (i12 == 0 ? 20 : i12) - 1;
                i11++;
                if (i11 >= 20) {
                    break;
                }
                f13 = f11;
            }
            if (i11 >= this.f21946c) {
                int iOrdinal = cVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f21950h;
                        e.K(fArr2, fArr, i11, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f11;
                    }
                } else {
                    if (iOrdinal != i4) {
                        throw new m();
                    }
                    int i13 = i11 - i4;
                    float f15 = fArr2[i13];
                    int i14 = i13;
                    float fAbs2 = f11;
                    while (i14 > 0) {
                        int i15 = i14 - 1;
                        float f16 = fArr2[i15];
                        if (f15 != f16) {
                            float f17 = (z3 ? -fArr[i15] : fArr[i14] - fArr[i15]) / (f15 - f16);
                            fAbs2 += Math.abs(f17) * (f17 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i14 == i13) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i14--;
                        f15 = f16;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f13 = fSignum * 1000;
            } else {
                f13 = f11;
            }
        }
        if (f13 == f11 || Float.isNaN(f13)) {
            return f11;
        }
        if (f13 <= f11) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }

    public /* synthetic */ d() {
        this(false, c.f21941a);
    }

    public d(int i4) {
        this(true, c.f21942b);
    }
}
