package Ee;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6839p;
import ta.AbstractC8049c;

/* renamed from: Ee.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2702c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2702c f4583a = new C2702c();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f4584b = b0.c.c(2095435654, false, a.f4585a);

    /* renamed from: Ee.c$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4585a = new a();

        a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2095435654, i10, -1, "com.ui.wifiman.ui.component.list.ComposableSingletons$ListItemActionDeleteWidgetKt.lambda-1.<anonymous> (ListItemActionDeleteWidget.kt:21)");
            }
            AbstractC8049c.c(N9.b.f16117a.E(), null, C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().l().f()), null, interfaceC3540l, 0, 5);
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

    public final InterfaceC6839p a() {
        return f4584b;
    }
}
