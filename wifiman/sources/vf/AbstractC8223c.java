package vf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import Yg.v;
import androidx.compose.ui.platform.AbstractC3932k0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import vf.AbstractC8223c;
import w.AbstractC8235B;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;

/* renamed from: vf.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8223c {

    /* renamed from: vf.c$a */
    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63592a = new a();

        /* renamed from: vf.c$a$a, reason: collision with other inner class name */
        static final class C2258a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f63593a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f63594b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0.e f63595c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2258a(k0.e eVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f63595c = eVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J t(k0.e eVar, C6531g c6531g) {
                k0.e.c(eVar, false, 1, null);
                return J.f24997a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C2258a c2258a = new C2258a(this.f63595c, interfaceC5380e);
                c2258a.f63594b = obj;
                return c2258a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f63593a;
                if (i10 == 0) {
                    v.b(obj);
                    InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f63594b;
                    final k0.e eVar = this.f63595c;
                    InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: vf.b
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj2) {
                            return AbstractC8223c.a.C2258a.t(eVar, (C6531g) obj2);
                        }
                    };
                    this.f63593a = 1;
                    if (AbstractC8235B.k(interfaceC8567G, null, null, null, interfaceC6835l, this, 7, null) == objG) {
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
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                return ((C2258a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        a() {
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e composed, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(composed, "$this$composed");
            interfaceC3540l.U(1027429750);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1027429750, i10, -1, "com.ui.wifiman.ui.util.clearFocusOnTap.<anonymous> (FocusUtils.kt:9)");
            }
            k0.e eVar = (k0.e) interfaceC3540l.t(AbstractC3932k0.h());
            J j10 = J.f24997a;
            interfaceC3540l.U(-695700276);
            boolean zL = interfaceC3540l.l(eVar);
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C2258a(eVar, null);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarD = AbstractC8576P.d(composed, j10, (InterfaceC6839p) objF);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarD;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        AbstractC6492s.i(eVar, "<this>");
        return androidx.compose.ui.c.c(eVar, null, a.f63592a, 1, null);
    }
}
