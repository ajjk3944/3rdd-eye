package com.ui.wifiman.ui.sso.logout;

import Fe.j;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.foundation.layout.r;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6839p;
import mh.q;
import org.kodein.di.DI;
import s9.d;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f44925a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static q f44926b = b0.c.c(1096768780, false, C1623a.f44928a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f44927c = b0.c.c(-892040958, false, b.f44929a);

    /* renamed from: com.ui.wifiman.ui.sso.logout.a$a, reason: collision with other inner class name */
    static final class C1623a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final C1623a f44928a = new C1623a();

        C1623a() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1096768780, i10, -1, "com.ui.wifiman.ui.sso.logout.ComposableSingletons$SsoLogoutConfirmationUiKt.lambda-1.<anonymous> (SsoLogoutConfirmationUi.kt:31)");
            }
            j.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new d.b(AbstractC6780c.f53397S1), null, null, null, 0L, interfaceC3540l, 6, 60);
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
        public static final b f44929a = new b();

        /* renamed from: com.ui.wifiman.ui.sso.logout.a$b$a, reason: collision with other inner class name */
        public static final class C1624a extends com.ui.wifiman.ui.sso.logout.b {
            C1624a() {
            }

            @Override // org.kodein.di.c
            public DI d() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.sso.logout.b
            public void n0() {
            }
        }

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-892040958, i10, -1, "com.ui.wifiman.ui.sso.logout.ComposableSingletons$SsoLogoutConfirmationUiKt.lambda-2.<anonymous> (SsoLogoutConfirmationUi.kt:72)");
            }
            f.b(new C1624a(), interfaceC3540l, 0, 0);
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
        return f44926b;
    }
}
