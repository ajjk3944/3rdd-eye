package androidx.compose.foundation.selection;

import J0.g;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import androidx.compose.foundation.j;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.q;
import s.InterfaceC7834G;
import s.InterfaceC7836I;
import y.AbstractC8557l;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7834G f28453a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28454b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28455c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f28456d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28457e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7834G interfaceC7834G, boolean z10, boolean z11, g gVar, InterfaceC6835l interfaceC6835l) {
            super(3);
            this.f28453a = interfaceC7834G;
            this.f28454b = z10;
            this.f28455c = z11;
            this.f28456d = gVar;
            this.f28457e = interfaceC6835l;
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
            androidx.compose.ui.e eVarB0 = j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, this.f28453a).b0(new ToggleableElement(this.f28454b, interfaceC8558m, null, this.f28455c, this.f28456d, this.f28457e, null));
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

    public static final class b extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7834G f28458a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K0.a f28459b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28460c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f28461d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f28462e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC7834G interfaceC7834G, K0.a aVar, boolean z10, g gVar, InterfaceC6824a interfaceC6824a) {
            super(3);
            this.f28458a = interfaceC7834G;
            this.f28459b = aVar;
            this.f28460c = z10;
            this.f28461d = gVar;
            this.f28462e = interfaceC6824a;
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
            androidx.compose.ui.e eVarB0 = j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, this.f28458a).b0(new TriStateToggleableElement(this.f28459b, interfaceC8558m, null, this.f28460c, this.f28461d, this.f28462e, null));
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

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7834G interfaceC7834G, boolean z11, g gVar, InterfaceC6835l interfaceC6835l) {
        return eVar.b0(interfaceC7834G instanceof InterfaceC7836I ? new ToggleableElement(z10, interfaceC8558m, (InterfaceC7836I) interfaceC7834G, z11, gVar, interfaceC6835l, null) : interfaceC7834G == null ? new ToggleableElement(z10, interfaceC8558m, null, z11, gVar, interfaceC6835l, null) : interfaceC8558m != null ? j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, interfaceC7834G).b0(new ToggleableElement(z10, interfaceC8558m, null, z11, gVar, interfaceC6835l, null)) : androidx.compose.ui.c.c(androidx.compose.ui.e.f28771b0, null, new a(interfaceC7834G, z10, z11, gVar, interfaceC6835l), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7834G interfaceC7834G, boolean z11, g gVar, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return a(eVar, z10, interfaceC8558m, interfaceC7834G, z12, gVar, interfaceC6835l);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, K0.a aVar, InterfaceC8558m interfaceC8558m, InterfaceC7834G interfaceC7834G, boolean z10, g gVar, InterfaceC6824a interfaceC6824a) {
        return eVar.b0(interfaceC7834G instanceof InterfaceC7836I ? new TriStateToggleableElement(aVar, interfaceC8558m, (InterfaceC7836I) interfaceC7834G, z10, gVar, interfaceC6824a, null) : interfaceC7834G == null ? new TriStateToggleableElement(aVar, interfaceC8558m, null, z10, gVar, interfaceC6824a, null) : interfaceC8558m != null ? j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, interfaceC7834G).b0(new TriStateToggleableElement(aVar, interfaceC8558m, null, z10, gVar, interfaceC6824a, null)) : androidx.compose.ui.c.c(androidx.compose.ui.e.f28771b0, null, new b(interfaceC7834G, aVar, z10, gVar, interfaceC6824a), 1, null));
    }
}
