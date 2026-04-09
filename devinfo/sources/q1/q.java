package q1;

import java.util.Arrays;
import p1.z;
import pf.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final u f32123r = new u(7);

    /* renamed from: d, reason: collision with root package name */
    public final s f32124d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32125e;

    /* renamed from: f, reason: collision with root package name */
    public final float f32126f;
    public final r g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f32127h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f32128i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final i f32129k;

    /* renamed from: l, reason: collision with root package name */
    public final p f32130l;

    /* renamed from: m, reason: collision with root package name */
    public final m f32131m;

    /* renamed from: n, reason: collision with root package name */
    public final i f32132n;

    /* renamed from: o, reason: collision with root package name */
    public final p f32133o;

    /* renamed from: p, reason: collision with root package name */
    public final m f32134p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f32135q;

    public q(String str, float[] fArr, s sVar, final r rVar, int i4) {
        i iVar;
        i iVar2;
        double d10 = rVar.f32136a;
        boolean z3 = d10 == -3.0d;
        double d11 = rVar.g;
        double d12 = rVar.f32141f;
        if (z3) {
            final int i10 = 4;
            iVar = new i() { // from class: q1.o
                @Override // q1.i
                public final double a(double d13) {
                    int i11 = i10;
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            float[] fArr2 = d.f32076a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f32076a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f32137b;
                            return d13 >= rVar2.f32140e ? Math.pow((d14 * d13) + rVar2.f32138c, rVar2.f32136a) : d13 * rVar2.f32139d;
                        case 3:
                            double d15 = rVar2.f32137b;
                            double d16 = rVar2.f32138c;
                            double d17 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e ? Math.pow((d15 * d13) + d16, rVar2.f32136a) + rVar2.f32141f : (d17 * d13) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f32076a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f32076a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f32137b;
                            double d19 = rVar2.f32138c;
                            double d20 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d20 ? (Math.pow(d13, 1.0d / rVar2.f32136a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f32137b;
                            double d22 = rVar2.f32138c;
                            double d23 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d23 ? (Math.pow(d13 - rVar2.f32141f, 1.0d / rVar2.f32136a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i11 = 5;
            iVar = new i() { // from class: q1.o
                @Override // q1.i
                public final double a(double d13) {
                    int i112 = i11;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f32076a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f32076a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f32137b;
                            return d13 >= rVar2.f32140e ? Math.pow((d14 * d13) + rVar2.f32138c, rVar2.f32136a) : d13 * rVar2.f32139d;
                        case 3:
                            double d15 = rVar2.f32137b;
                            double d16 = rVar2.f32138c;
                            double d17 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e ? Math.pow((d15 * d13) + d16, rVar2.f32136a) + rVar2.f32141f : (d17 * d13) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f32076a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f32076a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f32137b;
                            double d19 = rVar2.f32138c;
                            double d20 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d20 ? (Math.pow(d13, 1.0d / rVar2.f32136a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f32137b;
                            double d22 = rVar2.f32138c;
                            double d23 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d23 ? (Math.pow(d13 - rVar2.f32141f, 1.0d / rVar2.f32136a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i12 = 6;
            iVar = new i() { // from class: q1.o
                @Override // q1.i
                public final double a(double d13) {
                    int i112 = i12;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f32076a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f32076a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f32137b;
                            return d13 >= rVar2.f32140e ? Math.pow((d14 * d13) + rVar2.f32138c, rVar2.f32136a) : d13 * rVar2.f32139d;
                        case 3:
                            double d15 = rVar2.f32137b;
                            double d16 = rVar2.f32138c;
                            double d17 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e ? Math.pow((d15 * d13) + d16, rVar2.f32136a) + rVar2.f32141f : (d17 * d13) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f32076a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f32076a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f32137b;
                            double d19 = rVar2.f32138c;
                            double d20 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d20 ? (Math.pow(d13, 1.0d / rVar2.f32136a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f32137b;
                            double d22 = rVar2.f32138c;
                            double d23 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d23 ? (Math.pow(d13 - rVar2.f32141f, 1.0d / rVar2.f32136a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else {
            final int i13 = 7;
            iVar = new i() { // from class: q1.o
                @Override // q1.i
                public final double a(double d13) {
                    int i112 = i13;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f32076a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f32076a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f32137b;
                            return d13 >= rVar2.f32140e ? Math.pow((d14 * d13) + rVar2.f32138c, rVar2.f32136a) : d13 * rVar2.f32139d;
                        case 3:
                            double d15 = rVar2.f32137b;
                            double d16 = rVar2.f32138c;
                            double d17 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e ? Math.pow((d15 * d13) + d16, rVar2.f32136a) + rVar2.f32141f : (d17 * d13) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f32076a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f32076a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f32137b;
                            double d19 = rVar2.f32138c;
                            double d20 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d20 ? (Math.pow(d13, 1.0d / rVar2.f32136a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f32137b;
                            double d22 = rVar2.f32138c;
                            double d23 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d23 ? (Math.pow(d13 - rVar2.f32141f, 1.0d / rVar2.f32136a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        }
        if (d10 == -3.0d) {
            final int i14 = 0;
            iVar2 = new i() { // from class: q1.o
                @Override // q1.i
                public final double a(double d13) {
                    int i112 = i14;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f32076a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f32076a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f32137b;
                            return d13 >= rVar2.f32140e ? Math.pow((d14 * d13) + rVar2.f32138c, rVar2.f32136a) : d13 * rVar2.f32139d;
                        case 3:
                            double d15 = rVar2.f32137b;
                            double d16 = rVar2.f32138c;
                            double d17 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e ? Math.pow((d15 * d13) + d16, rVar2.f32136a) + rVar2.f32141f : (d17 * d13) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f32076a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f32076a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f32137b;
                            double d19 = rVar2.f32138c;
                            double d20 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d20 ? (Math.pow(d13, 1.0d / rVar2.f32136a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f32137b;
                            double d22 = rVar2.f32138c;
                            double d23 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d23 ? (Math.pow(d13 - rVar2.f32141f, 1.0d / rVar2.f32136a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i15 = 1;
            iVar2 = new i() { // from class: q1.o
                @Override // q1.i
                public final double a(double d13) {
                    int i112 = i15;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f32076a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f32076a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f32137b;
                            return d13 >= rVar2.f32140e ? Math.pow((d14 * d13) + rVar2.f32138c, rVar2.f32136a) : d13 * rVar2.f32139d;
                        case 3:
                            double d15 = rVar2.f32137b;
                            double d16 = rVar2.f32138c;
                            double d17 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e ? Math.pow((d15 * d13) + d16, rVar2.f32136a) + rVar2.f32141f : (d17 * d13) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f32076a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f32076a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f32137b;
                            double d19 = rVar2.f32138c;
                            double d20 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d20 ? (Math.pow(d13, 1.0d / rVar2.f32136a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f32137b;
                            double d22 = rVar2.f32138c;
                            double d23 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d23 ? (Math.pow(d13 - rVar2.f32141f, 1.0d / rVar2.f32136a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i16 = 2;
            iVar2 = new i() { // from class: q1.o
                @Override // q1.i
                public final double a(double d13) {
                    int i112 = i16;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f32076a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f32076a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f32137b;
                            return d13 >= rVar2.f32140e ? Math.pow((d14 * d13) + rVar2.f32138c, rVar2.f32136a) : d13 * rVar2.f32139d;
                        case 3:
                            double d15 = rVar2.f32137b;
                            double d16 = rVar2.f32138c;
                            double d17 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e ? Math.pow((d15 * d13) + d16, rVar2.f32136a) + rVar2.f32141f : (d17 * d13) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f32076a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f32076a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f32137b;
                            double d19 = rVar2.f32138c;
                            double d20 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d20 ? (Math.pow(d13, 1.0d / rVar2.f32136a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f32137b;
                            double d22 = rVar2.f32138c;
                            double d23 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d23 ? (Math.pow(d13 - rVar2.f32141f, 1.0d / rVar2.f32136a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else {
            final int i17 = 3;
            iVar2 = new i() { // from class: q1.o
                @Override // q1.i
                public final double a(double d13) {
                    int i112 = i17;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f32076a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f32076a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f32137b;
                            return d13 >= rVar2.f32140e ? Math.pow((d14 * d13) + rVar2.f32138c, rVar2.f32136a) : d13 * rVar2.f32139d;
                        case 3:
                            double d15 = rVar2.f32137b;
                            double d16 = rVar2.f32138c;
                            double d17 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e ? Math.pow((d15 * d13) + d16, rVar2.f32136a) + rVar2.f32141f : (d17 * d13) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f32076a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f32076a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f32137b;
                            double d19 = rVar2.f32138c;
                            double d20 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d20 ? (Math.pow(d13, 1.0d / rVar2.f32136a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f32137b;
                            double d22 = rVar2.f32138c;
                            double d23 = rVar2.f32139d;
                            return d13 >= rVar2.f32140e * d23 ? (Math.pow(d13 - rVar2.f32141f, 1.0d / rVar2.f32136a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i4);
    }

    @Override // q1.c
    public final float a(int i4) {
        return this.f32126f;
    }

    @Override // q1.c
    public final float b(int i4) {
        return this.f32125e;
    }

    @Override // q1.c
    public final boolean c() {
        return this.f32135q;
    }

    @Override // q1.c
    public final long d(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f32134p;
        float fA = (float) mVar.a(d10);
        float fA2 = (float) mVar.a(f11);
        float fA3 = (float) mVar.a(f12);
        float[] fArr = this.f32128i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        float f14 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // q1.c
    public final float e(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f32134p;
        float fA = (float) mVar.a(d10);
        float fA2 = (float) mVar.a(f11);
        float fA3 = (float) mVar.a(f12);
        float[] fArr = this.f32128i;
        return (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
    }

    @Override // q1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.g;
        if (Float.compare(qVar.f32125e, this.f32125e) != 0 || Float.compare(qVar.f32126f, this.f32126f) != 0 || !nk.k.a(this.f32124d, qVar.f32124d) || !Arrays.equals(this.f32127h, qVar.f32127h)) {
            return false;
        }
        r rVar2 = this.g;
        if (rVar2 != null) {
            return nk.k.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (nk.k.a(this.f32129k, qVar.f32129k)) {
            return nk.k.a(this.f32132n, qVar.f32132n);
        }
        return false;
    }

    @Override // q1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        m mVar = this.f32131m;
        return z.a((float) mVar.a(f14), (float) mVar.a(f15), (float) mVar.a(f16), f13, cVar);
    }

    @Override // q1.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f32127h) + ((this.f32124d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f32125e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f32126f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        r rVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f32132n.hashCode() + ((this.f32129k.hashCode() + (iHashCode2 * 31)) * 31);
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
    public q(java.lang.String r33, float[] r34, q1.s r35, float[] r36, q1.i r37, q1.i r38, float r39, float r40, q1.r r41, int r42) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.q.<init>(java.lang.String, float[], q1.s, float[], q1.i, q1.i, float, float, q1.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d10, float f10, float f11, int i4) {
        i iVar;
        i iVar2 = f32123r;
        if (d10 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i10 = 0;
            iVar = new i() { // from class: q1.n
                @Override // q1.i
                public final double a(double d11) {
                    switch (i10) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i11 = 1;
            iVar2 = new i() { // from class: q1.n
                @Override // q1.i
                public final double a(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f10, f11, new r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i4);
    }
}
