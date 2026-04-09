package com.ui.wifiman.ui.teleport.consoles;

import Ee.K;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.P;
import Li.z;
import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import Zg.AbstractC3689v;
import android.content.res.Resources;
import com.ui.wifiman.ui.teleport.consoles.h;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6778a;
import m8.AbstractC6780c;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import q.InterfaceC7386e;
import s9.b;
import s9.c;
import s9.d;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f45013a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f45014b = b0.c.c(378084639, false, C1635a.f45018a);

    /* renamed from: c, reason: collision with root package name */
    public static mh.q f45015c = b0.c.c(-580086072, false, b.f45019a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f45016d = b0.c.c(-1549489914, false, c.f45020a);

    /* renamed from: e, reason: collision with root package name */
    public static InterfaceC6839p f45017e = b0.c.c(-1066089784, false, d.f45021a);

    /* renamed from: com.ui.wifiman.ui.teleport.consoles.a$a, reason: collision with other inner class name */
    static final class C1635a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final C1635a f45018a = new C1635a();

        C1635a() {
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(378084639, i10, -1, "com.ui.wifiman.ui.teleport.consoles.ComposableSingletons$TeleportConsolePickerUiKt.lambda-1.<anonymous> (TeleportConsolePickerUi.kt:125)");
            }
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, Y0.h.j(8), 0.0f, 11, null);
            String strA = H0.f.a(AbstractC6780c.f53364N3, interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a1.b(strA, eVarM, c6562a.a(interfaceC3540l, i11).a().j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c6562a.c(interfaceC3540l, i11).b().b(), interfaceC3540l, 48, 3072, 57336);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f45019a = new b();

        b() {
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-580086072, i10, -1, "com.ui.wifiman.ui.teleport.consoles.ComposableSingletons$TeleportConsolePickerUiKt.lambda-2.<anonymous> (TeleportConsolePickerUi.kt:135)");
            }
            K.b(null, interfaceC3540l, 0, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45020a = new c();

        c() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1549489914, i10, -1, "com.ui.wifiman.ui.teleport.consoles.ComposableSingletons$TeleportConsolePickerUiKt.lambda-3.<anonymous> (TeleportConsolePickerUi.kt:161)");
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

    static final class d implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f45021a = new d();

        /* renamed from: com.ui.wifiman.ui.teleport.consoles.a$d$a, reason: collision with other inner class name */
        public static final class C1636a extends i {

            /* renamed from: g, reason: collision with root package name */
            private final z f45022g;

            /* renamed from: h, reason: collision with root package name */
            private final InterfaceC3220g f45023h;

            C1636a() {
                h.c cVar = new h.c("lastUsed", new d.b(AbstractC6780c.f53371O3));
                int i10 = AbstractC6778a.f53265y0;
                h.a aVar = new h.a("0", new c.a(i10, null, 2, null), new d.c("Console 1"), new d.c("Online"), com.ui.wifiman.ui.teleport.z.ONLINE, h.a.EnumC1637a.CONNECTED, true, Boolean.TRUE, true, true);
                c.a aVar2 = new c.a(i10, null, 2, null);
                d.c cVar2 = new d.c("Console 2");
                d.c cVar3 = new d.c("Online");
                com.ui.wifiman.ui.teleport.z zVar = com.ui.wifiman.ui.teleport.z.UNSTABLE;
                h.a.EnumC1637a enumC1637a = h.a.EnumC1637a.CONNECTABLE;
                Boolean bool = Boolean.FALSE;
                this.f45022g = P.a(AbstractC3689v.o(cVar, aVar, new h.a("1", aVar2, cVar2, cVar3, zVar, enumC1637a, true, bool, false, false), new h.c("other", new d.b(AbstractC6780c.f53378P3)), new h.a("2", new b.a(AbstractC6778a.f53214Y, null, null, 6, null), new d.c("Very Very Long Console Name, so long that it even doesn't fit into the preview"), new d.c("Offline"), com.ui.wifiman.ui.teleport.z.OFFLINE, h.a.EnumC1637a.CONNECTION_NOT_POSSIBLE, false, bool, false, true), h.d.f45045a, new h.b("loading1"), new h.b("loading2"), new h.b("loading3")));
                this.f45023h = AbstractC3222i.u();
            }

            @Override // com.ui.wifiman.ui.teleport.consoles.i
            public InterfaceC3220g b() {
                return this.f45023h;
            }

            @Override // org.kodein.di.c
            /* renamed from: d */
            public DI getDi() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.teleport.consoles.i
            public void o0(h.a item) {
                AbstractC6492s.i(item, "item");
            }

            @Override // com.ui.wifiman.ui.teleport.consoles.i
            public void p0(h item) {
                AbstractC6492s.i(item, "item");
            }

            @Override // com.ui.wifiman.ui.teleport.consoles.i
            public void q0() {
            }

            @Override // com.ui.wifiman.ui.teleport.consoles.i
            /* renamed from: r0, reason: merged with bridge method [inline-methods] */
            public z n0() {
                return this.f45022g;
            }
        }

        d() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1066089784, i10, -1, "com.ui.wifiman.ui.teleport.consoles.ComposableSingletons$TeleportConsolePickerUiKt.lambda-4.<anonymous> (TeleportConsolePickerUi.kt:372)");
            }
            u.t(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new C1636a(), interfaceC3540l, 6, 0);
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

    public final mh.q a() {
        return f45014b;
    }

    public final mh.q b() {
        return f45015c;
    }

    public final InterfaceC6839p c() {
        return f45016d;
    }
}
