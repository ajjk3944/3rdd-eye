package com.ui.wmw;

import T8.a;
import T8.b;
import V8.e;
import android.content.Context;
import com.ui.btle.rxandroidble.BTLEv2RxAndroidBle;
import com.ui.btle.v2.a;
import com.ui.wmw.WMWizard;
import com.ui.wmw.a;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import h9.C5969a;
import hg.InterfaceC6043c;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class a implements WMWizard.a {

    /* renamed from: i, reason: collision with root package name */
    public static final C1662a f45277i = new C1662a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f45278a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f45279b;

    /* renamed from: c, reason: collision with root package name */
    private final BTLEv2RxAndroidBle f45280c;

    /* renamed from: d, reason: collision with root package name */
    private final UUID f45281d;

    /* renamed from: e, reason: collision with root package name */
    private final UUID f45282e;

    /* renamed from: f, reason: collision with root package name */
    private final UUID f45283f;

    /* renamed from: g, reason: collision with root package name */
    private final UUID f45284g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f45285h;

    /* renamed from: com.ui.wmw.a$a, reason: collision with other inner class name */
    public static final class C1662a {
        public /* synthetic */ C1662a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1662a() {
        }
    }

    static final class b implements n {

        /* renamed from: com.ui.wmw.a$b$a, reason: collision with other inner class name */
        static final class C1663a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f45287a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f45288b;

            /* renamed from: com.ui.wmw.a$b$a$a, reason: collision with other inner class name */
            static final class C1664a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ a f45289a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Integer f45290b;

                C1664a(a aVar, Integer num) {
                    this.f45289a = aVar;
                    this.f45290b = num;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String c(a aVar, Integer num) {
                    return "WMW Connection " + aVar + " subscribed (try " + num + ")";
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final void accept(InterfaceC6043c it) {
                    AbstractC6492s.i(it, "it");
                    final a aVar = this.f45289a;
                    final Integer num = this.f45290b;
                    Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.b
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return a.b.C1663a.C1664a.c(aVar, num);
                        }
                    });
                }
            }

            /* renamed from: com.ui.wmw.a$b$a$b, reason: collision with other inner class name */
            static final class C1665b implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C1665b f45291a = new C1665b();

                C1665b() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(com.ui.btle.v2.a connection) {
                    AbstractC6492s.i(connection, "connection");
                    return connection.a();
                }
            }

            /* renamed from: com.ui.wmw.a$b$a$c */
            static final class c implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f45292a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f45293b;

                /* renamed from: com.ui.wmw.a$b$a$c$a, reason: collision with other inner class name */
                static final class C1666a implements n {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1666a f45294a = new C1666a();

                    C1666a() {
                    }

                    @Override // kg.n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Dj.a apply(k session) {
                        AbstractC6492s.i(session, "session");
                        return session.i().c0().z1(new WMWizard.a.AbstractC1657a.AbstractC1658a.C1659a(session));
                    }
                }

                c(N n10, a aVar) {
                    this.f45292a = n10;
                    this.f45293b = aVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(b.d connectionState) {
                    gg.i iVarK0;
                    AbstractC6492s.i(connectionState, "connectionState");
                    if (!(connectionState instanceof b.d.c) && !(connectionState instanceof b.d.InterfaceC0788b)) {
                        if (!(connectionState instanceof b.d.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z zVarG = new h(this.f45293b.i(), this.f45293b.f45279b, ((b.d.a) connectionState).a()).e().g(k.class);
                        AbstractC6492s.h(zVarG, "cast(R::class.java)");
                        gg.i iVarW = zVarG.w(C1666a.f45294a);
                        g gVar = (g) this.f45292a.f51689a;
                        gg.i iVarZ1 = iVarW.z1(gVar != null ? new WMWizard.a.AbstractC1657a.AbstractC1658a.b(gVar) : WMWizard.a.AbstractC1657a.b.c.f45273a);
                        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
                        return iVarZ1;
                    }
                    g gVar2 = (g) this.f45292a.f51689a;
                    if (gVar2 != null && (iVarK0 = gg.i.K0(new WMWizard.a.AbstractC1657a.AbstractC1658a.b(gVar2))) != null) {
                        return iVarK0;
                    }
                    if (connectionState instanceof a.AbstractC1282a.b.C1285b) {
                        gg.i iVarK02 = gg.i.K0(WMWizard.a.AbstractC1657a.b.C1661b.f45272a);
                        AbstractC6492s.h(iVarK02, "just(...)");
                        return iVarK02;
                    }
                    if ((connectionState instanceof a.AbstractC1282a.b.c) || (connectionState instanceof a.AbstractC1282a.b.C1284a) || (connectionState instanceof a.AbstractC1282a.b.d) || (connectionState instanceof a.AbstractC1282a.b.e)) {
                        gg.i iVarK03 = gg.i.K0(WMWizard.a.AbstractC1657a.b.C1660a.f45271a);
                        AbstractC6492s.h(iVarK03, "just(...)");
                        return iVarK03;
                    }
                    gg.i iVarK04 = gg.i.K0(WMWizard.a.AbstractC1657a.b.C1660a.f45271a);
                    AbstractC6492s.h(iVarK04, "just(...)");
                    return iVarK04;
                }
            }

            C1663a(a aVar, N n10) {
                this.f45287a = aVar;
                this.f45288b = n10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Integer tryNum) {
                AbstractC6492s.i(tryNum, "tryNum");
                return this.f45287a.h().n(new C1664a(this.f45287a, tryNum)).w(C1665b.f45291a).I1(new c(this.f45288b, this.f45287a));
            }
        }

        /* renamed from: com.ui.wmw.a$b$b, reason: collision with other inner class name */
        static final class C1667b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f45295a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f45296b;

            C1667b(N n10, AtomicInteger atomicInteger) {
                this.f45295a = n10;
                this.f45296b = atomicInteger;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(WMWizard.a.AbstractC1657a it) {
                AbstractC6492s.i(it, "it");
                if ((it instanceof WMWizard.a.AbstractC1657a.b) || (it instanceof WMWizard.a.AbstractC1657a.AbstractC1658a.b)) {
                    return;
                }
                if (!(it instanceof WMWizard.a.AbstractC1657a.AbstractC1658a.C1659a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f45295a.f51689a = ((WMWizard.a.AbstractC1657a.AbstractC1658a.C1659a) it).a();
                this.f45296b.set(1);
            }
        }

        static final class c implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f45297a;

            /* renamed from: com.ui.wmw.a$b$c$a, reason: collision with other inner class name */
            static final class C1668a implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AtomicInteger f45298a;

                C1668a(AtomicInteger atomicInteger) {
                    this.f45298a = atomicInteger;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String d() {
                    return "WMW Reconnecting in 500 millis";
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String e() {
                    return "WMW Maximum connection retry count reached, end connection";
                }

                @Override // kg.n
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Throwable error) {
                    AbstractC6492s.i(error, "error");
                    if (!(error instanceof WMWizard.Error.Connection.Btle) || this.f45298a.get() > 0) {
                        Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.d
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return a.b.c.C1668a.e();
                            }
                        });
                        return gg.i.k0(error);
                    }
                    Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.c
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return a.b.c.C1668a.d();
                        }
                    });
                    return gg.i.d2(500L, TimeUnit.MILLISECONDS);
                }
            }

            c(AtomicInteger atomicInteger) {
                this.f45297a = atomicInteger;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i errorStream) {
                AbstractC6492s.i(errorStream, "errorStream");
                return errorStream.p0(new C1668a(this.f45297a));
            }
        }

        public static final class d implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f45299a;

            public d(AtomicInteger atomicInteger) {
                this.f45299a = atomicInteger;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(Integer.valueOf(this.f45299a.getAndIncrement()));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        public static final class e implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f45300a;

            public e(N n10) {
                this.f45300a = n10;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    g gVar = (g) this.f45300a.f51689a;
                    interfaceC5910A.onSuccess(gVar != null ? new WMWizard.a.AbstractC1657a.AbstractC1658a.b(gVar) : WMWizard.a.AbstractC1657a.b.C1660a.f45271a);
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(AtomicInteger tryCounter) {
            AbstractC6492s.i(tryCounter, "tryCounter");
            N n10 = new N();
            z zVarI = z.i(new d(tryCounter));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            gg.i iVarW = zVarI.w(new C1663a(a.this, n10));
            z zVarI2 = z.i(new e(n10));
            AbstractC6492s.h(zVarI2, "crossinline action: () -…or(error)\n        }\n    }");
            gg.i iVarF0 = iVarW.y1(zVarI2).W().f0(new C1667b(n10, tryCounter));
            AbstractC6492s.h(iVarF0, "doOnNext(...)");
            return f.e(iVarF0, false, 1, null).p1(new c(tryCounter));
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45301a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(WMWizard.a.AbstractC1657a abstractC1657a) {
            return "WMW Connection state " + abstractC1657a;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(final WMWizard.a.AbstractC1657a it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.e
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return a.c.c(it);
                }
            });
        }
    }

    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.btle.v2.a apply(a.d state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof a.d.C0786d) {
                throw WMWizard.Error.RequirementNotMet.LocationDisabled.f45256a;
            }
            if (state instanceof a.d.c) {
                throw WMWizard.Error.RequirementNotMet.InsufficientPermission.f45255a;
            }
            if (state instanceof a.d.b) {
                throw WMWizard.Error.RequirementNotMet.BluetoothAdapterUnavailable.f45254a;
            }
            if (state instanceof a.d.C0785a) {
                throw WMWizard.Error.RequirementNotMet.BluetoothAdapterDisabled.f45253a;
            }
            if (!(state instanceof a.d.e)) {
                throw new NoWhenBranchMatchedException();
            }
            T8.b bVarA = ((e.a) ((a.d.e) state).a()).a(a.this.f45279b, a.this.f45281d, a.this.f45282e, a.this.f45283f, a.this.f45284g, new e.b(WMWizard.f45247a.a(), null, null, false, false, 30, null));
            AbstractC6492s.g(bVarA, "null cannot be cast to non-null type com.ui.btle.v2.BTLEv2Connection");
            return (com.ui.btle.v2.a) bVarA;
        }
    }

    public static final class e implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new AtomicInteger(1));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public a(Context context, C5969a mac, C5969a btleMac) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(btleMac, "btleMac");
        this.f45278a = mac;
        this.f45279b = btleMac;
        this.f45280c = BTLEv2RxAndroidBle.f41084d.b(context);
        UUID uuidFromString = UUID.fromString("e0373cc2-d3bc-4eac-9c6e-423d0fe5d738");
        AbstractC6492s.h(uuidFromString, "fromString(...)");
        this.f45281d = a.c.b(uuidFromString);
        UUID uuidFromString2 = UUID.fromString("d587c47f-ac6e-4388-a31c-e6cd380ba043");
        AbstractC6492s.h(uuidFromString2, "fromString(...)");
        this.f45282e = a.C0784a.a(uuidFromString2);
        UUID uuidFromString3 = UUID.fromString("e0373cc2-d3bc-4eac-9c6e-423d0fe5d738");
        AbstractC6492s.h(uuidFromString3, "fromString(...)");
        this.f45283f = a.c.b(uuidFromString3);
        UUID uuidFromString4 = UUID.fromString("9280f26c-a56f-43ea-b769-d5d732e1ac67");
        AbstractC6492s.h(uuidFromString4, "fromString(...)");
        this.f45284g = a.C0784a.a(uuidFromString4);
        z zVarI = z.i(new e());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI2 = zVarI.w(new b()).f0(c.f45301a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f45285h = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z h() {
        z zVarO0 = this.f45280c.getState().N0(new d()).o0();
        AbstractC6492s.h(zVarO0, "firstOrError(...)");
        return zVarO0;
    }

    @Override // com.ui.wmw.WMWizard.a
    public gg.i a() {
        return this.f45285h;
    }

    public C5969a i() {
        return this.f45278a;
    }
}
