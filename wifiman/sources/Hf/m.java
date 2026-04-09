package hf;

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
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import sa.AbstractC7930a;
import y.AbstractC8557l;
import y.InterfaceC8558m;
import z.AbstractC8682e;
import z.C8680c;
import z.InterfaceC8683f;
import z.W;
import z.Z;

/* loaded from: classes4.dex */
public abstract class m {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s9.d f48687a;

        a(s9.d dVar) {
            this.f48687a = dVar;
        }

        public final void a(InterfaceC8683f BoxWithConstraints, InterfaceC3540l interfaceC3540l, int i10) {
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
                AbstractC3546o.Q(-1391974625, i11, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestResultKeyVal.<anonymous>.<anonymous> (SpeedtestResultKeyVal.kt:51)");
            }
            androidx.compose.ui.e eVarB = androidx.compose.foundation.layout.r.B(androidx.compose.ui.e.f28771b0, 0.0f, Y0.h.j(BoxWithConstraints.b() / 2.0f), 1, null);
            C3174d c3174dA = AbstractC7930a.a(this.f48687a, interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a1.c(c3174dA, eVarB, c6562a.a(interfaceC3540l, i12).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i12).b().a(), interfaceC3540l, 0, 0, 131064);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final s9.d key, final s9.d value, final boolean z10, final InterfaceC6824a onClick, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(onClick, "onClick");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(539454565);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(key) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(value) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.l(onClick) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(539454565, i12, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestResultKeyVal (SpeedtestResultKeyVal.kt:42)");
            }
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(8));
            c.a aVar = f0.c.f46573a;
            C0.C cB = W.b(fVarN, aVar.l(), interfaceC3540lR, 54);
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z11 = Z.f66823a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            AbstractC8682e.a(aVar3, null, false, b0.c.e(-1391974625, true, new a(key), interfaceC3540lR, 54), interfaceC3540lR, 3078, 6);
            androidx.compose.ui.e eVarA = z11.a(aVar3, 1.0f, true);
            C0.C cB2 = W.b(c8680c.c(), aVar.l(), interfaceC3540lR, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
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
            E1.c(interfaceC3540lA2, cB2, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            interfaceC3540lR.U(1714561427);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = AbstractC8557l.a();
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(value, interfaceC3540lR, (i12 >> 6) & 14), androidx.compose.foundation.d.b(aVar3, (InterfaceC8558m) objF, null, z10, null, null, onClick, 24, null), 0L, 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.b()), 0L, 0, false, 0, 0, C6031c.f48649a.f(Y0.w.g(10), interfaceC3540l2, 54), null, C6562a.f52458a.c(interfaceC3540l2, C6562a.f52459b).b().a(), interfaceC3540l2, 0, 0, 97788);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.l
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return m.c(modifier, key, value, z10, onClick, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, s9.d dVar, s9.d dVar2, boolean z10, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, dVar, dVar2, z10, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
