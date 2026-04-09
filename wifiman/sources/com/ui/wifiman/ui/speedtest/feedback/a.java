package com.ui.wifiman.ui.speedtest.feedback;

import L9.AbstractC3198d;
import Li.P;
import Li.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.foundation.layout.r;
import com.ui.wifiman.ui.speedtest.feedback.a;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import org.kodein.di.DI;
import s9.d;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.InterfaceC8687j;
import z.Y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f44892a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static q f44893b = b0.c.c(-1452630513, false, C1620a.f44896a);

    /* renamed from: c, reason: collision with root package name */
    public static q f44894c = b0.c.c(-1702075274, false, b.f44897a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f44895d = b0.c.c(-1664405135, false, c.f44898a);

    /* renamed from: com.ui.wifiman.ui.speedtest.feedback.a$a, reason: collision with other inner class name */
    static final class C1620a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final C1620a f44896a = new C1620a();

        C1620a() {
        }

        public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1452630513, i10, -1, "com.ui.wifiman.ui.speedtest.feedback.ComposableSingletons$SpeedtestFeedbackUiKt.lambda-1.<anonymous> (SpeedtestFeedbackUi.kt:62)");
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44897a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1702075274, i10, -1, "com.ui.wifiman.ui.speedtest.feedback.ComposableSingletons$SpeedtestFeedbackUiKt.lambda-2.<anonymous> (SpeedtestFeedbackUi.kt:55)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            d.b bVar2 = new d.b(AbstractC6780c.f53472d3);
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(-1468023459);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.speedtest.feedback.b
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return a.b.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Fe.j.c(eVarH, bVar2, aVar, (InterfaceC6824a) objF, a.f44892a.a(), 0L, interfaceC3540l, (AbstractC3198d.a.f11403c << 6) | 24582, 32);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f44898a = new c();

        /* renamed from: com.ui.wifiman.ui.speedtest.feedback.a$c$a, reason: collision with other inner class name */
        public static final class C1621a extends e {

            /* renamed from: g, reason: collision with root package name */
            private final z f44899g = P.a(d.THROUGHPUT);

            /* renamed from: h, reason: collision with root package name */
            private final z f44900h = P.a(Boolean.TRUE);

            C1621a() {
            }

            @Override // org.kodein.di.c
            public DI d() {
                throw new Yg.r(null, 1, null);
            }

            @Override // com.ui.wifiman.ui.speedtest.feedback.e
            public void q0(String comment) {
                AbstractC6492s.i(comment, "comment");
            }

            @Override // com.ui.wifiman.ui.speedtest.feedback.e
            public void r0(d reason) {
                AbstractC6492s.i(reason, "reason");
            }

            @Override // com.ui.wifiman.ui.speedtest.feedback.e
            public void s0() {
            }

            @Override // com.ui.wifiman.ui.speedtest.feedback.e
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public z o0() {
                return this.f44899g;
            }

            @Override // com.ui.wifiman.ui.speedtest.feedback.e
            /* renamed from: u0, reason: merged with bridge method [inline-methods] */
            public z p0() {
                return this.f44900h;
            }
        }

        c() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1664405135, i10, -1, "com.ui.wifiman.ui.speedtest.feedback.ComposableSingletons$SpeedtestFeedbackUiKt.lambda-3.<anonymous> (SpeedtestFeedbackUi.kt:194)");
            }
            i.g(androidx.compose.ui.e.f28771b0, new C1621a(), interfaceC3540l, 6, 0);
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
        return f44893b;
    }

    public final q b() {
        return f44894c;
    }
}
