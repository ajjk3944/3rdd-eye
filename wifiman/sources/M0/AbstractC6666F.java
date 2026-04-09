package m0;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import com.google.ar.core.ImageFormat;
import m0.AbstractC6697d0;

/* renamed from: m0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6666F {

    /* renamed from: m0.F$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52793a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f52793a = iArr;
        }
    }

    public static final BlendMode a(int i10) {
        AbstractC6697d0.a aVar = AbstractC6697d0.f52884a;
        return AbstractC6697d0.E(i10, aVar.a()) ? BlendMode.CLEAR : AbstractC6697d0.E(i10, aVar.x()) ? BlendMode.SRC : AbstractC6697d0.E(i10, aVar.g()) ? BlendMode.DST : AbstractC6697d0.E(i10, aVar.B()) ? BlendMode.SRC_OVER : AbstractC6697d0.E(i10, aVar.k()) ? BlendMode.DST_OVER : AbstractC6697d0.E(i10, aVar.z()) ? BlendMode.SRC_IN : AbstractC6697d0.E(i10, aVar.i()) ? BlendMode.DST_IN : AbstractC6697d0.E(i10, aVar.A()) ? BlendMode.SRC_OUT : AbstractC6697d0.E(i10, aVar.j()) ? BlendMode.DST_OUT : AbstractC6697d0.E(i10, aVar.y()) ? BlendMode.SRC_ATOP : AbstractC6697d0.E(i10, aVar.h()) ? BlendMode.DST_ATOP : AbstractC6697d0.E(i10, aVar.C()) ? BlendMode.XOR : AbstractC6697d0.E(i10, aVar.t()) ? BlendMode.PLUS : AbstractC6697d0.E(i10, aVar.q()) ? BlendMode.MODULATE : AbstractC6697d0.E(i10, aVar.v()) ? BlendMode.SCREEN : AbstractC6697d0.E(i10, aVar.s()) ? BlendMode.OVERLAY : AbstractC6697d0.E(i10, aVar.e()) ? BlendMode.DARKEN : AbstractC6697d0.E(i10, aVar.o()) ? BlendMode.LIGHTEN : AbstractC6697d0.E(i10, aVar.d()) ? BlendMode.COLOR_DODGE : AbstractC6697d0.E(i10, aVar.c()) ? BlendMode.COLOR_BURN : AbstractC6697d0.E(i10, aVar.m()) ? BlendMode.HARD_LIGHT : AbstractC6697d0.E(i10, aVar.w()) ? BlendMode.SOFT_LIGHT : AbstractC6697d0.E(i10, aVar.f()) ? BlendMode.DIFFERENCE : AbstractC6697d0.E(i10, aVar.l()) ? BlendMode.EXCLUSION : AbstractC6697d0.E(i10, aVar.r()) ? BlendMode.MULTIPLY : AbstractC6697d0.E(i10, aVar.n()) ? BlendMode.HUE : AbstractC6697d0.E(i10, aVar.u()) ? BlendMode.SATURATION : AbstractC6697d0.E(i10, aVar.b()) ? BlendMode.COLOR : AbstractC6697d0.E(i10, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final int b(BlendMode blendMode) {
        switch (a.f52793a[blendMode.ordinal()]) {
            case 1:
                return AbstractC6697d0.f52884a.a();
            case 2:
                return AbstractC6697d0.f52884a.x();
            case 3:
                return AbstractC6697d0.f52884a.g();
            case 4:
                return AbstractC6697d0.f52884a.B();
            case 5:
                return AbstractC6697d0.f52884a.k();
            case 6:
                return AbstractC6697d0.f52884a.z();
            case 7:
                return AbstractC6697d0.f52884a.i();
            case 8:
                return AbstractC6697d0.f52884a.A();
            case 9:
                return AbstractC6697d0.f52884a.j();
            case 10:
                return AbstractC6697d0.f52884a.y();
            case 11:
                return AbstractC6697d0.f52884a.h();
            case 12:
                return AbstractC6697d0.f52884a.C();
            case 13:
                return AbstractC6697d0.f52884a.t();
            case 14:
                return AbstractC6697d0.f52884a.q();
            case 15:
                return AbstractC6697d0.f52884a.v();
            case 16:
                return AbstractC6697d0.f52884a.s();
            case 17:
                return AbstractC6697d0.f52884a.e();
            case 18:
                return AbstractC6697d0.f52884a.o();
            case 19:
                return AbstractC6697d0.f52884a.d();
            case 20:
                return AbstractC6697d0.f52884a.c();
            case 21:
                return AbstractC6697d0.f52884a.m();
            case ImageFormat.RGBA_FP16 /* 22 */:
                return AbstractC6697d0.f52884a.w();
            case 23:
                return AbstractC6697d0.f52884a.f();
            case 24:
                return AbstractC6697d0.f52884a.l();
            case 25:
                return AbstractC6697d0.f52884a.r();
            case 26:
                return AbstractC6697d0.f52884a.n();
            case 27:
                return AbstractC6697d0.f52884a.u();
            case 28:
                return AbstractC6697d0.f52884a.b();
            case 29:
                return AbstractC6697d0.f52884a.p();
            default:
                return AbstractC6697d0.f52884a.B();
        }
    }

    public static final PorterDuff.Mode c(int i10) {
        AbstractC6697d0.a aVar = AbstractC6697d0.f52884a;
        return AbstractC6697d0.E(i10, aVar.a()) ? PorterDuff.Mode.CLEAR : AbstractC6697d0.E(i10, aVar.x()) ? PorterDuff.Mode.SRC : AbstractC6697d0.E(i10, aVar.g()) ? PorterDuff.Mode.DST : AbstractC6697d0.E(i10, aVar.B()) ? PorterDuff.Mode.SRC_OVER : AbstractC6697d0.E(i10, aVar.k()) ? PorterDuff.Mode.DST_OVER : AbstractC6697d0.E(i10, aVar.z()) ? PorterDuff.Mode.SRC_IN : AbstractC6697d0.E(i10, aVar.i()) ? PorterDuff.Mode.DST_IN : AbstractC6697d0.E(i10, aVar.A()) ? PorterDuff.Mode.SRC_OUT : AbstractC6697d0.E(i10, aVar.j()) ? PorterDuff.Mode.DST_OUT : AbstractC6697d0.E(i10, aVar.y()) ? PorterDuff.Mode.SRC_ATOP : AbstractC6697d0.E(i10, aVar.h()) ? PorterDuff.Mode.DST_ATOP : AbstractC6697d0.E(i10, aVar.C()) ? PorterDuff.Mode.XOR : AbstractC6697d0.E(i10, aVar.t()) ? PorterDuff.Mode.ADD : AbstractC6697d0.E(i10, aVar.v()) ? PorterDuff.Mode.SCREEN : AbstractC6697d0.E(i10, aVar.s()) ? PorterDuff.Mode.OVERLAY : AbstractC6697d0.E(i10, aVar.e()) ? PorterDuff.Mode.DARKEN : AbstractC6697d0.E(i10, aVar.o()) ? PorterDuff.Mode.LIGHTEN : AbstractC6697d0.E(i10, aVar.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
