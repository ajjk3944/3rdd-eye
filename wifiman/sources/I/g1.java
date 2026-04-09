package I;

import F.AbstractC2732w;
import F.AbstractC2735z;
import F.C2724n;
import F.EnumC2731v;
import F.InterfaceC2733x;
import android.view.KeyEvent;
import com.google.ar.core.ImageFormat;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import l0.C6537m;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import w0.AbstractC8249c;
import w0.AbstractC8250d;

/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final J.i f8319a = new J.i();

    /* renamed from: b, reason: collision with root package name */
    private final C2724n f8320b = new C2724n();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2733x f8321c = AbstractC2735z.a();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8322a;

        static {
            int[] iArr = new int[EnumC2731v.values().length];
            try {
                iArr[EnumC2731v.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2731v.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2731v.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2731v.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2731v.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC2731v.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC2731v.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC2731v.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC2731v.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC2731v.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC2731v.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC2731v.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC2731v.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC2731v.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC2731v.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC2731v.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC2731v.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC2731v.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC2731v.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC2731v.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC2731v.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC2731v.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC2731v.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC2731v.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC2731v.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC2731v.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC2731v.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC2731v.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC2731v.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC2731v.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[EnumC2731v.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[EnumC2731v.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[EnumC2731v.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[EnumC2731v.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[EnumC2731v.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[EnumC2731v.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[EnumC2731v.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[EnumC2731v.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[EnumC2731v.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[EnumC2731v.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[EnumC2731v.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[EnumC2731v.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[EnumC2731v.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[EnumC2731v.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[EnumC2731v.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[EnumC2731v.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[EnumC2731v.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[EnumC2731v.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            f8322a = iArr;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8323a = new b();

        b() {
            super(1);
        }

        public final void a(J.h hVar) {
            hVar.D();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J.h) obj);
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8324a = new c();

        c() {
            super(1);
        }

        public final void a(J.h hVar) {
            hVar.L();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J.h) obj);
            return Yg.J.f24997a;
        }
    }

    private final float a(l1 l1Var) {
        C0.r rVarJ = l1Var.j();
        if (rVarJ != null) {
            C6533i c6533iC0 = null;
            if (!rVarJ.M()) {
                rVarJ = null;
            }
            if (rVarJ != null) {
                C0.r rVarE = l1Var.e();
                if (rVarE != null) {
                    if (!rVarE.M()) {
                        rVarE = null;
                    }
                    if (rVarE != null) {
                        c6533iC0 = C0.r.c0(rVarE, rVarJ, false, 2, null);
                    }
                }
                if (c6533iC0 != null) {
                    return C6537m.g(c6533iC0.m());
                }
            }
        }
        return Float.NaN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean b(KeyEvent keyEvent, o1 o1Var, l1 l1Var, J.j jVar, boolean z10, boolean z11, InterfaceC6824a interfaceC6824a) {
        L0.S sB;
        Integer numA;
        boolean z12 = false;
        if (!AbstractC8249c.e(AbstractC8250d.b(keyEvent), AbstractC8249c.f64330a.a())) {
            return false;
        }
        if (F.c0.a(keyEvent) && (numA = this.f8320b.a(keyEvent)) != null) {
            String string = F.O.a(new StringBuilder(2), numA.intValue()).toString();
            if (!z10) {
                return false;
            }
            boolean z13 = !h1.c(keyEvent);
            H.l lVar = o1Var.f8379a;
            H.b bVar = o1Var.f8380b;
            K.c cVar = K.c.MergeIfPossible;
            lVar.g().f().e();
            I iG = lVar.g();
            iG.c();
            H.a(iG, string, 1);
            lVar.e(bVar, z13, cVar);
            this.f8319a.b();
            return true;
        }
        EnumC2731v enumC2731vA = this.f8321c.a(keyEvent);
        if (enumC2731vA != null && (!enumC2731vA.getEditsText() || z10)) {
            J.h hVar = new J.h(o1Var, l1Var.f(), h1.c(keyEvent), a(l1Var), this.f8319a);
            switch (a.f8322a[enumC2731vA.ordinal()]) {
                case 1:
                    jVar.E(false);
                    z12 = true;
                    break;
                case 2:
                    jVar.o0();
                    z12 = true;
                    break;
                case 3:
                    jVar.H();
                    z12 = true;
                    break;
                case 4:
                    hVar.f(b.f8323a);
                    z12 = true;
                    break;
                case 5:
                    hVar.g(c.f8324a);
                    z12 = true;
                    break;
                case 6:
                    hVar.E();
                    z12 = true;
                    break;
                case 7:
                    hVar.M();
                    z12 = true;
                    break;
                case 8:
                    hVar.J();
                    z12 = true;
                    break;
                case 9:
                    hVar.G();
                    z12 = true;
                    break;
                case 10:
                    hVar.T();
                    z12 = true;
                    break;
                case 11:
                    hVar.B();
                    z12 = true;
                    break;
                case 12:
                    hVar.U();
                    z12 = true;
                    break;
                case 13:
                    hVar.C();
                    z12 = true;
                    break;
                case 14:
                    hVar.S();
                    z12 = true;
                    break;
                case 15:
                    hVar.P();
                    z12 = true;
                    break;
                case 16:
                    hVar.Q();
                    z12 = true;
                    break;
                case 17:
                    hVar.R();
                    z12 = true;
                    break;
                case 18:
                    hVar.O();
                    z12 = true;
                    break;
                case 19:
                    hVar.N();
                    z12 = true;
                    break;
                case 20:
                    if (L0.S.h(hVar.x())) {
                        Integer numValueOf = Integer.valueOf(hVar.t());
                        if (numValueOf.intValue() == -1) {
                            numValueOf = null;
                        }
                        sB = numValueOf != null ? L0.S.b(L0.T.b(numValueOf.intValue(), L0.S.i(hVar.x()))) : null;
                        if (sB != null) {
                            o1.w(hVar.f9399a, "", sB.r(), null, !hVar.f9401c, 4, null);
                        }
                    } else {
                        o1.w(hVar.f9399a, "", hVar.x(), null, !hVar.f9401c, 4, null);
                    }
                    z12 = true;
                    break;
                case 21:
                    if (L0.S.h(hVar.x())) {
                        Integer numValueOf2 = Integer.valueOf(hVar.p());
                        if (numValueOf2.intValue() == -1) {
                            numValueOf2 = null;
                        }
                        sB = numValueOf2 != null ? L0.S.b(L0.T.b(L0.S.n(hVar.x()), numValueOf2.intValue())) : null;
                        if (sB != null) {
                            o1.w(hVar.f9399a, "", sB.r(), null, !hVar.f9401c, 4, null);
                        }
                    } else {
                        o1.w(hVar.f9399a, "", hVar.x(), null, !hVar.f9401c, 4, null);
                    }
                    z12 = true;
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    if (L0.S.h(hVar.x())) {
                        o1.w(hVar.f9399a, "", L0.T.b(hVar.w(), L0.S.i(hVar.x())), null, !hVar.f9401c, 4, null);
                    } else {
                        o1.w(hVar.f9399a, "", hVar.x(), null, !hVar.f9401c, 4, null);
                    }
                    z12 = true;
                    break;
                case 23:
                    if (L0.S.h(hVar.x())) {
                        o1.w(hVar.f9399a, "", L0.T.b(L0.S.n(hVar.x()), hVar.q()), null, !hVar.f9401c, 4, null);
                    } else {
                        o1.w(hVar.f9399a, "", hVar.x(), null, !hVar.f9401c, 4, null);
                    }
                    z12 = true;
                    break;
                case 24:
                    if (L0.S.h(hVar.x())) {
                        o1.w(hVar.f9399a, "", L0.T.b(hVar.m(), L0.S.i(hVar.x())), null, !hVar.f9401c, 4, null);
                    } else {
                        o1.w(hVar.f9399a, "", hVar.x(), null, !hVar.f9401c, 4, null);
                    }
                    z12 = true;
                    break;
                case 25:
                    if (L0.S.h(hVar.x())) {
                        o1.w(hVar.f9399a, "", L0.T.b(L0.S.n(hVar.x()), hVar.j()), null, !hVar.f9401c, 4, null);
                    } else {
                        o1.w(hVar.f9399a, "", hVar.x(), null, !hVar.f9401c, 4, null);
                    }
                    z12 = true;
                    break;
                case 26:
                    if (z11) {
                        interfaceC6824a.invoke();
                    } else {
                        H.l lVar2 = o1Var.f8379a;
                        H.b bVar2 = o1Var.f8380b;
                        K.c cVar2 = K.c.MergeIfPossible;
                        lVar2.g().f().e();
                        I iG2 = lVar2.g();
                        iG2.c();
                        H.a(iG2, "\n", 1);
                        lVar2.e(bVar2, true, cVar2);
                    }
                    z12 = true;
                    break;
                case 27:
                    if (!z11) {
                        H.l lVar3 = o1Var.f8379a;
                        H.b bVar3 = o1Var.f8380b;
                        K.c cVar3 = K.c.MergeIfPossible;
                        lVar3.g().f().e();
                        I iG3 = lVar3.g();
                        iG3.c();
                        H.a(iG3, "\t", 1);
                        lVar3.e(bVar3, true, cVar3);
                        z12 = true;
                        break;
                    }
                    break;
                case 28:
                    hVar.V();
                    z12 = true;
                    break;
                case 29:
                    hVar.D().W();
                    z12 = true;
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    hVar.L().W();
                    z12 = true;
                    break;
                case 31:
                    hVar.E().W();
                    z12 = true;
                    break;
                case 32:
                    hVar.M().W();
                    z12 = true;
                    break;
                case 33:
                    hVar.J().W();
                    z12 = true;
                    break;
                case 34:
                    hVar.G().W();
                    z12 = true;
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    hVar.S().W();
                    z12 = true;
                    break;
                case 36:
                    hVar.P().W();
                    z12 = true;
                    break;
                case 37:
                    hVar.Q().W();
                    z12 = true;
                    break;
                case 38:
                    hVar.R().W();
                    z12 = true;
                    break;
                case 39:
                    hVar.T().W();
                    z12 = true;
                    break;
                case 40:
                    hVar.B().W();
                    z12 = true;
                    break;
                case 41:
                    hVar.U().W();
                    z12 = true;
                    break;
                case 42:
                    hVar.C().W();
                    z12 = true;
                    break;
                case 43:
                    hVar.O().W();
                    z12 = true;
                    break;
                case 44:
                    hVar.N().W();
                    z12 = true;
                    break;
                case 45:
                    hVar.h();
                    z12 = true;
                    break;
                case 46:
                    o1Var.B();
                    z12 = true;
                    break;
                case 47:
                    o1Var.r();
                    z12 = true;
                    break;
                case 48:
                    AbstractC2732w.b();
                    z12 = true;
                    break;
                default:
                    z12 = true;
                    break;
            }
            if (!L0.S.g(hVar.x(), hVar.i().f())) {
                o1Var.y(hVar.x());
            }
        }
        return z12;
    }

    public boolean c(KeyEvent keyEvent, o1 o1Var, J.j jVar, k0.e eVar, androidx.compose.ui.platform.n1 n1Var) {
        if (L0.S.h(o1Var.l().f()) || !AbstractC2732w.a(keyEvent)) {
            return false;
        }
        jVar.I();
        return true;
    }
}
