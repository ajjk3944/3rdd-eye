package androidx.compose.foundation;

import E0.A0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.q;
import s.InterfaceC7834G;
import s.InterfaceC7836I;
import w.w;
import y.AbstractC8557l;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public abstract class d {

    static final class a extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27790b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J0.g f27791c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27792d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a) {
            super(3);
            this.f27789a = z10;
            this.f27790b = str;
            this.f27791c = gVar;
            this.f27792d = interfaceC6824a;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            InterfaceC8558m interfaceC8558m;
            interfaceC3540l.U(-756081143);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
            }
            InterfaceC7834G interfaceC7834G = (InterfaceC7834G) interfaceC3540l.t(j.a());
            if (interfaceC7834G instanceof InterfaceC7836I) {
                interfaceC3540l.U(617140216);
                interfaceC3540l.J();
                interfaceC8558m = null;
            } else {
                interfaceC3540l.U(617248189);
                Object objF = interfaceC3540l.f();
                if (objF == InterfaceC3540l.f21100a.a()) {
                    objF = AbstractC8557l.a();
                    interfaceC3540l.K(objF);
                }
                interfaceC8558m = (InterfaceC8558m) objF;
                interfaceC3540l.J();
            }
            androidx.compose.ui.e eVarA = d.a(androidx.compose.ui.e.f28771b0, interfaceC8558m, interfaceC7834G, this.f27789a, this.f27790b, this.f27791c, this.f27792d);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarA;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class b extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7834G f27793a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27794b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27795c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J0.g f27796d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27797e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC7834G interfaceC7834G, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a) {
            super(3);
            this.f27793a = interfaceC7834G;
            this.f27794b = z10;
            this.f27795c = str;
            this.f27796d = gVar;
            this.f27797e = interfaceC6824a;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-1525724089);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = AbstractC8557l.a();
                interfaceC3540l.K(objF);
            }
            InterfaceC8558m interfaceC8558m = (InterfaceC8558m) objF;
            androidx.compose.ui.e eVarB0 = j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, this.f27793a).b0(new ClickableElement(interfaceC8558m, null, this.f27794b, this.f27795c, this.f27796d, this.f27797e, null));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarB0;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27798a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J0.g f27800c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27801d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a) {
            super(1);
            this.f27798a = z10;
            this.f27799b = str;
            this.f27800c = gVar;
            this.f27801d = interfaceC6824a;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    /* renamed from: androidx.compose.foundation.d$d, reason: collision with other inner class name */
    static final class C1037d extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27802a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27803b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J0.g f27804c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f27805d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27806e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27807f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27808g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1037d(boolean z10, String str, J0.g gVar, String str2, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3) {
            super(3);
            this.f27802a = z10;
            this.f27803b = str;
            this.f27804c = gVar;
            this.f27805d = str2;
            this.f27806e = interfaceC6824a;
            this.f27807f = interfaceC6824a2;
            this.f27808g = interfaceC6824a3;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            InterfaceC8558m interfaceC8558m;
            interfaceC3540l.U(1969174843);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1969174843, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
            }
            InterfaceC7834G interfaceC7834G = (InterfaceC7834G) interfaceC3540l.t(j.a());
            if (interfaceC7834G instanceof InterfaceC7836I) {
                interfaceC3540l.U(-1726989699);
                interfaceC3540l.J();
                interfaceC8558m = null;
            } else {
                interfaceC3540l.U(-1726881726);
                Object objF = interfaceC3540l.f();
                if (objF == InterfaceC3540l.f21100a.a()) {
                    objF = AbstractC8557l.a();
                    interfaceC3540l.K(objF);
                }
                interfaceC8558m = (InterfaceC8558m) objF;
                interfaceC3540l.J();
            }
            androidx.compose.ui.e eVarE = d.e(androidx.compose.ui.e.f28771b0, interfaceC8558m, interfaceC7834G, this.f27802a, this.f27803b, this.f27804c, this.f27805d, this.f27806e, this.f27807f, this.f27808g);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarE;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class e extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7834G f27809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27810b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27811c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J0.g f27812d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27813e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f27814f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27815g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27816h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC7834G interfaceC7834G, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a, String str2, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3) {
            super(3);
            this.f27809a = interfaceC7834G;
            this.f27810b = z10;
            this.f27811c = str;
            this.f27812d = gVar;
            this.f27813e = interfaceC6824a;
            this.f27814f = str2;
            this.f27815g = interfaceC6824a2;
            this.f27816h = interfaceC6824a3;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-1525724089);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = AbstractC8557l.a();
                interfaceC3540l.K(objF);
            }
            InterfaceC8558m interfaceC8558m = (InterfaceC8558m) objF;
            androidx.compose.ui.e eVarB0 = j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, this.f27809a).b0(new CombinedClickableElement(interfaceC8558m, null, this.f27810b, this.f27811c, this.f27812d, this.f27813e, this.f27814f, this.f27815g, this.f27816h, null));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarB0;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27817a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J0.g f27819c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27820d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27821e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f27822f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f27823g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3, String str2) {
            super(1);
            this.f27817a = z10;
            this.f27818b = str;
            this.f27819c = gVar;
            this.f27820d = interfaceC6824a;
            this.f27821e = interfaceC6824a2;
            this.f27822f = interfaceC6824a3;
            this.f27823g = str2;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f27824a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.jvm.internal.J j10) {
            super(1);
            this.f27824a = j10;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(E0.A0 r4) {
            /*
                r3 = this;
                kotlin.jvm.internal.J r0 = r3.f27824a
                boolean r1 = r0.f51685a
                r2 = 1
                if (r1 != 0) goto L17
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"
                kotlin.jvm.internal.AbstractC6492s.g(r4, r1)
                w.w r4 = (w.w) r4
                boolean r4 = r4.D2()
                if (r4 == 0) goto L15
                goto L17
            L15:
                r4 = 0
                goto L18
            L17:
                r4 = r2
            L18:
                r0.f51685a = r4
                kotlin.jvm.internal.J r4 = r3.f27824a
                boolean r4 = r4.f51685a
                r4 = r4 ^ r2
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.g.invoke(E0.A0):java.lang.Boolean");
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC8558m interfaceC8558m, InterfaceC7834G interfaceC7834G, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a) {
        return eVar.b0(interfaceC7834G instanceof InterfaceC7836I ? new ClickableElement(interfaceC8558m, (InterfaceC7836I) interfaceC7834G, z10, str, gVar, interfaceC6824a, null) : interfaceC7834G == null ? new ClickableElement(interfaceC8558m, null, z10, str, gVar, interfaceC6824a, null) : interfaceC8558m != null ? j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, interfaceC7834G).b0(new ClickableElement(interfaceC8558m, null, z10, str, gVar, interfaceC6824a, null)) : androidx.compose.ui.c.c(androidx.compose.ui.e.f28771b0, null, new b(interfaceC7834G, z10, str, gVar, interfaceC6824a), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC8558m interfaceC8558m, InterfaceC7834G interfaceC7834G, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return a(eVar, interfaceC8558m, interfaceC7834G, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : gVar, interfaceC6824a);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a) {
        return androidx.compose.ui.c.b(eVar, AbstractC3964z0.b() ? new c(z10, str, gVar, interfaceC6824a) : AbstractC3964z0.a(), new a(z10, str, gVar, interfaceC6824a));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        return c(eVar, z10, str, gVar, interfaceC6824a);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, InterfaceC8558m interfaceC8558m, InterfaceC7834G interfaceC7834G, boolean z10, String str, J0.g gVar, String str2, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3) {
        return eVar.b0(interfaceC7834G instanceof InterfaceC7836I ? new CombinedClickableElement(interfaceC8558m, (InterfaceC7836I) interfaceC7834G, z10, str, gVar, interfaceC6824a3, str2, interfaceC6824a, interfaceC6824a2, null) : interfaceC7834G == null ? new CombinedClickableElement(interfaceC8558m, null, z10, str, gVar, interfaceC6824a3, str2, interfaceC6824a, interfaceC6824a2, null) : interfaceC8558m != null ? j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, interfaceC7834G).b0(new CombinedClickableElement(interfaceC8558m, null, z10, str, gVar, interfaceC6824a3, str2, interfaceC6824a, interfaceC6824a2, null)) : androidx.compose.ui.c.c(androidx.compose.ui.e.f28771b0, null, new e(interfaceC7834G, z10, str, gVar, interfaceC6824a3, str2, interfaceC6824a, interfaceC6824a2), 1, null));
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, boolean z10, String str, J0.g gVar, String str2, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3) {
        return androidx.compose.ui.c.b(eVar, AbstractC3964z0.b() ? new f(z10, str, gVar, interfaceC6824a3, interfaceC6824a2, interfaceC6824a, str2) : AbstractC3964z0.a(), new C1037d(z10, str, gVar, str2, interfaceC6824a, interfaceC6824a2, interfaceC6824a3));
    }

    public static final boolean i(A0 a02) {
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        E0.B0.c(a02, w.f64034p, new g(j10));
        return j10.f51685a;
    }
}
