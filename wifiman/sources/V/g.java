package v;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import Yg.J;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.text.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.compose.runtime.snapshots.k f63289a = o1.f();

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8178b f63291b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f63292c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C8178b c8178b, int i10) {
            super(2);
            this.f63291b = c8178b;
            this.f63292c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            g.this.a(this.f63291b, interfaceC3540l, L0.a(this.f63292c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f63293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f63294b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f63295c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f63296d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f63297e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6839p interfaceC6839p, boolean z10, androidx.compose.ui.e eVar, q qVar, InterfaceC6824a interfaceC6824a) {
            super(3);
            this.f63293a = interfaceC6839p;
            this.f63294b = z10;
            this.f63295c = eVar;
            this.f63296d = qVar;
            this.f63297e = interfaceC6824a;
        }

        public final void a(C8178b c8178b, InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(c8178b) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(262103052, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
            }
            String str = (String) this.f63293a.invoke(interfaceC3540l, 0);
            if (t.m0(str)) {
                throw new IllegalStateException("Label must not be blank");
            }
            k.b(str, this.f63294b, c8178b, this.f63295c, this.f63296d, this.f63297e, interfaceC3540l, (i10 << 6) & 896, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((C8178b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static /* synthetic */ void d(g gVar, InterfaceC6839p interfaceC6839p, androidx.compose.ui.e eVar, boolean z10, q qVar, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = androidx.compose.ui.e.f28771b0;
        }
        androidx.compose.ui.e eVar2 = eVar;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            qVar = null;
        }
        gVar.c(interfaceC6839p, eVar2, z11, qVar, interfaceC6824a);
    }

    public final void a(C8178b c8178b, InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1320309496);
        int i11 = (i10 & 6) == 0 ? (interfaceC3540lR.T(c8178b) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1320309496, i11, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            androidx.compose.runtime.snapshots.k kVar = this.f63289a;
            int size = kVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((q) kVar.get(i12)).s(c8178b, interfaceC3540lR, Integer.valueOf(i11 & 14));
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(c8178b, i10));
        }
    }

    public final void b() {
        this.f63289a.clear();
    }

    public final void c(InterfaceC6839p interfaceC6839p, androidx.compose.ui.e eVar, boolean z10, q qVar, InterfaceC6824a interfaceC6824a) {
        this.f63289a.add(b0.c.c(262103052, true, new b(interfaceC6839p, z10, eVar, qVar, interfaceC6824a)));
    }
}
