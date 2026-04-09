package rf;

import A.InterfaceC2396c;
import Be.E;
import C0.C;
import E0.InterfaceC2629g;
import N.AbstractC3346t0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.z1;
import Yg.J;
import androidx.compose.ui.e;
import com.google.ar.core.ImageMetadata;
import com.ui.wifiman.ui.component.network.B;
import com.ui.wifiman.ui.component.network.C5219q;
import com.ui.wifiman.ui.teleport.y;
import f0.c;
import j0.AbstractC6234e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6778a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import q.AbstractC7385d;
import q.AbstractC7402u;
import q.C7390i;
import q.InterfaceC7383b;
import q.InterfaceC7386e;
import r.AbstractC7535j;
import rf.j;
import s9.b;
import s9.d;
import ta.AbstractC8049c;
import z.C8680c;
import z.InterfaceC8683f;
import z.W;
import z.Z;

/* loaded from: classes4.dex */
public abstract class j {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ rf.e f60443a;

        a(rf.e eVar) {
            this.f60443a = eVar;
        }

        public final void a(rf.e it, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(it, "it");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(it) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1021049591, i11, -1, "com.ui.wifiman.ui.teleport.component.TeleportTopologyItem.<anonymous> (TeleportTunnelNetworkTopology.kt:193)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C8680c.f fVarB = C8680c.f66832a.b();
            c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
            rf.e eVar = this.f60443a;
            C cB = W.b(fVarB, interfaceC1752cI, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z10 = Z.f66823a;
            interfaceC3540l.U(1938859694);
            if (eVar.c() != null) {
                E.b(androidx.compose.foundation.layout.o.k(aVar, Y0.h.j(8), 0.0f, 2, null), com.ui.wifiman.ui.teleport.C.b(eVar.c(), interfaceC3540l, 0), interfaceC3540l, 6, 0);
            }
            interfaceC3540l.J();
            B.t(aVar, it, interfaceC3540l, ((i11 << 3) & 112) | 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((rf.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f60444a;

        b(f fVar) {
            this.f60444a = fVar;
        }

        public final C5219q.c a(InterfaceC8683f BaseNetworkTopology, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(BaseNetworkTopology, "$this$BaseNetworkTopology");
            interfaceC3540l.U(-321708545);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-321708545, i10, -1, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.<anonymous> (TeleportTunnelNetworkTopology.kt:108)");
            }
            f fVar = this.f60444a;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return fVar;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class c implements mh.s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f60445a;

        c(long j10) {
            this.f60445a = j10;
        }

        @Override // mh.s
        public /* bridge */ /* synthetic */ Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((InterfaceC2396c) obj, ((Y0.h) obj2).s(), (rf.e) obj3, (InterfaceC3540l) obj4, ((Number) obj5).intValue());
            return J.f24997a;
        }

        public final void a(InterfaceC2396c BaseNetworkTopology, float f10, rf.e item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(BaseNetworkTopology, "$this$BaseNetworkTopology");
            AbstractC6492s.i(item, "item");
            if ((i10 & 48) == 0) {
                i11 = (interfaceC3540l.g(f10) ? 32 : 16) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 384) == 0) {
                i11 |= interfaceC3540l.T(item) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i11 & 1169) == 1168 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1560796040, i11, -1, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.<anonymous> (TeleportTunnelNetworkTopology.kt:111)");
            }
            j.f(androidx.compose.foundation.layout.r.s(androidx.compose.ui.e.f28771b0, f10), item, null, null, null, this.f60445a, interfaceC3540l, (i11 >> 3) & 112, 28);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
    }

    static final class d implements mh.t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f60446a;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f60447a;

            /* renamed from: rf.j$d$a$a, reason: collision with other inner class name */
            static final class C2118a implements mh.r {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1 f60448a;

                C2118a(z1 z1Var) {
                    this.f60448a = z1Var;
                }

                public final void a(InterfaceC7383b AnimatedContent, EnumC7605A icon, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(AnimatedContent, "$this$AnimatedContent");
                    AbstractC6492s.i(icon, "icon");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1907799023, i10, -1, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelNetworkTopology.kt:166)");
                    }
                    j.d(icon, ((C6733v0) this.f60448a.getValue()).u(), interfaceC3540l, (i10 >> 3) & 14);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.r
                public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                    a((InterfaceC7383b) obj, (EnumC7605A) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                    return J.f24997a;
                }
            }

            a(f fVar) {
                this.f60447a = fVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C7390i c(androidx.compose.animation.d AnimatedContent) {
                AbstractC6492s.i(AnimatedContent, "$this$AnimatedContent");
                return androidx.compose.animation.a.e(androidx.compose.animation.g.o(AbstractC7535j.l(200, 0, null, 6, null), 0.0f, 2, null), androidx.compose.animation.g.q(AbstractC7535j.l(200, 0, null, 6, null), 0.0f, 2, null));
            }

            public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1527746788, i10, -1, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelNetworkTopology.kt:131)");
                }
                z1 z1VarA = AbstractC7402u.a(com.ui.wifiman.ui.teleport.C.a(this.f60447a.g(), interfaceC3540l, 0), null, "conn color", null, interfaceC3540l, 384, 10);
                e.a aVar = androidx.compose.ui.e.f28771b0;
                rf.d dVar = rf.d.f60413a;
                androidx.compose.ui.e eVarA = AbstractC6234e.a(androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(dVar.b())), E.h.g());
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                androidx.compose.ui.e eVarD = androidx.compose.foundation.b.d(eVarA, c6562a.a(interfaceC3540l, i11).e().b(), null, 2, null);
                f0.c cVarE = f0.c.f46573a.e();
                f fVar = this.f60447a;
                C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarD);
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
                androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f28130a;
                AbstractC3346t0.a(1.0f, androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.a(interfaceC3540l, i11).a().g().g(), Y0.h.j(dVar.c()), 0L, 0, interfaceC3540l, 3126, 48);
                float fA = 0.0f;
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
                com.ui.wifiman.ui.teleport.y yVarG = fVar.g();
                if (!(yVarG instanceof y.c)) {
                    if (yVarG instanceof y.b) {
                        fA = ((y.b) fVar.g()).a();
                    } else {
                        if (!(yVarG instanceof y.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fA = 1.0f;
                    }
                }
                AbstractC3346t0.a(fA, eVarH, ((C6733v0) z1VarA.getValue()).u(), Y0.h.j(dVar.c()), 0L, 0, interfaceC3540l, 3120, 48);
                EnumC7605A enumC7605AM = j.m(fVar.g());
                interfaceC3540l.U(-937340797);
                Object objF = interfaceC3540l.f();
                if (objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: rf.k
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return j.d.a.c((androidx.compose.animation.d) obj);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                androidx.compose.animation.a.a(enumC7605AM, null, (InterfaceC6835l) objF, null, "conn progress", null, b0.c.e(-1907799023, true, new C2118a(z1VarA), interfaceC3540l, 54), interfaceC3540l, 1597824, 42);
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        d(f fVar) {
            this.f60446a = fVar;
        }

        @Override // mh.t
        public /* bridge */ /* synthetic */ Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            a((InterfaceC8683f) obj, (A.B) obj2, ((Y0.h) obj3).s(), ((C6733v0) obj4).u(), (InterfaceC3540l) obj5, ((Number) obj6).intValue());
            return J.f24997a;
        }

        public final void a(InterfaceC8683f BaseNetworkTopology, A.B unused$var$, float f10, long j10, InterfaceC3540l interfaceC3540l, int i10) {
            boolean z10;
            AbstractC6492s.i(BaseNetworkTopology, "$this$BaseNetworkTopology");
            AbstractC6492s.i(unused$var$, "$unused$var$");
            if ((i10 & 8193) == 8192 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1340697606, i10, -1, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.<anonymous> (TeleportTunnelNetworkTopology.kt:118)");
            }
            androidx.compose.ui.e eVarL = androidx.compose.foundation.layout.r.l(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), Y0.h.j(64));
            f0.c cVarE = f0.c.f46573a.e();
            f fVar = this.f60446a;
            C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarL);
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
            androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f28130a;
            com.ui.wifiman.ui.teleport.y yVarG = fVar.g();
            if ((yVarG instanceof y.a) || (yVarG instanceof y.b)) {
                z10 = true;
            } else {
                if (!(yVarG instanceof y.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            AbstractC7385d.f(z10, null, null, null, null, b0.c.e(1527746788, true, new a(fVar), interfaceC3540l, 54), interfaceC3540l, ImageMetadata.EDGE_MODE, 30);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60449a;

        static {
            int[] iArr = new int[EnumC7605A.values().length];
            try {
                iArr[EnumC7605A.CHECKMARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7605A.DOTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7605A.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60449a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final EnumC7605A enumC7605A, final long j10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2071994710);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(enumC7605A) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.j(j10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2071994710, i11, -1, "com.ui.wifiman.ui.teleport.component.Icon (TeleportTunnelNetworkTopology.kt:260)");
            }
            int i12 = e.f60449a[enumC7605A.ordinal()];
            if (i12 == 1) {
                interfaceC3540lR.U(1765003729);
                AbstractC8049c.c(N9.b.f16117a.p(), androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(rf.d.f60413a.a())), C6733v0.g(j10), null, interfaceC3540lR, ((i11 << 3) & 896) | 48, 4);
                interfaceC3540lR.J();
            } else if (i12 == 2) {
                interfaceC3540lR.U(1765010138);
                Be.C.c(null, 0, 0.0f, null, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().b().f(), interfaceC3540lR, 0, 15);
                interfaceC3540lR.J();
            } else {
                if (i12 != 3) {
                    interfaceC3540lR.U(1765001254);
                    interfaceC3540lR.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540lR.U(-1119177705);
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: rf.g
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.e(enumC7605A, j10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(EnumC7605A enumC7605A, long j10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(enumC7605A, j10, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final androidx.compose.ui.e r28, final rf.e r29, mh.q r30, mh.q r31, mh.q r32, long r33, T.InterfaceC3540l r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.j.f(androidx.compose.ui.e, rf.e, mh.q, mh.q, mh.q, long, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, rf.e eVar2, mh.q qVar, mh.q qVar2, mh.q qVar3, long j10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        f(eVar, eVar2, qVar, qVar2, qVar3, j10, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final androidx.compose.ui.e r19, final rf.f r20, long r21, T.InterfaceC3540l r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.j.h(androidx.compose.ui.e, rf.f, long, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(androidx.compose.ui.e eVar, f fVar, long j10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        h(eVar, fVar, j10, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC7605A m(com.ui.wifiman.ui.teleport.y yVar) {
        if (yVar instanceof y.a) {
            return EnumC7605A.CHECKMARK;
        }
        if (yVar instanceof y.b) {
            return EnumC7605A.DOTS;
        }
        if (yVar instanceof y.c) {
            return EnumC7605A.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f n(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1389413909);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1389413909, i10, -1, "com.ui.wifiman.ui.teleport.component.previewTopologyState (TeleportTunnelNetworkTopology.kt:272)");
        }
        int i11 = AbstractC6778a.f53239l0;
        f fVar = new f(new rf.e("0", new b.a(i11, null, null, 6, null), new d.c("Console"), new d.c("Online"), com.ui.wifiman.ui.teleport.z.ONLINE), new rf.e("1", new b.a(i11, null, null, 6, null), new d.c("Myself"), new d.c("Your Device"), com.ui.wifiman.ui.teleport.z.OFFLINE), new y.b(0.6f));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return fVar;
    }
}
