package He;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import z.Y;

/* renamed from: He.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2917a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2917a f7833a = new C2917a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f7834b = b0.c.c(-1604042409, false, C0325a.f7836a);

    /* renamed from: c, reason: collision with root package name */
    public static mh.q f7835c = b0.c.c(493760170, false, b.f7837a);

    /* renamed from: He.a$a, reason: collision with other inner class name */
    static final class C0325a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0325a f7836a = new C0325a();

        C0325a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1604042409, i10, -1, "com.ui.wifiman.ui.component.toolbar.ComposableSingletons$WifimanToolbarBaseKt.lambda-1.<anonymous> (WifimanToolbarBase.kt:15)");
            }
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

    /* renamed from: He.a$b */
    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7837a = new b();

        b() {
        }

        public final void a(Y y10, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(y10, "<this>");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(493760170, i10, -1, "com.ui.wifiman.ui.component.toolbar.ComposableSingletons$WifimanToolbarBaseKt.lambda-2.<anonymous> (WifimanToolbarBase.kt:16)");
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

    public final InterfaceC6839p a() {
        return f7834b;
    }

    public final mh.q b() {
        return f7835c;
    }
}
