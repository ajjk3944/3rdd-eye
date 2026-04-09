package x9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.z1;
import Yg.J;
import a1.AbstractC3751b;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6537m;
import la.C6562a;
import m0.C6733v0;
import m0.V0;
import m0.k1;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.q;
import o0.C7043j;
import o0.C7044k;
import o0.InterfaceC7039f;
import r.AbstractC7535j;
import r.H;
import r.o0;
import y.InterfaceC8558m;

/* renamed from: x9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8438h {

    /* renamed from: x9.h$a */
    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f65483a = new a();

        a() {
        }

        public final H a(o0.b animateFloat, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(animateFloat, "$this$animateFloat");
            interfaceC3540l.U(662033805);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(662033805, i10, -1, "com.ui.core.ui.component.checkbox.UiCheckBoxImpl.<anonymous> (UiCheckbox.kt:230)");
            }
            Object objD = animateFloat.d();
            K0.a aVar = K0.a.Off;
            H h10 = objD == aVar ? AbstractC7535j.h(0, 1, null) : animateFloat.f() == aVar ? AbstractC7535j.g(200) : AbstractC7535j.l(300, 0, null, 6, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return h10;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((o0.b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: x9.h$b */
    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f65484a = new b();

        b() {
        }

        public final H a(o0.b animateFloat, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(animateFloat, "$this$animateFloat");
            interfaceC3540l.U(-1971814730);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1971814730, i10, -1, "com.ui.core.ui.component.checkbox.UiCheckBoxImpl.<anonymous> (UiCheckbox.kt:213)");
            }
            Object objD = animateFloat.d();
            K0.a aVar = K0.a.Off;
            H hL = objD == aVar ? AbstractC7535j.l(300, 0, null, 6, null) : animateFloat.f() == aVar ? AbstractC7535j.g(200) : AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return hL;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((o0.b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: x9.h$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65485a;

        static {
            int[] iArr = new int[K0.a.values().length];
            try {
                iArr[K0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K0.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K0.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65485a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void e(final K0.a r32, final mh.InterfaceC6824a r33, androidx.compose.ui.e r34, boolean r35, final y.InterfaceC8558m r36, final x9.InterfaceC8433c r37, T.InterfaceC3540l r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.AbstractC8438h.e(K0.a, mh.a, androidx.compose.ui.e, boolean, y.m, x9.c, T.l, int, int):void");
    }

    private static final long f(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    private static final long g(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    private static final long h(z1 z1Var) {
        return ((C6733v0) z1Var.getValue()).u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(C8431a c8431a, z1 z1Var, z1 z1Var2, z1 z1Var3, z1 z1Var4, z1 z1Var5, InterfaceC7039f Canvas) {
        AbstractC6492s.i(Canvas, "$this$Canvas");
        C7044k c7044kE = c8431a.e();
        InterfaceC7039f.b1(Canvas, h(z1Var), AbstractC6532h.a(c7044kE.f() / 2.0f, c7044kE.f() / 2.0f), AbstractC6538n.a(C6537m.i(Canvas.c()) - c7044kE.f(), C6537m.g(Canvas.c()) - c7044kE.f()), c8431a.b(), c7044kE, 0.0f, null, 0, 224, null);
        InterfaceC7039f.b1(Canvas, g(z1Var2), 0L, AbstractC6538n.a(C6537m.i(Canvas.c()), C6537m.g(Canvas.c())), c8431a.b(), C7043j.f55038a, 0.0f, null, 0, 226, null);
        p(Canvas, f(z1Var3), k(z1Var4), l(z1Var5), c7044kE.f(), c8431a);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(K0.a aVar, InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC8433c interfaceC8433c, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(aVar, interfaceC6824a, eVar, z10, interfaceC8558m, interfaceC8433c, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final float k(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    private static final float l(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(androidx.compose.ui.e r18, final boolean r19, final mh.InterfaceC6835l r20, boolean r21, y.InterfaceC8558m r22, T.InterfaceC3540l r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.AbstractC8438h.m(androidx.compose.ui.e, boolean, mh.l, boolean, y.m, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J n(InterfaceC6835l interfaceC6835l, boolean z10) {
        interfaceC6835l.invoke(Boolean.valueOf(!z10));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(androidx.compose.ui.e eVar, boolean z10, InterfaceC6835l interfaceC6835l, boolean z11, InterfaceC8558m interfaceC8558m, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        m(eVar, z10, interfaceC6835l, z11, interfaceC8558m, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final void p(InterfaceC7039f interfaceC7039f, long j10, float f10, float f11, float f12, C8431a c8431a) {
        C7044k c7044k = new C7044k(f12, 0.0f, k1.f52924a.b(), 0, V0.f52859a.a(interfaceC7039f.d1(Y0.h.j(1))), 10, null);
        float fI = C6537m.i(interfaceC7039f.c());
        float fB = AbstractC3751b.b(0.479f, 0.5f, f11);
        float fB2 = AbstractC3751b.b(0.67f, 0.5f, f11);
        float fB3 = AbstractC3751b.b(0.525f, 0.5f, f11);
        float fB4 = AbstractC3751b.b(0.395f, 0.5f, f11);
        c8431a.a().a();
        c8431a.a().n(0.325f * fI, fB3 * fI);
        c8431a.a().u(fB * fI, fB2 * fI);
        c8431a.a().u(0.708f * fI, fI * fB4);
        c8431a.c().a(c8431a.a(), false);
        c8431a.d().a();
        c8431a.c().b(0.0f, c8431a.c().c() * f10, c8431a.d(), true);
        InterfaceC7039f.C1(interfaceC7039f, c8431a.d(), j10, 0.0f, c7044k, null, 0, 52, null);
    }

    private static final InterfaceC8433c q(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(483473039);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(483473039, i10, -1, "com.ui.core.ui.component.checkbox.rememberUiCheckboxColors (UiCheckbox.kt:147)");
        }
        AbstractC6784a abstractC6784aA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b);
        interfaceC3540l.U(605553117);
        boolean zT = interfaceC3540l.T(abstractC6784aA);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            AbstractC6784a.d dVar = AbstractC6784a.d.f53661a;
            objF = new C8432b(dVar.a().g().a(), C6733v0.k(dVar.a().g().a(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), C6733v0.k(dVar.a().g().a(), 0.44f, 0.0f, 0.0f, 0.0f, 14, null), abstractC6784aA.a().b().f(), abstractC6784aA.a().b().c(), C6733v0.k(abstractC6784aA.a().b().f(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), abstractC6784aA.a().g().g(), abstractC6784aA.a().b().f(), abstractC6784aA.a().g().f(), null);
            interfaceC3540l.K(objF);
        }
        C8432b c8432b = (C8432b) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c8432b;
    }
}
