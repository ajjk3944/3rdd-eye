package p1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import com.applovin.shadow.okio.internal.Buffer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static h0 f31031a;

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f31032b = new g0();

    /* renamed from: c, reason: collision with root package name */
    public static Method f31033c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f31034d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f31035e;

    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r21, float r22, float r23, float r24, q1.c r25) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.z.a(float, float, float, float, q1.c):long");
    }

    public static final long b(int i4) {
        long j = i4 << 32;
        int i10 = s.f31019i;
        return j;
    }

    public static final long c(long j) {
        long j8 = j << 32;
        int i4 = s.f31019i;
        return j8;
    }

    public static long d(int i4, int i10, int i11) {
        return b(((i4 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255));
    }

    public static g e(int i4, int i10, int i11) {
        Bitmap bitmapCreateBitmap;
        q1.q qVar = q1.d.f32080e;
        Bitmap.Config configB = h.b(i11);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = h.a(i4, i10, i11, qVar);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i4, i10, configB);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new g(bitmapCreateBitmap);
    }

    public static final l7.d f() {
        return new l7.d(new Paint(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long h(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.z.h(long, long):long");
    }

    public static float[] i() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static void j(Canvas canvas, boolean z3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            b.a(canvas, z3);
            return;
        }
        if (!f31035e) {
            try {
                if (i4 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f31033c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f31034d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f31033c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f31034d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f31033c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f31034d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f31035e = true;
        }
        if (z3) {
            try {
                Method method4 = f31033c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z3 || (method = f31034d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final i1.n l(mk.c cVar) {
        return new n(cVar);
    }

    public static final i1.n m(i1.n nVar, float f10, float f11, float f12, long j, j0 j0Var, boolean z3, long j8, long j9) {
        return nVar.b(new y(f10, f11, f12, j, j0Var, z3, j8, j9));
    }

    public static i1.n n(i1.n nVar, j0 j0Var, int i4) {
        float f10 = (i4 & 1) != 0 ? 1.0f : 0.72f;
        float f11 = (i4 & 2) != 0 ? 1.0f : 0.72f;
        long j = m0.f31006a;
        j0 j0Var2 = (i4 & 2048) != 0 ? f31032b : j0Var;
        boolean z3 = (i4 & Buffer.SEGMENTING_THRESHOLD) == 0;
        long j8 = a0.f30947a;
        return m(nVar, f10, f11, 0.0f, j, j0Var2, z3, j8, j8);
    }

    public static final boolean o(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long p(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f19 = 1 / (((f15 * fIntBitsToFloat2) + (f12 * fIntBitsToFloat)) + f18);
        if ((Float.floatToRawIntBits(f19) & Integer.MAX_VALUE) >= 2139095040) {
            f19 = 0.0f;
        }
        float f20 = ((f14 * fIntBitsToFloat2) + (f11 * fIntBitsToFloat) + f17) * f19;
        return (Float.floatToRawIntBits((((f13 * fIntBitsToFloat2) + (f10 * fIntBitsToFloat)) + f16) * f19) << 32) | (Float.floatToRawIntBits(f20) & 4294967295L);
    }

    public static final void q(float[] fArr, o1.a aVar) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float f19 = aVar.f30360a;
        float f20 = aVar.f30361b;
        float f21 = aVar.f30362c;
        float f22 = aVar.f30363d;
        float f23 = f12 * f19;
        float f24 = f15 * f20;
        float f25 = 1.0f / ((f23 + f24) + f18);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f10 * f19;
        float f27 = f13 * f20;
        float f28 = (f26 + f27 + f16) * f25;
        float f29 = f19 * f11;
        float f30 = f20 * f14;
        float f31 = (f29 + f30 + f17) * f25;
        float f32 = f15 * f22;
        float f33 = 1.0f / ((f23 + f32) + f18);
        if ((Float.floatToRawIntBits(f33) & Integer.MAX_VALUE) >= 2139095040) {
            f33 = 0.0f;
        }
        float f34 = f13 * f22;
        float f35 = (f26 + f34 + f16) * f33;
        float f36 = f14 * f22;
        float f37 = (f29 + f36 + f17) * f33;
        float f38 = f12 * f21;
        float f39 = 1.0f / ((f24 + f38) + f18);
        if ((Float.floatToRawIntBits(f39) & Integer.MAX_VALUE) >= 2139095040) {
            f39 = 0.0f;
        }
        float f40 = f10 * f21;
        float f41 = (f40 + f27 + f16) * f39;
        float f42 = f21 * f11;
        float f43 = (f30 + f42 + f17) * f39;
        float f44 = 1.0f / ((f38 + f32) + f18);
        float f45 = (Float.floatToRawIntBits(f44) & Integer.MAX_VALUE) < 2139095040 ? f44 : 0.0f;
        float f46 = (f40 + f34 + f16) * f45;
        float f47 = (f42 + f36 + f17) * f45;
        aVar.f30360a = Math.min(f28, Math.min(f35, Math.min(f41, f46)));
        aVar.f30361b = Math.min(f31, Math.min(f37, Math.min(f43, f47)));
        aVar.f30362c = Math.max(f28, Math.max(f35, Math.max(f41, f46)));
        aVar.f30363d = Math.max(f31, Math.max(f37, Math.max(f43, f47)));
    }

    public static final void r(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void s(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final Rect t(d3.j jVar) {
        return new Rect(jVar.f21961a, jVar.f21962b, jVar.f21963c, jVar.f21964d);
    }

    public static final int u(long j) {
        float[] fArr = q1.d.f32076a;
        return (int) (s.a(j, q1.d.f32080e) >>> 32);
    }

    public static final o1.c v(Rect rect) {
        return new o1.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static String w(int i4) {
        return i4 == 0 ? "Clear" : i4 == 1 ? "Src" : i4 == 2 ? "Dst" : i4 == 3 ? "SrcOver" : i4 == 4 ? "DstOver" : i4 == 5 ? "SrcIn" : i4 == 6 ? "DstIn" : i4 == 7 ? "SrcOut" : i4 == 8 ? "DstOut" : i4 == 9 ? "SrcAtop" : i4 == 10 ? "DstAtop" : i4 == 11 ? "Xor" : i4 == 12 ? "Plus" : i4 == 13 ? "Modulate" : i4 == 14 ? "Screen" : i4 == 15 ? "Overlay" : i4 == 16 ? "Darken" : i4 == 17 ? "Lighten" : i4 == 18 ? "ColorDodge" : i4 == 19 ? "ColorBurn" : i4 == 20 ? "HardLight" : i4 == 21 ? "Softlight" : i4 == 22 ? "Difference" : i4 == 23 ? "Exclusion" : i4 == 24 ? "Multiply" : i4 == 25 ? "Hue" : i4 == 26 ? "Saturation" : i4 == 27 ? "Color" : i4 == 28 ? "Luminosity" : "Unknown";
    }

    public static void x(float[] fArr, float f10, float f11) {
        if (fArr.length < 16) {
            return;
        }
        float f12 = (fArr[8] * 0.0f) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f13 = (fArr[9] * 0.0f) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f14 = (fArr[10] * 0.0f) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f15 = (fArr[11] * 0.0f) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    public static final int y(float f10, float[] fArr, int i4) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i4] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public abstract void g(float f10, long j, l7.d dVar);

    public abstract o1.c k();
}
