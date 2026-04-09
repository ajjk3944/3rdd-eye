package jf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.foundation.layout.r;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import z.InterfaceC8687j;

/* renamed from: jf.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6319b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6319b f50814a = new C6319b();

    /* renamed from: b, reason: collision with root package name */
    public static q f50815b = b0.c.c(-2138193042, false, a.f50817a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f50816c = b0.c.c(-1470725001, false, C1877b.f50818a);

    /* renamed from: jf.b$a */
    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f50817a = new a();

        a() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2138193042, i10, -1, "com.ui.wifiman.ui.speedtest.result.ComposableSingletons$SpeedtestResultDetailUiKt.lambda-1.<anonymous> (SpeedtestResultDetailUi.kt:29)");
            }
            Fe.j.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new d.b(AbstractC6780c.f53591u3), null, null, null, 0L, interfaceC3540l, 6, 60);
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

    /* renamed from: jf.b$b, reason: collision with other inner class name */
    static final class C1877b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C1877b f50818a = new C1877b();

        C1877b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1470725001, i10, -1, "com.ui.wifiman.ui.speedtest.result.ComposableSingletons$SpeedtestResultDetailUiKt.lambda-2.<anonymous> (SpeedtestResultDetailUi.kt:88)");
            }
            p.b(androidx.compose.ui.e.f28771b0, p.e(null, null, null, null, interfaceC3540l, 0, 15), interfaceC3540l, 6, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public final q a() {
        return f50815b;
    }
}
