package androidx.compose.foundation.selection;

import J0.g;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import androidx.compose.foundation.j;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.q;
import s.InterfaceC7834G;
import s.InterfaceC7836I;
import y.AbstractC8557l;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.compose.foundation.selection.a$a, reason: collision with other inner class name */
    public static final class C1054a extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7834G f28447a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28448b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28449c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f28450d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f28451e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1054a(InterfaceC7834G interfaceC7834G, boolean z10, boolean z11, g gVar, InterfaceC6824a interfaceC6824a) {
            super(3);
            this.f28447a = interfaceC7834G;
            this.f28448b = z10;
            this.f28449c = z11;
            this.f28450d = gVar;
            this.f28451e = interfaceC6824a;
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
            androidx.compose.ui.e eVarB0 = j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, this.f28447a).b0(new SelectableElement(this.f28448b, interfaceC8558m, null, this.f28449c, this.f28450d, this.f28451e, null));
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

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7834G interfaceC7834G, boolean z11, g gVar, InterfaceC6824a interfaceC6824a) {
        return eVar.b0(interfaceC7834G instanceof InterfaceC7836I ? new SelectableElement(z10, interfaceC8558m, (InterfaceC7836I) interfaceC7834G, z11, gVar, interfaceC6824a, null) : interfaceC7834G == null ? new SelectableElement(z10, interfaceC8558m, null, z11, gVar, interfaceC6824a, null) : interfaceC8558m != null ? j.b(androidx.compose.ui.e.f28771b0, interfaceC8558m, interfaceC7834G).b0(new SelectableElement(z10, interfaceC8558m, null, z11, gVar, interfaceC6824a, null)) : androidx.compose.ui.c.c(androidx.compose.ui.e.f28771b0, null, new C1054a(interfaceC7834G, z10, z11, gVar, interfaceC6824a), 1, null));
    }
}
