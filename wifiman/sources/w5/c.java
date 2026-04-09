package W5;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.InterfaceC3540l;
import X5.a;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import s.AbstractC7852m;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f23672a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f23673b = AbstractC3561w.d(null, a.f23674a, 1, null);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23674a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W5.a invoke() {
            return null;
        }
    }

    private c() {
    }

    public final W5.a a(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.e(1796211020);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1796211020, i10, -1, "com.patrykandpatrick.vico.compose.style.LocalChartStyle.<get-current> (ChartStyle.kt:256)");
        }
        W5.a aVarB = (W5.a) interfaceC3540l.t(f23673b);
        if (aVarB == null) {
            aVarB = b(interfaceC3540l, i10 & 14);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return aVarB;
    }

    public final W5.a b(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.e(-1649800116);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1649800116, i10, -1, "com.patrykandpatrick.vico.compose.style.LocalChartStyle.<get-default> (ChartStyle.kt:245)");
        }
        W5.a aVarB = W5.a.f23630f.b(AbstractC7852m.a(interfaceC3540l, 0) ? a.C0910a.f24026a : a.b.f24035a);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return aVarB;
    }
}
