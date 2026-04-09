package androidx.compose.foundation;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.q;
import s.Z;

/* loaded from: classes.dex */
public abstract class m {

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f28361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(0);
            this.f28361a = i10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o(this.f28361a);
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f28362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28363b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w.n f28364c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28365d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f28366e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, boolean z10, w.n nVar, boolean z11, boolean z12) {
            super(1);
            this.f28362a = oVar;
            this.f28363b = z10;
            this.f28364c = nVar;
            this.f28365d = z11;
            this.f28366e = z12;
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

    static final class c extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f28367a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28368b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w.n f28369c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28370d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f28371e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, boolean z10, w.n nVar, boolean z11, boolean z12) {
            super(3);
            this.f28367a = oVar;
            this.f28368b = z10;
            this.f28369c = nVar;
            this.f28370d = z11;
            this.f28371e = z12;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(1478351300);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1478351300, i10, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
            }
            androidx.compose.ui.e eVarB0 = androidx.compose.ui.e.f28771b0.b0(new ScrollSemanticsElement(this.f28367a, this.f28368b, this.f28369c, this.f28370d, this.f28371e));
            o oVar = this.f28367a;
            androidx.compose.ui.e eVarB02 = Z.a(eVarB0, oVar, this.f28371e ? w.q.Vertical : w.q.Horizontal, this.f28370d, this.f28368b, this.f28369c, oVar.k(), null, interfaceC3540l, 0, 64).b0(new ScrollingLayoutElement(this.f28367a, this.f28368b, this.f28371e));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarB02;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final o a(int i10, InterfaceC3540l interfaceC3540l, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Object[] objArr = new Object[0];
        InterfaceC4182k interfaceC4182kA = o.f28379i.a();
        if ((((i11 & 14) ^ 6) <= 4 || !interfaceC3540l.i(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new a(i10);
            interfaceC3540l.K(objF);
        }
        o oVar = (o) AbstractC4174c.e(objArr, interfaceC4182kA, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 4);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return oVar;
    }

    private static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, o oVar, boolean z10, w.n nVar, boolean z11, boolean z12) {
        return androidx.compose.ui.c.b(eVar, AbstractC3964z0.b() ? new b(oVar, z10, nVar, z11, z12) : AbstractC3964z0.a(), new c(oVar, z10, nVar, z11, z12));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, o oVar, boolean z10, w.n nVar, boolean z11) {
        return b(eVar, oVar, z11, nVar, z10, true);
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, o oVar, boolean z10, w.n nVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            nVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return c(eVar, oVar, z10, nVar, z11);
    }
}
