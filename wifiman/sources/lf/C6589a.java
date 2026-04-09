package lf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.foundation.layout.r;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.q;
import s9.d;
import z.InterfaceC8687j;

/* renamed from: lf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6589a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6589a f52591a = new C6589a();

    /* renamed from: b, reason: collision with root package name */
    public static q f52592b = b0.c.c(943344660, false, C1943a.f52593a);

    /* renamed from: lf.a$a, reason: collision with other inner class name */
    static final class C1943a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final C1943a f52593a = new C1943a();

        C1943a() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(943344660, i10, -1, "com.ui.wifiman.ui.speedtest.server.ComposableSingletons$SpeedtestInternetServerPickerUiKt.lambda-1.<anonymous> (SpeedtestInternetServerPickerUi.kt:23)");
            }
            Fe.j.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new d.b(AbstractC6780c.f53301E3), null, null, null, 0L, interfaceC3540l, 6, 60);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public final q a() {
        return f52592b;
    }
}
