package L9;

import N.AbstractC3343s;
import N.a1;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.I0;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import T.z1;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes3.dex */
public abstract class O {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f11330a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11331b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f11332c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f11333d;

        /* renamed from: L9.O$a$a, reason: collision with other inner class name */
        static final class C0447a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f11334a;

            C0447a(String str) {
                this.f11334a = str;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-641923114, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarTextButton.<anonymous>.<anonymous> (UiToolbarTextButton.kt:29)");
                }
                androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.ui.e.f28771b0, Y0.h.j(6), Y0.h.j(4));
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                a1.b(this.f11334a, eVarJ, C6733v0.k(c6562a.a(interfaceC3540l, i11).a().b().f(), ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().b(), interfaceC3540l, 48, 0, 65528);
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

        a(androidx.compose.ui.e eVar, boolean z10, InterfaceC6824a interfaceC6824a, String str) {
            this.f11330a = eVar;
            this.f11331b = z10;
            this.f11332c = interfaceC6824a;
            this.f11333d = str;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1706392690, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarTextButton.<anonymous> (UiToolbarTextButton.kt:24)");
            }
            AbstractC3201g.c(this.f11330a, this.f11331b, this.f11332c, null, null, b0.c.e(-641923114, true, new C0447a(this.f11333d), interfaceC3540l, 54), interfaceC3540l, ImageMetadata.EDGE_MODE, 24);
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

    public static final void c(final String text, androidx.compose.ui.e eVar, boolean z10, InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        float fB;
        AbstractC6492s.i(text, "text");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-815851598);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.c(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i15 = i11 & 8;
        if (i15 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6824a) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                z10 = true;
            }
            if (i15 != 0) {
                interfaceC3540lR.U(-226009972);
                Object objF = interfaceC3540lR.f();
                if (objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: L9.M
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return O.d();
                        }
                    };
                    interfaceC3540lR.K(objF);
                }
                interfaceC6824a = (InterfaceC6824a) objF;
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-815851598, i12, -1, "com.ui.core.ui.component.toolbar.UiToolbarTextButton (UiToolbarTextButton.kt:21)");
            }
            if (z10) {
                interfaceC3540lR.U(-226007442);
                fB = N.r.f14715a.c(interfaceC3540lR, N.r.f14716b);
            } else {
                interfaceC3540lR.U(-226006702);
                fB = N.r.f14715a.b(interfaceC3540lR, N.r.f14716b);
            }
            interfaceC3540lR.J();
            AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(e(o1.n(Float.valueOf(fB), interfaceC3540lR, 0)))), b0.c.e(1706392690, true, new a(eVar, z10, interfaceC6824a, text), interfaceC3540lR, 54), interfaceC3540lR, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final androidx.compose.ui.e eVar2 = eVar;
        final boolean z11 = z10;
        final InterfaceC6824a interfaceC6824a2 = interfaceC6824a;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: L9.N
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return O.f(text, eVar2, z11, interfaceC6824a2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d() {
        return Yg.J.f24997a;
    }

    private static final float e(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(String str, androidx.compose.ui.e eVar, boolean z10, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(str, eVar, z10, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
