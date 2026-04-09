package hf;

import Be.AbstractC2487w;
import C0.U;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.z1;
import W0.t;
import W7.a;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AbstractC3932k0;
import b8.AbstractC4075b;
import ch.AbstractC4260a;
import f0.c;
import ff.AbstractC5822c;
import ff.EnumC5820a;
import hf.AbstractC6027J;
import hf.t;
import java.util.Arrays;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.C6537m;
import la.C6562a;
import m0.C6733v0;
import m0.V0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7039f;
import q.AbstractC7402u;
import s.AbstractC7848i;
import s9.d;
import sa.AbstractC7930a;
import z.AbstractC8682e;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8683f;
import z.W;
import z.Y;
import z.Z;
import z.a0;

/* renamed from: hf.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6027J {

    /* renamed from: hf.J$a */
    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t.c f48630b;

        /* renamed from: hf.J$a$a, reason: collision with other inner class name */
        static final class C1803a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t.c f48631a;

            C1803a(t.c cVar) {
                this.f48631a = cVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-293718345, i10, -1, "com.ui.wifiman.ui.speedtest.component.DownloadUploadSpeed.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedtestTopology.kt:363)");
                }
                AbstractC6027J.y(null, this.f48631a, interfaceC3540l, 0, 1);
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

        /* renamed from: hf.J$a$b */
        static final class b implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t.c f48632a;

            b(t.c cVar) {
                this.f48632a = cVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-2130225455, i10, -1, "com.ui.wifiman.ui.speedtest.component.DownloadUploadSpeed.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedtestTopology.kt:383)");
                }
                AbstractC6027J.C(null, this.f48632a, interfaceC3540l, 0, 1);
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

        /* renamed from: hf.J$a$c */
        static final class c implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t.c f48633a;

            c(t.c cVar) {
                this.f48633a = cVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(676793312, i10, -1, "com.ui.wifiman.ui.speedtest.component.DownloadUploadSpeed.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedtestTopology.kt:366)");
                }
                AbstractC6027J.A(null, this.f48633a, interfaceC3540l, 0, 1);
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

        a(androidx.compose.ui.e eVar, t.c cVar) {
            this.f48629a = eVar;
            this.f48630b = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0.D h(InterfaceC8683f interfaceC8683f, t.c cVar, U SubcomposeLayout, Y0.b bVar) {
            AbstractC6492s.i(SubcomposeLayout, "$this$SubcomposeLayout");
            final androidx.compose.ui.layout.t tVarT = ((C0.B) SubcomposeLayout.Q1("line1", b0.c.c(-293718345, true, new C1803a(cVar))).get(0)).T(Y0.c.b(0, 0, 0, 0, 15, null));
            final androidx.compose.ui.layout.t tVarT2 = ((C0.B) SubcomposeLayout.Q1("line2", b0.c.c(676793312, true, new c(cVar))).get(0)).T(Y0.c.b(0, 0, 0, 0, 15, null));
            if (Y0.h.h(interfaceC8683f.b(), SubcomposeLayout.x(tVarT.I0())) >= 0) {
                return androidx.compose.ui.layout.m.x0(SubcomposeLayout, tVarT.I0(), tVarT.C0(), null, new InterfaceC6835l() { // from class: hf.G
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC6027J.a.i(tVarT, (t.a) obj);
                    }
                }, 4, null);
            }
            if (Y0.h.h(interfaceC8683f.b(), SubcomposeLayout.x(tVarT2.I0())) >= 0) {
                return androidx.compose.ui.layout.m.x0(SubcomposeLayout, tVarT2.I0(), tVarT2.C0(), null, new InterfaceC6835l() { // from class: hf.H
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC6027J.a.j(tVarT2, (t.a) obj);
                    }
                }, 4, null);
            }
            final androidx.compose.ui.layout.t tVarT3 = ((C0.B) SubcomposeLayout.Q1("line3", b0.c.c(-2130225455, true, new b(cVar))).get(0)).T(Y0.c.b(0, 0, 0, 0, 15, null));
            return androidx.compose.ui.layout.m.x0(SubcomposeLayout, tVarT3.I0(), tVarT3.C0(), null, new InterfaceC6835l() { // from class: hf.I
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return AbstractC6027J.a.k(tVarT3, (t.a) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J i(androidx.compose.ui.layout.t tVar, t.a layout) {
            AbstractC6492s.i(layout, "$this$layout");
            t.a.h(layout, tVar, 0, 0, 0.0f, 4, null);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J j(androidx.compose.ui.layout.t tVar, t.a layout) {
            AbstractC6492s.i(layout, "$this$layout");
            t.a.h(layout, tVar, 0, 0, 0.0f, 4, null);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J k(androidx.compose.ui.layout.t tVar, t.a layout) {
            AbstractC6492s.i(layout, "$this$layout");
            t.a.h(layout, tVar, 0, 0, 0.0f, 4, null);
            return Yg.J.f24997a;
        }

        public final void f(final InterfaceC8683f BoxWithConstraints, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(BoxWithConstraints) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-190761978, i10, -1, "com.ui.wifiman.ui.speedtest.component.DownloadUploadSpeed.<anonymous> (SpeedtestTopology.kt:359)");
            }
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(this.f48629a, 0.0f, 1, null);
            interfaceC3540l.U(327335266);
            boolean zT = interfaceC3540l.T(this.f48630b) | ((i10 & 14) == 4);
            final t.c cVar = this.f48630b;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: hf.F
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC6027J.a.h(BoxWithConstraints, cVar, (U) obj, (Y0.b) obj2);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            androidx.compose.ui.layout.w.a(eVarH, (InterfaceC6839p) objF, interfaceC3540l, 0, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            f((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: hf.J$b */
    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f48634a;

        b(int i10) {
            this.f48634a = i10;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(932664018);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(932664018, i10, -1, "com.ui.wifiman.ui.speedtest.component.NodeConnectionJitter.<anonymous>.<anonymous> (SpeedtestTopology.kt:294)");
            }
            int i11 = AbstractC6780c.f53599v4;
            String string = context.getString(i11);
            AbstractC6492s.h(string, "getString(...)");
            AbstractC6492s.h(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f48634a)}, 1)), "format(...)");
            String string2 = context.getString(i11);
            AbstractC6492s.h(string2, "getString(...)");
            String str = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(this.f48634a)}, 1));
            AbstractC6492s.h(str, "format(...)");
            String string3 = context.getString(AbstractC6780c.f53521k3);
            AbstractC6492s.h(string3, "getString(...)");
            String str2 = string3 + " " + str;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str2;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: hf.J$c */
    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f48635a;

        c(int i10) {
            this.f48635a = i10;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-1526935893);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1526935893, i10, -1, "com.ui.wifiman.ui.speedtest.component.NodeConnectionLatency.<anonymous>.<anonymous> (SpeedtestTopology.kt:275)");
            }
            String string = context.getString(AbstractC6780c.f53599v4);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f48635a)}, 1));
            AbstractC6492s.h(str, "format(...)");
            String string2 = context.getString(AbstractC6780c.f53528l3);
            AbstractC6492s.h(string2, "getString(...)");
            String str2 = string2 + " " + str;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str2;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: hf.J$d */
    static final class d implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t.a f48636a;

        d(t.a aVar) {
            this.f48636a = aVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-743251563, i10, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestTopology.<anonymous>.<anonymous> (SpeedtestTopology.kt:178)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), Y0.h.j(Y0.h.j(42) / 2), 0.0f, 2, null);
            t.a aVar2 = this.f48636a;
            C0.C cB = W.b(C8680c.f66832a.f(), f0.c.f46573a.l(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cB, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            Z z10 = Z.f66823a;
            if (aVar2 instanceof t.a.b) {
                interfaceC3540l.U(-1349907101);
                AbstractC6027J.l(z10.a(aVar, 1.0f, true), t.f48710a.a(interfaceC3540l, 6), interfaceC3540l, 0);
                interfaceC3540l.J();
            } else {
                if (!(aVar2 instanceof t.a.C1805a)) {
                    interfaceC3540l.U(1480473487);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(-1349578439);
                androidx.compose.ui.e eVarA = z10.a(aVar, 1.0f, true);
                t tVar = t.f48710a;
                AbstractC6027J.l(eVarA, tVar.a(interfaceC3540l, 6), interfaceC3540l, 0);
                AbstractC6027J.l(z10.a(aVar, 1.0f, true), tVar.a(interfaceC3540l, 6), interfaceC3540l, 0);
                interfaceC3540l.J();
            }
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

    /* renamed from: hf.J$e */
    static final class e implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t.a f48637a;

        e(t.a aVar) {
            this.f48637a = aVar;
        }

        public final void a(float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 48) == 0) {
                i10 |= interfaceC3540l.g(f11) ? 32 : 16;
            }
            if ((i10 & 145) == 144 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1254756800, i10, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestTopology.<anonymous>.<anonymous> (SpeedtestTopology.kt:205)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), 0.0f, ((Y0.h) AbstractC4260a.k(Y0.h.d(Y0.h.j(0)), Y0.h.d(Y0.h.j(Y0.h.j(f11 + Y0.h.j(10)) - Y0.h.j(21.0f))))).s(), 0.0f, 0.0f, 13, null);
            t.a aVar2 = this.f48637a;
            C0.C cB = W.b(C8680c.f66832a.f(), f0.c.f46573a.l(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarM);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cB, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            Z z10 = Z.f66823a;
            if (aVar2 instanceof t.a.b) {
                interfaceC3540l.U(-1348487239);
                t.a.b bVar = (t.a.b) aVar2;
                AbstractC6027J.n(aVar, bVar.a(), interfaceC3540l, 6);
                a0.a(Y.b(z10, aVar, 1.0f, false, 2, null), interfaceC3540l, 0);
                AbstractC6027J.n(aVar, bVar.b(), interfaceC3540l, 6);
                interfaceC3540l.J();
            } else {
                if (!(aVar2 instanceof t.a.C1805a)) {
                    interfaceC3540l.U(1480519530);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(-1348026052);
                t.a.C1805a c1805a = (t.a.C1805a) aVar2;
                AbstractC6027J.n(aVar, c1805a.c(), interfaceC3540l, 6);
                a0.a(Y.b(z10, aVar, 1.0f, false, 2, null), interfaceC3540l, 0);
                AbstractC6027J.n(aVar, c1805a.a(), interfaceC3540l, 6);
                a0.a(Y.b(z10, aVar, 1.0f, false, 2, null), interfaceC3540l, 0);
                AbstractC6027J.n(aVar, c1805a.e(), interfaceC3540l, 6);
                interfaceC3540l.J();
            }
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a(((Y0.h) obj).s(), ((Y0.h) obj2).s(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: hf.J$f */
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48638a;

        static {
            int[] iArr = new int[t.c.a.values().length];
            try {
                iArr[t.c.a.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.c.a.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.c.a.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.c.a.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f48638a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(androidx.compose.ui.e eVar, final t.c cVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        C6031c c6031c;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1417549082);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1417549082, i12, -1, "com.ui.wifiman.ui.speedtest.component.NodeConnectionSpeed2Lines (SpeedtestTopology.kt:417)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            W7.a aVarA = cVar.a();
            interfaceC3540lR.U(-560137182);
            C3174d c3174dB = aVarA == null ? null : C6031c.f48649a.b(aVarA, EnumC5820a.DOWN, null, true, interfaceC3540lR, 27696, 4);
            interfaceC3540lR.J();
            interfaceC3540lR.U(-560137555);
            if (c3174dB == null) {
                c3174dB = C6031c.f48649a.c(EnumC5820a.DOWN, false, interfaceC3540lR, 438);
            }
            interfaceC3540lR.J();
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            L0.U uB = c6562a.c(interfaceC3540lR, i14).b().b();
            C6031c c6031c2 = C6031c.f48649a;
            Map mapF = c6031c2.f(Y0.w.g(12), interfaceC3540lR, 54);
            t.a aVar2 = W0.t.f23567a;
            a1.c(c3174dB, null, 0L, 0L, null, null, null, 0L, null, null, 0L, aVar2.b(), false, 1, 0, mapF, null, uB, interfaceC3540lR, 0, 3120, 88062);
            W7.a aVarE = cVar.e();
            interfaceC3540lR.U(-560116832);
            C3174d c3174dB2 = aVarE == null ? null : c6031c2.b(aVarE, EnumC5820a.UP, null, true, interfaceC3540lR, 27696, 4);
            interfaceC3540lR.J();
            interfaceC3540lR.U(-560117145);
            if (c3174dB2 == null) {
                c6031c = c6031c2;
                c3174dB2 = c6031c.c(EnumC5820a.UP, false, interfaceC3540lR, 438);
            } else {
                c6031c = c6031c2;
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dB2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, aVar2.b(), false, 1, 0, c6031c.f(Y0.w.g(12), interfaceC3540lR, 54), null, c6562a.c(interfaceC3540lR, i14).b().b(), interfaceC3540l2, 0, 3120, 88062);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.w
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.B(eVar3, cVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J B(androidx.compose.ui.e eVar, t.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        A(eVar, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(androidx.compose.ui.e eVar, final t.c cVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        C6031c c6031c;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1890835525);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1890835525, i12, -1, "com.ui.wifiman.ui.speedtest.component.NodeConnectionSpeed3Lines (SpeedtestTopology.kt:461)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            W7.a aVarA = cVar.a();
            interfaceC3540lR.U(-968912382);
            C3174d c3174dB = aVarA == null ? null : C6031c.f48649a.b(aVarA, EnumC5820a.DOWN, null, false, interfaceC3540lR, 27696, 4);
            interfaceC3540lR.J();
            interfaceC3540lR.U(-968912755);
            if (c3174dB == null) {
                c3174dB = C6031c.f48649a.c(EnumC5820a.DOWN, false, interfaceC3540lR, 438);
            }
            interfaceC3540lR.J();
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            L0.U uB = c6562a.c(interfaceC3540lR, i14).b().b();
            C6031c c6031c2 = C6031c.f48649a;
            Map mapF = c6031c2.f(Y0.w.g(12), interfaceC3540lR, 54);
            t.a aVar2 = W0.t.f23567a;
            a1.c(c3174dB, null, 0L, 0L, null, null, null, 0L, null, null, 0L, aVar2.b(), false, 1, 0, mapF, null, uB, interfaceC3540lR, 0, 3120, 88062);
            W7.a aVarE = cVar.e();
            interfaceC3540lR.U(-968892000);
            C3174d c3174dB2 = aVarE == null ? null : c6031c2.b(aVarE, EnumC5820a.UP, null, false, interfaceC3540lR, 27696, 4);
            interfaceC3540lR.J();
            interfaceC3540lR.U(-968892313);
            if (c3174dB2 == null) {
                c6031c = c6031c2;
                c3174dB2 = c6031c.c(EnumC5820a.UP, false, interfaceC3540lR, 438);
            } else {
                c6031c = c6031c2;
            }
            interfaceC3540lR.J();
            a1.c(c3174dB2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, aVar2.b(), false, 1, 0, c6031c.f(Y0.w.g(12), interfaceC3540lR, 54), null, c6562a.c(interfaceC3540lR, i14).b().b(), interfaceC3540lR, 0, 3120, 88062);
            interfaceC3540l2 = interfaceC3540lR;
            a1.b(H0.f.a(AbstractC6780c.f53578s4, interfaceC3540lR, 0), null, c6562a.a(interfaceC3540lR, i14).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540lR, i14).b().a(), interfaceC3540l2, 0, 0, 65530);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.x
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.D(eVar3, cVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J D(androidx.compose.ui.e eVar, t.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        C(eVar, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public static final void E(final androidx.compose.ui.e modifier, final t.a model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1841443024);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1841443024, i11, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestTopology (SpeedtestTopology.kt:139)");
            }
            c.a aVar = f0.c.f46573a;
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), Y0.h.j(Y0.h.j(42) / 2), 0.0f, 2, null);
            C0.C cB = W.b(C8680c.f66832a.f(), aVar.l(), interfaceC3540lR, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cB, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            Z z10 = Z.f66823a;
            if (model instanceof t.a.b) {
                interfaceC3540lR.U(416877789);
                p(z10.a(aVar3, 1.0f, true), ((t.a.b) model).c(), interfaceC3540lR, 0);
                interfaceC3540lR.J();
            } else {
                if (!(model instanceof t.a.C1805a)) {
                    interfaceC3540lR.U(416875518);
                    interfaceC3540lR.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540lR.U(38531843);
                t.a.C1805a c1805a = (t.a.C1805a) model;
                p(z10.a(aVar3, 1.0f, true), c1805a.d(), interfaceC3540lR, 0);
                p(z10.a(aVar3, 1.0f, true), c1805a.b(), interfaceC3540lR, 0);
                interfaceC3540lR.J();
            }
            interfaceC3540lR.R();
            qa.d.d(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), b0.c.e(-743251563, true, new d(model), interfaceC3540lR, 54), b0.c.e(1254756800, true, new e(model), interfaceC3540lR, 54), interfaceC3540lR, 438);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.y
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.F(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J F(androidx.compose.ui.e eVar, t.a aVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        E(eVar, aVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final t.a.C1805a L(t.b bVar, t.c cVar, t.b bVar2, t.c cVar2, t.b bVar3, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        t.c cVar3;
        interfaceC3540l.U(-757832142);
        t.b bVar4 = (i11 & 1) != 0 ? new t.b(Pe.a.f18599a.k()) : bVar;
        if ((i11 & 2) != 0) {
            t.c.a aVar = t.c.a.COMPLETE;
            AbstractC4075b abstractC4075bA = AbstractC4075b.f33002a.a(1000);
            a.C0878a c0878a = W7.a.f23676b;
            cVar3 = new t.c(aVar, abstractC4075bA, 1000, c0878a.d(1000), c0878a.d(1000));
        } else {
            cVar3 = cVar;
        }
        t.b bVar5 = (i11 & 4) != 0 ? bVar4 : bVar2;
        t.c cVar4 = (i11 & 8) != 0 ? cVar3 : cVar2;
        t.b bVar6 = (i11 & 16) != 0 ? bVar4 : bVar3;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-757832142, i10, -1, "com.ui.wifiman.ui.speedtest.component.previewSpeedtestTopologyModelGateway (SpeedtestTopology.kt:563)");
        }
        t.a.C1805a c1805a = new t.a.C1805a(bVar4, cVar3, bVar5, cVar4, bVar6);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c1805a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final androidx.compose.ui.e eVar, final t.c cVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1201756080);
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
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1201756080, i11, -1, "com.ui.wifiman.ui.speedtest.component.DownloadUploadSpeed (SpeedtestTopology.kt:351)");
            }
            AbstractC8682e.a(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.k(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), Y0.h.j(72), 0.0f, 2, null), Y0.h.j(23), 0.0f, 2, null), f0.c.f46573a.d(), false, b0.c.e(-190761978, true, new a(eVar, cVar), interfaceC3540lR, 54), interfaceC3540lR, 3126, 4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.B
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.m(eVar, cVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(androidx.compose.ui.e eVar, t.c cVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        l(eVar, cVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final androidx.compose.ui.e eVar, final t.b bVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1791772621);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(bVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1791772621, i11, -1, "com.ui.wifiman.ui.speedtest.component.Node (SpeedtestTopology.kt:255)");
            }
            AbstractC2487w.b(bVar.a(), androidx.compose.foundation.layout.r.v(eVar, Y0.h.j(42)), null, null, null, 0.0f, 0L, interfaceC3540lR, 0, 62);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.A
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.o(eVar, bVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(androidx.compose.ui.e eVar, t.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        n(eVar, bVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void p(final androidx.compose.ui.e modifier, final t.c connection, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(connection, "connection");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1080910382);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(connection) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1080910382, i11, -1, "com.ui.wifiman.ui.speedtest.component.NodeConnection (SpeedtestTopology.kt:309)");
            }
            c.a aVar = f0.c.f46573a;
            c.b bVarG = aVar.g();
            C8680c c8680c = C8680c.f66832a;
            C0.C cA = AbstractC8685h.a(c8680c.n(Y0.h.j(10)), bVarG, interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            l(modifier, connection, interfaceC3540lR, i11 & 126);
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            v(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), connection.d(), interfaceC3540lR, 6);
            C0.C cA2 = AbstractC8685h.a(c8680c.g(), aVar.g(), interfaceC3540lR, 48);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, aVar3);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cA2, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            float f10 = 23;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(aVar3, Y0.h.j(f10), 0.0f, 2, null);
            AbstractC4075b abstractC4075bC = connection.c();
            t(eVarK, abstractC4075bC != null ? new C6032d(abstractC4075bC) : null, interfaceC3540lR, 6);
            r(androidx.compose.foundation.layout.o.k(aVar3, Y0.h.j(f10), 0.0f, 2, null), connection.b(), interfaceC3540lR, 6);
            interfaceC3540lR.R();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.z
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.q(modifier, connection, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J q(androidx.compose.ui.e eVar, t.c cVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        p(eVar, cVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final void r(final androidx.compose.ui.e eVar, final Integer num, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        C3174d c3174dA;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-226347574);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(num) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-226347574, i12, -1, "com.ui.wifiman.ui.speedtest.component.NodeConnectionJitter (SpeedtestTopology.kt:289)");
            }
            interfaceC3540lR.U(1796874862);
            if (num == null) {
                c3174dA = null;
            } else {
                int iIntValue = num.intValue();
                c3174dA = AbstractC7930a.a(new d.a(String.valueOf(iIntValue), new b(iIntValue)), interfaceC3540lR, 0);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.U(1796874647);
            if (c3174dA == null) {
                c3174dA = AbstractC7930a.a(new d.c(""), interfaceC3540lR, 6);
            }
            C3174d c3174d = c3174dA;
            interfaceC3540lR.J();
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174d, eVar, c6562a.a(interfaceC3540lR, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().a(), interfaceC3540l2, (i12 << 3) & 112, 0, 131064);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.C
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.s(eVar, num, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J s(androidx.compose.ui.e eVar, Integer num, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        r(eVar, num, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final void t(final androidx.compose.ui.e eVar, final C6032d c6032d, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC4075b abstractC4075bA;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1226819725);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(c6032d) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1226819725, i12, -1, "com.ui.wifiman.ui.speedtest.component.NodeConnectionLatency (SpeedtestTopology.kt:270)");
            }
            C3174d c3174dA = null;
            Integer numValueOf = (c6032d == null || (abstractC4075bA = c6032d.a()) == null) ? null : Integer.valueOf(abstractC4075bA.b());
            interfaceC3540lR.U(-939946969);
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                c3174dA = AbstractC7930a.a(new d.a(String.valueOf(iIntValue), new c(iIntValue)), interfaceC3540lR, 0);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.U(-939947680);
            if (c3174dA == null) {
                c3174dA = AbstractC7930a.a(new d.c(""), interfaceC3540lR, 6);
            }
            C3174d c3174d = c3174dA;
            interfaceC3540lR.J();
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174d, eVar, c6562a.a(interfaceC3540lR, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().a(), interfaceC3540l2, (i12 << 3) & 112, 0, 131064);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.v
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.u(eVar, c6032d, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J u(androidx.compose.ui.e eVar, C6032d c6032d, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        t(eVar, c6032d, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void v(final androidx.compose.ui.e modifier, final t.c.a connectionState, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        long jI;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(connectionState, "connectionState");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1761000496);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(connectionState) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1761000496, i11, -1, "com.ui.wifiman.ui.speedtest.component.NodeConnectionLine (SpeedtestTopology.kt:511)");
            }
            interfaceC3540lR.U(1221500921);
            if (connectionState != t.c.a.IDLE && connectionState != t.c.a.COMPLETE && connectionState != t.c.a.DOWN && connectionState != t.c.a.UP) {
                throw new NoWhenBranchMatchedException();
            }
            Y0.d dVar = (Y0.d) interfaceC3540lR.t(AbstractC3932k0.g());
            final V0 v0C = V0.a.c(V0.f52859a, new float[]{dVar.d1(Y0.h.j(2.0f)), dVar.d1(Y0.h.j(2.0f))}, 0.0f, 2, null);
            interfaceC3540lR.J();
            int i12 = f.f48638a[connectionState.ordinal()];
            if (i12 == 1) {
                interfaceC3540lR.U(1221523296);
                jI = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().g().i();
                interfaceC3540lR.J();
            } else if (i12 == 2) {
                interfaceC3540lR.U(1221526245);
                jI = AbstractC5822c.a(EnumC5820a.DOWN, interfaceC3540lR, 6);
                interfaceC3540lR.J();
            } else if (i12 == 3) {
                interfaceC3540lR.U(1221529221);
                jI = AbstractC5822c.a(EnumC5820a.UP, interfaceC3540lR, 6);
                interfaceC3540lR.J();
            } else {
                if (i12 != 4) {
                    interfaceC3540lR.U(1221519965);
                    interfaceC3540lR.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540lR.U(1221532448);
                jI = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().b().f();
                interfaceC3540lR.J();
            }
            final z1 z1VarA = AbstractC7402u.a(jI, null, "test color", null, interfaceC3540lR, 384, 10);
            float f10 = 1;
            final float fD1 = ((Y0.d) interfaceC3540lR.t(AbstractC3932k0.g())).d1(Y0.h.j(f10));
            androidx.compose.ui.e eVarL = androidx.compose.foundation.layout.r.l(modifier, Y0.h.j(f10));
            interfaceC3540lR.U(1221540185);
            boolean zT = interfaceC3540lR.T(z1VarA) | interfaceC3540lR.g(fD1) | interfaceC3540lR.l(v0C);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: hf.D
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC6027J.w(z1VarA, fD1, v0C, (InterfaceC7039f) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC7848i.a(eVarL, (InterfaceC6835l) objF, interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.E
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.x(modifier, connectionState, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J w(z1 z1Var, float f10, V0 v02, InterfaceC7039f Canvas) {
        AbstractC6492s.i(Canvas, "$this$Canvas");
        InterfaceC7039f.w1(Canvas, ((C6733v0) z1Var.getValue()).u(), AbstractC6532h.a(0.0f, 0.0f), AbstractC6532h.a(C6537m.i(Canvas.c()), 0.0f), f10, 0, v02, 0.0f, null, 0, 464, null);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J x(androidx.compose.ui.e eVar, t.c.a aVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        v(eVar, aVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(androidx.compose.ui.e eVar, final t.c cVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-887835092);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-887835092, i14, -1, "com.ui.wifiman.ui.speedtest.component.NodeConnectionSpeed1Line (SpeedtestTopology.kt:398)");
            }
            C6031c c6031c = C6031c.f48649a;
            C3174d c3174dA = c6031c.a(cVar.a(), false, cVar.e(), false, null, new d.b(AbstractC6780c.f53274A4), interfaceC3540lR, 1572864, 26);
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            L0.U uB = c6562a.c(interfaceC3540lR, i15).b().b();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, eVar3, c6562a.a(interfaceC3540lR, i15).f().c(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, c6031c.f(Y0.w.g(12), interfaceC3540lR, 54), null, uB, interfaceC3540l2, (i14 << 3) & 112, 0, 97784);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.u
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6027J.z(eVar2, cVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J z(androidx.compose.ui.e eVar, t.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        y(eVar, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
