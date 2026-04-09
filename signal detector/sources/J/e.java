package J;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public char f2012a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f2013b;

    public e(char c6, float[] fArr) {
        this.f2012a = c6;
        this.f2013b = fArr;
    }

    public static void a(Path path, float f2, float f5, float f6, float f7, float f8, float f9, float f10, boolean z6, boolean z7) {
        double d6;
        double d7;
        double radians = Math.toRadians(f10);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d8 = f2;
        double d9 = f5;
        double d10 = f8;
        double d11 = ((d9 * dSin) + (d8 * dCos)) / d10;
        double d12 = f9;
        double d13 = ((d9 * dCos) + ((-f2) * dSin)) / d12;
        double d14 = f7;
        double d15 = ((d14 * dSin) + (f6 * dCos)) / d10;
        double d16 = ((d14 * dCos) + ((-f6) * dSin)) / d12;
        double d17 = d11 - d15;
        double d18 = d13 - d16;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d13 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d21);
            float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, f2, f5, f6, f7, f8 * fSqrt, fSqrt * f9, f10, z6, z7);
            return;
        }
        double dSqrt = Math.sqrt(d22);
        double d23 = dSqrt * d17;
        double d24 = dSqrt * d18;
        if (z6 == z7) {
            d6 = d19 - d24;
            d7 = d20 + d23;
        } else {
            d6 = d19 + d24;
            d7 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d7, d11 - d6);
        double dAtan22 = Math.atan2(d16 - d7, d15 - d6) - dAtan2;
        if (z7 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d6 * d10;
        double d26 = d7 * d12;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d10;
        double d30 = d29 * dCos2;
        double d31 = d12 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d12 * dCos2;
        double d35 = dAtan22 / iCeil;
        double d36 = (dCos3 * d34) + (dSin3 * d33);
        double d37 = d8;
        double d38 = d9;
        int i = 0;
        double d39 = dAtan2;
        while (i < iCeil) {
            double d40 = d39 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i3 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d42 = (d34 * dSin4) + (d10 * dSin2 * dCos4) + d28;
            double d43 = (d30 * dSin4) - (d31 * dCos4);
            double d44 = (dCos4 * d34) + (dSin4 * d33);
            double d45 = d40 - d39;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d32 * dSqrt2) + d37), (float) ((d36 * dSqrt2) + d38), (float) (d41 - (dSqrt2 * d43)), (float) (d42 - (dSqrt2 * d44)), (float) d41, (float) d42);
            i++;
            d38 = d42;
            dCos2 = dCos2;
            d33 = d33;
            d39 = d40;
            d36 = d44;
            d37 = d41;
            iCeil = i3;
            d32 = d43;
            d35 = d35;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(e[] eVarArr, Path path) {
        int i;
        float[] fArr;
        int i3;
        e eVar;
        int i6;
        char c6;
        float f2;
        float f5;
        e eVar2;
        boolean z6;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        e[] eVarArr2 = eVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = eVarArr2.length;
        int i7 = 0;
        int i8 = 0;
        char c7 = 'm';
        while (i8 < length) {
            e eVar3 = eVarArr2[i8];
            char c8 = eVar3.f2012a;
            float[] fArr3 = eVar3.f2013b;
            float f14 = fArr2[i7];
            float f15 = fArr2[1];
            float f16 = fArr2[2];
            float f17 = fArr2[3];
            float f18 = fArr2[4];
            int i9 = i7;
            float f19 = fArr2[5];
            switch (c8) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                default:
                    i = 2;
                    break;
            }
            float f20 = f18;
            float f21 = f19;
            float f22 = f14;
            float f23 = f15;
            int i10 = i9;
            while (i10 < fArr3.length) {
                if (c8 == 'A') {
                    fArr = fArr3;
                    i3 = i10;
                    eVar = eVar3;
                    float f24 = f22;
                    float f25 = f23;
                    i6 = i8;
                    c6 = c8;
                    int i11 = i3 + 5;
                    int i12 = i3 + 6;
                    a(path, f24, f25, fArr[i11], fArr[i12], fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3] != 0.0f ? 1 : i9, fArr[i3 + 4] != 0.0f ? 1 : i9);
                    f16 = fArr[i11];
                    f2 = fArr[i12];
                    f17 = f2;
                    f5 = f16;
                } else if (c8 == 'C') {
                    fArr = fArr3;
                    i3 = i10;
                    i6 = i8;
                    eVar = eVar3;
                    c6 = c8;
                    int i13 = i3 + 2;
                    int i14 = i3 + 3;
                    int i15 = i3 + 4;
                    int i16 = i3 + 5;
                    path2.cubicTo(fArr[i3], fArr[i3 + 1], fArr[i13], fArr[i14], fArr[i15], fArr[i16]);
                    float f26 = fArr[i15];
                    float f27 = fArr[i16];
                    f16 = fArr[i13];
                    f17 = fArr[i14];
                    f2 = f27;
                    f5 = f26;
                } else if (c8 == 'H') {
                    fArr = fArr3;
                    i3 = i10;
                    eVar = eVar3;
                    c6 = c8;
                    f2 = f23;
                    i6 = i8;
                    path2.lineTo(fArr[i3], f2);
                    f5 = fArr[i3];
                } else if (c8 == 'Q') {
                    fArr = fArr3;
                    i3 = i10;
                    i6 = i8;
                    eVar = eVar3;
                    c6 = c8;
                    int i17 = i3 + 1;
                    int i18 = i3 + 2;
                    int i19 = i3 + 3;
                    path2.quadTo(fArr[i3], fArr[i17], fArr[i18], fArr[i19]);
                    float f28 = fArr[i3];
                    float f29 = fArr[i17];
                    float f30 = fArr[i18];
                    float f31 = fArr[i19];
                    f16 = f28;
                    f17 = f29;
                    f5 = f30;
                    f2 = f31;
                } else if (c8 == 'V') {
                    fArr = fArr3;
                    i3 = i10;
                    i6 = i8;
                    eVar = eVar3;
                    f5 = f22;
                    c6 = c8;
                    path2.lineTo(f5, fArr[i3]);
                    f2 = fArr[i3];
                } else if (c8 != 'a') {
                    if (c8 == 'c') {
                        fArr = fArr3;
                        i3 = i10;
                        int i20 = i3 + 2;
                        int i21 = i3 + 3;
                        int i22 = i3 + 4;
                        int i23 = i3 + 5;
                        path2.rCubicTo(fArr[i3], fArr[i3 + 1], fArr[i20], fArr[i21], fArr[i22], fArr[i23]);
                        float f32 = fArr[i20] + f22;
                        float f33 = fArr[i21] + f23;
                        f22 += fArr[i22];
                        f23 += fArr[i23];
                        f16 = f32;
                        f17 = f33;
                    } else if (c8 != 'h') {
                        if (c8 != 'q') {
                            if (c8 != 'v') {
                                if (c8 == 'L') {
                                    fArr = fArr3;
                                    i3 = i10;
                                    int i24 = i3 + 1;
                                    path2.lineTo(fArr[i3], fArr[i24]);
                                    f5 = fArr[i3];
                                    f2 = fArr[i24];
                                } else if (c8 == 'M') {
                                    fArr = fArr3;
                                    i3 = i10;
                                    f5 = fArr[i3];
                                    f2 = fArr[i3 + 1];
                                    if (i3 > 0) {
                                        path2.lineTo(f5, f2);
                                    } else {
                                        path2.moveTo(f5, f2);
                                        f20 = f5;
                                        f21 = f2;
                                    }
                                } else if (c8 != 'S') {
                                    if (c8 == 'T') {
                                        fArr = fArr3;
                                        i3 = i10;
                                        if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                            f22 = (f22 * 2.0f) - f16;
                                            f23 = (f23 * 2.0f) - f17;
                                        }
                                        int i25 = i3 + 1;
                                        path2.quadTo(f22, f23, fArr[i3], fArr[i25]);
                                        f5 = fArr[i3];
                                        f2 = fArr[i25];
                                        eVar = eVar3;
                                        f16 = f22;
                                        f17 = f23;
                                    } else if (c8 == 'l') {
                                        fArr = fArr3;
                                        i3 = i10;
                                        int i26 = i3 + 1;
                                        path2.rLineTo(fArr[i3], fArr[i26]);
                                        f22 += fArr[i3];
                                        f9 = fArr[i26];
                                    } else if (c8 == 'm') {
                                        fArr = fArr3;
                                        i3 = i10;
                                        float f34 = fArr[i3];
                                        f22 += f34;
                                        float f35 = fArr[i3 + 1];
                                        f23 += f35;
                                        if (i3 > 0) {
                                            path2.rLineTo(f34, f35);
                                        } else {
                                            path2.rMoveTo(f34, f35);
                                            eVar = eVar3;
                                            f5 = f22;
                                            f20 = f5;
                                            f2 = f23;
                                            f21 = f2;
                                        }
                                    } else if (c8 != 's') {
                                        if (c8 != 't') {
                                            fArr = fArr3;
                                            i3 = i10;
                                            eVar = eVar3;
                                            f5 = f22;
                                        } else {
                                            if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                f12 = f22 - f16;
                                                f13 = f23 - f17;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i27 = i10 + 1;
                                            path2.rQuadTo(f12, f13, fArr3[i10], fArr3[i27]);
                                            float f36 = f12 + f22;
                                            float f37 = f13 + f23;
                                            float f38 = f22 + fArr3[i10];
                                            f23 += fArr3[i27];
                                            f17 = f37;
                                            fArr = fArr3;
                                            i3 = i10;
                                            eVar = eVar3;
                                            f5 = f38;
                                            f16 = f36;
                                        }
                                        f2 = f23;
                                    } else {
                                        if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                            f10 = f23 - f17;
                                            f11 = f22 - f16;
                                        } else {
                                            f11 = 0.0f;
                                            f10 = 0.0f;
                                        }
                                        int i28 = i10;
                                        int i29 = i28 + 1;
                                        int i30 = i28 + 2;
                                        int i31 = i28 + 3;
                                        fArr = fArr3;
                                        i3 = i28;
                                        path2.rCubicTo(f11, f10, fArr3[i28], fArr3[i29], fArr3[i30], fArr3[i31]);
                                        f6 = fArr[i3] + f22;
                                        f7 = fArr[i29] + f23;
                                        f22 += fArr[i30];
                                        f8 = fArr[i31];
                                    }
                                    i6 = i8;
                                    c6 = c8;
                                } else {
                                    fArr = fArr3;
                                    i3 = i10;
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        f22 = (f22 * 2.0f) - f16;
                                        f23 = (f23 * 2.0f) - f17;
                                    }
                                    float f39 = f22;
                                    float f40 = f23;
                                    int i32 = i3 + 1;
                                    int i33 = i3 + 2;
                                    int i34 = i3 + 3;
                                    path2.cubicTo(f39, f40, fArr[i3], fArr[i32], fArr[i33], fArr[i34]);
                                    f16 = fArr[i3];
                                    f17 = fArr[i32];
                                    f5 = fArr[i33];
                                    f2 = fArr[i34];
                                }
                                i6 = i8;
                                eVar = eVar3;
                                c6 = c8;
                            } else {
                                fArr = fArr3;
                                i3 = i10;
                                path2.rLineTo(0.0f, fArr[i3]);
                                f9 = fArr[i3];
                            }
                            f23 += f9;
                        } else {
                            fArr = fArr3;
                            i3 = i10;
                            int i35 = i3 + 1;
                            int i36 = i3 + 2;
                            int i37 = i3 + 3;
                            path2.rQuadTo(fArr[i3], fArr[i35], fArr[i36], fArr[i37]);
                            f6 = fArr[i3] + f22;
                            f7 = fArr[i35] + f23;
                            f22 += fArr[i36];
                            f8 = fArr[i37];
                        }
                        f23 += f8;
                        f16 = f6;
                        f17 = f7;
                    } else {
                        fArr = fArr3;
                        i3 = i10;
                        path2.rLineTo(fArr[i3], 0.0f);
                        f22 += fArr[i3];
                    }
                    eVar = eVar3;
                    f5 = f22;
                    f2 = f23;
                    i6 = i8;
                    c6 = c8;
                } else {
                    fArr = fArr3;
                    i3 = i10;
                    int i38 = i3 + 5;
                    float f41 = fArr[i38] + f22;
                    int i39 = i3 + 6;
                    float f42 = fArr[i39] + f23;
                    float f43 = fArr[i3];
                    float f44 = fArr[i3 + 1];
                    float f45 = fArr[i3 + 2];
                    if (fArr[i3 + 3] != 0.0f) {
                        eVar2 = eVar3;
                        z6 = 1;
                    } else {
                        eVar2 = eVar3;
                        z6 = i9;
                    }
                    eVar = eVar2;
                    float f46 = f22;
                    c6 = c8;
                    float f47 = f23;
                    i6 = i8;
                    a(path, f46, f47, f41, f42, f43, f44, f45, z6, fArr[i3 + 4] != 0.0f ? 1 : i9);
                    f5 = f46 + fArr[i38];
                    f2 = f47 + fArr[i39];
                    f16 = f5;
                    f17 = f2;
                }
                i10 = i3 + i;
                path2 = path;
                eVar3 = eVar;
                c8 = c6;
                i8 = i6;
                f22 = f5;
                f23 = f2;
                c7 = c8;
                fArr3 = fArr;
            }
            fArr2[i9] = f22;
            fArr2[1] = f23;
            fArr2[2] = f16;
            fArr2[3] = f17;
            fArr2[4] = f20;
            fArr2[5] = f21;
            c7 = eVar3.f2012a;
            i8++;
            eVarArr2 = eVarArr;
            path2 = path;
            i7 = i9;
        }
    }

    public e(e eVar) {
        this.f2012a = eVar.f2012a;
        float[] fArr = eVar.f2013b;
        this.f2013b = com.bumptech.glide.d.m(fArr, fArr.length);
    }
}
