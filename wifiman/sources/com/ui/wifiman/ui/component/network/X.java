package com.ui.wifiman.ui.component.network;

import A.InterfaceC2396c;
import Af.v;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.AbstractC3309a0;
import N.O0;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import T.t1;
import T.z1;
import Zg.AbstractC3689v;
import android.content.res.Resources;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import b0.InterfaceC4038a;
import b8.AbstractC4074a;
import com.google.ar.core.ImageMetadata;
import com.ui.wifiman.ui.component.network.C5219q;
import com.ui.wifiman.ui.component.network.K;
import com.ui.wifiman.ui.component.network.X;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6778a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s.AbstractC7847h;
import s9.b;
import s9.d;
import sa.AbstractC7930a;
import sh.AbstractC7978m;
import sh.C7974i;
import ta.AbstractC8049c;
import z.InterfaceC8683f;

/* loaded from: classes4.dex */
public abstract class X {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s9.b f44384a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44385b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f44386c;

        a(s9.b bVar, String str, long j10) {
            this.f44384a = bVar;
            this.f44385b = str;
            this.f44386c = j10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-997237232, i10, -1, "com.ui.wifiman.ui.component.network.ExpandButton.<anonymous> (WifimanNetworkTopology.kt:357)");
            }
            AbstractC3309a0.a(AbstractC8049c.i(this.f44384a, interfaceC3540l, 0), this.f44385b, androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f44386c, interfaceC3540l, 384, 0);
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

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f44387a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44388b;

        b(InterfaceC6835l interfaceC6835l, String str) {
            this.f44387a = interfaceC6835l;
            this.f44388b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(InterfaceC6835l interfaceC6835l, String str) {
            interfaceC6835l.invoke(str);
            return Yg.J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1128108693, i10, -1, "com.ui.wifiman.ui.component.network.TopologyNodeConnectivityInfoRow.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:411)");
            }
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(androidx.compose.foundation.layout.o.k(androidx.compose.ui.e.f28771b0, Y0.h.j(2), 0.0f, 2, null), Y0.h.j(20));
            interfaceC3540l.U(595002927);
            boolean zT = interfaceC3540l.T(this.f44387a) | interfaceC3540l.T(this.f44388b);
            final InterfaceC6835l interfaceC6835l = this.f44387a;
            final String str = this.f44388b;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.Y
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return X.b.c(interfaceC6835l, str);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            N.Z.a((InterfaceC6824a) objF, eVarV, false, null, C5204b.f44452a.b(), interfaceC3540l, 24624, 12);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f44389a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f44390b;

        c(N n10, InterfaceC3551q0 interfaceC3551q0) {
            this.f44389a = n10;
            this.f44390b = interfaceC3551q0;
        }

        public final C5219q.c a(InterfaceC8683f BaseNetworkTopology, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(BaseNetworkTopology, "$this$BaseNetworkTopology");
            interfaceC3540l.U(-1862063391);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1862063391, i10, -1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous> (WifimanNetworkTopology.kt:157)");
            }
            C5219q c5219q = C5219q.f44518a;
            int i11 = (i10 & 14) | 384;
            boolean z10 = c5219q.f(BaseNetworkTopology, this.f44389a, interfaceC3540l, i11) && !((Boolean) this.f44390b.getValue()).booleanValue();
            int iG = c5219q.g(BaseNetworkTopology, this.f44389a, interfaceC3540l, i11);
            interfaceC3540l.U(1091656122);
            boolean zT = interfaceC3540l.T(this.f44389a) | interfaceC3540l.c(z10);
            N nE = this.f44389a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                if (z10 && iG >= 1) {
                    nE = N.e(nE, null, null, false, AbstractC3689v.b1(nE.h(), iG - 1), 7, null);
                }
                interfaceC3540l.K(nE);
                objF = nE;
            }
            N n10 = (N) objF;
            interfaceC3540l.J();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return n10;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class d implements mh.s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f44391a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44392b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f44393c;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f44394a;

            a(InterfaceC6835l interfaceC6835l) {
                this.f44394a = interfaceC6835l;
            }

            public final void a(M it, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(it, "it");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(it) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1487436102, i10, -1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:199)");
                }
                K kD = it.d();
                if (kD instanceof K.a) {
                    interfaceC3540l.U(742583272);
                    X.k(androidx.compose.ui.e.f28771b0, it.getId(), (K.a) it.d(), this.f44394a, interfaceC3540l, 6, 0);
                    interfaceC3540l.J();
                } else {
                    if (!(kD instanceof K.b)) {
                        interfaceC3540l.U(-1084427264);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-1084413150);
                    X.n(androidx.compose.ui.e.f28771b0, (K.b) it.d(), interfaceC3540l, 6);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((M) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        d(InterfaceC6835l interfaceC6835l, long j10, InterfaceC6835l interfaceC6835l2) {
            this.f44391a = interfaceC6835l;
            this.f44392b = j10;
            this.f44393c = interfaceC6835l2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(InterfaceC6835l interfaceC6835l, M m10) {
            interfaceC6835l.invoke(m10.getId());
            return Yg.J.f24997a;
        }

        @Override // mh.s
        public /* bridge */ /* synthetic */ Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            b((InterfaceC2396c) obj, ((Y0.h) obj2).s(), (M) obj3, (InterfaceC3540l) obj4, ((Number) obj5).intValue());
            return Yg.J.f24997a;
        }

        public final void b(InterfaceC2396c BaseNetworkTopology, float f10, final M item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(BaseNetworkTopology, "$this$BaseNetworkTopology");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(BaseNetworkTopology) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.g(f10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= interfaceC3540l.T(item) ? 256 : 128;
            }
            int i12 = i11;
            if ((i12 & 1171) == 1170 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(678502554, i12, -1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous> (WifimanNetworkTopology.kt:172)");
            }
            androidx.compose.ui.e eVarB = InterfaceC2396c.b(BaseNetworkTopology, androidx.compose.foundation.layout.r.s(androidx.compose.ui.e.f28771b0, f10), null, 1, null);
            boolean zC = item.c();
            interfaceC3540l.U(1091677574);
            boolean zT = interfaceC3540l.T(this.f44391a) | ((i12 & 896) == 256);
            final InterfaceC6835l interfaceC6835l = this.f44391a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.Z
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return X.d.c(interfaceC6835l, item);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            B.s(M9.i.f(eVarB, null, 0.0f, zC, (InterfaceC6824a) objF, interfaceC3540l, 0, 3), item, C5204b.f44452a.a(), null, b0.c.e(-1487436102, true, new a(this.f44393c), interfaceC3540l, 54), this.f44392b, interfaceC3540l, ((i12 >> 3) & 112) | 24960, 8);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
    }

    static final class e implements mh.t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f44395a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f44396b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f44397c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f44398d;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f44399a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f44400b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f44401c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f44402d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f44403e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f44404f;

            a(float f10, float f11, float f12, long j10, long j11, InterfaceC3551q0 interfaceC3551q0) {
                this.f44399a = f10;
                this.f44400b = f11;
                this.f44401c = f12;
                this.f44402d = j10;
                this.f44403e = j11;
                this.f44404f = interfaceC3551q0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J c(InterfaceC3551q0 interfaceC3551q0) {
                interfaceC3551q0.setValue(Boolean.valueOf(!((Boolean) interfaceC3551q0.getValue()).booleanValue()));
                return Yg.J.f24997a;
            }

            public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-697565285, i10, -1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:259)");
                }
                androidx.compose.ui.e eVarB = androidx.compose.foundation.layout.l.b(androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, this.f44399a), this.f44400b, this.f44401c);
                s9.b bVarL = N9.b.f16117a.l();
                String strA = H0.f.a(AbstractC6780c.f53285C1, interfaceC3540l, 0);
                long j10 = this.f44402d;
                long j11 = this.f44403e;
                interfaceC3540l.U(-1084318927);
                boolean zT = interfaceC3540l.T(this.f44404f);
                final InterfaceC3551q0 interfaceC3551q0 = this.f44404f;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.c0
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return X.e.a.c(interfaceC3551q0);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                X.i(eVarB, bVarL, j10, j11, strA, (InterfaceC6824a) objF, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f44405a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f44406b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f44407c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f44408d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f44409e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f44410f;

            b(float f10, float f11, float f12, long j10, long j11, InterfaceC3551q0 interfaceC3551q0) {
                this.f44405a = f10;
                this.f44406b = f11;
                this.f44407c = f12;
                this.f44408d = j10;
                this.f44409e = j11;
                this.f44410f = interfaceC3551q0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J c(InterfaceC3551q0 interfaceC3551q0) {
                interfaceC3551q0.setValue(Boolean.valueOf(!((Boolean) interfaceC3551q0.getValue()).booleanValue()));
                return Yg.J.f24997a;
            }

            public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(669948626, i10, -1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:288)");
                }
                androidx.compose.ui.e eVarB = androidx.compose.foundation.layout.l.b(androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, this.f44405a), this.f44406b, this.f44407c);
                s9.b bVarI = N9.b.f16117a.i();
                String strA = H0.f.a(AbstractC6780c.f53278B1, interfaceC3540l, 0);
                long j10 = this.f44408d;
                long j11 = this.f44409e;
                interfaceC3540l.U(-1084282095);
                boolean zT = interfaceC3540l.T(this.f44410f);
                final InterfaceC3551q0 interfaceC3551q0 = this.f44410f;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.d0
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return X.e.b.c(interfaceC3551q0);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                X.i(eVarB, bVarI, j10, j11, strA, (InterfaceC6824a) objF, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        static final class c implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f44411a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f44412b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f44413c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f44414d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f44415e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Y0.d f44416f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f44417g;

            static final class a implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f44418a;

                a(long j10) {
                    this.f44418a = j10;
                }

                public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1009212484, i10, -1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous>.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:324)");
                    }
                    e.a aVar = androidx.compose.ui.e.f28771b0;
                    androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(32));
                    f0.c cVarE = f0.c.f46573a.e();
                    long j10 = this.f44418a;
                    C0.C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
                    int iA = AbstractC3536j.a(interfaceC3540l, 0);
                    InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                    androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarV);
                    InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
                    InterfaceC6824a interfaceC6824aA = aVar2.a();
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
                    E1.c(interfaceC3540lA, cH, aVar2.e());
                    E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
                    InterfaceC6839p interfaceC6839pB = aVar2.b();
                    if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                        interfaceC3540lA.K(Integer.valueOf(iA));
                        interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                    }
                    E1.c(interfaceC3540lA, eVarE, aVar2.f());
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
                    AbstractC8049c.c(Pe.a.f18599a.z().g(new d.b(AbstractC6780c.f53538n)), androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(24)), C6733v0.g(j10), null, interfaceC3540l, 48, 4);
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

            c(float f10, float f11, int i10, int i11, int i12, Y0.d dVar, long j10) {
                this.f44411a = f10;
                this.f44412b = f11;
                this.f44413c = i10;
                this.f44414d = i11;
                this.f44415e = i12;
                this.f44416f = dVar;
                this.f44417g = j10;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1951926144, i10, -1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:315)");
                }
                float f10 = 32;
                float f11 = 2;
                O0.a(androidx.compose.foundation.layout.l.b(androidx.compose.ui.e.f28771b0, Y0.h.j(Y0.h.j(this.f44411a + Y0.h.j(Y0.h.j(this.f44412b * ((this.f44413c - this.f44414d) - 1)) - Y0.h.j(Y0.h.j(f10) / f11))) - Y0.h.j(Y0.h.j(this.f44415e) / this.f44416f.getDensity())), Y0.h.j(Y0.h.j(Y0.h.j(64) / f11) - Y0.h.j(Y0.h.j(f10) / f11))), E.h.g(), 0L, 0L, AbstractC7847h.a(Y0.h.j(1), this.f44417g), 0.0f, b0.c.e(-1009212484, true, new a(this.f44417g), interfaceC3540l, 54), interfaceC3540l, 1572864, 44);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        e(N n10, InterfaceC3551q0 interfaceC3551q0, float f10, long j10) {
            this.f44395a = n10;
            this.f44396b = interfaceC3551q0;
            this.f44397c = f10;
            this.f44398d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int e(A.B b10) {
            return b10.r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(A.B b10) {
            return b10.s();
        }

        @Override // mh.t
        public /* bridge */ /* synthetic */ Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            c((InterfaceC8683f) obj, (A.B) obj2, ((Y0.h) obj3).s(), ((C6733v0) obj4).u(), (InterfaceC3540l) obj5, ((Number) obj6).intValue());
            return Yg.J.f24997a;
        }

        public final void c(InterfaceC8683f BaseNetworkTopology, final A.B itemListState, float f10, long j10, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            int i12;
            int i13;
            float f11;
            float f12;
            float f13;
            int i14;
            int i15;
            int i16;
            boolean z10;
            boolean z11;
            float f14;
            int i17;
            AbstractC6492s.i(BaseNetworkTopology, "$this$BaseNetworkTopology");
            AbstractC6492s.i(itemListState, "itemListState");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(BaseNetworkTopology) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.T(itemListState) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= interfaceC3540l.g(f10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= interfaceC3540l.j(j10) ? 2048 : 1024;
            }
            if ((i11 & 9363) == 9362 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(61221288, i11, -1, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous> (WifimanNetworkTopology.kt:216)");
            }
            C5219q c5219q = C5219q.f44518a;
            int i18 = i11 & 14;
            int i19 = i18 | 384;
            boolean zF = c5219q.f(BaseNetworkTopology, this.f44395a, interfaceC3540l, i19);
            boolean zBooleanValue = ((Boolean) this.f44396b.getValue()).booleanValue();
            int iD = c5219q.d(BaseNetworkTopology, interfaceC3540l, i18 | 48);
            interfaceC3540l.U(1091740740);
            int iE = (!zF || ((Boolean) this.f44396b.getValue()).booleanValue()) ? c5219q.e(this.f44395a) : c5219q.g(BaseNetworkTopology, this.f44395a, interfaceC3540l, i19);
            interfaceC3540l.J();
            Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
            float fJ = Y0.h.j(26);
            float f15 = 2;
            float fJ2 = Y0.h.j(fJ / f15);
            interfaceC3540l.U(1091749935);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = o1.e(new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.a0
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return Integer.valueOf(X.e.e(itemListState));
                    }
                });
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            int iIntValue = ((Number) ((z1) objF).getValue()).intValue();
            int iCeil = ((int) Math.ceil(iIntValue + (BaseNetworkTopology.b() / f10))) - 1;
            interfaceC3540l.U(1091757654);
            Object objF2 = interfaceC3540l.f();
            if (objF2 == aVar.a()) {
                objF2 = o1.e(new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.b0
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return Integer.valueOf(X.e.f(itemListState));
                    }
                });
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            int iIntValue2 = ((Number) ((z1) objF2).getValue()).intValue();
            float fJ3 = Y0.h.j(Y0.h.j(Y0.h.j(64) / f15) - fJ2);
            float fJ4 = Y0.h.j(Y0.h.j(Y0.h.j(Y0.h.j(Y0.h.j(-fJ2) + f10) + (iIntValue == 0 ? this.f44397c : Y0.h.j(0))) + Y0.h.j(-Y0.h.j(Math.max(0, iIntValue - 1) * f10))) + Y0.h.j(-Y0.h.j(Y0.h.j(iIntValue2) / dVar.getDensity())));
            interfaceC3540l.U(1091791732);
            float f16 = -fJ;
            if (Y0.h.h(fJ4, Y0.h.j(f16)) > 0) {
                f11 = f16;
                f12 = fJ4;
                i12 = iIntValue;
                f13 = fJ;
                i14 = iE;
                i13 = iIntValue2;
                i16 = 54;
                i15 = 3;
                AbstractC7385d.f(zF && !zBooleanValue, null, androidx.compose.animation.g.o(null, 0.0f, 3, null), androidx.compose.animation.g.q(null, 0.0f, 3, null), null, b0.c.e(-697565285, true, new a(fJ, fJ4, fJ3, this.f44398d, j10, this.f44396b), interfaceC3540l, 54), interfaceC3540l, 200064, 18);
            } else {
                i12 = iIntValue;
                i13 = iIntValue2;
                f11 = f16;
                f12 = fJ4;
                f13 = fJ;
                i14 = iE;
                i15 = 3;
                i16 = 54;
            }
            interfaceC3540l.J();
            float fJ5 = Y0.h.j(f12 + Y0.h.j(Math.max(0, this.f44395a.h().size() - (iD - 1)) * f10));
            interfaceC3540l.U(1091828440);
            if (Y0.h.h(fJ5, Y0.h.j(f11)) > 0) {
                boolean z12 = zF && zBooleanValue;
                androidx.compose.animation.i iVarO = androidx.compose.animation.g.o(null, 0.0f, i15, null);
                androidx.compose.animation.k kVarQ = androidx.compose.animation.g.q(null, 0.0f, i15, null);
                InterfaceC4038a interfaceC4038aE = b0.c.e(669948626, true, new b(f13, fJ5, fJ3, this.f44398d, j10, this.f44396b), interfaceC3540l, i16);
                f14 = 0.0f;
                z10 = false;
                z11 = true;
                AbstractC7385d.f(z12, null, iVarO, kVarQ, null, interfaceC4038aE, interfaceC3540l, 200064, 18);
            } else {
                z10 = false;
                z11 = true;
                f14 = 0.0f;
            }
            interfaceC3540l.J();
            long jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
            if (this.f44395a.i()) {
                i17 = i14;
                if (iCeil == i17) {
                    z10 = z11;
                }
            } else {
                i17 = i14;
            }
            AbstractC7385d.f(z10, null, androidx.compose.animation.g.o(null, f14, 3, null), androidx.compose.animation.g.q(null, f14, 3, null), null, b0.c.e(-1951926144, z11, new c(this.f44397c, f10, i17, i12, i13, dVar, jF), interfaceC3540l, 54), interfaceC3540l, 200064, 18);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final androidx.compose.ui.e eVar, final s9.b bVar, final long j10, final long j11, final String str, final InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1643195831);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(bVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.j(j10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.j(j11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.T(str) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6824a) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) == 74898 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1643195831, i11, -1, "com.ui.wifiman.ui.component.network.ExpandButton (WifimanNetworkTopology.kt:349)");
            }
            O0.b(interfaceC6824a, eVar, false, E.h.g(), j10, 0L, AbstractC7847h.a(Y0.h.j(1), j11), 0.0f, null, b0.c.e(-997237232, true, new a(bVar, str, j11), interfaceC3540lR, 54), interfaceC3540lR, ((i11 >> 15) & 14) | 805306368 | ((i11 << 3) & 112) | ((i11 << 6) & 57344), 420);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.S
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return X.j(eVar, bVar, j10, j11, str, interfaceC6824a, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(androidx.compose.ui.e eVar, s9.b bVar, long j10, long j11, String str, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        i(eVar, bVar, j10, j11, str, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(final androidx.compose.ui.e r33, final java.lang.String r34, final com.ui.wifiman.ui.component.network.K.a r35, mh.InterfaceC6835l r36, T.InterfaceC3540l r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.component.network.X.k(androidx.compose.ui.e, java.lang.String, com.ui.wifiman.ui.component.network.K$a, mh.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J l(androidx.compose.ui.e eVar, String str, K.a aVar, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        k(eVar, str, aVar, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(String it) {
        AbstractC6492s.i(it, "it");
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final androidx.compose.ui.e eVar, final K.b bVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1835676401);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(bVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1835676401, i12, -1, "com.ui.wifiman.ui.component.network.TopologyNodeInternetStateInfoRow (WifimanNetworkTopology.kt:441)");
            }
            C3174d c3174dA = AbstractC7930a.a(Ne.c.d(bVar.a(), true), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, eVar, c6562a.a(interfaceC3540lR, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.c(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().a(), interfaceC3540l2, (i12 << 3) & 112, 3120, 120824);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.Q
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return X.o(eVar, bVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(androidx.compose.ui.e eVar, K.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        n(eVar, bVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p(final androidx.compose.ui.e r26, final com.ui.wifiman.ui.component.network.N r27, long r28, long r30, float r32, boolean r33, mh.InterfaceC6835l r34, mh.InterfaceC6835l r35, T.InterfaceC3540l r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.component.network.X.p(androidx.compose.ui.e, com.ui.wifiman.ui.component.network.N, long, long, float, boolean, mh.l, mh.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J q(String it) {
        AbstractC6492s.i(it, "it");
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J r(String it) {
        AbstractC6492s.i(it, "it");
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3551q0 s(boolean z10) {
        return t1.d(Boolean.valueOf(z10), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J t(androidx.compose.ui.e eVar, N n10, long j10, long j11, float f10, boolean z10, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        p(eVar, n10, j10, j11, f10, z10, interfaceC6835l, interfaceC6835l2, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N y(int i10, boolean z10, InterfaceC3540l interfaceC3540l, int i11, int i12) {
        interfaceC3540l.U(-1528287607);
        boolean z11 = (i12 & 2) != 0 ? false : z10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1528287607, i11, -1, "com.ui.wifiman.ui.component.network.previewTopologyState (WifimanNetworkTopology.kt:453)");
        }
        M m10 = new M("internet", new b.a(AbstractC6778a.f53239l0, null, null, 6, null), new d.c("Internet"), null, null, new K.b(AbstractC4074a.C1143a.f32999a), true);
        L l10 = L.REACHABLE;
        C7974i c7974iS = AbstractC7978m.s(0, i10);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974iS, 10));
        Iterator it = c7974iS.iterator();
        while (it.hasNext()) {
            int iD = ((Zg.Q) it).d();
            String strValueOf = String.valueOf(iD);
            b.a aVar = new b.a(AbstractC6778a.f53239l0, null, null, 6, null);
            d.c cVar = new d.c("Device " + iD + " tralala");
            v.a aVar2 = v.a.f740a;
            d.c cVar2 = new d.c("10.0.0." + iD);
            Integer numValueOf = Integer.valueOf(iD);
            Iterator it2 = it;
            int i13 = iD % 2;
            int i14 = i13 + ((((i13 ^ 2) & ((-i13) | i13)) >> 31) & 2);
            arrayList.add(Yg.z.a(new M(strValueOf, aVar, cVar, aVar2, cVar2, new K.a(numValueOf, new d.c((100 - iD) + "%"), i14 == 0), false), i14 == 0 ? C5219q.a.WIRED : C5219q.a.WIRELESS));
            it = it2;
        }
        N n10 = new N(m10, l10, z11, arrayList);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return n10;
    }
}
