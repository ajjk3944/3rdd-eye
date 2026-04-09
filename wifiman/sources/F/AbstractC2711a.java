package F;

import E0.InterfaceC2629g;
import M.AbstractC3232a;
import M.InterfaceC3241j;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import androidx.compose.ui.e;
import j0.C6233d;
import j0.C6237h;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6735w0;
import m0.J0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7036c;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import o0.InterfaceC7041h;

/* renamed from: F.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2711a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f4959a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f4960b;

    /* renamed from: F.a$a, reason: collision with other inner class name */
    static final class C0207a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4961a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f4962b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0207a(long j10, androidx.compose.ui.e eVar) {
            super(2);
            this.f4961a = j10;
            this.f4962b = eVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1653527038, i10, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)");
            }
            if (this.f4961a != 9205357640488583168L) {
                interfaceC3540l.U(1828881000);
                androidx.compose.ui.e eVarR = androidx.compose.foundation.layout.r.r(this.f4962b, Y0.k.h(this.f4961a), Y0.k.g(this.f4961a), 0.0f, 0.0f, 12, null);
                C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.m(), false);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarR);
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
                AbstractC2711a.b(null, interfaceC3540l, 0, 1);
                interfaceC3540l.R();
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(1829217412);
                AbstractC2711a.b(this.f4962b, interfaceC3540l, 0, 0);
                interfaceC3540l.J();
            }
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

    /* renamed from: F.a$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3241j f4963a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f4964b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f4965c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4966d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4967e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3241j interfaceC3241j, androidx.compose.ui.e eVar, long j10, int i10, int i11) {
            super(2);
            this.f4963a = interfaceC3241j;
            this.f4964b = eVar;
            this.f4965c = j10;
            this.f4966d = i10;
            this.f4967e = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2711a.a(this.f4963a, this.f4964b, this.f4965c, interfaceC3540l, L0.a(this.f4966d | 1), this.f4967e);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.a$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3241j f4968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3241j interfaceC3241j) {
            super(1);
            this.f4968a = interfaceC3241j;
        }

        public final void a(J0.w wVar) {
            wVar.b(M.w.d(), new M.v(EnumC2726p.Cursor, this.f4968a.a(), M.u.Middle, true, null));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.a$d */
    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f4969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4970b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4971c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.f4969a = eVar;
            this.f4970b = i10;
            this.f4971c = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2711a.b(this.f4969a, interfaceC3540l, L0.a(this.f4970b | 1), this.f4971c);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.a$e */
    static final class e extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4972a = new e();

        /* renamed from: F.a$e$a, reason: collision with other inner class name */
        static final class C0208a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f4973a;

            /* renamed from: F.a$e$a$a, reason: collision with other inner class name */
            static final class C0209a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ float f4974a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ J0 f4975b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC6735w0 f4976c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0209a(float f10, J0 j02, AbstractC6735w0 abstractC6735w0) {
                    super(1);
                    this.f4974a = f10;
                    this.f4975b = j02;
                    this.f4976c = abstractC6735w0;
                }

                public final void a(InterfaceC7036c interfaceC7036c) {
                    interfaceC7036c.X1();
                    float f10 = this.f4974a;
                    J0 j02 = this.f4975b;
                    AbstractC6735w0 abstractC6735w0 = this.f4976c;
                    InterfaceC7037d interfaceC7037dK1 = interfaceC7036c.k1();
                    long jC = interfaceC7037dK1.c();
                    interfaceC7037dK1.d().j();
                    try {
                        InterfaceC7041h interfaceC7041hE = interfaceC7037dK1.e();
                        InterfaceC7041h.h(interfaceC7041hE, f10, 0.0f, 2, null);
                        interfaceC7041hE.i(45.0f, C6531g.f52335b.c());
                        InterfaceC7039f.Y(interfaceC7036c, j02, 0L, 0.0f, null, abstractC6735w0, 0, 46, null);
                    } finally {
                        interfaceC7037dK1.d().r();
                        interfaceC7037dK1.f(jC);
                    }
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((InterfaceC7036c) obj);
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0208a(long j10) {
                super(1);
                this.f4973a = j10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6237h invoke(C6233d c6233d) {
                float fI = C6537m.i(c6233d.c()) / 2.0f;
                return c6233d.p(new C0209a(fI, AbstractC3232a.d(c6233d, fI), AbstractC6735w0.a.b(AbstractC6735w0.f52966b, this.f4973a, 0, 2, null)));
            }
        }

        e() {
            super(3);
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-2126899193);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2126899193, i10, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
            }
            long jB = ((M.K) interfaceC3540l.t(M.L.b())).b();
            e.a aVar = androidx.compose.ui.e.f28771b0;
            boolean zJ = interfaceC3540l.j(jB);
            Object objF = interfaceC3540l.f();
            if (zJ || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C0208a(jB);
                interfaceC3540l.K(objF);
            }
            androidx.compose.ui.e eVarB0 = eVar.b0(androidx.compose.ui.draw.b.c(aVar, (InterfaceC6835l) objF));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarB0;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static {
        float fJ = Y0.h.j(25);
        f4959a = fJ;
        f4960b = Y0.h.j(Y0.h.j(fJ * 2.0f) / 2.4142137f);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(M.InterfaceC3241j r8, androidx.compose.ui.e r9, long r10, T.InterfaceC3540l r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.AbstractC2711a.a(M.j, androidx.compose.ui.e, long, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(694251107, i12, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            z.a0.a(d(androidx.compose.foundation.layout.r.w(eVar, f4960b, f4959a)), interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(eVar, i10, i11));
        }
    }

    private static final androidx.compose.ui.e d(androidx.compose.ui.e eVar) {
        return androidx.compose.ui.c.c(eVar, null, e.f4972a, 1, null);
    }
}
