package androidx.compose.animation;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.t1;
import T.z1;
import Yg.J;
import androidx.compose.ui.e;
import f0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.p1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import q.C7380A;
import q.C7388g;
import q.C7394m;
import q.C7401t;
import q.C7404w;
import q.EnumC7392k;
import q.InterfaceC7397p;
import r.AbstractC7535j;
import r.C7532h0;
import r.C7539n;
import r.H;
import r.I0;
import r.o0;
import r.p0;
import r.s0;
import r.u0;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final s0 f27574a = u0.a(a.f27578a, b.f27579a);

    /* renamed from: b, reason: collision with root package name */
    private static final C7532h0 f27575b = AbstractC7535j.j(0.0f, 400.0f, null, 5, null);

    /* renamed from: c, reason: collision with root package name */
    private static final C7532h0 f27576c = AbstractC7535j.j(0.0f, 400.0f, Y0.n.b(I0.c(Y0.n.f24536b)), 1, null);

    /* renamed from: d, reason: collision with root package name */
    private static final C7532h0 f27577d = AbstractC7535j.j(0.0f, 400.0f, Y0.r.b(I0.d(Y0.r.f24545b)), 1, null);

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27578a = new a();

        a() {
            super(1);
        }

        public final C7539n a(long j10) {
            return new C7539n(androidx.compose.ui.graphics.f.f(j10), androidx.compose.ui.graphics.f.g(j10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((androidx.compose.ui.graphics.f) obj).j());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27579a = new b();

        b() {
            super(1);
        }

        public final long a(C7539n c7539n) {
            return p1.a(c7539n.f(), c7539n.g());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.f.b(a((C7539n) obj));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f27580a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f27581b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f27580a = iVar;
            this.f27581b = kVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke(o0.b bVar) {
            H hB;
            H hB2;
            EnumC7392k enumC7392k = EnumC7392k.PreEnter;
            EnumC7392k enumC7392k2 = EnumC7392k.Visible;
            if (bVar.e(enumC7392k, enumC7392k2)) {
                C7394m c7394mC = this.f27580a.b().c();
                return (c7394mC == null || (hB2 = c7394mC.b()) == null) ? g.f27575b : hB2;
            }
            if (!bVar.e(enumC7392k2, EnumC7392k.PostExit)) {
                return g.f27575b;
            }
            C7394m c7394mC2 = this.f27581b.b().c();
            return (c7394mC2 == null || (hB = c7394mC2.b()) == null) ? g.f27575b : hB;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f27582a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f27583b;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27584a;

            static {
                int[] iArr = new int[EnumC7392k.values().length];
                try {
                    iArr[EnumC7392k.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7392k.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7392k.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27584a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f27582a = iVar;
            this.f27583b = kVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(EnumC7392k enumC7392k) {
            int i10 = a.f27584a[enumC7392k.ordinal()];
            float fA = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    C7394m c7394mC = this.f27582a.b().c();
                    if (c7394mC != null) {
                        fA = c7394mC.a();
                    }
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C7394m c7394mC2 = this.f27583b.b().c();
                    if (c7394mC2 != null) {
                        fA = c7394mC2.a();
                    }
                }
            }
            return Float.valueOf(fA);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f27585a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f27586b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1 f27587c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z1 z1Var, z1 z1Var2, z1 z1Var3) {
            super(1);
            this.f27585a = z1Var;
            this.f27586b = z1Var2;
            this.f27587c = z1Var3;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            z1 z1Var = this.f27585a;
            cVar.a(z1Var != null ? ((Number) z1Var.getValue()).floatValue() : 1.0f);
            z1 z1Var2 = this.f27586b;
            cVar.i(z1Var2 != null ? ((Number) z1Var2.getValue()).floatValue() : 1.0f);
            z1 z1Var3 = this.f27586b;
            cVar.g(z1Var3 != null ? ((Number) z1Var3.getValue()).floatValue() : 1.0f);
            z1 z1Var4 = this.f27587c;
            cVar.y1(z1Var4 != null ? ((androidx.compose.ui.graphics.f) z1Var4.getValue()).j() : androidx.compose.ui.graphics.f.f28939b.a());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f27588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f27589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f27588a = iVar;
            this.f27589b = kVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke(o0.b bVar) {
            H hA;
            H hA2;
            EnumC7392k enumC7392k = EnumC7392k.PreEnter;
            EnumC7392k enumC7392k2 = EnumC7392k.Visible;
            if (bVar.e(enumC7392k, enumC7392k2)) {
                C7401t c7401tE = this.f27588a.b().e();
                return (c7401tE == null || (hA2 = c7401tE.a()) == null) ? g.f27575b : hA2;
            }
            if (!bVar.e(enumC7392k2, EnumC7392k.PostExit)) {
                return g.f27575b;
            }
            C7401t c7401tE2 = this.f27589b.b().e();
            return (c7401tE2 == null || (hA = c7401tE2.a()) == null) ? g.f27575b : hA;
        }
    }

    /* renamed from: androidx.compose.animation.g$g, reason: collision with other inner class name */
    static final class C1032g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f27590a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f27591b;

        /* renamed from: androidx.compose.animation.g$g$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27592a;

            static {
                int[] iArr = new int[EnumC7392k.values().length];
                try {
                    iArr[EnumC7392k.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7392k.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7392k.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27592a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1032g(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f27590a = iVar;
            this.f27591b = kVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(EnumC7392k enumC7392k) {
            int i10 = a.f27592a[enumC7392k.ordinal()];
            float fB = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    C7401t c7401tE = this.f27590a.b().e();
                    if (c7401tE != null) {
                        fB = c7401tE.b();
                    }
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C7401t c7401tE2 = this.f27591b.b().e();
                    if (c7401tE2 != null) {
                        fB = c7401tE2.b();
                    }
                }
            }
            return Float.valueOf(fB);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f27593a = new h();

        h() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke(o0.b bVar) {
            return AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.f f27594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f27595b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f27596c;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27597a;

            static {
                int[] iArr = new int[EnumC7392k.values().length];
                try {
                    iArr[EnumC7392k.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7392k.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7392k.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27597a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.graphics.f fVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f27594a = fVar;
            this.f27595b = iVar;
            this.f27596c = kVar;
        }

        public final long a(EnumC7392k enumC7392k) {
            androidx.compose.ui.graphics.f fVarB;
            int i10 = a.f27597a[enumC7392k.ordinal()];
            if (i10 != 1) {
                fVarB = null;
                if (i10 == 2) {
                    C7401t c7401tE = this.f27595b.b().e();
                    if (c7401tE != null || (c7401tE = this.f27596c.b().e()) != null) {
                        fVarB = androidx.compose.ui.graphics.f.b(c7401tE.c());
                    }
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C7401t c7401tE2 = this.f27596c.b().e();
                    if (c7401tE2 != null || (c7401tE2 = this.f27595b.b().e()) != null) {
                        fVarB = androidx.compose.ui.graphics.f.b(c7401tE2.c());
                    }
                }
            } else {
                fVarB = this.f27594a;
            }
            return fVarB != null ? fVarB.j() : androidx.compose.ui.graphics.f.f28939b.a();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.f.b(a((EnumC7392k) obj));
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f27598a = new j();

        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27599a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, InterfaceC6824a interfaceC6824a) {
            super(1);
            this.f27599a = z10;
            this.f27600b = interfaceC6824a;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.G(!this.f27599a && ((Boolean) this.f27600b.invoke()).booleanValue());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class l extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final l f27601a = new l();

        l() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27602a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27602a = interfaceC6835l;
        }

        public final long a(long j10) {
            return Y0.s.a(((Number) this.f27602a.invoke(Integer.valueOf(Y0.r.g(j10)))).intValue(), Y0.r.f(j10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.r.b(a(((Y0.r) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class n extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final n f27603a = new n();

        n() {
            super(1);
        }

        public final long a(long j10) {
            return Y0.s.a(0, 0);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.r.b(a(((Y0.r) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class o extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final o f27604a = new o();

        o() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27605a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27605a = interfaceC6835l;
        }

        public final long a(long j10) {
            return Y0.s.a(Y0.r.g(j10), ((Number) this.f27605a.invoke(Integer.valueOf(Y0.r.f(j10)))).intValue());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.r.b(a(((Y0.r) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class q extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final q f27606a = new q();

        q() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class r extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27607a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27607a = interfaceC6835l;
        }

        public final long a(long j10) {
            return Y0.s.a(((Number) this.f27607a.invoke(Integer.valueOf(Y0.r.g(j10)))).intValue(), Y0.r.f(j10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.r.b(a(((Y0.r) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class s extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final s f27608a = new s();

        s() {
            super(1);
        }

        public final long a(long j10) {
            return Y0.s.a(0, 0);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.r.b(a(((Y0.r) obj).j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class t extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final t f27609a = new t();

        t() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class u extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27610a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27610a = interfaceC6835l;
        }

        public final long a(long j10) {
            return Y0.s.a(Y0.r.g(j10), ((Number) this.f27610a.invoke(Integer.valueOf(Y0.r.f(j10)))).intValue());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.r.b(a(((Y0.r) obj).j()));
        }
    }

    static final class v extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27611a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27611a = interfaceC6835l;
        }

        public final long a(long j10) {
            return Y0.o.a(((Number) this.f27611a.invoke(Integer.valueOf(Y0.r.g(j10)))).intValue(), 0);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.n.b(a(((Y0.r) obj).j()));
        }
    }

    static final class w extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27612a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27612a = interfaceC6835l;
        }

        public final long a(long j10) {
            return Y0.o.a(0, ((Number) this.f27612a.invoke(Integer.valueOf(Y0.r.f(j10)))).intValue());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.n.b(a(((Y0.r) obj).j()));
        }
    }

    static final class x extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27613a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27613a = interfaceC6835l;
        }

        public final long a(long j10) {
            return Y0.o.a(((Number) this.f27613a.invoke(Integer.valueOf(Y0.r.g(j10)))).intValue(), 0);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.n.b(a(((Y0.r) obj).j()));
        }
    }

    static final class y extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27614a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27614a = interfaceC6835l;
        }

        public final long a(long j10) {
            return Y0.o.a(0, ((Number) this.f27614a.invoke(Integer.valueOf(Y0.r.f(j10)))).intValue());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.n.b(a(((Y0.r) obj).j()));
        }
    }

    public static final androidx.compose.animation.i A(H h10, InterfaceC6835l interfaceC6835l) {
        return z(h10, new v(interfaceC6835l));
    }

    public static final androidx.compose.animation.i B(H h10, InterfaceC6835l interfaceC6835l) {
        return z(h10, new w(interfaceC6835l));
    }

    public static final androidx.compose.animation.k C(H h10, InterfaceC6835l interfaceC6835l) {
        return new androidx.compose.animation.l(new C7380A(null, new C7404w(interfaceC6835l, h10), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.k D(H h10, InterfaceC6835l interfaceC6835l) {
        return C(h10, new x(interfaceC6835l));
    }

    public static final androidx.compose.animation.k E(H h10, InterfaceC6835l interfaceC6835l) {
        return C(h10, new y(interfaceC6835l));
    }

    private static final f0.c F(c.b bVar) {
        c.a aVar = f0.c.f46573a;
        return AbstractC6492s.d(bVar, aVar.k()) ? aVar.h() : AbstractC6492s.d(bVar, aVar.j()) ? aVar.f() : aVar.e();
    }

    private static final f0.c G(c.InterfaceC1752c interfaceC1752c) {
        c.a aVar = f0.c.f46573a;
        return AbstractC6492s.d(interfaceC1752c, aVar.l()) ? aVar.m() : AbstractC6492s.d(interfaceC1752c, aVar.a()) ? aVar.b() : aVar.e();
    }

    public static final androidx.compose.animation.i H(o0 o0Var, androidx.compose.animation.i iVar, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(21614502, i10, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(o0Var)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = t1.d(iVar, null, 2, null);
            interfaceC3540l.K(objF);
        }
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
        if (o0Var.i() == o0Var.p() && o0Var.i() == EnumC7392k.Visible) {
            if (o0Var.u()) {
                J(interfaceC3551q0, iVar);
            } else {
                J(interfaceC3551q0, androidx.compose.animation.i.f27645a.a());
            }
        } else if (o0Var.p() == EnumC7392k.Visible) {
            J(interfaceC3551q0, I(interfaceC3551q0).c(iVar));
        }
        androidx.compose.animation.i iVarI = I(interfaceC3551q0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return iVarI;
    }

    private static final androidx.compose.animation.i I(InterfaceC3551q0 interfaceC3551q0) {
        return (androidx.compose.animation.i) interfaceC3551q0.getValue();
    }

    private static final void J(InterfaceC3551q0 interfaceC3551q0, androidx.compose.animation.i iVar) {
        interfaceC3551q0.setValue(iVar);
    }

    public static final androidx.compose.animation.k K(o0 o0Var, androidx.compose.animation.k kVar, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1363864804, i10, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(o0Var)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = t1.d(kVar, null, 2, null);
            interfaceC3540l.K(objF);
        }
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
        if (o0Var.i() == o0Var.p() && o0Var.i() == EnumC7392k.Visible) {
            if (o0Var.u()) {
                M(interfaceC3551q0, kVar);
            } else {
                M(interfaceC3551q0, androidx.compose.animation.k.f27648a.a());
            }
        } else if (o0Var.p() != EnumC7392k.Visible) {
            M(interfaceC3551q0, L(interfaceC3551q0).c(kVar));
        }
        androidx.compose.animation.k kVarL = L(interfaceC3551q0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return kVarL;
    }

    private static final androidx.compose.animation.k L(InterfaceC3551q0 interfaceC3551q0) {
        return (androidx.compose.animation.k) interfaceC3551q0.getValue();
    }

    private static final void M(InterfaceC3551q0 interfaceC3551q0, androidx.compose.animation.k kVar) {
        interfaceC3551q0.setValue(kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final q.InterfaceC7397p e(final r.o0 r20, final androidx.compose.animation.i r21, final androidx.compose.animation.k r22, java.lang.String r23, T.InterfaceC3540l r24, int r25) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.e(r.o0, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, T.l, int):q.p");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final mh.InterfaceC6835l f(r.o0.a r3, r.o0.a r4, r.o0 r5, androidx.compose.animation.i r6, androidx.compose.animation.k r7, r.o0.a r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L12
            androidx.compose.animation.g$c r1 = new androidx.compose.animation.g$c
            r1.<init>(r6, r7)
            androidx.compose.animation.g$d r2 = new androidx.compose.animation.g$d
            r2.<init>(r6, r7)
            T.z1 r3 = r3.a(r1, r2)
            goto L13
        L12:
            r3 = r0
        L13:
            if (r4 == 0) goto L24
            androidx.compose.animation.g$f r1 = new androidx.compose.animation.g$f
            r1.<init>(r6, r7)
            androidx.compose.animation.g$g r2 = new androidx.compose.animation.g$g
            r2.<init>(r6, r7)
            T.z1 r4 = r4.a(r1, r2)
            goto L25
        L24:
            r4 = r0
        L25:
            java.lang.Object r5 = r5.i()
            q.k r1 = q.EnumC7392k.PreEnter
            if (r5 != r1) goto L4d
            q.A r5 = r6.b()
            q.t r5 = r5.e()
            if (r5 == 0) goto L40
        L37:
            long r1 = r5.c()
            androidx.compose.ui.graphics.f r5 = androidx.compose.ui.graphics.f.b(r1)
            goto L6b
        L40:
            q.A r5 = r7.b()
            q.t r5 = r5.e()
            if (r5 == 0) goto L4b
            goto L37
        L4b:
            r5 = r0
            goto L6b
        L4d:
            q.A r5 = r7.b()
            q.t r5 = r5.e()
            if (r5 == 0) goto L60
        L57:
            long r1 = r5.c()
            androidx.compose.ui.graphics.f r5 = androidx.compose.ui.graphics.f.b(r1)
            goto L6b
        L60:
            q.A r5 = r6.b()
            q.t r5 = r5.e()
            if (r5 == 0) goto L4b
            goto L57
        L6b:
            if (r8 == 0) goto L78
            androidx.compose.animation.g$h r0 = androidx.compose.animation.g.h.f27593a
            androidx.compose.animation.g$i r1 = new androidx.compose.animation.g$i
            r1.<init>(r5, r6, r7)
            T.z1 r0 = r8.a(r0, r1)
        L78:
            androidx.compose.animation.g$e r5 = new androidx.compose.animation.g$e
            r5.<init>(r3, r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.f(r.o0$a, r.o0$a, r.o0, androidx.compose.animation.i, androidx.compose.animation.k, r.o0$a):mh.l");
    }

    public static final androidx.compose.ui.e g(o0 o0Var, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, InterfaceC6824a interfaceC6824a, String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        o0.a aVar;
        o0.a aVar2;
        C7388g c7388gA;
        InterfaceC6824a interfaceC6824a2 = (i11 & 4) != 0 ? j.f27598a : interfaceC6824a;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(28261782, i10, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)");
        }
        int i12 = i10 & 14;
        androidx.compose.animation.i iVarH = H(o0Var, iVar, interfaceC3540l, i10 & 126);
        int i13 = i10 >> 3;
        androidx.compose.animation.k kVarK = K(o0Var, kVar, interfaceC3540l, (i13 & 112) | i12);
        boolean z10 = true;
        boolean z11 = (iVarH.b().f() == null && kVarK.b().f() == null) ? false : true;
        boolean z12 = (iVarH.b().a() == null && kVarK.b().a() == null) ? false : true;
        o0.a aVar3 = null;
        if (z11) {
            interfaceC3540l.U(-821375963);
            s0 s0VarD = u0.d(Y0.n.f24536b);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = str + " slide";
                interfaceC3540l.K(objF);
            }
            o0.a aVarC = p0.c(o0Var, s0VarD, (String) objF, interfaceC3540l, i12 | 384, 0);
            interfaceC3540l.J();
            aVar = aVarC;
        } else {
            interfaceC3540l.U(-821278096);
            interfaceC3540l.J();
            aVar = null;
        }
        if (z12) {
            interfaceC3540l.U(-821202177);
            s0 s0VarE = u0.e(Y0.r.f24545b);
            Object objF2 = interfaceC3540l.f();
            if (objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = str + " shrink/expand";
                interfaceC3540l.K(objF2);
            }
            o0.a aVarC2 = p0.c(o0Var, s0VarE, (String) objF2, interfaceC3540l, i12 | 384, 0);
            interfaceC3540l.J();
            aVar2 = aVarC2;
        } else {
            interfaceC3540l.U(-821099041);
            interfaceC3540l.J();
            aVar2 = null;
        }
        if (z12) {
            interfaceC3540l.U(-821034002);
            s0 s0VarD2 = u0.d(Y0.n.f24536b);
            Object objF3 = interfaceC3540l.f();
            if (objF3 == InterfaceC3540l.f21100a.a()) {
                objF3 = str + " InterruptionHandlingOffset";
                interfaceC3540l.K(objF3);
            }
            o0.a aVarC3 = p0.c(o0Var, s0VarD2, (String) objF3, interfaceC3540l, i12 | 384, 0);
            interfaceC3540l.J();
            aVar3 = aVarC3;
        } else {
            interfaceC3540l.U(-820883777);
            interfaceC3540l.J();
        }
        C7388g c7388gA2 = iVarH.b().a();
        boolean z13 = ((c7388gA2 == null || c7388gA2.c()) && ((c7388gA = kVarK.b().a()) == null || c7388gA.c()) && z12) ? false : true;
        InterfaceC7397p interfaceC7397pE = e(o0Var, iVarH, kVarK, str, interfaceC3540l, i12 | (i13 & 7168));
        e.a aVar4 = androidx.compose.ui.e.f28771b0;
        boolean zC = interfaceC3540l.c(z13);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !interfaceC3540l.T(interfaceC6824a2)) && (i10 & 3072) != 2048) {
            z10 = false;
        }
        boolean z14 = zC | z10;
        Object objF4 = interfaceC3540l.f();
        if (z14 || objF4 == InterfaceC3540l.f21100a.a()) {
            objF4 = new k(z13, interfaceC6824a2);
            interfaceC3540l.K(objF4);
        }
        androidx.compose.ui.e eVarB0 = androidx.compose.ui.graphics.b.a(aVar4, (InterfaceC6835l) objF4).b0(new EnterExitTransitionElement(o0Var, aVar2, aVar3, aVar, iVarH, kVarK, interfaceC6824a2, interfaceC7397pE));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return eVarB0;
    }

    public static final androidx.compose.animation.i h(H h10, c.b bVar, boolean z10, InterfaceC6835l interfaceC6835l) {
        return j(h10, F(bVar), z10, new m(interfaceC6835l));
    }

    public static /* synthetic */ androidx.compose.animation.i i(H h10, c.b bVar, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, Y0.r.b(I0.d(Y0.r.f24545b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = f0.c.f46573a.j();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC6835l = l.f27601a;
        }
        return h(h10, bVar, z10, interfaceC6835l);
    }

    public static final androidx.compose.animation.i j(H h10, f0.c cVar, boolean z10, InterfaceC6835l interfaceC6835l) {
        return new androidx.compose.animation.j(new C7380A(null, null, new C7388g(cVar, interfaceC6835l, h10, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.i k(H h10, f0.c cVar, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, Y0.r.b(I0.d(Y0.r.f24545b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = f0.c.f46573a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC6835l = n.f27603a;
        }
        return j(h10, cVar, z10, interfaceC6835l);
    }

    public static final androidx.compose.animation.i l(H h10, c.InterfaceC1752c interfaceC1752c, boolean z10, InterfaceC6835l interfaceC6835l) {
        return j(h10, G(interfaceC1752c), z10, new p(interfaceC6835l));
    }

    public static /* synthetic */ androidx.compose.animation.i m(H h10, c.InterfaceC1752c interfaceC1752c, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, Y0.r.b(I0.d(Y0.r.f24545b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC1752c = f0.c.f46573a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC6835l = o.f27604a;
        }
        return l(h10, interfaceC1752c, z10, interfaceC6835l);
    }

    public static final androidx.compose.animation.i n(H h10, float f10) {
        return new androidx.compose.animation.j(new C7380A(new C7394m(f10, h10), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.i o(H h10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return n(h10, f10);
    }

    public static final androidx.compose.animation.k p(H h10, float f10) {
        return new androidx.compose.animation.l(new C7380A(new C7394m(f10, h10), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.k q(H h10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return p(h10, f10);
    }

    public static final androidx.compose.animation.i r(H h10, float f10, long j10) {
        return new androidx.compose.animation.j(new C7380A(null, null, null, new C7401t(f10, j10, h10, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.i s(H h10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.f.f28939b.a();
        }
        return r(h10, f10, j10);
    }

    public static final androidx.compose.animation.k t(H h10, c.b bVar, boolean z10, InterfaceC6835l interfaceC6835l) {
        return v(h10, F(bVar), z10, new r(interfaceC6835l));
    }

    public static /* synthetic */ androidx.compose.animation.k u(H h10, c.b bVar, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, Y0.r.b(I0.d(Y0.r.f24545b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = f0.c.f46573a.j();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC6835l = q.f27606a;
        }
        return t(h10, bVar, z10, interfaceC6835l);
    }

    public static final androidx.compose.animation.k v(H h10, f0.c cVar, boolean z10, InterfaceC6835l interfaceC6835l) {
        return new androidx.compose.animation.l(new C7380A(null, null, new C7388g(cVar, interfaceC6835l, h10, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.k w(H h10, f0.c cVar, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, Y0.r.b(I0.d(Y0.r.f24545b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = f0.c.f46573a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC6835l = s.f27608a;
        }
        return v(h10, cVar, z10, interfaceC6835l);
    }

    public static final androidx.compose.animation.k x(H h10, c.InterfaceC1752c interfaceC1752c, boolean z10, InterfaceC6835l interfaceC6835l) {
        return v(h10, G(interfaceC1752c), z10, new u(interfaceC6835l));
    }

    public static /* synthetic */ androidx.compose.animation.k y(H h10, c.InterfaceC1752c interfaceC1752c, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h10 = AbstractC7535j.j(0.0f, 400.0f, Y0.r.b(I0.d(Y0.r.f24545b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC1752c = f0.c.f46573a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            interfaceC6835l = t.f27609a;
        }
        return x(h10, interfaceC1752c, z10, interfaceC6835l);
    }

    public static final androidx.compose.animation.i z(H h10, InterfaceC6835l interfaceC6835l) {
        return new androidx.compose.animation.j(new C7380A(null, new C7404w(interfaceC6835l, h10), null, null, false, null, 61, null));
    }
}
