package com.ui.wifiman.ui.settings.feedback;

import Fe.j;
import L0.C3174d;
import Li.P;
import Li.z;
import N.O0;
import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.foundation.layout.r;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6839p;
import mh.q;
import org.kodein.di.DI;
import s9.d;
import sa.AbstractC7930a;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f44628a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static q f44629b = b0.c.c(-1253404278, false, a.f44633a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f44630c = b0.c.c(-624465028, false, b.f44634a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f44631d = b0.c.c(530436357, false, c.f44635a);

    /* renamed from: e, reason: collision with root package name */
    public static InterfaceC6839p f44632e = b0.c.c(-84710199, false, d.f44637a);

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44633a = new a();

        a() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1253404278, i10, -1, "com.ui.wifiman.ui.settings.feedback.ComposableSingletons$AppFeedbackFormUiKt.lambda-1.<anonymous> (AppFeedbackFormUi.kt:42)");
            }
            j.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new d.b(AbstractC6780c.f53566r), null, null, null, 0L, interfaceC3540l, 6, 60);
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

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44634a = new b();

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-624465028, i10, -1, "com.ui.wifiman.ui.settings.feedback.ComposableSingletons$AppFeedbackFormUiKt.lambda-2.<anonymous> (AppFeedbackFormUi.kt:74)");
            }
            C3174d c3174dA = AbstractC7930a.a(new d.b(AbstractC6780c.f53552p), interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a1.c(c3174dA, null, c6562a.a(interfaceC3540l, i11).f().d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().b(), interfaceC3540l, 0, 0, 131066);
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

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f44635a = new c();

        public static final class a extends com.ui.wifiman.ui.settings.feedback.a {

            /* renamed from: g, reason: collision with root package name */
            private final z f44636g = P.a(Boolean.TRUE);

            a() {
            }

            @Override // org.kodein.di.c
            /* renamed from: d */
            public DI getDi() {
                throw new Yg.r(null, 1, null);
            }

            @Override // com.ui.wifiman.ui.settings.feedback.a
            public void o0(String comment) {
                AbstractC6492s.i(comment, "comment");
            }

            @Override // com.ui.wifiman.ui.settings.feedback.a
            public void p0() {
            }

            @Override // com.ui.wifiman.ui.settings.feedback.a
            /* renamed from: q0, reason: merged with bridge method [inline-methods] */
            public z n0() {
                return this.f44636g;
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
                AbstractC3546o.Q(530436357, i10, -1, "com.ui.wifiman.ui.settings.feedback.ComposableSingletons$AppFeedbackFormUiKt.lambda-3.<anonymous> (AppFeedbackFormUi.kt:108)");
            }
            e.b(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new a(), interfaceC3540l, 6, 0);
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

    static final class d implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f44637a = new d();

        d() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-84710199, i10, -1, "com.ui.wifiman.ui.settings.feedback.ComposableSingletons$AppFeedbackFormUiKt.lambda-4.<anonymous> (AppFeedbackFormUi.kt:107)");
            }
            O0.a(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, f.f44628a.c(), interfaceC3540l, 1572870, 62);
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
        return f44629b;
    }

    public final InterfaceC6839p b() {
        return f44630c;
    }

    public final InterfaceC6839p c() {
        return f44631d;
    }
}
