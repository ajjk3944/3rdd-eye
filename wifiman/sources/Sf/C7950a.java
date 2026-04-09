package sf;

import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import z.InterfaceC8687j;
import z.a0;

/* renamed from: sf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7950a {

    /* renamed from: a, reason: collision with root package name */
    public static final C7950a f61472a = new C7950a();

    /* renamed from: b, reason: collision with root package name */
    public static q f61473b = b0.c.c(-1737283801, false, C2152a.f61476a);

    /* renamed from: c, reason: collision with root package name */
    public static q f61474c = b0.c.c(1104217028, false, b.f61477a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f61475d = b0.c.c(24720787, false, c.f61478a);

    /* renamed from: sf.a$a, reason: collision with other inner class name */
    static final class C2152a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final C2152a f61476a = new C2152a();

        C2152a() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1737283801, i10, -1, "com.ui.wifiman.ui.teleport.invitation.ComposableSingletons$TeleportInvitationPasteFailedUiKt.lambda-1.<anonymous> (TeleportInvitationPasteFailedUi.kt:27)");
            }
            Fe.j.c(null, new d.b(AbstractC6780c.f53480e4), null, null, null, 0L, interfaceC3540l, 0, 61);
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

    /* renamed from: sf.a$b */
    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f61477a = new b();

        b() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1104217028, i10, -1, "com.ui.wifiman.ui.teleport.invitation.ComposableSingletons$TeleportInvitationPasteFailedUiKt.lambda-2.<anonymous> (TeleportInvitationPasteFailedUi.kt:32)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            androidx.compose.ui.e eVarK = o.k(eVarH, c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            a1.b(H0.f.a(AbstractC6780c.f53473d4, interfaceC3540l, 0), eVarK, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65016);
            a0.a(r.i(aVar, c6562a.d(interfaceC3540l, i11).a().b().d()), interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: sf.a$c */
    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f61478a = new c();

        c() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(24720787, i10, -1, "com.ui.wifiman.ui.teleport.invitation.ComposableSingletons$TeleportInvitationPasteFailedUiKt.lambda-3.<anonymous> (TeleportInvitationPasteFailedUi.kt:49)");
            }
            AbstractC7954e.b(null, interfaceC3540l, 0, 1);
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
        return f61473b;
    }

    public final q b() {
        return f61474c;
    }
}
