package m0;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import n0.AbstractC6858c;
import n0.C6862g;
import n0.InterfaceC6865j;

/* renamed from: m0.D0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6663D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C6663D0 f52787a = new C6663D0();

    private C6663D0() {
    }

    public static final ColorSpace e(AbstractC6858c abstractC6858c) {
        ColorSpace.Rgb rgb;
        C6862g c6862g = C6862g.f54113a;
        if (AbstractC6492s.d(abstractC6858c, c6862g.w())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.e())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.f())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.g())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.h())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.i())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.j())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.k())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.m())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.n())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.o())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.p())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.q())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.r())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.u())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (AbstractC6492s.d(abstractC6858c, c6862g.v())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(abstractC6858c instanceof n0.x)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        n0.x xVar = (n0.x) abstractC6858c;
        float[] fArrC = xVar.N().c();
        n0.y yVarL = xVar.L();
        ColorSpace.Rgb.TransferParameters transferParameters = yVarL != null ? new ColorSpace.Rgb.TransferParameters(yVarL.a(), yVarL.b(), yVarL.c(), yVarL.d(), yVarL.e(), yVarL.f(), yVarL.g()) : null;
        if (transferParameters != null) {
            rgb = new ColorSpace.Rgb(abstractC6858c.f(), xVar.K(), fArrC, transferParameters);
        } else {
            String strF = abstractC6858c.f();
            float[] fArrK = xVar.K();
            final InterfaceC6835l interfaceC6835lH = xVar.H();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: m0.z0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return C6663D0.f(interfaceC6835lH, d10);
                }
            };
            final InterfaceC6835l interfaceC6835lD = xVar.D();
            rgb = new ColorSpace.Rgb(strF, fArrK, fArrC, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: m0.A0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return C6663D0.g(interfaceC6835lD, d10);
                }
            }, abstractC6858c.d(0), abstractC6858c.c(0));
        }
        return rgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(InterfaceC6835l interfaceC6835l, double d10) {
        return ((Number) interfaceC6835l.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(InterfaceC6835l interfaceC6835l, double d10) {
        return ((Number) interfaceC6835l.invoke(Double.valueOf(d10))).doubleValue();
    }

    public static final AbstractC6858c h(final ColorSpace colorSpace) {
        n0.z zVar;
        n0.y yVar;
        int id2 = colorSpace.getId();
        if (id2 == ColorSpace.Named.SRGB.ordinal()) {
            return C6862g.f54113a.w();
        }
        if (id2 == ColorSpace.Named.ACES.ordinal()) {
            return C6862g.f54113a.e();
        }
        if (id2 == ColorSpace.Named.ACESCG.ordinal()) {
            return C6862g.f54113a.f();
        }
        if (id2 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return C6862g.f54113a.g();
        }
        if (id2 == ColorSpace.Named.BT2020.ordinal()) {
            return C6862g.f54113a.h();
        }
        if (id2 == ColorSpace.Named.BT709.ordinal()) {
            return C6862g.f54113a.i();
        }
        if (id2 == ColorSpace.Named.CIE_LAB.ordinal()) {
            return C6862g.f54113a.j();
        }
        if (id2 == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return C6862g.f54113a.k();
        }
        if (id2 == ColorSpace.Named.DCI_P3.ordinal()) {
            return C6862g.f54113a.m();
        }
        if (id2 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return C6862g.f54113a.n();
        }
        if (id2 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return C6862g.f54113a.o();
        }
        if (id2 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return C6862g.f54113a.p();
        }
        if (id2 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return C6862g.f54113a.q();
        }
        if (id2 == ColorSpace.Named.NTSC_1953.ordinal()) {
            return C6862g.f54113a.r();
        }
        if (id2 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return C6862g.f54113a.u();
        }
        if (id2 == ColorSpace.Named.SMPTE_C.ordinal()) {
            return C6862g.f54113a.v();
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return C6862g.f54113a.w();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        n0.z zVar2 = rgb.getWhitePoint().length == 3 ? new n0.z(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new n0.z(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        if (transferParameters != null) {
            zVar = zVar2;
            yVar = new n0.y(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
        } else {
            zVar = zVar2;
            yVar = null;
        }
        return new n0.x(rgb.getName(), rgb.getPrimaries(), zVar, rgb.getTransform(), new InterfaceC6865j() { // from class: m0.B0
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return C6663D0.i(colorSpace, d10);
            }
        }, new InterfaceC6865j() { // from class: m0.C0
            @Override // n0.InterfaceC6865j
            public final double a(double d10) {
                return C6663D0.j(colorSpace, d10);
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), yVar, rgb.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d10);
    }
}
