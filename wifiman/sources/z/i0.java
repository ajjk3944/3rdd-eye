package z;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final D0.l f66917a = D0.e.a(a.f66918a);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f66918a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke() {
            return h0.a(0, 0, 0, 0);
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f66919a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(N n10) {
            super(1);
            this.f66919a = n10;
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

    static final class c extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f66920a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N n10) {
            super(3);
            this.f66920a = n10;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(114694318);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(114694318, i10, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:105)");
            }
            boolean zT = interfaceC3540l.T(this.f66920a);
            N n10 = this.f66920a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new O(n10);
                interfaceC3540l.K(objF);
            }
            O o10 = (O) objF;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return o10;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f66921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f66921a = interfaceC6835l;
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

    static final class e extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f66922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC6835l interfaceC6835l) {
            super(3);
            this.f66922a = interfaceC6835l;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-1608161351);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1608161351, i10, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            boolean zT = interfaceC3540l.T(this.f66922a);
            InterfaceC6835l interfaceC6835l = this.f66922a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C8689l(interfaceC6835l);
                interfaceC3540l.K(objF);
            }
            C8689l c8689l = (C8689l) objF;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c8689l;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, N n10) {
        return androidx.compose.ui.c.b(eVar, AbstractC3964z0.b() ? new b(n10) : AbstractC3964z0.a(), new c(n10));
    }

    public static final D0.l b() {
        return f66917a;
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l) {
        return androidx.compose.ui.c.b(eVar, AbstractC3964z0.b() ? new d(interfaceC6835l) : AbstractC3964z0.a(), new e(interfaceC6835l));
    }
}
