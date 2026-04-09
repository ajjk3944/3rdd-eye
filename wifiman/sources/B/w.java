package B;

import C0.U;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import T.z1;
import c0.InterfaceC4176e;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public abstract class w {

    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f1017a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f1018b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f1019c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1 f1020d;

        /* renamed from: B.w$a$a, reason: collision with other inner class name */
        static final class C0040a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.d f1021a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f1022b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.x f1023c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Q f1024d;

            /* renamed from: B.w$a$a$a, reason: collision with other inner class name */
            public static final class C0041a implements T.K {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.lazy.layout.d f1025a;

                public C0041a(androidx.compose.foundation.lazy.layout.d dVar) {
                    this.f1025a = dVar;
                }

                @Override // T.K
                public void dispose() {
                    this.f1025a.f(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0040a(androidx.compose.foundation.lazy.layout.d dVar, r rVar, androidx.compose.ui.layout.x xVar, Q q10) {
                super(1);
                this.f1021a = dVar;
                this.f1022b = rVar;
                this.f1023c = xVar;
                this.f1024d = q10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T.K invoke(T.L l10) {
                this.f1021a.f(new androidx.compose.foundation.lazy.layout.h(this.f1022b, this.f1023c, this.f1024d));
                return new C0041a(this.f1021a);
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f1026a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f1027b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(r rVar, InterfaceC6839p interfaceC6839p) {
                super(2);
                this.f1026a = rVar;
                this.f1027b = interfaceC6839p;
            }

            public final C0.D a(U u10, long j10) {
                return (C0.D) this.f1027b.invoke(new y(this.f1026a, u10), Y0.b.a(j10));
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((U) obj, ((Y0.b) obj2).r());
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f1028a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(z1 z1Var) {
                super(0);
                this.f1028a = z1Var;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2455t invoke() {
                return (InterfaceC2455t) ((InterfaceC6824a) this.f1028a.getValue()).invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.lazy.layout.d dVar, androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, z1 z1Var) {
            super(3);
            this.f1017a = dVar;
            this.f1018b = eVar;
            this.f1019c = interfaceC6839p;
            this.f1020d = z1Var;
        }

        public final void a(InterfaceC4176e interfaceC4176e, InterfaceC3540l interfaceC3540l, int i10) {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1488997347, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
            }
            z1 z1Var = this.f1020d;
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = new r(interfaceC4176e, new c(z1Var));
                interfaceC3540l.K(objF);
            }
            r rVar = (r) objF;
            Object objF2 = interfaceC3540l.f();
            if (objF2 == aVar.a()) {
                objF2 = new androidx.compose.ui.layout.x(new v(rVar));
                interfaceC3540l.K(objF2);
            }
            androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) objF2;
            if (this.f1017a != null) {
                interfaceC3540l.U(205264983);
                Q qD = this.f1017a.d();
                if (qD == null) {
                    interfaceC3540l.U(6622915);
                    qD = S.a(interfaceC3540l, 0);
                } else {
                    interfaceC3540l.U(6621830);
                }
                interfaceC3540l.J();
                Object[] objArr = {this.f1017a, rVar, xVar, qD};
                boolean zT = interfaceC3540l.T(this.f1017a) | interfaceC3540l.l(rVar) | interfaceC3540l.l(xVar) | interfaceC3540l.l(qD);
                androidx.compose.foundation.lazy.layout.d dVar = this.f1017a;
                Object objF3 = interfaceC3540l.f();
                if (zT || objF3 == aVar.a()) {
                    objF3 = new C0040a(dVar, rVar, xVar, qD);
                    interfaceC3540l.K(objF3);
                }
                T.O.d(objArr, (InterfaceC6835l) objF3, interfaceC3540l, 0);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(205858881);
                interfaceC3540l.J();
            }
            androidx.compose.ui.e eVarB = androidx.compose.foundation.lazy.layout.e.b(this.f1018b, this.f1017a);
            boolean zT2 = interfaceC3540l.T(rVar) | interfaceC3540l.T(this.f1019c);
            InterfaceC6839p interfaceC6839p = this.f1019c;
            Object objF4 = interfaceC3540l.f();
            if (zT2 || objF4 == aVar.a()) {
                objF4 = new b(rVar, interfaceC6839p);
                interfaceC3540l.K(objF4);
            }
            androidx.compose.ui.layout.w.b(xVar, eVarB, (InterfaceC6839p) objF4, interfaceC3540l, androidx.compose.ui.layout.x.f29085f, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC4176e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f1029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f1030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f1031c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f1032d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1033e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1034f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, androidx.compose.foundation.lazy.layout.d dVar, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f1029a = interfaceC6824a;
            this.f1030b = eVar;
            this.f1031c = dVar;
            this.f1032d = interfaceC6839p;
            this.f1033e = i10;
            this.f1034f = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            w.a(this.f1029a, this.f1030b, this.f1031c, this.f1032d, interfaceC3540l, L0.a(this.f1033e | 1), this.f1034f);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, androidx.compose.foundation.lazy.layout.d dVar, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.l(interfaceC6824a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(dVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                dVar = null;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2002163445, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            H.a(b0.c.e(-1488997347, true, new a(dVar, eVar, interfaceC6839p, o1.n(interfaceC6824a, interfaceC3540lR, i12 & 14)), interfaceC3540lR, 54), interfaceC3540lR, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        androidx.compose.foundation.lazy.layout.d dVar2 = dVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(interfaceC6824a, eVar2, dVar2, interfaceC6839p, i10, i11));
        }
    }
}
