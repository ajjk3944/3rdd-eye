package F;

import E0.InterfaceC2629g;
import H.k;
import I.InterfaceC2948o;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.I0;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.z1;
import android.view.KeyEvent;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.s1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import m0.AbstractC6713l0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import w0.C8248b;
import y.InterfaceC8558m;

/* renamed from: F.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2714d {

    /* renamed from: F.d$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f5018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f5019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L l10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f5019b = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f5019b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f5018a;
            if (i10 == 0) {
                Yg.v.b(obj);
                L l10 = this.f5019b;
                this.f5018a = 1;
                if (l10.g(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: F.d$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f5020a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5021b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L f5022c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, L l10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f5021b = z10;
            this.f5022c = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f5021b, this.f5022c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f5020a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            if (!this.f5021b) {
                this.f5022c.f().d();
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: F.d$c */
    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H.l f5023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5025c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5026d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ H.b f5027e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L f5028f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L0.U f5029g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ D f5030h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ H.d f5031i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f5032j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f5033k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f5034l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC2948o f5035m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ H.j f5036n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(H.l lVar, androidx.compose.ui.e eVar, boolean z10, boolean z11, H.b bVar, L l10, L0.U u10, D d10, H.d dVar, InterfaceC6839p interfaceC6839p, InterfaceC8558m interfaceC8558m, AbstractC6713l0 abstractC6713l0, InterfaceC2948o interfaceC2948o, H.j jVar) {
            super(2);
            this.f5023a = lVar;
            this.f5024b = eVar;
            this.f5025c = z10;
            this.f5026d = z11;
            this.f5027e = bVar;
            this.f5028f = l10;
            this.f5029g = u10;
            this.f5030h = d10;
            this.f5031i = dVar;
            this.f5032j = interfaceC6839p;
            this.f5033k = interfaceC8558m;
            this.f5034l = abstractC6713l0;
            this.f5035m = interfaceC2948o;
            this.f5036n = jVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2023988909, i10, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
            }
            AbstractC2716f.b(this.f5023a, this.f5024b, this.f5025c, false, this.f5026d ? AbstractC2714d.g(this.f5027e, this.f5028f.f()) : this.f5027e, this.f5029g, this.f5030h, this.f5031i, k.c.f7556b, this.f5032j, this.f5033k, this.f5034l, this.f5035m, null, this.f5036n, null, true, interfaceC3540l, 100666368, 1572864, 40960);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.d$d, reason: collision with other inner class name */
    static final class C0214d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H.l f5037a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ H.b f5040d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ L0.U f5041e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D f5042f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ H.d f5043g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f5044h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f5045i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f5046j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ H.j f5047k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5048l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ char f5049m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f5050n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f5051o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f5052p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0214d(H.l lVar, androidx.compose.ui.e eVar, boolean z10, H.b bVar, L0.U u10, D d10, H.d dVar, InterfaceC6839p interfaceC6839p, InterfaceC8558m interfaceC8558m, AbstractC6713l0 abstractC6713l0, H.j jVar, int i10, char c10, int i11, int i12, int i13) {
            super(2);
            this.f5037a = lVar;
            this.f5038b = eVar;
            this.f5039c = z10;
            this.f5040d = bVar;
            this.f5041e = u10;
            this.f5042f = d10;
            this.f5043g = dVar;
            this.f5044h = interfaceC6839p;
            this.f5045i = interfaceC8558m;
            this.f5046j = abstractC6713l0;
            this.f5047k = jVar;
            this.f5048l = i10;
            this.f5049m = c10;
            this.f5050n = i11;
            this.f5051o = i12;
            this.f5052p = i13;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2714d.b(this.f5037a, this.f5038b, this.f5039c, this.f5040d, this.f5041e, this.f5042f, this.f5043g, this.f5044h, this.f5045i, this.f5046j, this.f5047k, this.f5048l, this.f5049m, interfaceC3540l, L0.a(this.f5050n | 1), L0.a(this.f5051o), this.f5052p);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.d$e */
    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f5053a = new e();

        /* renamed from: F.d$e$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f5054a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        }

        /* renamed from: F.d$e$b */
        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f5055a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        }

        e() {
            super(1);
        }

        public final void a(J0.w wVar) {
            J0.t.N(wVar);
            J0.t.h(wVar, null, a.f5054a, 1, null);
            J0.t.j(wVar, null, b.f5055a, 1, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.d$f */
    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f5056a;

        /* renamed from: F.d$f$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f5057a = new a();

            a() {
                super(1);
            }

            public final Boolean a(KeyEvent keyEvent) {
                EnumC2731v enumC2731vA = AbstractC2735z.a().a(keyEvent);
                return Boolean.valueOf(enumC2731vA == EnumC2731v.COPY || enumC2731vA == EnumC2731v.CUT);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((C8248b) obj).f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f5056a = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1448819882, i10, -1, "androidx.compose.foundation.text.DisableCutCopy.<anonymous> (BasicSecureTextField.kt:332)");
            }
            androidx.compose.ui.e eVarB = androidx.compose.ui.input.key.a.b(androidx.compose.ui.e.f28771b0, a.f5057a);
            InterfaceC6839p interfaceC6839p = this.f5056a;
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarB);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            interfaceC6839p.invoke(interfaceC3540l, 0);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.d$g */
    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f5058a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f5058a = interfaceC6839p;
            this.f5059b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2714d.d(this.f5058a, interfaceC3540l, L0.a(this.f5059b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.d$h */
    public static final class h implements q1 {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ q1 f5060a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1 f5061b;

        h(q1 q1Var) {
            this.f5061b = q1Var;
            this.f5060a = q1Var;
        }

        @Override // androidx.compose.ui.platform.q1
        public s1 a() {
            return this.f5060a.a();
        }

        @Override // androidx.compose.ui.platform.q1
        public void b(C6533i c6533i, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3, InterfaceC6824a interfaceC6824a4) {
            this.f5061b.b(c6533i, null, interfaceC6824a2, null, interfaceC6824a4);
        }

        @Override // androidx.compose.ui.platform.q1
        public void c() {
            this.f5060a.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(H.l r37, androidx.compose.ui.e r38, boolean r39, H.b r40, L0.U r41, F.D r42, H.d r43, mh.InterfaceC6839p r44, y.InterfaceC8558m r45, m0.AbstractC6713l0 r46, H.j r47, int r48, char r49, T.InterfaceC3540l r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.AbstractC2714d.b(H.l, androidx.compose.ui.e, boolean, H.b, L0.U, F.D, H.d, mh.p, y.m, m0.l0, H.j, int, char, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(z1 z1Var, int i10, int i11) {
        return ((Character) z1Var.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1085555050);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(interfaceC6839p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1085555050, i11, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:310)");
            }
            q1 q1Var = (q1) interfaceC3540lR.t(AbstractC3932k0.r());
            boolean zT = interfaceC3540lR.T(q1Var);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new h(q1Var);
                interfaceC3540lR.K(objF);
            }
            AbstractC3561w.a(AbstractC3932k0.r().d((h) objF), b0.c.e(-1448819882, true, new f(interfaceC6839p), interfaceC3540lR, 54), interfaceC3540lR, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new g(interfaceC6839p, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H.b g(H.b bVar, H.b bVar2) {
        return bVar == null ? bVar2 : bVar2 == null ? bVar : H.c.a(bVar, bVar2);
    }
}
