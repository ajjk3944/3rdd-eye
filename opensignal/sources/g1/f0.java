package g1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f9213a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public static Method f9214b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f9215c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f9216d;

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
    public static final long a(float r21, float r22, float r23, float r24, h1.c r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f0.a(float, float, float, float, h1.c):long");
    }

    public static final long b(int i10) {
        long j = i10 << 32;
        int i11 = r.f9270h;
        return j;
    }

    public static final long c(long j) {
        long j7 = j << 32;
        int i10 = r.f9270h;
        return j7;
    }

    public static long d(int i10, int i11, int i12) {
        return b(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static final yb.k e() {
        return new yb.k(new Paint(7));
    }

    public static float[] g() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static void h(Canvas canvas, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f9216d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f9214b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f9215c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f9214b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f9215c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f9214b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f9215c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f9216d = true;
        }
        if (z10) {
            try {
                Method method4 = f9214b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f9215c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean j(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long k(long j, float[] fArr) {
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
        float f20 = f14 * fIntBitsToFloat2;
        return (Float.floatToRawIntBits((((f13 * fIntBitsToFloat2) + (f10 * fIntBitsToFloat)) + f16) * f19) << 32) | (Float.floatToRawIntBits((f20 + (f11 * fIntBitsToFloat) + f17) * f19) & 4294967295L);
    }

    public static final void l(float[] fArr, f1.a aVar) {
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
        float f19 = aVar.f8398b;
        float f20 = aVar.f8399c;
        float f21 = aVar.f8400d;
        float f22 = aVar.f8401e;
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
        aVar.f8398b = Math.min(f28, Math.min(f35, Math.min(f41, f46)));
        aVar.f8399c = Math.min(f31, Math.min(f37, Math.min(f43, f47)));
        aVar.f8400d = Math.max(f28, Math.max(f35, Math.max(f41, f46)));
        aVar.f8401e = Math.max(f31, Math.max(f37, Math.max(f43, f47)));
    }

    public static final void m(float[] fArr) {
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

    public static final void n(float[] fArr, Matrix matrix) {
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

    public static final BlendMode o(int i10) {
        return i10 == 0 ? BlendMode.CLEAR : i10 == 1 ? BlendMode.SRC : i10 == 2 ? BlendMode.DST : i10 == 3 ? BlendMode.SRC_OVER : i10 == 4 ? BlendMode.DST_OVER : i10 == 5 ? BlendMode.SRC_IN : i10 == 6 ? BlendMode.DST_IN : i10 == 7 ? BlendMode.SRC_OUT : i10 == 8 ? BlendMode.DST_OUT : i10 == 9 ? BlendMode.SRC_ATOP : i10 == 10 ? BlendMode.DST_ATOP : i10 == 11 ? BlendMode.XOR : i10 == 12 ? BlendMode.PLUS : i10 == 13 ? BlendMode.MODULATE : i10 == 14 ? BlendMode.SCREEN : i10 == 15 ? BlendMode.OVERLAY : i10 == 16 ? BlendMode.DARKEN : i10 == 17 ? BlendMode.LIGHTEN : i10 == 18 ? BlendMode.COLOR_DODGE : i10 == 19 ? BlendMode.COLOR_BURN : i10 == 20 ? BlendMode.HARD_LIGHT : i10 == 21 ? BlendMode.SOFT_LIGHT : i10 == 22 ? BlendMode.DIFFERENCE : i10 == 23 ? BlendMode.EXCLUSION : i10 == 24 ? BlendMode.MULTIPLY : i10 == 25 ? BlendMode.HUE : i10 == 26 ? BlendMode.SATURATION : i10 == 27 ? BlendMode.COLOR : i10 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect p(f1.c cVar) {
        return new Rect((int) cVar.f8404a, (int) cVar.f8405b, (int) cVar.f8406c, (int) cVar.f8407d);
    }

    public static final int q(long j) {
        float[] fArr = h1.d.f9687a;
        return (int) (r.a(j, h1.d.f9691e) >>> 32);
    }

    public static final Bitmap.Config r(int i10) {
        if (i10 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i10 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i10 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || i10 != 3) ? (i11 < 26 || i10 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final f1.c s(Rect rect) {
        return new f1.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final PorterDuff.Mode t(int i10) {
        return i10 == 0 ? PorterDuff.Mode.CLEAR : i10 == 1 ? PorterDuff.Mode.SRC : i10 == 2 ? PorterDuff.Mode.DST : i10 == 3 ? PorterDuff.Mode.SRC_OVER : i10 == 4 ? PorterDuff.Mode.DST_OVER : i10 == 5 ? PorterDuff.Mode.SRC_IN : i10 == 6 ? PorterDuff.Mode.DST_IN : i10 == 7 ? PorterDuff.Mode.SRC_OUT : i10 == 8 ? PorterDuff.Mode.DST_OUT : i10 == 9 ? PorterDuff.Mode.SRC_ATOP : i10 == 10 ? PorterDuff.Mode.DST_ATOP : i10 == 11 ? PorterDuff.Mode.XOR : i10 == 12 ? PorterDuff.Mode.ADD : i10 == 14 ? PorterDuff.Mode.SCREEN : i10 == 15 ? PorterDuff.Mode.OVERLAY : i10 == 16 ? PorterDuff.Mode.DARKEN : i10 == 17 ? PorterDuff.Mode.LIGHTEN : i10 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String u(int i10) {
        return i10 == 0 ? "Clear" : i10 == 1 ? "Src" : i10 == 2 ? "Dst" : i10 == 3 ? "SrcOver" : i10 == 4 ? "DstOver" : i10 == 5 ? "SrcIn" : i10 == 6 ? "DstIn" : i10 == 7 ? "SrcOut" : i10 == 8 ? "DstOut" : i10 == 9 ? "SrcAtop" : i10 == 10 ? "DstAtop" : i10 == 11 ? "Xor" : i10 == 12 ? "Plus" : i10 == 13 ? "Modulate" : i10 == 14 ? "Screen" : i10 == 15 ? "Overlay" : i10 == 16 ? "Darken" : i10 == 17 ? "Lighten" : i10 == 18 ? "ColorDodge" : i10 == 19 ? "ColorBurn" : i10 == 20 ? "HardLight" : i10 == 21 ? "Softlight" : i10 == 22 ? "Difference" : i10 == 23 ? "Exclusion" : i10 == 24 ? "Multiply" : i10 == 25 ? "Hue" : i10 == 26 ? "Saturation" : i10 == 27 ? "Color" : i10 == 28 ? "Luminosity" : "Unknown";
    }

    public static void v(float[] fArr, float f10, float f11) {
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

    public static final int w(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public abstract void f(float f10, long j, yb.k kVar);

    public abstract f1.c i();
}
