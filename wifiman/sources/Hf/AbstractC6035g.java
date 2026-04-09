package hf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Zg.AbstractC3689v;
import ff.EnumC5820a;
import j0.AbstractC6234e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.C6537m;
import la.C6562a;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.k1;
import ma.AbstractC6784a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7039f;
import org.conscrypt.PSKKeyManager;
import s.AbstractC7848i;
import s.Y;

/* renamed from: hf.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6035g {

    /* renamed from: a, reason: collision with root package name */
    private static final float f48661a = Y0.h.j(8);

    /* renamed from: b, reason: collision with root package name */
    private static final float f48662b = Y0.h.j(240);

    /* renamed from: c, reason: collision with root package name */
    private static final float f48663c = Y0.h.j(40);

    /* renamed from: hf.g$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48664a;

        static {
            int[] iArr = new int[EnumC5820a.values().length];
            try {
                iArr[EnumC5820a.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5820a.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48664a = iArr;
        }
    }

    public static final void c(androidx.compose.ui.e eVar, final float f10, final EnumC5820a direction, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        AbstractC6492s.i(direction, "direction");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2133325062);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.g(f10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(direction) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i14 = i12;
        if ((i14 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2133325062, i14, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestResultSpeedIndicator (SpeedtesResultSpeedIndicator.kt:60)");
            }
            final C6028K c6028kH = h(direction, interfaceC3540lR, (i14 >> 6) & 14);
            androidx.compose.ui.e eVarA = AbstractC6234e.a(androidx.compose.foundation.layout.r.w(Y.c(eVar4, f10, null, 0, 6, null), f48662b, f48661a), E.h.d(f48663c));
            interfaceC3540lR.U(1250025875);
            boolean zT = interfaceC3540lR.T(c6028kH) | ((i14 & 112) == 32);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: hf.e
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC6035g.d(c6028kH, f10, (InterfaceC7039f) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC7848i.a(eVarA, (InterfaceC6835l) objF, interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar3 = eVar4;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6035g.e(eVar3, f10, direction, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(C6028K c6028k, float f10, InterfaceC7039f Canvas) {
        AbstractC6492s.i(Canvas, "$this$Canvas");
        float fG = C6537m.g(Canvas.c());
        g(Canvas, c6028k.a(), fG);
        f(Canvas, 0.0f, f10, c6028k.b(), fG);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, float f10, EnumC5820a enumC5820a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, f10, enumC5820a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    private static final void f(InterfaceC7039f interfaceC7039f, float f10, float f11, AbstractC6713l0 abstractC6713l0, float f12) {
        float fI = C6537m.i(interfaceC7039f.c());
        float fG = C6537m.g(interfaceC7039f.c()) / 2;
        boolean z10 = interfaceC7039f.getLayoutDirection() == Y0.t.Ltr;
        InterfaceC7039f.i0(interfaceC7039f, abstractC6713l0, AbstractC6532h.a((z10 ? f10 : 1.0f - f11) * fI, fG), AbstractC6532h.a((z10 ? f11 : 1.0f - f10) * fI, fG), f12, k1.f52924a.b(), null, 0.0f, null, 0, 480, null);
    }

    private static final void g(InterfaceC7039f interfaceC7039f, long j10, float f10) {
        f(interfaceC7039f, 0.0f, 1.0f, AbstractC6713l0.a.b(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(j10), C6733v0.g(j10)), 0.0f, 0.0f, 0, 14, null), f10);
    }

    private static final C6028K h(EnumC5820a enumC5820a, InterfaceC3540l interfaceC3540l, int i10) {
        Object c6028k;
        interfaceC3540l.U(2087040330);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(2087040330, i10, -1, "com.ui.wifiman.ui.speedtest.component.rememberColors (SpeedtesResultSpeedIndicator.kt:33)");
        }
        AbstractC6784a abstractC6784aA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b);
        interfaceC3540l.U(626077615);
        boolean zT = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(enumC5820a)) || (i10 & 6) == 4) | interfaceC3540l.T(abstractC6784aA);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            int i11 = a.f48664a[enumC5820a.ordinal()];
            if (i11 == 1) {
                c6028k = new C6028K(AbstractC6713l0.a.b(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(abstractC6784aA.a().b().f()), C6733v0.g(abstractC6784aA.a().a().f())), 0.0f, 0.0f, 0, 14, null), abstractC6784aA.a().g().f(), null);
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c6028k = new C6028K(AbstractC6713l0.a.b(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(abstractC6784aA.a().k().h()), C6733v0.g(abstractC6784aA.a().k().f())), 0.0f, 0.0f, 0, 14, null), abstractC6784aA.a().g().f(), null);
            }
            objF = c6028k;
            interfaceC3540l.K(objF);
        }
        C6028K c6028k2 = (C6028K) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c6028k2;
    }
}
