package Vf;

import Ii.N;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import Yg.J;
import Yg.v;
import androidx.compose.ui.platform.AbstractC3932k0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23414a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f23415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f23415b = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f23415b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f23414a;
            if (i10 == 0) {
                v.b(obj);
                d dVar = this.f23415b;
                this.f23414a = 1;
                if (dVar.b(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final d a(h theme, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(theme, "theme");
        interfaceC3540l.U(1265936280);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1265936280, i10, -1, "com.valentinilk.shimmer.rememberShimmerEffect (ShimmerEffect.kt:21)");
        }
        float fD1 = ((Y0.d) interfaceC3540l.t(AbstractC3932k0.g())).d1(theme.h());
        interfaceC3540l.U(1531381470);
        boolean zT = interfaceC3540l.T(theme);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new d(theme.c(), theme.d(), theme.e(), theme.g(), theme.f(), fD1, null);
            interfaceC3540l.K(objF);
        }
        d dVar = (d) objF;
        interfaceC3540l.J();
        interfaceC3540l.U(1531392836);
        boolean zL = interfaceC3540l.l(dVar);
        Object objF2 = interfaceC3540l.f();
        if (zL || objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new a(dVar, null);
            interfaceC3540l.K(objF2);
        }
        interfaceC3540l.J();
        O.f(dVar, (InterfaceC6839p) objF2, interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return dVar;
    }
}
