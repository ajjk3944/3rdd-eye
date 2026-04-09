package com.ui.wifiman.ui.settings.preferences;

import L9.AbstractC3198d;
import L9.E;
import Li.N;
import Li.P;
import Li.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.res.Resources;
import kotlin.jvm.internal.C6490p;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.j0;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f44654a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f44655b = b0.c.c(-144575381, false, a.f44657a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f44656c = b0.c.c(1830618811, false, b.f44658a);

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44657a = new a();

        /* renamed from: com.ui.wifiman.ui.settings.preferences.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1583a extends C6490p implements InterfaceC6824a {
            C1583a(Object obj) {
                super(0, obj, InterfaceC8511f.b.class, "navigateBack", "navigateBack()V", 0);
            }

            public final void a() {
                ((InterfaceC8511f.b) this.receiver).a();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-144575381, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$AppPreferencesUiKt.lambda-1.<anonymous> (AppPreferencesUi.kt:41)");
            }
            InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            androidx.compose.ui.e eVarC = j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            String strA = H0.f.a(AbstractC6780c.f53601w, interfaceC3540l, 0);
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(852827597);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C1583a(bVar);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(eVarC, strA, aVar, (InterfaceC6824a) ((th.g) objF), null, 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, AbstractC3198d.a.f11403c << 6, 0, 2032);
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

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44658a = new b();

        public static final class a extends com.ui.wifiman.ui.settings.preferences.a {

            /* renamed from: g, reason: collision with root package name */
            private final z f44659g;

            /* renamed from: h, reason: collision with root package name */
            private final z f44660h;

            /* renamed from: i, reason: collision with root package name */
            private final z f44661i;

            /* renamed from: j, reason: collision with root package name */
            private final z f44662j;

            /* renamed from: k, reason: collision with root package name */
            private final z f44663k;

            /* renamed from: l, reason: collision with root package name */
            private final z f44664l;

            /* renamed from: m, reason: collision with root package name */
            private final z f44665m;

            /* renamed from: n, reason: collision with root package name */
            private final N f44666n;

            a() {
                Boolean bool = Boolean.TRUE;
                this.f44659g = P.a(bool);
                this.f44660h = P.a(bool);
                this.f44661i = P.a(bool);
                this.f44662j = P.a(T7.c.METRIC);
                Boolean bool2 = Boolean.FALSE;
                this.f44663k = P.a(bool2);
                this.f44664l = P.a(bool2);
                this.f44665m = P.a(bool2);
                this.f44666n = P.a(bool2);
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            public void A0(boolean z10) {
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            public void B0() {
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            /* renamed from: C0, reason: merged with bridge method [inline-methods] */
            public z n0() {
                return this.f44663k;
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            /* renamed from: D0, reason: merged with bridge method [inline-methods] */
            public z o0() {
                return this.f44664l;
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            /* renamed from: E0, reason: merged with bridge method [inline-methods] */
            public z p0() {
                return this.f44665m;
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            /* renamed from: F0, reason: merged with bridge method [inline-methods] */
            public z r0() {
                return this.f44662j;
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            /* renamed from: G0, reason: merged with bridge method [inline-methods] */
            public z s0() {
                return this.f44659g;
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            /* renamed from: H0, reason: merged with bridge method [inline-methods] */
            public z t0() {
                return this.f44660h;
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            /* renamed from: I0, reason: merged with bridge method [inline-methods] */
            public z u0() {
                return this.f44661i;
            }

            @Override // org.kodein.di.c
            public DI d() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            public N q0() {
                return this.f44666n;
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            public void v0() {
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            public void w0() {
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            public void x0() {
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            public void y0(boolean z10) {
            }

            @Override // com.ui.wifiman.ui.settings.preferences.a
            public void z0(boolean z10) {
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
                AbstractC3546o.Q(1830618811, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$AppPreferencesUiKt.lambda-2.<anonymous> (AppPreferencesUi.kt:120)");
            }
            c.b(new a(), interfaceC3540l, 0, 0);
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
        return f44655b;
    }
}
