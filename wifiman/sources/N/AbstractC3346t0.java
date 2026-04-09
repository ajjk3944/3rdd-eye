package N;

import T.InterfaceC3540l;
import T.z1;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6537m;
import m0.k1;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.C7044k;
import o0.InterfaceC7039f;
import r.C7548x;
import r.T;
import sh.AbstractC7978m;
import sh.InterfaceC7970e;

/* renamed from: N.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3346t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14742a = C3344s0.f14737a.a();

    /* renamed from: b, reason: collision with root package name */
    private static final float f14743b = Y0.h.j(240);

    /* renamed from: c, reason: collision with root package name */
    private static final float f14744c = Y0.h.j(40);

    /* renamed from: d, reason: collision with root package name */
    private static final C7548x f14745d = new C7548x(0.2f, 0.0f, 0.8f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private static final C7548x f14746e = new C7548x(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private static final C7548x f14747f = new C7548x(0.0f, 0.0f, 0.65f, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private static final C7548x f14748g = new C7548x(0.1f, 0.0f, 0.45f, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    private static final C7548x f14749h = new C7548x(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: N.t0$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f14750a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f14751b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7044k f14752c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14753d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, long j10, C7044k c7044k, long j11) {
            super(1);
            this.f14750a = f10;
            this.f14751b = j10;
            this.f14752c = c7044k;
            this.f14753d = j11;
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            float f10 = this.f14750a * 360.0f;
            AbstractC3346t0.s(interfaceC7039f, this.f14751b, this.f14752c);
            AbstractC3346t0.t(interfaceC7039f, 270.0f, f10, this.f14753d, this.f14752c);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.t0$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f14754a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14755b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f14756c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f14757d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14758e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14759f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14760g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14761h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, androidx.compose.ui.e eVar, long j10, float f11, long j11, int i10, int i11, int i12) {
            super(2);
            this.f14754a = f10;
            this.f14755b = eVar;
            this.f14756c = j10;
            this.f14757d = f11;
            this.f14758e = j11;
            this.f14759f = i10;
            this.f14760g = i11;
            this.f14761h = i12;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3346t0.a(this.f14754a, this.f14755b, this.f14756c, this.f14757d, this.f14758e, this.f14759f, interfaceC3540l, T.L0.a(this.f14760g | 1), this.f14761h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.t0$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14762a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7044k f14763b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14764c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14765d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z1 f14766e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1 f14767f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1 f14768g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ z1 f14769h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, C7044k c7044k, float f10, long j11, z1 z1Var, z1 z1Var2, z1 z1Var3, z1 z1Var4) {
            super(1);
            this.f14762a = j10;
            this.f14763b = c7044k;
            this.f14764c = f10;
            this.f14765d = j11;
            this.f14766e = z1Var;
            this.f14767f = z1Var2;
            this.f14768g = z1Var3;
            this.f14769h = z1Var4;
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            AbstractC3346t0.s(interfaceC7039f, this.f14762a, this.f14763b);
            AbstractC3346t0.u(interfaceC7039f, AbstractC3346t0.e(this.f14768g) + (((AbstractC3346t0.f(this.f14766e) * 216.0f) % 360.0f) - 90.0f) + AbstractC3346t0.c(this.f14769h), this.f14764c, Math.abs(AbstractC3346t0.d(this.f14767f) - AbstractC3346t0.e(this.f14768g)), this.f14765d, this.f14763b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.t0$d */
    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14770a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f14771b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14772c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14773d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14774e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14775f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14776g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f14770a = eVar;
            this.f14771b = j10;
            this.f14772c = f10;
            this.f14773d = j11;
            this.f14774e = i10;
            this.f14775f = i11;
            this.f14776g = i12;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3346t0.b(this.f14770a, this.f14771b, this.f14772c, this.f14773d, this.f14774e, interfaceC3540l, T.L0.a(this.f14775f | 1), this.f14776g);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.t0$e */
    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14777a = new e();

        e() {
            super(1);
        }

        public final void a(T.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 0), AbstractC3346t0.f14749h);
            bVar.f(Float.valueOf(290.0f), 666);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((T.b) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.t0$f */
    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f14778a = new f();

        f() {
            super(1);
        }

        public final void a(T.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 666), AbstractC3346t0.f14749h);
            bVar.f(Float.valueOf(290.0f), bVar.b());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((T.b) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.t0$g */
    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14780b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14781c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14782d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, int i10, float f10, long j11) {
            super(1);
            this.f14779a = j10;
            this.f14780b = i10;
            this.f14781c = f10;
            this.f14782d = j11;
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            float fG = C6537m.g(interfaceC7039f.c());
            AbstractC3346t0.w(interfaceC7039f, this.f14779a, fG, this.f14780b);
            AbstractC3346t0.v(interfaceC7039f, 0.0f, this.f14781c, this.f14782d, fG, this.f14780b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.t0$h */
    static final class h extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f14783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f14785c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14786d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14787e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14788f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14789g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f10, androidx.compose.ui.e eVar, long j10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f14783a = f10;
            this.f14784b = eVar;
            this.f14785c = j10;
            this.f14786d = j11;
            this.f14787e = i10;
            this.f14788f = i11;
            this.f14789g = i12;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3346t0.g(this.f14783a, this.f14784b, this.f14785c, this.f14786d, this.f14787e, interfaceC3540l, T.L0.a(this.f14788f | 1), this.f14789g);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.t0$i */
    static final class i extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f14790a;

        /* renamed from: N.t0$i$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.t f14791a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f14792b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.t tVar, int i10) {
                super(1);
                this.f14791a = tVar;
                this.f14792b = i10;
            }

            public final void a(t.a aVar) {
                t.a.h(aVar, this.f14791a, 0, -this.f14792b, 0.0f, 4, null);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(float f10) {
            super(3);
            this.f14790a = f10;
        }

        public final C0.D a(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
            int iX1 = mVar.x1(this.f14790a);
            int i10 = iX1 * 2;
            androidx.compose.ui.layout.t tVarT = b10.T(Y0.c.n(j10, 0, i10));
            return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0() - i10, null, new a(tVarT, iX1), 4, null);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.layout.m) obj, (C0.B) obj2, ((Y0.b) obj3).r());
        }
    }

    /* renamed from: N.t0$j */
    static final class j extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final j f14793a = new j();

        j() {
            super(1);
        }

        public final void a(J0.w wVar) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(float r25, androidx.compose.ui.e r26, long r27, float r29, long r30, int r32, T.InterfaceC3540l r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3346t0.a(float, androidx.compose.ui.e, long, float, long, int, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r33, long r34, float r36, long r37, int r39, T.InterfaceC3540l r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3346t0.b(androidx.compose.ui.e, long, float, long, int, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(z1 z1Var) {
        return ((Number) z1Var.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(float r24, androidx.compose.ui.e r25, long r26, long r28, int r30, T.InterfaceC3540l r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3346t0.g(float, androidx.compose.ui.e, long, long, int, T.l, int, int):void");
    }

    private static final void r(InterfaceC7039f interfaceC7039f, float f10, float f11, long j10, C7044k c7044k) {
        float f12 = 2;
        float f13 = c7044k.f() / f12;
        float fI = C6537m.i(interfaceC7039f.c()) - (f12 * f13);
        InterfaceC7039f.p1(interfaceC7039f, j10, f10, f11, false, AbstractC6532h.a(f13, f13), AbstractC6538n.a(fI, fI), 0.0f, c7044k, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(InterfaceC7039f interfaceC7039f, long j10, C7044k c7044k) {
        r(interfaceC7039f, 0.0f, 360.0f, j10, c7044k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(InterfaceC7039f interfaceC7039f, float f10, float f11, long j10, C7044k c7044k) {
        r(interfaceC7039f, f10, f11, j10, c7044k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(InterfaceC7039f interfaceC7039f, float f10, float f11, float f12, long j10, C7044k c7044k) {
        r(interfaceC7039f, f10 + (k1.e(c7044k.b(), k1.f52924a.a()) ? 0.0f : ((f11 / Y0.h.j(f14744c / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, c7044k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(InterfaceC7039f interfaceC7039f, float f10, float f11, long j10, float f12, int i10) {
        float fI = C6537m.i(interfaceC7039f.c());
        float fG = C6537m.g(interfaceC7039f.c());
        float f13 = 2;
        float f14 = fG / f13;
        boolean z10 = interfaceC7039f.getLayoutDirection() == Y0.t.Ltr;
        float f15 = (z10 ? f10 : 1.0f - f11) * fI;
        float f16 = (z10 ? f11 : 1.0f - f10) * fI;
        if (k1.e(i10, k1.f52924a.a()) || fG > fI) {
            InterfaceC7039f.w1(interfaceC7039f, j10, AbstractC6532h.a(f15, f14), AbstractC6532h.a(f16, f14), f12, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f17 = f12 / f13;
        InterfaceC7970e interfaceC7970eB = AbstractC7978m.b(f17, fI - f17);
        float fFloatValue = ((Number) AbstractC7978m.o(Float.valueOf(f15), interfaceC7970eB)).floatValue();
        float fFloatValue2 = ((Number) AbstractC7978m.o(Float.valueOf(f16), interfaceC7970eB)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            InterfaceC7039f.w1(interfaceC7039f, j10, AbstractC6532h.a(fFloatValue, f14), AbstractC6532h.a(fFloatValue2, f14), f12, i10, null, 0.0f, null, 0, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(InterfaceC7039f interfaceC7039f, long j10, float f10, int i10) {
        v(interfaceC7039f, 0.0f, 1.0f, j10, f10, i10);
    }

    public static final androidx.compose.ui.e x(androidx.compose.ui.e eVar) {
        float fJ = Y0.h.j(10);
        return androidx.compose.foundation.layout.o.k(J0.m.b(androidx.compose.ui.layout.g.a(eVar, new i(fJ)), true, j.f14793a), 0.0f, fJ, 1, null);
    }
}
