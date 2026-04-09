package F;

import R0.C3448a;
import R0.C3454g;
import R0.C3458k;
import R0.C3461n;
import R0.InterfaceC3456i;
import Zg.AbstractC3689v;
import android.view.KeyEvent;
import com.google.ar.core.ImageFormat;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import w0.AbstractC8249c;
import w0.AbstractC8250d;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final E f4977a;

    /* renamed from: b, reason: collision with root package name */
    private final M.G f4978b;

    /* renamed from: c, reason: collision with root package name */
    private final R0.Q f4979c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4980d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4981e;

    /* renamed from: f, reason: collision with root package name */
    private final M.J f4982f;

    /* renamed from: g, reason: collision with root package name */
    private final R0.H f4983g;

    /* renamed from: h, reason: collision with root package name */
    private final u0 f4984h;

    /* renamed from: i, reason: collision with root package name */
    private final C2724n f4985i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC2733x f4986j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC6835l f4987k;

    /* renamed from: l, reason: collision with root package name */
    private final int f4988l;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4989a = new a();

        a() {
            super(1);
        }

        public final void a(R0.Q q10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((R0.Q) obj);
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC2731v f4990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f4991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f4992c;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4993a = new a();

            a() {
                super(1);
            }

            public final void a(M.F f10) {
                f10.A();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((M.F) obj);
                return Yg.J.f24997a;
            }
        }

        /* renamed from: F.a0$b$b, reason: collision with other inner class name */
        static final class C0210b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C0210b f4994a = new C0210b();

            C0210b() {
                super(1);
            }

            public final void a(M.F f10) {
                f10.I();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((M.F) obj);
                return Yg.J.f24997a;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f4995a = new c();

            c() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3456i invoke(M.F f10) {
                return new C3454g(L0.S.i(f10.u()) - f10.q(), 0);
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final d f4996a = new d();

            d() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3456i invoke(M.F f10) {
                int iL = f10.l();
                if (iL != -1) {
                    return new C3454g(0, iL - L0.S.i(f10.u()));
                }
                return null;
            }
        }

        static final class e extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final e f4997a = new e();

            e() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3456i invoke(M.F f10) {
                Integer numT = f10.t();
                if (numT == null) {
                    return null;
                }
                return new C3454g(L0.S.i(f10.u()) - numT.intValue(), 0);
            }
        }

        static final class f extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final f f4998a = new f();

            f() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3456i invoke(M.F f10) {
                Integer numM = f10.m();
                if (numM != null) {
                    return new C3454g(0, numM.intValue() - L0.S.i(f10.u()));
                }
                return null;
            }
        }

        static final class g extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final g f4999a = new g();

            g() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3456i invoke(M.F f10) {
                Integer numI = f10.i();
                if (numI == null) {
                    return null;
                }
                return new C3454g(L0.S.i(f10.u()) - numI.intValue(), 0);
            }
        }

        static final class h extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final h f5000a = new h();

            h() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3456i invoke(M.F f10) {
                Integer numF = f10.f();
                if (numF != null) {
                    return new C3454g(0, numF.intValue() - L0.S.i(f10.u()));
                }
                return null;
            }
        }

        public /* synthetic */ class i {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5001a;

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
                f5001a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC2731v enumC2731v, a0 a0Var, kotlin.jvm.internal.J j10) {
            super(1);
            this.f4990a = enumC2731v;
            this.f4991b = a0Var;
            this.f4992c = j10;
        }

        public final void a(M.F f10) {
            R0.Q qG;
            R0.Q qC;
            switch (i.f5001a[this.f4990a.ordinal()]) {
                case 1:
                    this.f4991b.h().o(false);
                    break;
                case 2:
                    this.f4991b.h().T();
                    break;
                case 3:
                    this.f4991b.h().s();
                    break;
                case 4:
                    f10.b(a.f4993a);
                    break;
                case 5:
                    f10.c(C0210b.f4994a);
                    break;
                case 6:
                    f10.B();
                    break;
                case 7:
                    f10.J();
                    break;
                case 8:
                    f10.G();
                    break;
                case 9:
                    f10.D();
                    break;
                case 10:
                    f10.Q();
                    break;
                case 11:
                    f10.z();
                    break;
                case 12:
                    f10.c0();
                    break;
                case 13:
                    f10.b0();
                    break;
                case 14:
                    f10.P();
                    break;
                case 15:
                    f10.M();
                    break;
                case 16:
                    f10.N();
                    break;
                case 17:
                    f10.O();
                    break;
                case 18:
                    f10.L();
                    break;
                case 19:
                    f10.K();
                    break;
                case 20:
                    List listY = f10.Y(c.f4995a);
                    if (listY != null) {
                        this.f4991b.f(listY);
                        break;
                    }
                    break;
                case 21:
                    List listY2 = f10.Y(d.f4996a);
                    if (listY2 != null) {
                        this.f4991b.f(listY2);
                        break;
                    }
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    List listY3 = f10.Y(e.f4997a);
                    if (listY3 != null) {
                        this.f4991b.f(listY3);
                        break;
                    }
                    break;
                case 23:
                    List listY4 = f10.Y(f.f4998a);
                    if (listY4 != null) {
                        this.f4991b.f(listY4);
                        break;
                    }
                    break;
                case 24:
                    List listY5 = f10.Y(g.f4999a);
                    if (listY5 != null) {
                        this.f4991b.f(listY5);
                        break;
                    }
                    break;
                case 25:
                    List listY6 = f10.Y(h.f5000a);
                    if (listY6 != null) {
                        this.f4991b.f(listY6);
                        break;
                    }
                    break;
                case 26:
                    if (!this.f4991b.i()) {
                        this.f4991b.e(new C3448a("\n", 1));
                        break;
                    } else {
                        this.f4991b.j().l().invoke(R0.r.j(this.f4991b.f4988l));
                        break;
                    }
                case 27:
                    if (!this.f4991b.i()) {
                        this.f4991b.e(new C3448a("\t", 1));
                        break;
                    } else {
                        this.f4992c.f51685a = false;
                        break;
                    }
                case 28:
                    f10.R();
                    break;
                case 29:
                    ((M.F) f10.A()).S();
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    ((M.F) f10.I()).S();
                    break;
                case 31:
                    ((M.F) f10.B()).S();
                    break;
                case 32:
                    ((M.F) f10.J()).S();
                    break;
                case 33:
                    ((M.F) f10.G()).S();
                    break;
                case 34:
                    ((M.F) f10.D()).S();
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    ((M.F) f10.P()).S();
                    break;
                case 36:
                    ((M.F) f10.M()).S();
                    break;
                case 37:
                    ((M.F) f10.N()).S();
                    break;
                case 38:
                    ((M.F) f10.O()).S();
                    break;
                case 39:
                    ((M.F) f10.Q()).S();
                    break;
                case 40:
                    ((M.F) f10.z()).S();
                    break;
                case 41:
                    f10.c0().S();
                    break;
                case 42:
                    f10.b0().S();
                    break;
                case 43:
                    ((M.F) f10.L()).S();
                    break;
                case 44:
                    ((M.F) f10.K()).S();
                    break;
                case 45:
                    f10.d();
                    break;
                case 46:
                    u0 u0VarK = this.f4991b.k();
                    if (u0VarK != null) {
                        u0VarK.b(f10.Z());
                    }
                    u0 u0VarK2 = this.f4991b.k();
                    if (u0VarK2 != null && (qG = u0VarK2.g()) != null) {
                        this.f4991b.f4987k.invoke(qG);
                        break;
                    }
                    break;
                case 47:
                    u0 u0VarK3 = this.f4991b.k();
                    if (u0VarK3 != null && (qC = u0VarK3.c()) != null) {
                        this.f4991b.f4987k.invoke(qC);
                        break;
                    }
                    break;
                case 48:
                    AbstractC2732w.b();
                    break;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((M.F) obj);
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ a0(E e10, M.G g10, R0.Q q10, boolean z10, boolean z11, M.J j10, R0.H h10, u0 u0Var, C2724n c2724n, InterfaceC2733x interfaceC2733x, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e10, g10, q10, z10, z11, j10, h10, u0Var, c2724n, interfaceC2733x, interfaceC6835l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(InterfaceC3456i interfaceC3456i) {
        f(AbstractC3689v.e(interfaceC3456i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(List list) {
        C3458k c3458kN = this.f4977a.n();
        List listL1 = AbstractC3689v.l1(list);
        listL1.add(0, new C3461n());
        this.f4987k.invoke(c3458kN.b(listL1));
    }

    private final void g(InterfaceC6835l interfaceC6835l) {
        M.F f10 = new M.F(this.f4979c, this.f4983g, this.f4977a.j(), this.f4982f);
        interfaceC6835l.invoke(f10);
        if (L0.S.g(f10.u(), this.f4979c.h()) && AbstractC6492s.d(f10.e(), this.f4979c.f())) {
            return;
        }
        this.f4987k.invoke(f10.Z());
    }

    private final C3448a m(KeyEvent keyEvent) {
        Integer numA;
        if (c0.a(keyEvent) && (numA = this.f4985i.a(keyEvent)) != null) {
            return new C3448a(O.a(new StringBuilder(), numA.intValue()).toString(), 1);
        }
        return null;
    }

    public final M.G h() {
        return this.f4978b;
    }

    public final boolean i() {
        return this.f4981e;
    }

    public final E j() {
        return this.f4977a;
    }

    public final u0 k() {
        return this.f4984h;
    }

    public final boolean l(KeyEvent keyEvent) {
        EnumC2731v enumC2731vA;
        C3448a c3448aM = m(keyEvent);
        if (c3448aM != null) {
            if (!this.f4980d) {
                return false;
            }
            e(c3448aM);
            this.f4982f.b();
            return true;
        }
        if (!AbstractC8249c.e(AbstractC8250d.b(keyEvent), AbstractC8249c.f64330a.a()) || (enumC2731vA = this.f4986j.a(keyEvent)) == null || (enumC2731vA.getEditsText() && !this.f4980d)) {
            return false;
        }
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        j10.f51685a = true;
        g(new b(enumC2731vA, this, j10));
        u0 u0Var = this.f4984h;
        if (u0Var != null) {
            u0Var.a();
        }
        return j10.f51685a;
    }

    private a0(E e10, M.G g10, R0.Q q10, boolean z10, boolean z11, M.J j10, R0.H h10, u0 u0Var, C2724n c2724n, InterfaceC2733x interfaceC2733x, InterfaceC6835l interfaceC6835l, int i10) {
        this.f4977a = e10;
        this.f4978b = g10;
        this.f4979c = q10;
        this.f4980d = z10;
        this.f4981e = z11;
        this.f4982f = j10;
        this.f4983g = h10;
        this.f4984h = u0Var;
        this.f4985i = c2724n;
        this.f4986j = interfaceC2733x;
        this.f4987k = interfaceC6835l;
        this.f4988l = i10;
    }

    public /* synthetic */ a0(E e10, M.G g10, R0.Q q10, boolean z10, boolean z11, M.J j10, R0.H h10, u0 u0Var, C2724n c2724n, InterfaceC2733x interfaceC2733x, InterfaceC6835l interfaceC6835l, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(e10, g10, (i11 & 4) != 0 ? new R0.Q((String) null, 0L, (L0.S) null, 7, (DefaultConstructorMarker) null) : q10, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? false : z11, j10, (i11 & 64) != 0 ? R0.H.f19391a.a() : h10, (i11 & 128) != 0 ? null : u0Var, c2724n, (i11 & 512) != 0 ? AbstractC2735z.a() : interfaceC2733x, (i11 & 1024) != 0 ? a.f4989a : interfaceC6835l, i10, null);
    }
}
