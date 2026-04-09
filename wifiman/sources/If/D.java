package If;

import E0.InterfaceC2629g;
import If.B;
import L0.C3174d;
import Li.AbstractC3222i;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes4.dex */
public abstract class D {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, B.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0);
        }

        public final void a() {
            ((B) this.receiver).p0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9125a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f9127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E9.f f9128d;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f9129a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f9130b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ E9.f f9131c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(E9.f fVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f9131c = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f9131c, interfaceC5380e);
                aVar.f9130b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f9129a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                if (!(((B.a) this.f9130b) instanceof B.a.C0377a)) {
                    throw new NoWhenBranchMatchedException();
                }
                E9.f.b(this.f9131c, null, null, 3, null);
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(B.a aVar, InterfaceC5380e interfaceC5380e) {
                return ((a) create(aVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B b10, E9.f fVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f9127c = b10;
            this.f9128d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f9127c, this.f9128d, interfaceC5380e);
            bVar.f9126b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9125a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            AbstractC3222i.D(AbstractC3222i.I(this.f9127c.b(), new a(this.f9128d, null)), (Ii.N) this.f9126b);
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final B vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        e.a aVar;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        boolean z10;
        boolean z11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2073120643);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2073120643, i13, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupDiscovering (WmwStatusPopupDiscovering.kt:58)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(16)), f0.c.f46573a.g(), interfaceC3540lR, 54);
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
            E9.f fVarJ = E9.l.j(interfaceC3540lR, 0);
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            E9.l.e(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), fVarJ, interfaceC3540lR, 6, 0);
            s9.d dVar = (s9.d) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(-1423204739);
            if (dVar == null) {
                aVar = aVar3;
                i12 = i13;
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null);
                C3174d c3174dA = AbstractC7930a.a(dVar, interfaceC3540lR, 0);
                C6562a c6562a = C6562a.f52458a;
                int i14 = C6562a.f52459b;
                aVar = aVar3;
                i12 = i13;
                interfaceC3540l2 = interfaceC3540lR;
                a1.c(c3174dA, eVarH, c6562a.a(interfaceC3540lR, i14).f().c(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i14).b().a(), interfaceC3540l2, 48, 0, 130552);
            }
            interfaceC3540l2.J();
            interfaceC3540lR = interfaceC3540l2;
            s9.d dVar2 = (s9.d) o1.b(vm.o0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(-1423193425);
            if (dVar2 == null) {
                z10 = true;
                z11 = false;
            } else {
                String strB = AbstractC7930a.b(dVar2, interfaceC3540lR, 0);
                interfaceC3540lR.U(2111424836);
                boolean z12 = (i12 & 112) == 32;
                Object objF = interfaceC3540lR.f();
                if (z12 || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new a(vm);
                    interfaceC3540lR.K(objF);
                }
                interfaceC3540lR.J();
                z10 = true;
                z11 = false;
                w9.k.c(aVar, (InterfaceC6824a) ((th.g) objF), false, false, null, null, strB, null, interfaceC3540lR, 6, 188);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.U(-1423186226);
            boolean zT = interfaceC3540lR.T(fVarJ) | ((i12 & 112) == 32 ? z10 : z11);
            Object objF2 = interfaceC3540lR.f();
            if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new b(vm, fVarJ, null);
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            T.O.f(vm, (InterfaceC6839p) objF2, interfaceC3540lR, (i12 >> 3) & 14);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.C
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return D.c(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, B b10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, b10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
