package h1;

import d5.v;
import g1.f0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final v f9736r = new v(12);

    /* renamed from: d, reason: collision with root package name */
    public final s f9737d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9738e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9739f;

    /* renamed from: g, reason: collision with root package name */
    public final r f9740g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f9741h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f9742i;
    public final float[] j;
    public final i k;

    /* renamed from: l, reason: collision with root package name */
    public final p f9743l;

    /* renamed from: m, reason: collision with root package name */
    public final m f9744m;

    /* renamed from: n, reason: collision with root package name */
    public final i f9745n;

    /* renamed from: o, reason: collision with root package name */
    public final p f9746o;

    /* renamed from: p, reason: collision with root package name */
    public final m f9747p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9748q;

    public q(String str, float[] fArr, s sVar, final r rVar, int i10) {
        i iVar;
        i iVar2;
        double d6 = rVar.f9749a;
        boolean z10 = d6 == -3.0d;
        double d10 = rVar.f9755g;
        double d11 = rVar.f9754f;
        if (z10) {
            final int i11 = 4;
            iVar = new i() { // from class: h1.o
                @Override // h1.i
                public final double i(double d12) {
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.f9687a;
                            return d.a(rVar2, d12);
                        case 1:
                            float[] fArr3 = d.f9687a;
                            return d.c(rVar2, d12);
                        case 2:
                            double d13 = rVar2.f9750b;
                            return d12 >= rVar2.f9753e ? Math.pow((d13 * d12) + rVar2.f9751c, rVar2.f9749a) : d12 * rVar2.f9752d;
                        case 3:
                            double d14 = rVar2.f9750b;
                            double d15 = rVar2.f9751c;
                            double d16 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e ? Math.pow((d14 * d12) + d15, rVar2.f9749a) + rVar2.f9754f : (d16 * d12) + rVar2.f9755g;
                        case 4:
                            float[] fArr4 = d.f9687a;
                            return d.b(rVar2, d12);
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f9687a;
                            return d.d(rVar2, d12);
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d17 = rVar2.f9750b;
                            double d18 = rVar2.f9751c;
                            double d19 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d19 ? (Math.pow(d12, 1.0d / rVar2.f9749a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = rVar2.f9750b;
                            double d21 = rVar2.f9751c;
                            double d22 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d22 ? (Math.pow(d12 - rVar2.f9754f, 1.0d / rVar2.f9749a) - d21) / d20 : (d12 - rVar2.f9755g) / d22;
                    }
                }
            };
        } else if (d6 == -2.0d) {
            final int i12 = 5;
            iVar = new i() { // from class: h1.o
                @Override // h1.i
                public final double i(double d12) {
                    int i122 = i12;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f9687a;
                            return d.a(rVar2, d12);
                        case 1:
                            float[] fArr3 = d.f9687a;
                            return d.c(rVar2, d12);
                        case 2:
                            double d13 = rVar2.f9750b;
                            return d12 >= rVar2.f9753e ? Math.pow((d13 * d12) + rVar2.f9751c, rVar2.f9749a) : d12 * rVar2.f9752d;
                        case 3:
                            double d14 = rVar2.f9750b;
                            double d15 = rVar2.f9751c;
                            double d16 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e ? Math.pow((d14 * d12) + d15, rVar2.f9749a) + rVar2.f9754f : (d16 * d12) + rVar2.f9755g;
                        case 4:
                            float[] fArr4 = d.f9687a;
                            return d.b(rVar2, d12);
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f9687a;
                            return d.d(rVar2, d12);
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d17 = rVar2.f9750b;
                            double d18 = rVar2.f9751c;
                            double d19 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d19 ? (Math.pow(d12, 1.0d / rVar2.f9749a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = rVar2.f9750b;
                            double d21 = rVar2.f9751c;
                            double d22 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d22 ? (Math.pow(d12 - rVar2.f9754f, 1.0d / rVar2.f9749a) - d21) / d20 : (d12 - rVar2.f9755g) / d22;
                    }
                }
            };
        } else if (d11 == 0.0d && d10 == 0.0d) {
            final int i13 = 6;
            iVar = new i() { // from class: h1.o
                @Override // h1.i
                public final double i(double d12) {
                    int i122 = i13;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f9687a;
                            return d.a(rVar2, d12);
                        case 1:
                            float[] fArr3 = d.f9687a;
                            return d.c(rVar2, d12);
                        case 2:
                            double d13 = rVar2.f9750b;
                            return d12 >= rVar2.f9753e ? Math.pow((d13 * d12) + rVar2.f9751c, rVar2.f9749a) : d12 * rVar2.f9752d;
                        case 3:
                            double d14 = rVar2.f9750b;
                            double d15 = rVar2.f9751c;
                            double d16 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e ? Math.pow((d14 * d12) + d15, rVar2.f9749a) + rVar2.f9754f : (d16 * d12) + rVar2.f9755g;
                        case 4:
                            float[] fArr4 = d.f9687a;
                            return d.b(rVar2, d12);
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f9687a;
                            return d.d(rVar2, d12);
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d17 = rVar2.f9750b;
                            double d18 = rVar2.f9751c;
                            double d19 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d19 ? (Math.pow(d12, 1.0d / rVar2.f9749a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = rVar2.f9750b;
                            double d21 = rVar2.f9751c;
                            double d22 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d22 ? (Math.pow(d12 - rVar2.f9754f, 1.0d / rVar2.f9749a) - d21) / d20 : (d12 - rVar2.f9755g) / d22;
                    }
                }
            };
        } else {
            final int i14 = 7;
            iVar = new i() { // from class: h1.o
                @Override // h1.i
                public final double i(double d12) {
                    int i122 = i14;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f9687a;
                            return d.a(rVar2, d12);
                        case 1:
                            float[] fArr3 = d.f9687a;
                            return d.c(rVar2, d12);
                        case 2:
                            double d13 = rVar2.f9750b;
                            return d12 >= rVar2.f9753e ? Math.pow((d13 * d12) + rVar2.f9751c, rVar2.f9749a) : d12 * rVar2.f9752d;
                        case 3:
                            double d14 = rVar2.f9750b;
                            double d15 = rVar2.f9751c;
                            double d16 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e ? Math.pow((d14 * d12) + d15, rVar2.f9749a) + rVar2.f9754f : (d16 * d12) + rVar2.f9755g;
                        case 4:
                            float[] fArr4 = d.f9687a;
                            return d.b(rVar2, d12);
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f9687a;
                            return d.d(rVar2, d12);
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d17 = rVar2.f9750b;
                            double d18 = rVar2.f9751c;
                            double d19 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d19 ? (Math.pow(d12, 1.0d / rVar2.f9749a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = rVar2.f9750b;
                            double d21 = rVar2.f9751c;
                            double d22 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d22 ? (Math.pow(d12 - rVar2.f9754f, 1.0d / rVar2.f9749a) - d21) / d20 : (d12 - rVar2.f9755g) / d22;
                    }
                }
            };
        }
        if (d6 == -3.0d) {
            final int i15 = 0;
            iVar2 = new i() { // from class: h1.o
                @Override // h1.i
                public final double i(double d12) {
                    int i122 = i15;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f9687a;
                            return d.a(rVar2, d12);
                        case 1:
                            float[] fArr3 = d.f9687a;
                            return d.c(rVar2, d12);
                        case 2:
                            double d13 = rVar2.f9750b;
                            return d12 >= rVar2.f9753e ? Math.pow((d13 * d12) + rVar2.f9751c, rVar2.f9749a) : d12 * rVar2.f9752d;
                        case 3:
                            double d14 = rVar2.f9750b;
                            double d15 = rVar2.f9751c;
                            double d16 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e ? Math.pow((d14 * d12) + d15, rVar2.f9749a) + rVar2.f9754f : (d16 * d12) + rVar2.f9755g;
                        case 4:
                            float[] fArr4 = d.f9687a;
                            return d.b(rVar2, d12);
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f9687a;
                            return d.d(rVar2, d12);
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d17 = rVar2.f9750b;
                            double d18 = rVar2.f9751c;
                            double d19 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d19 ? (Math.pow(d12, 1.0d / rVar2.f9749a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = rVar2.f9750b;
                            double d21 = rVar2.f9751c;
                            double d22 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d22 ? (Math.pow(d12 - rVar2.f9754f, 1.0d / rVar2.f9749a) - d21) / d20 : (d12 - rVar2.f9755g) / d22;
                    }
                }
            };
        } else if (d6 == -2.0d) {
            final int i16 = 1;
            iVar2 = new i() { // from class: h1.o
                @Override // h1.i
                public final double i(double d12) {
                    int i122 = i16;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f9687a;
                            return d.a(rVar2, d12);
                        case 1:
                            float[] fArr3 = d.f9687a;
                            return d.c(rVar2, d12);
                        case 2:
                            double d13 = rVar2.f9750b;
                            return d12 >= rVar2.f9753e ? Math.pow((d13 * d12) + rVar2.f9751c, rVar2.f9749a) : d12 * rVar2.f9752d;
                        case 3:
                            double d14 = rVar2.f9750b;
                            double d15 = rVar2.f9751c;
                            double d16 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e ? Math.pow((d14 * d12) + d15, rVar2.f9749a) + rVar2.f9754f : (d16 * d12) + rVar2.f9755g;
                        case 4:
                            float[] fArr4 = d.f9687a;
                            return d.b(rVar2, d12);
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f9687a;
                            return d.d(rVar2, d12);
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d17 = rVar2.f9750b;
                            double d18 = rVar2.f9751c;
                            double d19 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d19 ? (Math.pow(d12, 1.0d / rVar2.f9749a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = rVar2.f9750b;
                            double d21 = rVar2.f9751c;
                            double d22 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d22 ? (Math.pow(d12 - rVar2.f9754f, 1.0d / rVar2.f9749a) - d21) / d20 : (d12 - rVar2.f9755g) / d22;
                    }
                }
            };
        } else if (d11 == 0.0d && d10 == 0.0d) {
            final int i17 = 2;
            iVar2 = new i() { // from class: h1.o
                @Override // h1.i
                public final double i(double d12) {
                    int i122 = i17;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f9687a;
                            return d.a(rVar2, d12);
                        case 1:
                            float[] fArr3 = d.f9687a;
                            return d.c(rVar2, d12);
                        case 2:
                            double d13 = rVar2.f9750b;
                            return d12 >= rVar2.f9753e ? Math.pow((d13 * d12) + rVar2.f9751c, rVar2.f9749a) : d12 * rVar2.f9752d;
                        case 3:
                            double d14 = rVar2.f9750b;
                            double d15 = rVar2.f9751c;
                            double d16 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e ? Math.pow((d14 * d12) + d15, rVar2.f9749a) + rVar2.f9754f : (d16 * d12) + rVar2.f9755g;
                        case 4:
                            float[] fArr4 = d.f9687a;
                            return d.b(rVar2, d12);
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f9687a;
                            return d.d(rVar2, d12);
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d17 = rVar2.f9750b;
                            double d18 = rVar2.f9751c;
                            double d19 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d19 ? (Math.pow(d12, 1.0d / rVar2.f9749a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = rVar2.f9750b;
                            double d21 = rVar2.f9751c;
                            double d22 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d22 ? (Math.pow(d12 - rVar2.f9754f, 1.0d / rVar2.f9749a) - d21) / d20 : (d12 - rVar2.f9755g) / d22;
                    }
                }
            };
        } else {
            final int i18 = 3;
            iVar2 = new i() { // from class: h1.o
                @Override // h1.i
                public final double i(double d12) {
                    int i122 = i18;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f9687a;
                            return d.a(rVar2, d12);
                        case 1:
                            float[] fArr3 = d.f9687a;
                            return d.c(rVar2, d12);
                        case 2:
                            double d13 = rVar2.f9750b;
                            return d12 >= rVar2.f9753e ? Math.pow((d13 * d12) + rVar2.f9751c, rVar2.f9749a) : d12 * rVar2.f9752d;
                        case 3:
                            double d14 = rVar2.f9750b;
                            double d15 = rVar2.f9751c;
                            double d16 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e ? Math.pow((d14 * d12) + d15, rVar2.f9749a) + rVar2.f9754f : (d16 * d12) + rVar2.f9755g;
                        case 4:
                            float[] fArr4 = d.f9687a;
                            return d.b(rVar2, d12);
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f9687a;
                            return d.d(rVar2, d12);
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d17 = rVar2.f9750b;
                            double d18 = rVar2.f9751c;
                            double d19 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d19 ? (Math.pow(d12, 1.0d / rVar2.f9749a) - d18) / d17 : d12 / d19;
                        default:
                            double d20 = rVar2.f9750b;
                            double d21 = rVar2.f9751c;
                            double d22 = rVar2.f9752d;
                            return d12 >= rVar2.f9753e * d22 ? (Math.pow(d12 - rVar2.f9754f, 1.0d / rVar2.f9749a) - d21) / d20 : (d12 - rVar2.f9755g) / d22;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i10);
    }

    @Override // h1.c
    public final float a(int i10) {
        return this.f9739f;
    }

    @Override // h1.c
    public final float b(int i10) {
        return this.f9738e;
    }

    @Override // h1.c
    public final boolean c() {
        return this.f9748q;
    }

    @Override // h1.c
    public final long d(float f10, float f11, float f12) {
        double d6 = f10;
        m mVar = this.f9747p;
        float fI = (float) mVar.i(d6);
        float fI2 = (float) mVar.i(f11);
        float fI3 = (float) mVar.i(f12);
        float[] fArr = this.f9742i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * fI3) + (fArr[3] * fI2) + (fArr[0] * fI);
        float f14 = (fArr[7] * fI3) + (fArr[4] * fI2) + (fArr[1] * fI);
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // h1.c
    public final float e(float f10, float f11, float f12) {
        double d6 = f10;
        m mVar = this.f9747p;
        float fI = (float) mVar.i(d6);
        float fI2 = (float) mVar.i(f11);
        float fI3 = (float) mVar.i(f12);
        float[] fArr = this.f9742i;
        return (fArr[8] * fI3) + (fArr[5] * fI2) + (fArr[2] * fI);
    }

    @Override // h1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.f9740g;
        if (Float.compare(qVar.f9738e, this.f9738e) != 0 || Float.compare(qVar.f9739f, this.f9739f) != 0 || !br.l.a(this.f9737d, qVar.f9737d) || !Arrays.equals(this.f9741h, qVar.f9741h)) {
            return false;
        }
        r rVar2 = this.f9740g;
        if (rVar2 != null) {
            return br.l.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (br.l.a(this.k, qVar.k)) {
            return br.l.a(this.f9745n, qVar.f9745n);
        }
        return false;
    }

    @Override // h1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        m mVar = this.f9744m;
        return f0.a((float) mVar.i(f14), (float) mVar.i(f15), (float) mVar.i(f16), f13, cVar);
    }

    @Override // h1.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f9741h) + ((this.f9737d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f9738e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f9739f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        r rVar = this.f9740g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f9745n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263 A[EDGE_INSN: B:68:0x0263->B:69:0x0265 BREAK  A[LOOP:1: B:61:0x022b->B:67:0x025c], EDGE_INSN: B:75:0x0263->B:68:0x0263 BREAK  A[LOOP:0: B:46:0x01f4->B:52:0x0211]] */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(java.lang.String r33, float[] r34, h1.s r35, float[] r36, h1.i r37, h1.i r38, float r39, float r40, h1.r r41, int r42) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.q.<init>(java.lang.String, float[], h1.s, float[], h1.i, h1.i, float, float, h1.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d6, float f10, float f11, int i10) {
        i iVar;
        i iVar2 = f9736r;
        if (d6 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i11 = 0;
            iVar = new i() { // from class: h1.n
                @Override // h1.i
                public final double i(double d10) {
                    switch (i11) {
                        case 0:
                            if (d10 < 0.0d) {
                                d10 = 0.0d;
                            }
                            return Math.pow(d10, 1.0d / d6);
                        default:
                            if (d10 < 0.0d) {
                                d10 = 0.0d;
                            }
                            return Math.pow(d10, d6);
                    }
                }
            };
        }
        if (d6 != 1.0d) {
            final int i12 = 1;
            iVar2 = new i() { // from class: h1.n
                @Override // h1.i
                public final double i(double d10) {
                    switch (i12) {
                        case 0:
                            if (d10 < 0.0d) {
                                d10 = 0.0d;
                            }
                            return Math.pow(d10, 1.0d / d6);
                        default:
                            if (d10 < 0.0d) {
                                d10 = 0.0d;
                            }
                            return Math.pow(d10, d6);
                    }
                }
            };
        }
        i iVar3 = iVar2;
        this(str, fArr, sVar, null, iVar, iVar3, f10, f11, new r(d6, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }
}
