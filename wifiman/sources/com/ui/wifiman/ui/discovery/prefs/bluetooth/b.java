package com.ui.wifiman.ui.discovery.prefs.bluetooth;

import Fe.j;
import He.i;
import L9.L;
import Li.P;
import Li.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import Zg.AbstractC3689v;
import com.ui.wifiman.ui.discovery.prefs.bluetooth.b;
import com.ui.wifiman.ui.discovery.prefs.bluetooth.c;
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
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f44558a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static q f44559b = b0.c.c(140976886, false, a.f44561a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f44560c = b0.c.c(1434145504, false, C1560b.f44564a);

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44561a = new a();

        /* renamed from: com.ui.wifiman.ui.discovery.prefs.bluetooth.b$a$a, reason: collision with other inner class name */
        static final class C1558a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f44562a;

            /* renamed from: com.ui.wifiman.ui.discovery.prefs.bluetooth.b$a$a$a, reason: collision with other inner class name */
            static final class C1559a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f44563a;

                C1559a(InterfaceC8511f.b bVar) {
                    this.f44563a = bVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(InterfaceC8511f.b bVar) {
                    bVar.a();
                    return J.f24997a;
                }

                public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-818724604, i10, -1, "com.ui.wifiman.ui.discovery.prefs.bluetooth.ComposableSingletons$DiscoveryHomeDisplayPrefsBluetoothUiKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (DiscoveryHomeDisplayPrefsBluetoothUi.kt:40)");
                    }
                    d.b bVar = new d.b(AbstractC6780c.f53468d);
                    interfaceC3540l.U(2120254969);
                    boolean zT = interfaceC3540l.T(this.f44563a);
                    final InterfaceC8511f.b bVar2 = this.f44563a;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.discovery.prefs.bluetooth.a
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return b.a.C1558a.C1559a.c(bVar2);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    i.c(null, (InterfaceC6824a) objF, false, bVar, interfaceC3540l, 0, 5);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C1558a(InterfaceC8511f.b bVar) {
                this.f44562a = bVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1080440451, i10, -1, "com.ui.wifiman.ui.discovery.prefs.bluetooth.ComposableSingletons$DiscoveryHomeDisplayPrefsBluetoothUiKt.lambda-1.<anonymous>.<anonymous> (DiscoveryHomeDisplayPrefsBluetoothUi.kt:39)");
                }
                L.b(null, b0.c.e(-818724604, true, new C1559a(this.f44562a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

        a() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(140976886, i10, -1, "com.ui.wifiman.ui.discovery.prefs.bluetooth.ComposableSingletons$DiscoveryHomeDisplayPrefsBluetoothUiKt.lambda-1.<anonymous> (DiscoveryHomeDisplayPrefsBluetoothUi.kt:35)");
            }
            j.c(null, new d.b(AbstractC6780c.f53356M2), null, null, b0.c.e(-1080440451, true, new C1558a((InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K())), interfaceC3540l, 54), 0L, interfaceC3540l, 24576, 45);
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

    /* renamed from: com.ui.wifiman.ui.discovery.prefs.bluetooth.b$b, reason: collision with other inner class name */
    static final class C1560b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C1560b f44564a = new C1560b();

        /* renamed from: com.ui.wifiman.ui.discovery.prefs.bluetooth.b$b$a */
        public static final class a extends d {

            /* renamed from: g, reason: collision with root package name */
            private final z f44565g = P.a(Boolean.TRUE);

            /* renamed from: h, reason: collision with root package name */
            private final z f44566h = P.a(Ci.a.h(AbstractC3689v.o(new c.b(true), new c.C1561c(false))));

            a() {
            }

            @Override // org.kodein.di.c
            public DI d() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.discovery.prefs.bluetooth.d
            public void p0(c type) {
                AbstractC6492s.i(type, "type");
            }

            @Override // com.ui.wifiman.ui.discovery.prefs.bluetooth.d
            public void q0(boolean z10) {
            }

            @Override // com.ui.wifiman.ui.discovery.prefs.bluetooth.d
            /* renamed from: r0, reason: merged with bridge method [inline-methods] */
            public z n0() {
                return this.f44566h;
            }

            @Override // com.ui.wifiman.ui.discovery.prefs.bluetooth.d
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public z o0() {
                return this.f44565g;
            }
        }

        C1560b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1434145504, i10, -1, "com.ui.wifiman.ui.discovery.prefs.bluetooth.ComposableSingletons$DiscoveryHomeDisplayPrefsBluetoothUiKt.lambda-2.<anonymous> (DiscoveryHomeDisplayPrefsBluetoothUi.kt:72)");
            }
            f.b(null, new a(), interfaceC3540l, 0, 1);
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
        return f44559b;
    }
}
