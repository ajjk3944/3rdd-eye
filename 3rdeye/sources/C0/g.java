package C0;

import android.graphics.Path;
import android.util.Log;

/* compiled from: PathParser.java */
/* loaded from: classes.dex */
public final class g {
    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            char c10 = aVar.f806a;
            a aVar2 = aVarArr2[i];
            if (c10 != aVar2.f806a || aVar.f807b.length != aVar2.f807b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static C0.g.a[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.g.c(java.lang.String):C0.g$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            a.b(c(str), path);
            return path;
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing ".concat(str), e4);
        }
    }

    public static a[] e(a[] aVarArr) {
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = new a(aVarArr[i]);
        }
        return aVarArr2;
    }

    /* compiled from: PathParser.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public char f806a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f807b;

        public a(char c10, float[] fArr) {
            this.f806a = c10;
            this.f807b = fArr;
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d12 = f10;
            double d13 = f11;
            double d14 = f14;
            double d15 = ((d13 * dSin) + (d12 * dCos)) / d14;
            double d16 = f15;
            double d17 = ((d13 * dCos) + ((-f10) * dSin)) / d16;
            double d18 = f13;
            double d19 = ((d18 * dSin) + (f12 * dCos)) / d14;
            double d20 = ((d18 * dCos) + ((-f12) * dSin)) / d16;
            double d21 = d15 - d19;
            double d22 = d17 - d20;
            double d23 = (d15 + d19) / 2.0d;
            double d24 = (d17 + d20) / 2.0d;
            double d25 = (d22 * d22) + (d21 * d21);
            if (d25 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d25);
                float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
                a(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z10, z11);
                return;
            }
            double dSqrt = Math.sqrt(d26);
            double d27 = dSqrt * d21;
            double d28 = dSqrt * d22;
            if (z10 == z11) {
                d10 = d23 - d28;
                d11 = d24 + d27;
            } else {
                d10 = d23 + d28;
                d11 = d24 - d27;
            }
            double dAtan2 = Math.atan2(d17 - d11, d15 - d10);
            double dAtan22 = Math.atan2(d20 - d11, d19 - d10) - dAtan2;
            if (z11 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d29 = d10 * d14;
            double d30 = d11 * d16;
            double d31 = (d29 * dCos) - (d30 * dSin);
            double d32 = (d30 * dCos) + (d29 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d33 = -d14;
            double d34 = d33 * dCos2;
            double d35 = d16 * dSin2;
            double d36 = (d34 * dSin3) - (d35 * dCos3);
            double d37 = d33 * dSin2;
            double d38 = d16 * dCos2;
            double d39 = dAtan22 / iCeil;
            double d40 = (dCos3 * d38) + (dSin3 * d37);
            double d41 = d12;
            double d42 = d13;
            int i = 0;
            double d43 = dAtan2;
            while (i < iCeil) {
                double d44 = d43 + d39;
                double dSin4 = Math.sin(d44);
                double dCos4 = Math.cos(d44);
                int i10 = iCeil;
                double d45 = (((d14 * dCos2) * dCos4) + d31) - (d35 * dSin4);
                double d46 = (d38 * dSin4) + (d14 * dSin2 * dCos4) + d32;
                double d47 = (d34 * dSin4) - (d35 * dCos4);
                double d48 = (dCos4 * d38) + (dSin4 * d37);
                double d49 = d44 - d43;
                double dTan = Math.tan(d49 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d36 * dSqrt2) + d41), (float) ((d40 * dSqrt2) + d42), (float) (d45 - (dSqrt2 * d47)), (float) (d46 - (dSqrt2 * d48)), (float) d45, (float) d46);
                i++;
                d42 = d46;
                dCos2 = dCos2;
                d37 = d37;
                d43 = d44;
                d40 = d48;
                d41 = d45;
                iCeil = i10;
                d36 = d47;
                d39 = d39;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated
        public static void b(a[] aVarArr, Path path) {
            int i;
            int i10;
            a aVar;
            int i11;
            char c10;
            float f10;
            float f11;
            float f12;
            float f13;
            a aVar2;
            boolean z10;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            Path path2 = path;
            float[] fArr = new float[6];
            int length = aVarArr.length;
            char c11 = 'm';
            int i12 = 0;
            char c12 = 'm';
            int i13 = 0;
            while (i13 < length) {
                a aVar3 = aVarArr[i13];
                char c13 = aVar3.f806a;
                float f22 = fArr[i12];
                float f23 = fArr[1];
                float f24 = fArr[2];
                float f25 = fArr[3];
                float f26 = fArr[4];
                float f27 = fArr[5];
                switch (c13) {
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
                        path2.moveTo(f26, f27);
                        f22 = f26;
                        f24 = f22;
                        f23 = f27;
                        f25 = f23;
                    default:
                        i = 2;
                        break;
                }
                float f28 = f23;
                float f29 = f26;
                float f30 = f27;
                float f31 = f22;
                int i14 = i12;
                while (true) {
                    float[] fArr2 = aVar3.f807b;
                    if (i14 < fArr2.length) {
                        int i15 = i12;
                        if (c13 == 'A') {
                            i10 = i14;
                            aVar = aVar3;
                            float f32 = f31;
                            float f33 = f28;
                            i11 = i13;
                            c10 = c13;
                            int i16 = i10 + 5;
                            int i17 = i10 + 6;
                            a(path, f32, f33, fArr2[i16], fArr2[i17], fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f ? 1 : i15, fArr2[i10 + 4] != 0.0f ? 1 : i15);
                            f24 = fArr2[i16];
                            f10 = fArr2[i17];
                            f25 = f10;
                            f11 = f24;
                        } else if (c13 == 'C') {
                            i10 = i14;
                            i11 = i13;
                            aVar = aVar3;
                            c10 = c13;
                            int i18 = i10 + 2;
                            int i19 = i10 + 3;
                            int i20 = i10 + 4;
                            int i21 = i10 + 5;
                            path2.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i18], fArr2[i19], fArr2[i20], fArr2[i21]);
                            float f34 = fArr2[i20];
                            float f35 = fArr2[i21];
                            f24 = fArr2[i18];
                            f25 = fArr2[i19];
                            f10 = f35;
                            f11 = f34;
                        } else if (c13 != 'H') {
                            if (c13 == 'Q') {
                                i10 = i14;
                                i11 = i13;
                                aVar = aVar3;
                                c10 = c13;
                                int i22 = i10 + 1;
                                int i23 = i10 + 2;
                                int i24 = i10 + 3;
                                path2.quadTo(fArr2[i10], fArr2[i22], fArr2[i23], fArr2[i24]);
                                f12 = fArr2[i10];
                                float f36 = fArr2[i22];
                                f13 = fArr2[i23];
                                f25 = f36;
                                f10 = fArr2[i24];
                            } else if (c13 == 'V') {
                                i10 = i14;
                                i11 = i13;
                                aVar = aVar3;
                                f11 = f31;
                                c10 = c13;
                                path2.lineTo(f11, fArr2[i10]);
                                f10 = fArr2[i10];
                            } else if (c13 != 'a') {
                                if (c13 == 'c') {
                                    i10 = i14;
                                    int i25 = i10 + 2;
                                    int i26 = i10 + 3;
                                    int i27 = i10 + 4;
                                    int i28 = i10 + 5;
                                    path2.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                    float f37 = fArr2[i25] + f31;
                                    float f38 = f28 + fArr2[i26];
                                    f31 += fArr2[i27];
                                    f28 += fArr2[i28];
                                    f24 = f37;
                                    f25 = f38;
                                } else if (c13 != 'h') {
                                    if (c13 != 'q') {
                                        if (c13 != 'v') {
                                            if (c13 == 'L') {
                                                i10 = i14;
                                                int i29 = i10 + 1;
                                                path2.lineTo(fArr2[i10], fArr2[i29]);
                                                f11 = fArr2[i10];
                                                f10 = fArr2[i29];
                                            } else if (c13 == 'M') {
                                                i10 = i14;
                                                f11 = fArr2[i10];
                                                f10 = fArr2[i10 + 1];
                                                if (i10 > 0) {
                                                    path2.lineTo(f11, f10);
                                                } else {
                                                    path2.moveTo(f11, f10);
                                                    f29 = f11;
                                                    f30 = f10;
                                                }
                                            } else if (c13 == 'S') {
                                                i10 = i14;
                                                if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                    f31 = (f31 * 2.0f) - f24;
                                                    f28 = (f28 * 2.0f) - f25;
                                                }
                                                float f39 = f31;
                                                float f40 = f28;
                                                int i30 = i10 + 1;
                                                int i31 = i10 + 2;
                                                int i32 = i10 + 3;
                                                path2.cubicTo(f39, f40, fArr2[i10], fArr2[i30], fArr2[i31], fArr2[i32]);
                                                f12 = fArr2[i10];
                                                float f41 = fArr2[i30];
                                                f13 = fArr2[i31];
                                                f25 = f41;
                                                f10 = fArr2[i32];
                                                i11 = i13;
                                                aVar = aVar3;
                                                c10 = c13;
                                            } else if (c13 == 'T') {
                                                i10 = i14;
                                                if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                    f31 = (f31 * 2.0f) - f24;
                                                    f28 = (f28 * 2.0f) - f25;
                                                }
                                                float f42 = f28;
                                                float f43 = fArr2[i10];
                                                int i33 = i10 + 1;
                                                path2.quadTo(f31, f42, f43, fArr2[i33]);
                                                f25 = f42;
                                                f11 = fArr2[i10];
                                                f10 = fArr2[i33];
                                                i11 = i13;
                                                aVar = aVar3;
                                                f24 = f31;
                                                c10 = c13;
                                            } else if (c13 == 'l') {
                                                i10 = i14;
                                                int i34 = i10 + 1;
                                                path2.rLineTo(fArr2[i10], fArr2[i34]);
                                                f31 += fArr2[i10];
                                                f17 = fArr2[i34];
                                            } else if (c13 == c11) {
                                                i10 = i14;
                                                float f44 = fArr2[i10];
                                                f31 += f44;
                                                float f45 = fArr2[i10 + 1];
                                                f28 += f45;
                                                if (i10 > 0) {
                                                    path2.rLineTo(f44, f45);
                                                } else {
                                                    path2.rMoveTo(f44, f45);
                                                    aVar = aVar3;
                                                    f11 = f31;
                                                    f29 = f11;
                                                    f10 = f28;
                                                    f30 = f10;
                                                    i11 = i13;
                                                    c10 = c13;
                                                }
                                            } else if (c13 == 's') {
                                                if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                    f18 = f28 - f25;
                                                    f19 = f31 - f24;
                                                } else {
                                                    f19 = 0.0f;
                                                    f18 = 0.0f;
                                                }
                                                int i35 = i14 + 1;
                                                int i36 = i14 + 2;
                                                int i37 = i14 + 3;
                                                i10 = i14;
                                                path2.rCubicTo(f19, f18, fArr2[i14], fArr2[i35], fArr2[i36], fArr2[i37]);
                                                f14 = fArr2[i10] + f31;
                                                f15 = f28 + fArr2[i35];
                                                f31 += fArr2[i36];
                                                f16 = fArr2[i37];
                                            } else if (c13 != 't') {
                                                i10 = i14;
                                            } else {
                                                if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                    f20 = f31 - f24;
                                                    f21 = f28 - f25;
                                                } else {
                                                    f21 = 0.0f;
                                                    f20 = 0.0f;
                                                }
                                                int i38 = i14 + 1;
                                                path2.rQuadTo(f20, f21, fArr2[i14], fArr2[i38]);
                                                float f46 = f20 + f31;
                                                float f47 = f28 + f21;
                                                float f48 = f31 + fArr2[i14];
                                                f28 += fArr2[i38];
                                                f25 = f47;
                                                i10 = i14;
                                                aVar = aVar3;
                                                f11 = f48;
                                                f24 = f46;
                                                f10 = f28;
                                                i11 = i13;
                                                c10 = c13;
                                            }
                                            i11 = i13;
                                            aVar = aVar3;
                                            c10 = c13;
                                        } else {
                                            i10 = i14;
                                            path2.rLineTo(0.0f, fArr2[i10]);
                                            f17 = fArr2[i10];
                                        }
                                        f28 += f17;
                                    } else {
                                        i10 = i14;
                                        int i39 = i10 + 1;
                                        int i40 = i10 + 2;
                                        int i41 = i10 + 3;
                                        path2.rQuadTo(fArr2[i10], fArr2[i39], fArr2[i40], fArr2[i41]);
                                        f14 = fArr2[i10] + f31;
                                        f15 = f28 + fArr2[i39];
                                        f31 += fArr2[i40];
                                        f16 = fArr2[i41];
                                    }
                                    f28 += f16;
                                    f24 = f14;
                                    f25 = f15;
                                } else {
                                    i10 = i14;
                                    path2.rLineTo(fArr2[i10], 0.0f);
                                    f31 += fArr2[i10];
                                }
                                aVar = aVar3;
                                f11 = f31;
                                f10 = f28;
                                i11 = i13;
                                c10 = c13;
                            } else {
                                i10 = i14;
                                int i42 = i10 + 5;
                                float f49 = fArr2[i42] + f31;
                                int i43 = i10 + 6;
                                float f50 = fArr2[i43] + f28;
                                float f51 = fArr2[i10];
                                float f52 = fArr2[i10 + 1];
                                float f53 = fArr2[i10 + 2];
                                if (fArr2[i10 + 3] != 0.0f) {
                                    aVar2 = aVar3;
                                    z10 = 1;
                                } else {
                                    aVar2 = aVar3;
                                    z10 = i15;
                                }
                                aVar = aVar2;
                                float f54 = f31;
                                c10 = c13;
                                float f55 = f28;
                                i11 = i13;
                                a(path, f54, f55, f49, f50, f51, f52, f53, z10, fArr2[i10 + 4] != 0.0f ? 1 : i15);
                                f11 = f54 + fArr2[i42];
                                f10 = f55 + fArr2[i43];
                                f24 = f11;
                                f25 = f10;
                            }
                            f24 = f12;
                            f11 = f13;
                        } else {
                            i10 = i14;
                            aVar = aVar3;
                            c10 = c13;
                            f10 = f28;
                            i11 = i13;
                            path2.lineTo(fArr2[i10], f10);
                            f11 = fArr2[i10];
                        }
                        c13 = c10;
                        aVar3 = aVar;
                        i13 = i11;
                        i12 = i15;
                        c11 = 'm';
                        f31 = f11;
                        f28 = f10;
                        c12 = c13;
                        i14 = i10 + i;
                        path2 = path;
                    }
                }
                int i44 = i12;
                fArr[i44] = f31;
                fArr[1] = f28;
                fArr[2] = f24;
                fArr[3] = f25;
                fArr[4] = f29;
                fArr[5] = f30;
                c12 = aVar3.f806a;
                i13++;
                path2 = path;
                i12 = i44;
                c11 = 'm';
            }
        }

        public a(a aVar) {
            this.f806a = aVar.f806a;
            float[] fArr = aVar.f807b;
            this.f807b = g.b(fArr, fArr.length);
        }
    }
}
