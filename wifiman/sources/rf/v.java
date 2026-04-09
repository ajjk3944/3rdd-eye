package rf;

import C0.C;
import E0.InterfaceC2629g;
import Ii.AbstractC3063k;
import Ii.N;
import L0.C3174d;
import L0.U;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import N.P0;
import N.Q0;
import N.R0;
import N.Y;
import N.a1;
import N.b1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.K;
import T.L;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import T.t1;
import T.z1;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import com.google.ar.core.ImageMetadata;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import j0.AbstractC6234e;
import j0.AbstractC6240k;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.C7390i;
import q.InterfaceC7383b;
import r.AbstractC7535j;
import r.InterfaceC7533i;
import r.r0;
import rf.v;
import sa.AbstractC7930a;
import y.AbstractC8557l;
import y.C8546a;
import y.C8547b;
import y.C8548c;
import y.InterfaceC8555j;
import y.InterfaceC8556k;
import y.InterfaceC8558m;
import y.InterfaceC8560o;
import z.AbstractC8682e;
import z.C8680c;
import z.InterfaceC8681d;
import z.InterfaceC8683f;
import z.W;
import z.Z;

/* loaded from: classes4.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final r0 f60478a = new r0(100, 0, null, 6, null);

    static final class a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s9.d f60479a;

        /* renamed from: rf.v$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2119a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f60480a;

            static {
                int[] iArr = new int[rf.b.values().length];
                try {
                    iArr[rf.b.ENABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[rf.b.DISABLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[rf.b.IDLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f60480a = iArr;
            }
        }

        a(s9.d dVar) {
            this.f60479a = dVar;
        }

        public final void a(InterfaceC7383b AnimatedContent, rf.b s10, InterfaceC3540l interfaceC3540l, int i10) {
            long jF;
            U uB;
            AbstractC6492s.i(AnimatedContent, "$this$AnimatedContent");
            AbstractC6492s.i(s10, "s");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(653170867, i10, -1, "com.ui.wifiman.ui.teleport.component.SwitchButton.<anonymous> (TeleportTunnelSwitch.kt:247)");
            }
            C3174d c3174dA = AbstractC7930a.a(this.f60479a, interfaceC3540l, 0);
            int iA = W0.j.f23523b.a();
            int[] iArr = C2119a.f60480a;
            int i11 = iArr[s10.ordinal()];
            if (i11 == 1 || i11 == 2) {
                interfaceC3540l.U(967049111);
                jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
                interfaceC3540l.J();
            } else {
                if (i11 != 3) {
                    interfaceC3540l.U(967045376);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(967051159);
                jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().a();
                interfaceC3540l.J();
            }
            long j10 = jF;
            int i12 = iArr[s10.ordinal()];
            if (i12 == 1 || i12 == 2) {
                interfaceC3540l.U(967056285);
                uB = C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).a().b();
                interfaceC3540l.J();
            } else {
                if (i12 != 3) {
                    interfaceC3540l.U(967052594);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(967058749);
                uB = C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).b().b();
                interfaceC3540l.J();
            }
            a1.c(c3174dA, null, j10, 0L, null, null, null, 0L, null, W0.j.h(iA), 0L, 0, false, 0, 0, null, null, uB, interfaceC3540l, 0, 0, 130554);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((InterfaceC7383b) obj, (rf.b) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f60481a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f60482b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.snapshots.k f60483c;

        static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.k f60484a;

            a(androidx.compose.runtime.snapshots.k kVar) {
                this.f60484a = kVar;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
                if (interfaceC8555j instanceof InterfaceC8560o.b) {
                    this.f60484a.add(interfaceC8555j);
                } else if (interfaceC8555j instanceof InterfaceC8560o.c) {
                    this.f60484a.remove(((InterfaceC8560o.c) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof InterfaceC8560o.a) {
                    this.f60484a.remove(((InterfaceC8560o.a) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof C8547b) {
                    this.f60484a.add(interfaceC8555j);
                } else if (interfaceC8555j instanceof C8548c) {
                    this.f60484a.remove(((C8548c) interfaceC8555j).a());
                } else if (interfaceC8555j instanceof C8546a) {
                    this.f60484a.remove(((C8546a) interfaceC8555j).a());
                }
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC8556k interfaceC8556k, androidx.compose.runtime.snapshots.k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f60482b = interfaceC8556k;
            this.f60483c = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f60482b, this.f60483c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f60481a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3220g interfaceC3220gB = this.f60482b.b();
                a aVar = new a(this.f60483c);
                this.f60481a = 1;
                if (interfaceC3220gB.b(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f60485a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R0 f60486b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(R0 r02, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f60486b = r02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f60486b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f60485a;
            if (i10 == 0) {
                Yg.v.b(obj);
                R0 r02 = this.f60486b;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(false);
                this.f60485a = 1;
                if (R0.j(r02, boolA, null, this, 2, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f60487a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R0 f60488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(R0 r02, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f60488b = r02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f60488b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f60487a;
            if (i10 == 0) {
                Yg.v.b(obj);
                R0 r02 = this.f60488b;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(true);
                this.f60487a = 1;
                if (R0.j(r02, boolA, null, this, 2, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f60489a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R0 f60490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f60491c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f60492d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s9.d f60493e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s9.d f60494f;

        e(InterfaceC6835l interfaceC6835l, R0 r02, boolean z10, InterfaceC8558m interfaceC8558m, s9.d dVar, s9.d dVar2) {
            this.f60489a = interfaceC6835l;
            this.f60490b = r02;
            this.f60491c = z10;
            this.f60492d = interfaceC8558m;
            this.f60493e = dVar;
            this.f60494f = dVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b1 c(boolean z10, boolean z11) {
            return new Y(0.5f);
        }

        public final void b(InterfaceC8683f BoxWithConstraints, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(BoxWithConstraints) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1173751108, i11, -1, "com.ui.wifiman.ui.teleport.component.TeleportTunnelSwitch.<anonymous> (TeleportTunnelSwitch.kt:93)");
            }
            float fB = BoxWithConstraints.b();
            float fE = BoxWithConstraints.e();
            float fD1 = ((Y0.d) interfaceC3540l.t(AbstractC3932k0.g())).d1(Y0.h.j(fB / 2));
            e.a aVar = androidx.compose.ui.e.f28771b0;
            Map mapK = Zg.U.k(Yg.z.a(Float.valueOf(0.0f), Boolean.FALSE), Yg.z.a(Float.valueOf(fD1), Boolean.TRUE));
            w.q qVar = w.q.Horizontal;
            boolean z10 = this.f60489a != null;
            R0 r02 = this.f60490b;
            boolean z11 = this.f60491c;
            InterfaceC8558m interfaceC8558m = this.f60492d;
            interfaceC3540l.U(-711323717);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: rf.w
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return v.e.c(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarF = Q0.f(aVar, r02, mapK, qVar, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 8) != 0 ? true : z10, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 16) != 0 ? false : z11, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 32) != 0 ? null : interfaceC8558m, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 64) != 0 ? Q0.a.f13911a : (InterfaceC6839p) objF, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 128) != 0 ? P0.d(P0.f13906a, mapK.keySet(), 0.0f, 0.0f, 6, null) : null, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? P0.f13906a.b() : 0.0f);
            R0 r03 = this.f60490b;
            s9.d dVar = this.f60493e;
            s9.d dVar2 = this.f60494f;
            InterfaceC8558m interfaceC8558m2 = this.f60492d;
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarF);
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
            v.n(androidx.compose.foundation.layout.f.f28130a, fB, fE, dVar, dVar2, r03.s(), r03, interfaceC8558m2, interfaceC3540l, 12582918);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60495a;

        static {
            int[] iArr = new int[rf.c.values().length];
            try {
                iArr[rf.c.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rf.c.SWIPING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rf.c.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60495a = iArr;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f60496a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f60497b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ R0 f60498c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Object obj, R0 r02, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f60497b = obj;
            this.f60498c = r02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new g(this.f60497b, this.f60498c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f60496a;
            if (i10 == 0) {
                Yg.v.b(obj);
                if (!AbstractC6492s.d(this.f60497b, this.f60498c.o())) {
                    R0 r02 = this.f60498c;
                    Object obj2 = this.f60497b;
                    this.f60496a = 1;
                    if (R0.j(r02, obj2, null, this, 2, null) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final class h implements K {
        @Override // T.K
        public void dispose() {
        }
    }

    private static final void k(final androidx.compose.ui.e eVar, final s9.d dVar, final rf.b bVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-66512619);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(bVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-66512619, i11, -1, "com.ui.wifiman.ui.teleport.component.SwitchButton (TeleportTunnelSwitch.kt:232)");
            }
            interfaceC3540lR.U(953590841);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: rf.r
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return v.l((androidx.compose.animation.d) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            androidx.compose.animation.a.a(bVar, eVar, (InterfaceC6835l) objF, null, "teleport switch", null, b0.c.e(653170867, true, new a(dVar), interfaceC3540lR, 54), interfaceC3540lR, ((i11 >> 6) & 14) | 1597824 | ((i11 << 3) & 112), 40);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: rf.s
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return v.m(eVar, dVar, bVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7390i l(androidx.compose.animation.d AnimatedContent) {
        AbstractC6492s.i(AnimatedContent, "$this$AnimatedContent");
        return androidx.compose.animation.a.e(androidx.compose.animation.g.o(AbstractC7535j.l(400, 0, null, 6, null), 0.0f, 2, null), androidx.compose.animation.g.q(AbstractC7535j.l(400, 200, null, 4, null), 0.0f, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(androidx.compose.ui.e eVar, s9.d dVar, rf.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        k(eVar, dVar, bVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final InterfaceC8681d interfaceC8681d, final float f10, final float f11, final s9.d dVar, final s9.d dVar2, final z1 z1Var, final R0 r02, final InterfaceC8556k interfaceC8556k, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        long jB;
        final R0 r03;
        rf.b bVar;
        rf.b bVar2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2103044343);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(interfaceC8681d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.g(f11) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(dVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.T(dVar2) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC3540lR.T(z1Var) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC3540lR.T(r02) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i10) == 0) {
            i11 |= interfaceC3540lR.T(interfaceC8556k) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) == 4793490 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2103044343, i11, -1, "com.ui.wifiman.ui.teleport.component.SwitchImpl (TeleportTunnelSwitch.kt:132)");
            }
            interfaceC3540lR.U(587346674);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = o1.f();
                interfaceC3540lR.K(objF);
            }
            androidx.compose.runtime.snapshots.k kVar = (androidx.compose.runtime.snapshots.k) objF;
            interfaceC3540lR.J();
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new T.A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(objF2);
            }
            final N nA = ((T.A) objF2).a();
            interfaceC3540lR.U(587351594);
            boolean z10 = (29360128 & i11) == 8388608;
            Object objF3 = interfaceC3540lR.f();
            if (z10 || objF3 == aVar.a()) {
                objF3 = new b(interfaceC8556k, kVar, null);
                interfaceC3540lR.K(objF3);
            }
            interfaceC3540lR.J();
            O.f(interfaceC8556k, (InterfaceC6839p) objF3, interfaceC3540lR, (i11 >> 21) & 14);
            float fJ = Y0.h.j(32);
            AbstractC6784a abstractC6784aA = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b);
            interfaceC3540lR.U(587374193);
            boolean zT = interfaceC3540lR.T(abstractC6784aA);
            Object objF4 = interfaceC3540lR.f();
            if (zT || objF4 == aVar.a()) {
                if (abstractC6784aA instanceof AbstractC6784a.d) {
                    jB = ((AbstractC6784a.d) abstractC6784aA).e().b();
                } else {
                    if (!(abstractC6784aA instanceof AbstractC6784a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jB = ((AbstractC6784a.b) abstractC6784aA).a().g().b();
                }
                objF4 = C6733v0.g(jB);
                interfaceC3540lR.K(objF4);
            }
            long jU = ((C6733v0) objF4).u();
            interfaceC3540lR.J();
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            c.a aVar3 = f0.c.f46573a;
            androidx.compose.ui.e eVarF = interfaceC8681d.f(aVar2, aVar3.h());
            interfaceC3540lR.U(587383805);
            boolean z11 = (458752 & i11) == 131072;
            Object objF5 = interfaceC3540lR.f();
            if (z11 || objF5 == aVar.a()) {
                objF5 = new InterfaceC6835l() { // from class: rf.n
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return v.r(z1Var, (Y0.d) obj);
                    }
                };
                interfaceC3540lR.K(objF5);
            }
            interfaceC3540lR.J();
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.c(AbstractC6240k.b(androidx.compose.foundation.layout.o.i(androidx.compose.foundation.layout.r.w(androidx.compose.foundation.j.b(androidx.compose.foundation.layout.l.a(eVarF, (InterfaceC6835l) objF5), interfaceC8556k, Q.o.c(false, fJ, 0L, 4, null)), Y0.h.j(f10 / 2), f11), Y0.h.j(3)), Y0.h.j(5), E.h.d(fJ), false, 0L, 0L, 24, null), jU, E.h.d(fJ)), interfaceC3540lR, 0);
            rf.c cVar = ((Boolean) r02.o()).booleanValue() != ((Boolean) r02.u()).booleanValue() ? rf.c.SWIPING : ((Boolean) r02.o()).booleanValue() ? rf.c.ENABLED : rf.c.DISABLED;
            androidx.compose.ui.e eVarW = androidx.compose.foundation.layout.r.w(aVar2, f10, f11);
            C cB = W.b(C8680c.f66832a.f(), aVar3.i(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarW);
            InterfaceC2629g.a aVar4 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar4.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cB, aVar4.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar4.g());
            InterfaceC6839p interfaceC6839pB = aVar4.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar4.f());
            Z z12 = Z.f66823a;
            androidx.compose.ui.e eVarA = z12.a(aVar2, 1.0f, true);
            interfaceC3540lR.U(-418569142);
            Object objF6 = interfaceC3540lR.f();
            if (objF6 == aVar.a()) {
                objF6 = AbstractC8557l.a();
                interfaceC3540lR.K(objF6);
            }
            InterfaceC8558m interfaceC8558m = (InterfaceC8558m) objF6;
            interfaceC3540lR.J();
            interfaceC3540lR.U(-418565600);
            int i12 = 3670016 & i11;
            boolean zL = interfaceC3540lR.l(nA) | (i12 == 1048576);
            Object objF7 = interfaceC3540lR.f();
            if (zL || objF7 == aVar.a()) {
                r03 = r02;
                objF7 = new InterfaceC6824a() { // from class: rf.o
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return v.o(nA, r03);
                    }
                };
                interfaceC3540lR.K(objF7);
            } else {
                r03 = r02;
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarB = androidx.compose.foundation.d.b(eVarA, interfaceC8558m, null, false, null, null, (InterfaceC6824a) objF7, 28, null);
            int[] iArr = f.f60495a;
            int i13 = iArr[cVar.ordinal()];
            if (i13 == 1 || i13 == 2) {
                bVar = rf.b.IDLE;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = rf.b.DISABLED;
            }
            k(eVarB, dVar2, bVar, interfaceC3540lR, (i11 >> 9) & 112);
            androidx.compose.ui.e eVarA2 = z12.a(aVar2, 1.0f, true);
            interfaceC3540lR.U(-418549142);
            Object objF8 = interfaceC3540lR.f();
            if (objF8 == aVar.a()) {
                objF8 = AbstractC8557l.a();
                interfaceC3540lR.K(objF8);
            }
            InterfaceC8558m interfaceC8558m2 = (InterfaceC8558m) objF8;
            interfaceC3540lR.J();
            interfaceC3540lR.U(-418545601);
            boolean zL2 = interfaceC3540lR.l(nA) | (i12 == 1048576);
            Object objF9 = interfaceC3540lR.f();
            if (zL2 || objF9 == aVar.a()) {
                objF9 = new InterfaceC6824a() { // from class: rf.p
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return v.p(nA, r03);
                    }
                };
                interfaceC3540lR.K(objF9);
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarB2 = androidx.compose.foundation.d.b(eVarA2, interfaceC8558m2, null, false, null, null, (InterfaceC6824a) objF9, 28, null);
            int i14 = iArr[cVar.ordinal()];
            if (i14 == 1) {
                bVar2 = rf.b.ENABLED;
            } else {
                if (i14 != 2 && i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = rf.b.IDLE;
            }
            k(eVarB2, dVar, bVar2, interfaceC3540lR, (i11 >> 6) & 112);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: rf.q
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return v.q(interfaceC8681d, f10, f11, dVar, dVar2, z1Var, r02, interfaceC8556k, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(N n10, R0 r02) {
        AbstractC3063k.d(n10, null, null, new c(r02, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(N n10, R0 r02) {
        AbstractC3063k.d(n10, null, null, new d(r02, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J q(InterfaceC8681d interfaceC8681d, float f10, float f11, s9.d dVar, s9.d dVar2, z1 z1Var, R0 r02, InterfaceC8556k interfaceC8556k, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        n(interfaceC8681d, f10, f11, dVar, dVar2, z1Var, r02, interfaceC8556k, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y0.n r(z1 z1Var, Y0.d offset) {
        AbstractC6492s.i(offset, "$this$offset");
        return Y0.n.b(Y0.o.a(AbstractC7137b.e(((Number) z1Var.getValue()).floatValue()), 0));
    }

    public static final void s(final androidx.compose.ui.e modifier, final boolean z10, final s9.d enabledText, final s9.d disabledText, final InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC6835l interfaceC6835l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(enabledText, "enabledText");
        AbstractC6492s.i(disabledText, "disabledText");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1849235622);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(enabledText) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(disabledText) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6835l) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i11 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1849235622, i11, -1, "com.ui.wifiman.ui.teleport.component.TeleportTunnelSwitch (TeleportTunnelSwitch.kt:81)");
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            interfaceC3540lR.U(-252660692);
            if (interfaceC6835l == null) {
                interfaceC3540lR.U(-252660103);
                Object objF = interfaceC3540lR.f();
                if (objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: rf.t
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return v.t(((Boolean) obj).booleanValue());
                        }
                    };
                    interfaceC3540lR.K(objF);
                }
                interfaceC6835l2 = (InterfaceC6835l) objF;
                interfaceC3540lR.J();
            } else {
                interfaceC6835l2 = interfaceC6835l;
            }
            interfaceC3540lR.J();
            R0 r0W = w(boolValueOf, interfaceC6835l2, f60478a, interfaceC3540lR, ((i11 >> 3) & 14) | 384, 0);
            boolean z11 = interfaceC3540lR.t(AbstractC3932k0.m()) == Y0.t.Rtl;
            interfaceC3540lR.U(-252656386);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = AbstractC8557l.a();
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            AbstractC8682e.a(androidx.compose.foundation.layout.r.w(androidx.compose.foundation.b.d(AbstractC6234e.a(modifier, E.h.d(Y0.h.j(32))), C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().g().f(), null, 2, null), Y0.h.j(230), Y0.h.j(42)), null, false, b0.c.e(1173751108, true, new e(interfaceC6835l, r0W, z11, (InterfaceC8558m) objF2, enabledText, disabledText), interfaceC3540lR, 54), interfaceC3540lR, 3072, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: rf.u
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return v.u(modifier, z10, enabledText, disabledText, interfaceC6835l, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J t(boolean z10) {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J u(androidx.compose.ui.e eVar, boolean z10, s9.d dVar, s9.d dVar2, InterfaceC6835l interfaceC6835l, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        s(eVar, z10, dVar, dVar2, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    private static final R0 w(final Object obj, final InterfaceC6835l interfaceC6835l, InterfaceC7533i interfaceC7533i, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(814391305);
        if ((i11 & 4) != 0) {
            interfaceC7533i = P0.f13906a.a();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(814391305, i10, -1, "com.ui.wifiman.ui.teleport.component.rememberSwipeableStateFor (TeleportTunnelSwitch.kt:279)");
        }
        interfaceC3540l.U(-439811816);
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = new R0(obj, interfaceC7533i, new InterfaceC6835l() { // from class: rf.l
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(v.x(obj2));
                }
            });
            interfaceC3540l.K(objF);
        }
        final R0 r02 = (R0) objF;
        interfaceC3540l.J();
        interfaceC3540l.U(-439805551);
        Object objF2 = interfaceC3540l.f();
        if (objF2 == aVar.a()) {
            objF2 = t1.d(Boolean.FALSE, null, 2, null);
            interfaceC3540l.K(objF2);
        }
        final InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF2;
        interfaceC3540l.J();
        Object value = interfaceC3551q0.getValue();
        interfaceC3540l.U(-439802656);
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = (i12 > 4 && interfaceC3540l.l(obj)) || (i10 & 6) == 4;
        Object objF3 = interfaceC3540l.f();
        if (z10 || objF3 == aVar.a()) {
            objF3 = new g(obj, r02, null);
            interfaceC3540l.K(objF3);
        }
        interfaceC3540l.J();
        int i13 = i10 & 8;
        O.e(obj, value, (InterfaceC6839p) objF3, interfaceC3540l, i10 & 14);
        Object objO = r02.o();
        interfaceC3540l.U(-439797308);
        boolean z11 = ((i12 > 4 && interfaceC3540l.l(obj)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.T(interfaceC6835l)) || (i10 & 48) == 32);
        Object objF4 = interfaceC3540l.f();
        if (z11 || objF4 == aVar.a()) {
            objF4 = new InterfaceC6835l() { // from class: rf.m
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj2) {
                    return v.y(obj, r02, interfaceC6835l, interfaceC3551q0, (L) obj2);
                }
            };
            interfaceC3540l.K(objF4);
        }
        interfaceC3540l.J();
        O.c(objO, (InterfaceC6835l) objF4, interfaceC3540l, i13);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return r02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(Object it) {
        AbstractC6492s.i(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K y(Object obj, R0 r02, InterfaceC6835l interfaceC6835l, InterfaceC3551q0 interfaceC3551q0, L DisposableEffect) {
        AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
        if (!AbstractC6492s.d(obj, r02.o())) {
            interfaceC6835l.invoke(r02.o());
            interfaceC3551q0.setValue(Boolean.valueOf(!((Boolean) interfaceC3551q0.getValue()).booleanValue()));
        }
        return new h();
    }
}
