package g1;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes.dex */
public abstract class u {
    public static final ColorSpace a(h1.c cVar) {
        if (br.l.a(cVar, h1.d.f9691e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (br.l.a(cVar, h1.d.f9701q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (br.l.a(cVar, h1.d.f9702r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (br.l.a(cVar, h1.d.f9699o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (br.l.a(cVar, h1.d.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (br.l.a(cVar, h1.d.f9695i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (br.l.a(cVar, h1.d.f9704t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (br.l.a(cVar, h1.d.f9703s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (br.l.a(cVar, h1.d.k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (br.l.a(cVar, h1.d.f9696l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (br.l.a(cVar, h1.d.f9693g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (br.l.a(cVar, h1.d.f9694h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (br.l.a(cVar, h1.d.f9692f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (br.l.a(cVar, h1.d.f9697m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (br.l.a(cVar, h1.d.f9700p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (br.l.a(cVar, h1.d.f9698n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            ColorSpace colorSpace = br.l.a(cVar, h1.d.f9706v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : br.l.a(cVar, h1.d.f9707w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(cVar instanceof h1.q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = cVar.f9684a;
        h1.q qVar = (h1.q) cVar;
        float[] fArrA = qVar.f9737d.a();
        h1.r rVar = qVar.f9740g;
        ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f9750b, rVar.f9751c, rVar.f9752d, rVar.f9753e, rVar.f9754f, rVar.f9755g, rVar.f9749a) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(str, qVar.f9741h, fArrA, transferParameters);
        }
        float[] fArr = qVar.f9741h;
        final h1.p pVar = qVar.f9743l;
        final int i10 = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: g1.t
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d6) {
                switch (i10) {
                }
                return ((Number) pVar.a(Double.valueOf(d6))).doubleValue();
            }
        };
        final h1.p pVar2 = qVar.f9746o;
        final int i11 = 1;
        return new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: g1.t
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d6) {
                switch (i11) {
                }
                return ((Number) pVar2.a(Double.valueOf(d6))).doubleValue();
            }
        }, qVar.f9738e, qVar.f9739f);
    }
}
