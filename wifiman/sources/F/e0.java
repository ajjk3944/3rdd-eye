package F;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import dh.InterfaceC5380e;
import f.AbstractC5487d;
import j0.AbstractC6234e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.EnumC7839L;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public abstract class e0 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5093a;

        static {
            int[] iArr = new int[w.q.values().length];
            try {
                iArr[w.q.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.q.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5093a = iArr;
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f5094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f5095b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5096c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f0 f0Var, InterfaceC8558m interfaceC8558m, boolean z10) {
            super(1);
            this.f5094a = f0Var;
            this.f5095b = interfaceC8558m;
            this.f5096c = z10;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f5097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5098b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f5099c;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0 f5100a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var) {
                super(1);
                this.f5100a = f0Var;
            }

            public final Float a(float f10) {
                float fD = this.f5100a.d() + f10;
                if (fD > this.f5100a.c()) {
                    f10 = this.f5100a.c() - this.f5100a.d();
                } else if (fD < 0.0f) {
                    f10 = -this.f5100a.d();
                }
                f0 f0Var = this.f5100a;
                f0Var.h(f0Var.d() + f10);
                return Float.valueOf(f10);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).floatValue());
            }
        }

        public static final class b implements w.y {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ w.y f5101a;

            /* renamed from: b, reason: collision with root package name */
            private final z1 f5102b;

            /* renamed from: c, reason: collision with root package name */
            private final z1 f5103c;

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f0 f5104a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(f0 f0Var) {
                    super(0);
                    this.f5104a = f0Var;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f5104a.d() > 0.0f);
                }
            }

            /* renamed from: F.e0$c$b$b, reason: collision with other inner class name */
            static final class C0221b extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f0 f5105a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0221b(f0 f0Var) {
                    super(0);
                    this.f5105a = f0Var;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f5105a.d() < this.f5105a.c());
                }
            }

            b(w.y yVar, f0 f0Var) {
                this.f5101a = yVar;
                this.f5102b = o1.e(new C0221b(f0Var));
                this.f5103c = o1.e(new a(f0Var));
            }

            @Override // w.y
            public boolean a() {
                return this.f5101a.a();
            }

            @Override // w.y
            public Object c(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                return this.f5101a.c(enumC7839L, interfaceC6839p, interfaceC5380e);
            }

            @Override // w.y
            public boolean d() {
                return ((Boolean) this.f5103c.getValue()).booleanValue();
            }

            @Override // w.y
            public boolean e() {
                return ((Boolean) this.f5102b.getValue()).booleanValue();
            }

            @Override // w.y
            public float f(float f10) {
                return this.f5101a.f(f10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f0 f0Var, boolean z10, InterfaceC8558m interfaceC8558m) {
            super(3);
            this.f5097a = f0Var;
            this.f5098b = z10;
            this.f5099c = interfaceC8558m;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(805428266);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(805428266, i10, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
            }
            boolean z10 = this.f5097a.f() == w.q.Vertical || !(interfaceC3540l.t(AbstractC3932k0.m()) == Y0.t.Rtl);
            boolean zT = interfaceC3540l.T(this.f5097a);
            f0 f0Var = this.f5097a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(f0Var);
                interfaceC3540l.K(objF);
            }
            w.y yVarB = w.z.b((InterfaceC6835l) objF, interfaceC3540l, 0);
            boolean zT2 = interfaceC3540l.T(yVarB) | interfaceC3540l.T(this.f5097a);
            f0 f0Var2 = this.f5097a;
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new b(yVarB, f0Var2);
                interfaceC3540l.K(objF2);
            }
            androidx.compose.ui.e eVarI = androidx.compose.foundation.gestures.d.i(androidx.compose.ui.e.f28771b0, (b) objF2, this.f5097a.f(), this.f5098b && this.f5097a.c() != 0.0f, z10, null, this.f5099c, 16, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarI;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6533i b(Y0.d dVar, int i10, R0.a0 a0Var, L0.M m10, boolean z10, int i11) {
        C6533i c6533iA;
        if (m10 == null || (c6533iA = m10.e(a0Var.a().b(i10))) == null) {
            c6533iA = C6533i.f52340e.a();
        }
        C6533i c6533i = c6533iA;
        int iX1 = dVar.x1(V.b());
        return C6533i.d(c6533i, z10 ? (i11 - c6533i.k()) - iX1 : c6533i.k(), 0.0f, z10 ? i11 - c6533i.k() : c6533i.k() + iX1, 0.0f, 10, null);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, f0 f0Var, R0.Q q10, R0.c0 c0Var, InterfaceC6824a interfaceC6824a) {
        androidx.compose.ui.e z0Var;
        w.q qVarF = f0Var.f();
        int iE = f0Var.e(q10.h());
        f0Var.i(q10.h());
        R0.a0 a0VarC = y0.c(c0Var, q10.f());
        int i10 = a.f5093a[qVarF.ordinal()];
        if (i10 == 1) {
            z0Var = new z0(f0Var, iE, a0VarC, interfaceC6824a);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z0Var = new C2728s(f0Var, iE, a0VarC, interfaceC6824a);
        }
        return AbstractC6234e.b(eVar).b0(z0Var);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, f0 f0Var, InterfaceC8558m interfaceC8558m, boolean z10) {
        return androidx.compose.ui.c.b(eVar, AbstractC3964z0.b() ? new b(f0Var, interfaceC8558m, z10) : AbstractC3964z0.a(), new c(f0Var, z10, interfaceC8558m));
    }
}
