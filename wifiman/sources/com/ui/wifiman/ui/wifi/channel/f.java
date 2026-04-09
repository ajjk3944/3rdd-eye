package com.ui.wifiman.ui.wifi.channel;

import A9.i;
import Af.A;
import Af.AbstractC2431f;
import Af.C2428c;
import Be.M;
import Bf.k;
import C0.C;
import E0.InterfaceC2629g;
import Ee.B;
import Ee.C2706g;
import Ee.F;
import F9.AbstractC2859x;
import L9.AbstractC3198d;
import L9.E;
import N.C0;
import Q.y;
import Q.z;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import Y0.h;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import com.ui.wifiman.ui.wifi.channel.f;
import h9.C5969a;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import sa.AbstractC7930a;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.N;
import z.a0;
import z.f0;
import z.h0;
import z.j0;
import zf.AbstractC8741d;
import zf.AbstractC8747j;
import zf.C8743f;
import zf.C8745h;
import zf.EnumC8738a;
import zf.InterfaceC8744g;

/* loaded from: classes4.dex */
public abstract class f {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f45183a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.wifi.channel.c f45184b;

        /* renamed from: com.ui.wifiman.ui.wifi.channel.f$a$a, reason: collision with other inner class name */
        static final class C1642a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.ui.wifi.channel.c f45185a;

            /* renamed from: com.ui.wifiman.ui.wifi.channel.f$a$a$a, reason: collision with other inner class name */
            static final class C1643a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.ui.wifiman.ui.wifi.channel.c f45186a;

                C1643a(com.ui.wifiman.ui.wifi.channel.c cVar) {
                    this.f45186a = cVar;
                }

                public final void a(i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1749845444, i10, -1, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous>.<anonymous>.<anonymous> (WifiChannelDetailUi.kt:136)");
                    }
                    Iterator it = ((Iterable) o1.b(this.f45186a.n0(), null, interfaceC3540l, 0, 1).getValue()).iterator();
                    while (it.hasNext()) {
                        AbstractC8747j.b(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (C8745h) it.next(), interfaceC3540l, 6);
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: com.ui.wifiman.ui.wifi.channel.f$a$a$b */
            /* synthetic */ class b extends C6490p implements InterfaceC6835l {
                b(Object obj) {
                    super(1, obj, com.ui.wifiman.ui.wifi.channel.c.class, "onFilterSelected", "onFilterSelected(Lcom/ui/wifiman/ui/wifi/channel/component/WifiChannelApFilter;)V", 0);
                }

                public final void a(EnumC8738a p02) {
                    AbstractC6492s.i(p02, "p0");
                    ((com.ui.wifiman.ui.wifi.channel.c) this.receiver).s0(p02);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((EnumC8738a) obj);
                    return J.f24997a;
                }
            }

            C1642a(com.ui.wifiman.ui.wifi.channel.c cVar) {
                this.f45185a = cVar;
            }

            public final void a(InterfaceC8687j UiCardCollapsible, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiCardCollapsible, "$this$UiCardCollapsible");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1097804108, i10, -1, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous>.<anonymous> (WifiChannelDetailUi.kt:129)");
                }
                e.a aVar = androidx.compose.ui.e.f28771b0;
                float f10 = 16;
                a0.a(r.i(aVar, h.j(f10)), interfaceC3540l, 6);
                androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                AbstractC2859x.c(o.k(eVarH, c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 2, null), H0.f.a(AbstractC6780c.f53414U4, interfaceC3540l, 0), null, null, null, null, null, null, b0.c.e(-1749845444, true, new C1643a(this.f45185a), interfaceC3540l, 54), interfaceC3540l, 100663296, 252);
                a0.a(r.i(aVar, h.j(f10)), interfaceC3540l, 6);
                Ie.b.b(o.k(r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null), new d.b(AbstractC6780c.f53330I4), interfaceC3540l, 0, 0);
                a0.a(r.i(aVar, h.j(4)), interfaceC3540l, 6);
                androidx.compose.ui.e eVarK = o.k(r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
                C8743f c8743f = (C8743f) o1.b(this.f45185a.q0(), null, interfaceC3540l, 0, 1).getValue();
                com.ui.wifiman.ui.wifi.channel.c cVar = this.f45185a;
                interfaceC3540l.U(-440759445);
                boolean zT = interfaceC3540l.T(cVar);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new b(cVar);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                AbstractC8741d.c(eVarK, c8743f, (InterfaceC6835l) ((th.g) objF), interfaceC3540l, 0, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        static final class b implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.ui.wifi.channel.c f45187a;

            b(com.ui.wifiman.ui.wifi.channel.c cVar) {
                this.f45187a = cVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(280080894, i10, -1, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous>.<anonymous> (WifiChannelDetailUi.kt:107)");
                }
                e.a aVar = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarK = o.k(r.h(aVar, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null);
                com.ui.wifiman.ui.wifi.channel.c cVar = this.f45187a;
                C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
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
                E1.c(interfaceC3540lA, cA, aVar2.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
                InterfaceC6839p interfaceC6839pB = aVar2.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar2.f());
                C8688k c8688k = C8688k.f66923a;
                Bf.b bVar = (Bf.b) o1.b(cVar.o0(), null, interfaceC3540l, 0, 1).getValue();
                float f10 = 16;
                a0.a(r.i(aVar, h.j(f10)), interfaceC3540l, 6);
                A.b(r.h(aVar, 0.0f, 1, null), bVar.c(), interfaceC3540l, 6, 0);
                a0.a(r.i(aVar, h.j(f10)), interfaceC3540l, 6);
                k.e(r.i(r.h(aVar, 0.0f, 1, null), h.j(164)), bVar, interfaceC3540l, 6);
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        a(z zVar, com.ui.wifiman.ui.wifi.channel.c cVar) {
            this.f45183a = zVar;
            this.f45184b = cVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1070743596, i10, -1, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous> (WifiChannelDetailUi.kt:93)");
            }
            M.d(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f45183a, null, b0.c.e(-1097804108, true, new C1642a(this.f45184b), interfaceC3540l, 54), null, false, null, false, com.ui.wifiman.ui.wifi.channel.a.f45166a.a(), b0.c.e(280080894, true, new b(this.f45184b), interfaceC3540l, 54), interfaceC3540l, 905972742, 244);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.wifi.channel.c f45188a;

        static final class a implements mh.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.ui.wifi.channel.c f45189a;

            /* renamed from: com.ui.wifiman.ui.wifi.channel.f$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1644a extends C6490p implements InterfaceC6835l {
                C1644a(Object obj) {
                    super(1, obj, com.ui.wifiman.ui.wifi.channel.c.class, "onWifiSignalClicked", "onWifiSignalClicked(Lcom/ui/common/hwaddr/HwAddress;)V", 0);
                }

                public final void a(C5969a p02) {
                    AbstractC6492s.i(p02, "p0");
                    ((com.ui.wifiman.ui.wifi.channel.c) this.receiver).t0(p02);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C5969a) obj);
                    return J.f24997a;
                }
            }

            a(com.ui.wifiman.ui.wifi.channel.c cVar) {
                this.f45189a = cVar;
            }

            public final void a(androidx.compose.ui.e itemModifier, InterfaceC8744g item, InterfaceC3540l interfaceC3540l, int i10) {
                int i11;
                AbstractC6492s.i(itemModifier, "itemModifier");
                AbstractC6492s.i(item, "item");
                if ((i10 & 6) == 0) {
                    i11 = (interfaceC3540l.T(itemModifier) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? 32 : 16;
                }
                if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1832095327, i11, -1, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous>.<anonymous> (WifiChannelDetailUi.kt:172)");
                }
                if (item instanceof InterfaceC8744g.a) {
                    interfaceC3540l.U(-440742819);
                    C2428c c2428cA = ((InterfaceC8744g.a) item).a();
                    com.ui.wifiman.ui.wifi.channel.c cVar = this.f45189a;
                    interfaceC3540l.U(-440738098);
                    boolean zT = interfaceC3540l.T(cVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1644a(cVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    AbstractC2431f.c(itemModifier, c2428cA, (InterfaceC6835l) ((th.g) objF), interfaceC3540l, i11 & 14, 0);
                    interfaceC3540l.J();
                } else {
                    if (!(item instanceof InterfaceC8744g.b)) {
                        interfaceC3540l.U(-440744892);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-440734432);
                    F.b(itemModifier, ((InterfaceC8744g.b) item).a(), interfaceC3540l, i11 & 14);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.r
            public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                a((androidx.compose.ui.e) obj, (InterfaceC8744g) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                return J.f24997a;
            }
        }

        b(com.ui.wifiman.ui.wifi.channel.c cVar) {
            this.f45188a = cVar;
        }

        public final void a(N innerPadding, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(innerPadding, "innerPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(innerPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1735328997, i11, -1, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous> (WifiChannelDetailUi.kt:165)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            Ee.z.L(o.h(r.f(androidx.compose.foundation.b.d(aVar, c6562a.a(interfaceC3540l, i12).e().a(), null, 2, null), 0.0f, 1, null), innerPadding), (C2706g) o1.b(this.f45188a.p0(), null, interfaceC3540l, 0, 1).getValue(), null, false, false, null, null, b0.c.e(1832095327, true, new a(this.f45188a), interfaceC3540l, 54), interfaceC3540l, 12582912, 124);
            B.b(o.h(aVar, innerPadding), c6562a.a(interfaceC3540l, i12).e().a(), interfaceC3540l, 0, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.wifi.channel.c f45190a;

        c(com.ui.wifiman.ui.wifi.channel.c cVar) {
            this.f45190a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1220106772, i10, -1, "com.ui.wifiman.ui.wifi.channel.WifiChannelDetailUi.<anonymous> (WifiChannelDetailUi.kt:60)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            androidx.compose.ui.e eVarC = j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            String strB = AbstractC7930a.b((s9.d) o1.b(this.f45190a.c(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(520244338);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.wifi.channel.g
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return f.c.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(eVarC, strB, aVar, (InterfaceC6824a) objF, null, 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, AbstractC3198d.a.f11403c << 6, 0, 2032);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class d implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.wifi.channel.c f45191a;

        d(com.ui.wifiman.ui.wifi.channel.c cVar) {
            this.f45191a = cVar;
        }

        public final void a(N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(scaffoldPadding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1939307155, i10, -1, "com.ui.wifiman.ui.wifi.channel.WifiChannelDetailUi.<anonymous> (WifiChannelDetailUi.kt:71)");
            }
            f.c(o.h(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), scaffoldPadding), this.f45191a, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final androidx.compose.ui.e eVar, final com.ui.wifiman.ui.wifi.channel.c cVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(371337958);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(371337958, i11, -1, "com.ui.wifiman.ui.wifi.channel.Content (WifiChannelDetailUi.kt:85)");
            }
            z zVarB = y.f18962a.b(null, null, null, null, interfaceC3540lR, y.f18968g << 12, 15);
            interfaceC3540lR.U(760357054);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = h0.a(0, 0, 0, 0);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            C0.b((f0) objF, androidx.compose.ui.input.nestedscroll.a.b(eVar, zVarB.a(), null, 2, null), null, b0.c.e(1070743596, true, new a(zVarB, cVar), interfaceC3540lR, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a(), 0L, b0.c.e(1735328997, true, new b(cVar), interfaceC3540lR, 54), interfaceC3540l2, 3078, 100663296, 196596);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.wifi.channel.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return f.d(eVar, cVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(androidx.compose.ui.e eVar, com.ui.wifiman.ui.wifi.channel.c cVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        c(eVar, cVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(com.ui.wifiman.ui.wifi.channel.c r31, T.InterfaceC3540l r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.wifi.channel.f.e(com.ui.wifiman.ui.wifi.channel.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(com.ui.wifiman.ui.wifi.channel.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
