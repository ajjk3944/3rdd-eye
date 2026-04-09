package fa;

import N.C3319f0;
import N.O0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import mh.InterfaceC6839p;

/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5801a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5801a f47199a = new C5801a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f47200b = b0.c.c(-670486163, false, C1762a.f47202a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f47201c = b0.c.c(2132040489, false, b.f47203a);

    /* renamed from: fa.a$a, reason: collision with other inner class name */
    static final class C1762a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C1762a f47202a = new C1762a();

        C1762a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-670486163, i10, -1, "com.ui.core.ui.sso.trusted.ComposableSingletons$UiTrustedDeviceKt.lambda-1.<anonymous> (UiTrustedDevice.kt:24)");
            }
            i.c((j) Q9.h.m(j.class, null, ((InterfaceC4017o) interfaceC3540l.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).O(), interfaceC3540l, 48, 0), interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: fa.a$b */
    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f47203a = new b();

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2132040489, i10, -1, "com.ui.core.ui.sso.trusted.ComposableSingletons$UiTrustedDeviceKt.lambda-2.<anonymous> (UiTrustedDevice.kt:20)");
            }
            O0.a(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, C3319f0.f14419a.a(interfaceC3540l, C3319f0.f14420b).c(), 0L, null, 0.0f, C5801a.f47199a.a(), interfaceC3540l, 1572870, 58);
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

    public final InterfaceC6839p a() {
        return f47200b;
    }

    public final InterfaceC6839p b() {
        return f47201c;
    }
}
