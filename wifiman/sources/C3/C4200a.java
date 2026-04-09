package c3;

import a5.InterfaceC3765a;
import a5.InterfaceC3766b;
import c5.C4225a;
import f.AbstractC5487d;
import f3.C5515a;
import f3.C5516b;
import f3.C5517c;
import f3.C5518d;
import f3.C5519e;
import f3.C5520f;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4200a implements InterfaceC3765a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3765a f33737a = new C4200a();

    /* renamed from: c3.a$a, reason: collision with other inner class name */
    private static final class C1174a implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final C1174a f33738a = new C1174a();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f33739b = Z4.b.a("window").b(C4225a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f33740c = Z4.b.a("logSourceMetrics").b(C4225a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f33741d = Z4.b.a("globalMetrics").b(C4225a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f33742e = Z4.b.a("appNamespace").b(C4225a.b().c(4).a()).a();

        private C1174a() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5515a c5515a, Z4.d dVar) {
            dVar.b(f33739b, c5515a.d());
            dVar.b(f33740c, c5515a.c());
            dVar.b(f33741d, c5515a.b());
            dVar.b(f33742e, c5515a.a());
        }
    }

    /* renamed from: c3.a$b */
    private static final class b implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final b f33743a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f33744b = Z4.b.a("storageMetrics").b(C4225a.b().c(1).a()).a();

        private b() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5516b c5516b, Z4.d dVar) {
            dVar.b(f33744b, c5516b.a());
        }
    }

    /* renamed from: c3.a$c */
    private static final class c implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final c f33745a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f33746b = Z4.b.a("eventsDroppedCount").b(C4225a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f33747c = Z4.b.a("reason").b(C4225a.b().c(3).a()).a();

        private c() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5517c c5517c, Z4.d dVar) {
            dVar.c(f33746b, c5517c.a());
            dVar.b(f33747c, c5517c.b());
        }
    }

    /* renamed from: c3.a$d */
    private static final class d implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final d f33748a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f33749b = Z4.b.a("logSource").b(C4225a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f33750c = Z4.b.a("logEventDropped").b(C4225a.b().c(2).a()).a();

        private d() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5518d c5518d, Z4.d dVar) {
            dVar.b(f33749b, c5518d.b());
            dVar.b(f33750c, c5518d.a());
        }
    }

    /* renamed from: c3.a$e */
    private static final class e implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final e f33751a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f33752b = Z4.b.d("clientMetrics");

        private e() {
        }

        @Override // Z4.c
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            AbstractC5487d.a(obj);
            b(null, (Z4.d) obj2);
        }

        public void b(AbstractC4212m abstractC4212m, Z4.d dVar) {
            throw null;
        }
    }

    /* renamed from: c3.a$f */
    private static final class f implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final f f33753a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f33754b = Z4.b.a("currentCacheSizeBytes").b(C4225a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f33755c = Z4.b.a("maxCacheSizeBytes").b(C4225a.b().c(2).a()).a();

        private f() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5519e c5519e, Z4.d dVar) {
            dVar.c(f33754b, c5519e.a());
            dVar.c(f33755c, c5519e.b());
        }
    }

    /* renamed from: c3.a$g */
    private static final class g implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final g f33756a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f33757b = Z4.b.a("startMs").b(C4225a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f33758c = Z4.b.a("endMs").b(C4225a.b().c(2).a()).a();

        private g() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5520f c5520f, Z4.d dVar) {
            dVar.c(f33757b, c5520f.b());
            dVar.c(f33758c, c5520f.a());
        }
    }

    private C4200a() {
    }

    @Override // a5.InterfaceC3765a
    public void a(InterfaceC3766b interfaceC3766b) {
        interfaceC3766b.a(AbstractC4212m.class, e.f33751a);
        interfaceC3766b.a(C5515a.class, C1174a.f33738a);
        interfaceC3766b.a(C5520f.class, g.f33756a);
        interfaceC3766b.a(C5518d.class, d.f33748a);
        interfaceC3766b.a(C5517c.class, c.f33745a);
        interfaceC3766b.a(C5516b.class, b.f33743a);
        interfaceC3766b.a(C5519e.class, f.f33753a);
    }
}
