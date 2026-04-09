package ld;

import P7.c;
import Zg.AbstractC3689v;
import com.ui.wifiman.db.RoomPersistentInstance;
import com.ui.wifiman.model.support.a;
import gg.AbstractC5912b;
import gg.D;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.i;
import gg.s;
import gg.z;
import java.util.List;
import java.util.UUID;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import ld.InterfaceC6575b;
import md.C6796a;
import md.InterfaceC6797b;

/* renamed from: ld.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6576c implements InterfaceC6575b {

    /* renamed from: a, reason: collision with root package name */
    private final P7.a f52539a;

    /* renamed from: b, reason: collision with root package name */
    private final Q7.a f52540b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ui.wifiman.model.support.a f52541c;

    /* renamed from: d, reason: collision with root package name */
    private final a f52542d;

    /* renamed from: e, reason: collision with root package name */
    private final i f52543e;

    /* renamed from: f, reason: collision with root package name */
    private final s f52544f;

    /* renamed from: g, reason: collision with root package name */
    private final s f52545g;

    /* renamed from: h, reason: collision with root package name */
    private final List f52546h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5912b f52547i;

    /* renamed from: ld.c$a */
    private static final class a extends RoomPersistentInstance {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ub.a dao) {
            super(dao);
            AbstractC6492s.i(dao, "dao");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ui.wifiman.db.RoomPersistentInstance
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C6574a e(Ub.c persistent) {
            AbstractC6492s.i(persistent, "persistent");
            return new C6574a(persistent.b());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ui.wifiman.db.RoomPersistentInstance
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C6574a f() {
            String string = UUID.randomUUID().toString();
            AbstractC6492s.h(string, "toString(...)");
            return new C6574a(string);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ui.wifiman.db.RoomPersistentInstance
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Ub.c g(C6574a instance) {
            AbstractC6492s.i(instance, "instance");
            return new Ub.c(0, instance.a(), 1, null);
        }
    }

    /* renamed from: ld.c$b */
    static final class b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f52548a = new b();

        b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6575b.a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("APP SETUP STEP - " + it.name(), null, 2, null);
        }
    }

    /* renamed from: ld.c$c, reason: collision with other inner class name */
    static final class C1940c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C1940c f52549a = new C1940c();

        C1940c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.e("Init App session error", it, null, 4, null);
        }
    }

    /* renamed from: ld.c$d */
    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6796a settings) {
            AbstractC6492s.i(settings, "settings");
            return C6576c.this.f52539a.d(new c.a(settings.e()));
        }
    }

    /* renamed from: ld.c$e */
    static final class e implements n {

        /* renamed from: ld.c$e$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6576c f52552a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6574a f52553b;

            public a(C6576c c6576c, C6574a c6574a) {
                this.f52552a = c6576c;
                this.f52553b = c6574a;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f52552a.f52540b.a(this.f52553b.a());
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(C6574a session) {
            AbstractC6492s.i(session, "session");
            AbstractC5912b abstractC5912bA = C6576c.this.f52539a.a(session.a());
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(C6576c.this, session));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return AbstractC5912b.p(abstractC5912bA, abstractC5912bR).k(z.z(session));
        }
    }

    /* renamed from: ld.c$f */
    static final class f implements InterfaceC6469f {
        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6574a it) {
            AbstractC6492s.i(it, "it");
            C6576c.this.f52541c.b(new a.AbstractC1437a.c(it));
        }
    }

    public C6576c(Ub.a dao, InterfaceC6797b settingsManager, P7.a analytics, Q7.a crashReporting, com.ui.wifiman.model.support.a supportFileDataCollector) {
        AbstractC6492s.i(dao, "dao");
        AbstractC6492s.i(settingsManager, "settingsManager");
        AbstractC6492s.i(analytics, "analytics");
        AbstractC6492s.i(crashReporting, "crashReporting");
        AbstractC6492s.i(supportFileDataCollector, "supportFileDataCollector");
        this.f52539a = analytics;
        this.f52540b = crashReporting;
        this.f52541c = supportFileDataCollector;
        a aVar = new a(dao);
        this.f52542d = aVar;
        i iVarI2 = aVar.b().K(new e()).f0(new f()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f52543e = iVarI2;
        s sVarR = aVar.b().o0().y().R(s.h0(InterfaceC6575b.a.DB));
        AbstractC6492s.h(sVarR, "startWith(...)");
        this.f52544f = sVarR;
        s sVarR2 = settingsManager.b().o0().t(new d()).R(s.h0(InterfaceC6575b.a.LOGGING_START));
        AbstractC6492s.h(sVarR2, "startWith(...)");
        this.f52545g = sVarR2;
        List listO = AbstractC3689v.o(s.h0(InterfaceC6575b.a.INIT), sVarR, sVarR2, s.h0(InterfaceC6575b.a.FINISHED));
        this.f52546h = listO;
        AbstractC5912b abstractC5912bL = s.j(listO).F(b.f52548a).D(C1940c.f52549a).f0().W(Gg.a.d()).l();
        AbstractC6492s.h(abstractC5912bL, "cache(...)");
        this.f52547i = abstractC5912bL;
    }

    @Override // ld.InterfaceC6575b
    public i a() {
        return this.f52543e;
    }

    @Override // ld.InterfaceC6575b
    public AbstractC5912b b() {
        return this.f52547i;
    }
}
