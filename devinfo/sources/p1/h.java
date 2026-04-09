package p1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import j$.util.function.DoubleUnaryOperator$CC;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h {
    public static final Bitmap a(int i4, int i10, int i11, q1.c cVar) {
        Bitmap.Config config;
        ColorSpace rgb;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace colorSpaceA;
        ColorSpace colorSpace;
        Bitmap.Config configB = b(i11);
        if (nk.k.a(cVar, q1.d.f32080e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (nk.k.a(cVar, q1.d.f32090q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (nk.k.a(cVar, q1.d.f32091r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (nk.k.a(cVar, q1.d.f32088o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (nk.k.a(cVar, q1.d.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (nk.k.a(cVar, q1.d.f32083i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (nk.k.a(cVar, q1.d.f32093t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (nk.k.a(cVar, q1.d.f32092s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (nk.k.a(cVar, q1.d.f32084k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (nk.k.a(cVar, q1.d.f32085l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (nk.k.a(cVar, q1.d.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (nk.k.a(cVar, q1.d.f32082h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (nk.k.a(cVar, q1.d.f32081f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (nk.k.a(cVar, q1.d.f32086m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (nk.k.a(cVar, q1.d.f32089p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!nk.k.a(cVar, q1.d.f32087n)) {
                if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = v.a(cVar)) != null) {
                    rgb = colorSpaceA;
                    config = configB;
                    return Bitmap.createBitmap((DisplayMetrics) null, i4, i10, config, true, rgb);
                }
                if (cVar instanceof q1.q) {
                    String str = cVar.f32073a;
                    q1.q qVar = (q1.q) cVar;
                    float[] fArrA = qVar.f32124d.a();
                    q1.r rVar = qVar.g;
                    if (rVar != null) {
                        config = configB;
                        transferParameters = new ColorSpace.Rgb.TransferParameters(rVar.f32137b, rVar.f32138c, rVar.f32139d, rVar.f32140e, rVar.f32141f, rVar.g, rVar.f32136a);
                    } else {
                        config = configB;
                        transferParameters = null;
                    }
                    if (transferParameters != null) {
                        rgb = new ColorSpace.Rgb(str, qVar.f32127h, fArrA, transferParameters);
                    } else {
                        float[] fArr = qVar.f32127h;
                        final q1.p pVar = qVar.f32130l;
                        final int i12 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: p1.u
                            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i13 = i12;
                                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d10) {
                                switch (i12) {
                                }
                                return ((Number) pVar.invoke(Double.valueOf(d10))).doubleValue();
                            }

                            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i13 = i12;
                                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                            }
                        };
                        final q1.p pVar2 = qVar.f32133o;
                        final int i13 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: p1.u
                            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i132 = i13;
                                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d10) {
                                switch (i13) {
                                }
                                return ((Number) pVar2.invoke(Double.valueOf(d10))).doubleValue();
                            }

                            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i132 = i13;
                                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                            }
                        }, qVar.f32125e, qVar.f32126f);
                    }
                } else {
                    config = configB;
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i4, i10, config, true, rgb);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        config = configB;
        return Bitmap.createBitmap((DisplayMetrics) null, i4, i10, config, true, rgb);
    }

    public static final Bitmap.Config b(int i4) {
        if (i4 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i4 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i4 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i4 != 3) ? (i10 < 26 || i4 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final int c(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i4 < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
