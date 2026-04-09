package F;

import Q0.AbstractC3434k;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class r {

    public static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5605b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0.U f5606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, L0.U u10) {
            super(1);
            this.f5604a = i10;
            this.f5605b = i11;
            this.f5606c = u10;
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

    static final class b extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5608b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0.U f5609c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, L0.U u10) {
            super(3);
            this.f5607a = i10;
            this.f5608b = i11;
            this.f5609c = u10;
        }

        private static final Object c(z1 z1Var) {
            return z1Var.getValue();
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(408240218);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(408240218, i10, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            r.b(this.f5607a, this.f5608b);
            if (this.f5607a == 1 && this.f5608b == Integer.MAX_VALUE) {
                e.a aVar = androidx.compose.ui.e.f28771b0;
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return aVar;
            }
            Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
            AbstractC3434k.b bVar = (AbstractC3434k.b) interfaceC3540l.t(AbstractC3932k0.i());
            Y0.t tVar = (Y0.t) interfaceC3540l.t(AbstractC3932k0.m());
            boolean zT = interfaceC3540l.T(this.f5609c) | interfaceC3540l.T(tVar);
            L0.U u10 = this.f5609c;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = L0.V.d(u10, tVar);
                interfaceC3540l.K(objF);
            }
            L0.U u11 = (L0.U) objF;
            boolean zT2 = interfaceC3540l.T(bVar) | interfaceC3540l.T(u11);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                AbstractC3434k abstractC3434kJ = u11.j();
                Q0.A aO = u11.o();
                if (aO == null) {
                    aO = Q0.A.f18971b.e();
                }
                Q0.v vVarM = u11.m();
                int i11 = vVarM != null ? vVarM.i() : Q0.v.f19100b.b();
                Q0.w wVarN = u11.n();
                objF2 = bVar.a(abstractC3434kJ, aO, i11, wVarN != null ? wVarN.m() : Q0.w.f19104b.a());
                interfaceC3540l.K(objF2);
            }
            z1 z1Var = (z1) objF2;
            boolean zT3 = interfaceC3540l.T(c(z1Var)) | interfaceC3540l.T(dVar) | interfaceC3540l.T(bVar) | interfaceC3540l.T(this.f5609c) | interfaceC3540l.T(tVar);
            Object objF3 = interfaceC3540l.f();
            if (zT3 || objF3 == InterfaceC3540l.f21100a.a()) {
                objF3 = Integer.valueOf(Y0.r.f(X.a(u11, dVar, bVar, X.c(), 1)));
                interfaceC3540l.K(objF3);
            }
            int iIntValue = ((Number) objF3).intValue();
            boolean zT4 = interfaceC3540l.T(tVar) | interfaceC3540l.T(dVar) | interfaceC3540l.T(bVar) | interfaceC3540l.T(this.f5609c) | interfaceC3540l.T(c(z1Var));
            Object objF4 = interfaceC3540l.f();
            if (zT4 || objF4 == InterfaceC3540l.f21100a.a()) {
                objF4 = Integer.valueOf(Y0.r.f(X.a(u11, dVar, bVar, X.c() + '\n' + X.c(), 2)));
                interfaceC3540l.K(objF4);
            }
            int iIntValue2 = ((Number) objF4).intValue() - iIntValue;
            int i12 = this.f5607a;
            Integer numValueOf = i12 == 1 ? null : Integer.valueOf(((i12 - 1) * iIntValue2) + iIntValue);
            int i13 = this.f5608b;
            Integer numValueOf2 = i13 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i13 - 1))) : null;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.r.j(androidx.compose.ui.e.f28771b0, numValueOf != null ? dVar.x(numValueOf.intValue()) : Y0.h.f24523b.c(), numValueOf2 != null ? dVar.x(numValueOf2.intValue()) : Y0.h.f24523b.c());
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarJ;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, L0.U u10, int i10, int i11) {
        return androidx.compose.ui.c.b(eVar, AbstractC3964z0.b() ? new a(i10, i11, u10) : AbstractC3964z0.a(), new b(i10, i11, u10));
    }

    public static final void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero").toString());
        }
        if (i10 <= i11) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i10 + " must be less than or equal to maxLines " + i11).toString());
    }
}
