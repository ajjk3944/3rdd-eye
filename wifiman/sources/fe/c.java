package Fe;

import Fe.c;
import L9.L;
import L9.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.q;
import s9.d;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.Y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f6486a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static q f6487b = b0.c.c(-752324407, false, a.f6488a);

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6488a = new a();

        /* renamed from: Fe.c$a$a, reason: collision with other inner class name */
        static final class C0256a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f6489a;

            C0256a(InterfaceC8511f.b bVar) {
                this.f6489a = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(InterfaceC8511f.b bVar) {
                bVar.a();
                return J.f24997a;
            }

            public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2082574736, i10, -1, "com.ui.wifiman.ui.component.modal.ComposableSingletons$ModalToolbarKt.lambda-1.<anonymous>.<anonymous> (ModalToolbar.kt:25)");
                }
                s9.b bVarG = N9.b.f16117a.s().g(new d.b(AbstractC6780c.f53557p4));
                interfaceC3540l.U(1079343111);
                boolean zT = interfaceC3540l.T(this.f6489a);
                final InterfaceC8511f.b bVar = this.f6489a;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Fe.b
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return c.a.C0256a.c(bVar);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                z.c(bVarG, null, 0L, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 14);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a() {
        }

        public final void a(Y y10, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(y10, "<this>");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-752324407, i10, -1, "com.ui.wifiman.ui.component.modal.ComposableSingletons$ModalToolbarKt.lambda-1.<anonymous> (ModalToolbar.kt:23)");
            }
            L.b(null, b0.c.e(2082574736, true, new C0256a((InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K())), interfaceC3540l, 54), interfaceC3540l, 48, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public final q a() {
        return f6487b;
    }
}
