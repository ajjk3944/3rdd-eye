package M4;

import a5.InterfaceC3765a;
import a5.InterfaceC3766b;

/* loaded from: classes3.dex */
public final class a implements InterfaceC3765a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3765a f12487a = new a();

    /* renamed from: M4.a$a, reason: collision with other inner class name */
    private static final class C0493a implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final C0493a f12488a = new C0493a();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f12489b = Z4.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f12490c = Z4.b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f12491d = Z4.b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f12492e = Z4.b.d("variantId");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f12493f = Z4.b.d("templateVersion");

        private C0493a() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, Z4.d dVar) {
            dVar.b(f12489b, jVar.e());
            dVar.b(f12490c, jVar.c());
            dVar.b(f12491d, jVar.d());
            dVar.b(f12492e, jVar.g());
            dVar.c(f12493f, jVar.f());
        }
    }

    private a() {
    }

    @Override // a5.InterfaceC3765a
    public void a(InterfaceC3766b interfaceC3766b) {
        C0493a c0493a = C0493a.f12488a;
        interfaceC3766b.a(j.class, c0493a);
        interfaceC3766b.a(b.class, c0493a);
    }
}
