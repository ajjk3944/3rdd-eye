package xf;

import L9.AbstractC3198d;
import L9.E;
import L9.L;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7391j;
import s9.d;
import sa.AbstractC7930a;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import xf.b;
import xf.c;
import xf.l;
import z.N;
import z.Y;
import z.j0;

/* loaded from: classes4.dex */
public abstract class l {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f66061a;

        /* renamed from: xf.l$a$a, reason: collision with other inner class name */
        static final class C2344a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f66062a;

            /* renamed from: xf.l$a$a$a, reason: collision with other inner class name */
            static final class C2345a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e f66063a;

                /* renamed from: xf.l$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C2346a extends C6490p implements InterfaceC6824a {
                    C2346a(Object obj) {
                        super(0, obj, e.class, "onEditClicked", "onEditClicked()V", 0);
                    }

                    public final void a() {
                        ((e) this.receiver).y0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                C2345a(e eVar) {
                    this.f66063a = eVar;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1375558070, i10, -1, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUi.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailUi.kt:61)");
                    }
                    d.b bVar = new d.b(AbstractC6780c.f53475e);
                    e eVar = this.f66063a;
                    interfaceC3540l.U(-148819296);
                    boolean zT = interfaceC3540l.T(eVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C2346a(eVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    He.i.c(null, (InterfaceC6824a) ((th.g) objF), false, bVar, interfaceC3540l, 0, 5);
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

            C2344a(e eVar) {
                this.f66062a = eVar;
            }

            public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(97699266, i10, -1, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUi.<anonymous>.<anonymous> (WifiAccessPointDetailUi.kt:59)");
                }
                if (((Boolean) o1.b(this.f66062a.w0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue()) {
                    L.b(null, b0.c.e(1375558070, true, new C2345a(this.f66062a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                }
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

        a(e eVar) {
            this.f66061a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            String strA;
            long jC;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(612678866, i10, -1, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUi.<anonymous> (WifiAccessPointDetailUi.kt:42)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            c cVar = (c) o1.b(this.f66061a.r0(), null, interfaceC3540l, 0, 1).getValue();
            androidx.compose.ui.e eVarC = j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            boolean z10 = cVar instanceof c.a;
            if (z10) {
                interfaceC3540l.U(73829790);
                strA = AbstractC7930a.b(((c.a) cVar).a(), interfaceC3540l, 0);
                interfaceC3540l.J();
            } else {
                if (!(cVar instanceof c.b)) {
                    interfaceC3540l.U(73826797);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(73832421);
                strA = H0.f.a(AbstractC6780c.f53379P4, interfaceC3540l, 0);
                interfaceC3540l.J();
            }
            String str = strA;
            if (z10) {
                interfaceC3540l.U(73838963);
                jC = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().b();
                interfaceC3540l.J();
            } else {
                if (!(cVar instanceof c.b)) {
                    interfaceC3540l.U(73835816);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(73841843);
                jC = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().c();
                interfaceC3540l.J();
            }
            long j10 = jC;
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(73845585);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: xf.k
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return l.a.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(eVarC, str, aVar, (InterfaceC6824a) objF, b0.c.e(97699266, true, new C2344a(this.f66061a), interfaceC3540l, 54), j10, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, (AbstractC3198d.a.f11403c << 6) | 24576, 0, 1984);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f66064a;

        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f66065a;

            a(e eVar) {
                this.f66065a = eVar;
            }

            public final void a(xf.b cnt, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(cnt, "cnt");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(cnt) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-314270411, i10, -1, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUi.<anonymous>.<anonymous> (WifiAccessPointDetailUi.kt:79)");
                }
                if (cnt instanceof b.C2339b) {
                    interfaceC3540l.U(-1778107049);
                    n.b(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else {
                    if (!(cnt instanceof b.a)) {
                        interfaceC3540l.U(-1778109225);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-1778101644);
                    g.b(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f66065a, interfaceC3540l, 6);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((xf.b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(e eVar) {
            this.f66064a = eVar;
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
                AbstractC3546o.Q(-1495313717, i10, -1, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUi.<anonymous> (WifiAccessPointDetailUi.kt:71)");
            }
            AbstractC7391j.a((xf.b) o1.b(this.f66064a.q0(), null, interfaceC3540l, 0, 1).getValue(), o.h(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), scaffoldPadding), null, "WifiAccessPointDetailUi", b0.c.e(-314270411, true, new a(this.f66064a), interfaceC3540l, 54), interfaceC3540l, 27648, 4);
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(xf.e r31, T.InterfaceC3540l r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xf.l.b(xf.e, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(e eVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
